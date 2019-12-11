package com.bamtech.sdk4.internal.configuration;

import com.bamtech.sdk4.internal.service.ServiceTransaction;
import java.util.concurrent.Callable;
import kotlin.C12898l;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p520io.reactivex.Single;
import p520io.reactivex.SingleSource;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0010\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0004"}, mo31007d2 = {"<anonymous>", "Lio/reactivex/Single;", "Lcom/bamtech/sdk4/internal/configuration/Configuration;", "kotlin.jvm.PlatformType", "call"}, mo31008k = 3, mo31009mv = {1, 1, 15})
/* compiled from: ConfigurationManager.kt */
final class DefaultConfigurationManager$internalGetConfiguration$1<V> implements Callable<SingleSource<? extends T>> {
    final /* synthetic */ ServiceTransaction $transaction;
    final /* synthetic */ DefaultConfigurationManager this$0;

    DefaultConfigurationManager$internalGetConfiguration$1(DefaultConfigurationManager defaultConfigurationManager, ServiceTransaction serviceTransaction) {
        this.this$0 = defaultConfigurationManager;
        this.$transaction = serviceTransaction;
    }

    public final Single<Configuration> call() {
        DefaultConfigurationManager defaultConfigurationManager = this.this$0;
        defaultConfigurationManager.configuration = ConfigurationManagerKt.getConfiguration(defaultConfigurationManager.storage, this.$transaction.getIdentityConverter());
        DefaultConfigurationManager defaultConfigurationManager2 = this.this$0;
        boolean access$isConfigurationValid = defaultConfigurationManager2.isConfigurationValid(defaultConfigurationManager2.configuration);
        if (access$isConfigurationValid) {
            Configuration access$getConfiguration$p = this.this$0.configuration;
            if (access$getConfiguration$p != null) {
                Single<Configuration> b = Single.m38399b(access$getConfiguration$p);
                Intrinsics.checkReturnedValueIsNotNull((Object) b, "Single.just(configuration!!)");
                return b;
            }
            Intrinsics.throwNpe();
            throw null;
        } else if (!access$isConfigurationValid) {
            return this.this$0.fetchConfiguration(this.$transaction);
        } else {
            throw new C12898l();
        }
    }
}
