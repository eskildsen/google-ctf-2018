// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v4.c.a;

import android.graphics.PorterDuff$Mode;
import android.content.res.ColorStateList;
import android.graphics.Outline;
import android.graphics.Rect;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.GradientDrawable;
import android.os.Build$VERSION;
import android.util.Log;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import java.lang.reflect.Method;

class e extends d
{
    private static Method d;
    
    e(final Drawable drawable) {
        super(drawable);
        this.d();
    }
    
    e(final c.a a, final Resources resources) {
        super(a, resources);
        this.d();
    }
    
    private void d() {
        if (e.d != null) {
            return;
        }
        try {
            e.d = Drawable.class.getDeclaredMethod("isProjected", (Class<?>[])new Class[0]);
        }
        catch (Exception ex) {
            Log.w("DrawableWrapperApi21", "Failed to retrieve Drawable#isProjected() method", (Throwable)ex);
        }
    }
    
    @Override
    c.a b() {
        return new a(this.b, null);
    }
    
    @Override
    protected boolean c() {
        boolean b = false;
        if (Build$VERSION.SDK_INT == 21) {
            final Drawable c = this.c;
            if (!(c instanceof GradientDrawable) && !(c instanceof DrawableContainer) && !(c instanceof InsetDrawable)) {
                b = b;
                if (!(c instanceof RippleDrawable)) {
                    return b;
                }
            }
            b = true;
        }
        return b;
    }
    
    public Rect getDirtyBounds() {
        return this.c.getDirtyBounds();
    }
    
    public void getOutline(final Outline outline) {
        this.c.getOutline(outline);
    }
    
    public void setHotspot(final float n, final float n2) {
        this.c.setHotspot(n, n2);
    }
    
    public void setHotspotBounds(final int n, final int n2, final int n3, final int n4) {
        this.c.setHotspotBounds(n, n2, n3, n4);
    }
    
    @Override
    public boolean setState(final int[] state) {
        if (super.setState(state)) {
            this.invalidateSelf();
            return true;
        }
        return false;
    }
    
    @Override
    public void setTint(final int n) {
        if (this.c()) {
            super.setTint(n);
            return;
        }
        this.c.setTint(n);
    }
    
    @Override
    public void setTintList(final ColorStateList list) {
        if (this.c()) {
            super.setTintList(list);
            return;
        }
        this.c.setTintList(list);
    }
    
    @Override
    public void setTintMode(final PorterDuff$Mode porterDuff$Mode) {
        if (this.c()) {
            super.setTintMode(porterDuff$Mode);
            return;
        }
        this.c.setTintMode(porterDuff$Mode);
    }
    
    private static class a extends c.a
    {
        a(final c.a a, final Resources resources) {
            super(a, resources);
        }
        
        @Override
        public Drawable newDrawable(final Resources resources) {
            return new e(this, resources);
        }
    }
}
