package com.bamtech.sdk4.internal.purchase;

import com.bamtech.core.networking.Link;
import com.bamtech.core.networking.handlers.ResponseHandler;
import com.bamtech.sdk4.internal.configuration.ConfigurationProvider;
import com.bamtech.sdk4.internal.configuration.PurchaseServiceConfigurationKt;
import com.bamtech.sdk4.internal.configuration.RetryPolicy;
import com.bamtech.sdk4.internal.configuration.Services;
import com.bamtech.sdk4.internal.networking.ConverterProvider;
import com.bamtech.sdk4.internal.service.ServiceTransaction;
import com.bamtech.sdk4.internal.telemetry.dust.Dust$Events;
import com.bamtech.sdk4.purchase.PurchaseActivationResult;
import com.bamtech.sdk4.purchase.ReceiptClaimBody;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12880j;
import p520io.reactivex.Single;
import p520io.reactivex.SingleSource;
import p520io.reactivex.functions.Function;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006JU\u0010\t\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000b0\n2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f0\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0017\u0010\u0014\u001a\u0013\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00170\u0015¢\u0006\u0002\b\u0018H\u0002J\u0016\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\n2\u0006\u0010\f\u001a\u00020\rH\u0016J4\u0010\u001b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000b0\n2\u0006\u0010\f\u001a\u00020\r2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f0\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u001b\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u000b0\u001d2\u0006\u0010\f\u001a\u00020\rH\u0000¢\u0006\u0002\b\u001eJ4\u0010\u001f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000b0\n2\u0006\u0010\f\u001a\u00020\r2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f0\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006 "}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/purchase/DefaultPurchaseClient;", "Lcom/bamtech/sdk4/internal/purchase/PurchaseClient;", "configurationProvider", "Lcom/bamtech/sdk4/internal/configuration/ConfigurationProvider;", "converters", "Lcom/bamtech/sdk4/internal/networking/ConverterProvider;", "(Lcom/bamtech/sdk4/internal/configuration/ConfigurationProvider;Lcom/bamtech/sdk4/internal/networking/ConverterProvider;)V", "getConfigurationProvider", "()Lcom/bamtech/sdk4/internal/configuration/ConfigurationProvider;", "execute", "Lio/reactivex/Single;", "Lcom/bamtech/sdk4/purchase/PurchaseActivationResult;", "transaction", "Lcom/bamtech/sdk4/internal/service/ServiceTransaction;", "dustUrn", "", "tokenMap", "", "payload", "Lcom/bamtech/sdk4/purchase/ReceiptClaimBody;", "link", "Lkotlin/Function1;", "Lcom/bamtech/sdk4/internal/configuration/Services;", "Lcom/bamtech/core/networking/Link;", "Lkotlin/ExtensionFunctionType;", "getRetryPolicy", "Lcom/bamtech/sdk4/internal/configuration/RetryPolicy;", "redeem", "responseHandler", "Lcom/bamtech/core/networking/handlers/ResponseHandler;", "responseHandler$extension_iap", "restore", "extension-iap"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: PurchaseClient.kt */
public final class DefaultPurchaseClient implements PurchaseClient {
    private final ConfigurationProvider configurationProvider;
    /* access modifiers changed from: private */
    public final ConverterProvider converters;

    public DefaultPurchaseClient(ConfigurationProvider configurationProvider2, ConverterProvider converterProvider) {
        this.configurationProvider = configurationProvider2;
        this.converters = converterProvider;
    }

    private final Single<? extends PurchaseActivationResult> execute(ServiceTransaction serviceTransaction, String str, Map<String, String> map, ReceiptClaimBody receiptClaimBody, Function1<? super Services, Link> function1) {
        Single serviceLink = this.configurationProvider.getServiceLink(serviceTransaction, function1);
        DefaultPurchaseClient$execute$1 defaultPurchaseClient$execute$1 = new DefaultPurchaseClient$execute$1(this, map, serviceTransaction, receiptClaimBody, str);
        Single<? extends PurchaseActivationResult> a = serviceLink.mo30208a((Function<? super T, ? extends SingleSource<? extends R>>) defaultPurchaseClient$execute$1);
        C12880j.m40222a((Object) a, "configurationProvider.ge…ustUrn)\n                }");
        return a;
    }

    public Single<RetryPolicy> getRetryPolicy(ServiceTransaction serviceTransaction) {
        Single<RetryPolicy> g = this.configurationProvider.getServiceConfigurationExtras(serviceTransaction, DefaultPurchaseClient$getRetryPolicy$1.INSTANCE).mo30233g(DefaultPurchaseClient$getRetryPolicy$2.INSTANCE);
        C12880j.m40222a((Object) g, "configurationProvider.ge…  .map { it.retryPolicy }");
        return g;
    }

    public Single<? extends PurchaseActivationResult> redeem(ServiceTransaction serviceTransaction, Map<String, String> map, ReceiptClaimBody receiptClaimBody) {
        return execute(serviceTransaction, PurchaseServiceConfigurationKt.getPURCHASE_REDEEM(Dust$Events.INSTANCE), map, receiptClaimBody, DefaultPurchaseClient$redeem$1.INSTANCE);
    }

    public final ResponseHandler<PurchaseActivationResult> responseHandler$extension_iap(ServiceTransaction serviceTransaction) {
        return new DefaultPurchaseClient$responseHandler$1(this, serviceTransaction);
    }

    public Single<? extends PurchaseActivationResult> restore(ServiceTransaction serviceTransaction, Map<String, String> map, ReceiptClaimBody receiptClaimBody) {
        return execute(serviceTransaction, PurchaseServiceConfigurationKt.getPURCHASE_RESTORE(Dust$Events.INSTANCE), map, receiptClaimBody, DefaultPurchaseClient$restore$1.INSTANCE);
    }
}
