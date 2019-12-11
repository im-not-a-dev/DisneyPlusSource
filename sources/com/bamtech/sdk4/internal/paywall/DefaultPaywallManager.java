package com.bamtech.sdk4.internal.paywall;

import com.bamtech.sdk4.internal.service.ServiceTransaction;
import com.bamtech.sdk4.internal.token.AccessTokenProvider;
import com.bamtech.sdk4.paywall.Paywall;
import kotlin.Metadata;
import kotlin.jvm.internal.C12880j;
import p520io.reactivex.Single;
import p520io.reactivex.SingleSource;
import p520io.reactivex.functions.Function;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u000bH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/paywall/DefaultPaywallManager;", "Lcom/bamtech/sdk4/internal/paywall/PaywallManager;", "paywallClient", "Lcom/bamtech/sdk4/internal/paywall/PaywallClient;", "accessTokenProvider", "Lcom/bamtech/sdk4/internal/token/AccessTokenProvider;", "(Lcom/bamtech/sdk4/internal/paywall/PaywallClient;Lcom/bamtech/sdk4/internal/token/AccessTokenProvider;)V", "getPaywall", "Lio/reactivex/Single;", "Lcom/bamtech/sdk4/paywall/Paywall;", "transaction", "Lcom/bamtech/sdk4/internal/service/ServiceTransaction;", "plugin-paywall"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: PaywallManager.kt */
public final class DefaultPaywallManager implements PaywallManager {
    private final AccessTokenProvider accessTokenProvider;
    /* access modifiers changed from: private */
    public final PaywallClient paywallClient;

    public DefaultPaywallManager(PaywallClient paywallClient2, AccessTokenProvider accessTokenProvider2) {
        this.paywallClient = paywallClient2;
        this.accessTokenProvider = accessTokenProvider2;
    }

    public Single<Paywall> getPaywall(ServiceTransaction serviceTransaction) {
        Single<Paywall> a = this.accessTokenProvider.getAccessToken(serviceTransaction).mo30208a((Function<? super T, ? extends SingleSource<? extends R>>) new DefaultPaywallManager$getPaywall$1<Object,Object>(this, serviceTransaction));
        C12880j.m40222a((Object) a, "accessToken.flatMap {\n  …tion, tokenMap)\n        }");
        return a;
    }
}
