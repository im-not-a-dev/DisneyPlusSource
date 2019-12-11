package com.bamtechmedia.dominguez.app;

import android.app.ActivityManager;
import android.content.Context;
import javax.inject.Provider;
import p512h.p515d.C11895c;
import p512h.p515d.C11897e;

/* renamed from: com.bamtechmedia.dominguez.app.c */
/* compiled from: BaseApplicationModule_ActivityManagerFactory */
public final class C2485c implements C11895c<ActivityManager> {

    /* renamed from: a */
    private final Provider<Context> f6784a;

    public C2485c(Provider<Context> provider) {
        this.f6784a = provider;
    }

    /* renamed from: a */
    public static C2485c m9114a(Provider<Context> provider) {
        return new C2485c(provider);
    }

    /* renamed from: a */
    public static ActivityManager m9113a(Context context) {
        ActivityManager a = C2483b.m9098a(context);
        C11897e.m38130a(a, "Cannot return null from a non-@Nullable @Provides method");
        return a;
    }

    public ActivityManager get() {
        return m9113a((Context) this.f6784a.get());
    }
}
