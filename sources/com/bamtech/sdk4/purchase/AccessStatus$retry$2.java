package com.bamtech.sdk4.purchase;

import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import org.reactivestreams.C14313b;
import p520io.reactivex.Flowable;
import p520io.reactivex.functions.C11947c;
import p520io.reactivex.functions.Function;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a&\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0012\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\u0014\u0010\u0004\u001a\u0010\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00050\u00050\u0001H\n¢\u0006\u0002\b\u0006"}, mo31007d2 = {"<anonymous>", "Lio/reactivex/Flowable;", "", "kotlin.jvm.PlatformType", "retryHandler", "", "apply"}, mo31008k = 3, mo31009mv = {1, 1, 15})
/* compiled from: PurchaseActivationResult.kt */
final class AccessStatus$retry$2<T, R> implements Function<Flowable<Throwable>, C14313b<?>> {
    final /* synthetic */ AccessStatus this$0;

    AccessStatus$retry$2(AccessStatus accessStatus) {
        this.this$0 = accessStatus;
    }

    public final Flowable<Long> apply(Flowable<Throwable> flowable) {
        return flowable.mo30075a((C14313b<? extends U>) Flowable.m38197a(1, this.this$0.policy.getRetryMaxAttempts()), (C11947c<? super T, ? super U, ? extends R>) new C11947c<Throwable, Integer, Integer>(this) {
            final /* synthetic */ AccessStatus$retry$2 this$0;

            {
                this.this$0 = r1;
            }

            public /* bridge */ /* synthetic */ Object apply(Object obj, Object obj2) {
                return apply((Throwable) obj, ((Number) obj2).intValue());
            }

            /* JADX WARNING: Code restructure failed: missing block: B:13:0x003c, code lost:
                if (r0 == false) goto L_0x003f;
             */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Integer apply(java.lang.Throwable r8, int r9) {
                /*
                    r7 = this;
                    boolean r0 = r8 instanceof com.bamtech.sdk4.service.ServiceException
                    r1 = 1
                    r2 = 0
                    if (r0 == 0) goto L_0x003f
                    r0 = r8
                    com.bamtech.sdk4.service.ServiceException r0 = (com.bamtech.sdk4.service.ServiceException) r0
                    java.util.List r0 = r0.getErrors()
                    boolean r3 = r0 instanceof java.util.Collection
                    if (r3 == 0) goto L_0x0019
                    boolean r3 = r0.isEmpty()
                    if (r3 == 0) goto L_0x0019
                L_0x0017:
                    r0 = 0
                    goto L_0x003c
                L_0x0019:
                    java.util.Iterator r0 = r0.iterator()
                L_0x001d:
                    boolean r3 = r0.hasNext()
                    if (r3 == 0) goto L_0x0017
                    java.lang.Object r3 = r0.next()
                    com.bamtech.sdk4.service.ErrorReason r3 = (com.bamtech.sdk4.service.ErrorReason) r3
                    java.lang.String r3 = r3.getCode()
                    com.bamtech.sdk4.purchase.AccessStatus$Companion r4 = com.bamtech.sdk4.purchase.AccessStatus.Companion
                    java.lang.String r4 = r4.getTEMPORARY_ACCESS_EXCEPTION()
                    r5 = 2
                    r6 = 0
                    boolean r3 = kotlin.p588j0.C12833x.m40154a(r3, r4, r2, r5, r6)
                    if (r3 == 0) goto L_0x001d
                    r0 = 1
                L_0x003c:
                    if (r0 == 0) goto L_0x003f
                    goto L_0x0040
                L_0x003f:
                    r1 = 0
                L_0x0040:
                    com.bamtech.sdk4.purchase.AccessStatus$retry$2 r0 = r7.this$0
                    com.bamtech.sdk4.purchase.AccessStatus r0 = r0.this$0
                    com.bamtech.sdk4.internal.configuration.RetryPolicy r0 = r0.policy
                    int r0 = r0.getRetryMaxAttempts()
                    if (r9 >= r0) goto L_0x0056
                    if (r1 == 0) goto L_0x0055
                    java.lang.Integer r8 = java.lang.Integer.valueOf(r9)
                    return r8
                L_0x0055:
                    throw r8
                L_0x0056:
                    com.bamtech.sdk4.service.InvalidStateException$Companion r9 = com.bamtech.sdk4.service.InvalidStateException.Companion
                    com.bamtech.sdk4.purchase.AccessStatus$retry$2 r0 = r7.this$0
                    com.bamtech.sdk4.purchase.AccessStatus r0 = r0.this$0
                    com.bamtech.sdk4.internal.service.ServiceTransaction r0 = r0.getTransaction$extension_iap()
                    java.util.UUID r0 = r0.getId()
                    com.bamtech.sdk4.purchase.AccessStatus$Companion r1 = com.bamtech.sdk4.purchase.AccessStatus.Companion
                    java.lang.String r1 = r1.getACTIVATION_FAILED_PERMANENTLY()
                    com.bamtech.sdk4.purchase.AccessStatus$Companion r2 = com.bamtech.sdk4.purchase.AccessStatus.Companion
                    java.lang.String r2 = r2.getACTIVATION_FAILED_PERMANENTLY_DESCRIPTION()
                    com.bamtech.sdk4.service.InvalidStateException r8 = r9.create(r0, r1, r2, r8)
                    throw r8
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bamtech.sdk4.purchase.AccessStatus$retry$2.C21051.apply(java.lang.Throwable, int):java.lang.Integer");
            }
        }).mo30084b((Function<? super T, ? extends C14313b<? extends R>>) new Function<T, C14313b<? extends R>>(this) {
            final /* synthetic */ AccessStatus$retry$2 this$0;

            {
                this.this$0 = r1;
            }

            public final Flowable<Long> apply(Integer num) {
                return Flowable.m38198a((long) this.this$0.this$0.policy.getDelay(num.intValue()), TimeUnit.SECONDS);
            }
        });
    }
}
