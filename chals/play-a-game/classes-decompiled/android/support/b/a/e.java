// 
// Decompiled by Procyon v0.5.30
// 

package android.support.b.a;

import android.graphics.PathMeasure;
import android.graphics.Path;
import android.view.InflateException;
import android.support.v4.c.b;
import android.animation.TypeEvaluator;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.animation.Keyframe;
import android.animation.PropertyValuesHolder;
import java.util.Iterator;
import java.util.ArrayList;
import android.animation.ValueAnimator;
import android.animation.AnimatorSet;
import android.util.Xml;
import android.content.res.XmlResourceParser;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;
import android.content.res.Resources$NotFoundException;
import android.animation.AnimatorInflater;
import android.os.Build$VERSION;
import android.animation.Animator;
import android.content.Context;
import android.util.TypedValue;
import android.content.res.TypedArray;
import android.support.v4.b.a.c;
import org.xmlpull.v1.XmlPullParser;
import android.util.AttributeSet;
import android.content.res.Resources$Theme;
import android.content.res.Resources;

public class e
{
    private static int a(final Resources resources, final Resources$Theme resources$Theme, final AttributeSet set, final XmlPullParser xmlPullParser) {
        final boolean b = false;
        final TypedArray a = c.a(resources, resources$Theme, set, android.support.b.a.a.j);
        final TypedValue b2 = c.b(a, xmlPullParser, "value", 0);
        int n;
        if (b2 != null) {
            n = 1;
        }
        else {
            n = 0;
        }
        int n2 = b ? 1 : 0;
        if (n != 0) {
            n2 = (b ? 1 : 0);
            if (a(b2.type)) {
                n2 = 3;
            }
        }
        a.recycle();
        return n2;
    }
    
    private static int a(final TypedArray typedArray, int n, int n2) {
        final int n3 = 0;
        final TypedValue peekValue = typedArray.peekValue(n);
        if (peekValue != null) {
            n = 1;
        }
        else {
            n = 0;
        }
        int type;
        if (n != 0) {
            type = peekValue.type;
        }
        else {
            type = 0;
        }
        final TypedValue peekValue2 = typedArray.peekValue(n2);
        if (peekValue2 != null) {
            n2 = 1;
        }
        else {
            n2 = 0;
        }
        int type2;
        if (n2 != 0) {
            type2 = peekValue2.type;
        }
        else {
            type2 = 0;
        }
        if (n == 0 || !a(type)) {
            n = n3;
            if (n2 == 0) {
                return n;
            }
            n = n3;
            if (!a(type2)) {
                return n;
            }
        }
        n = 3;
        return n;
    }
    
    public static Animator a(final Context context, final int n) {
        if (Build$VERSION.SDK_INT >= 24) {
            return AnimatorInflater.loadAnimator(context, n);
        }
        return a(context, context.getResources(), context.getTheme(), n);
    }
    
    public static Animator a(final Context context, final Resources resources, final Resources$Theme resources$Theme, final int n) {
        return a(context, resources, resources$Theme, n, 1.0f);
    }
    
    public static Animator a(final Context context, final Resources resources, final Resources$Theme resources$Theme, final int n, final float n2) {
        XmlResourceParser xmlResourceParser = null;
        XmlResourceParser xmlResourceParser2 = null;
        XmlResourceParser animation = null;
        try {
            return a(context, resources, resources$Theme, (XmlPullParser)(xmlResourceParser2 = (xmlResourceParser = (animation = resources.getAnimation(n)))), n2);
        }
        catch (XmlPullParserException ex2) {
            xmlResourceParser = animation;
            final Resources$NotFoundException ex = new Resources$NotFoundException("Can't load animation resource ID #0x" + Integer.toHexString(n));
            xmlResourceParser = animation;
            ex.initCause((Throwable)ex2);
            xmlResourceParser = animation;
            throw ex;
        }
        catch (IOException ex4) {
            xmlResourceParser = xmlResourceParser2;
            final Resources$NotFoundException ex3 = new Resources$NotFoundException("Can't load animation resource ID #0x" + Integer.toHexString(n));
            xmlResourceParser = xmlResourceParser2;
            ex3.initCause((Throwable)ex4);
            xmlResourceParser = xmlResourceParser2;
            throw ex3;
        }
        finally {
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
        }
    }
    
    private static Animator a(final Context context, final Resources resources, final Resources$Theme resources$Theme, final XmlPullParser xmlPullParser, final float n) {
        return a(context, resources, resources$Theme, xmlPullParser, Xml.asAttributeSet(xmlPullParser), null, 0, n);
    }
    
    private static Animator a(final Context context, final Resources resources, final Resources$Theme resources$Theme, final XmlPullParser xmlPullParser, final AttributeSet set, final AnimatorSet set2, final int n, final float n2) {
        Object o = null;
        ArrayList<AnimatorSet> list = null;
        final int depth = xmlPullParser.getDepth();
        while (true) {
            final int next = xmlPullParser.next();
            if ((next == 3 && xmlPullParser.getDepth() <= depth) || next == 1) {
                if (set2 != null && list != null) {
                    final Animator[] array = new Animator[list.size()];
                    final Iterator<AnimatorSet> iterator = list.iterator();
                    int n3 = 0;
                    while (iterator.hasNext()) {
                        array[n3] = (Animator)iterator.next();
                        ++n3;
                    }
                    if (n != 0) {
                        set2.playSequentially(array);
                        return (Animator)o;
                    }
                    set2.playTogether(array);
                }
                return (Animator)o;
            }
            if (next != 2) {
                continue;
            }
            final String name = xmlPullParser.getName();
            Object o2;
            int n4;
            if (name.equals("objectAnimator")) {
                o2 = a(context, resources, resources$Theme, set, n2, xmlPullParser);
                n4 = 0;
            }
            else if (name.equals("animator")) {
                o2 = a(context, resources, resources$Theme, set, null, n2, xmlPullParser);
                n4 = 0;
            }
            else if (name.equals("set")) {
                o2 = new AnimatorSet();
                final TypedArray a = c.a(resources, resources$Theme, set, android.support.b.a.a.h);
                a(context, resources, resources$Theme, xmlPullParser, set, (AnimatorSet)o2, c.a(a, xmlPullParser, "ordering", 0, 0), n2);
                a.recycle();
                n4 = 0;
            }
            else {
                if (!name.equals("propertyValuesHolder")) {
                    throw new RuntimeException("Unknown animator name: " + xmlPullParser.getName());
                }
                final PropertyValuesHolder[] a2 = a(context, resources, resources$Theme, xmlPullParser, Xml.asAttributeSet(xmlPullParser));
                if (a2 != null && o != null && o instanceof ValueAnimator) {
                    ((ValueAnimator)o).setValues(a2);
                }
                n4 = 1;
                o2 = o;
            }
            o = o2;
            if (set2 == null) {
                continue;
            }
            o = o2;
            if (n4 != 0) {
                continue;
            }
            if (list == null) {
                list = new ArrayList<AnimatorSet>();
            }
            list.add((AnimatorSet)o2);
            o = o2;
        }
    }
    
    private static Keyframe a(final Keyframe keyframe, final float n) {
        if (keyframe.getType() == Float.TYPE) {
            return Keyframe.ofFloat(n);
        }
        if (keyframe.getType() == Integer.TYPE) {
            return Keyframe.ofInt(n);
        }
        return Keyframe.ofObject(n);
    }
    
    private static Keyframe a(final Context context, final Resources resources, final Resources$Theme resources$Theme, final AttributeSet set, int c, final XmlPullParser xmlPullParser) {
        final TypedArray a = c.a(resources, resources$Theme, set, android.support.b.a.a.j);
        final Keyframe keyframe = null;
        final float a2 = c.a(a, xmlPullParser, "fraction", 3, -1.0f);
        final TypedValue b = c.b(a, xmlPullParser, "value", 0);
        boolean b2;
        if (b != null) {
            b2 = true;
        }
        else {
            b2 = false;
        }
        int n = c;
        if (c == 4) {
            if (b2 && a(b.type)) {
                n = 3;
            }
            else {
                n = 0;
            }
        }
        Keyframe keyframe2;
        if (b2) {
            keyframe2 = keyframe;
            switch (n) {
                default: {
                    keyframe2 = keyframe;
                    break;
                }
                case 1:
                case 3: {
                    keyframe2 = Keyframe.ofInt(a2, c.a(a, xmlPullParser, "value", 0, 0));
                    break;
                }
                case 0: {
                    keyframe2 = Keyframe.ofFloat(a2, c.a(a, xmlPullParser, "value", 0, 0.0f));
                }
                case 2: {
                    break;
                }
            }
        }
        else if (n == 0) {
            keyframe2 = Keyframe.ofFloat(a2);
        }
        else {
            keyframe2 = Keyframe.ofInt(a2);
        }
        c = c.c(a, xmlPullParser, "interpolator", 1, 0);
        if (c > 0) {
            keyframe2.setInterpolator((TimeInterpolator)d.a(context, c));
        }
        a.recycle();
        return keyframe2;
    }
    
    private static ObjectAnimator a(final Context context, final Resources resources, final Resources$Theme resources$Theme, final AttributeSet set, final float n, final XmlPullParser xmlPullParser) {
        final ObjectAnimator objectAnimator = new ObjectAnimator();
        a(context, resources, resources$Theme, set, (ValueAnimator)objectAnimator, n, xmlPullParser);
        return objectAnimator;
    }
    
    private static PropertyValuesHolder a(final Context context, final Resources resources, final Resources$Theme resources$Theme, final XmlPullParser xmlPullParser, final String s, int i) {
        ArrayList<Keyframe> list = null;
        int n = i;
        while (true) {
            i = xmlPullParser.next();
            if (i == 3 || i == 1) {
                break;
            }
            if (xmlPullParser.getName().equals("keyframe")) {
                if ((i = n) == 4) {
                    i = a(resources, resources$Theme, Xml.asAttributeSet(xmlPullParser), xmlPullParser);
                }
                final Keyframe a = a(context, resources, resources$Theme, Xml.asAttributeSet(xmlPullParser), i, xmlPullParser);
                if (a != null) {
                    if (list == null) {
                        list = new ArrayList<Keyframe>();
                    }
                    list.add(a);
                }
                xmlPullParser.next();
            }
            else {
                i = n;
            }
            n = i;
        }
        if (list != null) {
            i = list.size();
            if (i > 0) {
                final Keyframe keyframe = list.get(0);
                final Keyframe keyframe2 = list.get(i - 1);
                final float fraction = keyframe2.getFraction();
                if (fraction < 1.0f) {
                    if (fraction < 0.0f) {
                        keyframe2.setFraction(1.0f);
                    }
                    else {
                        list.add(list.size(), a(keyframe2, 1.0f));
                        ++i;
                    }
                }
                final float fraction2 = keyframe.getFraction();
                int n2 = i;
                if (fraction2 != 0.0f) {
                    if (fraction2 < 0.0f) {
                        keyframe.setFraction(0.0f);
                        n2 = i;
                    }
                    else {
                        list.add(0, a(keyframe, 0.0f));
                        n2 = i + 1;
                    }
                }
                final Keyframe[] array = new Keyframe[n2];
                list.toArray(array);
                Keyframe keyframe3;
                int n3;
                int n4;
                for (i = 0; i < n2; ++i) {
                    keyframe3 = array[i];
                    if (keyframe3.getFraction() < 0.0f) {
                        if (i == 0) {
                            keyframe3.setFraction(0.0f);
                        }
                        else if (i == n2 - 1) {
                            keyframe3.setFraction(1.0f);
                        }
                        else {
                            n3 = i + 1;
                            n4 = i;
                            while (n3 < n2 - 1 && array[n3].getFraction() < 0.0f) {
                                n4 = n3;
                                ++n3;
                            }
                            a(array, array[n4 + 1].getFraction() - array[i - 1].getFraction(), i, n4);
                        }
                    }
                }
                final PropertyValuesHolder ofKeyframe = PropertyValuesHolder.ofKeyframe(s, array);
                if (n == 3) {
                    ofKeyframe.setEvaluator((TypeEvaluator)f.a());
                }
                return ofKeyframe;
            }
        }
        return null;
    }
    
    private static PropertyValuesHolder a(final TypedArray typedArray, int n, int n2, final int n3, final String s) {
        final TypedValue peekValue = typedArray.peekValue(n2);
        boolean b;
        if (peekValue != null) {
            b = true;
        }
        else {
            b = false;
        }
        int type;
        if (b) {
            type = peekValue.type;
        }
        else {
            type = 0;
        }
        final TypedValue peekValue2 = typedArray.peekValue(n3);
        boolean b2;
        if (peekValue2 != null) {
            b2 = true;
        }
        else {
            b2 = false;
        }
        int type2;
        if (b2) {
            type2 = peekValue2.type;
        }
        else {
            type2 = 0;
        }
        int n4 = n;
        if (n == 4) {
            if ((b && a(type)) || (b2 && a(type2))) {
                n4 = 3;
            }
            else {
                n4 = 0;
            }
        }
        if (n4 == 0) {
            n = 1;
        }
        else {
            n = 0;
        }
        if (n4 == 2) {
            final String string = typedArray.getString(n2);
            final String string2 = typedArray.getString(n3);
            final b.b[] b3 = android.support.v4.c.b.b(string);
            final b.b[] b4 = android.support.v4.c.b.b(string2);
            if (b3 != null || b4 != null) {
                if (b3 != null) {
                    final a a = new a();
                    if (b4 == null) {
                        return PropertyValuesHolder.ofObject(s, (TypeEvaluator)a, new Object[] { b3 });
                    }
                    if (!android.support.v4.c.b.a(b3, b4)) {
                        throw new InflateException(" Can't morph from " + string + " to " + string2);
                    }
                    return PropertyValuesHolder.ofObject(s, (TypeEvaluator)a, new Object[] { b3, b4 });
                }
                else if (b4 != null) {
                    return PropertyValuesHolder.ofObject(s, (TypeEvaluator)new a(), new Object[] { b4 });
                }
            }
            return null;
        }
        Object a2 = null;
        if (n4 == 3) {
            a2 = f.a();
        }
        PropertyValuesHolder propertyValuesHolder;
        if (n != 0) {
            if (b) {
                float n5;
                if (type == 5) {
                    n5 = typedArray.getDimension(n2, 0.0f);
                }
                else {
                    n5 = typedArray.getFloat(n2, 0.0f);
                }
                if (b2) {
                    float n6;
                    if (type2 == 5) {
                        n6 = typedArray.getDimension(n3, 0.0f);
                    }
                    else {
                        n6 = typedArray.getFloat(n3, 0.0f);
                    }
                    propertyValuesHolder = PropertyValuesHolder.ofFloat(s, new float[] { n5, n6 });
                }
                else {
                    propertyValuesHolder = PropertyValuesHolder.ofFloat(s, new float[] { n5 });
                }
            }
            else {
                float n7;
                if (type2 == 5) {
                    n7 = typedArray.getDimension(n3, 0.0f);
                }
                else {
                    n7 = typedArray.getFloat(n3, 0.0f);
                }
                propertyValuesHolder = PropertyValuesHolder.ofFloat(s, new float[] { n7 });
            }
        }
        else if (b) {
            if (type == 5) {
                n = (int)typedArray.getDimension(n2, 0.0f);
            }
            else if (a(type)) {
                n = typedArray.getColor(n2, 0);
            }
            else {
                n = typedArray.getInt(n2, 0);
            }
            if (b2) {
                if (type2 == 5) {
                    n2 = (int)typedArray.getDimension(n3, 0.0f);
                }
                else if (a(type2)) {
                    n2 = typedArray.getColor(n3, 0);
                }
                else {
                    n2 = typedArray.getInt(n3, 0);
                }
                propertyValuesHolder = PropertyValuesHolder.ofInt(s, new int[] { n, n2 });
            }
            else {
                propertyValuesHolder = PropertyValuesHolder.ofInt(s, new int[] { n });
            }
        }
        else if (b2) {
            if (type2 == 5) {
                n = (int)typedArray.getDimension(n3, 0.0f);
            }
            else if (a(type2)) {
                n = typedArray.getColor(n3, 0);
            }
            else {
                n = typedArray.getInt(n3, 0);
            }
            propertyValuesHolder = PropertyValuesHolder.ofInt(s, new int[] { n });
        }
        else {
            propertyValuesHolder = null;
        }
        PropertyValuesHolder ofObject = propertyValuesHolder;
        if (propertyValuesHolder != null) {
            ofObject = propertyValuesHolder;
            if (a2 != null) {
                propertyValuesHolder.setEvaluator((TypeEvaluator)a2);
                return propertyValuesHolder;
            }
        }
        return ofObject;
    }
    
    private static ValueAnimator a(final Context context, final Resources resources, final Resources$Theme resources$Theme, final AttributeSet set, final ValueAnimator valueAnimator, final float n, final XmlPullParser xmlPullParser) {
        final TypedArray a = c.a(resources, resources$Theme, set, android.support.b.a.a.g);
        final TypedArray a2 = c.a(resources, resources$Theme, set, android.support.b.a.a.k);
        ValueAnimator valueAnimator2 = valueAnimator;
        if (valueAnimator == null) {
            valueAnimator2 = new ValueAnimator();
        }
        a(valueAnimator2, a, a2, n, xmlPullParser);
        final int c = android.support.v4.b.a.c.c(a, xmlPullParser, "interpolator", 0, 0);
        if (c > 0) {
            valueAnimator2.setInterpolator((TimeInterpolator)d.a(context, c));
        }
        a.recycle();
        if (a2 != null) {
            a2.recycle();
        }
        return valueAnimator2;
    }
    
    private static void a(final ValueAnimator valueAnimator, final TypedArray typedArray, final int n, final float n2, final XmlPullParser xmlPullParser) {
        final ObjectAnimator objectAnimator = (ObjectAnimator)valueAnimator;
        final String a = c.a(typedArray, xmlPullParser, "pathData", 1);
        if (a == null) {
            objectAnimator.setPropertyName(c.a(typedArray, xmlPullParser, "propertyName", 0));
            return;
        }
        final String a2 = c.a(typedArray, xmlPullParser, "propertyXName", 2);
        final String a3 = c.a(typedArray, xmlPullParser, "propertyYName", 3);
        if (n == 2 || n == 4) {}
        if (a2 == null && a3 == null) {
            throw new InflateException(typedArray.getPositionDescription() + " propertyXName or propertyYName is needed for PathData");
        }
        a(b.a(a), objectAnimator, 0.5f * n2, a2, a3);
    }
    
    private static void a(final ValueAnimator valueAnimator, final TypedArray typedArray, final TypedArray typedArray2, final float n, final XmlPullParser xmlPullParser) {
        final long duration = c.a(typedArray, xmlPullParser, "duration", 1, 300);
        final long startDelay = c.a(typedArray, xmlPullParser, "startOffset", 2, 0);
        int a;
        final int n2 = a = c.a(typedArray, xmlPullParser, "valueType", 7, 4);
        if (c.a(xmlPullParser, "valueFrom")) {
            a = n2;
            if (c.a(xmlPullParser, "valueTo")) {
                int a2;
                if ((a2 = n2) == 4) {
                    a2 = a(typedArray, 5, 6);
                }
                final PropertyValuesHolder a3 = a(typedArray, a2, 5, 6, "");
                a = a2;
                if (a3 != null) {
                    valueAnimator.setValues(new PropertyValuesHolder[] { a3 });
                    a = a2;
                }
            }
        }
        valueAnimator.setDuration(duration);
        valueAnimator.setStartDelay(startDelay);
        valueAnimator.setRepeatCount(c.a(typedArray, xmlPullParser, "repeatCount", 3, 0));
        valueAnimator.setRepeatMode(c.a(typedArray, xmlPullParser, "repeatMode", 4, 1));
        if (typedArray2 != null) {
            a(valueAnimator, typedArray2, a, n, xmlPullParser);
        }
    }
    
    private static void a(final Path path, final ObjectAnimator objectAnimator, float n, final String s, final String s2) {
        final PathMeasure pathMeasure = new PathMeasure(path, false);
        float n2 = 0.0f;
        final ArrayList<Float> list = new ArrayList<Float>();
        list.add(0.0f);
        float n3;
        do {
            n3 = n2 + pathMeasure.getLength();
            list.add(n3);
            n2 = n3;
        } while (pathMeasure.nextContour());
        final PathMeasure pathMeasure2 = new PathMeasure(path, false);
        final int min = Math.min(100, (int)(n3 / n) + 1);
        final float[] array = new float[min];
        final float[] array2 = new float[min];
        final float[] array3 = new float[2];
        int n4 = 0;
        final float n5 = n3 / (min - 1);
        int i = 0;
        n = 0.0f;
        while (i < min) {
            pathMeasure2.getPosTan(n, array3, (float[])null);
            pathMeasure2.getPosTan(n, array3, (float[])null);
            array[i] = array3[0];
            array2[i] = array3[1];
            n += n5;
            if (n4 + 1 < list.size() && n > list.get(n4 + 1)) {
                n -= list.get(n4 + 1);
                ++n4;
                pathMeasure2.nextContour();
            }
            ++i;
        }
        PropertyValuesHolder ofFloat = null;
        final PropertyValuesHolder propertyValuesHolder = null;
        if (s != null) {
            ofFloat = PropertyValuesHolder.ofFloat(s, array);
        }
        PropertyValuesHolder ofFloat2 = propertyValuesHolder;
        if (s2 != null) {
            ofFloat2 = PropertyValuesHolder.ofFloat(s2, array2);
        }
        if (ofFloat == null) {
            objectAnimator.setValues(new PropertyValuesHolder[] { ofFloat2 });
            return;
        }
        if (ofFloat2 == null) {
            objectAnimator.setValues(new PropertyValuesHolder[] { ofFloat });
            return;
        }
        objectAnimator.setValues(new PropertyValuesHolder[] { ofFloat, ofFloat2 });
    }
    
    private static void a(final Keyframe[] array, float n, int i, final int n2) {
        n /= n2 - i + 2;
        while (i <= n2) {
            array[i].setFraction(array[i - 1].getFraction() + n);
            ++i;
        }
    }
    
    private static boolean a(final int n) {
        return n >= 28 && n <= 31;
    }
    
    private static PropertyValuesHolder[] a(final Context context, final Resources resources, final Resources$Theme resources$Theme, final XmlPullParser xmlPullParser, final AttributeSet set) {
        ArrayList<PropertyValuesHolder> list = null;
        while (true) {
            final int eventType = xmlPullParser.getEventType();
            if (eventType == 3 || eventType == 1) {
                break;
            }
            if (eventType != 2) {
                xmlPullParser.next();
            }
            else {
                if (xmlPullParser.getName().equals("propertyValuesHolder")) {
                    final TypedArray a = c.a(resources, resources$Theme, set, android.support.b.a.a.i);
                    final String a2 = c.a(a, xmlPullParser, "propertyName", 3);
                    final int a3 = c.a(a, xmlPullParser, "valueType", 2, 4);
                    PropertyValuesHolder propertyValuesHolder = a(context, resources, resources$Theme, xmlPullParser, a2, a3);
                    if (propertyValuesHolder == null) {
                        propertyValuesHolder = a(a, a3, 0, 1, a2);
                    }
                    if (propertyValuesHolder != null) {
                        if (list == null) {
                            list = new ArrayList<PropertyValuesHolder>();
                        }
                        list.add(propertyValuesHolder);
                    }
                    a.recycle();
                }
                xmlPullParser.next();
            }
        }
        PropertyValuesHolder[] array = null;
        if (list != null) {
            final int size = list.size();
            array = new PropertyValuesHolder[size];
            for (int i = 0; i < size; ++i) {
                array[i] = list.get(i);
            }
        }
        return array;
    }
    
    private static class a implements TypeEvaluator<b.b[]>
    {
        private b.b[] a;
        
        public b.b[] a(final float n, final b.b[] array, final b.b[] array2) {
            if (!b.a(array, array2)) {
                throw new IllegalArgumentException("Can't interpolate between two incompatible pathData");
            }
            if (this.a == null || !b.a(this.a, array)) {
                this.a = b.a(array);
            }
            for (int i = 0; i < array.length; ++i) {
                this.a[i].a(array[i], array2[i], n);
            }
            return this.a;
        }
    }
}
