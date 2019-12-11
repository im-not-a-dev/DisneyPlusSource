package com.bamtechmedia.dominguez.main.startup;

import com.bamtechmedia.dominguez.config.C3524e;
import javax.inject.Provider;
import p512h.p515d.C11895c;
import p520io.reactivex.Single;

/* renamed from: com.bamtechmedia.dominguez.main.startup.c */
/* compiled from: ConfigInitialization_Factory */
public final class C6180c implements C11895c<C6178b> {

    /* renamed from: a */
    private final Provider<Single<C3524e>> f14179a;

    /* renamed from: b */
    private final Provider<AppLaunchAnalyticsLifecycleObserver> f14180b;

    /* renamed from: c */
    private final Provider<C6199m> f14181c;

    public C6180c(Provider<Single<C3524e>> provider, Provider<AppLaunchAnalyticsLifecycleObserver> provider2, Provider<C6199m> provider3) {
        this.f14179a = provider;
        this.f14180b = provider2;
        this.f14181c = provider3;
    }

    /* renamed from: a */
    public static C6180c m19645a(Provider<Single<C3524e>> provider, Provider<AppLaunchAnalyticsLifecycleObserver> provider2, Provider<C6199m> provider3) {
        return new C6180c(provider, provider2, provider3);
    }

    public C6178b get() {
        return new C6178b((Single) this.f14179a.get(), (AppLaunchAnalyticsLifecycleObserver) this.f14180b.get(), (C6199m) this.f14181c.get());
    }
}
