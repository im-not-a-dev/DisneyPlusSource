package com.bamtechmedia.dominguez.playback.p254tv.upnext;

import com.bamtechmedia.dominguez.playback.p237m.p252q.C6500a;
import javax.inject.Provider;
import p512h.p515d.C11895c;

/* renamed from: com.bamtechmedia.dominguez.playback.tv.upnext.d */
/* compiled from: TvNextRecommendation_Factory */
public final class C6583d implements C11895c<C6581c> {

    /* renamed from: a */
    private final Provider<C6500a> f14878a;

    public C6583d(Provider<C6500a> provider) {
        this.f14878a = provider;
    }

    /* renamed from: a */
    public static C6583d m20474a(Provider<C6500a> provider) {
        return new C6583d(provider);
    }

    public C6581c get() {
        return new C6581c((C6500a) this.f14878a.get());
    }
}
