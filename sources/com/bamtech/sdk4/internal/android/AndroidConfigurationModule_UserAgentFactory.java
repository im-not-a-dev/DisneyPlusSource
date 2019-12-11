package com.bamtech.sdk4.internal.android;

import com.bamtech.sdk4.internal.configuration.BootstrapConfiguration;
import com.bamtech.shadow.dagger.p048a.C2111c;
import com.bamtech.shadow.dagger.p048a.C2113e;
import javax.inject.Provider;

public final class AndroidConfigurationModule_UserAgentFactory implements C2111c<String> {
    private final Provider<BootstrapConfiguration> bootstrapConfigurationProvider;
    private final AndroidConfigurationModule module;

    public AndroidConfigurationModule_UserAgentFactory(AndroidConfigurationModule androidConfigurationModule, Provider<BootstrapConfiguration> provider) {
        this.module = androidConfigurationModule;
        this.bootstrapConfigurationProvider = provider;
    }

    public static AndroidConfigurationModule_UserAgentFactory create(AndroidConfigurationModule androidConfigurationModule, Provider<BootstrapConfiguration> provider) {
        return new AndroidConfigurationModule_UserAgentFactory(androidConfigurationModule, provider);
    }

    public String get() {
        String userAgent = this.module.userAgent((BootstrapConfiguration) this.bootstrapConfigurationProvider.get());
        C2113e.m8178a(userAgent, "Cannot return null from a non-@Nullable @Provides method");
        return userAgent;
    }
}
