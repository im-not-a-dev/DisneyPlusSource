package com.bamtech.sdk4.internal.android;

import android.content.SharedPreferences;
import com.bamtech.sdk4.internal.configuration.BootstrapConfiguration;
import com.bamtech.sdk4.internal.networking.DefaultConverterProvider;
import com.bamtech.shadow.dagger.p048a.C2111c;
import javax.inject.Provider;

public final class PreferencesStorage_Factory implements C2111c<PreferencesStorage> {
    private final Provider<BootstrapConfiguration> configurationProvider;
    private final Provider<DefaultConverterProvider> defaultConverterProvider;
    private final Provider<SharedPreferences> prefsProvider;

    public PreferencesStorage_Factory(Provider<SharedPreferences> provider, Provider<BootstrapConfiguration> provider2, Provider<DefaultConverterProvider> provider3) {
        this.prefsProvider = provider;
        this.configurationProvider = provider2;
        this.defaultConverterProvider = provider3;
    }

    public static PreferencesStorage_Factory create(Provider<SharedPreferences> provider, Provider<BootstrapConfiguration> provider2, Provider<DefaultConverterProvider> provider3) {
        return new PreferencesStorage_Factory(provider, provider2, provider3);
    }

    public PreferencesStorage get() {
        return new PreferencesStorage((SharedPreferences) this.prefsProvider.get(), (BootstrapConfiguration) this.configurationProvider.get(), (DefaultConverterProvider) this.defaultConverterProvider.get());
    }
}
