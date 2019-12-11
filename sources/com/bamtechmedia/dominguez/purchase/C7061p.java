package com.bamtechmedia.dominguez.purchase;

import com.bamtech.sdk4.service.ServiceExceptionCase.LinkSubscriptionPartialError;
import com.bamtechmedia.dominguez.config.C3572r0;
import com.bamtechmedia.dominguez.config.C3572r0.C3573a;
import com.bamtechmedia.dominguez.paywall.exceptions.C6261a;
import com.bamtechmedia.dominguez.paywall.exceptions.PaywallError;
import com.bamtechmedia.dominguez.paywall.exceptions.PaywallError.C6256e;
import com.bamtechmedia.dominguez.paywall.exceptions.PaywallError.C6258g;
import kotlin.jvm.internal.Intrinsics;
import p163g.p201e.p203b.p299m.C7543f.C7544a;
import p163g.p201e.p203b.p299m.C7547h;
import p163g.p201e.p203b.p299m.p300y.C7576g;
import p163g.p201e.p203b.p307o.C7614e;
import p163g.p201e.p203b.p307o.C7619i;
import p163g.p201e.p203b.p307o.p308p.C7626a;
import p163g.p201e.p203b.p319v.C7887p.C7889b;
import p163g.p201e.p203b.p319v.C7904t;
import p163g.p201e.p203b.p319v.C7906v;
import p686n.p687a.Timber;

/* renamed from: com.bamtechmedia.dominguez.purchase.p */
/* compiled from: PaywallErrorHandler.kt */
public final class C7061p {

    /* renamed from: a */
    private final C7547h f15660a;

    /* renamed from: b */
    private final C7614e f15661b;

    /* renamed from: c */
    private final C3572r0 f15662c;

    public C7061p(C7547h hVar, C7626a aVar, C7614e eVar, C3572r0 r0Var) {
        this.f15660a = hVar;
        this.f15661b = eVar;
        this.f15662c = r0Var;
    }

    /* renamed from: a */
    public final void mo19838a(Throwable th) {
        C7619i b = this.f15661b.mo20538b(th);
        C7547h hVar = this.f15660a;
        C7544a aVar = new C7544a();
        aVar.mo20466a(m21406a(b));
        aVar.mo20475d(b.mo20546d());
        aVar.mo20480g(Integer.valueOf(C7906v.btn_dismiss));
        hVar.mo20491b(aVar.mo20465a());
    }

    /* renamed from: b */
    public final boolean mo19839b(Throwable th) {
        if (!(th instanceof C6261a)) {
            return false;
        }
        return Intrinsics.areEqual((Object) ((C6261a) th).mo18845b(), (Object) C6258g.f14297a);
    }

    /* renamed from: a */
    public final void mo19837a(C7889b bVar) {
        StringBuilder sb = new StringBuilder();
        sb.append("Error: Message: ");
        sb.append(bVar.mo20805b());
        sb.append("; Type: ");
        sb.append(bVar.mo20804a());
        Timber.m44526b(sb.toString(), new Object[0]);
        PaywallError a = bVar.mo20804a();
        if (Intrinsics.areEqual((Object) a, (Object) C6256e.f14295a)) {
            C7547h hVar = this.f15660a;
            C7544a aVar = new C7544a();
            aVar.mo20467a(Integer.valueOf(C7906v.paywall_error_purchase_restore_fail_expired));
            aVar.mo20466a(C7904t.paywall_restore_error);
            aVar.mo20480g(Integer.valueOf(C7906v.btn_dismiss));
            hVar.mo20491b(aVar.mo20465a());
        } else if (Intrinsics.areEqual((Object) a, (Object) C6258g.f14297a)) {
            this.f15660a.mo20489a(C7576g.ERROR, C7906v.purchase_restore_error_no_products);
        } else {
            C7547h hVar2 = this.f15660a;
            C7544a aVar2 = new C7544a();
            aVar2.mo20475d(bVar.mo20805b());
            aVar2.mo20466a(C7904t.paywall_generic_error);
            aVar2.mo20480g(Integer.valueOf(C7906v.btn_dismiss));
            hVar2.mo20491b(aVar2.mo20465a());
        }
    }

    /* renamed from: a */
    public final void mo19836a() {
        C7547h hVar = this.f15660a;
        C7544a aVar = new C7544a();
        aVar.mo20466a(C7904t.paywall_sdk_error_temp_access);
        aVar.mo20475d(C3573a.m12037b(this.f15662c, "ns_sdk-errors_tempaccessgrantederror", null, 2, null));
        aVar.mo20485i(C3573a.m12037b(this.f15662c, "ns_sdk-errors_tempaccessgrantederrortitle", null, 2, null));
        aVar.mo20480g(Integer.valueOf(C7906v.btn_dismiss));
        hVar.mo20491b(aVar.mo20465a());
    }

    /* renamed from: a */
    private final int m21406a(C7619i iVar) {
        if (Intrinsics.areEqual((Object) iVar.mo20545c(), (Object) LinkSubscriptionPartialError.INSTANCE)) {
            return C7904t.paywall_sdk_error_link_subscription_partial_error;
        }
        return C7904t.paywall_sdk_error;
    }
}
