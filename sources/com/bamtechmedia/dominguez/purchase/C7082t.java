package com.bamtechmedia.dominguez.purchase;

import p163g.p201e.p203b.p299m.C7543f.C7544a;
import p163g.p201e.p203b.p299m.C7547h;
import p163g.p201e.p203b.p319v.C7904t;
import p163g.p201e.p203b.p319v.C7906v;

/* renamed from: com.bamtechmedia.dominguez.purchase.t */
/* compiled from: PaywallRouterImpl.kt */
public final class C7082t implements C7081s {

    /* renamed from: a */
    private final C7547h f15699a;

    public C7082t(C7547h hVar) {
        this.f15699a = hVar;
    }

    /* renamed from: a */
    public void mo19863a() {
        C7547h hVar = this.f15699a;
        C7544a aVar = new C7544a();
        aVar.mo20466a(C7904t.finish_subscribing);
        aVar.mo20484i(Integer.valueOf(C7906v.interrupt_subscription_title));
        aVar.mo20467a(Integer.valueOf(C7906v.interrupt_subscription));
        aVar.mo20480g(Integer.valueOf(C7906v.btn_finish_later));
        aVar.mo20472c(Integer.valueOf(C7906v.btn_resume));
        hVar.mo20491b(aVar.mo20465a());
    }
}
