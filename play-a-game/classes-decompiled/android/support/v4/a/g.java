// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v4.a;

import java.lang.reflect.InvocationTargetException;
import android.util.Log;
import java.lang.reflect.Method;
import android.os.Build$VERSION;
import android.os.IBinder;
import android.os.Bundle;

public final class g
{
    public static IBinder a(final Bundle bundle, final String s) {
        if (Build$VERSION.SDK_INT >= 18) {
            return bundle.getBinder(s);
        }
        return a.a(bundle, s);
    }
    
    static class a
    {
        private static Method a;
        private static boolean b;
        
        public static IBinder a(Bundle ex, final String s) {
            Label_0036: {
                if (g.a.b) {
                    break Label_0036;
                }
                while (true) {
                    try {
                        (g.a.a = Bundle.class.getMethod("getIBinder", String.class)).setAccessible(true);
                        g.a.b = true;
                        if (g.a.a != null) {
                            final Method method = g.a.a;
                            final IllegalArgumentException ex2 = ex;
                            final int n = 1;
                            final Object[] array = new Object[n];
                            final int n2 = 0;
                            final String s2 = s;
                            array[n2] = s2;
                            final Object o = method.invoke(ex2, array);
                            final IBinder binder = (IBinder)o;
                            final IBinder binder2;
                            ex = (IllegalArgumentException)(binder2 = binder);
                            return binder2;
                        }
                        goto Label_0090;
                    }
                    catch (NoSuchMethodException ex3) {
                        Log.i("BundleCompatBaseImpl", "Failed to retrieve getIBinder method", (Throwable)ex3);
                        continue;
                    }
                    break;
                }
            }
            try {
                final Method method = g.a.a;
                final IllegalArgumentException ex2 = ex;
                final int n = 1;
                final Object[] array = new Object[n];
                final int n2 = 0;
                final String s2 = s;
                array[n2] = s2;
                final Object o = method.invoke(ex2, array);
                final IBinder binder = (IBinder)o;
                final IBinder binder2;
                ex = (IllegalArgumentException)(binder2 = binder);
                return binder2;
            }
            catch (IllegalAccessException ex4) {}
            catch (IllegalArgumentException ex) {
                goto Label_0077;
            }
            catch (InvocationTargetException ex) {
                goto Label_0077;
            }
        }
    }
}
