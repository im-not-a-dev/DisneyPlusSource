package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RatingBar;
import p096e.p097a.C3858a;

/* renamed from: androidx.appcompat.widget.q */
/* compiled from: AppCompatRatingBar */
public class C0266q extends RatingBar {

    /* renamed from: c */
    private final C0262o f1194c;

    public C0266q(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C3858a.ratingBarStyle);
    }

    /* access modifiers changed from: protected */
    public synchronized void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        Bitmap a = this.f1194c.mo1816a();
        if (a != null) {
            setMeasuredDimension(View.resolveSizeAndState(a.getWidth() * getNumStars(), i, 0), getMeasuredHeight());
        }
    }

    public C0266q(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1194c = new C0262o(this);
        this.f1194c.mo1817a(attributeSet, i);
    }
}
