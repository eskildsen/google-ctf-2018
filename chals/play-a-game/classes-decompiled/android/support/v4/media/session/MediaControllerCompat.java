// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v4.media.session;

import android.os.Handler;
import android.os.Message;
import android.os.Build$VERSION;
import android.os.IBinder$DeathRecipient;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.a.g;
import android.os.Bundle;
import java.lang.ref.WeakReference;
import android.os.ResultReceiver;
import java.util.Iterator;
import android.os.RemoteException;
import android.util.Log;
import java.util.HashMap;
import java.util.List;

public final class MediaControllerCompat
{
    static class MediaControllerImplApi21
    {
        private final List<MediaControllerCompat.a> a;
        private b b;
        private HashMap<MediaControllerCompat.a, a> c;
        
        private void a() {
            if (this.b == null) {
                return;
            }
            synchronized (this.a) {
                for (final MediaControllerCompat.a a : this.a) {
                    final a a2 = new a(a);
                    this.c.put(a, a2);
                    a.b = true;
                    try {
                        this.b.a(a2);
                        continue;
                    }
                    catch (RemoteException ex) {
                        Log.e("MediaControllerCompat", "Dead object in registerCallback.", (Throwable)ex);
                    }
                    break;
                }
                this.a.clear();
            }
        }
        
        private static class ExtraBinderRequestResultReceiver extends ResultReceiver
        {
            private WeakReference<MediaControllerImplApi21> a;
            
            protected void onReceiveResult(final int n, final Bundle bundle) {
                final MediaControllerImplApi21 mediaControllerImplApi21 = this.a.get();
                if (mediaControllerImplApi21 == null || bundle == null) {
                    return;
                }
                mediaControllerImplApi21.b = android.support.v4.media.session.b.a.a(g.a(bundle, "android.support.v4.media.session.EXTRA_BINDER"));
                mediaControllerImplApi21.a();
            }
        }
        
        private static class a extends c
        {
            a(final MediaControllerCompat.a a) {
                super(a);
            }
            
            @Override
            public void a() {
                throw new AssertionError();
            }
            
            @Override
            public void a(final Bundle bundle) {
                throw new AssertionError();
            }
            
            @Override
            public void a(final MediaMetadataCompat mediaMetadataCompat) {
                throw new AssertionError();
            }
            
            @Override
            public void a(final ParcelableVolumeInfo parcelableVolumeInfo) {
                throw new AssertionError();
            }
            
            @Override
            public void a(final CharSequence charSequence) {
                throw new AssertionError();
            }
            
            @Override
            public void a(final List<MediaSessionCompat.QueueItem> list) {
                throw new AssertionError();
            }
        }
    }
    
    public abstract static class a implements IBinder$DeathRecipient
    {
        MediaControllerCompat.a.a a;
        boolean b;
        private final Object c;
        
        public a() {
            if (Build$VERSION.SDK_INT >= 21) {
                this.c = android.support.v4.media.session.c.a((android.support.v4.media.session.c.a)new b(this));
                return;
            }
            this.c = new c(this);
        }
        
        public void a() {
        }
        
        public void a(final int n) {
        }
        
        void a(final int n, final Object o, final Bundle data) {
            if (this.a != null) {
                final Message obtainMessage = this.a.obtainMessage(n, o);
                obtainMessage.setData(data);
                obtainMessage.sendToTarget();
            }
        }
        
        public void a(final Bundle bundle) {
        }
        
        public void a(final MediaMetadataCompat mediaMetadataCompat) {
        }
        
        public void a(final MediaControllerCompat.b b) {
        }
        
        public void a(final PlaybackStateCompat playbackStateCompat) {
        }
        
        public void a(final CharSequence charSequence) {
        }
        
        public void a(final String s, final Bundle bundle) {
        }
        
        public void a(final List<MediaSessionCompat.QueueItem> list) {
        }
        
        public void a(final boolean b) {
        }
        
        public void b(final int n) {
        }
        
        @Deprecated
        public void b(final boolean b) {
        }
        
        private class a extends Handler
        {
            boolean a;
            final /* synthetic */ MediaControllerCompat.a b;
            
            public void handleMessage(final Message message) {
                if (!this.a) {
                    return;
                }
                switch (message.what) {
                    default: {}
                    case 1: {
                        this.b.a((String)message.obj, message.getData());
                    }
                    case 2: {
                        this.b.a((PlaybackStateCompat)message.obj);
                    }
                    case 3: {
                        this.b.a((MediaMetadataCompat)message.obj);
                    }
                    case 5: {
                        this.b.a((List<MediaSessionCompat.QueueItem>)message.obj);
                    }
                    case 6: {
                        this.b.a((CharSequence)message.obj);
                    }
                    case 11: {
                        this.b.a((boolean)message.obj);
                    }
                    case 9: {
                        this.b.a((int)message.obj);
                    }
                    case 10: {
                        this.b.b((boolean)message.obj);
                    }
                    case 12: {
                        this.b.b((int)message.obj);
                    }
                    case 7: {
                        this.b.a((Bundle)message.obj);
                    }
                    case 4: {
                        this.b.a((MediaControllerCompat.b)message.obj);
                    }
                    case 8: {
                        this.b.a();
                    }
                }
            }
        }
        
        private static class b implements c.a
        {
            private final WeakReference<MediaControllerCompat.a> a;
            
            b(final MediaControllerCompat.a a) {
                this.a = new WeakReference<MediaControllerCompat.a>(a);
            }
            
            @Override
            public void a() {
                final MediaControllerCompat.a a = this.a.get();
                if (a != null) {
                    a.a();
                }
            }
            
            @Override
            public void a(final int n, final int n2, final int n3, final int n4, final int n5) {
                final MediaControllerCompat.a a = this.a.get();
                if (a != null) {
                    a.a(new MediaControllerCompat.b(n, n2, n3, n4, n5));
                }
            }
            
            @Override
            public void a(final Bundle bundle) {
                final MediaControllerCompat.a a = this.a.get();
                if (a != null) {
                    a.a(bundle);
                }
            }
            
            @Override
            public void a(final CharSequence charSequence) {
                final MediaControllerCompat.a a = this.a.get();
                if (a != null) {
                    a.a(charSequence);
                }
            }
            
            @Override
            public void a(final Object o) {
                final MediaControllerCompat.a a = this.a.get();
                if (a == null || a.b) {
                    return;
                }
                a.a(PlaybackStateCompat.a(o));
            }
            
            @Override
            public void a(final String s, final Bundle bundle) {
                final MediaControllerCompat.a a = this.a.get();
                if (a == null || (a.b && Build$VERSION.SDK_INT < 23)) {
                    return;
                }
                a.a(s, bundle);
            }
            
            @Override
            public void a(final List<?> list) {
                final MediaControllerCompat.a a = this.a.get();
                if (a != null) {
                    a.a(MediaSessionCompat.QueueItem.a(list));
                }
            }
            
            @Override
            public void b(final Object o) {
                final MediaControllerCompat.a a = this.a.get();
                if (a != null) {
                    a.a(MediaMetadataCompat.a(o));
                }
            }
        }
        
        private static class c extends a.a
        {
            private final WeakReference<MediaControllerCompat.a> a;
            
            c(final MediaControllerCompat.a a) {
                this.a = new WeakReference<MediaControllerCompat.a>(a);
            }
            
            public void a() {
                final MediaControllerCompat.a a = this.a.get();
                if (a != null) {
                    a.a(8, null, null);
                }
            }
            
            public void a(final int n) {
                final MediaControllerCompat.a a = this.a.get();
                if (a != null) {
                    a.a(9, n, null);
                }
            }
            
            public void a(final Bundle bundle) {
                final MediaControllerCompat.a a = this.a.get();
                if (a != null) {
                    a.a(7, bundle, null);
                }
            }
            
            public void a(final MediaMetadataCompat mediaMetadataCompat) {
                final MediaControllerCompat.a a = this.a.get();
                if (a != null) {
                    a.a(3, mediaMetadataCompat, null);
                }
            }
            
            public void a(final ParcelableVolumeInfo parcelableVolumeInfo) {
                final MediaControllerCompat.a a = this.a.get();
                if (a != null) {
                    MediaControllerCompat.b b;
                    if (parcelableVolumeInfo != null) {
                        b = new MediaControllerCompat.b(parcelableVolumeInfo.a, parcelableVolumeInfo.b, parcelableVolumeInfo.c, parcelableVolumeInfo.d, parcelableVolumeInfo.e);
                    }
                    else {
                        b = null;
                    }
                    a.a(4, b, null);
                }
            }
            
            public void a(final PlaybackStateCompat playbackStateCompat) {
                final MediaControllerCompat.a a = this.a.get();
                if (a != null) {
                    a.a(2, playbackStateCompat, null);
                }
            }
            
            public void a(final CharSequence charSequence) {
                final MediaControllerCompat.a a = this.a.get();
                if (a != null) {
                    a.a(6, charSequence, null);
                }
            }
            
            public void a(final String s, final Bundle bundle) {
                final MediaControllerCompat.a a = this.a.get();
                if (a != null) {
                    a.a(1, s, bundle);
                }
            }
            
            public void a(final List<MediaSessionCompat.QueueItem> list) {
                final MediaControllerCompat.a a = this.a.get();
                if (a != null) {
                    a.a(5, list, null);
                }
            }
            
            public void a(final boolean b) {
                final MediaControllerCompat.a a = this.a.get();
                if (a != null) {
                    a.a(10, b, null);
                }
            }
            
            public void b(final int n) {
                final MediaControllerCompat.a a = this.a.get();
                if (a != null) {
                    a.a(12, n, null);
                }
            }
            
            public void b(final boolean b) {
                final MediaControllerCompat.a a = this.a.get();
                if (a != null) {
                    a.a(11, b, null);
                }
            }
        }
    }
    
    public static final class b
    {
        private final int a;
        private final int b;
        private final int c;
        private final int d;
        private final int e;
        
        b(final int a, final int b, final int c, final int d, final int e) {
            this.a = a;
            this.b = b;
            this.c = c;
            this.d = d;
            this.e = e;
        }
    }
}
