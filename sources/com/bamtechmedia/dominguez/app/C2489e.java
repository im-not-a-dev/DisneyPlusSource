package com.bamtechmedia.dominguez.app;

import android.content.Context;
import android.net.ConnectivityManager;
import javax.inject.Provider;
import p512h.p515d.C11895c;
import p512h.p515d.C11897e;

/* renamed from: com.bamtechmedia.dominguez.app.e */
/* compiled from: BaseApplicationModule_ProvideConnectivityManagerFactory */
public final class C2489e implements C11895c<ConnectivityManager> {

    /* renamed from: a */
    private final Provider<Context> f6786a;

    public C2489e(Provider<Context> provider) {
        this.f6786a = provider;
    }

    /* renamed from: a */
    public static C2489e m9120a(Provider<Context> provider) {
        return new C2489e(provider);
    }

    /* renamed from: a */
    public static ConnectivityManager m9119a(Context context) {
        ConnectivityManager b = C2483b.m9104b(context);
        C11897e.m38130a(b, "Cannot return null from a non-@Nullable @Provides method");
        return b;
    }

    public ConnectivityManager get() {
        return m9119a((Context) this.f6786a.get());
    }
}
