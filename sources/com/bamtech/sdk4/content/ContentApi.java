package com.bamtech.sdk4.content;

import com.bamtech.sdk4.content.bookmark.BookmarkApi;
import com.bamtech.sdk4.content.custom.CustomContentApi;
import com.bamtech.sdk4.content.search.SearchApi;
import com.bamtech.sdk4.content.suggest.SearchSuggestApi;
import com.bamtech.sdk4.content.watchlist.WatchlistApi;
import com.bamtech.sdk4.plugin.PluginApi;
import kotlin.Metadata;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH'R\u001a\u0010\u0002\u001a\u00020\u00038&X§\u0004¢\u0006\f\u0012\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u0012\u0010\b\u001a\u00020\tX¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0012\u0010\f\u001a\u00020\rX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0012\u0010\u0010\u001a\u00020\u0011X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0012\u0010\u0014\u001a\u00020\u0015X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001c"}, mo31007d2 = {"Lcom/bamtech/sdk4/content/ContentApi;", "Lcom/bamtech/sdk4/plugin/PluginApi;", "bookmarkApi", "Lcom/bamtech/sdk4/content/bookmark/BookmarkApi;", "bookmarkApi$annotations", "()V", "getBookmarkApi", "()Lcom/bamtech/sdk4/content/bookmark/BookmarkApi;", "customApi", "Lcom/bamtech/sdk4/content/custom/CustomContentApi;", "getCustomApi", "()Lcom/bamtech/sdk4/content/custom/CustomContentApi;", "searchApi", "Lcom/bamtech/sdk4/content/search/SearchApi;", "getSearchApi", "()Lcom/bamtech/sdk4/content/search/SearchApi;", "searchSuggestApi", "Lcom/bamtech/sdk4/content/suggest/SearchSuggestApi;", "getSearchSuggestApi", "()Lcom/bamtech/sdk4/content/suggest/SearchSuggestApi;", "watchlistApi", "Lcom/bamtech/sdk4/content/watchlist/WatchlistApi;", "getWatchlistApi", "()Lcom/bamtech/sdk4/content/watchlist/WatchlistApi;", "registerConverter", "", "converter", "Lcom/bamtech/sdk4/content/GraphQlResponseConverter;", "plugin-content"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: ContentApi.kt */
public interface ContentApi extends PluginApi {
    BookmarkApi getBookmarkApi();

    CustomContentApi getCustomApi();

    SearchApi getSearchApi();

    SearchSuggestApi getSearchSuggestApi();

    WatchlistApi getWatchlistApi();

    void registerConverter(GraphQlResponseConverter graphQlResponseConverter);
}
