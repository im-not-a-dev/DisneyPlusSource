package com.bamtech.sdk4.content.watchlist;

import com.bamtech.sdk4.content.ContentExtension;
import com.bamtech.sdk4.internal.service.ServiceTransaction;
import javax.inject.Provider;
import kotlin.Metadata;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0005\b\u0000\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u001d\b\u0007\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007JE\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u000b0\n0\t\"\u0004\b\u0000\u0010\u000b2\u0006\u0010\f\u001a\u00020\r2\u0012\u0010\u000e\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00100\u000f\"\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0002\u0010\u0012J:\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u000b0\n0\t\"\u0004\b\u0000\u0010\u000b2\u0006\u0010\f\u001a\u00020\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u00132\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016J,\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u000b0\n0\t\"\u0004\b\u0000\u0010\u000b2\u0006\u0010\f\u001a\u00020\r2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016J,\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u000b0\n0\t\"\u0004\b\u0000\u0010\u000b2\u0006\u0010\f\u001a\u00020\r2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016JE\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u000b0\n0\t\"\u0004\b\u0000\u0010\u000b2\u0006\u0010\f\u001a\u00020\r2\u0012\u0010\u000e\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00100\u000f\"\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0002\u0010\u0012J:\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u000b0\n0\t\"\u0004\b\u0000\u0010\u000b2\u0006\u0010\f\u001a\u00020\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u00132\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, mo31007d2 = {"Lcom/bamtech/sdk4/content/watchlist/DefaultWatchlistApi;", "Lcom/bamtech/sdk4/content/watchlist/WatchlistApi;", "transactionProvider", "Ljavax/inject/Provider;", "Lcom/bamtech/sdk4/internal/service/ServiceTransaction;", "extension", "Lcom/bamtech/sdk4/content/ContentExtension;", "(Ljavax/inject/Provider;Lcom/bamtech/sdk4/content/ContentExtension;)V", "addToWatchlist", "Lio/reactivex/Single;", "Lcom/bamtech/sdk4/content/GraphQlResponse;", "T", "type", "Ljava/lang/reflect/Type;", "contentIds", "", "", "contentTransactionId", "(Ljava/lang/reflect/Type;[Ljava/lang/String;Ljava/lang/String;)Lio/reactivex/Single;", "", "clearWatchlist", "getWatchlist", "removeFromWatchlist", "Companion", "plugin-content"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: WatchlistApi.kt */
public final class DefaultWatchlistApi implements WatchlistApi {

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0007"}, mo31007d2 = {"Lcom/bamtech/sdk4/content/watchlist/DefaultWatchlistApi$Companion;", "", "()V", "DUST_CONTENT_TRANSACTION_ID", "", "DUST_CONTEXT", "DUST_QUERY_ID", "plugin-content"}, mo31008k = 1, mo31009mv = {1, 1, 15})
    /* compiled from: WatchlistApi.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        new Companion(null);
    }

    public DefaultWatchlistApi(Provider<ServiceTransaction> provider, ContentExtension contentExtension) {
    }
}
