package p602m.p613d.p649d.p652c;

import java.math.BigInteger;
import java.security.spec.ECField;
import java.security.spec.ECFieldF2m;
import java.security.spec.ECFieldFp;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.EllipticCurve;
import p602m.p613d.p653e.p654a.C13804b;
import p602m.p613d.p653e.p654a.C13806d;
import p602m.p613d.p653e.p654a.C13816g;
import p602m.p613d.p653e.p660b.C13950b;
import p602m.p613d.p653e.p660b.C13954f;
import p602m.p613d.p653e.p660b.C13955g;
import p602m.p613d.p683g.C14079a;

/* renamed from: m.d.d.c.d */
/* compiled from: ECNamedCurveSpec */
public class C13798d extends ECParameterSpec {

    /* renamed from: a */
    private String f30619a;

    public C13798d(String str, EllipticCurve ellipticCurve, ECPoint eCPoint, BigInteger bigInteger, BigInteger bigInteger2) {
        super(ellipticCurve, eCPoint, bigInteger, bigInteger2.intValue());
        this.f30619a = str;
    }

    /* renamed from: a */
    private static EllipticCurve m42322a(C13806d dVar, byte[] bArr) {
        return new EllipticCurve(m42320a(dVar.mo35089i()), dVar.mo35082d().mo35117l(), dVar.mo35083e().mo35117l(), bArr);
    }

    public C13798d(String str, C13806d dVar, C13816g gVar, BigInteger bigInteger, BigInteger bigInteger2, byte[] bArr) {
        super(m42322a(dVar, bArr), m42321a(gVar), bigInteger, bigInteger2.intValue());
        this.f30619a = str;
    }

    /* renamed from: a */
    private static ECField m42320a(C13950b bVar) {
        if (C13804b.m42354b(bVar)) {
            return new ECFieldFp(bVar.mo35284c());
        }
        C13954f a = ((C13955g) bVar).mo35289a();
        int[] a2 = a.mo35285a();
        return new ECFieldF2m(a.mo35286b(), C14079a.m44463c(C14079a.m44454a(a2, 1, a2.length - 1)));
    }

    /* renamed from: a */
    private static ECPoint m42321a(C13816g gVar) {
        C13816g r = gVar.mo35161r();
        return new ECPoint(r.mo35141c().mo35117l(), r.mo35144d().mo35117l());
    }

    /* renamed from: a */
    public String mo35042a() {
        return this.f30619a;
    }
}
