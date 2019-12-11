package com.bamtech.sdk4.internal.plugin;

import com.bamtech.sdk4.plugin.Extension;
import com.bamtech.sdk4.plugin.PluginApi;
import com.bamtech.sdk4.plugin.PluginRegistry;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import kotlin.Metadata;
import kotlin.p590y.C13180m;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B\u0007\b\u0007¢\u0006\u0002\u0010\u0002J'\u0010\n\u001a\u0002H\u000b\"\b\b\u0000\u0010\u000b*\u00020\t2\u000e\u0010\f\u001a\n\u0012\u0006\b\u0001\u0012\u0002H\u000b0\u0005H\u0016¢\u0006\u0002\u0010\rJ(\u0010\u000e\u001a\b\u0012\u0004\u0012\u0002H\u000b0\u000f\"\b\b\u0000\u0010\u000b*\u00020\t2\u000e\u0010\f\u001a\n\u0012\u0006\b\u0001\u0012\u0002H\u000b0\u0005H\u0016J'\u0010\u0010\u001a\u0002H\u0011\"\b\b\u0000\u0010\u0011*\u00020\u00062\u000e\u0010\f\u001a\n\u0012\u0006\b\u0001\u0012\u0002H\u00110\u0005H\u0016¢\u0006\u0002\u0010\u0012J\"\u0010\u0013\u001a\u00020\u0014\"\b\b\u0000\u0010\u000b*\u00020\t2\u000e\u0010\f\u001a\n\u0012\u0006\b\u0001\u0012\u0002H\u000b0\u0005H\u0016J\u001f\u0010\u0015\u001a\u00020\u0016\"\b\b\u0000\u0010\u000b*\u00020\t2\u0006\u0010\u0017\u001a\u0002H\u000bH\u0016¢\u0006\u0002\u0010\u0018J-\u0010\u0019\u001a\u00020\u0016\"\b\b\u0000\u0010\u0011*\u00020\u00062\f\u0010\f\u001a\b\u0012\u0004\u0012\u0002H\u00110\u00052\u0006\u0010\u001a\u001a\u0002H\u0011H\u0016¢\u0006\u0002\u0010\u001bR\"\u0010\u0003\u001a\u0016\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u0005\u0012\u0004\u0012\u00020\u00060\u0004X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/plugin/DefaultPluginRegistry;", "Lcom/bamtech/sdk4/plugin/PluginRegistry;", "()V", "apiRegistry", "", "Ljava/lang/Class;", "Lcom/bamtech/sdk4/plugin/PluginApi;", "extensionRegistry", "", "Lcom/bamtech/sdk4/plugin/Extension;", "getExtension", "EXTENSION", "type", "(Ljava/lang/Class;)Lcom/bamtech/sdk4/plugin/Extension;", "getExtensions", "", "getPluginApi", "PLUGIN_API", "(Ljava/lang/Class;)Lcom/bamtech/sdk4/plugin/PluginApi;", "hasExtension", "", "registerExtension", "", "extension", "(Lcom/bamtech/sdk4/plugin/Extension;)V", "registerPluginApi", "api", "(Ljava/lang/Class;Lcom/bamtech/sdk4/plugin/PluginApi;)V", "sdk-core-api_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: DefaultPluginRegistry.kt */
public final class DefaultPluginRegistry implements PluginRegistry {
    private final Map<Class<? extends PluginApi>, PluginApi> apiRegistry = new LinkedHashMap();
    private final Set<Extension> extensionRegistry = new LinkedHashSet();

    public <EXTENSION extends Extension> EXTENSION getExtension(Class<? extends EXTENSION> cls) {
        EXTENSION extension;
        Iterator it = this.extensionRegistry.iterator();
        while (true) {
            if (!it.hasNext()) {
                extension = null;
                break;
            }
            extension = it.next();
            if (cls.isAssignableFrom(((Extension) extension).getClass())) {
                break;
            }
        }
        EXTENSION extension2 = (Extension) extension;
        if (extension2 != null) {
            return extension2;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(cls.getName());
        sb.append(" is not a registered extension.");
        throw new IllegalArgumentException(sb.toString());
    }

    public <PLUGIN_API extends PluginApi> PLUGIN_API getPluginApi(Class<? extends PLUGIN_API> cls) {
        PLUGIN_API plugin_api = (PluginApi) this.apiRegistry.get(cls);
        if (plugin_api == null) {
            Map<Class<? extends PluginApi>, PluginApi> map = this.apiRegistry;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Entry entry : map.entrySet()) {
                if (cls.isAssignableFrom(((Class) entry.getKey()).getClass())) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            plugin_api = (PluginApi) C13199w.m40590g((Iterable) linkedHashMap.entrySet());
        }
        if (plugin_api != null) {
            return plugin_api;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(cls.getName());
        sb.append(" is not a registered extension.");
        throw new IllegalArgumentException(sb.toString());
    }

    public <EXTENSION extends Extension> boolean hasExtension(Class<? extends EXTENSION> cls) {
        int i;
        Set<Extension> set = this.extensionRegistry;
        if (!(set instanceof Collection) || !set.isEmpty()) {
            i = 0;
            for (Extension extension : set) {
                if (cls.isAssignableFrom(extension.getClass())) {
                    i++;
                    if (i < 0) {
                        C13180m.m40444b();
                        throw null;
                    }
                }
            }
        } else {
            i = 0;
        }
        if (i > 0) {
            return true;
        }
        return false;
    }

    public <EXTENSION extends Extension> void registerExtension(EXTENSION extension) {
        this.extensionRegistry.add(extension);
    }

    public <PLUGIN_API extends PluginApi> void registerPluginApi(Class<PLUGIN_API> cls, PLUGIN_API plugin_api) {
        this.apiRegistry.remove(cls);
        this.apiRegistry.put(cls, plugin_api);
    }
}
