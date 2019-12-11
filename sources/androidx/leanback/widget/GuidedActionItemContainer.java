package androidx.leanback.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

class GuidedActionItemContainer extends C0671l {

    /* renamed from: W */
    private boolean f2581W;

    public GuidedActionItemContainer(Context context) {
        this(context, null);
    }

    public View focusSearch(View view, int i) {
        if (this.f2581W || !C0697y.m3675a(this, view)) {
            return super.focusSearch(view, i);
        }
        View focusSearch = super.focusSearch(view, i);
        if (C0697y.m3675a(this, focusSearch)) {
            return focusSearch;
        }
        return null;
    }

    public GuidedActionItemContainer(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public GuidedActionItemContainer(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f2581W = true;
    }
}
