package com.bamtech.sdk4.internal.telemetry;

import com.bamtech.sdk4.internal.networking.ConverterProvider;
import com.bamtech.shadow.dagger.p048a.C2111c;
import com.bamtech.shadow.dagger.p048a.C2113e;
import java.io.File;
import javax.inject.Provider;

public final class TelemetryModule_QosStorageFactory implements C2111c<TelemetryStorage> {
    private final Provider<ConverterProvider> converterProvider;
    private final Provider<File> dustDirProvider;
    private final Provider<ErrorHandler> handlerProvider;
    private final TelemetryModule module;

    public TelemetryModule_QosStorageFactory(TelemetryModule telemetryModule, Provider<File> provider, Provider<ConverterProvider> provider2, Provider<ErrorHandler> provider3) {
        this.module = telemetryModule;
        this.dustDirProvider = provider;
        this.converterProvider = provider2;
        this.handlerProvider = provider3;
    }

    public static TelemetryModule_QosStorageFactory create(TelemetryModule telemetryModule, Provider<File> provider, Provider<ConverterProvider> provider2, Provider<ErrorHandler> provider3) {
        return new TelemetryModule_QosStorageFactory(telemetryModule, provider, provider2, provider3);
    }

    public TelemetryStorage get() {
        TelemetryStorage qosStorage = this.module.qosStorage((File) this.dustDirProvider.get(), (ConverterProvider) this.converterProvider.get(), (ErrorHandler) this.handlerProvider.get());
        C2113e.m8178a(qosStorage, "Cannot return null from a non-@Nullable @Provides method");
        return qosStorage;
    }
}
