package com.bamtechmedia.dominguez.playback.p254tv.p255c;

import androidx.fragment.app.C0532d;
import com.bamtechmedia.dominguez.core.content.playback.queryaction.C3712b;
import com.bamtechmedia.dominguez.playback.common.query.PlayableQueryAction;
import com.bamtechmedia.dominguez.playback.p237m.C6342f;
import com.bamtechmedia.dominguez.playback.p237m.p239j.C6394h;
import com.bamtechmedia.dominguez.playback.p237m.p242m.p243e.C6427a;
import com.bamtechmedia.dominguez.playback.p237m.p242m.p244f.C6439c;
import com.bamtechmedia.dominguez.playback.p237m.p245n.C6453d;
import com.bamtechmedia.dominguez.playback.p237m.p252q.C6507c;
import com.bamtechmedia.dominguez.playback.p237m.p252q.C6510e;
import com.bamtechmedia.dominguez.playback.p237m.p252q.p253g.C6512a;
import com.bamtechmedia.dominguez.profiles.C6667g1;
import javax.inject.Provider;
import p512h.p515d.C11895c;
import p512h.p515d.C11897e;

/* renamed from: com.bamtechmedia.dominguez.playback.tv.c.p */
/* compiled from: TvPlaybackModule_ProvidePlaybackViewModelFactory */
public final class C6553p implements C11895c<C6342f> {

    /* renamed from: a */
    private final Provider<C0532d> f14802a;

    /* renamed from: b */
    private final Provider<PlayableQueryAction> f14803b;

    /* renamed from: c */
    private final Provider<C3712b> f14804c;

    /* renamed from: d */
    private final Provider<C6507c> f14805d;

    /* renamed from: e */
    private final Provider<C6394h> f14806e;

    /* renamed from: f */
    private final Provider<C6439c> f14807f;

    /* renamed from: g */
    private final Provider<C6427a> f14808g;

    /* renamed from: h */
    private final Provider<C6453d> f14809h;

    /* renamed from: i */
    private final Provider<C6512a> f14810i;

    /* renamed from: j */
    private final Provider<C6667g1> f14811j;

    /* renamed from: k */
    private final Provider<C6510e> f14812k;

    public C6553p(Provider<C0532d> provider, Provider<PlayableQueryAction> provider2, Provider<C3712b> provider3, Provider<C6507c> provider4, Provider<C6394h> provider5, Provider<C6439c> provider6, Provider<C6427a> provider7, Provider<C6453d> provider8, Provider<C6512a> provider9, Provider<C6667g1> provider10, Provider<C6510e> provider11) {
        this.f14802a = provider;
        this.f14803b = provider2;
        this.f14804c = provider3;
        this.f14805d = provider4;
        this.f14806e = provider5;
        this.f14807f = provider6;
        this.f14808g = provider7;
        this.f14809h = provider8;
        this.f14810i = provider9;
        this.f14811j = provider10;
        this.f14812k = provider11;
    }

    /* renamed from: a */
    public static C6553p m20387a(Provider<C0532d> provider, Provider<PlayableQueryAction> provider2, Provider<C3712b> provider3, Provider<C6507c> provider4, Provider<C6394h> provider5, Provider<C6439c> provider6, Provider<C6427a> provider7, Provider<C6453d> provider8, Provider<C6512a> provider9, Provider<C6667g1> provider10, Provider<C6510e> provider11) {
        C6553p pVar = new C6553p(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11);
        return pVar;
    }

    /* renamed from: a */
    public static C6342f m20386a(C0532d dVar, PlayableQueryAction playableQueryAction, C3712b bVar, C6507c cVar, C6394h hVar, C6439c cVar2, C6427a aVar, C6453d dVar2, C6512a aVar2, C6667g1 g1Var, C6510e eVar) {
        C6342f a = C6548k.m20372a(dVar, playableQueryAction, bVar, cVar, hVar, cVar2, aVar, dVar2, aVar2, g1Var, eVar);
        C11897e.m38130a(a, "Cannot return null from a non-@Nullable @Provides method");
        return a;
    }

    public C6342f get() {
        return m20386a((C0532d) this.f14802a.get(), (PlayableQueryAction) this.f14803b.get(), (C3712b) this.f14804c.get(), (C6507c) this.f14805d.get(), (C6394h) this.f14806e.get(), (C6439c) this.f14807f.get(), (C6427a) this.f14808g.get(), (C6453d) this.f14809h.get(), (C6512a) this.f14810i.get(), (C6667g1) this.f14811j.get(), (C6510e) this.f14812k.get());
    }
}
