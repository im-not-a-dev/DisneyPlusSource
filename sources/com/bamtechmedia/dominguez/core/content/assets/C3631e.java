package com.bamtechmedia.dominguez.core.content.assets;

import com.bamtechmedia.dominguez.config.C3572r0;
import javax.inject.Provider;
import p512h.p515d.C11895c;

/* renamed from: com.bamtechmedia.dominguez.core.content.assets.e */
/* compiled from: ContentClicksTransformationsImpl_Factory */
public final class C3631e implements C11895c<C3629d> {

    /* renamed from: a */
    private final Provider<C3572r0> f9129a;

    public C3631e(Provider<C3572r0> provider) {
        this.f9129a = provider;
    }

    /* renamed from: a */
    public static C3631e m12353a(Provider<C3572r0> provider) {
        return new C3631e(provider);
    }

    public C3629d get() {
        return new C3629d((C3572r0) this.f9129a.get());
    }
}
