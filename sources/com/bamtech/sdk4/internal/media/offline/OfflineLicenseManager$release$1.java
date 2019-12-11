package com.bamtech.sdk4.internal.media.offline;

import com.google.android.exoplayer2.drm.FrameworkMediaDrm;
import kotlin.Metadata;
import p520io.reactivex.functions.Function;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0003\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0004"}, mo31007d2 = {"<anonymous>", "", "kotlin.jvm.PlatformType", "it", "apply"}, mo31008k = 3, mo31009mv = {1, 1, 15})
/* compiled from: OfflineLicenseManager.kt */
final class OfflineLicenseManager$release$1<T, R> implements Function<T, R> {
    final /* synthetic */ FrameworkMediaDrm $drmFramework;
    final /* synthetic */ byte[] $license;

    OfflineLicenseManager$release$1(FrameworkMediaDrm frameworkMediaDrm, byte[] bArr) {
        this.$drmFramework = frameworkMediaDrm;
        this.$license = bArr;
    }

    public final byte[] apply(byte[] bArr) {
        return this.$drmFramework.mo22783b(this.$license, bArr);
    }
}
