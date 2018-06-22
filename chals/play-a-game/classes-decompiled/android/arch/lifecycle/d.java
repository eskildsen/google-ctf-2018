// 
// Decompiled by Procyon v0.5.30
// 

package android.arch.lifecycle;

import java.util.Iterator;
import java.util.Map;
import java.util.ArrayList;
import android.arch.a.a.a;

public class d extends b
{
    private android.arch.a.a.a<Object, a> a;
    private b b;
    private final c c;
    private int d;
    private boolean e;
    private boolean f;
    private ArrayList<b> g;
    
    public d(final c c) {
        this.a = new android.arch.a.a.a<Object, a>();
        this.d = 0;
        this.e = false;
        this.f = false;
        this.g = new ArrayList<b>();
        this.c = c;
        this.b = android.arch.lifecycle.b.b.b;
    }
    
    static b a(final b b, final b b2) {
        if (b2 != null && b2.compareTo(b) < 0) {
            return b2;
        }
        return b;
    }
    
    private boolean a() {
        if (this.a.a() == 0) {
            return true;
        }
        final b a = this.a.d().getValue().a;
        final b a2 = this.a.e().getValue().a;
        return a == a2 && this.b == a2;
    }
    
    static b b(final android.arch.lifecycle.b.a a) {
        switch (d$1.a[a.ordinal()]) {
            default: {
                throw new IllegalArgumentException("Unexpected event value " + a);
            }
            case 1:
            case 2: {
                return b.c;
            }
            case 3:
            case 4: {
                return b.d;
            }
            case 5: {
                return b.e;
            }
            case 6: {
                return b.a;
            }
        }
    }
    
    private void b() {
        this.g.remove(this.g.size() - 1);
    }
    
    private void b(final b b) {
        this.g.add(b);
    }
    
    private static android.arch.lifecycle.b.a c(final b b) {
        switch (d$1.b[b.ordinal()]) {
            default: {
                throw new IllegalArgumentException("Unexpected state value " + b);
            }
            case 1: {
                throw new IllegalArgumentException();
            }
            case 2: {
                return android.arch.lifecycle.b.a.ON_DESTROY;
            }
            case 3: {
                return android.arch.lifecycle.b.a.ON_STOP;
            }
            case 4: {
                return android.arch.lifecycle.b.a.ON_PAUSE;
            }
            case 5: {
                throw new IllegalArgumentException();
            }
        }
    }
    
    private void c() {
        final android.arch.a.a.b.d c = this.a.c();
        while (c.hasNext() && !this.f) {
            final Map.Entry<K, a> entry = ((Iterator<Map.Entry<K, a>>)c).next();
            final a a = entry.getValue();
            while (a.a.compareTo(this.b) < 0 && !this.f && this.a.a(entry.getKey())) {
                this.b(a.a);
                a.a(this.c, d(a.a));
                this.b();
            }
        }
    }
    
    private static android.arch.lifecycle.b.a d(final b b) {
        switch (d$1.b[b.ordinal()]) {
            default: {
                throw new IllegalArgumentException("Unexpected state value " + b);
            }
            case 1:
            case 5: {
                return android.arch.lifecycle.b.a.ON_CREATE;
            }
            case 2: {
                return android.arch.lifecycle.b.a.ON_START;
            }
            case 3: {
                return android.arch.lifecycle.b.a.ON_RESUME;
            }
            case 4: {
                throw new IllegalArgumentException();
            }
        }
    }
    
    private void d() {
        final Iterator<Map.Entry<Object, a>> b = (Iterator<Map.Entry<Object, a>>)this.a.b();
        while (b.hasNext() && !this.f) {
            final Map.Entry<Object, a> entry = b.next();
            final a a = entry.getValue();
            while (a.a.compareTo(this.b) > 0 && !this.f && this.a.a(entry.getKey())) {
                final android.arch.lifecycle.b.a c = c(a.a);
                this.b(b(c));
                a.a(this.c, c);
                this.b();
            }
        }
    }
    
    private void e() {
        while (!this.a()) {
            this.f = false;
            if (this.b.compareTo(this.a.d().getValue().a) < 0) {
                this.d();
            }
            final Map.Entry<Object, a> e = this.a.e();
            if (!this.f && e != null && this.b.compareTo(e.getValue().a) > 0) {
                this.c();
            }
        }
        this.f = false;
    }
    
    public void a(final android.arch.lifecycle.b.a a) {
        this.b = b(a);
        if (this.e || this.d != 0) {
            this.f = true;
            return;
        }
        this.e = true;
        this.e();
        this.e = false;
    }
    
    public void a(final b b) {
        this.b = b;
    }
    
    static class a
    {
        b a;
        android.arch.lifecycle.a b;
        
        void a(final c c, final android.arch.lifecycle.b.a a) {
            final b b = android.arch.lifecycle.d.b(a);
            this.a = android.arch.lifecycle.d.a(this.a, b);
            this.b.a(c, a);
            this.a = b;
        }
    }
}
