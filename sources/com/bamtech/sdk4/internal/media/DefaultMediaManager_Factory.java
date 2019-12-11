package com.bamtech.sdk4.internal.media;

import android.content.Context;
import com.bamtech.sdk4.bookmarks.storage.LocalBookmarkStore;
import com.bamtech.sdk4.internal.media.adengine.AdEngineManager;
import com.bamtech.sdk4.internal.token.AccessTokenProvider;
import com.bamtech.sdk4.media.DefaultQOSPlaybackEventListener;
import com.bamtech.sdk4.media.QOSNetworkHelper;
import com.bamtech.sdk4.plugin.ExtensionInstanceProvider;
import com.bamtech.sdk4.session.SessionInfoExtension;
import com.bamtech.shadow.dagger.p048a.C2111c;
import javax.inject.Provider;

public final class DefaultMediaManager_Factory implements C2111c<DefaultMediaManager> {
    private final Provider<AdEngineManager> adEngineManagerProvider;
    private final Provider<Context> contextProvider;
    private final Provider<DefaultQOSPlaybackEventListener> defaultQosPlaybackEventListenerProvider;
    private final Provider<ExtensionInstanceProvider> extensionInstanceProvider;
    private final Provider<LocalBookmarkStore> localBookmarkStoreProvider;
    private final Provider<LocalPlayheadStore> localPlayheadStoreProvider;
    private final Provider<MediaClient> onlineMediaClientProvider;
    private final Provider<QOSNetworkHelper> qosNetworkHelperProvider;
    private final Provider<SessionInfoExtension> sessionInfoExtensionProvider;
    private final Provider<AccessTokenProvider> tokenProvider;

    public DefaultMediaManager_Factory(Provider<MediaClient> provider, Provider<ExtensionInstanceProvider> provider2, Provider<AccessTokenProvider> provider3, Provider<Context> provider4, Provider<AdEngineManager> provider5, Provider<LocalPlayheadStore> provider6, Provider<SessionInfoExtension> provider7, Provider<DefaultQOSPlaybackEventListener> provider8, Provider<LocalBookmarkStore> provider9, Provider<QOSNetworkHelper> provider10) {
        this.onlineMediaClientProvider = provider;
        this.extensionInstanceProvider = provider2;
        this.tokenProvider = provider3;
        this.contextProvider = provider4;
        this.adEngineManagerProvider = provider5;
        this.localPlayheadStoreProvider = provider6;
        this.sessionInfoExtensionProvider = provider7;
        this.defaultQosPlaybackEventListenerProvider = provider8;
        this.localBookmarkStoreProvider = provider9;
        this.qosNetworkHelperProvider = provider10;
    }

    public static DefaultMediaManager_Factory create(Provider<MediaClient> provider, Provider<ExtensionInstanceProvider> provider2, Provider<AccessTokenProvider> provider3, Provider<Context> provider4, Provider<AdEngineManager> provider5, Provider<LocalPlayheadStore> provider6, Provider<SessionInfoExtension> provider7, Provider<DefaultQOSPlaybackEventListener> provider8, Provider<LocalBookmarkStore> provider9, Provider<QOSNetworkHelper> provider10) {
        DefaultMediaManager_Factory defaultMediaManager_Factory = new DefaultMediaManager_Factory(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10);
        return defaultMediaManager_Factory;
    }

    public DefaultMediaManager get() {
        DefaultMediaManager defaultMediaManager = new DefaultMediaManager((MediaClient) this.onlineMediaClientProvider.get(), (ExtensionInstanceProvider) this.extensionInstanceProvider.get(), (AccessTokenProvider) this.tokenProvider.get(), (Context) this.contextProvider.get(), (AdEngineManager) this.adEngineManagerProvider.get(), (LocalPlayheadStore) this.localPlayheadStoreProvider.get(), (SessionInfoExtension) this.sessionInfoExtensionProvider.get(), (DefaultQOSPlaybackEventListener) this.defaultQosPlaybackEventListenerProvider.get(), this.localBookmarkStoreProvider, (QOSNetworkHelper) this.qosNetworkHelperProvider.get());
        return defaultMediaManager;
    }
}
