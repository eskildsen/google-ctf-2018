// 
// Decompiled by Procyon v0.5.30
// 

package android.support.constraint.a.a;

import java.util.ArrayList;
import java.util.Arrays;
import android.support.constraint.a.e;

public class c extends h
{
    static boolean ac;
    protected e aa;
    protected e ab;
    int ad;
    int ae;
    int af;
    int ag;
    int ah;
    int ai;
    private g ak;
    private int al;
    private int am;
    private b[] an;
    private b[] ao;
    private b[] ap;
    private int aq;
    private boolean[] ar;
    private b[] as;
    private boolean at;
    private boolean au;
    
    static {
        c.ac = true;
    }
    
    public c() {
        this.aa = new e();
        this.ab = null;
        this.al = 0;
        this.am = 0;
        this.an = new b[4];
        this.ao = new b[4];
        this.ap = new b[4];
        this.aq = 2;
        this.ar = new boolean[3];
        this.as = new b[4];
        this.at = false;
        this.au = false;
    }
    
    private void J() {
        this.al = 0;
        this.am = 0;
    }
    
    private int a(final e e, final b[] array, final b b, int n, final boolean[] array2) {
        array2[0] = true;
        array2[1] = false;
        array[2] = (array[0] = null);
        array[3] = (array[1] = null);
        if (n == 0) {
            final boolean b2 = b.i.c == null || b.i.c.a == this;
            b.Y = null;
            b b3 = null;
            if (b.d() != 8) {
                b3 = b;
            }
            b a = null;
            int n2 = 0;
            b y = b;
            b b4 = b3;
            while (true) {
                while (y.k.c != null) {
                    y.Y = null;
                    if (y.d() != 8) {
                        if (b4 == null) {
                            b4 = y;
                        }
                        if (b3 != null && b3 != y) {
                            b3.Y = y;
                        }
                        b3 = y;
                    }
                    else {
                        e.c(y.i.f, y.i.c.f, 0, 5);
                        e.c(y.k.f, y.i.f, 0, 5);
                    }
                    n = n2;
                    if (y.d() != 8) {
                        n = n2;
                        if (y.G == android.support.constraint.a.a.b.a.c) {
                            if (y.H == android.support.constraint.a.a.b.a.c) {
                                array2[0] = false;
                            }
                            n = n2;
                            if (y.u <= 0.0f) {
                                array2[0] = false;
                                if (n2 + 1 >= this.an.length) {
                                    this.an = Arrays.copyOf(this.an, this.an.length * 2);
                                }
                                this.an[n2] = y;
                                n = n2 + 1;
                            }
                        }
                    }
                    b b5;
                    b b6;
                    if (y.k.c.a.i.c == null) {
                        n2 = n;
                        b5 = b4;
                        b6 = b3;
                    }
                    else {
                        b6 = b3;
                        b5 = b4;
                        n2 = n;
                        if (y.k.c.a.i.c.a == y) {
                            b6 = b3;
                            b5 = b4;
                            n2 = n;
                            if (y.k.c.a != y) {
                                y = (a = y.k.c.a);
                                n2 = n;
                                continue;
                            }
                        }
                    }
                    boolean u = b2;
                    if (y.k.c != null) {
                        u = b2;
                        if (y.k.c.a != this) {
                            u = false;
                        }
                    }
                    if (b.i.c == null || a.k.c == null) {
                        array2[1] = true;
                    }
                    b.U = u;
                    a.Y = null;
                    array[0] = b;
                    array[2] = b5;
                    array[1] = a;
                    array[3] = b6;
                    return n2;
                }
                b b6 = b3;
                b b5 = b4;
                continue;
            }
        }
        final boolean b7 = b.j.c == null || b.j.c.a == this;
        b.Z = null;
        b b8 = null;
        if (b.d() != 8) {
            b8 = b;
        }
        b a2 = null;
        int n3 = 0;
        b z = b;
        b b9 = b8;
        while (true) {
            while (z.l.c != null) {
                z.Z = null;
                if (z.d() != 8) {
                    if (b9 == null) {
                        b9 = z;
                    }
                    if (b8 != null && b8 != z) {
                        b8.Z = z;
                    }
                    b8 = z;
                }
                else {
                    e.c(z.j.f, z.j.c.f, 0, 5);
                    e.c(z.l.f, z.j.f, 0, 5);
                }
                n = n3;
                if (z.d() != 8) {
                    n = n3;
                    if (z.H == android.support.constraint.a.a.b.a.c) {
                        if (z.G == android.support.constraint.a.a.b.a.c) {
                            array2[0] = false;
                        }
                        n = n3;
                        if (z.u <= 0.0f) {
                            array2[0] = false;
                            if (n3 + 1 >= this.an.length) {
                                this.an = Arrays.copyOf(this.an, this.an.length * 2);
                            }
                            this.an[n3] = z;
                            n = n3 + 1;
                        }
                    }
                }
                b b10;
                b b11;
                if (z.l.c.a.j.c == null) {
                    n3 = n;
                    b10 = b9;
                    b11 = b8;
                }
                else {
                    b11 = b8;
                    b10 = b9;
                    n3 = n;
                    if (z.l.c.a.j.c.a == z) {
                        b11 = b8;
                        b10 = b9;
                        n3 = n;
                        if (z.l.c.a != z) {
                            z = (a2 = z.l.c.a);
                            n3 = n;
                            continue;
                        }
                    }
                }
                boolean v = b7;
                if (z.l.c != null) {
                    v = b7;
                    if (z.l.c.a != this) {
                        v = false;
                    }
                }
                if (b.j.c == null || a2.l.c == null) {
                    array2[1] = true;
                }
                b.V = v;
                a2.Z = null;
                array[0] = b;
                array[2] = b10;
                array[1] = a2;
                array[3] = b11;
                return n3;
            }
            b b11 = b8;
            b b10 = b9;
            continue;
        }
    }
    
    private boolean a(final e e) {
        final int size = this.aj.size();
        for (int i = 0; i < size; ++i) {
            final b b = this.aj.get(i);
            b.a = -1;
            b.b = -1;
            if (b.G == android.support.constraint.a.a.b.a.c || b.H == android.support.constraint.a.a.b.a.c) {
                b.a = 1;
                b.b = 1;
            }
        }
        int n = 0;
        int n2 = 0;
        int n3 = 0;
        int j = 0;
        while (j == 0) {
            int k = 0;
            int n4 = 0;
            int n5 = 0;
            while (k < size) {
                final b b2 = this.aj.get(k);
                if (b2.a == -1) {
                    if (this.G == android.support.constraint.a.a.b.a.b) {
                        b2.a = 1;
                    }
                    else {
                        e.b(this, e, b2);
                    }
                }
                if (b2.b == -1) {
                    if (this.H == android.support.constraint.a.a.b.a.b) {
                        b2.b = 1;
                    }
                    else {
                        e.c(this, e, b2);
                    }
                }
                int n6 = n5;
                if (b2.b == -1) {
                    n6 = n5 + 1;
                }
                if (b2.a == -1) {
                    ++n4;
                }
                ++k;
                n5 = n6;
            }
            if (n5 == 0 && n4 == 0) {
                j = 1;
            }
            else if (n3 == n5 && n2 == n4) {
                j = 1;
            }
            ++n;
            n3 = n5;
            n2 = n4;
        }
        int l = 0;
        int n7 = 0;
        int n8 = 0;
        while (l < size) {
            final b b3 = this.aj.get(l);
            int n9 = 0;
            Label_0324: {
                if (b3.a != 1) {
                    n9 = n8;
                    if (b3.a != -1) {
                        break Label_0324;
                    }
                }
                n9 = n8 + 1;
            }
            if (b3.b == 1 || b3.b == -1) {
                ++n7;
            }
            ++l;
            n8 = n9;
        }
        return n8 == 0 && n7 == 0;
    }
    
    private void b(final e e) {
        for (int i = 0; i < this.al; ++i) {
            final b b = this.ap[i];
            final int a = this.a(e, this.as, this.ap[i], 0, this.ar);
            b b2 = this.as[2];
            if (b2 != null) {
                if (this.ar[1]) {
                    int n = b.n();
                    while (b2 != null) {
                        e.a(b2.i.f, n);
                        final b y = b2.Y;
                        n += b2.i.d() + b2.h() + b2.k.d();
                        b2 = y;
                    }
                }
                else {
                    final boolean b3 = b.S == 0;
                    boolean b4;
                    if (b.S == 2) {
                        b4 = true;
                    }
                    else {
                        b4 = false;
                    }
                    boolean b5;
                    if (this.G == android.support.constraint.a.a.b.a.b) {
                        b5 = true;
                    }
                    else {
                        b5 = false;
                    }
                    if ((this.aq == 2 || this.aq == 8) && this.ar[0] && b.U && !b4 && !b5 && b.S == 0) {
                        e.a(this, e, a, b);
                    }
                    else if (a == 0 || b4) {
                        b b6 = null;
                        boolean b7 = false;
                        b b8 = null;
                        b b10;
                        for (b b9 = b2; b9 != null; b9 = b10) {
                            b10 = b9.Y;
                            if (b10 == null) {
                                b6 = this.as[1];
                                b7 = true;
                            }
                            if (b4) {
                                final android.support.constraint.a.a.a j = b9.i;
                                int d = j.d();
                                if (b8 != null) {
                                    d += b8.k.d();
                                }
                                int n2 = 1;
                                if (b2 != b9) {
                                    n2 = 3;
                                }
                                e.a(j.f, j.c.f, d, n2);
                                if (b9.G == android.support.constraint.a.a.b.a.c) {
                                    final android.support.constraint.a.a.a k = b9.k;
                                    if (b9.c == 1) {
                                        e.c(k.f, j.f, Math.max(b9.e, b9.h()), 3);
                                    }
                                    else {
                                        e.a(j.f, j.c.f, j.d, 3);
                                        e.b(k.f, j.f, b9.e, 3);
                                    }
                                }
                            }
                            else if (!b3 && b7 && b8 != null) {
                                if (b9.k.c == null) {
                                    e.a(b9.k.f, b9.q());
                                }
                                else {
                                    e.c(b9.k.f, b6.k.c.f, -b9.k.d(), 5);
                                }
                            }
                            else if (!b3 && !b7 && b8 == null) {
                                if (b9.i.c == null) {
                                    e.a(b9.i.f, b9.n());
                                }
                                else {
                                    e.c(b9.i.f, b.i.c.f, b9.i.d(), 5);
                                }
                            }
                            else {
                                final android.support.constraint.a.a.a l = b9.i;
                                final android.support.constraint.a.a.a m = b9.k;
                                final int d2 = l.d();
                                final int d3 = m.d();
                                e.a(l.f, l.c.f, d2, 1);
                                e.b(m.f, m.c.f, -d3, 1);
                                android.support.constraint.a.g f;
                                if (l.c != null) {
                                    f = l.c.f;
                                }
                                else {
                                    f = null;
                                }
                                android.support.constraint.a.g g = f;
                                if (b8 == null) {
                                    android.support.constraint.a.g f2;
                                    if (b.i.c != null) {
                                        f2 = b.i.c.f;
                                    }
                                    else {
                                        f2 = null;
                                    }
                                    g = f2;
                                }
                                if (b10 == null) {
                                    if (b6.k.c != null) {
                                        b10 = b6.k.c.a;
                                    }
                                    else {
                                        b10 = null;
                                    }
                                }
                                if (b10 != null) {
                                    android.support.constraint.a.g g2 = b10.i.f;
                                    if (b7) {
                                        if (b6.k.c != null) {
                                            g2 = b6.k.c.f;
                                        }
                                        else {
                                            g2 = null;
                                        }
                                    }
                                    if (g != null && g2 != null) {
                                        e.a(l.f, g, d2, 0.5f, g2, m.f, d3, 4);
                                    }
                                }
                            }
                            if (b7) {
                                b10 = null;
                            }
                            b8 = b9;
                        }
                        if (b4) {
                            final android.support.constraint.a.a.a i2 = b2.i;
                            final android.support.constraint.a.a.a k2 = b6.k;
                            final int d4 = i2.d();
                            final int d5 = k2.d();
                            android.support.constraint.a.g f3;
                            if (b.i.c != null) {
                                f3 = b.i.c.f;
                            }
                            else {
                                f3 = null;
                            }
                            android.support.constraint.a.g f4;
                            if (b6.k.c != null) {
                                f4 = b6.k.c.f;
                            }
                            else {
                                f4 = null;
                            }
                            if (f3 != null && f4 != null) {
                                e.b(k2.f, f4, -d5, 1);
                                e.a(i2.f, f3, d4, b.E, f4, k2.f, d5, 4);
                            }
                        }
                    }
                    else {
                        float n3 = 0.0f;
                        final b b11 = null;
                        b b12 = b2;
                        b b13 = b11;
                        while (b12 != null) {
                            if (b12.G != android.support.constraint.a.a.b.a.c) {
                                int d6 = b12.i.d();
                                if (b13 != null) {
                                    d6 += b13.k.d();
                                }
                                int n4 = 3;
                                if (b12.i.c.a.G == android.support.constraint.a.a.b.a.c) {
                                    n4 = 2;
                                }
                                e.a(b12.i.f, b12.i.c.f, d6, n4);
                                int d7;
                                final int n5 = d7 = b12.k.d();
                                if (b12.k.c.a.i.c != null) {
                                    d7 = n5;
                                    if (b12.k.c.a.i.c.a == b12) {
                                        d7 = n5 + b12.k.c.a.i.d();
                                    }
                                }
                                int n6 = 3;
                                if (b12.k.c.a.G == android.support.constraint.a.a.b.a.c) {
                                    n6 = 2;
                                }
                                e.b(b12.k.f, b12.k.c.f, -d7, n6);
                            }
                            else {
                                n3 += b12.W;
                                int d8 = 0;
                                if (b12.k.c != null) {
                                    d8 = b12.k.d();
                                    if (b12 != this.as[3]) {
                                        d8 += b12.k.c.a.i.d();
                                    }
                                }
                                e.a(b12.k.f, b12.i.f, 0, 1);
                                e.b(b12.k.f, b12.k.c.f, -d8, 1);
                            }
                            final b y2 = b12.Y;
                            b13 = b12;
                            b12 = y2;
                        }
                        if (a == 1) {
                            final b b14 = this.an[0];
                            int d9;
                            final int n7 = d9 = b14.i.d();
                            if (b14.i.c != null) {
                                d9 = n7 + b14.i.c.d();
                            }
                            int d10;
                            final int n8 = d10 = b14.k.d();
                            if (b14.k.c != null) {
                                d10 = n8 + b14.k.c.d();
                            }
                            android.support.constraint.a.g g3 = b.k.c.f;
                            if (b14 == this.as[3]) {
                                g3 = this.as[1].k.c.f;
                            }
                            if (b14.c == 1) {
                                e.a(b.i.f, b.i.c.f, d9, 1);
                                e.b(b.k.f, g3, -d10, 1);
                                e.c(b.k.f, b.i.f, b.h(), 2);
                            }
                            else {
                                e.c(b14.i.f, b14.i.c.f, d9, 1);
                                e.c(b14.k.f, g3, -d10, 1);
                            }
                        }
                        else {
                            for (int n9 = 0; n9 < a - 1; ++n9) {
                                final b b15 = this.an[n9];
                                final b b16 = this.an[n9 + 1];
                                final android.support.constraint.a.g f5 = b15.i.f;
                                final android.support.constraint.a.g f6 = b15.k.f;
                                final android.support.constraint.a.g f7 = b16.i.f;
                                android.support.constraint.a.g g4 = b16.k.f;
                                if (b16 == this.as[3]) {
                                    g4 = this.as[1].k.f;
                                }
                                int d11;
                                final int n10 = d11 = b15.i.d();
                                if (b15.i.c != null) {
                                    d11 = n10;
                                    if (b15.i.c.a.k.c != null) {
                                        d11 = n10;
                                        if (b15.i.c.a.k.c.a == b15) {
                                            d11 = n10 + b15.i.c.a.k.d();
                                        }
                                    }
                                }
                                e.a(f5, b15.i.c.f, d11, 2);
                                final int d12 = b15.k.d();
                                int n11;
                                if (b15.k.c != null && b15.Y != null) {
                                    int d13;
                                    if (b15.Y.i.c != null) {
                                        d13 = b15.Y.i.d();
                                    }
                                    else {
                                        d13 = 0;
                                    }
                                    n11 = d13 + d12;
                                }
                                else {
                                    n11 = d12;
                                }
                                e.b(f6, b15.k.c.f, -n11, 2);
                                if (n9 + 1 == a - 1) {
                                    int d14;
                                    final int n12 = d14 = b16.i.d();
                                    if (b16.i.c != null) {
                                        d14 = n12;
                                        if (b16.i.c.a.k.c != null) {
                                            d14 = n12;
                                            if (b16.i.c.a.k.c.a == b16) {
                                                d14 = n12 + b16.i.c.a.k.d();
                                            }
                                        }
                                    }
                                    e.a(f7, b16.i.c.f, d14, 2);
                                    android.support.constraint.a.a.a a2 = b16.k;
                                    if (b16 == this.as[3]) {
                                        a2 = this.as[1].k;
                                    }
                                    int d15;
                                    final int n13 = d15 = a2.d();
                                    if (a2.c != null) {
                                        d15 = n13;
                                        if (a2.c.a.i.c != null) {
                                            d15 = n13;
                                            if (a2.c.a.i.c.a == b16) {
                                                d15 = n13 + a2.c.a.i.d();
                                            }
                                        }
                                    }
                                    e.b(g4, a2.c.f, -d15, 2);
                                }
                                if (b.f > 0) {
                                    e.b(f6, f5, b.f, 2);
                                }
                                final android.support.constraint.a.b b17 = e.b();
                                b17.a(b15.W, n3, b16.W, f5, b15.i.d(), f6, b15.k.d(), f7, b16.i.d(), g4, b16.k.d());
                                e.a(b17);
                            }
                        }
                    }
                }
            }
        }
    }
    
    private void c(final e e) {
        for (int i = 0; i < this.am; ++i) {
            final b b = this.ao[i];
            final int a = this.a(e, this.as, this.ao[i], 1, this.ar);
            b b2 = this.as[2];
            if (b2 != null) {
                if (this.ar[1]) {
                    int o = b.o();
                    while (b2 != null) {
                        e.a(b2.j.f, o);
                        final b z = b2.Z;
                        o += b2.j.d() + b2.l() + b2.l.d();
                        b2 = z;
                    }
                }
                else {
                    final boolean b3 = b.T == 0;
                    boolean b4;
                    if (b.T == 2) {
                        b4 = true;
                    }
                    else {
                        b4 = false;
                    }
                    boolean b5;
                    if (this.H == android.support.constraint.a.a.b.a.b) {
                        b5 = true;
                    }
                    else {
                        b5 = false;
                    }
                    if ((this.aq == 2 || this.aq == 8) && this.ar[0] && b.V && !b4 && !b5 && b.T == 0) {
                        e.b(this, e, a, b);
                    }
                    else if (a == 0 || b4) {
                        b b6 = null;
                        boolean b7 = false;
                        b b8 = null;
                        b b10;
                        for (b b9 = b2; b9 != null; b9 = b10) {
                            b10 = b9.Z;
                            if (b10 == null) {
                                b6 = this.as[1];
                                b7 = true;
                            }
                            if (b4) {
                                final android.support.constraint.a.a.a j = b9.j;
                                int d;
                                final int n = d = j.d();
                                if (b8 != null) {
                                    d = n + b8.l.d();
                                }
                                int n2 = 1;
                                if (b2 != b9) {
                                    n2 = 3;
                                }
                                android.support.constraint.a.g g = null;
                                android.support.constraint.a.g g2 = null;
                                int n3;
                                if (j.c != null) {
                                    g = j.f;
                                    g2 = j.c.f;
                                    n3 = d;
                                }
                                else {
                                    n3 = d;
                                    if (b9.m.c != null) {
                                        g = b9.m.f;
                                        g2 = b9.m.c.f;
                                        n3 = d - j.d();
                                    }
                                }
                                if (g != null && g2 != null) {
                                    e.a(g, g2, n3, n2);
                                }
                                if (b9.H == android.support.constraint.a.a.b.a.c) {
                                    final android.support.constraint.a.a.a l = b9.l;
                                    if (b9.d == 1) {
                                        e.c(l.f, j.f, Math.max(b9.g, b9.l()), 3);
                                    }
                                    else {
                                        e.a(j.f, j.c.f, j.d, 3);
                                        e.b(l.f, j.f, b9.g, 3);
                                    }
                                }
                            }
                            else if (!b3 && b7 && b8 != null) {
                                if (b9.l.c == null) {
                                    e.a(b9.l.f, b9.p());
                                }
                                else {
                                    e.c(b9.l.f, b6.l.c.f, -b9.l.d(), 5);
                                }
                            }
                            else if (!b3 && !b7 && b8 == null) {
                                if (b9.j.c == null) {
                                    e.a(b9.j.f, b9.o());
                                }
                                else {
                                    e.c(b9.j.f, b.j.c.f, b9.j.d(), 5);
                                }
                            }
                            else {
                                final android.support.constraint.a.a.a k = b9.j;
                                final android.support.constraint.a.a.a m = b9.l;
                                final int d2 = k.d();
                                final int d3 = m.d();
                                e.a(k.f, k.c.f, d2, 1);
                                e.b(m.f, m.c.f, -d3, 1);
                                android.support.constraint.a.g f;
                                if (k.c != null) {
                                    f = k.c.f;
                                }
                                else {
                                    f = null;
                                }
                                android.support.constraint.a.g g3 = f;
                                if (b8 == null) {
                                    android.support.constraint.a.g f2;
                                    if (b.j.c != null) {
                                        f2 = b.j.c.f;
                                    }
                                    else {
                                        f2 = null;
                                    }
                                    g3 = f2;
                                }
                                if (b10 == null) {
                                    if (b6.l.c != null) {
                                        b10 = b6.l.c.a;
                                    }
                                    else {
                                        b10 = null;
                                    }
                                }
                                if (b10 != null) {
                                    android.support.constraint.a.g g4 = b10.j.f;
                                    if (b7) {
                                        if (b6.l.c != null) {
                                            g4 = b6.l.c.f;
                                        }
                                        else {
                                            g4 = null;
                                        }
                                    }
                                    if (g3 != null && g4 != null) {
                                        e.a(k.f, g3, d2, 0.5f, g4, m.f, d3, 4);
                                    }
                                }
                            }
                            if (b7) {
                                b10 = null;
                            }
                            b8 = b9;
                        }
                        if (b4) {
                            final android.support.constraint.a.a.a j2 = b2.j;
                            final android.support.constraint.a.a.a l2 = b6.l;
                            final int d4 = j2.d();
                            final int d5 = l2.d();
                            android.support.constraint.a.g f3;
                            if (b.j.c != null) {
                                f3 = b.j.c.f;
                            }
                            else {
                                f3 = null;
                            }
                            android.support.constraint.a.g f4;
                            if (b6.l.c != null) {
                                f4 = b6.l.c.f;
                            }
                            else {
                                f4 = null;
                            }
                            if (f3 != null && f4 != null) {
                                e.b(l2.f, f4, -d5, 1);
                                e.a(j2.f, f3, d4, b.F, f4, l2.f, d5, 4);
                            }
                        }
                    }
                    else {
                        float n4 = 0.0f;
                        final b b11 = null;
                        b b12 = b2;
                        b b13 = b11;
                        while (b12 != null) {
                            if (b12.H != android.support.constraint.a.a.b.a.c) {
                                int d6 = b12.j.d();
                                if (b13 != null) {
                                    d6 += b13.l.d();
                                }
                                int n5 = 3;
                                if (b12.j.c.a.H == android.support.constraint.a.a.b.a.c) {
                                    n5 = 2;
                                }
                                e.a(b12.j.f, b12.j.c.f, d6, n5);
                                int d7;
                                final int n6 = d7 = b12.l.d();
                                if (b12.l.c.a.j.c != null) {
                                    d7 = n6;
                                    if (b12.l.c.a.j.c.a == b12) {
                                        d7 = n6 + b12.l.c.a.j.d();
                                    }
                                }
                                int n7 = 3;
                                if (b12.l.c.a.H == android.support.constraint.a.a.b.a.c) {
                                    n7 = 2;
                                }
                                e.b(b12.l.f, b12.l.c.f, -d7, n7);
                            }
                            else {
                                n4 += b12.X;
                                int d8 = 0;
                                if (b12.l.c != null) {
                                    d8 = b12.l.d();
                                    if (b12 != this.as[3]) {
                                        d8 += b12.l.c.a.j.d();
                                    }
                                }
                                e.a(b12.l.f, b12.j.f, 0, 1);
                                e.b(b12.l.f, b12.l.c.f, -d8, 1);
                            }
                            final b z2 = b12.Z;
                            b13 = b12;
                            b12 = z2;
                        }
                        if (a == 1) {
                            final b b14 = this.an[0];
                            int d9;
                            final int n8 = d9 = b14.j.d();
                            if (b14.j.c != null) {
                                d9 = n8 + b14.j.c.d();
                            }
                            int d10;
                            final int n9 = d10 = b14.l.d();
                            if (b14.l.c != null) {
                                d10 = n9 + b14.l.c.d();
                            }
                            android.support.constraint.a.g g5 = b.l.c.f;
                            if (b14 == this.as[3]) {
                                g5 = this.as[1].l.c.f;
                            }
                            if (b14.d == 1) {
                                e.a(b.j.f, b.j.c.f, d9, 1);
                                e.b(b.l.f, g5, -d10, 1);
                                e.c(b.l.f, b.j.f, b.l(), 2);
                            }
                            else {
                                e.c(b14.j.f, b14.j.c.f, d9, 1);
                                e.c(b14.l.f, g5, -d10, 1);
                            }
                        }
                        else {
                            for (int n10 = 0; n10 < a - 1; ++n10) {
                                final b b15 = this.an[n10];
                                final b b16 = this.an[n10 + 1];
                                final android.support.constraint.a.g f5 = b15.j.f;
                                final android.support.constraint.a.g f6 = b15.l.f;
                                final android.support.constraint.a.g f7 = b16.j.f;
                                android.support.constraint.a.g g6 = b16.l.f;
                                if (b16 == this.as[3]) {
                                    g6 = this.as[1].l.f;
                                }
                                int d11;
                                final int n11 = d11 = b15.j.d();
                                if (b15.j.c != null) {
                                    d11 = n11;
                                    if (b15.j.c.a.l.c != null) {
                                        d11 = n11;
                                        if (b15.j.c.a.l.c.a == b15) {
                                            d11 = n11 + b15.j.c.a.l.d();
                                        }
                                    }
                                }
                                e.a(f5, b15.j.c.f, d11, 2);
                                final int d12 = b15.l.d();
                                int n12;
                                if (b15.l.c != null && b15.Z != null) {
                                    int d13;
                                    if (b15.Z.j.c != null) {
                                        d13 = b15.Z.j.d();
                                    }
                                    else {
                                        d13 = 0;
                                    }
                                    n12 = d13 + d12;
                                }
                                else {
                                    n12 = d12;
                                }
                                e.b(f6, b15.l.c.f, -n12, 2);
                                if (n10 + 1 == a - 1) {
                                    int d14;
                                    final int n13 = d14 = b16.j.d();
                                    if (b16.j.c != null) {
                                        d14 = n13;
                                        if (b16.j.c.a.l.c != null) {
                                            d14 = n13;
                                            if (b16.j.c.a.l.c.a == b16) {
                                                d14 = n13 + b16.j.c.a.l.d();
                                            }
                                        }
                                    }
                                    e.a(f7, b16.j.c.f, d14, 2);
                                    android.support.constraint.a.a.a a2 = b16.l;
                                    if (b16 == this.as[3]) {
                                        a2 = this.as[1].l;
                                    }
                                    int d15;
                                    final int n14 = d15 = a2.d();
                                    if (a2.c != null) {
                                        d15 = n14;
                                        if (a2.c.a.j.c != null) {
                                            d15 = n14;
                                            if (a2.c.a.j.c.a == b16) {
                                                d15 = n14 + a2.c.a.j.d();
                                            }
                                        }
                                    }
                                    e.b(g6, a2.c.f, -d15, 2);
                                }
                                if (b.h > 0) {
                                    e.b(f6, f5, b.h, 2);
                                }
                                final android.support.constraint.a.b b17 = e.b();
                                b17.a(b15.X, n4, b16.X, f5, b15.j.d(), f6, b15.l.d(), f7, b16.j.d(), g6, b16.l.d());
                                e.a(b17);
                            }
                        }
                    }
                }
            }
        }
    }
    
    private void d(final b b) {
        for (int i = 0; i < this.al; ++i) {
            if (this.ap[i] == b) {
                return;
            }
        }
        if (this.al + 1 >= this.ap.length) {
            this.ap = Arrays.copyOf(this.ap, this.ap.length * 2);
        }
        this.ap[this.al] = b;
        ++this.al;
    }
    
    private void e(final b b) {
        for (int i = 0; i < this.am; ++i) {
            if (this.ao[i] == b) {
                return;
            }
        }
        if (this.am + 1 >= this.ao.length) {
            this.ao = Arrays.copyOf(this.ao, this.ao.length * 2);
        }
        this.ao[this.am] = b;
        ++this.am;
    }
    
    public boolean D() {
        return this.at;
    }
    
    public boolean E() {
        return this.au;
    }
    
    @Override
    public void F() {
        final int w = this.w;
        final int x = this.x;
        final int max = Math.max(0, this.h());
        final int max2 = Math.max(0, this.l());
        this.at = false;
        this.au = false;
        if (this.r != null) {
            if (this.ak == null) {
                this.ak = new g(this);
            }
            this.ak.a(this);
            this.b(this.af);
            this.c(this.ag);
            this.A();
            this.a(this.aa.f());
        }
        else {
            this.w = 0;
            this.x = 0;
        }
        final boolean b = false;
        final a h = this.H;
        final a g = this.G;
        int n = b ? 1 : 0;
        while (true) {
            Label_0425: {
                if (this.aq != 2) {
                    break Label_0425;
                }
                if (this.H != android.support.constraint.a.a.b.a.b) {
                    n = (b ? 1 : 0);
                    if (this.G != android.support.constraint.a.a.b.a.b) {
                        break Label_0425;
                    }
                }
                this.a(this.aj, this.ar);
                int n2;
                final boolean b2 = (n2 = (this.ar[0] ? 1 : 0)) != 0;
                Label_0221: {
                    if (max > 0) {
                        n2 = (b2 ? 1 : 0);
                        if (max2 > 0) {
                            if (this.ad <= max) {
                                n2 = (b2 ? 1 : 0);
                                if (this.ae <= max2) {
                                    break Label_0221;
                                }
                            }
                            n2 = 0;
                        }
                    }
                }
                if ((n = n2) == 0) {
                    break Label_0425;
                }
                if (this.G == android.support.constraint.a.a.b.a.b) {
                    this.G = android.support.constraint.a.a.b.a.a;
                    if (max > 0 && max < this.ad) {
                        this.at = true;
                        this.d(max);
                    }
                    else {
                        this.d(Math.max(this.B, this.ad));
                    }
                }
                n = n2;
                if (this.H != android.support.constraint.a.a.b.a.b) {
                    break Label_0425;
                }
                this.H = android.support.constraint.a.a.b.a.a;
                if (max2 <= 0 || max2 >= this.ae) {
                    this.e(Math.max(this.C, this.ae));
                    n = n2;
                    break Label_0425;
                }
                this.au = true;
                this.e(max2);
                this.J();
                final int size = this.aj.size();
                for (int i = 0; i < size; ++i) {
                    final b b3 = this.aj.get(i);
                    if (b3 instanceof h) {
                        ((h)b3).F();
                    }
                }
                int n3 = 0;
                int n4 = 0;
                int n10;
                for (int j = 1; j != 0; j = n10, n3 = n4) {
                    int n6 = 0;
                Label_0519_Outer:
                    while (true) {
                        n4 = n3 + 1;
                        int c = j;
                        Label_1216: {
                            int max3 = 0;
                            int max4 = 0;
                        Label_0519:
                            while (true) {
                                while (true) {
                                    try {
                                        this.aa.a();
                                        c = j;
                                        final boolean b4 = (c = (this.c(this.aa, Integer.MAX_VALUE) ? 1 : 0)) != 0;
                                        if (b4) {
                                            c = (b4 ? 1 : 0);
                                            this.aa.e();
                                            c = (b4 ? 1 : 0);
                                        }
                                        if (c != 0) {
                                            this.a(this.aa, Integer.MAX_VALUE, this.ar);
                                            if (n4 < 8 && this.ar[2]) {
                                                max3 = 0;
                                                max4 = 0;
                                                for (int k = 0; k < size; ++k) {
                                                    final b b5 = this.aj.get(k);
                                                    max3 = Math.max(max3, b5.w + b5.h());
                                                    max4 = Math.max(max4, b5.l() + b5.x);
                                                }
                                                break Label_0519;
                                            }
                                            break Label_1216;
                                        }
                                    }
                                    catch (Exception ex) {
                                        ex.printStackTrace();
                                        continue Label_0519_Outer;
                                    }
                                    break;
                                }
                                this.b(this.aa, Integer.MAX_VALUE);
                                for (int l = 0; l < size; ++l) {
                                    final b b6 = this.aj.get(l);
                                    if (b6.G == android.support.constraint.a.a.b.a.c && b6.h() < b6.k()) {
                                        this.ar[2] = true;
                                        continue Label_0519;
                                    }
                                    if (b6.H == android.support.constraint.a.a.b.a.c && b6.l() < b6.m()) {
                                        this.ar[2] = true;
                                        continue Label_0519;
                                    }
                                }
                                continue Label_0519;
                            }
                            final int max5 = Math.max(this.B, max3);
                            final int max6 = Math.max(this.C, max4);
                            int n5;
                            boolean b7;
                            if (g == android.support.constraint.a.a.b.a.b && this.h() < max5) {
                                this.d(max5);
                                this.G = android.support.constraint.a.a.b.a.b;
                                n5 = 1;
                                b7 = true;
                            }
                            else {
                                b7 = false;
                                n5 = n2;
                            }
                            n6 = (b7 ? 1 : 0);
                            n2 = n5;
                            if (h != android.support.constraint.a.a.b.a.b) {
                                break;
                            }
                            n6 = (b7 ? 1 : 0);
                            n2 = n5;
                            if (this.l() < max6) {
                                this.e(max6);
                                this.H = android.support.constraint.a.a.b.a.b;
                                n2 = 1;
                                n6 = 1;
                                break;
                            }
                            break;
                        }
                        n6 = 0;
                        break;
                    }
                    final int max7 = Math.max(this.B, this.h());
                    int n7 = n6;
                    int n8 = n2;
                    if (max7 > this.h()) {
                        this.d(max7);
                        this.G = android.support.constraint.a.a.b.a.a;
                        n8 = 1;
                        n7 = 1;
                    }
                    final int max8 = Math.max(this.C, this.l());
                    int n9 = n7;
                    if (max8 > this.l()) {
                        this.e(max8);
                        this.H = android.support.constraint.a.a.b.a.a;
                        n8 = 1;
                        n9 = 1;
                    }
                    n10 = n9;
                    int n11;
                    if ((n11 = n8) == 0) {
                        int n12 = n9;
                        int n13 = n8;
                        if (this.G == android.support.constraint.a.a.b.a.b) {
                            n12 = n9;
                            n13 = n8;
                            if (max > 0) {
                                n12 = n9;
                                n13 = n8;
                                if (this.h() > max) {
                                    this.at = true;
                                    n13 = 1;
                                    this.G = android.support.constraint.a.a.b.a.a;
                                    this.d(max);
                                    n12 = 1;
                                }
                            }
                        }
                        n10 = n12;
                        n11 = n13;
                        if (this.H == android.support.constraint.a.a.b.a.b) {
                            n10 = n12;
                            n11 = n13;
                            if (max2 > 0) {
                                n10 = n12;
                                n11 = n13;
                                if (this.l() > max2) {
                                    this.au = true;
                                    n11 = 1;
                                    this.H = android.support.constraint.a.a.b.a.a;
                                    this.e(max2);
                                    n10 = 1;
                                }
                            }
                        }
                    }
                    n2 = n11;
                }
                if (this.r != null) {
                    final int max9 = Math.max(this.B, this.h());
                    final int max10 = Math.max(this.C, this.l());
                    this.ak.b(this);
                    this.d(max9 + this.af + this.ah);
                    this.e(this.ag + max10 + this.ai);
                }
                else {
                    this.w = w;
                    this.x = x;
                }
                if (n2 != 0) {
                    this.G = g;
                    this.H = h;
                }
                this.a(this.aa.f());
                if (this == this.H()) {
                    this.z();
                }
                return;
            }
            int n2 = n;
            continue;
        }
    }
    
    public boolean G() {
        return false;
    }
    
    @Override
    public void a() {
        this.aa.a();
        this.af = 0;
        this.ah = 0;
        this.ag = 0;
        this.ai = 0;
        super.a();
    }
    
    void a(b b, final int n) {
        if (n == 0) {
            while (b.i.c != null && b.i.c.a.k.c != null && b.i.c.a.k.c == b.i && b.i.c.a != b) {
                b = b.i.c.a;
            }
            this.d(b);
        }
        else if (n == 1) {
            while (b.j.c != null && b.j.c.a.l.c != null && b.j.c.a.l.c == b.j && b.j.c.a != b) {
                b = b.j.c.a;
            }
            this.e(b);
        }
    }
    
    public void a(final b b, final boolean[] array) {
        b b2 = null;
        final boolean b3 = false;
        int g = 0;
        if (b.G == android.support.constraint.a.a.b.a.c && b.H == android.support.constraint.a.a.b.a.c && b.u > 0.0f) {
            array[0] = false;
            return;
        }
        final int i = b.i();
        if (b.G == android.support.constraint.a.a.b.a.c && b.H != android.support.constraint.a.a.b.a.c && b.u > 0.0f) {
            array[0] = false;
            return;
        }
        b.Q = true;
        int f = 0;
        int n3 = 0;
        Label_0124: {
            if (b instanceof d) {
                final d d = (d)b;
                if (d.D() == 1) {
                    if (d.F() != -1) {
                        f = d.F();
                    }
                    else if (d.G() != -1) {
                        g = d.G();
                        f = 0;
                    }
                    else {
                        f = 0;
                    }
                }
                else {
                    final int n = i;
                    final int n2 = i;
                    f = n;
                    g = n2;
                }
                n3 = g;
            }
            else if (!b.k.j() && !b.i.j()) {
                final int f2 = b.f();
                n3 = i;
                f = f2 + i;
            }
            else {
                if (b.k.c != null && b.i.c != null && (b.k.c == b.i.c || (b.k.c.a == b.i.c.a && b.k.c.a != b.r))) {
                    array[0] = false;
                    return;
                }
                b b4;
                int n5;
                if (b.k.c != null) {
                    final b a = b.k.c.a;
                    final int n4 = b.k.d() + i;
                    b4 = a;
                    n5 = n4;
                    if (!a.b()) {
                        b4 = a;
                        n5 = n4;
                        if (!a.Q) {
                            this.a(a, array);
                            n5 = n4;
                            b4 = a;
                        }
                    }
                }
                else {
                    b4 = null;
                    n5 = i;
                }
                int n6 = i;
                if (b.i.c != null) {
                    final b a2 = b.i.c.a;
                    final int n7 = n6 = i + b.i.d();
                    b2 = a2;
                    if (!a2.b()) {
                        n6 = n7;
                        b2 = a2;
                        if (!a2.Q) {
                            this.a(a2, array);
                            b2 = a2;
                            n6 = n7;
                        }
                    }
                }
                int n8 = n5;
                Label_0606: {
                    if (b.k.c != null) {
                        n8 = n5;
                        if (!b4.b()) {
                            int n9;
                            if (b.k.c.b == android.support.constraint.a.a.a.c.d) {
                                n9 = n5 + (b4.K - b4.i());
                            }
                            else {
                                n9 = n5;
                                if (b.k.c.c() == android.support.constraint.a.a.a.c.b) {
                                    n9 = n5 + b4.K;
                                }
                            }
                            b.N = (b4.N || (b4.i.c != null && b4.k.c != null && b4.G != android.support.constraint.a.a.b.a.c));
                            n8 = n9;
                            if (b.N) {
                                if (b4.i.c != null) {
                                    n8 = n9;
                                    if (b4.i.c.a == b) {
                                        break Label_0606;
                                    }
                                }
                                n8 = n9 + (n9 - b4.K);
                            }
                        }
                    }
                }
                f = n6;
                n3 = n8;
                if (b.i.c != null) {
                    f = n6;
                    n3 = n8;
                    if (!b2.b()) {
                        int n10;
                        if (b.i.c.c() == android.support.constraint.a.a.a.c.b) {
                            n10 = n6 + (b2.J - b2.i());
                        }
                        else {
                            n10 = n6;
                            if (b.i.c.c() == android.support.constraint.a.a.a.c.d) {
                                n10 = n6 + b2.J;
                            }
                        }
                        boolean m = false;
                        Label_0726: {
                            if (!b2.M) {
                                m = b3;
                                if (b2.i.c == null) {
                                    break Label_0726;
                                }
                                m = b3;
                                if (b2.k.c == null) {
                                    break Label_0726;
                                }
                                m = b3;
                                if (b2.G == android.support.constraint.a.a.b.a.c) {
                                    break Label_0726;
                                }
                            }
                            m = true;
                        }
                        b.M = m;
                        f = n10;
                        n3 = n8;
                        if (b.M) {
                            if (b2.k.c != null) {
                                f = n10;
                                n3 = n8;
                                if (b2.k.c.a == b) {
                                    break Label_0124;
                                }
                            }
                            f = n10 + (n10 - b2.J);
                            n3 = n8;
                        }
                    }
                }
            }
        }
        int j = f;
        int k = n3;
        if (b.d() == 8) {
            j = f - b.s;
            k = n3 - b.s;
        }
        b.J = j;
        b.K = k;
    }
    
    public void a(final e e, final int n, final boolean[] array) {
        array[2] = false;
        this.b(e, n);
        for (int size = this.aj.size(), i = 0; i < size; ++i) {
            final b b = this.aj.get(i);
            b.b(e, n);
            if (b.G == android.support.constraint.a.a.b.a.c && b.h() < b.k()) {
                array[2] = true;
            }
            if (b.H == android.support.constraint.a.a.b.a.c && b.l() < b.m()) {
                array[2] = true;
            }
        }
    }
    
    public void a(final ArrayList<b> list, final boolean[] array) {
        int n = 0;
        int max = 0;
        int n2 = 0;
        int max2 = 0;
        int n3 = 0;
        int n4 = 0;
        final int size = list.size();
        array[0] = true;
        int n6;
        int n7;
        int n8;
        int n9;
        int n12;
        for (int i = 0; i < size; ++i, n12 = n8, n2 = n7, n3 = n6, n4 = n9, n = n12) {
            final b b = list.get(i);
            if (b.b()) {
                final int n5 = n4;
                n6 = n3;
                n7 = n2;
                n8 = n;
                n9 = n5;
            }
            else {
                if (!b.Q) {
                    this.a(b, array);
                }
                if (!b.R) {
                    this.b(b, array);
                }
                if (!array[0]) {
                    return;
                }
                int n10 = b.J + b.K - b.h();
                int n11 = b.I + b.L - b.l();
                if (b.G == android.support.constraint.a.a.b.a.d) {
                    n10 = b.h() + b.i.d + b.k.d;
                }
                if (b.H == android.support.constraint.a.a.b.a.d) {
                    n11 = b.l() + b.j.d + b.l.d;
                }
                if (b.d() == 8) {
                    n10 = 0;
                    n11 = 0;
                }
                max = Math.max(max, b.J);
                final int max3 = Math.max(n2, b.K);
                max2 = Math.max(max2, b.L);
                final int max4 = Math.max(n, b.I);
                final int max5 = Math.max(n3, n10);
                final int max6 = Math.max(n4, n11);
                n7 = max3;
                n8 = max4;
                n9 = max6;
                n6 = max5;
            }
        }
        this.ad = Math.max(this.B, Math.max(Math.max(max, n2), n3));
        this.ae = Math.max(this.C, Math.max(Math.max(n, max2), n4));
        for (int j = 0; j < size; ++j) {
            final b b2 = list.get(j);
            b2.Q = false;
            b2.R = false;
            b2.M = false;
            b2.N = false;
            b2.O = false;
            b2.P = false;
        }
    }
    
    public void b(final b b, final boolean[] array) {
        b b2 = null;
        final boolean b3 = false;
        int f = 0;
        if (b.H == android.support.constraint.a.a.b.a.c && b.G != android.support.constraint.a.a.b.a.c && b.u > 0.0f) {
            array[0] = false;
            return;
        }
        int n = b.j();
        b.R = true;
        int n4 = 0;
        Label_0092: {
            if (b instanceof d) {
                final d d = (d)b;
                if (d.D() == 0) {
                    if (d.F() != -1) {
                        f = d.F();
                        n = 0;
                    }
                    else if (d.G() != -1) {
                        n = d.G();
                    }
                    else {
                        n = 0;
                    }
                }
                else {
                    final int n2 = n;
                    final int n3 = n;
                    n = n2;
                    f = n3;
                }
                n4 = f;
            }
            else if (b.m.c == null && b.j.c == null && b.l.c == null) {
                n4 = n + b.g();
            }
            else {
                if (b.l.c != null && b.j.c != null && (b.l.c == b.j.c || (b.l.c.a == b.j.c.a && b.l.c.a != b.r))) {
                    array[0] = false;
                    return;
                }
                if (b.m.j()) {
                    final b b4 = b.m.c.b();
                    if (!b4.R) {
                        this.b(b4, array);
                    }
                    final int max = Math.max(b4.I - b4.t + n, n);
                    int max2 = Math.max(b4.L - b4.t + n, n);
                    int i = max;
                    if (b.d() == 8) {
                        i = max - b.t;
                        max2 -= b.t;
                    }
                    b.I = i;
                    b.L = max2;
                    return;
                }
                b b6;
                int n6;
                if (b.j.j()) {
                    final b b5 = b.j.c.b();
                    final int n5 = b.j.d() + n;
                    b6 = b5;
                    n6 = n5;
                    if (!b5.b()) {
                        b6 = b5;
                        n6 = n5;
                        if (!b5.R) {
                            this.b(b5, array);
                            n6 = n5;
                            b6 = b5;
                        }
                    }
                }
                else {
                    b6 = null;
                    n6 = n;
                }
                int n7 = n;
                if (b.l.j()) {
                    final b b7 = b.l.c.b();
                    final int n8 = n7 = n + b.l.d();
                    b2 = b7;
                    if (!b7.b()) {
                        n7 = n8;
                        b2 = b7;
                        if (!b7.R) {
                            this.b(b7, array);
                            b2 = b7;
                            n7 = n8;
                        }
                    }
                }
                int n9 = n6;
                Label_0725: {
                    if (b.j.c != null) {
                        n9 = n6;
                        if (!b6.b()) {
                            int n10;
                            if (b.j.c.c() == android.support.constraint.a.a.a.c.c) {
                                n10 = n6 + (b6.I - b6.j());
                            }
                            else {
                                n10 = n6;
                                if (b.j.c.c() == android.support.constraint.a.a.a.c.e) {
                                    n10 = n6 + b6.I;
                                }
                            }
                            b.O = (b6.O || (b6.j.c != null && b6.j.c.a != b && b6.l.c != null && b6.l.c.a != b && b6.H != android.support.constraint.a.a.b.a.c));
                            n9 = n10;
                            if (b.O) {
                                if (b6.l.c != null) {
                                    n9 = n10;
                                    if (b6.l.c.a == b) {
                                        break Label_0725;
                                    }
                                }
                                n9 = n10 + (n10 - b6.I);
                            }
                        }
                    }
                }
                n = n7;
                n4 = n9;
                if (b.l.c != null) {
                    n = n7;
                    n4 = n9;
                    if (!b2.b()) {
                        int n11;
                        if (b.l.c.c() == android.support.constraint.a.a.a.c.e) {
                            n11 = n7 + (b2.L - b2.j());
                        }
                        else {
                            n11 = n7;
                            if (b.l.c.c() == android.support.constraint.a.a.a.c.c) {
                                n11 = n7 + b2.L;
                            }
                        }
                        boolean p2 = false;
                        Label_0883: {
                            if (!b2.P) {
                                p2 = b3;
                                if (b2.j.c == null) {
                                    break Label_0883;
                                }
                                p2 = b3;
                                if (b2.j.c.a == b) {
                                    break Label_0883;
                                }
                                p2 = b3;
                                if (b2.l.c == null) {
                                    break Label_0883;
                                }
                                p2 = b3;
                                if (b2.l.c.a == b) {
                                    break Label_0883;
                                }
                                p2 = b3;
                                if (b2.H == android.support.constraint.a.a.b.a.c) {
                                    break Label_0883;
                                }
                            }
                            p2 = true;
                        }
                        b.P = p2;
                        n = n11;
                        n4 = n9;
                        if (b.P) {
                            if (b2.j.c != null) {
                                n = n11;
                                n4 = n9;
                                if (b2.j.c.a == b) {
                                    break Label_0092;
                                }
                            }
                            n = n11 + (n11 - b2.L);
                            n4 = n9;
                        }
                    }
                }
            }
        }
        int l = n;
        int j = n4;
        if (b.d() == 8) {
            j = n4 - b.t;
            l = n - b.t;
        }
        b.I = j;
        b.L = l;
    }
    
    public boolean c(final e e, final int n) {
        this.a(e, n);
        final int size = this.aj.size();
        int n2;
        if (this.aq == 2 || this.aq == 4) {
            if (this.a(e)) {
                return false;
            }
            n2 = 0;
        }
        else {
            n2 = 1;
        }
        for (int i = 0; i < size; ++i) {
            final b b = this.aj.get(i);
            if (b instanceof c) {
                final a g = b.G;
                final a h = b.H;
                if (g == android.support.constraint.a.a.b.a.b) {
                    b.a(android.support.constraint.a.a.b.a.a);
                }
                if (h == android.support.constraint.a.a.b.a.b) {
                    b.b(android.support.constraint.a.a.b.a.a);
                }
                b.a(e, n);
                if (g == android.support.constraint.a.a.b.a.b) {
                    b.a(g);
                }
                if (h == android.support.constraint.a.a.b.a.b) {
                    b.b(h);
                }
            }
            else {
                if (n2 != 0) {
                    e.a(this, e, b);
                }
                b.a(e, n);
            }
        }
        if (this.al > 0) {
            this.b(e);
        }
        if (this.am > 0) {
            this.c(e);
        }
        return true;
    }
    
    public void m(final int aq) {
        this.aq = aq;
    }
}
