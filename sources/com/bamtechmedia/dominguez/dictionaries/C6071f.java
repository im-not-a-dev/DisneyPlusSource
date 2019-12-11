package com.bamtechmedia.dominguez.dictionaries;

import com.bamtechmedia.dominguez.core.p214j.C5756a;
import javax.inject.Provider;
import p512h.p515d.C11895c;

/* renamed from: com.bamtechmedia.dominguez.dictionaries.f */
/* compiled from: DictionaryEntriesDataSource_Factory */
public final class C6071f implements C11895c<C6068e> {

    /* renamed from: a */
    private final Provider<C6082j> f13975a;

    /* renamed from: b */
    private final Provider<C5756a> f13976b;

    public C6071f(Provider<C6082j> provider, Provider<C5756a> provider2) {
        this.f13975a = provider;
        this.f13976b = provider2;
    }

    /* renamed from: a */
    public static C6071f m19448a(Provider<C6082j> provider, Provider<C5756a> provider2) {
        return new C6071f(provider, provider2);
    }

    public C6068e get() {
        return new C6068e((C6082j) this.f13975a.get(), (C5756a) this.f13976b.get());
    }
}
