// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v4.a;

import android.view.ViewTreeObserver;
import android.view.View;
import android.view.ViewTreeObserver$OnPreDrawListener;
import android.view.View$OnAttachStateChangeListener;

class x implements View$OnAttachStateChangeListener, ViewTreeObserver$OnPreDrawListener
{
    private final View a;
    private ViewTreeObserver b;
    private final Runnable c;
    
    private x(final View a, final Runnable c) {
        this.a = a;
        this.b = a.getViewTreeObserver();
        this.c = c;
    }
    
    public static x a(final View view, final Runnable runnable) {
        final x x = new x(view, runnable);
        view.getViewTreeObserver().addOnPreDrawListener((ViewTreeObserver$OnPreDrawListener)x);
        view.addOnAttachStateChangeListener((View$OnAttachStateChangeListener)x);
        return x;
    }
    
    public void a() {
        if (this.b.isAlive()) {
            this.b.removeOnPreDrawListener((ViewTreeObserver$OnPreDrawListener)this);
        }
        else {
            this.a.getViewTreeObserver().removeOnPreDrawListener((ViewTreeObserver$OnPreDrawListener)this);
        }
        this.a.removeOnAttachStateChangeListener((View$OnAttachStateChangeListener)this);
    }
    
    public boolean onPreDraw() {
        this.a();
        this.c.run();
        return true;
    }
    
    public void onViewAttachedToWindow(final View view) {
        this.b = view.getViewTreeObserver();
    }
    
    public void onViewDetachedFromWindow(final View view) {
        this.a();
    }
}
