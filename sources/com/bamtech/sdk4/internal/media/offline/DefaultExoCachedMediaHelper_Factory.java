package com.bamtech.sdk4.internal.media.offline;

import android.content.Context;
import com.bamtech.shadow.dagger.p048a.C2111c;
import javax.inject.Provider;

public final class DefaultExoCachedMediaHelper_Factory implements C2111c<DefaultExoCachedMediaHelper> {
    private final Provider<Context> applicationContextProvider;
    private final Provider<WidevineLicenseManager> licenseManagerProvider;
    private final Provider<TrackHelper> trackHelperProvider;
    private final Provider<String> userAgentProvider;

    public DefaultExoCachedMediaHelper_Factory(Provider<Context> provider, Provider<WidevineLicenseManager> provider2, Provider<TrackHelper> provider3, Provider<String> provider4) {
        this.applicationContextProvider = provider;
        this.licenseManagerProvider = provider2;
        this.trackHelperProvider = provider3;
        this.userAgentProvider = provider4;
    }

    public static DefaultExoCachedMediaHelper_Factory create(Provider<Context> provider, Provider<WidevineLicenseManager> provider2, Provider<TrackHelper> provider3, Provider<String> provider4) {
        return new DefaultExoCachedMediaHelper_Factory(provider, provider2, provider3, provider4);
    }

    public DefaultExoCachedMediaHelper get() {
        return new DefaultExoCachedMediaHelper((Context) this.applicationContextProvider.get(), (WidevineLicenseManager) this.licenseManagerProvider.get(), (TrackHelper) this.trackHelperProvider.get(), (String) this.userAgentProvider.get());
    }
}
