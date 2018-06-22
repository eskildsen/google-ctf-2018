// 
// Decompiled by Procyon v0.5.30
// 

package android.support.constraint.a.a;

import android.support.constraint.a.g;
import android.support.constraint.a.e;
import java.util.ArrayList;

public class b
{
    public static float D;
    int A;
    protected int B;
    protected int C;
    float E;
    float F;
    a G;
    a H;
    int I;
    int J;
    int K;
    int L;
    boolean M;
    boolean N;
    boolean O;
    boolean P;
    boolean Q;
    boolean R;
    int S;
    int T;
    boolean U;
    boolean V;
    float W;
    float X;
    b Y;
    b Z;
    public int a;
    private int aa;
    private int ab;
    private int ac;
    private int ad;
    private int ae;
    private int af;
    private int ag;
    private int ah;
    private int ai;
    private int aj;
    private Object ak;
    private int al;
    private int am;
    private String an;
    private String ao;
    public int b;
    int c;
    int d;
    int e;
    int f;
    int g;
    int h;
    android.support.constraint.a.a.a i;
    android.support.constraint.a.a.a j;
    android.support.constraint.a.a.a k;
    android.support.constraint.a.a.a l;
    android.support.constraint.a.a.a m;
    android.support.constraint.a.a.a n;
    android.support.constraint.a.a.a o;
    android.support.constraint.a.a.a p;
    protected ArrayList<android.support.constraint.a.a.a> q;
    b r;
    int s;
    int t;
    protected float u;
    protected int v;
    protected int w;
    protected int x;
    protected int y;
    protected int z;
    
    static {
        b.D = 0.5f;
    }
    
    public b() {
        this.a = -1;
        this.b = -1;
        this.c = 0;
        this.d = 0;
        this.e = 0;
        this.f = 0;
        this.g = 0;
        this.h = 0;
        this.i = new android.support.constraint.a.a.a(this, android.support.constraint.a.a.a.c.b);
        this.j = new android.support.constraint.a.a.a(this, android.support.constraint.a.a.a.c.c);
        this.k = new android.support.constraint.a.a.a(this, android.support.constraint.a.a.a.c.d);
        this.l = new android.support.constraint.a.a.a(this, android.support.constraint.a.a.a.c.e);
        this.m = new android.support.constraint.a.a.a(this, android.support.constraint.a.a.a.c.f);
        this.n = new android.support.constraint.a.a.a(this, android.support.constraint.a.a.a.c.h);
        this.o = new android.support.constraint.a.a.a(this, android.support.constraint.a.a.a.c.i);
        this.p = new android.support.constraint.a.a.a(this, android.support.constraint.a.a.a.c.g);
        this.q = new ArrayList<android.support.constraint.a.a.a>();
        this.r = null;
        this.s = 0;
        this.t = 0;
        this.u = 0.0f;
        this.v = -1;
        this.aa = 0;
        this.ab = 0;
        this.ac = 0;
        this.ad = 0;
        this.w = 0;
        this.x = 0;
        this.ae = 0;
        this.af = 0;
        this.ag = 0;
        this.ah = 0;
        this.y = 0;
        this.z = 0;
        this.A = 0;
        this.E = android.support.constraint.a.a.b.D;
        this.F = android.support.constraint.a.a.b.D;
        this.G = android.support.constraint.a.a.b.a.a;
        this.H = android.support.constraint.a.a.b.a.a;
        this.al = 0;
        this.am = 0;
        this.an = null;
        this.ao = null;
        this.S = 0;
        this.T = 0;
        this.W = 0.0f;
        this.X = 0.0f;
        this.Y = null;
        this.Z = null;
        this.D();
    }
    
    private void D() {
        this.q.add(this.i);
        this.q.add(this.j);
        this.q.add(this.k);
        this.q.add(this.l);
        this.q.add(this.n);
        this.q.add(this.o);
        this.q.add(this.m);
    }
    
    private void a(final e e, final boolean b, boolean b2, final android.support.constraint.a.a.a a, final android.support.constraint.a.a.a a2, int n, final int n2, int n3, final int n4, final float n5, final boolean b3, final boolean b4, final int n6, final int n7, int n8) {
        final g a3 = e.a(a);
        final g a4 = e.a(a2);
        final g a5 = e.a(a.f());
        final g a6 = e.a(a2.f());
        final int d = a.d();
        final int d2 = a2.d();
        if (this.am == 8) {
            n3 = 0;
            b2 = true;
        }
        if (a5 == null && a6 == null) {
            e.a(e.b().b(a3, n));
            if (!b3) {
                if (b) {
                    e.a(e.a(e, a4, a3, n4, true));
                }
                else {
                    if (b2) {
                        e.a(e.a(e, a4, a3, n3, false));
                        return;
                    }
                    e.a(e.b().b(a4, n2));
                }
            }
        }
        else if (a5 != null && a6 == null) {
            e.a(e.b().a(a3, a5, d));
            if (b) {
                e.a(e.a(e, a4, a3, n4, true));
                return;
            }
            if (!b3) {
                if (b2) {
                    e.a(e.b().a(a4, a3, n3));
                    return;
                }
                e.a(e.b().b(a4, n2));
            }
        }
        else if (a5 == null && a6 != null) {
            e.a(e.b().a(a4, a6, d2 * -1));
            if (b) {
                e.a(e.a(e, a4, a3, n4, true));
                return;
            }
            if (!b3) {
                if (b2) {
                    e.a(e.b().a(a4, a3, n3));
                    return;
                }
                e.a(e.b().b(a3, n));
            }
        }
        else if (b2) {
            if (b) {
                e.a(e.a(e, a4, a3, n4, true));
            }
            else {
                e.a(e.b().a(a4, a3, n3));
            }
            if (a.e() != a2.e()) {
                if (a.e() == a.b.b) {
                    e.a(e.b().a(a3, a5, d));
                    final g c = e.c();
                    final android.support.constraint.a.b b5 = e.b();
                    b5.b(a4, a6, c, d2 * -1);
                    e.a(b5);
                    return;
                }
                final g c2 = e.c();
                final android.support.constraint.a.b b6 = e.b();
                b6.a(a3, a5, c2, d);
                e.a(b6);
                e.a(e.b().a(a4, a6, d2 * -1));
            }
            else {
                if (a5 == a6) {
                    e.a(e.a(e, a3, a5, 0, 0.5f, a6, a4, 0, true));
                    return;
                }
                if (!b4) {
                    e.a(e.b(e, a3, a5, d, a.g() != a.a.b));
                    e.a(e.c(e, a4, a6, d2 * -1, a2.g() != a.a.b));
                    e.a(e.a(e, a3, a5, d, n5, a6, a4, d2, false));
                }
            }
        }
        else {
            if (b3) {
                e.a(a3, a5, d, 3);
                e.b(a4, a6, d2 * -1, 3);
                e.a(e.a(e, a3, a5, d, n5, a6, a4, d2, true));
                return;
            }
            if (!b4) {
                if (n6 == 1) {
                    if (n7 > (n = n3)) {
                        n = n7;
                    }
                    while (true) {
                        Label_0788: {
                            if (n8 <= 0) {
                                break Label_0788;
                            }
                            if (n8 >= n) {
                                e.b(a4, a3, n8, 3);
                                break Label_0788;
                            }
                            e.c(a4, a3, n8, 3);
                            e.a(a3, a5, d, 2);
                            e.b(a4, a6, -d2, 2);
                            e.a(a3, a5, d, n5, a6, a4, d2, 4);
                            return;
                        }
                        n8 = n;
                        continue;
                    }
                }
                if (n7 == 0 && n8 == 0) {
                    e.a(e.b().a(a3, a5, d));
                    e.a(e.b().a(a4, a6, d2 * -1));
                    return;
                }
                if (n8 > 0) {
                    e.b(a4, a3, n8, 3);
                }
                e.a(a3, a5, d, 2);
                e.b(a4, a6, -d2, 2);
                e.a(a3, a5, d, n5, a6, a4, d2, 4);
            }
        }
    }
    
    public void A() {
        final b c = this.c();
        if (c == null || !(c instanceof c) || !((c)this.c()).G()) {
            for (int size = this.q.size(), i = 0; i < size; ++i) {
                this.q.get(i).i();
            }
        }
    }
    
    public a B() {
        return this.G;
    }
    
    public a C() {
        return this.H;
    }
    
    public android.support.constraint.a.a.a a(final android.support.constraint.a.a.a.c c) {
        switch (b$1.a[c.ordinal()]) {
            default: {
                return null;
            }
            case 1: {
                return this.i;
            }
            case 2: {
                return this.j;
            }
            case 3: {
                return this.k;
            }
            case 4: {
                return this.l;
            }
            case 5: {
                return this.m;
            }
            case 6: {
                return this.n;
            }
            case 7: {
                return this.o;
            }
            case 8: {
                return this.p;
            }
        }
    }
    
    public void a() {
        this.i.i();
        this.j.i();
        this.k.i();
        this.l.i();
        this.m.i();
        this.n.i();
        this.o.i();
        this.p.i();
        this.r = null;
        this.s = 0;
        this.t = 0;
        this.u = 0.0f;
        this.v = -1;
        this.w = 0;
        this.x = 0;
        this.ae = 0;
        this.af = 0;
        this.ag = 0;
        this.ah = 0;
        this.y = 0;
        this.z = 0;
        this.A = 0;
        this.B = 0;
        this.C = 0;
        this.ai = 0;
        this.aj = 0;
        this.E = android.support.constraint.a.a.b.D;
        this.F = android.support.constraint.a.a.b.D;
        this.G = android.support.constraint.a.a.b.a.a;
        this.H = android.support.constraint.a.a.b.a.a;
        this.ak = null;
        this.al = 0;
        this.am = 0;
        this.an = null;
        this.ao = null;
        this.Q = false;
        this.R = false;
        this.S = 0;
        this.T = 0;
        this.U = false;
        this.V = false;
        this.W = 0.0f;
        this.X = 0.0f;
        this.a = -1;
        this.b = -1;
    }
    
    public void a(final float e) {
        this.E = e;
    }
    
    public void a(final int am) {
        this.am = am;
    }
    
    public void a(final int w, final int x) {
        this.w = w;
        this.x = x;
    }
    
    public void a(final int c, final int e, final int f) {
        this.c = c;
        this.e = e;
        this.f = f;
    }
    
    public void a(int s, int t, int n, final int n2) {
        final int n3 = n - s;
        n = n2 - t;
        this.w = s;
        this.x = t;
        if (this.am == 8) {
            this.s = 0;
            this.t = 0;
        }
        else {
            s = n3;
            if (this.G == android.support.constraint.a.a.b.a.a && (s = n3) < this.s) {
                s = this.s;
            }
            t = n;
            if (this.H == android.support.constraint.a.a.b.a.a && (t = n) < this.t) {
                t = this.t;
            }
            this.s = s;
            this.t = t;
            if (this.t < this.C) {
                this.t = this.C;
            }
            if (this.s < this.B) {
                this.s = this.B;
            }
        }
    }
    
    public void a(final android.support.constraint.a.a.a.c c, final b b, final android.support.constraint.a.a.a.c c2, final int n, final int n2) {
        this.a(c).a(b.a(c2), n, n2, android.support.constraint.a.a.a.b.b, 0, true);
    }
    
    public void a(final a g) {
        this.G = g;
        if (this.G == android.support.constraint.a.a.b.a.b) {
            this.d(this.ai);
        }
    }
    
    public void a(final b r) {
        this.r = r;
    }
    
    public void a(final android.support.constraint.a.c c) {
        this.i.a(c);
        this.j.a(c);
        this.k.a(c);
        this.l.a(c);
        this.m.a(c);
        this.p.a(c);
        this.n.a(c);
        this.o.a(c);
    }
    
    public void a(final e e, final int n) {
        g a;
        if (n == Integer.MAX_VALUE || this.i.g == n) {
            a = e.a(this.i);
        }
        else {
            a = null;
        }
        g a2;
        if (n == Integer.MAX_VALUE || this.k.g == n) {
            a2 = e.a(this.k);
        }
        else {
            a2 = null;
        }
        g a3;
        if (n == Integer.MAX_VALUE || this.j.g == n) {
            a3 = e.a(this.j);
        }
        else {
            a3 = null;
        }
        g a4;
        if (n == Integer.MAX_VALUE || this.l.g == n) {
            a4 = e.a(this.l);
        }
        else {
            a4 = null;
        }
        g a5;
        if (n == Integer.MAX_VALUE || this.m.g == n) {
            a5 = e.a(this.m);
        }
        else {
            a5 = null;
        }
        boolean b7 = false;
        boolean b8 = false;
        Label_0597: {
            if (this.r != null) {
                boolean b;
                if ((this.i.c != null && this.i.c.c == this.i) || (this.k.c != null && this.k.c.c == this.k)) {
                    ((c)this.r).a(this, 0);
                    b = true;
                }
                else {
                    b = false;
                }
                boolean b2;
                if ((this.j.c != null && this.j.c.c == this.j) || (this.l.c != null && this.l.c.c == this.l)) {
                    ((c)this.r).a(this, 1);
                    b2 = true;
                }
                else {
                    b2 = false;
                }
                if (this.r.B() == android.support.constraint.a.a.b.a.b && !b) {
                    if (this.i.c == null || this.i.c.a != this.r) {
                        final g a6 = e.a(this.r.i);
                        final android.support.constraint.a.b b3 = e.b();
                        b3.a(a, a6, e.c(), 0);
                        e.a(b3);
                    }
                    else if (this.i.c != null && this.i.c.a == this.r) {
                        this.i.a(android.support.constraint.a.a.a.a.b);
                    }
                    if (this.k.c == null || this.k.c.a != this.r) {
                        final g a7 = e.a(this.r.k);
                        final android.support.constraint.a.b b4 = e.b();
                        b4.a(a7, a2, e.c(), 0);
                        e.a(b4);
                    }
                    else if (this.k.c != null && this.k.c.a == this.r) {
                        this.k.a(android.support.constraint.a.a.a.a.b);
                    }
                }
                if (this.r.C() == android.support.constraint.a.a.b.a.b && !b2) {
                    if (this.j.c == null || this.j.c.a != this.r) {
                        final g a8 = e.a(this.r.j);
                        final android.support.constraint.a.b b5 = e.b();
                        b5.a(a3, a8, e.c(), 0);
                        e.a(b5);
                    }
                    else if (this.j.c != null && this.j.c.a == this.r) {
                        this.j.a(android.support.constraint.a.a.a.a.b);
                    }
                    if (this.l.c == null || this.l.c.a != this.r) {
                        final g a9 = e.a(this.r.l);
                        final android.support.constraint.a.b b6 = e.b();
                        b6.a(a9, a4, e.c(), 0);
                        e.a(b6);
                        b7 = b2;
                        b8 = b;
                        break Label_0597;
                    }
                    if (this.l.c != null && this.l.c.a == this.r) {
                        this.l.a(android.support.constraint.a.a.a.a.b);
                    }
                }
                b8 = b;
                b7 = b2;
            }
            else {
                b7 = false;
                b8 = false;
            }
        }
        int n2;
        if ((n2 = this.s) < this.B) {
            n2 = this.B;
        }
        int n3;
        if ((n3 = this.t) < this.C) {
            n3 = this.C;
        }
        boolean b9 = this.G != android.support.constraint.a.a.b.a.c;
        boolean b10 = this.H != android.support.constraint.a.a.b.a.c;
        if (!b9 && this.i != null && this.k != null && (this.i.c == null || this.k.c == null)) {
            b9 = true;
        }
        if (!b10 && this.j != null && this.l != null && (this.j.c == null || this.l.c == null) && (this.A == 0 || (this.m != null && (this.j.c == null || this.m.c == null)))) {
            b10 = true;
        }
        final boolean b11 = false;
        final int v = this.v;
        float u = this.u;
        int n4 = v;
        boolean b12 = b11;
        while (true) {
            Label_2365: {
                if (this.u <= 0.0f) {
                    break Label_2365;
                }
                n4 = v;
                b12 = b11;
                if (this.am == 8) {
                    break Label_2365;
                }
                int n5;
                int n6;
                boolean b15;
                int n8;
                int n9;
                boolean b16;
                if (this.G == android.support.constraint.a.a.b.a.c && this.H == android.support.constraint.a.a.b.a.c) {
                    final boolean b13 = true;
                    if (b9 && !b10) {
                        n5 = 0;
                        n6 = 1;
                        final int n7 = n2;
                        final boolean b14 = b9;
                        b15 = b10;
                        n8 = n3;
                        n9 = n7;
                        b16 = b14;
                    }
                    else {
                        n4 = v;
                        b12 = b13;
                        if (b9) {
                            break Label_2365;
                        }
                        n4 = v;
                        b12 = b13;
                        if (!b10) {
                            break Label_2365;
                        }
                        n4 = 1;
                        b12 = b13;
                        if (this.v != -1) {
                            break Label_2365;
                        }
                        u = 1.0f / u;
                        final boolean b17 = true;
                        n6 = 1;
                        final boolean b18 = b10;
                        final int n10 = n3;
                        b16 = b9;
                        n9 = n2;
                        n8 = n10;
                        n5 = (b17 ? 1 : 0);
                        b15 = b18;
                    }
                }
                else if (this.G == android.support.constraint.a.a.b.a.c) {
                    final int n11 = (int)(this.t * u);
                    n5 = 0;
                    n6 = 0;
                    b15 = b10;
                    n8 = n3;
                    b16 = true;
                    n9 = n11;
                }
                else {
                    n4 = v;
                    b12 = b11;
                    if (this.H != android.support.constraint.a.a.b.a.c) {
                        break Label_2365;
                    }
                    if (this.v == -1) {
                        u = 1.0f / u;
                    }
                    final int n12 = (int)(this.s * u);
                    n5 = 1;
                    n6 = 0;
                    final boolean b19 = true;
                    b16 = b9;
                    n9 = n2;
                    n8 = n12;
                    b15 = b19;
                }
                final boolean b20 = n6 != 0 && (n5 == 0 || n5 == -1);
                final boolean b21 = this.G == android.support.constraint.a.a.b.a.b && this instanceof c;
                if (this.a != 2 && (n == Integer.MAX_VALUE || (this.i.g == n && this.k.g == n))) {
                    if (b20 && this.i.c != null && this.k.c != null) {
                        final g a10 = e.a(this.i);
                        final g a11 = e.a(this.k);
                        final g a12 = e.a(this.i.f());
                        final g a13 = e.a(this.k.f());
                        e.a(a10, a12, this.i.d(), 3);
                        e.b(a11, a13, this.k.d() * -1, 3);
                        if (!b8) {
                            e.a(a10, a12, this.i.d(), this.E, a13, a11, this.k.d(), 4);
                        }
                    }
                    else {
                        this.a(e, b21, b16, this.i, this.k, this.w, this.w + n9, n9, this.B, this.E, b20, b8, this.c, this.e, this.f);
                    }
                }
                if (this.b != 2) {
                    final boolean b22 = this.H == android.support.constraint.a.a.b.a.b && this instanceof c;
                    final boolean b23 = n6 != 0 && (n5 == 1 || n5 == -1);
                    if (this.A > 0) {
                        final android.support.constraint.a.a.a l = this.l;
                        if (n == Integer.MAX_VALUE || (this.l.g == n && this.m.g == n)) {
                            e.c(a5, a3, this.w(), 5);
                        }
                        int a14;
                        android.support.constraint.a.a.a m;
                        if (this.m.c != null) {
                            a14 = this.A;
                            m = this.m;
                        }
                        else {
                            a14 = n8;
                            m = l;
                        }
                        if (n == Integer.MAX_VALUE || (this.j.g == n && m.g == n)) {
                            if (b23 && this.j.c != null && this.l.c != null) {
                                final g a15 = e.a(this.j);
                                final g a16 = e.a(this.l);
                                final g a17 = e.a(this.j.f());
                                final g a18 = e.a(this.l.f());
                                e.a(a15, a17, this.j.d(), 3);
                                e.b(a16, a18, this.l.d() * -1, 3);
                                if (!b7) {
                                    e.a(a15, a17, this.j.d(), this.F, a18, a16, this.l.d(), 4);
                                }
                            }
                            else {
                                this.a(e, b22, b15, this.j, m, this.x, this.x + a14, a14, this.C, this.F, b23, b7, this.d, this.g, this.h);
                                e.c(a4, a3, n8, 5);
                            }
                        }
                    }
                    else if (n == Integer.MAX_VALUE || (this.j.g == n && this.l.g == n)) {
                        if (b23 && this.j.c != null && this.l.c != null) {
                            final g a19 = e.a(this.j);
                            final g a20 = e.a(this.l);
                            final g a21 = e.a(this.j.f());
                            final g a22 = e.a(this.l.f());
                            e.a(a19, a21, this.j.d(), 3);
                            e.b(a20, a22, this.l.d() * -1, 3);
                            if (!b7) {
                                e.a(a19, a21, this.j.d(), this.F, a22, a20, this.l.d(), 4);
                            }
                        }
                        else {
                            this.a(e, b22, b15, this.j, this.l, this.x, this.x + n8, n8, this.C, this.F, b23, b7, this.d, this.g, this.h);
                        }
                    }
                    if (n6 != 0) {
                        final android.support.constraint.a.b b24 = e.b();
                        if (n == Integer.MAX_VALUE || (this.i.g == n && this.k.g == n)) {
                            if (n5 == 0) {
                                e.a(b24.a(a2, a, a4, a3, u));
                                return;
                            }
                            if (n5 == 1) {
                                e.a(b24.a(a4, a3, a2, a, u));
                                return;
                            }
                            if (this.e > 0) {
                                e.a(a2, a, this.e, 3);
                            }
                            if (this.g > 0) {
                                e.a(a4, a3, this.g, 3);
                            }
                            b24.a(a2, a, a4, a3, u);
                            final g d = e.d();
                            final g d2 = e.d();
                            d.c = 4;
                            d2.c = 4;
                            b24.a(d, d2);
                            e.a(b24);
                            return;
                        }
                    }
                }
                return;
            }
            final boolean b25 = b12;
            final boolean b26 = b10;
            final int n13 = n3;
            boolean b16 = b9;
            int n9 = n2;
            int n8 = n13;
            int n5 = n4;
            int n6 = b25 ? 1 : 0;
            boolean b15 = b26;
            continue;
        }
    }
    
    public void a(final Object ak) {
        this.ak = ak;
    }
    
    public void a(String s) {
        final int n = 0;
        final boolean b = false;
        if (s != null && s.length() != 0) {
            final int n2 = -1;
            final int length = s.length();
            final int index = s.indexOf(44);
            int n3 = n;
            int v = n2;
        Label_0192:
            while (true) {
            Label_0273:
                while (true) {
                    Label_0100: {
                        if (index <= 0) {
                            break Label_0100;
                        }
                        n3 = n;
                        v = n2;
                        if (index >= length - 1) {
                            break Label_0100;
                        }
                        final String substring = s.substring(0, index);
                        Label_0094: {
                            if (substring.equalsIgnoreCase("W")) {
                                v = (b ? 1 : 0);
                                break Label_0094;
                            }
                            Label_0210: {
                                break Label_0210;
                                while (true) {
                                    try {
                                        final String substring2;
                                        final float float1 = Float.parseFloat(substring2);
                                        final float float2 = Float.parseFloat(s);
                                        if (float1 <= 0.0f || float2 <= 0.0f) {
                                            break Label_0273;
                                        }
                                        float u;
                                        if (v == 1) {
                                            u = Math.abs(float2 / float1);
                                        }
                                        else {
                                            u = Math.abs(float1 / float2);
                                        }
                                        if (u > 0.0f) {
                                            this.u = u;
                                            this.v = v;
                                            return;
                                        }
                                        return;
                                        while (true) {
                                            v = 1;
                                            break Label_0094;
                                            continue;
                                        }
                                    }
                                    // iftrue(Label_0278:, !substring.equalsIgnoreCase("H"))
                                    catch (NumberFormatException ex) {
                                        final float u = 0.0f;
                                        continue Label_0192;
                                    }
                                    continue Label_0192;
                                }
                            }
                            Label_0278: {
                                v = -1;
                            }
                        }
                        n3 = index + 1;
                    }
                    final int index2 = s.indexOf(58);
                    if (index2 >= 0 && index2 < length - 1) {
                        final String substring2 = s.substring(n3, index2);
                        s = s.substring(index2 + 1);
                        if (substring2.length() > 0 && s.length() > 0) {
                            continue;
                        }
                    }
                    else {
                        s = s.substring(n3);
                        if (s.length() > 0) {
                            try {
                                final float u = Float.parseFloat(s);
                                continue Label_0192;
                            }
                            catch (NumberFormatException ex2) {
                                final float u = 0.0f;
                                continue Label_0192;
                            }
                            continue Label_0192;
                        }
                    }
                    break;
                }
                float u = 0.0f;
                continue Label_0192;
            }
        }
        this.u = 0.0f;
    }
    
    public void b(final float f) {
        this.F = f;
    }
    
    public void b(final int w) {
        this.w = w;
    }
    
    public void b(final int y, final int z) {
        this.y = y;
        this.z = z;
    }
    
    public void b(final int d, final int g, final int h) {
        this.d = d;
        this.g = g;
        this.h = h;
    }
    
    public void b(final a h) {
        this.H = h;
        if (this.H == android.support.constraint.a.a.b.a.b) {
            this.e(this.aj);
        }
    }
    
    public void b(final e e, final int n) {
        if (n == Integer.MAX_VALUE) {
            this.a(e.b(this.i), e.b(this.j), e.b(this.k), e.b(this.l));
        }
        else {
            if (n == -2) {
                this.a(this.aa, this.ab, this.ac, this.ad);
                return;
            }
            if (this.i.g == n) {
                this.aa = e.b(this.i);
            }
            if (this.j.g == n) {
                this.ab = e.b(this.j);
            }
            if (this.k.g == n) {
                this.ac = e.b(this.k);
            }
            if (this.l.g == n) {
                this.ad = e.b(this.l);
            }
        }
    }
    
    public boolean b() {
        return this.r == null;
    }
    
    public b c() {
        return this.r;
    }
    
    public void c(final float w) {
        this.W = w;
    }
    
    public void c(final int x) {
        this.x = x;
    }
    
    public void c(final int w, final int n) {
        this.w = w;
        this.s = n - w;
        if (this.s < this.B) {
            this.s = this.B;
        }
    }
    
    public int d() {
        return this.am;
    }
    
    public void d(final float x) {
        this.X = x;
    }
    
    public void d(final int s) {
        this.s = s;
        if (this.s < this.B) {
            this.s = this.B;
        }
    }
    
    public void d(final int x, final int n) {
        this.x = x;
        this.t = n - x;
        if (this.t < this.C) {
            this.t = this.C;
        }
    }
    
    public String e() {
        return this.an;
    }
    
    public void e(final int t) {
        this.t = t;
        if (this.t < this.C) {
            this.t = this.C;
        }
    }
    
    public int f() {
        return this.w;
    }
    
    public void f(final int b) {
        if (b < 0) {
            this.B = 0;
            return;
        }
        this.B = b;
    }
    
    public int g() {
        return this.x;
    }
    
    public void g(final int c) {
        if (c < 0) {
            this.C = 0;
            return;
        }
        this.C = c;
    }
    
    public int h() {
        if (this.am == 8) {
            return 0;
        }
        return this.s;
    }
    
    public void h(final int ai) {
        this.ai = ai;
    }
    
    public int i() {
        int n = this.s;
        if (this.G == android.support.constraint.a.a.b.a.c) {
            int s;
            if (this.c == 1) {
                s = Math.max(this.e, n);
            }
            else if (this.e > 0) {
                s = this.e;
                this.s = s;
            }
            else {
                s = 0;
            }
            n = s;
            if (this.f > 0 && this.f < (n = s)) {
                n = this.f;
            }
        }
        return n;
    }
    
    public void i(final int aj) {
        this.aj = aj;
    }
    
    public int j() {
        int n = this.t;
        if (this.H == android.support.constraint.a.a.b.a.c) {
            int t;
            if (this.d == 1) {
                t = Math.max(this.g, n);
            }
            else if (this.g > 0) {
                t = this.g;
                this.t = t;
            }
            else {
                t = 0;
            }
            n = t;
            if (this.h > 0 && this.h < (n = t)) {
                n = this.h;
            }
        }
        return n;
    }
    
    public void j(final int a) {
        this.A = a;
    }
    
    public int k() {
        return this.ai;
    }
    
    public void k(final int s) {
        this.S = s;
    }
    
    public int l() {
        if (this.am == 8) {
            return 0;
        }
        return this.t;
    }
    
    public void l(final int t) {
        this.T = t;
    }
    
    public int m() {
        return this.aj;
    }
    
    public int n() {
        return this.ae + this.y;
    }
    
    public int o() {
        return this.af + this.z;
    }
    
    public int p() {
        return this.o() + this.ah;
    }
    
    public int q() {
        return this.n() + this.ag;
    }
    
    protected int r() {
        return this.w + this.y;
    }
    
    protected int s() {
        return this.x + this.z;
    }
    
    public int t() {
        return this.f() + this.s;
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        String string;
        if (this.ao != null) {
            string = "type: " + this.ao + " ";
        }
        else {
            string = "";
        }
        final StringBuilder append = sb.append(string);
        String string2;
        if (this.an != null) {
            string2 = "id: " + this.an + " ";
        }
        else {
            string2 = "";
        }
        return append.append(string2).append("(").append(this.w).append(", ").append(this.x).append(") - (").append(this.s).append(" x ").append(this.t).append(")").append(" wrap: (").append(this.ai).append(" x ").append(this.aj).append(")").toString();
    }
    
    public int u() {
        return this.g() + this.t;
    }
    
    public boolean v() {
        return this.A > 0;
    }
    
    public int w() {
        return this.A;
    }
    
    public Object x() {
        return this.ak;
    }
    
    public ArrayList<android.support.constraint.a.a.a> y() {
        return this.q;
    }
    
    public void z() {
        final int w = this.w;
        final int x = this.x;
        final int w2 = this.w;
        final int s = this.s;
        final int x2 = this.x;
        final int t = this.t;
        this.ae = w;
        this.af = x;
        this.ag = w2 + s - w;
        this.ah = x2 + t - x;
    }
    
    public enum a
    {
        a, 
        b, 
        c, 
        d;
    }
}
