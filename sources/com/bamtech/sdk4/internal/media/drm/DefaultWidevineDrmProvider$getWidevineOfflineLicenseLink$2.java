package com.bamtech.sdk4.internal.media.drm;

import com.bamtech.core.networking.Link;
import com.bamtech.sdk4.internal.configuration.Configuration;
import com.bamtech.sdk4.internal.configuration.TelemetryServiceConfiguration;
import com.bamtech.sdk4.internal.service.ServiceTransaction;
import kotlin.C12907r;
import kotlin.Metadata;
import kotlin.Pair;
import p520io.reactivex.functions.Function;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0016\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u00012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\u0001H\n¢\u0006\u0002\b\u0007"}, mo31007d2 = {"<anonymous>", "Lkotlin/Pair;", "Lcom/bamtech/core/networking/Link;", "kotlin.jvm.PlatformType", "Lcom/bamtech/sdk4/internal/configuration/TelemetryServiceConfiguration;", "<name for destructuring parameter 0>", "Lcom/bamtech/sdk4/internal/configuration/Configuration;", "apply"}, mo31008k = 3, mo31009mv = {1, 1, 15})
/* compiled from: DefaultWidevineDrmProvider.kt */
final class DefaultWidevineDrmProvider$getWidevineOfflineLicenseLink$2<T, R> implements Function<T, R> {
    final /* synthetic */ ServiceTransaction $transaction;
    final /* synthetic */ DefaultWidevineDrmProvider this$0;

    DefaultWidevineDrmProvider$getWidevineOfflineLicenseLink$2(DefaultWidevineDrmProvider defaultWidevineDrmProvider, ServiceTransaction serviceTransaction) {
        this.this$0 = defaultWidevineDrmProvider;
        this.$transaction = serviceTransaction;
    }

    public final Pair<Link, TelemetryServiceConfiguration> apply(Pair<Link, Configuration> pair) {
        final Link link = (Link) pair.mo31013a();
        return C12907r.m40244a(this.this$0.accessTokenProvider.getAccessToken(this.$transaction).mo30233g(new Function<T, R>() {
            public final Link apply(String str) {
                return Link.updateTemplates$default(link, C13170i0.m40332a(C12907r.m40244a("{accessToken}", str)), null, 2, null);
            }
        }).mo30224c(), ((Configuration) pair.mo31014b()).getServices().getTelemetry());
    }
}
