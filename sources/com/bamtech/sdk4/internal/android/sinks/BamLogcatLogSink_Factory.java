package com.bamtech.sdk4.internal.android.sinks;

import com.bamtech.sdk4.internal.configuration.BootstrapConfiguration;
import com.bamtech.shadow.dagger.p048a.C2111c;
import javax.inject.Provider;

public final class BamLogcatLogSink_Factory implements C2111c<BamLogcatLogSink> {
    private final Provider<BootstrapConfiguration> bootstrapConfigurationProvider;

    public BamLogcatLogSink_Factory(Provider<BootstrapConfiguration> provider) {
        this.bootstrapConfigurationProvider = provider;
    }

    public static BamLogcatLogSink_Factory create(Provider<BootstrapConfiguration> provider) {
        return new BamLogcatLogSink_Factory(provider);
    }

    public BamLogcatLogSink get() {
        return new BamLogcatLogSink((BootstrapConfiguration) this.bootstrapConfigurationProvider.get());
    }
}
