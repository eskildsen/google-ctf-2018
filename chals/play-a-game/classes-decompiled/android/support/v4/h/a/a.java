// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v4.h.a;

import android.graphics.Rect;
import android.os.Build$VERSION;
import android.view.accessibility.AccessibilityNodeInfo;

public class a
{
    static final i a;
    public int b;
    private final AccessibilityNodeInfo c;
    
    static {
        if (Build$VERSION.SDK_INT >= 24) {
            a = (i)new h();
            return;
        }
        if (Build$VERSION.SDK_INT >= 23) {
            a = (i)new g();
            return;
        }
        if (Build$VERSION.SDK_INT >= 22) {
            a = (i)new f();
            return;
        }
        if (Build$VERSION.SDK_INT >= 21) {
            a = (i)new e();
            return;
        }
        if (Build$VERSION.SDK_INT >= 19) {
            a = (i)new d();
            return;
        }
        if (Build$VERSION.SDK_INT >= 18) {
            a = (i)new c();
            return;
        }
        if (Build$VERSION.SDK_INT >= 17) {
            a = (i)new b();
            return;
        }
        if (Build$VERSION.SDK_INT >= 16) {
            a = (i)new a();
            return;
        }
        a = new i();
    }
    
    private a(final AccessibilityNodeInfo c) {
        this.b = -1;
        this.c = c;
    }
    
    public static a a(final AccessibilityNodeInfo accessibilityNodeInfo) {
        return new a(accessibilityNodeInfo);
    }
    
    private static String b(final int n) {
        switch (n) {
            default: {
                return "ACTION_UNKNOWN";
            }
            case 1: {
                return "ACTION_FOCUS";
            }
            case 2: {
                return "ACTION_CLEAR_FOCUS";
            }
            case 4: {
                return "ACTION_SELECT";
            }
            case 8: {
                return "ACTION_CLEAR_SELECTION";
            }
            case 16: {
                return "ACTION_CLICK";
            }
            case 32: {
                return "ACTION_LONG_CLICK";
            }
            case 64: {
                return "ACTION_ACCESSIBILITY_FOCUS";
            }
            case 128: {
                return "ACTION_CLEAR_ACCESSIBILITY_FOCUS";
            }
            case 256: {
                return "ACTION_NEXT_AT_MOVEMENT_GRANULARITY";
            }
            case 512: {
                return "ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY";
            }
            case 1024: {
                return "ACTION_NEXT_HTML_ELEMENT";
            }
            case 2048: {
                return "ACTION_PREVIOUS_HTML_ELEMENT";
            }
            case 4096: {
                return "ACTION_SCROLL_FORWARD";
            }
            case 8192: {
                return "ACTION_SCROLL_BACKWARD";
            }
            case 65536: {
                return "ACTION_CUT";
            }
            case 16384: {
                return "ACTION_COPY";
            }
            case 32768: {
                return "ACTION_PASTE";
            }
            case 131072: {
                return "ACTION_SET_SELECTION";
            }
        }
    }
    
    public AccessibilityNodeInfo a() {
        return this.c;
    }
    
    public void a(final int n) {
        this.c.addAction(n);
    }
    
    public void a(final Rect rect) {
        this.c.getBoundsInParent(rect);
    }
    
    public void a(final CharSequence className) {
        this.c.setClassName(className);
    }
    
    public void a(final boolean scrollable) {
        this.c.setScrollable(scrollable);
    }
    
    public int b() {
        return this.c.getActions();
    }
    
    public void b(final Rect rect) {
        this.c.getBoundsInScreen(rect);
    }
    
    public boolean c() {
        return this.c.isCheckable();
    }
    
    public boolean d() {
        return this.c.isChecked();
    }
    
    public boolean e() {
        return this.c.isFocusable();
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this != o) {
            if (o == null) {
                return false;
            }
            if (this.getClass() != o.getClass()) {
                return false;
            }
            final a a = (a)o;
            if (this.c == null) {
                if (a.c != null) {
                    return false;
                }
            }
            else if (!this.c.equals((Object)a.c)) {
                return false;
            }
        }
        return true;
    }
    
    public boolean f() {
        return this.c.isFocused();
    }
    
    public boolean g() {
        return this.c.isSelected();
    }
    
    public boolean h() {
        return this.c.isClickable();
    }
    
    @Override
    public int hashCode() {
        if (this.c == null) {
            return 0;
        }
        return this.c.hashCode();
    }
    
    public boolean i() {
        return this.c.isLongClickable();
    }
    
    public boolean j() {
        return this.c.isEnabled();
    }
    
    public boolean k() {
        return this.c.isPassword();
    }
    
    public boolean l() {
        return this.c.isScrollable();
    }
    
    public CharSequence m() {
        return this.c.getPackageName();
    }
    
    public CharSequence n() {
        return this.c.getClassName();
    }
    
    public CharSequence o() {
        return this.c.getText();
    }
    
    public CharSequence p() {
        return this.c.getContentDescription();
    }
    
    public String q() {
        return android.support.v4.h.a.a.a.a(this.c);
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        final Rect rect = new Rect();
        this.a(rect);
        sb.append("; boundsInParent: " + rect);
        this.b(rect);
        sb.append("; boundsInScreen: " + rect);
        sb.append("; packageName: ").append(this.m());
        sb.append("; className: ").append(this.n());
        sb.append("; text: ").append(this.o());
        sb.append("; contentDescription: ").append(this.p());
        sb.append("; viewId: ").append(this.q());
        sb.append("; checkable: ").append(this.c());
        sb.append("; checked: ").append(this.d());
        sb.append("; focusable: ").append(this.e());
        sb.append("; focused: ").append(this.f());
        sb.append("; selected: ").append(this.g());
        sb.append("; clickable: ").append(this.h());
        sb.append("; longClickable: ").append(this.i());
        sb.append("; enabled: ").append(this.j());
        sb.append("; password: ").append(this.k());
        sb.append("; scrollable: " + this.l());
        sb.append("; [");
        int n2;
        for (int i = this.b(); i != 0; i = n2) {
            final int n = 1 << Integer.numberOfTrailingZeros(i);
            n2 = (i & ~n);
            sb.append(b(n));
            if ((i = n2) != 0) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
    
    static class a extends i
    {
    }
    
    static class b extends a
    {
    }
    
    static class c extends b
    {
        @Override
        public String a(final AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.getViewIdResourceName();
        }
    }
    
    static class d extends c
    {
    }
    
    static class e extends d
    {
    }
    
    static class f extends e
    {
    }
    
    static class g extends f
    {
    }
    
    static class h extends g
    {
    }
    
    static class i
    {
        public String a(final AccessibilityNodeInfo accessibilityNodeInfo) {
            return null;
        }
    }
}
