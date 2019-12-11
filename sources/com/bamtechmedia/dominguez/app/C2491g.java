package com.bamtechmedia.dominguez.app;

import p512h.p515d.C11895c;
import p512h.p515d.C11897e;

/* renamed from: com.bamtechmedia.dominguez.app.g */
/* compiled from: BaseApplicationModule_ProvideIsDebugFactory */
public final class C2491g implements C11895c<Boolean> {

    /* renamed from: a */
    private static final C2491g f6788a = new C2491g();

    /* renamed from: a */
    public static C2491g m9123a() {
        return f6788a;
    }

    /* renamed from: b */
    public static Boolean m9124b() {
        Boolean a = C2483b.m9101a();
        C11897e.m38130a(a, "Cannot return null from a non-@Nullable @Provides method");
        return a;
    }

    public Boolean get() {
        return m9124b();
    }
}
