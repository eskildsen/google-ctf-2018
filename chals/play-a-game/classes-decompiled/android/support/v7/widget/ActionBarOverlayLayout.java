// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v7.widget;

import android.view.ViewGroup$MarginLayoutParams;
import android.view.Window$Callback;
import android.os.Build$VERSION;
import android.content.res.Configuration;
import android.support.v4.h.p;
import android.graphics.Canvas;
import android.view.ViewGroup$LayoutParams;
import android.support.v7.view.menu.o;
import android.view.Menu;
import android.content.res.TypedArray;
import android.view.View;
import android.animation.Animator$AnimatorListener;
import android.animation.Animator;
import android.util.AttributeSet;
import android.content.Context;
import android.support.v7.a.a;
import android.widget.OverScroller;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewPropertyAnimator;
import android.support.v4.h.m;
import android.support.v4.h.k;
import android.view.ViewGroup;

public class ActionBarOverlayLayout extends ViewGroup implements k, ac
{
    static final int[] e;
    private final Runnable A;
    private final Runnable B;
    private final m C;
    ActionBarContainer a;
    boolean b;
    ViewPropertyAnimator c;
    final AnimatorListenerAdapter d;
    private int f;
    private int g;
    private ContentFrameLayout h;
    private ad i;
    private Drawable j;
    private boolean k;
    private boolean l;
    private boolean m;
    private boolean n;
    private int o;
    private int p;
    private final Rect q;
    private final Rect r;
    private final Rect s;
    private final Rect t;
    private final Rect u;
    private final Rect v;
    private final Rect w;
    private a x;
    private final int y;
    private OverScroller z;
    
    static {
        e = new int[] { android.support.v7.a.a.a.actionBarSize, 16842841 };
    }
    
    public ActionBarOverlayLayout(final Context context) {
        this(context, null);
    }
    
    public ActionBarOverlayLayout(final Context context, final AttributeSet set) {
        super(context, set);
        this.g = 0;
        this.q = new Rect();
        this.r = new Rect();
        this.s = new Rect();
        this.t = new Rect();
        this.u = new Rect();
        this.v = new Rect();
        this.w = new Rect();
        this.y = 600;
        this.d = new AnimatorListenerAdapter() {
            public void onAnimationCancel(final Animator animator) {
                ActionBarOverlayLayout.this.c = null;
                ActionBarOverlayLayout.this.b = false;
            }
            
            public void onAnimationEnd(final Animator animator) {
                ActionBarOverlayLayout.this.c = null;
                ActionBarOverlayLayout.this.b = false;
            }
        };
        this.A = new Runnable() {
            @Override
            public void run() {
                ActionBarOverlayLayout.this.d();
                ActionBarOverlayLayout.this.c = ActionBarOverlayLayout.this.a.animate().translationY(0.0f).setListener((Animator$AnimatorListener)ActionBarOverlayLayout.this.d);
            }
        };
        this.B = new Runnable() {
            @Override
            public void run() {
                ActionBarOverlayLayout.this.d();
                ActionBarOverlayLayout.this.c = ActionBarOverlayLayout.this.a.animate().translationY((float)(-ActionBarOverlayLayout.this.a.getHeight())).setListener((Animator$AnimatorListener)ActionBarOverlayLayout.this.d);
            }
        };
        this.a(context);
        this.C = new m(this);
    }
    
    private ad a(final View view) {
        if (view instanceof ad) {
            return (ad)view;
        }
        if (view instanceof Toolbar) {
            return ((Toolbar)view).getWrapper();
        }
        throw new IllegalStateException("Can't make a decor toolbar out of " + view.getClass().getSimpleName());
    }
    
    private void a(final Context context) {
        final boolean b = true;
        final TypedArray obtainStyledAttributes = this.getContext().getTheme().obtainStyledAttributes(ActionBarOverlayLayout.e);
        this.f = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.j = obtainStyledAttributes.getDrawable(1);
        this.setWillNotDraw(this.j == null);
        obtainStyledAttributes.recycle();
        this.k = (context.getApplicationInfo().targetSdkVersion < 19 && b);
        this.z = new OverScroller(context);
    }
    
    private boolean a(final float n, final float n2) {
        boolean b = false;
        this.z.fling(0, 0, 0, (int)n2, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        if (this.z.getFinalY() > this.a.getHeight()) {
            b = true;
        }
        return b;
    }
    
    private boolean a(final View view, final Rect rect, final boolean b, final boolean b2, final boolean b3, final boolean b4) {
        final boolean b5 = false;
        final b b6 = (b)view.getLayoutParams();
        boolean b7 = b5;
        if (b) {
            b7 = b5;
            if (b6.leftMargin != rect.left) {
                b6.leftMargin = rect.left;
                b7 = true;
            }
        }
        boolean b8 = b7;
        if (b2) {
            b8 = b7;
            if (b6.topMargin != rect.top) {
                b6.topMargin = rect.top;
                b8 = true;
            }
        }
        boolean b9 = b8;
        if (b4) {
            b9 = b8;
            if (b6.rightMargin != rect.right) {
                b6.rightMargin = rect.right;
                b9 = true;
            }
        }
        if (b3 && b6.bottomMargin != rect.bottom) {
            b6.bottomMargin = rect.bottom;
            return true;
        }
        return b9;
    }
    
    private void l() {
        this.d();
        this.postDelayed(this.A, 600L);
    }
    
    private void m() {
        this.d();
        this.postDelayed(this.B, 600L);
    }
    
    private void n() {
        this.d();
        this.A.run();
    }
    
    private void o() {
        this.d();
        this.B.run();
    }
    
    public b a(final AttributeSet set) {
        return new b(this.getContext(), set);
    }
    
    public void a(final int n) {
        this.c();
        switch (n) {
            default: {}
            case 2: {
                this.i.f();
            }
            case 5: {
                this.i.g();
            }
            case 109: {
                this.setOverlayMode(true);
            }
        }
    }
    
    public void a(final Menu menu, final o.a a) {
        this.c();
        this.i.a(menu, a);
    }
    
    public boolean a() {
        return this.l;
    }
    
    protected b b() {
        return new b(-1, -1);
    }
    
    void c() {
        if (this.h == null) {
            this.h = (ContentFrameLayout)this.findViewById(android.support.v7.a.a.f.action_bar_activity_content);
            this.a = (ActionBarContainer)this.findViewById(android.support.v7.a.a.f.action_bar_container);
            this.i = this.a(this.findViewById(android.support.v7.a.a.f.action_bar));
        }
    }
    
    protected boolean checkLayoutParams(final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        return viewGroup$LayoutParams instanceof b;
    }
    
    void d() {
        this.removeCallbacks(this.A);
        this.removeCallbacks(this.B);
        if (this.c != null) {
            this.c.cancel();
        }
    }
    
    public void draw(final Canvas canvas) {
        super.draw(canvas);
        if (this.j != null && !this.k) {
            int n;
            if (this.a.getVisibility() == 0) {
                n = (int)(this.a.getBottom() + this.a.getTranslationY() + 0.5f);
            }
            else {
                n = 0;
            }
            this.j.setBounds(0, n, this.getWidth(), this.j.getIntrinsicHeight() + n);
            this.j.draw(canvas);
        }
    }
    
    public boolean e() {
        this.c();
        return this.i.h();
    }
    
    public boolean f() {
        this.c();
        return this.i.i();
    }
    
    protected boolean fitSystemWindows(final Rect rect) {
        this.c();
        if ((android.support.v4.h.p.f((View)this) & 0x100) != 0x0) {}
        boolean a = this.a((View)this.a, rect, true, true, false, true);
        this.t.set(rect);
        bc.a((View)this, this.t, this.q);
        if (!this.u.equals((Object)this.t)) {
            this.u.set(this.t);
            a = true;
        }
        if (!this.r.equals((Object)this.q)) {
            this.r.set(this.q);
            a = true;
        }
        if (a) {
            this.requestLayout();
        }
        return true;
    }
    
    public boolean g() {
        this.c();
        return this.i.j();
    }
    
    protected ViewGroup$LayoutParams generateLayoutParams(final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        return (ViewGroup$LayoutParams)new b(viewGroup$LayoutParams);
    }
    
    public int getActionBarHideOffset() {
        if (this.a != null) {
            return -(int)this.a.getTranslationY();
        }
        return 0;
    }
    
    public int getNestedScrollAxes() {
        return this.C.a();
    }
    
    public CharSequence getTitle() {
        this.c();
        return this.i.e();
    }
    
    public boolean h() {
        this.c();
        return this.i.k();
    }
    
    public boolean i() {
        this.c();
        return this.i.l();
    }
    
    public void j() {
        this.c();
        this.i.m();
    }
    
    public void k() {
        this.c();
        this.i.n();
    }
    
    protected void onConfigurationChanged(final Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.a(this.getContext());
        android.support.v4.h.p.g((View)this);
    }
    
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.d();
    }
    
    protected void onLayout(final boolean b, int i, int childCount, int paddingLeft, int paddingTop) {
        childCount = this.getChildCount();
        paddingLeft = this.getPaddingLeft();
        this.getPaddingRight();
        paddingTop = this.getPaddingTop();
        this.getPaddingBottom();
        View child;
        b b2;
        int measuredWidth;
        int measuredHeight;
        int n;
        int n2;
        for (i = 0; i < childCount; ++i) {
            child = this.getChildAt(i);
            if (child.getVisibility() != 8) {
                b2 = (b)child.getLayoutParams();
                measuredWidth = child.getMeasuredWidth();
                measuredHeight = child.getMeasuredHeight();
                n = b2.leftMargin + paddingLeft;
                n2 = b2.topMargin + paddingTop;
                child.layout(n, n2, measuredWidth + n, measuredHeight + n2);
            }
        }
    }
    
    protected void onMeasure(final int n, final int n2) {
        this.c();
        this.measureChildWithMargins((View)this.a, n, 0, n2, 0);
        final b b = (b)this.a.getLayoutParams();
        final int max = Math.max(0, this.a.getMeasuredWidth() + b.leftMargin + b.rightMargin);
        final int max2 = Math.max(0, b.bottomMargin + (this.a.getMeasuredHeight() + b.topMargin));
        final int combineMeasuredStates = View.combineMeasuredStates(0, this.a.getMeasuredState());
        boolean b2;
        if ((android.support.v4.h.p.f((View)this) & 0x100) != 0x0) {
            b2 = true;
        }
        else {
            b2 = false;
        }
        int n4;
        if (b2) {
            final int n3 = n4 = this.f;
            if (this.m) {
                n4 = n3;
                if (this.a.getTabContainer() != null) {
                    n4 = n3 + this.f;
                }
            }
        }
        else if (this.a.getVisibility() != 8) {
            n4 = this.a.getMeasuredHeight();
        }
        else {
            n4 = 0;
        }
        this.s.set(this.q);
        this.v.set(this.t);
        if (!this.l && !b2) {
            final Rect s = this.s;
            s.top += n4;
            final Rect s2 = this.s;
            s2.bottom += 0;
        }
        else {
            final Rect v = this.v;
            v.top += n4;
            final Rect v2 = this.v;
            v2.bottom += 0;
        }
        this.a((View)this.h, this.s, true, true, true, true);
        if (!this.w.equals((Object)this.v)) {
            this.w.set(this.v);
            this.h.a(this.v);
        }
        this.measureChildWithMargins((View)this.h, n, 0, n2, 0);
        final b b3 = (b)this.h.getLayoutParams();
        final int max3 = Math.max(max, this.h.getMeasuredWidth() + b3.leftMargin + b3.rightMargin);
        final int max4 = Math.max(max2, b3.bottomMargin + (this.h.getMeasuredHeight() + b3.topMargin));
        final int combineMeasuredStates2 = View.combineMeasuredStates(combineMeasuredStates, this.h.getMeasuredState());
        this.setMeasuredDimension(View.resolveSizeAndState(Math.max(max3 + (this.getPaddingLeft() + this.getPaddingRight()), this.getSuggestedMinimumWidth()), n, combineMeasuredStates2), View.resolveSizeAndState(Math.max(max4 + (this.getPaddingTop() + this.getPaddingBottom()), this.getSuggestedMinimumHeight()), n2, combineMeasuredStates2 << 16));
    }
    
    public boolean onNestedFling(final View view, final float n, final float n2, final boolean b) {
        if (!this.n || !b) {
            return false;
        }
        if (this.a(n, n2)) {
            this.o();
        }
        else {
            this.n();
        }
        return this.b = true;
    }
    
    public boolean onNestedPreFling(final View view, final float n, final float n2) {
        return false;
    }
    
    public void onNestedPreScroll(final View view, final int n, final int n2, final int[] array) {
    }
    
    public void onNestedScroll(final View view, final int n, final int n2, final int n3, final int n4) {
        this.setActionBarHideOffset(this.o += n2);
    }
    
    public void onNestedScrollAccepted(final View view, final View view2, final int n) {
        this.C.a(view, view2, n);
        this.o = this.getActionBarHideOffset();
        this.d();
        if (this.x != null) {
            this.x.l();
        }
    }
    
    public boolean onStartNestedScroll(final View view, final View view2, final int n) {
        return (n & 0x2) != 0x0 && this.a.getVisibility() == 0 && this.n;
    }
    
    public void onStopNestedScroll(final View view) {
        if (this.n && !this.b) {
            if (this.o <= this.a.getHeight()) {
                this.l();
            }
            else {
                this.m();
            }
        }
        if (this.x != null) {
            this.x.m();
        }
    }
    
    public void onWindowSystemUiVisibilityChanged(final int p) {
        boolean b = true;
        if (Build$VERSION.SDK_INT >= 16) {
            super.onWindowSystemUiVisibilityChanged(p);
        }
        this.c();
        final int p2 = this.p;
        this.p = p;
        boolean b2;
        if ((p & 0x4) == 0x0) {
            b2 = true;
        }
        else {
            b2 = false;
        }
        boolean b3;
        if ((p & 0x100) != 0x0) {
            b3 = true;
        }
        else {
            b3 = false;
        }
        if (this.x != null) {
            final a x = this.x;
            if (b3) {
                b = false;
            }
            x.g(b);
            if (b2 || !b3) {
                this.x.j();
            }
            else {
                this.x.k();
            }
        }
        if (((p2 ^ p) & 0x100) != 0x0 && this.x != null) {
            p.g((View)this);
        }
    }
    
    protected void onWindowVisibilityChanged(final int g) {
        super.onWindowVisibilityChanged(g);
        this.g = g;
        if (this.x != null) {
            this.x.a(g);
        }
    }
    
    public void setActionBarHideOffset(int max) {
        this.d();
        max = Math.max(0, Math.min(max, this.a.getHeight()));
        this.a.setTranslationY((float)(-max));
    }
    
    public void setActionBarVisibilityCallback(final a x) {
        this.x = x;
        if (this.getWindowToken() != null) {
            this.x.a(this.g);
            if (this.p != 0) {
                this.onWindowSystemUiVisibilityChanged(this.p);
                android.support.v4.h.p.g((View)this);
            }
        }
    }
    
    public void setHasNonEmbeddedTabs(final boolean m) {
        this.m = m;
    }
    
    public void setHideOnContentScrollEnabled(final boolean n) {
        if (n != this.n && !(this.n = n)) {
            this.d();
            this.setActionBarHideOffset(0);
        }
    }
    
    public void setIcon(final int n) {
        this.c();
        this.i.a(n);
    }
    
    public void setIcon(final Drawable drawable) {
        this.c();
        this.i.a(drawable);
    }
    
    public void setLogo(final int n) {
        this.c();
        this.i.b(n);
    }
    
    public void setOverlayMode(final boolean l) {
        this.l = l;
        this.k = (l && this.getContext().getApplicationInfo().targetSdkVersion < 19);
    }
    
    public void setShowingForActionMode(final boolean b) {
    }
    
    public void setUiOptions(final int n) {
    }
    
    public void setWindowCallback(final Window$Callback window$Callback) {
        this.c();
        this.i.a(window$Callback);
    }
    
    public void setWindowTitle(final CharSequence charSequence) {
        this.c();
        this.i.a(charSequence);
    }
    
    public boolean shouldDelayChildPressedState() {
        return false;
    }
    
    public interface a
    {
        void a(final int p0);
        
        void g(final boolean p0);
        
        void j();
        
        void k();
        
        void l();
        
        void m();
    }
    
    public static class b extends ViewGroup$MarginLayoutParams
    {
        public b(final int n, final int n2) {
            super(n, n2);
        }
        
        public b(final Context context, final AttributeSet set) {
            super(context, set);
        }
        
        public b(final ViewGroup$LayoutParams viewGroup$LayoutParams) {
            super(viewGroup$LayoutParams);
        }
    }
}
