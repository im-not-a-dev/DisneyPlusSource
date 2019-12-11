package com.bamtech.sdk4.purchase;

import com.bamtech.sdk4.purchase.ActivationFailedException.Companion;
import com.bamtech.sdk4.purchase.PurchaseActivationResult.PurchaseFailureActivationResult;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import p520io.reactivex.Single;
import p520io.reactivex.SingleSource;
import p520io.reactivex.functions.Function;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0010\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0004"}, mo31007d2 = {"<anonymous>", "Lio/reactivex/Single;", "Lcom/bamtech/sdk4/purchase/PurchaseActivationResult;", "kotlin.jvm.PlatformType", "call"}, mo31008k = 3, mo31009mv = {1, 1, 15})
/* compiled from: PurchaseActivationResult.kt */
final class AccessStatus$retry$1<V> implements Callable<SingleSource<? extends T>> {
    final /* synthetic */ AccessStatus this$0;

    AccessStatus$retry$1(AccessStatus accessStatus) {
        this.this$0 = accessStatus;
    }

    public final Single<PurchaseActivationResult> call() {
        return this.this$0.handler.run().mo30233g(new Function<T, R>(this) {
            final /* synthetic */ AccessStatus$retry$1 this$0;

            {
                this.this$0 = r1;
            }

            public /* bridge */ /* synthetic */ Object apply(Object obj) {
                PurchaseActivationResult purchaseActivationResult = (PurchaseActivationResult) obj;
                apply(purchaseActivationResult);
                return purchaseActivationResult;
            }

            public final PurchaseActivationResult apply(PurchaseActivationResult purchaseActivationResult) {
                if (!(purchaseActivationResult instanceof PurchaseFailureActivationResult)) {
                    return purchaseActivationResult;
                }
                if (!((PurchaseFailureActivationResult) purchaseActivationResult).getTemporaryAccessGranted()) {
                    throw Companion.create$default(ActivationFailedException.Companion, this.this$0.this$0.getTransaction$extension_iap().getId(), AccessStatus.Companion.getACTIVATION_FAILED(), AccessStatus.Companion.getACTIVATION_FAILED_DESCRIPTION(), null, 8, null);
                }
                throw TemporaryAccessException.Companion.create$default(TemporaryAccessException.Companion, this.this$0.this$0.getTransaction$extension_iap().getId(), AccessStatus.Companion.getTEMPORARY_ACCESS_EXCEPTION(), AccessStatus.Companion.getTEMPORARY_ACCESS_DESCRIPTION(), null, 8, null);
            }
        });
    }
}
