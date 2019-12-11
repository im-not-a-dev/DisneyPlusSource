package com.bamtechmedia.dominguez.core.content.search;

import android.content.SharedPreferences;
import javax.inject.Provider;
import p512h.p515d.C11895c;

/* renamed from: com.bamtechmedia.dominguez.core.content.search.l */
/* compiled from: UiLanguageCodeRepoImpl_Factory */
public final class C3753l implements C11895c<C3751k> {

    /* renamed from: a */
    private final Provider<SharedPreferences> f9355a;

    public C3753l(Provider<SharedPreferences> provider) {
        this.f9355a = provider;
    }

    /* renamed from: a */
    public static C3753l m12705a(Provider<SharedPreferences> provider) {
        return new C3753l(provider);
    }

    public C3751k get() {
        return new C3751k((SharedPreferences) this.f9355a.get());
    }
}
