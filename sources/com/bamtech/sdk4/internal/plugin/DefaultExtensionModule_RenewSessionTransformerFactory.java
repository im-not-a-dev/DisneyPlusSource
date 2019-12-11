package com.bamtech.sdk4.internal.plugin;

import com.bamtech.sdk4.plugin.PluginRegistry;
import com.bamtech.sdk4.session.RenewSessionTransformers;
import com.bamtech.shadow.dagger.p048a.C2111c;
import com.bamtech.shadow.dagger.p048a.C2113e;
import javax.inject.Provider;

public final class DefaultExtensionModule_RenewSessionTransformerFactory implements C2111c<RenewSessionTransformers> {
    private final DefaultExtensionModule module;
    private final Provider<PluginRegistry> registryProvider;

    public DefaultExtensionModule_RenewSessionTransformerFactory(DefaultExtensionModule defaultExtensionModule, Provider<PluginRegistry> provider) {
        this.module = defaultExtensionModule;
        this.registryProvider = provider;
    }

    public static DefaultExtensionModule_RenewSessionTransformerFactory create(DefaultExtensionModule defaultExtensionModule, Provider<PluginRegistry> provider) {
        return new DefaultExtensionModule_RenewSessionTransformerFactory(defaultExtensionModule, provider);
    }

    public RenewSessionTransformers get() {
        RenewSessionTransformers renewSessionTransformer = this.module.renewSessionTransformer((PluginRegistry) this.registryProvider.get());
        C2113e.m8178a(renewSessionTransformer, "Cannot return null from a non-@Nullable @Provides method");
        return renewSessionTransformer;
    }
}
