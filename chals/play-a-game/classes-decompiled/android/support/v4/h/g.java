// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v4.h;

import android.graphics.PorterDuff$Mode;
import android.content.res.ColorStateList;
import android.util.Log;
import android.support.v4.d.a.b;
import android.view.MenuItem;
import android.os.Build$VERSION;

public final class g
{
    static final c a;
    
    static {
        if (Build$VERSION.SDK_INT >= 26) {
            a = (c)new a();
            return;
        }
        a = (c)new b();
    }
    
    public static MenuItem a(final MenuItem menuItem, final android.support.v4.h.c c) {
        if (menuItem instanceof android.support.v4.d.a.b) {
            return (MenuItem)((android.support.v4.d.a.b)menuItem).a(c);
        }
        Log.w("MenuItemCompat", "setActionProvider: item does not implement SupportMenuItem; ignoring");
        return menuItem;
    }
    
    public static void a(final MenuItem menuItem, final char c, final int n) {
        if (menuItem instanceof android.support.v4.d.a.b) {
            ((android.support.v4.d.a.b)menuItem).setNumericShortcut(c, n);
            return;
        }
        g.a.b(menuItem, c, n);
    }
    
    public static void a(final MenuItem menuItem, final ColorStateList iconTintList) {
        if (menuItem instanceof android.support.v4.d.a.b) {
            ((android.support.v4.d.a.b)menuItem).setIconTintList(iconTintList);
            return;
        }
        g.a.a(menuItem, iconTintList);
    }
    
    public static void a(final MenuItem menuItem, final PorterDuff$Mode iconTintMode) {
        if (menuItem instanceof android.support.v4.d.a.b) {
            ((android.support.v4.d.a.b)menuItem).setIconTintMode(iconTintMode);
            return;
        }
        g.a.a(menuItem, iconTintMode);
    }
    
    public static void a(final MenuItem menuItem, final CharSequence charSequence) {
        if (menuItem instanceof android.support.v4.d.a.b) {
            ((android.support.v4.d.a.b)menuItem).a(charSequence);
            return;
        }
        g.a.a(menuItem, charSequence);
    }
    
    public static void b(final MenuItem menuItem, final char c, final int n) {
        if (menuItem instanceof android.support.v4.d.a.b) {
            ((android.support.v4.d.a.b)menuItem).setAlphabeticShortcut(c, n);
            return;
        }
        g.a.a(menuItem, c, n);
    }
    
    public static void b(final MenuItem menuItem, final CharSequence charSequence) {
        if (menuItem instanceof android.support.v4.d.a.b) {
            ((android.support.v4.d.a.b)menuItem).b(charSequence);
            return;
        }
        g.a.b(menuItem, charSequence);
    }
    
    static class a extends b
    {
        @Override
        public void a(final MenuItem menuItem, final char c, final int n) {
            menuItem.setAlphabeticShortcut(c, n);
        }
        
        @Override
        public void a(final MenuItem menuItem, final ColorStateList iconTintList) {
            menuItem.setIconTintList(iconTintList);
        }
        
        @Override
        public void a(final MenuItem menuItem, final PorterDuff$Mode iconTintMode) {
            menuItem.setIconTintMode(iconTintMode);
        }
        
        @Override
        public void a(final MenuItem menuItem, final CharSequence contentDescription) {
            menuItem.setContentDescription(contentDescription);
        }
        
        @Override
        public void b(final MenuItem menuItem, final char c, final int n) {
            menuItem.setNumericShortcut(c, n);
        }
        
        @Override
        public void b(final MenuItem menuItem, final CharSequence tooltipText) {
            menuItem.setTooltipText(tooltipText);
        }
    }
    
    static class b implements c
    {
        @Override
        public void a(final MenuItem menuItem, final char c, final int n) {
        }
        
        @Override
        public void a(final MenuItem menuItem, final ColorStateList list) {
        }
        
        @Override
        public void a(final MenuItem menuItem, final PorterDuff$Mode porterDuff$Mode) {
        }
        
        @Override
        public void a(final MenuItem menuItem, final CharSequence charSequence) {
        }
        
        @Override
        public void b(final MenuItem menuItem, final char c, final int n) {
        }
        
        @Override
        public void b(final MenuItem menuItem, final CharSequence charSequence) {
        }
    }
    
    interface c
    {
        void a(final MenuItem p0, final char p1, final int p2);
        
        void a(final MenuItem p0, final ColorStateList p1);
        
        void a(final MenuItem p0, final PorterDuff$Mode p1);
        
        void a(final MenuItem p0, final CharSequence p1);
        
        void b(final MenuItem p0, final char p1, final int p2);
        
        void b(final MenuItem p0, final CharSequence p1);
    }
}
