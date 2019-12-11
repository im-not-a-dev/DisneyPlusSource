package com.bamtech.sdk4.plugin;

import kotlin.Metadata;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J'\u0010\u0002\u001a\u0004\u0018\u0001H\u0003\"\b\b\u0000\u0010\u0003*\u00020\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00030\u0005H&¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, mo31007d2 = {"Lcom/bamtech/sdk4/plugin/ExtensionInstanceProvider;", "Lcom/bamtech/sdk4/plugin/Extension;", "get", "T", "type", "Ljava/lang/Class;", "(Ljava/lang/Class;)Lcom/bamtech/sdk4/plugin/Extension;", "sdk-plugin-api"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: PluginRegistry.kt */
public interface ExtensionInstanceProvider extends Extension {
    <T extends Extension> T get(Class<T> cls);
}
