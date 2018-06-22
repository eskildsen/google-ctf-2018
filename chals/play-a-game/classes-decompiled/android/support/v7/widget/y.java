// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v7.widget;

import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.graphics.drawable.Drawable;
import android.content.res.Resources$NotFoundException;
import android.support.v7.a.a;
import android.os.Build$VERSION;
import android.content.res.ColorStateList;
import android.content.Context;
import android.graphics.Typeface;
import android.widget.TextView;

class y
{
    final TextView a;
    private au b;
    private au c;
    private au d;
    private au e;
    private final ab f;
    private int g;
    private Typeface h;
    
    y(final TextView a) {
        this.g = 0;
        this.a = a;
        this.f = new ab(this.a);
    }
    
    protected static au a(final Context context, final l l, final int n) {
        final ColorStateList b = l.b(context, n);
        if (b != null) {
            final au au = new au();
            au.d = true;
            au.a = b;
            return au;
        }
        return null;
    }
    
    static y a(final TextView textView) {
        if (Build$VERSION.SDK_INT >= 17) {
            return new z(textView);
        }
        return new y(textView);
    }
    
    private void a(final Context context, final aw aw) {
        this.g = aw.a(android.support.v7.a.a.j.TextAppearance_android_textStyle, this.g);
        if (!aw.g(android.support.v7.a.a.j.TextAppearance_android_fontFamily) && !aw.g(android.support.v7.a.a.j.TextAppearance_fontFamily)) {
            return;
        }
        this.h = null;
        Label_0102: {
            if (!aw.g(android.support.v7.a.a.j.TextAppearance_android_fontFamily)) {
                break Label_0102;
            }
            int n = android.support.v7.a.a.j.TextAppearance_android_fontFamily;
        Label_0078_Outer:
            while (true) {
                while (true) {
                    if (context.isRestricted()) {
                        break Label_0078;
                    }
                    try {
                        this.h = aw.a(n, this.g, this.a);
                        if (this.h == null) {
                            this.h = Typeface.create(aw.d(n), this.g);
                        }
                        return;
                        n = android.support.v7.a.a.j.TextAppearance_fontFamily;
                        continue Label_0078_Outer;
                    }
                    catch (UnsupportedOperationException ex) {
                        continue;
                    }
                    catch (Resources$NotFoundException ex2) {
                        continue;
                    }
                    break;
                }
                break;
            }
        }
    }
    
    private void b(final int n, final float n2) {
        this.f.a(n, n2);
    }
    
    void a() {
        if (this.b != null || this.c != null || this.d != null || this.e != null) {
            final Drawable[] compoundDrawables = this.a.getCompoundDrawables();
            this.a(compoundDrawables[0], this.b);
            this.a(compoundDrawables[1], this.c);
            this.a(compoundDrawables[2], this.d);
            this.a(compoundDrawables[3], this.e);
        }
    }
    
    void a(final int n) {
        this.f.a(n);
    }
    
    void a(final int n, final float n2) {
        if (Build$VERSION.SDK_INT < 26 && !this.c()) {
            this.b(n, n2);
        }
    }
    
    void a(final int n, final int n2, final int n3, final int n4) {
        this.f.a(n, n2, n3, n4);
    }
    
    void a(final Context context, final int n) {
        final aw a = aw.a(context, n, android.support.v7.a.a.j.TextAppearance);
        if (a.g(android.support.v7.a.a.j.TextAppearance_textAllCaps)) {
            this.a(a.a(android.support.v7.a.a.j.TextAppearance_textAllCaps, false));
        }
        if (Build$VERSION.SDK_INT < 23 && a.g(android.support.v7.a.a.j.TextAppearance_android_textColor)) {
            final ColorStateList e = a.e(android.support.v7.a.a.j.TextAppearance_android_textColor);
            if (e != null) {
                this.a.setTextColor(e);
            }
        }
        this.a(context, a);
        a.a();
        if (this.h != null) {
            this.a.setTypeface(this.h, this.g);
        }
    }
    
    final void a(final Drawable drawable, final au au) {
        if (drawable != null && au != null) {
            l.a(drawable, au, this.a.getDrawableState());
        }
    }
    
    void a(final AttributeSet set, final int n) {
        ColorStateList list = null;
        ColorStateList e = null;
        final Context context = this.a.getContext();
        final l a = l.a();
        final aw a2 = aw.a(context, set, android.support.v7.a.a.j.AppCompatTextHelper, n, 0);
        final int g = a2.g(android.support.v7.a.a.j.AppCompatTextHelper_android_textAppearance, -1);
        if (a2.g(android.support.v7.a.a.j.AppCompatTextHelper_android_drawableLeft)) {
            this.b = a(context, a, a2.g(android.support.v7.a.a.j.AppCompatTextHelper_android_drawableLeft, 0));
        }
        if (a2.g(android.support.v7.a.a.j.AppCompatTextHelper_android_drawableTop)) {
            this.c = a(context, a, a2.g(android.support.v7.a.a.j.AppCompatTextHelper_android_drawableTop, 0));
        }
        if (a2.g(android.support.v7.a.a.j.AppCompatTextHelper_android_drawableRight)) {
            this.d = a(context, a, a2.g(android.support.v7.a.a.j.AppCompatTextHelper_android_drawableRight, 0));
        }
        if (a2.g(android.support.v7.a.a.j.AppCompatTextHelper_android_drawableBottom)) {
            this.e = a(context, a, a2.g(android.support.v7.a.a.j.AppCompatTextHelper_android_drawableBottom, 0));
        }
        a2.a();
        final boolean b = this.a.getTransformationMethod() instanceof PasswordTransformationMethod;
        boolean a4;
        boolean b2;
        ColorStateList e4;
        ColorStateList e5;
        if (g != -1) {
            final aw a3 = aw.a(context, g, android.support.v7.a.a.j.TextAppearance);
            if (!b && a3.g(android.support.v7.a.a.j.TextAppearance_textAllCaps)) {
                a4 = a3.a(android.support.v7.a.a.j.TextAppearance_textAllCaps, false);
                b2 = true;
            }
            else {
                b2 = false;
                a4 = false;
            }
            this.a(context, a3);
            ColorStateList list2;
            if (Build$VERSION.SDK_INT < 23) {
                ColorStateList e2;
                if (a3.g(android.support.v7.a.a.j.TextAppearance_android_textColor)) {
                    e2 = a3.e(android.support.v7.a.a.j.TextAppearance_android_textColor);
                }
                else {
                    e2 = null;
                }
                ColorStateList e3;
                if (a3.g(android.support.v7.a.a.j.TextAppearance_android_textColorHint)) {
                    e3 = a3.e(android.support.v7.a.a.j.TextAppearance_android_textColorHint);
                }
                else {
                    e3 = null;
                }
                e4 = e2;
                list2 = e3;
                if (a3.g(android.support.v7.a.a.j.TextAppearance_android_textColorLink)) {
                    e = a3.e(android.support.v7.a.a.j.TextAppearance_android_textColorLink);
                    list2 = e3;
                    e4 = e2;
                }
            }
            else {
                list2 = null;
                e4 = null;
            }
            a3.a();
            e5 = list2;
            list = e;
        }
        else {
            e5 = null;
            e4 = null;
            b2 = false;
            a4 = false;
        }
        final aw a5 = aw.a(context, set, android.support.v7.a.a.j.TextAppearance, n, 0);
        int n2 = b2 ? 1 : 0;
        boolean a6 = a4;
        if (!b) {
            n2 = (b2 ? 1 : 0);
            a6 = a4;
            if (a5.g(android.support.v7.a.a.j.TextAppearance_textAllCaps)) {
                a6 = a5.a(android.support.v7.a.a.j.TextAppearance_textAllCaps, false);
                n2 = 1;
            }
        }
        ColorStateList textColor = e4;
        ColorStateList e6 = list;
        ColorStateList hintTextColor = e5;
        if (Build$VERSION.SDK_INT < 23) {
            if (a5.g(android.support.v7.a.a.j.TextAppearance_android_textColor)) {
                e4 = a5.e(android.support.v7.a.a.j.TextAppearance_android_textColor);
            }
            if (a5.g(android.support.v7.a.a.j.TextAppearance_android_textColorHint)) {
                e5 = a5.e(android.support.v7.a.a.j.TextAppearance_android_textColorHint);
            }
            textColor = e4;
            e6 = list;
            hintTextColor = e5;
            if (a5.g(android.support.v7.a.a.j.TextAppearance_android_textColorLink)) {
                e6 = a5.e(android.support.v7.a.a.j.TextAppearance_android_textColorLink);
                hintTextColor = e5;
                textColor = e4;
            }
        }
        this.a(context, a5);
        a5.a();
        if (textColor != null) {
            this.a.setTextColor(textColor);
        }
        if (hintTextColor != null) {
            this.a.setHintTextColor(hintTextColor);
        }
        if (e6 != null) {
            this.a.setLinkTextColor(e6);
        }
        if (!b && n2 != 0) {
            this.a(a6);
        }
        if (this.h != null) {
            this.a.setTypeface(this.h, this.g);
        }
        this.f.a(set, n);
        if (Build$VERSION.SDK_INT >= 26 && this.f.a() != 0) {
            final int[] e7 = this.f.e();
            if (e7.length > 0) {
                if (this.a.getAutoSizeStepGranularity() == -1.0f) {
                    this.a.setAutoSizeTextTypeUniformWithPresetSizes(e7, 0);
                    return;
                }
                this.a.setAutoSizeTextTypeUniformWithConfiguration(this.f.c(), this.f.d(), this.f.b(), 0);
            }
        }
    }
    
    void a(final boolean allCaps) {
        this.a.setAllCaps(allCaps);
    }
    
    void a(final boolean b, final int n, final int n2, final int n3, final int n4) {
        if (Build$VERSION.SDK_INT < 26) {
            this.b();
        }
    }
    
    void a(final int[] array, final int n) {
        this.f.a(array, n);
    }
    
    void b() {
        this.f.f();
    }
    
    boolean c() {
        return this.f.g();
    }
    
    int d() {
        return this.f.a();
    }
    
    int e() {
        return this.f.b();
    }
    
    int f() {
        return this.f.c();
    }
    
    int g() {
        return this.f.d();
    }
    
    int[] h() {
        return this.f.e();
    }
}
