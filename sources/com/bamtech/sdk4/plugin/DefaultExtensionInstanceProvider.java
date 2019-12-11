package com.bamtech.sdk4.plugin;

import kotlin.Metadata;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J'\u0010\u0007\u001a\u0004\u0018\u0001H\b\"\b\b\u0000\u0010\b*\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\b0\u000bH\u0016¢\u0006\u0002\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\r"}, mo31007d2 = {"Lcom/bamtech/sdk4/plugin/DefaultExtensionInstanceProvider;", "Lcom/bamtech/sdk4/plugin/ExtensionInstanceProvider;", "registry", "Lcom/bamtech/sdk4/plugin/PluginRegistry;", "(Lcom/bamtech/sdk4/plugin/PluginRegistry;)V", "getRegistry", "()Lcom/bamtech/sdk4/plugin/PluginRegistry;", "get", "T", "Lcom/bamtech/sdk4/plugin/Extension;", "type", "Ljava/lang/Class;", "(Ljava/lang/Class;)Lcom/bamtech/sdk4/plugin/Extension;", "sdk-plugin-api"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: PluginRegistry.kt */
public final class DefaultExtensionInstanceProvider implements ExtensionInstanceProvider {
    private final PluginRegistry registry;

    public DefaultExtensionInstanceProvider(PluginRegistry pluginRegistry) {
        this.registry = pluginRegistry;
    }

    public <T extends Extension> T get(Class<T> cls) {
        if (this.registry.hasExtension(cls)) {
            return this.registry.getExtension(cls);
        }
        return null;
    }
}
