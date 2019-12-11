package p163g.p426g.p436g;

import p163g.p426g.p427a.C10817h;
import p163g.p426g.p427a.p429j.C10827a;
import p163g.p426g.p427a.p429j.C10833g;

/* renamed from: g.g.g.l */
/* compiled from: Storage */
public class C10884l {

    /* renamed from: a */
    private C10880i f25792a;

    /* renamed from: b */
    private C10833g f25793b;

    /* renamed from: c */
    private C10870b f25794c;

    /* renamed from: d */
    private C10817h f25795d;

    public C10884l(C10880i iVar, C10833g gVar, C10870b bVar, C10817h hVar) {
        this.f25792a = iVar;
        this.f25793b = gVar;
        this.f25794c = bVar;
        this.f25795d = hVar;
    }

    /* renamed from: a */
    public void mo27998a(String str, C10827a aVar) {
        C10827a a = this.f25794c.mo27976a(aVar, this.f25795d.f25586c * 1000, "storage load timeout");
        this.f25792a.mo27992c("load(): calling StorageInterface.loadData");
        this.f25793b.mo27908a("Conviva", str, a);
    }

    /* renamed from: a */
    public void mo27999a(String str, String str2, C10827a aVar) {
        C10827a a = this.f25794c.mo27976a(aVar, this.f25795d.f25586c * 1000, "storage save timeout");
        this.f25792a.mo27992c("load(): calling StorageInterface.saveData");
        this.f25793b.mo27909a("Conviva", str, str2, a);
    }
}
