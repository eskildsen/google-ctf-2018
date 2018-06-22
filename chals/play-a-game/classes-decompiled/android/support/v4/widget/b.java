// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v4.widget;

import android.util.Log;
import java.lang.reflect.Field;
import android.graphics.PorterDuff$Mode;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.widget.CompoundButton;
import android.os.Build$VERSION;

public final class b
{
    private static final c a;
    
    static {
        if (Build$VERSION.SDK_INT >= 23) {
            a = (c)new b();
            return;
        }
        if (Build$VERSION.SDK_INT >= 21) {
            a = (c)new a();
            return;
        }
        a = new c();
    }
    
    public static Drawable a(final CompoundButton compoundButton) {
        return b.a.a(compoundButton);
    }
    
    public static void a(final CompoundButton compoundButton, final ColorStateList list) {
        b.a.a(compoundButton, list);
    }
    
    public static void a(final CompoundButton compoundButton, final PorterDuff$Mode porterDuff$Mode) {
        b.a.a(compoundButton, porterDuff$Mode);
    }
    
    static class a extends c
    {
        @Override
        public void a(final CompoundButton compoundButton, final ColorStateList buttonTintList) {
            compoundButton.setButtonTintList(buttonTintList);
        }
        
        @Override
        public void a(final CompoundButton compoundButton, final PorterDuff$Mode buttonTintMode) {
            compoundButton.setButtonTintMode(buttonTintMode);
        }
    }
    
    static class b extends a
    {
        @Override
        public Drawable a(final CompoundButton compoundButton) {
            return compoundButton.getButtonDrawable();
        }
    }
    
    static class c
    {
        private static Field a;
        private static boolean b;
        
        public Drawable a(final CompoundButton compoundButton) {
            while (true) {
                if (!c.b) {
                    while (true) {
                        try {
                            (c.a = CompoundButton.class.getDeclaredField("mButtonDrawable")).setAccessible(true);
                            c.b = true;
                            if (c.a != null) {
                                final Field field = c.a;
                                final CompoundButton compoundButton2 = compoundButton;
                                final Object o = field.get(compoundButton2);
                                final Drawable drawable = (Drawable)o;
                                return drawable;
                            }
                            return null;
                        }
                        catch (NoSuchFieldException ex) {
                            Log.i("CompoundButtonCompat", "Failed to retrieve mButtonDrawable field", (Throwable)ex);
                            continue;
                        }
                        break;
                    }
                    try {
                        final Field field = c.a;
                        final CompoundButton compoundButton2 = compoundButton;
                        final Object o = field.get(compoundButton2);
                        final Drawable drawable2;
                        final Drawable drawable = drawable2 = (Drawable)o;
                        return drawable2;
                    }
                    catch (IllegalAccessException ex2) {
                        Log.i("CompoundButtonCompat", "Failed to get button drawable via reflection", (Throwable)ex2);
                        c.a = null;
                    }
                    return null;
                }
                continue;
            }
        }
        
        public void a(final CompoundButton compoundButton, final ColorStateList supportButtonTintList) {
            if (compoundButton instanceof k) {
                ((k)compoundButton).setSupportButtonTintList(supportButtonTintList);
            }
        }
        
        public void a(final CompoundButton compoundButton, final PorterDuff$Mode supportButtonTintMode) {
            if (compoundButton instanceof k) {
                ((k)compoundButton).setSupportButtonTintMode(supportButtonTintMode);
            }
        }
    }
}
