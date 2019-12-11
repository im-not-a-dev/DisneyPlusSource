package p096e.p097a.p104o;

import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.KeyboardShortcutGroup;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.SearchEvent;
import android.view.View;
import android.view.Window.Callback;
import android.view.WindowManager.LayoutParams;
import android.view.accessibility.AccessibilityEvent;
import java.util.List;

/* renamed from: e.a.o.i */
/* compiled from: WindowCallbackWrapper */
public class C3901i implements Callback {

    /* renamed from: c */
    final Callback f9679c;

    public C3901i(Callback callback) {
        if (callback != null) {
            this.f9679c = callback;
            return;
        }
        throw new IllegalArgumentException("Window callback may not be null");
    }

    /* renamed from: a */
    public final Callback mo13955a() {
        return this.f9679c;
    }

    public boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        return this.f9679c.dispatchGenericMotionEvent(motionEvent);
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return this.f9679c.dispatchKeyEvent(keyEvent);
    }

    public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        return this.f9679c.dispatchKeyShortcutEvent(keyEvent);
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return this.f9679c.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return this.f9679c.dispatchTouchEvent(motionEvent);
    }

    public boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        return this.f9679c.dispatchTrackballEvent(motionEvent);
    }

    public void onActionModeFinished(ActionMode actionMode) {
        this.f9679c.onActionModeFinished(actionMode);
    }

    public void onActionModeStarted(ActionMode actionMode) {
        this.f9679c.onActionModeStarted(actionMode);
    }

    public void onAttachedToWindow() {
        this.f9679c.onAttachedToWindow();
    }

    public boolean onCreatePanelMenu(int i, Menu menu) {
        return this.f9679c.onCreatePanelMenu(i, menu);
    }

    public View onCreatePanelView(int i) {
        return this.f9679c.onCreatePanelView(i);
    }

    public void onDetachedFromWindow() {
        this.f9679c.onDetachedFromWindow();
    }

    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        return this.f9679c.onMenuItemSelected(i, menuItem);
    }

    public boolean onMenuOpened(int i, Menu menu) {
        return this.f9679c.onMenuOpened(i, menu);
    }

    public void onPanelClosed(int i, Menu menu) {
        this.f9679c.onPanelClosed(i, menu);
    }

    public void onPointerCaptureChanged(boolean z) {
        this.f9679c.onPointerCaptureChanged(z);
    }

    public boolean onPreparePanel(int i, View view, Menu menu) {
        return this.f9679c.onPreparePanel(i, view, menu);
    }

    public void onProvideKeyboardShortcuts(List<KeyboardShortcutGroup> list, Menu menu, int i) {
        this.f9679c.onProvideKeyboardShortcuts(list, menu, i);
    }

    public boolean onSearchRequested(SearchEvent searchEvent) {
        return this.f9679c.onSearchRequested(searchEvent);
    }

    public void onWindowAttributesChanged(LayoutParams layoutParams) {
        this.f9679c.onWindowAttributesChanged(layoutParams);
    }

    public void onWindowFocusChanged(boolean z) {
        this.f9679c.onWindowFocusChanged(z);
    }

    public ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        return this.f9679c.onWindowStartingActionMode(callback);
    }

    public boolean onSearchRequested() {
        return this.f9679c.onSearchRequested();
    }

    public ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) {
        return this.f9679c.onWindowStartingActionMode(callback, i);
    }
}
