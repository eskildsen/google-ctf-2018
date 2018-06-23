// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v4.a;

import android.arch.lifecycle.g;
import android.os.Bundle;
import android.arch.lifecycle.b;
import android.arch.lifecycle.d;
import android.support.v4.g.k;
import android.arch.lifecycle.c;
import android.app.Activity;

public class aa extends Activity implements c
{
    private k<Class<?>, Object> a;
    private d b;
    
    public aa() {
        this.a = new k<Class<?>, Object>();
        this.b = new d(this);
    }
    
    public b a() {
        return this.b;
    }
    
    protected void onCreate(final Bundle bundle) {
        super.onCreate(bundle);
        g.a(this);
    }
    
    protected void onSaveInstanceState(final Bundle bundle) {
        this.b.a(android.arch.lifecycle.b.b.c);
        super.onSaveInstanceState(bundle);
    }
}
