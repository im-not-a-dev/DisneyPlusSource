package com.bamtechmedia.dominguez.core.utils;

import com.bamtechmedia.dominguez.config.C3572r0;
import javax.inject.Provider;
import p512h.p515d.C11895c;

/* renamed from: com.bamtechmedia.dominguez.core.utils.d0 */
/* compiled from: RuntimeConverter_Factory */
public final class C5824d0 implements C11895c<C5821c0> {

    /* renamed from: a */
    private final Provider<C3572r0> f13613a;

    public C5824d0(Provider<C3572r0> provider) {
        this.f13613a = provider;
    }

    /* renamed from: a */
    public static C5824d0 m18817a(Provider<C3572r0> provider) {
        return new C5824d0(provider);
    }

    public C5821c0 get() {
        return new C5821c0((C3572r0) this.f13613a.get());
    }
}
