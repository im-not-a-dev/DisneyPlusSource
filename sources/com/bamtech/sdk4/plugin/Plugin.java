package com.bamtech.sdk4.plugin;

import kotlin.Metadata;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000 \t2\u00020\u0001:\u0001\tJ\u001c\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007H&J\b\u0010\b\u001a\u00020\u0003H\u0016¨\u0006\n"}, mo31007d2 = {"Lcom/bamtech/sdk4/plugin/Plugin;", "", "initialize", "", "registry", "Lcom/bamtech/sdk4/plugin/PluginRegistry;", "extra", "Lcom/bamtech/sdk4/plugin/PluginExtra;", "onReady", "Companion", "sdk-plugin-api"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: Plugin.kt */
public interface Plugin {

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, mo31007d2 = {"Lcom/bamtech/sdk4/plugin/Plugin$Companion;", "", "()V", "MISSING_REQUIRED_EXTRA_CODE", "", "sdk-plugin-api"}, mo31008k = 1, mo31009mv = {1, 1, 15})
    /* compiled from: Plugin.kt */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }
    }

    @Metadata(mo31005bv = {1, 0, 3}, mo31008k = 3, mo31009mv = {1, 1, 15})
    /* compiled from: Plugin.kt */
    public static final class DefaultImpls {
        public static void onReady(Plugin plugin) {
        }
    }

    static {
        Companion companion = Companion.$$INSTANCE;
    }

    void initialize(PluginRegistry pluginRegistry, PluginExtra pluginExtra);

    void onReady();
}
