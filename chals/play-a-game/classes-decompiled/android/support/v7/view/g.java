// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v7.view;

import android.view.SubMenu;
import android.support.v7.widget.ae;
import android.content.res.TypedArray;
import android.view.View;
import android.support.v7.view.menu.k;
import android.support.v7.view.menu.j;
import java.lang.reflect.Constructor;
import android.util.Log;
import android.support.v4.h.c;
import android.graphics.PorterDuff$Mode;
import android.content.res.ColorStateList;
import android.view.MenuItem;
import java.lang.reflect.Method;
import android.view.MenuItem$OnMenuItemClickListener;
import android.content.res.XmlResourceParser;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;
import android.view.InflateException;
import android.util.Xml;
import android.support.v4.d.a.a;
import android.view.Menu;
import android.util.AttributeSet;
import org.xmlpull.v1.XmlPullParser;
import android.content.ContextWrapper;
import android.app.Activity;
import android.content.Context;
import android.view.MenuInflater;

public class g extends MenuInflater
{
    static final Class<?>[] a;
    static final Class<?>[] b;
    final Object[] c;
    final Object[] d;
    Context e;
    private Object f;
    
    static {
        a = new Class[] { Context.class };
        b = g.a;
    }
    
    public g(final Context e) {
        super(e);
        this.e = e;
        this.c = new Object[] { e };
        this.d = this.c;
    }
    
    private Object a(final Object o) {
        if (!(o instanceof Activity) && o instanceof ContextWrapper) {
            return this.a(((ContextWrapper)o).getBaseContext());
        }
        return o;
    }
    
    private void a(final XmlPullParser xmlPullParser, final AttributeSet set, final Menu menu) {
        final b b = new b(menu);
        int i = xmlPullParser.getEventType();
        String name3;
        while (true) {
            while (i != 2) {
                final int next = xmlPullParser.next();
                if ((i = next) == 1) {
                    final int next2 = next;
                    Object o = null;
                    final boolean b2 = false;
                    int next3 = next2;
                    int j = 0;
                    int n = b2 ? 1 : 0;
                    while (j == 0) {
                        switch (next3) {
                            case 2: {
                                if (n != 0) {
                                    break;
                                }
                                final String name = xmlPullParser.getName();
                                if (name.equals("group")) {
                                    b.a(set);
                                    break;
                                }
                                if (name.equals("item")) {
                                    b.b(set);
                                    break;
                                }
                                if (name.equals("menu")) {
                                    this.a(xmlPullParser, set, (Menu)b.c());
                                    break;
                                }
                                o = name;
                                n = 1;
                                break;
                            }
                            case 3: {
                                final String name2 = xmlPullParser.getName();
                                if (n != 0 && name2.equals(o)) {
                                    o = null;
                                    n = 0;
                                    break;
                                }
                                if (name2.equals("group")) {
                                    b.a();
                                    break;
                                }
                                if (name2.equals("item")) {
                                    if (b.d()) {
                                        break;
                                    }
                                    if (b.a != null && b.a.e()) {
                                        b.c();
                                        break;
                                    }
                                    b.b();
                                    break;
                                }
                                else {
                                    if (name2.equals("menu")) {
                                        j = 1;
                                        break;
                                    }
                                    break;
                                }
                                break;
                            }
                            case 1: {
                                throw new RuntimeException("Unexpected end of document");
                            }
                        }
                        next3 = xmlPullParser.next();
                    }
                    return;
                }
            }
            name3 = xmlPullParser.getName();
            if (name3.equals("menu")) {
                final int next2 = xmlPullParser.next();
                continue;
            }
            break;
        }
        throw new RuntimeException("Expecting menu, got " + name3);
    }
    
    Object a() {
        if (this.f == null) {
            this.f = this.a(this.e);
        }
        return this.f;
    }
    
    public void inflate(final int n, final Menu menu) {
        if (!(menu instanceof android.support.v4.d.a.a)) {
            super.inflate(n, menu);
            return;
        }
        XmlResourceParser xmlResourceParser = null;
        XmlResourceParser xmlResourceParser2 = null;
        XmlResourceParser layout = null;
        try {
            final XmlResourceParser xmlResourceParser3 = xmlResourceParser2 = (xmlResourceParser = (layout = this.e.getResources().getLayout(n)));
            this.a((XmlPullParser)xmlResourceParser3, Xml.asAttributeSet((XmlPullParser)xmlResourceParser3), menu);
        }
        catch (XmlPullParserException ex) {
            xmlResourceParser = layout;
            throw new InflateException("Error inflating menu XML", (Throwable)ex);
        }
        catch (IOException ex2) {
            xmlResourceParser = xmlResourceParser2;
            throw new InflateException("Error inflating menu XML", (Throwable)ex2);
        }
        finally {
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
        }
    }
    
    private static class a implements MenuItem$OnMenuItemClickListener
    {
        private static final Class<?>[] a;
        private Object b;
        private Method c;
        
        static {
            a = new Class[] { MenuItem.class };
        }
        
        public a(final Object b, final String s) {
            this.b = b;
            final Class<?> class1 = b.getClass();
            try {
                this.c = class1.getMethod(s, g.a.a);
            }
            catch (Exception ex2) {
                final InflateException ex = new InflateException("Couldn't resolve menu item onClick handler " + s + " in class " + class1.getName());
                ex.initCause((Throwable)ex2);
                throw ex;
            }
        }
        
        public boolean onMenuItemClick(final MenuItem menuItem) {
            try {
                if (this.c.getReturnType() == Boolean.TYPE) {
                    return (boolean)this.c.invoke(this.b, menuItem);
                }
                this.c.invoke(this.b, menuItem);
                return true;
            }
            catch (Exception ex) {
                throw new RuntimeException(ex);
            }
        }
    }
    
    private class b
    {
        private String A;
        private String B;
        private CharSequence C;
        private CharSequence D;
        private ColorStateList E;
        private PorterDuff$Mode F;
        c a;
        private Menu c;
        private int d;
        private int e;
        private int f;
        private int g;
        private boolean h;
        private boolean i;
        private boolean j;
        private int k;
        private int l;
        private CharSequence m;
        private CharSequence n;
        private int o;
        private char p;
        private int q;
        private char r;
        private int s;
        private int t;
        private boolean u;
        private boolean v;
        private boolean w;
        private int x;
        private int y;
        private String z;
        
        public b(final Menu c) {
            this.E = null;
            this.F = null;
            this.c = c;
            this.a();
        }
        
        private char a(final String s) {
            if (s == null) {
                return '\0';
            }
            return s.charAt(0);
        }
        
        private <T> T a(final String s, final Class<?>[] array, final Object[] array2) {
            try {
                final Constructor<?> constructor = android.support.v7.view.g.this.e.getClassLoader().loadClass(s).getConstructor(array);
                constructor.setAccessible(true);
                return (T)constructor.newInstance(array2);
            }
            catch (Exception ex) {
                Log.w("SupportMenuInflater", "Cannot instantiate class: " + s, (Throwable)ex);
                return null;
            }
        }
        
        private void a(final MenuItem menuItem) {
            int n = 1;
            menuItem.setChecked(this.u).setVisible(this.v).setEnabled(this.w).setCheckable(this.t >= 1).setTitleCondensed(this.n).setIcon(this.o);
            if (this.x >= 0) {
                menuItem.setShowAsAction(this.x);
            }
            if (this.B != null) {
                if (android.support.v7.view.g.this.e.isRestricted()) {
                    throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
                }
                menuItem.setOnMenuItemClickListener((MenuItem$OnMenuItemClickListener)new a(android.support.v7.view.g.this.a(), this.B));
            }
            if (menuItem instanceof j) {
                final j j = (j)menuItem;
            }
            if (this.t >= 2) {
                if (menuItem instanceof j) {
                    ((j)menuItem).a(true);
                }
                else if (menuItem instanceof k) {
                    ((k)menuItem).a(true);
                }
            }
            if (this.z != null) {
                menuItem.setActionView((View)this.a(this.z, android.support.v7.view.g.a, android.support.v7.view.g.this.c));
            }
            else {
                n = 0;
            }
            if (this.y > 0) {
                if (n == 0) {
                    menuItem.setActionView(this.y);
                }
                else {
                    Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
                }
            }
            if (this.a != null) {
                android.support.v4.h.g.a(menuItem, this.a);
            }
            android.support.v4.h.g.a(menuItem, this.C);
            android.support.v4.h.g.b(menuItem, this.D);
            android.support.v4.h.g.b(menuItem, this.p, this.q);
            android.support.v4.h.g.a(menuItem, this.r, this.s);
            if (this.F != null) {
                android.support.v4.h.g.a(menuItem, this.F);
            }
            if (this.E != null) {
                android.support.v4.h.g.a(menuItem, this.E);
            }
        }
        
        public void a() {
            this.d = 0;
            this.e = 0;
            this.f = 0;
            this.g = 0;
            this.h = true;
            this.i = true;
        }
        
        public void a(final AttributeSet set) {
            final TypedArray obtainStyledAttributes = android.support.v7.view.g.this.e.obtainStyledAttributes(set, android.support.v7.a.a.j.MenuGroup);
            this.d = obtainStyledAttributes.getResourceId(android.support.v7.a.a.j.MenuGroup_android_id, 0);
            this.e = obtainStyledAttributes.getInt(android.support.v7.a.a.j.MenuGroup_android_menuCategory, 0);
            this.f = obtainStyledAttributes.getInt(android.support.v7.a.a.j.MenuGroup_android_orderInCategory, 0);
            this.g = obtainStyledAttributes.getInt(android.support.v7.a.a.j.MenuGroup_android_checkableBehavior, 0);
            this.h = obtainStyledAttributes.getBoolean(android.support.v7.a.a.j.MenuGroup_android_visible, true);
            this.i = obtainStyledAttributes.getBoolean(android.support.v7.a.a.j.MenuGroup_android_enabled, true);
            obtainStyledAttributes.recycle();
        }
        
        public void b() {
            this.j = true;
            this.a(this.c.add(this.d, this.k, this.l, this.m));
        }
        
        public void b(final AttributeSet set) {
            final boolean b = true;
            final TypedArray obtainStyledAttributes = android.support.v7.view.g.this.e.obtainStyledAttributes(set, android.support.v7.a.a.j.MenuItem);
            this.k = obtainStyledAttributes.getResourceId(android.support.v7.a.a.j.MenuItem_android_id, 0);
            this.l = ((obtainStyledAttributes.getInt(android.support.v7.a.a.j.MenuItem_android_menuCategory, this.e) & 0xFFFF0000) | (obtainStyledAttributes.getInt(android.support.v7.a.a.j.MenuItem_android_orderInCategory, this.f) & 0xFFFF));
            this.m = obtainStyledAttributes.getText(android.support.v7.a.a.j.MenuItem_android_title);
            this.n = obtainStyledAttributes.getText(android.support.v7.a.a.j.MenuItem_android_titleCondensed);
            this.o = obtainStyledAttributes.getResourceId(android.support.v7.a.a.j.MenuItem_android_icon, 0);
            this.p = this.a(obtainStyledAttributes.getString(android.support.v7.a.a.j.MenuItem_android_alphabeticShortcut));
            this.q = obtainStyledAttributes.getInt(android.support.v7.a.a.j.MenuItem_alphabeticModifiers, 4096);
            this.r = this.a(obtainStyledAttributes.getString(android.support.v7.a.a.j.MenuItem_android_numericShortcut));
            this.s = obtainStyledAttributes.getInt(android.support.v7.a.a.j.MenuItem_numericModifiers, 4096);
            if (obtainStyledAttributes.hasValue(android.support.v7.a.a.j.MenuItem_android_checkable)) {
                int t;
                if (obtainStyledAttributes.getBoolean(android.support.v7.a.a.j.MenuItem_android_checkable, false)) {
                    t = 1;
                }
                else {
                    t = 0;
                }
                this.t = t;
            }
            else {
                this.t = this.g;
            }
            this.u = obtainStyledAttributes.getBoolean(android.support.v7.a.a.j.MenuItem_android_checked, false);
            this.v = obtainStyledAttributes.getBoolean(android.support.v7.a.a.j.MenuItem_android_visible, this.h);
            this.w = obtainStyledAttributes.getBoolean(android.support.v7.a.a.j.MenuItem_android_enabled, this.i);
            this.x = obtainStyledAttributes.getInt(android.support.v7.a.a.j.MenuItem_showAsAction, -1);
            this.B = obtainStyledAttributes.getString(android.support.v7.a.a.j.MenuItem_android_onClick);
            this.y = obtainStyledAttributes.getResourceId(android.support.v7.a.a.j.MenuItem_actionLayout, 0);
            this.z = obtainStyledAttributes.getString(android.support.v7.a.a.j.MenuItem_actionViewClass);
            this.A = obtainStyledAttributes.getString(android.support.v7.a.a.j.MenuItem_actionProviderClass);
            final boolean b2 = this.A != null && b;
            if (b2 && this.y == 0 && this.z == null) {
                this.a = this.a(this.A, android.support.v7.view.g.b, android.support.v7.view.g.this.d);
            }
            else {
                if (b2) {
                    Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                }
                this.a = null;
            }
            this.C = obtainStyledAttributes.getText(android.support.v7.a.a.j.MenuItem_contentDescription);
            this.D = obtainStyledAttributes.getText(android.support.v7.a.a.j.MenuItem_tooltipText);
            if (obtainStyledAttributes.hasValue(android.support.v7.a.a.j.MenuItem_iconTintMode)) {
                this.F = ae.a(obtainStyledAttributes.getInt(android.support.v7.a.a.j.MenuItem_iconTintMode, -1), this.F);
            }
            else {
                this.F = null;
            }
            if (obtainStyledAttributes.hasValue(android.support.v7.a.a.j.MenuItem_iconTint)) {
                this.E = obtainStyledAttributes.getColorStateList(android.support.v7.a.a.j.MenuItem_iconTint);
            }
            else {
                this.E = null;
            }
            obtainStyledAttributes.recycle();
            this.j = false;
        }
        
        public SubMenu c() {
            this.j = true;
            final SubMenu addSubMenu = this.c.addSubMenu(this.d, this.k, this.l, this.m);
            this.a(addSubMenu.getItem());
            return addSubMenu;
        }
        
        public boolean d() {
            return this.j;
        }
    }
}
