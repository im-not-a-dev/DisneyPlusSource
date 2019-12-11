package com.bamtech.sdk4.internal.configuration;

import com.bamtech.core.networking.Link;
import kotlin.Metadata;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007\b\u0010¢\u0006\u0002\u0010\u0002B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007R\u0014\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\f\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0010\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u000fR\u0017\u0010\u0012\u001a\u00020\u00138F¢\u0006\f\u0012\u0004\b\u0014\u0010\u0002\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0017\u001a\u00020\u00188F¢\u0006\f\u0012\u0004\b\u0019\u0010\u0002\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u001c\u001a\u00020\u00188F¢\u0006\f\u0012\u0004\b\u001d\u0010\u0002\u001a\u0004\b\u001e\u0010\u001b¨\u0006\u001f"}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/configuration/PurchaseServiceConfiguration;", "Lcom/bamtech/sdk4/internal/configuration/ServiceConfiguration;", "()V", "client", "Lcom/bamtech/sdk4/internal/configuration/ServiceClientDefinition;", "extras", "Lcom/bamtech/sdk4/internal/configuration/PurchaseExtras;", "(Lcom/bamtech/sdk4/internal/configuration/ServiceClientDefinition;Lcom/bamtech/sdk4/internal/configuration/PurchaseExtras;)V", "getClient", "()Lcom/bamtech/sdk4/internal/configuration/ServiceClientDefinition;", "getExtras", "()Lcom/bamtech/sdk4/internal/configuration/PurchaseExtras;", "redeemPurchaseLink", "Lcom/bamtech/core/networking/Link;", "getRedeemPurchaseLink", "()Lcom/bamtech/core/networking/Link;", "restorePurchaseLink", "getRestorePurchaseLink", "retryBasePeriod", "", "retryBasePeriod$annotations", "getRetryBasePeriod", "()J", "retryMaxAttempts", "", "retryMaxAttempts$annotations", "getRetryMaxAttempts", "()I", "retryMultiplier", "retryMultiplier$annotations", "getRetryMultiplier", "sdk-configuration"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: PurchaseServiceConfiguration.kt */
public final class PurchaseServiceConfiguration implements ServiceConfiguration {
    private final ServiceClientDefinition client;
    private final PurchaseExtras extras;

    public PurchaseServiceConfiguration(ServiceClientDefinition serviceClientDefinition, PurchaseExtras purchaseExtras) {
        this.client = serviceClientDefinition;
        this.extras = purchaseExtras;
    }

    public ServiceClientDefinition getClient() {
        return this.client;
    }

    public final Link getRedeemPurchaseLink() {
        return getClient().getLink("redeemPurchases");
    }

    public final Link getRestorePurchaseLink() {
        return getClient().getLink("restorePurchases");
    }

    public PurchaseServiceConfiguration() {
        this(new ServiceClientDefinition(), new PurchaseExtras());
    }

    public PurchaseExtras getExtras() {
        return this.extras;
    }
}
