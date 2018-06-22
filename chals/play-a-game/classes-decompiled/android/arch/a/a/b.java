// 
// Decompiled by Procyon v0.5.30
// 

package android.arch.a.a;

import java.util.Iterator;
import java.util.WeakHashMap;
import java.util.Map;

public class b<K, V> implements Iterable<Map.Entry<K, V>>
{
    private c<K, V> a;
    private c<K, V> b;
    private WeakHashMap<Object<K, V>, Boolean> c;
    private int d;
    
    public b() {
        this.c = new WeakHashMap<Object<K, V>, Boolean>();
        this.d = 0;
    }
    
    public int a() {
        return this.d;
    }
    
    public Iterator<Map.Entry<K, V>> b() {
        final b b = new b<K, V>(this.b, this.a);
        this.c.put((Object<K, V>)b, false);
        return (Iterator<Map.Entry<K, V>>)b;
    }
    
    public d c() {
        final d d = new d();
        this.c.put((Object<K, V>)d, false);
        return d;
    }
    
    public Map.Entry<K, V> d() {
        return this.a;
    }
    
    public Map.Entry<K, V> e() {
        return this.b;
    }
    
    @Override
    public boolean equals(final Object o) {
        final boolean b = false;
        boolean b2;
        if (o == this) {
            b2 = true;
        }
        else {
            b2 = b;
            if (o instanceof b) {
                final b b3 = (b)o;
                b2 = b;
                if (this.a() == b3.a()) {
                    final Iterator<Map.Entry<K, V>> iterator = this.iterator();
                    final Iterator iterator2 = b3.iterator();
                    while (iterator.hasNext() && iterator2.hasNext()) {
                        final Map.Entry entry = (Map.Entry)iterator.next();
                        final Object next = iterator2.next();
                        if (entry == null) {
                            b2 = b;
                            if (next != null) {
                                return b2;
                            }
                        }
                        if (entry != null && !entry.equals(next)) {
                            return false;
                        }
                    }
                    return !iterator.hasNext() && !iterator2.hasNext();
                }
            }
        }
        return b2;
    }
    
    @Override
    public Iterator<Map.Entry<K, V>> iterator() {
        final a a = new a<K, V>(this.a, this.b);
        this.c.put((Object<K, V>)a, false);
        return (Iterator<Map.Entry<K, V>>)a;
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("[");
        final Iterator<Map.Entry<?, ?>> iterator = (Iterator<Map.Entry<?, ?>>)this.iterator();
        while (iterator.hasNext()) {
            sb.append(((Map.Entry<?, ?>)iterator.next()).toString());
            if (iterator.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
    
    static class a<K, V> extends e<K, V>
    {
        a(final c<K, V> c, final c<K, V> c2) {
            super(c, c2);
        }
        
        @Override
        c<K, V> a(final c<K, V> c) {
            return c.c;
        }
    }
    
    private static class b<K, V> extends e<K, V>
    {
        b(final c<K, V> c, final c<K, V> c2) {
            super(c, c2);
        }
        
        @Override
        c<K, V> a(final c<K, V> c) {
            return c.d;
        }
    }
    
    static class c<K, V> implements Entry<K, V>
    {
        final K a;
        final V b;
        c<K, V> c;
        c<K, V> d;
        
        @Override
        public boolean equals(final Object o) {
            if (o != this) {
                if (!(o instanceof c)) {
                    return false;
                }
                final c c = (c)o;
                if (!this.a.equals(c.a) || !this.b.equals(c.b)) {
                    return false;
                }
            }
            return true;
        }
        
        @Override
        public K getKey() {
            return this.a;
        }
        
        @Override
        public V getValue() {
            return this.b;
        }
        
        @Override
        public V setValue(final V v) {
            throw new UnsupportedOperationException("An entry modification is not supported");
        }
        
        @Override
        public String toString() {
            return this.a + "=" + this.b;
        }
    }
    
    private class d implements Iterator<Map.Entry<K, V>>
    {
        private c<K, V> b;
        private boolean c;
        
        private d() {
            this.c = true;
        }
        
        public Map.Entry<K, V> a() {
            if (this.c) {
                this.c = false;
                this.b = android.arch.a.a.b.this.a;
            }
            else {
                Map.Entry<K, V> c;
                if (this.b != null) {
                    c = (Map.Entry<K, V>)this.b.c;
                }
                else {
                    c = null;
                }
                this.b = (c<K, V>)c;
            }
            return this.b;
        }
        
        @Override
        public boolean hasNext() {
            if (this.c) {
                if (android.arch.a.a.b.this.a == null) {
                    return false;
                }
            }
            else if (this.b == null || this.b.c == null) {
                return false;
            }
            return true;
        }
    }
    
    private abstract static class e<K, V> implements Iterator<Map.Entry<K, V>>
    {
        c<K, V> a;
        c<K, V> b;
        
        e(final c<K, V> b, final c<K, V> a) {
            this.a = a;
            this.b = b;
        }
        
        private c<K, V> b() {
            if (this.b == this.a || this.a == null) {
                return null;
            }
            return this.a(this.b);
        }
        
        abstract c<K, V> a(final c<K, V> p0);
        
        public Map.Entry<K, V> a() {
            final c<K, V> b = this.b;
            this.b = this.b();
            return b;
        }
        
        @Override
        public boolean hasNext() {
            return this.b != null;
        }
    }
}
