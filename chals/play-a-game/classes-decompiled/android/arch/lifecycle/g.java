// 
// Decompiled by Procyon v0.5.30
// 

package android.arch.lifecycle;

import android.os.Bundle;
import android.app.FragmentManager;
import android.app.Activity;
import android.app.Fragment;

public class g extends Fragment
{
    private a a;
    
    public static void a(final Activity activity) {
        final FragmentManager fragmentManager = activity.getFragmentManager();
        if (fragmentManager.findFragmentByTag("android.arch.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
            fragmentManager.beginTransaction().add((Fragment)new g(), "android.arch.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
            fragmentManager.executePendingTransactions();
        }
    }
    
    private void a(final b.a a) {
        final Activity activity = this.getActivity();
        if (activity instanceof e) {
            ((e)activity).b().a(a);
        }
        else if (activity instanceof c) {
            final b a2 = ((e)activity).a();
            if (a2 instanceof d) {
                ((d)a2).a(a);
            }
        }
    }
    
    private void a(final a a) {
        if (a != null) {
            a.a();
        }
    }
    
    private void b(final a a) {
        if (a != null) {
            a.b();
        }
    }
    
    private void c(final a a) {
        if (a != null) {
            a.c();
        }
    }
    
    public void onActivityCreated(final Bundle bundle) {
        super.onActivityCreated(bundle);
        this.a(this.a);
        this.a(b.a.ON_CREATE);
    }
    
    public void onDestroy() {
        super.onDestroy();
        this.a(b.a.ON_DESTROY);
        this.a = null;
    }
    
    public void onPause() {
        super.onPause();
        this.a(b.a.ON_PAUSE);
    }
    
    public void onResume() {
        super.onResume();
        this.c(this.a);
        this.a(b.a.ON_RESUME);
    }
    
    public void onStart() {
        super.onStart();
        this.b(this.a);
        this.a(b.a.ON_START);
    }
    
    public void onStop() {
        super.onStop();
        this.a(b.a.ON_STOP);
    }
    
    interface a
    {
        void a();
        
        void b();
        
        void c();
    }
}
