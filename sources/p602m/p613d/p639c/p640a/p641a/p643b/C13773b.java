package p602m.p613d.p639c.p640a.p641a.p643b;

import java.math.BigInteger;
import java.security.spec.ECField;
import java.security.spec.ECFieldF2m;
import java.security.spec.ECFieldFp;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.EllipticCurve;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import p602m.p613d.p614a.C13626o;
import p602m.p613d.p614a.p626n2.C13592a;
import p602m.p613d.p614a.p626n2.C13617c;
import p602m.p613d.p614a.p626n2.C13619e;
import p602m.p613d.p627b.p632d0.C13682c;
import p602m.p613d.p627b.p638z.C13732a;
import p602m.p613d.p639c.p640a.p644b.C13778b;
import p602m.p613d.p649d.p651b.C13792a;
import p602m.p613d.p649d.p652c.C13797c;
import p602m.p613d.p649d.p652c.C13798d;
import p602m.p613d.p649d.p652c.C13799e;
import p602m.p613d.p653e.p654a.C13804b;
import p602m.p613d.p653e.p654a.C13806d;
import p602m.p613d.p653e.p654a.C13806d.C13810d;
import p602m.p613d.p653e.p654a.C13806d.C13811e;
import p602m.p613d.p653e.p654a.C13816g;
import p602m.p613d.p653e.p660b.C13950b;
import p602m.p613d.p653e.p660b.C13954f;
import p602m.p613d.p653e.p660b.C13955g;
import p602m.p613d.p683g.C14079a;

/* renamed from: m.d.c.a.a.b.b */
/* compiled from: EC5Util */
public class C13773b {

    /* renamed from: a */
    private static Map f30594a = new HashMap();

    static {
        Enumeration a = C13732a.m42210a();
        while (a.hasMoreElements()) {
            String str = (String) a.nextElement();
            C13619e a2 = C13592a.m41778a(str);
            if (a2 != null) {
                f30594a.put(a2.mo34835e(), C13732a.m42211a(str).mo34835e());
            }
        }
        C13619e a3 = C13732a.m42211a("Curve25519");
        f30594a.put(new C13811e(a3.mo34835e().mo35089i().mo35284c(), a3.mo34835e().mo35082d().mo35117l(), a3.mo34835e().mo35083e().mo35117l()), a3.mo34835e());
    }

    /* renamed from: a */
    public static C13806d m42275a(C13778b bVar, C13617c cVar) {
        Set c = bVar.mo35029c();
        if (cVar.mo34832g()) {
            C13626o a = C13626o.m41837a((Object) cVar.mo34830e());
            if (c.isEmpty() || c.contains(a)) {
                C13619e b = C13774c.m42290b(a);
                if (b == null) {
                    b = (C13619e) bVar.mo35027a().get(a);
                }
                return b.mo34835e();
            }
            throw new IllegalStateException("named curve not acceptable");
        } else if (cVar.mo34831f()) {
            return bVar.mo35028b().mo35043a();
        } else {
            if (c.isEmpty()) {
                return C13619e.m41817a(cVar.mo34830e()).mo34835e();
            }
            throw new IllegalStateException("encoded parameters not acceptable");
        }
    }

    /* renamed from: a */
    public static C13682c m42272a(C13778b bVar, ECParameterSpec eCParameterSpec) {
        if (eCParameterSpec != null) {
            return C13774c.m42287a(bVar, m42273a(eCParameterSpec, false));
        }
        C13799e b = bVar.mo35028b();
        C13682c cVar = new C13682c(b.mo35043a(), b.mo35044b(), b.mo35046d(), b.mo35045c(), b.mo35047e());
        return cVar;
    }

    /* renamed from: a */
    public static ECParameterSpec m42270a(C13617c cVar, C13806d dVar) {
        ECParameterSpec eCParameterSpec;
        if (cVar.mo34832g()) {
            C13626o oVar = (C13626o) cVar.mo34830e();
            C13619e b = C13774c.m42290b(oVar);
            if (b == null) {
                Map a = C13792a.f30600U.mo35027a();
                if (!a.isEmpty()) {
                    b = (C13619e) a.get(oVar);
                }
            }
            C13798d dVar2 = new C13798d(C13774c.m42281a(oVar), m42271a(dVar, b.mo34839i()), new ECPoint(b.mo34836f().mo35141c().mo35117l(), b.mo34836f().mo35144d().mo35117l()), b.mo34838h(), b.mo34837g());
            return dVar2;
        } else if (cVar.mo34831f()) {
            return null;
        } else {
            C13619e a2 = C13619e.m41817a(cVar.mo34830e());
            EllipticCurve a3 = m42271a(dVar, a2.mo34839i());
            if (a2.mo34837g() != null) {
                eCParameterSpec = new ECParameterSpec(a3, new ECPoint(a2.mo34836f().mo35141c().mo35117l(), a2.mo34836f().mo35144d().mo35117l()), a2.mo34838h(), a2.mo34837g().intValue());
            } else {
                eCParameterSpec = new ECParameterSpec(a3, new ECPoint(a2.mo34836f().mo35141c().mo35117l(), a2.mo34836f().mo35144d().mo35117l()), a2.mo34838h(), 1);
            }
            return eCParameterSpec;
        }
    }

    /* renamed from: a */
    public static EllipticCurve m42271a(C13806d dVar, byte[] bArr) {
        return new EllipticCurve(m42268a(dVar.mo35089i()), dVar.mo35082d().mo35117l(), dVar.mo35083e().mo35117l(), null);
    }

    /* renamed from: a */
    public static C13806d m42274a(EllipticCurve ellipticCurve) {
        ECField field = ellipticCurve.getField();
        BigInteger a = ellipticCurve.getA();
        BigInteger b = ellipticCurve.getB();
        if (field instanceof ECFieldFp) {
            C13806d eVar = new C13811e(((ECFieldFp) field).getP(), a, b);
            if (f30594a.containsKey(eVar)) {
                eVar = (C13806d) f30594a.get(eVar);
            }
            return eVar;
        }
        ECFieldF2m eCFieldF2m = (ECFieldF2m) field;
        int m = eCFieldF2m.getM();
        int[] a2 = C13774c.m42289a(eCFieldF2m.getMidTermsOfReductionPolynomial());
        C13810d dVar = new C13810d(m, a2[0], a2[1], a2[2], a, b);
        return dVar;
    }

    /* renamed from: a */
    public static ECField m42268a(C13950b bVar) {
        if (C13804b.m42354b(bVar)) {
            return new ECFieldFp(bVar.mo35284c());
        }
        C13954f a = ((C13955g) bVar).mo35289a();
        int[] a2 = a.mo35285a();
        return new ECFieldF2m(a.mo35286b(), C14079a.m44463c(C14079a.m44454a(a2, 1, a2.length - 1)));
    }

    /* renamed from: a */
    public static ECParameterSpec m42269a(EllipticCurve ellipticCurve, C13799e eVar) {
        if (!(eVar instanceof C13797c)) {
            return new ECParameterSpec(ellipticCurve, new ECPoint(eVar.mo35044b().mo35141c().mo35117l(), eVar.mo35044b().mo35144d().mo35117l()), eVar.mo35046d(), eVar.mo35045c().intValue());
        }
        C13798d dVar = new C13798d(((C13797c) eVar).mo35041f(), ellipticCurve, new ECPoint(eVar.mo35044b().mo35141c().mo35117l(), eVar.mo35044b().mo35144d().mo35117l()), eVar.mo35046d(), eVar.mo35045c());
        return dVar;
    }

    /* renamed from: a */
    public static C13799e m42273a(ECParameterSpec eCParameterSpec, boolean z) {
        C13806d a = m42274a(eCParameterSpec.getCurve());
        C13799e eVar = new C13799e(a, m42277a(a, eCParameterSpec.getGenerator(), z), eCParameterSpec.getOrder(), BigInteger.valueOf((long) eCParameterSpec.getCofactor()), eCParameterSpec.getCurve().getSeed());
        return eVar;
    }

    /* renamed from: a */
    public static C13816g m42276a(ECParameterSpec eCParameterSpec, ECPoint eCPoint, boolean z) {
        return m42277a(m42274a(eCParameterSpec.getCurve()), eCPoint, z);
    }

    /* renamed from: a */
    public static C13816g m42277a(C13806d dVar, ECPoint eCPoint, boolean z) {
        return dVar.mo35063a(eCPoint.getAffineX(), eCPoint.getAffineY());
    }
}
