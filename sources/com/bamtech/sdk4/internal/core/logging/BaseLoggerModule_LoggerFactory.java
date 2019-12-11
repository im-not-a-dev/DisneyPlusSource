package com.bamtech.sdk4.internal.core.logging;

import com.bamtech.core.logging.DefaultLogger;
import com.bamtech.core.logging.LogSink.Collection;
import com.bamtech.sdk4.internal.configuration.BootstrapConfiguration;
import com.bamtech.shadow.dagger.p048a.C2111c;
import com.bamtech.shadow.dagger.p048a.C2113e;
import com.google.common.base.Optional;
import javax.inject.Provider;

public final class BaseLoggerModule_LoggerFactory implements C2111c<DefaultLogger> {
    private final Provider<BootstrapConfiguration> bootstrapConfigurationProvider;
    private final BaseLoggerModule module;
    private final Provider<Optional<Collection>> sinksProvider;

    public BaseLoggerModule_LoggerFactory(BaseLoggerModule baseLoggerModule, Provider<BootstrapConfiguration> provider, Provider<Optional<Collection>> provider2) {
        this.module = baseLoggerModule;
        this.bootstrapConfigurationProvider = provider;
        this.sinksProvider = provider2;
    }

    public static BaseLoggerModule_LoggerFactory create(BaseLoggerModule baseLoggerModule, Provider<BootstrapConfiguration> provider, Provider<Optional<Collection>> provider2) {
        return new BaseLoggerModule_LoggerFactory(baseLoggerModule, provider, provider2);
    }

    public DefaultLogger get() {
        DefaultLogger logger = this.module.logger((BootstrapConfiguration) this.bootstrapConfigurationProvider.get(), (Optional) this.sinksProvider.get());
        C2113e.m8178a(logger, "Cannot return null from a non-@Nullable @Provides method");
        return logger;
    }
}
