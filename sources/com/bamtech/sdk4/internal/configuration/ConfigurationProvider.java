package com.bamtech.sdk4.internal.configuration;

import com.bamtech.core.networking.Link;
import com.bamtech.sdk4.internal.service.ServiceTransaction;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import p520io.reactivex.Single;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\t\u001a\u00020\nH&J;\u0010\u000b\u001a\n\u0012\u0006\b\u0001\u0012\u0002H\f0\u0007\"\b\b\u0000\u0010\f*\u00020\r2\u0006\u0010\t\u001a\u00020\n2\u0017\u0010\u000e\u001a\u0013\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u0002H\f0\u000f¢\u0006\u0002\b\u0011H&J;\u0010\u0012\u001a\n\u0012\u0006\b\u0001\u0012\u0002H\f0\u0007\"\b\b\u0000\u0010\f*\u00020\u00132\u0006\u0010\t\u001a\u00020\n2\u0017\u0010\u000e\u001a\u0013\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u0002H\f0\u000f¢\u0006\u0002\b\u0011H&J2\u0010\u0014\u001a\u0004\u0018\u0001H\f\"\b\b\u0000\u0010\f*\u00020\u00132\u0017\u0010\u000e\u001a\u0013\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u0002H\f0\u000f¢\u0006\u0002\b\u0011H&¢\u0006\u0002\u0010\u0015Jh\u0010\u0016\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\f\u0012\u0004\u0012\u0002H\u00180\u00170\u0007\"\b\b\u0000\u0010\f*\u00020\r\"\b\b\u0001\u0010\u0018*\u00020\r2\u0006\u0010\t\u001a\u00020\n2\u0017\u0010\u000e\u001a\u0013\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u0002H\f0\u000f¢\u0006\u0002\b\u00112\u0017\u0010\u0019\u001a\u0013\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u0002H\u00180\u000f¢\u0006\u0002\b\u0011H&J;\u0010\u001a\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001c0\u00170\u00072\u0006\u0010\t\u001a\u00020\n2\u0017\u0010\u000e\u001a\u0013\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u001b0\u000f¢\u0006\u0002\b\u0011H&R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u001d"}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/configuration/ConfigurationProvider;", "", "bootstrapConfiguration", "Lcom/bamtech/sdk4/internal/configuration/BootstrapConfiguration;", "getBootstrapConfiguration", "()Lcom/bamtech/sdk4/internal/configuration/BootstrapConfiguration;", "getLocationConfiguration", "Lio/reactivex/Single;", "Lcom/bamtech/sdk4/internal/configuration/LocationConfiguration;", "transaction", "Lcom/bamtech/sdk4/internal/service/ServiceTransaction;", "getServiceConfiguration", "T", "Lcom/bamtech/sdk4/internal/configuration/ServiceConfiguration;", "block", "Lkotlin/Function1;", "Lcom/bamtech/sdk4/internal/configuration/Services;", "Lkotlin/ExtensionFunctionType;", "getServiceConfigurationExtras", "Lcom/bamtech/sdk4/internal/configuration/ServiceExtras;", "getServiceConfigurationExtrasBlocking", "(Lkotlin/jvm/functions/Function1;)Lcom/bamtech/sdk4/internal/configuration/ServiceExtras;", "getServiceConfigurations", "Lkotlin/Pair;", "U", "block2", "getServiceLink", "Lcom/bamtech/core/networking/Link;", "Lcom/bamtech/sdk4/internal/configuration/Configuration;", "sdk-configuration"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: ConfigurationProvider.kt */
public interface ConfigurationProvider {
    BootstrapConfiguration getBootstrapConfiguration();

    Single<LocationConfiguration> getLocationConfiguration(ServiceTransaction serviceTransaction);

    <T extends ServiceConfiguration> Single<? extends T> getServiceConfiguration(ServiceTransaction serviceTransaction, Function1<? super Services, ? extends T> function1);

    <T extends ServiceExtras> Single<? extends T> getServiceConfigurationExtras(ServiceTransaction serviceTransaction, Function1<? super Services, ? extends T> function1);

    <T extends ServiceConfiguration, U extends ServiceConfiguration> Single<Pair<T, U>> getServiceConfigurations(ServiceTransaction serviceTransaction, Function1<? super Services, ? extends T> function1, Function1<? super Services, ? extends U> function12);

    Single<Pair<Link, Configuration>> getServiceLink(ServiceTransaction serviceTransaction, Function1<? super Services, Link> function1);
}
