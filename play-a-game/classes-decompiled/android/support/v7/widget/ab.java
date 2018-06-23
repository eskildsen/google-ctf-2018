// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v7.widget;

import android.support.v7.a.a;
import android.util.AttributeSet;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import java.util.List;
import java.util.Collections;
import java.util.ArrayList;
import java.util.Arrays;
import android.content.res.TypedArray;
import android.util.Log;
import android.text.StaticLayout$Builder;
import android.text.TextDirectionHeuristics;
import android.text.TextDirectionHeuristic;
import android.annotation.TargetApi;
import android.os.Build$VERSION;
import android.text.StaticLayout;
import android.text.Layout$Alignment;
import android.content.Context;
import android.widget.TextView;
import android.text.TextPaint;
import java.lang.reflect.Method;
import java.util.Hashtable;
import android.graphics.RectF;

class ab
{
    private static final RectF a;
    private static Hashtable<String, Method> b;
    private int c;
    private boolean d;
    private float e;
    private float f;
    private float g;
    private int[] h;
    private boolean i;
    private TextPaint j;
    private final TextView k;
    private final Context l;
    
    static {
        a = new RectF();
        ab.b = new Hashtable<String, Method>();
    }
    
    ab(final TextView k) {
        this.c = 0;
        this.d = false;
        this.e = -1.0f;
        this.f = -1.0f;
        this.g = -1.0f;
        this.h = new int[0];
        this.i = false;
        this.k = k;
        this.l = this.k.getContext();
    }
    
    private int a(final RectF rectF) {
        final int length = this.h.length;
        if (length == 0) {
            throw new IllegalStateException("No available text sizes to choose from.");
        }
        int n = 0;
        int i = 1;
        int n2 = length - 1;
        while (i <= n2) {
            final int n3 = (i + n2) / 2;
            if (this.a(this.h[n3], rectF)) {
                n = i;
                i = n3 + 1;
            }
            else {
                n2 = (n = n3 - 1);
            }
        }
        return this.h[n];
    }
    
    @TargetApi(14)
    private StaticLayout a(final CharSequence charSequence, final Layout$Alignment layout$Alignment, final int n) {
        float n2;
        float n3;
        boolean b;
        if (Build$VERSION.SDK_INT >= 16) {
            n2 = this.k.getLineSpacingMultiplier();
            n3 = this.k.getLineSpacingExtra();
            b = this.k.getIncludeFontPadding();
        }
        else {
            n2 = this.a(this.k, "getLineSpacingMultiplier", Float.valueOf(1.0f));
            n3 = this.a(this.k, "getLineSpacingExtra", Float.valueOf(0.0f));
            b = this.a(this.k, "getIncludeFontPadding", Boolean.valueOf(true));
        }
        return new StaticLayout(charSequence, this.j, n, layout$Alignment, n2, n3, b);
    }
    
    @TargetApi(23)
    private StaticLayout a(final CharSequence charSequence, final Layout$Alignment alignment, int maxLines, final int n) {
        final TextDirectionHeuristic textDirection = this.a(this.k, "getTextDirectionHeuristic", TextDirectionHeuristics.FIRSTSTRONG_LTR);
        final StaticLayout$Builder setHyphenationFrequency = StaticLayout$Builder.obtain(charSequence, 0, charSequence.length(), this.j, maxLines).setAlignment(alignment).setLineSpacing(this.k.getLineSpacingExtra(), this.k.getLineSpacingMultiplier()).setIncludePad(this.k.getIncludeFontPadding()).setBreakStrategy(this.k.getBreakStrategy()).setHyphenationFrequency(this.k.getHyphenationFrequency());
        maxLines = n;
        if (n == -1) {
            maxLines = Integer.MAX_VALUE;
        }
        return setHyphenationFrequency.setMaxLines(maxLines).setTextDirection(textDirection).build();
    }
    
    private <T> T a(Object o, final String s, T invoke) {
        boolean b = false;
        try {
            o = (invoke = (T)this.a(s).invoke(o, new Object[0]));
            if (o == null) {}
            return invoke;
        }
        catch (Exception ex) {
            b = true;
            Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#" + s + "() method", (Throwable)ex);
            if (false) {
                return null;
            }
            return invoke;
        }
        finally {
            if (false || b) {}
        }
    }
    
    private Method a(final String s) {
        try {
            Method method;
            if ((method = ab.b.get(s)) == null) {
                final Method declaredMethod = TextView.class.getDeclaredMethod(s, (Class<?>[])new Class[0]);
                if ((method = declaredMethod) != null) {
                    declaredMethod.setAccessible(true);
                    ab.b.put(s, declaredMethod);
                    method = declaredMethod;
                }
            }
            return method;
        }
        catch (Exception ex) {
            Log.w("ACTVAutoSizeHelper", "Failed to retrieve TextView#" + s + "() method", (Throwable)ex);
            return null;
        }
    }
    
    private void a(final float textSize) {
        if (textSize == this.k.getPaint().getTextSize()) {
            return;
        }
        this.k.getPaint().setTextSize(textSize);
        final boolean b = Build$VERSION.SDK_INT >= 18 && this.k.isInLayout();
        if (this.k.getLayout() == null) {
            return;
        }
    Label_0093_Outer:
        while (true) {
            this.d = false;
            while (true) {
                while (true) {
                    try {
                        final Method a = this.a("nullLayouts");
                        if (a != null) {
                            a.invoke(this.k, new Object[0]);
                        }
                        if (!b) {
                            this.k.requestLayout();
                            this.k.invalidate();
                            return;
                        }
                    }
                    catch (Exception ex) {
                        Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#nullLayouts() method", (Throwable)ex);
                        continue Label_0093_Outer;
                    }
                    break;
                }
                this.k.forceLayout();
                continue;
            }
        }
    }
    
    private void a(final float f, final float g, final float e) {
        if (f <= 0.0f) {
            throw new IllegalArgumentException("Minimum auto-size text size (" + f + "px) is less or equal to (0px)");
        }
        if (g <= f) {
            throw new IllegalArgumentException("Maximum auto-size text size (" + g + "px) is less or equal to minimum auto-size " + "text size (" + f + "px)");
        }
        if (e <= 0.0f) {
            throw new IllegalArgumentException("The auto-size step granularity (" + e + "px) is less or equal to (0px)");
        }
        this.c = 1;
        this.f = f;
        this.g = g;
        this.e = e;
        this.i = false;
    }
    
    private void a(final TypedArray typedArray) {
        final int length = typedArray.length();
        final int[] array = new int[length];
        if (length > 0) {
            for (int i = 0; i < length; ++i) {
                array[i] = typedArray.getDimensionPixelSize(i, -1);
            }
            this.h = this.a(array);
            this.h();
        }
    }
    
    private boolean a(final int n, final RectF rectF) {
        final CharSequence text = this.k.getText();
        int maxLines;
        if (Build$VERSION.SDK_INT >= 16) {
            maxLines = this.k.getMaxLines();
        }
        else {
            maxLines = -1;
        }
        if (this.j == null) {
            this.j = new TextPaint();
        }
        else {
            this.j.reset();
        }
        this.j.set(this.k.getPaint());
        this.j.setTextSize((float)n);
        final Layout$Alignment layout$Alignment = this.a(this.k, "getLayoutAlignment", Layout$Alignment.ALIGN_NORMAL);
        StaticLayout staticLayout;
        if (Build$VERSION.SDK_INT >= 23) {
            staticLayout = this.a(text, layout$Alignment, Math.round(rectF.right), maxLines);
        }
        else {
            staticLayout = this.a(text, layout$Alignment, Math.round(rectF.right));
        }
        return (maxLines == -1 || (staticLayout.getLineCount() <= maxLines && staticLayout.getLineEnd(staticLayout.getLineCount() - 1) == text.length())) && staticLayout.getHeight() <= rectF.bottom;
    }
    
    private int[] a(int[] array) {
        final int length = array.length;
        if (length != 0) {
            Arrays.sort(array);
            final ArrayList<Comparable<? super Integer>> list = new ArrayList<Comparable<? super Integer>>();
            for (int i = 0; i < length; ++i) {
                final int n = array[i];
                if (n > 0 && Collections.binarySearch(list, n) < 0) {
                    list.add(n);
                }
            }
            if (length != list.size()) {
                final int size = list.size();
                final int[] array2 = new int[size];
                int n2 = 0;
                while (true) {
                    array = array2;
                    if (n2 >= size) {
                        break;
                    }
                    array2[n2] = list.get(n2);
                    ++n2;
                }
            }
        }
        return array;
    }
    
    private boolean h() {
        final int length = this.h.length;
        this.i = (length > 0);
        if (this.i) {
            this.c = 1;
            this.f = this.h[0];
            this.g = this.h[length - 1];
            this.e = -1.0f;
        }
        return this.i;
    }
    
    private boolean i() {
        if (this.k() && this.c == 1) {
            if (!this.i || this.h.length == 0) {
                float n = Math.round(this.f);
                int n2 = 1;
                while (Math.round(this.e + n) <= Math.round(this.g)) {
                    ++n2;
                    n += this.e;
                }
                final int[] array = new int[n2];
                float f = this.f;
                for (int i = 0; i < n2; ++i) {
                    array[i] = Math.round(f);
                    f += this.e;
                }
                this.h = this.a(array);
            }
            this.d = true;
        }
        else {
            this.d = false;
        }
        return this.d;
    }
    
    private void j() {
        this.c = 0;
        this.f = -1.0f;
        this.g = -1.0f;
        this.e = -1.0f;
        this.h = new int[0];
        this.d = false;
    }
    
    private boolean k() {
        return !(this.k instanceof m);
    }
    
    int a() {
        return this.c;
    }
    
    void a(final int n) {
        if (this.k()) {
            switch (n) {
                default: {
                    throw new IllegalArgumentException("Unknown auto-size text type: " + n);
                }
                case 0: {
                    this.j();
                    break;
                }
                case 1: {
                    final DisplayMetrics displayMetrics = this.l.getResources().getDisplayMetrics();
                    this.a(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
                    if (this.i()) {
                        this.f();
                        return;
                    }
                    break;
                }
            }
        }
    }
    
    void a(final int n, final float n2) {
        Resources resources;
        if (this.l == null) {
            resources = Resources.getSystem();
        }
        else {
            resources = this.l.getResources();
        }
        this.a(TypedValue.applyDimension(n, n2, resources.getDisplayMetrics()));
    }
    
    void a(final int n, final int n2, final int n3, final int n4) {
        if (this.k()) {
            final DisplayMetrics displayMetrics = this.l.getResources().getDisplayMetrics();
            this.a(TypedValue.applyDimension(n4, (float)n, displayMetrics), TypedValue.applyDimension(n4, (float)n2, displayMetrics), TypedValue.applyDimension(n4, (float)n3, displayMetrics));
            if (this.i()) {
                this.f();
            }
        }
    }
    
    void a(final AttributeSet set, int resourceId) {
        final TypedArray obtainStyledAttributes = this.l.obtainStyledAttributes(set, android.support.v7.a.a.j.AppCompatTextView, resourceId, 0);
        if (obtainStyledAttributes.hasValue(android.support.v7.a.a.j.AppCompatTextView_autoSizeTextType)) {
            this.c = obtainStyledAttributes.getInt(android.support.v7.a.a.j.AppCompatTextView_autoSizeTextType, 0);
        }
        float dimension;
        if (obtainStyledAttributes.hasValue(android.support.v7.a.a.j.AppCompatTextView_autoSizeStepGranularity)) {
            dimension = obtainStyledAttributes.getDimension(android.support.v7.a.a.j.AppCompatTextView_autoSizeStepGranularity, -1.0f);
        }
        else {
            dimension = -1.0f;
        }
        float dimension2;
        if (obtainStyledAttributes.hasValue(android.support.v7.a.a.j.AppCompatTextView_autoSizeMinTextSize)) {
            dimension2 = obtainStyledAttributes.getDimension(android.support.v7.a.a.j.AppCompatTextView_autoSizeMinTextSize, -1.0f);
        }
        else {
            dimension2 = -1.0f;
        }
        float dimension3;
        if (obtainStyledAttributes.hasValue(android.support.v7.a.a.j.AppCompatTextView_autoSizeMaxTextSize)) {
            dimension3 = obtainStyledAttributes.getDimension(android.support.v7.a.a.j.AppCompatTextView_autoSizeMaxTextSize, -1.0f);
        }
        else {
            dimension3 = -1.0f;
        }
        if (obtainStyledAttributes.hasValue(android.support.v7.a.a.j.AppCompatTextView_autoSizePresetSizes)) {
            resourceId = obtainStyledAttributes.getResourceId(android.support.v7.a.a.j.AppCompatTextView_autoSizePresetSizes, 0);
            if (resourceId > 0) {
                final TypedArray obtainTypedArray = obtainStyledAttributes.getResources().obtainTypedArray(resourceId);
                this.a(obtainTypedArray);
                obtainTypedArray.recycle();
            }
        }
        obtainStyledAttributes.recycle();
        if (this.k()) {
            if (this.c == 1) {
                if (!this.i) {
                    final DisplayMetrics displayMetrics = this.l.getResources().getDisplayMetrics();
                    float applyDimension = dimension2;
                    if (dimension2 == -1.0f) {
                        applyDimension = TypedValue.applyDimension(2, 12.0f, displayMetrics);
                    }
                    float applyDimension2 = dimension3;
                    if (dimension3 == -1.0f) {
                        applyDimension2 = TypedValue.applyDimension(2, 112.0f, displayMetrics);
                    }
                    float n = dimension;
                    if (dimension == -1.0f) {
                        n = 1.0f;
                    }
                    this.a(applyDimension, applyDimension2, n);
                }
                this.i();
            }
            return;
        }
        this.c = 0;
    }
    
    void a(final int[] array, final int n) {
        int n2 = 0;
        if (this.k()) {
            final int length = array.length;
            if (length > 0) {
                final int[] array2 = new int[length];
                int[] copy;
                if (n == 0) {
                    copy = Arrays.copyOf(array, length);
                }
                else {
                    final DisplayMetrics displayMetrics = this.l.getResources().getDisplayMetrics();
                    while (true) {
                        copy = array2;
                        if (n2 >= length) {
                            break;
                        }
                        array2[n2] = Math.round(TypedValue.applyDimension(n, (float)array[n2], displayMetrics));
                        ++n2;
                    }
                }
                this.h = this.a(copy);
                if (!this.h()) {
                    throw new IllegalArgumentException("None of the preset sizes is valid: " + Arrays.toString(array));
                }
            }
            else {
                this.i = false;
            }
            if (this.i()) {
                this.f();
            }
        }
    }
    
    int b() {
        return Math.round(this.e);
    }
    
    int c() {
        return Math.round(this.f);
    }
    
    int d() {
        return Math.round(this.g);
    }
    
    int[] e() {
        return this.h;
    }
    
    void f() {
        if (this.g()) {
            Label_0155: {
                if (!this.d) {
                    break Label_0155;
                }
                if (this.k.getMeasuredHeight() <= 0 || this.k.getMeasuredWidth() <= 0) {
                    return;
                }
                Label_0161: {
                    if (!this.a(this.k, "getHorizontallyScrolling", Boolean.valueOf(false))) {
                        break Label_0161;
                    }
                    int n = 1048576;
                    while (true) {
                        final int n2 = this.k.getHeight() - this.k.getCompoundPaddingBottom() - this.k.getCompoundPaddingTop();
                        if (n <= 0 || n2 <= 0) {
                            return;
                        }
                        synchronized (ab.a) {
                            ab.a.setEmpty();
                            ab.a.right = n;
                            ab.a.bottom = n2;
                            final float n3 = this.a(ab.a);
                            if (n3 != this.k.getTextSize()) {
                                this.a(0, n3);
                            }
                            // monitorexit(ab.a)
                            this.d = true;
                            return;
                            n = this.k.getMeasuredWidth() - this.k.getTotalPaddingLeft() - this.k.getTotalPaddingRight();
                            continue;
                        }
                        break;
                    }
                }
            }
        }
    }
    
    boolean g() {
        return this.k() && this.c != 0;
    }
}
