package com.bamtech.sdk4.content;

import com.bamtech.sdk4.content.bookmark.BookmarkApi;
import com.bamtech.sdk4.content.custom.CustomContentApi;
import com.bamtech.sdk4.content.search.SearchApi;
import com.bamtech.sdk4.content.suggest.SearchSuggestApi;
import com.bamtech.sdk4.content.watchlist.WatchlistApi;
import com.bamtech.shadow.dagger.p048a.C2111c;
import javax.inject.Provider;

public final class DefaultContentApi_Factory implements C2111c<DefaultContentApi> {
    private final Provider<BookmarkApi> bookmarkApiProvider;
    private final Provider<GraphQlConverterProvider> converterProvider;
    private final Provider<CustomContentApi> customApiProvider;
    private final Provider<SearchApi> searchApiProvider;
    private final Provider<SearchSuggestApi> searchSuggestApiProvider;
    private final Provider<WatchlistApi> watchlistApiProvider;

    public DefaultContentApi_Factory(Provider<CustomContentApi> provider, Provider<SearchSuggestApi> provider2, Provider<BookmarkApi> provider3, Provider<WatchlistApi> provider4, Provider<SearchApi> provider5, Provider<GraphQlConverterProvider> provider6) {
        this.customApiProvider = provider;
        this.searchSuggestApiProvider = provider2;
        this.bookmarkApiProvider = provider3;
        this.watchlistApiProvider = provider4;
        this.searchApiProvider = provider5;
        this.converterProvider = provider6;
    }

    public static DefaultContentApi_Factory create(Provider<CustomContentApi> provider, Provider<SearchSuggestApi> provider2, Provider<BookmarkApi> provider3, Provider<WatchlistApi> provider4, Provider<SearchApi> provider5, Provider<GraphQlConverterProvider> provider6) {
        DefaultContentApi_Factory defaultContentApi_Factory = new DefaultContentApi_Factory(provider, provider2, provider3, provider4, provider5, provider6);
        return defaultContentApi_Factory;
    }

    public DefaultContentApi get() {
        DefaultContentApi defaultContentApi = new DefaultContentApi((CustomContentApi) this.customApiProvider.get(), (SearchSuggestApi) this.searchSuggestApiProvider.get(), (BookmarkApi) this.bookmarkApiProvider.get(), (WatchlistApi) this.watchlistApiProvider.get(), (SearchApi) this.searchApiProvider.get(), (GraphQlConverterProvider) this.converterProvider.get());
        return defaultContentApi;
    }
}
