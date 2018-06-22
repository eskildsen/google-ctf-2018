// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v4.media.session;

import android.media.AudioAttributes;
import android.media.session.MediaSession$QueueItem;
import android.media.session.PlaybackState;
import android.media.MediaMetadata;
import android.media.session.MediaController$PlaybackInfo;
import android.media.session.MediaController$Callback;
import java.util.List;
import android.os.Bundle;

class c
{
    public static Object a(final a a) {
        return new b(a);
    }
    
    public interface a
    {
        void a();
        
        void a(final int p0, final int p1, final int p2, final int p3, final int p4);
        
        void a(final Bundle p0);
        
        void a(final CharSequence p0);
        
        void a(final Object p0);
        
        void a(final String p0, final Bundle p1);
        
        void a(final List<?> p0);
        
        void b(final Object p0);
    }
    
    static class b<T extends a> extends MediaController$Callback
    {
        protected final T a;
        
        public b(final T a) {
            this.a = a;
        }
        
        public void onAudioInfoChanged(final MediaController$PlaybackInfo mediaController$PlaybackInfo) {
            ((a)this.a).a(mediaController$PlaybackInfo.getPlaybackType(), c.b(mediaController$PlaybackInfo), mediaController$PlaybackInfo.getVolumeControl(), mediaController$PlaybackInfo.getMaxVolume(), mediaController$PlaybackInfo.getCurrentVolume());
        }
        
        public void onExtrasChanged(final Bundle bundle) {
            ((a)this.a).a(bundle);
        }
        
        public void onMetadataChanged(final MediaMetadata mediaMetadata) {
            ((a)this.a).b(mediaMetadata);
        }
        
        public void onPlaybackStateChanged(final PlaybackState playbackState) {
            ((a)this.a).a(playbackState);
        }
        
        public void onQueueChanged(final List<MediaSession$QueueItem> list) {
            ((a)this.a).a(list);
        }
        
        public void onQueueTitleChanged(final CharSequence charSequence) {
            ((a)this.a).a(charSequence);
        }
        
        public void onSessionDestroyed() {
            ((a)this.a).a();
        }
        
        public void onSessionEvent(final String s, final Bundle bundle) {
            ((a)this.a).a(s, bundle);
        }
    }
    
    public static class c
    {
        private static int a(final AudioAttributes audioAttributes) {
            int n = 3;
            if ((audioAttributes.getFlags() & 0x1) == 0x1) {
                n = 7;
            }
            else {
                if ((audioAttributes.getFlags() & 0x4) == 0x4) {
                    return 6;
                }
                switch (audioAttributes.getUsage()) {
                    case 1:
                    case 11:
                    case 12:
                    case 14: {
                        break;
                    }
                    default: {
                        return 3;
                    }
                    case 2: {
                        return 0;
                    }
                    case 13: {
                        return 1;
                    }
                    case 3: {
                        return 8;
                    }
                    case 4: {
                        return 4;
                    }
                    case 6: {
                        return 2;
                    }
                    case 5:
                    case 7:
                    case 8:
                    case 9:
                    case 10: {
                        return 5;
                    }
                }
            }
            return n;
        }
        
        public static AudioAttributes a(final Object o) {
            return ((MediaController$PlaybackInfo)o).getAudioAttributes();
        }
        
        public static int b(final Object o) {
            return a(a(o));
        }
    }
}
