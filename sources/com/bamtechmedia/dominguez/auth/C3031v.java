package com.bamtechmedia.dominguez.auth;

import com.bamtechmedia.dominguez.auth.p065q0.C2783b;
import java.util.Set;
import javax.inject.Provider;
import p512h.p515d.C11895c;
import p512h.p515d.C11897e;

/* renamed from: com.bamtechmedia.dominguez.auth.v */
/* compiled from: AuthModule_ProvideDispatchingLogInActionFactory */
public final class C3031v implements C11895c<C2783b> {

    /* renamed from: a */
    private final Provider<Set<C2783b>> f7891a;

    public C3031v(Provider<Set<C2783b>> provider) {
        this.f7891a = provider;
    }

    /* renamed from: a */
    public static C3031v m10839a(Provider<Set<C2783b>> provider) {
        return new C3031v(provider);
    }

    /* renamed from: b */
    public static C2783b m10840b(Provider<Set<C2783b>> provider) {
        C2783b a = C2949t.m10716a(provider);
        C11897e.m38130a(a, "Cannot return null from a non-@Nullable @Provides method");
        return a;
    }

    public C2783b get() {
        return m10840b(this.f7891a);
    }
}
