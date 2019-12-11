package androidx.swiperefreshlayout.widget;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.Path.FillType;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import p096e.p121h.p134r.C4117i;
import p096e.p143k.p144a.p145a.C4220b;

/* renamed from: androidx.swiperefreshlayout.widget.b */
/* compiled from: CircularProgressDrawable */
public class C0984b extends Drawable implements Animatable {

    /* renamed from: Z */
    private static final Interpolator f3866Z = new LinearInterpolator();

    /* renamed from: a0 */
    private static final Interpolator f3867a0 = new C4220b();

    /* renamed from: b0 */
    private static final int[] f3868b0 = {-16777216};

    /* renamed from: U */
    private float f3869U;

    /* renamed from: V */
    private Resources f3870V;

    /* renamed from: W */
    private Animator f3871W;

    /* renamed from: X */
    float f3872X;

    /* renamed from: Y */
    boolean f3873Y;

    /* renamed from: c */
    private final C0987c f3874c = new C0987c();

    /* renamed from: androidx.swiperefreshlayout.widget.b$a */
    /* compiled from: CircularProgressDrawable */
    class C0985a implements AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ C0987c f3875a;

        C0985a(C0987c cVar) {
            this.f3875a = cVar;
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            C0984b.this.mo5398a(floatValue, this.f3875a);
            C0984b.this.mo5399a(floatValue, this.f3875a, false);
            C0984b.this.invalidateSelf();
        }
    }

    /* renamed from: androidx.swiperefreshlayout.widget.b$b */
    /* compiled from: CircularProgressDrawable */
    class C0986b implements AnimatorListener {

        /* renamed from: a */
        final /* synthetic */ C0987c f3877a;

        C0986b(C0987c cVar) {
            this.f3877a = cVar;
        }

        public void onAnimationCancel(Animator animator) {
        }

        public void onAnimationEnd(Animator animator) {
        }

        public void onAnimationRepeat(Animator animator) {
            C0984b.this.mo5399a(1.0f, this.f3877a, true);
            this.f3877a.mo5444l();
            this.f3877a.mo5442j();
            C0984b bVar = C0984b.this;
            if (bVar.f3873Y) {
                bVar.f3873Y = false;
                animator.cancel();
                animator.setDuration(1332);
                animator.start();
                this.f3877a.mo5425a(false);
                return;
            }
            bVar.f3872X += 1.0f;
        }

        public void onAnimationStart(Animator animator) {
            C0984b.this.f3872X = 0.0f;
        }
    }

    /* renamed from: androidx.swiperefreshlayout.widget.b$c */
    /* compiled from: CircularProgressDrawable */
    private static class C0987c {

        /* renamed from: a */
        final RectF f3879a = new RectF();

        /* renamed from: b */
        final Paint f3880b = new Paint();

        /* renamed from: c */
        final Paint f3881c = new Paint();

        /* renamed from: d */
        final Paint f3882d = new Paint();

        /* renamed from: e */
        float f3883e = 0.0f;

        /* renamed from: f */
        float f3884f = 0.0f;

        /* renamed from: g */
        float f3885g = 0.0f;

        /* renamed from: h */
        float f3886h = 5.0f;

        /* renamed from: i */
        int[] f3887i;

        /* renamed from: j */
        int f3888j;

        /* renamed from: k */
        float f3889k;

        /* renamed from: l */
        float f3890l;

        /* renamed from: m */
        float f3891m;

        /* renamed from: n */
        boolean f3892n;

        /* renamed from: o */
        Path f3893o;

        /* renamed from: p */
        float f3894p = 1.0f;

        /* renamed from: q */
        float f3895q;

        /* renamed from: r */
        int f3896r;

        /* renamed from: s */
        int f3897s;

        /* renamed from: t */
        int f3898t = 255;

        /* renamed from: u */
        int f3899u;

        C0987c() {
            this.f3880b.setStrokeCap(Cap.SQUARE);
            this.f3880b.setAntiAlias(true);
            this.f3880b.setStyle(Style.STROKE);
            this.f3881c.setStyle(Style.FILL);
            this.f3881c.setAntiAlias(true);
            this.f3882d.setColor(0);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo5420a(float f, float f2) {
            this.f3896r = (int) f;
            this.f3897s = (int) f2;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public void mo5429b(int i) {
            this.f3899u = i;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public void mo5432c(int i) {
            this.f3888j = i;
            this.f3899u = this.f3887i[this.f3888j];
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: d */
        public int mo5433d() {
            return (this.f3888j + 1) % this.f3887i.length;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: e */
        public void mo5436e(float f) {
            this.f3883e = f;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: f */
        public void mo5438f(float f) {
            this.f3886h = f;
            this.f3880b.setStrokeWidth(f);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: g */
        public float mo5439g() {
            return this.f3890l;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: h */
        public float mo5440h() {
            return this.f3891m;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: i */
        public float mo5441i() {
            return this.f3889k;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: j */
        public void mo5442j() {
            mo5432c(mo5433d());
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: k */
        public void mo5443k() {
            this.f3889k = 0.0f;
            this.f3890l = 0.0f;
            this.f3891m = 0.0f;
            mo5436e(0.0f);
            mo5431c(0.0f);
            mo5434d(0.0f);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: l */
        public void mo5444l() {
            this.f3889k = this.f3883e;
            this.f3890l = this.f3884f;
            this.f3891m = this.f3885g;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public float mo5427b() {
            return this.f3884f;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: d */
        public void mo5434d(float f) {
            this.f3885g = f;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: e */
        public float mo5435e() {
            return this.f3883e;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo5423a(Canvas canvas, Rect rect) {
            RectF rectF = this.f3879a;
            float f = this.f3895q;
            float f2 = (this.f3886h / 2.0f) + f;
            if (f <= 0.0f) {
                f2 = (((float) Math.min(rect.width(), rect.height())) / 2.0f) - Math.max((((float) this.f3896r) * this.f3894p) / 2.0f, this.f3886h / 2.0f);
            }
            rectF.set(((float) rect.centerX()) - f2, ((float) rect.centerY()) - f2, ((float) rect.centerX()) + f2, ((float) rect.centerY()) + f2);
            float f3 = this.f3883e;
            float f4 = this.f3885g;
            float f5 = (f3 + f4) * 360.0f;
            float f6 = ((this.f3884f + f4) * 360.0f) - f5;
            this.f3880b.setColor(this.f3899u);
            this.f3880b.setAlpha(this.f3898t);
            float f7 = this.f3886h / 2.0f;
            rectF.inset(f7, f7);
            canvas.drawCircle(rectF.centerX(), rectF.centerY(), rectF.width() / 2.0f, this.f3882d);
            float f8 = -f7;
            rectF.inset(f8, f8);
            canvas.drawArc(rectF, f5, f6, false, this.f3880b);
            mo5422a(canvas, f5, f6, rectF);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public void mo5428b(float f) {
            this.f3895q = f;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public int mo5430c() {
            return this.f3887i[mo5433d()];
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: f */
        public int mo5437f() {
            return this.f3887i[this.f3888j];
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public void mo5431c(float f) {
            this.f3884f = f;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo5422a(Canvas canvas, float f, float f2, RectF rectF) {
            if (this.f3892n) {
                Path path = this.f3893o;
                if (path == null) {
                    this.f3893o = new Path();
                    this.f3893o.setFillType(FillType.EVEN_ODD);
                } else {
                    path.reset();
                }
                float min = Math.min(rectF.width(), rectF.height()) / 2.0f;
                float f3 = (((float) this.f3896r) * this.f3894p) / 2.0f;
                this.f3893o.moveTo(0.0f, 0.0f);
                this.f3893o.lineTo(((float) this.f3896r) * this.f3894p, 0.0f);
                Path path2 = this.f3893o;
                float f4 = (float) this.f3896r;
                float f5 = this.f3894p;
                path2.lineTo((f4 * f5) / 2.0f, ((float) this.f3897s) * f5);
                this.f3893o.offset((min + rectF.centerX()) - f3, rectF.centerY() + (this.f3886h / 2.0f));
                this.f3893o.close();
                this.f3881c.setColor(this.f3899u);
                this.f3881c.setAlpha(this.f3898t);
                canvas.save();
                canvas.rotate(f + f2, rectF.centerX(), rectF.centerY());
                canvas.drawPath(this.f3893o, this.f3881c);
                canvas.restore();
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo5426a(int[] iArr) {
            this.f3887i = iArr;
            mo5432c(0);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo5424a(ColorFilter colorFilter) {
            this.f3880b.setColorFilter(colorFilter);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo5421a(int i) {
            this.f3898t = i;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public int mo5418a() {
            return this.f3898t;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo5425a(boolean z) {
            if (this.f3892n != z) {
                this.f3892n = z;
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo5419a(float f) {
            if (f != this.f3894p) {
                this.f3894p = f;
            }
        }
    }

    public C0984b(Context context) {
        C4117i.m14095a(context);
        this.f3870V = context.getResources();
        this.f3874c.mo5426a(f3868b0);
        mo5404c(2.5f);
        m5268a();
    }

    /* renamed from: a */
    private int m5267a(float f, int i, int i2) {
        int i3 = (i >> 24) & 255;
        int i4 = (i >> 16) & 255;
        int i5 = (i >> 8) & 255;
        int i6 = i & 255;
        return ((i3 + ((int) (((float) (((i2 >> 24) & 255) - i3)) * f))) << 24) | ((i4 + ((int) (((float) (((i2 >> 16) & 255) - i4)) * f))) << 16) | ((i5 + ((int) (((float) (((i2 >> 8) & 255) - i5)) * f))) << 8) | (i6 + ((int) (f * ((float) ((i2 & 255) - i6)))));
    }

    /* renamed from: a */
    private void m5269a(float f, float f2, float f3, float f4) {
        C0987c cVar = this.f3874c;
        float f5 = this.f3870V.getDisplayMetrics().density;
        cVar.mo5438f(f2 * f5);
        cVar.mo5428b(f * f5);
        cVar.mo5432c(0);
        cVar.mo5420a(f3 * f5, f4 * f5);
    }

    /* renamed from: d */
    private void m5271d(float f) {
        this.f3869U = f;
    }

    /* renamed from: b */
    public void mo5403b(float f) {
        this.f3874c.mo5434d(f);
        invalidateSelf();
    }

    /* renamed from: c */
    public void mo5404c(float f) {
        this.f3874c.mo5438f(f);
        invalidateSelf();
    }

    public void draw(Canvas canvas) {
        Rect bounds = getBounds();
        canvas.save();
        canvas.rotate(this.f3869U, bounds.exactCenterX(), bounds.exactCenterY());
        this.f3874c.mo5423a(canvas, bounds);
        canvas.restore();
    }

    public int getAlpha() {
        return this.f3874c.mo5418a();
    }

    public int getOpacity() {
        return -3;
    }

    public boolean isRunning() {
        return this.f3871W.isRunning();
    }

    public void setAlpha(int i) {
        this.f3874c.mo5421a(i);
        invalidateSelf();
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f3874c.mo5424a(colorFilter);
        invalidateSelf();
    }

    public void start() {
        this.f3871W.cancel();
        this.f3874c.mo5444l();
        if (this.f3874c.mo5427b() != this.f3874c.mo5435e()) {
            this.f3873Y = true;
            this.f3871W.setDuration(666);
            this.f3871W.start();
            return;
        }
        this.f3874c.mo5432c(0);
        this.f3874c.mo5443k();
        this.f3871W.setDuration(1332);
        this.f3871W.start();
    }

    public void stop() {
        this.f3871W.cancel();
        m5271d(0.0f);
        this.f3874c.mo5425a(false);
        this.f3874c.mo5432c(0);
        this.f3874c.mo5443k();
        invalidateSelf();
    }

    /* renamed from: b */
    private void m5270b(float f, C0987c cVar) {
        mo5398a(f, cVar);
        float floor = (float) (Math.floor((double) (cVar.mo5440h() / 0.8f)) + 1.0d);
        cVar.mo5436e(cVar.mo5441i() + (((cVar.mo5439g() - 0.01f) - cVar.mo5441i()) * f));
        cVar.mo5431c(cVar.mo5439g());
        cVar.mo5434d(cVar.mo5440h() + ((floor - cVar.mo5440h()) * f));
    }

    /* renamed from: a */
    public void mo5400a(int i) {
        if (i == 0) {
            m5269a(11.0f, 3.0f, 12.0f, 6.0f);
        } else {
            m5269a(7.5f, 2.5f, 10.0f, 5.0f);
        }
        invalidateSelf();
    }

    /* renamed from: a */
    public void mo5401a(boolean z) {
        this.f3874c.mo5425a(z);
        invalidateSelf();
    }

    /* renamed from: a */
    public void mo5396a(float f) {
        this.f3874c.mo5419a(f);
        invalidateSelf();
    }

    /* renamed from: a */
    public void mo5397a(float f, float f2) {
        this.f3874c.mo5436e(f);
        this.f3874c.mo5431c(f2);
        invalidateSelf();
    }

    /* renamed from: a */
    public void mo5402a(int... iArr) {
        this.f3874c.mo5426a(iArr);
        this.f3874c.mo5432c(0);
        invalidateSelf();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo5398a(float f, C0987c cVar) {
        if (f > 0.75f) {
            cVar.mo5429b(m5267a((f - 0.75f) / 0.25f, cVar.mo5437f(), cVar.mo5430c()));
        } else {
            cVar.mo5429b(cVar.mo5437f());
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo5399a(float f, C0987c cVar, boolean z) {
        float f2;
        float f3;
        if (this.f3873Y) {
            m5270b(f, cVar);
        } else if (f != 1.0f || z) {
            float h = cVar.mo5440h();
            if (f < 0.5f) {
                float f4 = f / 0.5f;
                float i = cVar.mo5441i();
                float f5 = i;
                f2 = (f3867a0.getInterpolation(f4) * 0.79f) + 0.01f + i;
                f3 = f5;
            } else {
                f2 = cVar.mo5441i() + 0.79f;
                f3 = f2 - (((1.0f - f3867a0.getInterpolation((f - 0.5f) / 0.5f)) * 0.79f) + 0.01f);
            }
            float f6 = h + (0.20999998f * f);
            float f7 = (f + this.f3872X) * 216.0f;
            cVar.mo5436e(f3);
            cVar.mo5431c(f2);
            cVar.mo5434d(f6);
            m5271d(f7);
        }
    }

    /* renamed from: a */
    private void m5268a() {
        C0987c cVar = this.f3874c;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        ofFloat.addUpdateListener(new C0985a(cVar));
        ofFloat.setRepeatCount(-1);
        ofFloat.setRepeatMode(1);
        ofFloat.setInterpolator(f3866Z);
        ofFloat.addListener(new C0986b(cVar));
        this.f3871W = ofFloat;
    }
}
