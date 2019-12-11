package com.airbnb.lottie.p016t.p018k;

import android.graphics.PointF;
import com.airbnb.lottie.C1181c;
import com.airbnb.lottie.p016t.C1266a;
import com.airbnb.lottie.p022w.C1374e;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.airbnb.lottie.t.k.l */
/* compiled from: ShapeData */
public class C1304l {

    /* renamed from: a */
    private final List<C1266a> f4874a;

    /* renamed from: b */
    private PointF f4875b;

    /* renamed from: c */
    private boolean f4876c;

    public C1304l(PointF pointF, boolean z, List<C1266a> list) {
        this.f4875b = pointF;
        this.f4876c = z;
        this.f4874a = new ArrayList(list);
    }

    /* renamed from: a */
    private void m6462a(float f, float f2) {
        if (this.f4875b == null) {
            this.f4875b = new PointF();
        }
        this.f4875b.set(f, f2);
    }

    /* renamed from: b */
    public PointF mo6299b() {
        return this.f4875b;
    }

    /* renamed from: c */
    public boolean mo6300c() {
        return this.f4876c;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ShapeData{numCurves=");
        sb.append(this.f4874a.size());
        sb.append("closed=");
        sb.append(this.f4876c);
        sb.append('}');
        return sb.toString();
    }

    /* renamed from: a */
    public List<C1266a> mo6297a() {
        return this.f4874a;
    }

    public C1304l() {
        this.f4874a = new ArrayList();
    }

    /* renamed from: a */
    public void mo6298a(C1304l lVar, C1304l lVar2, float f) {
        if (this.f4875b == null) {
            this.f4875b = new PointF();
        }
        this.f4876c = lVar.mo6300c() || lVar2.mo6300c();
        if (lVar.mo6297a().size() != lVar2.mo6297a().size()) {
            StringBuilder sb = new StringBuilder();
            sb.append("Curves must have the same number of control points. Shape 1: ");
            sb.append(lVar.mo6297a().size());
            sb.append("\tShape 2: ");
            sb.append(lVar2.mo6297a().size());
            C1181c.m6035d(sb.toString());
        }
        int min = Math.min(lVar.mo6297a().size(), lVar2.mo6297a().size());
        if (this.f4874a.size() < min) {
            for (int size = this.f4874a.size(); size < min; size++) {
                this.f4874a.add(new C1266a());
            }
        } else if (this.f4874a.size() > min) {
            for (int size2 = this.f4874a.size() - 1; size2 >= min; size2--) {
                List<C1266a> list = this.f4874a;
                list.remove(list.size() - 1);
            }
        }
        PointF b = lVar.mo6299b();
        PointF b2 = lVar2.mo6299b();
        m6462a(C1374e.m6731c(b.x, b2.x, f), C1374e.m6731c(b.y, b2.y, f));
        for (int size3 = this.f4874a.size() - 1; size3 >= 0; size3--) {
            C1266a aVar = (C1266a) lVar.mo6297a().get(size3);
            C1266a aVar2 = (C1266a) lVar2.mo6297a().get(size3);
            PointF a = aVar.mo6195a();
            PointF b3 = aVar.mo6197b();
            PointF c = aVar.mo6199c();
            PointF a2 = aVar2.mo6195a();
            PointF b4 = aVar2.mo6197b();
            PointF c2 = aVar2.mo6199c();
            ((C1266a) this.f4874a.get(size3)).mo6196a(C1374e.m6731c(a.x, a2.x, f), C1374e.m6731c(a.y, a2.y, f));
            ((C1266a) this.f4874a.get(size3)).mo6198b(C1374e.m6731c(b3.x, b4.x, f), C1374e.m6731c(b3.y, b4.y, f));
            ((C1266a) this.f4874a.get(size3)).mo6200c(C1374e.m6731c(c.x, c2.x, f), C1374e.m6731c(c.y, c2.y, f));
        }
    }
}
