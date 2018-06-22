// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v7.view;

import android.view.ActionMode$Callback;
import android.view.WindowManager$LayoutParams;
import android.view.SearchEvent;
import android.view.KeyboardShortcutGroup;
import java.util.List;
import android.view.MenuItem;
import android.view.View;
import android.view.Menu;
import android.view.ActionMode;
import android.view.accessibility.AccessibilityEvent;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.Window$Callback;

public class i implements Window$Callback
{
    final Window$Callback e;
    
    public i(final Window$Callback e) {
        if (e == null) {
            throw new IllegalArgumentException("Window callback may not be null");
        }
        this.e = e;
    }
    
    public boolean dispatchGenericMotionEvent(final MotionEvent motionEvent) {
        return this.e.dispatchGenericMotionEvent(motionEvent);
    }
    
    public boolean dispatchKeyEvent(final KeyEvent keyEvent) {
        return this.e.dispatchKeyEvent(keyEvent);
    }
    
    public boolean dispatchKeyShortcutEvent(final KeyEvent keyEvent) {
        return this.e.dispatchKeyShortcutEvent(keyEvent);
    }
    
    public boolean dispatchPopulateAccessibilityEvent(final AccessibilityEvent accessibilityEvent) {
        return this.e.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }
    
    public boolean dispatchTouchEvent(final MotionEvent motionEvent) {
        return this.e.dispatchTouchEvent(motionEvent);
    }
    
    public boolean dispatchTrackballEvent(final MotionEvent motionEvent) {
        return this.e.dispatchTrackballEvent(motionEvent);
    }
    
    public void onActionModeFinished(final ActionMode actionMode) {
        this.e.onActionModeFinished(actionMode);
    }
    
    public void onActionModeStarted(final ActionMode actionMode) {
        this.e.onActionModeStarted(actionMode);
    }
    
    public void onAttachedToWindow() {
        this.e.onAttachedToWindow();
    }
    
    public void onContentChanged() {
        this.e.onContentChanged();
    }
    
    public boolean onCreatePanelMenu(final int n, final Menu menu) {
        return this.e.onCreatePanelMenu(n, menu);
    }
    
    public View onCreatePanelView(final int n) {
        return this.e.onCreatePanelView(n);
    }
    
    public void onDetachedFromWindow() {
        this.e.onDetachedFromWindow();
    }
    
    public boolean onMenuItemSelected(final int n, final MenuItem menuItem) {
        return this.e.onMenuItemSelected(n, menuItem);
    }
    
    public boolean onMenuOpened(final int n, final Menu menu) {
        return this.e.onMenuOpened(n, menu);
    }
    
    public void onPanelClosed(final int n, final Menu menu) {
        this.e.onPanelClosed(n, menu);
    }
    
    public void onPointerCaptureChanged(final boolean b) {
        this.e.onPointerCaptureChanged(b);
    }
    
    public boolean onPreparePanel(final int n, final View view, final Menu menu) {
        return this.e.onPreparePanel(n, view, menu);
    }
    
    public void onProvideKeyboardShortcuts(final List<KeyboardShortcutGroup> list, final Menu menu, final int n) {
        this.e.onProvideKeyboardShortcuts((List)list, menu, n);
    }
    
    public boolean onSearchRequested() {
        return this.e.onSearchRequested();
    }
    
    public boolean onSearchRequested(final SearchEvent searchEvent) {
        return this.e.onSearchRequested(searchEvent);
    }
    
    public void onWindowAttributesChanged(final WindowManager$LayoutParams windowManager$LayoutParams) {
        this.e.onWindowAttributesChanged(windowManager$LayoutParams);
    }
    
    public void onWindowFocusChanged(final boolean b) {
        this.e.onWindowFocusChanged(b);
    }
    
    public ActionMode onWindowStartingActionMode(final ActionMode$Callback actionMode$Callback) {
        return this.e.onWindowStartingActionMode(actionMode$Callback);
    }
    
    public ActionMode onWindowStartingActionMode(final ActionMode$Callback actionMode$Callback, final int n) {
        return this.e.onWindowStartingActionMode(actionMode$Callback, n);
    }
}
