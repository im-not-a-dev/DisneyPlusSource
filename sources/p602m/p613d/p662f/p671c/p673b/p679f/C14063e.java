package p602m.p613d.p662f.p671c.p673b.p679f;

import p602m.p613d.p614a.C13626o;
import p602m.p613d.p614a.p619g2.C13513b;
import p602m.p613d.p627b.C13708l;
import p602m.p613d.p627b.p637y.C13727g;
import p602m.p613d.p627b.p637y.C13729i;
import p602m.p613d.p627b.p637y.C13731k;

/* renamed from: m.d.f.c.b.f.e */
/* compiled from: DigestUtil */
class C14063e {
    /* renamed from: a */
    static C13708l m44375a(C13626o oVar) {
        if (oVar.equals(C13513b.f30093c)) {
            return new C13727g();
        }
        if (oVar.equals(C13513b.f30095e)) {
            return new C13729i();
        }
        if (oVar.equals(C13513b.f30097g)) {
            return new C13731k(128);
        }
        if (oVar.equals(C13513b.f30098h)) {
            return new C13731k(256);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("unrecognized digest OID: ");
        sb.append(oVar);
        throw new IllegalArgumentException(sb.toString());
    }
}
