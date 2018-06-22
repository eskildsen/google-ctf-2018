// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v4.h.a;

import android.os.Build$VERSION;
import android.view.accessibility.AccessibilityRecord;

public class e
{
    private static final c a;
    private final AccessibilityRecord b;
    
    static {
        if (Build$VERSION.SDK_INT >= 16) {
            a = (c)new b();
            return;
        }
        if (Build$VERSION.SDK_INT >= 15) {
            a = (c)new a();
            return;
        }
        a = new c();
    }
    
    public static void a(final AccessibilityRecord accessibilityRecord, final int n) {
        e.a.a(accessibilityRecord, n);
    }
    
    public static void b(final AccessibilityRecord accessibilityRecord, final int n) {
        e.a.b(accessibilityRecord, n);
    }
    
    @Deprecated
    @Override
    public boolean equals(final Object o) {
        if (this != o) {
            if (o == null) {
                return false;
            }
            if (this.getClass() != o.getClass()) {
                return false;
            }
            final e e = (e)o;
            if (this.b == null) {
                if (e.b != null) {
                    return false;
                }
            }
            else if (!this.b.equals(e.b)) {
                return false;
            }
        }
        return true;
    }
    
    @Deprecated
    @Override
    public int hashCode() {
        if (this.b == null) {
            return 0;
        }
        return this.b.hashCode();
    }
    
    static class a extends c
    {
        @Override
        public void a(final AccessibilityRecord accessibilityRecord, final int maxScrollX) {
            accessibilityRecord.setMaxScrollX(maxScrollX);
        }
        
        @Override
        public void b(final AccessibilityRecord accessibilityRecord, final int maxScrollY) {
            accessibilityRecord.setMaxScrollY(maxScrollY);
        }
    }
    
    static class b extends a
    {
    }
    
    static class c
    {
        public void a(final AccessibilityRecord accessibilityRecord, final int n) {
        }
        
        public void b(final AccessibilityRecord accessibilityRecord, final int n) {
        }
    }
}
