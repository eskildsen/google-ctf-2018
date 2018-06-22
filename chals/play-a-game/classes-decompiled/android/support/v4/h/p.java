// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v4.h;

import android.view.View$AccessibilityDelegate;
import android.animation.ValueAnimator;
import java.util.WeakHashMap;
import java.lang.reflect.Field;
import android.view.View$OnApplyWindowInsetsListener;
import android.view.WindowInsets;
import android.graphics.drawable.Drawable;
import android.graphics.PorterDuff$Mode;
import android.content.res.ColorStateList;
import android.view.View;
import android.os.Build$VERSION;

public class p
{
    static final j a;
    
    static {
        if (Build$VERSION.SDK_INT >= 26) {
            a = (j)new i();
            return;
        }
        if (Build$VERSION.SDK_INT >= 24) {
            a = (j)new h();
            return;
        }
        if (Build$VERSION.SDK_INT >= 23) {
            a = (j)new g();
            return;
        }
        if (Build$VERSION.SDK_INT >= 21) {
            a = (j)new f();
            return;
        }
        if (Build$VERSION.SDK_INT >= 19) {
            a = (j)new e();
            return;
        }
        if (Build$VERSION.SDK_INT >= 18) {
            a = (j)new d();
            return;
        }
        if (Build$VERSION.SDK_INT >= 17) {
            a = (j)new c();
            return;
        }
        if (Build$VERSION.SDK_INT >= 16) {
            a = (j)new b();
            return;
        }
        if (Build$VERSION.SDK_INT >= 15) {
            a = (j)new a();
            return;
        }
        a = new j();
    }
    
    public static v a(final View view, final v v) {
        return p.a.a(view, v);
    }
    
    public static void a(final View view) {
        p.a.b(view);
    }
    
    public static void a(final View view, final float n) {
        p.a.a(view, n);
    }
    
    public static void a(final View view, final int n, final int n2) {
        p.a.a(view, n, n2);
    }
    
    public static void a(final View view, final ColorStateList list) {
        p.a.a(view, list);
    }
    
    public static void a(final View view, final PorterDuff$Mode porterDuff$Mode) {
        p.a.a(view, porterDuff$Mode);
    }
    
    public static void a(final View view, final Drawable drawable) {
        p.a.a(view, drawable);
    }
    
    public static void a(final View view, final android.support.v4.h.b b) {
        p.a.a(view, b);
    }
    
    public static void a(final View view, final n n) {
        p.a.a(view, n);
    }
    
    public static void a(final View view, final Runnable runnable) {
        p.a.a(view, runnable);
    }
    
    public static void a(final View view, final Runnable runnable, final long n) {
        p.a.a(view, runnable, n);
    }
    
    public static int b(final View view) {
        return p.a.f(view);
    }
    
    public static int c(final View view) {
        return p.a.c(view);
    }
    
    public static r d(final View view) {
        return p.a.n(view);
    }
    
    public static String e(final View view) {
        return p.a.j(view);
    }
    
    public static int f(final View view) {
        return p.a.g(view);
    }
    
    public static void g(final View view) {
        p.a.d(view);
    }
    
    public static boolean h(final View view) {
        return p.a.e(view);
    }
    
    public static ColorStateList i(final View view) {
        return p.a.l(view);
    }
    
    public static PorterDuff$Mode j(final View view) {
        return p.a.m(view);
    }
    
    public static void k(final View view) {
        p.a.k(view);
    }
    
    public static boolean l(final View view) {
        return p.a.h(view);
    }
    
    public static boolean m(final View view) {
        return p.a.i(view);
    }
    
    public static boolean n(final View view) {
        return p.a.a(view);
    }
    
    static class a extends j
    {
        @Override
        public boolean a(final View view) {
            return view.hasOnClickListeners();
        }
    }
    
    static class b extends a
    {
        @Override
        public void a(final View view, final Drawable background) {
            view.setBackground(background);
        }
        
        @Override
        public void a(final View view, final Runnable runnable) {
            view.postOnAnimation(runnable);
        }
        
        @Override
        public void a(final View view, final Runnable runnable, final long n) {
            view.postOnAnimationDelayed(runnable, n);
        }
        
        @Override
        public void b(final View view) {
            view.postInvalidateOnAnimation();
        }
        
        @Override
        public int c(final View view) {
            return view.getMinimumHeight();
        }
        
        @Override
        public void d(final View view) {
            view.requestFitSystemWindows();
        }
        
        @Override
        public boolean e(final View view) {
            return view.hasOverlappingRendering();
        }
    }
    
    static class c extends b
    {
        @Override
        public int f(final View view) {
            return view.getLayoutDirection();
        }
        
        @Override
        public int g(final View view) {
            return view.getWindowSystemUiVisibility();
        }
    }
    
    static class d extends c
    {
    }
    
    static class e extends d
    {
        @Override
        public boolean h(final View view) {
            return view.isLaidOut();
        }
        
        @Override
        public boolean i(final View view) {
            return view.isAttachedToWindow();
        }
    }
    
    static class f extends e
    {
        @Override
        public v a(final View view, final v v) {
            final WindowInsets windowInsets = (WindowInsets)v.a(v);
            final WindowInsets onApplyWindowInsets = view.onApplyWindowInsets(windowInsets);
            WindowInsets windowInsets2 = windowInsets;
            if (onApplyWindowInsets != windowInsets) {
                windowInsets2 = new WindowInsets(onApplyWindowInsets);
            }
            return v.a(windowInsets2);
        }
        
        @Override
        public void a(final View view, final float elevation) {
            view.setElevation(elevation);
        }
        
        @Override
        public void a(final View view, final ColorStateList backgroundTintList) {
            view.setBackgroundTintList(backgroundTintList);
            if (Build$VERSION.SDK_INT == 21) {
                final Drawable background = view.getBackground();
                boolean b;
                if (view.getBackgroundTintList() != null && view.getBackgroundTintMode() != null) {
                    b = true;
                }
                else {
                    b = false;
                }
                if (background != null && b) {
                    if (background.isStateful()) {
                        background.setState(view.getDrawableState());
                    }
                    view.setBackground(background);
                }
            }
        }
        
        @Override
        public void a(final View view, final PorterDuff$Mode backgroundTintMode) {
            view.setBackgroundTintMode(backgroundTintMode);
            if (Build$VERSION.SDK_INT == 21) {
                final Drawable background = view.getBackground();
                boolean b;
                if (view.getBackgroundTintList() != null && view.getBackgroundTintMode() != null) {
                    b = true;
                }
                else {
                    b = false;
                }
                if (background != null && b) {
                    if (background.isStateful()) {
                        background.setState(view.getDrawableState());
                    }
                    view.setBackground(background);
                }
            }
        }
        
        @Override
        public void a(final View view, final n n) {
            if (n == null) {
                view.setOnApplyWindowInsetsListener((View$OnApplyWindowInsetsListener)null);
                return;
            }
            view.setOnApplyWindowInsetsListener((View$OnApplyWindowInsetsListener)new View$OnApplyWindowInsetsListener() {
                public WindowInsets onApplyWindowInsets(final View view, final WindowInsets windowInsets) {
                    return (WindowInsets)v.a(n.a(view, v.a(windowInsets)));
                }
            });
        }
        
        @Override
        public void d(final View view) {
            view.requestApplyInsets();
        }
        
        @Override
        public String j(final View view) {
            return view.getTransitionName();
        }
        
        @Override
        public void k(final View view) {
            view.stopNestedScroll();
        }
        
        @Override
        public ColorStateList l(final View view) {
            return view.getBackgroundTintList();
        }
        
        @Override
        public PorterDuff$Mode m(final View view) {
            return view.getBackgroundTintMode();
        }
    }
    
    static class g extends f
    {
        @Override
        public void a(final View view, final int n, final int n2) {
            view.setScrollIndicators(n, n2);
        }
    }
    
    static class h extends g
    {
    }
    
    static class i extends h
    {
    }
    
    static class j
    {
        static boolean b;
        private static Field c;
        private static boolean d;
        private static WeakHashMap<View, String> e;
        WeakHashMap<View, r> a;
        
        static {
            j.b = false;
        }
        
        j() {
            this.a = null;
        }
        
        long a() {
            return ValueAnimator.getFrameDelay();
        }
        
        public v a(final View view, final v v) {
            return v;
        }
        
        public void a(final View view, final float n) {
        }
        
        public void a(final View view, final int n, final int n2) {
        }
        
        public void a(final View view, final ColorStateList supportBackgroundTintList) {
            if (view instanceof o) {
                ((o)view).setSupportBackgroundTintList(supportBackgroundTintList);
            }
        }
        
        public void a(final View view, final PorterDuff$Mode supportBackgroundTintMode) {
            if (view instanceof o) {
                ((o)view).setSupportBackgroundTintMode(supportBackgroundTintMode);
            }
        }
        
        public void a(final View view, final Drawable backgroundDrawable) {
            view.setBackgroundDrawable(backgroundDrawable);
        }
        
        public void a(final View view, final android.support.v4.h.b b) {
            View$AccessibilityDelegate a;
            if (b == null) {
                a = null;
            }
            else {
                a = b.a();
            }
            view.setAccessibilityDelegate(a);
        }
        
        public void a(final View view, final n n) {
        }
        
        public void a(final View view, final Runnable runnable) {
            view.postDelayed(runnable, this.a());
        }
        
        public void a(final View view, final Runnable runnable, final long n) {
            view.postDelayed(runnable, this.a() + n);
        }
        
        public boolean a(final View view) {
            return false;
        }
        
        public void b(final View view) {
            view.postInvalidate();
        }
        
        public int c(final View view) {
            Label_0027: {
                if (j.d) {
                    break Label_0027;
                }
                while (true) {
                    try {
                        (j.c = View.class.getDeclaredField("mMinHeight")).setAccessible(true);
                        j.d = true;
                        if (j.c != null) {
                            try {
                                return (int)j.c.get(view);
                            }
                            catch (Exception ex) {}
                        }
                        return 0;
                    }
                    catch (NoSuchFieldException ex2) {
                        continue;
                    }
                    break;
                }
            }
        }
        
        public void d(final View view) {
        }
        
        public boolean e(final View view) {
            return true;
        }
        
        public int f(final View view) {
            return 0;
        }
        
        public int g(final View view) {
            return 0;
        }
        
        public boolean h(final View view) {
            return view.getWidth() > 0 && view.getHeight() > 0;
        }
        
        public boolean i(final View view) {
            return view.getWindowToken() != null;
        }
        
        public String j(final View view) {
            if (j.e == null) {
                return null;
            }
            return j.e.get(view);
        }
        
        public void k(final View view) {
            if (view instanceof android.support.v4.h.h) {
                ((android.support.v4.h.h)view).stopNestedScroll();
            }
        }
        
        public ColorStateList l(final View view) {
            if (view instanceof o) {
                return ((o)view).getSupportBackgroundTintList();
            }
            return null;
        }
        
        public PorterDuff$Mode m(final View view) {
            if (view instanceof o) {
                return ((o)view).getSupportBackgroundTintMode();
            }
            return null;
        }
        
        public r n(final View view) {
            if (this.a == null) {
                this.a = new WeakHashMap<View, r>();
            }
            r r;
            if ((r = this.a.get(view)) == null) {
                r = new r(view);
                this.a.put(view, r);
            }
            return r;
        }
    }
}
