package com.bamtechmedia.dominguez.portability.availability;

import com.bamtechmedia.dominguez.config.C3524e;

/* renamed from: com.bamtechmedia.dominguez.portability.availability.a */
/* compiled from: PortabilityConfig.kt */
public final class C6602a {

    /* renamed from: a */
    private final C3524e f14899a;

    public C6602a(C3524e eVar) {
        this.f14899a = eVar;
    }

    /* renamed from: a */
    public final Boolean mo19250a() {
        Boolean bool = (Boolean) this.f14899a.mo12720d("portability", "availabilityOverride");
        if (bool != null) {
            return bool;
        }
        Boolean.valueOf(true).booleanValue();
        return null;
    }
}
