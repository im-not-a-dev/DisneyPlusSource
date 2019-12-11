package com.bamtechmedia.dominguez.core.content.sets;

import com.google.common.base.Optional;
import javax.inject.Provider;
import p512h.p515d.C11895c;

/* renamed from: com.bamtechmedia.dominguez.core.content.sets.e */
/* compiled from: ContentSetRepository_Factory */
public final class C3775e implements C11895c<C3768d> {

    /* renamed from: a */
    private final Provider<RemoteContentSetDataSource> f9413a;

    /* renamed from: b */
    private final Provider<C3762a> f9414b;

    /* renamed from: c */
    private final Provider<Optional<C3780j>> f9415c;

    public C3775e(Provider<RemoteContentSetDataSource> provider, Provider<C3762a> provider2, Provider<Optional<C3780j>> provider3) {
        this.f9413a = provider;
        this.f9414b = provider2;
        this.f9415c = provider3;
    }

    /* renamed from: a */
    public static C3775e m12781a(Provider<RemoteContentSetDataSource> provider, Provider<C3762a> provider2, Provider<Optional<C3780j>> provider3) {
        return new C3775e(provider, provider2, provider3);
    }

    public C3768d get() {
        return new C3768d((RemoteContentSetDataSource) this.f9413a.get(), (C3762a) this.f9414b.get(), (Optional) this.f9415c.get());
    }
}
