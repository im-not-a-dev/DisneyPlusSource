package p163g.p201e.p203b.p278h;

import com.bamtech.sdk4.Session;
import com.bamtech.sdk4.account.AccountApi;
import com.bamtech.sdk4.identity.bam.BamIdentityApi;
import com.bamtechmedia.dominguez.auth.p061o0.C2740b;
import com.bamtechmedia.dominguez.auth.p065q0.C2783b;
import com.bamtechmedia.dominguez.config.C3524e;
import com.bamtechmedia.dominguez.core.BuildInfo;
import com.bamtechmedia.dominguez.ctvactivation.api.C5892c;
import p163g.p201e.p203b.p278h.p279k.C7246a;
import p163g.p201e.p203b.p278h.p280l.C7252a;
import p163g.p201e.p203b.p278h.p282n.C7260a;
import p163g.p201e.p203b.p299m.C7547h;
import p520io.reactivex.Single;

/* renamed from: g.e.b.h.c */
/* compiled from: FeatureTvCtvActivationModule */
public abstract class C7237c {
    /* renamed from: a */
    static Single<C7252a> m21848a(Single<C3524e> single, BuildInfo buildInfo) {
        return single.mo30233g(new C7235a(buildInfo));
    }

    /* renamed from: a */
    static /* synthetic */ C7252a m21846a(BuildInfo buildInfo, C3524e eVar) throws Exception {
        return new C7252a(eVar, buildInfo);
    }

    /* renamed from: a */
    static C7260a m21847a(Single<Session> single, C5892c cVar, BamIdentityApi bamIdentityApi, AccountApi accountApi, C2783b bVar, C2740b bVar2, C7547h hVar, C7246a aVar) {
        C7260a aVar2 = new C7260a(single, cVar, bamIdentityApi, accountApi, bVar, bVar2, hVar, aVar);
        return aVar2;
    }
}
