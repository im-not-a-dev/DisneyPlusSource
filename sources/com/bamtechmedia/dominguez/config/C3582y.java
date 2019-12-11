package com.bamtechmedia.dominguez.config;

import com.bamtechmedia.dominguez.core.content.search.C3749j;
import java.util.Locale;
import javax.inject.Provider;
import p512h.p515d.C11895c;
import p512h.p515d.C11897e;

/* renamed from: com.bamtechmedia.dominguez.config.y */
/* compiled from: FeatureConfigModule_LocaleFactory */
public final class C3582y implements C11895c<Locale> {

    /* renamed from: a */
    private final Provider<C3749j> f8912a;

    public C3582y(Provider<C3749j> provider) {
        this.f8912a = provider;
    }

    /* renamed from: a */
    public static C3582y m12050a(Provider<C3749j> provider) {
        return new C3582y(provider);
    }

    /* renamed from: a */
    public static Locale m12051a(C3749j jVar) {
        Locale a = C3567p.m12020a(jVar);
        C11897e.m38130a(a, "Cannot return null from a non-@Nullable @Provides method");
        return a;
    }

    public Locale get() {
        return m12051a((C3749j) this.f8912a.get());
    }
}
