// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v4.media;

import android.media.MediaDescription$Builder;
import android.os.Bundle;
import android.net.Uri;
import android.graphics.Bitmap;
import android.media.MediaDescription;
import android.os.Parcel;

class a
{
    public static Object a(final Parcel parcel) {
        return MediaDescription.CREATOR.createFromParcel(parcel);
    }
    
    public static String a(final Object o) {
        return ((MediaDescription)o).getMediaId();
    }
    
    public static void a(final Object o, final Parcel parcel, final int n) {
        ((MediaDescription)o).writeToParcel(parcel, n);
    }
    
    public static CharSequence b(final Object o) {
        return ((MediaDescription)o).getTitle();
    }
    
    public static CharSequence c(final Object o) {
        return ((MediaDescription)o).getSubtitle();
    }
    
    public static CharSequence d(final Object o) {
        return ((MediaDescription)o).getDescription();
    }
    
    public static Bitmap e(final Object o) {
        return ((MediaDescription)o).getIconBitmap();
    }
    
    public static Uri f(final Object o) {
        return ((MediaDescription)o).getIconUri();
    }
    
    public static Bundle g(final Object o) {
        return ((MediaDescription)o).getExtras();
    }
    
    static class a
    {
        public static Object a() {
            return new MediaDescription$Builder();
        }
        
        public static Object a(final Object o) {
            return ((MediaDescription$Builder)o).build();
        }
        
        public static void a(final Object o, final Bitmap iconBitmap) {
            ((MediaDescription$Builder)o).setIconBitmap(iconBitmap);
        }
        
        public static void a(final Object o, final Uri iconUri) {
            ((MediaDescription$Builder)o).setIconUri(iconUri);
        }
        
        public static void a(final Object o, final Bundle extras) {
            ((MediaDescription$Builder)o).setExtras(extras);
        }
        
        public static void a(final Object o, final CharSequence title) {
            ((MediaDescription$Builder)o).setTitle(title);
        }
        
        public static void a(final Object o, final String mediaId) {
            ((MediaDescription$Builder)o).setMediaId(mediaId);
        }
        
        public static void b(final Object o, final CharSequence subtitle) {
            ((MediaDescription$Builder)o).setSubtitle(subtitle);
        }
        
        public static void c(final Object o, final CharSequence description) {
            ((MediaDescription$Builder)o).setDescription(description);
        }
    }
}
