package com.bamtech.sdk4.session;

import com.bamtech.sdk4.plugin.PluginRegistry;
import com.bamtech.shadow.dagger.p048a.C2111c;
import com.bamtech.shadow.dagger.p048a.C2113e;
import javax.inject.Provider;

public final class SessionApiExtensionModule_SessionApiFactory implements C2111c<SessionApi> {
    private final SessionApiExtensionModule module;
    private final Provider<PluginRegistry> registryProvider;

    public SessionApiExtensionModule_SessionApiFactory(SessionApiExtensionModule sessionApiExtensionModule, Provider<PluginRegistry> provider) {
        this.module = sessionApiExtensionModule;
        this.registryProvider = provider;
    }

    public static SessionApiExtensionModule_SessionApiFactory create(SessionApiExtensionModule sessionApiExtensionModule, Provider<PluginRegistry> provider) {
        return new SessionApiExtensionModule_SessionApiFactory(sessionApiExtensionModule, provider);
    }

    public static SessionApi proxySessionApi(SessionApiExtensionModule sessionApiExtensionModule, PluginRegistry pluginRegistry) {
        SessionApi sessionApi = sessionApiExtensionModule.sessionApi(pluginRegistry);
        C2113e.m8178a(sessionApi, "Cannot return null from a non-@Nullable @Provides method");
        return sessionApi;
    }

    public SessionApi get() {
        SessionApi sessionApi = this.module.sessionApi((PluginRegistry) this.registryProvider.get());
        C2113e.m8178a(sessionApi, "Cannot return null from a non-@Nullable @Provides method");
        return sessionApi;
    }
}
