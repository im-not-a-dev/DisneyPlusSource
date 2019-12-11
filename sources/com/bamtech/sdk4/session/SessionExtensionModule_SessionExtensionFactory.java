package com.bamtech.sdk4.session;

import com.bamtech.shadow.dagger.p048a.C2111c;
import com.bamtech.shadow.dagger.p048a.C2113e;
import javax.inject.Provider;

public final class SessionExtensionModule_SessionExtensionFactory implements C2111c<SessionExtension> {
    private final SessionExtensionModule module;
    private final Provider<ReauthorizationHandlerRegistry> reauthorizationHandlerRegistryProvider;
    private final Provider<DefaultSessionExtension> sessionExtensionProvider;

    public SessionExtensionModule_SessionExtensionFactory(SessionExtensionModule sessionExtensionModule, Provider<DefaultSessionExtension> provider, Provider<ReauthorizationHandlerRegistry> provider2) {
        this.module = sessionExtensionModule;
        this.sessionExtensionProvider = provider;
        this.reauthorizationHandlerRegistryProvider = provider2;
    }

    public static SessionExtensionModule_SessionExtensionFactory create(SessionExtensionModule sessionExtensionModule, Provider<DefaultSessionExtension> provider, Provider<ReauthorizationHandlerRegistry> provider2) {
        return new SessionExtensionModule_SessionExtensionFactory(sessionExtensionModule, provider, provider2);
    }

    public static SessionExtension proxySessionExtension(SessionExtensionModule sessionExtensionModule, DefaultSessionExtension defaultSessionExtension, ReauthorizationHandlerRegistry reauthorizationHandlerRegistry) {
        SessionExtension sessionExtension = sessionExtensionModule.sessionExtension(defaultSessionExtension, reauthorizationHandlerRegistry);
        C2113e.m8178a(sessionExtension, "Cannot return null from a non-@Nullable @Provides method");
        return sessionExtension;
    }

    public SessionExtension get() {
        SessionExtension sessionExtension = this.module.sessionExtension((DefaultSessionExtension) this.sessionExtensionProvider.get(), (ReauthorizationHandlerRegistry) this.reauthorizationHandlerRegistryProvider.get());
        C2113e.m8178a(sessionExtension, "Cannot return null from a non-@Nullable @Provides method");
        return sessionExtension;
    }
}
