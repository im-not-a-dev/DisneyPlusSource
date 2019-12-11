package com.bamtech.sdk4.internal.configuration;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import p520io.reactivex.functions.Function;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0002H\u0001\"\b\b\u0000\u0010\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, mo31007d2 = {"<anonymous>", "T", "Lcom/bamtech/sdk4/internal/configuration/ServiceExtras;", "configuration", "Lcom/bamtech/sdk4/internal/configuration/Configuration;", "apply", "(Lcom/bamtech/sdk4/internal/configuration/Configuration;)Lcom/bamtech/sdk4/internal/configuration/ServiceExtras;"}, mo31008k = 3, mo31009mv = {1, 1, 15})
/* compiled from: ConfigurationProvider.kt */
final class DefaultConfigurationProvider$getServiceConfigurationExtras$1<T, R> implements Function<T, R> {
    final /* synthetic */ Function1 $block;

    DefaultConfigurationProvider$getServiceConfigurationExtras$1(Function1 function1) {
        this.$block = function1;
    }

    public final T apply(Configuration configuration) {
        return (ServiceExtras) this.$block.invoke(configuration.getServices());
    }
}
