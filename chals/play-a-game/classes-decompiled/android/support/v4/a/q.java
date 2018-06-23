// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v4.a;

import android.content.Context;
import android.util.Log;
import android.os.Parcel;
import android.os.Bundle;
import android.os.Parcelable$Creator;
import android.os.Parcelable;

final class q implements Parcelable
{
    public static final Parcelable$Creator<q> CREATOR;
    final String a;
    final int b;
    final boolean c;
    final int d;
    final int e;
    final String f;
    final boolean g;
    final boolean h;
    final Bundle i;
    final boolean j;
    Bundle k;
    h l;
    
    static {
        CREATOR = (Parcelable$Creator)new Parcelable$Creator<q>() {
            public q a(final Parcel parcel) {
                return new q(parcel);
            }
            
            public q[] a(final int n) {
                return new q[n];
            }
        };
    }
    
    public q(final Parcel parcel) {
        final boolean b = true;
        this.a = parcel.readString();
        this.b = parcel.readInt();
        this.c = (parcel.readInt() != 0);
        this.d = parcel.readInt();
        this.e = parcel.readInt();
        this.f = parcel.readString();
        this.g = (parcel.readInt() != 0);
        this.h = (parcel.readInt() != 0);
        this.i = parcel.readBundle();
        this.j = (parcel.readInt() != 0 && b);
        this.k = parcel.readBundle();
    }
    
    public q(final h h) {
        this.a = h.getClass().getName();
        this.b = h.e;
        this.c = h.m;
        this.d = h.w;
        this.e = h.x;
        this.f = h.y;
        this.g = h.B;
        this.h = h.A;
        this.i = h.g;
        this.j = h.z;
    }
    
    public h a(final l l, final j j, final h h, final o u) {
        if (this.l == null) {
            final Context g = l.g();
            if (this.i != null) {
                this.i.setClassLoader(g.getClassLoader());
            }
            if (j != null) {
                this.l = j.a(g, this.a, this.i);
            }
            else {
                this.l = h.a(g, this.a, this.i);
            }
            if (this.k != null) {
                this.k.setClassLoader(g.getClassLoader());
                this.l.c = this.k;
            }
            this.l.a(this.b, h);
            this.l.m = this.c;
            this.l.o = true;
            this.l.w = this.d;
            this.l.x = this.e;
            this.l.y = this.f;
            this.l.B = this.g;
            this.l.A = this.h;
            this.l.z = this.j;
            this.l.r = l.d;
            if (n.a) {
                Log.v("FragmentManager", "Instantiated fragment " + this.l);
            }
        }
        this.l.u = u;
        return this.l;
    }
    
    public int describeContents() {
        return 0;
    }
    
    public void writeToParcel(final Parcel parcel, int n) {
        final int n2 = 1;
        parcel.writeString(this.a);
        parcel.writeInt(this.b);
        if (this.c) {
            n = 1;
        }
        else {
            n = 0;
        }
        parcel.writeInt(n);
        parcel.writeInt(this.d);
        parcel.writeInt(this.e);
        parcel.writeString(this.f);
        if (this.g) {
            n = 1;
        }
        else {
            n = 0;
        }
        parcel.writeInt(n);
        if (this.h) {
            n = 1;
        }
        else {
            n = 0;
        }
        parcel.writeInt(n);
        parcel.writeBundle(this.i);
        if (this.j) {
            n = n2;
        }
        else {
            n = 0;
        }
        parcel.writeInt(n);
        parcel.writeBundle(this.k);
    }
}
