package com.bamtech.sdk4.internal.plugin;

import com.bamtech.sdk4.internal.core.Storage;
import com.bamtech.sdk4.plugin.PluginRegistry;
import com.bamtech.shadow.dagger.p048a.C2111c;
import com.bamtech.shadow.dagger.p048a.C2113e;
import javax.inject.Provider;

public final class DefaultExtensionModule_StorageFactory implements C2111c<Storage> {
    private final DefaultExtensionModule module;
    private final Provider<PluginRegistry> registryProvider;

    public DefaultExtensionModule_StorageFactory(DefaultExtensionModule defaultExtensionModule, Provider<PluginRegistry> provider) {
        this.module = defaultExtensionModule;
        this.registryProvider = provider;
    }

    public static DefaultExtensionModule_StorageFactory create(DefaultExtensionModule defaultExtensionModule, Provider<PluginRegistry> provider) {
        return new DefaultExtensionModule_StorageFactory(defaultExtensionModule, provider);
    }

    public Storage get() {
        Storage storage = this.module.storage((PluginRegistry) this.registryProvider.get());
        C2113e.m8178a(storage, "Cannot return null from a non-@Nullable @Provides method");
        return storage;
    }
}
