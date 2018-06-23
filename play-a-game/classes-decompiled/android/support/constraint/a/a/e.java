// 
// Decompiled by Procyon v0.5.30
// 

package android.support.constraint.a.a;

import android.support.constraint.a.g;

public class e
{
    static void a(final c c, final android.support.constraint.a.e e, final int n, b b) {
        int n2 = 0;
        int n3 = 0;
        float n4 = 0.0f;
        b b2 = null;
        b b5;
        for (b b3 = b; b3 != null; b3 = b5) {
            int n5;
            if (b3.d() == 8) {
                n5 = 1;
            }
            else {
                n5 = 0;
            }
            if (n5 == 0) {
                final int n6 = n3 + 1;
                if (b3.G != b.a.c) {
                    final int h = b3.h();
                    int d;
                    if (b3.i.c != null) {
                        d = b3.i.d();
                    }
                    else {
                        d = 0;
                    }
                    int d2;
                    if (b3.k.c != null) {
                        d2 = b3.k.d();
                    }
                    else {
                        d2 = 0;
                    }
                    n2 = d2 + (n2 + h + d);
                    n3 = n6;
                }
                else {
                    n4 += b3.W;
                    n3 = n6;
                }
            }
            b a;
            if (b3.k.c != null) {
                a = b3.k.c.a;
            }
            else {
                a = null;
            }
            b b4 = a;
            Label_0203: {
                if (a != null) {
                    if (a.i.c != null) {
                        b4 = a;
                        if (a.i.c == null) {
                            break Label_0203;
                        }
                        b4 = a;
                        if (a.i.c.a == b3) {
                            break Label_0203;
                        }
                    }
                    b4 = null;
                }
            }
            b5 = b4;
            b2 = b3;
        }
        int t = 0;
        if (b2 != null) {
            int f;
            if (b2.k.c != null) {
                f = b2.k.c.a.f();
            }
            else {
                f = 0;
            }
            t = f;
            if (b2.k.c != null) {
                t = f;
                if (b2.k.c.a == c) {
                    t = c.t();
                }
            }
        }
        final float n7 = t - 0 - n2;
        float n8 = n7 / (n3 + 1);
        float n9;
        b b6;
        if (n == 0) {
            n9 = n8;
            b6 = b;
        }
        else {
            n9 = n7 / n;
            n8 = 0.0f;
            b6 = b;
        }
        while (b6 != null) {
            int d3;
            if (b6.i.c != null) {
                d3 = b6.i.d();
            }
            else {
                d3 = 0;
            }
            int d4;
            if (b6.k.c != null) {
                d4 = b6.k.d();
            }
            else {
                d4 = 0;
            }
            if (b6.d() != 8) {
                final float n10 = n8 + d3;
                e.a(b6.i.f, (int)(0.5f + n10));
                float n11;
                if (b6.G == b.a.c) {
                    if (n4 == 0.0f) {
                        n11 = n9 - d3 - d4 + n10;
                    }
                    else {
                        n11 = b6.W * n7 / n4 - d3 - d4 + n10;
                    }
                }
                else {
                    n11 = b6.h() + n10;
                }
                e.a(b6.k.f, (int)(0.5f + n11));
                float n12 = n11;
                if (n == 0) {
                    n12 = n11 + n9;
                }
                n8 = n12 + d4;
            }
            else {
                final float n13 = n8 - n9 / 2.0f;
                e.a(b6.i.f, (int)(0.5f + n13));
                e.a(b6.k.f, (int)(n13 + 0.5f));
            }
            b a2;
            if (b6.k.c != null) {
                a2 = b6.k.c.a;
            }
            else {
                a2 = null;
            }
            b = a2;
            if (a2 != null) {
                b = a2;
                if (a2.i.c != null) {
                    b = a2;
                    if (a2.i.c.a != b6) {
                        b = null;
                    }
                }
            }
            b b7;
            if ((b7 = b) == c) {
                b7 = null;
            }
            b6 = b7;
        }
    }
    
    static void a(final c c, final android.support.constraint.a.e e, final b b) {
        if (c.G != b.a.b && b.G == b.a.d) {
            b.i.f = e.a(b.i);
            b.k.f = e.a(b.k);
            final int d = b.i.d;
            final int n = c.h() - b.k.d;
            e.a(b.i.f, d);
            e.a(b.k.f, n);
            b.c(d, n);
            b.a = 2;
        }
        if (c.H != b.a.b && b.H == b.a.d) {
            b.j.f = e.a(b.j);
            b.l.f = e.a(b.l);
            final int d2 = b.j.d;
            final int n2 = c.l() - b.l.d;
            e.a(b.j.f, d2);
            e.a(b.l.f, n2);
            if (b.A > 0 || b.d() == 8) {
                e.a(b.m.f = e.a(b.m), b.A + d2);
            }
            b.d(d2, n2);
            b.b = 2;
        }
    }
    
    static void b(final c c, final android.support.constraint.a.e e, final int n, b b) {
        int n2 = 0;
        int n3 = 0;
        float n4 = 0.0f;
        b b2 = null;
        b b5;
        for (b b3 = b; b3 != null; b3 = b5) {
            int n5;
            if (b3.d() == 8) {
                n5 = 1;
            }
            else {
                n5 = 0;
            }
            if (n5 == 0) {
                final int n6 = n3 + 1;
                if (b3.H != b.a.c) {
                    final int l = b3.l();
                    int d;
                    if (b3.j.c != null) {
                        d = b3.j.d();
                    }
                    else {
                        d = 0;
                    }
                    int d2;
                    if (b3.l.c != null) {
                        d2 = b3.l.d();
                    }
                    else {
                        d2 = 0;
                    }
                    n2 = d2 + (n2 + l + d);
                    n3 = n6;
                }
                else {
                    n4 += b3.X;
                    n3 = n6;
                }
            }
            b a;
            if (b3.l.c != null) {
                a = b3.l.c.a;
            }
            else {
                a = null;
            }
            b b4 = a;
            Label_0203: {
                if (a != null) {
                    if (a.j.c != null) {
                        b4 = a;
                        if (a.j.c == null) {
                            break Label_0203;
                        }
                        b4 = a;
                        if (a.j.c.a == b3) {
                            break Label_0203;
                        }
                    }
                    b4 = null;
                }
            }
            b5 = b4;
            b2 = b3;
        }
        int u = 0;
        if (b2 != null) {
            int f;
            if (b2.l.c != null) {
                f = b2.l.c.a.f();
            }
            else {
                f = 0;
            }
            u = f;
            if (b2.l.c != null) {
                u = f;
                if (b2.l.c.a == c) {
                    u = c.u();
                }
            }
        }
        final float n7 = u - 0 - n2;
        float n8 = n7 / (n3 + 1);
        float n9;
        b b6;
        if (n == 0) {
            n9 = n8;
            b6 = b;
        }
        else {
            n9 = n7 / n;
            n8 = 0.0f;
            b6 = b;
        }
        while (b6 != null) {
            int d3;
            if (b6.j.c != null) {
                d3 = b6.j.d();
            }
            else {
                d3 = 0;
            }
            int d4;
            if (b6.l.c != null) {
                d4 = b6.l.d();
            }
            else {
                d4 = 0;
            }
            if (b6.d() != 8) {
                final float n10 = n8 + d3;
                e.a(b6.j.f, (int)(0.5f + n10));
                float n11;
                if (b6.H == b.a.c) {
                    if (n4 == 0.0f) {
                        n11 = n9 - d3 - d4 + n10;
                    }
                    else {
                        n11 = b6.X * n7 / n4 - d3 - d4 + n10;
                    }
                }
                else {
                    n11 = b6.l() + n10;
                }
                e.a(b6.l.f, (int)(0.5f + n11));
                float n12 = n11;
                if (n == 0) {
                    n12 = n11 + n9;
                }
                n8 = n12 + d4;
            }
            else {
                final float n13 = n8 - n9 / 2.0f;
                e.a(b6.j.f, (int)(0.5f + n13));
                e.a(b6.l.f, (int)(n13 + 0.5f));
            }
            b a2;
            if (b6.l.c != null) {
                a2 = b6.l.c.a;
            }
            else {
                a2 = null;
            }
            b = a2;
            if (a2 != null) {
                b = a2;
                if (a2.j.c != null) {
                    b = a2;
                    if (a2.j.c.a != b6) {
                        b = null;
                    }
                }
            }
            b b7;
            if ((b7 = b) == c) {
                b7 = null;
            }
            b6 = b7;
        }
    }
    
    static void b(final c c, final android.support.constraint.a.e e, final b b) {
        if (b.G == b.a.c) {
            b.a = 1;
        }
        else {
            if (c.G != b.a.b && b.G == b.a.d) {
                b.i.f = e.a(b.i);
                b.k.f = e.a(b.k);
                final int d = b.i.d;
                final int n = c.h() - b.k.d;
                e.a(b.i.f, d);
                e.a(b.k.f, n);
                b.c(d, n);
                b.a = 2;
                return;
            }
            if (b.i.c != null && b.k.c != null) {
                if (b.i.c.a == c && b.k.c.a == c) {
                    int d2 = b.i.d();
                    final int d3 = b.k.d();
                    int n2;
                    if (c.G == b.a.c) {
                        n2 = c.h() - d3;
                    }
                    else {
                        d2 += (int)((c.h() - d2 - d3 - b.h()) * b.E + 0.5f);
                        n2 = b.h() + d2;
                    }
                    b.i.f = e.a(b.i);
                    b.k.f = e.a(b.k);
                    e.a(b.i.f, d2);
                    e.a(b.k.f, n2);
                    b.a = 2;
                    b.c(d2, n2);
                    return;
                }
                b.a = 1;
            }
            else {
                if (b.i.c != null && b.i.c.a == c) {
                    final int d4 = b.i.d();
                    final int n3 = b.h() + d4;
                    b.i.f = e.a(b.i);
                    b.k.f = e.a(b.k);
                    e.a(b.i.f, d4);
                    e.a(b.k.f, n3);
                    b.a = 2;
                    b.c(d4, n3);
                    return;
                }
                if (b.k.c != null && b.k.c.a == c) {
                    b.i.f = e.a(b.i);
                    b.k.f = e.a(b.k);
                    final int n4 = c.h() - b.k.d();
                    final int n5 = n4 - b.h();
                    e.a(b.i.f, n5);
                    e.a(b.k.f, n4);
                    b.a = 2;
                    b.c(n5, n4);
                    return;
                }
                if (b.i.c != null && b.i.c.a.a == 2) {
                    final g f = b.i.c.f;
                    b.i.f = e.a(b.i);
                    b.k.f = e.a(b.k);
                    final int n6 = (int)(f.d + b.i.d() + 0.5f);
                    final int n7 = b.h() + n6;
                    e.a(b.i.f, n6);
                    e.a(b.k.f, n7);
                    b.a = 2;
                    b.c(n6, n7);
                    return;
                }
                if (b.k.c != null && b.k.c.a.a == 2) {
                    final g f2 = b.k.c.f;
                    b.i.f = e.a(b.i);
                    b.k.f = e.a(b.k);
                    final int n8 = (int)(f2.d - b.k.d() + 0.5f);
                    final int n9 = n8 - b.h();
                    e.a(b.i.f, n9);
                    e.a(b.k.f, n8);
                    b.a = 2;
                    b.c(n9, n8);
                    return;
                }
                boolean b2;
                if (b.i.c != null) {
                    b2 = true;
                }
                else {
                    b2 = false;
                }
                boolean b3;
                if (b.k.c != null) {
                    b3 = true;
                }
                else {
                    b3 = false;
                }
                if (!b2 && !b3) {
                    if (!(b instanceof d)) {
                        b.i.f = e.a(b.i);
                        b.k.f = e.a(b.k);
                        final int f3 = b.f();
                        final int h = b.h();
                        e.a(b.i.f, f3);
                        e.a(b.k.f, h + f3);
                        b.a = 2;
                        return;
                    }
                    final d d5 = (d)b;
                    if (d5.D() == 1) {
                        b.i.f = e.a(b.i);
                        b.k.f = e.a(b.k);
                        float n10;
                        if (d5.F() != -1) {
                            n10 = d5.F();
                        }
                        else if (d5.G() != -1) {
                            n10 = c.h() - d5.G();
                        }
                        else {
                            n10 = d5.E() * c.h();
                        }
                        final int n11 = (int)(n10 + 0.5f);
                        e.a(b.i.f, n11);
                        e.a(b.k.f, n11);
                        b.a = 2;
                        b.b = 2;
                        b.c(n11, n11);
                        b.d(0, c.l());
                    }
                }
            }
        }
    }
    
    static void c(final c c, final android.support.constraint.a.e e, final b b) {
        boolean b2 = true;
        if (b.H == b.a.c) {
            b.b = 1;
        }
        else {
            if (c.H != b.a.b && b.H == b.a.d) {
                b.j.f = e.a(b.j);
                b.l.f = e.a(b.l);
                final int d = b.j.d;
                final int n = c.l() - b.l.d;
                e.a(b.j.f, d);
                e.a(b.l.f, n);
                if (b.A > 0 || b.d() == 8) {
                    e.a(b.m.f = e.a(b.m), b.A + d);
                }
                b.d(d, n);
                b.b = 2;
                return;
            }
            if (b.j.c != null && b.l.c != null) {
                if (b.j.c.a == c && b.l.c.a == c) {
                    int d2 = b.j.d();
                    final int d3 = b.l.d();
                    int n2;
                    if (c.H == b.a.c) {
                        n2 = b.l() + d2;
                    }
                    else {
                        d2 = (int)((c.l() - d2 - d3 - b.l()) * b.F + d2 + 0.5f);
                        n2 = b.l() + d2;
                    }
                    b.j.f = e.a(b.j);
                    b.l.f = e.a(b.l);
                    e.a(b.j.f, d2);
                    e.a(b.l.f, n2);
                    if (b.A > 0 || b.d() == 8) {
                        e.a(b.m.f = e.a(b.m), b.A + d2);
                    }
                    b.b = 2;
                    b.d(d2, n2);
                    return;
                }
                b.b = 1;
            }
            else {
                if (b.j.c != null && b.j.c.a == c) {
                    final int d4 = b.j.d();
                    final int n3 = b.l() + d4;
                    b.j.f = e.a(b.j);
                    b.l.f = e.a(b.l);
                    e.a(b.j.f, d4);
                    e.a(b.l.f, n3);
                    if (b.A > 0 || b.d() == 8) {
                        e.a(b.m.f = e.a(b.m), b.A + d4);
                    }
                    b.b = 2;
                    b.d(d4, n3);
                    return;
                }
                if (b.l.c != null && b.l.c.a == c) {
                    b.j.f = e.a(b.j);
                    b.l.f = e.a(b.l);
                    final int n4 = c.l() - b.l.d();
                    final int n5 = n4 - b.l();
                    e.a(b.j.f, n5);
                    e.a(b.l.f, n4);
                    if (b.A > 0 || b.d() == 8) {
                        e.a(b.m.f = e.a(b.m), b.A + n5);
                    }
                    b.b = 2;
                    b.d(n5, n4);
                    return;
                }
                if (b.j.c != null && b.j.c.a.b == 2) {
                    final g f = b.j.c.f;
                    b.j.f = e.a(b.j);
                    b.l.f = e.a(b.l);
                    final int n6 = (int)(f.d + b.j.d() + 0.5f);
                    final int n7 = b.l() + n6;
                    e.a(b.j.f, n6);
                    e.a(b.l.f, n7);
                    if (b.A > 0 || b.d() == 8) {
                        e.a(b.m.f = e.a(b.m), b.A + n6);
                    }
                    b.b = 2;
                    b.d(n6, n7);
                    return;
                }
                if (b.l.c != null && b.l.c.a.b == 2) {
                    final g f2 = b.l.c.f;
                    b.j.f = e.a(b.j);
                    b.l.f = e.a(b.l);
                    final int n8 = (int)(f2.d - b.l.d() + 0.5f);
                    final int n9 = n8 - b.l();
                    e.a(b.j.f, n9);
                    e.a(b.l.f, n8);
                    if (b.A > 0 || b.d() == 8) {
                        e.a(b.m.f = e.a(b.m), b.A + n9);
                    }
                    b.b = 2;
                    b.d(n9, n8);
                    return;
                }
                if (b.m.c != null && b.m.c.a.b == 2) {
                    final g f3 = b.m.c.f;
                    b.j.f = e.a(b.j);
                    b.l.f = e.a(b.l);
                    final int n10 = (int)(f3.d - b.A + 0.5f);
                    final int n11 = b.l() + n10;
                    e.a(b.j.f, n10);
                    e.a(b.l.f, n11);
                    e.a(b.m.f = e.a(b.m), b.A + n10);
                    b.b = 2;
                    b.d(n10, n11);
                    return;
                }
                boolean b3;
                if (b.m.c != null) {
                    b3 = true;
                }
                else {
                    b3 = false;
                }
                boolean b4;
                if (b.j.c != null) {
                    b4 = true;
                }
                else {
                    b4 = false;
                }
                if (b.l.c == null) {
                    b2 = false;
                }
                if (!b3 && !b4 && !b2) {
                    if (!(b instanceof d)) {
                        b.j.f = e.a(b.j);
                        b.l.f = e.a(b.l);
                        final int g = b.g();
                        final int l = b.l();
                        e.a(b.j.f, g);
                        e.a(b.l.f, l + g);
                        if (b.A > 0 || b.d() == 8) {
                            e.a(b.m.f = e.a(b.m), g + b.A);
                        }
                        b.b = 2;
                        return;
                    }
                    final d d5 = (d)b;
                    if (d5.D() == 0) {
                        b.j.f = e.a(b.j);
                        b.l.f = e.a(b.l);
                        float n12;
                        if (d5.F() != -1) {
                            n12 = d5.F();
                        }
                        else if (d5.G() != -1) {
                            n12 = c.l() - d5.G();
                        }
                        else {
                            n12 = d5.E() * c.l();
                        }
                        final int n13 = (int)(n12 + 0.5f);
                        e.a(b.j.f, n13);
                        e.a(b.l.f, n13);
                        b.b = 2;
                        b.a = 2;
                        b.d(n13, n13);
                        b.c(0, c.h());
                    }
                }
            }
        }
    }
}
