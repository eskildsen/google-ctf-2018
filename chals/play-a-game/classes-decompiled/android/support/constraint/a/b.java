// 
// Decompiled by Procyon v0.5.30
// 

package android.support.constraint.a;

public class b
{
    g a;
    float b;
    boolean c;
    final a d;
    boolean e;
    
    public b(final c c) {
        this.a = null;
        this.b = 0.0f;
        this.c = false;
        this.e = false;
        this.d = new a(this, c);
    }
    
    public b a(float n, final float n2, final float n3, final g g, final int n4, final g g2, final int n5, final g g3, final int n6, final g g4, final int n7) {
        if (n2 == 0.0f || n == n3) {
            this.b = -n4 - n5 + n6 + n7;
            this.d.a(g, 1.0f);
            this.d.a(g2, -1.0f);
            this.d.a(g4, 1.0f);
            this.d.a(g3, -1.0f);
            return this;
        }
        n = n / n2 / (n3 / n2);
        this.b = -n4 - n5 + n6 * n + n7 * n;
        this.d.a(g, 1.0f);
        this.d.a(g2, -1.0f);
        this.d.a(g4, n);
        this.d.a(g3, -n);
        return this;
    }
    
    b a(final g a, final int n) {
        this.a = a;
        a.d = n;
        this.b = n;
        this.e = true;
        return this;
    }
    
    public b a(final g g, final g g2) {
        this.d.a(g, 1.0f);
        this.d.a(g2, -1.0f);
        return this;
    }
    
    public b a(final g g, final g g2, final int n) {
        boolean b = false;
        final boolean b2 = false;
        if (n != 0) {
            b = b2;
            int n2;
            if ((n2 = n) < 0) {
                n2 = n * -1;
                b = true;
            }
            this.b = n2;
        }
        if (!b) {
            this.d.a(g, -1.0f);
            this.d.a(g2, 1.0f);
            return this;
        }
        this.d.a(g, 1.0f);
        this.d.a(g2, -1.0f);
        return this;
    }
    
    b a(final g g, final g g2, final int n, final float n2, final g g3, final g g4, final int n3) {
        if (g2 == g3) {
            this.d.a(g, 1.0f);
            this.d.a(g4, 1.0f);
            this.d.a(g2, -2.0f);
        }
        else if (n2 == 0.5f) {
            this.d.a(g, 1.0f);
            this.d.a(g2, -1.0f);
            this.d.a(g3, -1.0f);
            this.d.a(g4, 1.0f);
            if (n > 0 || n3 > 0) {
                this.b = -n + n3;
                return this;
            }
        }
        else {
            if (n2 <= 0.0f) {
                this.d.a(g, -1.0f);
                this.d.a(g2, 1.0f);
                this.b = n;
                return this;
            }
            if (n2 >= 1.0f) {
                this.d.a(g3, -1.0f);
                this.d.a(g4, 1.0f);
                this.b = n3;
                return this;
            }
            this.d.a(g, (1.0f - n2) * 1.0f);
            this.d.a(g2, (1.0f - n2) * -1.0f);
            this.d.a(g3, -1.0f * n2);
            this.d.a(g4, 1.0f * n2);
            if (n > 0 || n3 > 0) {
                this.b = -n * (1.0f - n2) + n3 * n2;
                return this;
            }
        }
        return this;
    }
    
    b a(final g g, final g g2, final g g3, final float n) {
        this.d.a(g, -1.0f);
        this.d.a(g2, 1.0f - n);
        this.d.a(g3, n);
        return this;
    }
    
    public b a(final g g, final g g2, final g g3, final int n) {
        boolean b = false;
        final boolean b2 = false;
        if (n != 0) {
            b = b2;
            int n2;
            if ((n2 = n) < 0) {
                n2 = n * -1;
                b = true;
            }
            this.b = n2;
        }
        if (!b) {
            this.d.a(g, -1.0f);
            this.d.a(g2, 1.0f);
            this.d.a(g3, 1.0f);
            return this;
        }
        this.d.a(g, 1.0f);
        this.d.a(g2, -1.0f);
        this.d.a(g3, -1.0f);
        return this;
    }
    
    public b a(final g g, final g g2, final g g3, final g g4, final float n) {
        this.d.a(g, -1.0f);
        this.d.a(g2, 1.0f);
        this.d.a(g3, n);
        this.d.a(g4, -n);
        return this;
    }
    
    void a() {
        this.d.a(this);
    }
    
    boolean a(final b b) {
        this.d.a(this, b);
        return true;
    }
    
    boolean a(final g g) {
        return this.d.b(g);
    }
    
    public b b(final g g, final int n) {
        if (n < 0) {
            this.b = n * -1;
            this.d.a(g, 1.0f);
            return this;
        }
        this.b = n;
        this.d.a(g, -1.0f);
        return this;
    }
    
    public b b(final g g, final g g2, final g g3, final int n) {
        boolean b = false;
        final boolean b2 = false;
        if (n != 0) {
            b = b2;
            int n2;
            if ((n2 = n) < 0) {
                n2 = n * -1;
                b = true;
            }
            this.b = n2;
        }
        if (!b) {
            this.d.a(g, -1.0f);
            this.d.a(g2, 1.0f);
            this.d.a(g3, -1.0f);
            return this;
        }
        this.d.a(g, 1.0f);
        this.d.a(g2, -1.0f);
        this.d.a(g3, 1.0f);
        return this;
    }
    
    void b(final g a) {
        if (this.a != null) {
            this.d.a(this.a, -1.0f);
            this.a = null;
        }
        final float n = this.d.a(a) * -1.0f;
        this.a = a;
        if (n == 1.0f) {
            return;
        }
        this.b /= n;
        this.d.a(n);
    }
    
    boolean b() {
        return this.a != null && (this.a.f == g.a.a || this.b >= 0.0f);
    }
    
    b c(final g g, final int n) {
        this.d.a(g, n);
        return this;
    }
    
    String c() {
        String s;
        if (this.a == null) {
            s = "" + "0";
        }
        else {
            s = "" + this.a;
        }
        String s2 = s + " = ";
        int n;
        if (this.b != 0.0f) {
            s2 += this.b;
            n = 1;
        }
        else {
            n = 0;
        }
        for (int a = this.d.a, i = 0; i < a; ++i) {
            final g a2 = this.d.a(i);
            if (a2 != null) {
                float b = this.d.b(i);
                final String string = a2.toString();
                if (n == 0) {
                    if (b < 0.0f) {
                        s2 += "- ";
                        b *= -1.0f;
                    }
                }
                else if (b > 0.0f) {
                    s2 += " + ";
                }
                else {
                    s2 += " - ";
                    b *= -1.0f;
                }
                if (b == 1.0f) {
                    s2 += string;
                }
                else {
                    s2 = s2 + b + " " + string;
                }
                n = 1;
            }
        }
        String string2 = s2;
        if (n == 0) {
            string2 = s2 + "0.0";
        }
        return string2;
    }
    
    public void d() {
        this.a = null;
        this.d.a();
        this.b = 0.0f;
        this.e = false;
    }
    
    void e() {
        if (this.b < 0.0f) {
            this.b *= -1.0f;
            this.d.b();
        }
    }
    
    void f() {
        final g c = this.d.c();
        if (c != null) {
            this.b(c);
        }
        if (this.d.a == 0) {
            this.e = true;
        }
    }
    
    @Override
    public String toString() {
        return this.c();
    }
}
