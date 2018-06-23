// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v7.app;

import android.view.Menu;
import android.view.MenuItem;
import android.os.Bundle;
import android.content.res.Configuration;
import android.content.Context;
import android.support.v7.widget.bb;
import android.view.MenuInflater;
import android.view.ViewGroup$LayoutParams;
import android.view.View;
import android.support.v4.a.w;
import android.content.Intent;
import android.app.Activity;
import android.support.v7.view.b;
import android.view.Window;
import android.os.Build$VERSION;
import android.view.KeyEvent;
import android.content.res.Resources;
import android.support.v4.a.ab;
import android.support.v4.a.i;

public class c extends i implements ab.a, d
{
    private android.support.v7.app.e l;
    private int m;
    private Resources n;
    
    public c() {
        this.m = 0;
    }
    
    private boolean a(final int n, final KeyEvent keyEvent) {
        if (Build$VERSION.SDK_INT < 26 && !keyEvent.isCtrlPressed() && !KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState()) && keyEvent.getRepeatCount() == 0 && !KeyEvent.isModifierKey(keyEvent.getKeyCode())) {
            final Window window = this.getWindow();
            if (window != null && window.getDecorView() != null && window.getDecorView().dispatchKeyShortcutEvent(keyEvent)) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public b a(final b.a a) {
        return null;
    }
    
    public void a(final ab ab) {
        ab.a(this);
    }
    
    @Override
    public void a(final b b) {
    }
    
    public boolean a(final Intent intent) {
        return w.a(this, intent);
    }
    
    @Override
    public Intent a_() {
        return w.a(this);
    }
    
    public void addContentView(final View view, final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        this.j().b(view, viewGroup$LayoutParams);
    }
    
    public void b(final Intent intent) {
        w.b(this, intent);
    }
    
    public void b(final ab ab) {
    }
    
    @Override
    public void b(final b b) {
    }
    
    public void closeOptionsMenu() {
        final a g = this.g();
        if (this.getWindow().hasFeature(0) && (g == null || !g.d())) {
            super.closeOptionsMenu();
        }
    }
    
    @Override
    public void d() {
        this.j().f();
    }
    
    public boolean dispatchKeyEvent(final KeyEvent keyEvent) {
        final int keyCode = keyEvent.getKeyCode();
        final a g = this.g();
        return (keyCode == 82 && g != null && g.a(keyEvent)) || super.dispatchKeyEvent(keyEvent);
    }
    
    public <T extends View> T findViewById(final int n) {
        return this.j().a(n);
    }
    
    public a g() {
        return this.j().a();
    }
    
    public MenuInflater getMenuInflater() {
        return this.j().b();
    }
    
    public Resources getResources() {
        if (this.n == null && bb.a()) {
            this.n = new bb((Context)this, super.getResources());
        }
        if (this.n == null) {
            return super.getResources();
        }
        return this.n;
    }
    
    public boolean h() {
        final Intent a_ = this.a_();
        if (a_ != null) {
            Label_0050: {
                if (!this.a(a_)) {
                    break Label_0050;
                }
                final ab a = ab.a((Context)this);
                this.a(a);
                this.b(a);
                a.a();
                try {
                    android.support.v4.a.a.a(this);
                    return true;
                }
                catch (IllegalStateException ex) {
                    this.finish();
                    return true;
                }
            }
            this.b(a_);
            return true;
        }
        return false;
    }
    
    @Deprecated
    public void i() {
    }
    
    public void invalidateOptionsMenu() {
        this.j().f();
    }
    
    public android.support.v7.app.e j() {
        if (this.l == null) {
            this.l = android.support.v7.app.e.a(this, this);
        }
        return this.l;
    }
    
    @Override
    public void onConfigurationChanged(final Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.j().a(configuration);
        if (this.n != null) {
            this.n.updateConfiguration(configuration, super.getResources().getDisplayMetrics());
        }
    }
    
    public void onContentChanged() {
        this.i();
    }
    
    @Override
    protected void onCreate(final Bundle bundle) {
        final android.support.v7.app.e j = this.j();
        j.h();
        j.a(bundle);
        if (j.i() && this.m != 0) {
            if (Build$VERSION.SDK_INT >= 23) {
                this.onApplyThemeResource(this.getTheme(), this.m, false);
            }
            else {
                this.setTheme(this.m);
            }
        }
        super.onCreate(bundle);
    }
    
    @Override
    protected void onDestroy() {
        super.onDestroy();
        this.j().g();
    }
    
    public boolean onKeyDown(final int n, final KeyEvent keyEvent) {
        return this.a(n, keyEvent) || super.onKeyDown(n, keyEvent);
    }
    
    @Override
    public final boolean onMenuItemSelected(final int n, final MenuItem menuItem) {
        if (super.onMenuItemSelected(n, menuItem)) {
            return true;
        }
        final a g = this.g();
        return menuItem.getItemId() == 16908332 && g != null && (g.a() & 0x4) != 0x0 && this.h();
    }
    
    public boolean onMenuOpened(final int n, final Menu menu) {
        return super.onMenuOpened(n, menu);
    }
    
    @Override
    public void onPanelClosed(final int n, final Menu menu) {
        super.onPanelClosed(n, menu);
    }
    
    protected void onPostCreate(final Bundle bundle) {
        super.onPostCreate(bundle);
        this.j().b(bundle);
    }
    
    @Override
    protected void onPostResume() {
        super.onPostResume();
        this.j().e();
    }
    
    @Override
    protected void onSaveInstanceState(final Bundle bundle) {
        super.onSaveInstanceState(bundle);
        this.j().c(bundle);
    }
    
    @Override
    protected void onStart() {
        super.onStart();
        this.j().c();
    }
    
    @Override
    protected void onStop() {
        super.onStop();
        this.j().d();
    }
    
    protected void onTitleChanged(final CharSequence charSequence, final int n) {
        super.onTitleChanged(charSequence, n);
        this.j().a(charSequence);
    }
    
    public void openOptionsMenu() {
        final a g = this.g();
        if (this.getWindow().hasFeature(0) && (g == null || !g.c())) {
            super.openOptionsMenu();
        }
    }
    
    public void setContentView(final int n) {
        this.j().b(n);
    }
    
    public void setContentView(final View view) {
        this.j().a(view);
    }
    
    public void setContentView(final View view, final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        this.j().a(view, viewGroup$LayoutParams);
    }
    
    public void setTheme(final int n) {
        super.setTheme(n);
        this.m = n;
    }
}
