package com.bamtechmedia.dominguez.profiles.p258db;

import javax.inject.Provider;
import p512h.p515d.C11895c;
import p520io.reactivex.C11969r;

/* renamed from: com.bamtechmedia.dominguez.profiles.db.f */
/* compiled from: ProfilesLogoutAction_Factory */
public final class C6652f implements C11895c<C6649e> {

    /* renamed from: a */
    private final Provider<ProfilesDatabase> f14988a;

    /* renamed from: b */
    private final Provider<C11969r> f14989b;

    public C6652f(Provider<ProfilesDatabase> provider, Provider<C11969r> provider2) {
        this.f14988a = provider;
        this.f14989b = provider2;
    }

    /* renamed from: a */
    public static C6652f m20630a(Provider<ProfilesDatabase> provider, Provider<C11969r> provider2) {
        return new C6652f(provider, provider2);
    }

    public C6649e get() {
        return new C6649e((ProfilesDatabase) this.f14988a.get(), (C11969r) this.f14989b.get());
    }
}
