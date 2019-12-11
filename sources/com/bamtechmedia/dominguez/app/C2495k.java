package com.bamtechmedia.dominguez.app;

import android.app.Application;
import javax.inject.Provider;
import okhttp3.OkHttpClient;
import p512h.p515d.C11895c;
import p512h.p515d.C11897e;

/* renamed from: com.bamtechmedia.dominguez.app.k */
/* compiled from: BaseApplicationModule_ProvideOkHttpClientFactory */
public final class C2495k implements C11895c<OkHttpClient> {

    /* renamed from: a */
    private final Provider<Application> f6792a;

    public C2495k(Provider<Application> provider) {
        this.f6792a = provider;
    }

    /* renamed from: a */
    public static C2495k m9131a(Provider<Application> provider) {
        return new C2495k(provider);
    }

    /* renamed from: a */
    public static OkHttpClient m9132a(Application application) {
        OkHttpClient a = C2483b.m9102a(application);
        C11897e.m38130a(a, "Cannot return null from a non-@Nullable @Provides method");
        return a;
    }

    public OkHttpClient get() {
        return m9132a((Application) this.f6792a.get());
    }
}
