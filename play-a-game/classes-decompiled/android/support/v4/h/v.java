// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v4.h;

import android.view.WindowInsets;
import android.os.Build$VERSION;

public class v
{
    private final Object a;
    
    private v(final Object a) {
        this.a = a;
    }
    
    static v a(final Object o) {
        if (o == null) {
            return null;
        }
        return new v(o);
    }
    
    static Object a(final v v) {
        if (v == null) {
            return null;
        }
        return v.a;
    }
    
    public int a() {
        if (Build$VERSION.SDK_INT >= 20) {
            return ((WindowInsets)this.a).getSystemWindowInsetLeft();
        }
        return 0;
    }
    
    public v a(final int n, final int n2, final int n3, final int n4) {
        if (Build$VERSION.SDK_INT >= 20) {
            return new v(((WindowInsets)this.a).replaceSystemWindowInsets(n, n2, n3, n4));
        }
        return null;
    }
    
    public int b() {
        if (Build$VERSION.SDK_INT >= 20) {
            return ((WindowInsets)this.a).getSystemWindowInsetTop();
        }
        return 0;
    }
    
    public int c() {
        if (Build$VERSION.SDK_INT >= 20) {
            return ((WindowInsets)this.a).getSystemWindowInsetRight();
        }
        return 0;
    }
    
    public int d() {
        if (Build$VERSION.SDK_INT >= 20) {
            return ((WindowInsets)this.a).getSystemWindowInsetBottom();
        }
        return 0;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this != o) {
            if (o == null || this.getClass() != o.getClass()) {
                return false;
            }
            final v v = (v)o;
            if (this.a != null) {
                return this.a.equals(v.a);
            }
            if (v.a != null) {
                return false;
            }
        }
        return true;
    }
    
    @Override
    public int hashCode() {
        if (this.a == null) {
            return 0;
        }
        return this.a.hashCode();
    }
}
