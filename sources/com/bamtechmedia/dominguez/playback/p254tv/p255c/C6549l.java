package com.bamtechmedia.dominguez.playback.p254tv.p255c;

import androidx.fragment.app.C0532d;
import com.bamtechmedia.dominguez.playback.C6266a;
import com.bamtechmedia.dominguez.playback.p237m.p252q.p253g.C6512a;
import javax.inject.Provider;
import p512h.p515d.C11895c;
import p512h.p515d.C11897e;

/* renamed from: com.bamtechmedia.dominguez.playback.tv.c.l */
/* compiled from: TvPlaybackModule_ProvideAutoPlayRulesFactory */
public final class C6549l implements C11895c<C6512a> {

    /* renamed from: a */
    private final Provider<C0532d> f14799a;

    /* renamed from: b */
    private final Provider<C6266a> f14800b;

    public C6549l(Provider<C0532d> provider, Provider<C6266a> provider2) {
        this.f14799a = provider;
        this.f14800b = provider2;
    }

    /* renamed from: a */
    public static C6549l m20381a(Provider<C0532d> provider, Provider<C6266a> provider2) {
        return new C6549l(provider, provider2);
    }

    /* renamed from: a */
    public static C6512a m20380a(C0532d dVar, C6266a aVar) {
        C6512a a = C6548k.m20376a(dVar, aVar);
        C11897e.m38130a(a, "Cannot return null from a non-@Nullable @Provides method");
        return a;
    }

    public C6512a get() {
        return m20380a((C0532d) this.f14799a.get(), (C6266a) this.f14800b.get());
    }
}
