// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v7.app;

import android.view.MenuItem;
import android.content.Context;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.content.res.Configuration;
import android.view.View;
import android.support.v4.h.p;
import android.support.v7.view.menu.h;
import android.view.Menu;
import java.util.ArrayList;
import android.view.Window$Callback;
import android.support.v7.widget.ad;

class o extends android.support.v7.app.a
{
    ad a;
    Window$Callback b;
    private boolean c;
    private boolean d;
    private ArrayList<android.support.v7.app.a.b> e;
    private final Runnable f;
    
    private Menu h() {
        if (!this.c) {
            this.a.a(new a(), new b());
            this.c = true;
        }
        return this.a.q();
    }
    
    @Override
    public int a() {
        return this.a.o();
    }
    
    @Override
    public void a(final float n) {
        p.a((View)this.a.a(), n);
    }
    
    @Override
    public void a(final Configuration configuration) {
        super.a(configuration);
    }
    
    @Override
    public void a(final CharSequence charSequence) {
        this.a.a(charSequence);
    }
    
    @Override
    public void a(final boolean b) {
    }
    
    @Override
    public boolean a(final int n, final KeyEvent keyEvent) {
        boolean performShortcut = false;
        final Menu h = this.h();
        if (h != null) {
            int deviceId;
            if (keyEvent != null) {
                deviceId = keyEvent.getDeviceId();
            }
            else {
                deviceId = -1;
            }
            h.setQwertyMode(KeyCharacterMap.load(deviceId).getKeyboardType() != 1);
            performShortcut = h.performShortcut(n, keyEvent, 0);
        }
        return performShortcut;
    }
    
    @Override
    public boolean a(final KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1) {
            this.c();
        }
        return true;
    }
    
    @Override
    public Context b() {
        return this.a.b();
    }
    
    @Override
    public void c(final boolean b) {
    }
    
    @Override
    public boolean c() {
        return this.a.k();
    }
    
    @Override
    public void d(final boolean b) {
    }
    
    @Override
    public boolean d() {
        return this.a.l();
    }
    
    @Override
    public void e(final boolean d) {
        if (d != this.d) {
            this.d = d;
            for (int size = this.e.size(), i = 0; i < size; ++i) {
                this.e.get(i).a(d);
            }
        }
    }
    
    @Override
    public boolean e() {
        this.a.a().removeCallbacks(this.f);
        p.a((View)this.a.a(), this.f);
        return true;
    }
    
    @Override
    public boolean f() {
        if (this.a.c()) {
            this.a.d();
            return true;
        }
        return false;
    }
    
    @Override
    void g() {
        this.a.a().removeCallbacks(this.f);
    }
    
    private final class a implements android.support.v7.view.menu.o.a
    {
        private boolean b;
        
        @Override
        public void a(final h h, final boolean b) {
            if (this.b) {
                return;
            }
            this.b = true;
            o.this.a.n();
            if (o.this.b != null) {
                o.this.b.onPanelClosed(108, (Menu)h);
            }
            this.b = false;
        }
        
        @Override
        public boolean a(final h h) {
            if (o.this.b != null) {
                o.this.b.onMenuOpened(108, (Menu)h);
                return true;
            }
            return false;
        }
    }
    
    private final class b implements h.a
    {
        @Override
        public void a(final h h) {
            if (o.this.b != null) {
                if (o.this.a.i()) {
                    o.this.b.onPanelClosed(108, (Menu)h);
                }
                else if (o.this.b.onPreparePanel(0, (View)null, (Menu)h)) {
                    o.this.b.onMenuOpened(108, (Menu)h);
                }
            }
        }
        
        @Override
        public boolean a(final h h, final MenuItem menuItem) {
            return false;
        }
    }
}
