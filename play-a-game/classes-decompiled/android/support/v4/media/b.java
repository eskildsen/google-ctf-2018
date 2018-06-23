// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v4.media;

import android.media.MediaDescription$Builder;
import android.media.MediaDescription;
import android.net.Uri;

class b extends android.support.v4.media.a
{
    public static Uri h(final Object o) {
        return ((MediaDescription)o).getMediaUri();
    }
    
    static class a extends android.support.v4.media.a.a
    {
        public static void b(final Object o, final Uri mediaUri) {
            ((MediaDescription$Builder)o).setMediaUri(mediaUri);
        }
    }
}
