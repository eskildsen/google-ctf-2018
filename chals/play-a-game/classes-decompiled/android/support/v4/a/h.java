// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v4.a;

import android.view.ContextMenu$ContextMenuInfo;
import android.view.ContextMenu;
import android.support.v4.h.e;
import android.content.res.Resources;
import android.view.MenuItem;
import java.io.PrintWriter;
import java.io.FileDescriptor;
import android.view.MenuInflater;
import android.view.Menu;
import android.content.res.Configuration;
import android.util.AttributeSet;
import android.app.Activity;
import android.content.Intent;
import android.view.animation.Animation;
import android.animation.Animator;
import android.arch.lifecycle.b;
import android.os.Looper;
import java.lang.reflect.InvocationTargetException;
import android.content.Context;
import android.os.Parcelable;
import android.util.SparseArray;
import android.os.Bundle;
import android.arch.lifecycle.d;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.support.v4.g.k;
import android.view.View$OnCreateContextMenuListener;
import android.content.ComponentCallbacks;
import android.arch.lifecycle.c;

public class h implements android.arch.lifecycle.c, ComponentCallbacks, View$OnCreateContextMenuListener
{
    private static final k<String, Class<?>> V;
    static final Object a;
    boolean A;
    boolean B;
    boolean C;
    boolean D;
    boolean E;
    boolean F;
    ViewGroup G;
    View H;
    View I;
    boolean J;
    boolean K;
    v L;
    boolean M;
    boolean N;
    a O;
    boolean P;
    boolean Q;
    float R;
    LayoutInflater S;
    boolean T;
    d U;
    int b;
    Bundle c;
    SparseArray<Parcelable> d;
    int e;
    String f;
    Bundle g;
    h h;
    int i;
    int j;
    boolean k;
    boolean l;
    boolean m;
    boolean n;
    boolean o;
    boolean p;
    int q;
    n r;
    l s;
    n t;
    o u;
    h v;
    int w;
    int x;
    String y;
    boolean z;
    
    static {
        V = new k<String, Class<?>>();
        a = new Object();
    }
    
    public h() {
        this.b = 0;
        this.e = -1;
        this.i = -1;
        this.E = true;
        this.K = true;
        this.U = new d(this);
    }
    
    private void W() {
        Object j = null;
        if (this.O != null) {
            this.O.i = false;
            j = this.O.j;
            this.O.j = null;
        }
        if (j != null) {
            ((c)j).a();
        }
    }
    
    private a X() {
        if (this.O == null) {
            this.O = new a();
        }
        return this.O;
    }
    
    public static h a(final Context context, final String s, final Bundle bundle) {
        try {
            Class<?> loadClass;
            if ((loadClass = h.V.get(s)) == null) {
                loadClass = context.getClassLoader().loadClass(s);
                h.V.put(s, loadClass);
            }
            final h h = (h)loadClass.getConstructor((Class<?>[])new Class[0]).newInstance(new Object[0]);
            if (bundle != null) {
                bundle.setClassLoader(h.getClass().getClassLoader());
                h.b(bundle);
            }
            return h;
        }
        catch (ClassNotFoundException ex) {
            throw new b("Unable to instantiate fragment " + s + ": make sure class name exists, is public, and has an" + " empty constructor that is public", ex);
        }
        catch (InstantiationException ex2) {
            throw new b("Unable to instantiate fragment " + s + ": make sure class name exists, is public, and has an" + " empty constructor that is public", ex2);
        }
        catch (IllegalAccessException ex3) {
            throw new b("Unable to instantiate fragment " + s + ": make sure class name exists, is public, and has an" + " empty constructor that is public", ex3);
        }
        catch (NoSuchMethodException ex4) {
            throw new b("Unable to instantiate fragment " + s + ": could not find Fragment constructor", ex4);
        }
        catch (InvocationTargetException ex5) {
            throw new b("Unable to instantiate fragment " + s + ": calling Fragment constructor caused an exception", ex5);
        }
    }
    
    static boolean a(final Context context, final String s) {
        try {
            Class<?> loadClass;
            if ((loadClass = h.V.get(s)) == null) {
                loadClass = context.getClassLoader().loadClass(s);
                h.V.put(s, loadClass);
            }
            return h.class.isAssignableFrom(loadClass);
        }
        catch (ClassNotFoundException ex) {
            return false;
        }
    }
    
    public void A() {
        if (this.r == null || this.r.m == null) {
            this.X().i = false;
            return;
        }
        if (Looper.myLooper() != this.r.m.h().getLooper()) {
            this.r.m.h().postAtFrontOfQueue((Runnable)new Runnable() {
                @Override
                public void run() {
                    android.support.v4.a.h.this.W();
                }
            });
            return;
        }
        this.W();
    }
    
    void B() {
        if (this.s == null) {
            throw new IllegalStateException("Fragment has not been attached yet.");
        }
        (this.t = new n()).a(this.s, new j() {
            @Override
            public h a(final Context context, final String s, final Bundle bundle) {
                return android.support.v4.a.h.this.s.a(context, s, bundle);
            }
            
            @Override
            public View a(final int n) {
                if (android.support.v4.a.h.this.H == null) {
                    throw new IllegalStateException("Fragment does not have a view");
                }
                return android.support.v4.a.h.this.H.findViewById(n);
            }
            
            @Override
            public boolean a() {
                return android.support.v4.a.h.this.H != null;
            }
        }, this);
    }
    
    void C() {
        if (this.t != null) {
            this.t.k();
            this.t.e();
        }
        this.b = 4;
        this.F = false;
        this.j();
        if (!this.F) {
            throw new z("Fragment " + this + " did not call through to super.onStart()");
        }
        if (this.t != null) {
            this.t.n();
        }
        if (this.L != null) {
            this.L.g();
        }
        this.U.a(android.arch.lifecycle.b.a.ON_START);
    }
    
    void D() {
        if (this.t != null) {
            this.t.k();
            this.t.e();
        }
        this.b = 5;
        this.F = false;
        this.k();
        if (!this.F) {
            throw new z("Fragment " + this + " did not call through to super.onResume()");
        }
        if (this.t != null) {
            this.t.o();
            this.t.e();
        }
        this.U.a(android.arch.lifecycle.b.a.ON_RESUME);
    }
    
    void E() {
        if (this.t != null) {
            this.t.k();
        }
    }
    
    void F() {
        this.onLowMemory();
        if (this.t != null) {
            this.t.u();
        }
    }
    
    void G() {
        this.U.a(android.arch.lifecycle.b.a.ON_PAUSE);
        if (this.t != null) {
            this.t.p();
        }
        this.b = 4;
        this.F = false;
        this.l();
        if (!this.F) {
            throw new z("Fragment " + this + " did not call through to super.onPause()");
        }
    }
    
    void H() {
        this.U.a(android.arch.lifecycle.b.a.ON_STOP);
        if (this.t != null) {
            this.t.q();
        }
        this.b = 3;
        this.F = false;
        this.m();
        if (!this.F) {
            throw new z("Fragment " + this + " did not call through to super.onStop()");
        }
    }
    
    void I() {
        if (this.t != null) {
            this.t.r();
        }
        this.b = 2;
        if (this.M) {
            this.M = false;
            if (!this.N) {
                this.N = true;
                this.L = this.s.a(this.f, this.M, false);
            }
            if (this.L != null) {
                if (!this.s.j()) {
                    this.L.c();
                    return;
                }
                this.L.d();
            }
        }
    }
    
    void J() {
        if (this.t != null) {
            this.t.s();
        }
        this.b = 1;
        this.F = false;
        this.n();
        if (!this.F) {
            throw new z("Fragment " + this + " did not call through to super.onDestroyView()");
        }
        if (this.L != null) {
            this.L.f();
        }
        this.p = false;
    }
    
    void K() {
        this.U.a(android.arch.lifecycle.b.a.ON_DESTROY);
        if (this.t != null) {
            this.t.t();
        }
        this.b = 0;
        this.F = false;
        this.T = false;
        this.o();
        if (!this.F) {
            throw new z("Fragment " + this + " did not call through to super.onDestroy()");
        }
        this.t = null;
    }
    
    void L() {
        this.F = false;
        this.q();
        this.S = null;
        if (!this.F) {
            throw new z("Fragment " + this + " did not call through to super.onDetach()");
        }
        if (this.t != null) {
            if (!this.C) {
                throw new IllegalStateException("Child FragmentManager of " + this + " was not " + " destroyed and this fragment is not retaining instance");
            }
            this.t.t();
            this.t = null;
        }
    }
    
    int M() {
        if (this.O == null) {
            return 0;
        }
        return this.O.d;
    }
    
    int N() {
        if (this.O == null) {
            return 0;
        }
        return this.O.e;
    }
    
    int O() {
        if (this.O == null) {
            return 0;
        }
        return this.O.f;
    }
    
    y P() {
        if (this.O == null) {
            return null;
        }
        return this.O.g;
    }
    
    y Q() {
        if (this.O == null) {
            return null;
        }
        return this.O.h;
    }
    
    View R() {
        if (this.O == null) {
            return null;
        }
        return this.O.a;
    }
    
    Animator S() {
        if (this.O == null) {
            return null;
        }
        return this.O.b;
    }
    
    int T() {
        if (this.O == null) {
            return 0;
        }
        return this.O.c;
    }
    
    boolean U() {
        return this.O != null && this.O.i;
    }
    
    boolean V() {
        return this.O != null && this.O.k;
    }
    
    @Override
    public android.arch.lifecycle.b a() {
        return this.U;
    }
    
    h a(final String s) {
        if (s.equals(this.f)) {
            return this;
        }
        if (this.t != null) {
            return this.t.b(s);
        }
        return null;
    }
    
    public View a(final LayoutInflater layoutInflater, final ViewGroup viewGroup, final Bundle bundle) {
        return null;
    }
    
    public Animation a(final int n, final boolean b, final int n2) {
        return null;
    }
    
    void a(final int d) {
        if (this.O == null && d == 0) {
            return;
        }
        this.X().d = d;
    }
    
    void a(final int e, final int f) {
        if (this.O == null && e == 0 && f == 0) {
            return;
        }
        this.X();
        this.O.e = e;
        this.O.f = f;
    }
    
    public void a(final int n, final int n2, final Intent intent) {
    }
    
    final void a(final int e, final h h) {
        this.e = e;
        if (h != null) {
            this.f = h.f + ":" + this.e;
            return;
        }
        this.f = "android:fragment:" + this.e;
    }
    
    public void a(final int n, final String[] array, final int[] array2) {
    }
    
    void a(final Animator b) {
        this.X().b = b;
    }
    
    @Deprecated
    public void a(final Activity activity) {
        this.F = true;
    }
    
    @Deprecated
    public void a(final Activity activity, final AttributeSet set, final Bundle bundle) {
        this.F = true;
    }
    
    public void a(final Context context) {
        this.F = true;
        Activity f;
        if (this.s == null) {
            f = null;
        }
        else {
            f = this.s.f();
        }
        if (f != null) {
            this.F = false;
            this.a(f);
        }
    }
    
    public void a(final Context context, final AttributeSet set, final Bundle bundle) {
        this.F = true;
        Activity f;
        if (this.s == null) {
            f = null;
        }
        else {
            f = this.s.f();
        }
        if (f != null) {
            this.F = false;
            this.a(f, set, bundle);
        }
    }
    
    void a(final Configuration configuration) {
        this.onConfigurationChanged(configuration);
        if (this.t != null) {
            this.t.a(configuration);
        }
    }
    
    final void a(final Bundle bundle) {
        if (this.d != null) {
            this.I.restoreHierarchyState((SparseArray)this.d);
            this.d = null;
        }
        this.F = false;
        this.i(bundle);
        if (!this.F) {
            throw new z("Fragment " + this + " did not call through to super.onViewStateRestored()");
        }
    }
    
    void a(final c j) {
        this.X();
        if (j != this.O.j) {
            if (j != null && this.O.j != null) {
                throw new IllegalStateException("Trying to set a replacement startPostponedEnterTransition on " + this);
            }
            if (this.O.i) {
                this.O.j = j;
            }
            if (j != null) {
                j.b();
            }
        }
    }
    
    public void a(final h h) {
    }
    
    public void a(final Menu menu) {
    }
    
    public void a(final Menu menu, final MenuInflater menuInflater) {
    }
    
    void a(final View a) {
        this.X().a = a;
    }
    
    public void a(final View view, final Bundle bundle) {
    }
    
    public void a(final String s, final FileDescriptor fileDescriptor, final PrintWriter printWriter, final String[] array) {
        printWriter.print(s);
        printWriter.print("mFragmentId=#");
        printWriter.print(Integer.toHexString(this.w));
        printWriter.print(" mContainerId=#");
        printWriter.print(Integer.toHexString(this.x));
        printWriter.print(" mTag=");
        printWriter.println(this.y);
        printWriter.print(s);
        printWriter.print("mState=");
        printWriter.print(this.b);
        printWriter.print(" mIndex=");
        printWriter.print(this.e);
        printWriter.print(" mWho=");
        printWriter.print(this.f);
        printWriter.print(" mBackStackNesting=");
        printWriter.println(this.q);
        printWriter.print(s);
        printWriter.print("mAdded=");
        printWriter.print(this.k);
        printWriter.print(" mRemoving=");
        printWriter.print(this.l);
        printWriter.print(" mFromLayout=");
        printWriter.print(this.m);
        printWriter.print(" mInLayout=");
        printWriter.println(this.n);
        printWriter.print(s);
        printWriter.print("mHidden=");
        printWriter.print(this.z);
        printWriter.print(" mDetached=");
        printWriter.print(this.A);
        printWriter.print(" mMenuVisible=");
        printWriter.print(this.E);
        printWriter.print(" mHasMenu=");
        printWriter.println(this.D);
        printWriter.print(s);
        printWriter.print("mRetainInstance=");
        printWriter.print(this.B);
        printWriter.print(" mRetaining=");
        printWriter.print(this.C);
        printWriter.print(" mUserVisibleHint=");
        printWriter.println(this.K);
        if (this.r != null) {
            printWriter.print(s);
            printWriter.print("mFragmentManager=");
            printWriter.println(this.r);
        }
        if (this.s != null) {
            printWriter.print(s);
            printWriter.print("mHost=");
            printWriter.println(this.s);
        }
        if (this.v != null) {
            printWriter.print(s);
            printWriter.print("mParentFragment=");
            printWriter.println(this.v);
        }
        if (this.g != null) {
            printWriter.print(s);
            printWriter.print("mArguments=");
            printWriter.println(this.g);
        }
        if (this.c != null) {
            printWriter.print(s);
            printWriter.print("mSavedFragmentState=");
            printWriter.println(this.c);
        }
        if (this.d != null) {
            printWriter.print(s);
            printWriter.print("mSavedViewState=");
            printWriter.println(this.d);
        }
        if (this.h != null) {
            printWriter.print(s);
            printWriter.print("mTarget=");
            printWriter.print(this.h);
            printWriter.print(" mTargetRequestCode=");
            printWriter.println(this.j);
        }
        if (this.M() != 0) {
            printWriter.print(s);
            printWriter.print("mNextAnim=");
            printWriter.println(this.M());
        }
        if (this.G != null) {
            printWriter.print(s);
            printWriter.print("mContainer=");
            printWriter.println(this.G);
        }
        if (this.H != null) {
            printWriter.print(s);
            printWriter.print("mView=");
            printWriter.println(this.H);
        }
        if (this.I != null) {
            printWriter.print(s);
            printWriter.print("mInnerView=");
            printWriter.println(this.H);
        }
        if (this.R() != null) {
            printWriter.print(s);
            printWriter.print("mAnimatingAway=");
            printWriter.println(this.R());
            printWriter.print(s);
            printWriter.print("mStateAfterAnimating=");
            printWriter.println(this.T());
        }
        if (this.L != null) {
            printWriter.print(s);
            printWriter.println("Loader Manager:");
            this.L.a(s + "  ", fileDescriptor, printWriter, array);
        }
        if (this.t != null) {
            printWriter.print(s);
            printWriter.println("Child " + this.t + ":");
            this.t.a(s + "  ", fileDescriptor, printWriter, array);
        }
    }
    
    public void a(final boolean b) {
    }
    
    public boolean a(final MenuItem menuItem) {
        return false;
    }
    
    public Animator b(final int n, final boolean b, final int n2) {
        return null;
    }
    
    View b(final LayoutInflater layoutInflater, final ViewGroup viewGroup, final Bundle bundle) {
        if (this.t != null) {
            this.t.k();
        }
        this.p = true;
        return this.a(layoutInflater, viewGroup, bundle);
    }
    
    void b(final int c) {
        this.X().c = c;
    }
    
    public void b(final Bundle g) {
        if (this.e >= 0 && this.c()) {
            throw new IllegalStateException("Fragment already active and state has been saved");
        }
        this.g = g;
    }
    
    public void b(final Menu menu) {
    }
    
    public void b(final boolean b) {
    }
    
    final boolean b() {
        return this.q > 0;
    }
    
    boolean b(final Menu menu, final MenuInflater menuInflater) {
        boolean b = false;
        final boolean b2 = false;
        if (!this.z) {
            boolean b3 = b2;
            if (this.D) {
                b3 = b2;
                if (this.E) {
                    b3 = true;
                    this.a(menu, menuInflater);
                }
            }
            b = b3;
            if (this.t != null) {
                b = (b3 | this.t.a(menu, menuInflater));
            }
        }
        return b;
    }
    
    public boolean b(final MenuItem menuItem) {
        return false;
    }
    
    public LayoutInflater c(final Bundle bundle) {
        return this.e(bundle);
    }
    
    public void c(final boolean b) {
    }
    
    public final boolean c() {
        return this.r != null && this.r.c();
    }
    
    boolean c(final Menu menu) {
        boolean b = false;
        final boolean b2 = false;
        if (!this.z) {
            boolean b3 = b2;
            if (this.D) {
                b3 = b2;
                if (this.E) {
                    b3 = true;
                    this.a(menu);
                }
            }
            b = b3;
            if (this.t != null) {
                b = (b3 | this.t.a(menu));
            }
        }
        return b;
    }
    
    boolean c(final MenuItem menuItem) {
        return !this.z && ((this.D && this.E && this.a(menuItem)) || (this.t != null && this.t.a(menuItem)));
    }
    
    public final i d() {
        if (this.s == null) {
            return null;
        }
        return (i)this.s.f();
    }
    
    LayoutInflater d(final Bundle bundle) {
        return this.S = this.c(bundle);
    }
    
    void d(final Menu menu) {
        if (!this.z) {
            if (this.D && this.E) {
                this.b(menu);
            }
            if (this.t != null) {
                this.t.b(menu);
            }
        }
    }
    
    void d(final boolean b) {
        this.b(b);
        if (this.t != null) {
            this.t.a(b);
        }
    }
    
    boolean d(final MenuItem menuItem) {
        return !this.z && (this.b(menuItem) || (this.t != null && this.t.b(menuItem)));
    }
    
    public final Resources e() {
        if (this.s == null) {
            throw new IllegalStateException("Fragment " + this + " not attached to Activity");
        }
        return this.s.g().getResources();
    }
    
    @Deprecated
    public LayoutInflater e(final Bundle bundle) {
        if (this.s == null) {
            throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
        }
        final LayoutInflater b = this.s.b();
        this.g();
        android.support.v4.h.e.b(b, this.t.w());
        return b;
    }
    
    void e(final boolean b) {
        this.c(b);
        if (this.t != null) {
            this.t.b(b);
        }
    }
    
    @Override
    public final boolean equals(final Object o) {
        return super.equals(o);
    }
    
    public final m f() {
        return this.r;
    }
    
    public void f(final Bundle bundle) {
        this.F = true;
        this.g(bundle);
        if (this.t != null && !this.t.a(1)) {
            this.t.l();
        }
    }
    
    void f(final boolean k) {
        this.X().k = k;
    }
    
    public final m g() {
        if (this.t == null) {
            this.B();
            if (this.b >= 5) {
                this.t.o();
            }
            else if (this.b >= 4) {
                this.t.n();
            }
            else if (this.b >= 2) {
                this.t.m();
            }
            else if (this.b >= 1) {
                this.t.l();
            }
        }
        return this.t;
    }
    
    void g(final Bundle bundle) {
        if (bundle != null) {
            final Parcelable parcelable = bundle.getParcelable("android:support:fragments");
            if (parcelable != null) {
                if (this.t == null) {
                    this.B();
                }
                this.t.a(parcelable, this.u);
                this.u = null;
                this.t.l();
            }
        }
    }
    
    m h() {
        return this.t;
    }
    
    public void h(final Bundle bundle) {
        this.F = true;
    }
    
    @Override
    public final int hashCode() {
        return super.hashCode();
    }
    
    public View i() {
        return this.H;
    }
    
    public void i(final Bundle bundle) {
        this.F = true;
    }
    
    public void j() {
        this.F = true;
        if (!this.M) {
            this.M = true;
            if (!this.N) {
                this.N = true;
                this.L = this.s.a(this.f, this.M, false);
            }
            else if (this.L != null) {
                this.L.b();
            }
        }
    }
    
    public void j(final Bundle bundle) {
    }
    
    public void k() {
        this.F = true;
    }
    
    void k(final Bundle bundle) {
        if (this.t != null) {
            this.t.k();
        }
        this.b = 1;
        this.F = false;
        this.f(bundle);
        this.T = true;
        if (!this.F) {
            throw new z("Fragment " + this + " did not call through to super.onCreate()");
        }
        this.U.a(android.arch.lifecycle.b.a.ON_CREATE);
    }
    
    public void l() {
        this.F = true;
    }
    
    void l(final Bundle bundle) {
        if (this.t != null) {
            this.t.k();
        }
        this.b = 2;
        this.F = false;
        this.h(bundle);
        if (!this.F) {
            throw new z("Fragment " + this + " did not call through to super.onActivityCreated()");
        }
        if (this.t != null) {
            this.t.m();
        }
    }
    
    public void m() {
        this.F = true;
    }
    
    void m(final Bundle bundle) {
        this.j(bundle);
        if (this.t != null) {
            final Parcelable j = this.t.j();
            if (j != null) {
                bundle.putParcelable("android:support:fragments", j);
            }
        }
    }
    
    public void n() {
        this.F = true;
    }
    
    public void o() {
        this.F = true;
        if (!this.N) {
            this.N = true;
            this.L = this.s.a(this.f, this.M, false);
        }
        if (this.L != null) {
            this.L.h();
        }
    }
    
    public void onConfigurationChanged(final Configuration configuration) {
        this.F = true;
    }
    
    public void onCreateContextMenu(final ContextMenu contextMenu, final View view, final ContextMenu$ContextMenuInfo contextMenu$ContextMenuInfo) {
        this.d().onCreateContextMenu(contextMenu, view, contextMenu$ContextMenuInfo);
    }
    
    public void onLowMemory() {
        this.F = true;
    }
    
    void p() {
        this.e = -1;
        this.f = null;
        this.k = false;
        this.l = false;
        this.m = false;
        this.n = false;
        this.o = false;
        this.q = 0;
        this.r = null;
        this.t = null;
        this.s = null;
        this.w = 0;
        this.x = 0;
        this.y = null;
        this.z = false;
        this.A = false;
        this.C = false;
        this.L = null;
        this.M = false;
        this.N = false;
    }
    
    public void q() {
        this.F = true;
    }
    
    public void r() {
    }
    
    public Object s() {
        if (this.O == null) {
            return null;
        }
        return this.O.l;
    }
    
    public Object t() {
        if (this.O == null) {
            return null;
        }
        if (this.O.m == android.support.v4.a.h.a) {
            return this.s();
        }
        return this.O.m;
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder(128);
        android.support.v4.g.d.a(this, sb);
        if (this.e >= 0) {
            sb.append(" #");
            sb.append(this.e);
        }
        if (this.w != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.w));
        }
        if (this.y != null) {
            sb.append(" ");
            sb.append(this.y);
        }
        sb.append('}');
        return sb.toString();
    }
    
    public Object u() {
        if (this.O == null) {
            return null;
        }
        return this.O.n;
    }
    
    public Object v() {
        if (this.O == null) {
            return null;
        }
        if (this.O.o == android.support.v4.a.h.a) {
            return this.u();
        }
        return this.O.o;
    }
    
    public Object w() {
        if (this.O == null) {
            return null;
        }
        return this.O.p;
    }
    
    public Object x() {
        if (this.O == null) {
            return null;
        }
        if (this.O.q == android.support.v4.a.h.a) {
            return this.w();
        }
        return this.O.q;
    }
    
    public boolean y() {
        return this.O == null || this.O.s == null || this.O.s;
    }
    
    public boolean z() {
        return this.O == null || this.O.r == null || this.O.r;
    }
    
    static class a
    {
        View a;
        Animator b;
        int c;
        int d;
        int e;
        int f;
        y g;
        y h;
        boolean i;
        c j;
        boolean k;
        private Object l;
        private Object m;
        private Object n;
        private Object o;
        private Object p;
        private Object q;
        private Boolean r;
        private Boolean s;
        
        a() {
            this.l = null;
            this.m = h.a;
            this.n = null;
            this.o = h.a;
            this.p = null;
            this.q = h.a;
            this.g = null;
            this.h = null;
        }
    }
    
    public static class b extends RuntimeException
    {
        public b(final String s, final Exception ex) {
            super(s, ex);
        }
    }
    
    interface c
    {
        void a();
        
        void b();
    }
}
