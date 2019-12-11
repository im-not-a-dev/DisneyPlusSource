package com.bamtechmedia.dominguez.playback.p254tv.upnext;

import com.bamtechmedia.dominguez.playback.p237m.p252q.p253g.C6512a;
import javax.inject.Provider;
import p512h.p515d.C11895c;
import p520io.reactivex.Single;

/* renamed from: com.bamtechmedia.dominguez.playback.tv.upnext.b */
/* compiled from: TvDialogTypeResolver_Factory */
public final class C6580b implements C11895c<C6577a> {

    /* renamed from: a */
    private final Provider<Single<Boolean>> f14874a;

    /* renamed from: b */
    private final Provider<C6512a> f14875b;

    public C6580b(Provider<Single<Boolean>> provider, Provider<C6512a> provider2) {
        this.f14874a = provider;
        this.f14875b = provider2;
    }

    /* renamed from: a */
    public static C6580b m20468a(Provider<Single<Boolean>> provider, Provider<C6512a> provider2) {
        return new C6580b(provider, provider2);
    }

    public C6577a get() {
        return new C6577a((Single) this.f14874a.get(), (C6512a) this.f14875b.get());
    }
}
