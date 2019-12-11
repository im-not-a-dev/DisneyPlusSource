package com.bamtechmedia.dominguez.config;

import com.bamtechmedia.dominguez.dictionaries.C6063a;
import javax.inject.Provider;
import p512h.p515d.C11895c;
import p512h.p515d.C11897e;

/* renamed from: com.bamtechmedia.dominguez.config.v */
/* compiled from: FeatureConfigModule_KeysSourceFactory */
public final class C3579v implements C11895c<C3552i0> {
    /* renamed from: a */
    public static C3552i0 m12046a(C6063a aVar, Provider<C3531g0> provider, Provider<C3563n> provider2) {
        C3552i0 a = C3567p.m12014a(aVar, provider, provider2);
        C11897e.m38130a(a, "Cannot return null from a non-@Nullable @Provides method");
        return a;
    }
}
