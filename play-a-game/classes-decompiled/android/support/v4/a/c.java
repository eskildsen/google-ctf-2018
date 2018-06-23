// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v4.a;

import java.io.PrintWriter;
import java.io.FileDescriptor;
import android.util.Log;
import android.os.Build$VERSION;
import java.util.ArrayList;

final class c extends r implements f
{
    static final boolean a;
    final n b;
    ArrayList<a> c;
    int d;
    int e;
    int f;
    int g;
    int h;
    int i;
    boolean j;
    boolean k;
    String l;
    boolean m;
    int n;
    int o;
    CharSequence p;
    int q;
    CharSequence r;
    ArrayList<String> s;
    ArrayList<String> t;
    boolean u;
    ArrayList<Runnable> v;
    
    static {
        a = (Build$VERSION.SDK_INT >= 21);
    }
    
    public c(final n b) {
        this.c = new ArrayList<a>();
        this.k = true;
        this.n = -1;
        this.u = false;
        this.b = b;
    }
    
    private static boolean b(final a a) {
        final h b = a.b;
        return b != null && b.k && b.H != null && !b.A && !b.z && b.U();
    }
    
    h a(final ArrayList<h> list, h b) {
        int i = 0;
        h h = b;
    Label_0094_Outer:
        while (i < this.c.size()) {
            final a a = this.c.get(i);
            int n = i;
            b = h;
            while (true) {
                switch (a.a) {
                    default: {
                        b = h;
                        n = i;
                        break Label_0094;
                    }
                    case 8: {
                        this.c.add(i, new a(9, h));
                        n = i + 1;
                        b = a.b;
                        break Label_0094;
                    }
                    case 2: {
                        final h b2 = a.b;
                        final int x = b2.x;
                        boolean b3 = false;
                        int j = list.size() - 1;
                        b = h;
                        while (j >= 0) {
                            final h h2 = list.get(j);
                            if (h2.x == x) {
                                if (h2 == b2) {
                                    b3 = true;
                                }
                                else {
                                    int n2 = i;
                                    h h3;
                                    if (h2 == (h3 = b)) {
                                        this.c.add(i, new a(9, h2));
                                        n2 = i + 1;
                                        h3 = null;
                                    }
                                    final a a2 = new a(3, h2);
                                    a2.c = a.c;
                                    a2.e = a.e;
                                    a2.d = a.d;
                                    a2.f = a.f;
                                    this.c.add(n2, a2);
                                    list.remove(h2);
                                    i = n2 + 1;
                                    b = h3;
                                }
                            }
                            --j;
                        }
                        if (b3) {
                            this.c.remove(i);
                            --i;
                        }
                        else {
                            a.a = 1;
                            list.add(b2);
                        }
                        n = i;
                        break Label_0094;
                    }
                    case 1:
                    case 7: {
                        list.add(a.b);
                        n = i;
                        b = h;
                    }
                    case 4:
                    case 5: {
                        i = n + 1;
                        h = b;
                        continue Label_0094_Outer;
                    }
                    case 3:
                    case 6: {
                        list.remove(a.b);
                        n = i;
                        b = h;
                        if (a.b == h) {
                            this.c.add(i, new a(9, a.b));
                            n = i + 1;
                            b = null;
                        }
                        continue;
                    }
                }
                break;
            }
        }
        return h;
    }
    
    public void a() {
        if (this.v != null) {
            for (int size = this.v.size(), i = 0; i < size; ++i) {
                this.v.get(i).run();
            }
            this.v = null;
        }
    }
    
    void a(final int n) {
        if (this.j) {
            if (n.a) {
                Log.v("FragmentManager", "Bump nesting in " + this + " by " + n);
            }
            for (int size = this.c.size(), i = 0; i < size; ++i) {
                final a a = this.c.get(i);
                if (a.b != null) {
                    final h b = a.b;
                    b.q += n;
                    if (n.a) {
                        Log.v("FragmentManager", "Bump nesting of " + a.b + " to " + a.b.q);
                    }
                }
            }
        }
    }
    
    void a(final a a) {
        this.c.add(a);
        a.c = this.d;
        a.d = this.e;
        a.e = this.f;
        a.f = this.g;
    }
    
    void a(final h.c c) {
        for (int i = 0; i < this.c.size(); ++i) {
            final a a = this.c.get(i);
            if (b(a)) {
                a.b.a(c);
            }
        }
    }
    
    public void a(final String s, final FileDescriptor fileDescriptor, final PrintWriter printWriter, final String[] array) {
        this.a(s, printWriter, true);
    }
    
    public void a(final String s, final PrintWriter printWriter, final boolean b) {
        if (b) {
            printWriter.print(s);
            printWriter.print("mName=");
            printWriter.print(this.l);
            printWriter.print(" mIndex=");
            printWriter.print(this.n);
            printWriter.print(" mCommitted=");
            printWriter.println(this.m);
            if (this.h != 0) {
                printWriter.print(s);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.h));
                printWriter.print(" mTransitionStyle=#");
                printWriter.println(Integer.toHexString(this.i));
            }
            if (this.d != 0 || this.e != 0) {
                printWriter.print(s);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.d));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.e));
            }
            if (this.f != 0 || this.g != 0) {
                printWriter.print(s);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.g));
            }
            if (this.o != 0 || this.p != null) {
                printWriter.print(s);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.o));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.p);
            }
            if (this.q != 0 || this.r != null) {
                printWriter.print(s);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.q));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.r);
            }
        }
        if (!this.c.isEmpty()) {
            printWriter.print(s);
            printWriter.println("Operations:");
            new StringBuilder().append(s).append("    ").toString();
            for (int size = this.c.size(), i = 0; i < size; ++i) {
                final a a = this.c.get(i);
                String string = null;
                switch (a.a) {
                    default: {
                        string = "cmd=" + a.a;
                        break;
                    }
                    case 0: {
                        string = "NULL";
                        break;
                    }
                    case 1: {
                        string = "ADD";
                        break;
                    }
                    case 2: {
                        string = "REPLACE";
                        break;
                    }
                    case 3: {
                        string = "REMOVE";
                        break;
                    }
                    case 4: {
                        string = "HIDE";
                        break;
                    }
                    case 5: {
                        string = "SHOW";
                        break;
                    }
                    case 6: {
                        string = "DETACH";
                        break;
                    }
                    case 7: {
                        string = "ATTACH";
                        break;
                    }
                    case 8: {
                        string = "SET_PRIMARY_NAV";
                        break;
                    }
                    case 9: {
                        string = "UNSET_PRIMARY_NAV";
                        break;
                    }
                }
                printWriter.print(s);
                printWriter.print("  Op #");
                printWriter.print(i);
                printWriter.print(": ");
                printWriter.print(string);
                printWriter.print(" ");
                printWriter.println(a.b);
                if (b) {
                    if (a.c != 0 || a.d != 0) {
                        printWriter.print(s);
                        printWriter.print("enterAnim=#");
                        printWriter.print(Integer.toHexString(a.c));
                        printWriter.print(" exitAnim=#");
                        printWriter.println(Integer.toHexString(a.d));
                    }
                    if (a.e != 0 || a.f != 0) {
                        printWriter.print(s);
                        printWriter.print("popEnterAnim=#");
                        printWriter.print(Integer.toHexString(a.e));
                        printWriter.print(" popExitAnim=#");
                        printWriter.println(Integer.toHexString(a.f));
                    }
                }
            }
        }
    }
    
    void a(final boolean b) {
        for (int i = this.c.size() - 1; i >= 0; --i) {
            final a a = this.c.get(i);
            final h b2 = a.b;
            if (b2 != null) {
                b2.a(android.support.v4.a.n.d(this.h), this.i);
            }
            switch (a.a) {
                default: {
                    throw new IllegalArgumentException("Unknown cmd: " + a.a);
                }
                case 1: {
                    b2.a(a.f);
                    this.b.h(b2);
                    break;
                }
                case 3: {
                    b2.a(a.e);
                    this.b.a(b2, false);
                    break;
                }
                case 4: {
                    b2.a(a.e);
                    this.b.j(b2);
                    break;
                }
                case 5: {
                    b2.a(a.f);
                    this.b.i(b2);
                    break;
                }
                case 6: {
                    b2.a(a.e);
                    this.b.l(b2);
                    break;
                }
                case 7: {
                    b2.a(a.f);
                    this.b.k(b2);
                    break;
                }
                case 8: {
                    this.b.o(null);
                    break;
                }
                case 9: {
                    this.b.o(b2);
                    break;
                }
            }
            if (!this.u && a.a != 3 && b2 != null) {
                this.b.e(b2);
            }
        }
        if (!this.u && b) {
            this.b.a(this.b.l, true);
        }
    }
    
    boolean a(final ArrayList<c> list, final int n, final int n2) {
        if (n2 == n) {
            return false;
        }
        final int size = this.c.size();
        int n3 = -1;
        int x;
        for (int i = 0; i < size; ++i, n3 = x) {
            final a a = this.c.get(i);
            if (a.b != null) {
                x = a.b.x;
            }
            else {
                x = 0;
            }
            if (x != 0 && x != n3) {
                for (int j = n; j < n2; ++j) {
                    final c c = list.get(j);
                    for (int size2 = c.c.size(), k = 0; k < size2; ++k) {
                        final a a2 = c.c.get(k);
                        int x2;
                        if (a2.b != null) {
                            x2 = a2.b.x;
                        }
                        else {
                            x2 = 0;
                        }
                        if (x2 == x) {
                            return true;
                        }
                    }
                }
            }
            else {
                x = n3;
            }
        }
        return false;
    }
    
    @Override
    public boolean a(final ArrayList<c> list, final ArrayList<Boolean> list2) {
        if (android.support.v4.a.n.a) {
            Log.v("FragmentManager", "Run: " + this);
        }
        list.add(this);
        list2.add(false);
        if (this.j) {
            this.b.a(this);
        }
        return true;
    }
    
    h b(final ArrayList<h> list, h b) {
        int i = 0;
        h h = b;
        while (i < this.c.size()) {
            final a a = this.c.get(i);
            b = h;
            Label_0091: {
                switch (a.a) {
                    default: {
                        b = h;
                        break Label_0091;
                    }
                    case 8: {
                        b = null;
                        break Label_0091;
                    }
                    case 9: {
                        b = a.b;
                        break Label_0091;
                    }
                    case 3:
                    case 6: {
                        list.add(a.b);
                        b = h;
                        break Label_0091;
                    }
                    case 1:
                    case 7: {
                        list.remove(a.b);
                        b = h;
                    }
                    case 2:
                    case 4:
                    case 5: {
                        ++i;
                        h = b;
                        continue;
                    }
                }
            }
        }
        return h;
    }
    
    void b() {
        for (int size = this.c.size(), i = 0; i < size; ++i) {
            final a a = this.c.get(i);
            final h b = a.b;
            if (b != null) {
                b.a(this.h, this.i);
            }
            switch (a.a) {
                default: {
                    throw new IllegalArgumentException("Unknown cmd: " + a.a);
                }
                case 1: {
                    b.a(a.c);
                    this.b.a(b, false);
                    break;
                }
                case 3: {
                    b.a(a.d);
                    this.b.h(b);
                    break;
                }
                case 4: {
                    b.a(a.d);
                    this.b.i(b);
                    break;
                }
                case 5: {
                    b.a(a.c);
                    this.b.j(b);
                    break;
                }
                case 6: {
                    b.a(a.d);
                    this.b.k(b);
                    break;
                }
                case 7: {
                    b.a(a.c);
                    this.b.l(b);
                    break;
                }
                case 8: {
                    this.b.o(b);
                    break;
                }
                case 9: {
                    this.b.o(null);
                    break;
                }
            }
            if (!this.u && a.a != 1 && b != null) {
                this.b.e(b);
            }
        }
        if (!this.u) {
            this.b.a(this.b.l, true);
        }
    }
    
    boolean b(final int n) {
        for (int size = this.c.size(), i = 0; i < size; ++i) {
            final a a = this.c.get(i);
            int x;
            if (a.b != null) {
                x = a.b.x;
            }
            else {
                x = 0;
            }
            if (x != 0 && x == n) {
                return true;
            }
        }
        return false;
    }
    
    boolean c() {
        final boolean b = false;
        int n = 0;
        boolean b2;
        while (true) {
            b2 = b;
            if (n >= this.c.size()) {
                break;
            }
            if (b(this.c.get(n))) {
                b2 = true;
                break;
            }
            ++n;
        }
        return b2;
    }
    
    public String d() {
        return this.l;
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder(128);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.n >= 0) {
            sb.append(" #");
            sb.append(this.n);
        }
        if (this.l != null) {
            sb.append(" ");
            sb.append(this.l);
        }
        sb.append("}");
        return sb.toString();
    }
    
    static final class a
    {
        int a;
        h b;
        int c;
        int d;
        int e;
        int f;
        
        a() {
        }
        
        a(final int a, final h b) {
            this.a = a;
            this.b = b;
        }
    }
}
