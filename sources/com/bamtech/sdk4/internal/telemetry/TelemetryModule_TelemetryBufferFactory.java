package com.bamtech.sdk4.internal.telemetry;

import com.bamtech.sdk4.internal.configuration.ConfigurationProvider;
import com.bamtech.sdk4.internal.service.ServiceTransaction;
import com.bamtech.sdk4.internal.token.AccessTokenProvider;
import com.bamtech.shadow.dagger.p048a.C2111c;
import com.bamtech.shadow.dagger.p048a.C2113e;
import javax.inject.Provider;

public final class TelemetryModule_TelemetryBufferFactory implements C2111c<EventBuffer> {
    private final Provider<StreamSampleTelemetryClient> clientProvider;
    private final Provider<ConfigurationProvider> configurationProvider;
    private final TelemetryModule module;
    private final Provider<TelemetryStorage> storageProvider;
    private final Provider<AccessTokenProvider> tokenProvider;
    private final Provider<ServiceTransaction> transactionProvider;

    public TelemetryModule_TelemetryBufferFactory(TelemetryModule telemetryModule, Provider<ServiceTransaction> provider, Provider<AccessTokenProvider> provider2, Provider<ConfigurationProvider> provider3, Provider<StreamSampleTelemetryClient> provider4, Provider<TelemetryStorage> provider5) {
        this.module = telemetryModule;
        this.transactionProvider = provider;
        this.tokenProvider = provider2;
        this.configurationProvider = provider3;
        this.clientProvider = provider4;
        this.storageProvider = provider5;
    }

    public static TelemetryModule_TelemetryBufferFactory create(TelemetryModule telemetryModule, Provider<ServiceTransaction> provider, Provider<AccessTokenProvider> provider2, Provider<ConfigurationProvider> provider3, Provider<StreamSampleTelemetryClient> provider4, Provider<TelemetryStorage> provider5) {
        TelemetryModule_TelemetryBufferFactory telemetryModule_TelemetryBufferFactory = new TelemetryModule_TelemetryBufferFactory(telemetryModule, provider, provider2, provider3, provider4, provider5);
        return telemetryModule_TelemetryBufferFactory;
    }

    public EventBuffer get() {
        EventBuffer telemetryBuffer = this.module.telemetryBuffer(this.transactionProvider, (AccessTokenProvider) this.tokenProvider.get(), (ConfigurationProvider) this.configurationProvider.get(), (StreamSampleTelemetryClient) this.clientProvider.get(), (TelemetryStorage) this.storageProvider.get());
        C2113e.m8178a(telemetryBuffer, "Cannot return null from a non-@Nullable @Provides method");
        return telemetryBuffer;
    }
}
