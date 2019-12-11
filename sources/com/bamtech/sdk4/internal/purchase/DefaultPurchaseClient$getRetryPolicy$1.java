package com.bamtech.sdk4.internal.purchase;

import com.bamtech.sdk4.internal.configuration.PurchaseExtras;
import com.bamtech.sdk4.internal.configuration.Services;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12881k;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, mo31007d2 = {"<anonymous>", "Lcom/bamtech/sdk4/internal/configuration/PurchaseExtras;", "Lcom/bamtech/sdk4/internal/configuration/Services;", "invoke"}, mo31008k = 3, mo31009mv = {1, 1, 15})
/* compiled from: PurchaseClient.kt */
final class DefaultPurchaseClient$getRetryPolicy$1 extends C12881k implements Function1<Services, PurchaseExtras> {
    public static final DefaultPurchaseClient$getRetryPolicy$1 INSTANCE = new DefaultPurchaseClient$getRetryPolicy$1();

    DefaultPurchaseClient$getRetryPolicy$1() {
        super(1);
    }

    public final PurchaseExtras invoke(Services services) {
        return services.getPurchase().getExtras();
    }
}
