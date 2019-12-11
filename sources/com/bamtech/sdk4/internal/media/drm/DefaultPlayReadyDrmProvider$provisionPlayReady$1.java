package com.bamtech.sdk4.internal.media.drm;

import com.bamtech.core.networking.Link.Builder;
import kotlin.C13145v;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12881k;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, mo31007d2 = {"<anonymous>", "", "Lcom/bamtech/core/networking/Link$Builder;", "invoke"}, mo31008k = 3, mo31009mv = {1, 1, 15})
/* compiled from: DefaultPlayReadyDrmProvider.kt */
final class DefaultPlayReadyDrmProvider$provisionPlayReady$1 extends C12881k implements Function1<Builder, C13145v> {
    final /* synthetic */ String $licenseUrl;

    DefaultPlayReadyDrmProvider$provisionPlayReady$1(String str) {
        this.$licenseUrl = str;
        super(1);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Builder) obj);
        return C13145v.f29587a;
    }

    public final void invoke(Builder builder) {
        builder.mo7434b(this.$licenseUrl);
        builder.mo7438c("POST");
    }
}
