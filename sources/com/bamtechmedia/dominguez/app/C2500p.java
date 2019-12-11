package com.bamtechmedia.dominguez.app;

import android.content.res.Resources;
import android.util.DisplayMetrics;
import javax.inject.Provider;
import p512h.p515d.C11895c;
import p512h.p515d.C11897e;

/* renamed from: com.bamtechmedia.dominguez.app.p */
/* compiled from: BaseApplicationModule_ProvidesDisplayMetricsFactory */
public final class C2500p implements C11895c<DisplayMetrics> {

    /* renamed from: a */
    private final Provider<Resources> f6797a;

    public C2500p(Provider<Resources> provider) {
        this.f6797a = provider;
    }

    /* renamed from: a */
    public static C2500p m9142a(Provider<Resources> provider) {
        return new C2500p(provider);
    }

    /* renamed from: a */
    public static DisplayMetrics m9141a(Resources resources) {
        DisplayMetrics a = C2483b.m9099a(resources);
        C11897e.m38130a(a, "Cannot return null from a non-@Nullable @Provides method");
        return a;
    }

    public DisplayMetrics get() {
        return m9141a((Resources) this.f6797a.get());
    }
}
