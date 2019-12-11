package com.bamtechmedia.dominguez.playback.common.query;

import com.bamtechmedia.dominguez.core.content.search.C3724a;
import javax.inject.Provider;
import p512h.p515d.C11895c;

/* renamed from: com.bamtechmedia.dominguez.playback.common.query.a */
/* compiled from: PlayableQueryAction_Factory */
public final class C6294a implements C11895c<PlayableQueryAction> {

    /* renamed from: a */
    private final Provider<C3724a> f14365a;

    public C6294a(Provider<C3724a> provider) {
        this.f14365a = provider;
    }

    /* renamed from: a */
    public static C6294a m19835a(Provider<C3724a> provider) {
        return new C6294a(provider);
    }

    public PlayableQueryAction get() {
        return new PlayableQueryAction((C3724a) this.f14365a.get());
    }
}
