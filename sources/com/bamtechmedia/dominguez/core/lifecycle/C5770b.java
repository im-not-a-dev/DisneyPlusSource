package com.bamtechmedia.dominguez.core.lifecycle;

import com.bamtechmedia.dominguez.core.C3585a;
import javax.inject.Provider;
import p512h.p515d.C11895c;

/* renamed from: com.bamtechmedia.dominguez.core.lifecycle.b */
/* compiled from: AppPresenceImpl_Factory */
public final class C5770b implements C11895c<AppPresenceImpl> {

    /* renamed from: a */
    private final Provider<C3585a> f13529a;

    public C5770b(Provider<C3585a> provider) {
        this.f13529a = provider;
    }

    /* renamed from: a */
    public static C5770b m18715a(Provider<C3585a> provider) {
        return new C5770b(provider);
    }

    public AppPresenceImpl get() {
        return new AppPresenceImpl((C3585a) this.f13529a.get());
    }
}
