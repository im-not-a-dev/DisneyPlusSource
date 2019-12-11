package com.bamtechmedia.dominguez.purchase;

import com.bamtech.sdk4.useractivity.GlimpseEvent;
import com.bamtechmedia.dominguez.analytics.C2348e;
import com.bamtechmedia.dominguez.analytics.C2348e.C2349a;
import com.bamtechmedia.dominguez.analytics.C2436p;
import com.bamtechmedia.dominguez.analytics.C2436p.C2437a;
import com.bamtechmedia.dominguez.analytics.C2476z;
import com.bamtechmedia.dominguez.analytics.C2476z.C2477a;
import kotlin.C12907r;

/* renamed from: com.bamtechmedia.dominguez.purchase.i */
/* compiled from: PaywallAnalytics.kt */
public final class C7051i {

    /* renamed from: a */
    private final C2348e f15656a;

    /* renamed from: b */
    private final C2436p f15657b;

    /* renamed from: c */
    private final C2476z f15658c;

    public C7051i(C2348e eVar, C2436p pVar, C2476z zVar) {
        this.f15656a = eVar;
        this.f15657b = pVar;
        this.f15658c = zVar;
    }

    /* renamed from: a */
    public final void mo19829a() {
        C2349a.m8853a(this.f15656a, "{{ANALYTICS_PAGE}} : Exit Click", null, false, 6, null);
        C2437a.m8999a(this.f15657b, "{{ANALYTICS_PAGE}} : Exit Click", null, 2, null);
    }

    /* renamed from: b */
    public final void mo19831b() {
        C2349a.m8853a(this.f15656a, "{{ANALYTICS_PAGE}} : Set Up Profile Click", null, false, 6, null);
    }

    /* renamed from: c */
    public final void mo19832c() {
        C2349a.m8853a(this.f15656a, "Purchase Successs", null, false, 6, null);
        C2477a.m9078a(this.f15658c, "PurchaseCompleted", GlimpseEvent.Companion.getPurchaseCompleted(), null, 4, null);
    }

    /* renamed from: d */
    public final void mo19833d() {
        C2349a.m8853a(this.f15656a, "{{ANALYTICS_PAGE}} : Restore Purchase Click", null, false, 6, null);
        C2437a.m8999a(this.f15657b, "{{ANALYTICS_PAGE}} : Restore Purchase Click", null, 2, null);
    }

    /* renamed from: e */
    public final void mo19834e() {
        C2349a.m8853a(this.f15656a, "{{ANALYTICS_PAGE}} : Start Watching Click", null, false, 6, null);
    }

    /* renamed from: a */
    public final void mo19830a(String str) {
        C2349a.m8853a(this.f15656a, "{{ANALYTICS_PAGE}} : Continue Click", C13170i0.m40332a(C12907r.m40244a("products", str)), false, 4, null);
    }
}
