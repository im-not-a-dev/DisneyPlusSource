package com.bamtechmedia.dominguez.app;

import android.content.Context;
import javax.inject.Provider;
import p512h.p515d.C11895c;

/* renamed from: com.bamtechmedia.dominguez.app.i */
/* compiled from: BaseApplicationModule_ProvideIsTelevisionFactory */
public final class C2493i implements C11895c<Boolean> {

    /* renamed from: a */
    private final Provider<Context> f6790a;

    public C2493i(Provider<Context> provider) {
        this.f6790a = provider;
    }

    /* renamed from: a */
    public static C2493i m9127a(Provider<Context> provider) {
        return new C2493i(provider);
    }

    /* renamed from: a */
    public static boolean m9128a(Context context) {
        return C2483b.m9110e(context);
    }

    public Boolean get() {
        return Boolean.valueOf(m9128a((Context) this.f6790a.get()));
    }
}
