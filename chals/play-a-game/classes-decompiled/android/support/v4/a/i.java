// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v4.a;

import android.view.LayoutInflater;
import android.view.Window;
import android.content.IntentSender;
import android.view.MenuItem;
import android.os.Parcelable;
import android.os.Bundle;
import android.content.res.Configuration;
import android.os.Build$VERSION;
import android.util.Log;
import android.content.Intent;
import java.io.PrintWriter;
import java.io.FileDescriptor;
import android.view.Menu;
import android.util.AttributeSet;
import android.content.Context;
import android.view.View;
import java.util.Iterator;
import android.arch.lifecycle.b;
import android.os.Message;
import android.support.v4.g.l;
import android.os.Handler;

public class i extends f
{
    final Handler c;
    final k d;
    boolean e;
    boolean f;
    boolean g;
    boolean h;
    boolean i;
    int j;
    l<String> k;
    
    public i() {
        this.c = new Handler() {
            public void handleMessage(final Message message) {
                switch (message.what) {
                    default: {
                        super.handleMessage(message);
                        break;
                    }
                    case 1: {
                        if (android.support.v4.a.i.this.g) {
                            android.support.v4.a.i.this.a(false);
                            return;
                        }
                        break;
                    }
                    case 2: {
                        android.support.v4.a.i.this.b();
                        android.support.v4.a.i.this.d.n();
                    }
                }
            }
        };
        this.d = android.support.v4.a.k.a(new a());
        this.g = true;
        this.h = true;
    }
    
    private static void a(final m m, final android.arch.lifecycle.b.b b) {
        for (final h h : m.b()) {
            if (h != null) {
                h.U.a(b);
                a(h.g(), b);
            }
        }
    }
    
    @Override
    public android.arch.lifecycle.b a() {
        return super.a();
    }
    
    @Override
    final View a(final View view, final String s, final Context context, final AttributeSet set) {
        return this.d.a(view, s, context, set);
    }
    
    public void a(final h h) {
    }
    
    void a(final boolean i) {
        if (!this.h) {
            this.h = true;
            this.i = i;
            this.c.removeMessages(1);
            this.e();
        }
        else if (i) {
            this.d.o();
            this.d.c(true);
        }
    }
    
    protected boolean a(final View view, final Menu menu) {
        return super.onPreparePanel(0, view, menu);
    }
    
    protected void b() {
        this.d.h();
    }
    
    public Object c() {
        return null;
    }
    
    @Deprecated
    public void d() {
        this.invalidateOptionsMenu();
    }
    
    public void dump(final String s, final FileDescriptor fileDescriptor, final PrintWriter printWriter, final String[] array) {
        super.dump(s, fileDescriptor, printWriter, array);
        printWriter.print(s);
        printWriter.print("Local FragmentActivity ");
        printWriter.print(Integer.toHexString(System.identityHashCode(this)));
        printWriter.println(" State:");
        final String string = s + "  ";
        printWriter.print(string);
        printWriter.print("mCreated=");
        printWriter.print(this.e);
        printWriter.print("mResumed=");
        printWriter.print(this.f);
        printWriter.print(" mStopped=");
        printWriter.print(this.g);
        printWriter.print(" mReallyStopped=");
        printWriter.println(this.h);
        this.d.a(string, fileDescriptor, printWriter, array);
        this.d.a().a(s, fileDescriptor, printWriter, array);
    }
    
    void e() {
        this.d.c(this.i);
        this.d.k();
    }
    
    public m f() {
        return this.d.a();
    }
    
    protected void onActivityResult(final int n, final int n2, final Intent intent) {
        this.d.b();
        final int n3 = n >> 16;
        if (n3 == 0) {
            super.onActivityResult(n, n2, intent);
            return;
        }
        final int n4 = n3 - 1;
        final String s = this.k.a(n4);
        this.k.c(n4);
        if (s == null) {
            Log.w("FragmentActivity", "Activity result delivered for unknown Fragment.");
            return;
        }
        final h a = this.d.a(s);
        if (a == null) {
            Log.w("FragmentActivity", "Activity result no fragment exists for who: " + s);
            return;
        }
        a.a(0xFFFF & n, n2, intent);
    }
    
    public void onBackPressed() {
        final m a = this.d.a();
        final boolean c = a.c();
        if ((!c || Build$VERSION.SDK_INT > 25) && (c || !a.a())) {
            super.onBackPressed();
        }
    }
    
    public void onConfigurationChanged(final Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.d.a(configuration);
    }
    
    @Override
    protected void onCreate(final Bundle bundle) {
        this.d.a((h)null);
        super.onCreate(bundle);
        final b b = (b)this.getLastNonConfigurationInstance();
        if (b != null) {
            this.d.a(b.c);
        }
        if (bundle != null) {
            final Parcelable parcelable = bundle.getParcelable("android:support:fragments");
            final k d = this.d;
            o b2;
            if (b != null) {
                b2 = b.b;
            }
            else {
                b2 = null;
            }
            d.a(parcelable, b2);
            if (bundle.containsKey("android:support:next_request_index")) {
                this.j = bundle.getInt("android:support:next_request_index");
                final int[] intArray = bundle.getIntArray("android:support:request_indicies");
                final String[] stringArray = bundle.getStringArray("android:support:request_fragment_who");
                if (intArray == null || stringArray == null || intArray.length != stringArray.length) {
                    Log.w("FragmentActivity", "Invalid requestCode mapping in savedInstanceState.");
                }
                else {
                    this.k = new l<String>(intArray.length);
                    for (int i = 0; i < intArray.length; ++i) {
                        this.k.b(intArray[i], stringArray[i]);
                    }
                }
            }
        }
        if (this.k == null) {
            this.k = new l<String>();
            this.j = 0;
        }
        this.d.e();
    }
    
    public boolean onCreatePanelMenu(final int n, final Menu menu) {
        if (n == 0) {
            return super.onCreatePanelMenu(n, menu) | this.d.a(menu, this.getMenuInflater());
        }
        return super.onCreatePanelMenu(n, menu);
    }
    
    protected void onDestroy() {
        super.onDestroy();
        this.a(false);
        this.d.l();
        this.d.p();
    }
    
    public void onLowMemory() {
        super.onLowMemory();
        this.d.m();
    }
    
    public boolean onMenuItemSelected(final int n, final MenuItem menuItem) {
        if (super.onMenuItemSelected(n, menuItem)) {
            return true;
        }
        switch (n) {
            default: {
                return false;
            }
            case 0: {
                return this.d.a(menuItem);
            }
            case 6: {
                return this.d.b(menuItem);
            }
        }
    }
    
    public void onMultiWindowModeChanged(final boolean b) {
        this.d.a(b);
    }
    
    protected void onNewIntent(final Intent intent) {
        super.onNewIntent(intent);
        this.d.b();
    }
    
    public void onPanelClosed(final int n, final Menu menu) {
        switch (n) {
            case 0: {
                this.d.b(menu);
                break;
            }
        }
        super.onPanelClosed(n, menu);
    }
    
    protected void onPause() {
        super.onPause();
        this.f = false;
        if (this.c.hasMessages(2)) {
            this.c.removeMessages(2);
            this.b();
        }
        this.d.i();
    }
    
    public void onPictureInPictureModeChanged(final boolean b) {
        this.d.b(b);
    }
    
    protected void onPostResume() {
        super.onPostResume();
        this.c.removeMessages(2);
        this.b();
        this.d.n();
    }
    
    public boolean onPreparePanel(final int n, final View view, final Menu menu) {
        if (n == 0 && menu != null) {
            return this.a(view, menu) | this.d.a(menu);
        }
        return super.onPreparePanel(n, view, menu);
    }
    
    public void onRequestPermissionsResult(final int n, final String[] array, final int[] array2) {
        final int n2 = n >> 16 & 0xFFFF;
        if (n2 != 0) {
            final int n3 = n2 - 1;
            final String s = this.k.a(n3);
            this.k.c(n3);
            if (s == null) {
                Log.w("FragmentActivity", "Activity result delivered for unknown Fragment.");
            }
            else {
                final h a = this.d.a(s);
                if (a == null) {
                    Log.w("FragmentActivity", "Activity result no fragment exists for who: " + s);
                    return;
                }
                a.a(n & 0xFFFF, array, array2);
            }
        }
    }
    
    protected void onResume() {
        super.onResume();
        this.c.sendEmptyMessage(2);
        this.f = true;
        this.d.n();
    }
    
    public final Object onRetainNonConfigurationInstance() {
        if (this.g) {
            this.a(true);
        }
        final Object c = this.c();
        final o d = this.d.d();
        final android.support.v4.g.k<String, u> r = this.d.r();
        if (d == null && r == null && c == null) {
            return null;
        }
        final b b = new b();
        b.a = c;
        b.b = d;
        b.c = r;
        return b;
    }
    
    @Override
    protected void onSaveInstanceState(final Bundle bundle) {
        super.onSaveInstanceState(bundle);
        a(this.f(), android.arch.lifecycle.b.b.c);
        final Parcelable c = this.d.c();
        if (c != null) {
            bundle.putParcelable("android:support:fragments", c);
        }
        if (this.k.b() > 0) {
            bundle.putInt("android:support:next_request_index", this.j);
            final int[] array = new int[this.k.b()];
            final String[] array2 = new String[this.k.b()];
            for (int i = 0; i < this.k.b(); ++i) {
                array[i] = this.k.d(i);
                array2[i] = this.k.e(i);
            }
            bundle.putIntArray("android:support:request_indicies", array);
            bundle.putStringArray("android:support:request_fragment_who", array2);
        }
    }
    
    protected void onStart() {
        super.onStart();
        this.g = false;
        this.h = false;
        this.c.removeMessages(1);
        if (!this.e) {
            this.e = true;
            this.d.f();
        }
        this.d.b();
        this.d.n();
        this.d.o();
        this.d.g();
        this.d.q();
    }
    
    public void onStateNotSaved() {
        this.d.b();
    }
    
    protected void onStop() {
        super.onStop();
        this.g = true;
        a(this.f(), android.arch.lifecycle.b.b.c);
        this.c.sendEmptyMessage(1);
        this.d.j();
    }
    
    public void startActivityForResult(final Intent intent, final int n) {
        if (!this.b && n != -1) {
            android.support.v4.a.e.a(n);
        }
        super.startActivityForResult(intent, n);
    }
    
    class a extends l<i>
    {
        public a() {
            super(i.this);
        }
        
        @Override
        public View a(final int n) {
            return i.this.findViewById(n);
        }
        
        @Override
        public void a(final String s, final FileDescriptor fileDescriptor, final PrintWriter printWriter, final String[] array) {
            i.this.dump(s, fileDescriptor, printWriter, array);
        }
        
        @Override
        public boolean a() {
            final Window window = i.this.getWindow();
            return window != null && window.peekDecorView() != null;
        }
        
        @Override
        public boolean a(final h h) {
            return !i.this.isFinishing();
        }
        
        @Override
        public LayoutInflater b() {
            return i.this.getLayoutInflater().cloneInContext((Context)i.this);
        }
        
        public void b(final h h) {
            i.this.a(h);
        }
        
        @Override
        public void c() {
            i.this.d();
        }
        
        @Override
        public boolean d() {
            return i.this.getWindow() != null;
        }
        
        @Override
        public int e() {
            final Window window = i.this.getWindow();
            if (window == null) {
                return 0;
            }
            return window.getAttributes().windowAnimations;
        }
    }
    
    static final class b
    {
        Object a;
        o b;
        android.support.v4.g.k<String, u> c;
    }
}
