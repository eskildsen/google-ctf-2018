// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v4.a;

import android.view.LayoutInflater;
import java.io.PrintWriter;
import java.io.FileDescriptor;
import android.view.View;
import android.support.v4.g.k;
import android.os.Handler;
import android.content.Context;
import android.app.Activity;

public abstract class l<E> extends j
{
    private final Activity a;
    final Context b;
    final int c;
    final n d;
    private final Handler e;
    private k<String, u> f;
    private boolean g;
    private v h;
    private boolean i;
    private boolean j;
    
    l(final Activity a, final Context b, final Handler e, final int c) {
        this.d = new n();
        this.a = a;
        this.b = b;
        this.e = e;
        this.c = c;
    }
    
    l(final i i) {
        this(i, (Context)i, i.c, 0);
    }
    
    v a(final String s, final boolean b, final boolean b2) {
        if (this.f == null) {
            this.f = new k<String, u>();
        }
        final v v = this.f.get(s);
        v v3;
        if (v == null && b2) {
            final v v2 = new v(s, this, b);
            this.f.put(s, v2);
            v3 = v2;
        }
        else {
            v3 = v;
            if (b && (v3 = v) != null) {
                v3 = v;
                if (!v.e) {
                    v.b();
                    return v;
                }
            }
        }
        return v3;
    }
    
    @Override
    public View a(final int n) {
        return null;
    }
    
    void a(final k<String, u> f) {
        if (f != null) {
            for (int size = f.size(), i = 0; i < size; ++i) {
                f.c(i).a(this);
            }
        }
        this.f = f;
    }
    
    void a(final String s) {
        if (this.f != null) {
            final v v = this.f.get(s);
            if (v != null && !v.f) {
                v.h();
                this.f.remove(s);
            }
        }
    }
    
    public void a(final String s, final FileDescriptor fileDescriptor, final PrintWriter printWriter, final String[] array) {
    }
    
    void a(final boolean g) {
        this.g = g;
        if (this.h == null || !this.j) {
            return;
        }
        this.j = false;
        if (g) {
            this.h.d();
            return;
        }
        this.h.c();
    }
    
    @Override
    public boolean a() {
        return true;
    }
    
    public boolean a(final h h) {
        return true;
    }
    
    public LayoutInflater b() {
        return (LayoutInflater)this.b.getSystemService("layout_inflater");
    }
    
    void b(final h h) {
    }
    
    void b(final String s, final FileDescriptor fileDescriptor, final PrintWriter printWriter, final String[] array) {
        printWriter.print(s);
        printWriter.print("mLoadersStarted=");
        printWriter.println(this.j);
        if (this.h != null) {
            printWriter.print(s);
            printWriter.print("Loader Manager ");
            printWriter.print(Integer.toHexString(System.identityHashCode(this.h)));
            printWriter.println(":");
            this.h.a(s + "  ", fileDescriptor, printWriter, array);
        }
    }
    
    public void c() {
    }
    
    public boolean d() {
        return true;
    }
    
    public int e() {
        return this.c;
    }
    
    Activity f() {
        return this.a;
    }
    
    Context g() {
        return this.b;
    }
    
    Handler h() {
        return this.e;
    }
    
    n i() {
        return this.d;
    }
    
    boolean j() {
        return this.g;
    }
    
    void k() {
        if (this.j) {
            return;
        }
        this.j = true;
        if (this.h != null) {
            this.h.b();
        }
        else if (!this.i) {
            this.h = this.a("(root)", this.j, false);
            if (this.h != null && !this.h.e) {
                this.h.b();
            }
        }
        this.i = true;
    }
    
    void l() {
        if (this.h == null) {
            return;
        }
        this.h.h();
    }
    
    void m() {
        if (this.f != null) {
            final int size = this.f.size();
            final v[] array = new v[size];
            for (int i = size - 1; i >= 0; --i) {
                array[i] = (v)this.f.c(i);
            }
            for (int j = 0; j < size; ++j) {
                final v v = array[j];
                v.e();
                v.g();
            }
        }
    }
    
    k<String, u> n() {
        int n = 0;
        int n3;
        if (this.f != null) {
            final int size = this.f.size();
            final v[] array = new v[size];
            for (int i = size - 1; i >= 0; --i) {
                array[i] = (v)this.f.c(i);
            }
            final boolean j = this.j();
            int n2 = 0;
            while (true) {
                n3 = n2;
                if (n >= size) {
                    break;
                }
                final v v = array[n];
                if (!v.f && j) {
                    if (!v.e) {
                        v.b();
                    }
                    v.d();
                }
                if (v.f) {
                    n2 = 1;
                }
                else {
                    v.h();
                    this.f.remove(v.d);
                }
                ++n;
            }
        }
        else {
            n3 = 0;
        }
        if (n3 != 0) {
            return this.f;
        }
        return null;
    }
}
