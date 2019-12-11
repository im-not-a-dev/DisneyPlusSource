package com.bamtech.sdk4.internal.session;

import com.bamtech.sdk4.internal.plugin.AuthenticationExpiredCallbackExtension;
import com.bamtech.sdk4.plugin.PluginRegistry;
import com.bamtech.shadow.dagger.p048a.C2111c;
import com.bamtech.shadow.dagger.p048a.C2113e;
import javax.inject.Provider;

public final class SessionRenewalModule_AuthorizerExtensionFactory implements C2111c<AuthenticationExpiredCallbackExtension> {
    private final Provider<PluginRegistry> pluginRegistryProvider;

    public SessionRenewalModule_AuthorizerExtensionFactory(Provider<PluginRegistry> provider) {
        this.pluginRegistryProvider = provider;
    }

    public static SessionRenewalModule_AuthorizerExtensionFactory create(Provider<PluginRegistry> provider) {
        return new SessionRenewalModule_AuthorizerExtensionFactory(provider);
    }

    public AuthenticationExpiredCallbackExtension get() {
        AuthenticationExpiredCallbackExtension authorizerExtension = SessionRenewalModule.authorizerExtension(this.pluginRegistryProvider);
        C2113e.m8178a(authorizerExtension, "Cannot return null from a non-@Nullable @Provides method");
        return authorizerExtension;
    }
}
