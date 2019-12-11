package com.bamtechmedia.dominguez.collections.p080o0;

import android.content.Context;
import com.bamtechmedia.dominguez.config.C3532h.C3533a;
import com.bamtechmedia.dominguez.core.BuildInfo;
import javax.inject.Provider;
import p512h.p515d.C11895c;

/* renamed from: com.bamtechmedia.dominguez.collections.o0.d */
/* compiled from: CollectionConfigRepositoryImpl_Factory */
public final class C3438d implements C11895c<C3436c> {

    /* renamed from: a */
    private final Provider<Context> f8667a;

    /* renamed from: b */
    private final Provider<C3533a> f8668b;

    /* renamed from: c */
    private final Provider<BuildInfo> f8669c;

    public C3438d(Provider<Context> provider, Provider<C3533a> provider2, Provider<BuildInfo> provider3) {
        this.f8667a = provider;
        this.f8668b = provider2;
        this.f8669c = provider3;
    }

    /* renamed from: a */
    public static C3438d m11730a(Provider<Context> provider, Provider<C3533a> provider2, Provider<BuildInfo> provider3) {
        return new C3438d(provider, provider2, provider3);
    }

    public C3436c get() {
        return new C3436c((Context) this.f8667a.get(), (C3533a) this.f8668b.get(), (BuildInfo) this.f8669c.get());
    }
}
