package com.bamtechmedia.dominguez.purchase;

import android.content.Context;
import com.bamnet.iap.BamnetIAPPurchase;
import com.bamtech.sdk4.Session;
import javax.inject.Provider;
import p163g.p174d.p175a.p177b.C4812c;
import p512h.p515d.C11895c;
import p512h.p515d.C11897e;
import p520io.reactivex.Single;

/* renamed from: com.bamtechmedia.dominguez.purchase.e */
/* compiled from: FeaturePaywallModule_ProvideReceiptCacheFactory */
public final class C7047e implements C11895c<C4812c> {

    /* renamed from: a */
    private final Provider<Context> f15648a;

    /* renamed from: b */
    private final Provider<Single<Session>> f15649b;

    /* renamed from: c */
    private final Provider<Class<? extends BamnetIAPPurchase>> f15650c;

    public C7047e(Provider<Context> provider, Provider<Single<Session>> provider2, Provider<Class<? extends BamnetIAPPurchase>> provider3) {
        this.f15648a = provider;
        this.f15649b = provider2;
        this.f15650c = provider3;
    }

    /* renamed from: a */
    public static C7047e m21379a(Provider<Context> provider, Provider<Single<Session>> provider2, Provider<Class<? extends BamnetIAPPurchase>> provider3) {
        return new C7047e(provider, provider2, provider3);
    }

    /* renamed from: a */
    public static C4812c m21380a(Context context, Single<Session> single, Class<? extends BamnetIAPPurchase> cls) {
        C4812c a = C7040b.m21369a(context, single, cls);
        C11897e.m38130a(a, "Cannot return null from a non-@Nullable @Provides method");
        return a;
    }

    public C4812c get() {
        return m21380a((Context) this.f15648a.get(), (Single) this.f15649b.get(), (Class) this.f15650c.get());
    }
}
