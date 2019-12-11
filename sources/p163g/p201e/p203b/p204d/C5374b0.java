package p163g.p201e.p203b.p204d;

import androidx.fragment.app.Fragment;
import com.bamtech.sdk4.account.AccountApi;
import com.bamtechmedia.dominguez.analytics.C2378m;
import com.bamtechmedia.dominguez.analytics.p057o0.C2433b;
import com.bamtechmedia.dominguez.auth.p061o0.p062h.C2750c;
import com.bamtechmedia.dominguez.auth.p061o0.p063i.C2752a;
import com.bamtechmedia.dominguez.auth.p061o0.p063i.C2755d;
import com.bamtechmedia.dominguez.auth.p064p0.C2760a;
import com.bamtechmedia.dominguez.auth.p067s0.C2861e0;
import com.bamtechmedia.dominguez.core.p218n.C5792f;
import com.bamtechmedia.dominguez.core.utils.C5856o0;
import com.google.common.base.Optional;
import javax.inject.Provider;
import p163g.p201e.p203b.p204d.p207x0.C5503a;
import p163g.p201e.p203b.p204d.p207x0.C5513c;
import p163g.p201e.p203b.p204d.p207x0.C5536e;
import p163g.p201e.p203b.p307o.p308p.C7626a;

/* renamed from: g.e.b.d.b0 */
/* compiled from: ChangePasswordTvBindingModule */
abstract class C5374b0 {
    /* renamed from: a */
    static C2378m m18114a() {
        return new C2378m(C2433b.ACCOUNT_SETTINGS_FORGOT_PASSWORD);
    }

    /* renamed from: a */
    static C2755d m18115a(C5792f fVar, C2378m mVar) {
        return new C2861e0(fVar, mVar);
    }

    /* renamed from: a */
    static C5536e m18117a(C5513c cVar, AccountApi accountApi, C2750c cVar2, C5503a aVar, C2752a aVar2, C7626a aVar3, C2755d dVar, Optional<C2760a> optional) {
        C5375c cVar3 = new C5375c(accountApi, cVar2, aVar, aVar2, aVar3, dVar, optional, cVar);
        C5513c cVar4 = cVar;
        return (C5536e) C5856o0.m18893a((Fragment) cVar, C5536e.class, (Provider<T>) cVar3);
    }

    /* renamed from: a */
    static /* synthetic */ C5536e m18116a(AccountApi accountApi, C2750c cVar, C5503a aVar, C2752a aVar2, C7626a aVar3, C2755d dVar, Optional optional, C5513c cVar2) {
        C5536e eVar = new C5536e(accountApi, cVar, aVar, aVar2, aVar3, dVar, (C2760a) optional.mo27107c(), cVar2.mo17280p());
        return eVar;
    }
}
