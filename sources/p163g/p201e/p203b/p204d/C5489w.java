package p163g.p201e.p203b.p204d;

import androidx.fragment.app.Fragment;
import com.bamtech.sdk4.account.AccountApi;
import com.bamtechmedia.dominguez.analytics.C2378m;
import com.bamtechmedia.dominguez.analytics.p057o0.C2433b;
import com.bamtechmedia.dominguez.auth.p061o0.p063i.C2752a;
import com.bamtechmedia.dominguez.auth.p061o0.p063i.C2755d;
import com.bamtechmedia.dominguez.auth.p067s0.C2861e0;
import com.bamtechmedia.dominguez.core.p218n.C5792f;
import com.bamtechmedia.dominguez.core.utils.C5856o0;
import javax.inject.Provider;
import p163g.p201e.p203b.p204d.p205v0.C5439a;
import p163g.p201e.p203b.p204d.p205v0.C5449c;
import p163g.p201e.p203b.p204d.p205v0.C5468e;
import p163g.p201e.p203b.p307o.p308p.C7626a;
import p520io.reactivex.C11969r;

/* renamed from: g.e.b.d.w */
/* compiled from: ChangeEmailTvBindingModule */
abstract class C5489w {
    /* renamed from: a */
    static C2378m m18275a() {
        return new C2378m(C2433b.ACCOUNT_SETTINGS_FORGOT_PASSWORD);
    }

    /* renamed from: a */
    static C2755d m18276a(C5792f fVar, C2378m mVar) {
        return new C2861e0(fVar, mVar);
    }

    /* renamed from: a */
    static C5468e m18278a(AccountApi accountApi, C5449c cVar, C5439a aVar, C2752a aVar2, C7626a aVar3, C2755d dVar, C11969r rVar, C11969r rVar2) {
        C5373b bVar = new C5373b(accountApi, aVar, aVar2, aVar3, cVar, dVar, rVar, rVar2);
        C5449c cVar2 = cVar;
        return (C5468e) C5856o0.m18893a((Fragment) cVar, C5468e.class, (Provider<T>) bVar);
    }

    /* renamed from: a */
    static /* synthetic */ C5468e m18277a(AccountApi accountApi, C5439a aVar, C2752a aVar2, C7626a aVar3, C5449c cVar, C2755d dVar, C11969r rVar, C11969r rVar2) {
        C5468e eVar = new C5468e(accountApi, aVar, aVar2, aVar3, cVar.mo17194p(), dVar, rVar, rVar2);
        return eVar;
    }
}
