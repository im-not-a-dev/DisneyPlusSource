package com.bamtechmedia.dominguez.profiles.p268x1.p269g;

import com.bamtechmedia.dominguez.profiles.p268x1.C6913e;
import javax.inject.Provider;
import p512h.p515d.C11895c;

/* renamed from: com.bamtechmedia.dominguez.profiles.x1.g.h */
/* compiled from: DefaultAudioLanguageHandler_Factory */
public final class C6929h implements C11895c<C6928g> {

    /* renamed from: a */
    private final Provider<C6913e> f15431a;

    public C6929h(Provider<C6913e> provider) {
        this.f15431a = provider;
    }

    /* renamed from: a */
    public static C6929h m21170a(Provider<C6913e> provider) {
        return new C6929h(provider);
    }

    public C6928g get() {
        return new C6928g((C6913e) this.f15431a.get());
    }
}
