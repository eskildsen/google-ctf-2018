// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v4.media;

import android.media.MediaMetadata;
import android.os.Parcel;

class c
{
    public static void a(final Object o, final Parcel parcel, final int n) {
        ((MediaMetadata)o).writeToParcel(parcel, n);
    }
}
