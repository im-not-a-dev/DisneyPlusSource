package androidx.cardview.widget;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;

/* renamed from: androidx.cardview.widget.a */
/* compiled from: CardViewApi17Impl */
class C0304a extends C0307c {

    /* renamed from: androidx.cardview.widget.a$a */
    /* compiled from: CardViewApi17Impl */
    class C0305a implements C0313a {
        C0305a(C0304a aVar) {
        }

        /* renamed from: a */
        public void mo2057a(Canvas canvas, RectF rectF, float f, Paint paint) {
            canvas.drawRoundRect(rectF, f, f, paint);
        }
    }

    C0304a() {
    }

    /* renamed from: a */
    public void mo2056a() {
        C0312g.f1352r = new C0305a(this);
    }
}
