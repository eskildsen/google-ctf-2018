// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v4.c;

import android.content.res.Resources;
import android.support.v4.b.a.a;
import android.net.Uri;
import android.support.v4.g.k;
import android.support.v4.f.b;
import android.os.CancellationSignal;
import android.content.Context;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Array;
import android.graphics.Typeface;
import java.util.List;
import java.nio.ByteBuffer;
import java.lang.reflect.Method;
import java.lang.reflect.Constructor;

class e extends g
{
    private static final Class a;
    private static final Constructor b;
    private static final Method c;
    private static final Method d;
    
    static {
        Method c2 = null;
        try {
            final Class<?> forName = Class.forName("android.graphics.FontFamily");
            final Constructor<?> constructor = forName.getConstructor((Class<?>[])new Class[0]);
            final Method method = forName.getMethod("addFontWeightStyle", ByteBuffer.class, Integer.TYPE, List.class, Integer.TYPE, Boolean.TYPE);
            final Method method2 = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(forName, 1).getClass());
            c2 = method;
            b = constructor;
            a = forName;
            c = c2;
            d = method2;
        }
        catch (ClassNotFoundException ex) {}
        catch (NoSuchMethodException method2) {
            goto Label_0101;
        }
    }
    
    private static Typeface a(Object ex) {
        try {
            final Object instance = Array.newInstance(e.a, 1);
            Array.set(instance, 0, ex);
            ex = (InvocationTargetException)e.d.invoke(null, instance);
            return (Typeface)ex;
        }
        catch (IllegalAccessException ex2) {}
        catch (InvocationTargetException ex) {
            goto Label_0036;
        }
    }
    
    public static boolean a() {
        if (e.c == null) {
            Log.w("TypefaceCompatApi24Impl", "Unable to collect necessary private methods.Fallback to legacy implementation.");
        }
        return e.c != null;
    }
    
    private static boolean a(final Object ex, final ByteBuffer byteBuffer, final int n, final int n2, final boolean b) {
        try {
            return (boolean)e.c.invoke(ex, byteBuffer, n, null, n2, b);
        }
        catch (IllegalAccessException ex2) {}
        catch (InvocationTargetException ex) {
            goto Label_0053;
        }
    }
    
    private static Object b() {
        try {
            return e.b.newInstance(new Object[0]);
        }
        catch (InstantiationException ex) {}
        catch (IllegalAccessException instance) {
            goto Label_0014;
        }
        catch (InvocationTargetException instance) {
            goto Label_0014;
        }
    }
    
    @Override
    public Typeface a(final Context context, final CancellationSignal cancellationSignal, final b.b[] array, int i) {
        final Object b = b();
        final k<Uri, ByteBuffer> k = new k<Uri, ByteBuffer>();
        int length;
        b.b b2;
        Uri a;
        ByteBuffer a2;
        for (length = array.length, i = 0; i < length; ++i) {
            b2 = array[i];
            a = b2.a();
            if ((a2 = k.get(a)) == null) {
                a2 = h.a(context, cancellationSignal, a);
                k.put(a, a2);
            }
            if (!a(b, a2, b2.b(), b2.c(), b2.d())) {
                return null;
            }
        }
        return a(b);
    }
    
    @Override
    public Typeface a(final Context context, final android.support.v4.b.a.a.b b, final Resources resources, int i) {
        final Object b2 = b();
        final android.support.v4.b.a.a.c[] a = b.a();
        int length;
        android.support.v4.b.a.a.c c;
        for (length = a.length, i = 0; i < length; ++i) {
            c = a[i];
            if (!a(b2, h.a(context, resources, c.d()), 0, c.b(), c.c())) {
                return null;
            }
        }
        return a(b2);
    }
}
