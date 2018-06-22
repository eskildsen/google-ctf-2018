// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v4.e;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Handler;
import android.os.Parcelable$Creator;
import android.os.Parcelable;

public class b implements Parcelable
{
    public static final Parcelable$Creator<b> CREATOR;
    final boolean a;
    final Handler b;
    android.support.v4.e.a c;
    
    static {
        CREATOR = (Parcelable$Creator)new Parcelable$Creator<b>() {
            public b a(final Parcel parcel) {
                return new b(parcel);
            }
            
            public b[] a(final int n) {
                return new b[n];
            }
        };
    }
    
    b(final Parcel parcel) {
        this.a = false;
        this.b = null;
        this.c = android.support.v4.e.a.a.a(parcel.readStrongBinder());
    }
    
    protected void a(final int n, final Bundle bundle) {
    }
    
    public int describeContents() {
        return 0;
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        synchronized (this) {
            if (this.c == null) {
                this.c = new a();
            }
            parcel.writeStrongBinder(this.c.asBinder());
        }
    }
    
    class a extends android.support.v4.e.a.a
    {
        public void a(final int n, final Bundle bundle) {
            if (android.support.v4.e.b.this.b != null) {
                android.support.v4.e.b.this.b.post((Runnable)new b(n, bundle));
                return;
            }
            android.support.v4.e.b.this.a(n, bundle);
        }
    }
    
    class b implements Runnable
    {
        final int a;
        final Bundle b;
        
        b(final int a, final Bundle b) {
            this.a = a;
            this.b = b;
        }
        
        @Override
        public void run() {
            android.support.v4.e.b.this.a(this.a, this.b);
        }
    }
}
