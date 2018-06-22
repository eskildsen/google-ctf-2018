// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v7.view.menu;

import android.view.SubMenu;
import android.support.v4.d.a.c;
import android.os.Build$VERSION;
import android.view.MenuItem;
import android.support.v4.d.a.b;
import android.view.Menu;
import android.support.v4.d.a.a;
import android.content.Context;

public final class q
{
    public static Menu a(final Context context, final a a) {
        return (Menu)new r(context, a);
    }
    
    public static MenuItem a(final Context context, final b b) {
        if (Build$VERSION.SDK_INT >= 16) {
            return (MenuItem)new l(context, b);
        }
        return (MenuItem)new k(context, b);
    }
    
    public static SubMenu a(final Context context, final c c) {
        return (SubMenu)new v(context, c);
    }
}
