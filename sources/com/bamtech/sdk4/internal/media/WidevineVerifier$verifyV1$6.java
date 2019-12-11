package com.bamtech.sdk4.internal.media;

import com.bamtech.sdk4.internal.media.WidevineVerifier.WidevineBlacklistStatus;
import com.bamtech.sdk4.service.ServiceException;
import com.bamtech.sdk4.service.ServiceExceptionCase.SecurityLevelInsufficient;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p520io.reactivex.Single;
import p520io.reactivex.SingleSource;
import p520io.reactivex.functions.Function;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a*\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0014\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, mo31007d2 = {"<anonymous>", "Lio/reactivex/SingleSource;", "Lcom/bamtech/sdk4/internal/media/WidevineVerifier$WidevineBlacklistStatus;", "kotlin.jvm.PlatformType", "it", "", "apply"}, mo31008k = 3, mo31009mv = {1, 1, 15})
/* compiled from: WidevineVerifier.kt */
final class WidevineVerifier$verifyV1$6<T, R> implements Function<Throwable, SingleSource<? extends WidevineBlacklistStatus>> {
    public static final WidevineVerifier$verifyV1$6 INSTANCE = new WidevineVerifier$verifyV1$6();

    WidevineVerifier$verifyV1$6() {
    }

    public final SingleSource<? extends WidevineBlacklistStatus> apply(Throwable th) {
        if ((th instanceof ServiceException) && SecurityLevelInsufficient.INSTANCE.isInstance((ServiceException) th)) {
            return Single.m38399b(WidevineBlacklistStatus.Blacklisted);
        }
        if (Intrinsics.areEqual((Object) "skip.drm.check", (Object) th.getMessage())) {
            return Single.m38399b(WidevineBlacklistStatus.Whitelisted);
        }
        return Single.m38399b(WidevineBlacklistStatus.Unknown);
    }
}
