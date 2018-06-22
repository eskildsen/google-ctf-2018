// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v7.widget;

import android.view.accessibility.AccessibilityManager;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.support.v4.h.p;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.View$OnLongClickListener;
import android.view.View$OnHoverListener;
import android.view.View$OnAttachStateChangeListener;

class az implements View$OnAttachStateChangeListener, View$OnHoverListener, View$OnLongClickListener
{
    private static az i;
    private final View a;
    private final CharSequence b;
    private final Runnable c;
    private final Runnable d;
    private int e;
    private int f;
    private ba g;
    private boolean h;
    
    private az(final View a, final CharSequence b) {
        this.c = new Runnable() {
            @Override
            public void run() {
                az.this.a(false);
            }
        };
        this.d = new Runnable() {
            @Override
            public void run() {
                az.this.a();
            }
        };
        this.a = a;
        this.b = b;
        this.a.setOnLongClickListener((View$OnLongClickListener)this);
        this.a.setOnHoverListener((View$OnHoverListener)this);
    }
    
    private void a() {
        if (az.i == this) {
            az.i = null;
            if (this.g != null) {
                this.g.a();
                this.g = null;
                this.a.removeOnAttachStateChangeListener((View$OnAttachStateChangeListener)this);
            }
            else {
                Log.e("TooltipCompatHandler", "sActiveHandler.mPopup == null");
            }
        }
        this.a.removeCallbacks(this.c);
        this.a.removeCallbacks(this.d);
    }
    
    public static void a(final View view, final CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            if (az.i != null && az.i.a == view) {
                az.i.a();
            }
            view.setOnLongClickListener((View$OnLongClickListener)null);
            view.setLongClickable(false);
            view.setOnHoverListener((View$OnHoverListener)null);
            return;
        }
        new az(view, charSequence);
    }
    
    private void a(final boolean h) {
        if (!p.m(this.a)) {
            return;
        }
        if (az.i != null) {
            az.i.a();
        }
        az.i = this;
        this.h = h;
        (this.g = new ba(this.a.getContext())).a(this.a, this.e, this.f, this.h, this.b);
        this.a.addOnAttachStateChangeListener((View$OnAttachStateChangeListener)this);
        long n;
        if (this.h) {
            n = 2500L;
        }
        else if ((p.f(this.a) & 0x1) == 0x1) {
            n = 3000L - ViewConfiguration.getLongPressTimeout();
        }
        else {
            n = 15000L - ViewConfiguration.getLongPressTimeout();
        }
        this.a.removeCallbacks(this.d);
        this.a.postDelayed(this.d, n);
    }
    
    public boolean onHover(final View view, final MotionEvent motionEvent) {
        if (this.g == null || !this.h) {
            final AccessibilityManager accessibilityManager = (AccessibilityManager)this.a.getContext().getSystemService("accessibility");
            if (!accessibilityManager.isEnabled() || !accessibilityManager.isTouchExplorationEnabled()) {
                switch (motionEvent.getAction()) {
                    default: {
                        return false;
                    }
                    case 7: {
                        if (this.a.isEnabled() && this.g == null) {
                            this.e = (int)motionEvent.getX();
                            this.f = (int)motionEvent.getY();
                            this.a.removeCallbacks(this.c);
                            this.a.postDelayed(this.c, (long)ViewConfiguration.getLongPressTimeout());
                            return false;
                        }
                        break;
                    }
                    case 10: {
                        this.a();
                        return false;
                    }
                }
            }
        }
        return false;
    }
    
    public boolean onLongClick(final View view) {
        this.e = view.getWidth() / 2;
        this.f = view.getHeight() / 2;
        this.a(true);
        return true;
    }
    
    public void onViewAttachedToWindow(final View view) {
    }
    
    public void onViewDetachedFromWindow(final View view) {
        this.a();
    }
}
