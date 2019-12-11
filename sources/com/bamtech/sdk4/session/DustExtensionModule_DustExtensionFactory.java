package com.bamtech.sdk4.session;

import com.bamtech.sdk4.internal.telemetry.EventBuffer;
import com.bamtech.sdk4.plugin.PluginRegistry;
import com.bamtech.shadow.dagger.p048a.C2111c;
import com.bamtech.shadow.dagger.p048a.C2113e;
import javax.inject.Provider;

public final class DustExtensionModule_DustExtensionFactory implements C2111c<EventBuffer> {
    private final DustExtensionModule module;
    private final Provider<PluginRegistry> registryProvider;

    public DustExtensionModule_DustExtensionFactory(DustExtensionModule dustExtensionModule, Provider<PluginRegistry> provider) {
        this.module = dustExtensionModule;
        this.registryProvider = provider;
    }

    public static DustExtensionModule_DustExtensionFactory create(DustExtensionModule dustExtensionModule, Provider<PluginRegistry> provider) {
        return new DustExtensionModule_DustExtensionFactory(dustExtensionModule, provider);
    }

    public static EventBuffer proxyDustExtension(DustExtensionModule dustExtensionModule, PluginRegistry pluginRegistry) {
        EventBuffer dustExtension = dustExtensionModule.dustExtension(pluginRegistry);
        C2113e.m8178a(dustExtension, "Cannot return null from a non-@Nullable @Provides method");
        return dustExtension;
    }

    public EventBuffer get() {
        EventBuffer dustExtension = this.module.dustExtension((PluginRegistry) this.registryProvider.get());
        C2113e.m8178a(dustExtension, "Cannot return null from a non-@Nullable @Provides method");
        return dustExtension;
    }
}
