// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v4.media.session;

import android.os.Parcelable$Creator;
import android.text.TextUtils;
import android.os.Parcel;
import android.os.IBinder;
import android.os.Binder;
import java.util.List;
import android.support.v4.media.MediaMetadataCompat;
import android.app.PendingIntent;
import android.view.KeyEvent;
import android.support.v4.media.RatingCompat;
import android.support.v4.media.MediaDescriptionCompat;
import android.os.Bundle;
import android.net.Uri;
import android.os.IInterface;

public interface b extends IInterface
{
    void a(final int p0);
    
    void a(final int p0, final int p1, final String p2);
    
    void a(final long p0);
    
    void a(final Uri p0, final Bundle p1);
    
    void a(final MediaDescriptionCompat p0);
    
    void a(final MediaDescriptionCompat p0, final int p1);
    
    void a(final RatingCompat p0);
    
    void a(final RatingCompat p0, final Bundle p1);
    
    void a(final android.support.v4.media.session.a p0);
    
    void a(final String p0, final Bundle p1);
    
    void a(final String p0, final Bundle p1, final MediaSessionCompat.ResultReceiverWrapper p2);
    
    void a(final boolean p0);
    
    boolean a();
    
    boolean a(final KeyEvent p0);
    
    String b();
    
    void b(final int p0);
    
    void b(final int p0, final int p1, final String p2);
    
    void b(final long p0);
    
    void b(final Uri p0, final Bundle p1);
    
    void b(final MediaDescriptionCompat p0);
    
    void b(final android.support.v4.media.session.a p0);
    
    void b(final String p0, final Bundle p1);
    
    void b(final boolean p0);
    
    String c();
    
    void c(final int p0);
    
    void c(final String p0, final Bundle p1);
    
    PendingIntent d();
    
    void d(final String p0, final Bundle p1);
    
    long e();
    
    void e(final String p0, final Bundle p1);
    
    ParcelableVolumeInfo f();
    
    MediaMetadataCompat g();
    
    PlaybackStateCompat h();
    
    List<MediaSessionCompat.QueueItem> i();
    
    CharSequence j();
    
    Bundle k();
    
    int l();
    
    boolean m();
    
    int n();
    
    boolean o();
    
    int p();
    
    void q();
    
    void r();
    
    void s();
    
    void t();
    
    void u();
    
    void v();
    
    void w();
    
    void x();
    
    public abstract static class a extends Binder implements b
    {
        public static b a(final IBinder binder) {
            if (binder == null) {
                return null;
            }
            final IInterface queryLocalInterface = binder.queryLocalInterface("android.support.v4.media.session.IMediaSession");
            if (queryLocalInterface != null && queryLocalInterface instanceof b) {
                return (b)queryLocalInterface;
            }
            return new b.a.a(binder);
        }
        
        public IBinder asBinder() {
            return (IBinder)this;
        }
        
        public boolean onTransact(int n, final Parcel parcel, final Parcel parcel2, final int n2) {
            final int n3 = 0;
            final int n4 = 0;
            boolean b = false;
            final boolean b2 = false;
            final int n5 = 0;
            switch (n) {
                default: {
                    return super.onTransact(n, parcel, parcel2, n2);
                }
                case 1598968902: {
                    parcel2.writeString("android.support.v4.media.session.IMediaSession");
                    return true;
                }
                case 1: {
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    final String string = parcel.readString();
                    Bundle bundle;
                    if (parcel.readInt() != 0) {
                        bundle = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
                    }
                    else {
                        bundle = null;
                    }
                    MediaSessionCompat.ResultReceiverWrapper resultReceiverWrapper;
                    if (parcel.readInt() != 0) {
                        resultReceiverWrapper = (MediaSessionCompat.ResultReceiverWrapper)MediaSessionCompat.ResultReceiverWrapper.CREATOR.createFromParcel(parcel);
                    }
                    else {
                        resultReceiverWrapper = null;
                    }
                    this.a(string, bundle, resultReceiverWrapper);
                    parcel2.writeNoException();
                    return true;
                }
                case 2: {
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    KeyEvent keyEvent;
                    if (parcel.readInt() != 0) {
                        keyEvent = (KeyEvent)KeyEvent.CREATOR.createFromParcel(parcel);
                    }
                    else {
                        keyEvent = null;
                    }
                    final boolean a = this.a(keyEvent);
                    parcel2.writeNoException();
                    if (a) {
                        n = 1;
                    }
                    else {
                        n = 0;
                    }
                    parcel2.writeInt(n);
                    return true;
                }
                case 3: {
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    this.a(a.a.a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                }
                case 4: {
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    this.b(a.a.a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                }
                case 5: {
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    final boolean a2 = this.a();
                    parcel2.writeNoException();
                    n = n5;
                    if (a2) {
                        n = 1;
                    }
                    parcel2.writeInt(n);
                    return true;
                }
                case 6: {
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    final String b3 = this.b();
                    parcel2.writeNoException();
                    parcel2.writeString(b3);
                    return true;
                }
                case 7: {
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    final String c = this.c();
                    parcel2.writeNoException();
                    parcel2.writeString(c);
                    return true;
                }
                case 8: {
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    final PendingIntent d = this.d();
                    parcel2.writeNoException();
                    if (d != null) {
                        parcel2.writeInt(1);
                        d.writeToParcel(parcel2, 1);
                        return true;
                    }
                    parcel2.writeInt(0);
                    return true;
                }
                case 9: {
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    final long e = this.e();
                    parcel2.writeNoException();
                    parcel2.writeLong(e);
                    return true;
                }
                case 10: {
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    final ParcelableVolumeInfo f = this.f();
                    parcel2.writeNoException();
                    if (f != null) {
                        parcel2.writeInt(1);
                        f.writeToParcel(parcel2, 1);
                        return true;
                    }
                    parcel2.writeInt(0);
                    return true;
                }
                case 11: {
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    this.a(parcel.readInt(), parcel.readInt(), parcel.readString());
                    parcel2.writeNoException();
                    return true;
                }
                case 12: {
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    this.b(parcel.readInt(), parcel.readInt(), parcel.readString());
                    parcel2.writeNoException();
                    return true;
                }
                case 27: {
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    final MediaMetadataCompat g = this.g();
                    parcel2.writeNoException();
                    if (g != null) {
                        parcel2.writeInt(1);
                        g.writeToParcel(parcel2, 1);
                        return true;
                    }
                    parcel2.writeInt(0);
                    return true;
                }
                case 28: {
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    final PlaybackStateCompat h = this.h();
                    parcel2.writeNoException();
                    if (h != null) {
                        parcel2.writeInt(1);
                        h.writeToParcel(parcel2, 1);
                        return true;
                    }
                    parcel2.writeInt(0);
                    return true;
                }
                case 29: {
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    final List<MediaSessionCompat.QueueItem> i = this.i();
                    parcel2.writeNoException();
                    parcel2.writeTypedList((List)i);
                    return true;
                }
                case 30: {
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    final CharSequence j = this.j();
                    parcel2.writeNoException();
                    if (j != null) {
                        parcel2.writeInt(1);
                        TextUtils.writeToParcel(j, parcel2, 1);
                        return true;
                    }
                    parcel2.writeInt(0);
                    return true;
                }
                case 31: {
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    final Bundle k = this.k();
                    parcel2.writeNoException();
                    if (k != null) {
                        parcel2.writeInt(1);
                        k.writeToParcel(parcel2, 1);
                        return true;
                    }
                    parcel2.writeInt(0);
                    return true;
                }
                case 32: {
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    n = this.l();
                    parcel2.writeNoException();
                    parcel2.writeInt(n);
                    return true;
                }
                case 45: {
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    final boolean m = this.m();
                    parcel2.writeNoException();
                    n = n3;
                    if (m) {
                        n = 1;
                    }
                    parcel2.writeInt(n);
                    return true;
                }
                case 37: {
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    n = this.n();
                    parcel2.writeNoException();
                    parcel2.writeInt(n);
                    return true;
                }
                case 38: {
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    final boolean o = this.o();
                    parcel2.writeNoException();
                    n = n4;
                    if (o) {
                        n = 1;
                    }
                    parcel2.writeInt(n);
                    return true;
                }
                case 47: {
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    n = this.p();
                    parcel2.writeNoException();
                    parcel2.writeInt(n);
                    return true;
                }
                case 41: {
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    MediaDescriptionCompat mediaDescriptionCompat;
                    if (parcel.readInt() != 0) {
                        mediaDescriptionCompat = (MediaDescriptionCompat)MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
                    }
                    else {
                        mediaDescriptionCompat = null;
                    }
                    this.a(mediaDescriptionCompat);
                    parcel2.writeNoException();
                    return true;
                }
                case 42: {
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    MediaDescriptionCompat mediaDescriptionCompat2;
                    if (parcel.readInt() != 0) {
                        mediaDescriptionCompat2 = (MediaDescriptionCompat)MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
                    }
                    else {
                        mediaDescriptionCompat2 = null;
                    }
                    this.a(mediaDescriptionCompat2, parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                }
                case 43: {
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    MediaDescriptionCompat mediaDescriptionCompat3;
                    if (parcel.readInt() != 0) {
                        mediaDescriptionCompat3 = (MediaDescriptionCompat)MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
                    }
                    else {
                        mediaDescriptionCompat3 = null;
                    }
                    this.b(mediaDescriptionCompat3);
                    parcel2.writeNoException();
                    return true;
                }
                case 44: {
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    this.a(parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                }
                case 33: {
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    this.q();
                    parcel2.writeNoException();
                    return true;
                }
                case 34: {
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    final String string2 = parcel.readString();
                    Bundle bundle2;
                    if (parcel.readInt() != 0) {
                        bundle2 = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
                    }
                    else {
                        bundle2 = null;
                    }
                    this.a(string2, bundle2);
                    parcel2.writeNoException();
                    return true;
                }
                case 35: {
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    final String string3 = parcel.readString();
                    Bundle bundle3;
                    if (parcel.readInt() != 0) {
                        bundle3 = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
                    }
                    else {
                        bundle3 = null;
                    }
                    this.b(string3, bundle3);
                    parcel2.writeNoException();
                    return true;
                }
                case 36: {
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    Uri uri;
                    if (parcel.readInt() != 0) {
                        uri = (Uri)Uri.CREATOR.createFromParcel(parcel);
                    }
                    else {
                        uri = null;
                    }
                    Bundle bundle4;
                    if (parcel.readInt() != 0) {
                        bundle4 = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
                    }
                    else {
                        bundle4 = null;
                    }
                    this.a(uri, bundle4);
                    parcel2.writeNoException();
                    return true;
                }
                case 13: {
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    this.r();
                    parcel2.writeNoException();
                    return true;
                }
                case 14: {
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    final String string4 = parcel.readString();
                    Bundle bundle5;
                    if (parcel.readInt() != 0) {
                        bundle5 = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
                    }
                    else {
                        bundle5 = null;
                    }
                    this.c(string4, bundle5);
                    parcel2.writeNoException();
                    return true;
                }
                case 15: {
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    final String string5 = parcel.readString();
                    Bundle bundle6;
                    if (parcel.readInt() != 0) {
                        bundle6 = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
                    }
                    else {
                        bundle6 = null;
                    }
                    this.d(string5, bundle6);
                    parcel2.writeNoException();
                    return true;
                }
                case 16: {
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    Uri uri2;
                    if (parcel.readInt() != 0) {
                        uri2 = (Uri)Uri.CREATOR.createFromParcel(parcel);
                    }
                    else {
                        uri2 = null;
                    }
                    Bundle bundle7;
                    if (parcel.readInt() != 0) {
                        bundle7 = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
                    }
                    else {
                        bundle7 = null;
                    }
                    this.b(uri2, bundle7);
                    parcel2.writeNoException();
                    return true;
                }
                case 17: {
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    this.a(parcel.readLong());
                    parcel2.writeNoException();
                    return true;
                }
                case 18: {
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    this.s();
                    parcel2.writeNoException();
                    return true;
                }
                case 19: {
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    this.t();
                    parcel2.writeNoException();
                    return true;
                }
                case 20: {
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    this.u();
                    parcel2.writeNoException();
                    return true;
                }
                case 21: {
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    this.v();
                    parcel2.writeNoException();
                    return true;
                }
                case 22: {
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    this.w();
                    parcel2.writeNoException();
                    return true;
                }
                case 23: {
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    this.x();
                    parcel2.writeNoException();
                    return true;
                }
                case 24: {
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    this.b(parcel.readLong());
                    parcel2.writeNoException();
                    return true;
                }
                case 25: {
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    RatingCompat ratingCompat;
                    if (parcel.readInt() != 0) {
                        ratingCompat = (RatingCompat)RatingCompat.CREATOR.createFromParcel(parcel);
                    }
                    else {
                        ratingCompat = null;
                    }
                    this.a(ratingCompat);
                    parcel2.writeNoException();
                    return true;
                }
                case 51: {
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    RatingCompat ratingCompat2;
                    if (parcel.readInt() != 0) {
                        ratingCompat2 = (RatingCompat)RatingCompat.CREATOR.createFromParcel(parcel);
                    }
                    else {
                        ratingCompat2 = null;
                    }
                    Bundle bundle8;
                    if (parcel.readInt() != 0) {
                        bundle8 = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
                    }
                    else {
                        bundle8 = null;
                    }
                    this.a(ratingCompat2, bundle8);
                    parcel2.writeNoException();
                    return true;
                }
                case 46: {
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    if (parcel.readInt() != 0) {
                        b = true;
                    }
                    this.a(b);
                    parcel2.writeNoException();
                    return true;
                }
                case 39: {
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    this.b(parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                }
                case 40: {
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    boolean b4 = b2;
                    if (parcel.readInt() != 0) {
                        b4 = true;
                    }
                    this.b(b4);
                    parcel2.writeNoException();
                    return true;
                }
                case 48: {
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    this.c(parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                }
                case 26: {
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    final String string6 = parcel.readString();
                    Bundle bundle9;
                    if (parcel.readInt() != 0) {
                        bundle9 = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
                    }
                    else {
                        bundle9 = null;
                    }
                    this.e(string6, bundle9);
                    parcel2.writeNoException();
                    return true;
                }
            }
        }
        
        private static class a implements b
        {
            private IBinder a;
            
            a(final IBinder a) {
                this.a = a;
            }
            
            @Override
            public void a(final int n) {
                final Parcel obtain = Parcel.obtain();
                final Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    obtain.writeInt(n);
                    this.a.transact(44, obtain, obtain2, 0);
                    obtain2.readException();
                }
                finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
            
            @Override
            public void a(final int n, final int n2, final String s) {
                final Parcel obtain = Parcel.obtain();
                final Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    obtain.writeInt(n);
                    obtain.writeInt(n2);
                    obtain.writeString(s);
                    this.a.transact(11, obtain, obtain2, 0);
                    obtain2.readException();
                }
                finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
            
            @Override
            public void a(final long n) {
                final Parcel obtain = Parcel.obtain();
                final Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    obtain.writeLong(n);
                    this.a.transact(17, obtain, obtain2, 0);
                    obtain2.readException();
                }
                finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
            
            @Override
            public void a(final Uri uri, final Bundle bundle) {
                while (true) {
                    final Parcel obtain = Parcel.obtain();
                    final Parcel obtain2 = Parcel.obtain();
                    while (true) {
                        try {
                            obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                            if (uri != null) {
                                obtain.writeInt(1);
                                uri.writeToParcel(obtain, 0);
                            }
                            else {
                                obtain.writeInt(0);
                            }
                            if (bundle != null) {
                                obtain.writeInt(1);
                                bundle.writeToParcel(obtain, 0);
                                this.a.transact(36, obtain, obtain2, 0);
                                obtain2.readException();
                                return;
                            }
                        }
                        finally {
                            obtain2.recycle();
                            obtain.recycle();
                        }
                        obtain.writeInt(0);
                        continue;
                    }
                }
            }
            
            @Override
            public void a(final MediaDescriptionCompat mediaDescriptionCompat) {
                final Parcel obtain = Parcel.obtain();
                final Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    if (mediaDescriptionCompat != null) {
                        obtain.writeInt(1);
                        mediaDescriptionCompat.writeToParcel(obtain, 0);
                    }
                    else {
                        obtain.writeInt(0);
                    }
                    this.a.transact(41, obtain, obtain2, 0);
                    obtain2.readException();
                }
                finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
            
            @Override
            public void a(final MediaDescriptionCompat mediaDescriptionCompat, final int n) {
                final Parcel obtain = Parcel.obtain();
                final Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    if (mediaDescriptionCompat != null) {
                        obtain.writeInt(1);
                        mediaDescriptionCompat.writeToParcel(obtain, 0);
                    }
                    else {
                        obtain.writeInt(0);
                    }
                    obtain.writeInt(n);
                    this.a.transact(42, obtain, obtain2, 0);
                    obtain2.readException();
                }
                finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
            
            @Override
            public void a(final RatingCompat ratingCompat) {
                final Parcel obtain = Parcel.obtain();
                final Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    if (ratingCompat != null) {
                        obtain.writeInt(1);
                        ratingCompat.writeToParcel(obtain, 0);
                    }
                    else {
                        obtain.writeInt(0);
                    }
                    this.a.transact(25, obtain, obtain2, 0);
                    obtain2.readException();
                }
                finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
            
            @Override
            public void a(final RatingCompat ratingCompat, final Bundle bundle) {
                while (true) {
                    final Parcel obtain = Parcel.obtain();
                    final Parcel obtain2 = Parcel.obtain();
                    while (true) {
                        try {
                            obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                            if (ratingCompat != null) {
                                obtain.writeInt(1);
                                ratingCompat.writeToParcel(obtain, 0);
                            }
                            else {
                                obtain.writeInt(0);
                            }
                            if (bundle != null) {
                                obtain.writeInt(1);
                                bundle.writeToParcel(obtain, 0);
                                this.a.transact(51, obtain, obtain2, 0);
                                obtain2.readException();
                                return;
                            }
                        }
                        finally {
                            obtain2.recycle();
                            obtain.recycle();
                        }
                        obtain.writeInt(0);
                        continue;
                    }
                }
            }
            
            @Override
            public void a(final android.support.v4.media.session.a a) {
                final Parcel obtain = Parcel.obtain();
                final Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    IBinder binder;
                    if (a != null) {
                        binder = a.asBinder();
                    }
                    else {
                        binder = null;
                    }
                    obtain.writeStrongBinder(binder);
                    this.a.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                }
                finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
            
            @Override
            public void a(final String s, final Bundle bundle) {
                final Parcel obtain = Parcel.obtain();
                final Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    obtain.writeString(s);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    }
                    else {
                        obtain.writeInt(0);
                    }
                    this.a.transact(34, obtain, obtain2, 0);
                    obtain2.readException();
                }
                finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
            
            @Override
            public void a(final String s, final Bundle bundle, final MediaSessionCompat.ResultReceiverWrapper resultReceiverWrapper) {
                while (true) {
                    final Parcel obtain = Parcel.obtain();
                    final Parcel obtain2 = Parcel.obtain();
                    while (true) {
                        try {
                            obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                            obtain.writeString(s);
                            if (bundle != null) {
                                obtain.writeInt(1);
                                bundle.writeToParcel(obtain, 0);
                            }
                            else {
                                obtain.writeInt(0);
                            }
                            if (resultReceiverWrapper != null) {
                                obtain.writeInt(1);
                                resultReceiverWrapper.writeToParcel(obtain, 0);
                                this.a.transact(1, obtain, obtain2, 0);
                                obtain2.readException();
                                return;
                            }
                        }
                        finally {
                            obtain2.recycle();
                            obtain.recycle();
                        }
                        obtain.writeInt(0);
                        continue;
                    }
                }
            }
            
            @Override
            public void a(final boolean b) {
                int n = 0;
                final Parcel obtain = Parcel.obtain();
                final Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    if (b) {
                        n = 1;
                    }
                    obtain.writeInt(n);
                    this.a.transact(46, obtain, obtain2, 0);
                    obtain2.readException();
                }
                finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
            
            @Override
            public boolean a() {
                boolean b = false;
                final Parcel obtain = Parcel.obtain();
                final Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    this.a.transact(5, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        b = true;
                    }
                    return b;
                }
                finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
            
            @Override
            public boolean a(final KeyEvent keyEvent) {
                while (true) {
                    boolean b = true;
                    final Parcel obtain = Parcel.obtain();
                    final Parcel obtain2 = Parcel.obtain();
                    try {
                        obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                        if (keyEvent != null) {
                            obtain.writeInt(1);
                            keyEvent.writeToParcel(obtain, 0);
                        }
                        else {
                            obtain.writeInt(0);
                        }
                        this.a.transact(2, obtain, obtain2, 0);
                        obtain2.readException();
                        if (obtain2.readInt() != 0) {
                            return b;
                        }
                    }
                    finally {
                        obtain2.recycle();
                        obtain.recycle();
                    }
                    b = false;
                    return b;
                }
            }
            
            public IBinder asBinder() {
                return this.a;
            }
            
            @Override
            public String b() {
                final Parcel obtain = Parcel.obtain();
                final Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    this.a.transact(6, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                }
                finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
            
            @Override
            public void b(final int n) {
                final Parcel obtain = Parcel.obtain();
                final Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    obtain.writeInt(n);
                    this.a.transact(39, obtain, obtain2, 0);
                    obtain2.readException();
                }
                finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
            
            @Override
            public void b(final int n, final int n2, final String s) {
                final Parcel obtain = Parcel.obtain();
                final Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    obtain.writeInt(n);
                    obtain.writeInt(n2);
                    obtain.writeString(s);
                    this.a.transact(12, obtain, obtain2, 0);
                    obtain2.readException();
                }
                finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
            
            @Override
            public void b(final long n) {
                final Parcel obtain = Parcel.obtain();
                final Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    obtain.writeLong(n);
                    this.a.transact(24, obtain, obtain2, 0);
                    obtain2.readException();
                }
                finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
            
            @Override
            public void b(final Uri uri, final Bundle bundle) {
                while (true) {
                    final Parcel obtain = Parcel.obtain();
                    final Parcel obtain2 = Parcel.obtain();
                    while (true) {
                        try {
                            obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                            if (uri != null) {
                                obtain.writeInt(1);
                                uri.writeToParcel(obtain, 0);
                            }
                            else {
                                obtain.writeInt(0);
                            }
                            if (bundle != null) {
                                obtain.writeInt(1);
                                bundle.writeToParcel(obtain, 0);
                                this.a.transact(16, obtain, obtain2, 0);
                                obtain2.readException();
                                return;
                            }
                        }
                        finally {
                            obtain2.recycle();
                            obtain.recycle();
                        }
                        obtain.writeInt(0);
                        continue;
                    }
                }
            }
            
            @Override
            public void b(final MediaDescriptionCompat mediaDescriptionCompat) {
                final Parcel obtain = Parcel.obtain();
                final Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    if (mediaDescriptionCompat != null) {
                        obtain.writeInt(1);
                        mediaDescriptionCompat.writeToParcel(obtain, 0);
                    }
                    else {
                        obtain.writeInt(0);
                    }
                    this.a.transact(43, obtain, obtain2, 0);
                    obtain2.readException();
                }
                finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
            
            @Override
            public void b(final android.support.v4.media.session.a a) {
                final Parcel obtain = Parcel.obtain();
                final Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    IBinder binder;
                    if (a != null) {
                        binder = a.asBinder();
                    }
                    else {
                        binder = null;
                    }
                    obtain.writeStrongBinder(binder);
                    this.a.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                }
                finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
            
            @Override
            public void b(final String s, final Bundle bundle) {
                final Parcel obtain = Parcel.obtain();
                final Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    obtain.writeString(s);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    }
                    else {
                        obtain.writeInt(0);
                    }
                    this.a.transact(35, obtain, obtain2, 0);
                    obtain2.readException();
                }
                finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
            
            @Override
            public void b(final boolean b) {
                int n = 0;
                final Parcel obtain = Parcel.obtain();
                final Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    if (b) {
                        n = 1;
                    }
                    obtain.writeInt(n);
                    this.a.transact(40, obtain, obtain2, 0);
                    obtain2.readException();
                }
                finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
            
            @Override
            public String c() {
                final Parcel obtain = Parcel.obtain();
                final Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    this.a.transact(7, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                }
                finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
            
            @Override
            public void c(final int n) {
                final Parcel obtain = Parcel.obtain();
                final Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    obtain.writeInt(n);
                    this.a.transact(48, obtain, obtain2, 0);
                    obtain2.readException();
                }
                finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
            
            @Override
            public void c(final String s, final Bundle bundle) {
                final Parcel obtain = Parcel.obtain();
                final Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    obtain.writeString(s);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    }
                    else {
                        obtain.writeInt(0);
                    }
                    this.a.transact(14, obtain, obtain2, 0);
                    obtain2.readException();
                }
                finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
            
            @Override
            public PendingIntent d() {
                final Parcel obtain = Parcel.obtain();
                final Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    this.a.transact(8, obtain, obtain2, 0);
                    obtain2.readException();
                    PendingIntent pendingIntent;
                    if (obtain2.readInt() != 0) {
                        pendingIntent = (PendingIntent)PendingIntent.CREATOR.createFromParcel(obtain2);
                    }
                    else {
                        pendingIntent = null;
                    }
                    return pendingIntent;
                }
                finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
            
            @Override
            public void d(final String s, final Bundle bundle) {
                final Parcel obtain = Parcel.obtain();
                final Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    obtain.writeString(s);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    }
                    else {
                        obtain.writeInt(0);
                    }
                    this.a.transact(15, obtain, obtain2, 0);
                    obtain2.readException();
                }
                finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
            
            @Override
            public long e() {
                final Parcel obtain = Parcel.obtain();
                final Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    this.a.transact(9, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readLong();
                }
                finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
            
            @Override
            public void e(final String s, final Bundle bundle) {
                final Parcel obtain = Parcel.obtain();
                final Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    obtain.writeString(s);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    }
                    else {
                        obtain.writeInt(0);
                    }
                    this.a.transact(26, obtain, obtain2, 0);
                    obtain2.readException();
                }
                finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
            
            @Override
            public ParcelableVolumeInfo f() {
                final Parcel obtain = Parcel.obtain();
                final Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    this.a.transact(10, obtain, obtain2, 0);
                    obtain2.readException();
                    ParcelableVolumeInfo parcelableVolumeInfo;
                    if (obtain2.readInt() != 0) {
                        parcelableVolumeInfo = (ParcelableVolumeInfo)ParcelableVolumeInfo.CREATOR.createFromParcel(obtain2);
                    }
                    else {
                        parcelableVolumeInfo = null;
                    }
                    return parcelableVolumeInfo;
                }
                finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
            
            @Override
            public MediaMetadataCompat g() {
                final Parcel obtain = Parcel.obtain();
                final Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    this.a.transact(27, obtain, obtain2, 0);
                    obtain2.readException();
                    MediaMetadataCompat mediaMetadataCompat;
                    if (obtain2.readInt() != 0) {
                        mediaMetadataCompat = (MediaMetadataCompat)MediaMetadataCompat.CREATOR.createFromParcel(obtain2);
                    }
                    else {
                        mediaMetadataCompat = null;
                    }
                    return mediaMetadataCompat;
                }
                finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
            
            @Override
            public PlaybackStateCompat h() {
                final Parcel obtain = Parcel.obtain();
                final Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    this.a.transact(28, obtain, obtain2, 0);
                    obtain2.readException();
                    PlaybackStateCompat playbackStateCompat;
                    if (obtain2.readInt() != 0) {
                        playbackStateCompat = (PlaybackStateCompat)PlaybackStateCompat.CREATOR.createFromParcel(obtain2);
                    }
                    else {
                        playbackStateCompat = null;
                    }
                    return playbackStateCompat;
                }
                finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
            
            @Override
            public List<MediaSessionCompat.QueueItem> i() {
                final Parcel obtain = Parcel.obtain();
                final Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    this.a.transact(29, obtain, obtain2, 0);
                    obtain2.readException();
                    return (List<MediaSessionCompat.QueueItem>)obtain2.createTypedArrayList((Parcelable$Creator)MediaSessionCompat.QueueItem.CREATOR);
                }
                finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
            
            @Override
            public CharSequence j() {
                final Parcel obtain = Parcel.obtain();
                final Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    this.a.transact(30, obtain, obtain2, 0);
                    obtain2.readException();
                    CharSequence charSequence;
                    if (obtain2.readInt() != 0) {
                        charSequence = (CharSequence)TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(obtain2);
                    }
                    else {
                        charSequence = null;
                    }
                    return charSequence;
                }
                finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
            
            @Override
            public Bundle k() {
                final Parcel obtain = Parcel.obtain();
                final Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    this.a.transact(31, obtain, obtain2, 0);
                    obtain2.readException();
                    Bundle bundle;
                    if (obtain2.readInt() != 0) {
                        bundle = (Bundle)Bundle.CREATOR.createFromParcel(obtain2);
                    }
                    else {
                        bundle = null;
                    }
                    return bundle;
                }
                finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
            
            @Override
            public int l() {
                final Parcel obtain = Parcel.obtain();
                final Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    this.a.transact(32, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                }
                finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
            
            @Override
            public boolean m() {
                boolean b = false;
                final Parcel obtain = Parcel.obtain();
                final Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    this.a.transact(45, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        b = true;
                    }
                    return b;
                }
                finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
            
            @Override
            public int n() {
                final Parcel obtain = Parcel.obtain();
                final Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    this.a.transact(37, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                }
                finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
            
            @Override
            public boolean o() {
                boolean b = false;
                final Parcel obtain = Parcel.obtain();
                final Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    this.a.transact(38, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        b = true;
                    }
                    return b;
                }
                finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
            
            @Override
            public int p() {
                final Parcel obtain = Parcel.obtain();
                final Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    this.a.transact(47, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                }
                finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
            
            @Override
            public void q() {
                final Parcel obtain = Parcel.obtain();
                final Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    this.a.transact(33, obtain, obtain2, 0);
                    obtain2.readException();
                }
                finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
            
            @Override
            public void r() {
                final Parcel obtain = Parcel.obtain();
                final Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    this.a.transact(13, obtain, obtain2, 0);
                    obtain2.readException();
                }
                finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
            
            @Override
            public void s() {
                final Parcel obtain = Parcel.obtain();
                final Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    this.a.transact(18, obtain, obtain2, 0);
                    obtain2.readException();
                }
                finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
            
            @Override
            public void t() {
                final Parcel obtain = Parcel.obtain();
                final Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    this.a.transact(19, obtain, obtain2, 0);
                    obtain2.readException();
                }
                finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
            
            @Override
            public void u() {
                final Parcel obtain = Parcel.obtain();
                final Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    this.a.transact(20, obtain, obtain2, 0);
                    obtain2.readException();
                }
                finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
            
            @Override
            public void v() {
                final Parcel obtain = Parcel.obtain();
                final Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    this.a.transact(21, obtain, obtain2, 0);
                    obtain2.readException();
                }
                finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
            
            @Override
            public void w() {
                final Parcel obtain = Parcel.obtain();
                final Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    this.a.transact(22, obtain, obtain2, 0);
                    obtain2.readException();
                }
                finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
            
            @Override
            public void x() {
                final Parcel obtain = Parcel.obtain();
                final Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    this.a.transact(23, obtain, obtain2, 0);
                    obtain2.readException();
                }
                finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }
    }
}
