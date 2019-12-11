package com.bamtechmedia.dominguez.core.content.sets;

import android.content.Context;
import com.bamtechmedia.dominguez.profiles.C6627c1;
import com.bamtechmedia.dominguez.profiles.C6667g1;
import com.google.common.base.Optional;
import javax.inject.Provider;
import p512h.p515d.C11895c;

/* renamed from: com.bamtechmedia.dominguez.core.content.sets.b */
/* compiled from: ContentSetAvailabilityHint_Factory */
public final class C3764b implements C11895c<C3762a> {

    /* renamed from: a */
    private final Provider<Context> f9394a;

    /* renamed from: b */
    private final Provider<Optional<C6627c1>> f9395b;

    /* renamed from: c */
    private final Provider<C6667g1> f9396c;

    public C3764b(Provider<Context> provider, Provider<Optional<C6627c1>> provider2, Provider<C6667g1> provider3) {
        this.f9394a = provider;
        this.f9395b = provider2;
        this.f9396c = provider3;
    }

    /* renamed from: a */
    public static C3764b m12765a(Provider<Context> provider, Provider<Optional<C6627c1>> provider2, Provider<C6667g1> provider3) {
        return new C3764b(provider, provider2, provider3);
    }

    public C3762a get() {
        return new C3762a((Context) this.f9394a.get(), (Optional) this.f9395b.get(), (C6667g1) this.f9396c.get());
    }
}
