package com.bamtech.sdk4.internal.account.legacy;

import com.bamtech.sdk4.account.legacy.LegacyAccountExtension;
import com.bamtech.sdk4.account.legacy.LegacyContextExtension;
import com.bamtech.sdk4.plugin.PluginRegistry;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.C12880j;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0007J\u0016\u0010\b\u001a\u00020\t2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0007¨\u0006\n"}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/account/legacy/LegacyExtensionModule;", "", "()V", "accountExtension", "Lcom/bamtech/sdk4/account/legacy/LegacyAccountExtension;", "pluginRegistry", "Ljavax/inject/Provider;", "Lcom/bamtech/sdk4/plugin/PluginRegistry;", "contentExtension", "Lcom/bamtech/sdk4/account/legacy/LegacyContextExtension;", "extension-legacy"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: LegacyExtensionModule.kt */
public final class LegacyExtensionModule {
    static {
        new LegacyExtensionModule();
    }

    private LegacyExtensionModule() {
    }

    public static final LegacyAccountExtension accountExtension(Provider<PluginRegistry> provider) {
        Object obj = provider.get();
        C12880j.m40222a(obj, "pluginRegistry.get()");
        return (LegacyAccountExtension) ((PluginRegistry) obj).getExtension(LegacyAccountExtension.class);
    }

    public static final LegacyContextExtension contentExtension(Provider<PluginRegistry> provider) {
        Object obj = provider.get();
        C12880j.m40222a(obj, "pluginRegistry.get()");
        return (LegacyContextExtension) ((PluginRegistry) obj).getExtension(LegacyContextExtension.class);
    }
}
