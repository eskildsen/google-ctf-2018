// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v4.h.a;

import java.util.ArrayList;
import android.os.Bundle;
import java.util.List;
import android.os.Build$VERSION;

public class b
{
    private static final a a;
    private final Object b;
    
    static {
        if (Build$VERSION.SDK_INT >= 19) {
            a = (a)new c();
            return;
        }
        if (Build$VERSION.SDK_INT >= 16) {
            a = (a)new b();
            return;
        }
        a = (a)new d();
    }
    
    public b() {
        this.b = android.support.v4.h.a.b.a.a(this);
    }
    
    public b(final Object b) {
        this.b = b;
    }
    
    public android.support.v4.h.a.a a(final int n) {
        return null;
    }
    
    public Object a() {
        return this.b;
    }
    
    public List<android.support.v4.h.a.a> a(final String s, final int n) {
        return null;
    }
    
    public boolean a(final int n, final int n2, final Bundle bundle) {
        return false;
    }
    
    public android.support.v4.h.a.a b(final int n) {
        return null;
    }
    
    interface a
    {
        Object a(final b p0);
    }
    
    private static class b extends d
    {
        @Override
        public Object a(final android.support.v4.h.a.b b) {
            return android.support.v4.h.a.c.a((android.support.v4.h.a.c.a)new android.support.v4.h.a.c.a() {
                @Override
                public Object a(final int n) {
                    final a a = b.a(n);
                    if (a == null) {
                        return null;
                    }
                    return a.a();
                }
                
                @Override
                public List<Object> a(final String s, int i) {
                    final List<a> a = b.a(s, i);
                    if (a == null) {
                        return null;
                    }
                    final ArrayList<Object> list = new ArrayList<Object>();
                    int size;
                    for (size = a.size(), i = 0; i < size; ++i) {
                        list.add(a.get(i).a());
                    }
                    return list;
                }
                
                @Override
                public boolean a(final int n, final int n2, final Bundle bundle) {
                    return b.a(n, n2, bundle);
                }
            });
        }
    }
    
    private static class c extends d
    {
        @Override
        public Object a(final b b) {
            return android.support.v4.h.a.d.a((android.support.v4.h.a.d.a)new android.support.v4.h.a.d.a() {
                @Override
                public Object a(final int n) {
                    final a a = b.a(n);
                    if (a == null) {
                        return null;
                    }
                    return a.a();
                }
                
                @Override
                public List<Object> a(final String s, int i) {
                    final List<a> a = b.a(s, i);
                    if (a == null) {
                        return null;
                    }
                    final ArrayList<Object> list = new ArrayList<Object>();
                    int size;
                    for (size = a.size(), i = 0; i < size; ++i) {
                        list.add(a.get(i).a());
                    }
                    return list;
                }
                
                @Override
                public boolean a(final int n, final int n2, final Bundle bundle) {
                    return b.a(n, n2, bundle);
                }
                
                @Override
                public Object b(final int n) {
                    final a b = b.b(n);
                    if (b == null) {
                        return null;
                    }
                    return b.a();
                }
            });
        }
    }
    
    static class d implements a
    {
        @Override
        public Object a(final b b) {
            return null;
        }
    }
}
