// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v4.a;

import android.content.res.TypedArray;
import android.util.AttributeSet;
import java.util.Collections;
import android.view.MenuItem;
import android.view.MenuInflater;
import android.view.Menu;
import java.util.Arrays;
import android.content.res.Configuration;
import android.animation.AnimatorInflater;
import android.content.res.Resources$NotFoundException;
import android.view.animation.AnimationUtils;
import android.os.Looper;
import android.graphics.Paint;
import android.support.v4.h.p;
import android.os.Build$VERSION;
import android.animation.PropertyValuesHolder;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import java.util.Collection;
import java.io.FileDescriptor;
import java.io.Writer;
import java.io.PrintWriter;
import android.support.v4.g.e;
import java.util.Iterator;
import java.util.List;
import android.animation.Animator$AnimatorListener;
import android.animation.Animator;
import android.view.ViewGroup;
import android.animation.AnimatorListenerAdapter;
import android.util.Log;
import android.view.animation.Animation$AnimationListener;
import android.view.animation.ScaleAnimation;
import android.view.animation.AnimationSet;
import android.view.animation.AlphaAnimation;
import android.content.Context;
import android.support.v4.g.b;
import android.view.animation.Animation;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.os.Bundle;
import android.support.v4.g.i;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.ArrayList;
import android.os.Parcelable;
import android.util.SparseArray;
import java.lang.reflect.Field;
import android.view.animation.Interpolator;
import android.view.LayoutInflater$Factory2;

final class n extends m implements LayoutInflater$Factory2
{
    static final Interpolator E;
    static final Interpolator F;
    static final Interpolator G;
    static final Interpolator H;
    static boolean a;
    static Field q;
    SparseArray<Parcelable> A;
    ArrayList<g> B;
    o C;
    Runnable D;
    private final CopyOnWriteArrayList<i<m.a, Boolean>> I;
    ArrayList<f> b;
    boolean c;
    int d;
    final ArrayList<h> e;
    SparseArray<h> f;
    ArrayList<android.support.v4.a.c> g;
    ArrayList<h> h;
    ArrayList<android.support.v4.a.c> i;
    ArrayList<Integer> j;
    ArrayList<m.b> k;
    int l;
    l m;
    j n;
    h o;
    h p;
    boolean r;
    boolean s;
    boolean t;
    String u;
    boolean v;
    ArrayList<android.support.v4.a.c> w;
    ArrayList<Boolean> x;
    ArrayList<h> y;
    Bundle z;
    
    static {
        n.a = false;
        n.q = null;
        E = (Interpolator)new DecelerateInterpolator(2.5f);
        F = (Interpolator)new DecelerateInterpolator(1.5f);
        G = (Interpolator)new AccelerateInterpolator(2.5f);
        H = (Interpolator)new AccelerateInterpolator(1.5f);
    }
    
    n() {
        this.d = 0;
        this.e = new ArrayList<h>();
        this.I = new CopyOnWriteArrayList<i<m.a, Boolean>>();
        this.l = 0;
        this.z = null;
        this.A = null;
        this.D = new Runnable() {
            @Override
            public void run() {
                android.support.v4.a.n.this.e();
            }
        };
    }
    
    private void A() {
        if (this.B != null) {
            while (!this.B.isEmpty()) {
                this.B.remove(0).d();
            }
        }
    }
    
    private void B() {
        int size;
        if (this.f == null) {
            size = 0;
        }
        else {
            size = this.f.size();
        }
        for (int i = 0; i < size; ++i) {
            final h h = (h)this.f.valueAt(i);
            if (h != null) {
                if (h.R() != null) {
                    final int t = h.T();
                    final View r = h.R();
                    h.a((View)null);
                    final Animation animation = r.getAnimation();
                    if (animation != null) {
                        animation.cancel();
                        r.clearAnimation();
                    }
                    this.a(h, t, 0, 0, false);
                }
                else if (h.S() != null) {
                    h.S().end();
                }
            }
        }
    }
    
    private void C() {
        if (this.f != null) {
            for (int i = this.f.size() - 1; i >= 0; --i) {
                if (this.f.valueAt(i) == null) {
                    this.f.delete(this.f.keyAt(i));
                }
            }
        }
    }
    
    private int a(final ArrayList<android.support.v4.a.c> list, final ArrayList<Boolean> list2, final int n, final int n2, final android.support.v4.g.b<h> b) {
        int i = n2 - 1;
        int n3 = n2;
        while (i >= n) {
            final android.support.v4.a.c c = list.get(i);
            final boolean booleanValue = list2.get(i);
            int n4;
            if (c.c() && !c.a(list, i + 1, n2)) {
                n4 = 1;
            }
            else {
                n4 = 0;
            }
            if (n4 != 0) {
                if (this.B == null) {
                    this.B = new ArrayList<g>();
                }
                final g g = new g(c, booleanValue);
                this.B.add(g);
                c.a(g);
                if (booleanValue) {
                    c.b();
                }
                else {
                    c.a(false);
                }
                --n3;
                if (i != n3) {
                    list.remove(i);
                    list.add(n3, c);
                }
                this.b(b);
            }
            --i;
        }
        return n3;
    }
    
    static c a(final Context context, final float n, final float n2) {
        final AlphaAnimation alphaAnimation = new AlphaAnimation(n, n2);
        alphaAnimation.setInterpolator(n.F);
        alphaAnimation.setDuration(220L);
        return new c((Animation)alphaAnimation);
    }
    
    static c a(final Context context, final float n, final float n2, final float n3, final float n4) {
        final AnimationSet set = new AnimationSet(false);
        final ScaleAnimation scaleAnimation = new ScaleAnimation(n, n2, n, n2, 1, 0.5f, 1, 0.5f);
        scaleAnimation.setInterpolator(n.E);
        scaleAnimation.setDuration(220L);
        set.addAnimation((Animation)scaleAnimation);
        final AlphaAnimation alphaAnimation = new AlphaAnimation(n3, n4);
        alphaAnimation.setInterpolator(n.F);
        alphaAnimation.setDuration(220L);
        set.addAnimation((Animation)alphaAnimation);
        return new c((Animation)set);
    }
    
    private static Animation$AnimationListener a(final Animation animation) {
        try {
            if (n.q == null) {
                (n.q = Animation.class.getDeclaredField("mListener")).setAccessible(true);
            }
            return (Animation$AnimationListener)n.q.get(animation);
        }
        catch (NoSuchFieldException ex) {
            Log.e("FragmentManager", "No field with the name mListener is found in Animation class", (Throwable)ex);
            return null;
        }
        catch (IllegalAccessException ex2) {
            Log.e("FragmentManager", "Cannot access Animation's mListener field", (Throwable)ex2);
            return null;
        }
    }
    
    private void a(final android.support.v4.a.c c, final boolean b, final boolean b2, final boolean b3) {
        if (b) {
            c.a(b3);
        }
        else {
            c.b();
        }
        final ArrayList<android.support.v4.a.c> list = new ArrayList<android.support.v4.a.c>(1);
        final ArrayList<Boolean> list2 = new ArrayList<Boolean>(1);
        list.add(c);
        list2.add(b);
        if (b2) {
            android.support.v4.a.s.a(this, list, list2, 0, 1, true);
        }
        if (b3) {
            this.a(this.l, true);
        }
        if (this.f != null) {
            for (int size = this.f.size(), i = 0; i < size; ++i) {
                final h h = (h)this.f.valueAt(i);
                if (h != null && h.H != null && h.P && c.b(h.x)) {
                    if (h.R > 0.0f) {
                        h.H.setAlpha(h.R);
                    }
                    if (b3) {
                        h.R = 0.0f;
                    }
                    else {
                        h.R = -1.0f;
                        h.P = false;
                    }
                }
            }
        }
    }
    
    private void a(final h h, final c c, final int n) {
        final View h2 = h.H;
        h.b(n);
        if (c.a != null) {
            final Animation a = c.a;
            h.a(h.H);
            a.setAnimationListener((Animation$AnimationListener)new b(a(a)) {
                @Override
                public void onAnimationEnd(final Animation animation) {
                    super.onAnimationEnd(animation);
                    if (h.R() != null) {
                        h.a((View)null);
                        android.support.v4.a.n.this.a(h, h.T(), 0, 0, false);
                    }
                }
            });
            b(h2, c);
            h.H.startAnimation(a);
            return;
        }
        final Animator b = c.b;
        h.a(c.b);
        final ViewGroup g = h.G;
        if (g != null) {
            g.startViewTransition(h2);
        }
        b.addListener((Animator$AnimatorListener)new AnimatorListenerAdapter() {
            public void onAnimationEnd(final Animator animator) {
                if (g != null) {
                    g.endViewTransition(h2);
                }
                if (h.S() != null) {
                    h.a((Animator)null);
                    android.support.v4.a.n.this.a(h, h.T(), 0, 0, false);
                }
            }
        });
        b.setTarget((Object)h.H);
        b(h.H, c);
        b.start();
    }
    
    private static void a(final o o) {
        if (o != null) {
            final List<h> a = o.a();
            if (a != null) {
                final Iterator<h> iterator = a.iterator();
                while (iterator.hasNext()) {
                    iterator.next().C = true;
                }
            }
            final List<o> b = o.b();
            if (b != null) {
                final Iterator<o> iterator2 = b.iterator();
                while (iterator2.hasNext()) {
                    a(iterator2.next());
                }
            }
        }
    }
    
    private void a(final android.support.v4.g.b<h> b) {
        for (int size = b.size(), i = 0; i < size; ++i) {
            final h h = b.b(i);
            if (!h.k) {
                final View j = h.i();
                h.R = j.getAlpha();
                j.setAlpha(0.0f);
            }
        }
    }
    
    private void a(final RuntimeException ex) {
        Log.e("FragmentManager", ex.getMessage());
        Log.e("FragmentManager", "Activity state:");
        final PrintWriter printWriter = new PrintWriter(new android.support.v4.g.e("FragmentManager"));
        while (true) {
            Label_0079: {
                if (this.m == null) {
                    break Label_0079;
                }
                try {
                    this.m.a("  ", null, printWriter, new String[0]);
                    throw ex;
                }
                catch (Exception ex2) {
                    Log.e("FragmentManager", "Failed dumping state", (Throwable)ex2);
                    throw ex;
                }
                try {
                    this.a("  ", null, printWriter, new String[0]);
                    continue;
                }
                catch (Exception ex3) {
                    Log.e("FragmentManager", "Failed dumping state", (Throwable)ex3);
                    continue;
                }
            }
            continue;
        }
    }
    
    private void a(final ArrayList<android.support.v4.a.c> list, final ArrayList<Boolean> list2) {
        int size;
        if (this.B == null) {
            size = 0;
        }
        else {
            size = this.B.size();
        }
        int i = 0;
    Label_0081_Outer:
        while (i < size) {
            final g g = this.B.get(i);
            while (true) {
                Label_0101: {
                    if (list == null || g.a) {
                        break Label_0101;
                    }
                    final int index = list.indexOf(g.b);
                    if (index == -1 || !list2.get(index)) {
                        break Label_0101;
                    }
                    g.e();
                    ++i;
                    continue Label_0081_Outer;
                }
                int n = 0;
                int n2 = 0;
                Label_0226: {
                    if (!g.c()) {
                        n = i;
                        n2 = size;
                        if (list == null) {
                            break Label_0226;
                        }
                        n = i;
                        n2 = size;
                        if (!g.b.a(list, 0, list.size())) {
                            break Label_0226;
                        }
                    }
                    this.B.remove(i);
                    n = i - 1;
                    n2 = size - 1;
                    if (list != null && !g.a) {
                        final int index2 = list.indexOf(g.b);
                        if (index2 != -1 && list2.get(index2)) {
                            g.e();
                            i = n;
                            size = n2;
                            continue;
                        }
                    }
                    g.d();
                }
                i = n;
                size = n2;
                continue;
            }
        }
    }
    
    private void a(final ArrayList<android.support.v4.a.c> list, final ArrayList<Boolean> list2, final int n, final int n2) {
        final boolean u = list.get(n).u;
        if (this.y == null) {
            this.y = new ArrayList<h>();
        }
        else {
            this.y.clear();
        }
        this.y.addAll(this.e);
        h h = this.v();
        int i = n;
        int n3 = 0;
        while (i < n2) {
            final android.support.v4.a.c c = list.get(i);
            if (!list2.get(i)) {
                h = c.a(this.y, h);
            }
            else {
                h = c.b(this.y, h);
            }
            if (n3 != 0 || c.j) {
                n3 = 1;
            }
            else {
                n3 = 0;
            }
            ++i;
        }
        this.y.clear();
        if (!u) {
            android.support.v4.a.s.a(this, list, list2, n, n2, false);
        }
        b(list, list2, n, n2);
        int a;
        if (u) {
            final android.support.v4.g.b<h> b = new android.support.v4.g.b<h>();
            this.b(b);
            a = this.a(list, list2, n, n2, b);
            this.a(b);
        }
        else {
            a = n2;
        }
        int j = n;
        if (a != n) {
            j = n;
            if (u) {
                android.support.v4.a.s.a(this, list, list2, n, a, true);
                this.a(this.l, true);
                j = n;
            }
        }
        while (j < n2) {
            final android.support.v4.a.c c2 = list.get(j);
            if (list2.get(j) && c2.n >= 0) {
                this.c(c2.n);
                c2.n = -1;
            }
            c2.a();
            ++j;
        }
        if (n3 != 0) {
            this.g();
        }
    }
    
    static boolean a(final Animator animator) {
        if (animator != null) {
            if (animator instanceof ValueAnimator) {
                final PropertyValuesHolder[] values = ((ValueAnimator)animator).getValues();
                for (int i = 0; i < values.length; ++i) {
                    if ("alpha".equals(values[i].getPropertyName())) {
                        return true;
                    }
                }
            }
            else if (animator instanceof AnimatorSet) {
                final ArrayList childAnimations = ((AnimatorSet)animator).getChildAnimations();
                for (int j = 0; j < childAnimations.size(); ++j) {
                    if (a((Animator)childAnimations.get(j))) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
    
    static boolean a(final c c) {
        final boolean b = false;
        boolean b2;
        if (c.a instanceof AlphaAnimation) {
            b2 = true;
        }
        else {
            if (c.a instanceof AnimationSet) {
                final List animations = ((AnimationSet)c.a).getAnimations();
                int n = 0;
                while (true) {
                    b2 = b;
                    if (n >= animations.size()) {
                        return b2;
                    }
                    if (animations.get(n) instanceof AlphaAnimation) {
                        break;
                    }
                    ++n;
                }
                return true;
            }
            return a(c.b);
        }
        return b2;
    }
    
    static boolean a(final View view, final c c) {
        return view != null && c != null && Build$VERSION.SDK_INT >= 19 && view.getLayerType() == 0 && p.h(view) && a(c);
    }
    
    private boolean a(final String s, final int n, final int n2) {
        this.e();
        this.c(true);
        if (this.p != null && n < 0 && s == null) {
            final m h = this.p.h();
            if (h != null && h.a()) {
                return true;
            }
        }
        final boolean a = this.a(this.w, this.x, s, n, n2);
        Label_0092: {
            if (!a) {
                break Label_0092;
            }
            this.c = true;
            try {
                this.b(this.w, this.x);
                this.z();
                this.f();
                this.C();
                return a;
            }
            finally {
                this.z();
            }
        }
    }
    
    public static int b(final int n, final boolean b) {
        switch (n) {
            default: {
                return -1;
            }
            case 4097: {
                if (b) {
                    return 1;
                }
                return 2;
            }
            case 8194: {
                if (b) {
                    return 3;
                }
                return 4;
            }
            case 4099: {
                if (b) {
                    return 5;
                }
                return 6;
            }
        }
    }
    
    private void b(final android.support.v4.g.b<h> b) {
        if (this.l >= 1) {
            final int min = Math.min(this.l, 4);
            for (int size = this.e.size(), i = 0; i < size; ++i) {
                final h h = this.e.get(i);
                if (h.b < min) {
                    this.a(h, min, h.M(), h.N(), false);
                    if (h.H != null && !h.z && h.P) {
                        b.add(h);
                    }
                }
            }
        }
    }
    
    private static void b(final View view, final c c) {
        if (view == null || c == null || !a(view, c)) {
            return;
        }
        if (c.b != null) {
            c.b.addListener((Animator$AnimatorListener)new d(view));
            return;
        }
        final Animation$AnimationListener a = a(c.a);
        view.setLayerType(2, (Paint)null);
        c.a.setAnimationListener((Animation$AnimationListener)new a(view, a));
    }
    
    private void b(final ArrayList<android.support.v4.a.c> list, final ArrayList<Boolean> list2) {
        int i = 0;
        if (list != null && !list.isEmpty()) {
            if (list2 == null || list.size() != list2.size()) {
                throw new IllegalStateException("Internal error with the back stack records");
            }
            this.a(list, list2);
            final int size = list.size();
            int n = 0;
            while (i < size) {
                if (!list.get(i).u) {
                    if (n != i) {
                        this.a(list, list2, n, i);
                    }
                    int n3;
                    int n2 = n3 = i + 1;
                    if (list2.get(i)) {
                        while ((n3 = n2) < size) {
                            n3 = n2;
                            if (!list2.get(n2)) {
                                break;
                            }
                            n3 = n2;
                            if (list.get(n2).u) {
                                break;
                            }
                            ++n2;
                        }
                    }
                    this.a(list, list2, i, n3);
                    final int n4 = n3;
                    final int n5 = n3 - 1;
                    n = n4;
                    i = n5;
                }
                ++i;
            }
            if (n != size) {
                this.a(list, list2, n, size);
            }
        }
    }
    
    private static void b(final ArrayList<android.support.v4.a.c> list, final ArrayList<Boolean> list2, int i, final int n) {
        while (i < n) {
            final android.support.v4.a.c c = list.get(i);
            if (list2.get(i)) {
                c.a(-1);
                c.a(i == n - 1);
            }
            else {
                c.a(1);
                c.b();
            }
            ++i;
        }
    }
    
    private void c(final boolean b) {
        if (this.c) {
            throw new IllegalStateException("FragmentManager is already executing transactions");
        }
        if (Looper.myLooper() != this.m.h().getLooper()) {
            throw new IllegalStateException("Must be called from main thread of fragment host");
        }
        if (!b) {
            this.x();
        }
        if (this.w == null) {
            this.w = new ArrayList<android.support.v4.a.c>();
            this.x = new ArrayList<Boolean>();
        }
        this.c = true;
        try {
            this.a(null, (ArrayList<Boolean>)null);
        }
        finally {
            this.c = false;
        }
    }
    
    private boolean c(final ArrayList<android.support.v4.a.c> list, final ArrayList<Boolean> list2) {
        synchronized (this) {
            if (this.b == null || this.b.size() == 0) {
                return false;
            }
            final int size = this.b.size();
            int i = 0;
            boolean b = false;
            while (i < size) {
                b |= this.b.get(i).a(list, list2);
                ++i;
            }
            this.b.clear();
            this.m.h().removeCallbacks(this.D);
            return b;
        }
    }
    
    public static int d(final int n) {
        switch (n) {
            default: {
                return 0;
            }
            case 4097: {
                return 8194;
            }
            case 8194: {
                return 4097;
            }
            case 4099: {
                return 4099;
            }
        }
    }
    
    private void e(final int n) {
        try {
            this.c = true;
            this.a(n, false);
            this.c = false;
            this.e();
        }
        finally {
            this.c = false;
        }
    }
    
    private h p(h h) {
        final ViewGroup g = h.G;
        final View h2 = h.H;
        if (g != null && h2 != null) {
            for (int i = this.e.indexOf(h) - 1; i >= 0; --i) {
                final h h3 = this.e.get(i);
                if (h3.G == g) {
                    h = h3;
                    if (h3.H != null) {
                        return h;
                    }
                }
            }
            return null;
        }
        h = null;
        return h;
    }
    
    private void x() {
        if (this.s) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
        if (this.u != null) {
            throw new IllegalStateException("Can not perform this action inside of " + this.u);
        }
    }
    
    private void y() {
    Label_0081_Outer:
        while (true) {
            int n = 1;
        Label_0081:
            while (true) {
            Label_0097:
                while (true) {
                    Label_0092: {
                        while (true) {
                            final int n2;
                            synchronized (this) {
                                if (this.B == null || this.B.isEmpty()) {
                                    break Label_0092;
                                }
                                n2 = 1;
                                if (this.b != null && this.b.size() == 1) {
                                    break Label_0081;
                                }
                                break Label_0097;
                                this.m.h().removeCallbacks(this.D);
                                this.m.h().post(this.D);
                                return;
                            }
                            if (n2 == 0 && n == 0) {
                                return;
                            }
                            continue;
                        }
                    }
                    int n2 = 0;
                    continue Label_0081_Outer;
                }
                n = 0;
                continue Label_0081;
            }
        }
    }
    
    private void z() {
        this.c = false;
        this.x.clear();
        this.w.clear();
    }
    
    public h a(final Bundle bundle, final String s) {
        final int int1 = bundle.getInt(s, -1);
        h h;
        if (int1 == -1) {
            h = null;
        }
        else {
            final h h2 = (h)this.f.get(int1);
            if ((h = h2) == null) {
                this.a(new IllegalStateException("Fragment no longer exists for key " + s + ": index " + int1));
                return h2;
            }
        }
        return h;
    }
    
    public h a(final String s) {
        if (s != null) {
            for (int i = this.e.size() - 1; i >= 0; --i) {
                final h h = this.e.get(i);
                if (h != null && s.equals(h.y)) {
                    return h;
                }
            }
        }
        Label_0054: {
            break Label_0054;
        }
        if (this.f != null && s != null) {
            for (int j = this.f.size() - 1; j >= 0; --j) {
                final h h2 = (h)this.f.valueAt(j);
                if (h2 != null) {
                    final h h = h2;
                    if (s.equals(h2.y)) {
                        return h;
                    }
                }
            }
        }
        return null;
    }
    
    c a(final h h, int n, final boolean b, final int n2) {
        final int m = h.M();
        final Animation a = h.a(n, b, m);
        if (a != null) {
            return new c(a);
        }
        final Animator b2 = h.b(n, b, m);
        if (b2 != null) {
            return new c(b2);
        }
        if (m != 0) {
            if (!"anim".equals(this.m.g().getResources().getResourceTypeName(m))) {
                goto Label_0123;
            }
            try {
                final Animation loadAnimation = AnimationUtils.loadAnimation(this.m.g(), m);
                if (loadAnimation != null) {
                    return new c(loadAnimation);
                }
                goto Label_0120;
            }
            catch (Resources$NotFoundException ex) {
                throw ex;
            }
            catch (RuntimeException ex2) {
                goto Label_0123;
            }
            try {
                final Animator loadAnimator = AnimatorInflater.loadAnimator(this.m.g(), m);
                if (loadAnimator != null) {
                    return new c(loadAnimator);
                }
            }
            catch (RuntimeException ex3) {
                final Animation loadAnimation2 = AnimationUtils.loadAnimation(this.m.g(), m);
                if (loadAnimation2 != null) {
                    return new c(loadAnimation2);
                }
            }
        }
        if (n == 0) {
            return null;
        }
        n = b(n, b);
        if (n < 0) {
            return null;
        }
        switch (n) {
            default: {
                n = n2;
                if (n2 == 0) {
                    n = n2;
                    if (this.m.d()) {
                        n = this.m.e();
                    }
                }
                if (n == 0) {
                    return null;
                }
                return null;
            }
            case 1: {
                return a(this.m.g(), 1.125f, 1.0f, 0.0f, 1.0f);
            }
            case 2: {
                return a(this.m.g(), 1.0f, 0.975f, 1.0f, 0.0f);
            }
            case 3: {
                return a(this.m.g(), 0.975f, 1.0f, 0.0f, 1.0f);
            }
            case 4: {
                return a(this.m.g(), 1.0f, 1.075f, 1.0f, 0.0f);
            }
            case 5: {
                return a(this.m.g(), 0.0f, 1.0f);
            }
            case 6: {
                return a(this.m.g(), 1.0f, 0.0f);
            }
        }
    }
    
    public void a(final int n, final android.support.v4.a.c c) {
        synchronized (this) {
            if (this.i == null) {
                this.i = new ArrayList<android.support.v4.a.c>();
            }
            int i;
            if (n < (i = this.i.size())) {
                if (n.a) {
                    Log.v("FragmentManager", "Setting back stack index " + n + " to " + c);
                }
                this.i.set(n, c);
            }
            else {
                while (i < n) {
                    this.i.add(null);
                    if (this.j == null) {
                        this.j = new ArrayList<Integer>();
                    }
                    if (n.a) {
                        Log.v("FragmentManager", "Adding available back stack index " + i);
                    }
                    this.j.add(i);
                    ++i;
                }
                if (n.a) {
                    Log.v("FragmentManager", "Adding back stack index " + n + " with " + c);
                }
                this.i.add(c);
            }
        }
    }
    
    void a(int l, final boolean b) {
        if (this.m == null && l != 0) {
            throw new IllegalStateException("No activity");
        }
        if (b || l != this.l) {
            this.l = l;
            if (this.f != null) {
                final int size = this.e.size();
                int i = 0;
                l = 0;
                while (i < size) {
                    final h h = this.e.get(i);
                    this.e(h);
                    if (h.L != null) {
                        l |= (h.L.a() ? 1 : 0);
                    }
                    ++i;
                }
                final int size2 = this.f.size();
                int j = 0;
            Label_0195_Outer:
                while (j < size2) {
                    final h h2 = (h)this.f.valueAt(j);
                    if (h2 != null && (h2.l || h2.A) && !h2.P) {
                        this.e(h2);
                        if (h2.L != null) {
                            l |= (h2.L.a() ? 1 : 0);
                        }
                    }
                    while (true) {
                        ++j;
                        continue Label_0195_Outer;
                        continue;
                    }
                }
                if (l == 0) {
                    this.d();
                }
                if (this.r && this.m != null && this.l == 5) {
                    this.m.c();
                    this.r = false;
                }
            }
        }
    }
    
    public void a(final Configuration configuration) {
        for (int i = 0; i < this.e.size(); ++i) {
            final h h = this.e.get(i);
            if (h != null) {
                h.a(configuration);
            }
        }
    }
    
    public void a(final Bundle bundle, final String s, final h h) {
        if (h.e < 0) {
            this.a(new IllegalStateException("Fragment " + h + " is not currently in the FragmentManager"));
        }
        bundle.putInt(s, h.e);
    }
    
    void a(final Parcelable parcelable, final o o) {
        if (parcelable != null) {
            final android.support.v4.a.p p2 = (android.support.v4.a.p)parcelable;
            if (p2.a != null) {
                List<o> b;
                if (o != null) {
                    final List<h> a = o.a();
                    b = o.b();
                    int size;
                    if (a != null) {
                        size = a.size();
                    }
                    else {
                        size = 0;
                    }
                    for (int i = 0; i < size; ++i) {
                        final h l = a.get(i);
                        if (android.support.v4.a.n.a) {
                            Log.v("FragmentManager", "restoreAllState: re-attaching retained " + l);
                        }
                        int n;
                        for (n = 0; n < p2.a.length && p2.a[n].b != l.e; ++n) {}
                        if (n == p2.a.length) {
                            this.a(new IllegalStateException("Could not find active fragment with index " + l.e));
                        }
                        final q q = p2.a[n];
                        q.l = l;
                        l.d = null;
                        l.q = 0;
                        l.n = false;
                        l.k = false;
                        l.h = null;
                        if (q.k != null) {
                            q.k.setClassLoader(this.m.g().getClassLoader());
                            l.d = (SparseArray<Parcelable>)q.k.getSparseParcelableArray("android:view_state");
                            l.c = q.k;
                        }
                    }
                }
                else {
                    b = null;
                }
                this.f = (SparseArray<h>)new SparseArray(p2.a.length);
                for (int j = 0; j < p2.a.length; ++j) {
                    final q q2 = p2.a[j];
                    if (q2 != null) {
                        o o2;
                        if (b != null && j < b.size()) {
                            o2 = b.get(j);
                        }
                        else {
                            o2 = null;
                        }
                        final h a2 = q2.a(this.m, this.n, this.o, o2);
                        if (android.support.v4.a.n.a) {
                            Log.v("FragmentManager", "restoreAllState: active #" + j + ": " + a2);
                        }
                        this.f.put(a2.e, (Object)a2);
                        q2.l = null;
                    }
                }
                if (o != null) {
                    final List<h> a3 = o.a();
                    int size2;
                    if (a3 != null) {
                        size2 = a3.size();
                    }
                    else {
                        size2 = 0;
                    }
                    for (int k = 0; k < size2; ++k) {
                        final h h = a3.get(k);
                        if (h.i >= 0) {
                            h.h = (h)this.f.get(h.i);
                            if (h.h == null) {
                                Log.w("FragmentManager", "Re-attaching retained fragment " + h + " target no longer exists: " + h.i);
                            }
                        }
                    }
                }
                this.e.clear();
                if (p2.b != null) {
                    int n2 = 0;
                    while (n2 < p2.b.length) {
                        final h h2 = (h)this.f.get(p2.b[n2]);
                        if (h2 == null) {
                            this.a(new IllegalStateException("No instantiated fragment for index #" + p2.b[n2]));
                        }
                        h2.k = true;
                        if (android.support.v4.a.n.a) {
                            Log.v("FragmentManager", "restoreAllState: added #" + n2 + ": " + h2);
                        }
                        if (this.e.contains(h2)) {
                            throw new IllegalStateException("Already added!");
                        }
                        synchronized (this.e) {
                            this.e.add(h2);
                            // monitorexit(this.e)
                            ++n2;
                            continue;
                        }
                        break;
                    }
                }
                if (p2.c != null) {
                    this.g = new ArrayList<android.support.v4.a.c>(p2.c.length);
                    for (int n3 = 0; n3 < p2.c.length; ++n3) {
                        final android.support.v4.a.c a4 = p2.c[n3].a(this);
                        if (android.support.v4.a.n.a) {
                            Log.v("FragmentManager", "restoreAllState: back stack #" + n3 + " (index " + a4.n + "): " + a4);
                            final PrintWriter printWriter = new PrintWriter(new android.support.v4.g.e("FragmentManager"));
                            a4.a("  ", printWriter, false);
                            printWriter.close();
                        }
                        this.g.add(a4);
                        if (a4.n >= 0) {
                            this.a(a4.n, a4);
                        }
                    }
                }
                else {
                    this.g = null;
                }
                if (p2.d >= 0) {
                    this.p = (h)this.f.get(p2.d);
                }
                this.d = p2.e;
            }
        }
    }
    
    void a(final android.support.v4.a.c c) {
        if (this.g == null) {
            this.g = new ArrayList<android.support.v4.a.c>();
        }
        this.g.add(c);
    }
    
    public void a(final h h) {
        if (h.J) {
            if (!this.c) {
                h.J = false;
                this.a(h, this.l, 0, 0, false);
                return;
            }
            this.v = true;
        }
    }
    
    void a(final h h, int n, int n2, int n3, final boolean b) {
        final boolean b2 = true;
        int n4 = 0;
        Label_0031: {
            if (h.k) {
                n4 = n;
                if (!h.A) {
                    break Label_0031;
                }
            }
            if ((n4 = n) > 1) {
                n4 = 1;
            }
        }
        int b3 = n4;
        if (h.l && (b3 = n4) > h.b) {
            if (h.b == 0 && h.b()) {
                b3 = 1;
            }
            else {
                b3 = h.b;
            }
        }
        n = b3;
        if (h.J) {
            n = b3;
            if (h.b < 4 && (n = b3) > 3) {
                n = 3;
            }
        }
        int b4 = 0;
        Label_0223: {
            if (h.b <= n) {
                if (!h.m || h.n) {
                    if (h.R() != null || h.S() != null) {
                        h.a((View)null);
                        h.a((Animator)null);
                        this.a(h, h.T(), 0, 0, true);
                    }
                    n3 = n;
                    int n5 = n;
                    int n6 = n;
                    n2 = n;
                Label_1287_Outer:
                    while (true) {
                        Label_0736: {
                            while (true) {
                                n r;
                                ViewGroup g;
                                ViewGroup viewGroup;
                                String resourceName;
                                boolean p5;
                                Label_1093:Label_1154_Outer:
                                while (true) {
                                Label_1209_Outer:
                                    while (true) {
                                        while (true) {
                                            switch (h.b) {
                                                default: {
                                                    b4 = n;
                                                    break Label_0223;
                                                }
                                                case 0: {
                                                    n3 = n;
                                                    if (n <= 0) {
                                                        break Label_0741;
                                                    }
                                                    if (n.a) {
                                                        Log.v("FragmentManager", "moveto CREATED: " + h);
                                                    }
                                                    n3 = n;
                                                    if (h.c != null) {
                                                        h.c.setClassLoader(this.m.g().getClassLoader());
                                                        h.d = (SparseArray<Parcelable>)h.c.getSparseParcelableArray("android:view_state");
                                                        h.h = this.a(h.c, "android:target_state");
                                                        if (h.h != null) {
                                                            h.j = h.c.getInt("android:target_req_state", 0);
                                                        }
                                                        h.K = h.c.getBoolean("android:user_visible_hint", true);
                                                        n3 = n;
                                                        if (!h.K) {
                                                            h.J = true;
                                                            if ((n3 = n) > 3) {
                                                                n3 = 3;
                                                            }
                                                        }
                                                    }
                                                    h.s = this.m;
                                                    h.v = this.o;
                                                    if (this.o != null) {
                                                        r = this.o.t;
                                                    }
                                                    else {
                                                        r = this.m.i();
                                                    }
                                                    h.r = r;
                                                    if (h.h != null) {
                                                        if (this.f.get(h.h.e) != h.h) {
                                                            throw new IllegalStateException("Fragment " + h + " declared target fragment " + h.h + " that does not belong to this FragmentManager!");
                                                        }
                                                        if (h.h.b < 1) {
                                                            this.a(h.h, 1, 0, 0, true);
                                                        }
                                                    }
                                                    this.a(h, this.m.g(), false);
                                                    h.F = false;
                                                    h.a(this.m.g());
                                                    if (!h.F) {
                                                        throw new z("Fragment " + h + " did not call through to super.onAttach()");
                                                    }
                                                    if (h.v == null) {
                                                        this.m.b(h);
                                                        break;
                                                    }
                                                    break Label_1093;
                                                }
                                                case 1: {
                                                    this.c(h);
                                                    if ((n5 = n3) <= 1) {
                                                        break Label_1093;
                                                    }
                                                    if (n.a) {
                                                        Log.v("FragmentManager", "moveto ACTIVITY_CREATED: " + h);
                                                    }
                                                    if (h.m) {
                                                        break Label_1093;
                                                    }
                                                    if (h.x == 0) {
                                                        g = null;
                                                        break Label_1209_Outer;
                                                    }
                                                    if (h.x == -1) {
                                                        this.a(new IllegalArgumentException("Cannot create fragment " + h + " for a container view with no id"));
                                                    }
                                                    viewGroup = (ViewGroup)this.n.a(h.x);
                                                    if ((g = viewGroup) != null) {
                                                        break Label_1209_Outer;
                                                    }
                                                    g = viewGroup;
                                                    if (!h.o) {
                                                        break Label_1209_Outer;
                                                    }
                                                    break Label_1209_Outer;
                                                }
                                                case 2: {
                                                    break Label_1093;
                                                Label_1087_Outer:
                                                    while (true) {
                                                        Label_1319: {
                                                            while (true) {
                                                            Label_1313:
                                                                while (true) {
                                                                    try {
                                                                        resourceName = h.e().getResourceName(h.x);
                                                                        this.a(new IllegalArgumentException("No view found for id 0x" + Integer.toHexString(h.x) + " (" + resourceName + ") for fragment " + h));
                                                                        g = viewGroup;
                                                                        h.G = g;
                                                                        h.H = h.b(h.d(h.c), g, h.c);
                                                                        if (h.H == null) {
                                                                            break Label_1319;
                                                                        }
                                                                        h.I = h.H;
                                                                        h.H.setSaveFromParentEnabled(false);
                                                                        if (g != null) {
                                                                            g.addView(h.H);
                                                                        }
                                                                        if (h.z) {
                                                                            h.H.setVisibility(8);
                                                                        }
                                                                        h.a(h.H, h.c);
                                                                        this.a(h, h.H, h.c, false);
                                                                        if (h.H.getVisibility() != 0 || h.G == null) {
                                                                            break Label_1313;
                                                                        }
                                                                        p5 = b2;
                                                                        h.P = p5;
                                                                        h.l(h.c);
                                                                        this.c(h, h.c, false);
                                                                        if (h.H != null) {
                                                                            h.a(h.c);
                                                                        }
                                                                        h.c = null;
                                                                        n5 = n3;
                                                                        if ((n6 = n5) > 2) {
                                                                            h.b = 3;
                                                                            n6 = n5;
                                                                        }
                                                                        if ((n2 = n6) > 3) {
                                                                            if (n.a) {
                                                                                Log.v("FragmentManager", "moveto STARTED: " + h);
                                                                            }
                                                                            h.C();
                                                                            this.b(h, false);
                                                                            n2 = n6;
                                                                        }
                                                                        if ((b4 = n2) > 4) {
                                                                            if (n.a) {
                                                                                Log.v("FragmentManager", "moveto RESUMED: " + h);
                                                                            }
                                                                            h.D();
                                                                            this.c(h, false);
                                                                            h.c = null;
                                                                            h.d = null;
                                                                            b4 = n2;
                                                                        }
                                                                        break Label_0223;
                                                                        h.v.a(h);
                                                                        break Label_1093;
                                                                        h.g(h.c);
                                                                        h.b = 1;
                                                                        break Label_0736;
                                                                    }
                                                                    catch (Resources$NotFoundException ex) {
                                                                        resourceName = "unknown";
                                                                        continue Label_1087_Outer;
                                                                    }
                                                                    break;
                                                                }
                                                                p5 = false;
                                                                continue Label_1154_Outer;
                                                            }
                                                        }
                                                        h.I = null;
                                                        continue Label_1093;
                                                    }
                                                    break;
                                                }
                                                case 3: {
                                                    continue Label_1209_Outer;
                                                }
                                                case 4: {
                                                    continue Label_1287_Outer;
                                                }
                                            }
                                            break;
                                        }
                                        break;
                                    }
                                    break;
                                }
                                this.b(h, this.m.g(), false);
                                if (h.T) {
                                    continue;
                                }
                                break;
                            }
                            this.a(h, h.c, false);
                            h.k(h.c);
                            this.b(h, h.c, false);
                        }
                        h.C = false;
                        continue Label_1287_Outer;
                    }
                }
            }
            else {
                if (h.b <= (b4 = n)) {
                    break Label_0223;
                }
                switch (h.b) {
                    default: {
                        b4 = n;
                        break Label_0223;
                    }
                    case 3: {
                        if (n < 3) {
                            if (n.a) {
                                Log.v("FragmentManager", "movefrom STOPPED: " + h);
                            }
                            h.I();
                        }
                    }
                    case 2: {
                        if (n < 2) {
                            if (n.a) {
                                Log.v("FragmentManager", "movefrom ACTIVITY_CREATED: " + h);
                            }
                            if (h.H != null && this.m.a(h) && h.d == null) {
                                this.m(h);
                            }
                            h.J();
                            this.f(h, false);
                            if (h.H != null && h.G != null) {
                                h.H.clearAnimation();
                                h.G.endViewTransition(h.H);
                                c a;
                                if (this.l > 0 && !this.t && h.H.getVisibility() == 0 && h.R >= 0.0f) {
                                    a = this.a(h, n2, false, n3);
                                }
                                else {
                                    a = null;
                                }
                                h.R = 0.0f;
                                if (a != null) {
                                    this.a(h, a, n);
                                }
                                h.G.removeView(h.H);
                            }
                            h.G = null;
                            h.H = null;
                            h.I = null;
                            h.n = false;
                        }
                    }
                    case 1: {
                        if ((b4 = n) >= 1) {
                            break Label_0223;
                        }
                        if (this.t) {
                            if (h.R() != null) {
                                final View r2 = h.R();
                                h.a((View)null);
                                r2.clearAnimation();
                            }
                            else if (h.S() != null) {
                                final Animator s = h.S();
                                h.a((Animator)null);
                                s.cancel();
                            }
                        }
                        if (h.R() != null || h.S() != null) {
                            h.b(n);
                            b4 = 1;
                            break Label_0223;
                        }
                        if (n.a) {
                            Log.v("FragmentManager", "movefrom CREATED: " + h);
                        }
                        if (!h.C) {
                            h.K();
                            this.g(h, false);
                        }
                        else {
                            h.b = 0;
                        }
                        h.L();
                        this.h(h, false);
                        b4 = n;
                        if (b) {
                            break Label_0223;
                        }
                        if (!h.C) {
                            this.g(h);
                            b4 = n;
                            break Label_0223;
                        }
                        h.s = null;
                        h.v = null;
                        h.r = null;
                        b4 = n;
                        break Label_0223;
                    }
                    case 5: {
                        if (n < 5) {
                            if (n.a) {
                                Log.v("FragmentManager", "movefrom RESUMED: " + h);
                            }
                            h.G();
                            this.d(h, false);
                        }
                    }
                    case 4: {
                        if (n < 4) {
                            if (n.a) {
                                Log.v("FragmentManager", "movefrom STARTED: " + h);
                            }
                            h.H();
                            this.e(h, false);
                        }
                    }
                }
            }
            return;
        }
        if (h.b != b4) {
            Log.w("FragmentManager", "moveToState: Fragment state for " + h + " not updated inline; " + "expected state " + b4 + " found " + h.b);
            h.b = b4;
        }
    }
    
    void a(final h h, final Context context, final boolean b) {
        if (this.o != null) {
            final m f = this.o.f();
            if (f instanceof n) {
                ((n)f).a(h, context, true);
            }
        }
        for (final i<m.a, Boolean> i : this.I) {
            if (!b || i.b) {
                i.a.a(this, h, context);
            }
        }
    }
    
    void a(final h h, final Bundle bundle, final boolean b) {
        if (this.o != null) {
            final m f = this.o.f();
            if (f instanceof n) {
                ((n)f).a(h, bundle, true);
            }
        }
        for (final i<m.a, Boolean> i : this.I) {
            if (!b || i.b) {
                i.a.a(this, h, bundle);
            }
        }
    }
    
    void a(final h h, final View view, final Bundle bundle, final boolean b) {
        if (this.o != null) {
            final m f = this.o.f();
            if (f instanceof n) {
                ((n)f).a(h, view, bundle, true);
            }
        }
        for (final i<m.a, Boolean> i : this.I) {
            if (!b || i.b) {
                i.a.a(this, h, view, bundle);
            }
        }
    }
    
    public void a(final h h, final boolean b) {
        if (android.support.v4.a.n.a) {
            Log.v("FragmentManager", "add: " + h);
        }
        this.f(h);
        if (h.A) {
            return;
        }
        if (this.e.contains(h)) {
            throw new IllegalStateException("Fragment already added: " + h);
        }
        synchronized (this.e) {
            this.e.add(h);
            // monitorexit(this.e)
            h.k = true;
            h.l = false;
            if (h.H == null) {
                h.Q = false;
            }
            if (h.D && h.E) {
                this.r = true;
            }
            if (b) {
                this.b(h);
            }
        }
    }
    
    public void a(final l m, final j n, final h o) {
        if (this.m != null) {
            throw new IllegalStateException("Already attached");
        }
        this.m = m;
        this.n = n;
        this.o = o;
    }
    
    @Override
    public void a(final String s, final FileDescriptor fileDescriptor, final PrintWriter printWriter, final String[] array) {
        final int n = 0;
        final String string = s + "    ";
        if (this.f != null) {
            final int size = this.f.size();
            if (size > 0) {
                printWriter.print(s);
                printWriter.print("Active Fragments in ");
                printWriter.print(Integer.toHexString(System.identityHashCode(this)));
                printWriter.println(":");
                for (int i = 0; i < size; ++i) {
                    final h h = (h)this.f.valueAt(i);
                    printWriter.print(s);
                    printWriter.print("  #");
                    printWriter.print(i);
                    printWriter.print(": ");
                    printWriter.println(h);
                    if (h != null) {
                        h.a(string, fileDescriptor, printWriter, array);
                    }
                }
            }
        }
        final int size2 = this.e.size();
        if (size2 > 0) {
            printWriter.print(s);
            printWriter.println("Added Fragments:");
            for (int j = 0; j < size2; ++j) {
                final h h2 = this.e.get(j);
                printWriter.print(s);
                printWriter.print("  #");
                printWriter.print(j);
                printWriter.print(": ");
                printWriter.println(h2.toString());
            }
        }
        if (this.h != null) {
            final int size3 = this.h.size();
            if (size3 > 0) {
                printWriter.print(s);
                printWriter.println("Fragments Created Menus:");
                for (int k = 0; k < size3; ++k) {
                    final h h3 = this.h.get(k);
                    printWriter.print(s);
                    printWriter.print("  #");
                    printWriter.print(k);
                    printWriter.print(": ");
                    printWriter.println(h3.toString());
                }
            }
        }
        if (this.g != null) {
            final int size4 = this.g.size();
            if (size4 > 0) {
                printWriter.print(s);
                printWriter.println("Back Stack:");
                for (int l = 0; l < size4; ++l) {
                    final android.support.v4.a.c c = this.g.get(l);
                    printWriter.print(s);
                    printWriter.print("  #");
                    printWriter.print(l);
                    printWriter.print(": ");
                    printWriter.println(c.toString());
                    c.a(string, fileDescriptor, printWriter, array);
                }
            }
        }
        synchronized (this) {
            if (this.i != null) {
                final int size5 = this.i.size();
                if (size5 > 0) {
                    printWriter.print(s);
                    printWriter.println("Back Stack Indices:");
                    for (int n2 = 0; n2 < size5; ++n2) {
                        final android.support.v4.a.c c2 = this.i.get(n2);
                        printWriter.print(s);
                        printWriter.print("  #");
                        printWriter.print(n2);
                        printWriter.print(": ");
                        printWriter.println(c2);
                    }
                }
            }
            if (this.j != null && this.j.size() > 0) {
                printWriter.print(s);
                printWriter.print("mAvailBackStackIndices: ");
                printWriter.println(Arrays.toString(this.j.toArray()));
            }
            // monitorexit(this)
            if (this.b != null) {
                final int size6 = this.b.size();
                if (size6 > 0) {
                    printWriter.print(s);
                    printWriter.println("Pending Actions:");
                    for (int n3 = n; n3 < size6; ++n3) {
                        final f f = this.b.get(n3);
                        printWriter.print(s);
                        printWriter.print("  #");
                        printWriter.print(n3);
                        printWriter.print(": ");
                        printWriter.println(f);
                    }
                }
            }
        }
        final String s2;
        printWriter.print(s2);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(s2);
        printWriter.print("  mHost=");
        printWriter.println(this.m);
        printWriter.print(s2);
        printWriter.print("  mContainer=");
        printWriter.println(this.n);
        if (this.o != null) {
            printWriter.print(s2);
            printWriter.print("  mParent=");
            printWriter.println(this.o);
        }
        printWriter.print(s2);
        printWriter.print("  mCurState=");
        printWriter.print(this.l);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.s);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.t);
        if (this.r) {
            printWriter.print(s2);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.r);
        }
        if (this.u != null) {
            printWriter.print(s2);
            printWriter.print("  mNoTransactionsBecause=");
            printWriter.println(this.u);
        }
    }
    
    public void a(final boolean b) {
        for (int i = this.e.size() - 1; i >= 0; --i) {
            final h h = this.e.get(i);
            if (h != null) {
                h.d(b);
            }
        }
    }
    
    @Override
    public boolean a() {
        this.x();
        return this.a(null, -1, 0);
    }
    
    boolean a(final int n) {
        return this.l >= n;
    }
    
    public boolean a(final Menu menu) {
        int i = 0;
        boolean b = false;
        while (i < this.e.size()) {
            final h h = this.e.get(i);
            boolean b2 = b;
            if (h != null) {
                b2 = b;
                if (h.c(menu)) {
                    b2 = true;
                }
            }
            ++i;
            b = b2;
        }
        return b;
    }
    
    public boolean a(final Menu menu, final MenuInflater menuInflater) {
        final int n = 0;
        ArrayList<h> h = null;
        int i = 0;
        boolean b = false;
        while (i < this.e.size()) {
            final h h2 = this.e.get(i);
            ArrayList<h> list = h;
            boolean b2 = b;
            if (h2 != null) {
                list = h;
                b2 = b;
                if (h2.b(menu, menuInflater)) {
                    b2 = true;
                    if ((list = h) == null) {
                        list = new ArrayList<h>();
                    }
                    list.add(h2);
                }
            }
            ++i;
            b = b2;
            h = list;
        }
        if (this.h != null) {
            for (int j = n; j < this.h.size(); ++j) {
                final h h3 = this.h.get(j);
                if (h == null || !h.contains(h3)) {
                    h3.r();
                }
            }
        }
        this.h = h;
        return b;
    }
    
    public boolean a(final MenuItem menuItem) {
        final boolean b = false;
        int n = 0;
        boolean b2;
        while (true) {
            b2 = b;
            if (n >= this.e.size()) {
                break;
            }
            final h h = this.e.get(n);
            if (h != null && h.c(menuItem)) {
                b2 = true;
                break;
            }
            ++n;
        }
        return b2;
    }
    
    boolean a(final ArrayList<android.support.v4.a.c> list, final ArrayList<Boolean> list2, final String s, int i, int n) {
        if (this.g == null) {
            return false;
        }
        if (s == null && i < 0 && (n & 0x1) == 0x0) {
            i = this.g.size() - 1;
            if (i < 0) {
                return false;
            }
            list.add(this.g.remove(i));
            list2.add(true);
        }
        else {
            int n2 = -1;
            if (s != null || i >= 0) {
                int j;
                for (j = this.g.size() - 1; j >= 0; --j) {
                    final android.support.v4.a.c c = this.g.get(j);
                    if ((s != null && s.equals(c.d())) || (i >= 0 && i == c.n)) {
                        break;
                    }
                }
                if (j < 0) {
                    return false;
                }
                n2 = j;
                if ((n & 0x1) != 0x0) {
                    n = j - 1;
                    while (true) {
                        n2 = n;
                        if (n < 0) {
                            break;
                        }
                        final android.support.v4.a.c c2 = this.g.get(n);
                        if (s == null || !s.equals(c2.d())) {
                            n2 = n;
                            if (i < 0) {
                                break;
                            }
                            n2 = n;
                            if (i != c2.n) {
                                break;
                            }
                        }
                        --n;
                    }
                }
            }
            if (n2 == this.g.size() - 1) {
                return false;
            }
            for (i = this.g.size() - 1; i > n2; --i) {
                list.add(this.g.remove(i));
                list2.add(true);
            }
        }
        return true;
    }
    
    public h b(final int n) {
        for (int i = this.e.size() - 1; i >= 0; --i) {
            final h h = this.e.get(i);
            if (h != null && h.w == n) {
                return h;
            }
        }
        if (this.f != null) {
            for (int j = this.f.size() - 1; j >= 0; --j) {
                final h h2 = (h)this.f.valueAt(j);
                if (h2 != null) {
                    final h h = h2;
                    if (h2.w == n) {
                        return h;
                    }
                }
            }
        }
        return null;
    }
    
    public h b(final String s) {
        if (this.f != null && s != null) {
            for (int i = this.f.size() - 1; i >= 0; --i) {
                final h h = (h)this.f.valueAt(i);
                if (h != null) {
                    final h a = h.a(s);
                    if (a != null) {
                        return a;
                    }
                }
            }
        }
        return null;
    }
    
    @Override
    public List<h> b() {
        if (this.e.isEmpty()) {
            return (List<h>)Collections.EMPTY_LIST;
        }
        synchronized (this.e) {
            return (List<h>)this.e.clone();
        }
    }
    
    void b(final h h) {
        this.a(h, this.l, 0, 0, false);
    }
    
    void b(final h h, final Context context, final boolean b) {
        if (this.o != null) {
            final m f = this.o.f();
            if (f instanceof n) {
                ((n)f).b(h, context, true);
            }
        }
        for (final i<m.a, Boolean> i : this.I) {
            if (!b || i.b) {
                i.a.b(this, h, context);
            }
        }
    }
    
    void b(final h h, final Bundle bundle, final boolean b) {
        if (this.o != null) {
            final m f = this.o.f();
            if (f instanceof n) {
                ((n)f).b(h, bundle, true);
            }
        }
        for (final i<m.a, Boolean> i : this.I) {
            if (!b || i.b) {
                i.a.b(this, h, bundle);
            }
        }
    }
    
    void b(final h h, final boolean b) {
        if (this.o != null) {
            final m f = this.o.f();
            if (f instanceof n) {
                ((n)f).b(h, true);
            }
        }
        for (final i<m.a, Boolean> i : this.I) {
            if (!b || i.b) {
                i.a.a(this, h);
            }
        }
    }
    
    public void b(final Menu menu) {
        for (int i = 0; i < this.e.size(); ++i) {
            final h h = this.e.get(i);
            if (h != null) {
                h.d(menu);
            }
        }
    }
    
    public void b(final boolean b) {
        for (int i = this.e.size() - 1; i >= 0; --i) {
            final h h = this.e.get(i);
            if (h != null) {
                h.e(b);
            }
        }
    }
    
    public boolean b(final MenuItem menuItem) {
        final boolean b = false;
        int n = 0;
        boolean b2;
        while (true) {
            b2 = b;
            if (n >= this.e.size()) {
                break;
            }
            final h h = this.e.get(n);
            if (h != null && h.d(menuItem)) {
                b2 = true;
                break;
            }
            ++n;
        }
        return b2;
    }
    
    public void c(final int n) {
        synchronized (this) {
            this.i.set(n, null);
            if (this.j == null) {
                this.j = new ArrayList<Integer>();
            }
            if (n.a) {
                Log.v("FragmentManager", "Freeing back stack index " + n);
            }
            this.j.add(n);
        }
    }
    
    void c(final h h) {
        if (h.m && !h.p) {
            h.H = h.b(h.d(h.c), null, h.c);
            if (h.H == null) {
                h.I = null;
                return;
            }
            h.I = h.H;
            h.H.setSaveFromParentEnabled(false);
            if (h.z) {
                h.H.setVisibility(8);
            }
            h.a(h.H, h.c);
            this.a(h, h.H, h.c, false);
        }
    }
    
    void c(final h h, final Bundle bundle, final boolean b) {
        if (this.o != null) {
            final m f = this.o.f();
            if (f instanceof n) {
                ((n)f).c(h, bundle, true);
            }
        }
        for (final i<m.a, Boolean> i : this.I) {
            if (!b || i.b) {
                i.a.c(this, h, bundle);
            }
        }
    }
    
    void c(final h h, final boolean b) {
        if (this.o != null) {
            final m f = this.o.f();
            if (f instanceof n) {
                ((n)f).c(h, true);
            }
        }
        for (final i<m.a, Boolean> i : this.I) {
            if (!b || i.b) {
                i.a.b(this, h);
            }
        }
    }
    
    @Override
    public boolean c() {
        return this.s;
    }
    
    void d() {
        if (this.f != null) {
            for (int i = 0; i < this.f.size(); ++i) {
                final h h = (h)this.f.valueAt(i);
                if (h != null) {
                    this.a(h);
                }
            }
        }
    }
    
    void d(final h h) {
        if (h.H != null) {
            final c a = this.a(h, h.N(), !h.z, h.O());
            if (a != null && a.b != null) {
                a.b.setTarget((Object)h.H);
                if (h.z) {
                    if (h.V()) {
                        h.f(false);
                    }
                    else {
                        final ViewGroup g = h.G;
                        final View h2 = h.H;
                        g.startViewTransition(h2);
                        a.b.addListener((Animator$AnimatorListener)new AnimatorListenerAdapter() {
                            public void onAnimationEnd(final Animator animator) {
                                g.endViewTransition(h2);
                                animator.removeListener((Animator$AnimatorListener)this);
                                if (h.H != null) {
                                    h.H.setVisibility(8);
                                }
                            }
                        });
                    }
                }
                else {
                    h.H.setVisibility(0);
                }
                b(h.H, a);
                a.b.start();
            }
            else {
                if (a != null) {
                    b(h.H, a);
                    h.H.startAnimation(a.a);
                    a.a.start();
                }
                int visibility;
                if (h.z && !h.V()) {
                    visibility = 8;
                }
                else {
                    visibility = 0;
                }
                h.H.setVisibility(visibility);
                if (h.V()) {
                    h.f(false);
                }
            }
        }
        if (h.k && h.D && h.E) {
            this.r = true;
        }
        h.Q = false;
        h.a(h.z);
    }
    
    void d(final h h, final Bundle bundle, final boolean b) {
        if (this.o != null) {
            final m f = this.o.f();
            if (f instanceof n) {
                ((n)f).d(h, bundle, true);
            }
        }
        for (final i<m.a, Boolean> i : this.I) {
            if (!b || i.b) {
                i.a.d(this, h, bundle);
            }
        }
    }
    
    void d(final h h, final boolean b) {
        if (this.o != null) {
            final m f = this.o.f();
            if (f instanceof n) {
                ((n)f).d(h, true);
            }
        }
        for (final i<m.a, Boolean> i : this.I) {
            if (!b || i.b) {
                i.a.c(this, h);
            }
        }
    }
    
    void e(final h h) {
        if (h != null) {
            int n2;
            final int n = n2 = this.l;
            if (h.l) {
                if (h.b()) {
                    n2 = Math.min(n, 1);
                }
                else {
                    n2 = Math.min(n, 0);
                }
            }
            this.a(h, n2, h.N(), h.O(), false);
            if (h.H != null) {
                final h p = this.p(h);
                if (p != null) {
                    final View h2 = p.H;
                    final ViewGroup g = h.G;
                    final int indexOfChild = g.indexOfChild(h2);
                    final int indexOfChild2 = g.indexOfChild(h.H);
                    if (indexOfChild2 < indexOfChild) {
                        g.removeViewAt(indexOfChild2);
                        g.addView(h.H, indexOfChild);
                    }
                }
                if (h.P && h.G != null) {
                    if (h.R > 0.0f) {
                        h.H.setAlpha(h.R);
                    }
                    h.R = 0.0f;
                    h.P = false;
                    final c a = this.a(h, h.N(), true, h.O());
                    if (a != null) {
                        b(h.H, a);
                        if (a.a != null) {
                            h.H.startAnimation(a.a);
                        }
                        else {
                            a.b.setTarget((Object)h.H);
                            a.b.start();
                        }
                    }
                }
            }
            if (h.Q) {
                this.d(h);
            }
        }
    }
    
    void e(final h h, final boolean b) {
        if (this.o != null) {
            final m f = this.o.f();
            if (f instanceof n) {
                ((n)f).e(h, true);
            }
        }
        for (final i<m.a, Boolean> i : this.I) {
            if (!b || i.b) {
                i.a.d(this, h);
            }
        }
    }
    
    public boolean e() {
        this.c(true);
        boolean b = false;
        while (this.c(this.w, this.x)) {
            this.c = true;
            try {
                this.b(this.w, this.x);
                this.z();
                b = true;
                continue;
            }
            finally {
                this.z();
            }
            break;
        }
        this.f();
        this.C();
        return b;
    }
    
    void f() {
        if (this.v) {
            int i = 0;
            boolean b = false;
            while (i < this.f.size()) {
                final h h = (h)this.f.valueAt(i);
                boolean b2 = b;
                if (h != null) {
                    b2 = b;
                    if (h.L != null) {
                        b2 = (b | h.L.a());
                    }
                }
                ++i;
                b = b2;
            }
            if (!b) {
                this.v = false;
                this.d();
            }
        }
    }
    
    void f(final h h) {
        if (h.e < 0) {
            h.a(this.d++, this.o);
            if (this.f == null) {
                this.f = (SparseArray<h>)new SparseArray();
            }
            this.f.put(h.e, (Object)h);
            if (android.support.v4.a.n.a) {
                Log.v("FragmentManager", "Allocated fragment index " + h);
            }
        }
    }
    
    void f(final h h, final boolean b) {
        if (this.o != null) {
            final m f = this.o.f();
            if (f instanceof n) {
                ((n)f).f(h, true);
            }
        }
        for (final i<m.a, Boolean> i : this.I) {
            if (!b || i.b) {
                i.a.e(this, h);
            }
        }
    }
    
    void g() {
        if (this.k != null) {
            for (int i = 0; i < this.k.size(); ++i) {
                this.k.get(i).a();
            }
        }
    }
    
    void g(final h h) {
        if (h.e < 0) {
            return;
        }
        if (android.support.v4.a.n.a) {
            Log.v("FragmentManager", "Freeing fragment index " + h);
        }
        this.f.put(h.e, (Object)null);
        this.m.a(h.f);
        h.p();
    }
    
    void g(final h h, final boolean b) {
        if (this.o != null) {
            final m f = this.o.f();
            if (f instanceof n) {
                ((n)f).g(h, true);
            }
        }
        for (final i<m.a, Boolean> i : this.I) {
            if (!b || i.b) {
                i.a.f(this, h);
            }
        }
    }
    
    o h() {
        a(this.C);
        return this.C;
    }
    
    public void h(final h h) {
        if (android.support.v4.a.n.a) {
            Log.v("FragmentManager", "remove: " + h + " nesting=" + h.q);
        }
        Label_0114: {
            if (h.b()) {
                break Label_0114;
            }
            int n = 1;
            while (true) {
                if (h.A && n == 0) {
                    return;
                }
                synchronized (this.e) {
                    this.e.remove(h);
                    // monitorexit(this.e)
                    if (h.D && h.E) {
                        this.r = true;
                    }
                    h.k = false;
                    h.l = true;
                    return;
                    n = 0;
                    continue;
                }
                break;
            }
        }
    }
    
    void h(final h h, final boolean b) {
        if (this.o != null) {
            final m f = this.o.f();
            if (f instanceof n) {
                ((n)f).h(h, true);
            }
        }
        for (final i<m.a, Boolean> i : this.I) {
            if (!b || i.b) {
                i.a.g(this, h);
            }
        }
    }
    
    void i() {
        List<o> list3;
        List<h> list4;
        if (this.f != null) {
            int n = 0;
            ArrayList<o> list = null;
            ArrayList<h> list2 = null;
            while (true) {
                list3 = list;
                list4 = list2;
                if (n >= this.f.size()) {
                    break;
                }
                final h h = (h)this.f.valueAt(n);
                ArrayList<o> list7;
                ArrayList<h> list9;
                if (h != null) {
                    ArrayList<h> list5 = list2;
                    if (h.B) {
                        ArrayList<h> list6;
                        if ((list6 = list2) == null) {
                            list6 = new ArrayList<h>();
                        }
                        list6.add(h);
                        int e;
                        if (h.h != null) {
                            e = h.h.e;
                        }
                        else {
                            e = -1;
                        }
                        h.i = e;
                        list5 = list6;
                        if (android.support.v4.a.n.a) {
                            Log.v("FragmentManager", "retainNonConfig: keeping retained " + h);
                            list5 = list6;
                        }
                    }
                    o o;
                    if (h.t != null) {
                        h.t.i();
                        o = h.t.C;
                    }
                    else {
                        o = h.u;
                    }
                    list7 = list;
                    if (list == null) {
                        list7 = list;
                        if (o != null) {
                            final ArrayList<o> list8 = new ArrayList<o>(this.f.size());
                            int n2 = 0;
                            while (true) {
                                list7 = list8;
                                if (n2 >= n) {
                                    break;
                                }
                                list8.add(null);
                                ++n2;
                            }
                        }
                    }
                    if (list7 != null) {
                        list7.add(o);
                    }
                    list9 = list5;
                }
                else {
                    final ArrayList<h> list10 = list2;
                    list7 = list;
                    list9 = list10;
                }
                ++n;
                final ArrayList<h> list11 = list9;
                list = list7;
                list2 = list11;
            }
        }
        else {
            list3 = null;
            list4 = null;
        }
        if (list4 == null && list3 == null) {
            this.C = null;
            return;
        }
        this.C = new o(list4, list3);
    }
    
    public void i(final h h) {
        boolean q = true;
        if (android.support.v4.a.n.a) {
            Log.v("FragmentManager", "hide: " + h);
        }
        if (!h.z) {
            h.z = true;
            if (h.Q) {
                q = false;
            }
            h.Q = q;
        }
    }
    
    Parcelable j() {
        final android.support.v4.a.d[] array = null;
        this.A();
        this.B();
        this.e();
        this.s = true;
        this.C = null;
        if (this.f != null && this.f.size() > 0) {
            final int size = this.f.size();
            final q[] a = new q[size];
            int i = 0;
            boolean b = false;
            while (i < size) {
                final h h = (h)this.f.valueAt(i);
                if (h != null) {
                    if (h.e < 0) {
                        this.a(new IllegalStateException("Failure saving state: active " + h + " has cleared index: " + h.e));
                    }
                    final q q = new q(h);
                    a[i] = q;
                    if (h.b > 0 && q.k == null) {
                        q.k = this.n(h);
                        if (h.h != null) {
                            if (h.h.e < 0) {
                                this.a(new IllegalStateException("Failure saving state: " + h + " has target not in fragment manager: " + h.h));
                            }
                            if (q.k == null) {
                                q.k = new Bundle();
                            }
                            this.a(q.k, "android:target_state", h.h);
                            if (h.j != 0) {
                                q.k.putInt("android:target_req_state", h.j);
                            }
                        }
                    }
                    else {
                        q.k = h.c;
                    }
                    if (android.support.v4.a.n.a) {
                        Log.v("FragmentManager", "Saved state of " + h + ": " + q.k);
                    }
                    b = true;
                }
                ++i;
            }
            if (b) {
                final int size2 = this.e.size();
                int[] b2;
                if (size2 > 0) {
                    final int[] array2 = new int[size2];
                    int n = 0;
                    while (true) {
                        b2 = array2;
                        if (n >= size2) {
                            break;
                        }
                        array2[n] = this.e.get(n).e;
                        if (array2[n] < 0) {
                            this.a(new IllegalStateException("Failure saving state: active " + this.e.get(n) + " has cleared index: " + array2[n]));
                        }
                        if (android.support.v4.a.n.a) {
                            Log.v("FragmentManager", "saveAllState: adding fragment #" + n + ": " + this.e.get(n));
                        }
                        ++n;
                    }
                }
                else {
                    b2 = null;
                }
                android.support.v4.a.d[] c = array;
                if (this.g != null) {
                    final int size3 = this.g.size();
                    c = array;
                    if (size3 > 0) {
                        final android.support.v4.a.d[] array3 = new android.support.v4.a.d[size3];
                        int n2 = 0;
                        while (true) {
                            c = array3;
                            if (n2 >= size3) {
                                break;
                            }
                            array3[n2] = new android.support.v4.a.d(this.g.get(n2));
                            if (android.support.v4.a.n.a) {
                                Log.v("FragmentManager", "saveAllState: adding back stack #" + n2 + ": " + this.g.get(n2));
                            }
                            ++n2;
                        }
                    }
                }
                final android.support.v4.a.p p = new android.support.v4.a.p();
                p.a = a;
                p.b = b2;
                p.c = c;
                if (this.p != null) {
                    p.d = this.p.e;
                }
                p.e = this.d;
                this.i();
                return (Parcelable)p;
            }
            if (android.support.v4.a.n.a) {
                Log.v("FragmentManager", "saveAllState: no fragments!");
                return null;
            }
        }
        return null;
    }
    
    public void j(final h h) {
        boolean q = false;
        if (android.support.v4.a.n.a) {
            Log.v("FragmentManager", "show: " + h);
        }
        if (h.z) {
            h.z = false;
            if (!h.Q) {
                q = true;
            }
            h.Q = q;
        }
    }
    
    public void k() {
        this.C = null;
        this.s = false;
        for (int size = this.e.size(), i = 0; i < size; ++i) {
            final h h = this.e.get(i);
            if (h != null) {
                h.E();
            }
        }
    }
    
    public void k(final h h) {
        if (android.support.v4.a.n.a) {
            Log.v("FragmentManager", "detach: " + h);
        }
        if (h.A) {
            return;
        }
        h.A = true;
        if (!h.k) {
            return;
        }
        if (android.support.v4.a.n.a) {
            Log.v("FragmentManager", "remove from detach: " + h);
        }
        synchronized (this.e) {
            this.e.remove(h);
            // monitorexit(this.e)
            if (h.D && h.E) {
                this.r = true;
            }
            h.k = false;
        }
    }
    
    public void l() {
        this.s = false;
        this.e(1);
    }
    
    public void l(final h h) {
        if (android.support.v4.a.n.a) {
            Log.v("FragmentManager", "attach: " + h);
        }
        if (!h.A) {
            return;
        }
        h.A = false;
        if (h.k) {
            return;
        }
        if (this.e.contains(h)) {
            throw new IllegalStateException("Fragment already added: " + h);
        }
        if (android.support.v4.a.n.a) {
            Log.v("FragmentManager", "add from attach: " + h);
        }
        synchronized (this.e) {
            this.e.add(h);
            // monitorexit(this.e)
            h.k = true;
            if (h.D && h.E) {
                this.r = true;
            }
        }
    }
    
    public void m() {
        this.s = false;
        this.e(2);
    }
    
    void m(final h h) {
        if (h.I != null) {
            if (this.A == null) {
                this.A = (SparseArray<Parcelable>)new SparseArray();
            }
            else {
                this.A.clear();
            }
            h.I.saveHierarchyState((SparseArray)this.A);
            if (this.A.size() > 0) {
                h.d = this.A;
                this.A = null;
            }
        }
    }
    
    Bundle n(final h h) {
        if (this.z == null) {
            this.z = new Bundle();
        }
        h.m(this.z);
        this.d(h, this.z, false);
        Bundle z;
        if (!this.z.isEmpty()) {
            z = this.z;
            this.z = null;
        }
        else {
            z = null;
        }
        if (h.H != null) {
            this.m(h);
        }
        Bundle bundle = z;
        if (h.d != null) {
            if ((bundle = z) == null) {
                bundle = new Bundle();
            }
            bundle.putSparseParcelableArray("android:view_state", (SparseArray)h.d);
        }
        Bundle bundle2 = bundle;
        if (!h.K) {
            if ((bundle2 = bundle) == null) {
                bundle2 = new Bundle();
            }
            bundle2.putBoolean("android:user_visible_hint", h.K);
        }
        return bundle2;
    }
    
    public void n() {
        this.s = false;
        this.e(4);
    }
    
    public void o() {
        this.s = false;
        this.e(5);
    }
    
    public void o(final h p) {
        if (p != null && (this.f.get(p.e) != p || (p.s != null && p.f() != this))) {
            throw new IllegalArgumentException("Fragment " + p + " is not an active fragment of FragmentManager " + this);
        }
        this.p = p;
    }
    
    public View onCreateView(final View view, final String s, final Context context, final AttributeSet set) {
        if (!"fragment".equals(s)) {
            return null;
        }
        String s2 = set.getAttributeValue((String)null, "class");
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, android.support.v4.a.n.e.a);
        if (s2 == null) {
            s2 = obtainStyledAttributes.getString(0);
        }
        final int resourceId = obtainStyledAttributes.getResourceId(1, -1);
        final String string = obtainStyledAttributes.getString(2);
        obtainStyledAttributes.recycle();
        if (!android.support.v4.a.h.a(this.m.g(), s2)) {
            return null;
        }
        int id;
        if (view != null) {
            id = view.getId();
        }
        else {
            id = 0;
        }
        if (id == -1 && resourceId == -1 && string == null) {
            throw new IllegalArgumentException(set.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + s2);
        }
        h b;
        if (resourceId != -1) {
            b = this.b(resourceId);
        }
        else {
            b = null;
        }
        h a = b;
        if (b == null) {
            a = b;
            if (string != null) {
                a = this.a(string);
            }
        }
        h b2;
        if ((b2 = a) == null) {
            b2 = a;
            if (id != -1) {
                b2 = this.b(id);
            }
        }
        if (android.support.v4.a.n.a) {
            Log.v("FragmentManager", "onCreateView: id=0x" + Integer.toHexString(resourceId) + " fname=" + s2 + " existing=" + b2);
        }
        h a2;
        if (b2 == null) {
            a2 = this.n.a(context, s2, null);
            a2.m = true;
            int w;
            if (resourceId != 0) {
                w = resourceId;
            }
            else {
                w = id;
            }
            a2.w = w;
            a2.x = id;
            a2.y = string;
            a2.n = true;
            a2.r = this;
            a2.s = this.m;
            a2.a(this.m.g(), set, a2.c);
            this.a(a2, true);
        }
        else {
            if (b2.n) {
                throw new IllegalArgumentException(set.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string + ", or parent id 0x" + Integer.toHexString(id) + " with another fragment for " + s2);
            }
            b2.n = true;
            b2.s = this.m;
            if (!b2.C) {
                b2.a(this.m.g(), set, b2.c);
            }
            a2 = b2;
        }
        if (this.l < 1 && a2.m) {
            this.a(a2, 1, 0, 0, false);
        }
        else {
            this.b(a2);
        }
        if (a2.H == null) {
            throw new IllegalStateException("Fragment " + s2 + " did not create a view.");
        }
        if (resourceId != 0) {
            a2.H.setId(resourceId);
        }
        if (a2.H.getTag() == null) {
            a2.H.setTag((Object)string);
        }
        return a2.H;
    }
    
    public View onCreateView(final String s, final Context context, final AttributeSet set) {
        return this.onCreateView(null, s, context, set);
    }
    
    public void p() {
        this.e(4);
    }
    
    public void q() {
        this.s = true;
        this.e(3);
    }
    
    public void r() {
        this.e(2);
    }
    
    public void s() {
        this.e(1);
    }
    
    public void t() {
        this.t = true;
        this.e();
        this.e(0);
        this.m = null;
        this.n = null;
        this.o = null;
    }
    
    public String toString() {
        final StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        if (this.o != null) {
            android.support.v4.g.d.a(this.o, sb);
        }
        else {
            android.support.v4.g.d.a(this.m, sb);
        }
        sb.append("}}");
        return sb.toString();
    }
    
    public void u() {
        for (int i = 0; i < this.e.size(); ++i) {
            final h h = this.e.get(i);
            if (h != null) {
                h.F();
            }
        }
    }
    
    public h v() {
        return this.p;
    }
    
    LayoutInflater$Factory2 w() {
        return (LayoutInflater$Factory2)this;
    }
    
    private static class a extends b
    {
        View a;
        
        a(final View a, final Animation$AnimationListener animation$AnimationListener) {
            super(animation$AnimationListener);
            this.a = a;
        }
        
        @Override
        public void onAnimationEnd(final Animation animation) {
            if (android.support.v4.h.p.m(this.a) || Build$VERSION.SDK_INT >= 24) {
                this.a.post((Runnable)new Runnable() {
                    @Override
                    public void run() {
                        android.support.v4.a.n.a.this.a.setLayerType(0, (Paint)null);
                    }
                });
            }
            else {
                this.a.setLayerType(0, (Paint)null);
            }
            super.onAnimationEnd(animation);
        }
    }
    
    private static class b implements Animation$AnimationListener
    {
        private final Animation$AnimationListener a;
        
        private b(final Animation$AnimationListener a) {
            this.a = a;
        }
        
        public void onAnimationEnd(final Animation animation) {
            if (this.a != null) {
                this.a.onAnimationEnd(animation);
            }
        }
        
        public void onAnimationRepeat(final Animation animation) {
            if (this.a != null) {
                this.a.onAnimationRepeat(animation);
            }
        }
        
        public void onAnimationStart(final Animation animation) {
            if (this.a != null) {
                this.a.onAnimationStart(animation);
            }
        }
    }
    
    private static class c
    {
        public final Animation a;
        public final Animator b;
        
        private c(final Animator b) {
            this.a = null;
            this.b = b;
            if (b == null) {
                throw new IllegalStateException("Animator cannot be null");
            }
        }
        
        private c(final Animation a) {
            this.a = a;
            this.b = null;
            if (a == null) {
                throw new IllegalStateException("Animation cannot be null");
            }
        }
    }
    
    private static class d extends AnimatorListenerAdapter
    {
        View a;
        
        d(final View a) {
            this.a = a;
        }
        
        public void onAnimationEnd(final Animator animator) {
            this.a.setLayerType(0, (Paint)null);
            animator.removeListener((Animator$AnimatorListener)this);
        }
        
        public void onAnimationStart(final Animator animator) {
            this.a.setLayerType(2, (Paint)null);
        }
    }
    
    static class e
    {
        public static final int[] a;
        
        static {
            a = new int[] { 16842755, 16842960, 16842961 };
        }
    }
    
    interface f
    {
        boolean a(final ArrayList<android.support.v4.a.c> p0, final ArrayList<Boolean> p1);
    }
    
    static class g implements h.c
    {
        private final boolean a;
        private final c b;
        private int c;
        
        g(final c b, final boolean a) {
            this.a = a;
            this.b = b;
        }
        
        @Override
        public void a() {
            --this.c;
            if (this.c != 0) {
                return;
            }
            this.b.b.y();
        }
        
        @Override
        public void b() {
            ++this.c;
        }
        
        public boolean c() {
            return this.c == 0;
        }
        
        public void d() {
            boolean b = false;
            boolean b2;
            if (this.c > 0) {
                b2 = true;
            }
            else {
                b2 = false;
            }
            final n b3 = this.b.b;
            for (int size = b3.e.size(), i = 0; i < size; ++i) {
                final h h = b3.e.get(i);
                h.a((h.c)null);
                if (b2 && h.U()) {
                    h.A();
                }
            }
            final n b4 = this.b.b;
            final c b5 = this.b;
            final boolean a = this.a;
            if (!b2) {
                b = true;
            }
            b4.a(b5, a, b, true);
        }
        
        public void e() {
            this.b.b.a(this.b, this.a, false, false);
        }
    }
}
