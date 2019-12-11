package androidx.leanback.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import p096e.p146l.C4224b;

class MediaRowFocusView extends View {

    /* renamed from: U */
    private final RectF f2604U = new RectF();

    /* renamed from: V */
    private int f2605V;

    /* renamed from: c */
    private final Paint f2606c;

    public MediaRowFocusView(Context context) {
        super(context);
        this.f2606c = m3209a(context);
    }

    /* renamed from: a */
    private Paint m3209a(Context context) {
        Paint paint = new Paint();
        paint.setColor(context.getResources().getColor(C4224b.lb_playback_media_row_highlight_color));
        return paint;
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f2605V = getHeight() / 2;
        int height = ((this.f2605V * 2) - getHeight()) / 2;
        this.f2604U.set(0.0f, (float) (-height), (float) getWidth(), (float) (getHeight() + height));
        RectF rectF = this.f2604U;
        int i = this.f2605V;
        canvas.drawRoundRect(rectF, (float) i, (float) i, this.f2606c);
    }

    public MediaRowFocusView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f2606c = m3209a(context);
    }

    public MediaRowFocusView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f2606c = m3209a(context);
    }
}
