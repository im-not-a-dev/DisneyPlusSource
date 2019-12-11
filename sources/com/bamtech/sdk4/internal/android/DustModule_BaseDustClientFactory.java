package com.bamtech.sdk4.internal.android;

import com.bamtech.sdk4.internal.configuration.BootstrapConfiguration;
import com.bamtech.sdk4.internal.telemetry.dust.DustClientConstants;
import com.bamtech.shadow.dagger.p048a.C2111c;
import com.bamtech.shadow.dagger.p048a.C2113e;
import java.util.Map;
import javax.inject.Provider;

public final class DustModule_BaseDustClientFactory implements C2111c<DustClientConstants> {
    private final Provider<BootstrapConfiguration> bootstrapConfigurationProvider;
    private final Provider<Map<String, String>> correlationIdsProvider;
    private final DustModule module;

    public DustModule_BaseDustClientFactory(DustModule dustModule, Provider<BootstrapConfiguration> provider, Provider<Map<String, String>> provider2) {
        this.module = dustModule;
        this.bootstrapConfigurationProvider = provider;
        this.correlationIdsProvider = provider2;
    }

    public static DustModule_BaseDustClientFactory create(DustModule dustModule, Provider<BootstrapConfiguration> provider, Provider<Map<String, String>> provider2) {
        return new DustModule_BaseDustClientFactory(dustModule, provider, provider2);
    }

    public DustClientConstants get() {
        DustClientConstants baseDustClient = this.module.baseDustClient((BootstrapConfiguration) this.bootstrapConfigurationProvider.get(), (Map) this.correlationIdsProvider.get());
        C2113e.m8178a(baseDustClient, "Cannot return null from a non-@Nullable @Provides method");
        return baseDustClient;
    }
}
