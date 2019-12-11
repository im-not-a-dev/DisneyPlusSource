package com.airbnb.lottie.p016t.p018k;

import android.graphics.PointF;
import com.airbnb.lottie.C1191f;
import com.airbnb.lottie.p012r.p013b.C1227c;
import com.airbnb.lottie.p012r.p013b.C1240o;
import com.airbnb.lottie.p016t.p017j.C1277b;
import com.airbnb.lottie.p016t.p017j.C1288m;
import com.airbnb.lottie.p016t.p019l.C1314a;

/* renamed from: com.airbnb.lottie.t.k.i */
/* compiled from: PolystarShape */
public class C1300i implements C1291b {

    /* renamed from: a */
    private final String f4850a;

    /* renamed from: b */
    private final C1301a f4851b;

    /* renamed from: c */
    private final C1277b f4852c;

    /* renamed from: d */
    private final C1288m<PointF, PointF> f4853d;

    /* renamed from: e */
    private final C1277b f4854e;

    /* renamed from: f */
    private final C1277b f4855f;

    /* renamed from: g */
    private final C1277b f4856g;

    /* renamed from: h */
    private final C1277b f4857h;

    /* renamed from: i */
    private final C1277b f4858i;

    /* renamed from: j */
    private final boolean f4859j;

    /* renamed from: com.airbnb.lottie.t.k.i$a */
    /* compiled from: PolystarShape */
    public enum C1301a {
        STAR(1),
        POLYGON(2);
        

        /* renamed from: c */
        private final int f4863c;

        private C1301a(int i) {
            this.f4863c = i;
        }

        /* renamed from: a */
        public static C1301a m6449a(int i) {
            C1301a[] values;
            for (C1301a aVar : values()) {
                if (aVar.f4863c == i) {
                    return aVar;
                }
            }
            return null;
        }
    }

    public C1300i(String str, C1301a aVar, C1277b bVar, C1288m<PointF, PointF> mVar, C1277b bVar2, C1277b bVar3, C1277b bVar4, C1277b bVar5, C1277b bVar6, boolean z) {
        this.f4850a = str;
        this.f4851b = aVar;
        this.f4852c = bVar;
        this.f4853d = mVar;
        this.f4854e = bVar2;
        this.f4855f = bVar3;
        this.f4856g = bVar4;
        this.f4857h = bVar5;
        this.f4858i = bVar6;
        this.f4859j = z;
    }

    /* renamed from: a */
    public C1277b mo6276a() {
        return this.f4855f;
    }

    /* renamed from: b */
    public C1277b mo6277b() {
        return this.f4857h;
    }

    /* renamed from: c */
    public String mo6278c() {
        return this.f4850a;
    }

    /* renamed from: d */
    public C1277b mo6279d() {
        return this.f4856g;
    }

    /* renamed from: e */
    public C1277b mo6280e() {
        return this.f4858i;
    }

    /* renamed from: f */
    public C1277b mo6281f() {
        return this.f4852c;
    }

    /* renamed from: g */
    public C1288m<PointF, PointF> mo6282g() {
        return this.f4853d;
    }

    /* renamed from: h */
    public C1277b mo6283h() {
        return this.f4854e;
    }

    /* renamed from: i */
    public C1301a mo6284i() {
        return this.f4851b;
    }

    /* renamed from: j */
    public boolean mo6285j() {
        return this.f4859j;
    }

    /* renamed from: a */
    public C1227c mo6226a(C1191f fVar, C1314a aVar) {
        return new C1240o(fVar, aVar, this);
    }
}
