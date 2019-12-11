package com.bamtech.sdk4.bookmarks;

import com.bamtech.sdk4.content.custom.PersistedQueryRequest;
import java.util.List;
import kotlin.Metadata;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B/\b\u0007\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007¨\u0006\b"}, mo31007d2 = {"Lcom/bamtech/sdk4/bookmarks/BookmarksQuery;", "Lcom/bamtech/sdk4/content/custom/PersistedQueryRequest;", "queryId", "", "operationName", "contentIds", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "plugin-bookmarks_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: BookmarksQuery.kt */
public final class BookmarksQuery extends PersistedQueryRequest {
    public BookmarksQuery() {
        this(null, null, null, 7, null);
    }

    public /* synthetic */ BookmarksQuery(String str, String str2, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            str = "getBookmarks";
        }
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 4) != 0) {
            list = null;
        }
        this(str, str2, list);
    }

    public BookmarksQuery(String str, String str2, List<String> list) {
        super("bookmarksPersisted", str, str2, list != null ? new ContentVariables(list) : null);
    }
}
