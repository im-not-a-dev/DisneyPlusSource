package com.bamtechmedia.dominguez.main.p235x;

import javax.inject.Provider;
import p512h.p515d.C11895c;

/* renamed from: com.bamtechmedia.dominguez.main.x.i */
/* compiled from: SessionExpiredListenerImpl_Factory */
public final class C6238i implements C11895c<C6237h> {

    /* renamed from: a */
    private final Provider<C6234e> f14274a;

    public C6238i(Provider<C6234e> provider) {
        this.f14274a = provider;
    }

    /* renamed from: a */
    public static C6238i m19731a(Provider<C6234e> provider) {
        return new C6238i(provider);
    }

    public C6237h get() {
        return new C6237h((C6234e) this.f14274a.get());
    }
}
