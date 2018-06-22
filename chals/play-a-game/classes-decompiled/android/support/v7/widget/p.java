// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v7.widget;

import android.net.Uri;
import android.graphics.drawable.Icon;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.graphics.PorterDuff$Mode;
import android.content.res.ColorStateList;
import android.view.View;
import android.util.AttributeSet;
import android.content.Context;
import android.support.v4.widget.l;
import android.support.v4.h.o;
import android.widget.ImageView;

public class p extends ImageView implements o, l
{
    private final g a;
    private final android.support.v7.widget.o b;
    
    public p(final Context context) {
        this(context, null);
    }
    
    public p(final Context context, final AttributeSet set) {
        this(context, set, 0);
    }
    
    public p(final Context context, final AttributeSet set, final int n) {
        super(at.a(context), set, n);
        (this.a = new g((View)this)).a(set, n);
        (this.b = new android.support.v7.widget.o(this)).a(set, n);
    }
    
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        if (this.a != null) {
            this.a.c();
        }
        if (this.b != null) {
            this.b.d();
        }
    }
    
    public ColorStateList getSupportBackgroundTintList() {
        if (this.a != null) {
            return this.a.a();
        }
        return null;
    }
    
    public PorterDuff$Mode getSupportBackgroundTintMode() {
        if (this.a != null) {
            return this.a.b();
        }
        return null;
    }
    
    public ColorStateList getSupportImageTintList() {
        if (this.b != null) {
            return this.b.b();
        }
        return null;
    }
    
    public PorterDuff$Mode getSupportImageTintMode() {
        if (this.b != null) {
            return this.b.c();
        }
        return null;
    }
    
    public boolean hasOverlappingRendering() {
        return this.b.a() && super.hasOverlappingRendering();
    }
    
    public void setBackgroundDrawable(final Drawable backgroundDrawable) {
        super.setBackgroundDrawable(backgroundDrawable);
        if (this.a != null) {
            this.a.a(backgroundDrawable);
        }
    }
    
    public void setBackgroundResource(final int backgroundResource) {
        super.setBackgroundResource(backgroundResource);
        if (this.a != null) {
            this.a.a(backgroundResource);
        }
    }
    
    public void setImageBitmap(final Bitmap imageBitmap) {
        super.setImageBitmap(imageBitmap);
        if (this.b != null) {
            this.b.d();
        }
    }
    
    public void setImageDrawable(final Drawable imageDrawable) {
        super.setImageDrawable(imageDrawable);
        if (this.b != null) {
            this.b.d();
        }
    }
    
    public void setImageIcon(final Icon imageIcon) {
        super.setImageIcon(imageIcon);
        if (this.b != null) {
            this.b.d();
        }
    }
    
    public void setImageResource(final int n) {
        if (this.b != null) {
            this.b.a(n);
        }
    }
    
    public void setImageURI(final Uri imageURI) {
        super.setImageURI(imageURI);
        if (this.b != null) {
            this.b.d();
        }
    }
    
    public void setSupportBackgroundTintList(final ColorStateList list) {
        if (this.a != null) {
            this.a.a(list);
        }
    }
    
    public void setSupportBackgroundTintMode(final PorterDuff$Mode porterDuff$Mode) {
        if (this.a != null) {
            this.a.a(porterDuff$Mode);
        }
    }
    
    public void setSupportImageTintList(final ColorStateList list) {
        if (this.b != null) {
            this.b.a(list);
        }
    }
    
    public void setSupportImageTintMode(final PorterDuff$Mode porterDuff$Mode) {
        if (this.b != null) {
            this.b.a(porterDuff$Mode);
        }
    }
}
