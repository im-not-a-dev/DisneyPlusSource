package p602m.p613d.p662f.p671c.p673b.p674a;

import p602m.p613d.p614a.C13662z0;
import p602m.p613d.p614a.p619g2.C13513b;
import p602m.p613d.p614a.p620h2.C13517a;
import p602m.p613d.p614a.p625m2.C13587a;
import p602m.p613d.p627b.C13708l;
import p602m.p613d.p627b.p635g0.C13703a;

/* renamed from: m.d.f.c.b.a.g */
/* compiled from: Utils */
class C14048g {
    /* renamed from: a */
    static C13587a m44352a(String str) {
        if (str.equals("SHA-1")) {
            return new C13587a(C13517a.f30105a, C13662z0.f30378c);
        }
        if (str.equals("SHA-224")) {
            return new C13587a(C13513b.f30096f, C13662z0.f30378c);
        }
        if (str.equals("SHA-256")) {
            return new C13587a(C13513b.f30093c, C13662z0.f30378c);
        }
        if (str.equals("SHA-384")) {
            return new C13587a(C13513b.f30094d, C13662z0.f30378c);
        }
        if (str.equals("SHA-512")) {
            return new C13587a(C13513b.f30095e, C13662z0.f30378c);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("unrecognised digest algorithm: ");
        sb.append(str);
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: a */
    static C13708l m44353a(C13587a aVar) {
        if (aVar.mo34822e().equals(C13517a.f30105a)) {
            return C13703a.m42098a();
        }
        if (aVar.mo34822e().equals(C13513b.f30096f)) {
            return C13703a.m42099b();
        }
        if (aVar.mo34822e().equals(C13513b.f30093c)) {
            return C13703a.m42100c();
        }
        if (aVar.mo34822e().equals(C13513b.f30094d)) {
            return C13703a.m42101d();
        }
        if (aVar.mo34822e().equals(C13513b.f30095e)) {
            return C13703a.m42102e();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("unrecognised OID in digest algorithm identifier: ");
        sb.append(aVar.mo34822e());
        throw new IllegalArgumentException(sb.toString());
    }
}
