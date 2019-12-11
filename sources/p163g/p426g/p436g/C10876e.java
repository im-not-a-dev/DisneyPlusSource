package p163g.p426g.p436g;

import p163g.p426g.p427a.C10817h;
import p163g.p426g.p427a.p429j.C10827a;
import p163g.p426g.p427a.p429j.C10830d;

/* renamed from: g.g.g.e */
/* compiled from: HttpClient */
public class C10876e implements C10877f {

    /* renamed from: a */
    private C10830d f25774a;

    /* renamed from: b */
    private C10817h f25775b;

    /* renamed from: c */
    private C10880i f25776c;

    public C10876e(C10880i iVar, C10830d dVar, C10817h hVar) {
        this.f25776c = iVar;
        this.f25774a = dVar;
        this.f25775b = hVar;
    }

    /* renamed from: a */
    public void mo27987a(String str, String str2, String str3, String str4, C10827a aVar) {
        this.f25776c.mo27992c("request(): calling IHttpInterface:makeRequest");
        this.f25774a.mo27897a(str, str2, str3, str4, this.f25775b.f25587d * 1000, aVar);
    }
}
