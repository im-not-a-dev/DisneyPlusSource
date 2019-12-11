package p096e.p114f.p117b.p118j;

import java.util.Arrays;
import java.util.HashMap;

/* renamed from: e.f.b.j.l */
/* compiled from: HelperWidget */
public class C3983l extends C3973f implements C3982k {

    /* renamed from: J0 */
    public C3973f[] f10124J0 = new C3973f[4];

    /* renamed from: K0 */
    public int f10125K0 = 0;

    /* renamed from: a */
    public void mo14465a(C3973f fVar) {
        int i = this.f10125K0 + 1;
        C3973f[] fVarArr = this.f10124J0;
        if (i > fVarArr.length) {
            this.f10124J0 = (C3973f[]) Arrays.copyOf(fVarArr, fVarArr.length * 2);
        }
        C3973f[] fVarArr2 = this.f10124J0;
        int i2 = this.f10125K0;
        fVarArr2[i2] = fVar;
        this.f10125K0 = i2 + 1;
    }

    /* renamed from: a */
    public void mo14466a(C3976g gVar) {
    }

    /* renamed from: a */
    public void mo14291a(C3973f fVar, HashMap<C3973f, C3973f> hashMap) {
        super.mo14291a(fVar, hashMap);
        C3983l lVar = (C3983l) fVar;
        this.f10125K0 = 0;
        int i = lVar.f10125K0;
        for (int i2 = 0; i2 < i; i2++) {
            mo14465a((C3973f) hashMap.get(lVar.f10124J0[i2]));
        }
        this.f10125K0 = lVar.f10125K0;
    }

    /* renamed from: a */
    public void mo14464a() {
        this.f10125K0 = 0;
        Arrays.fill(this.f10124J0, null);
    }
}
