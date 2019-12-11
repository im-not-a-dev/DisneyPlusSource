package com.bamtech.sdk4.subscription;

import com.bamtech.sdk4.internal.service.ServiceTransaction;
import com.bamtech.sdk4.internal.subscription.DeviceSubscriptionManager;
import com.bamtech.sdk4.internal.subscription.SubscriptionManager;
import com.bamtech.sdk4.internal.telemetry.dust.DustExtensionsKt;
import com.bamtech.sdk4.session.RenewSessionTransformers;
import java.util.List;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.C12880j;
import p520io.reactivex.Completable;
import p520io.reactivex.Single;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B-\b\u0007\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\u0014\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\rH\u0016J\b\u0010\u0010\u001a\u00020\u0011H\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, mo31007d2 = {"Lcom/bamtech/sdk4/subscription/DefaultSubscriptionExtension;", "Lcom/bamtech/sdk4/subscription/SubscriptionExtension;", "transactionProvider", "Ljavax/inject/Provider;", "Lcom/bamtech/sdk4/internal/service/ServiceTransaction;", "manager", "Lcom/bamtech/sdk4/internal/subscription/SubscriptionManager;", "deviceSubscriptionManager", "Lcom/bamtech/sdk4/internal/subscription/DeviceSubscriptionManager;", "renewSessionTransformers", "Lcom/bamtech/sdk4/session/RenewSessionTransformers;", "(Ljavax/inject/Provider;Lcom/bamtech/sdk4/internal/subscription/SubscriptionManager;Lcom/bamtech/sdk4/internal/subscription/DeviceSubscriptionManager;Lcom/bamtech/sdk4/session/RenewSessionTransformers;)V", "getSubscriptions", "Lio/reactivex/Single;", "", "Lcom/bamtech/sdk4/subscription/Subscription;", "linkSubscriptionsFromDevice", "Lio/reactivex/Completable;", "extension-iap"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: SubscriptionExtension.kt */
public final class DefaultSubscriptionExtension implements SubscriptionExtension {
    private final DeviceSubscriptionManager deviceSubscriptionManager;
    private final SubscriptionManager manager;
    private final RenewSessionTransformers renewSessionTransformers;
    private final Provider<ServiceTransaction> transactionProvider;

    public DefaultSubscriptionExtension(Provider<ServiceTransaction> provider, SubscriptionManager subscriptionManager, DeviceSubscriptionManager deviceSubscriptionManager2, RenewSessionTransformers renewSessionTransformers2) {
        this.transactionProvider = provider;
        this.manager = subscriptionManager;
        this.deviceSubscriptionManager = deviceSubscriptionManager2;
        this.renewSessionTransformers = renewSessionTransformers2;
    }

    public Single<List<Subscription>> getSubscriptions() {
        ServiceTransaction serviceTransaction = (ServiceTransaction) this.transactionProvider.get();
        SubscriptionManager subscriptionManager = this.manager;
        C12880j.m40222a((Object) serviceTransaction, "transaction");
        Single<List<Subscription>> a = DustExtensionsKt.withDust$default(subscriptionManager.getSubscriptions(serviceTransaction), serviceTransaction, SubscriptionExtensionKt.getSUBSCRIPTION_API_GET_SUBSCRIPTIONS(), (Object) null, 4, (Object) null).mo30206a(this.renewSessionTransformers.singleRenewSession(serviceTransaction));
        C12880j.m40222a((Object) a, "manager.getSubscriptions…enewSession(transaction))");
        return a;
    }

    public Completable linkSubscriptionsFromDevice() {
        ServiceTransaction serviceTransaction = (ServiceTransaction) this.transactionProvider.get();
        DeviceSubscriptionManager deviceSubscriptionManager2 = this.deviceSubscriptionManager;
        C12880j.m40222a((Object) serviceTransaction, "transaction");
        Completable a = DustExtensionsKt.withDust$default(deviceSubscriptionManager2.linkSubscriptionsFromDevice(serviceTransaction), serviceTransaction, SubscriptionExtensionKt.getACCOUNT_API_LINK_SUBSCRIPTIONS(), (Object) null, 4, (Object) null).mo30035a(this.renewSessionTransformers.completableRenewSession(serviceTransaction));
        C12880j.m40222a((Object) a, "deviceSubscriptionManage…enewSession(transaction))");
        return a;
    }
}
