package com.bamtech.sdk4.internal.device;

import com.bamtech.sdk4.internal.configuration.BootstrapConfiguration;
import com.bamtech.sdk4.internal.core.Storage;
import com.bamtech.shadow.dagger.p048a.C2111c;
import javax.inject.Provider;

public final class DefaultDeviceManager_Factory implements C2111c<DefaultDeviceManager> {
    private final Provider<BootstrapConfiguration> bootstrapConfigurationProvider;
    private final Provider<DeviceClient> clientProvider;
    private final Provider<Storage> storageProvider;

    public DefaultDeviceManager_Factory(Provider<BootstrapConfiguration> provider, Provider<DeviceClient> provider2, Provider<Storage> provider3) {
        this.bootstrapConfigurationProvider = provider;
        this.clientProvider = provider2;
        this.storageProvider = provider3;
    }

    public static DefaultDeviceManager_Factory create(Provider<BootstrapConfiguration> provider, Provider<DeviceClient> provider2, Provider<Storage> provider3) {
        return new DefaultDeviceManager_Factory(provider, provider2, provider3);
    }

    public DefaultDeviceManager get() {
        return new DefaultDeviceManager((BootstrapConfiguration) this.bootstrapConfigurationProvider.get(), (DeviceClient) this.clientProvider.get(), (Storage) this.storageProvider.get());
    }
}
