// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v4.h;

import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import android.view.ViewGroup;
import android.os.Bundle;
import android.view.accessibility.AccessibilityEvent;
import android.support.v4.h.a.a;
import android.view.View;
import android.os.Build$VERSION;
import android.view.View$AccessibilityDelegate;

public class b
{
    private static final b b;
    private static final View$AccessibilityDelegate c;
    final View$AccessibilityDelegate a;
    
    static {
        if (Build$VERSION.SDK_INT >= 16) {
            b = (b)new a();
        }
        else {
            b = new b();
        }
        c = new View$AccessibilityDelegate();
    }
    
    public b() {
        this.a = android.support.v4.h.b.b.a(this);
    }
    
    public b a(final View view) {
        return android.support.v4.h.b.b.a(android.support.v4.h.b.c, view);
    }
    
    View$AccessibilityDelegate a() {
        return this.a;
    }
    
    public void a(final View view, final int n) {
        android.support.v4.h.b.c.sendAccessibilityEvent(view, n);
    }
    
    public void a(final View view, final android.support.v4.h.a.a a) {
        android.support.v4.h.b.c.onInitializeAccessibilityNodeInfo(view, a.a());
    }
    
    public void a(final View view, final AccessibilityEvent accessibilityEvent) {
        android.support.v4.h.b.c.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }
    
    public boolean a(final View view, final int n, final Bundle bundle) {
        return android.support.v4.h.b.b.a(android.support.v4.h.b.c, view, n, bundle);
    }
    
    public boolean a(final ViewGroup viewGroup, final View view, final AccessibilityEvent accessibilityEvent) {
        return android.support.v4.h.b.c.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }
    
    public boolean b(final View view, final AccessibilityEvent accessibilityEvent) {
        return android.support.v4.h.b.c.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }
    
    public void c(final View view, final AccessibilityEvent accessibilityEvent) {
        android.support.v4.h.b.c.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }
    
    public void d(final View view, final AccessibilityEvent accessibilityEvent) {
        android.support.v4.h.b.c.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }
    
    static class a extends b
    {
        @Override
        public b a(final View$AccessibilityDelegate view$AccessibilityDelegate, final View view) {
            final AccessibilityNodeProvider accessibilityNodeProvider = view$AccessibilityDelegate.getAccessibilityNodeProvider(view);
            if (accessibilityNodeProvider != null) {
                return new b(accessibilityNodeProvider);
            }
            return null;
        }
        
        @Override
        public View$AccessibilityDelegate a(final b b) {
            return new View$AccessibilityDelegate() {
                public boolean dispatchPopulateAccessibilityEvent(final View view, final AccessibilityEvent accessibilityEvent) {
                    return b.b(view, accessibilityEvent);
                }
                
                public AccessibilityNodeProvider getAccessibilityNodeProvider(final View view) {
                    final b a = b.a(view);
                    if (a != null) {
                        return (AccessibilityNodeProvider)a.a();
                    }
                    return null;
                }
                
                public void onInitializeAccessibilityEvent(final View view, final AccessibilityEvent accessibilityEvent) {
                    b.d(view, accessibilityEvent);
                }
                
                public void onInitializeAccessibilityNodeInfo(final View view, final AccessibilityNodeInfo accessibilityNodeInfo) {
                    b.a(view, android.support.v4.h.a.a.a(accessibilityNodeInfo));
                }
                
                public void onPopulateAccessibilityEvent(final View view, final AccessibilityEvent accessibilityEvent) {
                    b.c(view, accessibilityEvent);
                }
                
                public boolean onRequestSendAccessibilityEvent(final ViewGroup viewGroup, final View view, final AccessibilityEvent accessibilityEvent) {
                    return b.a(viewGroup, view, accessibilityEvent);
                }
                
                public boolean performAccessibilityAction(final View view, final int n, final Bundle bundle) {
                    return b.a(view, n, bundle);
                }
                
                public void sendAccessibilityEvent(final View view, final int n) {
                    b.a(view, n);
                }
                
                public void sendAccessibilityEventUnchecked(final View view, final AccessibilityEvent accessibilityEvent) {
                    b.a(view, accessibilityEvent);
                }
            };
        }
        
        @Override
        public boolean a(final View$AccessibilityDelegate view$AccessibilityDelegate, final View view, final int n, final Bundle bundle) {
            return view$AccessibilityDelegate.performAccessibilityAction(view, n, bundle);
        }
    }
    
    static class b
    {
        public android.support.v4.h.a.b a(final View$AccessibilityDelegate view$AccessibilityDelegate, final View view) {
            return null;
        }
        
        public View$AccessibilityDelegate a(final android.support.v4.h.b b) {
            return new View$AccessibilityDelegate() {
                public boolean dispatchPopulateAccessibilityEvent(final View view, final AccessibilityEvent accessibilityEvent) {
                    return b.b(view, accessibilityEvent);
                }
                
                public void onInitializeAccessibilityEvent(final View view, final AccessibilityEvent accessibilityEvent) {
                    b.d(view, accessibilityEvent);
                }
                
                public void onInitializeAccessibilityNodeInfo(final View view, final AccessibilityNodeInfo accessibilityNodeInfo) {
                    b.a(view, android.support.v4.h.a.a.a(accessibilityNodeInfo));
                }
                
                public void onPopulateAccessibilityEvent(final View view, final AccessibilityEvent accessibilityEvent) {
                    b.c(view, accessibilityEvent);
                }
                
                public boolean onRequestSendAccessibilityEvent(final ViewGroup viewGroup, final View view, final AccessibilityEvent accessibilityEvent) {
                    return b.a(viewGroup, view, accessibilityEvent);
                }
                
                public void sendAccessibilityEvent(final View view, final int n) {
                    b.a(view, n);
                }
                
                public void sendAccessibilityEventUnchecked(final View view, final AccessibilityEvent accessibilityEvent) {
                    b.a(view, accessibilityEvent);
                }
            };
        }
        
        public boolean a(final View$AccessibilityDelegate view$AccessibilityDelegate, final View view, final int n, final Bundle bundle) {
            return false;
        }
    }
}
