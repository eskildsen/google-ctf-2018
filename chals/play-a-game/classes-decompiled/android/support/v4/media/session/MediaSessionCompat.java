// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v4.media.session;

import android.os.IBinder;
import android.os.ResultReceiver;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;
import android.os.Build$VERSION;
import android.os.Parcel;
import android.support.v4.media.MediaDescriptionCompat;
import android.os.Parcelable$Creator;
import android.os.Parcelable;

public class MediaSessionCompat
{
    public static final class QueueItem implements Parcelable
    {
        public static final Parcelable$Creator<QueueItem> CREATOR;
        private final MediaDescriptionCompat a;
        private final long b;
        private Object c;
        
        static {
            CREATOR = (Parcelable$Creator)new Parcelable$Creator<QueueItem>() {
                public QueueItem a(final Parcel parcel) {
                    return new QueueItem(parcel);
                }
                
                public QueueItem[] a(final int n) {
                    return new QueueItem[n];
                }
            };
        }
        
        QueueItem(final Parcel parcel) {
            this.a = (MediaDescriptionCompat)MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
            this.b = parcel.readLong();
        }
        
        private QueueItem(final Object c, final MediaDescriptionCompat a, final long b) {
            if (a == null) {
                throw new IllegalArgumentException("Description cannot be null.");
            }
            if (b == -1L) {
                throw new IllegalArgumentException("Id cannot be QueueItem.UNKNOWN_ID");
            }
            this.a = a;
            this.b = b;
            this.c = c;
        }
        
        public static QueueItem a(final Object o) {
            if (o == null || Build$VERSION.SDK_INT < 21) {
                return null;
            }
            return new QueueItem(o, MediaDescriptionCompat.a(d.a.a(o)), d.a.b(o));
        }
        
        public static List<QueueItem> a(final List<?> list) {
            List<QueueItem> list2;
            if (list == null || Build$VERSION.SDK_INT < 21) {
                list2 = null;
            }
            else {
                final ArrayList<QueueItem> list3 = new ArrayList<QueueItem>();
                final Iterator<?> iterator = list.iterator();
                while (true) {
                    list2 = list3;
                    if (!iterator.hasNext()) {
                        break;
                    }
                    list3.add(a(iterator.next()));
                }
            }
            return list2;
        }
        
        public int describeContents() {
            return 0;
        }
        
        @Override
        public String toString() {
            return "MediaSession.QueueItem {Description=" + this.a + ", Id=" + this.b + " }";
        }
        
        public void writeToParcel(final Parcel parcel, final int n) {
            this.a.writeToParcel(parcel, n);
            parcel.writeLong(this.b);
        }
    }
    
    static final class ResultReceiverWrapper implements Parcelable
    {
        public static final Parcelable$Creator<ResultReceiverWrapper> CREATOR;
        private ResultReceiver a;
        
        static {
            CREATOR = (Parcelable$Creator)new Parcelable$Creator<ResultReceiverWrapper>() {
                public ResultReceiverWrapper a(final Parcel parcel) {
                    return new ResultReceiverWrapper(parcel);
                }
                
                public ResultReceiverWrapper[] a(final int n) {
                    return new ResultReceiverWrapper[n];
                }
            };
        }
        
        ResultReceiverWrapper(final Parcel parcel) {
            this.a = (ResultReceiver)ResultReceiver.CREATOR.createFromParcel(parcel);
        }
        
        public int describeContents() {
            return 0;
        }
        
        public void writeToParcel(final Parcel parcel, final int n) {
            this.a.writeToParcel(parcel, n);
        }
    }
    
    public static final class Token implements Parcelable
    {
        public static final Parcelable$Creator<Token> CREATOR;
        private final Object a;
        private final b b;
        
        static {
            CREATOR = (Parcelable$Creator)new Parcelable$Creator<Token>() {
                public Token a(final Parcel parcel) {
                    Object o;
                    if (Build$VERSION.SDK_INT >= 21) {
                        o = parcel.readParcelable((ClassLoader)null);
                    }
                    else {
                        o = parcel.readStrongBinder();
                    }
                    return new Token(o);
                }
                
                public Token[] a(final int n) {
                    return new Token[n];
                }
            };
        }
        
        Token(final Object o) {
            this(o, null);
        }
        
        Token(final Object a, final b b) {
            this.a = a;
            this.b = b;
        }
        
        public int describeContents() {
            return 0;
        }
        
        @Override
        public boolean equals(final Object o) {
            if (this != o) {
                if (!(o instanceof Token)) {
                    return false;
                }
                final Token token = (Token)o;
                if (this.a != null) {
                    return token.a != null && this.a.equals(token.a);
                }
                if (token.a != null) {
                    return false;
                }
            }
            return true;
        }
        
        @Override
        public int hashCode() {
            if (this.a == null) {
                return 0;
            }
            return this.a.hashCode();
        }
        
        public void writeToParcel(final Parcel parcel, final int n) {
            if (Build$VERSION.SDK_INT >= 21) {
                parcel.writeParcelable((Parcelable)this.a, n);
                return;
            }
            parcel.writeStrongBinder((IBinder)this.a);
        }
    }
}
