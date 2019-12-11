package com.bamtech.sdk4.internal.media.offline;

import com.bamtech.sdk4.media.adapters.exoplayer.WidevineDrmSessionManager;
import com.bamtech.sdk4.media.drm.WidevineDrmProvider;
import com.bamtech.shadow.dagger.p048a.C2111c;
import javax.inject.Provider;

public final class OfflineLicenseManager_Factory implements C2111c<OfflineLicenseManager> {
    private final Provider<WidevineDrmProvider> drmProvider;
    private final Provider<WidevineDrmSessionManager> playbackSessionProvider;

    public OfflineLicenseManager_Factory(Provider<WidevineDrmProvider> provider, Provider<WidevineDrmSessionManager> provider2) {
        this.drmProvider = provider;
        this.playbackSessionProvider = provider2;
    }

    public static OfflineLicenseManager_Factory create(Provider<WidevineDrmProvider> provider, Provider<WidevineDrmSessionManager> provider2) {
        return new OfflineLicenseManager_Factory(provider, provider2);
    }

    public OfflineLicenseManager get() {
        return new OfflineLicenseManager((WidevineDrmProvider) this.drmProvider.get(), (WidevineDrmSessionManager) this.playbackSessionProvider.get());
    }
}
