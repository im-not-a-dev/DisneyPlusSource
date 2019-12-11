package com.bamtechmedia.dominguez.core.content.sets;

import androidx.fragment.app.C0532d;
import com.bamtechmedia.dominguez.collections.C3419l;
import com.bamtechmedia.dominguez.core.content.sets.C3780j.C3784d;
import com.bamtechmedia.dominguez.profiles.C6627c1;
import javax.inject.Provider;
import p512h.p515d.C11895c;

/* renamed from: com.bamtechmedia.dominguez.core.content.sets.k */
/* compiled from: OfflineSetCache_Provider_Factory */
public final class C3786k implements C11895c<C3784d> {

    /* renamed from: a */
    private final Provider<C0532d> f9429a;

    /* renamed from: b */
    private final Provider<C6627c1> f9430b;

    /* renamed from: c */
    private final Provider<C3419l> f9431c;

    public C3786k(Provider<C0532d> provider, Provider<C6627c1> provider2, Provider<C3419l> provider3) {
        this.f9429a = provider;
        this.f9430b = provider2;
        this.f9431c = provider3;
    }

    /* renamed from: a */
    public static C3786k m12806a(Provider<C0532d> provider, Provider<C6627c1> provider2, Provider<C3419l> provider3) {
        return new C3786k(provider, provider2, provider3);
    }

    public C3784d get() {
        return new C3784d((C0532d) this.f9429a.get(), (C6627c1) this.f9430b.get(), (C3419l) this.f9431c.get());
    }
}
