package com.bamtech.sdk4.internal.bookmarks;

import com.bamtech.sdk4.bookmarks.storage.BookmarksDao;
import com.bamtech.sdk4.bookmarks.storage.BookmarksDatabase;
import com.bamtech.shadow.dagger.p048a.C2111c;
import javax.inject.Provider;

public final class BookmarksRepositoryModule_BookmarkDaoFactory implements C2111c<BookmarksDao> {
    private final Provider<BookmarksDatabase> databaseProvider;

    public BookmarksRepositoryModule_BookmarkDaoFactory(Provider<BookmarksDatabase> provider) {
        this.databaseProvider = provider;
    }

    public static BookmarksRepositoryModule_BookmarkDaoFactory create(Provider<BookmarksDatabase> provider) {
        return new BookmarksRepositoryModule_BookmarkDaoFactory(provider);
    }

    public BookmarksDao get() {
        return BookmarksRepositoryModule.bookmarkDao((BookmarksDatabase) this.databaseProvider.get());
    }
}
