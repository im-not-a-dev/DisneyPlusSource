package p602m.p613d.p662f.p664b.p670e;

import java.io.Serializable;
import java.util.Map;
import java.util.TreeMap;
import p602m.p613d.p683g.C14084e;

/* renamed from: m.d.f.b.e.b */
/* compiled from: BDSStateMap */
public class C13997b implements Serializable {

    /* renamed from: c */
    private final Map<Integer, C13996a> f30948c = new TreeMap();

    C13997b() {
    }

    /* renamed from: a */
    private void m44152a(C14017o oVar, long j, byte[] bArr, byte[] bArr2) {
        C14027u g = oVar.mo35437g();
        int c = g.mo35459c();
        long b = C14035y.m44324b(j, c);
        int a = C14035y.m44315a(j, c);
        C14010b bVar = (C14010b) new C14010b().mo35429a(b);
        bVar.mo35412e(a);
        C14008i iVar = (C14008i) bVar.mo35409b();
        int i = (1 << c) - 1;
        if (a < i) {
            if (mo35375a(0) == null || a == 0) {
                mo35377a(0, new C13996a(g, bArr, bArr2, iVar));
            }
            mo35376a(0, bArr, bArr2, iVar);
        }
        for (int i2 = 1; i2 < oVar.mo35434d(); i2++) {
            int a2 = C14035y.m44315a(b, c);
            b = C14035y.m44324b(b, c);
            C14010b bVar2 = (C14010b) ((C14010b) new C14010b().mo35430b(i2)).mo35429a(b);
            bVar2.mo35412e(a2);
            C14008i iVar2 = (C14008i) bVar2.mo35409b();
            if (a2 < i && C14035y.m44320a(j, c, i2)) {
                if (mo35375a(i2) == null) {
                    mo35377a(i2, new C13996a(oVar.mo35437g(), bArr, bArr2, iVar2));
                }
                mo35376a(i2, bArr, bArr2, iVar2);
            }
        }
    }

    C13997b(C14017o oVar, long j, byte[] bArr, byte[] bArr2) {
        for (long j2 = 0; j2 < j; j2++) {
            m44152a(oVar, j2, bArr, bArr2);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo35378a(C14027u uVar) {
        for (Integer num : this.f30948c.keySet()) {
            C13996a aVar = (C13996a) this.f30948c.get(num);
            aVar.mo35373a(uVar);
            aVar.mo35374b();
        }
    }

    /* renamed from: a */
    public C13996a mo35375a(int i) {
        return (C13996a) this.f30948c.get(C14084e.m44468a(i));
    }

    /* renamed from: a */
    public C13996a mo35376a(int i, byte[] bArr, byte[] bArr2, C14008i iVar) {
        return (C13996a) this.f30948c.put(C14084e.m44468a(i), ((C13996a) this.f30948c.get(C14084e.m44468a(i))).mo35372a(bArr, bArr2, iVar));
    }

    /* renamed from: a */
    public void mo35377a(int i, C13996a aVar) {
        this.f30948c.put(C14084e.m44468a(i), aVar);
    }
}
