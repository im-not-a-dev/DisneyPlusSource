package p163g.p201e.p203b.p286j;

import androidx.fragment.app.C0532d;
import com.bamtechmedia.dominguez.analytics.C2348e;
import com.bamtechmedia.dominguez.analytics.p059q0.C2451c;
import javax.inject.Provider;
import p512h.p515d.C11895c;
import p512h.p515d.C11897e;

/* renamed from: g.e.b.j.i */
/* compiled from: DeepLinkingModule_DeepLinkViewModelFactory */
public final class C7298i implements C11895c<C7296g> {

    /* renamed from: a */
    private final Provider<C0532d> f16052a;

    /* renamed from: b */
    private final Provider<C2348e> f16053b;

    /* renamed from: c */
    private final Provider<C2451c> f16054c;

    public C7298i(Provider<C0532d> provider, Provider<C2348e> provider2, Provider<C2451c> provider3) {
        this.f16052a = provider;
        this.f16053b = provider2;
        this.f16054c = provider3;
    }

    /* renamed from: a */
    public static C7298i m21930a(Provider<C0532d> provider, Provider<C2348e> provider2, Provider<C2451c> provider3) {
        return new C7298i(provider, provider2, provider3);
    }

    /* renamed from: a */
    public static C7296g m21929a(C0532d dVar, C2348e eVar, C2451c cVar) {
        C7296g a = C7297h.m21926a(dVar, eVar, cVar);
        C11897e.m38130a(a, "Cannot return null from a non-@Nullable @Provides method");
        return a;
    }

    public C7296g get() {
        return m21929a((C0532d) this.f16052a.get(), (C2348e) this.f16053b.get(), (C2451c) this.f16054c.get());
    }
}
