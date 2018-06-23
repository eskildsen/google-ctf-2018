// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v7.widget;

import android.view.MotionEvent;
import android.widget.AbsListView;
import android.widget.ListView;
import android.widget.PopupWindow$OnDismissListener;
import android.view.View$OnTouchListener;
import android.support.v4.h.p;
import android.support.v4.widget.i;
import android.view.View$MeasureSpec;
import android.view.ViewGroup$LayoutParams;
import android.widget.LinearLayout$LayoutParams;
import android.widget.LinearLayout;
import android.widget.AbsListView$OnScrollListener;
import android.widget.AdapterView;
import android.view.ViewParent;
import android.view.ViewGroup;
import android.util.Log;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.support.v7.a.a;
import android.database.DataSetObserver;
import android.view.View;
import android.widget.ListAdapter;
import android.content.Context;
import android.widget.PopupWindow;
import android.os.Handler;
import android.graphics.Rect;
import android.widget.AdapterView$OnItemSelectedListener;
import android.widget.AdapterView$OnItemClickListener;
import android.graphics.drawable.Drawable;
import java.lang.reflect.Method;
import android.support.v7.view.menu.s;

public class aj implements s
{
    private static Method a;
    private static Method b;
    private static Method h;
    private Drawable A;
    private AdapterView$OnItemClickListener B;
    private AdapterView$OnItemSelectedListener C;
    private final d D;
    private final c E;
    private final a F;
    private Runnable G;
    private final Rect H;
    private Rect I;
    private boolean J;
    af c;
    int d;
    final e e;
    final Handler f;
    PopupWindow g;
    private Context i;
    private ListAdapter j;
    private int k;
    private int l;
    private int m;
    private int n;
    private int o;
    private boolean p;
    private boolean q;
    private boolean r;
    private boolean s;
    private int t;
    private boolean u;
    private boolean v;
    private View w;
    private int x;
    private DataSetObserver y;
    private View z;
    
    static {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: ldc             Landroid/widget/PopupWindow;.class
        //     2: ldc             "setClipToScreenEnabled"
        //     4: iconst_1       
        //     5: anewarray       Ljava/lang/Class;
        //     8: dup            
        //     9: iconst_0       
        //    10: getstatic       java/lang/Boolean.TYPE:Ljava/lang/Class;
        //    13: aastore        
        //    14: invokevirtual   java/lang/Class.getDeclaredMethod:(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
        //    17: putstatic       android/support/v7/widget/aj.a:Ljava/lang/reflect/Method;
        //    20: ldc             Landroid/widget/PopupWindow;.class
        //    22: ldc             "getMaxAvailableHeight"
        //    24: iconst_3       
        //    25: anewarray       Ljava/lang/Class;
        //    28: dup            
        //    29: iconst_0       
        //    30: ldc             Landroid/view/View;.class
        //    32: aastore        
        //    33: dup            
        //    34: iconst_1       
        //    35: getstatic       java/lang/Integer.TYPE:Ljava/lang/Class;
        //    38: aastore        
        //    39: dup            
        //    40: iconst_2       
        //    41: getstatic       java/lang/Boolean.TYPE:Ljava/lang/Class;
        //    44: aastore        
        //    45: invokevirtual   java/lang/Class.getDeclaredMethod:(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
        //    48: putstatic       android/support/v7/widget/aj.b:Ljava/lang/reflect/Method;
        //    51: ldc             Landroid/widget/PopupWindow;.class
        //    53: ldc             "setEpicenterBounds"
        //    55: iconst_1       
        //    56: anewarray       Ljava/lang/Class;
        //    59: dup            
        //    60: iconst_0       
        //    61: ldc             Landroid/graphics/Rect;.class
        //    63: aastore        
        //    64: invokevirtual   java/lang/Class.getDeclaredMethod:(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
        //    67: putstatic       android/support/v7/widget/aj.h:Ljava/lang/reflect/Method;
        //    70: return         
        //    71: astore_0       
        //    72: ldc             "ListPopupWindow"
        //    74: ldc             "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well."
        //    76: invokestatic    android/util/Log.i:(Ljava/lang/String;Ljava/lang/String;)I
        //    79: pop            
        //    80: goto            20
        //    83: astore_0       
        //    84: ldc             "ListPopupWindow"
        //    86: ldc             "Could not find method getMaxAvailableHeight(View, int, boolean) on PopupWindow. Oh well."
        //    88: invokestatic    android/util/Log.i:(Ljava/lang/String;Ljava/lang/String;)I
        //    91: pop            
        //    92: goto            51
        //    95: astore_0       
        //    96: ldc             "ListPopupWindow"
        //    98: ldc             "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well."
        //   100: invokestatic    android/util/Log.i:(Ljava/lang/String;Ljava/lang/String;)I
        //   103: pop            
        //   104: return         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  0      20     71     83     Ljava/lang/NoSuchMethodException;
        //  20     51     83     95     Ljava/lang/NoSuchMethodException;
        //  51     70     95     105    Ljava/lang/NoSuchMethodException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 57, Size: 57
        //     at java.util.ArrayList.rangeCheck(ArrayList.java:657)
        //     at java.util.ArrayList.get(ArrayList.java:433)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3303)
        //     at com.strobel.decompiler.ast.AstBuilder.build(AstBuilder.java:113)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:210)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:99)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:757)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:655)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:532)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:499)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:141)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:130)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:105)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:317)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:238)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:138)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public aj(final Context context) {
        this(context, null, android.support.v7.a.a.a.listPopupWindowStyle);
    }
    
    public aj(final Context context, final AttributeSet set, final int n) {
        this(context, set, n, 0);
    }
    
    public aj(final Context i, final AttributeSet set, final int n, final int n2) {
        this.k = -2;
        this.l = -2;
        this.o = 1002;
        this.q = true;
        this.t = 0;
        this.u = false;
        this.v = false;
        this.d = Integer.MAX_VALUE;
        this.x = 0;
        this.e = new e();
        this.D = new d();
        this.E = new c();
        this.F = new a();
        this.H = new Rect();
        this.i = i;
        this.f = new Handler(i.getMainLooper());
        final TypedArray obtainStyledAttributes = i.obtainStyledAttributes(set, android.support.v7.a.a.j.ListPopupWindow, n, n2);
        this.m = obtainStyledAttributes.getDimensionPixelOffset(android.support.v7.a.a.j.ListPopupWindow_android_dropDownHorizontalOffset, 0);
        this.n = obtainStyledAttributes.getDimensionPixelOffset(android.support.v7.a.a.j.ListPopupWindow_android_dropDownVerticalOffset, 0);
        if (this.n != 0) {
            this.p = true;
        }
        obtainStyledAttributes.recycle();
        (this.g = new r(i, set, n, n2)).setInputMethodMode(1);
    }
    
    private int a(final View view, final int n, final boolean b) {
        if (aj.b != null) {
            try {
                return (int)aj.b.invoke(this.g, view, n, b);
            }
            catch (Exception ex) {
                Log.i("ListPopupWindow", "Could not call getMaxAvailableHeightMethod(View, int, boolean) on PopupWindow. Using the public version.");
            }
        }
        return this.g.getMaxAvailableHeight(view, n);
    }
    
    private void b() {
        if (this.w != null) {
            final ViewParent parent = this.w.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup)parent).removeView(this.w);
            }
        }
    }
    
    private void c(final boolean b) {
        if (aj.a == null) {
            return;
        }
        try {
            aj.a.invoke(this.g, b);
        }
        catch (Exception ex) {
            Log.i("ListPopupWindow", "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
        }
    }
    
    private int f() {
        final boolean b = true;
        int n2;
        if (this.c == null) {
            final Context i = this.i;
            this.G = new Runnable() {
                @Override
                public void run() {
                    final View i = aj.this.i();
                    if (i != null && i.getWindowToken() != null) {
                        aj.this.a();
                    }
                }
            };
            this.c = this.a(i, !this.J);
            if (this.A != null) {
                this.c.setSelector(this.A);
            }
            this.c.setAdapter(this.j);
            this.c.setOnItemClickListener(this.B);
            this.c.setFocusable(true);
            this.c.setFocusableInTouchMode(true);
            this.c.setOnItemSelectedListener((AdapterView$OnItemSelectedListener)new AdapterView$OnItemSelectedListener() {
                public void onItemSelected(final AdapterView<?> adapterView, final View view, final int n, final long n2) {
                    if (n != -1) {
                        final af c = aj.this.c;
                        if (c != null) {
                            c.setListSelectionHidden(false);
                        }
                    }
                }
                
                public void onNothingSelected(final AdapterView<?> adapterView) {
                }
            });
            this.c.setOnScrollListener((AbsListView$OnScrollListener)this.E);
            if (this.C != null) {
                this.c.setOnItemSelectedListener(this.C);
            }
            Object c = this.c;
            final View w = this.w;
            if (w != null) {
                final LinearLayout linearLayout = new LinearLayout(i);
                linearLayout.setOrientation(1);
                final LinearLayout$LayoutParams linearLayout$LayoutParams = new LinearLayout$LayoutParams(-1, 0, 1.0f);
                switch (this.x) {
                    default: {
                        Log.e("ListPopupWindow", "Invalid hint position " + this.x);
                        break;
                    }
                    case 1: {
                        linearLayout.addView((View)c, (ViewGroup$LayoutParams)linearLayout$LayoutParams);
                        linearLayout.addView(w);
                        break;
                    }
                    case 0: {
                        linearLayout.addView(w);
                        linearLayout.addView((View)c, (ViewGroup$LayoutParams)linearLayout$LayoutParams);
                        break;
                    }
                }
                int l;
                int n;
                if (this.l >= 0) {
                    l = this.l;
                    n = Integer.MIN_VALUE;
                }
                else {
                    n = 0;
                    l = 0;
                }
                w.measure(View$MeasureSpec.makeMeasureSpec(l, n), 0);
                final LinearLayout$LayoutParams linearLayout$LayoutParams2 = (LinearLayout$LayoutParams)w.getLayoutParams();
                n2 = linearLayout$LayoutParams2.bottomMargin + (w.getMeasuredHeight() + linearLayout$LayoutParams2.topMargin);
                c = linearLayout;
            }
            else {
                n2 = 0;
            }
            this.g.setContentView((View)c);
        }
        else {
            final ViewGroup viewGroup = (ViewGroup)this.g.getContentView();
            final View w2 = this.w;
            if (w2 != null) {
                final LinearLayout$LayoutParams linearLayout$LayoutParams3 = (LinearLayout$LayoutParams)w2.getLayoutParams();
                n2 = linearLayout$LayoutParams3.bottomMargin + (w2.getMeasuredHeight() + linearLayout$LayoutParams3.topMargin);
            }
            else {
                n2 = 0;
            }
        }
        final Drawable background = this.g.getBackground();
        int n3;
        if (background != null) {
            background.getPadding(this.H);
            n3 = this.H.top + this.H.bottom;
            if (!this.p) {
                this.n = -this.H.top;
            }
        }
        else {
            this.H.setEmpty();
            n3 = 0;
        }
        final int a = this.a(this.i(), this.n, this.g.getInputMethodMode() == 2 && b);
        if (this.u || this.k == -1) {
            return a + n3;
        }
        int n4 = 0;
        switch (this.l) {
            default: {
                n4 = View$MeasureSpec.makeMeasureSpec(this.l, 1073741824);
                break;
            }
            case -2: {
                n4 = View$MeasureSpec.makeMeasureSpec(this.i.getResources().getDisplayMetrics().widthPixels - (this.H.left + this.H.right), Integer.MIN_VALUE);
                break;
            }
            case -1: {
                n4 = View$MeasureSpec.makeMeasureSpec(this.i.getResources().getDisplayMetrics().widthPixels - (this.H.left + this.H.right), 1073741824);
                break;
            }
        }
        final int a2 = this.c.a(n4, 0, -1, a - n2, -1);
        int n5 = n2;
        if (a2 > 0) {
            n5 = n2 + (this.c.getPaddingTop() + this.c.getPaddingBottom() + n3);
        }
        return a2 + n5;
    }
    
    af a(final Context context, final boolean b) {
        return new af(context, b);
    }
    
    @Override
    public void a() {
        boolean outsideTouchable = true;
        final boolean b = false;
        final int n = -1;
        int height = this.f();
        final boolean n2 = this.n();
        android.support.v4.widget.i.a(this.g, this.o);
        if (this.g.isShowing()) {
            if (android.support.v4.h.p.m(this.i())) {
                int n3;
                if (this.l == -1) {
                    n3 = -1;
                }
                else if (this.l == -2) {
                    n3 = this.i().getWidth();
                }
                else {
                    n3 = this.l;
                }
                if (this.k == -1) {
                    if (!n2) {
                        height = -1;
                    }
                    if (n2) {
                        final PopupWindow g = this.g;
                        int width;
                        if (this.l == -1) {
                            width = -1;
                        }
                        else {
                            width = 0;
                        }
                        g.setWidth(width);
                        this.g.setHeight(0);
                    }
                    else {
                        final PopupWindow g2 = this.g;
                        int width2;
                        if (this.l == -1) {
                            width2 = -1;
                        }
                        else {
                            width2 = 0;
                        }
                        g2.setWidth(width2);
                        this.g.setHeight(-1);
                    }
                }
                else if (this.k != -2) {
                    height = this.k;
                }
                final PopupWindow g3 = this.g;
                boolean outsideTouchable2 = b;
                if (!this.v) {
                    outsideTouchable2 = b;
                    if (!this.u) {
                        outsideTouchable2 = true;
                    }
                }
                g3.setOutsideTouchable(outsideTouchable2);
                final PopupWindow g4 = this.g;
                final View i = this.i();
                final int m = this.m;
                final int n4 = this.n;
                int n5;
                if ((n5 = n3) < 0) {
                    n5 = -1;
                }
                if (height < 0) {
                    height = n;
                }
                g4.update(i, m, n4, n5, height);
            }
        }
        else {
            Label_0497: {
                if (this.l != -1) {
                    break Label_0497;
                }
                int width3 = -1;
            Label_0320_Outer:
                while (true) {
                    Label_0525: {
                        if (this.k != -1) {
                            break Label_0525;
                        }
                        height = -1;
                    Label_0361_Outer:
                        while (true) {
                            this.g.setWidth(width3);
                            this.g.setHeight(height);
                            this.c(true);
                            final PopupWindow g5 = this.g;
                            Label_0542: {
                                if (this.v || this.u) {
                                    break Label_0542;
                                }
                            Label_0425_Outer:
                                while (true) {
                                    g5.setOutsideTouchable(outsideTouchable);
                                    this.g.setTouchInterceptor((View$OnTouchListener)this.D);
                                    if (this.s) {
                                        android.support.v4.widget.i.a(this.g, this.r);
                                    }
                                Block_21_Outer:
                                    while (true) {
                                        if (aj.h == null) {
                                            break Label_0425;
                                        }
                                        try {
                                            aj.h.invoke(this.g, this.I);
                                            android.support.v4.widget.i.a(this.g, this.i(), this.m, this.n, this.t);
                                            this.c.setSelection(-1);
                                            if (!this.J || this.c.isInTouchMode()) {
                                                this.m();
                                            }
                                            if (!this.J) {
                                                this.f.post((Runnable)this.F);
                                                return;
                                            }
                                            return;
                                            // iftrue(Label_0320:, this.k == -2)
                                            while (true) {
                                                height = this.k;
                                                continue Label_0361_Outer;
                                                continue Block_21_Outer;
                                            }
                                            // iftrue(Label_0517:, this.l != -2)
                                            while (true) {
                                                width3 = this.i().getWidth();
                                                continue Label_0320_Outer;
                                                outsideTouchable = false;
                                                continue Label_0425_Outer;
                                                continue;
                                            }
                                            Label_0517: {
                                                width3 = this.l;
                                            }
                                            continue Label_0320_Outer;
                                        }
                                        catch (Exception ex) {
                                            Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", (Throwable)ex);
                                            continue;
                                        }
                                        break;
                                    }
                                    break;
                                }
                            }
                            break;
                        }
                    }
                    break;
                }
            }
        }
    }
    
    public void a(final int x) {
        this.x = x;
    }
    
    public void a(final Rect i) {
        this.I = i;
    }
    
    public void a(final Drawable backgroundDrawable) {
        this.g.setBackgroundDrawable(backgroundDrawable);
    }
    
    public void a(final AdapterView$OnItemClickListener b) {
        this.B = b;
    }
    
    public void a(final ListAdapter j) {
        if (this.y == null) {
            this.y = new b();
        }
        else if (this.j != null) {
            this.j.unregisterDataSetObserver(this.y);
        }
        this.j = j;
        if (this.j != null) {
            j.registerDataSetObserver(this.y);
        }
        if (this.c != null) {
            this.c.setAdapter(this.j);
        }
    }
    
    public void a(final PopupWindow$OnDismissListener onDismissListener) {
        this.g.setOnDismissListener(onDismissListener);
    }
    
    public void a(final boolean b) {
        this.J = b;
        this.g.setFocusable(b);
    }
    
    public void b(final int animationStyle) {
        this.g.setAnimationStyle(animationStyle);
    }
    
    public void b(final View z) {
        this.z = z;
    }
    
    public void b(final boolean r) {
        this.s = true;
        this.r = r;
    }
    
    @Override
    public void c() {
        this.g.dismiss();
        this.b();
        this.g.setContentView((View)null);
        this.c = null;
        this.f.removeCallbacks((Runnable)this.e);
    }
    
    public void c(final int m) {
        this.m = m;
    }
    
    public void d(final int n) {
        this.n = n;
        this.p = true;
    }
    
    @Override
    public boolean d() {
        return this.g.isShowing();
    }
    
    @Override
    public ListView e() {
        return this.c;
    }
    
    public void e(final int t) {
        this.t = t;
    }
    
    public void f(final int l) {
        this.l = l;
    }
    
    public void g(final int n) {
        final Drawable background = this.g.getBackground();
        if (background != null) {
            background.getPadding(this.H);
            this.l = this.H.left + this.H.right + n;
            return;
        }
        this.f(n);
    }
    
    public boolean g() {
        return this.J;
    }
    
    public Drawable h() {
        return this.g.getBackground();
    }
    
    public void h(final int inputMethodMode) {
        this.g.setInputMethodMode(inputMethodMode);
    }
    
    public View i() {
        return this.z;
    }
    
    public void i(final int selection) {
        final af c = this.c;
        if (this.d() && c != null) {
            c.setListSelectionHidden(false);
            c.setSelection(selection);
            if (c.getChoiceMode() != 0) {
                c.setItemChecked(selection, true);
            }
        }
    }
    
    public int j() {
        return this.m;
    }
    
    public int k() {
        if (!this.p) {
            return 0;
        }
        return this.n;
    }
    
    public int l() {
        return this.l;
    }
    
    public void m() {
        final af c = this.c;
        if (c != null) {
            c.setListSelectionHidden(true);
            c.requestLayout();
        }
    }
    
    public boolean n() {
        return this.g.getInputMethodMode() == 2;
    }
    
    private class a implements Runnable
    {
        @Override
        public void run() {
            aj.this.m();
        }
    }
    
    private class b extends DataSetObserver
    {
        public void onChanged() {
            if (aj.this.d()) {
                aj.this.a();
            }
        }
        
        public void onInvalidated() {
            aj.this.c();
        }
    }
    
    private class c implements AbsListView$OnScrollListener
    {
        public void onScroll(final AbsListView absListView, final int n, final int n2, final int n3) {
        }
        
        public void onScrollStateChanged(final AbsListView absListView, final int n) {
            if (n == 1 && !aj.this.n() && aj.this.g.getContentView() != null) {
                aj.this.f.removeCallbacks((Runnable)aj.this.e);
                aj.this.e.run();
            }
        }
    }
    
    private class d implements View$OnTouchListener
    {
        public boolean onTouch(final View view, final MotionEvent motionEvent) {
            final int action = motionEvent.getAction();
            final int n = (int)motionEvent.getX();
            final int n2 = (int)motionEvent.getY();
            if (action == 0 && aj.this.g != null && aj.this.g.isShowing() && n >= 0 && n < aj.this.g.getWidth() && n2 >= 0 && n2 < aj.this.g.getHeight()) {
                aj.this.f.postDelayed((Runnable)aj.this.e, 250L);
            }
            else if (action == 1) {
                aj.this.f.removeCallbacks((Runnable)aj.this.e);
            }
            return false;
        }
    }
    
    private class e implements Runnable
    {
        @Override
        public void run() {
            if (aj.this.c != null && android.support.v4.h.p.m((View)aj.this.c) && aj.this.c.getCount() > aj.this.c.getChildCount() && aj.this.c.getChildCount() <= aj.this.d) {
                aj.this.g.setInputMethodMode(2);
                aj.this.a();
            }
        }
    }
}
