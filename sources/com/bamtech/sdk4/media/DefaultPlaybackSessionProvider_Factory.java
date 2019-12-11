package com.bamtech.sdk4.media;

import com.bamtech.sdk4.internal.media.PlaybackSessionSubcomponent.Builder;
import com.bamtech.sdk4.internal.service.ServiceTransaction;
import com.bamtech.shadow.dagger.p048a.C2111c;
import javax.inject.Provider;

public final class DefaultPlaybackSessionProvider_Factory implements C2111c<DefaultPlaybackSessionProvider> {
    private final Provider<Builder> playbackSessionProvider;
    private final Provider<QOSNetworkHelper> qosNewtorkHelperProvider;
    private final Provider<ServiceTransaction> transactionProvider;

    public DefaultPlaybackSessionProvider_Factory(Provider<ServiceTransaction> provider, Provider<Builder> provider2, Provider<QOSNetworkHelper> provider3) {
        this.transactionProvider = provider;
        this.playbackSessionProvider = provider2;
        this.qosNewtorkHelperProvider = provider3;
    }

    public static DefaultPlaybackSessionProvider_Factory create(Provider<ServiceTransaction> provider, Provider<Builder> provider2, Provider<QOSNetworkHelper> provider3) {
        return new DefaultPlaybackSessionProvider_Factory(provider, provider2, provider3);
    }

    public DefaultPlaybackSessionProvider get() {
        return new DefaultPlaybackSessionProvider(this.transactionProvider, this.playbackSessionProvider, (QOSNetworkHelper) this.qosNewtorkHelperProvider.get());
    }
}
