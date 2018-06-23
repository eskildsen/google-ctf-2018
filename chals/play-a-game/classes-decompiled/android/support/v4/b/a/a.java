// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v4.b.a;

import android.util.Xml;
import android.util.Base64;
import android.content.res.TypedArray;
import java.util.Collections;
import java.util.ArrayList;
import java.util.List;
import org.xmlpull.v1.XmlPullParserException;
import android.content.res.Resources;
import org.xmlpull.v1.XmlPullParser;

public class a
{
    public static a a(final XmlPullParser xmlPullParser, final Resources resources) {
        int next;
        do {
            next = xmlPullParser.next();
        } while (next != 2 && next != 1);
        if (next != 2) {
            throw new XmlPullParserException("No start tag found");
        }
        return b(xmlPullParser, resources);
    }
    
    public static List<List<byte[]>> a(final Resources resources, int i) {
        List<List<byte[]>> list = null;
        final List<List<byte[]>> list2 = null;
        if (i != 0) {
            final TypedArray obtainTypedArray = resources.obtainTypedArray(i);
            list = list2;
            if (obtainTypedArray.length() > 0) {
                list = new ArrayList<List<byte[]>>();
                int n;
                if (obtainTypedArray.getResourceId(0, 0) != 0) {
                    n = 1;
                }
                else {
                    n = 0;
                }
                if (n != 0) {
                    for (i = 0; i < obtainTypedArray.length(); ++i) {
                        list.add(a(resources.getStringArray(obtainTypedArray.getResourceId(i, 0))));
                    }
                }
                else {
                    list.add(a(resources.getStringArray(i)));
                }
            }
            obtainTypedArray.recycle();
        }
        if (list != null) {
            return list;
        }
        return Collections.emptyList();
    }
    
    private static List<byte[]> a(final String[] array) {
        final ArrayList<byte[]> list = new ArrayList<byte[]>();
        for (int length = array.length, i = 0; i < length; ++i) {
            list.add(Base64.decode(array[i], 0));
        }
        return list;
    }
    
    private static void a(final XmlPullParser xmlPullParser) {
        int i = 1;
        while (i > 0) {
            switch (xmlPullParser.next()) {
                default: {
                    continue;
                }
                case 2: {
                    ++i;
                    continue;
                }
                case 3: {
                    --i;
                    continue;
                }
            }
        }
    }
    
    private static a b(final XmlPullParser xmlPullParser, final Resources resources) {
        xmlPullParser.require(2, (String)null, "font-family");
        if (xmlPullParser.getName().equals("font-family")) {
            return c(xmlPullParser, resources);
        }
        a(xmlPullParser);
        return null;
    }
    
    private static a c(final XmlPullParser xmlPullParser, final Resources resources) {
        final TypedArray obtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), a.a.FontFamily);
        final String string = obtainAttributes.getString(a.a.FontFamily_fontProviderAuthority);
        final String string2 = obtainAttributes.getString(a.a.FontFamily_fontProviderPackage);
        final String string3 = obtainAttributes.getString(a.a.FontFamily_fontProviderQuery);
        final int resourceId = obtainAttributes.getResourceId(a.a.FontFamily_fontProviderCerts, 0);
        final int integer = obtainAttributes.getInteger(a.a.FontFamily_fontProviderFetchStrategy, 1);
        final int integer2 = obtainAttributes.getInteger(a.a.FontFamily_fontProviderFetchTimeout, 500);
        obtainAttributes.recycle();
        if (string != null && string2 != null && string3 != null) {
            while (xmlPullParser.next() != 3) {
                a(xmlPullParser);
            }
            return (a)new d(new android.support.v4.f.a(string, string2, string3, a(resources, resourceId)), integer, integer2);
        }
        final ArrayList<c> list = new ArrayList<c>();
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                if (xmlPullParser.getName().equals("font")) {
                    list.add(d(xmlPullParser, resources));
                }
                else {
                    a(xmlPullParser);
                }
            }
        }
        if (list.isEmpty()) {
            return null;
        }
        return (a)new b((c[])list.toArray(new c[list.size()]));
    }
    
    private static c d(final XmlPullParser xmlPullParser, final Resources resources) {
        boolean b = true;
        final TypedArray obtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), a.a.FontFamilyFont);
        final int int1 = obtainAttributes.getInt(a.a.FontFamilyFont_fontWeight, 400);
        if (1 != obtainAttributes.getInt(a.a.FontFamilyFont_fontStyle, 0)) {
            b = false;
        }
        final int resourceId = obtainAttributes.getResourceId(a.a.FontFamilyFont_font, 0);
        final String string = obtainAttributes.getString(a.a.FontFamilyFont_font);
        obtainAttributes.recycle();
        while (xmlPullParser.next() != 3) {
            a(xmlPullParser);
        }
        return new c(string, int1, b, resourceId);
    }
    
    public interface a
    {
    }
    
    public static final class b implements a
    {
        private final c[] a;
        
        public b(final c[] a) {
            this.a = a;
        }
        
        public c[] a() {
            return this.a;
        }
    }
    
    public static final class c
    {
        private final String a;
        private int b;
        private boolean c;
        private int d;
        
        public c(final String a, final int b, final boolean c, final int d) {
            this.a = a;
            this.b = b;
            this.c = c;
            this.d = d;
        }
        
        public String a() {
            return this.a;
        }
        
        public int b() {
            return this.b;
        }
        
        public boolean c() {
            return this.c;
        }
        
        public int d() {
            return this.d;
        }
    }
    
    public static final class d implements a
    {
        private final android.support.v4.f.a a;
        private final int b;
        private final int c;
        
        public d(final android.support.v4.f.a a, final int c, final int b) {
            this.a = a;
            this.c = c;
            this.b = b;
        }
        
        public android.support.v4.f.a a() {
            return this.a;
        }
        
        public int b() {
            return this.c;
        }
        
        public int c() {
            return this.b;
        }
    }
}
