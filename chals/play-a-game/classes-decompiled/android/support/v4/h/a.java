// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v4.h;

import android.os.Parcel;
import android.os.Parcelable$ClassLoaderCreator;
import android.os.Parcelable$Creator;
import android.os.Parcelable;

public abstract class a implements Parcelable
{
    public static final Parcelable$Creator<a> CREATOR;
    public static final a a;
    private final Parcelable b;
    
    static {
        a = new a() {};
        CREATOR = (Parcelable$Creator)new Parcelable$ClassLoaderCreator<a>() {
            public a a(final Parcel parcel) {
                return this.a(parcel, null);
            }
            
            public a a(final Parcel parcel, final ClassLoader classLoader) {
                if (parcel.readParcelable(classLoader) != null) {
                    throw new IllegalStateException("superState must be null");
                }
                return android.support.v4.h.a.a;
            }
            
            public a[] a(final int n) {
                return new a[n];
            }
        };
    }
    
    private a() {
        this.b = null;
    }
    
    protected a(final Parcel parcel, final ClassLoader classLoader) {
        Object b = parcel.readParcelable(classLoader);
        if (b == null) {
            b = android.support.v4.h.a.a;
        }
        this.b = (Parcelable)b;
    }
    
    protected a(Parcelable b) {
        if (b == null) {
            throw new IllegalArgumentException("superState must not be null");
        }
        if (b == android.support.v4.h.a.a) {
            b = null;
        }
        this.b = b;
    }
    
    public final Parcelable a() {
        return this.b;
    }
    
    public int describeContents() {
        return 0;
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeParcelable(this.b, n);
    }
}
