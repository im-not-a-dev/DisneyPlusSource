package com.airbnb.lottie.p012r.p013b;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import com.airbnb.lottie.C1191f;
import com.airbnb.lottie.C1210j;
import com.airbnb.lottie.p012r.p014c.C1247a;
import com.airbnb.lottie.p012r.p014c.C1247a.C1248a;
import com.airbnb.lottie.p012r.p014c.C1249b;
import com.airbnb.lottie.p012r.p014c.C1263p;
import com.airbnb.lottie.p016t.p018k.C1308p;
import com.airbnb.lottie.p016t.p019l.C1314a;
import com.airbnb.lottie.p023x.C1378c;

/* renamed from: com.airbnb.lottie.r.b.s */
/* compiled from: StrokeContent */
public class C1245s extends C1223a {

    /* renamed from: o */
    private final C1314a f4684o;

    /* renamed from: p */
    private final String f4685p;

    /* renamed from: q */
    private final boolean f4686q;

    /* renamed from: r */
    private final C1247a<Integer, Integer> f4687r;

    /* renamed from: s */
    private C1247a<ColorFilter, ColorFilter> f4688s;

    public C1245s(C1191f fVar, C1314a aVar, C1308p pVar) {
        super(fVar, aVar, pVar.mo6316a().mo6326a(), pVar.mo6319d().mo6327a(), pVar.mo6321f(), pVar.mo6323h(), pVar.mo6324i(), pVar.mo6320e(), pVar.mo6318c());
        this.f4684o = aVar;
        this.f4685p = pVar.mo6322g();
        this.f4686q = pVar.mo6325j();
        this.f4687r = pVar.mo6317b().mo6223a();
        this.f4687r.mo6163a((C1248a) this);
        aVar.mo6336a(this.f4687r);
    }

    /* renamed from: a */
    public void mo6142a(Canvas canvas, Matrix matrix, int i) {
        if (!this.f4686q) {
            this.f4571i.setColor(((C1249b) this.f4687r).mo6173i());
            C1247a<ColorFilter, ColorFilter> aVar = this.f4688s;
            if (aVar != null) {
                this.f4571i.setColorFilter((ColorFilter) aVar.mo6169f());
            }
            super.mo6142a(canvas, matrix, i);
        }
    }

    public String getName() {
        return this.f4685p;
    }

    /* renamed from: a */
    public <T> void mo6145a(T t, C1378c<T> cVar) {
        super.mo6145a(t, cVar);
        if (t == C1210j.f4522b) {
            this.f4687r.mo6164a(cVar);
        } else if (t != C1210j.f4519B) {
        } else {
            if (cVar == null) {
                this.f4688s = null;
                return;
            }
            this.f4688s = new C1263p(cVar);
            this.f4688s.mo6163a((C1248a) this);
            this.f4684o.mo6336a(this.f4687r);
        }
    }
}
