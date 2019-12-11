package com.bamtechmedia.dominguez.auth;

import com.bamtech.sdk4.Session;
import com.bamtechmedia.dominguez.auth.p066r0.C2793c;
import java.util.Set;
import javax.inject.Provider;
import p512h.p515d.C11895c;
import p512h.p515d.C11897e;
import p520io.reactivex.Single;

/* renamed from: com.bamtechmedia.dominguez.auth.u */
/* compiled from: AuthModule_ProvideDispatchingFactory */
public final class C2990u implements C11895c<C2793c> {
    /* renamed from: a */
    public static C2793c m10781a(Provider<Set<C2793c>> provider, Single<Session> single, C2702b bVar) {
        C2793c a = C2949t.m10717a(provider, single, bVar);
        C11897e.m38130a(a, "Cannot return null from a non-@Nullable @Provides method");
        return a;
    }
}
