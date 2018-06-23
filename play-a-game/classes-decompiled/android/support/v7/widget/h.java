// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v7.widget;

import android.graphics.drawable.Drawable;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityEvent;
import android.graphics.PorterDuff$Mode;
import android.content.res.ColorStateList;
import android.os.Build$VERSION;
import android.widget.TextView;
import android.view.View;
import android.support.v7.a.a;
import android.util.AttributeSet;
import android.content.Context;
import android.support.v4.h.o;
import android.widget.Button;

public class h extends Button implements o
{
    private final g a;
    private final y b;
    
    public h(final Context context, final AttributeSet set) {
        this(context, set, android.support.v7.a.a.a.buttonStyle);
    }
    
    public h(final Context context, final AttributeSet set, final int n) {
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
    
    public int getAutoSizeMaxTextSize() {
        if (Build$VERSION.SDK_INT >= 26) {
            return super.getAutoSizeMaxTextSize();
        }
        if (this.b != null) {
            return this.b.g();
        }
        return -1;
    }
    
    public int getAutoSizeMinTextSize() {
        if (Build$VERSION.SDK_INT >= 26) {
            return super.getAutoSizeMinTextSize();
        }
        if (this.b != null) {
            return this.b.f();
        }
        return -1;
    }
    
    public int getAutoSizeStepGranularity() {
        if (Build$VERSION.SDK_INT >= 26) {
            return super.getAutoSizeStepGranularity();
        }
        if (this.b != null) {
            return this.b.e();
        }
        return -1;
    }
    
    public int[] getAutoSizeTextAvailableSizes() {
        if (Build$VERSION.SDK_INT >= 26) {
            return super.getAutoSizeTextAvailableSizes();
        }
        if (this.b != null) {
            return this.b.h();
        }
        return new int[0];
    }
    
    public int getAutoSizeTextType() {
        if (Build$VERSION.SDK_INT >= 26) {
            if (super.getAutoSizeTextType() == 1) {
                return 1;
            }
            return 0;
        }
        else {
            if (this.b != null) {
                return this.b.d();
            }
            return 0;
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
    
    public void onInitializeAccessibilityEvent(final AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName((CharSequence)Button.class.getName());
    }
    
    public void onInitializeAccessibilityNodeInfo(final AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName((CharSequence)Button.class.getName());
    }
    
    protected void onLayout(final boolean b, final int n, final int n2, final int n3, final int n4) {
        super.onLayout(b, n, n2, n3, n4);
        if (this.b != null) {
            this.b.a(b, n, n2, n3, n4);
        }
    }
    
    protected void onTextChanged(final CharSequence charSequence, final int n, final int n2, final int n3) {
        super.onTextChanged(charSequence, n, n2, n3);
        if (this.b != null && Build$VERSION.SDK_INT < 26 && this.b.c()) {
            this.b.b();
        }
    }
    
    public void setAutoSizeTextTypeUniformWithConfiguration(final int n, final int n2, final int n3, final int n4) {
        if (Build$VERSION.SDK_INT >= 26) {
            super.setAutoSizeTextTypeUniformWithConfiguration(n, n2, n3, n4);
        }
        else if (this.b != null) {
            this.b.a(n, n2, n3, n4);
        }
    }
    
    public void setAutoSizeTextTypeUniformWithPresetSizes(final int[] array, final int n) {
        if (Build$VERSION.SDK_INT >= 26) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(array, n);
        }
        else if (this.b != null) {
            this.b.a(array, n);
        }
    }
    
    public void setAutoSizeTextTypeWithDefaults(final int autoSizeTextTypeWithDefaults) {
        if (Build$VERSION.SDK_INT >= 26) {
            super.setAutoSizeTextTypeWithDefaults(autoSizeTextTypeWithDefaults);
        }
        else if (this.b != null) {
            this.b.a(autoSizeTextTypeWithDefaults);
        }
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
    
    public void setSupportAllCaps(final boolean b) {
        if (this.b != null) {
            this.b.a(b);
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
    
    public void setTextSize(final int n, final float n2) {
        if (Build$VERSION.SDK_INT >= 26) {
            super.setTextSize(n, n2);
        }
        else if (this.b != null) {
            this.b.a(n, n2);
        }
    }
}
