package com.appboy.p034ui.inappmessage.views;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View.MeasureSpec;
import android.widget.RelativeLayout;
import com.appboy.p034ui.R$styleable;

/* renamed from: com.appboy.ui.inappmessage.views.AppboyInAppMessageBoundedLayout */
public class AppboyInAppMessageBoundedLayout extends RelativeLayout {
    private int mMaxDefinedHeightPixels;
    private int mMaxDefinedWidthPixels;
    private int mMinDefinedHeightPixels;
    private int mMinDefinedWidthPixels;

    public AppboyInAppMessageBoundedLayout(Context context) {
        super(context);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int size = MeasureSpec.getSize(i);
        int i3 = this.mMinDefinedWidthPixels;
        if (i3 <= 0 || size >= i3) {
            int i4 = this.mMaxDefinedWidthPixels;
            if (i4 > 0 && size > i4) {
                i = MeasureSpec.makeMeasureSpec(this.mMaxDefinedWidthPixels, MeasureSpec.getMode(i));
            }
        } else {
            i = MeasureSpec.makeMeasureSpec(this.mMinDefinedWidthPixels, MeasureSpec.getMode(i));
        }
        int size2 = MeasureSpec.getSize(i2);
        int i5 = this.mMinDefinedHeightPixels;
        if (i5 <= 0 || size2 >= i5) {
            int i6 = this.mMaxDefinedHeightPixels;
            if (i6 > 0 && size2 > i6) {
                i2 = MeasureSpec.makeMeasureSpec(this.mMaxDefinedHeightPixels, MeasureSpec.getMode(i2));
            }
        } else {
            i2 = MeasureSpec.makeMeasureSpec(this.mMinDefinedHeightPixels, MeasureSpec.getMode(i2));
        }
        super.onMeasure(i, i2);
    }

    public AppboyInAppMessageBoundedLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.AppboyInAppMessageBoundedLayout);
        this.mMaxDefinedWidthPixels = obtainStyledAttributes.getDimensionPixelSize(R$styleable.AppboyInAppMessageBoundedLayout_appboyBoundedLayoutMaxWidth, 0);
        this.mMinDefinedWidthPixels = obtainStyledAttributes.getDimensionPixelSize(R$styleable.AppboyInAppMessageBoundedLayout_appboyBoundedLayoutMinWidth, 0);
        this.mMaxDefinedHeightPixels = obtainStyledAttributes.getDimensionPixelSize(R$styleable.AppboyInAppMessageBoundedLayout_appboyBoundedLayoutMaxHeight, 0);
        this.mMinDefinedHeightPixels = obtainStyledAttributes.getDimensionPixelSize(R$styleable.AppboyInAppMessageBoundedLayout_appboyBoundedLayoutMinHeight, 0);
        obtainStyledAttributes.recycle();
    }
}
