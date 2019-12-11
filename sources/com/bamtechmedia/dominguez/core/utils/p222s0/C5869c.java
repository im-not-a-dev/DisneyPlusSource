package com.bamtechmedia.dominguez.core.utils.p222s0;

import javax.inject.Provider;
import p163g.p201e.p203b.p323w.p324a.C7912a;
import p163g.p509o.p510a.C11848c;
import p163g.p509o.p510a.p511l.C11867b;
import p512h.p515d.C11895c;
import p512h.p515d.C11897e;

/* renamed from: com.bamtechmedia.dominguez.core.utils.s0.c */
/* compiled from: GroupieModule_ProvideGroupieKotlinAdapterFactory */
public final class C5869c implements C11895c<C11848c<C11867b>> {

    /* renamed from: a */
    private final Provider<C7912a> f13651a;

    public C5869c(Provider<C7912a> provider) {
        this.f13651a = provider;
    }

    /* renamed from: a */
    public static C5869c m18918a(Provider<C7912a> provider) {
        return new C5869c(provider);
    }

    /* renamed from: a */
    public static C11848c<C11867b> m18919a(C7912a aVar) {
        C11848c<C11867b> b = C5867a.m18916b(aVar);
        C11897e.m38130a(b, "Cannot return null from a non-@Nullable @Provides method");
        return b;
    }

    public C11848c<C11867b> get() {
        return m18919a((C7912a) this.f13651a.get());
    }
}
