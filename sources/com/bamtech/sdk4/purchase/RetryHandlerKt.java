package com.bamtech.sdk4.purchase;

import com.bamtech.sdk4.internal.service.ServiceTransaction;
import com.bamtech.sdk4.internal.token.AccessContextUpdater;
import com.bamtech.sdk4.internal.token.AccessTokenProvider;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import p520io.reactivex.Single;
import p520io.reactivex.SingleSource;
import p520io.reactivex.functions.Function;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000@\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a|\u0010\u0000\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2J\u0010\u000b\u001aF\u0012\u001f\u0012\u001d\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\u0013\u0012\u00110\u0012¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0013\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u00010\fH\u0002¨\u0006\u0014"}, mo31007d2 = {"executeRetry", "Lio/reactivex/Single;", "Lcom/bamtech/sdk4/purchase/PurchaseActivationResult;", "transaction", "Lcom/bamtech/sdk4/internal/service/ServiceTransaction;", "accessTokenProvider", "Lcom/bamtech/sdk4/internal/token/AccessTokenProvider;", "accessContextUpdater", "Lcom/bamtech/sdk4/internal/token/AccessContextUpdater;", "receiptClaim", "Lcom/bamtech/sdk4/purchase/ReceiptClaim;", "operation", "Lkotlin/Function2;", "", "", "Lkotlin/ParameterName;", "name", "tokenMap", "Lcom/bamtech/sdk4/purchase/ReceiptClaimBody;", "claim", "extension-iap"}, mo31008k = 2, mo31009mv = {1, 1, 15})
/* compiled from: RetryHandler.kt */
public final class RetryHandlerKt {
    /* access modifiers changed from: private */
    public static final Single<? extends PurchaseActivationResult> executeRetry(ServiceTransaction serviceTransaction, AccessTokenProvider accessTokenProvider, AccessContextUpdater accessContextUpdater, ReceiptClaim receiptClaim, Function2<? super Map<String, String>, ? super ReceiptClaimBody, ? extends Single<? extends PurchaseActivationResult>> function2) {
        Single<? extends PurchaseActivationResult> a = accessTokenProvider.getAccessToken(serviceTransaction).mo30208a((Function<? super T, ? extends SingleSource<? extends R>>) new RetryHandlerKt$executeRetry$1<Object,Object>(receiptClaim, function2)).mo30208a((Function<? super T, ? extends SingleSource<? extends R>>) new RetryHandlerKt$executeRetry$2<Object,Object>(accessContextUpdater, serviceTransaction));
        Intrinsics.checkReturnedValueIsNotNull((Object) a, "accessTokenProvider.getA…  .map { response }\n    }");
        return a;
    }
}
