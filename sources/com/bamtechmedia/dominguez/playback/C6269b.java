package com.bamtechmedia.dominguez.playback;

import android.app.ActivityManager;
import com.bamtechmedia.dominguez.config.C3524e;
import com.bamtechmedia.dominguez.config.p082t0.C3577a;
import com.bamtechmedia.dominguez.core.BuildInfo;
import com.bamtechmedia.dominguez.core.utils.C5862q0;
import javax.inject.Provider;
import p512h.p515d.C11895c;

/* renamed from: com.bamtechmedia.dominguez.playback.b */
/* compiled from: PlaybackConfig_Factory */
public final class C6269b implements C11895c<C6266a> {

    /* renamed from: a */
    private final Provider<C3524e> f14315a;

    /* renamed from: b */
    private final Provider<C5862q0> f14316b;

    /* renamed from: c */
    private final Provider<ActivityManager> f14317c;

    /* renamed from: d */
    private final Provider<BuildInfo> f14318d;

    /* renamed from: e */
    private final Provider<C3577a> f14319e;

    public C6269b(Provider<C3524e> provider, Provider<C5862q0> provider2, Provider<ActivityManager> provider3, Provider<BuildInfo> provider4, Provider<C3577a> provider5) {
        this.f14315a = provider;
        this.f14316b = provider2;
        this.f14317c = provider3;
        this.f14318d = provider4;
        this.f14319e = provider5;
    }

    /* renamed from: a */
    public static C6269b m19780a(Provider<C3524e> provider, Provider<C5862q0> provider2, Provider<ActivityManager> provider3, Provider<BuildInfo> provider4, Provider<C3577a> provider5) {
        C6269b bVar = new C6269b(provider, provider2, provider3, provider4, provider5);
        return bVar;
    }

    public C6266a get() {
        C6266a aVar = new C6266a((C3524e) this.f14315a.get(), (C5862q0) this.f14316b.get(), (ActivityManager) this.f14317c.get(), (BuildInfo) this.f14318d.get(), (C3577a) this.f14319e.get());
        return aVar;
    }
}
