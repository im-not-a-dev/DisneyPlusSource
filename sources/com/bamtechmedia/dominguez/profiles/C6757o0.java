package com.bamtechmedia.dominguez.profiles;

import com.bamtechmedia.dominguez.config.C3524e;
import javax.inject.Provider;
import p512h.p515d.C11895c;

/* renamed from: com.bamtechmedia.dominguez.profiles.o0 */
/* compiled from: ProfilesConfig_Factory */
public final class C6757o0 implements C11895c<C6745n0> {

    /* renamed from: a */
    private final Provider<C3524e> f15136a;

    public C6757o0(Provider<C3524e> provider) {
        this.f15136a = provider;
    }

    /* renamed from: a */
    public static C6757o0 m20849a(Provider<C3524e> provider) {
        return new C6757o0(provider);
    }

    public C6745n0 get() {
        return new C6745n0((C3524e) this.f15136a.get());
    }
}
