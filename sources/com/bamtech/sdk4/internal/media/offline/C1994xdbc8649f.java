package com.bamtech.sdk4.internal.media.offline;

import com.bamtech.sdk4.internal.configuration.DrmServiceConfiguration;
import com.bamtech.sdk4.internal.configuration.Services;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12881k;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, mo31007d2 = {"<anonymous>", "Lcom/bamtech/sdk4/internal/configuration/DrmServiceConfiguration;", "Lcom/bamtech/sdk4/internal/configuration/Services;", "invoke"}, mo31008k = 3, mo31009mv = {1, 1, 15})
/* renamed from: com.bamtech.sdk4.internal.media.offline.DefaultDownloadWorkManagerHelper$startPeriodicLicenseRenewal$minimalRenewalFrequency$1 */
/* compiled from: DownloadWorkManagerHelper.kt */
final class C1994xdbc8649f extends C12881k implements Function1<Services, DrmServiceConfiguration> {
    public static final C1994xdbc8649f INSTANCE = new C1994xdbc8649f();

    C1994xdbc8649f() {
        super(1);
    }

    public final DrmServiceConfiguration invoke(Services services) {
        return services.getDrm();
    }
}
