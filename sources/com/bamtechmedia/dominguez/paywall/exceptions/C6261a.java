package com.bamtechmedia.dominguez.paywall.exceptions;

import p163g.p201e.p203b.p319v.p320a0.C7820a;

/* renamed from: com.bamtechmedia.dominguez.paywall.exceptions.a */
/* compiled from: PaywallException.kt */
public final class C6261a extends Exception {

    /* renamed from: U */
    private final C7820a f14300U;

    /* renamed from: c */
    private final PaywallError f14301c;

    public C6261a(PaywallError paywallError, C7820a aVar) {
        StringBuilder sb = new StringBuilder();
        sb.append("Paywall Exception Occurred: ");
        sb.append(paywallError);
        super(sb.toString());
        this.f14301c = paywallError;
        this.f14300U = aVar;
    }

    /* renamed from: a */
    public final C7820a mo18844a() {
        return this.f14300U;
    }

    /* renamed from: b */
    public final PaywallError mo18845b() {
        return this.f14301c;
    }
}
