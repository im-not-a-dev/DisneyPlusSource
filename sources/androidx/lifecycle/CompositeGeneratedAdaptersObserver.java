package androidx.lifecycle;

import androidx.lifecycle.C0715i.C0716a;

class CompositeGeneratedAdaptersObserver implements C0720k {

    /* renamed from: c */
    private final C0713g[] f2959c;

    CompositeGeneratedAdaptersObserver(C0713g[] gVarArr) {
        this.f2959c = gVarArr;
    }

    /* renamed from: a */
    public void mo330a(C0722m mVar, C0716a aVar) {
        C0729r rVar = new C0729r();
        for (C0713g a : this.f2959c) {
            a.mo4132a(mVar, aVar, false, rVar);
        }
        for (C0713g a2 : this.f2959c) {
            a2.mo4132a(mVar, aVar, true, rVar);
        }
    }
}
