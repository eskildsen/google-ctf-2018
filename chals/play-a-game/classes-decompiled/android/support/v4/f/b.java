// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v4.f;

import android.database.Cursor;
import android.support.v4.g.j;
import android.content.ContentUris;
import android.os.Build$VERSION;
import android.net.Uri$Builder;
import java.util.Arrays;
import android.support.v4.c.h;
import java.util.HashMap;
import java.nio.ByteBuffer;
import android.net.Uri;
import java.util.Map;
import android.content.pm.Signature;
import android.os.CancellationSignal;
import java.lang.ref.WeakReference;
import java.util.concurrent.Callable;
import android.widget.TextView;
import android.content.Context;
import java.util.Collection;
import java.util.List;
import java.util.Collections;
import android.content.pm.PackageManager$NameNotFoundException;
import android.content.pm.ProviderInfo;
import android.content.res.Resources;
import android.content.pm.PackageManager;
import java.util.Comparator;
import java.util.ArrayList;
import android.support.v4.g.k;
import android.graphics.Typeface;
import android.support.v4.g.g;

public class b
{
    private static final g<String, Typeface> a;
    private static final c b;
    private static final Object c;
    private static final k<String, ArrayList<c.a<Typeface>>> d;
    private static final Comparator<byte[]> e;
    
    static {
        a = new g<String, Typeface>(16);
        b = new c("fonts", 10, 10000);
        c = new Object();
        d = new k<String, ArrayList<c.a<Typeface>>>();
        e = new Comparator<byte[]>() {
            public int a(final byte[] array, final byte[] array2) {
                final boolean b = false;
                if (array.length == array2.length) {
                    int n = 0;
                    while (true) {
                        final int n2 = b ? 1 : 0;
                        if (n >= array.length) {
                            return n2;
                        }
                        if (array[n] != array2[n]) {
                            break;
                        }
                        ++n;
                    }
                    return array[n] - array2[n];
                }
                return array.length - array2.length;
            }
        };
    }
    
    public static ProviderInfo a(final PackageManager packageManager, final android.support.v4.f.a a, final Resources resources) {
        final String a2 = a.a();
        final ProviderInfo resolveContentProvider = packageManager.resolveContentProvider(a2, 0);
        if (resolveContentProvider == null) {
            throw new PackageManager$NameNotFoundException("No package found for authority: " + a2);
        }
        if (!resolveContentProvider.packageName.equals(a.b())) {
            throw new PackageManager$NameNotFoundException("Found content provider " + a2 + ", but package was not " + a.b());
        }
        final List<byte[]> a3 = a(packageManager.getPackageInfo(resolveContentProvider.packageName, 64).signatures);
        Collections.sort((List<Object>)a3, (Comparator<? super Object>)android.support.v4.f.b.e);
        final List<List<byte[]>> a4 = a(a, resources);
        for (int i = 0; i < a4.size(); ++i) {
            final ArrayList list = new ArrayList<byte[]>((Collection<? extends T>)a4.get(i));
            Collections.sort((List<E>)list, (Comparator<? super E>)android.support.v4.f.b.e);
            if (a(a3, (List<byte[]>)list)) {
                return resolveContentProvider;
            }
        }
        return null;
    }
    
    public static Typeface a(final Context context, final android.support.v4.f.a a, final TextView textView, int n, final int n2, final int n3) {
        final String string = a.f() + "-" + n3;
        final Typeface typeface = android.support.v4.f.b.a.a(string);
        if (typeface != null) {
            return typeface;
        }
        if (n == 0) {
            n = 1;
        }
        else {
            n = 0;
        }
        if (n != 0 && n2 == -1) {
            return b(context, a, n3);
        }
        final Callable<Typeface> callable = new Callable<Typeface>() {
            public Typeface a() {
                final Typeface a = b(context, a, n3);
                if (a != null) {
                    android.support.v4.f.b.a.a(string, a);
                }
                return a;
            }
        };
        if (n != 0) {
            try {
                return android.support.v4.f.b.b.a((Callable<Typeface>)callable, n2);
            }
            catch (InterruptedException ex) {
                return null;
            }
        }
        final c.a<Typeface> a2 = new c.a<Typeface>() {
            final /* synthetic */ WeakReference a = new WeakReference((T)textView);
            
            public void a(final Typeface typeface) {
                if (this.a.get() != null) {
                    textView.setTypeface(typeface, n3);
                }
            }
        };
        synchronized (android.support.v4.f.b.c) {
            if (android.support.v4.f.b.d.containsKey(string)) {
                android.support.v4.f.b.d.get(string).add(a2);
                return null;
            }
            final ArrayList<c.a<Typeface>> list = new ArrayList<c.a<Typeface>>();
            list.add(a2);
            android.support.v4.f.b.d.put(string, list);
            // monitorexit(b.c)
            android.support.v4.f.b.b.a((Callable<T>)callable, (c.a<T>)new c.a<Typeface>() {
                public void a(final Typeface typeface) {
                    synchronized (b.c) {
                        final ArrayList<c.a> list = b.d.get(string);
                        b.d.remove(string);
                        // monitorexit(b.b())
                        for (int i = 0; i < list.size(); ++i) {
                            list.get(i).a(typeface);
                        }
                    }
                }
            });
            return null;
        }
    }
    
    public static a a(final Context context, final CancellationSignal cancellationSignal, final android.support.v4.f.a a) {
        final ProviderInfo a2 = a(context.getPackageManager(), a, context.getResources());
        if (a2 == null) {
            return new a(1, null);
        }
        return new a(0, a(context, a, a2.authority, cancellationSignal));
    }
    
    private static List<List<byte[]>> a(final android.support.v4.f.a a, final Resources resources) {
        if (a.d() != null) {
            return a.d();
        }
        return android.support.v4.b.a.a.a(resources, a.e());
    }
    
    private static List<byte[]> a(final Signature[] array) {
        final ArrayList<byte[]> list = new ArrayList<byte[]>();
        for (int i = 0; i < array.length; ++i) {
            list.add(array[i].toByteArray());
        }
        return list;
    }
    
    public static Map<Uri, ByteBuffer> a(final Context context, final b[] array, final CancellationSignal cancellationSignal) {
        final HashMap<Uri, ByteBuffer> hashMap = new HashMap<Uri, ByteBuffer>();
        for (int length = array.length, i = 0; i < length; ++i) {
            final b b = array[i];
            if (b.e() == 0) {
                final Uri a = b.a();
                if (!hashMap.containsKey(a)) {
                    hashMap.put(a, h.a(context, cancellationSignal, a));
                }
            }
        }
        return (Map<Uri, ByteBuffer>)Collections.unmodifiableMap((Map<?, ?>)hashMap);
    }
    
    private static boolean a(final List<byte[]> list, final List<byte[]> list2) {
        if (list.size() == list2.size()) {
            for (int i = 0; i < list.size(); ++i) {
                if (!Arrays.equals(list.get(i), list2.get(i))) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }
    
    static b[] a(Context context, final android.support.v4.f.a a, final String s, final CancellationSignal cancellationSignal) {
        final ArrayList list = new ArrayList();
        final Uri build = new Uri$Builder().scheme("content").authority(s).build();
        final Uri build2 = new Uri$Builder().scheme("content").authority(s).appendPath("file").build();
        while (true) {
            try {
                if (Build$VERSION.SDK_INT > 16) {
                    context = (Context)context.getContentResolver().query(build, new String[] { "_id", "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code" }, "query = ?", new String[] { a.c() }, (String)null, cancellationSignal);
                }
                else {
                    context = (Context)context.getContentResolver().query(build, new String[] { "_id", "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code" }, "query = ?", new String[] { a.c() }, (String)null);
                }
                Object o2 = null;
                Label_0499: {
                    Label_0496: {
                        if (context != null) {
                            int columnIndex;
                            Object o = null;
                            int columnIndex2;
                            int columnIndex3 = 0;
                            int columnIndex4;
                            int columnIndex5;
                            int columnIndex6;
                            int int1;
                            int int2;
                            int int3;
                            boolean b;
                            Label_0275_Outer:Label_0295_Outer:Label_0311_Outer:Label_0332_Outer:
                            while (true) {
                                while (true) {
                                Label_0490:
                                    while (true) {
                                    Label_0482:
                                        while (true) {
                                        Label_0465:
                                            while (true) {
                                            Label_0459:
                                                while (true) {
                                                    Label_0453: {
                                                        try {
                                                            if (((Cursor)context).getCount() > 0) {
                                                                columnIndex = ((Cursor)context).getColumnIndex("result_code");
                                                                o = new ArrayList<b>();
                                                                columnIndex2 = ((Cursor)context).getColumnIndex("_id");
                                                                columnIndex3 = ((Cursor)context).getColumnIndex("file_id");
                                                                columnIndex4 = ((Cursor)context).getColumnIndex("font_ttc_index");
                                                                columnIndex5 = ((Cursor)context).getColumnIndex("font_weight");
                                                                columnIndex6 = ((Cursor)context).getColumnIndex("font_italic");
                                                                while (((Cursor)context).moveToNext()) {
                                                                    if (columnIndex == -1) {
                                                                        break Label_0453;
                                                                    }
                                                                    int1 = ((Cursor)context).getInt(columnIndex);
                                                                    if (columnIndex4 == -1) {
                                                                        break Label_0459;
                                                                    }
                                                                    int2 = ((Cursor)context).getInt(columnIndex4);
                                                                    if (columnIndex3 != -1) {
                                                                        break Label_0465;
                                                                    }
                                                                    o2 = ContentUris.withAppendedId(build, ((Cursor)context).getLong(columnIndex2));
                                                                    if (columnIndex5 == -1) {
                                                                        break Label_0482;
                                                                    }
                                                                    int3 = ((Cursor)context).getInt(columnIndex5);
                                                                    if (columnIndex6 == -1 || ((Cursor)context).getInt(columnIndex6) != 1) {
                                                                        break Label_0490;
                                                                    }
                                                                    b = true;
                                                                    ((ArrayList<b>)o).add(new b((Uri)o2, int2, int3, b, int1));
                                                                }
                                                                break Label_0499;
                                                            }
                                                            break Label_0496;
                                                        }
                                                        finally {
                                                            o2 = context;
                                                            context = (Context)o;
                                                        }
                                                        break;
                                                    }
                                                    int1 = 0;
                                                    continue Label_0275_Outer;
                                                }
                                                int2 = 0;
                                                continue Label_0295_Outer;
                                            }
                                            o2 = ContentUris.withAppendedId(build2, ((Cursor)context).getLong(columnIndex3));
                                            continue Label_0311_Outer;
                                        }
                                        int3 = 400;
                                        continue Label_0332_Outer;
                                    }
                                    b = false;
                                    continue;
                                }
                            }
                            if (o2 != null) {
                                ((Cursor)o2).close();
                            }
                            throw context;
                        }
                    }
                    o2 = list;
                }
                if (context != null) {
                    ((Cursor)context).close();
                }
                return (b[])((ArrayList)o2).toArray(new b[0]);
            }
            finally {
                final Object o2 = null;
                continue;
            }
            break;
        }
    }
    
    private static Typeface b(final Context context, final android.support.v4.f.a a, final int n) {
        final Typeface typeface = null;
        try {
            final a a2 = a(context, null, a);
            Typeface a3 = typeface;
            if (a2.a() == 0) {
                a3 = android.support.v4.c.c.a(context, null, a2.b(), n);
            }
            return a3;
        }
        catch (PackageManager$NameNotFoundException ex) {
            return null;
        }
    }
    
    public static class a
    {
        private final int a;
        private final b[] b;
        
        public a(final int a, final b[] b) {
            this.a = a;
            this.b = b;
        }
        
        public int a() {
            return this.a;
        }
        
        public b[] b() {
            return this.b;
        }
    }
    
    public static class b
    {
        private final Uri a;
        private final int b;
        private final int c;
        private final boolean d;
        private final int e;
        
        public b(final Uri uri, final int b, final int c, final boolean d, final int e) {
            this.a = j.a(uri);
            this.b = b;
            this.c = c;
            this.d = d;
            this.e = e;
        }
        
        public Uri a() {
            return this.a;
        }
        
        public int b() {
            return this.b;
        }
        
        public int c() {
            return this.c;
        }
        
        public boolean d() {
            return this.d;
        }
        
        public int e() {
            return this.e;
        }
    }
}
