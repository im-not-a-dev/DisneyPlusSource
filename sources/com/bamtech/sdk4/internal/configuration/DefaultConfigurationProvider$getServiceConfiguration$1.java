package com.bamtech.sdk4.internal.configuration;

import com.bamtech.core.networking.Headers;
import com.bamtech.sdk4.internal.service.ServiceTransaction;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import p520io.reactivex.functions.Function;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0002H\u0001\"\b\b\u0000\u0010\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, mo31007d2 = {"<anonymous>", "T", "Lcom/bamtech/sdk4/internal/configuration/ServiceConfiguration;", "configuration", "Lcom/bamtech/sdk4/internal/configuration/Configuration;", "apply", "(Lcom/bamtech/sdk4/internal/configuration/Configuration;)Lcom/bamtech/sdk4/internal/configuration/ServiceConfiguration;"}, mo31008k = 3, mo31009mv = {1, 1, 15})
/* compiled from: ConfigurationProvider.kt */
final class DefaultConfigurationProvider$getServiceConfiguration$1<T, R> implements Function<T, R> {
    final /* synthetic */ Function1 $block;
    final /* synthetic */ ServiceTransaction $transaction;
    final /* synthetic */ DefaultConfigurationProvider this$0;

    DefaultConfigurationProvider$getServiceConfiguration$1(DefaultConfigurationProvider defaultConfigurationProvider, Function1 function1, ServiceTransaction serviceTransaction) {
        this.this$0 = defaultConfigurationProvider;
        this.$block = function1;
        this.$transaction = serviceTransaction;
    }

    public final T apply(Configuration configuration) {
        T t = (ServiceConfiguration) this.$block.invoke(configuration.getServices());
        t.getClient().setHeaders(new Headers(this.this$0.getCommonPlusInternalHeaders(this.$transaction, configuration)));
        return t;
    }
}
