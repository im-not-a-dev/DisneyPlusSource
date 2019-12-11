package com.bamtech.sdk4.internal.telemetry;

import com.bamtech.sdk4.internal.configuration.ConfigurationProvider;
import com.bamtech.sdk4.internal.networking.ConverterProvider;
import com.bamtech.shadow.dagger.p048a.C2111c;
import javax.inject.Provider;

public final class DefaultTelemetryClient_Factory implements C2111c<DefaultTelemetryClient> {
    private final Provider<ConfigurationProvider> configurationProvider;
    private final Provider<ConverterProvider> convertersProvider;

    public DefaultTelemetryClient_Factory(Provider<ConfigurationProvider> provider, Provider<ConverterProvider> provider2) {
        this.configurationProvider = provider;
        this.convertersProvider = provider2;
    }

    public static DefaultTelemetryClient_Factory create(Provider<ConfigurationProvider> provider, Provider<ConverterProvider> provider2) {
        return new DefaultTelemetryClient_Factory(provider, provider2);
    }

    public DefaultTelemetryClient get() {
        return new DefaultTelemetryClient((ConfigurationProvider) this.configurationProvider.get(), (ConverterProvider) this.convertersProvider.get());
    }
}
