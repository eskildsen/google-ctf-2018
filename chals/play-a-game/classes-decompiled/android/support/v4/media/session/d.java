// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v4.media.session;

import android.media.session.MediaSession$QueueItem;

class d
{
    static class a
    {
        public static Object a(final Object o) {
            return ((MediaSession$QueueItem)o).getDescription();
        }
        
        public static long b(final Object o) {
            return ((MediaSession$QueueItem)o).getQueueId();
        }
    }
}
