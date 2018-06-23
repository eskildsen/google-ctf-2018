// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v4.a;

import android.view.MenuItem;
import android.view.MenuInflater;
import android.view.Menu;
import java.io.PrintWriter;
import java.io.FileDescriptor;
import android.os.Parcelable;
import android.content.res.Configuration;
import android.util.AttributeSet;
import android.content.Context;
import android.view.View;

public class k
{
    private final l<?> a;
    
    private k(final l<?> a) {
        this.a = a;
    }
    
    public static final k a(final l<?> l) {
        return new k(l);
    }
    
    public h a(final String s) {
        return this.a.d.b(s);
    }
    
    public m a() {
        return this.a.i();
    }
    
    public View a(final View view, final String s, final Context context, final AttributeSet set) {
        return this.a.d.onCreateView(view, s, context, set);
    }
    
    public void a(final Configuration configuration) {
        this.a.d.a(configuration);
    }
    
    public void a(final Parcelable parcelable, final o o) {
        this.a.d.a(parcelable, o);
    }
    
    public void a(final h h) {
        this.a.d.a(this.a, this.a, h);
    }
    
    public void a(final android.support.v4.g.k<String, u> k) {
        this.a.a(k);
    }
    
    public void a(final String s, final FileDescriptor fileDescriptor, final PrintWriter printWriter, final String[] array) {
        this.a.b(s, fileDescriptor, printWriter, array);
    }
    
    public void a(final boolean b) {
        this.a.d.a(b);
    }
    
    public boolean a(final Menu menu) {
        return this.a.d.a(menu);
    }
    
    public boolean a(final Menu menu, final MenuInflater menuInflater) {
        return this.a.d.a(menu, menuInflater);
    }
    
    public boolean a(final MenuItem menuItem) {
        return this.a.d.a(menuItem);
    }
    
    public void b() {
        this.a.d.k();
    }
    
    public void b(final Menu menu) {
        this.a.d.b(menu);
    }
    
    public void b(final boolean b) {
        this.a.d.b(b);
    }
    
    public boolean b(final MenuItem menuItem) {
        return this.a.d.b(menuItem);
    }
    
    public Parcelable c() {
        return this.a.d.j();
    }
    
    public void c(final boolean b) {
        this.a.a(b);
    }
    
    public o d() {
        return this.a.d.h();
    }
    
    public void e() {
        this.a.d.l();
    }
    
    public void f() {
        this.a.d.m();
    }
    
    public void g() {
        this.a.d.n();
    }
    
    public void h() {
        this.a.d.o();
    }
    
    public void i() {
        this.a.d.p();
    }
    
    public void j() {
        this.a.d.q();
    }
    
    public void k() {
        this.a.d.r();
    }
    
    public void l() {
        this.a.d.t();
    }
    
    public void m() {
        this.a.d.u();
    }
    
    public boolean n() {
        return this.a.d.e();
    }
    
    public void o() {
        this.a.k();
    }
    
    public void p() {
        this.a.l();
    }
    
    public void q() {
        this.a.m();
    }
    
    public android.support.v4.g.k<String, u> r() {
        return this.a.n();
    }
}
