package com.bamtechmedia.dominguez.about.p052r.p053i;

import android.content.SharedPreferences;
import com.bamtechmedia.dominguez.config.C3572r0;
import javax.inject.Provider;
import p512h.p515d.C11895c;

/* renamed from: com.bamtechmedia.dominguez.about.r.i.b */
/* compiled from: AboutItemsFactory_Factory */
public final class C2326b implements C11895c<C2323a> {

    /* renamed from: a */
    private final Provider<C3572r0> f6486a;

    /* renamed from: b */
    private final Provider<SharedPreferences> f6487b;

    public C2326b(Provider<C3572r0> provider, Provider<SharedPreferences> provider2) {
        this.f6486a = provider;
        this.f6487b = provider2;
    }

    /* renamed from: a */
    public static C2326b m8775a(Provider<C3572r0> provider, Provider<SharedPreferences> provider2) {
        return new C2326b(provider, provider2);
    }

    public C2323a get() {
        return new C2323a((C3572r0) this.f6486a.get(), (SharedPreferences) this.f6487b.get());
    }
}
