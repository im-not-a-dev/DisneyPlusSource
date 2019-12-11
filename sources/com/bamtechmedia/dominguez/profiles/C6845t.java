package com.bamtechmedia.dominguez.profiles;

import javax.inject.Provider;
import p512h.p515d.C11895c;

/* renamed from: com.bamtechmedia.dominguez.profiles.t */
/* compiled from: CurrentProfileSettingChecker_Factory */
public final class C6845t implements C11895c<C6782s> {

    /* renamed from: a */
    private final Provider<C6667g1> f15287a;

    public C6845t(Provider<C6667g1> provider) {
        this.f15287a = provider;
    }

    /* renamed from: a */
    public static C6845t m20993a(Provider<C6667g1> provider) {
        return new C6845t(provider);
    }

    public C6782s get() {
        return new C6782s((C6667g1) this.f15287a.get());
    }
}
