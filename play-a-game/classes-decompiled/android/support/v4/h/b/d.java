// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v4.h.b;

import android.view.animation.Interpolator;

abstract class d implements Interpolator
{
    private final float[] a;
    private final float b;
    
    public d(final float[] a) {
        this.a = a;
        this.b = 1.0f / (this.a.length - 1);
    }
    
    public float getInterpolation(float n) {
        if (n >= 1.0f) {
            return 1.0f;
        }
        if (n <= 0.0f) {
            return 0.0f;
        }
        final int min = Math.min((int)((this.a.length - 1) * n), this.a.length - 2);
        n = (n - min * this.b) / this.b;
        return (this.a[min + 1] - this.a[min]) * n + this.a[min];
    }
}
