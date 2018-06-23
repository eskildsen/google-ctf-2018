// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v4.c.a;

import android.util.Log;
import java.lang.reflect.Method;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff$Mode;
import android.util.AttributeSet;
import org.xmlpull.v1.XmlPullParser;
import android.content.res.Resources;
import android.content.res.Resources$Theme;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Build$VERSION;

public final class a
{
    static final e a;
    
    static {
        if (Build$VERSION.SDK_INT >= 23) {
            a = (e)new d();
            return;
        }
        if (Build$VERSION.SDK_INT >= 21) {
            a = (e)new c();
            return;
        }
        if (Build$VERSION.SDK_INT >= 19) {
            a = (e)new b();
            return;
        }
        if (Build$VERSION.SDK_INT >= 17) {
            a = (e)new a();
            return;
        }
        a = new e();
    }
    
    public static void a(final Drawable drawable) {
        android.support.v4.c.a.a.a.g(drawable);
    }
    
    public static void a(final Drawable drawable, final float n, final float n2) {
        android.support.v4.c.a.a.a.a(drawable, n, n2);
    }
    
    public static void a(final Drawable drawable, final int n) {
        android.support.v4.c.a.a.a.b(drawable, n);
    }
    
    public static void a(final Drawable drawable, final int n, final int n2, final int n3, final int n4) {
        android.support.v4.c.a.a.a.a(drawable, n, n2, n3, n4);
    }
    
    public static void a(final Drawable drawable, final ColorStateList list) {
        android.support.v4.c.a.a.a.a(drawable, list);
    }
    
    public static void a(final Drawable drawable, final Resources$Theme resources$Theme) {
        android.support.v4.c.a.a.a.a(drawable, resources$Theme);
    }
    
    public static void a(final Drawable drawable, final Resources resources, final XmlPullParser xmlPullParser, final AttributeSet set, final Resources$Theme resources$Theme) {
        android.support.v4.c.a.a.a.a(drawable, resources, xmlPullParser, set, resources$Theme);
    }
    
    public static void a(final Drawable drawable, final PorterDuff$Mode porterDuff$Mode) {
        android.support.v4.c.a.a.a.a(drawable, porterDuff$Mode);
    }
    
    public static void a(final Drawable drawable, final boolean b) {
        android.support.v4.c.a.a.a.a(drawable, b);
    }
    
    public static boolean b(final Drawable drawable) {
        return android.support.v4.c.a.a.a.b(drawable);
    }
    
    public static boolean b(final Drawable drawable, final int n) {
        return android.support.v4.c.a.a.a.a(drawable, n);
    }
    
    public static int c(final Drawable drawable) {
        return android.support.v4.c.a.a.a.d(drawable);
    }
    
    public static boolean d(final Drawable drawable) {
        return android.support.v4.c.a.a.a.e(drawable);
    }
    
    public static ColorFilter e(final Drawable drawable) {
        return android.support.v4.c.a.a.a.f(drawable);
    }
    
    public static Drawable f(final Drawable drawable) {
        return android.support.v4.c.a.a.a.c(drawable);
    }
    
    public static int g(final Drawable drawable) {
        return android.support.v4.c.a.a.a.a(drawable);
    }
    
    static class a extends e
    {
        private static Method a;
        private static boolean b;
        private static Method c;
        private static boolean d;
        
        @Override
        public int a(final Drawable drawable) {
            while (true) {
                if (!android.support.v4.c.a.a.a.d) {
                    while (true) {
                        try {
                            (android.support.v4.c.a.a.a.c = Drawable.class.getDeclaredMethod("getLayoutDirection", (Class<?>[])new Class[0])).setAccessible(true);
                            android.support.v4.c.a.a.a.d = true;
                            if (android.support.v4.c.a.a.a.c != null) {
                                final Method method = android.support.v4.c.a.a.a.c;
                                final Drawable drawable2 = drawable;
                                final int n = 0;
                                final Object[] array = new Object[n];
                                final Object o = method.invoke(drawable2, array);
                                final Integer n2 = (Integer)o;
                                final int intValue = n2;
                                return intValue;
                            }
                            return 0;
                        }
                        catch (NoSuchMethodException ex) {
                            Log.i("DrawableCompatApi17", "Failed to retrieve getLayoutDirection() method", (Throwable)ex);
                            continue;
                        }
                        break;
                    }
                    try {
                        final Method method = android.support.v4.c.a.a.a.c;
                        final Drawable drawable2 = drawable;
                        final int n = 0;
                        final Object[] array = new Object[n];
                        final Object o = method.invoke(drawable2, array);
                        final Integer n2 = (Integer)o;
                        final int intValue2;
                        final int intValue = intValue2 = n2;
                        return intValue2;
                    }
                    catch (Exception ex2) {
                        Log.i("DrawableCompatApi17", "Failed to invoke getLayoutDirection() via reflection", (Throwable)ex2);
                        android.support.v4.c.a.a.a.c = null;
                    }
                    return 0;
                }
                continue;
            }
        }
        
        @Override
        public boolean a(final Drawable drawable, final int n) {
            while (true) {
                if (!android.support.v4.c.a.a.a.b) {
                    while (true) {
                        try {
                            (android.support.v4.c.a.a.a.a = Drawable.class.getDeclaredMethod("setLayoutDirection", Integer.TYPE)).setAccessible(true);
                            android.support.v4.c.a.a.a.b = true;
                            if (android.support.v4.c.a.a.a.a != null) {
                                final Method method = android.support.v4.c.a.a.a.a;
                                final Drawable drawable2 = drawable;
                                final int n2 = 1;
                                final Object[] array = new Object[n2];
                                final int n3 = 0;
                                final int n4 = n;
                                final Integer n5 = n4;
                                array[n3] = n5;
                                method.invoke(drawable2, array);
                                return true;
                            }
                            return false;
                        }
                        catch (NoSuchMethodException ex) {
                            Log.i("DrawableCompatApi17", "Failed to retrieve setLayoutDirection(int) method", (Throwable)ex);
                            continue;
                        }
                        break;
                    }
                    try {
                        final Method method = android.support.v4.c.a.a.a.a;
                        final Drawable drawable2 = drawable;
                        final int n2 = 1;
                        final Object[] array = new Object[n2];
                        final int n3 = 0;
                        final int n4 = n;
                        final Integer n5 = n4;
                        array[n3] = n5;
                        method.invoke(drawable2, array);
                        return true;
                    }
                    catch (Exception ex2) {
                        Log.i("DrawableCompatApi17", "Failed to invoke setLayoutDirection(int) via reflection", (Throwable)ex2);
                        android.support.v4.c.a.a.a.a = null;
                    }
                    return false;
                }
                continue;
            }
        }
    }
    
    static class b extends a
    {
        @Override
        public void a(final Drawable drawable, final boolean autoMirrored) {
            drawable.setAutoMirrored(autoMirrored);
        }
        
        @Override
        public boolean b(final Drawable drawable) {
            return drawable.isAutoMirrored();
        }
        
        @Override
        public Drawable c(final Drawable drawable) {
            Drawable drawable2 = drawable;
            if (!(drawable instanceof f)) {
                drawable2 = new android.support.v4.c.a.d(drawable);
            }
            return drawable2;
        }
        
        @Override
        public int d(final Drawable drawable) {
            return drawable.getAlpha();
        }
    }
    
    static class c extends b
    {
        @Override
        public void a(final Drawable drawable, final float n, final float n2) {
            drawable.setHotspot(n, n2);
        }
        
        @Override
        public void a(final Drawable drawable, final int n, final int n2, final int n3, final int n4) {
            drawable.setHotspotBounds(n, n2, n3, n4);
        }
        
        @Override
        public void a(final Drawable drawable, final ColorStateList tintList) {
            drawable.setTintList(tintList);
        }
        
        @Override
        public void a(final Drawable drawable, final Resources$Theme resources$Theme) {
            drawable.applyTheme(resources$Theme);
        }
        
        @Override
        public void a(final Drawable drawable, final Resources resources, final XmlPullParser xmlPullParser, final AttributeSet set, final Resources$Theme resources$Theme) {
            drawable.inflate(resources, xmlPullParser, set, resources$Theme);
        }
        
        @Override
        public void a(final Drawable drawable, final PorterDuff$Mode tintMode) {
            drawable.setTintMode(tintMode);
        }
        
        @Override
        public void b(final Drawable drawable, final int tint) {
            drawable.setTint(tint);
        }
        
        @Override
        public Drawable c(final Drawable drawable) {
            Drawable drawable2 = drawable;
            if (!(drawable instanceof f)) {
                drawable2 = new android.support.v4.c.a.e(drawable);
            }
            return drawable2;
        }
        
        @Override
        public boolean e(final Drawable drawable) {
            return drawable.canApplyTheme();
        }
        
        @Override
        public ColorFilter f(final Drawable drawable) {
            return drawable.getColorFilter();
        }
    }
    
    static class d extends c
    {
        @Override
        public int a(final Drawable drawable) {
            return drawable.getLayoutDirection();
        }
        
        @Override
        public boolean a(final Drawable drawable, final int layoutDirection) {
            return drawable.setLayoutDirection(layoutDirection);
        }
        
        @Override
        public Drawable c(final Drawable drawable) {
            return drawable;
        }
    }
    
    static class e
    {
        public int a(final Drawable drawable) {
            return 0;
        }
        
        public void a(final Drawable drawable, final float n, final float n2) {
        }
        
        public void a(final Drawable drawable, final int n, final int n2, final int n3, final int n4) {
        }
        
        public void a(final Drawable drawable, final ColorStateList tintList) {
            if (drawable instanceof f) {
                ((f)drawable).setTintList(tintList);
            }
        }
        
        public void a(final Drawable drawable, final Resources$Theme resources$Theme) {
        }
        
        public void a(final Drawable drawable, final Resources resources, final XmlPullParser xmlPullParser, final AttributeSet set, final Resources$Theme resources$Theme) {
            drawable.inflate(resources, xmlPullParser, set);
        }
        
        public void a(final Drawable drawable, final PorterDuff$Mode tintMode) {
            if (drawable instanceof f) {
                ((f)drawable).setTintMode(tintMode);
            }
        }
        
        public void a(final Drawable drawable, final boolean b) {
        }
        
        public boolean a(final Drawable drawable, final int n) {
            return false;
        }
        
        public void b(final Drawable drawable, final int tint) {
            if (drawable instanceof f) {
                ((f)drawable).setTint(tint);
            }
        }
        
        public boolean b(final Drawable drawable) {
            return false;
        }
        
        public Drawable c(final Drawable drawable) {
            Drawable drawable2 = drawable;
            if (!(drawable instanceof f)) {
                drawable2 = new android.support.v4.c.a.c(drawable);
            }
            return drawable2;
        }
        
        public int d(final Drawable drawable) {
            return 0;
        }
        
        public boolean e(final Drawable drawable) {
            return false;
        }
        
        public ColorFilter f(final Drawable drawable) {
            return null;
        }
        
        public void g(final Drawable drawable) {
            drawable.jumpToCurrentState();
        }
    }
}
