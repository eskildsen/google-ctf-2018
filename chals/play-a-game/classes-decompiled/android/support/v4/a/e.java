// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v4.a;

import android.content.Intent;
import android.content.IntentSender;
import android.util.AttributeSet;
import android.content.Context;
import android.view.View;

abstract class e extends aa
{
    boolean a;
    
    static void a(final int n) {
        if ((0xFFFF0000 & n) != 0x0) {
            throw new IllegalArgumentException("Can only use lower 16 bits for requestCode");
        }
    }
    
    abstract View a(final View p0, final String p1, final Context p2, final AttributeSet p3);
    
    public View onCreateView(final View view, final String s, final Context context, final AttributeSet set) {
        View view2;
        if ((view2 = this.a(view, s, context, set)) == null) {
            view2 = super.onCreateView(view, s, context, set);
        }
        return view2;
    }
    
    public View onCreateView(final String s, final Context context, final AttributeSet set) {
        View view;
        if ((view = this.a(null, s, context, set)) == null) {
            view = super.onCreateView(s, context, set);
        }
        return view;
    }
    
    public void startIntentSenderForResult(final IntentSender intentSender, final int n, final Intent intent, final int n2, final int n3, final int n4) {
        if (!this.a && n != -1) {
            a(n);
        }
        super.startIntentSenderForResult(intentSender, n, intent, n2, n3, n4);
    }
}
