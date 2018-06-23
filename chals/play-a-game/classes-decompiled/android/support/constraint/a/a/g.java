// 
// Decompiled by Procyon v0.5.30
// 

package android.support.constraint.a.a;

import java.util.ArrayList;

public class g
{
    private int a;
    private int b;
    private int c;
    private int d;
    private ArrayList<a> e;
    
    public g(final b b) {
        this.e = new ArrayList<a>();
        this.a = b.f();
        this.b = b.g();
        this.c = b.h();
        this.d = b.l();
        final ArrayList<android.support.constraint.a.a.a> y = b.y();
        for (int size = y.size(), i = 0; i < size; ++i) {
            this.e.add(new a(y.get(i)));
        }
    }
    
    public void a(final b b) {
        this.a = b.f();
        this.b = b.g();
        this.c = b.h();
        this.d = b.l();
        for (int size = this.e.size(), i = 0; i < size; ++i) {
            this.e.get(i).a(b);
        }
    }
    
    public void b(final b b) {
        b.b(this.a);
        b.c(this.b);
        b.d(this.c);
        b.e(this.d);
        for (int size = this.e.size(), i = 0; i < size; ++i) {
            this.e.get(i).b(b);
        }
    }
    
    static class a
    {
        private android.support.constraint.a.a.a a;
        private android.support.constraint.a.a.a b;
        private int c;
        private android.support.constraint.a.a.a.b d;
        private int e;
        
        public a(final android.support.constraint.a.a.a a) {
            this.a = a;
            this.b = a.f();
            this.c = a.d();
            this.d = a.e();
            this.e = a.h();
        }
        
        public void a(final b b) {
            this.a = b.a(this.a.c());
            if (this.a != null) {
                this.b = this.a.f();
                this.c = this.a.d();
                this.d = this.a.e();
                this.e = this.a.h();
                return;
            }
            this.b = null;
            this.c = 0;
            this.d = android.support.constraint.a.a.a.b.b;
            this.e = 0;
        }
        
        public void b(final b b) {
            b.a(this.a.c()).a(this.b, this.c, this.d, this.e);
        }
    }
}
