package com.bamtechmedia.dominguez.config;

import android.content.Context;
import androidx.lifecycle.C0722m;
import com.bamtechmedia.dominguez.config.C3532h.C3533a;
import com.bamtechmedia.dominguez.core.BuildInfo;
import javax.inject.Provider;
import p512h.p515d.C11895c;

/* renamed from: com.bamtechmedia.dominguez.config.f */
/* compiled from: AppConfigRepository_Factory */
public final class C3528f implements C11895c<AppConfigRepository> {

    /* renamed from: a */
    private final Provider<C0722m> f8822a;

    /* renamed from: b */
    private final Provider<C3533a> f8823b;

    /* renamed from: c */
    private final Provider<Context> f8824c;

    /* renamed from: d */
    private final Provider<BuildInfo> f8825d;

    public C3528f(Provider<C0722m> provider, Provider<C3533a> provider2, Provider<Context> provider3, Provider<BuildInfo> provider4) {
        this.f8822a = provider;
        this.f8823b = provider2;
        this.f8824c = provider3;
        this.f8825d = provider4;
    }

    /* renamed from: a */
    public static C3528f m11943a(Provider<C0722m> provider, Provider<C3533a> provider2, Provider<Context> provider3, Provider<BuildInfo> provider4) {
        return new C3528f(provider, provider2, provider3, provider4);
    }

    public AppConfigRepository get() {
        return new AppConfigRepository((C0722m) this.f8822a.get(), (C3533a) this.f8823b.get(), (Context) this.f8824c.get(), (BuildInfo) this.f8825d.get());
    }
}
