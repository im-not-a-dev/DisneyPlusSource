package com.bamtechmedia.dominguez.profiles.p268x1.p269g;

import com.bamtechmedia.dominguez.profiles.p268x1.C6913e;
import javax.inject.Provider;
import p512h.p515d.C11895c;

/* renamed from: com.bamtechmedia.dominguez.profiles.x1.g.l */
/* compiled from: FirstAudioLanguageHandler_Factory */
public final class C6933l implements C11895c<C6932k> {

    /* renamed from: a */
    private final Provider<C6913e> f15436a;

    public C6933l(Provider<C6913e> provider) {
        this.f15436a = provider;
    }

    /* renamed from: a */
    public static C6933l m21177a(Provider<C6913e> provider) {
        return new C6933l(provider);
    }

    public C6932k get() {
        return new C6932k((C6913e) this.f15436a.get());
    }
}
