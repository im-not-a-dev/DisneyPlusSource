package com.bamtech.sdk4.bookmarks;

import com.bamtech.sdk4.plugin.PluginApi;
import java.util.List;
import kotlin.Metadata;
import p520io.reactivex.Completable;
import p520io.reactivex.Single;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J.\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007H&J\"\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004H&J\u0016\u0010\n\u001a\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H&¨\u0006\r"}, mo31007d2 = {"Lcom/bamtech/sdk4/bookmarks/BookmarksApi;", "Lcom/bamtech/sdk4/plugin/PluginApi;", "getBookmarks", "Lio/reactivex/Single;", "", "Lcom/bamtech/sdk4/bookmarks/Bookmark;", "contentIds", "", "contentTransactionId", "getLocalBookmarks", "importBookmarks", "Lio/reactivex/Completable;", "bookmarks", "plugin-bookmarks_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: BookmarksApi.kt */
public interface BookmarksApi extends PluginApi {

    @Metadata(mo31005bv = {1, 0, 3}, mo31008k = 3, mo31009mv = {1, 1, 15})
    /* compiled from: BookmarksApi.kt */
    public static final class DefaultImpls {
        public static /* synthetic */ Single getBookmarks$default(BookmarksApi bookmarksApi, List list, String str, int i, Object obj) {
            if (obj == null) {
                if ((i & 2) != 0) {
                    str = null;
                }
                return bookmarksApi.getBookmarks(list, str);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getBookmarks");
        }
    }

    Single<List<Bookmark>> getBookmarks(List<String> list, String str);

    Single<List<Bookmark>> getLocalBookmarks(List<String> list);

    Completable importBookmarks(List<Bookmark> list);
}
