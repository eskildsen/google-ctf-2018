// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v4.media;

import java.util.List;
import java.util.ArrayList;
import android.os.Parcel;
import android.os.Parcelable$Creator;
import android.os.Parcelable;
import android.os.Bundle;
import android.support.v4.e.b;
import android.util.Log;

public final class MediaBrowserCompat
{
    static final boolean a;
    
    static {
        a = Log.isLoggable("MediaBrowserCompat", 3);
    }
    
    private static class CustomActionResultReceiver extends b
    {
        private final String d;
        private final Bundle e;
        private final MediaBrowserCompat.a f;
        
        @Override
        protected void a(final int n, final Bundle bundle) {
            if (this.f == null) {
                return;
            }
            switch (n) {
                default: {
                    Log.w("MediaBrowserCompat", "Unknown result code: " + n + " (extras=" + this.e + ", resultData=" + bundle + ")");
                }
                case 1: {
                    this.f.a(this.d, this.e, bundle);
                }
                case 0: {
                    this.f.b(this.d, this.e, bundle);
                }
                case -1: {
                    this.f.c(this.d, this.e, bundle);
                }
            }
        }
    }
    
    private static class ItemReceiver extends b
    {
        private final String d;
        private final MediaBrowserCompat.b e;
        
        @Override
        protected void a(final int n, final Bundle bundle) {
            if (bundle != null) {
                bundle.setClassLoader(MediaBrowserCompat.class.getClassLoader());
            }
            if (n != 0 || bundle == null || !bundle.containsKey("media_item")) {
                this.e.a(this.d);
                return;
            }
            final Parcelable parcelable = bundle.getParcelable("media_item");
            if (parcelable == null || parcelable instanceof MediaItem) {
                this.e.a((MediaItem)parcelable);
                return;
            }
            this.e.a(this.d);
        }
    }
    
    public static class MediaItem implements Parcelable
    {
        public static final Parcelable$Creator<MediaItem> CREATOR;
        private final int a;
        private final MediaDescriptionCompat b;
        
        static {
            CREATOR = (Parcelable$Creator)new Parcelable$Creator<MediaItem>() {
                public MediaItem a(final Parcel parcel) {
                    return new MediaItem(parcel);
                }
                
                public MediaItem[] a(final int n) {
                    return new MediaItem[n];
                }
            };
        }
        
        MediaItem(final Parcel parcel) {
            this.a = parcel.readInt();
            this.b = (MediaDescriptionCompat)MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
        }
        
        public int describeContents() {
            return 0;
        }
        
        @Override
        public String toString() {
            final StringBuilder sb = new StringBuilder("MediaItem{");
            sb.append("mFlags=").append(this.a);
            sb.append(", mDescription=").append(this.b);
            sb.append('}');
            return sb.toString();
        }
        
        public void writeToParcel(final Parcel parcel, final int n) {
            parcel.writeInt(this.a);
            this.b.writeToParcel(parcel, n);
        }
    }
    
    private static class SearchResultReceiver extends b
    {
        private final String d;
        private final Bundle e;
        private final c f;
        
        @Override
        protected void a(int i, final Bundle bundle) {
            if (bundle != null) {
                bundle.setClassLoader(MediaBrowserCompat.class.getClassLoader());
            }
            if (i != 0 || bundle == null || !bundle.containsKey("search_results")) {
                this.f.a(this.d, this.e);
                return;
            }
            final Parcelable[] parcelableArray = bundle.getParcelableArray("search_results");
            List<MediaItem> list = null;
            if (parcelableArray != null) {
                list = new ArrayList<MediaItem>();
                int length;
                for (length = parcelableArray.length, i = 0; i < length; ++i) {
                    list.add((MediaItem)parcelableArray[i]);
                }
            }
            this.f.a(this.d, this.e, list);
        }
    }
    
    public abstract static class a
    {
        public void a(final String s, final Bundle bundle, final Bundle bundle2) {
        }
        
        public void b(final String s, final Bundle bundle, final Bundle bundle2) {
        }
        
        public void c(final String s, final Bundle bundle, final Bundle bundle2) {
        }
    }
    
    public abstract static class b
    {
        public void a(final MediaItem mediaItem) {
        }
        
        public void a(final String s) {
        }
    }
    
    public abstract static class c
    {
        public void a(final String s, final Bundle bundle) {
        }
        
        public void a(final String s, final Bundle bundle, final List<MediaItem> list) {
        }
    }
}
