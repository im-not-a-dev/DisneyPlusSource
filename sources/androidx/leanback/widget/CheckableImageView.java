package androidx.leanback.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.Checkable;
import android.widget.ImageView;

class CheckableImageView extends ImageView implements Checkable {

    /* renamed from: U */
    private static final int[] f2570U = {16842912};

    /* renamed from: c */
    private boolean f2571c;

    public CheckableImageView(Context context) {
        this(context, null);
    }

    public boolean isChecked() {
        return this.f2571c;
    }

    public int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        if (isChecked()) {
            ImageView.mergeDrawableStates(onCreateDrawableState, f2570U);
        }
        return onCreateDrawableState;
    }

    public void setChecked(boolean z) {
        if (this.f2571c != z) {
            this.f2571c = z;
            refreshDrawableState();
        }
    }

    public void toggle() {
        setChecked(!this.f2571c);
    }

    public CheckableImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CheckableImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
