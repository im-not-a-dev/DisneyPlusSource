package com.bamtech.sdk4.internal.media;

import com.bamtech.sdk4.internal.service.ServiceTransaction;
import kotlin.Metadata;
import p520io.reactivex.Single;
import p520io.reactivex.SingleSource;
import p520io.reactivex.functions.Function;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, mo31007d2 = {"<anonymous>", "Lio/reactivex/Single;", "", "keyId", "", "apply"}, mo31008k = 3, mo31009mv = {1, 1, 15})
/* compiled from: WidevineVerifier.kt */
final class WidevineVerifier$verifyV1$4<T, R> implements Function<T, SingleSource<? extends R>> {
    final /* synthetic */ ServiceTransaction $transaction;
    final /* synthetic */ WidevineVerifier this$0;

    WidevineVerifier$verifyV1$4(WidevineVerifier widevineVerifier, ServiceTransaction serviceTransaction) {
        this.this$0 = widevineVerifier;
        this.$transaction = serviceTransaction;
    }

    public final Single<byte[]> apply(String str) {
        return this.this$0.drmProvider.getWidevineLicense(this.$transaction, null, WidevineVerifier.Companion.generateKeyData(str), null, false);
    }
}
