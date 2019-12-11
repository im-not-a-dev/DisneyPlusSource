package androidx.browser.browseractions;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View.MeasureSpec;
import android.widget.LinearLayout;
import p096e.p110c.C3917a;

public class BrowserActionsFallbackMenuView extends LinearLayout {

    /* renamed from: U */
    private final int f1325U = getResources().getDimensionPixelOffset(C3917a.browser_actions_context_menu_max_width);

    /* renamed from: c */
    private final int f1326c = getResources().getDimensionPixelOffset(C3917a.browser_actions_context_menu_min_padding);

    public BrowserActionsFallbackMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(MeasureSpec.makeMeasureSpec(Math.min(getResources().getDisplayMetrics().widthPixels - (this.f1326c * 2), this.f1325U), 1073741824), i2);
    }
}
