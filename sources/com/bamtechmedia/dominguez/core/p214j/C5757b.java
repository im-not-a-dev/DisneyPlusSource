package com.bamtechmedia.dominguez.core.p214j;

import android.content.Context;
import javax.inject.Provider;
import p163g.p500m.p501a.C11760v;
import p512h.p515d.C11895c;

/* renamed from: com.bamtechmedia.dominguez.core.j.b */
/* compiled from: DocumentStore_Factory */
public final class C5757b implements C11895c<C5756a> {

    /* renamed from: a */
    private final Provider<Context> f13517a;

    /* renamed from: b */
    private final Provider<C11760v> f13518b;

    public C5757b(Provider<Context> provider, Provider<C11760v> provider2) {
        this.f13517a = provider;
        this.f13518b = provider2;
    }

    /* renamed from: a */
    public static C5757b m18687a(Provider<Context> provider, Provider<C11760v> provider2) {
        return new C5757b(provider, provider2);
    }

    public C5756a get() {
        return new C5756a((Context) this.f13517a.get(), (C11760v) this.f13518b.get());
    }
}
