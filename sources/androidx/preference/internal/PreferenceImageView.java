package androidx.preference.internal;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View.MeasureSpec;
import android.widget.ImageView;
import androidx.preference.C0778f;

public class PreferenceImageView extends ImageView {

    /* renamed from: U */
    private int f3117U;

    /* renamed from: c */
    private int f3118c;

    public PreferenceImageView(Context context) {
        this(context, null);
    }

    public int getMaxHeight() {
        return this.f3117U;
    }

    public int getMaxWidth() {
        return this.f3118c;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int mode = MeasureSpec.getMode(i);
        if (mode == Integer.MIN_VALUE || mode == 0) {
            int size = MeasureSpec.getSize(i);
            int maxWidth = getMaxWidth();
            if (maxWidth != Integer.MAX_VALUE && (maxWidth < size || mode == 0)) {
                i = MeasureSpec.makeMeasureSpec(maxWidth, Integer.MIN_VALUE);
            }
        }
        int mode2 = MeasureSpec.getMode(i2);
        if (mode2 == Integer.MIN_VALUE || mode2 == 0) {
            int size2 = MeasureSpec.getSize(i2);
            int maxHeight = getMaxHeight();
            if (maxHeight != Integer.MAX_VALUE && (maxHeight < size2 || mode2 == 0)) {
                i2 = MeasureSpec.makeMeasureSpec(maxHeight, Integer.MIN_VALUE);
            }
        }
        super.onMeasure(i, i2);
    }

    public void setMaxHeight(int i) {
        this.f3117U = i;
        super.setMaxHeight(i);
    }

    public void setMaxWidth(int i) {
        this.f3118c = i;
        super.setMaxWidth(i);
    }

    public PreferenceImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PreferenceImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f3118c = Integer.MAX_VALUE;
        this.f3117U = Integer.MAX_VALUE;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0778f.PreferenceImageView, i, 0);
        setMaxWidth(obtainStyledAttributes.getDimensionPixelSize(C0778f.PreferenceImageView_maxWidth, Integer.MAX_VALUE));
        setMaxHeight(obtainStyledAttributes.getDimensionPixelSize(C0778f.PreferenceImageView_maxHeight, Integer.MAX_VALUE));
        obtainStyledAttributes.recycle();
    }
}
