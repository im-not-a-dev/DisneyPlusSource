package com.bamtechmedia.dominguez.app;

import com.bamtechmedia.dominguez.core.BuildInfo;
import javax.inject.Provider;
import p512h.p515d.C11895c;
import p512h.p515d.C11897e;

/* renamed from: com.bamtechmedia.dominguez.app.d */
/* compiled from: BaseApplicationModule_ProvideBuildInfoFactory */
public final class C2488d implements C11895c<BuildInfo> {

    /* renamed from: a */
    private final Provider<C2481a> f6785a;

    public C2488d(Provider<C2481a> provider) {
        this.f6785a = provider;
    }

    /* renamed from: a */
    public static C2488d m9117a(Provider<C2481a> provider) {
        return new C2488d(provider);
    }

    /* renamed from: a */
    public static BuildInfo m9118a(C2481a aVar) {
        BuildInfo a = C2483b.m9100a(aVar);
        C11897e.m38130a(a, "Cannot return null from a non-@Nullable @Provides method");
        return a;
    }

    public BuildInfo get() {
        return m9118a((C2481a) this.f6785a.get());
    }
}
