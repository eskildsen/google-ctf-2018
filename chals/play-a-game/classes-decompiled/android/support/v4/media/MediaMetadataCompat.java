// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v4.media;

import android.os.Build$VERSION;
import android.os.Parcel;
import android.os.Bundle;
import android.support.v4.g.a;
import android.os.Parcelable$Creator;
import android.os.Parcelable;

public final class MediaMetadataCompat implements Parcelable
{
    public static final Parcelable$Creator<MediaMetadataCompat> CREATOR;
    static final a<String, Integer> a;
    private static final String[] c;
    private static final String[] d;
    private static final String[] e;
    final Bundle b;
    private Object f;
    
    static {
        (a = new a<String, Integer>()).put("android.media.metadata.TITLE", 1);
        MediaMetadataCompat.a.put("android.media.metadata.ARTIST", 1);
        MediaMetadataCompat.a.put("android.media.metadata.DURATION", 0);
        MediaMetadataCompat.a.put("android.media.metadata.ALBUM", 1);
        MediaMetadataCompat.a.put("android.media.metadata.AUTHOR", 1);
        MediaMetadataCompat.a.put("android.media.metadata.WRITER", 1);
        MediaMetadataCompat.a.put("android.media.metadata.COMPOSER", 1);
        MediaMetadataCompat.a.put("android.media.metadata.COMPILATION", 1);
        MediaMetadataCompat.a.put("android.media.metadata.DATE", 1);
        MediaMetadataCompat.a.put("android.media.metadata.YEAR", 0);
        MediaMetadataCompat.a.put("android.media.metadata.GENRE", 1);
        MediaMetadataCompat.a.put("android.media.metadata.TRACK_NUMBER", 0);
        MediaMetadataCompat.a.put("android.media.metadata.NUM_TRACKS", 0);
        MediaMetadataCompat.a.put("android.media.metadata.DISC_NUMBER", 0);
        MediaMetadataCompat.a.put("android.media.metadata.ALBUM_ARTIST", 1);
        MediaMetadataCompat.a.put("android.media.metadata.ART", 2);
        MediaMetadataCompat.a.put("android.media.metadata.ART_URI", 1);
        MediaMetadataCompat.a.put("android.media.metadata.ALBUM_ART", 2);
        MediaMetadataCompat.a.put("android.media.metadata.ALBUM_ART_URI", 1);
        MediaMetadataCompat.a.put("android.media.metadata.USER_RATING", 3);
        MediaMetadataCompat.a.put("android.media.metadata.RATING", 3);
        MediaMetadataCompat.a.put("android.media.metadata.DISPLAY_TITLE", 1);
        MediaMetadataCompat.a.put("android.media.metadata.DISPLAY_SUBTITLE", 1);
        MediaMetadataCompat.a.put("android.media.metadata.DISPLAY_DESCRIPTION", 1);
        MediaMetadataCompat.a.put("android.media.metadata.DISPLAY_ICON", 2);
        MediaMetadataCompat.a.put("android.media.metadata.DISPLAY_ICON_URI", 1);
        MediaMetadataCompat.a.put("android.media.metadata.MEDIA_ID", 1);
        MediaMetadataCompat.a.put("android.media.metadata.BT_FOLDER_TYPE", 0);
        MediaMetadataCompat.a.put("android.media.metadata.MEDIA_URI", 1);
        MediaMetadataCompat.a.put("android.media.metadata.ADVERTISEMENT", 0);
        MediaMetadataCompat.a.put("android.media.metadata.DOWNLOAD_STATUS", 0);
        c = new String[] { "android.media.metadata.TITLE", "android.media.metadata.ARTIST", "android.media.metadata.ALBUM", "android.media.metadata.ALBUM_ARTIST", "android.media.metadata.WRITER", "android.media.metadata.AUTHOR", "android.media.metadata.COMPOSER" };
        d = new String[] { "android.media.metadata.DISPLAY_ICON", "android.media.metadata.ART", "android.media.metadata.ALBUM_ART" };
        e = new String[] { "android.media.metadata.DISPLAY_ICON_URI", "android.media.metadata.ART_URI", "android.media.metadata.ALBUM_ART_URI" };
        CREATOR = (Parcelable$Creator)new Parcelable$Creator<MediaMetadataCompat>() {
            public MediaMetadataCompat a(final Parcel parcel) {
                return new MediaMetadataCompat(parcel);
            }
            
            public MediaMetadataCompat[] a(final int n) {
                return new MediaMetadataCompat[n];
            }
        };
    }
    
    MediaMetadataCompat(final Parcel parcel) {
        this.b = parcel.readBundle();
    }
    
    public static MediaMetadataCompat a(final Object f) {
        if (f != null && Build$VERSION.SDK_INT >= 21) {
            final Parcel obtain = Parcel.obtain();
            android.support.v4.media.c.a(f, obtain, 0);
            obtain.setDataPosition(0);
            final MediaMetadataCompat mediaMetadataCompat = (MediaMetadataCompat)MediaMetadataCompat.CREATOR.createFromParcel(obtain);
            obtain.recycle();
            mediaMetadataCompat.f = f;
            return mediaMetadataCompat;
        }
        return null;
    }
    
    public int describeContents() {
        return 0;
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeBundle(this.b);
    }
}
