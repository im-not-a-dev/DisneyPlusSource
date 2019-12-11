package com.bamtech.sdk4.internal.configuration;

import com.bamtech.sdk4.internal.core.Storage;
import com.bamtech.sdk4.internal.service.ServiceTransaction;
import com.bamtech.sdk4.internal.telemetry.dust.DustExtensionsKt;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p520io.reactivex.Single;
import p520io.reactivex.SingleSource;
import p520io.reactivex.functions.C11945a;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\f0\u00142\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J\u0016\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\f0\u00142\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\f2\u0006\u0010\u001a\u001a\u00020\u001bH\u0016J\u0016\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\f0\u00142\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J\u0012\u0010\u001d\u001a\u00020\u000e2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\r\u001a\u00020\u000eX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u0014X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000¨\u0006\u001e"}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/configuration/DefaultConfigurationManager;", "Lcom/bamtech/sdk4/internal/configuration/ConfigurationManager;", "bootstrapConfiguration", "Lcom/bamtech/sdk4/internal/configuration/BootstrapConfiguration;", "configurationClient", "Lcom/bamtech/sdk4/internal/configuration/ConfigurationClient;", "embeddedConfiguration", "Lcom/bamtech/sdk4/internal/configuration/EmbeddedConfiguration;", "storage", "Lcom/bamtech/sdk4/internal/core/Storage;", "(Lcom/bamtech/sdk4/internal/configuration/BootstrapConfiguration;Lcom/bamtech/sdk4/internal/configuration/ConfigurationClient;Lcom/bamtech/sdk4/internal/configuration/EmbeddedConfiguration;Lcom/bamtech/sdk4/internal/core/Storage;)V", "configuration", "Lcom/bamtech/sdk4/internal/configuration/Configuration;", "isCurrent", "", "isCurrent$sdk_configuration", "()Z", "setCurrent$sdk_configuration", "(Z)V", "isFetching", "Lio/reactivex/Single;", "fetchConfiguration", "transaction", "Lcom/bamtech/sdk4/internal/service/ServiceTransaction;", "getConfiguration", "getLocalConfiguration", "converter", "Lcom/bamtech/core/networking/converters/Converter;", "internalGetConfiguration", "isConfigurationValid", "sdk-configuration"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: ConfigurationManager.kt */
public final class DefaultConfigurationManager implements ConfigurationManager {
    private final BootstrapConfiguration bootstrapConfiguration;
    /* access modifiers changed from: private */
    public Configuration configuration;
    private final ConfigurationClient configurationClient;
    private final EmbeddedConfiguration embeddedConfiguration;
    private boolean isCurrent;
    /* access modifiers changed from: private */
    public Single<Configuration> isFetching;
    /* access modifiers changed from: private */
    public final Storage storage;

    public DefaultConfigurationManager(BootstrapConfiguration bootstrapConfiguration2, ConfigurationClient configurationClient2, EmbeddedConfiguration embeddedConfiguration2, Storage storage2) {
        this.bootstrapConfiguration = bootstrapConfiguration2;
        this.configurationClient = configurationClient2;
        this.embeddedConfiguration = embeddedConfiguration2;
        this.storage = storage2;
    }

    /* access modifiers changed from: private */
    public final Single<Configuration> fetchConfiguration(ServiceTransaction serviceTransaction) {
        Single g = this.configurationClient.getConfiguration(serviceTransaction, this.embeddedConfiguration.getBootstrapLink(this.bootstrapConfiguration)).mo30233g(new DefaultConfigurationManager$fetchConfiguration$1(this, serviceTransaction));
        Intrinsics.checkReturnedValueIsNotNull((Object) g, "configurationClient.getC…     it\n                }");
        Single<Configuration> h = DustExtensionsKt.withDust$default(g, serviceTransaction, ConfigurationManagerKt.getCONFIGURATION_FETCH(), (Object) null, 4, (Object) null).mo30235h(new DefaultConfigurationManager$fetchConfiguration$2(this));
        Intrinsics.checkReturnedValueIsNotNull((Object) h, "configurationClient.getC…on>(it)\n                }");
        return h;
    }

    private final Single<Configuration> internalGetConfiguration(ServiceTransaction serviceTransaction) {
        Single<Configuration> d = Single.m38396a((Callable<? extends SingleSource<? extends T>>) new DefaultConfigurationManager$internalGetConfiguration$1<Object>(this, serviceTransaction)).mo30219b((C11945a) new DefaultConfigurationManager$internalGetConfiguration$2(this)).mo30226d();
        Intrinsics.checkReturnedValueIsNotNull((Object) d, "Single.defer {\n         …\n                .cache()");
        return d;
    }

    /* access modifiers changed from: private */
    public final boolean isConfigurationValid(Configuration configuration2) {
        return this.isCurrent && configuration2 != null;
    }

    public Single<Configuration> getConfiguration(ServiceTransaction serviceTransaction) {
        Single<Configuration> single = this.isFetching;
        if (single != null) {
            return single;
        }
        Single<Configuration> internalGetConfiguration = internalGetConfiguration(serviceTransaction);
        this.isFetching = internalGetConfiguration;
        return internalGetConfiguration;
    }

    public final void setCurrent$sdk_configuration(boolean z) {
        this.isCurrent = z;
    }
}
