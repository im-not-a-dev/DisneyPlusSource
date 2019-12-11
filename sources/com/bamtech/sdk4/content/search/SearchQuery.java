package com.bamtech.sdk4.content.search;

import com.bamtech.sdk4.content.custom.PersistedQueryRequest;
import kotlin.Metadata;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007¨\u0006\b"}, mo31007d2 = {"Lcom/bamtech/sdk4/content/search/SearchQuery;", "Lcom/bamtech/sdk4/content/custom/PersistedQueryRequest;", "queryId", "", "operationName", "variables", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V", "plugin-content"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: SearchQuery.kt */
public final class SearchQuery extends PersistedQueryRequest {
    public /* synthetic */ SearchQuery(String str, String str2, Object obj, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 4) != 0) {
            obj = null;
        }
        this(str, str2, obj);
    }

    public SearchQuery(String str, String str2, Object obj) {
        super("searchPersisted", str, str2, obj);
    }
}
