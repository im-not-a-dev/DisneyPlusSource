package com.bamtechmedia.dominguez.auth.p064p0;

import android.content.SharedPreferences;
import javax.inject.Provider;
import p512h.p515d.C11895c;

/* renamed from: com.bamtechmedia.dominguez.auth.p0.i */
/* compiled from: PasswordAvailabilityImpl_Factory */
public final class C2778i implements C11895c<C2776h> {

    /* renamed from: a */
    private final Provider<SharedPreferences> f7530a;

    public C2778i(Provider<SharedPreferences> provider) {
        this.f7530a = provider;
    }

    /* renamed from: a */
    public static C2778i m10435a(Provider<SharedPreferences> provider) {
        return new C2778i(provider);
    }

    public C2776h get() {
        return new C2776h((SharedPreferences) this.f7530a.get());
    }
}
