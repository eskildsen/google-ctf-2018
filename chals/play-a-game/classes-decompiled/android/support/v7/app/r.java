// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v7.app;

import android.view.View$MeasureSpec;
import android.support.v7.widget.bc;
import android.view.accessibility.AccessibilityEvent;
import android.view.MotionEvent;
import android.view.ViewGroup$MarginLayoutParams;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.ActionMenuView;
import android.support.v7.view.menu.o;
import android.view.ViewGroup$LayoutParams;
import android.support.v7.widget.d;
import android.view.View$OnClickListener;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.support.v7.widget.aw;
import android.widget.TextView;
import android.widget.LinearLayout;
import android.view.MenuItem;
import android.support.v7.view.g;
import android.view.MenuInflater;
import java.lang.ref.WeakReference;
import android.view.ContextThemeWrapper;
import android.util.TypedValue;
import android.view.Menu;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.content.res.Configuration;
import android.support.v7.widget.Toolbar;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.support.v4.h.p;
import android.support.v4.h.t;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.app.Dialog;
import android.app.Activity;
import android.support.v4.h.u;
import android.support.v4.h.s;
import android.support.v7.view.h;
import android.support.v7.view.b;
import android.support.v7.widget.ap;
import android.view.View;
import android.support.v7.widget.ActionBarContextView;
import android.support.v7.widget.ad;
import android.support.v7.widget.ActionBarContainer;
import android.content.Context;
import java.util.ArrayList;
import android.view.animation.Interpolator;
import android.support.v7.widget.ActionBarOverlayLayout;

public class r extends android.support.v7.app.a implements ActionBarOverlayLayout.a
{
    private static final Interpolator t;
    private static final Interpolator u;
    private boolean A;
    private boolean B;
    private ArrayList<android.support.v7.app.a.b> C;
    private boolean D;
    private int E;
    private boolean F;
    private boolean G;
    private boolean H;
    Context a;
    ActionBarOverlayLayout b;
    ActionBarContainer c;
    ad d;
    ActionBarContextView e;
    View f;
    ap g;
    a h;
    b i;
    android.support.v7.view.b.a j;
    boolean k;
    boolean l;
    boolean m;
    h n;
    boolean o;
    final s p;
    final s q;
    final u r;
    private Context v;
    private Activity w;
    private Dialog x;
    private ArrayList<Object> y;
    private int z;
    
    static {
        s = !r.class.desiredAssertionStatus();
        t = (Interpolator)new AccelerateInterpolator();
        u = (Interpolator)new DecelerateInterpolator();
    }
    
    public r(final Activity w, final boolean b) {
        this.y = new ArrayList<Object>();
        this.z = -1;
        this.C = new ArrayList<android.support.v7.app.a.b>();
        this.E = 0;
        this.k = true;
        this.G = true;
        this.p = new t() {
            @Override
            public void b(final View view) {
                if (android.support.v7.app.r.this.k && android.support.v7.app.r.this.f != null) {
                    android.support.v7.app.r.this.f.setTranslationY(0.0f);
                    android.support.v7.app.r.this.c.setTranslationY(0.0f);
                }
                android.support.v7.app.r.this.c.setVisibility(8);
                android.support.v7.app.r.this.c.setTransitioning(false);
                android.support.v7.app.r.this.n = null;
                android.support.v7.app.r.this.h();
                if (android.support.v7.app.r.this.b != null) {
                    android.support.v4.h.p.g((View)android.support.v7.app.r.this.b);
                }
            }
        };
        this.q = new t() {
            @Override
            public void b(final View view) {
                android.support.v7.app.r.this.n = null;
                android.support.v7.app.r.this.c.requestLayout();
            }
        };
        this.r = new u() {
            @Override
            public void a(final View view) {
                ((View)android.support.v7.app.r.this.c.getParent()).invalidate();
            }
        };
        this.w = w;
        final View decorView = w.getWindow().getDecorView();
        this.a(decorView);
        if (!b) {
            this.f = decorView.findViewById(16908290);
        }
    }
    
    public r(final Dialog x) {
        this.y = new ArrayList<Object>();
        this.z = -1;
        this.C = new ArrayList<android.support.v7.app.a.b>();
        this.E = 0;
        this.k = true;
        this.G = true;
        this.p = new t() {
            @Override
            public void b(final View view) {
                if (android.support.v7.app.r.this.k && android.support.v7.app.r.this.f != null) {
                    android.support.v7.app.r.this.f.setTranslationY(0.0f);
                    android.support.v7.app.r.this.c.setTranslationY(0.0f);
                }
                android.support.v7.app.r.this.c.setVisibility(8);
                android.support.v7.app.r.this.c.setTransitioning(false);
                android.support.v7.app.r.this.n = null;
                android.support.v7.app.r.this.h();
                if (android.support.v7.app.r.this.b != null) {
                    android.support.v4.h.p.g((View)android.support.v7.app.r.this.b);
                }
            }
        };
        this.q = new t() {
            @Override
            public void b(final View view) {
                android.support.v7.app.r.this.n = null;
                android.support.v7.app.r.this.c.requestLayout();
            }
        };
        this.r = new u() {
            @Override
            public void a(final View view) {
                ((View)android.support.v7.app.r.this.c.getParent()).invalidate();
            }
        };
        this.x = x;
        this.a(x.getWindow().getDecorView());
    }
    
    private void a(final View view) {
        this.b = (ActionBarOverlayLayout)view.findViewById(android.support.v7.a.a.f.decor_content_parent);
        if (this.b != null) {
            this.b.setActionBarVisibilityCallback((ActionBarOverlayLayout.a)this);
        }
        this.d = this.b(view.findViewById(android.support.v7.a.a.f.action_bar));
        this.e = (ActionBarContextView)view.findViewById(android.support.v7.a.a.f.action_context_bar);
        this.c = (ActionBarContainer)view.findViewById(android.support.v7.a.a.f.action_bar_container);
        if (this.d == null || this.e == null || this.c == null) {
            throw new IllegalStateException(this.getClass().getSimpleName() + " can only be used " + "with a compatible window decor layout");
        }
        this.a = this.d.b();
        boolean b;
        if ((this.d.o() & 0x4) != 0x0) {
            b = true;
        }
        else {
            b = false;
        }
        if (b) {
            this.A = true;
        }
        final android.support.v7.view.a a = android.support.v7.view.a.a(this.a);
        this.a(a.f() || b);
        this.k(a.d());
        final TypedArray obtainStyledAttributes = this.a.obtainStyledAttributes((AttributeSet)null, android.support.v7.a.a.j.ActionBar, android.support.v7.a.a.a.actionBarStyle, 0);
        if (obtainStyledAttributes.getBoolean(android.support.v7.a.a.j.ActionBar_hideOnContentScroll, false)) {
            this.b(true);
        }
        final int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(android.support.v7.a.a.j.ActionBar_elevation, 0);
        if (dimensionPixelSize != 0) {
            this.a((float)dimensionPixelSize);
        }
        obtainStyledAttributes.recycle();
    }
    
    static boolean a(final boolean b, final boolean b2, final boolean b3) {
        return b3 || (!b && !b2);
    }
    
    private ad b(final View view) {
        if (view instanceof ad) {
            return (ad)view;
        }
        if (view instanceof Toolbar) {
            return ((Toolbar)view).getWrapper();
        }
        String simpleName;
        if ("Can't make a decor toolbar out of " + view != null) {
            simpleName = view.getClass().getSimpleName();
        }
        else {
            simpleName = "null";
        }
        throw new IllegalStateException(simpleName);
    }
    
    private void k(final boolean d) {
        final boolean b = true;
        if (!(this.D = d)) {
            this.d.a((ap)null);
            this.c.setTabContainer(this.g);
        }
        else {
            this.c.setTabContainer(null);
            this.d.a(this.g);
        }
        boolean b2;
        if (this.i() == 2) {
            b2 = true;
        }
        else {
            b2 = false;
        }
        if (this.g != null) {
            if (b2) {
                this.g.setVisibility(0);
                if (this.b != null) {
                    android.support.v4.h.p.g((View)this.b);
                }
            }
            else {
                this.g.setVisibility(8);
            }
        }
        this.d.a(!this.D && b2);
        this.b.setHasNonEmbeddedTabs(!this.D && b2 && b);
    }
    
    private void l(final boolean b) {
        if (a(this.l, this.m, this.F)) {
            if (!this.G) {
                this.G = true;
                this.h(b);
            }
        }
        else if (this.G) {
            this.G = false;
            this.i(b);
        }
    }
    
    private void n() {
        if (!this.F) {
            this.F = true;
            if (this.b != null) {
                this.b.setShowingForActionMode(true);
            }
            this.l(false);
        }
    }
    
    private void o() {
        if (this.F) {
            this.F = false;
            if (this.b != null) {
                this.b.setShowingForActionMode(false);
            }
            this.l(false);
        }
    }
    
    private boolean p() {
        return android.support.v4.h.p.l((View)this.c);
    }
    
    @Override
    public int a() {
        return this.d.o();
    }
    
    @Override
    public b a(final android.support.v7.view.b.a a) {
        if (this.h != null) {
            this.h.c();
        }
        this.b.setHideOnContentScrollEnabled(false);
        this.e.c();
        final a h = new a(this.e.getContext(), a);
        if (h.e()) {
            (this.h = h).d();
            this.e.a(h);
            this.j(true);
            this.e.sendAccessibilityEvent(32);
            return h;
        }
        return null;
    }
    
    @Override
    public void a(final float n) {
        android.support.v4.h.p.a((View)this.c, n);
    }
    
    @Override
    public void a(final int e) {
        this.E = e;
    }
    
    public void a(final int n, final int n2) {
        final int o = this.d.o();
        if ((n2 & 0x4) != 0x0) {
            this.A = true;
        }
        this.d.c((o & ~n2) | (n & n2));
    }
    
    @Override
    public void a(final Configuration configuration) {
        this.k(android.support.v7.view.a.a(this.a).d());
    }
    
    @Override
    public void a(final CharSequence charSequence) {
        this.d.a(charSequence);
    }
    
    @Override
    public void a(final boolean b) {
        this.d.b(b);
    }
    
    @Override
    public boolean a(final int n, final KeyEvent keyEvent) {
        if (this.h != null) {
            final Menu b = this.h.b();
            if (b != null) {
                int deviceId;
                if (keyEvent != null) {
                    deviceId = keyEvent.getDeviceId();
                }
                else {
                    deviceId = -1;
                }
                b.setQwertyMode(KeyCharacterMap.load(deviceId).getKeyboardType() != 1);
                return b.performShortcut(n, keyEvent, 0);
            }
        }
        return false;
    }
    
    @Override
    public Context b() {
        if (this.v == null) {
            final TypedValue typedValue = new TypedValue();
            this.a.getTheme().resolveAttribute(android.support.v7.a.a.a.actionBarWidgetTheme, typedValue, true);
            final int resourceId = typedValue.resourceId;
            if (resourceId != 0) {
                this.v = (Context)new ContextThemeWrapper(this.a, resourceId);
            }
            else {
                this.v = this.a;
            }
        }
        return this.v;
    }
    
    @Override
    public void b(final boolean b) {
        if (b && !this.b.a()) {
            throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
        }
        this.o = b;
        this.b.setHideOnContentScrollEnabled(b);
    }
    
    @Override
    public void c(final boolean b) {
        if (!this.A) {
            this.f(b);
        }
    }
    
    @Override
    public void d(final boolean h) {
        this.H = h;
        if (!h && this.n != null) {
            this.n.c();
        }
    }
    
    @Override
    public void e(final boolean b) {
        if (b != this.B) {
            this.B = b;
            for (int size = this.C.size(), i = 0; i < size; ++i) {
                this.C.get(i).a(b);
            }
        }
    }
    
    public void f(final boolean b) {
        int n;
        if (b) {
            n = 4;
        }
        else {
            n = 0;
        }
        this.a(n, 4);
    }
    
    @Override
    public boolean f() {
        if (this.d != null && this.d.c()) {
            this.d.d();
            return true;
        }
        return false;
    }
    
    @Override
    public void g(final boolean k) {
        this.k = k;
    }
    
    void h() {
        if (this.j != null) {
            this.j.a(this.i);
            this.i = null;
            this.j = null;
        }
    }
    
    public void h(final boolean b) {
        if (this.n != null) {
            this.n.c();
        }
        this.c.setVisibility(0);
        if (this.E == 0 && (this.H || b)) {
            this.c.setTranslationY(0.0f);
            float n2;
            final float n = n2 = -this.c.getHeight();
            if (b) {
                final int[] array2;
                final int[] array = array2 = new int[2];
                array2[1] = (array2[0] = 0);
                this.c.getLocationInWindow(array);
                n2 = n - array[1];
            }
            this.c.setTranslationY(n2);
            final h n3 = new h();
            final android.support.v4.h.r b2 = android.support.v4.h.p.d((View)this.c).b(0.0f);
            b2.a(this.r);
            n3.a(b2);
            if (this.k && this.f != null) {
                this.f.setTranslationY(n2);
                n3.a(android.support.v4.h.p.d(this.f).b(0.0f));
            }
            n3.a(android.support.v7.app.r.u);
            n3.a(250L);
            n3.a(this.q);
            (this.n = n3).a();
        }
        else {
            this.c.setAlpha(1.0f);
            this.c.setTranslationY(0.0f);
            if (this.k && this.f != null) {
                this.f.setTranslationY(0.0f);
            }
            this.q.b(null);
        }
        if (this.b != null) {
            android.support.v4.h.p.g((View)this.b);
        }
    }
    
    public int i() {
        return this.d.p();
    }
    
    public void i(final boolean b) {
        if (this.n != null) {
            this.n.c();
        }
        if (this.E == 0 && (this.H || b)) {
            this.c.setAlpha(1.0f);
            this.c.setTransitioning(true);
            final h n = new h();
            float n3;
            final float n2 = n3 = -this.c.getHeight();
            if (b) {
                final int[] array2;
                final int[] array = array2 = new int[2];
                array2[1] = (array2[0] = 0);
                this.c.getLocationInWindow(array);
                n3 = n2 - array[1];
            }
            final android.support.v4.h.r b2 = android.support.v4.h.p.d((View)this.c).b(n3);
            b2.a(this.r);
            n.a(b2);
            if (this.k && this.f != null) {
                n.a(android.support.v4.h.p.d(this.f).b(n3));
            }
            n.a(android.support.v7.app.r.t);
            n.a(250L);
            n.a(this.p);
            (this.n = n).a();
            return;
        }
        this.p.b(null);
    }
    
    @Override
    public void j() {
        if (this.m) {
            this.m = false;
            this.l(true);
        }
    }
    
    public void j(final boolean b) {
        if (b) {
            this.n();
        }
        else {
            this.o();
        }
        if (this.p()) {
            android.support.v4.h.r r;
            android.support.v4.h.r r2;
            if (b) {
                r = this.d.a(4, 100L);
                r2 = this.e.a(0, 200L);
            }
            else {
                r2 = this.d.a(0, 200L);
                r = this.e.a(8, 100L);
            }
            final h h = new h();
            h.a(r, r2);
            h.a();
            return;
        }
        if (b) {
            this.d.d(4);
            this.e.setVisibility(0);
            return;
        }
        this.d.d(0);
        this.e.setVisibility(8);
    }
    
    @Override
    public void k() {
        if (!this.m) {
            this.l(this.m = true);
        }
    }
    
    @Override
    public void l() {
        if (this.n != null) {
            this.n.c();
            this.n = null;
        }
    }
    
    @Override
    public void m() {
    }
    
    public class a extends b implements h.a
    {
        private final Context b;
        private final h c;
        private android.support.v7.view.b.a d;
        private WeakReference<View> e;
        
        public a(final Context b, final android.support.v7.view.b.a d) {
            this.b = b;
            this.d = d;
            (this.c = new h(b).a(1)).a((h.a)this);
        }
        
        @Override
        public MenuInflater a() {
            return new g(this.b);
        }
        
        @Override
        public void a(final int n) {
            this.b(r.this.a.getResources().getString(n));
        }
        
        @Override
        public void a(final h h) {
            if (this.d == null) {
                return;
            }
            this.d();
            r.this.e.a();
        }
        
        @Override
        public void a(final View customView) {
            r.this.e.setCustomView(customView);
            this.e = new WeakReference<View>(customView);
        }
        
        @Override
        public void a(final CharSequence subtitle) {
            r.this.e.setSubtitle(subtitle);
        }
        
        @Override
        public void a(final boolean titleOptional) {
            super.a(titleOptional);
            r.this.e.setTitleOptional(titleOptional);
        }
        
        @Override
        public boolean a(final h h, final MenuItem menuItem) {
            return this.d != null && this.d.a(this, menuItem);
        }
        
        @Override
        public Menu b() {
            return (Menu)this.c;
        }
        
        @Override
        public void b(final int n) {
            this.a(r.this.a.getResources().getString(n));
        }
        
        @Override
        public void b(final CharSequence title) {
            r.this.e.setTitle(title);
        }
        
        @Override
        public void c() {
            if (r.this.h != this) {
                return;
            }
            if (!r.a(r.this.l, r.this.m, false)) {
                r.this.i = this;
                r.this.j = this.d;
            }
            else {
                this.d.a(this);
            }
            this.d = null;
            r.this.j(false);
            r.this.e.b();
            r.this.d.a().sendAccessibilityEvent(32);
            r.this.b.setHideOnContentScrollEnabled(r.this.o);
            r.this.h = null;
        }
        
        @Override
        public void d() {
            if (r.this.h != this) {
                return;
            }
            this.c.g();
            try {
                this.d.b(this, (Menu)this.c);
            }
            finally {
                this.c.h();
            }
        }
        
        public boolean e() {
            this.c.g();
            try {
                return this.d.a(this, (Menu)this.c);
            }
            finally {
                this.c.h();
            }
        }
        
        @Override
        public CharSequence f() {
            return r.this.e.getTitle();
        }
        
        @Override
        public CharSequence g() {
            return r.this.e.getSubtitle();
        }
        
        @Override
        public boolean h() {
            return r.this.e.d();
        }
        
        @Override
        public View i() {
            if (this.e != null) {
                return this.e.get();
            }
            return null;
        }
    }
}
