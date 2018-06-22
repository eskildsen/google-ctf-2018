// 
// Decompiled by Procyon v0.5.30
// 

package android.support.constraint.a;

import java.util.ArrayList;

public class d
{
    ArrayList<g> a;
    
    public d() {
        this.a = new ArrayList<g>();
    }
    
    private void b(final e e) {
        this.a.clear();
        for (int i = 1; i < e.b; ++i) {
            final g g = e.c.c[i];
            for (int j = 0; j < 6; ++j) {
                g.e[j] = 0.0f;
            }
            g.e[g.c] = 1.0f;
            if (g.f == android.support.constraint.a.g.a.d) {
                this.a.add(g);
            }
        }
    }
    
    g a() {
        final int size = this.a.size();
        int i = 0;
        int n = 0;
        g g = null;
        while (i < size) {
            final g g2 = this.a.get(i);
            for (int j = 5; j >= 0; --j) {
                final float n2 = g2.e[j];
                int n3 = n;
                g g3;
                if ((g3 = g) == null) {
                    n3 = n;
                    g3 = g;
                    if (n2 < 0.0f) {
                        n3 = n;
                        g3 = g;
                        if (j >= n) {
                            n3 = j;
                            g3 = g2;
                        }
                    }
                }
                n = n3;
                g = g3;
                if (n2 > 0.0f) {
                    n = n3;
                    g = g3;
                    if (j > n3) {
                        n = j;
                        g = null;
                    }
                }
            }
            ++i;
        }
        return g;
    }
    
    void a(final e e) {
        this.b(e);
        for (int size = this.a.size(), i = 0; i < size; ++i) {
            final g g = this.a.get(i);
            if (g.b != -1) {
                final a d = e.a(g.b).d;
                for (int a = d.a, j = 0; j < a; ++j) {
                    final g a2 = d.a(j);
                    if (a2 != null) {
                        final float b = d.b(j);
                        for (int k = 0; k < 6; ++k) {
                            final float[] e2 = a2.e;
                            e2[k] += g.e[k] * b;
                        }
                        if (!this.a.contains(a2)) {
                            this.a.add(a2);
                        }
                    }
                }
                g.a();
            }
        }
    }
    
    @Override
    public String toString() {
        final int size = this.a.size();
        String string = "Goal: ";
        for (int i = 0; i < size; ++i) {
            string += this.a.get(i).b();
        }
        return string;
    }
}
