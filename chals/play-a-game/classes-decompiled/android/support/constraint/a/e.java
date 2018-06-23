// 
// Decompiled by Procyon v0.5.30
// 

package android.support.constraint.a;

import android.support.constraint.a.a.a;
import java.util.Arrays;
import java.util.HashMap;

public class e
{
    private static int d;
    int a;
    int b;
    final c c;
    private HashMap<String, g> e;
    private d f;
    private int g;
    private int h;
    private b[] i;
    private boolean[] j;
    private int k;
    private int l;
    private g[] m;
    private int n;
    private b[] o;
    
    static {
        e.d = 1000;
    }
    
    public e() {
        this.a = 0;
        this.e = null;
        this.f = new d();
        this.g = 32;
        this.h = this.g;
        this.i = null;
        this.j = new boolean[this.g];
        this.b = 1;
        this.k = 0;
        this.l = this.g;
        this.m = new g[android.support.constraint.a.e.d];
        this.n = 0;
        this.o = new b[this.g];
        this.i = new b[this.g];
        this.h();
        this.c = new c();
    }
    
    public static b a(final e e, g d, final g g, final int n, final float n2, final g g2, final g g3, final int n3, final boolean b) {
        final b b2 = e.b();
        b2.a(d, g, n, n2, g2, g3, n3);
        if (b) {
            d = e.d();
            final g d2 = e.d();
            d.c = 4;
            d2.c = 4;
            b2.a(d, d2);
        }
        return b2;
    }
    
    public static b a(final e e, final g g, final g g2, final int n, final boolean b) {
        final b b2 = e.b();
        b2.a(g, g2, n);
        if (b) {
            e.a(b2, 1);
        }
        return b2;
    }
    
    public static b a(final e e, final g g, final g g2, final g g3, final float n, final boolean b) {
        final b b2 = e.b();
        if (b) {
            e.b(b2);
        }
        return b2.a(g, g2, g3, n);
    }
    
    private g a(final g.a a) {
        final g g = this.c.b.a();
        g g2;
        if (g == null) {
            g2 = new g(a);
        }
        else {
            g.c();
            g.a(a);
            g2 = g;
        }
        if (this.n >= android.support.constraint.a.e.d) {
            android.support.constraint.a.e.d *= 2;
            this.m = Arrays.copyOf(this.m, android.support.constraint.a.e.d);
        }
        return this.m[this.n++] = g2;
    }
    
    private void a(final b b, final int n) {
        b.c(this.d(), n);
    }
    
    private int b(final d d) {
        for (int i = 0; i < this.b; ++i) {
            this.j[i] = false;
        }
        int n = 0;
        int n2 = 0;
        int j = 0;
    Label_0074_Outer:
        while (j == 0) {
            g a = d.a();
            int n3 = n;
            while (true) {
                Label_0372: {
                    if (a == null) {
                        break Label_0372;
                    }
                    if (this.j[a.a]) {
                        a = null;
                    }
                    else {
                        this.j[a.a] = true;
                        ++n;
                        if ((n3 = n) < this.b) {
                            break Label_0372;
                        }
                        j = 1;
                    }
                    while (true) {
                        if (a == null) {
                            j = 1;
                            break Label_0338;
                        }
                        int b = -1;
                        float n4 = Float.MAX_VALUE;
                        float n5;
                        int n6;
                        for (int k = 0; k < this.k; ++k, b = n6, n4 = n5) {
                            final b b2 = this.i[k];
                            if (b2.a.f == android.support.constraint.a.g.a.a) {
                                n5 = n4;
                                n6 = b;
                            }
                            else {
                                n6 = b;
                                n5 = n4;
                                if (b2.a(a)) {
                                    final float c = b2.d.c(a);
                                    n6 = b;
                                    n5 = n4;
                                    if (c < 0.0f) {
                                        final float n7 = -b2.b / c;
                                        n6 = b;
                                        n5 = n4;
                                        if (n7 < n4) {
                                            n6 = k;
                                            n5 = n7;
                                        }
                                    }
                                }
                            }
                        }
                        Label_0357: {
                            if (b <= -1) {
                                break Label_0357;
                            }
                            final b b3 = this.i[b];
                            b3.a.b = -1;
                            b3.b(a);
                            b3.a.b = b;
                            for (int l = 0; l < this.k; ++l) {
                                this.i[l].a(b3);
                            }
                            d.a(this);
                            try {
                                this.c(d);
                                ++n2;
                                continue Label_0074_Outer;
                            }
                            catch (Exception ex) {
                                ex.printStackTrace();
                                continue;
                            }
                        }
                        j = 1;
                        continue;
                    }
                }
                n = n3;
                continue;
            }
        }
        return n2;
    }
    
    public static b b(final e e, final g g, final g g2, final int n, final boolean b) {
        final g c = e.c();
        final b b2 = e.b();
        b2.a(g, g2, c, n);
        if (b) {
            e.a(b2, (int)(b2.d.c(c) * -1.0f));
        }
        return b2;
    }
    
    private void b(final b b) {
        b.a(this.d(), this.d());
    }
    
    private int c(final d d) {
        while (true) {
            for (int i = 0; i < this.k; ++i) {
                if (this.i[i].a.f != android.support.constraint.a.g.a.a && this.i[i].b < 0.0f) {
                    final int n = 1;
                    int n4;
                    if (n != 0) {
                        int n2 = 0;
                        int n3 = 0;
                        while (true) {
                            n4 = n3;
                            if (n2 != 0) {
                                break;
                            }
                            float n5 = Float.MAX_VALUE;
                            int n6 = 0;
                            int b = -1;
                            int n7 = -1;
                            float n8;
                            int n9;
                            int n10;
                            int n11;
                            for (int j = 0; j < this.k; ++j, n7 = n11, b = n10, n6 = n9, n5 = n8) {
                                final b b2 = this.i[j];
                                if (b2.a.f == android.support.constraint.a.g.a.a) {
                                    n8 = n5;
                                    n9 = n6;
                                    n10 = b;
                                    n11 = n7;
                                }
                                else {
                                    n11 = n7;
                                    n10 = b;
                                    n9 = n6;
                                    n8 = n5;
                                    if (b2.b < 0.0f) {
                                        for (int k = 1; k < this.b; ++k) {
                                            final g g = this.c.c[k];
                                            final float c = b2.d.c(g);
                                            if (c > 0.0f) {
                                                for (int l = 0; l < 6; ++l) {
                                                    final float n12 = g.e[l] / c;
                                                    if ((n12 < n5 && l == n6) || l > n6) {
                                                        n7 = k;
                                                        b = j;
                                                        n6 = l;
                                                        n5 = n12;
                                                    }
                                                }
                                            }
                                        }
                                        n11 = n7;
                                        n10 = b;
                                        n9 = n6;
                                        n8 = n5;
                                    }
                                }
                            }
                            int n14;
                            if (b != -1) {
                                final b b3 = this.i[b];
                                b3.a.b = -1;
                                b3.b(this.c.c[n7]);
                                b3.a.b = b;
                                for (int n13 = 0; n13 < this.k; ++n13) {
                                    this.i[n13].a(b3);
                                }
                                d.a(this);
                                n14 = n2;
                            }
                            else {
                                n14 = 1;
                            }
                            ++n3;
                            n2 = n14;
                        }
                    }
                    else {
                        n4 = 0;
                    }
                    for (int n15 = 0; n15 < this.k && (this.i[n15].a.f == android.support.constraint.a.g.a.a || this.i[n15].b >= 0.0f); ++n15) {}
                    return n4;
                }
            }
            final int n = 0;
            continue;
        }
    }
    
    public static b c(final e e, final g g, final g g2, final int n, final boolean b) {
        final g c = e.c();
        final b b2 = e.b();
        b2.b(g, g2, c, n);
        if (b) {
            e.a(b2, (int)(b2.d.c(c) * -1.0f));
        }
        return b2;
    }
    
    private void c(final b b) {
        if (this.k > 0) {
            b.d.a(b, this.i);
            if (b.d.a == 0) {
                b.e = true;
            }
        }
    }
    
    private void g() {
        this.g *= 2;
        this.i = Arrays.copyOf(this.i, this.g);
        this.c.c = Arrays.copyOf(this.c.c, this.g);
        this.j = new boolean[this.g];
        this.h = this.g;
        this.l = this.g;
        this.f.a.clear();
    }
    
    private void h() {
        for (int i = 0; i < this.i.length; ++i) {
            final b b = this.i[i];
            if (b != null) {
                this.c.a.a(b);
            }
            this.i[i] = null;
        }
    }
    
    private void i() {
        for (int i = 0; i < this.k; ++i) {
            final b b = this.i[i];
            b.a.d = b.b;
        }
    }
    
    b a(final int n) {
        return this.i[n];
    }
    
    public g a(final Object o) {
        g g = null;
        if (o != null) {
            if (this.b + 1 >= this.h) {
                this.g();
            }
            if (o instanceof a) {
                g g2;
                if ((g2 = ((a)o).a()) == null) {
                    ((a)o).a(this.c);
                    g2 = ((a)o).a();
                }
                if (g2.a != -1 && g2.a <= this.a) {
                    g = g2;
                    if (this.c.c[g2.a] != null) {
                        return g;
                    }
                }
                if (g2.a != -1) {
                    g2.c();
                }
                ++this.a;
                ++this.b;
                g2.a = this.a;
                g2.f = android.support.constraint.a.g.a.a;
                return this.c.c[this.a] = g2;
            }
        }
        return g;
    }
    
    public void a() {
        for (int i = 0; i < this.c.c.length; ++i) {
            final g g = this.c.c[i];
            if (g != null) {
                g.c();
            }
        }
        this.c.b.a(this.m, this.n);
        this.n = 0;
        Arrays.fill(this.c.c, null);
        if (this.e != null) {
            this.e.clear();
        }
        this.a = 0;
        this.f.a.clear();
        this.b = 1;
        for (int j = 0; j < this.k; ++j) {
            this.i[j].c = false;
        }
        this.h();
        this.k = 0;
    }
    
    public void a(final b b) {
        final int n = 0;
        if (b != null) {
            if (this.k + 1 >= this.l || this.b + 1 >= this.h) {
                this.g();
            }
            if (!b.e) {
                this.c(b);
                b.e();
                b.f();
                if (!b.b()) {
                    return;
                }
            }
            if (this.i[this.k] != null) {
                this.c.a.a(this.i[this.k]);
            }
            if (!b.e) {
                b.a();
            }
            this.i[this.k] = b;
            b.a.b = this.k;
            ++this.k;
            final int h = b.a.h;
            if (h > 0) {
                while (this.o.length < h) {
                    this.o = new b[this.o.length * 2];
                }
                final b[] o = this.o;
                int n2 = 0;
                int i;
                while (true) {
                    i = n;
                    if (n2 >= h) {
                        break;
                    }
                    o[n2] = b.a.g[n2];
                    ++n2;
                }
                while (i < h) {
                    final b b2 = o[i];
                    if (b2 != b) {
                        b2.d.a(b2, b);
                        b2.a();
                    }
                    ++i;
                }
            }
        }
    }
    
    void a(final d d) {
        d.a(this);
        this.c(d);
        this.b(d);
        this.i();
    }
    
    public void a(final g g, final int n) {
        final int b = g.b;
        if (g.b == -1) {
            final b b2 = this.b();
            b2.a(g, n);
            this.a(b2);
            return;
        }
        final b b3 = this.i[b];
        if (b3.e) {
            b3.b = n;
            return;
        }
        final b b4 = this.b();
        b4.b(g, n);
        this.a(b4);
    }
    
    public void a(g d, g d2, final int n, final float n2, final g g, final g g2, final int n3, final int n4) {
        final b b = this.b();
        b.a(d, d2, n, n2, g, g2, n3);
        d = this.d();
        d2 = this.d();
        d.c = n4;
        d2.c = n4;
        b.a(d, d2);
        this.a(b);
    }
    
    public void a(final g g, final g g2, final int n, final int c) {
        final b b = this.b();
        final g c2 = this.c();
        c2.c = c;
        b.a(g, g2, c2, n);
        this.a(b);
    }
    
    public int b(final Object o) {
        final g a = ((a)o).a();
        if (a != null) {
            return (int)(a.d + 0.5f);
        }
        return 0;
    }
    
    public b b() {
        final b b = this.c.a.a();
        if (b == null) {
            return new b(this.c);
        }
        b.d();
        return b;
    }
    
    public void b(final g g, final g g2, final int n, final int c) {
        final b b = this.b();
        final g c2 = this.c();
        c2.c = c;
        b.b(g, g2, c2, n);
        this.a(b);
    }
    
    public b c(g d, g d2, final int n, final int n2) {
        final b b = this.b();
        b.a(d, d2, n);
        d = this.d();
        d2 = this.d();
        d.c = n2;
        d2.c = n2;
        b.a(d, d2);
        this.a(b);
        return b;
    }
    
    public g c() {
        if (this.b + 1 >= this.h) {
            this.g();
        }
        final g a = this.a(android.support.constraint.a.g.a.c);
        ++this.a;
        ++this.b;
        a.a = this.a;
        return this.c.c[this.a] = a;
    }
    
    public g d() {
        if (this.b + 1 >= this.h) {
            this.g();
        }
        final g a = this.a(android.support.constraint.a.g.a.d);
        ++this.a;
        ++this.b;
        a.a = this.a;
        return this.c.c[this.a] = a;
    }
    
    public void e() {
        this.a(this.f);
    }
    
    public c f() {
        return this.c;
    }
}
