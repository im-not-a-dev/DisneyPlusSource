package com.bamtechmedia.dominguez.dictionaries;

import android.content.res.Resources;
import javax.inject.Provider;
import p512h.p515d.C11895c;

/* renamed from: com.bamtechmedia.dominguez.dictionaries.p */
/* compiled from: NameSpacedDictionary_Factory */
public final class C6093p implements C11895c<C6091o> {

    /* renamed from: a */
    private final Provider<Resources> f14024a;

    /* renamed from: b */
    private final Provider<C6072g> f14025b;

    public C6093p(Provider<Resources> provider, Provider<C6072g> provider2) {
        this.f14024a = provider;
        this.f14025b = provider2;
    }

    /* renamed from: a */
    public static C6093p m19490a(Provider<Resources> provider, Provider<C6072g> provider2) {
        return new C6093p(provider, provider2);
    }

    public C6091o get() {
        return new C6091o((Resources) this.f14024a.get(), this.f14025b);
    }
}
