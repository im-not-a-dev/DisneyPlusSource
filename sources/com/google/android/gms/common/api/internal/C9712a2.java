package com.google.android.gms.common.api.internal;

import android.os.RemoteException;
import com.google.android.gms.common.C9824d;
import com.google.android.gms.common.api.internal.C9726e.C9727a;
import com.google.android.gms.common.api.internal.C9745i.C9746a;
import p163g.p449j.p450a.p451a.p467f.C11436i;

/* renamed from: com.google.android.gms.common.api.internal.a2 */
public final class C9712a2 extends C9804y1<Boolean> {

    /* renamed from: b */
    private final C9746a<?> f22762b;

    public C9712a2(C9746a<?> aVar, C11436i<Boolean> iVar) {
        super(4, iVar);
        this.f22762b = aVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo25098a(C9778q qVar, boolean z) {
    }

    /* renamed from: b */
    public final C9824d[] mo25099b(C9727a<?> aVar) {
        C9756k1 k1Var = (C9756k1) aVar.mo25156i().get(this.f22762b);
        if (k1Var == null) {
            return null;
        }
        return k1Var.f22891a.mo25205b();
    }

    /* renamed from: c */
    public final boolean mo25100c(C9727a<?> aVar) {
        C9756k1 k1Var = (C9756k1) aVar.mo25156i().get(this.f22762b);
        return k1Var != null && k1Var.f22891a.mo25206c();
    }

    /* renamed from: d */
    public final void mo25101d(C9727a<?> aVar) throws RemoteException {
        C9756k1 k1Var = (C9756k1) aVar.mo25156i().remove(this.f22762b);
        if (k1Var != null) {
            k1Var.f22892b.mo25222a(aVar.mo25153f(), this.f23013a);
            k1Var.f22891a.mo25203a();
            return;
        }
        this.f23013a.mo29275b(Boolean.valueOf(false));
    }
}
