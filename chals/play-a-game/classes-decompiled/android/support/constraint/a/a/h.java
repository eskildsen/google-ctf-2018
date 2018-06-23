// 
// Decompiled by Procyon v0.5.30
// 

package android.support.constraint.a.a;

import java.util.ArrayList;

public class h extends b
{
    protected ArrayList<b> aj;
    
    public h() {
        this.aj = new ArrayList<b>();
    }
    
    public void F() {
        this.z();
        if (this.aj != null) {
            for (int size = this.aj.size(), i = 0; i < size; ++i) {
                final b b = this.aj.get(i);
                if (b instanceof h) {
                    ((h)b).F();
                }
            }
        }
    }
    
    public c H() {
        b c = this.c();
        c c2;
        if (this instanceof c) {
            c2 = (c)this;
        }
        else {
            c2 = null;
        }
        while (c != null) {
            final b c3 = c.c();
            if (c instanceof c) {
                c2 = (c)c;
                c = c3;
            }
            else {
                c = c3;
            }
        }
        return c2;
    }
    
    public void I() {
        this.aj.clear();
    }
    
    @Override
    public void a() {
        this.aj.clear();
        super.a();
    }
    
    @Override
    public void a(final android.support.constraint.a.c c) {
        super.a(c);
        for (int size = this.aj.size(), i = 0; i < size; ++i) {
            this.aj.get(i).a(c);
        }
    }
    
    @Override
    public void b(int i, int size) {
        super.b(i, size);
        for (size = this.aj.size(), i = 0; i < size; ++i) {
            this.aj.get(i).b(this.r(), this.s());
        }
    }
    
    public void b(final b b) {
        this.aj.add(b);
        if (b.c() != null) {
            ((h)b.c()).c(b);
        }
        b.a(this);
    }
    
    public void c(final b b) {
        this.aj.remove(b);
        b.a((b)null);
    }
    
    @Override
    public void z() {
        super.z();
        if (this.aj != null) {
            for (int size = this.aj.size(), i = 0; i < size; ++i) {
                final b b = this.aj.get(i);
                b.b(this.n(), this.o());
                if (!(b instanceof c)) {
                    b.z();
                }
            }
        }
    }
}
