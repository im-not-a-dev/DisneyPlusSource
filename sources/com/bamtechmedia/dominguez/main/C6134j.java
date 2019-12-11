package com.bamtechmedia.dominguez.main;

import androidx.fragment.app.C0532d;
import com.bamtech.sdk4.session.SessionInfo;
import com.bamtechmedia.dominguez.auth.p061o0.C2746g;
import com.bamtechmedia.dominguez.auth.p066r0.C2793c;
import com.bamtechmedia.dominguez.collections.caching.C3291a;
import com.bamtechmedia.dominguez.core.utils.C5856o0;
import com.bamtechmedia.dominguez.main.p234w.C6206a;
import com.bamtechmedia.dominguez.main.p235x.C6234e;
import com.bamtechmedia.dominguez.main.startup.C6181d;
import com.bamtechmedia.dominguez.profiles.C6722l1;
import com.bamtechmedia.dominguez.profiles.C6766q1;
import com.bamtechmedia.dominguez.profiles.p263u1.p264d.C6864d;
import javax.inject.Provider;
import p163g.p201e.p203b.p286j.C7300k;
import p163g.p201e.p203b.p286j.C7301l;
import p163g.p201e.p203b.p327y.p328g.C7930a;
import p512h.C11868a;
import p520io.reactivex.C11969r;
import p520io.reactivex.Single;

/* renamed from: com.bamtechmedia.dominguez.main.j */
/* compiled from: MainActivityModule */
public abstract class C6134j {
    /* renamed from: a */
    static C6144q m19551a(C0532d dVar, C6181d dVar2, C6234e eVar, Provider<C6766q1> provider, Provider<C3291a> provider2, C2793c cVar, C6136l lVar, Single<SessionInfo> single, Provider<C6864d> provider3, Provider<C6722l1> provider4, C11969r rVar, C7930a aVar, C2746g gVar, C11868a<C6206a> aVar2, Provider<C7300k> provider5, C7301l lVar2) {
        Class<C6144q> cls = C6144q.class;
        C6126b bVar = r1;
        C6126b bVar2 = new C6126b(dVar2, eVar, provider, provider2, cVar, lVar, single, provider3, provider4, rVar, aVar, gVar, aVar2, provider5, lVar2);
        return (C6144q) C5856o0.m18894a(dVar, cls, (Provider<T>) bVar);
    }

    /* renamed from: a */
    static /* synthetic */ C6144q m19552a(C6181d dVar, C6234e eVar, Provider provider, Provider provider2, C2793c cVar, C6136l lVar, Single single, Provider provider3, Provider provider4, C11969r rVar, C7930a aVar, C2746g gVar, C11868a aVar2, Provider provider5, C7301l lVar2) {
        C6144q qVar = new C6144q(dVar, eVar, provider, provider2, cVar, lVar, single, provider3, provider4, rVar, aVar, gVar, aVar2, provider5, lVar2);
        return qVar;
    }
}
