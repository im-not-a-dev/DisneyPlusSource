package com.bamtech.sdk4.internal.location;

import com.bamtech.sdk4.internal.configuration.ConfigurationProvider;
import com.bamtech.sdk4.location.GeoProvider;
import com.bamtech.shadow.dagger.p048a.C2111c;
import javax.inject.Provider;

public final class DefaultLocationResolver_Factory implements C2111c<DefaultLocationResolver> {
    private final Provider<ConfigurationProvider> configurationProvider;
    private final Provider<GeoProvider> geoProvider;

    public DefaultLocationResolver_Factory(Provider<ConfigurationProvider> provider, Provider<GeoProvider> provider2) {
        this.configurationProvider = provider;
        this.geoProvider = provider2;
    }

    public static DefaultLocationResolver_Factory create(Provider<ConfigurationProvider> provider, Provider<GeoProvider> provider2) {
        return new DefaultLocationResolver_Factory(provider, provider2);
    }

    public DefaultLocationResolver get() {
        return new DefaultLocationResolver((ConfigurationProvider) this.configurationProvider.get(), (GeoProvider) this.geoProvider.get());
    }
}
