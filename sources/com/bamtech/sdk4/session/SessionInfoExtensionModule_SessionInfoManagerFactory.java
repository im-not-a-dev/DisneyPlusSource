package com.bamtech.sdk4.session;

import com.bamtech.sdk4.plugin.PluginRegistry;
import com.bamtech.shadow.dagger.p048a.C2111c;
import com.bamtech.shadow.dagger.p048a.C2113e;
import javax.inject.Provider;

public final class SessionInfoExtensionModule_SessionInfoManagerFactory implements C2111c<SessionInfoExtension> {
    private final SessionInfoExtensionModule module;
    private final Provider<PluginRegistry> registryProvider;

    public SessionInfoExtensionModule_SessionInfoManagerFactory(SessionInfoExtensionModule sessionInfoExtensionModule, Provider<PluginRegistry> provider) {
        this.module = sessionInfoExtensionModule;
        this.registryProvider = provider;
    }

    public static SessionInfoExtensionModule_SessionInfoManagerFactory create(SessionInfoExtensionModule sessionInfoExtensionModule, Provider<PluginRegistry> provider) {
        return new SessionInfoExtensionModule_SessionInfoManagerFactory(sessionInfoExtensionModule, provider);
    }

    public static SessionInfoExtension proxySessionInfoManager(SessionInfoExtensionModule sessionInfoExtensionModule, PluginRegistry pluginRegistry) {
        SessionInfoExtension sessionInfoManager = sessionInfoExtensionModule.sessionInfoManager(pluginRegistry);
        C2113e.m8178a(sessionInfoManager, "Cannot return null from a non-@Nullable @Provides method");
        return sessionInfoManager;
    }

    public SessionInfoExtension get() {
        SessionInfoExtension sessionInfoManager = this.module.sessionInfoManager((PluginRegistry) this.registryProvider.get());
        C2113e.m8178a(sessionInfoManager, "Cannot return null from a non-@Nullable @Provides method");
        return sessionInfoManager;
    }
}
