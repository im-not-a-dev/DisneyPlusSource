package com.bamtech.sdk4.internal.android;

import com.bamtech.sdk4.internal.configuration.BootstrapConfiguration;
import com.bamtech.sdk4.internal.configuration.EmbeddedConfiguration;
import com.bamtech.shadow.dagger.p048a.C2111c;
import com.bamtech.shadow.dagger.p048a.C2113e;
import javax.inject.Provider;

public final class AndroidConfigurationModule_EmbeddedConfigurationFactory implements C2111c<EmbeddedConfiguration> {
    private final Provider<BootstrapConfiguration> bootstrapConfigurationProvider;
    private final AndroidConfigurationModule module;

    public AndroidConfigurationModule_EmbeddedConfigurationFactory(AndroidConfigurationModule androidConfigurationModule, Provider<BootstrapConfiguration> provider) {
        this.module = androidConfigurationModule;
        this.bootstrapConfigurationProvider = provider;
    }

    public static AndroidConfigurationModule_EmbeddedConfigurationFactory create(AndroidConfigurationModule androidConfigurationModule, Provider<BootstrapConfiguration> provider) {
        return new AndroidConfigurationModule_EmbeddedConfigurationFactory(androidConfigurationModule, provider);
    }

    public EmbeddedConfiguration get() {
        EmbeddedConfiguration embeddedConfiguration = this.module.embeddedConfiguration((BootstrapConfiguration) this.bootstrapConfigurationProvider.get());
        C2113e.m8178a(embeddedConfiguration, "Cannot return null from a non-@Nullable @Provides method");
        return embeddedConfiguration;
    }
}
