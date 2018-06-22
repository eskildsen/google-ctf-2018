// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v7.widget;

import android.content.res.AssetManager;
import android.os.Build$VERSION;
import android.content.Context;
import android.content.res.Resources$Theme;
import android.content.res.Resources;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import android.content.ContextWrapper;

public class at extends ContextWrapper
{
    private static final Object a;
    private static ArrayList<WeakReference<at>> b;
    private final Resources c;
    private final Resources$Theme d;
    
    static {
        a = new Object();
    }
    
    private at(final Context context) {
        super(context);
        if (bb.a()) {
            this.c = new bb((Context)this, context.getResources());
            (this.d = this.c.newTheme()).setTo(context.getTheme());
            return;
        }
        this.c = new av((Context)this, context.getResources());
        this.d = null;
    }
    
    public static Context a(final Context context) {
        if (b(context)) {
        Label_0112_Outer:
            while (true) {
            Label_0139_Outer:
                while (true) {
                    int n = 0;
                Label_0174:
                    while (true) {
                    Label_0169:
                        while (true) {
                            Label_0162: {
                                synchronized (at.a) {
                                    if (at.b == null) {
                                        at.b = new ArrayList<WeakReference<at>>();
                                    }
                                    else {
                                        n = at.b.size() - 1;
                                        if (n >= 0) {
                                            final WeakReference<at> weakReference = at.b.get(n);
                                            if (weakReference == null || weakReference.get() == null) {
                                                at.b.remove(n);
                                            }
                                            break Label_0162;
                                        }
                                        else {
                                            n = at.b.size() - 1;
                                            if (n >= 0) {
                                                final WeakReference<at> weakReference2 = at.b.get(n);
                                                if (weakReference2 == null) {
                                                    break Label_0169;
                                                }
                                                final Object o = weakReference2.get();
                                                if (o != null && ((at)o).getBaseContext() == context) {
                                                    return (Context)o;
                                                }
                                                break Label_0174;
                                            }
                                        }
                                    }
                                    final at at = new at(context);
                                    android.support.v7.widget.at.b.add(new WeakReference<at>(at));
                                    return (Context)at;
                                }
                                break;
                            }
                            --n;
                            continue Label_0112_Outer;
                        }
                        final Object o = null;
                        continue;
                    }
                    --n;
                    continue Label_0139_Outer;
                }
            }
        }
        return context;
    }
    
    private static boolean b(final Context context) {
        return !(context instanceof at) && !(context.getResources() instanceof av) && !(context.getResources() instanceof bb) && (Build$VERSION.SDK_INT < 21 || bb.a());
    }
    
    public AssetManager getAssets() {
        return this.c.getAssets();
    }
    
    public Resources getResources() {
        return this.c;
    }
    
    public Resources$Theme getTheme() {
        if (this.d == null) {
            return super.getTheme();
        }
        return this.d;
    }
    
    public void setTheme(final int theme) {
        if (this.d == null) {
            super.setTheme(theme);
            return;
        }
        this.d.applyStyle(theme, true);
    }
}
