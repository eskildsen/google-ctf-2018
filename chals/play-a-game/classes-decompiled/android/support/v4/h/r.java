// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v4.h;

import android.graphics.Paint;
import android.animation.TimeInterpolator;
import android.view.animation.Interpolator;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import android.os.Build$VERSION;
import android.animation.Animator$AnimatorListener;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import java.lang.ref.WeakReference;

public final class r
{
    Runnable a;
    Runnable b;
    int c;
    private WeakReference<View> d;
    
    r(final View view) {
        this.a = null;
        this.b = null;
        this.c = -1;
        this.d = new WeakReference<View>(view);
    }
    
    private void a(final View view, final s s) {
        if (s != null) {
            view.animate().setListener((Animator$AnimatorListener)new AnimatorListenerAdapter() {
                public void onAnimationCancel(final Animator animator) {
                    s.c(view);
                }
                
                public void onAnimationEnd(final Animator animator) {
                    s.b(view);
                }
                
                public void onAnimationStart(final Animator animator) {
                    s.a(view);
                }
            });
            return;
        }
        view.animate().setListener((Animator$AnimatorListener)null);
    }
    
    public long a() {
        final View view = this.d.get();
        if (view != null) {
            return view.animate().getDuration();
        }
        return 0L;
    }
    
    public r a(final float n) {
        final View view = this.d.get();
        if (view != null) {
            view.animate().alpha(n);
        }
        return this;
    }
    
    public r a(final long duration) {
        final View view = this.d.get();
        if (view != null) {
            view.animate().setDuration(duration);
        }
        return this;
    }
    
    public r a(final s s) {
        final View view = this.d.get();
        if (view != null) {
            if (Build$VERSION.SDK_INT < 16) {
                view.setTag(2113929216, (Object)s);
                this.a(view, new a(this));
                return this;
            }
            this.a(view, s);
        }
        return this;
    }
    
    public r a(final u u) {
        final View view = this.d.get();
        if (view != null && Build$VERSION.SDK_INT >= 19) {
            Object updateListener = null;
            if (u != null) {
                updateListener = new ValueAnimator$AnimatorUpdateListener() {
                    public void onAnimationUpdate(final ValueAnimator valueAnimator) {
                        u.a(view);
                    }
                };
            }
            view.animate().setUpdateListener((ValueAnimator$AnimatorUpdateListener)updateListener);
        }
        return this;
    }
    
    public r a(final Interpolator interpolator) {
        final View view = this.d.get();
        if (view != null) {
            view.animate().setInterpolator((TimeInterpolator)interpolator);
        }
        return this;
    }
    
    public r b(final float n) {
        final View view = this.d.get();
        if (view != null) {
            view.animate().translationY(n);
        }
        return this;
    }
    
    public r b(final long startDelay) {
        final View view = this.d.get();
        if (view != null) {
            view.animate().setStartDelay(startDelay);
        }
        return this;
    }
    
    public void b() {
        final View view = this.d.get();
        if (view != null) {
            view.animate().cancel();
        }
    }
    
    public void c() {
        final View view = this.d.get();
        if (view != null) {
            view.animate().start();
        }
    }
    
    static class a implements s
    {
        r a;
        boolean b;
        
        a(final r a) {
            this.a = a;
        }
        
        @Override
        public void a(final View view) {
            this.b = false;
            if (this.a.c > -1) {
                view.setLayerType(2, (Paint)null);
            }
            if (this.a.a != null) {
                final Runnable a = this.a.a;
                this.a.a = null;
                a.run();
            }
            final Object tag = view.getTag(2113929216);
            s s;
            if (tag instanceof s) {
                s = (s)tag;
            }
            else {
                s = null;
            }
            if (s != null) {
                s.a(view);
            }
        }
        
        @Override
        public void b(final View view) {
            if (this.a.c > -1) {
                view.setLayerType(this.a.c, (Paint)null);
                this.a.c = -1;
            }
            if (Build$VERSION.SDK_INT >= 16 || !this.b) {
                if (this.a.b != null) {
                    final Runnable b = this.a.b;
                    this.a.b = null;
                    b.run();
                }
                final Object tag = view.getTag(2113929216);
                s s;
                if (tag instanceof s) {
                    s = (s)tag;
                }
                else {
                    s = null;
                }
                if (s != null) {
                    s.b(view);
                }
                this.b = true;
            }
        }
        
        @Override
        public void c(final View view) {
            final Object tag = view.getTag(2113929216);
            s s;
            if (tag instanceof s) {
                s = (s)tag;
            }
            else {
                s = null;
            }
            if (s != null) {
                s.c(view);
            }
        }
    }
}
