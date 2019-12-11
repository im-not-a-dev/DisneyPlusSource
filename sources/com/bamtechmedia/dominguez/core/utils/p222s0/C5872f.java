package com.bamtechmedia.dominguez.core.utils.p222s0;

import p512h.p515d.C11895c;
import p512h.p515d.C11897e;
import p520io.reactivex.C11969r;

/* renamed from: com.bamtechmedia.dominguez.core.utils.s0.f */
/* compiled from: RxModule_ProvideIoSchedulerFactory */
public final class C5872f implements C11895c<C11969r> {

    /* renamed from: a */
    private static final C5872f f13653a = new C5872f();

    /* renamed from: a */
    public static C5872f m18925a() {
        return f13653a;
    }

    /* renamed from: b */
    public static C11969r m18926b() {
        C11969r b = C5870d.m18921b();
        C11897e.m38130a(b, "Cannot return null from a non-@Nullable @Provides method");
        return b;
    }

    public C11969r get() {
        return m18926b();
    }
}
