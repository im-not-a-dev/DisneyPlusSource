package com.bamtechmedia.dominguez.app;

import p163g.p500m.p501a.C11760v;
import p512h.p515d.C11895c;
import p512h.p515d.C11897e;

/* renamed from: com.bamtechmedia.dominguez.app.j */
/* compiled from: BaseApplicationModule_ProvideMoshiFactory */
public final class C2494j implements C11895c<C11760v> {

    /* renamed from: a */
    private static final C2494j f6791a = new C2494j();

    /* renamed from: a */
    public static C2494j m9129a() {
        return f6791a;
    }

    /* renamed from: b */
    public static C11760v m9130b() {
        C11760v b = C2483b.m9105b();
        C11897e.m38130a(b, "Cannot return null from a non-@Nullable @Provides method");
        return b;
    }

    public C11760v get() {
        return m9130b();
    }
}
