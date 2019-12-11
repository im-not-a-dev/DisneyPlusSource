package com.bamtechmedia.dominguez.app;

import android.app.Application;
import android.content.SharedPreferences;
import javax.inject.Provider;
import p512h.p515d.C11895c;
import p512h.p515d.C11897e;

/* renamed from: com.bamtechmedia.dominguez.app.o */
/* compiled from: BaseApplicationModule_ProvidesDebugPreferencesFactory */
public final class C2499o implements C11895c<SharedPreferences> {

    /* renamed from: a */
    private final Provider<Application> f6796a;

    public C2499o(Provider<Application> provider) {
        this.f6796a = provider;
    }

    /* renamed from: a */
    public static C2499o m9140a(Provider<Application> provider) {
        return new C2499o(provider);
    }

    /* renamed from: a */
    public static SharedPreferences m9139a(Application application) {
        SharedPreferences b = C2483b.m9103b(application);
        C11897e.m38130a(b, "Cannot return null from a non-@Nullable @Provides method");
        return b;
    }

    public SharedPreferences get() {
        return m9139a((Application) this.f6796a.get());
    }
}
