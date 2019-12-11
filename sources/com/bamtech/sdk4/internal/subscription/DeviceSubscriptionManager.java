package com.bamtech.sdk4.internal.subscription;

import com.bamtech.sdk4.internal.service.ServiceTransaction;
import kotlin.Metadata;
import p520io.reactivex.Completable;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/subscription/DeviceSubscriptionManager;", "", "linkSubscriptionsFromDevice", "Lio/reactivex/Completable;", "transaction", "Lcom/bamtech/sdk4/internal/service/ServiceTransaction;", "extension-iap"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: SubscriptionManager.kt */
public interface DeviceSubscriptionManager {
    Completable linkSubscriptionsFromDevice(ServiceTransaction serviceTransaction);
}
