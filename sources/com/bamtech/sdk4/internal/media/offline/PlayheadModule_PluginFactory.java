package com.bamtech.sdk4.internal.media.offline;

import com.bamtech.sdk4.internal.media.LocalPlayheadStore;
import com.bamtech.sdk4.plugin.PluginRegistry;
import com.bamtech.shadow.dagger.p048a.C2111c;
import com.bamtech.shadow.dagger.p048a.C2113e;
import javax.inject.Provider;

public final class PlayheadModule_PluginFactory implements C2111c<LocalPlayheadStore> {
    private final PlayheadModule module;
    private final Provider<PluginRegistry> registryProvider;

    public PlayheadModule_PluginFactory(PlayheadModule playheadModule, Provider<PluginRegistry> provider) {
        this.module = playheadModule;
        this.registryProvider = provider;
    }

    public static PlayheadModule_PluginFactory create(PlayheadModule playheadModule, Provider<PluginRegistry> provider) {
        return new PlayheadModule_PluginFactory(playheadModule, provider);
    }

    public LocalPlayheadStore get() {
        LocalPlayheadStore plugin = this.module.plugin((PluginRegistry) this.registryProvider.get());
        C2113e.m8178a(plugin, "Cannot return null from a non-@Nullable @Provides method");
        return plugin;
    }
}
