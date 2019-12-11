package com.bamtech.sdk4;

import com.bamtech.sdk4.media.MediaApi;
import com.bamtech.sdk4.plugin.Plugin;
import com.bamtech.sdk4.plugin.PluginApi;
import com.bamtech.sdk4.plugin.PluginExtra;
import kotlin.Metadata;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J%\u0010\n\u001a\u0002H\u000b\"\b\b\u0000\u0010\u000b*\u00020\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u0002H\u000b0\u000eH&¢\u0006\u0002\u0010\u000fJ%\u0010\u0010\u001a\u0002H\u0011\"\b\b\u0000\u0010\u0011*\u00020\u00122\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u0002H\u00110\u000eH&¢\u0006\u0002\u0010\u0014J \u0010\u0015\u001a\u00020\u0016\"\b\b\u0000\u0010\u0017*\u00020\u00182\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u0002H\u00170\u000eH&J*\u0010\u0015\u001a\u00020\u0016\"\b\b\u0000\u0010\u0017*\u00020\u00182\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u0002H\u00170\u000e2\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH&R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\u001c"}, mo31007d2 = {"Lcom/bamtech/sdk4/SDK;", "", "customerServiceApi", "Lcom/bamtech/sdk4/customerservice/CustomerServiceApi;", "getCustomerServiceApi", "()Lcom/bamtech/sdk4/customerservice/CustomerServiceApi;", "mediaApi", "Lcom/bamtech/sdk4/media/MediaApi;", "getMediaApi", "()Lcom/bamtech/sdk4/media/MediaApi;", "getExtension", "EXTENSION", "Lcom/bamtech/sdk4/plugin/Extension;", "extension", "Ljava/lang/Class;", "(Ljava/lang/Class;)Lcom/bamtech/sdk4/plugin/Extension;", "getPluginApi", "PLUGIN_API", "Lcom/bamtech/sdk4/plugin/PluginApi;", "api", "(Ljava/lang/Class;)Lcom/bamtech/sdk4/plugin/PluginApi;", "initializePlugin", "", "PLUGIN", "Lcom/bamtech/sdk4/plugin/Plugin;", "plugin", "extra", "Lcom/bamtech/sdk4/plugin/PluginExtra;", "sdk-core-api_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: Session.kt */
public interface SDK {
    MediaApi getMediaApi();

    <PLUGIN_API extends PluginApi> PLUGIN_API getPluginApi(Class<PLUGIN_API> cls);

    <PLUGIN extends Plugin> void initializePlugin(Class<PLUGIN> cls, PluginExtra pluginExtra);
}
