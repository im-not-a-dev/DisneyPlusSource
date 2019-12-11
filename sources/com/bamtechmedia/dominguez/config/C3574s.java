package com.bamtechmedia.dominguez.config;

import p512h.p515d.C11895c;
import p512h.p515d.C11897e;

/* renamed from: com.bamtechmedia.dominguez.config.s */
/* compiled from: FeatureConfigModule_BindFeatureFlagsFactory */
public final class C3574s implements C11895c<C3526e0> {
    static {
        new C3574s();
    }

    /* renamed from: a */
    public static C3526e0 m12038a() {
        C3526e0 a = C3567p.m12012a();
        C11897e.m38130a(a, "Cannot return null from a non-@Nullable @Provides method");
        return a;
    }

    public C3526e0 get() {
        return m12038a();
    }
}
