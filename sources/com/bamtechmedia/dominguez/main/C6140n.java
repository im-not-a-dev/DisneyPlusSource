package com.bamtechmedia.dominguez.main;

import p163g.p201e.p203b.p307o.p308p.C7629c;
import p512h.p515d.C11895c;
import p512h.p515d.C11897e;

/* renamed from: com.bamtechmedia.dominguez.main.n */
/* compiled from: MainActivityTvBindingModule_ActivityModule_ProvideOfflineRouterFactory */
public final class C6140n implements C11895c<C7629c> {

    /* renamed from: a */
    private static final C6140n f14114a = new C6140n();

    /* renamed from: a */
    public static C6140n m19573a() {
        return f14114a;
    }

    /* renamed from: b */
    public static C7629c m19574b() {
        C7629c a = C6139m.m19571a();
        C11897e.m38130a(a, "Cannot return null from a non-@Nullable @Provides method");
        return a;
    }

    public C7629c get() {
        return m19574b();
    }
}
