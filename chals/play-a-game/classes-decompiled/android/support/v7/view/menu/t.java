// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v7.view.menu;

import android.view.KeyEvent;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.FrameLayout;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.support.v7.a.a;
import android.view.LayoutInflater;
import android.view.ViewTreeObserver;
import android.view.View$OnAttachStateChangeListener;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import android.content.Context;
import android.view.View;
import android.support.v7.widget.am;
import android.widget.PopupWindow$OnDismissListener;
import android.widget.AdapterView$OnItemClickListener;
import android.view.View$OnKeyListener;

final class t extends m implements o, View$OnKeyListener, AdapterView$OnItemClickListener, PopupWindow$OnDismissListener
{
    final am a;
    View b;
    private final Context c;
    private final h d;
    private final g e;
    private final boolean f;
    private final int g;
    private final int h;
    private final int i;
    private final ViewTreeObserver$OnGlobalLayoutListener j;
    private final View$OnAttachStateChangeListener k;
    private PopupWindow$OnDismissListener l;
    private View m;
    private a n;
    private ViewTreeObserver o;
    private boolean p;
    private boolean q;
    private int r;
    private int s;
    private boolean t;
    
    public t(final Context c, final h d, final View m, final int h, final int i, final boolean f) {
        this.j = (ViewTreeObserver$OnGlobalLayoutListener)new ViewTreeObserver$OnGlobalLayoutListener() {
            public void onGlobalLayout() {
                if (android.support.v7.view.menu.t.this.d() && !android.support.v7.view.menu.t.this.a.g()) {
                    final View b = android.support.v7.view.menu.t.this.b;
                    if (b != null && b.isShown()) {
                        android.support.v7.view.menu.t.this.a.a();
                        return;
                    }
                    android.support.v7.view.menu.t.this.c();
                }
            }
        };
        this.k = (View$OnAttachStateChangeListener)new View$OnAttachStateChangeListener() {
            public void onViewAttachedToWindow(final View view) {
            }
            
            public void onViewDetachedFromWindow(final View view) {
                if (android.support.v7.view.menu.t.this.o != null) {
                    if (!android.support.v7.view.menu.t.this.o.isAlive()) {
                        android.support.v7.view.menu.t.this.o = view.getViewTreeObserver();
                    }
                    android.support.v7.view.menu.t.this.o.removeGlobalOnLayoutListener(android.support.v7.view.menu.t.this.j);
                }
                view.removeOnAttachStateChangeListener((View$OnAttachStateChangeListener)this);
            }
        };
        this.s = 0;
        this.c = c;
        this.d = d;
        this.f = f;
        this.e = new g(d, LayoutInflater.from(c), this.f);
        this.h = h;
        this.i = i;
        final Resources resources = c.getResources();
        this.g = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(android.support.v7.a.a.d.abc_config_prefDialogWidth));
        this.m = m;
        this.a = new am(this.c, null, this.h, this.i);
        d.a(this, c);
    }
    
    private boolean h() {
        if (this.d()) {
            return true;
        }
        if (this.p || this.m == null) {
            return false;
        }
        this.b = this.m;
        this.a.a((PopupWindow$OnDismissListener)this);
        this.a.a((AdapterView$OnItemClickListener)this);
        this.a.a(true);
        final View b = this.b;
        int n;
        if (this.o == null) {
            n = 1;
        }
        else {
            n = 0;
        }
        this.o = b.getViewTreeObserver();
        if (n != 0) {
            this.o.addOnGlobalLayoutListener(this.j);
        }
        b.addOnAttachStateChangeListener(this.k);
        this.a.b(b);
        this.a.e(this.s);
        if (!this.q) {
            this.r = android.support.v7.view.menu.m.a((ListAdapter)this.e, null, this.c, this.g);
            this.q = true;
        }
        this.a.g(this.r);
        this.a.h(2);
        this.a.a(this.g());
        this.a.a();
        final ListView e = this.a.e();
        e.setOnKeyListener((View$OnKeyListener)this);
        if (this.t && this.d.m() != null) {
            final FrameLayout frameLayout = (FrameLayout)LayoutInflater.from(this.c).inflate(android.support.v7.a.a.g.abc_popup_menu_header_item_layout, (ViewGroup)e, false);
            final TextView textView = (TextView)frameLayout.findViewById(16908310);
            if (textView != null) {
                textView.setText(this.d.m());
            }
            frameLayout.setEnabled(false);
            e.addHeaderView((View)frameLayout, (Object)null, false);
        }
        this.a.a((ListAdapter)this.e);
        this.a.a();
        return true;
    }
    
    public void a() {
        if (!this.h()) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
    }
    
    @Override
    public void a(final int s) {
        this.s = s;
    }
    
    @Override
    public void a(final h h) {
    }
    
    @Override
    public void a(final h h, final boolean b) {
        if (h == this.d) {
            this.c();
            if (this.n != null) {
                this.n.a(h, b);
            }
        }
    }
    
    @Override
    public void a(final a n) {
        this.n = n;
    }
    
    @Override
    public void a(final View m) {
        this.m = m;
    }
    
    @Override
    public void a(final PopupWindow$OnDismissListener l) {
        this.l = l;
    }
    
    @Override
    public void a(final boolean b) {
        this.e.a(b);
    }
    
    @Override
    public boolean a(final u u) {
        if (u.hasVisibleItems()) {
            final n n = new n(this.c, u, this.b, this.f, this.h, this.i);
            n.a(this.n);
            n.a(android.support.v7.view.menu.m.b(u));
            n.a(this.s);
            n.a(this.l);
            this.l = null;
            this.d.a(false);
            if (n.a(this.a.j(), this.a.k())) {
                if (this.n != null) {
                    this.n.a(u);
                }
                return true;
            }
        }
        return false;
    }
    
    @Override
    public void b(final int n) {
        this.a.c(n);
    }
    
    @Override
    public void b(final boolean b) {
        this.q = false;
        if (this.e != null) {
            this.e.notifyDataSetChanged();
        }
    }
    
    @Override
    public boolean b() {
        return false;
    }
    
    public void c() {
        if (this.d()) {
            this.a.c();
        }
    }
    
    @Override
    public void c(final int n) {
        this.a.d(n);
    }
    
    @Override
    public void c(final boolean t) {
        this.t = t;
    }
    
    public boolean d() {
        return !this.p && this.a.d();
    }
    
    public ListView e() {
        return this.a.e();
    }
    
    public void onDismiss() {
        this.p = true;
        this.d.close();
        if (this.o != null) {
            if (!this.o.isAlive()) {
                this.o = this.b.getViewTreeObserver();
            }
            this.o.removeGlobalOnLayoutListener(this.j);
            this.o = null;
        }
        this.b.removeOnAttachStateChangeListener(this.k);
        if (this.l != null) {
            this.l.onDismiss();
        }
    }
    
    public boolean onKey(final View view, final int n, final KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1 && n == 82) {
            this.c();
            return true;
        }
        return false;
    }
}
