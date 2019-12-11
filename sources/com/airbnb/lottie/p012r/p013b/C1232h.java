package com.airbnb.lottie.p012r.p013b;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.Shader.TileMode;
import com.airbnb.lottie.C1181c;
import com.airbnb.lottie.C1191f;
import com.airbnb.lottie.C1210j;
import com.airbnb.lottie.p012r.C1222a;
import com.airbnb.lottie.p012r.p014c.C1247a;
import com.airbnb.lottie.p012r.p014c.C1247a.C1248a;
import com.airbnb.lottie.p012r.p014c.C1263p;
import com.airbnb.lottie.p016t.C1271e;
import com.airbnb.lottie.p016t.p018k.C1292c;
import com.airbnb.lottie.p016t.p018k.C1293d;
import com.airbnb.lottie.p016t.p018k.C1295f;
import com.airbnb.lottie.p016t.p019l.C1314a;
import com.airbnb.lottie.p022w.C1374e;
import com.airbnb.lottie.p023x.C1378c;
import java.util.ArrayList;
import java.util.List;
import p096e.p113e.C3933f;

/* renamed from: com.airbnb.lottie.r.b.h */
/* compiled from: GradientFillContent */
public class C1232h implements C1229e, C1248a, C1235k {

    /* renamed from: a */
    private final String f4607a;

    /* renamed from: b */
    private final boolean f4608b;

    /* renamed from: c */
    private final C1314a f4609c;

    /* renamed from: d */
    private final C3933f<LinearGradient> f4610d = new C3933f<>();

    /* renamed from: e */
    private final C3933f<RadialGradient> f4611e = new C3933f<>();

    /* renamed from: f */
    private final Matrix f4612f = new Matrix();

    /* renamed from: g */
    private final Path f4613g = new Path();

    /* renamed from: h */
    private final Paint f4614h = new C1222a(1);

    /* renamed from: i */
    private final RectF f4615i = new RectF();

    /* renamed from: j */
    private final List<C1239n> f4616j = new ArrayList();

    /* renamed from: k */
    private final C1295f f4617k;

    /* renamed from: l */
    private final C1247a<C1292c, C1292c> f4618l;

    /* renamed from: m */
    private final C1247a<Integer, Integer> f4619m;

    /* renamed from: n */
    private final C1247a<PointF, PointF> f4620n;

    /* renamed from: o */
    private final C1247a<PointF, PointF> f4621o;

    /* renamed from: p */
    private C1247a<ColorFilter, ColorFilter> f4622p;

    /* renamed from: q */
    private C1263p f4623q;

    /* renamed from: r */
    private final C1191f f4624r;

    /* renamed from: s */
    private final int f4625s;

    public C1232h(C1191f fVar, C1314a aVar, C1293d dVar) {
        this.f4609c = aVar;
        this.f4607a = dVar.mo6251e();
        this.f4608b = dVar.mo6254h();
        this.f4624r = fVar;
        this.f4617k = dVar.mo6250d();
        this.f4613g.setFillType(dVar.mo6248b());
        this.f4625s = (int) (fVar.mo6084e().mo6035c() / 32.0f);
        this.f4618l = dVar.mo6249c().mo6223a();
        this.f4618l.mo6163a((C1248a) this);
        aVar.mo6336a(this.f4618l);
        this.f4619m = dVar.mo6252f().mo6223a();
        this.f4619m.mo6163a((C1248a) this);
        aVar.mo6336a(this.f4619m);
        this.f4620n = dVar.mo6253g().mo6223a();
        this.f4620n.mo6163a((C1248a) this);
        aVar.mo6336a(this.f4620n);
        this.f4621o = dVar.mo6247a().mo6223a();
        this.f4621o.mo6163a((C1248a) this);
        aVar.mo6336a(this.f4621o);
    }

    /* renamed from: b */
    private int m6211b() {
        int round = Math.round(this.f4620n.mo6168e() * ((float) this.f4625s));
        int round2 = Math.round(this.f4621o.mo6168e() * ((float) this.f4625s));
        int round3 = Math.round(this.f4618l.mo6168e() * ((float) this.f4625s));
        int i = round != 0 ? 527 * round : 17;
        if (round2 != 0) {
            i = i * 31 * round2;
        }
        return round3 != 0 ? i * 31 * round3 : i;
    }

    /* renamed from: c */
    private LinearGradient m6212c() {
        long b = (long) m6211b();
        LinearGradient linearGradient = (LinearGradient) this.f4610d.mo14066c(b);
        if (linearGradient != null) {
            return linearGradient;
        }
        PointF pointF = (PointF) this.f4620n.mo6169f();
        PointF pointF2 = (PointF) this.f4621o.mo6169f();
        C1292c cVar = (C1292c) this.f4618l.mo6169f();
        LinearGradient linearGradient2 = new LinearGradient(pointF.x, pointF.y, pointF2.x, pointF2.y, m6210a(cVar.mo6244a()), cVar.mo6245b(), TileMode.CLAMP);
        this.f4610d.mo14067c(b, linearGradient2);
        return linearGradient2;
    }

    /* renamed from: d */
    private RadialGradient m6213d() {
        long b = (long) m6211b();
        RadialGradient radialGradient = (RadialGradient) this.f4611e.mo14066c(b);
        if (radialGradient != null) {
            return radialGradient;
        }
        PointF pointF = (PointF) this.f4620n.mo6169f();
        PointF pointF2 = (PointF) this.f4621o.mo6169f();
        C1292c cVar = (C1292c) this.f4618l.mo6169f();
        int[] a = m6210a(cVar.mo6244a());
        float[] b2 = cVar.mo6245b();
        float f = pointF.x;
        float f2 = pointF.y;
        float hypot = (float) Math.hypot((double) (pointF2.x - f), (double) (pointF2.y - f2));
        RadialGradient radialGradient2 = new RadialGradient(f, f2, hypot <= 0.0f ? 0.001f : hypot, a, b2, TileMode.CLAMP);
        this.f4611e.mo14067c(b, radialGradient2);
        return radialGradient2;
    }

    /* renamed from: a */
    public void mo6141a() {
        this.f4624r.invalidateSelf();
    }

    public String getName() {
        return this.f4607a;
    }

    /* renamed from: a */
    public void mo6146a(List<C1227c> list, List<C1227c> list2) {
        for (int i = 0; i < list2.size(); i++) {
            C1227c cVar = (C1227c) list2.get(i);
            if (cVar instanceof C1239n) {
                this.f4616j.add((C1239n) cVar);
            }
        }
    }

    /* renamed from: a */
    public void mo6142a(Canvas canvas, Matrix matrix, int i) {
        Shader shader;
        if (!this.f4608b) {
            String str = "GradientFillContent#draw";
            C1181c.m6032a(str);
            this.f4613g.reset();
            for (int i2 = 0; i2 < this.f4616j.size(); i2++) {
                this.f4613g.addPath(((C1239n) this.f4616j.get(i2)).mo6152j0(), matrix);
            }
            this.f4613g.computeBounds(this.f4615i, false);
            if (this.f4617k == C1295f.LINEAR) {
                shader = m6212c();
            } else {
                shader = m6213d();
            }
            this.f4612f.set(matrix);
            shader.setLocalMatrix(this.f4612f);
            this.f4614h.setShader(shader);
            C1247a<ColorFilter, ColorFilter> aVar = this.f4622p;
            if (aVar != null) {
                this.f4614h.setColorFilter((ColorFilter) aVar.mo6169f());
            }
            this.f4614h.setAlpha(C1374e.m6725a((int) ((((((float) i) / 255.0f) * ((float) ((Integer) this.f4619m.mo6169f()).intValue())) / 100.0f) * 255.0f), 0, 255));
            canvas.drawPath(this.f4613g, this.f4614h);
            C1181c.m6034c(str);
        }
    }

    /* renamed from: a */
    public void mo6143a(RectF rectF, Matrix matrix, boolean z) {
        this.f4613g.reset();
        for (int i = 0; i < this.f4616j.size(); i++) {
            this.f4613g.addPath(((C1239n) this.f4616j.get(i)).mo6152j0(), matrix);
        }
        this.f4613g.computeBounds(rectF, false);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
    }

    /* renamed from: a */
    private int[] m6210a(int[] iArr) {
        C1263p pVar = this.f4623q;
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
    public void mo6144a(C1271e eVar, int i, List<C1271e> list, C1271e eVar2) {
        C1374e.m6727a(eVar, i, list, eVar2, this);
    }

    /* renamed from: a */
    public <T> void mo6145a(T t, C1378c<T> cVar) {
        if (t == C1210j.f4524d) {
            this.f4619m.mo6164a(cVar);
        } else if (t == C1210j.f4519B) {
            if (cVar == null) {
                this.f4622p = null;
                return;
            }
            this.f4622p = new C1263p(cVar);
            this.f4622p.mo6163a((C1248a) this);
            this.f4609c.mo6336a(this.f4622p);
        } else if (t != C1210j.f4520C) {
        } else {
            if (cVar == null) {
                C1263p pVar = this.f4623q;
                if (pVar != null) {
                    this.f4609c.mo6340b((C1247a<?, ?>) pVar);
                }
                this.f4623q = null;
                return;
            }
            this.f4623q = new C1263p(cVar);
            this.f4623q.mo6163a((C1248a) this);
            this.f4609c.mo6336a((C1247a<?, ?>) this.f4623q);
        }
    }
}
