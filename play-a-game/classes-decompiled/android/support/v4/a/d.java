// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v4.a;

import java.util.List;
import android.util.Log;
import android.text.TextUtils;
import android.os.Parcel;
import java.util.ArrayList;
import android.os.Parcelable$Creator;
import android.os.Parcelable;

final class d implements Parcelable
{
    public static final Parcelable$Creator<d> CREATOR;
    final int[] a;
    final int b;
    final int c;
    final String d;
    final int e;
    final int f;
    final CharSequence g;
    final int h;
    final CharSequence i;
    final ArrayList<String> j;
    final ArrayList<String> k;
    final boolean l;
    
    static {
        CREATOR = (Parcelable$Creator)new Parcelable$Creator<d>() {
            public d a(final Parcel parcel) {
                return new d(parcel);
            }
            
            public d[] a(final int n) {
                return new d[n];
            }
        };
    }
    
    public d(final Parcel parcel) {
        this.a = parcel.createIntArray();
        this.b = parcel.readInt();
        this.c = parcel.readInt();
        this.d = parcel.readString();
        this.e = parcel.readInt();
        this.f = parcel.readInt();
        this.g = (CharSequence)TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.h = parcel.readInt();
        this.i = (CharSequence)TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.j = (ArrayList<String>)parcel.createStringArrayList();
        this.k = (ArrayList<String>)parcel.createStringArrayList();
        this.l = (parcel.readInt() != 0);
    }
    
    public d(final c c) {
        final int size = c.c.size();
        this.a = new int[size * 6];
        if (!c.j) {
            throw new IllegalStateException("Not on back stack");
        }
        int i = 0;
        int n = 0;
        while (i < size) {
            final c.a a = c.c.get(i);
            final int[] a2 = this.a;
            final int n2 = n + 1;
            a2[n] = a.a;
            final int[] a3 = this.a;
            final int n3 = n2 + 1;
            int e;
            if (a.b != null) {
                e = a.b.e;
            }
            else {
                e = -1;
            }
            a3[n2] = e;
            final int[] a4 = this.a;
            final int n4 = n3 + 1;
            a4[n3] = a.c;
            final int[] a5 = this.a;
            final int n5 = n4 + 1;
            a5[n4] = a.d;
            final int[] a6 = this.a;
            final int n6 = n5 + 1;
            a6[n5] = a.e;
            final int[] a7 = this.a;
            n = n6 + 1;
            a7[n6] = a.f;
            ++i;
        }
        this.b = c.h;
        this.c = c.i;
        this.d = c.l;
        this.e = c.n;
        this.f = c.o;
        this.g = c.p;
        this.h = c.q;
        this.i = c.r;
        this.j = c.s;
        this.k = c.t;
        this.l = c.u;
    }
    
    public c a(final n n) {
        int i = 0;
        final c c = new c(n);
        int n2 = 0;
        while (i < this.a.length) {
            final c.a a = new c.a();
            final int[] a2 = this.a;
            final int n3 = i + 1;
            a.a = a2[i];
            if (n.a) {
                Log.v("FragmentManager", "Instantiate " + c + " op #" + n2 + " base fragment #" + this.a[n3]);
            }
            final int[] a3 = this.a;
            final int n4 = n3 + 1;
            final int n5 = a3[n3];
            if (n5 >= 0) {
                a.b = (h)n.f.get(n5);
            }
            else {
                a.b = null;
            }
            final int[] a4 = this.a;
            final int n6 = n4 + 1;
            a.c = a4[n4];
            final int[] a5 = this.a;
            final int n7 = n6 + 1;
            a.d = a5[n6];
            final int[] a6 = this.a;
            final int n8 = n7 + 1;
            a.e = a6[n7];
            a.f = this.a[n8];
            c.d = a.c;
            c.e = a.d;
            c.f = a.e;
            c.g = a.f;
            c.a(a);
            ++n2;
            i = n8 + 1;
        }
        c.h = this.b;
        c.i = this.c;
        c.l = this.d;
        c.n = this.e;
        c.j = true;
        c.o = this.f;
        c.p = this.g;
        c.q = this.h;
        c.r = this.i;
        c.s = this.j;
        c.t = this.k;
        c.u = this.l;
        c.a(1);
        return c;
    }
    
    public int describeContents() {
        return 0;
    }
    
    public void writeToParcel(final Parcel parcel, int n) {
        n = 0;
        parcel.writeIntArray(this.a);
        parcel.writeInt(this.b);
        parcel.writeInt(this.c);
        parcel.writeString(this.d);
        parcel.writeInt(this.e);
        parcel.writeInt(this.f);
        TextUtils.writeToParcel(this.g, parcel, 0);
        parcel.writeInt(this.h);
        TextUtils.writeToParcel(this.i, parcel, 0);
        parcel.writeStringList((List)this.j);
        parcel.writeStringList((List)this.k);
        if (this.l) {
            n = 1;
        }
        parcel.writeInt(n);
    }
}
