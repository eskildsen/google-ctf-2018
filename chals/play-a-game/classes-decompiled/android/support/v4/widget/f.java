// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v4.widget;

import android.graphics.drawable.Drawable;
import android.graphics.PorterDuff$Mode;
import android.content.res.ColorStateList;
import android.widget.ImageView;
import android.os.Build$VERSION;

public class f
{
    static final b a;
    
    static {
        if (Build$VERSION.SDK_INT >= 21) {
            a = (b)new c();
            return;
        }
        a = (b)new a();
    }
    
    public static ColorStateList a(final ImageView imageView) {
        return f.a.a(imageView);
    }
    
    public static void a(final ImageView imageView, final ColorStateList list) {
        f.a.a(imageView, list);
    }
    
    public static void a(final ImageView imageView, final PorterDuff$Mode porterDuff$Mode) {
        f.a.a(imageView, porterDuff$Mode);
    }
    
    public static PorterDuff$Mode b(final ImageView imageView) {
        return f.a.b(imageView);
    }
    
    static class a implements b
    {
        @Override
        public ColorStateList a(final ImageView imageView) {
            if (imageView instanceof l) {
                return ((l)imageView).getSupportImageTintList();
            }
            return null;
        }
        
        @Override
        public void a(final ImageView imageView, final ColorStateList supportImageTintList) {
            if (imageView instanceof l) {
                ((l)imageView).setSupportImageTintList(supportImageTintList);
            }
        }
        
        @Override
        public void a(final ImageView imageView, final PorterDuff$Mode supportImageTintMode) {
            if (imageView instanceof l) {
                ((l)imageView).setSupportImageTintMode(supportImageTintMode);
            }
        }
        
        @Override
        public PorterDuff$Mode b(final ImageView imageView) {
            if (imageView instanceof l) {
                return ((l)imageView).getSupportImageTintMode();
            }
            return null;
        }
    }
    
    interface b
    {
        ColorStateList a(final ImageView p0);
        
        void a(final ImageView p0, final ColorStateList p1);
        
        void a(final ImageView p0, final PorterDuff$Mode p1);
        
        PorterDuff$Mode b(final ImageView p0);
    }
    
    static class c extends a
    {
        @Override
        public ColorStateList a(final ImageView imageView) {
            return imageView.getImageTintList();
        }
        
        @Override
        public void a(final ImageView imageView, final ColorStateList imageTintList) {
            imageView.setImageTintList(imageTintList);
            if (Build$VERSION.SDK_INT == 21) {
                final Drawable drawable = imageView.getDrawable();
                boolean b;
                if (imageView.getImageTintList() != null && imageView.getImageTintMode() != null) {
                    b = true;
                }
                else {
                    b = false;
                }
                if (drawable != null && b) {
                    if (drawable.isStateful()) {
                        drawable.setState(imageView.getDrawableState());
                    }
                    imageView.setImageDrawable(drawable);
                }
            }
        }
        
        @Override
        public void a(final ImageView imageView, final PorterDuff$Mode imageTintMode) {
            imageView.setImageTintMode(imageTintMode);
            if (Build$VERSION.SDK_INT == 21) {
                final Drawable drawable = imageView.getDrawable();
                boolean b;
                if (imageView.getImageTintList() != null && imageView.getImageTintMode() != null) {
                    b = true;
                }
                else {
                    b = false;
                }
                if (drawable != null && b) {
                    if (drawable.isStateful()) {
                        drawable.setState(imageView.getDrawableState());
                    }
                    imageView.setImageDrawable(drawable);
                }
            }
        }
        
        @Override
        public PorterDuff$Mode b(final ImageView imageView) {
            return imageView.getImageTintMode();
        }
    }
}
