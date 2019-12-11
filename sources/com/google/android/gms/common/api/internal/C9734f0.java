package com.google.android.gms.common.api.internal;

import java.lang.ref.WeakReference;
import p163g.p449j.p450a.p451a.p465e.p466b.C11411d;
import p163g.p449j.p450a.p451a.p465e.p466b.C11418k;

/* renamed from: com.google.android.gms.common.api.internal.f0 */
final class C9734f0 extends C11411d {

    /* renamed from: a */
    private final WeakReference<C9802y> f22834a;

    C9734f0(C9802y yVar) {
        this.f22834a = new WeakReference<>(yVar);
    }

    /* renamed from: a */
    public final void mo25167a(C11418k kVar) {
        C9802y yVar = (C9802y) this.f22834a.get();
        if (yVar != null) {
            yVar.f22991a.mo25240a((C9791u0) new C9738g0(this, yVar, yVar, kVar));
        }
    }
}
