// 
// Decompiled by Procyon v0.5.30
// 

package com.google.ctf.shallweplayagame;

import android.widget.LinearLayout;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Random;
import java.util.List;
import java.util.LinkedList;
import java.lang.reflect.Array;
import android.animation.AnimatorSet;
import java.util.Queue;
import android.view.View$OnClickListener;
import android.support.v7.app.c;

public class GameActivity extends c implements View$OnClickListener
{
    a[][] l;
    Queue<AnimatorSet> m;
    Object n;
    int o;
    boolean p;
    byte[] q;
    byte[] r;
    
    public GameActivity() {
        this.r = new byte[] { -61, 15, 25, -115, -46, -11, 65, -3, 34, 93, -39, 98, 123, 17, 42, -121, 60, 40, -60, -112, 77, 111, 34, 14, -31, -4, -7, 66, 116, 108, 114, -122 };
        this.l = (a[][])Array.newInstance(a.class, 3, 3);
        this.m = new LinkedList<AnimatorSet>();
        this.n = N._(3, N.h, 1416127776L + 1869507705L + 544696686L + 1852403303L + 544042870L + 1696622963L + 544108404L + 544501536L + 1886151033L);
        this.q = new byte[32];
        N._(3, N.i, this.n, this.q);
        this.o = 0;
        this.p = false;
    }
    
    a a(final List<a> list) {
        return list.get(((Random)this.n).nextInt(list.size()));
    }
    
    boolean a(final a.a a) {
        final int[] array2;
        final int[] array = array2 = new int[3];
        array2[0] = 0;
        array2[2] = (array2[1] = 0);
        final int[] array4;
        final int[] array3 = array4 = new int[3];
        array4[0] = 0;
        array4[2] = (array4[1] = 0);
        final int[] array6;
        final int[] array5 = array6 = new int[2];
        array6[1] = (array6[0] = 0);
        for (int i = 0; i < 3; ++i) {
            for (int j = 0; j < 3; ++j) {
                if (this.l[j][i].d == a) {
                    ++array[i];
                    ++array3[j];
                    if (i == j) {
                        ++array5[0];
                    }
                    if (i + j == 2) {
                        ++array5[1];
                    }
                }
            }
        }
        for (int length = array.length, k = 0; k < length; ++k) {
            if (array[k] >= 3) {
                return true;
            }
        }
        for (int length2 = array3.length, l = 0; l < length2; ++l) {
            if (array3[l] >= 3) {
                return true;
            }
        }
        for (int length3 = array5.length, n = 0; n < length3; ++n) {
            if (array5[n] >= 3) {
                return true;
            }
        }
        return false;
    }
    
    void k() {
        final AnimatorSet set = this.m.poll();
        if (set != null) {
            set.start();
        }
    }
    
    List<a> l() {
        final ArrayList<a> list = new ArrayList<a>();
        for (int i = 0; i < 3; ++i) {
            for (int j = 0; j < 3; ++j) {
                if (this.l[j][i].a()) {
                    list.add(this.l[j][i]);
                }
            }
        }
        return list;
    }
    
    void m() {
        final Object _ = N._(0, N.a, 0);
        N._(0, N.c, _, 2, N._(1, N.b, this.q, 1));
        this.findViewById(2131165269).setText((CharSequence)new String((byte[])N._(0, N.d, _, this.r)));
        this.o();
    }
    
    void n() {
        for (int i = 0; i < 3; ++i) {
            for (int j = 0; j < 3; ++j) {
                this.l[j][i].a(a.a.a, 25);
            }
        }
        this.k();
        ++this.o;
        final Object _ = N._(2, N.e, 2);
        N._(2, N.f, _, this.q);
        this.q = (byte[])N._(2, N.g, _);
        if (this.o == 1000000) {
            this.m();
            return;
        }
        this.findViewById(2131165269).setText((CharSequence)String.format("%d / %d", this.o, 1000000));
    }
    
    void o() {
        for (int i = 0; i < 3; ++i) {
            for (int j = 0; j < 3; ++j) {
                this.l[j][i].setValue(a.a.d);
            }
        }
        this.o = 0;
        this.p = true;
        this.k();
    }
    
    public void onClick(final View view) {
        if (this.p || !this.m.isEmpty()) {
            return;
        }
        final a a = (a)view;
        if (!a.a()) {
            b.b();
            return;
        }
        b.a();
        a.setValue(com.google.ctf.shallweplayagame.a.a.b);
        if (this.a(com.google.ctf.shallweplayagame.a.a.b)) {
            this.n();
            return;
        }
        final List<a> l = this.l();
        if (l.isEmpty()) {
            this.n();
            return;
        }
        this.a(l).setValue(com.google.ctf.shallweplayagame.a.a.c);
        if (this.a(com.google.ctf.shallweplayagame.a.a.c)) {
            this.o();
            return;
        }
        this.k();
    }
    
    @Override
    protected void onCreate(final Bundle bundle) {
        super.onCreate(bundle);
        this.setContentView(2131296283);
        final LinearLayout linearLayout = this.findViewById(2131165268);
        for (int i = 0; i < 3; ++i) {
            final LinearLayout linearLayout2 = new LinearLayout(this.getApplicationContext());
            for (int j = 0; j < 3; ++j) {
                final a a = new a(this.getApplicationContext(), this.m);
                linearLayout2.addView((View)a);
                (this.l[j][i] = a).setOnClickListener((View$OnClickListener)this);
            }
            linearLayout.addView((View)linearLayout2);
        }
    }
}
