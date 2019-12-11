package com.google.android.material.textfield;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.drawable.Drawable.Callback;
import android.graphics.drawable.GradientDrawable;
import android.os.Build.VERSION;
import android.view.View;

/* renamed from: com.google.android.material.textfield.a */
/* compiled from: CutoutDrawable */
class C10346a extends GradientDrawable {

    /* renamed from: a */
    private final Paint f24558a = new Paint(1);

    /* renamed from: b */
    private final RectF f24559b;

    /* renamed from: c */
    private int f24560c;

    C10346a() {
        m32673c();
        this.f24559b = new RectF();
    }

    /* renamed from: c */
    private void m32673c() {
        this.f24558a.setStyle(Style.FILL_AND_STROKE);
        this.f24558a.setColor(-1);
        this.f24558a.setXfermode(new PorterDuffXfermode(Mode.DST_OUT));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo26986a() {
        return !this.f24559b.isEmpty();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo26987b() {
        mo26984a(0.0f, 0.0f, 0.0f, 0.0f);
    }

    public void draw(Canvas canvas) {
        m32672b(canvas);
        super.draw(canvas);
        canvas.drawRect(this.f24559b, this.f24558a);
        m32670a(canvas);
    }

    /* renamed from: b */
    private void m32672b(Canvas canvas) {
        Callback callback = getCallback();
        if (m32671a(callback)) {
            ((View) callback).setLayerType(2, null);
        } else {
            m32674c(canvas);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo26984a(float f, float f2, float f3, float f4) {
        RectF rectF = this.f24559b;
        if (f != rectF.left || f2 != rectF.top || f3 != rectF.right || f4 != rectF.bottom) {
            this.f24559b.set(f, f2, f3, f4);
            invalidateSelf();
        }
    }

    /* renamed from: c */
    private void m32674c(Canvas canvas) {
        if (VERSION.SDK_INT >= 21) {
            this.f24560c = canvas.saveLayer(0.0f, 0.0f, (float) canvas.getWidth(), (float) canvas.getHeight(), null);
            return;
        }
        this.f24560c = canvas.saveLayer(0.0f, 0.0f, (float) canvas.getWidth(), (float) canvas.getHeight(), null, 31);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo26985a(RectF rectF) {
        mo26984a(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }

    /* renamed from: a */
    private void m32670a(Canvas canvas) {
        if (!m32671a(getCallback())) {
            canvas.restoreToCount(this.f24560c);
        }
    }

    /* renamed from: a */
    private boolean m32671a(Callback callback) {
        return callback instanceof View;
    }
}
