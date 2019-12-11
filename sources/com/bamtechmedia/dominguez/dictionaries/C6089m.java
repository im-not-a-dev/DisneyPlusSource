package com.bamtechmedia.dominguez.dictionaries;

import android.content.res.Resources;
import com.bamtechmedia.dominguez.dictionaries.C6087l.C6088a;
import javax.inject.Provider;
import p512h.p515d.C11895c;

/* renamed from: com.bamtechmedia.dominguez.dictionaries.m */
/* compiled from: KeyValueDictionary_Factory_Factory */
public final class C6089m implements C11895c<C6088a> {

    /* renamed from: a */
    private final Provider<Resources> f14019a;

    /* renamed from: b */
    private final Provider<C6065c> f14020b;

    public C6089m(Provider<Resources> provider, Provider<C6065c> provider2) {
        this.f14019a = provider;
        this.f14020b = provider2;
    }

    /* renamed from: a */
    public static C6089m m19483a(Provider<Resources> provider, Provider<C6065c> provider2) {
        return new C6089m(provider, provider2);
    }

    public C6088a get() {
        return new C6088a((Resources) this.f14019a.get(), (C6065c) this.f14020b.get());
    }
}
