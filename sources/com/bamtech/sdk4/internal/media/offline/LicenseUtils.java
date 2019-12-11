package com.bamtech.sdk4.internal.media.offline;

import kotlin.Metadata;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/media/offline/LicenseUtils;", "", "()V", "getRenewalInterval", "Lcom/bamtech/sdk4/internal/media/offline/RenewalInterval;", "renewInterval", "", "plugin-offline-media_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: LicenseUtils.kt */
public final class LicenseUtils {
    public static final LicenseUtils INSTANCE = new LicenseUtils();

    private LicenseUtils() {
    }

    public final RenewalInterval getRenewalInterval(long j) {
        long j2 = (long) (((float) j) * 0.2f);
        return new RenewalInterval(j + j2, j2);
    }
}
