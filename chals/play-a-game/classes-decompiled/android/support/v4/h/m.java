// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v4.h;

import android.view.View;
import android.view.ViewGroup;

public class m
{
    private final ViewGroup a;
    private int b;
    
    public m(final ViewGroup a) {
        this.a = a;
    }
    
    public int a() {
        return this.b;
    }
    
    public void a(final View view) {
        this.a(view, 0);
    }
    
    public void a(final View view, final int n) {
        this.b = 0;
    }
    
    public void a(final View view, final View view2, final int n) {
        this.a(view, view2, n, 0);
    }
    
    public void a(final View view, final View view2, final int b, final int n) {
        this.b = b;
    }
}
