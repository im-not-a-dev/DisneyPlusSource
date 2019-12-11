package com.bamtechmedia.dominguez.main.startup;

import android.content.Context;
import android.content.SharedPreferences;
import com.bamtechmedia.dominguez.config.C3517b;
import com.bamtechmedia.dominguez.core.BuildInfo;
import com.bamtechmedia.dominguez.main.p235x.C6234e;
import javax.inject.Provider;
import p512h.p515d.C11895c;

/* renamed from: com.bamtechmedia.dominguez.main.startup.n */
/* compiled from: VersionCheck_Factory */
public final class C6202n implements C11895c<C6199m> {

    /* renamed from: a */
    private final Provider<C3517b> f14221a;

    /* renamed from: b */
    private final Provider<Context> f14222b;

    /* renamed from: c */
    private final Provider<BuildInfo> f14223c;

    /* renamed from: d */
    private final Provider<C6234e> f14224d;

    /* renamed from: e */
    private final Provider<SharedPreferences> f14225e;

    public C6202n(Provider<C3517b> provider, Provider<Context> provider2, Provider<BuildInfo> provider3, Provider<C6234e> provider4, Provider<SharedPreferences> provider5) {
        this.f14221a = provider;
        this.f14222b = provider2;
        this.f14223c = provider3;
        this.f14224d = provider4;
        this.f14225e = provider5;
    }

    /* renamed from: a */
    public static C6202n m19684a(Provider<C3517b> provider, Provider<Context> provider2, Provider<BuildInfo> provider3, Provider<C6234e> provider4, Provider<SharedPreferences> provider5) {
        C6202n nVar = new C6202n(provider, provider2, provider3, provider4, provider5);
        return nVar;
    }

    public C6199m get() {
        C6199m mVar = new C6199m((C3517b) this.f14221a.get(), (Context) this.f14222b.get(), (BuildInfo) this.f14223c.get(), (C6234e) this.f14224d.get(), (SharedPreferences) this.f14225e.get());
        return mVar;
    }
}
