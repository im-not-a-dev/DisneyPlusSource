package com.bamtechmedia.dominguez.playback.p254tv.p255c;

import com.bamtechmedia.dominguez.core.p218n.C5773a;
import com.bamtechmedia.dominguez.playback.p254tv.TvPlaybackActivity;
import javax.inject.Provider;
import p512h.p515d.C11895c;
import p512h.p515d.C11897e;

/* renamed from: com.bamtechmedia.dominguez.playback.tv.c.j */
/* compiled from: TvPlaybackBindingModule_TvPlaybackActivityModule_ProvideActivityNavigationFactory */
public final class C6547j implements C11895c<C5773a> {

    /* renamed from: a */
    private final Provider<TvPlaybackActivity> f14798a;

    public C6547j(Provider<TvPlaybackActivity> provider) {
        this.f14798a = provider;
    }

    /* renamed from: a */
    public static C6547j m20370a(Provider<TvPlaybackActivity> provider) {
        return new C6547j(provider);
    }

    /* renamed from: a */
    public static C5773a m20369a(TvPlaybackActivity tvPlaybackActivity) {
        C5773a a = C6543g.m20366a(tvPlaybackActivity);
        C11897e.m38130a(a, "Cannot return null from a non-@Nullable @Provides method");
        return a;
    }

    public C5773a get() {
        return m20369a((TvPlaybackActivity) this.f14798a.get());
    }
}
