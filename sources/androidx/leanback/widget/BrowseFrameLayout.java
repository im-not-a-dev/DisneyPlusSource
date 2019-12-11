package androidx.leanback.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnKeyListener;
import android.widget.FrameLayout;

public class BrowseFrameLayout extends FrameLayout {

    /* renamed from: U */
    private C0606a f2567U;

    /* renamed from: V */
    private OnKeyListener f2568V;

    /* renamed from: c */
    private C0607b f2569c;

    /* renamed from: androidx.leanback.widget.BrowseFrameLayout$a */
    public interface C0606a {
        /* renamed from: a */
        void mo3418a(View view, View view2);

        /* renamed from: a */
        boolean mo3419a(int i, Rect rect);
    }

    /* renamed from: androidx.leanback.widget.BrowseFrameLayout$b */
    public interface C0607b {
        /* renamed from: a */
        View mo3420a(View view, int i);
    }

    public BrowseFrameLayout(Context context) {
        this(context, null, 0);
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        boolean dispatchKeyEvent = super.dispatchKeyEvent(keyEvent);
        OnKeyListener onKeyListener = this.f2568V;
        return (onKeyListener == null || dispatchKeyEvent) ? dispatchKeyEvent : onKeyListener.onKey(getRootView(), keyEvent.getKeyCode(), keyEvent);
    }

    public View focusSearch(View view, int i) {
        C0607b bVar = this.f2569c;
        if (bVar != null) {
            View a = bVar.mo3420a(view, i);
            if (a != null) {
                return a;
            }
        }
        return super.focusSearch(view, i);
    }

    public C0606a getOnChildFocusListener() {
        return this.f2567U;
    }

    public C0607b getOnFocusSearchListener() {
        return this.f2569c;
    }

    /* access modifiers changed from: protected */
    public boolean onRequestFocusInDescendants(int i, Rect rect) {
        C0606a aVar = this.f2567U;
        if (aVar == null || !aVar.mo3419a(i, rect)) {
            return super.onRequestFocusInDescendants(i, rect);
        }
        return true;
    }

    public void requestChildFocus(View view, View view2) {
        C0606a aVar = this.f2567U;
        if (aVar != null) {
            aVar.mo3418a(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    public void setOnChildFocusListener(C0606a aVar) {
        this.f2567U = aVar;
    }

    public void setOnDispatchKeyListener(OnKeyListener onKeyListener) {
        this.f2568V = onKeyListener;
    }

    public void setOnFocusSearchListener(C0607b bVar) {
        this.f2569c = bVar;
    }

    public BrowseFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public BrowseFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
