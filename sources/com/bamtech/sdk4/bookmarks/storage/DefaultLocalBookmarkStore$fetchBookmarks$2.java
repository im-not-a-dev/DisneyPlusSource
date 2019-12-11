package com.bamtech.sdk4.bookmarks.storage;

import com.bamtech.sdk4.bookmarks.Bookmark;
import java.util.List;
import kotlin.Metadata;
import p520io.reactivex.functions.Function;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, mo31007d2 = {"<anonymous>", "", "Lcom/bamtech/sdk4/bookmarks/Bookmark;", "profileId", "", "apply"}, mo31008k = 3, mo31009mv = {1, 1, 15})
/* compiled from: DefaultLocalBookmarkStore.kt */
final class DefaultLocalBookmarkStore$fetchBookmarks$2<T, R> implements Function<T, R> {
    final /* synthetic */ List $contentIds;
    final /* synthetic */ DefaultLocalBookmarkStore this$0;

    DefaultLocalBookmarkStore$fetchBookmarks$2(DefaultLocalBookmarkStore defaultLocalBookmarkStore, List list) {
        this.this$0 = defaultLocalBookmarkStore;
        this.$contentIds = list;
    }

    public final List<Bookmark> apply(String str) {
        if (this.$contentIds == null) {
            BookmarksDao access$getDao$p = this.this$0.dao;
            if (access$getDao$p != null) {
                return access$getDao$p.getBookmarks(str);
            }
            return null;
        }
        BookmarksDao access$getDao$p2 = this.this$0.dao;
        if (access$getDao$p2 != null) {
            return access$getDao$p2.getBookmarks(str, this.$contentIds);
        }
        return null;
    }
}
