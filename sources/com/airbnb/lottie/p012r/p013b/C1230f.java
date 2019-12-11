package com.airbnb.lottie.p012r.p013b;

import android.graphics.Path;
import android.graphics.PointF;
import com.airbnb.lottie.C1191f;
import com.airbnb.lottie.C1210j;
import com.airbnb.lottie.p012r.p014c.C1247a;
import com.airbnb.lottie.p012r.p014c.C1247a.C1248a;
import com.airbnb.lottie.p016t.C1271e;
import com.airbnb.lottie.p016t.p018k.C1290a;
import com.airbnb.lottie.p016t.p018k.C1312q.C1313a;
import com.airbnb.lottie.p016t.p019l.C1314a;
import com.airbnb.lottie.p022w.C1374e;
import com.airbnb.lottie.p023x.C1378c;
import java.util.List;

/* renamed from: com.airbnb.lottie.r.b.f */
/* compiled from: EllipseContent */
public class C1230f implements C1239n, C1248a, C1235k {

    /* renamed from: a */
    private final Path f4589a = new Path();

    /* renamed from: b */
    private final String f4590b;

    /* renamed from: c */
    private final C1191f f4591c;

    /* renamed from: d */
    private final C1247a<?, PointF> f4592d;

    /* renamed from: e */
    private final C1247a<?, PointF> f4593e;

    /* renamed from: f */
    private final C1290a f4594f;

    /* renamed from: g */
    private C1226b f4595g = new C1226b();

    /* renamed from: h */
    private boolean f4596h;

    public C1230f(C1191f fVar, C1314a aVar, C1290a aVar2) {
        this.f4590b = aVar2.mo6238a();
        this.f4591c = fVar;
        this.f4592d = aVar2.mo6240c().mo6223a();
        this.f4593e = aVar2.mo6239b().mo6223a();
        this.f4594f = aVar2;
        aVar.mo6336a(this.f4592d);
        aVar.mo6336a(this.f4593e);
        this.f4592d.mo6163a((C1248a) this);
        this.f4593e.mo6163a((C1248a) this);
    }

    /* renamed from: b */
    private void m6198b() {
        this.f4596h = false;
        this.f4591c.invalidateSelf();
    }

    /* renamed from: a */
    public void mo6141a() {
        m6198b();
    }

    public String getName() {
        return this.f4590b;
    }

    /* renamed from: j0 */
    public Path mo6152j0() {
        if (this.f4596h) {
            return this.f4589a;
        }
        this.f4589a.reset();
        if (this.f4594f.mo6241d()) {
            this.f4596h = true;
            return this.f4589a;
        }
        PointF pointF = (PointF) this.f4592d.mo6169f();
        float f = pointF.x / 2.0f;
        float f2 = pointF.y / 2.0f;
        float f3 = f * 0.55228f;
        float f4 = 0.55228f * f2;
        this.f4589a.reset();
        if (this.f4594f.mo6242e()) {
            float f5 = -f2;
            this.f4589a.moveTo(0.0f, f5);
            float f6 = 0.0f - f3;
            float f7 = -f;
            float f8 = 0.0f - f4;
            this.f4589a.cubicTo(f6, f5, f7, f8, f7, 0.0f);
            float f9 = f4 + 0.0f;
            float f10 = f5;
            this.f4589a.cubicTo(f7, f9, f6, f2, 0.0f, f2);
            float f11 = f3 + 0.0f;
            this.f4589a.cubicTo(f11, f2, f, f9, f, 0.0f);
            this.f4589a.cubicTo(f, f8, f11, f10, 0.0f, f10);
        } else {
            float f12 = -f2;
            this.f4589a.moveTo(0.0f, f12);
            float f13 = f3 + 0.0f;
            float f14 = 0.0f - f4;
            this.f4589a.cubicTo(f13, f12, f, f14, f, 0.0f);
            float f15 = f4 + 0.0f;
            this.f4589a.cubicTo(f, f15, f13, f2, 0.0f, f2);
            float f16 = 0.0f - f3;
            float f17 = -f;
            this.f4589a.cubicTo(f16, f2, f17, f15, f17, 0.0f);
            float f18 = f12;
            this.f4589a.cubicTo(f17, f14, f16, f18, 0.0f, f18);
        }
        PointF pointF2 = (PointF) this.f4593e.mo6169f();
        this.f4589a.offset(pointF2.x, pointF2.y);
        this.f4589a.close();
        this.f4595g.mo6147a(this.f4589a);
        this.f4596h = true;
        return this.f4589a;
    }

    /* renamed from: a */
    public void mo6146a(List<C1227c> list, List<C1227c> list2) {
        for (int i = 0; i < list.size(); i++) {
            C1227c cVar = (C1227c) list.get(i);
            if (cVar instanceof C1246t) {
                C1246t tVar = (C1246t) cVar;
                if (tVar.mo6158e() == C1313a.SIMULTANEOUSLY) {
                    this.f4595g.mo6148a(tVar);
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
        if (t == C1210j.f4527g) {
            this.f4592d.mo6164a(cVar);
        } else if (t == C1210j.f4530j) {
            this.f4593e.mo6164a(cVar);
        }
    }
}
