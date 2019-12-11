package androidx.leanback.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.LinearLayout;

class PlaybackControlsRowView extends LinearLayout {

    /* renamed from: c */
    private C0615a f2650c;

    /* renamed from: androidx.leanback.widget.PlaybackControlsRowView$a */
    public interface C0615a {
        /* renamed from: a */
        boolean mo3517a(KeyEvent keyEvent);
    }

    public PlaybackControlsRowView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        boolean z = true;
        if (super.dispatchKeyEvent(keyEvent)) {
            return true;
        }
        C0615a aVar = this.f2650c;
        if (aVar == null || !aVar.mo3517a(keyEvent)) {
            z = false;
        }
        return z;
    }

    public boolean hasOverlappingRendering() {
        return false;
    }

    /* access modifiers changed from: protected */
    public boolean onRequestFocusInDescendants(int i, Rect rect) {
        View findFocus = findFocus();
        if (findFocus == null || !findFocus.requestFocus(i, rect)) {
            return super.onRequestFocusInDescendants(i, rect);
        }
        return true;
    }

    public PlaybackControlsRowView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
