package com.bamtechmedia.dominguez.detail.common;

import android.content.res.Resources;
import javax.inject.Provider;
import p163g.p201e.p203b.p275a0.C7159g;
import p512h.p515d.C11895c;

/* renamed from: com.bamtechmedia.dominguez.detail.common.z */
/* compiled from: TitleTreatmentImpl_Factory */
public final class C6011z implements C11895c<C6009y> {

    /* renamed from: a */
    private final Provider<Resources> f13856a;

    /* renamed from: b */
    private final Provider<C7159g> f13857b;

    public C6011z(Provider<Resources> provider, Provider<C7159g> provider2) {
        this.f13856a = provider;
        this.f13857b = provider2;
    }

    /* renamed from: a */
    public static C6011z m19241a(Provider<Resources> provider, Provider<C7159g> provider2) {
        return new C6011z(provider, provider2);
    }

    public C6009y get() {
        return new C6009y((Resources) this.f13856a.get(), (C7159g) this.f13857b.get());
    }
}
