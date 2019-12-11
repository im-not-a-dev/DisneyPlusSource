package com.bamtech.sdk4.internal.media.drm;

import com.bamtech.core.networking.Link;
import com.bamtech.sdk4.internal.configuration.Configuration;
import com.bamtech.sdk4.internal.configuration.TelemetryServiceConfiguration;
import kotlin.C12907r;
import kotlin.Metadata;
import kotlin.Pair;
import p520io.reactivex.Single;
import p520io.reactivex.SingleSource;
import p520io.reactivex.functions.Function;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a(\u0012$\u0012\"\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004 \u0005*\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00020\u00020\u00012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00070\u0002H\n¢\u0006\u0002\b\b"}, mo31007d2 = {"<anonymous>", "Lio/reactivex/Single;", "Lkotlin/Pair;", "Lcom/bamtech/core/networking/Link;", "Lcom/bamtech/sdk4/internal/configuration/TelemetryServiceConfiguration;", "kotlin.jvm.PlatformType", "<name for destructuring parameter 0>", "Lcom/bamtech/sdk4/internal/configuration/Configuration;", "apply"}, mo31008k = 3, mo31009mv = {1, 1, 15})
/* compiled from: DefaultWidevineDrmProvider.kt */
final class TestWidevineDrmProvider$getWidevineLicenseLink$2<T, R> implements Function<T, SingleSource<? extends R>> {
    final /* synthetic */ String $authHeader;

    TestWidevineDrmProvider$getWidevineLicenseLink$2(String str) {
        this.$authHeader = str;
    }

    public final Single<Pair<Link, TelemetryServiceConfiguration>> apply(Pair<Link, Configuration> pair) {
        return Single.m38399b(C12907r.m40244a(Link.updateTemplates$default((Link) pair.mo31013a(), C13170i0.m40332a(C12907r.m40244a("{accessToken}", this.$authHeader)), null, 2, null), ((Configuration) pair.mo31014b()).getServices().getTelemetry()));
    }
}
