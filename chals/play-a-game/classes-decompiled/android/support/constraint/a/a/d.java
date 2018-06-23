// 
// Decompiled by Procyon v0.5.30
// 

package android.support.constraint.a.a;

import java.util.ArrayList;
import android.support.constraint.a.e;

public class d extends b
{
    protected float aa;
    protected int ab;
    protected int ac;
    private android.support.constraint.a.a.a ad;
    private int ae;
    private boolean af;
    private int ag;
    private f ah;
    private int ai;
    
    public d() {
        this.aa = -1.0f;
        this.ab = -1;
        this.ac = -1;
        this.ad = this.j;
        this.ae = 0;
        this.af = false;
        this.ag = 0;
        this.ah = new f();
        this.ai = 8;
        this.q.clear();
        this.q.add(this.ad);
    }
    
    public int D() {
        return this.ae;
    }
    
    public float E() {
        return this.aa;
    }
    
    public int F() {
        return this.ab;
    }
    
    public int G() {
        return this.ac;
    }
    
    @Override
    public android.support.constraint.a.a.a a(final android.support.constraint.a.a.a.c c) {
        switch (d$1.a[c.ordinal()]) {
            case 1:
            case 2: {
                if (this.ae == 1) {
                    return this.ad;
                }
                break;
            }
            case 3:
            case 4: {
                if (this.ae == 0) {
                    return this.ad;
                }
                break;
            }
        }
        return null;
    }
    
    @Override
    public void a(final e e, final int n) {
        final c c = (c)this.c();
        if (c != null) {
            android.support.constraint.a.a.a a = c.a(android.support.constraint.a.a.a.c.b);
            android.support.constraint.a.a.a a2 = c.a(android.support.constraint.a.a.a.c.d);
            if (this.ae == 0) {
                a = c.a(android.support.constraint.a.a.a.c.c);
                a2 = c.a(android.support.constraint.a.a.a.c.e);
            }
            if (this.ab != -1) {
                e.a(e.a(e, e.a(this.ad), e.a(a), this.ab, false));
                return;
            }
            if (this.ac != -1) {
                e.a(e.a(e, e.a(this.ad), e.a(a2), -this.ac, false));
                return;
            }
            if (this.aa != -1.0f) {
                e.a(e.a(e, e.a(this.ad), e.a(a), e.a(a2), this.aa, this.af));
            }
        }
    }
    
    @Override
    public void b(final e e, int b) {
        if (this.c() == null) {
            return;
        }
        b = e.b(this.ad);
        if (this.ae == 1) {
            this.b(b);
            this.c(0);
            this.e(this.c().l());
            this.d(0);
            return;
        }
        this.b(0);
        this.c(b);
        this.d(this.c().h());
        this.e(0);
    }
    
    public void e(final float aa) {
        if (aa > -1.0f) {
            this.aa = aa;
            this.ab = -1;
            this.ac = -1;
        }
    }
    
    public void m(final int ae) {
        if (this.ae == ae) {
            return;
        }
        this.ae = ae;
        this.q.clear();
        if (this.ae == 1) {
            this.ad = this.i;
        }
        else {
            this.ad = this.j;
        }
        this.q.add(this.ad);
    }
    
    public void n(final int ab) {
        if (ab > -1) {
            this.aa = -1.0f;
            this.ab = ab;
            this.ac = -1;
        }
    }
    
    public void o(final int ac) {
        if (ac > -1) {
            this.aa = -1.0f;
            this.ab = -1;
            this.ac = ac;
        }
    }
    
    @Override
    public ArrayList<android.support.constraint.a.a.a> y() {
        return this.q;
    }
}
