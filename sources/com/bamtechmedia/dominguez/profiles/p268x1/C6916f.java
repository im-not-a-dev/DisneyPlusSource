package com.bamtechmedia.dominguez.profiles.p268x1;

import com.bamtechmedia.dominguez.config.C3572r0;
import javax.inject.Provider;
import p512h.p515d.C11895c;

/* renamed from: com.bamtechmedia.dominguez.profiles.x1.f */
/* compiled from: LanguageFallbackLogic_Factory */
public final class C6916f implements C11895c<C6913e> {

    /* renamed from: a */
    private final Provider<C3572r0> f15390a;

    public C6916f(Provider<C3572r0> provider) {
        this.f15390a = provider;
    }

    /* renamed from: a */
    public static C6916f m21139a(Provider<C3572r0> provider) {
        return new C6916f(provider);
    }

    public C6913e get() {
        return new C6913e((C3572r0) this.f15390a.get());
    }
}
