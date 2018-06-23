// 
// Decompiled by Procyon v0.5.30
// 

package com.google.ctf.shallweplayagame;

import android.os.Handler;
import android.media.ToneGenerator;

public class b
{
    static final ToneGenerator a;
    
    static {
        a = new ToneGenerator(3, 100);
    }
    
    static void a() {
        new Handler().post((Runnable)new Runnable() {
            @Override
            public void run() {
                b.a.startTone(24, 100);
            }
        });
    }
    
    static void b() {
        new Handler().post((Runnable)new Runnable() {
            @Override
            public void run() {
                b.a.startTone(49, 100);
            }
        });
    }
}
