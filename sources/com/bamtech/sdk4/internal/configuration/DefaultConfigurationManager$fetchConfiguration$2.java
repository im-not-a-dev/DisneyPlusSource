package com.bamtech.sdk4.internal.configuration;

import kotlin.Metadata;
import p520io.reactivex.Single;
import p520io.reactivex.SingleSource;
import p520io.reactivex.functions.Function;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a*\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0014\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, mo31007d2 = {"<anonymous>", "Lio/reactivex/SingleSource;", "Lcom/bamtech/sdk4/internal/configuration/Configuration;", "kotlin.jvm.PlatformType", "it", "", "apply"}, mo31008k = 3, mo31009mv = {1, 1, 15})
/* compiled from: ConfigurationManager.kt */
final class DefaultConfigurationManager$fetchConfiguration$2<T, R> implements Function<Throwable, SingleSource<? extends Configuration>> {
    final /* synthetic */ DefaultConfigurationManager this$0;

    DefaultConfigurationManager$fetchConfiguration$2(DefaultConfigurationManager defaultConfigurationManager) {
        this.this$0 = defaultConfigurationManager;
    }

    public final SingleSource<? extends Configuration> apply(Throwable th) {
        if (this.this$0.configuration == null) {
            return Single.m38395a(th);
        }
        this.this$0.setCurrent$sdk_configuration(true);
        return Single.m38399b(this.this$0.configuration);
    }
}
