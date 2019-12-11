package androidx.constraintlayout.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout.C0415c;

public class Guideline extends View {
    public Guideline(Context context) {
        super(context);
        super.setVisibility(8);
    }

    public void draw(Canvas canvas) {
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    public void setGuidelineBegin(int i) {
        C0415c cVar = (C0415c) getLayoutParams();
        cVar.f1788a = i;
        setLayoutParams(cVar);
    }

    public void setGuidelineEnd(int i) {
        C0415c cVar = (C0415c) getLayoutParams();
        cVar.f1790b = i;
        setLayoutParams(cVar);
    }

    public void setGuidelinePercent(float f) {
        C0415c cVar = (C0415c) getLayoutParams();
        cVar.f1792c = f;
        setLayoutParams(cVar);
    }

    public void setVisibility(int i) {
    }

    public Guideline(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        super.setVisibility(8);
    }

    public Guideline(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        super.setVisibility(8);
    }

    public Guideline(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i);
        super.setVisibility(8);
    }
}
