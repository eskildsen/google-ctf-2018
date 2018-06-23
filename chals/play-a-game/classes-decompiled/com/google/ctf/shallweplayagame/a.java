// 
// Decompiled by Procyon v0.5.30
// 

package com.google.ctf.shallweplayagame;

import android.view.View;
import android.graphics.Typeface;
import android.view.ViewGroup$LayoutParams;
import android.widget.RelativeLayout$LayoutParams;
import android.animation.Animator$AnimatorListener;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import android.util.TypedValue;
import android.widget.TextView;
import android.animation.AnimatorSet;
import java.util.Queue;
import android.content.Context;
import android.widget.RelativeLayout;

public class a extends RelativeLayout
{
    static final String a;
    Context b;
    Queue<AnimatorSet> c;
    public a d;
    TextView e;
    
    static {
        a = new String(Character.toChars(9762));
    }
    
    public a(final Context b, final Queue<AnimatorSet> c) {
        super(b);
        this.b = b;
        this.c = c;
        this.d = com.google.ctf.shallweplayagame.a.a.a;
        this.b();
        this.c();
    }
    
    private int a(final int n) {
        return (int)TypedValue.applyDimension(1, (float)n, this.b.getResources().getDisplayMetrics());
    }
    
    private AnimatorSet a(final String s, final int n) {
        final AnimatorSet set = new AnimatorSet();
        final ValueAnimator$AnimatorUpdateListener valueAnimator$AnimatorUpdateListener = (ValueAnimator$AnimatorUpdateListener)new ValueAnimator$AnimatorUpdateListener() {
            public void onAnimationUpdate(final ValueAnimator valueAnimator) {
                final Float n = (Float)valueAnimator.getAnimatedValue();
                com.google.ctf.shallweplayagame.a.this.e.setScaleX((float)n);
                com.google.ctf.shallweplayagame.a.this.e.setScaleY((float)n);
            }
        };
        final ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[] { 1.0f, 0.0f });
        ofFloat.setDuration((long)n);
        ofFloat.addUpdateListener((ValueAnimator$AnimatorUpdateListener)valueAnimator$AnimatorUpdateListener);
        ofFloat.addListener((Animator$AnimatorListener)new AnimatorListenerAdapter() {
            public void onAnimationEnd(final Animator animator) {
                super.onAnimationEnd(animator);
                com.google.ctf.shallweplayagame.a.this.e.setText((CharSequence)s);
                if (s.equals(com.google.ctf.shallweplayagame.a.a)) {
                    com.google.ctf.shallweplayagame.b.b();
                }
                else if (s.equals(" ")) {
                    com.google.ctf.shallweplayagame.b.a();
                }
            }
        });
        final ValueAnimator ofFloat2 = ValueAnimator.ofFloat(new float[] { 0.0f, 1.0f });
        ofFloat2.setDuration((long)n);
        ofFloat2.addUpdateListener((ValueAnimator$AnimatorUpdateListener)valueAnimator$AnimatorUpdateListener);
        set.addListener((Animator$AnimatorListener)new AnimatorListenerAdapter() {
            public void onAnimationEnd(final Animator animator) {
                super.onAnimationEnd(animator);
                final AnimatorSet set = com.google.ctf.shallweplayagame.a.this.c.poll();
                if (set != null) {
                    set.start();
                }
            }
        });
        set.play((Animator)ofFloat2).after((Animator)ofFloat);
        return set;
    }
    
    private void b() {
        final int a = this.a(5);
        final int a2 = this.a(5);
        this.setPadding(a, a2, a, a2);
        final int a3 = this.a(100);
        final RelativeLayout$LayoutParams layoutParams = new RelativeLayout$LayoutParams(a3, a3);
        final int a4 = this.a(5);
        layoutParams.setMargins(a4, a4, a4, a4);
        this.setLayoutParams((ViewGroup$LayoutParams)layoutParams);
        this.setBackground(this.b.getResources().getDrawable(2131099732));
    }
    
    private void c() {
        (this.e = new TextView(this.b)).setTypeface(Typeface.MONOSPACE);
        this.e.setTextColor(-1);
        this.e.setTextSize((float)this.a(20));
        final RelativeLayout$LayoutParams layoutParams = new RelativeLayout$LayoutParams(-2, -2);
        layoutParams.addRule(13);
        this.e.setLayoutParams((ViewGroup$LayoutParams)layoutParams);
        this.e.setGravity(1);
        this.e.setText((CharSequence)" ");
        this.addView((View)this.e);
    }
    
    public void a(final a d, final int n) {
        this.d = d;
        String a;
        if (d == com.google.ctf.shallweplayagame.a.a.a) {
            a = " ";
        }
        else if (d == com.google.ctf.shallweplayagame.a.a.b) {
            a = "X";
        }
        else if (d == com.google.ctf.shallweplayagame.a.a.c) {
            a = "O";
        }
        else {
            a = com.google.ctf.shallweplayagame.a.a;
        }
        this.c.add(this.a(a, n));
    }
    
    public boolean a() {
        return this.d == com.google.ctf.shallweplayagame.a.a.a;
    }
    
    public void setValue(final a a) {
        this.a(a, 100);
    }
    
    enum a
    {
        a, 
        b, 
        c, 
        d;
    }
}
