package com.bamtech.sdk4.subscription;

import java.util.List;
import kotlin.Metadata;
import p520io.reactivex.Completable;
import p520io.reactivex.Single;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003H&J\b\u0010\u0006\u001a\u00020\u0007H&¨\u0006\b"}, mo31007d2 = {"Lcom/bamtech/sdk4/subscription/SubscriptionExtension;", "", "getSubscriptions", "Lio/reactivex/Single;", "", "Lcom/bamtech/sdk4/subscription/Subscription;", "linkSubscriptionsFromDevice", "Lio/reactivex/Completable;", "extension-iap"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: SubscriptionExtension.kt */
public interface SubscriptionExtension {
    Single<List<Subscription>> getSubscriptions();

    Completable linkSubscriptionsFromDevice();
}
