package com.bamtechmedia.dominguez.profiles.p268x1.p269g;

import com.bamtechmedia.dominguez.profiles.p268x1.C6913e;
import javax.inject.Provider;
import p512h.p515d.C11895c;

/* renamed from: com.bamtechmedia.dominguez.profiles.x1.g.u */
/* compiled from: PreferredAudioHandler_Factory */
public final class C6942u implements C11895c<C6941t> {

    /* renamed from: a */
    private final Provider<C6913e> f15445a;

    public C6942u(Provider<C6913e> provider) {
        this.f15445a = provider;
    }

    /* renamed from: a */
    public static C6942u m21192a(Provider<C6913e> provider) {
        return new C6942u(provider);
    }

    public C6941t get() {
        return new C6941t((C6913e) this.f15445a.get());
    }
}
