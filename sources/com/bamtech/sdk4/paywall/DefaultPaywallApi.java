package com.bamtech.sdk4.paywall;

import com.bamtech.sdk4.internal.paywall.PaywallManager;
import com.bamtech.sdk4.internal.service.ServiceTransaction;
import com.bamtech.sdk4.internal.telemetry.dust.DustExtensionsKt;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p520io.reactivex.Single;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u000e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, mo31007d2 = {"Lcom/bamtech/sdk4/paywall/DefaultPaywallApi;", "Lcom/bamtech/sdk4/paywall/PaywallApi;", "transactionProvider", "Ljavax/inject/Provider;", "Lcom/bamtech/sdk4/internal/service/ServiceTransaction;", "paywallManager", "Lcom/bamtech/sdk4/internal/paywall/PaywallManager;", "(Ljavax/inject/Provider;Lcom/bamtech/sdk4/internal/paywall/PaywallManager;)V", "getPaywall", "Lio/reactivex/Single;", "Lcom/bamtech/sdk4/paywall/Paywall;", "plugin-paywall"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: PaywallApi.kt */
public final class DefaultPaywallApi implements PaywallApi {
    private final PaywallManager paywallManager;
    private final Provider<ServiceTransaction> transactionProvider;

    public DefaultPaywallApi(Provider<ServiceTransaction> provider, PaywallManager paywallManager2) {
        this.transactionProvider = provider;
        this.paywallManager = paywallManager2;
    }

    public Single<Paywall> getPaywall() {
        ServiceTransaction serviceTransaction = (ServiceTransaction) this.transactionProvider.get();
        PaywallManager paywallManager2 = this.paywallManager;
        Intrinsics.checkReturnedValueIsNotNull((Object) serviceTransaction, "transaction");
        return DustExtensionsKt.withDust$default(paywallManager2.getPaywall(serviceTransaction), serviceTransaction, PaywallApiKt.getBAM_API_PAYWALL(), (Object) null, 4, (Object) null);
    }
}
