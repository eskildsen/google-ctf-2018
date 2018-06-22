// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v7.widget;

import android.graphics.drawable.Drawable;
import android.graphics.PorterDuff$Mode;
import android.content.res.ColorStateList;
import android.widget.TextView;
import android.view.View;
import android.support.v7.a.a;
import android.util.AttributeSet;
import android.content.Context;
import android.support.v4.h.o;
import android.widget.EditText;

public class m extends EditText implements o
{
    private final g a;
    private final y b;
    
    public m(final Context context, final AttributeSet set) {
        this(context, set, android.support.v7.a.a.a.editTextStyle);
    }
    
    public m(final Context context, final AttributeSet set, final int n) {
        super(at.a(context), set, n);
        (this.a = new g((View)this)).a(set, n);
        (this.b = y.a((TextView)this)).a(set, n);
        this.b.a();
    }
    
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        if (this.a != null) {
            this.a.c();
        }
        if (this.b != null) {
            this.b.a();
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
    
    public void setTextAppearance(final Context context, final int n) {
        super.setTextAppearance(context, n);
        if (this.b != null) {
            this.b.a(context, n);
        }
    }
}
