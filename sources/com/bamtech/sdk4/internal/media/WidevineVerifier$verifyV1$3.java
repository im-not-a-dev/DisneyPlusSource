package com.bamtech.sdk4.internal.media;

import com.bamtech.sdk4.internal.configuration.DrmServiceConfiguration;
import com.bamtech.sdk4.internal.configuration.MediaServiceConfiguration;
import kotlin.Metadata;
import kotlin.Pair;
import p520io.reactivex.Single;
import p520io.reactivex.SingleSource;
import p520io.reactivex.functions.Function;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00012\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\n¢\u0006\u0002\b\u0007"}, mo31007d2 = {"<anonymous>", "Lio/reactivex/Single;", "", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "Lcom/bamtech/sdk4/internal/configuration/DrmServiceConfiguration;", "Lcom/bamtech/sdk4/internal/configuration/MediaServiceConfiguration;", "apply"}, mo31008k = 3, mo31009mv = {1, 1, 15})
/* compiled from: WidevineVerifier.kt */
final class WidevineVerifier$verifyV1$3<T, R> implements Function<T, SingleSource<? extends R>> {
    public static final WidevineVerifier$verifyV1$3 INSTANCE = new WidevineVerifier$verifyV1$3();

    WidevineVerifier$verifyV1$3() {
    }

    public final Single<String> apply(Pair<DrmServiceConfiguration, MediaServiceConfiguration> pair) {
        DrmServiceConfiguration drmServiceConfiguration = (DrmServiceConfiguration) pair.mo31013a();
        boolean z = true;
        boolean z2 = !((MediaServiceConfiguration) pair.mo31014b()).getExtras().getSecurityCheckRequirements().getWidevine().getEnabled();
        if (drmServiceConfiguration.getExtras().getWidevineCheckKidBase64() != null) {
            z = false;
        }
        if (z2) {
            return Single.m38395a((Throwable) new Exception("skip.drm.check"));
        }
        if (z) {
            return Single.m38395a((Throwable) new Exception("ignore.drm.check"));
        }
        return Single.m38399b(drmServiceConfiguration.getExtras().getWidevineCheckKidBase64());
    }
}
