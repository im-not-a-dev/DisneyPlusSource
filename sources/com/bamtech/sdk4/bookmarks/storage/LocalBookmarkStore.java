package com.bamtech.sdk4.bookmarks.storage;

import com.bamtech.sdk4.bookmarks.Bookmark;
import com.bamtech.sdk4.internal.service.ServiceTransaction;
import java.util.List;
import kotlin.Metadata;
import p520io.reactivex.Completable;
import p520io.reactivex.Single;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J.\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\u0006\u0010\u0006\u001a\u00020\u00072\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0004H&J\u0016\u0010\n\u001a\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H&J*\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H&J\b\u0010\u0010\u001a\u00020\u0011H&J\u0010\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\tH&¨\u0006\u0014"}, mo31007d2 = {"Lcom/bamtech/sdk4/bookmarks/storage/LocalBookmarkStore;", "", "fetchBookmarks", "Lio/reactivex/Single;", "", "Lcom/bamtech/sdk4/bookmarks/Bookmark;", "transaction", "Lcom/bamtech/sdk4/internal/service/ServiceTransaction;", "contentIds", "", "importBookmarks", "", "newValues", "mergeBookmarks", "remoteValues", "cachedValues", "removeAllBookmarks", "Lio/reactivex/Completable;", "removeBookmarksForProfile", "profileId", "plugin-bookmarks_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: DefaultLocalBookmarkStore.kt */
public interface LocalBookmarkStore {
    Single<List<Bookmark>> fetchBookmarks(ServiceTransaction serviceTransaction, List<String> list);

    void importBookmarks(List<Bookmark> list);

    List<Bookmark> mergeBookmarks(List<Bookmark> list, List<Bookmark> list2);

    Completable removeAllBookmarks();

    Completable removeBookmarksForProfile(String str);
}
