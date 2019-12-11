package com.google.android.gms.common.internal;

import com.google.android.gms.common.api.C9702g;
import com.google.android.gms.common.api.C9702g.C9703a;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.C9904t.C9905a;
import com.google.android.gms.common.internal.C9904t.C9906b;
import java.util.concurrent.TimeUnit;
import p163g.p449j.p450a.p451a.p467f.C11436i;

/* renamed from: com.google.android.gms.common.internal.f0 */
final class C9871f0 implements C9703a {

    /* renamed from: a */
    private final /* synthetic */ C9702g f23117a;

    /* renamed from: b */
    private final /* synthetic */ C11436i f23118b;

    /* renamed from: c */
    private final /* synthetic */ C9905a f23119c;

    /* renamed from: d */
    private final /* synthetic */ C9906b f23120d;

    C9871f0(C9702g gVar, C11436i iVar, C9905a aVar, C9906b bVar) {
        this.f23117a = gVar;
        this.f23118b = iVar;
        this.f23119c = aVar;
        this.f23120d = bVar;
    }

    /* renamed from: a */
    public final void mo25082a(Status status) {
        if (status.mo25010f()) {
            this.f23118b.mo29273a(this.f23119c.mo25374a(this.f23117a.mo25079a(0, TimeUnit.MILLISECONDS)));
            return;
        }
        this.f23118b.mo29272a((Exception) this.f23120d.mo25371a(status));
    }
}
