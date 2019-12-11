package com.bamtechmedia.dominguez.config;

import p512h.p515d.C11895c;
import p512h.p515d.C11897e;

/* renamed from: com.bamtechmedia.dominguez.config.a0 */
/* compiled from: FeatureConfigModule_ProvideDevConfigFactory */
public final class C3516a0 implements C11895c<C3558l> {

    /* renamed from: a */
    private static final C3516a0 f8811a = new C3516a0();

    /* renamed from: a */
    public static C3516a0 m11917a() {
        return f8811a;
    }

    /* renamed from: b */
    public static C3558l m11918b() {
        C3558l c = C3567p.m12024c();
        C11897e.m38130a(c, "Cannot return null from a non-@Nullable @Provides method");
        return c;
    }

    public C3558l get() {
        return m11918b();
    }
}
