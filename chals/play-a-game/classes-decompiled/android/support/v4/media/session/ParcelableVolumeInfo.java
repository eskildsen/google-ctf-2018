// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v4.media.session;

import android.os.Parcel;
import android.os.Parcelable$Creator;
import android.os.Parcelable;

public class ParcelableVolumeInfo implements Parcelable
{
    public static final Parcelable$Creator<ParcelableVolumeInfo> CREATOR;
    public int a;
    public int b;
    public int c;
    public int d;
    public int e;
    
    static {
        CREATOR = (Parcelable$Creator)new Parcelable$Creator<ParcelableVolumeInfo>() {
            public ParcelableVolumeInfo a(final Parcel parcel) {
                return new ParcelableVolumeInfo(parcel);
            }
            
            public ParcelableVolumeInfo[] a(final int n) {
                return new ParcelableVolumeInfo[n];
            }
        };
    }
    
    public ParcelableVolumeInfo(final Parcel parcel) {
        this.a = parcel.readInt();
        this.c = parcel.readInt();
        this.d = parcel.readInt();
        this.e = parcel.readInt();
        this.b = parcel.readInt();
    }
    
    public int describeContents() {
        return 0;
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeInt(this.a);
        parcel.writeInt(this.c);
        parcel.writeInt(this.d);
        parcel.writeInt(this.e);
        parcel.writeInt(this.b);
    }
}
