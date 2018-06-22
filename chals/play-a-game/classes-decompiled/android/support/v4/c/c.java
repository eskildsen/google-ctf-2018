// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v4.c;

import android.widget.TextView;
import android.support.v4.b.a.a;
import android.support.v4.f.b;
import android.os.CancellationSignal;
import android.content.res.Resources;
import android.content.Context;
import android.os.Build$VERSION;
import android.graphics.Typeface;
import android.support.v4.g.g;

public class c
{
    private static final a a;
    private static final g<String, Typeface> b;
    
    static {
        if (Build$VERSION.SDK_INT >= 26) {
            a = (a)new f();
        }
        else if (Build$VERSION.SDK_INT >= 24 && e.a()) {
            a = (a)new e();
        }
        else if (Build$VERSION.SDK_INT >= 21) {
            a = (a)new d();
        }
        else {
            a = (a)new android.support.v4.c.g();
        }
        b = new g<String, Typeface>(16);
    }
    
    public static Typeface a(final Context context, final Resources resources, final int n, final String s, final int n2) {
        final Typeface a = c.a.a(context, resources, n, s, n2);
        if (a != null) {
            c.b.a(b(resources, n, n2), a);
        }
        return a;
    }
    
    public static Typeface a(final Context context, final CancellationSignal cancellationSignal, final b.b[] array, final int n) {
        return c.a.a(context, cancellationSignal, array, n);
    }
    
    public static Typeface a(final Context context, final android.support.v4.b.a.a.a a, final Resources resources, final int n, final int n2, final TextView textView) {
        Typeface typeface;
        if (a instanceof android.support.v4.b.a.a.d) {
            final android.support.v4.b.a.a.d d = (android.support.v4.b.a.a.d)a;
            typeface = android.support.v4.f.b.a(context, d.a(), textView, d.b(), d.c(), n2);
        }
        else {
            typeface = c.a.a(context, (android.support.v4.b.a.a.b)a, resources, n2);
        }
        if (typeface != null) {
            c.b.a(b(resources, n, n2), typeface);
        }
        return typeface;
    }
    
    public static Typeface a(final Resources resources, final int n, final int n2) {
        return c.b.a(b(resources, n, n2));
    }
    
    private static String b(final Resources resources, final int n, final int n2) {
        return resources.getResourcePackageName(n) + "-" + n + "-" + n2;
    }
    
    interface a
    {
        Typeface a(final Context p0, final Resources p1, final int p2, final String p3, final int p4);
        
        Typeface a(final Context p0, final CancellationSignal p1, final b.b[] p2, final int p3);
        
        Typeface a(final Context p0, final android.support.v4.b.a.a.b p1, final Resources p2, final int p3);
    }
}
