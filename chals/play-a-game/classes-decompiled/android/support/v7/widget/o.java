// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v7.widget;

import android.graphics.drawable.RippleDrawable;
import android.support.v7.a.a;
import android.util.AttributeSet;
import android.support.v7.b.a.b;
import android.os.Build$VERSION;
import android.graphics.PorterDuff$Mode;
import android.content.res.ColorStateList;
import android.support.v4.widget.f;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;

public class o
{
    private final ImageView a;
    private au b;
    private au c;
    private au d;
    
    public o(final ImageView a) {
        this.a = a;
    }
    
    private boolean a(final Drawable drawable) {
        if (this.d == null) {
            this.d = new au();
        }
        final au d = this.d;
        d.a();
        final ColorStateList a = f.a(this.a);
        if (a != null) {
            d.d = true;
            d.a = a;
        }
        final PorterDuff$Mode b = f.b(this.a);
        if (b != null) {
            d.c = true;
            d.b = b;
        }
        if (d.d || d.c) {
            l.a(drawable, d, this.a.getDrawableState());
            return true;
        }
        return false;
    }
    
    private boolean e() {
        final int sdk_INT = Build$VERSION.SDK_INT;
        if (sdk_INT > 21) {
            if (this.b == null) {
                return false;
            }
        }
        else if (sdk_INT != 21) {
            return false;
        }
        return true;
    }
    
    public void a(final int n) {
        if (n != 0) {
            final Drawable b = android.support.v7.b.a.b.b(this.a.getContext(), n);
            if (b != null) {
                ae.a(b);
            }
            this.a.setImageDrawable(b);
        }
        else {
            this.a.setImageDrawable((Drawable)null);
        }
        this.d();
    }
    
    void a(final ColorStateList a) {
        if (this.c == null) {
            this.c = new au();
        }
        this.c.a = a;
        this.c.d = true;
        this.d();
    }
    
    void a(final PorterDuff$Mode b) {
        if (this.c == null) {
            this.c = new au();
        }
        this.c.b = b;
        this.c.c = true;
        this.d();
    }
    
    public void a(final AttributeSet set, int g) {
        final aw a = aw.a(this.a.getContext(), set, android.support.v7.a.a.j.AppCompatImageView, g, 0);
        try {
            Drawable drawable2;
            final Drawable drawable = drawable2 = this.a.getDrawable();
            if (drawable == null) {
                g = a.g(android.support.v7.a.a.j.AppCompatImageView_srcCompat, -1);
                drawable2 = drawable;
                if (g != -1) {
                    final Drawable b = android.support.v7.b.a.b.b(this.a.getContext(), g);
                    if ((drawable2 = b) != null) {
                        this.a.setImageDrawable(b);
                        drawable2 = b;
                    }
                }
            }
            if (drawable2 != null) {
                ae.a(drawable2);
            }
            if (a.g(android.support.v7.a.a.j.AppCompatImageView_tint)) {
                f.a(this.a, a.e(android.support.v7.a.a.j.AppCompatImageView_tint));
            }
            if (a.g(android.support.v7.a.a.j.AppCompatImageView_tintMode)) {
                f.a(this.a, ae.a(a.a(android.support.v7.a.a.j.AppCompatImageView_tintMode, -1), null));
            }
        }
        finally {
            a.a();
        }
    }
    
    boolean a() {
        final Drawable background = this.a.getBackground();
        return Build$VERSION.SDK_INT < 21 || !(background instanceof RippleDrawable);
    }
    
    ColorStateList b() {
        if (this.c != null) {
            return this.c.a;
        }
        return null;
    }
    
    PorterDuff$Mode c() {
        if (this.c != null) {
            return this.c.b;
        }
        return null;
    }
    
    void d() {
        final Drawable drawable = this.a.getDrawable();
        if (drawable != null) {
            ae.a(drawable);
        }
        if (drawable != null && (!this.e() || !this.a(drawable))) {
            if (this.c != null) {
                l.a(drawable, this.c, this.a.getDrawableState());
                return;
            }
            if (this.b != null) {
                l.a(drawable, this.b, this.a.getDrawableState());
            }
        }
    }
}
