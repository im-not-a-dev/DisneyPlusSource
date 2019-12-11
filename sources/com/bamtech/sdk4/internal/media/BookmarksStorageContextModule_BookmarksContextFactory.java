package com.bamtech.sdk4.internal.media;

import android.app.Application;
import android.content.Context;
import com.bamtech.shadow.dagger.p048a.C2111c;
import javax.inject.Provider;

public final class BookmarksStorageContextModule_BookmarksContextFactory implements C2111c<Context> {
    private final Provider<Application> applicationProvider;
    private final BookmarksStorageContextModule module;

    public BookmarksStorageContextModule_BookmarksContextFactory(BookmarksStorageContextModule bookmarksStorageContextModule, Provider<Application> provider) {
        this.module = bookmarksStorageContextModule;
        this.applicationProvider = provider;
    }

    public static BookmarksStorageContextModule_BookmarksContextFactory create(BookmarksStorageContextModule bookmarksStorageContextModule, Provider<Application> provider) {
        return new BookmarksStorageContextModule_BookmarksContextFactory(bookmarksStorageContextModule, provider);
    }

    public Context get() {
        return this.module.bookmarksContext((Application) this.applicationProvider.get());
    }
}
