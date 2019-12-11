package p163g.p201e.p203b.p316t;

import android.content.Context;
import androidx.fragment.app.Fragment;
import com.bamtech.sdk4.account.AccountApi;
import com.bamtechmedia.dominguez.core.BuildInfo;
import com.bamtechmedia.dominguez.core.p218n.C5792f;
import com.bamtechmedia.dominguez.core.utils.C5856o0;
import com.bamtechmedia.dominguez.legal.AccountLegalRouter;
import com.bamtechmedia.dominguez.legal.LegalFragmentFactory;
import com.bamtechmedia.dominguez.legal.api.FragmentLegalRouter;
import com.bamtechmedia.dominguez.legal.api.LegalRouter;
import com.bamtechmedia.dominguez.profiles.C6667g1;
import javax.inject.Provider;
import p163g.p201e.p203b.p204d.C5434u;

/* renamed from: g.e.b.t.g */
/* compiled from: OptionsTvBindingModule */
abstract class C7778g {
    @FragmentLegalRouter
    /* renamed from: a */
    static LegalRouter m22863a(C5792f fVar, LegalFragmentFactory legalFragmentFactory) {
        return new AccountLegalRouter(fVar, legalFragmentFactory);
    }

    /* renamed from: a */
    static C7777f m22864a(Context context, @FragmentLegalRouter LegalRouter legalRouter, C5792f fVar, C7773b bVar) {
        return new C7790q(context, legalRouter, fVar, bVar);
    }

    /* renamed from: a */
    static C7793s m22866a(C7784l lVar, C7777f fVar, C6667g1 g1Var, AccountApi accountApi, C7776e eVar, Boolean bool, BuildInfo buildInfo, C5434u uVar) {
        C7772a aVar = new C7772a(fVar, g1Var, accountApi, eVar, bool, buildInfo, uVar);
        C7784l lVar2 = lVar;
        return (C7793s) C5856o0.m18893a((Fragment) lVar, C7793s.class, (Provider<T>) aVar);
    }

    /* renamed from: a */
    static /* synthetic */ C7793s m22865a(C7777f fVar, C6667g1 g1Var, AccountApi accountApi, C7776e eVar, Boolean bool, BuildInfo buildInfo, C5434u uVar) {
        C7793s sVar = new C7793s(fVar, g1Var, accountApi, eVar, bool.booleanValue(), buildInfo, uVar);
        return sVar;
    }
}
