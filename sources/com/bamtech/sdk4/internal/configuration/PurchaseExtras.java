package com.bamtech.sdk4.internal.configuration;

import kotlin.Metadata;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007\b\u0010¢\u0006\u0002\u0010\u0002B\u000f\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/configuration/PurchaseExtras;", "Lcom/bamtech/sdk4/internal/configuration/ServiceExtras;", "()V", "retryPolicy", "Lcom/bamtech/sdk4/internal/configuration/RetryPolicy;", "(Lcom/bamtech/sdk4/internal/configuration/RetryPolicy;)V", "getRetryPolicy", "()Lcom/bamtech/sdk4/internal/configuration/RetryPolicy;", "sdk-configuration"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: PurchaseServiceConfiguration.kt */
public final class PurchaseExtras implements ServiceExtras {
    private final RetryPolicy retryPolicy;

    public PurchaseExtras(RetryPolicy retryPolicy2) {
        this.retryPolicy = retryPolicy2;
    }

    public final RetryPolicy getRetryPolicy() {
        return this.retryPolicy;
    }

    public PurchaseExtras() {
        RetryPolicy retryPolicy2 = new RetryPolicy(1.0d, 1.5d, 10, 0);
        this(retryPolicy2);
    }
}
