package com.bamtech.sdk4.internal.media.drm;

import com.bamtech.core.networking.Link;
import com.bamtech.sdk4.internal.configuration.Services;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a,\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003 \u0005*\u0015\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0001¢\u0006\u0002\b\u00040\u0001¢\u0006\u0002\b\u0004H\n¢\u0006\u0002\b\u0006"}, mo31007d2 = {"<anonymous>", "Lkotlin/Function1;", "Lcom/bamtech/sdk4/internal/configuration/Services;", "Lcom/bamtech/core/networking/Link;", "Lkotlin/ExtensionFunctionType;", "kotlin.jvm.PlatformType", "call"}, mo31008k = 3, mo31009mv = {1, 1, 15})
/* compiled from: DefaultWidevineDrmProvider.kt */
final class DefaultWidevineDrmProvider$releaseWidevineOfflineLicense$1<V> implements Callable<T> {
    final /* synthetic */ boolean $permanently;
    final /* synthetic */ DefaultWidevineDrmProvider this$0;

    DefaultWidevineDrmProvider$releaseWidevineOfflineLicense$1(DefaultWidevineDrmProvider defaultWidevineDrmProvider, boolean z) {
        this.this$0 = defaultWidevineDrmProvider;
        this.$permanently = z;
    }

    public final Function1<Services, Link> call() {
        if (this.$permanently) {
            return this.this$0.getReleasePermanently();
        }
        return this.this$0.getReleaseTemporary();
    }
}
