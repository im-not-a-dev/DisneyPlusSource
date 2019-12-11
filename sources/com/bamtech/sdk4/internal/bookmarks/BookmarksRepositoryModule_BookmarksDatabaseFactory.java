package com.bamtech.sdk4.internal.bookmarks;

import android.content.Context;
import com.bamtech.sdk4.bookmarks.storage.BookmarksDatabase;
import com.bamtech.shadow.dagger.p048a.C2111c;
import javax.inject.Provider;

public final class BookmarksRepositoryModule_BookmarksDatabaseFactory implements C2111c<BookmarksDatabase> {
    private final Provider<Context> contextProvider;

    public BookmarksRepositoryModule_BookmarksDatabaseFactory(Provider<Context> provider) {
        this.contextProvider = provider;
    }

    public static BookmarksRepositoryModule_BookmarksDatabaseFactory create(Provider<Context> provider) {
        return new BookmarksRepositoryModule_BookmarksDatabaseFactory(provider);
    }

    public BookmarksDatabase get() {
        return BookmarksRepositoryModule.bookmarksDatabase((Context) this.contextProvider.get());
    }
}
