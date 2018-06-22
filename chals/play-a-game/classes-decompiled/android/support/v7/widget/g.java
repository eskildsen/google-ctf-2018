// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v7.widget;

import android.support.v7.a.a;
import android.util.AttributeSet;
import android.os.Build$VERSION;
import android.graphics.PorterDuff$Mode;
import android.content.res.ColorStateList;
import android.support.v4.h.p;
import android.graphics.drawable.Drawable;
import android.view.View;

class g
{
    private final View a;
    private final l b;
    private int c;
    private au d;
    private au e;
    private au f;
    
    g(final View a) {
        this.c = -1;
        this.a = a;
        this.b = l.a();
    }
    
    private boolean b(final Drawable drawable) {
        if (this.f == null) {
            this.f = new au();
        }
        final au f = this.f;
        f.a();
        final ColorStateList i = p.i(this.a);
        if (i != null) {
            f.d = true;
            f.a = i;
        }
        final PorterDuff$Mode j = p.j(this.a);
        if (j != null) {
            f.c = true;
            f.b = j;
        }
        if (f.d || f.c) {
            l.a(drawable, f, this.a.getDrawableState());
            return true;
        }
        return false;
    }
    
    private boolean d() {
        final int sdk_INT = Build$VERSION.SDK_INT;
        if (sdk_INT > 21) {
            if (this.d == null) {
                return false;
            }
        }
        else if (sdk_INT != 21) {
            return false;
        }
        return true;
    }
    
    ColorStateList a() {
        if (this.e != null) {
            return this.e.a;
        }
        return null;
    }
    
    void a(final int c) {
        this.c = c;
        ColorStateList b;
        if (this.b != null) {
            b = this.b.b(this.a.getContext(), c);
        }
        else {
            b = null;
        }
        this.b(b);
        this.c();
    }
    
    void a(final ColorStateList a) {
        if (this.e == null) {
            this.e = new au();
        }
        this.e.a = a;
        this.e.d = true;
        this.c();
    }
    
    void a(final PorterDuff$Mode b) {
        if (this.e == null) {
            this.e = new au();
        }
        this.e.b = b;
        this.e.c = true;
        this.c();
    }
    
    void a(final Drawable drawable) {
        this.c = -1;
        this.b((ColorStateList)null);
        this.c();
    }
    
    void a(AttributeSet a, final int n) {
        a = (AttributeSet)aw.a(this.a.getContext(), a, a.j.ViewBackgroundHelper, n, 0);
        try {
            if (((aw)a).g(a.j.ViewBackgroundHelper_android_background)) {
                this.c = ((aw)a).g(a.j.ViewBackgroundHelper_android_background, -1);
                final ColorStateList b = this.b.b(this.a.getContext(), this.c);
                if (b != null) {
                    this.b(b);
                }
            }
            if (((aw)a).g(a.j.ViewBackgroundHelper_backgroundTint)) {
                p.a(this.a, ((aw)a).e(a.j.ViewBackgroundHelper_backgroundTint));
            }
            if (((aw)a).g(a.j.ViewBackgroundHelper_backgroundTintMode)) {
                p.a(this.a, ae.a(((aw)a).a(a.j.ViewBackgroundHelper_backgroundTintMode, -1), null));
            }
        }
        finally {
            ((aw)a).a();
        }
    }
    
    PorterDuff$Mode b() {
        if (this.e != null) {
            return this.e.b;
        }
        return null;
    }
    
    void b(final ColorStateList a) {
        if (a != null) {
            if (this.d == null) {
                this.d = new au();
            }
            this.d.a = a;
            this.d.d = true;
        }
        else {
            this.d = null;
        }
        this.c();
    }
    
    void c() {
        final Drawable background = this.a.getBackground();
        if (background != null && (!this.d() || !this.b(background))) {
            if (this.e != null) {
                l.a(background, this.e, this.a.getDrawableState());
                return;
            }
            if (this.d != null) {
                l.a(background, this.d, this.a.getDrawableState());
            }
        }
    }
}
