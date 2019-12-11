package com.bamtech.sdk4.plugin;

import kotlin.Metadata;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J'\u0010\u0002\u001a\u0002H\u0003\"\b\b\u0000\u0010\u0003*\u00020\u00042\u000e\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u0002H\u00030\u0006H&¢\u0006\u0002\u0010\u0007J-\u0010\b\u001a\u00020\t\"\b\b\u0000\u0010\u0003*\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00030\u00062\u0006\u0010\n\u001a\u0002H\u0003H&¢\u0006\u0002\u0010\u000b¨\u0006\f"}, mo31007d2 = {"Lcom/bamtech/sdk4/plugin/PluginApiRegistry;", "", "getPluginApi", "PLUGIN_API", "Lcom/bamtech/sdk4/plugin/PluginApi;", "type", "Ljava/lang/Class;", "(Ljava/lang/Class;)Lcom/bamtech/sdk4/plugin/PluginApi;", "registerPluginApi", "", "api", "(Ljava/lang/Class;Lcom/bamtech/sdk4/plugin/PluginApi;)V", "sdk-plugin-api"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: PluginApiRegistry.kt */
public interface PluginApiRegistry {
    <PLUGIN_API extends PluginApi> PLUGIN_API getPluginApi(Class<? extends PLUGIN_API> cls);

    <PLUGIN_API extends PluginApi> void registerPluginApi(Class<PLUGIN_API> cls, PLUGIN_API plugin_api);
}
