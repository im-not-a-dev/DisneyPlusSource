package com.bamtech.sdk4.subscription;

import java.util.List;
import kotlin.Metadata;
import p520io.reactivex.Completable;
import p520io.reactivex.Single;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0014\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006H\u0016J\b\u0010\t\u001a\u00020\nH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, mo31007d2 = {"Lcom/bamtech/sdk4/subscription/DefaultSubscriptionApi;", "Lcom/bamtech/sdk4/subscription/SubscriptionApi;", "extension", "Lcom/bamtech/sdk4/subscription/SubscriptionExtension;", "(Lcom/bamtech/sdk4/subscription/SubscriptionExtension;)V", "getSubscriptions", "Lio/reactivex/Single;", "", "Lcom/bamtech/sdk4/subscription/Subscription;", "linkSubscriptionsFromDeviceToAccount", "Lio/reactivex/Completable;", "plugin-iap-subscription"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: SubscriptionApi.kt */
public final class DefaultSubscriptionApi implements SubscriptionApi {
    private final SubscriptionExtension extension;

    public DefaultSubscriptionApi(SubscriptionExtension subscriptionExtension) {
        this.extension = subscriptionExtension;
    }

    public Single<List<Subscription>> getSubscriptions() {
        return this.extension.getSubscriptions();
    }

    public Completable linkSubscriptionsFromDeviceToAccount() {
        return this.extension.linkSubscriptionsFromDevice();
    }
}
