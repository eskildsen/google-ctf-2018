// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v4.d.a;

import android.graphics.PorterDuff$Mode;
import android.content.res.ColorStateList;
import android.view.View;
import android.support.v4.h.c;
import android.view.MenuItem;

public interface b extends MenuItem
{
    b a(final c p0);
    
    b a(final CharSequence p0);
    
    c a();
    
    b b(final CharSequence p0);
    
    boolean collapseActionView();
    
    boolean expandActionView();
    
    View getActionView();
    
    int getAlphabeticModifiers();
    
    CharSequence getContentDescription();
    
    ColorStateList getIconTintList();
    
    PorterDuff$Mode getIconTintMode();
    
    int getNumericModifiers();
    
    CharSequence getTooltipText();
    
    boolean isActionViewExpanded();
    
    MenuItem setActionView(final int p0);
    
    MenuItem setActionView(final View p0);
    
    MenuItem setAlphabeticShortcut(final char p0, final int p1);
    
    MenuItem setIconTintList(final ColorStateList p0);
    
    MenuItem setIconTintMode(final PorterDuff$Mode p0);
    
    MenuItem setNumericShortcut(final char p0, final int p1);
    
    MenuItem setShortcut(final char p0, final char p1, final int p2, final int p3);
    
    void setShowAsAction(final int p0);
    
    MenuItem setShowAsActionFlags(final int p0);
}
