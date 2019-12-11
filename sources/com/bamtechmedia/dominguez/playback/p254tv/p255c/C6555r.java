package com.bamtechmedia.dominguez.playback.p254tv.p255c;

import android.content.Context;
import com.bamtechmedia.dominguez.analytics.p057o0.C2435d;
import com.bamtechmedia.dominguez.playback.C6266a;
import com.bamtechmedia.dominguez.playback.p237m.p239j.C6381a;
import com.bamtechmedia.dominguez.playback.p237m.p239j.C6384c;
import java.util.Set;
import javax.inject.Provider;
import p512h.p515d.C11895c;
import p512h.p515d.C11897e;

/* renamed from: com.bamtechmedia.dominguez.playback.tv.c.r */
/* compiled from: TvPlaybackModule_ProvidesConvivaSetupFactory */
public final class C6555r implements C11895c<C6384c> {

    /* renamed from: a */
    private final Provider<Set<C2435d>> f14813a;

    /* renamed from: b */
    private final Provider<C6381a> f14814b;

    /* renamed from: c */
    private final Provider<C6266a> f14815c;

    /* renamed from: d */
    private final Provider<Context> f14816d;

    public C6555r(Provider<Set<C2435d>> provider, Provider<C6381a> provider2, Provider<C6266a> provider3, Provider<Context> provider4) {
        this.f14813a = provider;
        this.f14814b = provider2;
        this.f14815c = provider3;
        this.f14816d = provider4;
    }

    /* renamed from: a */
    public static C6555r m20390a(Provider<Set<C2435d>> provider, Provider<C6381a> provider2, Provider<C6266a> provider3, Provider<Context> provider4) {
        return new C6555r(provider, provider2, provider3, provider4);
    }

    /* renamed from: a */
    public static C6384c m20389a(Set<C2435d> set, C6381a aVar, C6266a aVar2, Context context) {
        C6384c a = C6548k.m20374a(set, aVar, aVar2, context);
        C11897e.m38130a(a, "Cannot return null from a non-@Nullable @Provides method");
        return a;
    }

    public C6384c get() {
        return m20389a((Set) this.f14813a.get(), (C6381a) this.f14814b.get(), (C6266a) this.f14815c.get(), (Context) this.f14816d.get());
    }
}
