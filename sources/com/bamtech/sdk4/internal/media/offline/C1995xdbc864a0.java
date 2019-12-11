package com.bamtech.sdk4.internal.media.offline;

import com.bamtech.sdk4.internal.configuration.DrmServiceConfiguration;
import kotlin.Metadata;
import p520io.reactivex.functions.Function;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, mo31007d2 = {"<anonymous>", "", "it", "Lcom/bamtech/sdk4/internal/configuration/DrmServiceConfiguration;", "apply"}, mo31008k = 3, mo31009mv = {1, 1, 15})
/* renamed from: com.bamtech.sdk4.internal.media.offline.DefaultDownloadWorkManagerHelper$startPeriodicLicenseRenewal$minimalRenewalFrequency$2 */
/* compiled from: DownloadWorkManagerHelper.kt */
final class C1995xdbc864a0<T, R> implements Function<T, R> {
    public static final C1995xdbc864a0 INSTANCE = new C1995xdbc864a0();

    C1995xdbc864a0() {
    }

    public /* bridge */ /* synthetic */ Object apply(Object obj) {
        return Long.valueOf(apply((DrmServiceConfiguration) obj));
    }

    public final long apply(DrmServiceConfiguration drmServiceConfiguration) {
        return drmServiceConfiguration.getMinimumRenewalFrequency();
    }
}
