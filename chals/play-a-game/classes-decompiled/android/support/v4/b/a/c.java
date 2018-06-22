// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v4.b.a;

import android.util.TypedValue;
import android.util.AttributeSet;
import android.content.res.Resources$Theme;
import android.content.res.Resources;
import org.xmlpull.v1.XmlPullParser;
import android.content.res.TypedArray;

public class c
{
    public static float a(final TypedArray typedArray, final XmlPullParser xmlPullParser, final String s, final int n, final float n2) {
        if (!a(xmlPullParser, s)) {
            return n2;
        }
        return typedArray.getFloat(n, n2);
    }
    
    public static int a(final TypedArray typedArray, final XmlPullParser xmlPullParser, final String s, final int n, final int n2) {
        if (!a(xmlPullParser, s)) {
            return n2;
        }
        return typedArray.getInt(n, n2);
    }
    
    public static TypedArray a(final Resources resources, final Resources$Theme resources$Theme, final AttributeSet set, final int[] array) {
        if (resources$Theme == null) {
            return resources.obtainAttributes(set, array);
        }
        return resources$Theme.obtainStyledAttributes(set, array, 0, 0);
    }
    
    public static String a(final TypedArray typedArray, final XmlPullParser xmlPullParser, final String s, final int n) {
        if (!a(xmlPullParser, s)) {
            return null;
        }
        return typedArray.getString(n);
    }
    
    public static boolean a(final TypedArray typedArray, final XmlPullParser xmlPullParser, final String s, final int n, final boolean b) {
        if (!a(xmlPullParser, s)) {
            return b;
        }
        return typedArray.getBoolean(n, b);
    }
    
    public static boolean a(final XmlPullParser xmlPullParser, final String s) {
        return xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", s) != null;
    }
    
    public static int b(final TypedArray typedArray, final XmlPullParser xmlPullParser, final String s, final int n, final int n2) {
        if (!a(xmlPullParser, s)) {
            return n2;
        }
        return typedArray.getColor(n, n2);
    }
    
    public static TypedValue b(final TypedArray typedArray, final XmlPullParser xmlPullParser, final String s, final int n) {
        if (!a(xmlPullParser, s)) {
            return null;
        }
        return typedArray.peekValue(n);
    }
    
    public static int c(final TypedArray typedArray, final XmlPullParser xmlPullParser, final String s, final int n, final int n2) {
        if (!a(xmlPullParser, s)) {
            return n2;
        }
        return typedArray.getResourceId(n, n2);
    }
}
