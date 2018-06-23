// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v7.view;

import android.support.v7.a.a;
import android.content.res.AssetManager;
import android.os.Build$VERSION;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.Configuration;
import android.view.LayoutInflater;
import android.content.res.Resources$Theme;
import android.content.ContextWrapper;

public class d extends ContextWrapper
{
    private int a;
    private Resources$Theme b;
    private LayoutInflater c;
    private Configuration d;
    private Resources e;
    
    public d() {
        super((Context)null);
    }
    
    public d(final Context context, final int a) {
        super(context);
        this.a = a;
    }
    
    public d(final Context context, final Resources$Theme b) {
        super(context);
        this.b = b;
    }
    
    private Resources b() {
        if (this.e == null) {
            if (this.d == null) {
                this.e = super.getResources();
            }
            else if (Build$VERSION.SDK_INT >= 17) {
                this.e = this.createConfigurationContext(this.d).getResources();
            }
        }
        return this.e;
    }
    
    private void c() {
        final boolean b = this.b == null;
        if (b) {
            this.b = this.getResources().newTheme();
            final Resources$Theme theme = this.getBaseContext().getTheme();
            if (theme != null) {
                this.b.setTo(theme);
            }
        }
        this.a(this.b, this.a, b);
    }
    
    public int a() {
        return this.a;
    }
    
    protected void a(final Resources$Theme resources$Theme, final int n, final boolean b) {
        resources$Theme.applyStyle(n, true);
    }
    
    protected void attachBaseContext(final Context context) {
        super.attachBaseContext(context);
    }
    
    public AssetManager getAssets() {
        return this.getResources().getAssets();
    }
    
    public Resources getResources() {
        return this.b();
    }
    
    public Object getSystemService(final String s) {
        if ("layout_inflater".equals(s)) {
            if (this.c == null) {
                this.c = LayoutInflater.from(this.getBaseContext()).cloneInContext((Context)this);
            }
            return this.c;
        }
        return this.getBaseContext().getSystemService(s);
    }
    
    public Resources$Theme getTheme() {
        if (this.b != null) {
            return this.b;
        }
        if (this.a == 0) {
            this.a = android.support.v7.a.a.i.Theme_AppCompat_Light;
        }
        this.c();
        return this.b;
    }
    
    public void setTheme(final int a) {
        if (this.a != a) {
            this.a = a;
            this.c();
        }
    }
}
