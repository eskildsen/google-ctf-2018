// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v7.widget;

import android.graphics.Canvas;
import android.support.v7.a.a;
import android.util.AttributeSet;
import android.content.Context;
import android.widget.SeekBar;

public class v extends SeekBar
{
    private final w a;
    
    public v(final Context context, final AttributeSet set) {
        this(context, set, android.support.v7.a.a.a.seekBarStyle);
    }
    
    public v(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
        (this.a = new w(this)).a(set, n);
    }
    
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        this.a.c();
    }
    
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        this.a.b();
    }
    
    protected void onDraw(final Canvas canvas) {
        synchronized (this) {
            super.onDraw(canvas);
            this.a.a(canvas);
        }
    }
}
