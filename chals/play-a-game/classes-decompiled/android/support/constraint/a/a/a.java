// 
// Decompiled by Procyon v0.5.30
// 

package android.support.constraint.a.a;

import android.support.constraint.a.c;
import java.util.HashSet;
import android.support.constraint.a.g;

public class a
{
    final android.support.constraint.a.a.b a;
    final c b;
    a c;
    public int d;
    int e;
    g f;
    int g;
    private b h;
    private a i;
    private int j;
    
    public a(final android.support.constraint.a.a.b a, final c b) {
        this.d = 0;
        this.e = -1;
        this.h = android.support.constraint.a.a.a.b.a;
        this.i = android.support.constraint.a.a.a.a.a;
        this.j = 0;
        this.g = Integer.MAX_VALUE;
        this.a = a;
        this.b = b;
    }
    
    private String a(final HashSet<a> set) {
        if (set.add(this)) {
            final StringBuilder append = new StringBuilder().append(this.a.e()).append(":").append(this.b.toString());
            String string;
            if (this.c != null) {
                string = " connected to " + this.c.a(set);
            }
            else {
                string = "";
            }
            return append.append(string).toString();
        }
        return "<-";
    }
    
    public g a() {
        return this.f;
    }
    
    public void a(final a i) {
        this.i = i;
    }
    
    public void a(final android.support.constraint.a.c c) {
        if (this.f == null) {
            this.f = new g(android.support.constraint.a.g.a.a);
            return;
        }
        this.f.c();
    }
    
    public boolean a(final a a) {
        boolean b = true;
        if (a != null) {
            final c c = a.c();
            if (c != this.b) {
                boolean b2 = false;
                switch (a$1.a[this.b.ordinal()]) {
                    default: {
                        return false;
                    }
                    case 1: {
                        if (c == android.support.constraint.a.a.a.c.f || c == android.support.constraint.a.a.a.c.h || c == android.support.constraint.a.a.a.c.i) {
                            b = false;
                        }
                        return b;
                    }
                    case 2:
                    case 3: {
                        b2 = (c == android.support.constraint.a.a.a.c.b || c == android.support.constraint.a.a.a.c.d);
                        if (!(a.b() instanceof d)) {
                            break;
                        }
                        if (b2 || c == android.support.constraint.a.a.a.c.h) {
                            return true;
                        }
                        return false;
                    }
                    case 4:
                    case 5: {
                        final boolean b3 = b2 = (c == android.support.constraint.a.a.a.c.c || c == android.support.constraint.a.a.a.c.e);
                        if (!(a.b() instanceof d)) {
                            break;
                        }
                        if (b3 || c == android.support.constraint.a.a.a.c.i) {
                            return true;
                        }
                        return false;
                    }
                }
                return b2;
            }
            if (this.b != android.support.constraint.a.a.a.c.g && (this.b != android.support.constraint.a.a.a.c.f || (a.b().v() && this.b().v()))) {
                return true;
            }
        }
        return false;
    }
    
    public boolean a(final a c, final int d, final int e, final b h, final int j, final boolean b) {
        if (c == null) {
            this.c = null;
            this.d = 0;
            this.e = -1;
            this.h = android.support.constraint.a.a.a.b.a;
            this.j = 2;
            return true;
        }
        if (!b && !this.a(c)) {
            return false;
        }
        this.c = c;
        if (d > 0) {
            this.d = d;
        }
        else {
            this.d = 0;
        }
        this.e = e;
        this.h = h;
        this.j = j;
        return true;
    }
    
    public boolean a(final a a, final int n, final b b, final int n2) {
        return this.a(a, n, -1, b, n2, false);
    }
    
    public android.support.constraint.a.a.b b() {
        return this.a;
    }
    
    public c c() {
        return this.b;
    }
    
    public int d() {
        if (this.a.d() == 8) {
            return 0;
        }
        if (this.e > -1 && this.c != null && this.c.a.d() == 8) {
            return this.e;
        }
        return this.d;
    }
    
    public b e() {
        return this.h;
    }
    
    public a f() {
        return this.c;
    }
    
    public a g() {
        return this.i;
    }
    
    public int h() {
        return this.j;
    }
    
    public void i() {
        this.c = null;
        this.d = 0;
        this.e = -1;
        this.h = android.support.constraint.a.a.a.b.b;
        this.j = 0;
        this.i = android.support.constraint.a.a.a.a.a;
    }
    
    public boolean j() {
        return this.c != null;
    }
    
    @Override
    public String toString() {
        final HashSet<a> set = new HashSet<a>();
        final StringBuilder append = new StringBuilder().append(this.a.e()).append(":").append(this.b.toString());
        String string;
        if (this.c != null) {
            string = " connected to " + this.c.a(set);
        }
        else {
            string = "";
        }
        return append.append(string).toString();
    }
    
    public enum a
    {
        a, 
        b;
    }
    
    public enum b
    {
        a, 
        b, 
        c;
    }
    
    public enum c
    {
        a, 
        b, 
        c, 
        d, 
        e, 
        f, 
        g, 
        h, 
        i;
    }
}
