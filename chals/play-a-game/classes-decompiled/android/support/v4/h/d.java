// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v4.h;

import android.view.Gravity;
import android.os.Build$VERSION;

public final class d
{
    public static int a(final int n, final int n2) {
        if (Build$VERSION.SDK_INT >= 17) {
            return Gravity.getAbsoluteGravity(n, n2);
        }
        return 0xFF7FFFFF & n;
    }
}
