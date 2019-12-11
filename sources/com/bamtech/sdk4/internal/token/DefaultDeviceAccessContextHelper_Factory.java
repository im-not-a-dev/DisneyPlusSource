package com.bamtech.sdk4.internal.token;

import com.bamtech.sdk4.internal.device.DeviceManager;
import com.bamtech.sdk4.internal.session.InternalSessionStateProvider;
import com.bamtech.shadow.dagger.p048a.C2111c;
import javax.inject.Provider;

public final class DefaultDeviceAccessContextHelper_Factory implements C2111c<DefaultDeviceAccessContextHelper> {
    private final Provider<DeviceManager> deviceManagerProvider;
    private final Provider<InternalSessionStateProvider> internalSessionStateProvider;
    private final Provider<TokenExchangeManager> tokenExchangeManagerProvider;

    public DefaultDeviceAccessContextHelper_Factory(Provider<DeviceManager> provider, Provider<InternalSessionStateProvider> provider2, Provider<TokenExchangeManager> provider3) {
        this.deviceManagerProvider = provider;
        this.internalSessionStateProvider = provider2;
        this.tokenExchangeManagerProvider = provider3;
    }

    public static DefaultDeviceAccessContextHelper_Factory create(Provider<DeviceManager> provider, Provider<InternalSessionStateProvider> provider2, Provider<TokenExchangeManager> provider3) {
        return new DefaultDeviceAccessContextHelper_Factory(provider, provider2, provider3);
    }

    public DefaultDeviceAccessContextHelper get() {
        return new DefaultDeviceAccessContextHelper((DeviceManager) this.deviceManagerProvider.get(), (InternalSessionStateProvider) this.internalSessionStateProvider.get(), (TokenExchangeManager) this.tokenExchangeManagerProvider.get());
    }
}
