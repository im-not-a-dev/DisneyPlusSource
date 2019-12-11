package androidx.cardview.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;

/* renamed from: androidx.cardview.widget.c */
/* compiled from: CardViewBaseImpl */
class C0307c implements C0310e {

    /* renamed from: a */
    final RectF f1338a = new RectF();

    /* renamed from: androidx.cardview.widget.c$a */
    /* compiled from: CardViewBaseImpl */
    class C0308a implements C0313a {
        C0308a() {
        }

        /* renamed from: a */
        public void mo2057a(Canvas canvas, RectF rectF, float f, Paint paint) {
            Canvas canvas2 = canvas;
            RectF rectF2 = rectF;
            float f2 = 2.0f * f;
            float width = (rectF.width() - f2) - 1.0f;
            float height = (rectF.height() - f2) - 1.0f;
            if (f >= 1.0f) {
                float f3 = f + 0.5f;
                float f4 = -f3;
                C0307c.this.f1338a.set(f4, f4, f3, f3);
                int save = canvas.save();
                canvas2.translate(rectF2.left + f3, rectF2.top + f3);
                Paint paint2 = paint;
                canvas.drawArc(C0307c.this.f1338a, 180.0f, 90.0f, true, paint2);
                canvas2.translate(width, 0.0f);
                canvas2.rotate(90.0f);
                canvas.drawArc(C0307c.this.f1338a, 180.0f, 90.0f, true, paint2);
                canvas2.translate(height, 0.0f);
                canvas2.rotate(90.0f);
                canvas.drawArc(C0307c.this.f1338a, 180.0f, 90.0f, true, paint2);
                canvas2.translate(width, 0.0f);
                canvas2.rotate(90.0f);
                canvas.drawArc(C0307c.this.f1338a, 180.0f, 90.0f, true, paint2);
                canvas2.restoreToCount(save);
                float f5 = (rectF2.left + f3) - 1.0f;
                float f6 = rectF2.top;
                canvas.drawRect(f5, f6, (rectF2.right - f3) + 1.0f, f6 + f3, paint2);
                float f7 = (rectF2.left + f3) - 1.0f;
                float f8 = rectF2.bottom;
                canvas.drawRect(f7, f8 - f3, (rectF2.right - f3) + 1.0f, f8, paint2);
            }
            canvas.drawRect(rectF2.left, rectF2.top + f, rectF2.right, rectF2.bottom - f, paint);
        }
    }

    C0307c() {
    }

    /* renamed from: j */
    private C0312g m1666j(C0309d dVar) {
        return (C0312g) dVar.mo2054c();
    }

    /* renamed from: a */
    public void mo2056a() {
        C0312g.f1352r = new C0308a();
    }

    /* renamed from: b */
    public float mo2062b(C0309d dVar) {
        return m1666j(dVar).mo2094b();
    }

    /* renamed from: c */
    public void mo2064c(C0309d dVar) {
    }

    /* renamed from: c */
    public void mo2065c(C0309d dVar, float f) {
        m1666j(dVar).mo2095b(f);
        mo2072i(dVar);
    }

    /* renamed from: d */
    public float mo2066d(C0309d dVar) {
        return m1666j(dVar).mo2096c();
    }

    /* renamed from: e */
    public ColorStateList mo2067e(C0309d dVar) {
        return m1666j(dVar).mo2089a();
    }

    /* renamed from: f */
    public float mo2068f(C0309d dVar) {
        return m1666j(dVar).mo2098d();
    }

    /* renamed from: g */
    public float mo2069g(C0309d dVar) {
        return m1666j(dVar).mo2100e();
    }

    /* renamed from: h */
    public void mo2070h(C0309d dVar) {
        m1666j(dVar).mo2093a(dVar.mo2052a());
        mo2072i(dVar);
    }

    /* renamed from: i */
    public void mo2072i(C0309d dVar) {
        Rect rect = new Rect();
        m1666j(dVar).mo2092a(rect);
        dVar.mo2049a((int) Math.ceil((double) mo2069g(dVar)), (int) Math.ceil((double) mo2068f(dVar)));
        dVar.mo2050a(rect.left, rect.top, rect.right, rect.bottom);
    }

    /* renamed from: a */
    public void mo2060a(C0309d dVar, Context context, ColorStateList colorStateList, float f, float f2, float f3) {
        C0312g a = m1665a(context, colorStateList, f, f2, f3);
        a.mo2093a(dVar.mo2052a());
        dVar.mo2051a(a);
        mo2072i(dVar);
    }

    /* renamed from: b */
    public void mo2063b(C0309d dVar, float f) {
        m1666j(dVar).mo2097c(f);
    }

    /* renamed from: a */
    private C0312g m1665a(Context context, ColorStateList colorStateList, float f, float f2, float f3) {
        C0312g gVar = new C0312g(context.getResources(), colorStateList, f, f2, f3);
        return gVar;
    }

    /* renamed from: a */
    public void mo2061a(C0309d dVar, ColorStateList colorStateList) {
        m1666j(dVar).mo2091a(colorStateList);
    }

    /* renamed from: a */
    public void mo2059a(C0309d dVar, float f) {
        m1666j(dVar).mo2090a(f);
        mo2072i(dVar);
    }

    /* renamed from: a */
    public float mo2058a(C0309d dVar) {
        return m1666j(dVar).mo2101f();
    }
}
