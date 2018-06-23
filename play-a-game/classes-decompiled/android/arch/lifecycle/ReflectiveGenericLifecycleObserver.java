// 
// Decompiled by Procyon v0.5.30
// 

package android.arch.lifecycle;

import java.util.ArrayList;
import java.util.Iterator;
import java.lang.reflect.Method;
import java.lang.reflect.InvocationTargetException;
import java.util.List;
import java.util.HashMap;
import java.util.Map;

class ReflectiveGenericLifecycleObserver implements android.arch.lifecycle.a
{
    static final Map<Class, a> a;
    private final Object b;
    private final a c;
    
    static {
        a = new HashMap<Class, a>();
    }
    
    ReflectiveGenericLifecycleObserver(final Object b) {
        this.b = b;
        this.c = a(this.b.getClass());
    }
    
    private static a a(final Class clazz) {
        final a a = ReflectiveGenericLifecycleObserver.a.get(clazz);
        if (a != null) {
            return a;
        }
        return b(clazz);
    }
    
    private void a(final a a, final c c, final android.arch.lifecycle.b.a a2) {
        this.a(a.a.get(a2), c, a2);
        this.a(a.a.get(android.arch.lifecycle.b.a.ON_ANY), c, a2);
    }
    
    private void a(final b b, final c c, final android.arch.lifecycle.b.a a) {
        try {
            switch (b.a) {
                case 0: {
                    b.b.invoke(this.b, new Object[0]);
                    return;
                }
                case 1: {
                    goto Label_0064;
                    goto Label_0064;
                }
                case 2: {
                    break;
                }
                default: {
                    return;
                }
            }
        }
        catch (InvocationTargetException ex) {
            throw new RuntimeException("Failed to call observer method", ex.getCause());
        }
        catch (IllegalAccessException ex2) {
            throw new RuntimeException(ex2);
        }
        b.b.invoke(this.b, c, a);
    }
    
    private void a(final List<b> list, final c c, final android.arch.lifecycle.b.a a) {
        if (list != null) {
            for (int i = list.size() - 1; i >= 0; --i) {
                this.a(list.get(i), c, a);
            }
        }
    }
    
    private static void a(final Map<b, android.arch.lifecycle.b.a> map, final b b, final android.arch.lifecycle.b.a a, final Class clazz) {
        final android.arch.lifecycle.b.a a2 = map.get(b);
        if (a2 != null && a != a2) {
            throw new IllegalArgumentException("Method " + b.b.getName() + " in " + clazz.getName() + " already declared with different @OnLifecycleEvent value: previous" + " value " + a2 + ", new value " + a);
        }
        if (a2 == null) {
            map.put(b, a);
        }
    }
    
    private static a b(final Class clazz) {
        final Class superclass = clazz.getSuperclass();
        final HashMap<b, android.arch.lifecycle.b.a> hashMap = new HashMap<b, android.arch.lifecycle.b.a>();
        if (superclass != null) {
            final a a = a(superclass);
            if (a != null) {
                hashMap.putAll((Map<?, ?>)a.b);
            }
        }
        final Method[] declaredMethods = clazz.getDeclaredMethods();
        final Class[] interfaces = clazz.getInterfaces();
        for (int length = interfaces.length, i = 0; i < length; ++i) {
            for (final Map.Entry<b, android.arch.lifecycle.b.a> entry : a(interfaces[i]).b.entrySet()) {
                a(hashMap, entry.getKey(), entry.getValue(), clazz);
            }
        }
        for (int length2 = declaredMethods.length, j = 0; j < length2; ++j) {
            final Method method = declaredMethods[j];
            final f f = method.getAnnotation(f.class);
            if (f != null) {
                final Class<?>[] parameterTypes = method.getParameterTypes();
                int n;
                if (parameterTypes.length > 0) {
                    if (!parameterTypes[0].isAssignableFrom(c.class)) {
                        throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                    }
                    n = 1;
                }
                else {
                    n = 0;
                }
                final android.arch.lifecycle.b.a a2 = f.a();
                if (parameterTypes.length > 1) {
                    if (!parameterTypes[1].isAssignableFrom(android.arch.lifecycle.b.a.class)) {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    }
                    if (a2 != android.arch.lifecycle.b.a.ON_ANY) {
                        throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                    }
                    n = 2;
                }
                if (parameterTypes.length > 2) {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
                a(hashMap, new b(n, method), a2, clazz);
            }
        }
        final a a3 = new a(hashMap);
        ReflectiveGenericLifecycleObserver.a.put(clazz, a3);
        return a3;
    }
    
    @Override
    public void a(final c c, final android.arch.lifecycle.b.a a) {
        this.a(this.c, c, a);
    }
    
    static class a
    {
        final Map<android.arch.lifecycle.b.a, List<b>> a;
        final Map<b, android.arch.lifecycle.b.a> b;
        
        a(final Map<b, android.arch.lifecycle.b.a> b) {
            this.b = b;
            this.a = new HashMap<android.arch.lifecycle.b.a, List<b>>();
            for (final Map.Entry<b, android.arch.lifecycle.b.a> entry : b.entrySet()) {
                final android.arch.lifecycle.b.a a = entry.getValue();
                List<b> list;
                if ((list = this.a.get(a)) == null) {
                    list = new ArrayList<b>();
                    this.a.put(a, list);
                }
                list.add(entry.getKey());
            }
        }
    }
    
    static class b
    {
        final int a;
        final Method b;
        
        b(final int a, final Method b) {
            this.a = a;
            (this.b = b).setAccessible(true);
        }
        
        @Override
        public boolean equals(final Object o) {
            if (this != o) {
                if (o == null || this.getClass() != o.getClass()) {
                    return false;
                }
                final b b = (b)o;
                if (this.a != b.a || !this.b.getName().equals(b.b.getName())) {
                    return false;
                }
            }
            return true;
        }
        
        @Override
        public int hashCode() {
            return this.a * 31 + this.b.getName().hashCode();
        }
    }
}
