package com.bamtech.sdk4.internal.configuration;

import com.bamtech.sdk4.internal.service.ServiceTransaction;
import kotlin.Metadata;
import p520io.reactivex.functions.Function;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, mo31007d2 = {"<anonymous>", "Lcom/bamtech/sdk4/internal/configuration/Configuration;", "it", "apply"}, mo31008k = 3, mo31009mv = {1, 1, 15})
/* compiled from: ConfigurationManager.kt */
final class DefaultConfigurationManager$fetchConfiguration$1<T, R> implements Function<T, R> {
    final /* synthetic */ ServiceTransaction $transaction;
    final /* synthetic */ DefaultConfigurationManager this$0;

    DefaultConfigurationManager$fetchConfiguration$1(DefaultConfigurationManager defaultConfigurationManager, ServiceTransaction serviceTransaction) {
        this.this$0 = defaultConfigurationManager;
        this.$transaction = serviceTransaction;
    }

    public /* bridge */ /* synthetic */ Object apply(Object obj) {
        Configuration configuration = (Configuration) obj;
        apply(configuration);
        return configuration;
    }

    public final Configuration apply(Configuration configuration) {
        this.this$0.configuration = configuration;
        ConfigurationManagerKt.saveConfiguration(this.this$0.storage, configuration, this.$transaction.getIdentityConverter());
        this.this$0.setCurrent$sdk_configuration(true);
        return configuration;
    }
}
