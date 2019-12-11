package com.bamtech.sdk4.internal.account.legacy;

import com.bamtech.sdk4.account.legacy.LegacyAccountExtension;
import com.bamtech.sdk4.plugin.PluginRegistry;
import com.bamtech.shadow.dagger.p048a.C2111c;
import com.bamtech.shadow.dagger.p048a.C2113e;
import javax.inject.Provider;

public final class LegacyExtensionModule_AccountExtensionFactory implements C2111c<LegacyAccountExtension> {
    private final Provider<PluginRegistry> pluginRegistryProvider;

    public LegacyExtensionModule_AccountExtensionFactory(Provider<PluginRegistry> provider) {
        this.pluginRegistryProvider = provider;
    }

    public static LegacyExtensionModule_AccountExtensionFactory create(Provider<PluginRegistry> provider) {
        return new LegacyExtensionModule_AccountExtensionFactory(provider);
    }

    public LegacyAccountExtension get() {
        LegacyAccountExtension accountExtension = LegacyExtensionModule.accountExtension(this.pluginRegistryProvider);
        C2113e.m8178a(accountExtension, "Cannot return null from a non-@Nullable @Provides method");
        return accountExtension;
    }
}
