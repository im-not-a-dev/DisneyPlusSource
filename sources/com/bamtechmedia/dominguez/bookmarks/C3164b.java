package com.bamtechmedia.dominguez.bookmarks;

import com.bamtechmedia.dominguez.config.C3524e;
import javax.inject.Provider;
import p512h.p515d.C11895c;

/* renamed from: com.bamtechmedia.dominguez.bookmarks.b */
/* compiled from: BookmarksConfig_Factory */
public final class C3164b implements C11895c<C3163a> {

    /* renamed from: a */
    private final Provider<C3524e> f8110a;

    public C3164b(Provider<C3524e> provider) {
        this.f8110a = provider;
    }

    /* renamed from: a */
    public static C3164b m11064a(Provider<C3524e> provider) {
        return new C3164b(provider);
    }

    public C3163a get() {
        return new C3163a((C3524e) this.f8110a.get());
    }
}
