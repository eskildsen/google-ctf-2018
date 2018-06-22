// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v4.media.session;

import java.util.Iterator;
import android.os.Build$VERSION;
import android.text.TextUtils;
import java.util.Collection;
import java.util.ArrayList;
import android.os.Parcel;
import android.os.Bundle;
import java.util.List;
import android.os.Parcelable$Creator;
import android.os.Parcelable;

public final class PlaybackStateCompat implements Parcelable
{
    public static final Parcelable$Creator<PlaybackStateCompat> CREATOR;
    final int a;
    final long b;
    final long c;
    final float d;
    final long e;
    final int f;
    final CharSequence g;
    final long h;
    List<CustomAction> i;
    final long j;
    final Bundle k;
    private Object l;
    
    static {
        CREATOR = (Parcelable$Creator)new Parcelable$Creator<PlaybackStateCompat>() {
            public PlaybackStateCompat a(final Parcel parcel) {
                return new PlaybackStateCompat(parcel);
            }
            
            public PlaybackStateCompat[] a(final int n) {
                return new PlaybackStateCompat[n];
            }
        };
    }
    
    PlaybackStateCompat(final int a, final long b, final long c, final float d, final long e, final int f, final CharSequence g, final long h, final List<CustomAction> list, final long j, final Bundle k) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = new ArrayList<CustomAction>(list);
        this.j = j;
        this.k = k;
    }
    
    PlaybackStateCompat(final Parcel parcel) {
        this.a = parcel.readInt();
        this.b = parcel.readLong();
        this.d = parcel.readFloat();
        this.h = parcel.readLong();
        this.c = parcel.readLong();
        this.e = parcel.readLong();
        this.g = (CharSequence)TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.i = (List<CustomAction>)parcel.createTypedArrayList((Parcelable$Creator)CustomAction.CREATOR);
        this.j = parcel.readLong();
        this.k = parcel.readBundle();
        this.f = parcel.readInt();
    }
    
    public static PlaybackStateCompat a(final Object l) {
        if (l != null && Build$VERSION.SDK_INT >= 21) {
            final List<Object> h = e.h(l);
            List<CustomAction> list = null;
            if (h != null) {
                final ArrayList list2 = new ArrayList<CustomAction>(h.size());
                final Iterator<Object> iterator = h.iterator();
                while (true) {
                    list = (List<CustomAction>)list2;
                    if (!iterator.hasNext()) {
                        break;
                    }
                    list2.add(CustomAction.a(iterator.next()));
                }
            }
            Bundle a;
            if (Build$VERSION.SDK_INT >= 22) {
                a = f.a(l);
            }
            else {
                a = null;
            }
            final PlaybackStateCompat playbackStateCompat = new PlaybackStateCompat(e.a(l), e.b(l), e.c(l), e.d(l), e.e(l), 0, e.f(l), e.g(l), list, e.i(l), a);
            playbackStateCompat.l = l;
            return playbackStateCompat;
        }
        return null;
    }
    
    public int describeContents() {
        return 0;
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("PlaybackState {");
        sb.append("state=").append(this.a);
        sb.append(", position=").append(this.b);
        sb.append(", buffered position=").append(this.c);
        sb.append(", speed=").append(this.d);
        sb.append(", updated=").append(this.h);
        sb.append(", actions=").append(this.e);
        sb.append(", error code=").append(this.f);
        sb.append(", error message=").append(this.g);
        sb.append(", custom actions=").append(this.i);
        sb.append(", active item id=").append(this.j);
        sb.append("}");
        return sb.toString();
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeInt(this.a);
        parcel.writeLong(this.b);
        parcel.writeFloat(this.d);
        parcel.writeLong(this.h);
        parcel.writeLong(this.c);
        parcel.writeLong(this.e);
        TextUtils.writeToParcel(this.g, parcel, n);
        parcel.writeTypedList((List)this.i);
        parcel.writeLong(this.j);
        parcel.writeBundle(this.k);
        parcel.writeInt(this.f);
    }
    
    public static final class CustomAction implements Parcelable
    {
        public static final Parcelable$Creator<CustomAction> CREATOR;
        private final String a;
        private final CharSequence b;
        private final int c;
        private final Bundle d;
        private Object e;
        
        static {
            CREATOR = (Parcelable$Creator)new Parcelable$Creator<CustomAction>() {
                public CustomAction a(final Parcel parcel) {
                    return new CustomAction(parcel);
                }
                
                public CustomAction[] a(final int n) {
                    return new CustomAction[n];
                }
            };
        }
        
        CustomAction(final Parcel parcel) {
            this.a = parcel.readString();
            this.b = (CharSequence)TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.c = parcel.readInt();
            this.d = parcel.readBundle();
        }
        
        CustomAction(final String a, final CharSequence b, final int c, final Bundle d) {
            this.a = a;
            this.b = b;
            this.c = c;
            this.d = d;
        }
        
        public static CustomAction a(final Object e) {
            if (e == null || Build$VERSION.SDK_INT < 21) {
                return null;
            }
            final CustomAction customAction = new CustomAction(e.a.a(e), e.a.b(e), e.a.c(e), e.a.d(e));
            customAction.e = e;
            return customAction;
        }
        
        public int describeContents() {
            return 0;
        }
        
        @Override
        public String toString() {
            return "Action:mName='" + (Object)this.b + ", mIcon=" + this.c + ", mExtras=" + this.d;
        }
        
        public void writeToParcel(final Parcel parcel, final int n) {
            parcel.writeString(this.a);
            TextUtils.writeToParcel(this.b, parcel, n);
            parcel.writeInt(this.c);
            parcel.writeBundle(this.d);
        }
    }
}
