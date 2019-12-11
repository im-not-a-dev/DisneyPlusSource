package com.bamtech.sdk4.plugin;

import kotlin.Metadata;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J'\u0010\u0002\u001a\u0002H\u0003\"\b\b\u0000\u0010\u0003*\u00020\u00042\u000e\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u0002H\u00030\u0006H&¢\u0006\u0002\u0010\u0007J(\u0010\b\u001a\b\u0012\u0004\u0012\u0002H\u00030\t\"\b\b\u0000\u0010\u0003*\u00020\u00042\u000e\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u0002H\u00030\u0006H&J\"\u0010\n\u001a\u00020\u000b\"\b\b\u0000\u0010\u0003*\u00020\u00042\u000e\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u0002H\u00030\u0006H&J\u001f\u0010\f\u001a\u00020\r\"\b\b\u0000\u0010\u0003*\u00020\u00042\u0006\u0010\u000e\u001a\u0002H\u0003H&¢\u0006\u0002\u0010\u000f¨\u0006\u0010"}, mo31007d2 = {"Lcom/bamtech/sdk4/plugin/ExtensionRegistry;", "", "getExtension", "EXTENSION", "Lcom/bamtech/sdk4/plugin/Extension;", "type", "Ljava/lang/Class;", "(Ljava/lang/Class;)Lcom/bamtech/sdk4/plugin/Extension;", "getExtensions", "", "hasExtension", "", "registerExtension", "", "extension", "(Lcom/bamtech/sdk4/plugin/Extension;)V", "sdk-plugin-api"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: ExtensionRegistry.kt */
public interface ExtensionRegistry {
    <EXTENSION extends Extension> EXTENSION getExtension(Class<? extends EXTENSION> cls) throws IllegalArgumentException;

    <EXTENSION extends Extension> boolean hasExtension(Class<? extends EXTENSION> cls);

    <EXTENSION extends Extension> void registerExtension(EXTENSION extension);
}
