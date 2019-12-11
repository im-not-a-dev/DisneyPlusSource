package com.bamtechmedia.dominguez.channels.p073tv.p074g;

import com.bamtechmedia.dominguez.channels.p073tv.C3204a;
import javax.inject.Provider;
import p512h.p515d.C11895c;
import p520io.reactivex.C11969r;

/* renamed from: com.bamtechmedia.dominguez.channels.tv.g.b */
/* compiled from: ChannelDeletionLogoutAction_Factory */
public final class C3214b implements C11895c<C3212a> {

    /* renamed from: a */
    private final Provider<C3204a> f8185a;

    /* renamed from: b */
    private final Provider<C11969r> f8186b;

    public C3214b(Provider<C3204a> provider, Provider<C11969r> provider2) {
        this.f8185a = provider;
        this.f8186b = provider2;
    }

    /* renamed from: a */
    public static C3214b m11166a(Provider<C3204a> provider, Provider<C11969r> provider2) {
        return new C3214b(provider, provider2);
    }

    public C3212a get() {
        return new C3212a((C3204a) this.f8185a.get(), (C11969r) this.f8186b.get());
    }
}
