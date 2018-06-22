// 
// Decompiled by Procyon v0.5.30
// 

package android.support.constraint;

import org.xmlpull.v1.XmlPullParser;
import java.util.Iterator;
import android.view.View;
import android.os.Build$VERSION;
import android.view.ViewGroup$LayoutParams;
import java.util.Collection;
import java.util.HashSet;
import android.content.res.XmlResourceParser;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;
import android.util.Log;
import android.util.AttributeSet;
import android.content.Context;
import android.content.res.TypedArray;
import java.util.HashMap;
import android.util.SparseIntArray;

public class a
{
    private static final int[] a;
    private static SparseIntArray c;
    private HashMap<Integer, a> b;
    
    static {
        a = new int[] { 0, 4, 8 };
        (android.support.constraint.a.c = new SparseIntArray()).append(android.support.constraint.c.a.ConstraintSet_layout_constraintLeft_toLeftOf, 25);
        android.support.constraint.a.c.append(android.support.constraint.c.a.ConstraintSet_layout_constraintLeft_toRightOf, 26);
        android.support.constraint.a.c.append(android.support.constraint.c.a.ConstraintSet_layout_constraintRight_toLeftOf, 29);
        android.support.constraint.a.c.append(android.support.constraint.c.a.ConstraintSet_layout_constraintRight_toRightOf, 30);
        android.support.constraint.a.c.append(android.support.constraint.c.a.ConstraintSet_layout_constraintTop_toTopOf, 36);
        android.support.constraint.a.c.append(android.support.constraint.c.a.ConstraintSet_layout_constraintTop_toBottomOf, 35);
        android.support.constraint.a.c.append(android.support.constraint.c.a.ConstraintSet_layout_constraintBottom_toTopOf, 4);
        android.support.constraint.a.c.append(android.support.constraint.c.a.ConstraintSet_layout_constraintBottom_toBottomOf, 3);
        android.support.constraint.a.c.append(android.support.constraint.c.a.ConstraintSet_layout_constraintBaseline_toBaselineOf, 1);
        android.support.constraint.a.c.append(android.support.constraint.c.a.ConstraintSet_layout_editor_absoluteX, 6);
        android.support.constraint.a.c.append(android.support.constraint.c.a.ConstraintSet_layout_editor_absoluteY, 7);
        android.support.constraint.a.c.append(android.support.constraint.c.a.ConstraintSet_layout_constraintGuide_begin, 17);
        android.support.constraint.a.c.append(android.support.constraint.c.a.ConstraintSet_layout_constraintGuide_end, 18);
        android.support.constraint.a.c.append(android.support.constraint.c.a.ConstraintSet_layout_constraintGuide_percent, 19);
        android.support.constraint.a.c.append(android.support.constraint.c.a.ConstraintSet_android_orientation, 27);
        android.support.constraint.a.c.append(android.support.constraint.c.a.ConstraintSet_layout_constraintStart_toEndOf, 32);
        android.support.constraint.a.c.append(android.support.constraint.c.a.ConstraintSet_layout_constraintStart_toStartOf, 33);
        android.support.constraint.a.c.append(android.support.constraint.c.a.ConstraintSet_layout_constraintEnd_toStartOf, 10);
        android.support.constraint.a.c.append(android.support.constraint.c.a.ConstraintSet_layout_constraintEnd_toEndOf, 9);
        android.support.constraint.a.c.append(android.support.constraint.c.a.ConstraintSet_layout_goneMarginLeft, 13);
        android.support.constraint.a.c.append(android.support.constraint.c.a.ConstraintSet_layout_goneMarginTop, 16);
        android.support.constraint.a.c.append(android.support.constraint.c.a.ConstraintSet_layout_goneMarginRight, 14);
        android.support.constraint.a.c.append(android.support.constraint.c.a.ConstraintSet_layout_goneMarginBottom, 11);
        android.support.constraint.a.c.append(android.support.constraint.c.a.ConstraintSet_layout_goneMarginStart, 15);
        android.support.constraint.a.c.append(android.support.constraint.c.a.ConstraintSet_layout_goneMarginEnd, 12);
        android.support.constraint.a.c.append(android.support.constraint.c.a.ConstraintSet_layout_constraintVertical_weight, 40);
        android.support.constraint.a.c.append(android.support.constraint.c.a.ConstraintSet_layout_constraintHorizontal_weight, 39);
        android.support.constraint.a.c.append(android.support.constraint.c.a.ConstraintSet_layout_constraintHorizontal_chainStyle, 41);
        android.support.constraint.a.c.append(android.support.constraint.c.a.ConstraintSet_layout_constraintVertical_chainStyle, 42);
        android.support.constraint.a.c.append(android.support.constraint.c.a.ConstraintSet_layout_constraintHorizontal_bias, 20);
        android.support.constraint.a.c.append(android.support.constraint.c.a.ConstraintSet_layout_constraintVertical_bias, 37);
        android.support.constraint.a.c.append(android.support.constraint.c.a.ConstraintSet_layout_constraintDimensionRatio, 5);
        android.support.constraint.a.c.append(android.support.constraint.c.a.ConstraintSet_layout_constraintLeft_creator, 60);
        android.support.constraint.a.c.append(android.support.constraint.c.a.ConstraintSet_layout_constraintTop_creator, 60);
        android.support.constraint.a.c.append(android.support.constraint.c.a.ConstraintSet_layout_constraintRight_creator, 60);
        android.support.constraint.a.c.append(android.support.constraint.c.a.ConstraintSet_layout_constraintBottom_creator, 60);
        android.support.constraint.a.c.append(android.support.constraint.c.a.ConstraintSet_layout_constraintBaseline_creator, 60);
        android.support.constraint.a.c.append(android.support.constraint.c.a.ConstraintSet_android_layout_marginLeft, 24);
        android.support.constraint.a.c.append(android.support.constraint.c.a.ConstraintSet_android_layout_marginRight, 28);
        android.support.constraint.a.c.append(android.support.constraint.c.a.ConstraintSet_android_layout_marginStart, 31);
        android.support.constraint.a.c.append(android.support.constraint.c.a.ConstraintSet_android_layout_marginEnd, 8);
        android.support.constraint.a.c.append(android.support.constraint.c.a.ConstraintSet_android_layout_marginTop, 34);
        android.support.constraint.a.c.append(android.support.constraint.c.a.ConstraintSet_android_layout_marginBottom, 2);
        android.support.constraint.a.c.append(android.support.constraint.c.a.ConstraintSet_android_layout_width, 23);
        android.support.constraint.a.c.append(android.support.constraint.c.a.ConstraintSet_android_layout_height, 21);
        android.support.constraint.a.c.append(android.support.constraint.c.a.ConstraintSet_android_visibility, 22);
        android.support.constraint.a.c.append(android.support.constraint.c.a.ConstraintSet_android_alpha, 43);
        android.support.constraint.a.c.append(android.support.constraint.c.a.ConstraintSet_android_elevation, 44);
        android.support.constraint.a.c.append(android.support.constraint.c.a.ConstraintSet_android_rotationX, 45);
        android.support.constraint.a.c.append(android.support.constraint.c.a.ConstraintSet_android_rotationY, 46);
        android.support.constraint.a.c.append(android.support.constraint.c.a.ConstraintSet_android_scaleX, 47);
        android.support.constraint.a.c.append(android.support.constraint.c.a.ConstraintSet_android_scaleY, 48);
        android.support.constraint.a.c.append(android.support.constraint.c.a.ConstraintSet_android_transformPivotX, 49);
        android.support.constraint.a.c.append(android.support.constraint.c.a.ConstraintSet_android_transformPivotY, 50);
        android.support.constraint.a.c.append(android.support.constraint.c.a.ConstraintSet_android_translationX, 51);
        android.support.constraint.a.c.append(android.support.constraint.c.a.ConstraintSet_android_translationY, 52);
        android.support.constraint.a.c.append(android.support.constraint.c.a.ConstraintSet_android_translationZ, 53);
        android.support.constraint.a.c.append(android.support.constraint.c.a.ConstraintSet_layout_constraintWidth_default, 54);
        android.support.constraint.a.c.append(android.support.constraint.c.a.ConstraintSet_layout_constraintHeight_default, 55);
        android.support.constraint.a.c.append(android.support.constraint.c.a.ConstraintSet_layout_constraintWidth_max, 56);
        android.support.constraint.a.c.append(android.support.constraint.c.a.ConstraintSet_layout_constraintHeight_max, 57);
        android.support.constraint.a.c.append(android.support.constraint.c.a.ConstraintSet_layout_constraintWidth_min, 58);
        android.support.constraint.a.c.append(android.support.constraint.c.a.ConstraintSet_layout_constraintHeight_min, 59);
        android.support.constraint.a.c.append(android.support.constraint.c.a.ConstraintSet_android_id, 38);
    }
    
    public a() {
        this.b = new HashMap<Integer, a>();
    }
    
    private static int a(final TypedArray typedArray, final int n, int n2) {
        if ((n2 = typedArray.getResourceId(n, n2)) == -1) {
            n2 = typedArray.getInt(n, -1);
        }
        return n2;
    }
    
    private a a(final Context context, final AttributeSet set) {
        final a a = new a();
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, android.support.constraint.c.a.ConstraintSet);
        this.a(a, obtainStyledAttributes);
        obtainStyledAttributes.recycle();
        return a;
    }
    
    private void a(final a a, final TypedArray typedArray) {
        for (int indexCount = typedArray.getIndexCount(), i = 0; i < indexCount; ++i) {
            final int index = typedArray.getIndex(i);
            switch (a.c.get(index)) {
                default: {
                    Log.w("ConstraintSet", "Unknown attribute 0x" + Integer.toHexString(index) + "   " + a.c.get(index));
                    break;
                }
                case 25: {
                    a.h = a(typedArray, index, a.h);
                    break;
                }
                case 26: {
                    a.i = a(typedArray, index, a.i);
                    break;
                }
                case 29: {
                    a.j = a(typedArray, index, a.j);
                    break;
                }
                case 30: {
                    a.k = a(typedArray, index, a.k);
                    break;
                }
                case 36: {
                    a.l = a(typedArray, index, a.l);
                    break;
                }
                case 35: {
                    a.m = a(typedArray, index, a.m);
                    break;
                }
                case 4: {
                    a.n = a(typedArray, index, a.n);
                    break;
                }
                case 3: {
                    a.o = a(typedArray, index, a.o);
                    break;
                }
                case 1: {
                    a.p = a(typedArray, index, a.p);
                    break;
                }
                case 6: {
                    a.x = typedArray.getDimensionPixelOffset(index, a.x);
                    break;
                }
                case 7: {
                    a.y = typedArray.getDimensionPixelOffset(index, a.y);
                    break;
                }
                case 17: {
                    a.e = typedArray.getDimensionPixelOffset(index, a.e);
                    break;
                }
                case 18: {
                    a.f = typedArray.getDimensionPixelOffset(index, a.f);
                    break;
                }
                case 19: {
                    a.g = typedArray.getFloat(index, a.g);
                    break;
                }
                case 27: {
                    a.z = typedArray.getInt(index, a.z);
                    break;
                }
                case 32: {
                    a.q = a(typedArray, index, a.q);
                    break;
                }
                case 33: {
                    a.r = a(typedArray, index, a.r);
                    break;
                }
                case 10: {
                    a.s = a(typedArray, index, a.s);
                    break;
                }
                case 9: {
                    a.n = a(typedArray, index, a.t);
                    break;
                }
                case 13: {
                    a.H = typedArray.getDimensionPixelSize(index, a.H);
                    break;
                }
                case 16: {
                    a.I = typedArray.getDimensionPixelSize(index, a.I);
                    break;
                }
                case 14: {
                    a.J = typedArray.getDimensionPixelSize(index, a.J);
                    break;
                }
                case 11: {
                    a.K = typedArray.getDimensionPixelSize(index, a.K);
                    break;
                }
                case 15: {
                    a.M = typedArray.getDimensionPixelSize(index, a.M);
                    break;
                }
                case 12: {
                    a.L = typedArray.getDimensionPixelSize(index, a.L);
                    break;
                }
                case 20: {
                    a.u = typedArray.getFloat(index, a.u);
                    break;
                }
                case 37: {
                    a.v = typedArray.getFloat(index, a.v);
                    break;
                }
                case 24: {
                    a.A = typedArray.getDimensionPixelSize(index, a.A);
                    break;
                }
                case 28: {
                    a.B = typedArray.getDimensionPixelSize(index, a.B);
                    break;
                }
                case 31: {
                    a.F = typedArray.getDimensionPixelSize(index, a.F);
                    break;
                }
                case 8: {
                    a.E = typedArray.getDimensionPixelSize(index, a.E);
                    break;
                }
                case 34: {
                    a.C = typedArray.getDimensionPixelSize(index, a.C);
                    break;
                }
                case 2: {
                    a.D = typedArray.getDimensionPixelSize(index, a.D);
                    break;
                }
                case 23: {
                    a.b = typedArray.getLayoutDimension(index, a.b);
                    break;
                }
                case 21: {
                    a.c = typedArray.getLayoutDimension(index, a.c);
                    break;
                }
                case 22: {
                    a.G = typedArray.getInt(index, a.G);
                    a.G = a.a[a.G];
                    break;
                }
                case 43: {
                    a.R = typedArray.getFloat(index, a.R);
                    break;
                }
                case 44: {
                    a.S = true;
                    a.T = typedArray.getFloat(index, a.T);
                    break;
                }
                case 45: {
                    a.U = typedArray.getFloat(index, a.U);
                    break;
                }
                case 46: {
                    a.V = typedArray.getFloat(index, a.V);
                    break;
                }
                case 47: {
                    a.W = typedArray.getFloat(index, a.W);
                    break;
                }
                case 48: {
                    a.X = typedArray.getFloat(index, a.X);
                    break;
                }
                case 49: {
                    a.Y = typedArray.getFloat(index, a.Y);
                    break;
                }
                case 50: {
                    a.Z = typedArray.getFloat(index, a.Z);
                    break;
                }
                case 51: {
                    a.aa = typedArray.getFloat(index, a.aa);
                    break;
                }
                case 52: {
                    a.ab = typedArray.getFloat(index, a.ab);
                    break;
                }
                case 53: {
                    a.ac = typedArray.getFloat(index, a.ac);
                    break;
                }
                case 40: {
                    a.N = typedArray.getFloat(index, a.N);
                    break;
                }
                case 39: {
                    a.O = typedArray.getFloat(index, a.O);
                    break;
                }
                case 42: {
                    a.Q = typedArray.getInt(index, a.Q);
                    break;
                }
                case 41: {
                    a.P = typedArray.getInt(index, a.P);
                    break;
                }
                case 38: {
                    a.d = typedArray.getResourceId(index, a.d);
                    break;
                }
                case 5: {
                    a.w = typedArray.getString(index);
                    break;
                }
                case 60: {
                    Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index) + "   " + a.c.get(index));
                    break;
                }
            }
        }
    }
    
    public void a(final Context context, int n) {
        while (true) {
            final XmlResourceParser xml = context.getResources().getXml(n);
        Label_0019_Outer:
            while (true) {
                while (true) {
                    Label_0108: {
                        try {
                            n = ((XmlPullParser)xml).getEventType();
                            break Label_0108;
                            ((XmlPullParser)xml).getName();
                            n = ((XmlPullParser)xml).next();
                        }
                        catch (XmlPullParserException ex) {
                            ex.printStackTrace();
                        }
                        catch (IOException ex2) {
                            ex2.printStackTrace();
                            return;
                        }
                    }
                    if (n == 1) {
                        goto Label_0044;
                    }
                    switch (n) {
                        case 1:
                        case 3: {
                            continue;
                        }
                        case 0: {
                            continue Label_0019_Outer;
                        }
                        case 2: {
                            goto Label_0045;
                            goto Label_0045;
                        }
                        default: {
                            continue;
                        }
                    }
                    break;
                }
                break;
            }
        }
    }
    
    void a(final ConstraintLayout constraintLayout) {
        final int childCount = constraintLayout.getChildCount();
        final HashSet<Integer> set = new HashSet<Integer>(this.b.keySet());
        for (int i = 0; i < childCount; ++i) {
            final View child = constraintLayout.getChildAt(i);
            final int id = child.getId();
            if (this.b.containsKey(id)) {
                set.remove(id);
                final a a = this.b.get(id);
                final ConstraintLayout.a layoutParams = (ConstraintLayout.a)child.getLayoutParams();
                a.a(layoutParams);
                child.setLayoutParams((ViewGroup$LayoutParams)layoutParams);
                child.setVisibility(a.G);
                if (Build$VERSION.SDK_INT >= 17) {
                    child.setAlpha(a.R);
                    child.setRotationX(a.U);
                    child.setRotationY(a.V);
                    child.setScaleX(a.W);
                    child.setScaleY(a.X);
                    child.setPivotX(a.Y);
                    child.setPivotY(a.Z);
                    child.setTranslationX(a.aa);
                    child.setTranslationY(a.ab);
                    if (Build$VERSION.SDK_INT >= 21) {
                        child.setTranslationZ(a.ac);
                        if (a.S) {
                            child.setElevation(a.T);
                        }
                    }
                }
            }
        }
        for (final Integer n : set) {
            final a a2 = this.b.get(n);
            if (a2.a) {
                final b b = new b(constraintLayout.getContext());
                b.setId((int)n);
                final ConstraintLayout.a b2 = constraintLayout.b();
                a2.a(b2);
                constraintLayout.addView((View)b, (ViewGroup$LayoutParams)b2);
            }
        }
    }
    
    private static class a
    {
        public int A;
        public int B;
        public int C;
        public int D;
        public int E;
        public int F;
        public int G;
        public int H;
        public int I;
        public int J;
        public int K;
        public int L;
        public int M;
        public float N;
        public float O;
        public int P;
        public int Q;
        public float R;
        public boolean S;
        public float T;
        public float U;
        public float V;
        public float W;
        public float X;
        public float Y;
        public float Z;
        boolean a;
        public float aa;
        public float ab;
        public float ac;
        public int ad;
        public int ae;
        public int af;
        public int ag;
        public int ah;
        public int ai;
        public int b;
        public int c;
        int d;
        public int e;
        public int f;
        public float g;
        public int h;
        public int i;
        public int j;
        public int k;
        public int l;
        public int m;
        public int n;
        public int o;
        public int p;
        public int q;
        public int r;
        public int s;
        public int t;
        public float u;
        public float v;
        public String w;
        public int x;
        public int y;
        public int z;
        
        private a() {
            this.a = false;
            this.e = -1;
            this.f = -1;
            this.g = -1.0f;
            this.h = -1;
            this.i = -1;
            this.j = -1;
            this.k = -1;
            this.l = -1;
            this.m = -1;
            this.n = -1;
            this.o = -1;
            this.p = -1;
            this.q = -1;
            this.r = -1;
            this.s = -1;
            this.t = -1;
            this.u = 0.5f;
            this.v = 0.5f;
            this.w = null;
            this.x = -1;
            this.y = -1;
            this.z = -1;
            this.A = -1;
            this.B = -1;
            this.C = -1;
            this.D = -1;
            this.E = -1;
            this.F = -1;
            this.G = 0;
            this.H = -1;
            this.I = -1;
            this.J = -1;
            this.K = -1;
            this.L = -1;
            this.M = -1;
            this.N = 0.0f;
            this.O = 0.0f;
            this.P = 0;
            this.Q = 0;
            this.R = 1.0f;
            this.S = false;
            this.T = 0.0f;
            this.U = 0.0f;
            this.V = 0.0f;
            this.W = 1.0f;
            this.X = 1.0f;
            this.Y = 0.0f;
            this.Z = 0.0f;
            this.aa = 0.0f;
            this.ab = 0.0f;
            this.ac = 0.0f;
            this.ad = -1;
            this.ae = -1;
            this.af = -1;
            this.ag = -1;
            this.ah = -1;
            this.ai = -1;
        }
        
        public a a() {
            final a a = new a();
            a.a = this.a;
            a.b = this.b;
            a.c = this.c;
            a.e = this.e;
            a.f = this.f;
            a.g = this.g;
            a.h = this.h;
            a.i = this.i;
            a.j = this.j;
            a.k = this.k;
            a.l = this.l;
            a.m = this.m;
            a.n = this.n;
            a.o = this.o;
            a.p = this.p;
            a.q = this.q;
            a.r = this.r;
            a.s = this.s;
            a.t = this.t;
            a.u = this.u;
            a.v = this.v;
            a.w = this.w;
            a.x = this.x;
            a.y = this.y;
            a.u = this.u;
            a.u = this.u;
            a.u = this.u;
            a.u = this.u;
            a.u = this.u;
            a.z = this.z;
            a.A = this.A;
            a.B = this.B;
            a.C = this.C;
            a.D = this.D;
            a.E = this.E;
            a.F = this.F;
            a.G = this.G;
            a.H = this.H;
            a.I = this.I;
            a.J = this.J;
            a.K = this.K;
            a.L = this.L;
            a.M = this.M;
            a.N = this.N;
            a.O = this.O;
            a.P = this.P;
            a.Q = this.Q;
            a.R = this.R;
            a.S = this.S;
            a.T = this.T;
            a.U = this.U;
            a.V = this.V;
            a.W = this.W;
            a.X = this.X;
            a.Y = this.Y;
            a.Z = this.Z;
            a.aa = this.aa;
            a.ab = this.ab;
            a.ac = this.ac;
            a.ad = this.ad;
            a.ae = this.ae;
            a.af = this.af;
            a.ag = this.ag;
            a.ah = this.ah;
            a.ai = this.ai;
            return a;
        }
        
        public void a(final ConstraintLayout.a a) {
            a.d = this.h;
            a.e = this.i;
            a.f = this.j;
            a.g = this.k;
            a.h = this.l;
            a.i = this.m;
            a.j = this.n;
            a.k = this.o;
            a.l = this.p;
            a.m = this.q;
            a.n = this.r;
            a.o = this.s;
            a.p = this.t;
            a.leftMargin = this.A;
            a.rightMargin = this.B;
            a.topMargin = this.C;
            a.bottomMargin = this.D;
            a.u = this.M;
            a.v = this.L;
            a.w = this.u;
            a.x = this.v;
            a.y = this.w;
            a.L = this.x;
            a.M = this.y;
            a.C = this.N;
            a.B = this.O;
            a.E = this.Q;
            a.D = this.P;
            a.F = this.ad;
            a.G = this.ae;
            a.J = this.af;
            a.K = this.ag;
            a.H = this.ah;
            a.I = this.ai;
            a.N = this.z;
            a.c = this.g;
            a.a = this.e;
            a.b = this.f;
            a.width = this.b;
            a.height = this.c;
            if (Build$VERSION.SDK_INT >= 17) {
                a.setMarginStart(this.F);
                a.setMarginEnd(this.E);
            }
            a.a();
        }
    }
}
