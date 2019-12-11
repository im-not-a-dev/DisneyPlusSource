package com.bamtech.sdk4.media;

import com.bamtech.sdk4.internal.media.MediaManager;
import com.bamtech.sdk4.internal.service.ServiceTransaction;
import com.bamtech.sdk4.session.RenewSessionTransformers;
import com.bamtech.shadow.dagger.p048a.C2111c;
import javax.inject.Provider;

public final class DefaultMediaApi_Factory implements C2111c<DefaultMediaApi> {
    private final Provider<DefaultQOSPlaybackEventListener> defaultQosPlaybackEventListenerProvider;
    private final Provider<MediaManager> mediaManagerProvider;
    private final Provider<PlaybackSessionProvider> playbackSessionProvider;
    private final Provider<ServiceTransaction> transactionProvider;
    private final Provider<RenewSessionTransformers> transformersProvider;

    public DefaultMediaApi_Factory(Provider<ServiceTransaction> provider, Provider<PlaybackSessionProvider> provider2, Provider<MediaManager> provider3, Provider<RenewSessionTransformers> provider4, Provider<DefaultQOSPlaybackEventListener> provider5) {
        this.transactionProvider = provider;
        this.playbackSessionProvider = provider2;
        this.mediaManagerProvider = provider3;
        this.transformersProvider = provider4;
        this.defaultQosPlaybackEventListenerProvider = provider5;
    }

    public static DefaultMediaApi_Factory create(Provider<ServiceTransaction> provider, Provider<PlaybackSessionProvider> provider2, Provider<MediaManager> provider3, Provider<RenewSessionTransformers> provider4, Provider<DefaultQOSPlaybackEventListener> provider5) {
        DefaultMediaApi_Factory defaultMediaApi_Factory = new DefaultMediaApi_Factory(provider, provider2, provider3, provider4, provider5);
        return defaultMediaApi_Factory;
    }

    public DefaultMediaApi get() {
        DefaultMediaApi defaultMediaApi = new DefaultMediaApi(this.transactionProvider, (PlaybackSessionProvider) this.playbackSessionProvider.get(), (MediaManager) this.mediaManagerProvider.get(), (RenewSessionTransformers) this.transformersProvider.get(), (DefaultQOSPlaybackEventListener) this.defaultQosPlaybackEventListenerProvider.get());
        return defaultMediaApi;
    }
}
