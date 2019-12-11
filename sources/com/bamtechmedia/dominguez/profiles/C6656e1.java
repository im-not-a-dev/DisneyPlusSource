package com.bamtechmedia.dominguez.profiles;

import javax.inject.Provider;
import p512h.p515d.C11895c;

/* renamed from: com.bamtechmedia.dominguez.profiles.e1 */
/* compiled from: ProfilesMemoryCacheImpl_Factory */
public final class C6656e1 implements C11895c<C6630d1> {

    /* renamed from: a */
    private final Provider<C6725m1> f14997a;

    public C6656e1(Provider<C6725m1> provider) {
        this.f14997a = provider;
    }

    /* renamed from: a */
    public static C6656e1 m20640a(Provider<C6725m1> provider) {
        return new C6656e1(provider);
    }

    public C6630d1 get() {
        return new C6630d1((C6725m1) this.f14997a.get());
    }
}
