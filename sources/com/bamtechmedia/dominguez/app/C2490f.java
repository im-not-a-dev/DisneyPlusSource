package com.bamtechmedia.dominguez.app;

import android.content.Context;
import android.content.SharedPreferences;
import javax.inject.Provider;
import p512h.p515d.C11895c;
import p512h.p515d.C11897e;

/* renamed from: com.bamtechmedia.dominguez.app.f */
/* compiled from: BaseApplicationModule_ProvideDefaultSharedPrefsFactory */
public final class C2490f implements C11895c<SharedPreferences> {

    /* renamed from: a */
    private final Provider<Context> f6787a;

    public C2490f(Provider<Context> provider) {
        this.f6787a = provider;
    }

    /* renamed from: a */
    public static C2490f m9122a(Provider<Context> provider) {
        return new C2490f(provider);
    }

    /* renamed from: a */
    public static SharedPreferences m9121a(Context context) {
        SharedPreferences c = C2483b.m9106c(context);
        C11897e.m38130a(c, "Cannot return null from a non-@Nullable @Provides method");
        return c;
    }

    public SharedPreferences get() {
        return m9121a((Context) this.f6787a.get());
    }
}
