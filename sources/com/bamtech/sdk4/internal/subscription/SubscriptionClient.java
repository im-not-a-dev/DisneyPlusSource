package com.bamtech.sdk4.internal.subscription;

import com.bamtech.sdk4.internal.service.ServiceTransaction;
import com.bamtech.sdk4.subscription.Subscription;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import p520io.reactivex.Completable;
import p520io.reactivex.Single;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J4\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\u0006\u0010\u0006\u001a\u00020\u00072\u0016\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\tj\u0002`\u000bH&J(\u0010\f\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u00072\u0016\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\tj\u0002`\u000bH&¨\u0006\u000e"}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/subscription/SubscriptionClient;", "", "getSubscriptions", "Lio/reactivex/Single;", "", "Lcom/bamtech/sdk4/subscription/Subscription;", "transaction", "Lcom/bamtech/sdk4/internal/service/ServiceTransaction;", "map", "", "", "Lcom/bamtech/sdk4/internal/service/TokenMap;", "linkSubscriptionsFromDevice", "Lio/reactivex/Completable;", "extension-iap"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: SubscriptionClient.kt */
public interface SubscriptionClient {
    Single<List<Subscription>> getSubscriptions(ServiceTransaction serviceTransaction, Map<String, String> map);

    Completable linkSubscriptionsFromDevice(ServiceTransaction serviceTransaction, Map<String, String> map);
}
