package com.bamtech.sdk4.internal.configuration;

import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u0007\b\u0010¢\u0006\u0002\u0010\u0002B\u0019\u0012\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\u0010\u0006J\u000e\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u0005R\u001d\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\f"}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/configuration/ContentExtras;", "Lcom/bamtech/sdk4/internal/configuration/ServiceExtras;", "()V", "queryIdDefaults", "", "", "(Ljava/util/Map;)V", "getQueryIdDefaults", "()Ljava/util/Map;", "getQueryIdValue", "queryId", "Companion", "sdk-configuration"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: ContentExtras.kt */
public final class ContentExtras implements ServiceExtras {
    private static final Map<String, String> defaults = C13173j0.m40356a(new Pair("clearBookmarks", "core/DeleteAllBookmarks"), new Pair("deleteBookmarks", "core/DeleteBookmarks"), new Pair("getBookmarks", "core/Bookmarks"), new Pair("addToWatchlist", "core/AddToWatchlist"), new Pair("getWatchlist", "core/Watchlist"), new Pair("clearWatchlist", "core/ClearWatchlist"), new Pair("removeFromWatchlist", "core/DeleteFromWatchlist"));
    private final Map<String, String> queryIdDefaults;

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010$\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u001d\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0013¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/configuration/ContentExtras$Companion;", "", "()V", "ADD_TO_WATCHLIST_DEFAULT", "", "ADD_TO_WATCHLIST_KEY", "CLEAR_BOOKMARKS_DEFAULT", "CLEAR_BOOKMARKS_KEY", "CLEAR_WATCHLIST_DEFAULT", "CLEAR_WATCHLIST_KEY", "DELETE_BOOKMARKS_DEFAULT", "DELETE_BOOKMARKS_KEY", "GET_BOOKMARKS_DEFAULT", "GET_BOOKMARKS_KEY", "GET_WATCHLIST_DEFAULT", "GET_WATCHLIST_KEY", "REMOVE_FROM_WATCHLIST_DEFAULT", "REMOVE_FROM_WATCHLIST_KEY", "defaults", "", "getDefaults", "()Ljava/util/Map;", "sdk-configuration"}, mo31008k = 1, mo31009mv = {1, 1, 15})
    /* compiled from: ContentExtras.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: used method not loaded: kotlin.y.j0.a(kotlin.Pair[]):null, types can be incorrect */
    static {
        new Companion(null);
    }

    public ContentExtras(Map<String, String> map) {
        this.queryIdDefaults = map;
    }

    public final String getQueryIdValue(String str) {
        String str2 = (String) this.queryIdDefaults.get(str);
        if (str2 == null) {
            str2 = (String) defaults.get(str);
        }
        return str2 != null ? str2 : str;
    }

    public ContentExtras() {
        this(C13173j0.m40350a());
    }
}
