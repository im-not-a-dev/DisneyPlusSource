package com.bamtechmedia.dominguez.dictionaries;

import android.content.SharedPreferences;
import javax.inject.Provider;
import p512h.p515d.C11895c;

/* renamed from: com.bamtechmedia.dominguez.dictionaries.d */
/* compiled from: DictionaryDebugSettings_Factory */
public final class C6067d implements C11895c<C6065c> {

    /* renamed from: a */
    private final Provider<SharedPreferences> f13968a;

    public C6067d(Provider<SharedPreferences> provider) {
        this.f13968a = provider;
    }

    /* renamed from: a */
    public static C6067d m19437a(Provider<SharedPreferences> provider) {
        return new C6067d(provider);
    }

    public C6065c get() {
        return new C6065c((SharedPreferences) this.f13968a.get());
    }
}
