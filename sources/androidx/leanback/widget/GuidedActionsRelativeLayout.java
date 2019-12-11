package androidx.leanback.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.RelativeLayout;
import p096e.p146l.C4228f;

class GuidedActionsRelativeLayout extends RelativeLayout {

    /* renamed from: U */
    private boolean f2582U;

    /* renamed from: V */
    private C0610a f2583V;

    /* renamed from: c */
    private float f2584c;

    /* renamed from: androidx.leanback.widget.GuidedActionsRelativeLayout$a */
    interface C0610a {
        /* renamed from: a */
        boolean mo3450a(KeyEvent keyEvent);
    }

    public GuidedActionsRelativeLayout(Context context) {
        this(context, null);
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        C0610a aVar = this.f2583V;
        if (aVar == null || !aVar.mo3450a(keyEvent)) {
            return super.dispatchKeyEvent(keyEvent);
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.f2582U = false;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int size = MeasureSpec.getSize(i2);
        if (size > 0) {
            View findViewById = findViewById(C4228f.guidedactions_sub_list);
            if (findViewById != null) {
                MarginLayoutParams marginLayoutParams = (MarginLayoutParams) findViewById.getLayoutParams();
                if (marginLayoutParams.topMargin < 0 && !this.f2582U) {
                    this.f2582U = true;
                }
                if (this.f2582U) {
                    marginLayoutParams.topMargin = (int) ((this.f2584c * ((float) size)) / 100.0f);
                }
            }
        }
        super.onMeasure(i, i2);
    }

    public GuidedActionsRelativeLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public GuidedActionsRelativeLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f2582U = false;
        this.f2584c = GuidanceStylingRelativeLayout.m3199a(context);
    }
}
