package com.bamtech.sdk4.content;

import com.bamtech.sdk4.content.bookmark.BookmarkApi;
import com.bamtech.sdk4.content.custom.CustomContentApi;
import com.bamtech.sdk4.content.search.SearchApi;
import com.bamtech.sdk4.content.suggest.SearchSuggestApi;
import com.bamtech.sdk4.content.watchlist.WatchlistApi;
import com.bamtech.sdk4.internal.content.DaggerContentPluginComponent;
import com.bamtech.sdk4.plugin.Plugin;
import com.bamtech.sdk4.plugin.Plugin.DefaultImpls;
import com.bamtech.sdk4.plugin.PluginExtra;
import com.bamtech.sdk4.plugin.PluginRegistry;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001a\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0016R\u001e\u0010\u0003\u001a\u00020\u00048\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\u000f"}, mo31007d2 = {"Lcom/bamtech/sdk4/content/ContentPlugin;", "Lcom/bamtech/sdk4/plugin/Plugin;", "()V", "api", "Lcom/bamtech/sdk4/content/ContentApi;", "getApi$plugin_content", "()Lcom/bamtech/sdk4/content/ContentApi;", "setApi$plugin_content", "(Lcom/bamtech/sdk4/content/ContentApi;)V", "initialize", "", "registry", "Lcom/bamtech/sdk4/plugin/PluginRegistry;", "extra", "Lcom/bamtech/sdk4/plugin/PluginExtra;", "plugin-content"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: ContentPlugin.kt */
public final class ContentPlugin implements Plugin {
    public ContentApi api;

    public void initialize(PluginRegistry pluginRegistry, PluginExtra pluginExtra) {
        if (!(pluginExtra instanceof ContentPluginExtra)) {
            pluginExtra = null;
        }
        ContentPluginExtra contentPluginExtra = (ContentPluginExtra) pluginExtra;
        GraphQlResponseConverter converter$plugin_content = contentPluginExtra != null ? contentPluginExtra.getConverter$plugin_content() : null;
        DaggerContentPluginComponent.builder().registry(pluginRegistry).build().inject(this);
        String str = "api";
        if (converter$plugin_content != null) {
            ContentApi contentApi = this.api;
            if (contentApi != null) {
                contentApi.registerConverter(converter$plugin_content);
            } else {
                Intrinsics.throwUninitializedPropertyAccessException(str);
                throw null;
            }
        }
        ContentApi contentApi2 = this.api;
        if (contentApi2 != null) {
            pluginRegistry.registerPluginApi(ContentApi.class, contentApi2);
            ContentApi contentApi3 = this.api;
            if (contentApi3 != null) {
                pluginRegistry.registerPluginApi(SearchApi.class, contentApi3.getSearchApi());
                ContentApi contentApi4 = this.api;
                if (contentApi4 != null) {
                    pluginRegistry.registerPluginApi(SearchSuggestApi.class, contentApi4.getSearchSuggestApi());
                    ContentApi contentApi5 = this.api;
                    if (contentApi5 != null) {
                        pluginRegistry.registerPluginApi(BookmarkApi.class, contentApi5.getBookmarkApi());
                        ContentApi contentApi6 = this.api;
                        if (contentApi6 != null) {
                            pluginRegistry.registerPluginApi(WatchlistApi.class, contentApi6.getWatchlistApi());
                            ContentApi contentApi7 = this.api;
                            if (contentApi7 != null) {
                                pluginRegistry.registerPluginApi(CustomContentApi.class, contentApi7.getCustomApi());
                            } else {
                                Intrinsics.throwUninitializedPropertyAccessException(str);
                                throw null;
                            }
                        } else {
                            Intrinsics.throwUninitializedPropertyAccessException(str);
                            throw null;
                        }
                    } else {
                        Intrinsics.throwUninitializedPropertyAccessException(str);
                        throw null;
                    }
                } else {
                    Intrinsics.throwUninitializedPropertyAccessException(str);
                    throw null;
                }
            } else {
                Intrinsics.throwUninitializedPropertyAccessException(str);
                throw null;
            }
        } else {
            Intrinsics.throwUninitializedPropertyAccessException(str);
            throw null;
        }
    }

    public void onReady() {
        DefaultImpls.onReady(this);
    }
}
