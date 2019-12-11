package com.bamtech.sdk4.bookmarks;

import com.bamtech.shadow.dagger.MembersInjector;

public final class BookmarkPlugin_MembersInjector implements MembersInjector<BookmarkPlugin> {
    public static void injectApi(BookmarkPlugin bookmarkPlugin, BookmarksApi bookmarksApi) {
        bookmarkPlugin.api = bookmarksApi;
    }
}
