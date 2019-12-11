package com.bamtech.sdk4.session;

import com.bamtech.sdk4.internal.token.AccessTokenProvider;
import com.bamtech.sdk4.plugin.PluginRegistry;
import com.bamtech.shadow.dagger.p048a.C2111c;
import com.bamtech.shadow.dagger.p048a.C2113e;
import javax.inject.Provider;

public final class AccessTokenProviderModule_AccessTokenProviderFactory implements C2111c<AccessTokenProvider> {
    private final AccessTokenProviderModule module;
    private final Provider<PluginRegistry> registryProvider;

    public AccessTokenProviderModule_AccessTokenProviderFactory(AccessTokenProviderModule accessTokenProviderModule, Provider<PluginRegistry> provider) {
        this.module = accessTokenProviderModule;
        this.registryProvider = provider;
    }

    public static AccessTokenProviderModule_AccessTokenProviderFactory create(AccessTokenProviderModule accessTokenProviderModule, Provider<PluginRegistry> provider) {
        return new AccessTokenProviderModule_AccessTokenProviderFactory(accessTokenProviderModule, provider);
    }

    public static AccessTokenProvider proxyAccessTokenProvider(AccessTokenProviderModule accessTokenProviderModule, PluginRegistry pluginRegistry) {
        AccessTokenProvider accessTokenProvider = accessTokenProviderModule.accessTokenProvider(pluginRegistry);
        C2113e.m8178a(accessTokenProvider, "Cannot return null from a non-@Nullable @Provides method");
        return accessTokenProvider;
    }

    public AccessTokenProvider get() {
        AccessTokenProvider accessTokenProvider = this.module.accessTokenProvider((PluginRegistry) this.registryProvider.get());
        C2113e.m8178a(accessTokenProvider, "Cannot return null from a non-@Nullable @Provides method");
        return accessTokenProvider;
    }
}
