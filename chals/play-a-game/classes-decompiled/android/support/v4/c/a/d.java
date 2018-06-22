// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v4.c.a;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;

class d extends c
{
    d(final Drawable drawable) {
        super(drawable);
    }
    
    d(final c.a a, final Resources resources) {
        super(a, resources);
    }
    
    @Override
    c.a b() {
        return new a(this.b, null);
    }
    
    public boolean isAutoMirrored() {
        return this.c.isAutoMirrored();
    }
    
    public void setAutoMirrored(final boolean autoMirrored) {
        this.c.setAutoMirrored(autoMirrored);
    }
    
    private static class a extends c.a
    {
        a(final c.a a, final Resources resources) {
            super(a, resources);
        }
        
        @Override
        public Drawable newDrawable(final Resources resources) {
            return new d(this, resources);
        }
    }
}
