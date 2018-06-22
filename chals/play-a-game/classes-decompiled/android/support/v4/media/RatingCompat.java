// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v4.media;

import android.os.Parcel;
import android.os.Parcelable$Creator;
import android.os.Parcelable;

public final class RatingCompat implements Parcelable
{
    public static final Parcelable$Creator<RatingCompat> CREATOR;
    private final int a;
    private final float b;
    
    static {
        CREATOR = (Parcelable$Creator)new Parcelable$Creator<RatingCompat>() {
            public RatingCompat a(final Parcel parcel) {
                return new RatingCompat(parcel.readInt(), parcel.readFloat());
            }
            
            public RatingCompat[] a(final int n) {
                return new RatingCompat[n];
            }
        };
    }
    
    RatingCompat(final int a, final float b) {
        this.a = a;
        this.b = b;
    }
    
    public int describeContents() {
        return this.a;
    }
    
    @Override
    public String toString() {
        final StringBuilder append = new StringBuilder().append("Rating:style=").append(this.a).append(" rating=");
        String value;
        if (this.b < 0.0f) {
            value = "unrated";
        }
        else {
            value = String.valueOf(this.b);
        }
        return append.append(value).toString();
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeInt(this.a);
        parcel.writeFloat(this.b);
    }
}
