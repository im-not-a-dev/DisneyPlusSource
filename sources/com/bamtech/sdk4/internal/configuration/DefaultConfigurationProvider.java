package com.bamtech.sdk4.internal.configuration;

import com.bamtech.core.networking.Link;
import com.bamtech.sdk4.internal.networking.ConverterProvider;
import com.bamtech.sdk4.internal.service.ServiceTransaction;
import java.util.Map;
import kotlin.C12907r;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12880j;
import p520io.reactivex.Single;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\"\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012J\u0016\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J9\u0010\u0016\u001a\b\u0012\u0004\u0012\u0002H\u00170\u0014\"\b\b\u0000\u0010\u0017*\u00020\u00182\u0006\u0010\u000f\u001a\u00020\u00102\u0017\u0010\u0019\u001a\u0013\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u0002H\u00170\u001a¢\u0006\u0002\b\u001cH\u0016J;\u0010\u001d\u001a\n\u0012\u0006\b\u0001\u0012\u0002H\u00170\u0014\"\b\b\u0000\u0010\u0017*\u00020\u001e2\u0006\u0010\u000f\u001a\u00020\u00102\u0017\u0010\u0019\u001a\u0013\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u0002H\u00170\u001a¢\u0006\u0002\b\u001cH\u0016J2\u0010\u001f\u001a\u0004\u0018\u0001H\u0017\"\b\b\u0000\u0010\u0017*\u00020\u001e2\u0017\u0010\u0019\u001a\u0013\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u0002H\u00170\u001a¢\u0006\u0002\b\u001cH\u0016¢\u0006\u0002\u0010 Jh\u0010!\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0017\u0012\u0004\u0012\u0002H#0\"0\u0014\"\b\b\u0000\u0010\u0017*\u00020\u0018\"\b\b\u0001\u0010#*\u00020\u00182\u0006\u0010\u000f\u001a\u00020\u00102\u0017\u0010\u0019\u001a\u0013\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u0002H\u00170\u001a¢\u0006\u0002\b\u001c2\u0017\u0010$\u001a\u0013\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u0002H#0\u001a¢\u0006\u0002\b\u001cH\u0016J;\u0010%\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020\u00120\"0\u00142\u0006\u0010\u000f\u001a\u00020\u00102\u0017\u0010\u0019\u001a\u0013\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020&0\u001a¢\u0006\u0002\b\u001cH\u0016R\u0014\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r0\fX\u0004¢\u0006\u0002\n\u0000¨\u0006'"}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/configuration/DefaultConfigurationProvider;", "Lcom/bamtech/sdk4/internal/configuration/ConfigurationProvider;", "manager", "Lcom/bamtech/sdk4/internal/configuration/ConfigurationManager;", "bootstrapConfiguration", "Lcom/bamtech/sdk4/internal/configuration/BootstrapConfiguration;", "converterProvider", "Lcom/bamtech/sdk4/internal/networking/ConverterProvider;", "(Lcom/bamtech/sdk4/internal/configuration/ConfigurationManager;Lcom/bamtech/sdk4/internal/configuration/BootstrapConfiguration;Lcom/bamtech/sdk4/internal/networking/ConverterProvider;)V", "getBootstrapConfiguration", "()Lcom/bamtech/sdk4/internal/configuration/BootstrapConfiguration;", "tokenMap", "", "", "getCommonPlusInternalHeaders", "transaction", "Lcom/bamtech/sdk4/internal/service/ServiceTransaction;", "configuration", "Lcom/bamtech/sdk4/internal/configuration/Configuration;", "getLocationConfiguration", "Lio/reactivex/Single;", "Lcom/bamtech/sdk4/internal/configuration/LocationConfiguration;", "getServiceConfiguration", "T", "Lcom/bamtech/sdk4/internal/configuration/ServiceConfiguration;", "block", "Lkotlin/Function1;", "Lcom/bamtech/sdk4/internal/configuration/Services;", "Lkotlin/ExtensionFunctionType;", "getServiceConfigurationExtras", "Lcom/bamtech/sdk4/internal/configuration/ServiceExtras;", "getServiceConfigurationExtrasBlocking", "(Lkotlin/jvm/functions/Function1;)Lcom/bamtech/sdk4/internal/configuration/ServiceExtras;", "getServiceConfigurations", "Lkotlin/Pair;", "U", "block2", "getServiceLink", "Lcom/bamtech/core/networking/Link;", "sdk-configuration"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: ConfigurationProvider.kt */
public final class DefaultConfigurationProvider implements ConfigurationProvider {
    private final BootstrapConfiguration bootstrapConfiguration;
    private final ConfigurationManager manager;
    private final Map<String, String> tokenMap = C13173j0.m40356a(C12907r.m40244a("{SDKVersion}", "v4.7.4"), C12907r.m40244a("{SDKPlatform}", getBootstrapConfiguration().getDevice().getSdkPlatform()));

    /* JADX INFO: used method not loaded: kotlin.y.j0.a(kotlin.Pair[]):null, types can be incorrect */
    public DefaultConfigurationProvider(ConfigurationManager configurationManager, BootstrapConfiguration bootstrapConfiguration2, ConverterProvider converterProvider) {
        this.manager = configurationManager;
        this.bootstrapConfiguration = bootstrapConfiguration2;
    }

    public BootstrapConfiguration getBootstrapConfiguration() {
        return this.bootstrapConfiguration;
    }

    public final Map<String, String> getCommonPlusInternalHeaders(ServiceTransaction serviceTransaction, Configuration configuration) {
        return C13173j0.m40354a(ConfigurationProviderKt.getCommonHeaders(configuration, this.tokenMap), C12907r.m40244a("X-BAMSDK-Transaction-ID", serviceTransaction.getId().toString()));
    }

    public Single<LocationConfiguration> getLocationConfiguration(ServiceTransaction serviceTransaction) {
        Single<LocationConfiguration> g = this.manager.getConfiguration(serviceTransaction).mo30233g(DefaultConfigurationProvider$getLocationConfiguration$1.INSTANCE);
        C12880j.m40222a((Object) g, "manager.getConfiguration…tion).map { it.location }");
        return g;
    }

    public <T extends ServiceConfiguration> Single<T> getServiceConfiguration(ServiceTransaction serviceTransaction, Function1<? super Services, ? extends T> function1) {
        Single<T> g = this.manager.getConfiguration(serviceTransaction).mo30233g(new DefaultConfigurationProvider$getServiceConfiguration$1(this, function1, serviceTransaction));
        C12880j.m40222a((Object) g, "manager.getConfiguration…ceConfiguration\n        }");
        return g;
    }

    public <T extends ServiceExtras> Single<? extends T> getServiceConfigurationExtras(ServiceTransaction serviceTransaction, Function1<? super Services, ? extends T> function1) {
        Single<? extends T> g = this.manager.getConfiguration(serviceTransaction).mo30233g(new DefaultConfigurationProvider$getServiceConfigurationExtras$1(function1));
        C12880j.m40222a((Object) g, "manager.getConfiguration…ervices.block()\n        }");
        return g;
    }

    public <T extends ServiceConfiguration, U extends ServiceConfiguration> Single<Pair<T, U>> getServiceConfigurations(ServiceTransaction serviceTransaction, Function1<? super Services, ? extends T> function1, Function1<? super Services, ? extends U> function12) {
        Single<Pair<T, U>> g = this.manager.getConfiguration(serviceTransaction).mo30233g(new DefaultConfigurationProvider$getServiceConfigurations$1(this, function1, function12, serviceTransaction));
        C12880j.m40222a((Object) g, "manager.getConfiguration…)\n            }\n        }");
        return g;
    }

    public Single<Pair<Link, Configuration>> getServiceLink(ServiceTransaction serviceTransaction, Function1<? super Services, Link> function1) {
        Single<Pair<Link, Configuration>> g = this.manager.getConfiguration(serviceTransaction).mo30233g(new DefaultConfigurationProvider$getServiceLink$1(this, function1, serviceTransaction));
        C12880j.m40222a((Object) g, "manager.getConfiguration…uration\n                }");
        return g;
    }
}
