package com.bamtech.sdk4.content.bookmark;

import com.bamtech.sdk4.content.ContentExtension;
import com.bamtech.sdk4.internal.service.ServiceTransaction;
import javax.inject.Provider;
import kotlin.Metadata;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\"\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u000b0\n0\t\"\u0004\b\u0000\u0010\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, mo31007d2 = {"Lcom/bamtech/sdk4/content/bookmark/DefaultBookmarkApi;", "Lcom/bamtech/sdk4/content/bookmark/BookmarkApi;", "transactionProvider", "Ljavax/inject/Provider;", "Lcom/bamtech/sdk4/internal/service/ServiceTransaction;", "extension", "Lcom/bamtech/sdk4/content/ContentExtension;", "(Ljavax/inject/Provider;Lcom/bamtech/sdk4/content/ContentExtension;)V", "getBookmarks", "Lio/reactivex/Single;", "Lcom/bamtech/sdk4/content/GraphQlResponse;", "T", "type", "Ljava/lang/reflect/Type;", "plugin-content"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: BookmarkApi.kt */
public final class DefaultBookmarkApi implements BookmarkApi {
    public DefaultBookmarkApi(Provider<ServiceTransaction> provider, ContentExtension contentExtension) {
    }
}
