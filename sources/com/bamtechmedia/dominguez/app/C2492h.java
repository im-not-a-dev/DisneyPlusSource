package com.bamtechmedia.dominguez.app;

import android.content.Context;
import javax.inject.Provider;
import p512h.p515d.C11895c;

/* renamed from: com.bamtechmedia.dominguez.app.h */
/* compiled from: BaseApplicationModule_ProvideIsTabletFactory */
public final class C2492h implements C11895c<Boolean> {

    /* renamed from: a */
    private final Provider<Context> f6789a;

    public C2492h(Provider<Context> provider) {
        this.f6789a = provider;
    }

    /* renamed from: a */
    public static C2492h m9125a(Provider<Context> provider) {
        return new C2492h(provider);
    }

    /* renamed from: a */
    public static boolean m9126a(Context context) {
        return C2483b.m9109d(context);
    }

    public Boolean get() {
        return Boolean.valueOf(m9126a((Context) this.f6789a.get()));
    }
}
