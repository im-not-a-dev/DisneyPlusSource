package com.airbnb.lottie.p012r.p013b;

import android.graphics.Path;
import android.graphics.Path.FillType;
import com.airbnb.lottie.C1191f;
import com.airbnb.lottie.p012r.p014c.C1247a;
import com.airbnb.lottie.p012r.p014c.C1247a.C1248a;
import com.airbnb.lottie.p016t.p018k.C1307o;
import com.airbnb.lottie.p016t.p018k.C1312q.C1313a;
import com.airbnb.lottie.p016t.p019l.C1314a;
import java.util.List;

/* renamed from: com.airbnb.lottie.r.b.r */
/* compiled from: ShapeContent */
public class C1244r implements C1239n, C1248a {

    /* renamed from: a */
    private final Path f4678a = new Path();

    /* renamed from: b */
    private final boolean f4679b;

    /* renamed from: c */
    private final C1191f f4680c;

    /* renamed from: d */
    private final C1247a<?, Path> f4681d;

    /* renamed from: e */
    private boolean f4682e;

    /* renamed from: f */
    private C1226b f4683f = new C1226b();

    public C1244r(C1191f fVar, C1314a aVar, C1307o oVar) {
        oVar.mo6312a();
        this.f4679b = oVar.mo6314c();
        this.f4680c = fVar;
        this.f4681d = oVar.mo6313b().mo6223a();
        aVar.mo6336a(this.f4681d);
        this.f4681d.mo6163a((C1248a) this);
    }

    /* renamed from: b */
    private void m6255b() {
        this.f4682e = false;
        this.f4680c.invalidateSelf();
    }

    /* renamed from: a */
    public void mo6141a() {
        m6255b();
    }

    /* renamed from: j0 */
    public Path mo6152j0() {
        if (this.f4682e) {
            return this.f4678a;
        }
        this.f4678a.reset();
        if (this.f4679b) {
            this.f4682e = true;
            return this.f4678a;
        }
        this.f4678a.set((Path) this.f4681d.mo6169f());
        this.f4678a.setFillType(FillType.EVEN_ODD);
        this.f4683f.mo6147a(this.f4678a);
        this.f4682e = true;
        return this.f4678a;
    }

    /* renamed from: a */
    public void mo6146a(List<C1227c> list, List<C1227c> list2) {
        for (int i = 0; i < list.size(); i++) {
            C1227c cVar = (C1227c) list.get(i);
            if (cVar instanceof C1246t) {
                C1246t tVar = (C1246t) cVar;
                if (tVar.mo6158e() == C1313a.SIMULTANEOUSLY) {
                    this.f4683f.mo6148a(tVar);
                    tVar.mo6154a(this);
                }
            }
        }
    }
}
