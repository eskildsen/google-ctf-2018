// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v4.h;

import android.util.Log;
import android.view.View;
import android.view.ViewParent;
import android.os.Build$VERSION;

public final class q
{
    static final c a;
    
    static {
        if (Build$VERSION.SDK_INT >= 21) {
            a = (c)new b();
            return;
        }
        if (Build$VERSION.SDK_INT >= 19) {
            a = (c)new a();
            return;
        }
        a = new c();
    }
    
    public static void a(final ViewParent viewParent, final View view, final int n) {
        if (viewParent instanceof l) {
            ((l)viewParent).a(view, n);
        }
        else if (n == 0) {
            q.a.a(viewParent, view);
        }
    }
    
    public static void a(final ViewParent viewParent, final View view, final int n, final int n2, final int n3, final int n4, final int n5) {
        if (viewParent instanceof l) {
            ((l)viewParent).a(view, n, n2, n3, n4, n5);
        }
        else if (n5 == 0) {
            q.a.a(viewParent, view, n, n2, n3, n4);
        }
    }
    
    public static void a(final ViewParent viewParent, final View view, final int n, final int n2, final int[] array, final int n3) {
        if (viewParent instanceof l) {
            ((l)viewParent).a(view, n, n2, array, n3);
        }
        else if (n3 == 0) {
            q.a.a(viewParent, view, n, n2, array);
        }
    }
    
    public static boolean a(final ViewParent viewParent, final View view, final float n, final float n2) {
        return q.a.a(viewParent, view, n, n2);
    }
    
    public static boolean a(final ViewParent viewParent, final View view, final float n, final float n2, final boolean b) {
        return q.a.a(viewParent, view, n, n2, b);
    }
    
    public static boolean a(final ViewParent viewParent, final View view, final View view2, final int n, final int n2) {
        if (viewParent instanceof l) {
            return ((l)viewParent).a(view, view2, n, n2);
        }
        return n2 == 0 && q.a.a(viewParent, view, view2, n);
    }
    
    public static void b(final ViewParent viewParent, final View view, final View view2, final int n, final int n2) {
        if (viewParent instanceof l) {
            ((l)viewParent).b(view, view2, n, n2);
        }
        else if (n2 == 0) {
            q.a.b(viewParent, view, view2, n);
        }
    }
    
    static class a extends c
    {
    }
    
    static class b extends a
    {
        @Override
        public void a(final ViewParent viewParent, final View view) {
            try {
                viewParent.onStopNestedScroll(view);
            }
            catch (AbstractMethodError abstractMethodError) {
                Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface " + "method onStopNestedScroll", (Throwable)abstractMethodError);
            }
        }
        
        @Override
        public void a(final ViewParent viewParent, final View view, final int n, final int n2, final int n3, final int n4) {
            try {
                viewParent.onNestedScroll(view, n, n2, n3, n4);
            }
            catch (AbstractMethodError abstractMethodError) {
                Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface " + "method onNestedScroll", (Throwable)abstractMethodError);
            }
        }
        
        @Override
        public void a(final ViewParent viewParent, final View view, final int n, final int n2, final int[] array) {
            try {
                viewParent.onNestedPreScroll(view, n, n2, array);
            }
            catch (AbstractMethodError abstractMethodError) {
                Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface " + "method onNestedPreScroll", (Throwable)abstractMethodError);
            }
        }
        
        @Override
        public boolean a(final ViewParent viewParent, final View view, final float n, final float n2) {
            try {
                return viewParent.onNestedPreFling(view, n, n2);
            }
            catch (AbstractMethodError abstractMethodError) {
                Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface " + "method onNestedPreFling", (Throwable)abstractMethodError);
                return false;
            }
        }
        
        @Override
        public boolean a(final ViewParent viewParent, final View view, final float n, final float n2, final boolean b) {
            try {
                return viewParent.onNestedFling(view, n, n2, b);
            }
            catch (AbstractMethodError abstractMethodError) {
                Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface " + "method onNestedFling", (Throwable)abstractMethodError);
                return false;
            }
        }
        
        @Override
        public boolean a(final ViewParent viewParent, final View view, final View view2, final int n) {
            try {
                return viewParent.onStartNestedScroll(view, view2, n);
            }
            catch (AbstractMethodError abstractMethodError) {
                Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface " + "method onStartNestedScroll", (Throwable)abstractMethodError);
                return false;
            }
        }
        
        @Override
        public void b(final ViewParent viewParent, final View view, final View view2, final int n) {
            try {
                viewParent.onNestedScrollAccepted(view, view2, n);
            }
            catch (AbstractMethodError abstractMethodError) {
                Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface " + "method onNestedScrollAccepted", (Throwable)abstractMethodError);
            }
        }
    }
    
    static class c
    {
        public void a(final ViewParent viewParent, final View view) {
            if (viewParent instanceof k) {
                ((k)viewParent).onStopNestedScroll(view);
            }
        }
        
        public void a(final ViewParent viewParent, final View view, final int n, final int n2, final int n3, final int n4) {
            if (viewParent instanceof k) {
                ((k)viewParent).onNestedScroll(view, n, n2, n3, n4);
            }
        }
        
        public void a(final ViewParent viewParent, final View view, final int n, final int n2, final int[] array) {
            if (viewParent instanceof k) {
                ((k)viewParent).onNestedPreScroll(view, n, n2, array);
            }
        }
        
        public boolean a(final ViewParent viewParent, final View view, final float n, final float n2) {
            return viewParent instanceof k && ((k)viewParent).onNestedPreFling(view, n, n2);
        }
        
        public boolean a(final ViewParent viewParent, final View view, final float n, final float n2, final boolean b) {
            return viewParent instanceof k && ((k)viewParent).onNestedFling(view, n, n2, b);
        }
        
        public boolean a(final ViewParent viewParent, final View view, final View view2, final int n) {
            return viewParent instanceof k && ((k)viewParent).onStartNestedScroll(view, view2, n);
        }
        
        public void b(final ViewParent viewParent, final View view, final View view2, final int n) {
            if (viewParent instanceof k) {
                ((k)viewParent).onNestedScrollAccepted(view, view2, n);
            }
        }
    }
}
