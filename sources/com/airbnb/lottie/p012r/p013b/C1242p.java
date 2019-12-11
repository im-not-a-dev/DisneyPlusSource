package com.airbnb.lottie.p012r.p013b;

import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import com.airbnb.lottie.C1191f;
import com.airbnb.lottie.C1210j;
import com.airbnb.lottie.p012r.p014c.C1247a;
import com.airbnb.lottie.p012r.p014c.C1247a.C1248a;
import com.airbnb.lottie.p012r.p014c.C1250c;
import com.airbnb.lottie.p016t.C1271e;
import com.airbnb.lottie.p016t.p018k.C1302j;
import com.airbnb.lottie.p016t.p018k.C1312q.C1313a;
import com.airbnb.lottie.p016t.p019l.C1314a;
import com.airbnb.lottie.p022w.C1374e;
import com.airbnb.lottie.p023x.C1378c;
import java.util.List;

/* renamed from: com.airbnb.lottie.r.b.p */
/* compiled from: RectangleContent */
public class C1242p implements C1248a, C1235k, C1239n {

    /* renamed from: a */
    private final Path f4658a = new Path();

    /* renamed from: b */
    private final RectF f4659b = new RectF();

    /* renamed from: c */
    private final String f4660c;

    /* renamed from: d */
    private final boolean f4661d;

    /* renamed from: e */
    private final C1191f f4662e;

    /* renamed from: f */
    private final C1247a<?, PointF> f4663f;

    /* renamed from: g */
    private final C1247a<?, PointF> f4664g;

    /* renamed from: h */
    private final C1247a<?, Float> f4665h;

    /* renamed from: i */
    private C1226b f4666i = new C1226b();

    /* renamed from: j */
    private boolean f4667j;

    public C1242p(C1191f fVar, C1314a aVar, C1302j jVar) {
        this.f4660c = jVar.mo6287b();
        this.f4661d = jVar.mo6290e();
        this.f4662e = fVar;
        this.f4663f = jVar.mo6288c().mo6223a();
        this.f4664g = jVar.mo6289d().mo6223a();
        this.f4665h = jVar.mo6286a().mo6223a();
        aVar.mo6336a(this.f4663f);
        aVar.mo6336a(this.f4664g);
        aVar.mo6336a(this.f4665h);
        this.f4663f.mo6163a((C1248a) this);
        this.f4664g.mo6163a((C1248a) this);
        this.f4665h.mo6163a((C1248a) this);
    }

    /* renamed from: b */
    private void m6241b() {
        this.f4667j = false;
        this.f4662e.invalidateSelf();
    }

    /* renamed from: a */
    public void mo6141a() {
        m6241b();
    }

    public String getName() {
        return this.f4660c;
    }

    /* renamed from: j0 */
    public Path mo6152j0() {
        float f;
        if (this.f4667j) {
            return this.f4658a;
        }
        this.f4658a.reset();
        if (this.f4661d) {
            this.f4667j = true;
            return this.f4658a;
        }
        PointF pointF = (PointF) this.f4664g.mo6169f();
        float f2 = pointF.x / 2.0f;
        float f3 = pointF.y / 2.0f;
        C1247a<?, Float> aVar = this.f4665h;
        if (aVar == null) {
            f = 0.0f;
        } else {
            f = ((C1250c) aVar).mo6173i();
        }
        float min = Math.min(f2, f3);
        if (f > min) {
            f = min;
        }
        PointF pointF2 = (PointF) this.f4663f.mo6169f();
        this.f4658a.moveTo(pointF2.x + f2, (pointF2.y - f3) + f);
        this.f4658a.lineTo(pointF2.x + f2, (pointF2.y + f3) - f);
        int i = (f > 0.0f ? 1 : (f == 0.0f ? 0 : -1));
        if (i > 0) {
            RectF rectF = this.f4659b;
            float f4 = pointF2.x;
            float f5 = f * 2.0f;
            float f6 = (f4 + f2) - f5;
            float f7 = pointF2.y;
            rectF.set(f6, (f7 + f3) - f5, f4 + f2, f7 + f3);
            this.f4658a.arcTo(this.f4659b, 0.0f, 90.0f, false);
        }
        this.f4658a.lineTo((pointF2.x - f2) + f, pointF2.y + f3);
        if (i > 0) {
            RectF rectF2 = this.f4659b;
            float f8 = pointF2.x;
            float f9 = f8 - f2;
            float f10 = pointF2.y;
            float f11 = f * 2.0f;
            rectF2.set(f9, (f10 + f3) - f11, (f8 - f2) + f11, f10 + f3);
            this.f4658a.arcTo(this.f4659b, 90.0f, 90.0f, false);
        }
        this.f4658a.lineTo(pointF2.x - f2, (pointF2.y - f3) + f);
        if (i > 0) {
            RectF rectF3 = this.f4659b;
            float f12 = pointF2.x;
            float f13 = f12 - f2;
            float f14 = pointF2.y;
            float f15 = f * 2.0f;
            rectF3.set(f13, f14 - f3, (f12 - f2) + f15, (f14 - f3) + f15);
            this.f4658a.arcTo(this.f4659b, 180.0f, 90.0f, false);
        }
        this.f4658a.lineTo((pointF2.x + f2) - f, pointF2.y - f3);
        if (i > 0) {
            RectF rectF4 = this.f4659b;
            float f16 = pointF2.x;
            float f17 = f * 2.0f;
            float f18 = (f16 + f2) - f17;
            float f19 = pointF2.y;
            rectF4.set(f18, f19 - f3, f16 + f2, (f19 - f3) + f17);
            this.f4658a.arcTo(this.f4659b, 270.0f, 90.0f, false);
        }
        this.f4658a.close();
        this.f4666i.mo6147a(this.f4658a);
        this.f4667j = true;
        return this.f4658a;
    }

    /* renamed from: a */
    public void mo6146a(List<C1227c> list, List<C1227c> list2) {
        for (int i = 0; i < list.size(); i++) {
            C1227c cVar = (C1227c) list.get(i);
            if (cVar instanceof C1246t) {
                C1246t tVar = (C1246t) cVar;
                if (tVar.mo6158e() == C1313a.SIMULTANEOUSLY) {
                    this.f4666i.mo6148a(tVar);
                    tVar.mo6154a(this);
                }
            }
        }
    }

    /* renamed from: a */
    public void mo6144a(C1271e eVar, int i, List<C1271e> list, C1271e eVar2) {
        C1374e.m6727a(eVar, i, list, eVar2, this);
    }

    /* renamed from: a */
    public <T> void mo6145a(T t, C1378c<T> cVar) {
        if (t == C1210j.f4528h) {
            this.f4664g.mo6164a(cVar);
        } else if (t == C1210j.f4530j) {
            this.f4663f.mo6164a(cVar);
        } else if (t == C1210j.f4529i) {
            this.f4665h.mo6164a(cVar);
        }
    }
}
