package com.bamtech.sdk4.internal.media.offline;

import com.bamtech.shadow.dagger.p048a.C2111c;
import com.bamtech.shadow.dagger.p048a.C2113e;
import javax.inject.Provider;

public final class OfflineMediaClientModule_OfflineMediaClientFactory implements C2111c<OfflineMediaClient> {
    private final Provider<DefaultOfflineMediaClient> cachedMediaClientProvider;
    private final OfflineMediaClientModule module;

    public OfflineMediaClientModule_OfflineMediaClientFactory(OfflineMediaClientModule offlineMediaClientModule, Provider<DefaultOfflineMediaClient> provider) {
        this.module = offlineMediaClientModule;
        this.cachedMediaClientProvider = provider;
    }

    public static OfflineMediaClientModule_OfflineMediaClientFactory create(OfflineMediaClientModule offlineMediaClientModule, Provider<DefaultOfflineMediaClient> provider) {
        return new OfflineMediaClientModule_OfflineMediaClientFactory(offlineMediaClientModule, provider);
    }

    public OfflineMediaClient get() {
        OfflineMediaClient offlineMediaClient = this.module.offlineMediaClient((DefaultOfflineMediaClient) this.cachedMediaClientProvider.get());
        C2113e.m8178a(offlineMediaClient, "Cannot return null from a non-@Nullable @Provides method");
        return offlineMediaClient;
    }
}
