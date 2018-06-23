// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v4.a;

import java.util.Iterator;
import android.support.v4.b.a;
import android.os.Bundle;
import android.content.pm.PackageManager$NameNotFoundException;
import android.util.Log;
import android.content.ComponentName;
import android.app.Activity;
import android.os.Build$VERSION;
import android.content.Context;
import java.util.ArrayList;
import android.content.Intent;

public final class ab implements Iterable<Intent>
{
    private static final c a;
    private final ArrayList<Intent> b;
    private final Context c;
    
    static {
        if (Build$VERSION.SDK_INT >= 16) {
            a = (c)new b();
            return;
        }
        a = new c();
    }
    
    private ab(final Context c) {
        this.b = new ArrayList<Intent>();
        this.c = c;
    }
    
    public static ab a(final Context context) {
        return new ab(context);
    }
    
    public ab a(final Activity activity) {
        Intent a_ = null;
        if (activity instanceof a) {
            a_ = ((a)activity).a_();
        }
        Intent a;
        if (a_ == null) {
            a = w.a(activity);
        }
        else {
            a = a_;
        }
        if (a != null) {
            ComponentName componentName;
            if ((componentName = a.getComponent()) == null) {
                componentName = a.resolveActivity(this.c.getPackageManager());
            }
            this.a(componentName);
            this.a(a);
        }
        return this;
    }
    
    public ab a(final ComponentName componentName) {
        final int size = this.b.size();
        try {
            for (Intent intent = w.a(this.c, componentName); intent != null; intent = w.a(this.c, intent.getComponent())) {
                this.b.add(size, intent);
            }
        }
        catch (PackageManager$NameNotFoundException ex) {
            Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
            throw new IllegalArgumentException((Throwable)ex);
        }
        return this;
    }
    
    public ab a(final Intent intent) {
        this.b.add(intent);
        return this;
    }
    
    public void a() {
        this.a((Bundle)null);
    }
    
    public void a(final Bundle bundle) {
        if (this.b.isEmpty()) {
            throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
        }
        final Intent[] array = this.b.toArray(new Intent[this.b.size()]);
        array[0] = new Intent(array[0]).addFlags(268484608);
        if (!android.support.v4.b.a.a(this.c, array, bundle)) {
            final Intent intent = new Intent(array[array.length - 1]);
            intent.addFlags(268435456);
            this.c.startActivity(intent);
        }
    }
    
    @Deprecated
    @Override
    public Iterator<Intent> iterator() {
        return this.b.iterator();
    }
    
    public interface a
    {
        Intent a_();
    }
    
    static class b extends c
    {
    }
    
    static class c
    {
    }
}
