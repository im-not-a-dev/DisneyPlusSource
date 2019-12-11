package p163g.p201e.p203b.p204d;

import androidx.fragment.app.Fragment;
import com.bamtech.sdk4.account.AccountApi;
import com.bamtech.sdk4.subscription.SubscriptionApi;
import com.bamtechmedia.dominguez.analytics.C2378m;
import com.bamtechmedia.dominguez.analytics.p057o0.C2433b;
import com.bamtechmedia.dominguez.auth.p061o0.p063i.C2755d;
import com.bamtechmedia.dominguez.auth.p067s0.C2861e0;
import com.bamtechmedia.dominguez.config.C3517b;
import com.bamtechmedia.dominguez.core.C3796d;
import com.bamtechmedia.dominguez.core.p218n.C5792f;
import com.bamtechmedia.dominguez.core.utils.C5856o0;
import javax.inject.Provider;
import p163g.p201e.p203b.p299m.C7547h;
import p163g.p201e.p203b.p408f0.C10611d;

/* renamed from: g.e.b.d.l */
/* compiled from: AccountSettingsTvBindingModule */
abstract class C5406l {
    /* renamed from: a */
    static C5402j m18168a(C5389g gVar, C7547h hVar, C5792f fVar, C10611d dVar, C3517b bVar) {
        C5404k kVar = new C5404k(fVar, dVar, hVar, gVar, bVar);
        return kVar;
    }

    /* renamed from: a */
    static C5419r m18170a(C5393h hVar, AccountApi accountApi, SubscriptionApi subscriptionApi, C3796d dVar) {
        return (C5419r) C5856o0.m18893a((Fragment) hVar, C5419r.class, (Provider<T>) new C5371a<T>(accountApi, subscriptionApi, dVar));
    }

    /* renamed from: a */
    static /* synthetic */ C5419r m18169a(AccountApi accountApi, SubscriptionApi subscriptionApi, C3796d dVar) {
        return new C5419r(accountApi, subscriptionApi, dVar);
    }

    /* renamed from: a */
    static C2378m m18166a() {
        return new C2378m(C2433b.ACCOUNT_SETTINGS_FORGOT_PASSWORD);
    }

    /* renamed from: a */
    static C2755d m18167a(C5792f fVar, C2378m mVar) {
        return new C2861e0(fVar, mVar);
    }
}
