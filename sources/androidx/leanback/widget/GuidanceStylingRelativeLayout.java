package androidx.leanback.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import p096e.p146l.C4228f;
import p096e.p146l.C4234l;

class GuidanceStylingRelativeLayout extends RelativeLayout {

    /* renamed from: c */
    private float f2576c;

    public GuidanceStylingRelativeLayout(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    public static float m3199a(Context context) {
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(C4234l.LeanbackGuidedStepTheme);
        float f = obtainStyledAttributes.getFloat(C4234l.LeanbackGuidedStepTheme_guidedStepKeyline, 40.0f);
        obtainStyledAttributes.recycle();
        return f;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        View findViewById = getRootView().findViewById(C4228f.guidance_title);
        View findViewById2 = getRootView().findViewById(C4228f.guidance_breadcrumb);
        View findViewById3 = getRootView().findViewById(C4228f.guidance_description);
        ImageView imageView = (ImageView) getRootView().findViewById(C4228f.guidance_icon);
        int measuredHeight = (int) ((((float) getMeasuredHeight()) * this.f2576c) / 100.0f);
        if (findViewById != null && findViewById.getParent() == this) {
            int baseline = (((measuredHeight - findViewById.getBaseline()) - findViewById2.getMeasuredHeight()) - findViewById.getPaddingTop()) - findViewById2.getTop();
            if (findViewById2 != null && findViewById2.getParent() == this) {
                findViewById2.offsetTopAndBottom(baseline);
            }
            findViewById.offsetTopAndBottom(baseline);
            if (findViewById3 != null && findViewById3.getParent() == this) {
                findViewById3.offsetTopAndBottom(baseline);
            }
        }
        if (imageView != null && imageView.getParent() == this && imageView.getDrawable() != null) {
            imageView.offsetTopAndBottom(measuredHeight - (imageView.getMeasuredHeight() / 2));
        }
    }

    public GuidanceStylingRelativeLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public GuidanceStylingRelativeLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f2576c = m3199a(context);
    }
}
