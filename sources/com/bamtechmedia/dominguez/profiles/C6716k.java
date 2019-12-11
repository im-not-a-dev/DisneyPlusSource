package com.bamtechmedia.dominguez.profiles;

import com.bamtechmedia.dominguez.core.content.search.C3724a;
import com.bamtechmedia.dominguez.profiles.p258db.C6632a;
import javax.inject.Provider;
import p512h.p515d.C11895c;
import p520io.reactivex.C11969r;

/* renamed from: com.bamtechmedia.dominguez.profiles.k */
/* compiled from: AvatarsRepositoryImpl_Factory */
public final class C6716k implements C11895c<C6700j> {

    /* renamed from: a */
    private final Provider<C6632a> f15071a;

    /* renamed from: b */
    private final Provider<C3724a> f15072b;

    /* renamed from: c */
    private final Provider<C11969r> f15073c;

    public C6716k(Provider<C6632a> provider, Provider<C3724a> provider2, Provider<C11969r> provider3) {
        this.f15071a = provider;
        this.f15072b = provider2;
        this.f15073c = provider3;
    }

    /* renamed from: a */
    public static C6716k m20771a(Provider<C6632a> provider, Provider<C3724a> provider2, Provider<C11969r> provider3) {
        return new C6716k(provider, provider2, provider3);
    }

    public C6700j get() {
        return new C6700j((C6632a) this.f15071a.get(), (C3724a) this.f15072b.get(), (C11969r) this.f15073c.get());
    }
}
