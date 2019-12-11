package com.bamtechmedia.dominguez.config;

import java.util.Locale;
import javax.inject.Provider;
import p512h.p515d.C11895c;
import p512h.p515d.C11897e;

/* renamed from: com.bamtechmedia.dominguez.config.t */
/* compiled from: FeatureConfigModule_DeviceLanguageFactory */
public final class C3576t implements C11895c<String> {

    /* renamed from: a */
    private final Provider<Locale> f8905a;

    public C3576t(Provider<Locale> provider) {
        this.f8905a = provider;
    }

    /* renamed from: a */
    public static C3576t m12041a(Provider<Locale> provider) {
        return new C3576t(provider);
    }

    /* renamed from: a */
    public static String m12042a(Locale locale) {
        String a = C3567p.m12019a(locale);
        C11897e.m38130a(a, "Cannot return null from a non-@Nullable @Provides method");
        return a;
    }

    public String get() {
        return m12042a((Locale) this.f8905a.get());
    }
}
