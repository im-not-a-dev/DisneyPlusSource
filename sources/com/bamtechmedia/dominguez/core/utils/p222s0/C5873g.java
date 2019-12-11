package com.bamtechmedia.dominguez.core.utils.p222s0;

import p512h.p515d.C11895c;
import p512h.p515d.C11897e;
import p520io.reactivex.C11969r;

/* renamed from: com.bamtechmedia.dominguez.core.utils.s0.g */
/* compiled from: RxModule_ProvideMainSchedulerFactory */
public final class C5873g implements C11895c<C11969r> {

    /* renamed from: a */
    private static final C5873g f13654a = new C5873g();

    /* renamed from: a */
    public static C5873g m18927a() {
        return f13654a;
    }

    /* renamed from: b */
    public static C11969r m18928b() {
        C11969r c = C5870d.m18922c();
        C11897e.m38130a(c, "Cannot return null from a non-@Nullable @Provides method");
        return c;
    }

    public C11969r get() {
        return m18928b();
    }
}
