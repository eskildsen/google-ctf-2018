// 
// Decompiled by Procyon v0.5.30
// 

package android.support.constraint.a;

final class f
{
    interface a<T>
    {
        T a();
        
        void a(final T[] p0, final int p1);
        
        boolean a(final T p0);
    }
    
    static class b<T> implements a<T>
    {
        private final Object[] a;
        private int b;
        
        b(final int n) {
            if (n <= 0) {
                throw new IllegalArgumentException("The max pool size must be > 0");
            }
            this.a = new Object[n];
        }
        
        @Override
        public T a() {
            if (this.b > 0) {
                final int n = this.b - 1;
                final Object o = this.a[n];
                this.a[n] = null;
                --this.b;
                return (T)o;
            }
            return null;
        }
        
        @Override
        public void a(final T[] array, int i) {
            int length = i;
            if (i > array.length) {
                length = array.length;
            }
            T t;
            for (i = 0; i < length; ++i) {
                t = array[i];
                if (this.b < this.a.length) {
                    this.a[this.b] = t;
                    ++this.b;
                }
            }
        }
        
        @Override
        public boolean a(final T t) {
            if (this.b < this.a.length) {
                this.a[this.b] = t;
                ++this.b;
                return true;
            }
            return false;
        }
    }
}
