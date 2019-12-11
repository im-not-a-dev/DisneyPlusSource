package com.bamtechmedia.dominguez.app;

import androidx.lifecycle.C0722m;
import p512h.p515d.C11895c;
import p512h.p515d.C11897e;

/* renamed from: com.bamtechmedia.dominguez.app.l */
/* compiled from: BaseApplicationModule_ProvideProcessLifecycleOwnerFactory */
public final class C2496l implements C11895c<C0722m> {

    /* renamed from: a */
    private static final C2496l f6793a = new C2496l();

    /* renamed from: a */
    public static C2496l m9133a() {
        return f6793a;
    }

    /* renamed from: b */
    public static C0722m m9134b() {
        C0722m c = C2483b.m9107c();
        C11897e.m38130a(c, "Cannot return null from a non-@Nullable @Provides method");
        return c;
    }

    public C0722m get() {
        return m9134b();
    }
}
