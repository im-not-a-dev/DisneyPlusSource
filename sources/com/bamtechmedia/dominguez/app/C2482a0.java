package com.bamtechmedia.dominguez.app;

import com.bamtechmedia.dominguez.app.C2686z.C2687a;
import javax.inject.Provider;
import p512h.p515d.C11895c;

/* renamed from: com.bamtechmedia.dominguez.app.a0 */
/* compiled from: SentryTree_Factory */
public final class C2482a0 implements C11895c<C2686z> {

    /* renamed from: a */
    private final Provider<C2687a> f6782a;

    public C2482a0(Provider<C2687a> provider) {
        this.f6782a = provider;
    }

    /* renamed from: a */
    public static C2482a0 m9097a(Provider<C2687a> provider) {
        return new C2482a0(provider);
    }

    public C2686z get() {
        return new C2686z((C2687a) this.f6782a.get());
    }
}
