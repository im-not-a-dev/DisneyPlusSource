package com.bamtech.sdk4.internal.bookmarks;

import android.content.Context;
import com.bamtech.sdk4.bookmarks.BookmarkPlugin;
import com.bamtech.sdk4.plugin.PluginRegistry;
import kotlin.Metadata;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\ba\u0018\u00002\u00020\u0001:\u0001\u0006J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0007"}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/bookmarks/BookmarksPluginComponent;", "", "inject", "", "bookmarkPlugin", "Lcom/bamtech/sdk4/bookmarks/BookmarkPlugin;", "Builder", "plugin-bookmarks_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: BookmarksPluginComponent.kt */
public interface BookmarksPluginComponent {

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0005H'J\u0010\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\bH'¨\u0006\t"}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/bookmarks/BookmarksPluginComponent$Builder;", "", "build", "Lcom/bamtech/sdk4/internal/bookmarks/BookmarksPluginComponent;", "context", "Landroid/content/Context;", "registry", "pluginRegistry", "Lcom/bamtech/sdk4/plugin/PluginRegistry;", "plugin-bookmarks_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
    /* compiled from: BookmarksPluginComponent.kt */
    public interface Builder {
        BookmarksPluginComponent build();

        Builder context(Context context);

        Builder registry(PluginRegistry pluginRegistry);
    }

    void inject(BookmarkPlugin bookmarkPlugin);
}
