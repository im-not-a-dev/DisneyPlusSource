package com.bamtechmedia.dominguez.detail.common.p230g0;

import javax.inject.Provider;
import p512h.p515d.C11895c;

/* renamed from: com.bamtechmedia.dominguez.detail.common.g0.b */
/* compiled from: ContentDetailAccessibilityHelper_Factory */
public final class C5947b implements C11895c<C5944a> {

    /* renamed from: a */
    private final Provider<Boolean> f13754a;

    public C5947b(Provider<Boolean> provider) {
        this.f13754a = provider;
    }

    /* renamed from: a */
    public static C5947b m19078a(Provider<Boolean> provider) {
        return new C5947b(provider);
    }

    public C5944a get() {
        return new C5944a(((Boolean) this.f13754a.get()).booleanValue());
    }
}
