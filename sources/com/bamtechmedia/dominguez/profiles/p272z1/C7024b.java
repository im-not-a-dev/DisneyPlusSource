package com.bamtechmedia.dominguez.profiles.p272z1;

import android.content.Context;
import javax.inject.Provider;
import p512h.p515d.C11895c;

/* renamed from: com.bamtechmedia.dominguez.profiles.z1.b */
/* compiled from: DeviceSettingsSelectionsImpl_Factory */
public final class C7024b implements C11895c<C7023a> {

    /* renamed from: a */
    private final Provider<Context> f15601a;

    public C7024b(Provider<Context> provider) {
        this.f15601a = provider;
    }

    /* renamed from: a */
    public static C7024b m21326a(Provider<Context> provider) {
        return new C7024b(provider);
    }

    public C7023a get() {
        return new C7023a((Context) this.f15601a.get());
    }
}
