// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v4.widget;

import android.support.v4.h.d;
import android.support.v4.h.p;
import java.lang.reflect.Method;
import android.util.Log;
import java.lang.reflect.Field;
import android.view.View;
import android.widget.PopupWindow;
import android.os.Build$VERSION;

public final class i
{
    static final d a;
    
    static {
        if (Build$VERSION.SDK_INT >= 23) {
            a = (d)new c();
            return;
        }
        if (Build$VERSION.SDK_INT >= 21) {
            a = (d)new b();
            return;
        }
        if (Build$VERSION.SDK_INT >= 19) {
            a = (d)new a();
            return;
        }
        a = new d();
    }
    
    public static void a(final PopupWindow popupWindow, final int n) {
        i.a.a(popupWindow, n);
    }
    
    public static void a(final PopupWindow popupWindow, final View view, final int n, final int n2, final int n3) {
        i.a.a(popupWindow, view, n, n2, n3);
    }
    
    public static void a(final PopupWindow popupWindow, final boolean b) {
        i.a.a(popupWindow, b);
    }
    
    static class a extends d
    {
        @Override
        public void a(final PopupWindow popupWindow, final View view, final int n, final int n2, final int n3) {
            popupWindow.showAsDropDown(view, n, n2, n3);
        }
    }
    
    static class b extends a
    {
        private static Field a;
        
        static {
            try {
                (b.a = PopupWindow.class.getDeclaredField("mOverlapAnchor")).setAccessible(true);
            }
            catch (NoSuchFieldException ex) {
                Log.i("PopupWindowCompatApi21", "Could not fetch mOverlapAnchor field from PopupWindow", (Throwable)ex);
            }
        }
        
        @Override
        public void a(final PopupWindow popupWindow, final boolean b) {
            if (i.b.a == null) {
                return;
            }
            try {
                i.b.a.set(popupWindow, b);
            }
            catch (IllegalAccessException ex) {
                Log.i("PopupWindowCompatApi21", "Could not set overlap anchor field in PopupWindow", (Throwable)ex);
            }
        }
    }
    
    static class c extends b
    {
        @Override
        public void a(final PopupWindow popupWindow, final int windowLayoutType) {
            popupWindow.setWindowLayoutType(windowLayoutType);
        }
        
        @Override
        public void a(final PopupWindow popupWindow, final boolean overlapAnchor) {
            popupWindow.setOverlapAnchor(overlapAnchor);
        }
    }
    
    static class d
    {
        private static Method a;
        private static boolean b;
        
        public void a(final PopupWindow ex, final int n) {
            Label_0037: {
                if (d.b) {
                    break Label_0037;
                }
                while (true) {
                    try {
                        (d.a = PopupWindow.class.getDeclaredMethod("setWindowLayoutType", Integer.TYPE)).setAccessible(true);
                        d.b = true;
                        if (d.a == null) {
                            return;
                        }
                        try {
                            d.a.invoke(ex, n);
                        }
                        catch (Exception ex) {}
                    }
                    catch (Exception ex2) {
                        continue;
                    }
                    break;
                }
            }
        }
        
        public void a(final PopupWindow popupWindow, final View view, final int n, final int n2, final int n3) {
            int n4 = n;
            if ((android.support.v4.h.d.a(n3, p.b(view)) & 0x7) == 0x5) {
                n4 = n - (popupWindow.getWidth() - view.getWidth());
            }
            popupWindow.showAsDropDown(view, n4, n2);
        }
        
        public void a(final PopupWindow popupWindow, final boolean b) {
        }
    }
}
