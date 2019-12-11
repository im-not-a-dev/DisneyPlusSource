package com.bamtech.sdk4.internal.media.drm;

import com.bamtech.core.networking.C1679a;
import com.bamtech.core.networking.Link;
import com.bamtech.core.networking.Link.Builder;
import com.bamtech.sdk4.internal.configuration.TelemetryServiceConfiguration;
import kotlin.C12907r;
import kotlin.C13145v;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import p520io.reactivex.functions.Function;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0005"}, mo31007d2 = {"<anonymous>", "Lkotlin/Pair;", "Lcom/bamtech/core/networking/Link;", "Lcom/bamtech/sdk4/internal/configuration/TelemetryServiceConfiguration;", "telemetryConfig", "apply"}, mo31008k = 3, mo31009mv = {1, 1, 15})
/* compiled from: DefaultPlayReadyDrmProvider.kt */
final class DefaultPlayReadyDrmProvider$getLicenseLink$2<T, R> implements Function<T, R> {
    final /* synthetic */ String $url;

    DefaultPlayReadyDrmProvider$getLicenseLink$2(String str) {
        this.$url = str;
    }

    public final Pair<Link, TelemetryServiceConfiguration> apply(TelemetryServiceConfiguration telemetryServiceConfiguration) {
        return C12907r.m40244a(C1679a.m7776a(new Function1<Builder, C13145v>(this) {
            final /* synthetic */ DefaultPlayReadyDrmProvider$getLicenseLink$2 this$0;

            {
                this.this$0 = r1;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Builder) obj);
                return C13145v.f29587a;
            }

            public final void invoke(Builder builder) {
                builder.mo7434b(this.this$0.$url);
                builder.mo7438c("POST");
            }
        }), telemetryServiceConfiguration);
    }
}
