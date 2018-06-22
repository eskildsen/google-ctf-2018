// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v7.view;

import java.util.Iterator;
import android.view.View;
import android.support.v4.h.t;
import android.view.animation.Interpolator;
import android.support.v4.h.s;
import android.support.v4.h.r;
import java.util.ArrayList;

public class h
{
    final ArrayList<r> a;
    s b;
    private long c;
    private Interpolator d;
    private boolean e;
    private final t f;
    
    public h() {
        this.c = -1L;
        this.f = new t() {
            private boolean b = false;
            private int c = 0;
            
            void a() {
                this.c = 0;
                this.b = false;
                h.this.b();
            }
            
            @Override
            public void a(final View view) {
                if (!this.b) {
                    this.b = true;
                    if (h.this.b != null) {
                        h.this.b.a(null);
                    }
                }
            }
            
            @Override
            public void b(final View view) {
                final int c = this.c + 1;
                this.c = c;
                if (c == h.this.a.size()) {
                    if (h.this.b != null) {
                        h.this.b.b(null);
                    }
                    this.a();
                }
            }
        };
        this.a = new ArrayList<r>();
    }
    
    public h a(final long c) {
        if (!this.e) {
            this.c = c;
        }
        return this;
    }
    
    public h a(final r r) {
        if (!this.e) {
            this.a.add(r);
        }
        return this;
    }
    
    public h a(final r r, final r r2) {
        this.a.add(r);
        r2.b(r.a());
        this.a.add(r2);
        return this;
    }
    
    public h a(final s b) {
        if (!this.e) {
            this.b = b;
        }
        return this;
    }
    
    public h a(final Interpolator d) {
        if (!this.e) {
            this.d = d;
        }
        return this;
    }
    
    public void a() {
        if (this.e) {
            return;
        }
        for (final r r : this.a) {
            if (this.c >= 0L) {
                r.a(this.c);
            }
            if (this.d != null) {
                r.a(this.d);
            }
            if (this.b != null) {
                r.a(this.f);
            }
            r.c();
        }
        this.e = true;
    }
    
    void b() {
        this.e = false;
    }
    
    public void c() {
        if (!this.e) {
            return;
        }
        final Iterator<r> iterator = this.a.iterator();
        while (iterator.hasNext()) {
            iterator.next().b();
        }
        this.e = false;
    }
}
