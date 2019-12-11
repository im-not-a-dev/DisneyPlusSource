package com.bamtech.sdk4.internal.media;

import com.bamtech.sdk4.internal.media.WidevineVerifier.WidevineBlacklistStatus;
import kotlin.Metadata;
import p520io.reactivex.functions.Function;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, mo31007d2 = {"<anonymous>", "Lcom/bamtech/sdk4/internal/media/WidevineVerifier$WidevineBlacklistStatus;", "it", "", "apply"}, mo31008k = 3, mo31009mv = {1, 1, 15})
/* compiled from: WidevineVerifier.kt */
final class WidevineVerifier$verifyV1$5<T, R> implements Function<T, R> {
    public static final WidevineVerifier$verifyV1$5 INSTANCE = new WidevineVerifier$verifyV1$5();

    WidevineVerifier$verifyV1$5() {
    }

    public final WidevineBlacklistStatus apply(byte[] bArr) {
        if (!(bArr.length == 0)) {
            return WidevineBlacklistStatus.Whitelisted;
        }
        return WidevineBlacklistStatus.Blacklisted;
    }
}
