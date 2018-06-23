// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v4.media;

import android.text.TextUtils;
import android.os.Build$VERSION;
import android.os.Parcel;
import android.os.Bundle;
import android.net.Uri;
import android.graphics.Bitmap;
import android.os.Parcelable$Creator;
import android.os.Parcelable;

public final class MediaDescriptionCompat implements Parcelable
{
    public static final Parcelable$Creator<MediaDescriptionCompat> CREATOR;
    private final String a;
    private final CharSequence b;
    private final CharSequence c;
    private final CharSequence d;
    private final Bitmap e;
    private final Uri f;
    private final Bundle g;
    private final Uri h;
    private Object i;
    
    static {
        CREATOR = (Parcelable$Creator)new Parcelable$Creator<MediaDescriptionCompat>() {
            public MediaDescriptionCompat a(final Parcel parcel) {
                if (Build$VERSION.SDK_INT < 21) {
                    return new MediaDescriptionCompat(parcel);
                }
                return MediaDescriptionCompat.a(android.support.v4.media.a.a(parcel));
            }
            
            public MediaDescriptionCompat[] a(final int n) {
                return new MediaDescriptionCompat[n];
            }
        };
    }
    
    MediaDescriptionCompat(final Parcel parcel) {
        this.a = parcel.readString();
        this.b = (CharSequence)TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.c = (CharSequence)TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.d = (CharSequence)TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.e = (Bitmap)parcel.readParcelable((ClassLoader)null);
        this.f = (Uri)parcel.readParcelable((ClassLoader)null);
        this.g = parcel.readBundle();
        this.h = (Uri)parcel.readParcelable((ClassLoader)null);
    }
    
    MediaDescriptionCompat(final String a, final CharSequence b, final CharSequence c, final CharSequence d, final Bitmap e, final Uri f, final Bundle g, final Uri h) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
    }
    
    public static MediaDescriptionCompat a(final Object i) {
        MediaDescriptionCompat a;
        final MediaDescriptionCompat mediaDescriptionCompat = a = null;
        if (i != null) {
            a = mediaDescriptionCompat;
            if (Build$VERSION.SDK_INT >= 21) {
                final a a2 = new a();
                a2.a(android.support.v4.media.a.a(i));
                a2.a(android.support.v4.media.a.b(i));
                a2.b(android.support.v4.media.a.c(i));
                a2.c(android.support.v4.media.a.d(i));
                a2.a(android.support.v4.media.a.e(i));
                a2.a(android.support.v4.media.a.f(i));
                Bundle g = android.support.v4.media.a.g(i);
                Uri uri;
                if (g == null) {
                    uri = null;
                }
                else {
                    uri = (Uri)g.getParcelable("android.support.v4.media.description.MEDIA_URI");
                }
                if (uri != null) {
                    if (g.containsKey("android.support.v4.media.description.NULL_BUNDLE_FLAG") && g.size() == 2) {
                        g = null;
                    }
                    else {
                        g.remove("android.support.v4.media.description.MEDIA_URI");
                        g.remove("android.support.v4.media.description.NULL_BUNDLE_FLAG");
                    }
                }
                while (true) {
                    a2.a(g);
                    if (uri != null) {
                        a2.b(uri);
                    }
                    else if (Build$VERSION.SDK_INT >= 23) {
                        a2.b(b.h(i));
                    }
                    a = a2.a();
                    a.i = i;
                    return a;
                    continue;
                }
            }
        }
        return a;
    }
    
    public Object a() {
        if (this.i != null || Build$VERSION.SDK_INT < 21) {
            return this.i;
        }
        final Object a = android.support.v4.media.a.a.a();
        android.support.v4.media.a.a.a(a, this.a);
        android.support.v4.media.a.a.a(a, this.b);
        android.support.v4.media.a.a.b(a, this.c);
        android.support.v4.media.a.a.c(a, this.d);
        android.support.v4.media.a.a.a(a, this.e);
        android.support.v4.media.a.a.a(a, this.f);
        Bundle g;
        final Bundle bundle = g = this.g;
        if (Build$VERSION.SDK_INT < 23) {
            g = bundle;
            if (this.h != null) {
                if ((g = bundle) == null) {
                    g = new Bundle();
                    g.putBoolean("android.support.v4.media.description.NULL_BUNDLE_FLAG", true);
                }
                g.putParcelable("android.support.v4.media.description.MEDIA_URI", (Parcelable)this.h);
            }
        }
        android.support.v4.media.a.a.a(a, g);
        if (Build$VERSION.SDK_INT >= 23) {
            android.support.v4.media.b.a.b(a, this.h);
        }
        return this.i = android.support.v4.media.a.a.a(a);
    }
    
    public int describeContents() {
        return 0;
    }
    
    @Override
    public String toString() {
        return (Object)this.b + ", " + (Object)this.c + ", " + (Object)this.d;
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        if (Build$VERSION.SDK_INT < 21) {
            parcel.writeString(this.a);
            TextUtils.writeToParcel(this.b, parcel, n);
            TextUtils.writeToParcel(this.c, parcel, n);
            TextUtils.writeToParcel(this.d, parcel, n);
            parcel.writeParcelable((Parcelable)this.e, n);
            parcel.writeParcelable((Parcelable)this.f, n);
            parcel.writeBundle(this.g);
            parcel.writeParcelable((Parcelable)this.h, n);
            return;
        }
        android.support.v4.media.a.a(this.a(), parcel, n);
    }
    
    public static final class a
    {
        private String a;
        private CharSequence b;
        private CharSequence c;
        private CharSequence d;
        private Bitmap e;
        private Uri f;
        private Bundle g;
        private Uri h;
        
        public a a(final Bitmap e) {
            this.e = e;
            return this;
        }
        
        public a a(final Uri f) {
            this.f = f;
            return this;
        }
        
        public a a(final Bundle g) {
            this.g = g;
            return this;
        }
        
        public a a(final CharSequence b) {
            this.b = b;
            return this;
        }
        
        public a a(final String a) {
            this.a = a;
            return this;
        }
        
        public MediaDescriptionCompat a() {
            return new MediaDescriptionCompat(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h);
        }
        
        public a b(final Uri h) {
            this.h = h;
            return this;
        }
        
        public a b(final CharSequence c) {
            this.c = c;
            return this;
        }
        
        public a c(final CharSequence d) {
            this.d = d;
            return this;
        }
    }
}
