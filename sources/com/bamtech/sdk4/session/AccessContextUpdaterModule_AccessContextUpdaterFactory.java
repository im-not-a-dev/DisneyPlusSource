package com.bamtech.sdk4.session;

import com.bamtech.sdk4.internal.token.AccessContextUpdater;
import com.bamtech.sdk4.plugin.PluginRegistry;
import com.bamtech.shadow.dagger.p048a.C2111c;
import com.bamtech.shadow.dagger.p048a.C2113e;
import javax.inject.Provider;

public final class AccessContextUpdaterModule_AccessContextUpdaterFactory implements C2111c<AccessContextUpdater> {
    private final AccessContextUpdaterModule module;
    private final Provider<PluginRegistry> registryProvider;

    public AccessContextUpdaterModule_AccessContextUpdaterFactory(AccessContextUpdaterModule accessContextUpdaterModule, Provider<PluginRegistry> provider) {
        this.module = accessContextUpdaterModule;
        this.registryProvider = provider;
    }

    public static AccessContextUpdaterModule_AccessContextUpdaterFactory create(AccessContextUpdaterModule accessContextUpdaterModule, Provider<PluginRegistry> provider) {
        return new AccessContextUpdaterModule_AccessContextUpdaterFactory(accessContextUpdaterModule, provider);
    }

    public static AccessContextUpdater proxyAccessContextUpdater(AccessContextUpdaterModule accessContextUpdaterModule, PluginRegistry pluginRegistry) {
        AccessContextUpdater accessContextUpdater = accessContextUpdaterModule.accessContextUpdater(pluginRegistry);
        C2113e.m8178a(accessContextUpdater, "Cannot return null from a non-@Nullable @Provides method");
        return accessContextUpdater;
    }

    public AccessContextUpdater get() {
        AccessContextUpdater accessContextUpdater = this.module.accessContextUpdater((PluginRegistry) this.registryProvider.get());
        C2113e.m8178a(accessContextUpdater, "Cannot return null from a non-@Nullable @Provides method");
        return accessContextUpdater;
    }
}
