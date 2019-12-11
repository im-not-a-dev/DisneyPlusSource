package p602m.p613d.p653e.p654a;

import java.math.BigInteger;
import p602m.p613d.p653e.p654a.C13806d.C13807a;
import p602m.p613d.p653e.p654a.C13816g.C13817a;

/* renamed from: m.d.e.a.u */
/* compiled from: WTauNafMultiplier */
public class C13834u extends C13803a {
    /* renamed from: a */
    private C13817a m42642a(C13817a aVar, C13836w wVar, C13827n nVar, byte b, byte b2) {
        return m42643a(aVar, C13830q.m42616a(b2, wVar, 4, BigInteger.valueOf(16), C13830q.m42610a(b2, 4), b == 0 ? C13830q.f30688d : C13830q.f30690f), nVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C13816g mo35059b(C13816g gVar, BigInteger bigInteger) {
        if (gVar instanceof C13817a) {
            C13817a aVar = (C13817a) gVar;
            C13807a aVar2 = (C13807a) aVar.mo35148f();
            int j = aVar2.mo35090j();
            byte byteValue = aVar2.mo35082d().mo35117l().byteValue();
            byte a = C13830q.m42608a((int) byteValue);
            byte b = byteValue;
            return m42642a(aVar, C13830q.m42614a(bigInteger, j, b, aVar2.mo35094n(), a, 10), aVar2.mo35068a((C13816g) aVar, "bc_wtnaf"), b, a);
        }
        throw new IllegalArgumentException("Only ECPoint.AbstractF2m can be used in WTauNafMultiplier");
    }

    /* renamed from: a */
    private static C13817a m42643a(C13817a aVar, byte[] bArr, C13827n nVar) {
        C13817a[] aVarArr;
        C13807a aVar2 = (C13807a) aVar.mo35148f();
        byte byteValue = aVar2.mo35082d().mo35117l().byteValue();
        if (nVar == null || !(nVar instanceof C13835v)) {
            aVarArr = C13830q.m42619a(aVar, byteValue);
            C13835v vVar = new C13835v();
            vVar.mo35222a(aVarArr);
            aVar2.mo35070a((C13816g) aVar, "bc_wtnaf", (C13827n) vVar);
        } else {
            aVarArr = ((C13835v) nVar).mo35223a();
        }
        C13817a[] aVarArr2 = new C13817a[aVarArr.length];
        for (int i = 0; i < aVarArr.length; i++) {
            aVarArr2[i] = (C13817a) aVarArr[i].mo35160q();
        }
        C13817a aVar3 = (C13817a) aVar.mo35148f().mo35091k();
        int i2 = 0;
        for (int length = bArr.length - 1; length >= 0; length--) {
            i2++;
            byte b = bArr[length];
            if (b != 0) {
                aVar3 = (C13817a) aVar3.mo35167c(i2).mo35134a((C13816g) b > 0 ? aVarArr[b >>> 1] : aVarArr2[(-b) >>> 1]);
                i2 = 0;
            }
        }
        return i2 > 0 ? aVar3.mo35167c(i2) : aVar3;
    }
}
