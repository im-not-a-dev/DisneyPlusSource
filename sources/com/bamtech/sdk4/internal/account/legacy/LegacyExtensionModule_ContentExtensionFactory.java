package com.bamtech.sdk4.internal.account.legacy;

import com.bamtech.sdk4.account.legacy.LegacyContextExtension;
import com.bamtech.sdk4.plugin.PluginRegistry;
import com.bamtech.shadow.dagger.p048a.C2111c;
import com.bamtech.shadow.dagger.p048a.C2113e;
import javax.inject.Provider;

public final class LegacyExtensionModule_ContentExtensionFactory implements C2111c<LegacyContextExtension> {
    private final Provider<PluginRegistry> pluginRegistryProvider;

    public LegacyExtensionModule_ContentExtensionFactory(Provider<PluginRegistry> provider) {
        this.pluginRegistryProvider = provider;
    }

    public static LegacyExtensionModule_ContentExtensionFactory create(Provider<PluginRegistry> provider) {
        return new LegacyExtensionModule_ContentExtensionFactory(provider);
    }

    public LegacyContextExtension get() {
        LegacyContextExtension contentExtension = LegacyExtensionModule.contentExtension(this.pluginRegistryProvider);
        C2113e.m8178a(contentExtension, "Cannot return null from a non-@Nullable @Provides method");
        return contentExtension;
    }
}
