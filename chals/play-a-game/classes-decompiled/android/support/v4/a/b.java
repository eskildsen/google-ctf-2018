// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v4.a;

import android.app.AppOpsManager;
import android.os.Build$VERSION;
import android.content.Context;

public final class b
{
    public static int a(final Context context, final String s, final String s2) {
        if (Build$VERSION.SDK_INT >= 23) {
            return ((AppOpsManager)context.getSystemService((Class)AppOpsManager.class)).noteProxyOp(s, s2);
        }
        return 1;
    }
    
    public static String a(final String s) {
        if (Build$VERSION.SDK_INT >= 23) {
            return AppOpsManager.permissionToOp(s);
        }
        return null;
    }
}
