// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v4.media.session;

import android.os.Bundle;
import android.media.session.PlaybackState$CustomAction;
import java.util.List;
import android.media.session.PlaybackState;

class e
{
    public static int a(final Object o) {
        return ((PlaybackState)o).getState();
    }
    
    public static long b(final Object o) {
        return ((PlaybackState)o).getPosition();
    }
    
    public static long c(final Object o) {
        return ((PlaybackState)o).getBufferedPosition();
    }
    
    public static float d(final Object o) {
        return ((PlaybackState)o).getPlaybackSpeed();
    }
    
    public static long e(final Object o) {
        return ((PlaybackState)o).getActions();
    }
    
    public static CharSequence f(final Object o) {
        return ((PlaybackState)o).getErrorMessage();
    }
    
    public static long g(final Object o) {
        return ((PlaybackState)o).getLastPositionUpdateTime();
    }
    
    public static List<Object> h(final Object o) {
        return (List<Object>)((PlaybackState)o).getCustomActions();
    }
    
    public static long i(final Object o) {
        return ((PlaybackState)o).getActiveQueueItemId();
    }
    
    static final class a
    {
        public static String a(final Object o) {
            return ((PlaybackState$CustomAction)o).getAction();
        }
        
        public static CharSequence b(final Object o) {
            return ((PlaybackState$CustomAction)o).getName();
        }
        
        public static int c(final Object o) {
            return ((PlaybackState$CustomAction)o).getIcon();
        }
        
        public static Bundle d(final Object o) {
            return ((PlaybackState$CustomAction)o).getExtras();
        }
    }
}
