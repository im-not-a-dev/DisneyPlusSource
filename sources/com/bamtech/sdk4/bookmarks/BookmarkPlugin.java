package com.bamtech.sdk4.bookmarks;

import android.content.Context;
import com.bamtech.sdk4.internal.bookmarks.DaggerBookmarksPluginComponent;
import com.bamtech.sdk4.plugin.Plugin;
import com.bamtech.sdk4.plugin.Plugin.DefaultImpls;
import com.bamtech.sdk4.plugin.PluginExtra;
import com.bamtech.sdk4.plugin.PluginInitializationException;
import com.bamtech.sdk4.plugin.PluginRegistry;
import kotlin.TypeCastException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001a\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0016J\b\u0010\u000f\u001a\u00020\nH\u0016R\u001e\u0010\u0003\u001a\u00020\u00048\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\u0010"}, mo31007d2 = {"Lcom/bamtech/sdk4/bookmarks/BookmarkPlugin;", "Lcom/bamtech/sdk4/plugin/Plugin;", "()V", "api", "Lcom/bamtech/sdk4/bookmarks/BookmarksApi;", "getApi$plugin_bookmarks_release", "()Lcom/bamtech/sdk4/bookmarks/BookmarksApi;", "setApi$plugin_bookmarks_release", "(Lcom/bamtech/sdk4/bookmarks/BookmarksApi;)V", "initialize", "", "registry", "Lcom/bamtech/sdk4/plugin/PluginRegistry;", "extra", "Lcom/bamtech/sdk4/plugin/PluginExtra;", "onReady", "plugin-bookmarks_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: BookmarksPlugin.kt */
public final class BookmarkPlugin implements Plugin {
    public BookmarksApi api;

    public void initialize(PluginRegistry pluginRegistry, PluginExtra pluginExtra) {
        if (!(pluginExtra instanceof BookmarksPluginExtra)) {
            pluginExtra = null;
        }
        BookmarksPluginExtra bookmarksPluginExtra = (BookmarksPluginExtra) pluginExtra;
        if (bookmarksPluginExtra != null) {
            Context applicationContext = bookmarksPluginExtra.getApplicationContext();
            if (applicationContext != null) {
                DaggerBookmarksPluginComponent.builder().context(applicationContext).registry(pluginRegistry).build().inject(this);
                BookmarksApi bookmarksApi = this.api;
                if (bookmarksApi != null) {
                    pluginRegistry.registerPluginApi(BookmarksApi.class, bookmarksApi);
                    return;
                } else {
                    Intrinsics.throwUninitializedPropertyAccessException("api");
                    throw null;
                }
            }
        }
        throw new PluginInitializationException("The `BookmarksPlugin` requires an `BookmarksPluginExtra` be provided with the application context.", null, 2, null);
    }

    public void onReady() {
        DefaultImpls.onReady(this);
        BookmarksApi bookmarksApi = this.api;
        if (bookmarksApi == null) {
            Intrinsics.throwUninitializedPropertyAccessException("api");
            throw null;
        } else if (bookmarksApi != null) {
            ((DefaultBookmarkApi) bookmarksApi).purgeOnProfileChangeOrLogout$plugin_bookmarks_release();
        } else {
            throw new TypeCastException("null cannot be cast to non-null type com.bamtech.sdk4.bookmarks.DefaultBookmarkApi");
        }
    }
}
