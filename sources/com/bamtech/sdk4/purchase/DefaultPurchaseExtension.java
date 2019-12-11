package com.bamtech.sdk4.purchase;

import com.bamtech.sdk4.internal.purchase.PurchaseManager;
import com.bamtech.sdk4.internal.service.ServiceTransaction;
import com.bamtech.sdk4.internal.telemetry.dust.DustExtensionsKt;
import com.bamtech.sdk4.session.RenewSessionTransformers;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.C12880j;
import p520io.reactivex.Single;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B%\b\u0007\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u0016\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u0016\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, mo31007d2 = {"Lcom/bamtech/sdk4/purchase/DefaultPurchaseExtension;", "Lcom/bamtech/sdk4/purchase/PurchaseExtension;", "transactionProvider", "Ljavax/inject/Provider;", "Lcom/bamtech/sdk4/internal/service/ServiceTransaction;", "manager", "Lcom/bamtech/sdk4/internal/purchase/PurchaseManager;", "renewSessionTransformers", "Lcom/bamtech/sdk4/session/RenewSessionTransformers;", "(Ljavax/inject/Provider;Lcom/bamtech/sdk4/internal/purchase/PurchaseManager;Lcom/bamtech/sdk4/session/RenewSessionTransformers;)V", "getManager", "()Lcom/bamtech/sdk4/internal/purchase/PurchaseManager;", "getRenewSessionTransformers", "()Lcom/bamtech/sdk4/session/RenewSessionTransformers;", "redeem", "Lio/reactivex/Single;", "Lcom/bamtech/sdk4/purchase/AccessStatus;", "claim", "Lcom/bamtech/sdk4/purchase/ReceiptClaim;", "restore", "extension-iap"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: PurchaseExtension.kt */
public final class DefaultPurchaseExtension implements PurchaseExtension {
    private final PurchaseManager manager;
    private final RenewSessionTransformers renewSessionTransformers;
    private final Provider<ServiceTransaction> transactionProvider;

    public DefaultPurchaseExtension(Provider<ServiceTransaction> provider, PurchaseManager purchaseManager, RenewSessionTransformers renewSessionTransformers2) {
        this.transactionProvider = provider;
        this.manager = purchaseManager;
        this.renewSessionTransformers = renewSessionTransformers2;
    }

    public Single<AccessStatus> redeem(ReceiptClaim receiptClaim) {
        ServiceTransaction serviceTransaction = (ServiceTransaction) this.transactionProvider.get();
        PurchaseManager purchaseManager = this.manager;
        C12880j.m40222a((Object) serviceTransaction, "transaction");
        Single<AccessStatus> a = DustExtensionsKt.withDust$default(purchaseManager.redeem(serviceTransaction, receiptClaim), serviceTransaction, PurchaseExtensionKt.getPURCHASE_API_REDEEM(), (Object) null, 4, (Object) null).mo30206a(this.renewSessionTransformers.singleRenewSession(serviceTransaction));
        C12880j.m40222a((Object) a, "manager.redeem(transacti…cessStatus>(transaction))");
        return a;
    }

    public Single<AccessStatus> restore(ReceiptClaim receiptClaim) {
        ServiceTransaction serviceTransaction = (ServiceTransaction) this.transactionProvider.get();
        PurchaseManager purchaseManager = this.manager;
        C12880j.m40222a((Object) serviceTransaction, "transaction");
        Single<AccessStatus> a = DustExtensionsKt.withDust$default(purchaseManager.restore(serviceTransaction, receiptClaim), serviceTransaction, PurchaseExtensionKt.getPURCHASE_API_RESTORE(), (Object) null, 4, (Object) null).mo30206a(this.renewSessionTransformers.singleRenewSession(serviceTransaction));
        C12880j.m40222a((Object) a, "manager.restore(transact…cessStatus>(transaction))");
        return a;
    }
}
