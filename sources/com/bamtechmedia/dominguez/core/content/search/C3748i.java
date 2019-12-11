package com.bamtechmedia.dominguez.core.content.search;

import com.bamtech.sdk4.session.SessionInfo;
import com.bamtechmedia.dominguez.profiles.C6667g1;
import javax.inject.Provider;
import okhttp3.OkHttpClient;
import p163g.p500m.p501a.C11760v;
import p512h.p515d.C11895c;
import p520io.reactivex.Single;

/* renamed from: com.bamtechmedia.dominguez.core.content.search.i */
/* compiled from: StaticSearchApi_Factory */
public final class C3748i implements C11895c<C3743h> {

    /* renamed from: a */
    private final Provider<C3741f> f9349a;

    /* renamed from: b */
    private final Provider<Single<SessionInfo>> f9350b;

    /* renamed from: c */
    private final Provider<C6667g1> f9351c;

    /* renamed from: d */
    private final Provider<OkHttpClient> f9352d;

    /* renamed from: e */
    private final Provider<C11760v> f9353e;

    public C3748i(Provider<C3741f> provider, Provider<Single<SessionInfo>> provider2, Provider<C6667g1> provider3, Provider<OkHttpClient> provider4, Provider<C11760v> provider5) {
        this.f9349a = provider;
        this.f9350b = provider2;
        this.f9351c = provider3;
        this.f9352d = provider4;
        this.f9353e = provider5;
    }

    /* renamed from: a */
    public static C3748i m12695a(Provider<C3741f> provider, Provider<Single<SessionInfo>> provider2, Provider<C6667g1> provider3, Provider<OkHttpClient> provider4, Provider<C11760v> provider5) {
        C3748i iVar = new C3748i(provider, provider2, provider3, provider4, provider5);
        return iVar;
    }

    public C3743h get() {
        C3743h hVar = new C3743h((C3741f) this.f9349a.get(), (Single) this.f9350b.get(), (C6667g1) this.f9351c.get(), this.f9352d, this.f9353e);
        return hVar;
    }
}
