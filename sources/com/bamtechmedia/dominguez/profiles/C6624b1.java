package com.bamtechmedia.dominguez.profiles;

import javax.inject.Provider;
import p512h.p515d.C11895c;

/* renamed from: com.bamtechmedia.dominguez.profiles.b1 */
/* compiled from: ProfilesLogInAction_Factory */
public final class C6624b1 implements C11895c<C6619a1> {

    /* renamed from: a */
    private final Provider<C6667g1> f14954a;

    public C6624b1(Provider<C6667g1> provider) {
        this.f14954a = provider;
    }

    /* renamed from: a */
    public static C6624b1 m20555a(Provider<C6667g1> provider) {
        return new C6624b1(provider);
    }

    public C6619a1 get() {
        return new C6619a1((C6667g1) this.f14954a.get());
    }
}
