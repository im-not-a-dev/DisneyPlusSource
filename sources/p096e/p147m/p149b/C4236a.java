package p096e.p147m.p149b;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;

@Deprecated
/* renamed from: e.m.b.a */
/* compiled from: Space */
public class C4236a extends View {
    @Deprecated
    public C4236a(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (getVisibility() == 0) {
            setVisibility(4);
        }
    }

    /* renamed from: a */
    private static int m14567a(int i, int i2) {
        int mode = MeasureSpec.getMode(i2);
        int size = MeasureSpec.getSize(i2);
        if (mode == Integer.MIN_VALUE) {
            return Math.min(i, size);
        }
        if (mode == 0 || mode != 1073741824) {
            return i;
        }
        return size;
    }

    @SuppressLint({"MissingSuperCall"})
    @Deprecated
    public void draw(Canvas canvas) {
    }

    /* access modifiers changed from: protected */
    @Deprecated
    public void onMeasure(int i, int i2) {
        setMeasuredDimension(m14567a(getSuggestedMinimumWidth(), i), m14567a(getSuggestedMinimumHeight(), i2));
    }

    @Deprecated
    public C4236a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Deprecated
    public C4236a(Context context) {
        this(context, null);
    }
}
