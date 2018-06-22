// 
// Decompiled by Procyon v0.5.30
// 

package android.support.b.a;

import android.graphics.PathMeasure;
import android.view.InflateException;
import android.support.v4.c.b;
import android.graphics.Path;
import android.content.res.TypedArray;
import android.support.v4.b.a.c;
import android.content.res.Resources$Theme;
import android.content.res.Resources;
import org.xmlpull.v1.XmlPullParser;
import android.util.AttributeSet;
import android.content.Context;
import android.view.animation.Interpolator;

public class g implements Interpolator
{
    private float[] a;
    private float[] b;
    
    public g(final Context context, final AttributeSet set, final XmlPullParser xmlPullParser) {
        this(context.getResources(), context.getTheme(), set, xmlPullParser);
    }
    
    public g(final Resources resources, final Resources$Theme resources$Theme, final AttributeSet set, final XmlPullParser xmlPullParser) {
        final TypedArray a = c.a(resources, resources$Theme, set, android.support.b.a.a.l);
        this.a(a, xmlPullParser);
        a.recycle();
    }
    
    private void a(final float n, final float n2) {
        final Path path = new Path();
        path.moveTo(0.0f, 0.0f);
        path.quadTo(n, n2, 1.0f, 1.0f);
        this.a(path);
    }
    
    private void a(final float n, final float n2, final float n3, final float n4) {
        final Path path = new Path();
        path.moveTo(0.0f, 0.0f);
        path.cubicTo(n, n2, n3, n4, 1.0f, 1.0f);
        this.a(path);
    }
    
    private void a(final TypedArray typedArray, final XmlPullParser xmlPullParser) {
        if (c.a(xmlPullParser, "pathData")) {
            final String a = c.a(typedArray, xmlPullParser, "pathData", 4);
            final Path a2 = android.support.v4.c.b.a(a);
            if (a2 == null) {
                throw new InflateException("The path is null, which is created from " + a);
            }
            this.a(a2);
        }
        else {
            if (!c.a(xmlPullParser, "controlX1")) {
                throw new InflateException("pathInterpolator requires the controlX1 attribute");
            }
            if (!c.a(xmlPullParser, "controlY1")) {
                throw new InflateException("pathInterpolator requires the controlY1 attribute");
            }
            final float a3 = c.a(typedArray, xmlPullParser, "controlX1", 0, 0.0f);
            final float a4 = c.a(typedArray, xmlPullParser, "controlY1", 1, 0.0f);
            final boolean a5 = c.a(xmlPullParser, "controlX2");
            if (a5 != c.a(xmlPullParser, "controlY2")) {
                throw new InflateException("pathInterpolator requires both controlX2 and controlY2 for cubic Beziers.");
            }
            if (!a5) {
                this.a(a3, a4);
                return;
            }
            this.a(a3, a4, c.a(typedArray, xmlPullParser, "controlX2", 2, 0.0f), c.a(typedArray, xmlPullParser, "controlY2", 3, 0.0f));
        }
    }
    
    private void a(final Path path) {
        int i = 0;
        final PathMeasure pathMeasure = new PathMeasure(path, false);
        final float length = pathMeasure.getLength();
        final int min = Math.min(3000, (int)(length / 0.002f) + 1);
        if (min <= 0) {
            throw new IllegalArgumentException("The Path has a invalid length " + length);
        }
        this.a = new float[min];
        this.b = new float[min];
        final float[] array = new float[2];
        for (int j = 0; j < min; ++j) {
            pathMeasure.getPosTan(j * length / (min - 1), array, (float[])null);
            this.a[j] = array[0];
            this.b[j] = array[1];
        }
        if (Math.abs(this.a[0]) > 1.0E-5 || Math.abs(this.b[0]) > 1.0E-5 || Math.abs(this.a[min - 1] - 1.0f) > 1.0E-5 || Math.abs(this.b[min - 1] - 1.0f) > 1.0E-5) {
            throw new IllegalArgumentException("The Path must start at (0,0) and end at (1,1) start: " + this.a[0] + "," + this.b[0] + " end:" + this.a[min - 1] + "," + this.b[min - 1]);
        }
        float n = 0.0f;
        float n3;
        for (int n2 = 0; i < min; ++i, n = n3, ++n2) {
            n3 = this.a[n2];
            if (n3 < n) {
                throw new IllegalArgumentException("The Path cannot loop back on itself, x :" + n3);
            }
            this.a[i] = n3;
        }
        if (pathMeasure.nextContour()) {
            throw new IllegalArgumentException("The Path should be continuous, can't have 2+ contours");
        }
    }
    
    public float getInterpolation(float n) {
        float n2 = 1.0f;
        if (n <= 0.0f) {
            n2 = 0.0f;
        }
        else if (n < 1.0f) {
            int n3 = 0;
            int n4 = this.a.length - 1;
            while (n4 - n3 > 1) {
                final int n5 = (n3 + n4) / 2;
                if (n < this.a[n5]) {
                    n4 = n5;
                }
                else {
                    n3 = n5;
                }
            }
            final float n6 = this.a[n4] - this.a[n3];
            if (n6 == 0.0f) {
                return this.b[n3];
            }
            n = (n - this.a[n3]) / n6;
            final float n7 = this.b[n3];
            return n * (this.b[n4] - n7) + n7;
        }
        return n2;
    }
}
