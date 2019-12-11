package com.bamtech.sdk4.internal.configuration;

import com.bamtech.core.networking.Headers;
import com.bamtech.sdk4.internal.service.ServiceTransaction;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import p520io.reactivex.functions.Function;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0004\"\b\b\u0001\u0010\u0003*\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, mo31007d2 = {"<anonymous>", "Lkotlin/Pair;", "T", "U", "Lcom/bamtech/sdk4/internal/configuration/ServiceConfiguration;", "configuration", "Lcom/bamtech/sdk4/internal/configuration/Configuration;", "apply"}, mo31008k = 3, mo31009mv = {1, 1, 15})
/* compiled from: ConfigurationProvider.kt */
final class DefaultConfigurationProvider$getServiceConfigurations$1<T, R> implements Function<T, R> {
    final /* synthetic */ Function1 $block;
    final /* synthetic */ Function1 $block2;
    final /* synthetic */ ServiceTransaction $transaction;
    final /* synthetic */ DefaultConfigurationProvider this$0;

    DefaultConfigurationProvider$getServiceConfigurations$1(DefaultConfigurationProvider defaultConfigurationProvider, Function1 function1, Function1 function12, ServiceTransaction serviceTransaction) {
        this.this$0 = defaultConfigurationProvider;
        this.$block = function1;
        this.$block2 = function12;
        this.$transaction = serviceTransaction;
    }

    public final Pair<T, U> apply(Configuration configuration) {
        configuration.getServices();
        ServiceConfiguration serviceConfiguration = (ServiceConfiguration) this.$block.invoke(configuration.getServices());
        ServiceConfiguration serviceConfiguration2 = (ServiceConfiguration) this.$block2.invoke(configuration.getServices());
        serviceConfiguration.getClient().setHeaders(new Headers(this.this$0.getCommonPlusInternalHeaders(this.$transaction, configuration)));
        serviceConfiguration2.getClient().setHeaders(new Headers(this.this$0.getCommonPlusInternalHeaders(this.$transaction, configuration)));
        return new Pair<>(serviceConfiguration, serviceConfiguration2);
    }
}
