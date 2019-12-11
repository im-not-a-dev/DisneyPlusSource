package com.airbnb.lottie.p012r.p013b;

import com.airbnb.lottie.p012r.p014c.C1247a;
import com.airbnb.lottie.p012r.p014c.C1247a.C1248a;
import com.airbnb.lottie.p016t.p018k.C1312q;
import com.airbnb.lottie.p016t.p018k.C1312q.C1313a;
import com.airbnb.lottie.p016t.p019l.C1314a;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.airbnb.lottie.r.b.t */
/* compiled from: TrimPathContent */
public class C1246t implements C1227c, C1248a {

    /* renamed from: a */
    private final boolean f4689a;

    /* renamed from: b */
    private final List<C1248a> f4690b = new ArrayList();

    /* renamed from: c */
    private final C1313a f4691c;

    /* renamed from: d */
    private final C1247a<?, Float> f4692d;

    /* renamed from: e */
    private final C1247a<?, Float> f4693e;

    /* renamed from: f */
    private final C1247a<?, Float> f4694f;

    public C1246t(C1314a aVar, C1312q qVar) {
        qVar.mo6329b();
        this.f4689a = qVar.mo6333f();
        this.f4691c = qVar.mo6332e();
        this.f4692d = qVar.mo6331d().mo6223a();
        this.f4693e = qVar.mo6328a().mo6223a();
        this.f4694f = qVar.mo6330c().mo6223a();
        aVar.mo6336a(this.f4692d);
        aVar.mo6336a(this.f4693e);
        aVar.mo6336a(this.f4694f);
        this.f4692d.mo6163a((C1248a) this);
        this.f4693e.mo6163a((C1248a) this);
        this.f4694f.mo6163a((C1248a) this);
    }

    /* renamed from: a */
    public void mo6141a() {
        for (int i = 0; i < this.f4690b.size(); i++) {
            ((C1248a) this.f4690b.get(i)).mo6141a();
        }
    }

    /* renamed from: a */
    public void mo6146a(List<C1227c> list, List<C1227c> list2) {
    }

    /* renamed from: b */
    public C1247a<?, Float> mo6155b() {
        return this.f4693e;
    }

    /* renamed from: c */
    public C1247a<?, Float> mo6156c() {
        return this.f4694f;
    }

    /* renamed from: d */
    public C1247a<?, Float> mo6157d() {
        return this.f4692d;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public C1313a mo6158e() {
        return this.f4691c;
    }

    /* renamed from: f */
    public boolean mo6159f() {
        return this.f4689a;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo6154a(C1248a aVar) {
        this.f4690b.add(aVar);
    }
}
