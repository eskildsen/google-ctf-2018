// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v7.widget;

import java.lang.reflect.InvocationTargetException;
import android.support.v4.h.p;
import android.util.Log;
import android.graphics.Rect;
import android.view.View;
import android.os.Build$VERSION;
import java.lang.reflect.Method;

public class bc
{
    private static Method a;
    
    static {
        if (Build$VERSION.SDK_INT < 18) {
            return;
        }
        try {
            bc.a = View.class.getDeclaredMethod("computeFitSystemWindows", Rect.class, Rect.class);
            if (!bc.a.isAccessible()) {
                bc.a.setAccessible(true);
            }
        }
        catch (NoSuchMethodException ex) {
            Log.d("ViewUtils", "Could not find method computeFitSystemWindows. Oh well.");
        }
    }
    
    public static void a(final View view, final Rect rect, final Rect rect2) {
        if (bc.a == null) {
            return;
        }
        try {
            bc.a.invoke(view, rect, rect2);
        }
        catch (Exception ex) {
            Log.d("ViewUtils", "Could not invoke computeFitSystemWindows", (Throwable)ex);
        }
    }
    
    public static boolean a(final View view) {
        return p.b(view) == 1;
    }
    
    public static void b(final View view) {
        if (Build$VERSION.SDK_INT < 16) {
            return;
        }
        try {
            final Method method = view.getClass().getMethod("makeOptionalFitsSystemWindows", (Class<?>[])new Class[0]);
            if (!method.isAccessible()) {
                method.setAccessible(true);
            }
            method.invoke(view, new Object[0]);
        }
        catch (NoSuchMethodException ex3) {
            Log.d("ViewUtils", "Could not find method makeOptionalFitsSystemWindows. Oh well...");
        }
        catch (InvocationTargetException ex) {
            Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", (Throwable)ex);
        }
        catch (IllegalAccessException ex2) {
            Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", (Throwable)ex2);
        }
    }
}
