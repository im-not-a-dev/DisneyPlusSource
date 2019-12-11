package com.bamtechmedia.dominguez.auth;

import com.bamtech.sdk4.Session;
import com.bamtechmedia.dominguez.auth.p065q0.C2780a;
import com.bamtechmedia.dominguez.auth.p065q0.C2783b;
import com.bamtechmedia.dominguez.auth.p066r0.C2787a;
import com.bamtechmedia.dominguez.auth.p066r0.C2793c;
import java.util.Set;
import javax.inject.Provider;
import p520io.reactivex.Single;

/* renamed from: com.bamtechmedia.dominguez.auth.t */
/* compiled from: AuthModule */
public abstract class C2949t {
    /* renamed from: a */
    static C2783b m10716a(Provider<Set<C2783b>> provider) {
        return new C2780a(provider);
    }

    /* renamed from: a */
    static C2793c m10717a(Provider<Set<C2793c>> provider, Single<Session> single, C2702b bVar) {
        return new C2787a(provider, single, bVar);
    }
}
