package androidx.leanback.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import p096e.p146l.C4228f;

public class PlaybackTransportRowView extends LinearLayout {

    /* renamed from: c */
    private C0616a f2651c;

    /* renamed from: androidx.leanback.widget.PlaybackTransportRowView$a */
    public interface C0616a {
        /* renamed from: a */
        boolean mo3524a(KeyEvent keyEvent);
    }

    public PlaybackTransportRowView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        boolean z = true;
        if (super.dispatchKeyEvent(keyEvent)) {
            return true;
        }
        C0616a aVar = this.f2651c;
        if (aVar == null || !aVar.mo3524a(keyEvent)) {
            z = false;
        }
        return z;
    }

    public View focusSearch(View view, int i) {
        View childAt;
        if (view != null) {
            if (i == 33) {
                for (int indexOfChild = indexOfChild(getFocusedChild()) - 1; indexOfChild >= 0; indexOfChild--) {
                    View childAt2 = getChildAt(indexOfChild);
                    if (childAt2.hasFocusable()) {
                        return childAt2;
                    }
                }
            } else if (i == 130) {
                int indexOfChild2 = indexOfChild(getFocusedChild());
                do {
                    indexOfChild2++;
                    if (indexOfChild2 < getChildCount()) {
                        childAt = getChildAt(indexOfChild2);
                    }
                } while (!childAt.hasFocusable());
                return childAt;
            } else if ((i == 17 || i == 66) && (getFocusedChild() instanceof ViewGroup)) {
                return FocusFinder.getInstance().findNextFocus((ViewGroup) getFocusedChild(), view, i);
            }
        }
        return super.focusSearch(view, i);
    }

    /* access modifiers changed from: 0000 */
    public C0616a getOnUnhandledKeyListener() {
        return this.f2651c;
    }

    public boolean hasOverlappingRendering() {
        return false;
    }

    /* access modifiers changed from: protected */
    public boolean onRequestFocusInDescendants(int i, Rect rect) {
        View findFocus = findFocus();
        if (findFocus != null && findFocus.requestFocus(i, rect)) {
            return true;
        }
        View findViewById = findViewById(C4228f.playback_progress);
        if (findViewById == null || !findViewById.isFocusable() || !findViewById.requestFocus(i, rect)) {
            return super.onRequestFocusInDescendants(i, rect);
        }
        return true;
    }

    /* access modifiers changed from: 0000 */
    public void setOnUnhandledKeyListener(C0616a aVar) {
        this.f2651c = aVar;
    }

    public PlaybackTransportRowView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
