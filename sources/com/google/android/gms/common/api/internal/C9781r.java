package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.C9702g.C9703a;
import com.google.android.gms.common.api.Status;

/* renamed from: com.google.android.gms.common.api.internal.r */
final class C9781r implements C9703a {

    /* renamed from: a */
    private final /* synthetic */ BasePendingResult f22944a;

    /* renamed from: b */
    private final /* synthetic */ C9778q f22945b;

    C9781r(C9778q qVar, BasePendingResult basePendingResult) {
        this.f22945b = qVar;
        this.f22944a = basePendingResult;
    }

    /* renamed from: a */
    public final void mo25082a(Status status) {
        this.f22945b.f22941a.remove(this.f22944a);
    }
}
