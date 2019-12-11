package com.bamtechmedia.dominguez.collections.items;

import com.bamtechmedia.dominguez.collections.C3416k0;
import javax.inject.Provider;
import p512h.p515d.C11895c;

/* renamed from: com.bamtechmedia.dominguez.collections.items.x */
/* compiled from: ShelfItemSessionHelper_Factory */
public final class C3396x implements C11895c<C3394w> {

    /* renamed from: a */
    private final Provider<C3416k0> f8576a;

    public C3396x(Provider<C3416k0> provider) {
        this.f8576a = provider;
    }

    /* renamed from: a */
    public static C3396x m11639a(Provider<C3416k0> provider) {
        return new C3396x(provider);
    }

    public C3394w get() {
        return new C3394w((C3416k0) this.f8576a.get());
    }
}
