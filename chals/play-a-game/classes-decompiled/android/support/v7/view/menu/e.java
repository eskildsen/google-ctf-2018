// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v7.view.menu;

import android.view.KeyEvent;
import android.support.v4.h.d;
import android.support.v4.h.p;
import android.widget.AdapterView$OnItemClickListener;
import android.util.AttributeSet;
import android.graphics.Rect;
import android.support.v7.widget.am;
import android.widget.TextView;
import android.widget.FrameLayout;
import android.os.Build$VERSION;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.HeaderViewListAdapter;
import android.content.res.Resources;
import android.support.v7.a.a;
import android.os.SystemClock;
import android.view.MenuItem;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.LinkedList;
import android.view.ViewTreeObserver;
import android.support.v7.widget.al;
import android.view.View$OnAttachStateChangeListener;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import android.content.Context;
import android.view.View;
import java.util.List;
import android.os.Handler;
import android.widget.PopupWindow$OnDismissListener;
import android.view.View$OnKeyListener;

final class e extends m implements o, View$OnKeyListener, PopupWindow$OnDismissListener
{
    final Handler a;
    final List<a> b;
    View c;
    boolean d;
    private final Context e;
    private final int f;
    private final int g;
    private final int h;
    private final boolean i;
    private final List<h> j;
    private final ViewTreeObserver$OnGlobalLayoutListener k;
    private final View$OnAttachStateChangeListener l;
    private final al m;
    private int n;
    private int o;
    private View p;
    private int q;
    private boolean r;
    private boolean s;
    private int t;
    private int u;
    private boolean v;
    private boolean w;
    private o.a x;
    private ViewTreeObserver y;
    private PopupWindow$OnDismissListener z;
    
    public e(final Context e, final View p5, final int g, final int h, final boolean i) {
        this.j = new LinkedList<h>();
        this.b = new ArrayList<a>();
        this.k = (ViewTreeObserver$OnGlobalLayoutListener)new ViewTreeObserver$OnGlobalLayoutListener() {
            public void onGlobalLayout() {
                if (android.support.v7.view.menu.e.this.d() && android.support.v7.view.menu.e.this.b.size() > 0 && !((a)android.support.v7.view.menu.e.this.b.get(0)).a.g()) {
                    final View c = android.support.v7.view.menu.e.this.c;
                    if (c == null || !c.isShown()) {
                        android.support.v7.view.menu.e.this.c();
                    }
                    else {
                        final Iterator<a> iterator = android.support.v7.view.menu.e.this.b.iterator();
                        while (iterator.hasNext()) {
                            ((a)iterator.next()).a.a();
                        }
                    }
                }
            }
        };
        this.l = (View$OnAttachStateChangeListener)new View$OnAttachStateChangeListener() {
            public void onViewAttachedToWindow(final View view) {
            }
            
            public void onViewDetachedFromWindow(final View view) {
                if (android.support.v7.view.menu.e.this.y != null) {
                    if (!android.support.v7.view.menu.e.this.y.isAlive()) {
                        android.support.v7.view.menu.e.this.y = view.getViewTreeObserver();
                    }
                    android.support.v7.view.menu.e.this.y.removeGlobalOnLayoutListener(android.support.v7.view.menu.e.this.k);
                }
                view.removeOnAttachStateChangeListener((View$OnAttachStateChangeListener)this);
            }
        };
        this.m = new al() {
            @Override
            public void a(final h h, final MenuItem menuItem) {
                android.support.v7.view.menu.e.this.a.removeCallbacksAndMessages((Object)h);
            }
            
            @Override
            public void b(final h h, final MenuItem menuItem) {
                android.support.v7.view.menu.e.this.a.removeCallbacksAndMessages((Object)null);
                int i = 0;
                while (true) {
                    while (i < android.support.v7.view.menu.e.this.b.size()) {
                        if (h == ((a)android.support.v7.view.menu.e.this.b.get(i)).b) {
                            if (i == -1) {
                                return;
                            }
                            final int n = i + 1;
                            a a;
                            if (n < android.support.v7.view.menu.e.this.b.size()) {
                                a = (a)android.support.v7.view.menu.e.this.b.get(n);
                            }
                            else {
                                a = null;
                            }
                            android.support.v7.view.menu.e.this.a.postAtTime((Runnable)new Runnable() {
                                @Override
                                public void run() {
                                    if (a != null) {
                                        android.support.v7.view.menu.e.this.d = true;
                                        a.b.a(false);
                                        android.support.v7.view.menu.e.this.d = false;
                                    }
                                    if (menuItem.isEnabled() && menuItem.hasSubMenu()) {
                                        h.a(menuItem, 4);
                                    }
                                }
                            }, (Object)h, SystemClock.uptimeMillis() + 200L);
                            return;
                        }
                        else {
                            ++i;
                        }
                    }
                    i = -1;
                    continue;
                }
            }
        };
        this.n = 0;
        this.o = 0;
        this.e = e;
        this.p = p5;
        this.g = g;
        this.h = h;
        this.i = i;
        this.v = false;
        this.q = this.i();
        final Resources resources = e.getResources();
        this.f = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(android.support.v7.a.a.d.abc_config_prefDialogWidth));
        this.a = new Handler();
    }
    
    private MenuItem a(final h h, final h h2) {
        for (int size = h.size(), i = 0; i < size; ++i) {
            final MenuItem item = h.getItem(i);
            if (item.hasSubMenu() && h2 == item.getSubMenu()) {
                return item;
            }
        }
        return null;
    }
    
    private View a(final a a, final h h) {
        int i = 0;
        final MenuItem a2 = this.a(a.b, h);
        if (a2 == null) {
            return null;
        }
        final ListView a3 = a.a();
        final ListAdapter adapter = a3.getAdapter();
        int headersCount;
        g g;
        if (adapter instanceof HeaderViewListAdapter) {
            final HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter)adapter;
            headersCount = headerViewListAdapter.getHeadersCount();
            g = (g)headerViewListAdapter.getWrappedAdapter();
        }
        else {
            g = (g)adapter;
            headersCount = 0;
        }
        while (true) {
            while (i < g.getCount()) {
                if (a2 == g.a(i)) {
                    if (i == -1) {
                        return null;
                    }
                    final int n = i + headersCount - a3.getFirstVisiblePosition();
                    if (n < 0 || n >= a3.getChildCount()) {
                        return null;
                    }
                    return a3.getChildAt(n);
                }
                else {
                    ++i;
                }
            }
            i = -1;
            continue;
        }
    }
    
    private void c(final h h) {
        final LayoutInflater from = LayoutInflater.from(this.e);
        final g g = new g(h, from, this.i);
        if (!this.d() && this.v) {
            g.a(true);
        }
        else if (this.d()) {
            g.a(android.support.v7.view.menu.m.b(h));
        }
        final int a = android.support.v7.view.menu.m.a((ListAdapter)g, null, this.e, this.f);
        final am h2 = this.h();
        h2.a((ListAdapter)g);
        h2.g(a);
        h2.e(this.o);
        a a2;
        View a3;
        if (this.b.size() > 0) {
            a2 = this.b.get(this.b.size() - 1);
            a3 = this.a(a2, h);
        }
        else {
            a3 = null;
            a2 = null;
        }
        if (a3 != null) {
            h2.c(false);
            h2.a((Object)null);
            final int d = this.d(a);
            boolean b;
            if (d == 1) {
                b = true;
            }
            else {
                b = false;
            }
            this.q = d;
            int n;
            int n2;
            if (Build$VERSION.SDK_INT >= 26) {
                h2.b(a3);
                n = 0;
                n2 = 0;
            }
            else {
                final int[] array = new int[2];
                this.p.getLocationOnScreen(array);
                final int[] array2 = new int[2];
                a3.getLocationOnScreen(array2);
                n2 = array2[0] - array[0];
                n = array2[1] - array[1];
            }
            int n3;
            if ((this.o & 0x5) == 0x5) {
                if (b) {
                    n3 = n2 + a;
                }
                else {
                    n3 = n2 - a3.getWidth();
                }
            }
            else if (b) {
                n3 = a3.getWidth() + n2;
            }
            else {
                n3 = n2 - a;
            }
            h2.c(n3);
            h2.b(true);
            h2.d(n);
        }
        else {
            if (this.r) {
                h2.c(this.t);
            }
            if (this.s) {
                h2.d(this.u);
            }
            h2.a(this.g());
        }
        this.b.add(new a(h2, h, this.q));
        h2.a();
        final ListView e = h2.e();
        e.setOnKeyListener((View$OnKeyListener)this);
        if (a2 == null && this.w && h.m() != null) {
            final FrameLayout frameLayout = (FrameLayout)from.inflate(android.support.v7.a.a.g.abc_popup_menu_header_item_layout, (ViewGroup)e, false);
            final TextView textView = (TextView)frameLayout.findViewById(16908310);
            frameLayout.setEnabled(false);
            textView.setText(h.m());
            e.addHeaderView((View)frameLayout, (Object)null, false);
            h2.a();
        }
    }
    
    private int d(final int n) {
        final ListView a = this.b.get(this.b.size() - 1).a();
        final int[] array = new int[2];
        a.getLocationOnScreen(array);
        final Rect rect = new Rect();
        this.c.getWindowVisibleDisplayFrame(rect);
        if (this.q == 1) {
            if (a.getWidth() + array[0] + n > rect.right) {
                return 0;
            }
            return 1;
        }
        else {
            if (array[0] - n < 0) {
                return 1;
            }
            return 0;
        }
    }
    
    private int d(final h h) {
        for (int i = 0; i < this.b.size(); ++i) {
            if (h == this.b.get(i).b) {
                return i;
            }
        }
        return -1;
    }
    
    private am h() {
        final am am = new am(this.e, null, this.g, this.h);
        am.a(this.m);
        am.a((AdapterView$OnItemClickListener)this);
        am.a((PopupWindow$OnDismissListener)this);
        am.b(this.p);
        am.e(this.o);
        am.a(true);
        am.h(2);
        return am;
    }
    
    private int i() {
        int n = 1;
        if (android.support.v4.h.p.b(this.p) == 1) {
            n = 0;
        }
        return n;
    }
    
    public void a() {
        if (!this.d()) {
            final Iterator<h> iterator = this.j.iterator();
            while (iterator.hasNext()) {
                this.c(iterator.next());
            }
            this.j.clear();
            this.c = this.p;
            if (this.c != null) {
                int n;
                if (this.y == null) {
                    n = 1;
                }
                else {
                    n = 0;
                }
                this.y = this.c.getViewTreeObserver();
                if (n != 0) {
                    this.y.addOnGlobalLayoutListener(this.k);
                }
                this.c.addOnAttachStateChangeListener(this.l);
            }
        }
    }
    
    @Override
    public void a(final int n) {
        if (this.n != n) {
            this.n = n;
            this.o = android.support.v4.h.d.a(n, android.support.v4.h.p.b(this.p));
        }
    }
    
    @Override
    public void a(final h h) {
        h.a(this, this.e);
        if (this.d()) {
            this.c(h);
            return;
        }
        this.j.add(h);
    }
    
    @Override
    public void a(final h h, final boolean b) {
        final int d = this.d(h);
        if (d >= 0) {
            final int n = d + 1;
            if (n < this.b.size()) {
                this.b.get(n).b.a(false);
            }
            final a a = this.b.remove(d);
            a.b.b(this);
            if (this.d) {
                a.a.b((Object)null);
                a.a.b(0);
            }
            a.a.c();
            final int size = this.b.size();
            if (size > 0) {
                this.q = this.b.get(size - 1).c;
            }
            else {
                this.q = this.i();
            }
            if (size == 0) {
                this.c();
                if (this.x != null) {
                    this.x.a(h, true);
                }
                if (this.y != null) {
                    if (this.y.isAlive()) {
                        this.y.removeGlobalOnLayoutListener(this.k);
                    }
                    this.y = null;
                }
                this.c.removeOnAttachStateChangeListener(this.l);
                this.z.onDismiss();
                return;
            }
            if (b) {
                this.b.get(0).b.a(false);
            }
        }
    }
    
    @Override
    public void a(final o.a x) {
        this.x = x;
    }
    
    @Override
    public void a(final View p) {
        if (this.p != p) {
            this.p = p;
            this.o = android.support.v4.h.d.a(this.n, p.b(this.p));
        }
    }
    
    @Override
    public void a(final PopupWindow$OnDismissListener z) {
        this.z = z;
    }
    
    @Override
    public void a(final boolean v) {
        this.v = v;
    }
    
    @Override
    public boolean a(final u u) {
        for (final a a : this.b) {
            if (u == a.b) {
                a.a().requestFocus();
                return true;
            }
        }
        if (u.hasVisibleItems()) {
            this.a((h)u);
            if (this.x != null) {
                this.x.a(u);
            }
            return true;
        }
        return false;
    }
    
    @Override
    public void b(final int t) {
        this.r = true;
        this.t = t;
    }
    
    @Override
    public void b(final boolean b) {
        final Iterator<a> iterator = this.b.iterator();
        while (iterator.hasNext()) {
            android.support.v7.view.menu.m.a(iterator.next().a().getAdapter()).notifyDataSetChanged();
        }
    }
    
    @Override
    public boolean b() {
        return false;
    }
    
    public void c() {
        final int size = this.b.size();
        if (size > 0) {
            final a[] array = this.b.toArray(new a[size]);
            for (int i = size - 1; i >= 0; --i) {
                final a a = array[i];
                if (a.a.d()) {
                    a.a.c();
                }
            }
        }
    }
    
    @Override
    public void c(final int u) {
        this.s = true;
        this.u = u;
    }
    
    @Override
    public void c(final boolean w) {
        this.w = w;
    }
    
    public boolean d() {
        return this.b.size() > 0 && this.b.get(0).a.d();
    }
    
    public ListView e() {
        if (this.b.isEmpty()) {
            return null;
        }
        return this.b.get(this.b.size() - 1).a();
    }
    
    @Override
    protected boolean f() {
        return false;
    }
    
    public void onDismiss() {
        while (true) {
            for (int size = this.b.size(), i = 0; i < size; ++i) {
                final a a = this.b.get(i);
                if (!a.a.d()) {
                    if (a != null) {
                        a.b.a(false);
                    }
                    return;
                }
            }
            final a a = null;
            continue;
        }
    }
    
    public boolean onKey(final View view, final int n, final KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1 && n == 82) {
            this.c();
            return true;
        }
        return false;
    }
    
    private static class a
    {
        public final am a;
        public final h b;
        public final int c;
        
        public a(final am a, final h b, final int c) {
            this.a = a;
            this.b = b;
            this.c = c;
        }
        
        public ListView a() {
            return this.a.e();
        }
    }
}
