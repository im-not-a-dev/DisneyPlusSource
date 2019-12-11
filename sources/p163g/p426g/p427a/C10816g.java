package p163g.p426g.p427a;

import java.util.LinkedList;
import java.util.List;
import p163g.p426g.p427a.p429j.C10829c;
import p163g.p426g.p427a.p429j.C10830d;
import p163g.p426g.p427a.p429j.C10831e;
import p163g.p426g.p427a.p429j.C10832f;
import p163g.p426g.p427a.p429j.C10833g;
import p163g.p426g.p427a.p429j.C10834h;
import p163g.p426g.p427a.p429j.C10835i;
import p163g.p426g.p427a.p429j.C10836j;
import p163g.p426g.p431c.C10838a;
import p163g.p426g.p431c.C10839b;
import p163g.p426g.p434e.C10852a;
import p163g.p426g.p435f.C10867g;
import p163g.p426g.p436g.C10870b;
import p163g.p426g.p436g.C10872c;
import p163g.p426g.p436g.C10875d;
import p163g.p426g.p436g.C10876e;
import p163g.p426g.p436g.C10880i;
import p163g.p426g.p436g.C10882j;
import p163g.p426g.p436g.C10884l;
import p163g.p426g.p436g.C10885m;
import p163g.p426g.p436g.C10887n;
import p163g.p426g.p436g.C10888o;

/* renamed from: g.g.a.g */
/* compiled from: SystemFactory */
public class C10816g {

    /* renamed from: a */
    private C10836j f25571a;

    /* renamed from: b */
    private C10834h f25572b;

    /* renamed from: c */
    private C10835i f25573c;

    /* renamed from: d */
    private C10830d f25574d;

    /* renamed from: e */
    private C10833g f25575e;

    /* renamed from: f */
    private C10832f f25576f;

    /* renamed from: g */
    private C10831e f25577g;

    /* renamed from: h */
    private C10829c f25578h;

    /* renamed from: i */
    private C10817h f25579i;

    /* renamed from: j */
    private String f25580j = null;

    /* renamed from: k */
    private List<String> f25581k = new LinkedList();

    /* renamed from: l */
    private C10811c f25582l;

    public C10816g(C10836j jVar, C10817h hVar) {
        this.f25571a = jVar;
        this.f25572b = this.f25571a.mo27917f();
        this.f25573c = this.f25571a.mo27918g();
        this.f25574d = this.f25571a.mo27913b();
        this.f25575e = this.f25571a.mo27916e();
        this.f25576f = this.f25571a.mo27915d();
        this.f25577g = this.f25571a.mo27914c();
        this.f25578h = this.f25571a.mo27912a();
        if (hVar == null) {
            hVar = new C10817h();
        }
        this.f25579i = hVar;
    }

    /* renamed from: a */
    public void mo27857a(String str, C10811c cVar) {
        this.f25580j = str;
        this.f25582l = cVar;
    }

    /* renamed from: b */
    public C10875d mo27858b() {
        return new C10875d(mo27862f(), mo27863g(), mo27870n());
    }

    /* renamed from: c */
    public C10829c mo27859c() {
        return this.f25578h;
    }

    /* renamed from: d */
    public C10876e mo27860d() {
        return new C10876e(mo27862f(), this.f25574d, mo27870n());
    }

    /* renamed from: e */
    public C10838a mo27861e() {
        return new C10839b();
    }

    /* renamed from: f */
    public C10880i mo27862f() {
        C10880i iVar = new C10880i(this.f25577g, this.f25572b, mo27870n(), this.f25581k, this.f25580j);
        return iVar;
    }

    /* renamed from: g */
    public C10882j mo27863g() {
        return new C10882j(mo27862f(), mo27860d(), this.f25582l);
    }

    /* renamed from: h */
    public C10852a mo27864h() {
        return new C10852a();
    }

    /* renamed from: i */
    public C10884l mo27865i() {
        return new C10884l(mo27862f(), this.f25575e, mo27855a(), mo27870n());
    }

    /* renamed from: j */
    public C10885m mo27866j() {
        return new C10885m(mo27862f(), this.f25576f, mo27858b());
    }

    /* renamed from: k */
    public C10887n mo27867k() {
        return new C10887n(this.f25572b);
    }

    /* renamed from: l */
    public C10888o mo27868l() {
        return new C10888o(mo27862f(), this.f25573c, mo27858b());
    }

    /* renamed from: m */
    public List<String> mo27869m() {
        LinkedList linkedList = (LinkedList) ((LinkedList) this.f25581k).clone();
        this.f25581k.clear();
        return linkedList;
    }

    /* renamed from: n */
    public C10817h mo27870n() {
        return this.f25579i;
    }

    /* renamed from: a */
    public C10867g mo27854a(C10790b bVar, C10811c cVar, C10872c cVar2) {
        return new C10867g(bVar, cVar, cVar2, this);
    }

    /* renamed from: a */
    public C10870b mo27855a() {
        return new C10870b(mo27868l());
    }

    /* renamed from: a */
    public C10872c mo27856a(C10790b bVar) {
        return new C10872c(mo27862f(), mo27865i(), mo27861e());
    }
}
