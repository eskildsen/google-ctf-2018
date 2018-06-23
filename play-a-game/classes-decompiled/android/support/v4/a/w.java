// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v4.a;

import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager$NameNotFoundException;
import android.util.Log;
import android.content.Context;
import android.content.ComponentName;
import android.os.Build$VERSION;
import android.content.Intent;
import android.app.Activity;

public final class w
{
    public static Intent a(final Activity activity) {
        if (Build$VERSION.SDK_INT >= 16) {
            final Intent parentActivityIntent = activity.getParentActivityIntent();
            if (parentActivityIntent != null) {
                return parentActivityIntent;
            }
        }
        final String b = b(activity);
        if (b == null) {
            return null;
        }
        final ComponentName component = new ComponentName((Context)activity, b);
        try {
            if (b((Context)activity, component) == null) {
                return Intent.makeMainActivity(component);
            }
            return new Intent().setComponent(component);
        }
        catch (PackageManager$NameNotFoundException ex) {
            Log.e("NavUtils", "getParentActivityIntent: bad parentActivityName '" + b + "' in manifest");
            return null;
        }
    }
    
    public static Intent a(final Context context, ComponentName component) {
        final String b = b(context, component);
        if (b == null) {
            return null;
        }
        component = new ComponentName(component.getPackageName(), b);
        if (b(context, component) == null) {
            return Intent.makeMainActivity(component);
        }
        return new Intent().setComponent(component);
    }
    
    public static boolean a(final Activity activity, final Intent intent) {
        if (Build$VERSION.SDK_INT >= 16) {
            return activity.shouldUpRecreateTask(intent);
        }
        final String action = activity.getIntent().getAction();
        return action != null && !action.equals("android.intent.action.MAIN");
    }
    
    public static String b(final Activity activity) {
        try {
            return b((Context)activity, activity.getComponentName());
        }
        catch (PackageManager$NameNotFoundException ex) {
            throw new IllegalArgumentException((Throwable)ex);
        }
    }
    
    public static String b(final Context context, final ComponentName componentName) {
        final ActivityInfo activityInfo = context.getPackageManager().getActivityInfo(componentName, 128);
        Label_0031: {
            if (Build$VERSION.SDK_INT < 16) {
                break Label_0031;
            }
            final String parentActivityName = activityInfo.parentActivityName;
            if (parentActivityName == null) {
                break Label_0031;
            }
            return parentActivityName;
        }
        if (activityInfo.metaData == null) {
            return null;
        }
        final String string = activityInfo.metaData.getString("android.support.PARENT_ACTIVITY");
        if (string == null) {
            return null;
        }
        final String parentActivityName = string;
        if (string.charAt(0) == '.') {
            return context.getPackageName() + string;
        }
        return parentActivityName;
    }
    
    public static void b(final Activity activity, final Intent intent) {
        if (Build$VERSION.SDK_INT >= 16) {
            activity.navigateUpTo(intent);
            return;
        }
        intent.addFlags(67108864);
        activity.startActivity(intent);
        activity.finish();
    }
}
