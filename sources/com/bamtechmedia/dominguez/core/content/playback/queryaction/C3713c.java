package com.bamtechmedia.dominguez.core.content.playback.queryaction;

import com.bamtechmedia.dominguez.core.content.search.C3724a;
import javax.inject.Provider;
import p512h.p515d.C11895c;

/* renamed from: com.bamtechmedia.dominguez.core.content.playback.queryaction.c */
/* compiled from: UpNextQueryActionImpl_Factory */
public final class C3713c implements C11895c<UpNextQueryActionImpl> {

    /* renamed from: a */
    private final Provider<C3724a> f9278a;

    public C3713c(Provider<C3724a> provider) {
        this.f9278a = provider;
    }

    /* renamed from: a */
    public static C3713c m12619a(Provider<C3724a> provider) {
        return new C3713c(provider);
    }

    public UpNextQueryActionImpl get() {
        return new UpNextQueryActionImpl((C3724a) this.f9278a.get());
    }
}
