package p163g.p201e.p203b.p204d;

import com.bamtech.sdk4.account.AccountApi;
import com.bamtech.sdk4.subscription.SubscriptionApi;
import com.bamtechmedia.dominguez.core.C3796d;
import p512h.p515d.C11895c;
import p512h.p515d.C11897e;

/* renamed from: g.e.b.d.p */
/* compiled from: AccountSettingsTvBindingModule_AccountSettingsTvModule_ProvideSettingsViewModelFactory */
public final class C5414p implements C11895c<C5419r> {
    /* renamed from: a */
    public static C5419r m18176a(C5393h hVar, AccountApi accountApi, SubscriptionApi subscriptionApi, C3796d dVar) {
        C5419r a = C5406l.m18170a(hVar, accountApi, subscriptionApi, dVar);
        C11897e.m38130a(a, "Cannot return null from a non-@Nullable @Provides method");
        return a;
    }
}
