package com.bamtech.sdk4.internal.identity.bam;

import com.bamtech.sdk4.internal.service.ServiceTransaction;
import kotlin.Metadata;
import p520io.reactivex.SingleSource;
import p520io.reactivex.functions.Function;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0010\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, mo31007d2 = {"<anonymous>", "Lio/reactivex/Single;", "Lcom/bamtech/sdk4/identity/IdentityToken;", "kotlin.jvm.PlatformType", "it", "Lcom/bamtech/sdk4/internal/configuration/BamIdentityServiceExtras;", "apply"}, mo31008k = 3, mo31009mv = {1, 1, 15})
/* compiled from: CommonIdentityTokenManager.kt */
final class DefaultCommonIdentityTokenManager$getIdentityToken$2<T, R> implements Function<T, SingleSource<? extends R>> {
    final /* synthetic */ ServiceTransaction $transaction;
    final /* synthetic */ DefaultCommonIdentityTokenManager this$0;

    DefaultCommonIdentityTokenManager$getIdentityToken$2(DefaultCommonIdentityTokenManager defaultCommonIdentityTokenManager, ServiceTransaction serviceTransaction) {
        this.this$0 = defaultCommonIdentityTokenManager;
        this.$transaction = serviceTransaction;
    }

    /* JADX WARNING: Removed duplicated region for block: B:7:0x0024  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x003e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p520io.reactivex.Single<com.bamtech.sdk4.identity.IdentityToken> apply(com.bamtech.sdk4.internal.configuration.BamIdentityServiceExtras r8) {
        /*
            r7 = this;
            com.bamtech.sdk4.internal.identity.bam.DefaultCommonIdentityTokenManager r0 = r7.this$0
            com.bamtech.sdk4.internal.core.Storage r0 = r0.storage
            com.bamtech.sdk4.internal.identity.bam.DefaultCommonIdentityTokenManager r1 = r7.this$0
            com.bamtech.core.networking.converters.Converter r1 = r1.flowConverter
            com.bamtech.sdk4.identity.IdentityToken r0 = com.bamtech.sdk4.internal.identity.bam.BamIdentityTokenKt.getIdentity(r0, r1)
            if (r0 == 0) goto L_0x0021
            org.joda.time.DateTime r1 = r0.getExpiration()
            if (r1 == 0) goto L_0x0021
            int r8 = r8.getExpirationBufferSeconds()
            org.joda.time.DateTime r8 = r1.minusSeconds(r8)
            goto L_0x0022
        L_0x0021:
            r8 = 0
        L_0x0022:
            if (r8 != 0) goto L_0x003e
            com.bamtech.sdk4.service.InvalidStateException r8 = new com.bamtech.sdk4.service.InvalidStateException
            com.bamtech.sdk4.internal.service.ServiceTransaction r0 = r7.$transaction
            java.util.UUID r2 = r0.getId()
            com.bamtech.sdk4.identity.bam.IdentityTokenErrors r0 = com.bamtech.sdk4.identity.bam.IdentityTokenErrors.MISSING
            java.util.List r3 = kotlin.p590y.C13183n.m40498a(r0)
            r4 = 0
            r5 = 4
            r6 = 0
            r1 = r8
            r1.<init>(r2, r3, r4, r5, r6)
            io.reactivex.Single r8 = p520io.reactivex.Single.m38395a(r8)
            goto L_0x0062
        L_0x003e:
            boolean r8 = r8.isBeforeNow()
            if (r8 == 0) goto L_0x005e
            com.bamtech.sdk4.service.InvalidStateException r8 = new com.bamtech.sdk4.service.InvalidStateException
            com.bamtech.sdk4.internal.service.ServiceTransaction r0 = r7.$transaction
            java.util.UUID r2 = r0.getId()
            com.bamtech.sdk4.identity.bam.IdentityTokenErrors r0 = com.bamtech.sdk4.identity.bam.IdentityTokenErrors.EXPIRED
            java.util.List r3 = kotlin.p590y.C13183n.m40498a(r0)
            r4 = 0
            r5 = 4
            r6 = 0
            r1 = r8
            r1.<init>(r2, r3, r4, r5, r6)
            io.reactivex.Single r8 = p520io.reactivex.Single.m38395a(r8)
            goto L_0x0062
        L_0x005e:
            io.reactivex.Single r8 = p520io.reactivex.Single.m38399b(r0)
        L_0x0062:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bamtech.sdk4.internal.identity.bam.DefaultCommonIdentityTokenManager$getIdentityToken$2.apply(com.bamtech.sdk4.internal.configuration.BamIdentityServiceExtras):io.reactivex.Single");
    }
}
