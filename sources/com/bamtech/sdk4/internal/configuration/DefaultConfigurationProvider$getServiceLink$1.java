package com.bamtech.sdk4.internal.configuration;

import com.bamtech.core.networking.Headers.Builder;
import com.bamtech.core.networking.Link;
import com.bamtech.sdk4.internal.service.ServiceTransaction;
import kotlin.C12907r;
import kotlin.C13145v;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p520io.reactivex.functions.Function;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0005"}, mo31007d2 = {"<anonymous>", "Lkotlin/Pair;", "Lcom/bamtech/core/networking/Link;", "Lcom/bamtech/sdk4/internal/configuration/Configuration;", "configuration", "apply"}, mo31008k = 3, mo31009mv = {1, 1, 15})
/* compiled from: ConfigurationProvider.kt */
final class DefaultConfigurationProvider$getServiceLink$1<T, R> implements Function<T, R> {
    final /* synthetic */ Function1 $block;
    final /* synthetic */ ServiceTransaction $transaction;
    final /* synthetic */ DefaultConfigurationProvider this$0;

    DefaultConfigurationProvider$getServiceLink$1(DefaultConfigurationProvider defaultConfigurationProvider, Function1 function1, ServiceTransaction serviceTransaction) {
        this.this$0 = defaultConfigurationProvider;
        this.$block = function1;
        this.$transaction = serviceTransaction;
    }

    public final Pair<Link, Configuration> apply(final Configuration configuration) {
        return C12907r.m40244a(((Link) this.$block.invoke(configuration.getServices())).toLinkBuilder().mo7431a((Function1<? super Builder, C13145v>) new Function1<Builder, C13145v>(this) {
            final /* synthetic */ DefaultConfigurationProvider$getServiceLink$1 this$0;

            {
                this.this$0 = r1;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Builder) obj);
                return C13145v.f29587a;
            }

            public final void invoke(Builder builder) {
                DefaultConfigurationProvider$getServiceLink$1 defaultConfigurationProvider$getServiceLink$1 = this.this$0;
                DefaultConfigurationProvider defaultConfigurationProvider = defaultConfigurationProvider$getServiceLink$1.this$0;
                ServiceTransaction serviceTransaction = defaultConfigurationProvider$getServiceLink$1.$transaction;
                Configuration configuration = configuration;
                Intrinsics.checkReturnedValueIsNotNull((Object) configuration, "configuration");
                builder.mo7408a(defaultConfigurationProvider.getCommonPlusInternalHeaders(serviceTransaction, configuration));
            }
        }).mo7432a(), configuration);
    }
}
