package com.bamtech.sdk4.media.storage;

import com.bamtech.sdk4.bookmarks.storage.LocalBookmarkStore;
import com.bamtech.sdk4.internal.media.LocalPlayheadStore;
import com.bamtech.sdk4.session.SessionInfoExtension;
import com.bamtech.shadow.dagger.p048a.C2111c;
import javax.inject.Provider;

public final class DefaultPlayheadRecorder_Factory implements C2111c<DefaultPlayheadRecorder> {
    private final Provider<LocalBookmarkStore> localBookmarkStoreProvider;
    private final Provider<LocalPlayheadStore> localPlayheadStoreProvider;
    private final Provider<SessionInfoExtension> sessionInfoExtensionProvider;

    public DefaultPlayheadRecorder_Factory(Provider<SessionInfoExtension> provider, Provider<LocalPlayheadStore> provider2, Provider<LocalBookmarkStore> provider3) {
        this.sessionInfoExtensionProvider = provider;
        this.localPlayheadStoreProvider = provider2;
        this.localBookmarkStoreProvider = provider3;
    }

    public static DefaultPlayheadRecorder_Factory create(Provider<SessionInfoExtension> provider, Provider<LocalPlayheadStore> provider2, Provider<LocalBookmarkStore> provider3) {
        return new DefaultPlayheadRecorder_Factory(provider, provider2, provider3);
    }

    public DefaultPlayheadRecorder get() {
        return new DefaultPlayheadRecorder((SessionInfoExtension) this.sessionInfoExtensionProvider.get(), (LocalPlayheadStore) this.localPlayheadStoreProvider.get(), (LocalBookmarkStore) this.localBookmarkStoreProvider.get());
    }
}
