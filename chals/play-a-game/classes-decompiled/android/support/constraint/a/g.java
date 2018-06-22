// 
// Decompiled by Procyon v0.5.30
// 

package android.support.constraint.a;

import java.util.Arrays;

public class g
{
    private static int i;
    public int a;
    int b;
    public int c;
    public float d;
    float[] e;
    a f;
    b[] g;
    int h;
    private String j;
    
    static {
        g.i = 1;
    }
    
    public g(final a f) {
        this.a = -1;
        this.b = -1;
        this.c = 0;
        this.e = new float[6];
        this.g = new b[8];
        this.h = 0;
        this.f = f;
    }
    
    void a() {
        for (int i = 0; i < 6; ++i) {
            this.e[i] = 0.0f;
        }
    }
    
    void a(final b b) {
        for (int i = 0; i < this.h; ++i) {
            if (this.g[i] == b) {
                return;
            }
        }
        if (this.h >= this.g.length) {
            this.g = Arrays.copyOf(this.g, this.g.length * 2);
        }
        this.g[this.h] = b;
        ++this.h;
    }
    
    public void a(final a f) {
        this.f = f;
    }
    
    String b() {
        String s = this + "[";
        for (int i = 0; i < this.e.length; ++i) {
            final String string = s + this.e[i];
            if (i < this.e.length - 1) {
                s = string + ", ";
            }
            else {
                s = string + "] ";
            }
        }
        return s;
    }
    
    void b(final b b) {
        int i = 0;
        for (int j = 0; j < this.h; ++j) {
            if (this.g[j] == b) {
                while (i < this.h - j - 1) {
                    this.g[j + i] = this.g[j + i + 1];
                    ++i;
                }
                --this.h;
                break;
            }
        }
    }
    
    public void c() {
        this.j = null;
        this.f = android.support.constraint.a.g.a.e;
        this.c = 0;
        this.a = -1;
        this.b = -1;
        this.d = 0.0f;
        this.h = 0;
    }
    
    @Override
    public String toString() {
        return "" + this.j;
    }
    
    public enum a
    {
        a, 
        b, 
        c, 
        d, 
        e;
    }
}
