package com.bamtech.sdk4.content;

import com.bamtech.sdk4.content.bookmark.BookmarkApi;
import com.bamtech.sdk4.content.custom.CustomContentApi;
import com.bamtech.sdk4.content.search.SearchApi;
import com.bamtech.sdk4.content.suggest.SearchSuggestApi;
import com.bamtech.sdk4.content.watchlist.WatchlistApi;
import kotlin.Metadata;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B7\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0002\u0010\u000eJ\u0010\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0016R\u0014\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u000e\u0010\f\u001a\u00020\rX\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\b\u001a\u00020\tX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001d"}, mo31007d2 = {"Lcom/bamtech/sdk4/content/DefaultContentApi;", "Lcom/bamtech/sdk4/content/ContentApi;", "customApi", "Lcom/bamtech/sdk4/content/custom/CustomContentApi;", "searchSuggestApi", "Lcom/bamtech/sdk4/content/suggest/SearchSuggestApi;", "bookmarkApi", "Lcom/bamtech/sdk4/content/bookmark/BookmarkApi;", "watchlistApi", "Lcom/bamtech/sdk4/content/watchlist/WatchlistApi;", "searchApi", "Lcom/bamtech/sdk4/content/search/SearchApi;", "converterProvider", "Lcom/bamtech/sdk4/content/GraphQlConverterProvider;", "(Lcom/bamtech/sdk4/content/custom/CustomContentApi;Lcom/bamtech/sdk4/content/suggest/SearchSuggestApi;Lcom/bamtech/sdk4/content/bookmark/BookmarkApi;Lcom/bamtech/sdk4/content/watchlist/WatchlistApi;Lcom/bamtech/sdk4/content/search/SearchApi;Lcom/bamtech/sdk4/content/GraphQlConverterProvider;)V", "getBookmarkApi", "()Lcom/bamtech/sdk4/content/bookmark/BookmarkApi;", "getCustomApi", "()Lcom/bamtech/sdk4/content/custom/CustomContentApi;", "getSearchApi", "()Lcom/bamtech/sdk4/content/search/SearchApi;", "getSearchSuggestApi", "()Lcom/bamtech/sdk4/content/suggest/SearchSuggestApi;", "getWatchlistApi", "()Lcom/bamtech/sdk4/content/watchlist/WatchlistApi;", "registerConverter", "", "converter", "Lcom/bamtech/sdk4/content/GraphQlResponseConverter;", "plugin-content"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: ContentApi.kt */
public final class DefaultContentApi implements ContentApi {
    private final BookmarkApi bookmarkApi;
    private final GraphQlConverterProvider converterProvider;
    private final CustomContentApi customApi;
    private final SearchApi searchApi;
    private final SearchSuggestApi searchSuggestApi;
    private final WatchlistApi watchlistApi;

    public DefaultContentApi(CustomContentApi customContentApi, SearchSuggestApi searchSuggestApi2, BookmarkApi bookmarkApi2, WatchlistApi watchlistApi2, SearchApi searchApi2, GraphQlConverterProvider graphQlConverterProvider) {
        this.customApi = customContentApi;
        this.searchSuggestApi = searchSuggestApi2;
        this.bookmarkApi = bookmarkApi2;
        this.watchlistApi = watchlistApi2;
        this.searchApi = searchApi2;
        this.converterProvider = graphQlConverterProvider;
    }

    public BookmarkApi getBookmarkApi() {
        return this.bookmarkApi;
    }

    public CustomContentApi getCustomApi() {
        return this.customApi;
    }

    public SearchApi getSearchApi() {
        return this.searchApi;
    }

    public SearchSuggestApi getSearchSuggestApi() {
        return this.searchSuggestApi;
    }

    public WatchlistApi getWatchlistApi() {
        return this.watchlistApi;
    }

    public void registerConverter(GraphQlResponseConverter graphQlResponseConverter) {
        this.converterProvider.registerConverter(graphQlResponseConverter);
    }
}
