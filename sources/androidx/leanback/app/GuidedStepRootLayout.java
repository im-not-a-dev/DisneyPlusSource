package androidx.leanback.app;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.leanback.widget.C0697y;

class GuidedStepRootLayout extends LinearLayout {

    /* renamed from: U */
    private boolean f2527U = false;

    /* renamed from: c */
    private boolean f2528c = false;

    public GuidedStepRootLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public View focusSearch(View view, int i) {
        View focusSearch = super.focusSearch(view, i);
        if ((i != 17 && i != 66) || C0697y.m3675a(this, focusSearch)) {
            return focusSearch;
        }
        if (getLayoutDirection() != 0 ? i != 66 : i != 17) {
            if (!this.f2527U) {
                return view;
            }
        } else if (!this.f2528c) {
            return view;
        }
        return focusSearch;
    }

    public GuidedStepRootLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
