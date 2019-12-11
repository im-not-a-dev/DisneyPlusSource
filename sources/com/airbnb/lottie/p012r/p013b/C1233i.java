package com.airbnb.lottie.p012r.p013b;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.Shader.TileMode;
import com.airbnb.lottie.C1191f;
import com.airbnb.lottie.C1210j;
import com.airbnb.lottie.p012r.p014c.C1247a;
import com.airbnb.lottie.p012r.p014c.C1247a.C1248a;
import com.airbnb.lottie.p012r.p014c.C1263p;
import com.airbnb.lottie.p016t.p018k.C1292c;
import com.airbnb.lottie.p016t.p018k.C1294e;
import com.airbnb.lottie.p016t.p018k.C1295f;
import com.airbnb.lottie.p016t.p019l.C1314a;
import com.airbnb.lottie.p023x.C1378c;
import p096e.p113e.C3933f;

/* renamed from: com.airbnb.lottie.r.b.i */
/* compiled from: GradientStrokeContent */
public class C1233i extends C1223a {

    /* renamed from: o */
    private final String f4626o;

    /* renamed from: p */
    private final boolean f4627p;

    /* renamed from: q */
    private final C3933f<LinearGradient> f4628q = new C3933f<>();

    /* renamed from: r */
    private final C3933f<RadialGradient> f4629r = new C3933f<>();

    /* renamed from: s */
    private final RectF f4630s = new RectF();

    /* renamed from: t */
    private final C1295f f4631t;

    /* renamed from: u */
    private final int f4632u;

    /* renamed from: v */
    private final C1247a<C1292c, C1292c> f4633v;

    /* renamed from: w */
    private final C1247a<PointF, PointF> f4634w;

    /* renamed from: x */
    private final C1247a<PointF, PointF> f4635x;

    /* renamed from: y */
    private C1263p f4636y;

    public C1233i(C1191f fVar, C1314a aVar, C1294e eVar) {
        super(fVar, aVar, eVar.mo6255a().mo6326a(), eVar.mo6260f().mo6327a(), eVar.mo6262h(), eVar.mo6264j(), eVar.mo6266l(), eVar.mo6261g(), eVar.mo6256b());
        this.f4626o = eVar.mo6263i();
        this.f4631t = eVar.mo6259e();
        this.f4627p = eVar.mo6267m();
        this.f4632u = (int) (fVar.mo6084e().mo6035c() / 32.0f);
        this.f4633v = eVar.mo6258d().mo6223a();
        this.f4633v.mo6163a((C1248a) this);
        aVar.mo6336a(this.f4633v);
        this.f4634w = eVar.mo6265k().mo6223a();
        this.f4634w.mo6163a((C1248a) this);
        aVar.mo6336a(this.f4634w);
        this.f4635x = eVar.mo6257c().mo6223a();
        this.f4635x.mo6163a((C1248a) this);
        aVar.mo6336a(this.f4635x);
    }

    /* renamed from: b */
    private int m6221b() {
        int round = Math.round(this.f4634w.mo6168e() * ((float) this.f4632u));
        int round2 = Math.round(this.f4635x.mo6168e() * ((float) this.f4632u));
        int round3 = Math.round(this.f4633v.mo6168e() * ((float) this.f4632u));
        int i = round != 0 ? 527 * round : 17;
        if (round2 != 0) {
            i = i * 31 * round2;
        }
        return round3 != 0 ? i * 31 * round3 : i;
    }

    /* renamed from: c */
    private LinearGradient m6222c() {
        long b = (long) m6221b();
        LinearGradient linearGradient = (LinearGradient) this.f4628q.mo14066c(b);
        if (linearGradient != null) {
            return linearGradient;
        }
        PointF pointF = (PointF) this.f4634w.mo6169f();
        PointF pointF2 = (PointF) this.f4635x.mo6169f();
        C1292c cVar = (C1292c) this.f4633v.mo6169f();
        int[] a = m6220a(cVar.mo6244a());
        float[] b2 = cVar.mo6245b();
        RectF rectF = this.f4630s;
        int width = (int) (rectF.left + (rectF.width() / 2.0f) + pointF.x);
        RectF rectF2 = this.f4630s;
        int height = (int) (rectF2.top + (rectF2.height() / 2.0f) + pointF.y);
        RectF rectF3 = this.f4630s;
        int width2 = (int) (rectF3.left + (rectF3.width() / 2.0f) + pointF2.x);
        RectF rectF4 = this.f4630s;
        LinearGradient linearGradient2 = new LinearGradient((float) width, (float) height, (float) width2, (float) ((int) (rectF4.top + (rectF4.height() / 2.0f) + pointF2.y)), a, b2, TileMode.CLAMP);
        this.f4628q.mo14067c(b, linearGradient2);
        return linearGradient2;
    }

    /* renamed from: d */
    private RadialGradient m6223d() {
        long b = (long) m6221b();
        RadialGradient radialGradient = (RadialGradient) this.f4629r.mo14066c(b);
        if (radialGradient != null) {
            return radialGradient;
        }
        PointF pointF = (PointF) this.f4634w.mo6169f();
        PointF pointF2 = (PointF) this.f4635x.mo6169f();
        C1292c cVar = (C1292c) this.f4633v.mo6169f();
        int[] a = m6220a(cVar.mo6244a());
        float[] b2 = cVar.mo6245b();
        RectF rectF = this.f4630s;
        int width = (int) (rectF.left + (rectF.width() / 2.0f) + pointF.x);
        RectF rectF2 = this.f4630s;
        int height = (int) (rectF2.top + (rectF2.height() / 2.0f) + pointF.y);
        RectF rectF3 = this.f4630s;
        int width2 = (int) (rectF3.left + (rectF3.width() / 2.0f) + pointF2.x);
        RectF rectF4 = this.f4630s;
        RadialGradient radialGradient2 = new RadialGradient((float) width, (float) height, (float) Math.hypot((double) (width2 - width), (double) (((int) ((rectF4.top + (rectF4.height() / 2.0f)) + pointF2.y)) - height)), a, b2, TileMode.CLAMP);
        this.f4629r.mo14067c(b, radialGradient2);
        return radialGradient2;
    }

    /* renamed from: a */
    public void mo6142a(Canvas canvas, Matrix matrix, int i) {
        Shader shader;
        if (!this.f4627p) {
            mo6143a(this.f4630s, matrix, false);
            if (this.f4631t == C1295f.LINEAR) {
                shader = m6222c();
            } else {
                shader = m6223d();
            }
            this.f4571i.setShader(shader);
            super.mo6142a(canvas, matrix, i);
        }
    }

    public String getName() {
        return this.f4626o;
    }

    /* renamed from: a */
    private int[] m6220a(int[] iArr) {
        C1263p pVar = this.f4636y;
        if (pVar != null) {
            Integer[] numArr = (Integer[]) pVar.mo6169f();
            int i = 0;
            if (iArr.length == numArr.length) {
                while (i < iArr.length) {
                    iArr[i] = numArr[i].intValue();
                    i++;
                }
            } else {
                iArr = new int[numArr.length];
                while (i < numArr.length) {
                    iArr[i] = numArr[i].intValue();
                    i++;
                }
            }
        }
        return iArr;
    }

    /* renamed from: a */
    public <T> void mo6145a(T t, C1378c<T> cVar) {
        super.mo6145a(t, cVar);
        if (t != C1210j.f4520C) {
            return;
        }
        if (cVar == null) {
            C1263p pVar = this.f4636y;
            if (pVar != null) {
                this.f4568f.mo6340b((C1247a<?, ?>) pVar);
            }
            this.f4636y = null;
            return;
        }
        this.f4636y = new C1263p(cVar);
        this.f4636y.mo6163a((C1248a) this);
        this.f4568f.mo6336a((C1247a<?, ?>) this.f4636y);
    }
}
