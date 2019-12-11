package com.bamtechmedia.dominguez.main.startup;

import com.bamtechmedia.dominguez.config.C3524e;

/* renamed from: com.bamtechmedia.dominguez.main.startup.l */
/* compiled from: StartupConfig.kt */
public final class C6198l {

    /* renamed from: a */
    private final C3524e f14213a;

    public C6198l(C3524e eVar) {
        this.f14213a = eVar;
    }

    /* renamed from: a */
    public final Long mo18798a() {
        Long a = this.f14213a.mo12716a("startup", "timeoutSeconds");
        return Long.valueOf(a != null ? a.longValue() : 10);
    }
}
