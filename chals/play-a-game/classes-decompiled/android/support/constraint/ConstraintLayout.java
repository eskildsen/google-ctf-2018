// 
// Decompiled by Procyon v0.5.30
// 

package android.support.constraint;

import android.annotation.TargetApi;
import android.view.ViewGroup$MarginLayoutParams;
import android.view.ViewGroup$LayoutParams;
import android.os.Build$VERSION;
import android.support.constraint.a.a.d;
import android.content.res.TypedArray;
import android.view.View$MeasureSpec;
import android.util.AttributeSet;
import android.content.Context;
import android.support.constraint.a.a.b;
import java.util.ArrayList;
import android.support.constraint.a.a.c;
import android.view.View;
import android.util.SparseArray;
import android.view.ViewGroup;

public class ConstraintLayout extends ViewGroup
{
    SparseArray<View> a;
    c b;
    private final ArrayList<b> c;
    private int d;
    private int e;
    private int f;
    private int g;
    private boolean h;
    private int i;
    private android.support.constraint.a j;
    
    public ConstraintLayout(final Context context) {
        super(context);
        this.a = (SparseArray<View>)new SparseArray();
        this.c = new ArrayList<b>(100);
        this.b = new c();
        this.d = 0;
        this.e = 0;
        this.f = Integer.MAX_VALUE;
        this.g = Integer.MAX_VALUE;
        this.h = true;
        this.i = 2;
        this.j = null;
        this.b(null);
    }
    
    public ConstraintLayout(final Context context, final AttributeSet set) {
        super(context, set);
        this.a = (SparseArray<View>)new SparseArray();
        this.c = new ArrayList<b>(100);
        this.b = new c();
        this.d = 0;
        this.e = 0;
        this.f = Integer.MAX_VALUE;
        this.g = Integer.MAX_VALUE;
        this.h = true;
        this.i = 2;
        this.j = null;
        this.b(set);
    }
    
    public ConstraintLayout(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
        this.a = (SparseArray<View>)new SparseArray();
        this.c = new ArrayList<b>(100);
        this.b = new c();
        this.d = 0;
        this.e = 0;
        this.f = Integer.MAX_VALUE;
        this.g = Integer.MAX_VALUE;
        this.h = true;
        this.i = 2;
        this.j = null;
        this.b(set);
    }
    
    private final b a(final int n) {
        if (n == 0) {
            return this.b;
        }
        final View view = (View)this.a.get(n);
        if (view == this) {
            return this.b;
        }
        if (view == null) {
            return null;
        }
        return ((a)view.getLayoutParams()).Z;
    }
    
    private final b a(final View view) {
        if (view == this) {
            return this.b;
        }
        if (view == null) {
            return null;
        }
        return ((a)view.getLayoutParams()).Z;
    }
    
    private void a(final int n, final int n2) {
        final int n3 = this.getPaddingTop() + this.getPaddingBottom();
        final int n4 = this.getPaddingLeft() + this.getPaddingRight();
        for (int childCount = this.getChildCount(), i = 0; i < childCount; ++i) {
            final View child = this.getChildAt(i);
            if (child.getVisibility() != 8) {
                final a a = (a)child.getLayoutParams();
                final b z = a.Z;
                if (!a.R) {
                    final int width = a.width;
                    int n5 = a.height;
                    int n6;
                    if (a.O || a.P || (!a.O && a.F == 1) || a.width == -1 || (!a.P && (a.G == 1 || a.height == -1))) {
                        n6 = 1;
                    }
                    else {
                        n6 = 0;
                    }
                    final boolean b = false;
                    int n7 = 0;
                    int n8 = 0;
                    int measuredWidth;
                    int n12;
                    if (n6 != 0) {
                        int n9;
                        int n10;
                        if (width == 0 || width == -1) {
                            n9 = getChildMeasureSpec(n, n4, -2);
                            n10 = 1;
                        }
                        else {
                            n9 = getChildMeasureSpec(n, n4, width);
                            n10 = 0;
                        }
                        int n11;
                        if (n5 == 0 || n5 == -1) {
                            n11 = getChildMeasureSpec(n2, n3, -2);
                            n8 = 1;
                        }
                        else {
                            n11 = getChildMeasureSpec(n2, n3, n5);
                        }
                        child.measure(n9, n11);
                        measuredWidth = child.getMeasuredWidth();
                        n5 = child.getMeasuredHeight();
                        n7 = n8;
                        n12 = n10;
                    }
                    else {
                        final int n13 = width;
                        n12 = (b ? 1 : 0);
                        measuredWidth = n13;
                    }
                    z.d(measuredWidth);
                    z.e(n5);
                    if (n12 != 0) {
                        z.h(measuredWidth);
                    }
                    if (n7 != 0) {
                        z.i(n5);
                    }
                    if (a.Q) {
                        final int baseline = child.getBaseline();
                        if (baseline != -1) {
                            z.j(baseline);
                        }
                    }
                }
            }
        }
    }
    
    private void b(int size, int size2) {
        final int mode = View$MeasureSpec.getMode(size);
        size = View$MeasureSpec.getSize(size);
        final int mode2 = View$MeasureSpec.getMode(size2);
        size2 = View$MeasureSpec.getSize(size2);
        final int paddingTop = this.getPaddingTop();
        final int paddingBottom = this.getPaddingBottom();
        final int paddingLeft = this.getPaddingLeft();
        final int paddingRight = this.getPaddingRight();
        b.a a = android.support.constraint.a.a.b.a.a;
        b.a a2 = android.support.constraint.a.a.b.a.a;
        this.getLayoutParams();
        switch (mode) {
            default: {
                size = 0;
                break;
            }
            case Integer.MIN_VALUE: {
                a = android.support.constraint.a.a.b.a.b;
                break;
            }
            case 0: {
                a = android.support.constraint.a.a.b.a.b;
                size = 0;
                break;
            }
            case 1073741824: {
                size = Math.min(this.f, size) - (paddingLeft + paddingRight);
                break;
            }
        }
        switch (mode2) {
            default: {
                size2 = 0;
                break;
            }
            case Integer.MIN_VALUE: {
                a2 = android.support.constraint.a.a.b.a.b;
                break;
            }
            case 0: {
                a2 = android.support.constraint.a.a.b.a.b;
                size2 = 0;
                break;
            }
            case 1073741824: {
                size2 = Math.min(this.g, size2) - (paddingTop + paddingBottom);
                break;
            }
        }
        this.b.f(0);
        this.b.g(0);
        this.b.a(a);
        this.b.d(size);
        this.b.b(a2);
        this.b.e(size2);
        this.b.f(this.d - this.getPaddingLeft() - this.getPaddingRight());
        this.b.g(this.e - this.getPaddingTop() - this.getPaddingBottom());
    }
    
    private void b(final AttributeSet set) {
        this.b.a(this);
        this.a.put(this.getId(), (Object)this);
        this.j = null;
        if (set != null) {
            final TypedArray obtainStyledAttributes = this.getContext().obtainStyledAttributes(set, android.support.constraint.c.a.ConstraintLayout_Layout);
            for (int indexCount = obtainStyledAttributes.getIndexCount(), i = 0; i < indexCount; ++i) {
                final int index = obtainStyledAttributes.getIndex(i);
                if (index == android.support.constraint.c.a.ConstraintLayout_Layout_android_minWidth) {
                    this.d = obtainStyledAttributes.getDimensionPixelOffset(index, this.d);
                }
                else if (index == android.support.constraint.c.a.ConstraintLayout_Layout_android_minHeight) {
                    this.e = obtainStyledAttributes.getDimensionPixelOffset(index, this.e);
                }
                else if (index == android.support.constraint.c.a.ConstraintLayout_Layout_android_maxWidth) {
                    this.f = obtainStyledAttributes.getDimensionPixelOffset(index, this.f);
                }
                else if (index == android.support.constraint.c.a.ConstraintLayout_Layout_android_maxHeight) {
                    this.g = obtainStyledAttributes.getDimensionPixelOffset(index, this.g);
                }
                else if (index == android.support.constraint.c.a.ConstraintLayout_Layout_layout_optimizationLevel) {
                    this.i = obtainStyledAttributes.getInt(index, this.i);
                }
                else if (index == android.support.constraint.c.a.ConstraintLayout_Layout_constraintSet) {
                    (this.j = new android.support.constraint.a()).a(this.getContext(), obtainStyledAttributes.getResourceId(index, 0));
                }
            }
            obtainStyledAttributes.recycle();
        }
        this.b.m(this.i);
    }
    
    private void c() {
        final boolean b = false;
        final int childCount = this.getChildCount();
        int n = 0;
        boolean b2;
        while (true) {
            b2 = b;
            if (n >= childCount) {
                break;
            }
            if (this.getChildAt(n).isLayoutRequested()) {
                b2 = true;
                break;
            }
            ++n;
        }
        if (b2) {
            this.c.clear();
            this.d();
        }
    }
    
    private void d() {
        if (this.j != null) {
            this.j.a(this);
        }
        final int childCount = this.getChildCount();
        this.b.I();
    Label_0059:
        for (int i = 0; i < childCount; ++i) {
            final View child = this.getChildAt(i);
            final b a = this.a(child);
            if (a != null) {
                final a a2 = (a)child.getLayoutParams();
                a.a();
                a.a(child.getVisibility());
                a.a(child);
                this.b.b(a);
                if (!a2.P || !a2.O) {
                    this.c.add(a);
                }
                if (a2.R) {
                    final d d = (d)a;
                    if (a2.a != -1) {
                        d.n(a2.a);
                    }
                    if (a2.b != -1) {
                        d.o(a2.b);
                    }
                    if (a2.c != -1.0f) {
                        d.e(a2.c);
                    }
                }
                else if (a2.S != -1 || a2.T != -1 || a2.U != -1 || a2.V != -1 || a2.h != -1 || a2.i != -1 || a2.j != -1 || a2.k != -1 || a2.l != -1 || a2.L != -1 || a2.M != -1 || a2.width == -1 || a2.height == -1) {
                    int s = a2.S;
                    int t = a2.T;
                    int u = a2.U;
                    int v = a2.V;
                    int w = a2.W;
                    int x = a2.X;
                    float y = a2.Y;
                    while (true) {
                        Label_1529: {
                            if (Build$VERSION.SDK_INT >= 17) {
                                break Label_1529;
                            }
                            final int d2 = a2.d;
                            final int e = a2.e;
                            final int f = a2.f;
                            final int g = a2.g;
                            final int q = a2.q;
                            final int s2 = a2.s;
                            final float w2 = a2.w;
                            int m = e;
                            int n;
                            if ((n = d2) == -1) {
                                m = e;
                                n = d2;
                                if (e == -1) {
                                    if (a2.n != -1) {
                                        n = a2.n;
                                        m = e;
                                    }
                                    else {
                                        m = e;
                                        n = d2;
                                        if (a2.m != -1) {
                                            m = a2.m;
                                            n = d2;
                                        }
                                    }
                                }
                            }
                            y = w2;
                            x = s2;
                            v = g;
                            u = f;
                            w = q;
                            t = m;
                            s = n;
                            if (f != -1) {
                                break Label_1529;
                            }
                            y = w2;
                            x = s2;
                            v = g;
                            u = f;
                            w = q;
                            t = m;
                            s = n;
                            if (g != -1) {
                                break Label_1529;
                            }
                            int o;
                            int p;
                            int n3;
                            int n4;
                            if (a2.o != -1) {
                                o = a2.o;
                                final int n2 = m;
                                p = g;
                                n3 = n;
                                n4 = n2;
                            }
                            else {
                                y = w2;
                                x = s2;
                                v = g;
                                u = f;
                                w = q;
                                t = m;
                                s = n;
                                if (a2.p == -1) {
                                    break Label_1529;
                                }
                                p = a2.p;
                                o = f;
                                final int n5 = n;
                                n4 = m;
                                n3 = n5;
                            }
                            if (n3 != -1) {
                                final b a3 = this.a(n3);
                                if (a3 != null) {
                                    a.a(android.support.constraint.a.a.a.c.b, a3, android.support.constraint.a.a.a.c.b, a2.leftMargin, q);
                                }
                            }
                            else if (n4 != -1) {
                                final b a4 = this.a(n4);
                                if (a4 != null) {
                                    a.a(android.support.constraint.a.a.a.c.b, a4, android.support.constraint.a.a.a.c.d, a2.leftMargin, q);
                                }
                            }
                            if (o != -1) {
                                final b a5 = this.a(o);
                                if (a5 != null) {
                                    a.a(android.support.constraint.a.a.a.c.d, a5, android.support.constraint.a.a.a.c.b, a2.rightMargin, s2);
                                }
                            }
                            else if (p != -1) {
                                final b a6 = this.a(p);
                                if (a6 != null) {
                                    a.a(android.support.constraint.a.a.a.c.d, a6, android.support.constraint.a.a.a.c.d, a2.rightMargin, s2);
                                }
                            }
                            if (a2.h != -1) {
                                final b a7 = this.a(a2.h);
                                if (a7 != null) {
                                    a.a(android.support.constraint.a.a.a.c.c, a7, android.support.constraint.a.a.a.c.c, a2.topMargin, a2.r);
                                }
                            }
                            else if (a2.i != -1) {
                                final b a8 = this.a(a2.i);
                                if (a8 != null) {
                                    a.a(android.support.constraint.a.a.a.c.c, a8, android.support.constraint.a.a.a.c.e, a2.topMargin, a2.r);
                                }
                            }
                            if (a2.j != -1) {
                                final b a9 = this.a(a2.j);
                                if (a9 != null) {
                                    a.a(android.support.constraint.a.a.a.c.e, a9, android.support.constraint.a.a.a.c.c, a2.bottomMargin, a2.t);
                                }
                            }
                            else if (a2.k != -1) {
                                final b a10 = this.a(a2.k);
                                if (a10 != null) {
                                    a.a(android.support.constraint.a.a.a.c.e, a10, android.support.constraint.a.a.a.c.e, a2.bottomMargin, a2.t);
                                }
                            }
                            if (a2.l != -1) {
                                final View view = (View)this.a.get(a2.l);
                                final b a11 = this.a(a2.l);
                                if (a11 != null && view != null && view.getLayoutParams() instanceof a) {
                                    final a a12 = (a)view.getLayoutParams();
                                    a2.Q = true;
                                    a12.Q = true;
                                    a.a(android.support.constraint.a.a.a.c.f).a(a11.a(android.support.constraint.a.a.a.c.f), 0, -1, android.support.constraint.a.a.a.b.b, 0, true);
                                    a.a(android.support.constraint.a.a.a.c.c).i();
                                    a.a(android.support.constraint.a.a.a.c.e).i();
                                }
                            }
                            if (w2 >= 0.0f && w2 != 0.5f) {
                                a.a(w2);
                            }
                            if (a2.x >= 0.0f && a2.x != 0.5f) {
                                a.b(a2.x);
                            }
                            if (this.isInEditMode() && (a2.L != -1 || a2.M != -1)) {
                                a.a(a2.L, a2.M);
                            }
                            if (!a2.O) {
                                if (a2.width == -1) {
                                    a.a(android.support.constraint.a.a.b.a.d);
                                    a.a(android.support.constraint.a.a.a.c.b).d = a2.leftMargin;
                                    a.a(android.support.constraint.a.a.a.c.d).d = a2.rightMargin;
                                }
                                else {
                                    a.a(android.support.constraint.a.a.b.a.c);
                                    a.d(0);
                                }
                            }
                            else {
                                a.a(android.support.constraint.a.a.b.a.a);
                                a.d(a2.width);
                            }
                            if (!a2.P) {
                                if (a2.height == -1) {
                                    a.b(android.support.constraint.a.a.b.a.d);
                                    a.a(android.support.constraint.a.a.a.c.c).d = a2.topMargin;
                                    a.a(android.support.constraint.a.a.a.c.e).d = a2.bottomMargin;
                                }
                                else {
                                    a.b(android.support.constraint.a.a.b.a.c);
                                    a.e(0);
                                }
                            }
                            else {
                                a.b(android.support.constraint.a.a.b.a.a);
                                a.e(a2.height);
                            }
                            if (a2.y != null) {
                                a.a(a2.y);
                            }
                            a.c(a2.B);
                            a.d(a2.C);
                            a.k(a2.D);
                            a.l(a2.E);
                            a.a(a2.F, a2.H, a2.J);
                            a.b(a2.G, a2.I, a2.K);
                            continue Label_0059;
                        }
                        final float w2 = y;
                        int n4 = t;
                        final int s2 = x;
                        int n3 = s;
                        final int q = w;
                        int p = v;
                        int o = u;
                        continue;
                    }
                }
            }
        }
    }
    
    public a a(final AttributeSet set) {
        return new a(this.getContext(), set);
    }
    
    protected void a() {
        this.b.F();
    }
    
    public void addView(final View view, final int n, final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        super.addView(view, n, viewGroup$LayoutParams);
        if (Build$VERSION.SDK_INT < 14) {
            this.onViewAdded(view);
        }
    }
    
    protected a b() {
        return new a(-2, -2);
    }
    
    protected boolean checkLayoutParams(final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        return viewGroup$LayoutParams instanceof a;
    }
    
    protected ViewGroup$LayoutParams generateLayoutParams(final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        return (ViewGroup$LayoutParams)new a(viewGroup$LayoutParams);
    }
    
    public int getMaxHeight() {
        return this.g;
    }
    
    public int getMaxWidth() {
        return this.f;
    }
    
    public int getMinHeight() {
        return this.e;
    }
    
    public int getMinWidth() {
        return this.d;
    }
    
    protected void onLayout(final boolean b, int i, int childCount, int n, int o) {
        childCount = this.getChildCount();
        final boolean inEditMode = this.isInEditMode();
        View child;
        a a;
        b z;
        for (i = 0; i < childCount; ++i) {
            child = this.getChildAt(i);
            a = (a)child.getLayoutParams();
            if (child.getVisibility() != 8 || a.R || inEditMode) {
                z = a.Z;
                n = z.n();
                o = z.o();
                child.layout(n, o, z.h() + n, z.l() + o);
            }
        }
    }
    
    protected void onMeasure(int n, int resolveSizeAndState) {
        final int paddingLeft = this.getPaddingLeft();
        final int paddingTop = this.getPaddingTop();
        this.b.b(paddingLeft);
        this.b.c(paddingTop);
        this.b(n, resolveSizeAndState);
        if (this.h) {
            this.h = false;
            this.c();
        }
        this.a(n, resolveSizeAndState);
        if (this.getChildCount() > 0) {
            this.a();
        }
        int n2 = 0;
        int combineMeasuredStates = 0;
        final int size = this.c.size();
        final int n3 = paddingTop + this.getPaddingBottom();
        final int n4 = paddingLeft + this.getPaddingRight();
        if (size > 0) {
            int n5 = 0;
            final boolean b = this.b.B() == android.support.constraint.a.a.b.a.b;
            final boolean b2 = this.b.C() == android.support.constraint.a.a.b.a.b;
            for (int i = 0; i < size; ++i) {
                final b b3 = this.c.get(i);
                if (!(b3 instanceof d)) {
                    final View view = (View)b3.x();
                    if (view != null) {
                        if (view.getVisibility() != 8) {
                            final a a = (a)view.getLayoutParams();
                            int n6;
                            if (a.width == -2) {
                                n6 = getChildMeasureSpec(n, n4, a.width);
                            }
                            else {
                                n6 = View$MeasureSpec.makeMeasureSpec(b3.h(), 1073741824);
                            }
                            int n7;
                            if (a.height == -2) {
                                n7 = getChildMeasureSpec(resolveSizeAndState, n3, a.height);
                            }
                            else {
                                n7 = View$MeasureSpec.makeMeasureSpec(b3.l(), 1073741824);
                            }
                            view.measure(n6, n7);
                            final int measuredWidth = view.getMeasuredWidth();
                            final int measuredHeight = view.getMeasuredHeight();
                            int n8;
                            if (measuredWidth != b3.h()) {
                                b3.d(measuredWidth);
                                if (b && b3.t() > this.b.h()) {
                                    this.b.d(Math.max(this.d, b3.t() + b3.a(android.support.constraint.a.a.a.c.d).d()));
                                }
                                n8 = 1;
                            }
                            else {
                                n8 = n5;
                            }
                            if (measuredHeight != b3.l()) {
                                b3.e(measuredHeight);
                                if (b2 && b3.u() > this.b.l()) {
                                    this.b.e(Math.max(this.e, b3.u() + b3.a(android.support.constraint.a.a.a.c.e).d()));
                                }
                                n8 = 1;
                            }
                            n5 = n8;
                            if (a.Q) {
                                final int baseline = view.getBaseline();
                                n5 = n8;
                                if (baseline != -1) {
                                    n5 = n8;
                                    if (baseline != b3.w()) {
                                        b3.j(baseline);
                                        n5 = 1;
                                    }
                                }
                            }
                            if (Build$VERSION.SDK_INT >= 11) {
                                combineMeasuredStates = combineMeasuredStates(combineMeasuredStates, view.getMeasuredState());
                            }
                        }
                    }
                }
            }
            n2 = combineMeasuredStates;
            if (n5 != 0) {
                this.a();
                n2 = combineMeasuredStates;
            }
        }
        final int n9 = this.b.h() + n4;
        final int n10 = this.b.l() + n3;
        if (Build$VERSION.SDK_INT >= 11) {
            n = resolveSizeAndState(n9, n, n2);
            resolveSizeAndState = resolveSizeAndState(n10, resolveSizeAndState, n2 << 16);
            n = Math.min(this.f, n);
            final int min = Math.min(this.g, resolveSizeAndState);
            resolveSizeAndState = (n & 0xFFFFFF);
            final int n11 = min & 0xFFFFFF;
            n = resolveSizeAndState;
            if (this.b.D()) {
                n = (resolveSizeAndState | 0x1000000);
            }
            resolveSizeAndState = n11;
            if (this.b.E()) {
                resolveSizeAndState = (n11 | 0x1000000);
            }
            this.setMeasuredDimension(n, resolveSizeAndState);
            return;
        }
        this.setMeasuredDimension(n9, n10);
    }
    
    public void onViewAdded(final View view) {
        if (Build$VERSION.SDK_INT >= 14) {
            super.onViewAdded(view);
        }
        final b a = this.a(view);
        if (view instanceof android.support.constraint.b && !(a instanceof d)) {
            final a a2 = (a)view.getLayoutParams();
            a2.Z = new d();
            a2.R = true;
            ((d)a2.Z).m(a2.N);
            final b z = a2.Z;
        }
        this.a.put(view.getId(), (Object)view);
        this.h = true;
    }
    
    public void onViewRemoved(final View view) {
        if (Build$VERSION.SDK_INT >= 14) {
            super.onViewRemoved(view);
        }
        this.a.remove(view.getId());
        this.b.c(this.a(view));
        this.h = true;
    }
    
    public void removeView(final View view) {
        super.removeView(view);
        if (Build$VERSION.SDK_INT < 14) {
            this.onViewRemoved(view);
        }
    }
    
    public void requestLayout() {
        super.requestLayout();
        this.h = true;
    }
    
    public void setConstraintSet(final android.support.constraint.a j) {
        this.j = j;
    }
    
    public void setId(final int id) {
        this.a.remove(this.getId());
        super.setId(id);
        this.a.put(this.getId(), (Object)this);
    }
    
    public void setMaxHeight(final int g) {
        if (g == this.g) {
            return;
        }
        this.g = g;
        this.requestLayout();
    }
    
    public void setMaxWidth(final int f) {
        if (f == this.f) {
            return;
        }
        this.f = f;
        this.requestLayout();
    }
    
    public void setMinHeight(final int e) {
        if (e == this.e) {
            return;
        }
        this.e = e;
        this.requestLayout();
    }
    
    public void setMinWidth(final int d) {
        if (d == this.d) {
            return;
        }
        this.d = d;
        this.requestLayout();
    }
    
    public void setOptimizationLevel(final int n) {
        this.b.m(n);
    }
    
    public static class a extends ViewGroup$MarginLayoutParams
    {
        int A;
        public float B;
        public float C;
        public int D;
        public int E;
        public int F;
        public int G;
        public int H;
        public int I;
        public int J;
        public int K;
        public int L;
        public int M;
        public int N;
        boolean O;
        boolean P;
        boolean Q;
        boolean R;
        int S;
        int T;
        int U;
        int V;
        int W;
        int X;
        float Y;
        b Z;
        public int a;
        public int b;
        public float c;
        public int d;
        public int e;
        public int f;
        public int g;
        public int h;
        public int i;
        public int j;
        public int k;
        public int l;
        public int m;
        public int n;
        public int o;
        public int p;
        public int q;
        public int r;
        public int s;
        public int t;
        public int u;
        public int v;
        public float w;
        public float x;
        public String y;
        float z;
        
        public a(final int n, final int n2) {
            super(n, n2);
            this.a = -1;
            this.b = -1;
            this.c = -1.0f;
            this.d = -1;
            this.e = -1;
            this.f = -1;
            this.g = -1;
            this.h = -1;
            this.i = -1;
            this.j = -1;
            this.k = -1;
            this.l = -1;
            this.m = -1;
            this.n = -1;
            this.o = -1;
            this.p = -1;
            this.q = -1;
            this.r = -1;
            this.s = -1;
            this.t = -1;
            this.u = -1;
            this.v = -1;
            this.w = 0.5f;
            this.x = 0.5f;
            this.y = null;
            this.z = 0.0f;
            this.A = 1;
            this.B = 0.0f;
            this.C = 0.0f;
            this.D = 0;
            this.E = 0;
            this.F = 0;
            this.G = 0;
            this.H = 0;
            this.I = 0;
            this.J = 0;
            this.K = 0;
            this.L = -1;
            this.M = -1;
            this.N = -1;
            this.O = true;
            this.P = true;
            this.Q = false;
            this.R = false;
            this.S = -1;
            this.T = -1;
            this.U = -1;
            this.V = -1;
            this.W = -1;
            this.X = -1;
            this.Y = 0.5f;
            this.Z = new b();
        }
        
        public a(Context obtainStyledAttributes, final AttributeSet set) {
            super(obtainStyledAttributes, set);
            this.a = -1;
            this.b = -1;
            this.c = -1.0f;
            this.d = -1;
            this.e = -1;
            this.f = -1;
            this.g = -1;
            this.h = -1;
            this.i = -1;
            this.j = -1;
            this.k = -1;
            this.l = -1;
            this.m = -1;
            this.n = -1;
            this.o = -1;
            this.p = -1;
            this.q = -1;
            this.r = -1;
            this.s = -1;
            this.t = -1;
            this.u = -1;
            this.v = -1;
            this.w = 0.5f;
            this.x = 0.5f;
            this.y = null;
            this.z = 0.0f;
            this.A = 1;
            this.B = 0.0f;
            this.C = 0.0f;
            this.D = 0;
            this.E = 0;
            this.F = 0;
            this.G = 0;
            this.H = 0;
            this.I = 0;
            this.J = 0;
            this.K = 0;
            this.L = -1;
            this.M = -1;
            this.N = -1;
            this.O = true;
            this.P = true;
            this.Q = false;
            this.R = false;
            this.S = -1;
            this.T = -1;
            this.U = -1;
            this.V = -1;
            this.W = -1;
            this.X = -1;
            this.Y = 0.5f;
            this.Z = new b();
            obtainStyledAttributes = (Context)obtainStyledAttributes.obtainStyledAttributes(set, android.support.constraint.c.a.ConstraintLayout_Layout);
            for (int indexCount = ((TypedArray)obtainStyledAttributes).getIndexCount(), i = 0; i < indexCount; ++i) {
                final int index = ((TypedArray)obtainStyledAttributes).getIndex(i);
                if (index == android.support.constraint.c.a.ConstraintLayout_Layout_layout_constraintLeft_toLeftOf) {
                    this.d = ((TypedArray)obtainStyledAttributes).getResourceId(index, this.d);
                    if (this.d == -1) {
                        this.d = ((TypedArray)obtainStyledAttributes).getInt(index, -1);
                    }
                }
                else if (index == android.support.constraint.c.a.ConstraintLayout_Layout_layout_constraintLeft_toRightOf) {
                    this.e = ((TypedArray)obtainStyledAttributes).getResourceId(index, this.e);
                    if (this.e == -1) {
                        this.e = ((TypedArray)obtainStyledAttributes).getInt(index, -1);
                    }
                }
                else if (index == android.support.constraint.c.a.ConstraintLayout_Layout_layout_constraintRight_toLeftOf) {
                    this.f = ((TypedArray)obtainStyledAttributes).getResourceId(index, this.f);
                    if (this.f == -1) {
                        this.f = ((TypedArray)obtainStyledAttributes).getInt(index, -1);
                    }
                }
                else if (index == android.support.constraint.c.a.ConstraintLayout_Layout_layout_constraintRight_toRightOf) {
                    this.g = ((TypedArray)obtainStyledAttributes).getResourceId(index, this.g);
                    if (this.g == -1) {
                        this.g = ((TypedArray)obtainStyledAttributes).getInt(index, -1);
                    }
                }
                else if (index == android.support.constraint.c.a.ConstraintLayout_Layout_layout_constraintTop_toTopOf) {
                    this.h = ((TypedArray)obtainStyledAttributes).getResourceId(index, this.h);
                    if (this.h == -1) {
                        this.h = ((TypedArray)obtainStyledAttributes).getInt(index, -1);
                    }
                }
                else if (index == android.support.constraint.c.a.ConstraintLayout_Layout_layout_constraintTop_toBottomOf) {
                    this.i = ((TypedArray)obtainStyledAttributes).getResourceId(index, this.i);
                    if (this.i == -1) {
                        this.i = ((TypedArray)obtainStyledAttributes).getInt(index, -1);
                    }
                }
                else if (index == android.support.constraint.c.a.ConstraintLayout_Layout_layout_constraintBottom_toTopOf) {
                    this.j = ((TypedArray)obtainStyledAttributes).getResourceId(index, this.j);
                    if (this.j == -1) {
                        this.j = ((TypedArray)obtainStyledAttributes).getInt(index, -1);
                    }
                }
                else if (index == android.support.constraint.c.a.ConstraintLayout_Layout_layout_constraintBottom_toBottomOf) {
                    this.k = ((TypedArray)obtainStyledAttributes).getResourceId(index, this.k);
                    if (this.k == -1) {
                        this.k = ((TypedArray)obtainStyledAttributes).getInt(index, -1);
                    }
                }
                else if (index == android.support.constraint.c.a.ConstraintLayout_Layout_layout_constraintBaseline_toBaselineOf) {
                    this.l = ((TypedArray)obtainStyledAttributes).getResourceId(index, this.l);
                    if (this.l == -1) {
                        this.l = ((TypedArray)obtainStyledAttributes).getInt(index, -1);
                    }
                }
                else if (index == android.support.constraint.c.a.ConstraintLayout_Layout_layout_editor_absoluteX) {
                    this.L = ((TypedArray)obtainStyledAttributes).getDimensionPixelOffset(index, this.L);
                }
                else if (index == android.support.constraint.c.a.ConstraintLayout_Layout_layout_editor_absoluteY) {
                    this.M = ((TypedArray)obtainStyledAttributes).getDimensionPixelOffset(index, this.M);
                }
                else if (index == android.support.constraint.c.a.ConstraintLayout_Layout_layout_constraintGuide_begin) {
                    this.a = ((TypedArray)obtainStyledAttributes).getDimensionPixelOffset(index, this.a);
                }
                else if (index == android.support.constraint.c.a.ConstraintLayout_Layout_layout_constraintGuide_end) {
                    this.b = ((TypedArray)obtainStyledAttributes).getDimensionPixelOffset(index, this.b);
                }
                else if (index == android.support.constraint.c.a.ConstraintLayout_Layout_layout_constraintGuide_percent) {
                    this.c = ((TypedArray)obtainStyledAttributes).getFloat(index, this.c);
                }
                else if (index == android.support.constraint.c.a.ConstraintLayout_Layout_android_orientation) {
                    this.N = ((TypedArray)obtainStyledAttributes).getInt(index, this.N);
                }
                else if (index == android.support.constraint.c.a.ConstraintLayout_Layout_layout_constraintStart_toEndOf) {
                    this.m = ((TypedArray)obtainStyledAttributes).getResourceId(index, this.m);
                    if (this.m == -1) {
                        this.m = ((TypedArray)obtainStyledAttributes).getInt(index, -1);
                    }
                }
                else if (index == android.support.constraint.c.a.ConstraintLayout_Layout_layout_constraintStart_toStartOf) {
                    this.n = ((TypedArray)obtainStyledAttributes).getResourceId(index, this.n);
                    if (this.n == -1) {
                        this.n = ((TypedArray)obtainStyledAttributes).getInt(index, -1);
                    }
                }
                else if (index == android.support.constraint.c.a.ConstraintLayout_Layout_layout_constraintEnd_toStartOf) {
                    this.o = ((TypedArray)obtainStyledAttributes).getResourceId(index, this.o);
                    if (this.o == -1) {
                        this.o = ((TypedArray)obtainStyledAttributes).getInt(index, -1);
                    }
                }
                else if (index == android.support.constraint.c.a.ConstraintLayout_Layout_layout_constraintEnd_toEndOf) {
                    this.p = ((TypedArray)obtainStyledAttributes).getResourceId(index, this.p);
                    if (this.p == -1) {
                        this.p = ((TypedArray)obtainStyledAttributes).getInt(index, -1);
                    }
                }
                else if (index == android.support.constraint.c.a.ConstraintLayout_Layout_layout_goneMarginLeft) {
                    this.q = ((TypedArray)obtainStyledAttributes).getDimensionPixelSize(index, this.q);
                }
                else if (index == android.support.constraint.c.a.ConstraintLayout_Layout_layout_goneMarginTop) {
                    this.r = ((TypedArray)obtainStyledAttributes).getDimensionPixelSize(index, this.r);
                }
                else if (index == android.support.constraint.c.a.ConstraintLayout_Layout_layout_goneMarginRight) {
                    this.s = ((TypedArray)obtainStyledAttributes).getDimensionPixelSize(index, this.s);
                }
                else if (index == android.support.constraint.c.a.ConstraintLayout_Layout_layout_goneMarginBottom) {
                    this.t = ((TypedArray)obtainStyledAttributes).getDimensionPixelSize(index, this.t);
                }
                else if (index == android.support.constraint.c.a.ConstraintLayout_Layout_layout_goneMarginStart) {
                    this.u = ((TypedArray)obtainStyledAttributes).getDimensionPixelSize(index, this.u);
                }
                else if (index == android.support.constraint.c.a.ConstraintLayout_Layout_layout_goneMarginEnd) {
                    this.v = ((TypedArray)obtainStyledAttributes).getDimensionPixelSize(index, this.v);
                }
                else if (index == android.support.constraint.c.a.ConstraintLayout_Layout_layout_constraintHorizontal_bias) {
                    this.w = ((TypedArray)obtainStyledAttributes).getFloat(index, this.w);
                }
                else if (index == android.support.constraint.c.a.ConstraintLayout_Layout_layout_constraintVertical_bias) {
                    this.x = ((TypedArray)obtainStyledAttributes).getFloat(index, this.x);
                }
                else if (index == android.support.constraint.c.a.ConstraintLayout_Layout_layout_constraintDimensionRatio) {
                    this.y = ((TypedArray)obtainStyledAttributes).getString(index);
                    this.z = Float.NaN;
                    this.A = -1;
                    if (this.y != null) {
                        final int length = this.y.length();
                        final int index2 = this.y.indexOf(44);
                        int n;
                        if (index2 > 0 && index2 < length - 1) {
                            final String substring = this.y.substring(0, index2);
                            if (substring.equalsIgnoreCase("W")) {
                                this.A = 0;
                            }
                            else if (substring.equalsIgnoreCase("H")) {
                                this.A = 1;
                            }
                            n = index2 + 1;
                        }
                        else {
                            n = 0;
                        }
                        final int index3 = this.y.indexOf(58);
                        if (index3 >= 0 && index3 < length - 1) {
                            final String substring2 = this.y.substring(n, index3);
                            final String substring3 = this.y.substring(index3 + 1);
                            if (substring2.length() > 0 && substring3.length() > 0) {
                                float float1 = 0.0f;
                                float float2 = 0.0f;
                                Label_1480: {
                                    try {
                                        float1 = Float.parseFloat(substring2);
                                        float2 = Float.parseFloat(substring3);
                                        if (float1 > 0.0f && float2 > 0.0f) {
                                            if (this.A != 1) {
                                                break Label_1480;
                                            }
                                            this.z = Math.abs(float2 / float1);
                                        }
                                    }
                                    catch (NumberFormatException ex) {}
                                    continue;
                                }
                                this.z = Math.abs(float1 / float2);
                            }
                        }
                        else {
                            final String substring4 = this.y.substring(n);
                            if (substring4.length() > 0) {
                                try {
                                    this.z = Float.parseFloat(substring4);
                                }
                                catch (NumberFormatException ex2) {}
                            }
                        }
                    }
                }
                else if (index == android.support.constraint.c.a.ConstraintLayout_Layout_layout_constraintHorizontal_weight) {
                    this.B = ((TypedArray)obtainStyledAttributes).getFloat(index, 0.0f);
                }
                else if (index == android.support.constraint.c.a.ConstraintLayout_Layout_layout_constraintVertical_weight) {
                    this.C = ((TypedArray)obtainStyledAttributes).getFloat(index, 0.0f);
                }
                else if (index == android.support.constraint.c.a.ConstraintLayout_Layout_layout_constraintHorizontal_chainStyle) {
                    this.D = ((TypedArray)obtainStyledAttributes).getInt(index, 0);
                }
                else if (index == android.support.constraint.c.a.ConstraintLayout_Layout_layout_constraintVertical_chainStyle) {
                    this.E = ((TypedArray)obtainStyledAttributes).getInt(index, 0);
                }
                else if (index == android.support.constraint.c.a.ConstraintLayout_Layout_layout_constraintWidth_default) {
                    this.F = ((TypedArray)obtainStyledAttributes).getInt(index, 0);
                }
                else if (index == android.support.constraint.c.a.ConstraintLayout_Layout_layout_constraintHeight_default) {
                    this.G = ((TypedArray)obtainStyledAttributes).getInt(index, 0);
                }
                else if (index == android.support.constraint.c.a.ConstraintLayout_Layout_layout_constraintWidth_min) {
                    this.H = ((TypedArray)obtainStyledAttributes).getDimensionPixelSize(index, this.H);
                }
                else if (index == android.support.constraint.c.a.ConstraintLayout_Layout_layout_constraintWidth_max) {
                    this.J = ((TypedArray)obtainStyledAttributes).getDimensionPixelSize(index, this.J);
                }
                else if (index == android.support.constraint.c.a.ConstraintLayout_Layout_layout_constraintHeight_min) {
                    this.I = ((TypedArray)obtainStyledAttributes).getDimensionPixelSize(index, this.I);
                }
                else if (index == android.support.constraint.c.a.ConstraintLayout_Layout_layout_constraintHeight_max) {
                    this.K = ((TypedArray)obtainStyledAttributes).getDimensionPixelSize(index, this.K);
                }
                else if (index != android.support.constraint.c.a.ConstraintLayout_Layout_layout_constraintLeft_creator && index != android.support.constraint.c.a.ConstraintLayout_Layout_layout_constraintTop_creator && index != android.support.constraint.c.a.ConstraintLayout_Layout_layout_constraintRight_creator && index != android.support.constraint.c.a.ConstraintLayout_Layout_layout_constraintBottom_creator && index == android.support.constraint.c.a.ConstraintLayout_Layout_layout_constraintBaseline_creator) {}
            }
            ((TypedArray)obtainStyledAttributes).recycle();
            this.a();
        }
        
        public a(final ViewGroup$LayoutParams viewGroup$LayoutParams) {
            super(viewGroup$LayoutParams);
            this.a = -1;
            this.b = -1;
            this.c = -1.0f;
            this.d = -1;
            this.e = -1;
            this.f = -1;
            this.g = -1;
            this.h = -1;
            this.i = -1;
            this.j = -1;
            this.k = -1;
            this.l = -1;
            this.m = -1;
            this.n = -1;
            this.o = -1;
            this.p = -1;
            this.q = -1;
            this.r = -1;
            this.s = -1;
            this.t = -1;
            this.u = -1;
            this.v = -1;
            this.w = 0.5f;
            this.x = 0.5f;
            this.y = null;
            this.z = 0.0f;
            this.A = 1;
            this.B = 0.0f;
            this.C = 0.0f;
            this.D = 0;
            this.E = 0;
            this.F = 0;
            this.G = 0;
            this.H = 0;
            this.I = 0;
            this.J = 0;
            this.K = 0;
            this.L = -1;
            this.M = -1;
            this.N = -1;
            this.O = true;
            this.P = true;
            this.Q = false;
            this.R = false;
            this.S = -1;
            this.T = -1;
            this.U = -1;
            this.V = -1;
            this.W = -1;
            this.X = -1;
            this.Y = 0.5f;
            this.Z = new b();
        }
        
        public void a() {
            this.R = false;
            this.O = true;
            this.P = true;
            if (this.width == 0 || this.width == -1) {
                this.O = false;
            }
            if (this.height == 0 || this.height == -1) {
                this.P = false;
            }
            if (this.c != -1.0f || this.a != -1 || this.b != -1) {
                this.R = true;
                this.O = true;
                this.P = true;
                if (!(this.Z instanceof d)) {
                    this.Z = new d();
                }
                ((d)this.Z).m(this.N);
            }
        }
        
        @TargetApi(17)
        public void resolveLayoutDirection(int n) {
            final int n2 = 1;
            super.resolveLayoutDirection(n);
            this.U = -1;
            this.V = -1;
            this.S = -1;
            this.T = -1;
            this.W = -1;
            this.X = -1;
            this.W = this.q;
            this.X = this.s;
            this.Y = this.w;
            if (1 == this.getLayoutDirection()) {
                n = n2;
            }
            else {
                n = 0;
            }
            if (n != 0) {
                if (this.m != -1) {
                    this.U = this.m;
                }
                else if (this.n != -1) {
                    this.V = this.n;
                }
                if (this.o != -1) {
                    this.T = this.o;
                }
                if (this.p != -1) {
                    this.S = this.p;
                }
                if (this.u != -1) {
                    this.X = this.u;
                }
                if (this.v != -1) {
                    this.W = this.v;
                }
                this.Y = 1.0f - this.w;
            }
            else {
                if (this.m != -1) {
                    this.T = this.m;
                }
                if (this.n != -1) {
                    this.S = this.n;
                }
                if (this.o != -1) {
                    this.U = this.o;
                }
                if (this.p != -1) {
                    this.V = this.p;
                }
                if (this.u != -1) {
                    this.W = this.u;
                }
                if (this.v != -1) {
                    this.X = this.v;
                }
            }
            if (this.o == -1 && this.p == -1) {
                if (this.f != -1) {
                    this.U = this.f;
                }
                else if (this.g != -1) {
                    this.V = this.g;
                }
            }
            if (this.n == -1 && this.m == -1) {
                if (this.d != -1) {
                    this.S = this.d;
                }
                else if (this.e != -1) {
                    this.T = this.e;
                }
            }
        }
    }
}
