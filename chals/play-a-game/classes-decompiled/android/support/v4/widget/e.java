// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v4.widget;

import android.widget.EdgeEffect;
import android.os.Build$VERSION;

public final class e
{
    private static final b a;
    
    static {
        if (Build$VERSION.SDK_INT >= 21) {
            a = (b)new a();
            return;
        }
        a = new b();
    }
    
    public static void a(final EdgeEffect edgeEffect, final float n, final float n2) {
        e.a.a(edgeEffect, n, n2);
    }
    
    static class a extends b
    {
        @Override
        public void a(final EdgeEffect edgeEffect, final float n, final float n2) {
            edgeEffect.onPull(n, n2);
        }
    }
    
    static class b
    {
        public void a(final EdgeEffect edgeEffect, final float n, final float n2) {
            edgeEffect.onPull(n);
        }
    }
}
