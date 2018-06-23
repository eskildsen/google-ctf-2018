// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v4.b.a;

import android.os.Build$VERSION;
import android.graphics.drawable.Drawable;
import android.content.res.Resources$Theme;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;
import android.util.Log;
import org.xmlpull.v1.XmlPullParser;
import android.support.v4.c.c;
import android.content.res.Resources$NotFoundException;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.widget.TextView;
import android.util.TypedValue;
import android.content.Context;

public final class b
{
    public static Typeface a(final Context context, final int n, final TypedValue typedValue, final int n2, final TextView textView) {
        if (context.isRestricted()) {
            return null;
        }
        return b(context, n, typedValue, n2, textView);
    }
    
    private static Typeface a(final Context context, final Resources resources, final TypedValue typedValue, final int n, final int n2, final TextView textView) {
        if (typedValue.string == null) {
            throw new Resources$NotFoundException("Resource \"" + resources.getResourceName(n) + "\" (" + Integer.toHexString(n) + ") is not a Font: " + typedValue);
        }
        final String string = typedValue.string.toString();
        Typeface a;
        if (!string.startsWith("res/")) {
            a = null;
        }
        else if ((a = c.a(resources, n, n2)) == null) {
            try {
                if (!string.toLowerCase().endsWith(".xml")) {
                    return c.a(context, resources, n, string, n2);
                }
                final a.a a2 = android.support.v4.b.a.a.a((XmlPullParser)resources.getXml(n), resources);
                if (a2 == null) {
                    Log.e("ResourcesCompat", "Failed to find font-family tag");
                    return null;
                }
                return c.a(context, a2, resources, n, n2, textView);
            }
            catch (XmlPullParserException ex) {
                Log.e("ResourcesCompat", "Failed to parse xml resource " + string, (Throwable)ex);
            }
            catch (IOException ex2) {
                Log.e("ResourcesCompat", "Failed to read xml resource " + string, (Throwable)ex2);
                goto Label_0191;
            }
        }
        return a;
    }
    
    public static Drawable a(final Resources resources, final int n, final Resources$Theme resources$Theme) {
        if (Build$VERSION.SDK_INT >= 21) {
            return resources.getDrawable(n, resources$Theme);
        }
        return resources.getDrawable(n);
    }
    
    private static Typeface b(final Context context, final int n, final TypedValue typedValue, final int n2, final TextView textView) {
        final Resources resources = context.getResources();
        resources.getValue(n, typedValue, true);
        final Typeface a = a(context, resources, typedValue, n, n2, textView);
        if (a != null) {
            return a;
        }
        throw new Resources$NotFoundException("Font resource ID #0x" + Integer.toHexString(n));
    }
}
