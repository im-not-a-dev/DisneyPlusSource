package com.bamtech.sdk4.internal.media.offline;

import com.bamtech.sdk4.bookmarks.storage.LocalBookmarkStore;
import com.bamtech.sdk4.internal.media.CacheProvider;
import com.bamtech.sdk4.internal.media.LocalPlayheadStore;
import com.bamtech.sdk4.media.offline.DownloadSession;
import com.bamtech.shadow.dagger.p048a.C2111c;
import com.google.android.exoplayer2.database.DatabaseProvider;
import javax.inject.Provider;

public final class DefaultOfflineMediaClient_Factory implements C2111c<DefaultOfflineMediaClient> {
    private final Provider<CacheProvider> cacheProvider;
    private final Provider<DatabaseProvider> databaseProvider;
    private final Provider<DownloadSession> downloadSessionProvider;
    private final Provider<LocalBookmarkStore> localBookmarkStoreProvider;
    private final Provider<LocalPlayheadStore> localPlayheadStoreProvider;
    private final Provider<MediaStorage> mediaStorageProvider;

    public DefaultOfflineMediaClient_Factory(Provider<MediaStorage> provider, Provider<LocalPlayheadStore> provider2, Provider<CacheProvider> provider3, Provider<DatabaseProvider> provider4, Provider<LocalBookmarkStore> provider5, Provider<DownloadSession> provider6) {
        this.mediaStorageProvider = provider;
        this.localPlayheadStoreProvider = provider2;
        this.cacheProvider = provider3;
        this.databaseProvider = provider4;
        this.localBookmarkStoreProvider = provider5;
        this.downloadSessionProvider = provider6;
    }

    public static DefaultOfflineMediaClient_Factory create(Provider<MediaStorage> provider, Provider<LocalPlayheadStore> provider2, Provider<CacheProvider> provider3, Provider<DatabaseProvider> provider4, Provider<LocalBookmarkStore> provider5, Provider<DownloadSession> provider6) {
        DefaultOfflineMediaClient_Factory defaultOfflineMediaClient_Factory = new DefaultOfflineMediaClient_Factory(provider, provider2, provider3, provider4, provider5, provider6);
        return defaultOfflineMediaClient_Factory;
    }

    public DefaultOfflineMediaClient get() {
        DefaultOfflineMediaClient defaultOfflineMediaClient = new DefaultOfflineMediaClient((MediaStorage) this.mediaStorageProvider.get(), (LocalPlayheadStore) this.localPlayheadStoreProvider.get(), (CacheProvider) this.cacheProvider.get(), (DatabaseProvider) this.databaseProvider.get(), (LocalBookmarkStore) this.localBookmarkStoreProvider.get(), (DownloadSession) this.downloadSessionProvider.get());
        return defaultOfflineMediaClient;
    }
}
