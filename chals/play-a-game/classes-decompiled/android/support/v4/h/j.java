// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v4.h;

import android.view.View;
import android.view.ViewParent;

public class j
{
    private ViewParent a;
    private ViewParent b;
    private final View c;
    private boolean d;
    private int[] e;
    
    public j(final View c) {
        this.c = c;
    }
    
    private void a(final int n, final ViewParent viewParent) {
        switch (n) {
            default: {}
            case 0: {
                this.a = viewParent;
            }
            case 1: {
                this.b = viewParent;
            }
        }
    }
    
    private ViewParent d(final int n) {
        switch (n) {
            default: {
                return null;
            }
            case 0: {
                return this.a;
            }
            case 1: {
                return this.b;
            }
        }
    }
    
    public void a(final boolean d) {
        if (this.d) {
            p.k(this.c);
        }
        this.d = d;
    }
    
    public boolean a() {
        return this.d;
    }
    
    public boolean a(final float n, final float n2) {
        boolean a = false;
        if (this.a()) {
            final ViewParent d = this.d(0);
            a = a;
            if (d != null) {
                a = q.a(d, this.c, n, n2);
            }
        }
        return a;
    }
    
    public boolean a(final float n, final float n2, final boolean b) {
        boolean a = false;
        if (this.a()) {
            final ViewParent d = this.d(0);
            a = a;
            if (d != null) {
                a = q.a(d, this.c, n, n2, b);
            }
        }
        return a;
    }
    
    public boolean a(final int n) {
        return this.d(n) != null;
    }
    
    public boolean a(final int n, final int n2) {
        if (this.a(n2)) {
            return true;
        }
        if (this.a()) {
            ViewParent viewParent = this.c.getParent();
            View c = this.c;
            while (viewParent != null) {
                if (q.a(viewParent, c, this.c, n, n2)) {
                    this.a(n2, viewParent);
                    q.b(viewParent, c, this.c, n, n2);
                    return true;
                }
                if (viewParent instanceof View) {
                    c = (View)viewParent;
                }
                viewParent = viewParent.getParent();
            }
        }
        return false;
    }
    
    public boolean a(final int n, final int n2, final int n3, final int n4, final int[] array) {
        return this.a(n, n2, n3, n4, array, 0);
    }
    
    public boolean a(final int n, final int n2, final int n3, final int n4, final int[] array, final int n5) {
        if (this.a()) {
            final ViewParent d = this.d(n5);
            if (d == null) {
                return false;
            }
            if (n != 0 || n2 != 0 || n3 != 0 || n4 != 0) {
                int n6;
                int n7;
                if (array != null) {
                    this.c.getLocationInWindow(array);
                    n6 = array[0];
                    n7 = array[1];
                }
                else {
                    n7 = 0;
                    n6 = 0;
                }
                q.a(d, this.c, n, n2, n3, n4, n5);
                if (array != null) {
                    this.c.getLocationInWindow(array);
                    array[0] -= n6;
                    array[1] -= n7;
                }
                return true;
            }
            if (array != null) {
                array[1] = (array[0] = 0);
            }
        }
        return false;
    }
    
    public boolean a(final int n, final int n2, final int[] array, final int[] array2) {
        return this.a(n, n2, array, array2, 0);
    }
    
    public boolean a(final int n, final int n2, int[] e, final int[] array, final int n3) {
        if (this.a()) {
            final ViewParent d = this.d(n3);
            if (d != null) {
                if (n != 0 || n2 != 0) {
                    int n4;
                    int n5;
                    if (array != null) {
                        this.c.getLocationInWindow(array);
                        n4 = array[0];
                        n5 = array[1];
                    }
                    else {
                        n5 = 0;
                        n4 = 0;
                    }
                    if (e == null) {
                        if (this.e == null) {
                            this.e = new int[2];
                        }
                        e = this.e;
                    }
                    e[1] = (e[0] = 0);
                    q.a(d, this.c, n, n2, e, n3);
                    if (array != null) {
                        this.c.getLocationInWindow(array);
                        array[0] -= n4;
                        array[1] -= n5;
                    }
                    return e[0] != 0 || e[1] != 0;
                }
                if (array != null) {
                    array[1] = (array[0] = 0);
                    return false;
                }
            }
        }
        return false;
    }
    
    public boolean b() {
        return this.a(0);
    }
    
    public boolean b(final int n) {
        return this.a(n, 0);
    }
    
    public void c() {
        this.c(0);
    }
    
    public void c(final int n) {
        final ViewParent d = this.d(n);
        if (d != null) {
            q.a(d, this.c, n);
            this.a(n, null);
        }
    }
}
