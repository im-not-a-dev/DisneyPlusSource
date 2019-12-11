package com.bamtech.sdk4.internal.subscription;

import com.bamtech.sdk4.internal.service.ServiceTransaction;
import com.bamtech.sdk4.internal.token.AccessTokenProvider;
import com.bamtech.sdk4.subscription.Subscription;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p520io.reactivex.Completable;
import p520io.reactivex.CompletableSource;
import p520io.reactivex.Single;
import p520io.reactivex.SingleSource;
import p520io.reactivex.functions.Function;
import p520io.reactivex.p525e0.C11934b;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u001c\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\t2\u0006\u0010\f\u001a\u00020\rH\u0016J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\rH\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/subscription/DefaultSubscriptionManager;", "Lcom/bamtech/sdk4/internal/subscription/SubscriptionManager;", "Lcom/bamtech/sdk4/internal/subscription/DeviceSubscriptionManager;", "tokenProvider", "Lcom/bamtech/sdk4/internal/token/AccessTokenProvider;", "client", "Lcom/bamtech/sdk4/internal/subscription/SubscriptionClient;", "(Lcom/bamtech/sdk4/internal/token/AccessTokenProvider;Lcom/bamtech/sdk4/internal/subscription/SubscriptionClient;)V", "getSubscriptions", "Lio/reactivex/Single;", "", "Lcom/bamtech/sdk4/subscription/Subscription;", "transaction", "Lcom/bamtech/sdk4/internal/service/ServiceTransaction;", "linkSubscriptionsFromDevice", "Lio/reactivex/Completable;", "extension-iap"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: SubscriptionManager.kt */
public final class DefaultSubscriptionManager implements SubscriptionManager, DeviceSubscriptionManager {
    /* access modifiers changed from: private */
    public final SubscriptionClient client;
    private final AccessTokenProvider tokenProvider;

    public DefaultSubscriptionManager(AccessTokenProvider accessTokenProvider, SubscriptionClient subscriptionClient) {
        this.tokenProvider = accessTokenProvider;
        this.client = subscriptionClient;
    }

    public Single<List<Subscription>> getSubscriptions(ServiceTransaction serviceTransaction) {
        Single<List<Subscription>> a = this.tokenProvider.getAccessToken(serviceTransaction).mo30220b(C11934b.m38500b()).mo30208a((Function<? super T, ? extends SingleSource<? extends R>>) new DefaultSubscriptionManager$getSubscriptions$1<Object,Object>(this, serviceTransaction));
        Intrinsics.checkReturnedValueIsNotNull((Object) a, "tokenProvider.getAccessT…to it))\n                }");
        return a;
    }

    public Completable linkSubscriptionsFromDevice(ServiceTransaction serviceTransaction) {
        Completable b = this.tokenProvider.getAccessToken(serviceTransaction).mo30220b(C11934b.m38500b()).mo30217b((Function<? super T, ? extends CompletableSource>) new DefaultSubscriptionManager$linkSubscriptionsFromDevice$1<Object,Object>(this, serviceTransaction));
        Intrinsics.checkReturnedValueIsNotNull((Object) b, "tokenProvider.getAccessT…to it))\n                }");
        return b;
    }
}
