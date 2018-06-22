// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v7.view.menu;

import android.view.KeyEvent;
import android.os.Build$VERSION;
import android.view.SubMenu;
import android.view.ViewDebug$CapturedViewProperty;
import android.view.ActionProvider;
import android.content.ActivityNotFoundException;
import android.util.Log;
import android.view.MenuItem;
import android.content.Context;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.view.LayoutInflater;
import android.support.v4.c.a.a;
import android.graphics.PorterDuff$Mode;
import android.content.res.ColorStateList;
import android.view.MenuItem$OnMenuItemClickListener;
import android.graphics.drawable.Drawable;
import android.content.Intent;
import android.view.ContextMenu$ContextMenuInfo;
import android.view.MenuItem$OnActionExpandListener;
import android.support.v4.h.c;
import android.view.View;
import android.support.v4.d.a.b;

public final class j implements b
{
    private static String F;
    private static String G;
    private static String H;
    private static String I;
    private View A;
    private c B;
    private MenuItem$OnActionExpandListener C;
    private boolean D;
    private ContextMenu$ContextMenuInfo E;
    h a;
    private final int b;
    private final int c;
    private final int d;
    private final int e;
    private CharSequence f;
    private CharSequence g;
    private Intent h;
    private char i;
    private int j;
    private char k;
    private int l;
    private Drawable m;
    private int n;
    private u o;
    private Runnable p;
    private MenuItem$OnMenuItemClickListener q;
    private CharSequence r;
    private CharSequence s;
    private ColorStateList t;
    private PorterDuff$Mode u;
    private boolean v;
    private boolean w;
    private boolean x;
    private int y;
    private int z;
    
    j(final h a, final int c, final int b, final int d, final int e, final CharSequence f, final int z) {
        this.j = 4096;
        this.l = 4096;
        this.n = 0;
        this.t = null;
        this.u = null;
        this.v = false;
        this.w = false;
        this.x = false;
        this.y = 16;
        this.z = 0;
        this.D = false;
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.z = z;
    }
    
    private Drawable a(final Drawable drawable) {
        Drawable mutate = drawable;
        if (drawable != null) {
            mutate = drawable;
            if (this.x) {
                if (!this.v) {
                    mutate = drawable;
                    if (!this.w) {
                        return mutate;
                    }
                }
                mutate = android.support.v4.c.a.a.f(drawable).mutate();
                if (this.v) {
                    android.support.v4.c.a.a.a(mutate, this.t);
                }
                if (this.w) {
                    android.support.v4.c.a.a.a(mutate, this.u);
                }
                this.x = false;
            }
        }
        return mutate;
    }
    
    public b a(final int n) {
        final Context e = this.a.e();
        this.a(LayoutInflater.from(e).inflate(n, (ViewGroup)new LinearLayout(e), false));
        return this;
    }
    
    @Override
    public b a(final c b) {
        if (this.B != null) {
            this.B.f();
        }
        this.A = null;
        this.B = b;
        this.a.b(true);
        if (this.B != null) {
            this.B.a((c.b)new c.b() {
                @Override
                public void a(final boolean b) {
                    android.support.v7.view.menu.j.this.a.a(android.support.v7.view.menu.j.this);
                }
            });
        }
        return this;
    }
    
    public b a(final View a) {
        this.A = a;
        this.B = null;
        if (a != null && a.getId() == -1 && this.b > 0) {
            a.setId(this.b);
        }
        this.a.b(this);
        return this;
    }
    
    @Override
    public b a(final CharSequence r) {
        this.r = r;
        this.a.b(false);
        return this;
    }
    
    @Override
    public c a() {
        return this.B;
    }
    
    CharSequence a(final p.a a) {
        if (a != null && a.a()) {
            return this.getTitleCondensed();
        }
        return this.getTitle();
    }
    
    public void a(final u o) {
        (this.o = o).setHeaderTitle(this.getTitle());
    }
    
    void a(final ContextMenu$ContextMenuInfo e) {
        this.E = e;
    }
    
    public void a(final boolean b) {
        final int y = this.y;
        int n;
        if (b) {
            n = 4;
        }
        else {
            n = 0;
        }
        this.y = (n | (y & 0xFFFFFFFB));
    }
    
    public b b(final int showAsAction) {
        this.setShowAsAction(showAsAction);
        return this;
    }
    
    @Override
    public b b(final CharSequence s) {
        this.s = s;
        this.a.b(false);
        return this;
    }
    
    void b(final boolean b) {
        final int y = this.y;
        final int y2 = this.y;
        int n;
        if (b) {
            n = 2;
        }
        else {
            n = 0;
        }
        this.y = (n | (y2 & 0xFFFFFFFD));
        if (y != this.y) {
            this.a.b(false);
        }
    }
    
    public boolean b() {
        if ((this.q == null || !this.q.onMenuItemClick((MenuItem)this)) && !this.a.a(this.a, (MenuItem)this)) {
            if (this.p != null) {
                this.p.run();
                return true;
            }
            if (this.h != null) {
                try {
                    this.a.e().startActivity(this.h);
                    return true;
                }
                catch (ActivityNotFoundException ex) {
                    Log.e("MenuItemImpl", "Can't find activity to handle intent; ignoring", (Throwable)ex);
                }
            }
            if (this.B == null || !this.B.d()) {
                return false;
            }
        }
        return true;
    }
    
    public int c() {
        return this.e;
    }
    
    boolean c(final boolean b) {
        final boolean b2 = false;
        final int y = this.y;
        final int y2 = this.y;
        int n;
        if (b) {
            n = 0;
        }
        else {
            n = 8;
        }
        this.y = (n | (y2 & 0xFFFFFFF7));
        boolean b3 = b2;
        if (y != this.y) {
            b3 = true;
        }
        return b3;
    }
    
    @Override
    public boolean collapseActionView() {
        if ((this.z & 0x8) != 0x0) {
            if (this.A == null) {
                return true;
            }
            if (this.C == null || this.C.onMenuItemActionCollapse((MenuItem)this)) {
                return this.a.d(this);
            }
        }
        return false;
    }
    
    char d() {
        if (this.a.b()) {
            return this.k;
        }
        return this.i;
    }
    
    public void d(final boolean b) {
        if (b) {
            this.y |= 0x20;
            return;
        }
        this.y &= 0xFFFFFFDF;
    }
    
    String e() {
        final char d = this.d();
        if (d == '\0') {
            return "";
        }
        final StringBuilder sb = new StringBuilder(android.support.v7.view.menu.j.F);
        switch (d) {
            default: {
                sb.append(d);
                break;
            }
            case 10: {
                sb.append(android.support.v7.view.menu.j.G);
                break;
            }
            case 8: {
                sb.append(android.support.v7.view.menu.j.H);
                break;
            }
            case 32: {
                sb.append(android.support.v7.view.menu.j.I);
                break;
            }
        }
        return sb.toString();
    }
    
    public void e(final boolean d) {
        this.D = d;
        this.a.b(false);
    }
    
    @Override
    public boolean expandActionView() {
        return this.n() && (this.C == null || this.C.onMenuItemActionExpand((MenuItem)this)) && this.a.c(this);
    }
    
    boolean f() {
        return this.a.c() && this.d() != '\0';
    }
    
    public boolean g() {
        return (this.y & 0x4) != 0x0;
    }
    
    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }
    
    @Override
    public View getActionView() {
        if (this.A != null) {
            return this.A;
        }
        if (this.B != null) {
            return this.A = this.B.a((MenuItem)this);
        }
        return null;
    }
    
    @Override
    public int getAlphabeticModifiers() {
        return this.l;
    }
    
    public char getAlphabeticShortcut() {
        return this.k;
    }
    
    @Override
    public CharSequence getContentDescription() {
        return this.r;
    }
    
    public int getGroupId() {
        return this.c;
    }
    
    public Drawable getIcon() {
        if (this.m != null) {
            return this.a(this.m);
        }
        if (this.n != 0) {
            final Drawable b = android.support.v7.b.a.b.b(this.a.e(), this.n);
            this.n = 0;
            this.m = b;
            return this.a(b);
        }
        return null;
    }
    
    @Override
    public ColorStateList getIconTintList() {
        return this.t;
    }
    
    @Override
    public PorterDuff$Mode getIconTintMode() {
        return this.u;
    }
    
    public Intent getIntent() {
        return this.h;
    }
    
    @ViewDebug$CapturedViewProperty
    public int getItemId() {
        return this.b;
    }
    
    public ContextMenu$ContextMenuInfo getMenuInfo() {
        return this.E;
    }
    
    @Override
    public int getNumericModifiers() {
        return this.j;
    }
    
    public char getNumericShortcut() {
        return this.i;
    }
    
    public int getOrder() {
        return this.d;
    }
    
    public SubMenu getSubMenu() {
        return (SubMenu)this.o;
    }
    
    @ViewDebug$CapturedViewProperty
    public CharSequence getTitle() {
        return this.f;
    }
    
    public CharSequence getTitleCondensed() {
        CharSequence charSequence;
        if (this.g != null) {
            charSequence = this.g;
        }
        else {
            charSequence = this.f;
        }
        CharSequence string = charSequence;
        if (Build$VERSION.SDK_INT < 18 && (string = charSequence) != null) {
            string = charSequence;
            if (!(charSequence instanceof String)) {
                string = charSequence.toString();
            }
        }
        return string;
    }
    
    @Override
    public CharSequence getTooltipText() {
        return this.s;
    }
    
    public void h() {
        this.a.b(this);
    }
    
    public boolean hasSubMenu() {
        return this.o != null;
    }
    
    public boolean i() {
        return this.a.q();
    }
    
    @Override
    public boolean isActionViewExpanded() {
        return this.D;
    }
    
    public boolean isCheckable() {
        return (this.y & 0x1) == 0x1;
    }
    
    public boolean isChecked() {
        return (this.y & 0x2) == 0x2;
    }
    
    public boolean isEnabled() {
        return (this.y & 0x10) != 0x0;
    }
    
    public boolean isVisible() {
        if (this.B != null && this.B.b()) {
            if ((this.y & 0x8) != 0x0 || !this.B.c()) {
                return false;
            }
        }
        else if ((this.y & 0x8) != 0x0) {
            return false;
        }
        return true;
    }
    
    public boolean j() {
        return (this.y & 0x20) == 0x20;
    }
    
    public boolean k() {
        return (this.z & 0x1) == 0x1;
    }
    
    public boolean l() {
        return (this.z & 0x2) == 0x2;
    }
    
    public boolean m() {
        return (this.z & 0x4) == 0x4;
    }
    
    public boolean n() {
        boolean b = false;
        if ((this.z & 0x8) != 0x0) {
            if (this.A == null && this.B != null) {
                this.A = this.B.a((MenuItem)this);
            }
            b = b;
            if (this.A != null) {
                b = true;
            }
        }
        return b;
    }
    
    public MenuItem setActionProvider(final ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }
    
    public MenuItem setAlphabeticShortcut(final char c) {
        if (this.k == c) {
            return (MenuItem)this;
        }
        this.k = Character.toLowerCase(c);
        this.a.b(false);
        return (MenuItem)this;
    }
    
    @Override
    public MenuItem setAlphabeticShortcut(final char c, final int n) {
        if (this.k == c && this.l == n) {
            return (MenuItem)this;
        }
        this.k = Character.toLowerCase(c);
        this.l = KeyEvent.normalizeMetaState(n);
        this.a.b(false);
        return (MenuItem)this;
    }
    
    public MenuItem setCheckable(final boolean b) {
        final int y = this.y;
        final int y2 = this.y;
        boolean b2;
        if (b) {
            b2 = true;
        }
        else {
            b2 = false;
        }
        this.y = ((b2 ? 1 : 0) | (y2 & 0xFFFFFFFE));
        if (y != this.y) {
            this.a.b(false);
        }
        return (MenuItem)this;
    }
    
    public MenuItem setChecked(final boolean b) {
        if ((this.y & 0x4) != 0x0) {
            this.a.a((MenuItem)this);
            return (MenuItem)this;
        }
        this.b(b);
        return (MenuItem)this;
    }
    
    public MenuItem setEnabled(final boolean b) {
        if (b) {
            this.y |= 0x10;
        }
        else {
            this.y &= 0xFFFFFFEF;
        }
        this.a.b(false);
        return (MenuItem)this;
    }
    
    public MenuItem setIcon(final int n) {
        this.m = null;
        this.n = n;
        this.x = true;
        this.a.b(false);
        return (MenuItem)this;
    }
    
    public MenuItem setIcon(final Drawable m) {
        this.n = 0;
        this.m = m;
        this.x = true;
        this.a.b(false);
        return (MenuItem)this;
    }
    
    @Override
    public MenuItem setIconTintList(final ColorStateList t) {
        this.t = t;
        this.v = true;
        this.x = true;
        this.a.b(false);
        return (MenuItem)this;
    }
    
    @Override
    public MenuItem setIconTintMode(final PorterDuff$Mode u) {
        this.u = u;
        this.w = true;
        this.x = true;
        this.a.b(false);
        return (MenuItem)this;
    }
    
    public MenuItem setIntent(final Intent h) {
        this.h = h;
        return (MenuItem)this;
    }
    
    public MenuItem setNumericShortcut(final char i) {
        if (this.i == i) {
            return (MenuItem)this;
        }
        this.i = i;
        this.a.b(false);
        return (MenuItem)this;
    }
    
    @Override
    public MenuItem setNumericShortcut(final char i, final int n) {
        if (this.i == i && this.j == n) {
            return (MenuItem)this;
        }
        this.i = i;
        this.j = KeyEvent.normalizeMetaState(n);
        this.a.b(false);
        return (MenuItem)this;
    }
    
    public MenuItem setOnActionExpandListener(final MenuItem$OnActionExpandListener c) {
        this.C = c;
        return (MenuItem)this;
    }
    
    public MenuItem setOnMenuItemClickListener(final MenuItem$OnMenuItemClickListener q) {
        this.q = q;
        return (MenuItem)this;
    }
    
    public MenuItem setShortcut(final char i, final char c) {
        this.i = i;
        this.k = Character.toLowerCase(c);
        this.a.b(false);
        return (MenuItem)this;
    }
    
    @Override
    public MenuItem setShortcut(final char i, final char c, final int n, final int n2) {
        this.i = i;
        this.j = KeyEvent.normalizeMetaState(n);
        this.k = Character.toLowerCase(c);
        this.l = KeyEvent.normalizeMetaState(n2);
        this.a.b(false);
        return (MenuItem)this;
    }
    
    @Override
    public void setShowAsAction(final int z) {
        switch (z & 0x3) {
            default: {
                throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
            }
            case 0:
            case 1:
            case 2: {
                this.z = z;
                this.a.b(this);
            }
        }
    }
    
    public MenuItem setTitle(final int n) {
        return this.setTitle(this.a.e().getString(n));
    }
    
    public MenuItem setTitle(final CharSequence charSequence) {
        this.f = charSequence;
        this.a.b(false);
        if (this.o != null) {
            this.o.setHeaderTitle(charSequence);
        }
        return (MenuItem)this;
    }
    
    public MenuItem setTitleCondensed(CharSequence f) {
        this.g = f;
        if (f == null) {
            f = this.f;
        }
        this.a.b(false);
        return (MenuItem)this;
    }
    
    public MenuItem setVisible(final boolean b) {
        if (this.c(b)) {
            this.a.a(this);
        }
        return (MenuItem)this;
    }
    
    @Override
    public String toString() {
        if (this.f != null) {
            return this.f.toString();
        }
        return null;
    }
}
