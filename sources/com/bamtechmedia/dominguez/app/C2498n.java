package com.bamtechmedia.dominguez.app;

import androidx.work.WorkManager;
import p512h.p515d.C11895c;
import p512h.p515d.C11897e;

/* renamed from: com.bamtechmedia.dominguez.app.n */
/* compiled from: BaseApplicationModule_ProvideWorkManagerFactory */
public final class C2498n implements C11895c<WorkManager> {

    /* renamed from: a */
    private static final C2498n f6795a = new C2498n();

    /* renamed from: a */
    public static C2498n m9137a() {
        return f6795a;
    }

    /* renamed from: b */
    public static WorkManager m9138b() {
        WorkManager d = C2483b.m9108d();
        C11897e.m38130a(d, "Cannot return null from a non-@Nullable @Provides method");
        return d;
    }

    public WorkManager get() {
        return m9138b();
    }
}
