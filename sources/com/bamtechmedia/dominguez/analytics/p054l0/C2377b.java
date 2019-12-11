package com.bamtechmedia.dominguez.analytics.p054l0;

import android.content.Context;
import javax.inject.Provider;
import p512h.p515d.C11895c;

/* renamed from: com.bamtechmedia.dominguez.analytics.l0.b */
/* compiled from: CallTimeAnalyticsValues_Factory */
public final class C2377b implements C11895c<C2374a> {

    /* renamed from: a */
    private final Provider<Context> f6599a;

    public C2377b(Provider<Context> provider) {
        this.f6599a = provider;
    }

    /* renamed from: a */
    public static C2377b m8909a(Provider<Context> provider) {
        return new C2377b(provider);
    }

    public C2374a get() {
        return new C2374a((Context) this.f6599a.get());
    }
}
