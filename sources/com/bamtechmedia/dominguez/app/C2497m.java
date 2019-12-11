package com.bamtechmedia.dominguez.app;

import android.content.Context;
import android.content.res.Resources;
import javax.inject.Provider;
import p512h.p515d.C11895c;
import p512h.p515d.C11897e;

/* renamed from: com.bamtechmedia.dominguez.app.m */
/* compiled from: BaseApplicationModule_ProvideResourcesFactory */
public final class C2497m implements C11895c<Resources> {

    /* renamed from: a */
    private final Provider<Context> f6794a;

    public C2497m(Provider<Context> provider) {
        this.f6794a = provider;
    }

    /* renamed from: a */
    public static C2497m m9136a(Provider<Context> provider) {
        return new C2497m(provider);
    }

    /* renamed from: a */
    public static Resources m9135a(Context context) {
        Resources f = C2483b.m9111f(context);
        C11897e.m38130a(f, "Cannot return null from a non-@Nullable @Provides method");
        return f;
    }

    public Resources get() {
        return m9135a((Context) this.f6794a.get());
    }
}
