package com.bamtechmedia.dominguez.core.content;

import android.content.res.Resources;
import com.bamtechmedia.dominguez.config.C3572r0;
import com.bamtechmedia.dominguez.core.utils.C5821c0;
import javax.inject.Provider;
import p163g.p201e.p203b.p275a0.C7159g;
import p512h.p515d.C11895c;

/* renamed from: com.bamtechmedia.dominguez.core.content.s */
/* compiled from: RatingAdvisoriesFormatterImpl_Factory */
public final class C3723s implements C11895c<C3718r> {

    /* renamed from: a */
    private final Provider<C3572r0> f9300a;

    /* renamed from: b */
    private final Provider<C3572r0> f9301b;

    /* renamed from: c */
    private final Provider<C5821c0> f9302c;

    /* renamed from: d */
    private final Provider<C7159g> f9303d;

    /* renamed from: e */
    private final Provider<Resources> f9304e;

    public C3723s(Provider<C3572r0> provider, Provider<C3572r0> provider2, Provider<C5821c0> provider3, Provider<C7159g> provider4, Provider<Resources> provider5) {
        this.f9300a = provider;
        this.f9301b = provider2;
        this.f9302c = provider3;
        this.f9303d = provider4;
        this.f9304e = provider5;
    }

    /* renamed from: a */
    public static C3723s m12650a(Provider<C3572r0> provider, Provider<C3572r0> provider2, Provider<C5821c0> provider3, Provider<C7159g> provider4, Provider<Resources> provider5) {
        C3723s sVar = new C3723s(provider, provider2, provider3, provider4, provider5);
        return sVar;
    }

    public C3718r get() {
        C3718r rVar = new C3718r(this.f9300a, (C3572r0) this.f9301b.get(), (C5821c0) this.f9302c.get(), (C7159g) this.f9303d.get(), (Resources) this.f9304e.get());
        return rVar;
    }
}
