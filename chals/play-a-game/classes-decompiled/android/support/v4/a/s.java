// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v4.a;

import java.util.List;
import android.support.v4.h.p;
import android.os.Build$VERSION;
import java.util.Map;
import android.graphics.Rect;
import java.util.Collection;
import android.view.ViewGroup;
import android.view.View;
import android.support.v4.g.a;
import java.util.ArrayList;
import android.util.SparseArray;

class s
{
    private static final int[] a;
    
    static {
        a = new int[] { 0, 3, 0, 1, 5, 4, 7, 6, 9, 8 };
    }
    
    private static a a(final a a, final SparseArray<a> sparseArray, final int n) {
        a a2 = a;
        if (a == null) {
            a2 = new a();
            sparseArray.put(n, (Object)a2);
        }
        return a2;
    }
    
    private static android.support.v4.g.a<String, String> a(final int n, final ArrayList<c> list, final ArrayList<Boolean> list2, final int n2, int i) {
        final android.support.v4.g.a<Object, String> a = new android.support.v4.g.a<Object, String>();
        c c;
        boolean booleanValue;
        int size;
        ArrayList<String> list3;
        ArrayList<String> list4;
        int j;
        String s;
        String s2;
        String s3;
        for (--i; i >= n2; --i) {
            c = list.get(i);
            if (c.b(n)) {
                booleanValue = list2.get(i);
                if (c.s != null) {
                    size = c.s.size();
                    if (booleanValue) {
                        list3 = c.s;
                        list4 = c.t;
                    }
                    else {
                        list4 = c.s;
                        list3 = c.t;
                    }
                    for (j = 0; j < size; ++j) {
                        s = list4.get(j);
                        s2 = list3.get(j);
                        s3 = a.remove(s2);
                        if (s3 != null) {
                            a.put(s, s3);
                        }
                        else {
                            a.put(s, s2);
                        }
                    }
                }
            }
        }
        return (android.support.v4.g.a<String, String>)a;
    }
    
    private static Object a(final h h, final h h2, final boolean b) {
        if (h == null || h2 == null) {
            return null;
        }
        Object o;
        if (b) {
            o = h2.x();
        }
        else {
            o = h.w();
        }
        return t.b(t.a(o));
    }
    
    private static Object a(final h h, final boolean b) {
        if (h == null) {
            return null;
        }
        Object o;
        if (b) {
            o = h.v();
        }
        else {
            o = h.s();
        }
        return t.a(o);
    }
    
    private static Object a(final ViewGroup viewGroup, View b, final android.support.v4.g.a<String, String> a, final a a2, final ArrayList<View> list, final ArrayList<View> list2, final Object o, final Object o2) {
        final View view = null;
        final h a3 = a2.a;
        final h d = a2.d;
        if (a3 != null) {
            a3.i().setVisibility(0);
        }
        if (a3 != null && d != null) {
            final boolean b2 = a2.b;
            Object a4;
            if (a.isEmpty()) {
                a4 = null;
            }
            else {
                a4 = a(a3, d, b2);
            }
            final android.support.v4.g.a<String, View> b3 = b(a, a4, a2);
            final android.support.v4.g.a<String, View> c = c(a, a4, a2);
            Object o3;
            if (a.isEmpty()) {
                if (b3 != null) {
                    b3.clear();
                }
                if (c != null) {
                    c.clear();
                    o3 = null;
                }
                else {
                    o3 = null;
                }
            }
            else {
                a(list, b3, a.keySet());
                a(list2, c, a.values());
                o3 = a4;
            }
            if (o != null || o2 != null || o3 != null) {
                b(a3, d, b2, b3, true);
                Rect rect2;
                if (o3 != null) {
                    list2.add(b);
                    t.a(o3, b, list);
                    a(o3, o2, b3, a2.e, a2.f);
                    final Rect rect = new Rect();
                    final View view2 = b = b(c, a2, o, b2);
                    rect2 = rect;
                    if (view2 != null) {
                        t.a(o, rect);
                        rect2 = rect;
                        b = view2;
                    }
                }
                else {
                    rect2 = null;
                    b = view;
                }
                x.a((View)viewGroup, new Runnable() {
                    @Override
                    public void run() {
                        b(a3, d, b2, c, false);
                        if (b != null) {
                            t.a(b, rect2);
                        }
                    }
                });
                return o3;
            }
        }
        return null;
    }
    
    private static Object a(final Object o, final Object o2, final Object o3, final h h, final boolean b) {
        boolean b3;
        final boolean b2 = b3 = true;
        if (o != null) {
            b3 = b2;
            if (o2 != null) {
                b3 = b2;
                if (h != null) {
                    if (b) {
                        b3 = h.z();
                    }
                    else {
                        b3 = h.y();
                    }
                }
            }
        }
        if (b3) {
            return t.a(o2, o, o3);
        }
        return t.b(o2, o, o3);
    }
    
    private static String a(final android.support.v4.g.a<String, String> a, final String s) {
        for (int size = a.size(), i = 0; i < size; ++i) {
            if (s.equals(a.c(i))) {
                return a.b(i);
            }
        }
        return null;
    }
    
    private static void a(final c c, final c.a a, final SparseArray<a> sparseArray, final boolean b, final boolean b2) {
        final h b3 = a.b;
        if (b3 != null) {
            final int x = b3.x;
            if (x != 0) {
                int a2;
                if (b) {
                    a2 = s.a[a.a];
                }
                else {
                    a2 = a.a;
                }
                boolean b4 = false;
                int n = 0;
                boolean b5 = false;
                int n2 = 0;
                switch (a2) {
                    default: {
                        b4 = false;
                        n = 0;
                        b5 = false;
                        n2 = 0;
                        break;
                    }
                    case 5: {
                        if (b2) {
                            if (b3.Q && !b3.z && b3.k) {
                                n2 = 1;
                            }
                            else {
                                n2 = 0;
                            }
                        }
                        else {
                            n2 = (b3.z ? 1 : 0);
                        }
                        b4 = true;
                        n = 0;
                        b5 = false;
                        break;
                    }
                    case 1:
                    case 7: {
                        if (b2) {
                            n2 = (b3.P ? 1 : 0);
                        }
                        else if (!b3.k && !b3.z) {
                            n2 = 1;
                        }
                        else {
                            n2 = 0;
                        }
                        b4 = true;
                        n = 0;
                        b5 = false;
                        break;
                    }
                    case 4: {
                        int n3;
                        if (b2) {
                            if (b3.Q && b3.k && b3.z) {
                                n3 = 1;
                            }
                            else {
                                n3 = 0;
                            }
                        }
                        else if (b3.k && !b3.z) {
                            n3 = 1;
                        }
                        else {
                            n3 = 0;
                        }
                        final boolean b6 = false;
                        n = n3;
                        b5 = true;
                        n2 = 0;
                        b4 = b6;
                        break;
                    }
                    case 3:
                    case 6: {
                        int n4;
                        if (b2) {
                            if (!b3.k && b3.H != null && b3.H.getVisibility() == 0 && b3.R >= 0.0f) {
                                n4 = 1;
                            }
                            else {
                                n4 = 0;
                            }
                        }
                        else if (b3.k && !b3.z) {
                            n4 = 1;
                        }
                        else {
                            n4 = 0;
                        }
                        final boolean b7 = false;
                        n = n4;
                        b5 = true;
                        n2 = 0;
                        b4 = b7;
                        break;
                    }
                }
                a a3 = (a)sparseArray.get(x);
                if (n2 != 0) {
                    a3 = a(a3, sparseArray, x);
                    a3.a = b3;
                    a3.b = b;
                    a3.c = c;
                }
                if (!b2 && b4) {
                    if (a3 != null && a3.d == b3) {
                        a3.d = null;
                    }
                    final n b8 = c.b;
                    if (b3.b < 1 && b8.l >= 1 && !c.u) {
                        b8.f(b3);
                        b8.a(b3, 1, 0, 0, false);
                    }
                }
                a a5;
                if (n != 0 && (a3 == null || a3.d == null)) {
                    final a a4 = a(a3, sparseArray, x);
                    a4.d = b3;
                    a4.e = b;
                    a4.f = c;
                    a5 = a4;
                }
                else {
                    a5 = a3;
                }
                if (!b2 && b5 && a5 != null && a5.a == b3) {
                    a5.a = null;
                }
            }
        }
    }
    
    public static void a(final c c, final SparseArray<a> sparseArray, final boolean b) {
        for (int size = c.c.size(), i = 0; i < size; ++i) {
            a(c, c.c.get(i), sparseArray, false, b);
        }
    }
    
    private static void a(final n n, final int n2, final a a, final View view, final android.support.v4.g.a<String, String> a2) {
        Object o = null;
        if (n.n.a()) {
            o = n.n.a(n2);
        }
        if (o != null) {
            final h a3 = a.a;
            final h d = a.d;
            final boolean b = a.b;
            final boolean e = a.e;
            final ArrayList<View> list = new ArrayList<View>();
            final ArrayList<View> list2 = new ArrayList<View>();
            final Object a4 = a(a3, b);
            final Object b2 = b(d, e);
            final Object a5 = a((ViewGroup)o, view, a2, a, list2, list, a4, b2);
            if (a4 != null || a5 != null || b2 != null) {
                final ArrayList<View> b3 = b(b2, d, list2, view);
                final ArrayList<View> b4 = b(a4, a3, list, view);
                b(b4, 4);
                final Object a6 = a(a4, b2, a5, a3, b);
                if (a6 != null) {
                    a(b2, d, b3);
                    final ArrayList<String> a7 = t.a(list);
                    t.a(a6, a4, b4, b2, b3, a5, list);
                    t.a((ViewGroup)o, a6);
                    t.a((View)o, list2, list, a7, a2);
                    b(b4, 0);
                    t.a(a5, list2, list);
                }
            }
        }
    }
    
    static void a(final n n, final ArrayList<c> list, final ArrayList<Boolean> list2, final int n2, final int n3, final boolean b) {
        if (n.l >= 1 && Build$VERSION.SDK_INT >= 21) {
            final SparseArray sparseArray = new SparseArray();
            for (int i = n2; i < n3; ++i) {
                final c c = list.get(i);
                if (list2.get(i)) {
                    b(c, (SparseArray<a>)sparseArray, b);
                }
                else {
                    a(c, (SparseArray<a>)sparseArray, b);
                }
            }
            if (sparseArray.size() != 0) {
                final View view = new View(n.m.g());
                for (int size = sparseArray.size(), j = 0; j < size; ++j) {
                    final int key = sparseArray.keyAt(j);
                    final android.support.v4.g.a<String, String> a = a(key, list, list2, n2, n3);
                    final a a2 = (a)sparseArray.valueAt(j);
                    if (b) {
                        a(n, key, a2, view, a);
                    }
                    else {
                        b(n, key, a2, view, a);
                    }
                }
            }
        }
    }
    
    private static void a(final android.support.v4.g.a<String, String> a, final android.support.v4.g.a<String, View> a2) {
        for (int i = a.size() - 1; i >= 0; --i) {
            if (!a2.containsKey(a.c(i))) {
                a.d(i);
            }
        }
    }
    
    private static void a(final ViewGroup viewGroup, final h h, final View view, final ArrayList<View> list, final Object o, final ArrayList<View> list2, final Object o2, final ArrayList<View> list3) {
        x.a((View)viewGroup, new Runnable() {
            @Override
            public void run() {
                if (o != null) {
                    t.c(o, view);
                    list2.addAll(b(o, h, list, view));
                }
                if (list3 != null) {
                    if (o2 != null) {
                        final ArrayList<View> list = new ArrayList<View>();
                        list.add(view);
                        t.b(o2, list3, list);
                    }
                    list3.clear();
                    list3.add(view);
                }
            }
        });
    }
    
    private static void a(final Object o, final h h, final ArrayList<View> list) {
        if (h != null && o != null && h.k && h.z && h.Q) {
            h.f(true);
            t.b(o, h.i(), list);
            x.a((View)h.G, new Runnable() {
                @Override
                public void run() {
                    b(list, 4);
                }
            });
        }
    }
    
    private static void a(final Object o, final Object o2, final android.support.v4.g.a<String, View> a, final boolean b, final c c) {
        if (c.s != null && !c.s.isEmpty()) {
            String s;
            if (b) {
                s = c.t.get(0);
            }
            else {
                s = c.s.get(0);
            }
            final View view = a.get(s);
            t.a(o, view);
            if (o2 != null) {
                t.a(o2, view);
            }
        }
    }
    
    private static void a(final ArrayList<View> list, final android.support.v4.g.a<String, View> a, final Collection<String> collection) {
        for (int i = a.size() - 1; i >= 0; --i) {
            final View view = a.c(i);
            if (collection.contains(p.e(view))) {
                list.add(view);
            }
        }
    }
    
    private static android.support.v4.g.a<String, View> b(final android.support.v4.g.a<String, String> a, final Object o, final a a2) {
        if (a.isEmpty() || o == null) {
            a.clear();
            return null;
        }
        final h d = a2.d;
        final android.support.v4.g.a<Object, Object> a3 = new android.support.v4.g.a<Object, Object>();
        t.a((Map<String, View>)a3, d.i());
        final c f = a2.f;
        y y;
        ArrayList<String> list;
        if (a2.e) {
            y = d.P();
            list = f.t;
        }
        else {
            y = d.Q();
            list = f.s;
        }
        a3.a(list);
        if (y != null) {
            y.a(list, (Map<String, View>)a3);
            for (int i = list.size() - 1; i >= 0; --i) {
                final String s = list.get(i);
                final View view = a3.get(s);
                if (view == null) {
                    a.remove(s);
                }
                else if (!s.equals(p.e(view))) {
                    a.put(p.e(view), a.remove(s));
                }
            }
        }
        else {
            a.a(a3.keySet());
        }
        return (android.support.v4.g.a<String, View>)a3;
    }
    
    private static View b(final android.support.v4.g.a<String, View> a, final a a2, final Object o, final boolean b) {
        final c c = a2.c;
        if (o != null && a != null && c.s != null && !c.s.isEmpty()) {
            String s;
            if (b) {
                s = c.s.get(0);
            }
            else {
                s = c.t.get(0);
            }
            return a.get(s);
        }
        return null;
    }
    
    private static Object b(final h h, final boolean b) {
        if (h == null) {
            return null;
        }
        Object o;
        if (b) {
            o = h.t();
        }
        else {
            o = h.u();
        }
        return t.a(o);
    }
    
    private static Object b(final ViewGroup viewGroup, final View view, final android.support.v4.g.a<String, String> a, final a a2, final ArrayList<View> list, final ArrayList<View> list2, final Object o, Object o2) {
        final h a3 = a2.a;
        final h d = a2.d;
        if (a3 == null || d == null) {
            return null;
        }
        final boolean b = a2.b;
        Object a4;
        if (a.isEmpty()) {
            a4 = null;
        }
        else {
            a4 = a(a3, d, b);
        }
        final android.support.v4.g.a<String, View> b2 = b(a, a4, a2);
        if (a.isEmpty()) {
            a4 = null;
        }
        else {
            list.addAll(b2.values());
        }
        if (o == null && o2 == null && a4 == null) {
            return null;
        }
        b(a3, d, b, b2, true);
        if (a4 != null) {
            final Rect rect = new Rect();
            t.a(a4, view, list);
            a(a4, o2, b2, a2.e, a2.f);
            o2 = rect;
            if (o != null) {
                t.a(o, rect);
                o2 = rect;
            }
        }
        else {
            o2 = null;
        }
        x.a((View)viewGroup, new Runnable() {
            @Override
            public void run() {
                final android.support.v4.g.a a = c(a, a4, a2);
                if (a != null) {
                    list2.addAll(a.values());
                    list2.add(view);
                }
                b(a3, d, b, a, false);
                if (a4 != null) {
                    t.a(a4, list, list2);
                    final View a2 = b(a, a2, o, b);
                    if (a2 != null) {
                        t.a(a2, o2);
                    }
                }
            }
        });
        return a4;
    }
    
    private static ArrayList<View> b(final Object o, final h h, final ArrayList<View> list, final View view) {
        ArrayList<View> list2 = null;
        if (o != null) {
            final ArrayList<View> list3 = new ArrayList<View>();
            final View i = h.i();
            if (i != null) {
                t.a(list3, i);
            }
            if (list != null) {
                list3.removeAll(list);
            }
            list2 = list3;
            if (!list3.isEmpty()) {
                list3.add(view);
                t.a(o, list3);
                list2 = list3;
            }
        }
        return list2;
    }
    
    public static void b(final c c, final SparseArray<a> sparseArray, final boolean b) {
        if (c.b.n.a()) {
            for (int i = c.c.size() - 1; i >= 0; --i) {
                a(c, c.c.get(i), sparseArray, true, b);
            }
        }
    }
    
    private static void b(final h h, final h h2, final boolean b, final android.support.v4.g.a<String, View> a, final boolean b2) {
        int i = 0;
        y y;
        if (b) {
            y = h2.P();
        }
        else {
            y = h.P();
        }
        if (y != null) {
            final ArrayList<View> list = new ArrayList<View>();
            final ArrayList<String> list2 = new ArrayList<String>();
            int size;
            if (a == null) {
                size = 0;
            }
            else {
                size = a.size();
            }
            while (i < size) {
                list2.add(a.b(i));
                list.add(a.c(i));
                ++i;
            }
            if (!b2) {
                y.b(list2, list, null);
                return;
            }
            y.a(list2, list, null);
        }
    }
    
    private static void b(final n n, final int n2, final a a, final View view, final android.support.v4.g.a<String, String> a2) {
        Object o = null;
        if (n.n.a()) {
            o = n.n.a(n2);
        }
        if (o != null) {
            final h a3 = a.a;
            final h d = a.d;
            final boolean b = a.b;
            final boolean e = a.e;
            final Object a4 = a(a3, b);
            Object b2 = b(d, e);
            final ArrayList<View> list = new ArrayList<View>();
            final ArrayList<View> list2 = new ArrayList<View>();
            final Object b3 = b((ViewGroup)o, view, a2, a, list, list2, a4, b2);
            if (a4 != null || b3 != null || b2 != null) {
                final ArrayList<View> b4 = b(b2, d, list, view);
                if (b4 == null || b4.isEmpty()) {
                    b2 = null;
                }
                t.b(a4, view);
                final Object a5 = a(a4, b2, b3, a3, a.b);
                if (a5 != null) {
                    final ArrayList<View> list3 = new ArrayList<View>();
                    t.a(a5, a4, list3, b2, b4, b3, list2);
                    a((ViewGroup)o, a3, view, list2, a4, list3, b2, b4);
                    t.a((View)o, list2, a2);
                    t.a((ViewGroup)o, a5);
                    t.a((ViewGroup)o, list2, a2);
                }
            }
        }
    }
    
    private static void b(final ArrayList<View> list, final int visibility) {
        if (list != null) {
            for (int i = list.size() - 1; i >= 0; --i) {
                list.get(i).setVisibility(visibility);
            }
        }
    }
    
    private static android.support.v4.g.a<String, View> c(final android.support.v4.g.a<String, String> a, final Object o, final a a2) {
        final h a3 = a2.a;
        final View i = a3.i();
        if (a.isEmpty() || o == null || i == null) {
            a.clear();
            return null;
        }
        final android.support.v4.g.a<Object, View> a4 = new android.support.v4.g.a<Object, View>();
        t.a((Map<String, View>)a4, i);
        final c c = a2.c;
        y y;
        ArrayList<String> list;
        if (a2.b) {
            y = a3.Q();
            list = c.s;
        }
        else {
            y = a3.P();
            list = c.t;
        }
        if (list != null) {
            a4.a(list);
        }
        if (y != null) {
            y.a(list, (Map<String, View>)a4);
            for (int j = list.size() - 1; j >= 0; --j) {
                final String s = list.get(j);
                final View view = a4.get(s);
                if (view == null) {
                    final String a5 = a(a, s);
                    if (a5 != null) {
                        a.remove(a5);
                    }
                }
                else if (!s.equals(p.e(view))) {
                    final String a6 = a(a, s);
                    if (a6 != null) {
                        a.put(a6, p.e(view));
                    }
                }
            }
        }
        else {
            a(a, (android.support.v4.g.a<String, View>)a4);
        }
        return (android.support.v4.g.a<String, View>)a4;
    }
    
    static class a
    {
        public h a;
        public boolean b;
        public c c;
        public h d;
        public boolean e;
        public c f;
    }
}
