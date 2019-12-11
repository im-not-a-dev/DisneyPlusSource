package com.google.android.gms.common.api.internal;

import com.google.android.gms.auth.api.signin.internal.C9654c;
import com.google.android.gms.common.api.C9698f;
import com.google.android.gms.common.api.C9810l;
import com.google.android.gms.common.api.C9811m;
import com.google.android.gms.common.api.Status;

/* renamed from: com.google.android.gms.common.api.internal.p0 */
final class C9775p0 implements C9811m<Status> {

    /* renamed from: a */
    private final /* synthetic */ C9766n f22934a;

    /* renamed from: b */
    private final /* synthetic */ boolean f22935b;

    /* renamed from: c */
    private final /* synthetic */ C9698f f22936c;

    /* renamed from: d */
    private final /* synthetic */ C9755k0 f22937d;

    C9775p0(C9755k0 k0Var, C9766n nVar, boolean z, C9698f fVar) {
        this.f22937d = k0Var;
        this.f22934a = nVar;
        this.f22935b = z;
        this.f22936c = fVar;
    }

    /* renamed from: a */
    public final /* synthetic */ void mo25229a(C9810l lVar) {
        Status status = (Status) lVar;
        C9654c.m29983a(this.f22937d.f22871g).mo24952e();
        if (status.mo25010f() && this.f22937d.mo25209j()) {
            this.f22937d.mo25210k();
        }
        this.f22934a.mo25086a(status);
        if (this.f22935b) {
            this.f22936c.mo25065d();
        }
    }
}
