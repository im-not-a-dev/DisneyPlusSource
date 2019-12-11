package p602m.p613d.p639c.p640a.p641a.p642a;

import java.math.BigInteger;
import java.security.spec.ECParameterSpec;
import p602m.p613d.p614a.C13584m;
import p602m.p613d.p614a.C13626o;
import p602m.p613d.p614a.C13662z0;
import p602m.p613d.p614a.p626n2.C13617c;
import p602m.p613d.p614a.p626n2.C13619e;
import p602m.p613d.p639c.p640a.p641a.p643b.C13773b;
import p602m.p613d.p639c.p640a.p641a.p643b.C13774c;
import p602m.p613d.p649d.p652c.C13798d;
import p602m.p613d.p653e.p654a.C13806d;

/* renamed from: m.d.c.a.a.a.c */
/* compiled from: ECUtils */
class C13767c {
    /* renamed from: a */
    static C13619e m42261a(String str) {
        try {
            if (str.charAt(0) >= '0' && str.charAt(0) <= '2') {
                return C13774c.m42290b(new C13626o(str));
            }
            if (str.indexOf(32) > 0) {
                return C13774c.m42283a(str.substring(str.indexOf(32) + 1));
            }
            return C13774c.m42283a(str);
        } catch (IllegalArgumentException unused) {
            return C13774c.m42283a(str);
        }
    }

    /* renamed from: a */
    static C13617c m42260a(ECParameterSpec eCParameterSpec, boolean z) {
        if (eCParameterSpec instanceof C13798d) {
            C13798d dVar = (C13798d) eCParameterSpec;
            C13626o b = C13774c.m42291b(dVar.mo35042a());
            if (b == null) {
                b = new C13626o(dVar.mo35042a());
            }
            return new C13617c(b);
        } else if (eCParameterSpec == null) {
            return new C13617c((C13584m) C13662z0.f30378c);
        } else {
            C13806d a = C13773b.m42274a(eCParameterSpec.getCurve());
            C13619e eVar = new C13619e(a, C13773b.m42277a(a, eCParameterSpec.getGenerator(), z), eCParameterSpec.getOrder(), BigInteger.valueOf((long) eCParameterSpec.getCofactor()), eCParameterSpec.getCurve().getSeed());
            return new C13617c(eVar);
        }
    }
}
