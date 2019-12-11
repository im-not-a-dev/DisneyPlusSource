package com.bamtechmedia.dominguez.core;

import com.bamtechmedia.dominguez.config.C3524e;

/* renamed from: com.bamtechmedia.dominguez.core.b */
/* compiled from: CoreCommonConfigImpl.kt */
public final class C3586b implements C3585a {

    /* renamed from: a */
    private final C3524e f8924a;

    public C3586b(C3524e eVar) {
        this.f8924a = eVar;
    }

    /* renamed from: a */
    public long mo12793a() {
        Long a = this.f8924a.mo12716a("disconnectedDelayToHintSeconds", new String[0]);
        if (a != null) {
            return a.longValue();
        }
        return 5;
    }

    /* renamed from: b */
    public int mo12794b() {
        Integer c = this.f8924a.mo12719c("maxBackgroundBeforeForcedFreshStartMinutes", new String[0]);
        if (c != null) {
            return c.intValue();
        }
        return 120;
    }
}
