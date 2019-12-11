package com.bamtech.sdk4.bookmarks.storage;

import com.bamtech.sdk4.session.SessionInfoExtension;
import com.bamtech.shadow.dagger.p048a.C2111c;
import javax.inject.Provider;

public final class DefaultLocalBookmarkStore_Factory implements C2111c<DefaultLocalBookmarkStore> {
    private final Provider<BookmarksDao> daoProvider;
    private final Provider<SessionInfoExtension> sessionManagerProvider;

    public DefaultLocalBookmarkStore_Factory(Provider<SessionInfoExtension> provider, Provider<BookmarksDao> provider2) {
        this.sessionManagerProvider = provider;
        this.daoProvider = provider2;
    }

    public static DefaultLocalBookmarkStore_Factory create(Provider<SessionInfoExtension> provider, Provider<BookmarksDao> provider2) {
        return new DefaultLocalBookmarkStore_Factory(provider, provider2);
    }

    public DefaultLocalBookmarkStore get() {
        return new DefaultLocalBookmarkStore((SessionInfoExtension) this.sessionManagerProvider.get(), (BookmarksDao) this.daoProvider.get());
    }
}
