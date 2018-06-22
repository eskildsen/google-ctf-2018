// 
// Decompiled by Procyon v0.5.30
// 

package android.support.constraint.a;

import java.util.Arrays;

public class a
{
    int a;
    private final b b;
    private final c c;
    private int d;
    private g e;
    private int[] f;
    private int[] g;
    private float[] h;
    private int i;
    private int j;
    private boolean k;
    
    a(final b b, final c c) {
        this.a = 0;
        this.d = 8;
        this.e = null;
        this.f = new int[this.d];
        this.g = new int[this.d];
        this.h = new float[this.d];
        this.i = -1;
        this.j = -1;
        this.k = false;
        this.b = b;
        this.c = c;
    }
    
    public final float a(final g g) {
        if (this.e == g) {
            this.e = null;
        }
        if (this.i != -1) {
            int i = this.i;
            int n = 0;
            int n2 = -1;
            while (i != -1 && n < this.a) {
                final int n3 = this.f[i];
                if (n3 == g.a) {
                    if (i == this.i) {
                        this.i = this.g[i];
                    }
                    else {
                        this.g[n2] = this.g[i];
                    }
                    this.c.c[n3].b(this.b);
                    --this.a;
                    this.f[i] = -1;
                    if (this.k) {
                        this.j = i;
                    }
                    return this.h[i];
                }
                final int n4 = this.g[i];
                ++n;
                n2 = i;
                i = n4;
            }
        }
        return 0.0f;
    }
    
    final g a(final int n) {
        for (int i = this.i, n2 = 0; i != -1 && n2 < this.a; i = this.g[i], ++n2) {
            if (n2 == n) {
                return this.c.c[this.f[i]];
            }
        }
        return null;
    }
    
    public final void a() {
        this.i = -1;
        this.j = -1;
        this.k = false;
        this.a = 0;
    }
    
    void a(final float n) {
        for (int i = this.i, n2 = 0; i != -1 && n2 < this.a; i = this.g[i], ++n2) {
            final float[] h = this.h;
            h[i] /= n;
        }
    }
    
    void a(final b b) {
        for (int i = this.i, n = 0; i != -1 && n < this.a; i = this.g[i], ++n) {
            this.c.c[this.f[i]].a(b);
        }
    }
    
    void a(final b b, final b b2) {
        int n = this.i;
        int n2 = 0;
        while (n != -1 && n2 < this.a) {
            if (this.f[n] == b2.a.a) {
                final float n3 = this.h[n];
                this.a(b2.a);
                final a d = b2.d;
                for (int i = d.i, n4 = 0; i != -1 && n4 < d.a; i = d.g[i], ++n4) {
                    this.b(this.c.c[d.f[i]], d.h[i] * n3);
                }
                b.b += b2.b * n3;
                b2.a.b(b);
                n = this.i;
                n2 = 0;
            }
            else {
                n = this.g[n];
                ++n2;
            }
        }
    }
    
    void a(final b b, final b[] array) {
        int n = this.i;
        int n2 = 0;
        while (n != -1 && n2 < this.a) {
            final g g = this.c.c[this.f[n]];
            if (g.b != -1) {
                final float n3 = this.h[n];
                this.a(g);
                final b b2 = array[g.b];
                if (!b2.e) {
                    final a d = b2.d;
                    for (int i = d.i, n4 = 0; i != -1 && n4 < d.a; i = d.g[i], ++n4) {
                        this.b(this.c.c[d.f[i]], d.h[i] * n3);
                    }
                }
                b.b += b2.b * n3;
                b2.a.b(b);
                n = this.i;
                n2 = 0;
            }
            else {
                n = this.g[n];
                ++n2;
            }
        }
    }
    
    public final void a(final g g, final float n) {
        if (n == 0.0f) {
            this.a(g);
        }
        else if (this.i == -1) {
            this.i = 0;
            this.h[this.i] = n;
            this.f[this.i] = g.a;
            this.g[this.i] = -1;
            ++this.a;
            if (!this.k) {
                ++this.j;
            }
        }
        else {
            int i = this.i;
            int n2 = 0;
            int n3 = -1;
            while (i != -1 && n2 < this.a) {
                if (this.f[i] == g.a) {
                    this.h[i] = n;
                    return;
                }
                if (this.f[i] < g.a) {
                    n3 = i;
                }
                i = this.g[i];
                ++n2;
            }
            int n4 = this.j + 1;
            if (this.k) {
                if (this.f[this.j] == -1) {
                    n4 = this.j;
                }
                else {
                    n4 = this.f.length;
                }
            }
            int n5;
            if ((n5 = n4) >= this.f.length) {
                n5 = n4;
                if (this.a < this.f.length) {
                    int n6 = 0;
                    while (true) {
                        n5 = n4;
                        if (n6 >= this.f.length) {
                            break;
                        }
                        if (this.f[n6] == -1) {
                            n5 = n6;
                            break;
                        }
                        ++n6;
                    }
                }
            }
            int length;
            if ((length = n5) >= this.f.length) {
                length = this.f.length;
                this.d *= 2;
                this.k = false;
                this.j = length - 1;
                this.h = Arrays.copyOf(this.h, this.d);
                this.f = Arrays.copyOf(this.f, this.d);
                this.g = Arrays.copyOf(this.g, this.d);
            }
            this.f[length] = g.a;
            this.h[length] = n;
            if (n3 != -1) {
                this.g[length] = this.g[n3];
                this.g[n3] = length;
            }
            else {
                this.g[length] = this.i;
                this.i = length;
            }
            ++this.a;
            if (!this.k) {
                ++this.j;
            }
            if (this.a >= this.f.length) {
                this.k = true;
            }
        }
    }
    
    final float b(final int n) {
        for (int i = this.i, n2 = 0; i != -1 && n2 < this.a; i = this.g[i], ++n2) {
            if (n2 == n) {
                return this.h[i];
            }
        }
        return 0.0f;
    }
    
    void b() {
        for (int i = this.i, n = 0; i != -1 && n < this.a; i = this.g[i], ++n) {
            final float[] h = this.h;
            h[i] *= -1.0f;
        }
    }
    
    public final void b(final g g, final float n) {
        if (n != 0.0f) {
            if (this.i == -1) {
                this.i = 0;
                this.h[this.i] = n;
                this.f[this.i] = g.a;
                this.g[this.i] = -1;
                ++this.a;
                if (!this.k) {
                    ++this.j;
                }
            }
            else {
                int i = this.i;
                int n2 = 0;
                int n3 = -1;
                while (i != -1 && n2 < this.a) {
                    final int n4 = this.f[i];
                    if (n4 == g.a) {
                        final float[] h = this.h;
                        h[i] += n;
                        if (this.h[i] == 0.0f) {
                            if (i == this.i) {
                                this.i = this.g[i];
                            }
                            else {
                                this.g[n3] = this.g[i];
                            }
                            this.c.c[n4].b(this.b);
                            if (this.k) {
                                this.j = i;
                            }
                            --this.a;
                        }
                        return;
                    }
                    else {
                        if (this.f[i] < g.a) {
                            n3 = i;
                        }
                        i = this.g[i];
                        ++n2;
                    }
                }
                int n5 = this.j + 1;
                if (this.k) {
                    if (this.f[this.j] == -1) {
                        n5 = this.j;
                    }
                    else {
                        n5 = this.f.length;
                    }
                }
                int n6;
                if ((n6 = n5) >= this.f.length) {
                    n6 = n5;
                    if (this.a < this.f.length) {
                        int n7 = 0;
                        while (true) {
                            n6 = n5;
                            if (n7 >= this.f.length) {
                                break;
                            }
                            if (this.f[n7] == -1) {
                                n6 = n7;
                                break;
                            }
                            ++n7;
                        }
                    }
                }
                int length;
                if ((length = n6) >= this.f.length) {
                    length = this.f.length;
                    this.d *= 2;
                    this.k = false;
                    this.j = length - 1;
                    this.h = Arrays.copyOf(this.h, this.d);
                    this.f = Arrays.copyOf(this.f, this.d);
                    this.g = Arrays.copyOf(this.g, this.d);
                }
                this.f[length] = g.a;
                this.h[length] = n;
                if (n3 != -1) {
                    this.g[length] = this.g[n3];
                    this.g[n3] = length;
                }
                else {
                    this.g[length] = this.i;
                    this.i = length;
                }
                ++this.a;
                if (!this.k) {
                    ++this.j;
                }
                if (this.j >= this.f.length) {
                    this.k = true;
                    this.j = this.f.length - 1;
                }
            }
        }
    }
    
    final boolean b(final g g) {
        if (this.i != -1) {
            for (int i = this.i, n = 0; i != -1 && n < this.a; i = this.g[i], ++n) {
                if (this.f[i] == g.a) {
                    return true;
                }
            }
        }
        return false;
    }
    
    public final float c(final g g) {
        for (int i = this.i, n = 0; i != -1 && n < this.a; i = this.g[i], ++n) {
            if (this.f[i] == g.a) {
                return this.h[i];
            }
        }
        return 0.0f;
    }
    
    g c() {
        g g = null;
        int i = this.i;
        int n = 0;
        g g2 = null;
    Label_0056_Outer:
        while (i != -1 && n < this.a) {
            float n2 = this.h[i];
            if (n2 < 0.0f) {
                if (n2 > -0.001f) {
                    this.h[i] = 0.0f;
                    n2 = 0.0f;
                }
            }
            else if (n2 < 0.001f) {
                this.h[i] = 0.0f;
                n2 = 0.0f;
            }
        Label_0126_Outer:
            while (true) {
                if (n2 != 0.0f) {
                    final g g3 = this.c.c[this.f[i]];
                    if (g3.f == android.support.constraint.a.g.a.a) {
                        if (n2 < 0.0f) {
                            return g3;
                        }
                        if (g2 == null) {
                            g2 = g3;
                        }
                    }
                    else if (n2 < 0.0f && (g == null || g3.c < g.c)) {
                        g = g3;
                    }
                }
                while (true) {
                    i = this.g[i];
                    ++n;
                    continue Label_0056_Outer;
                    continue;
                }
                continue Label_0126_Outer;
            }
        }
        if (g2 != null) {
            return g2;
        }
        return g;
    }
    
    @Override
    public String toString() {
        String string = "";
        for (int i = this.i, n = 0; i != -1 && n < this.a; i = this.g[i], ++n) {
            string = string + " -> " + this.h[i] + " : " + this.c.c[this.f[i]];
        }
        return string;
    }
}
