// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v7.widget;

import android.annotation.TargetApi;
import android.view.View;
import android.os.Build$VERSION;

public class ay
{
    private static final c a;
    
    static {
        if (Build$VERSION.SDK_INT >= 26) {
            a = (c)new a();
            return;
        }
        a = (c)new b();
    }
    
    public static void a(final View view, final CharSequence charSequence) {
        ay.a.a(view, charSequence);
    }
    
    @TargetApi(26)
    private static class a implements c
    {
        @Override
        public void a(final View view, final CharSequence tooltipText) {
            view.setTooltipText(tooltipText);
        }
    }
    
    private static class b implements c
    {
        @Override
        public void a(final View view, final CharSequence charSequence) {
            az.a(view, charSequence);
        }
    }
    
    private interface c
    {
        void a(final View p0, final CharSequence p1);
    }
}
