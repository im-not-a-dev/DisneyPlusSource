package p163g.p201e.p203b.p204d;

import com.bamtech.sdk4.account.AccountApi;
import com.bamtech.sdk4.subscription.SubscriptionApi;
import com.bamtechmedia.dominguez.core.C3796d;
import javax.inject.Provider;

/* renamed from: g.e.b.d.a */
/* compiled from: lambda */
public final /* synthetic */ class C5371a implements Provider {

    /* renamed from: a */
    private final /* synthetic */ AccountApi f12868a;

    /* renamed from: b */
    private final /* synthetic */ SubscriptionApi f12869b;

    /* renamed from: c */
    private final /* synthetic */ C3796d f12870c;

    public /* synthetic */ C5371a(AccountApi accountApi, SubscriptionApi subscriptionApi, C3796d dVar) {
        this.f12868a = accountApi;
        this.f12869b = subscriptionApi;
        this.f12870c = dVar;
    }

    public final Object get() {
        return C5406l.m18169a(this.f12868a, this.f12869b, this.f12870c);
    }
}
