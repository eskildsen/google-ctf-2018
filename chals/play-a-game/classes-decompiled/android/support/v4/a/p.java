// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v4.a;

import android.os.Parcel;
import android.os.Parcelable$Creator;
import android.os.Parcelable;

final class p implements Parcelable
{
    public static final Parcelable$Creator<p> CREATOR;
    q[] a;
    int[] b;
    d[] c;
    int d;
    int e;
    
    static {
        CREATOR = (Parcelable$Creator)new Parcelable$Creator<p>() {
            public p a(final Parcel parcel) {
                return new p(parcel);
            }
            
            public p[] a(final int n) {
                return new p[n];
            }
        };
    }
    
    public p() {
        this.d = -1;
    }
    
    public p(final Parcel parcel) {
        this.d = -1;
        this.a = (q[])parcel.createTypedArray((Parcelable$Creator)q.CREATOR);
        this.b = parcel.createIntArray();
        this.c = (d[])parcel.createTypedArray((Parcelable$Creator)android.support.v4.a.d.CREATOR);
        this.d = parcel.readInt();
        this.e = parcel.readInt();
    }
    
    public int describeContents() {
        return 0;
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeTypedArray((Parcelable[])this.a, n);
        parcel.writeIntArray(this.b);
        parcel.writeTypedArray((Parcelable[])this.c, n);
        parcel.writeInt(this.d);
        parcel.writeInt(this.e);
    }
}
