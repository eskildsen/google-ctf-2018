// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v7.widget;

import android.view.ViewGroup$LayoutParams;
import android.view.WindowManager;
import android.util.DisplayMetrics;
import android.content.res.Resources;
import android.view.View$MeasureSpec;
import android.util.Log;
import android.app.Activity;
import android.content.ContextWrapper;
import android.view.ViewGroup;
import android.support.v7.a.a;
import android.view.LayoutInflater;
import android.graphics.Rect;
import android.view.WindowManager$LayoutParams;
import android.widget.TextView;
import android.view.View;
import android.content.Context;

class ba
{
    private final Context a;
    private final View b;
    private final TextView c;
    private final WindowManager$LayoutParams d;
    private final Rect e;
    private final int[] f;
    private final int[] g;
    
    ba(final Context a) {
        this.d = new WindowManager$LayoutParams();
        this.e = new Rect();
        this.f = new int[2];
        this.g = new int[2];
        this.a = a;
        this.b = LayoutInflater.from(this.a).inflate(android.support.v7.a.a.g.tooltip, (ViewGroup)null);
        this.c = (TextView)this.b.findViewById(android.support.v7.a.a.f.message);
        this.d.setTitle((CharSequence)this.getClass().getSimpleName());
        this.d.packageName = this.a.getPackageName();
        this.d.type = 1002;
        this.d.width = -2;
        this.d.height = -2;
        this.d.format = -3;
        this.d.windowAnimations = android.support.v7.a.a.i.Animation_AppCompat_Tooltip;
        this.d.flags = 24;
    }
    
    private static View a(final View view) {
        for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper)context).getBaseContext()) {
            if (context instanceof Activity) {
                return ((Activity)context).getWindow().getDecorView();
            }
        }
        return view.getRootView();
    }
    
    private void a(final View view, int n, int height, final boolean b, final WindowManager$LayoutParams windowManager$LayoutParams) {
        final int dimensionPixelOffset = this.a.getResources().getDimensionPixelOffset(android.support.v7.a.a.d.tooltip_precise_anchor_threshold);
        if (view.getWidth() < dimensionPixelOffset) {
            n = view.getWidth() / 2;
        }
        int n4;
        if (view.getHeight() >= dimensionPixelOffset) {
            final int dimensionPixelOffset2 = this.a.getResources().getDimensionPixelOffset(android.support.v7.a.a.d.tooltip_precise_anchor_extra_offset);
            final int n2 = height + dimensionPixelOffset2;
            final int n3 = height - dimensionPixelOffset2;
            height = n2;
            n4 = n3;
        }
        else {
            height = view.getHeight();
            n4 = 0;
        }
        windowManager$LayoutParams.gravity = 49;
        final Resources resources = this.a.getResources();
        int n5;
        if (b) {
            n5 = android.support.v7.a.a.d.tooltip_y_offset_touch;
        }
        else {
            n5 = android.support.v7.a.a.d.tooltip_y_offset_non_touch;
        }
        final int dimensionPixelOffset3 = resources.getDimensionPixelOffset(n5);
        final View a = a(view);
        if (a == null) {
            Log.e("TooltipPopup", "Cannot find app view");
            return;
        }
        a.getWindowVisibleDisplayFrame(this.e);
        if (this.e.left < 0 && this.e.top < 0) {
            final Resources resources2 = this.a.getResources();
            final int identifier = resources2.getIdentifier("status_bar_height", "dimen", "android");
            int dimensionPixelSize;
            if (identifier != 0) {
                dimensionPixelSize = resources2.getDimensionPixelSize(identifier);
            }
            else {
                dimensionPixelSize = 0;
            }
            final DisplayMetrics displayMetrics = resources2.getDisplayMetrics();
            this.e.set(0, dimensionPixelSize, displayMetrics.widthPixels, displayMetrics.heightPixels);
        }
        a.getLocationOnScreen(this.g);
        view.getLocationOnScreen(this.f);
        final int[] f = this.f;
        f[0] -= this.g[0];
        final int[] f2 = this.f;
        f2[1] -= this.g[1];
        windowManager$LayoutParams.x = this.f[0] + n - this.e.width() / 2;
        n = View$MeasureSpec.makeMeasureSpec(0, 0);
        this.b.measure(n, n);
        n = this.b.getMeasuredHeight();
        final int n6 = n4 + this.f[1] - dimensionPixelOffset3 - n;
        height = height + this.f[1] + dimensionPixelOffset3;
        if (b) {
            if (n6 >= 0) {
                windowManager$LayoutParams.y = n6;
                return;
            }
            windowManager$LayoutParams.y = height;
        }
        else {
            if (n + height <= this.e.height()) {
                windowManager$LayoutParams.y = height;
                return;
            }
            windowManager$LayoutParams.y = n6;
        }
    }
    
    void a() {
        if (!this.b()) {
            return;
        }
        ((WindowManager)this.a.getSystemService("window")).removeView(this.b);
    }
    
    void a(final View view, final int n, final int n2, final boolean b, final CharSequence text) {
        if (this.b()) {
            this.a();
        }
        this.c.setText(text);
        this.a(view, n, n2, b, this.d);
        ((WindowManager)this.a.getSystemService("window")).addView(this.b, (ViewGroup$LayoutParams)this.d);
    }
    
    boolean b() {
        return this.b.getParent() != null;
    }
}
