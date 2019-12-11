package com.bamtech.sdk4.session;

import com.bamtech.sdk4.internal.telemetry.EventBuffer;
import com.bamtech.sdk4.plugin.PluginRegistry;
import com.bamtech.shadow.dagger.p048a.C2111c;
import com.bamtech.shadow.dagger.p048a.C2113e;
import javax.inject.Provider;

public final class DustExtensionModule_GlimpseExtensionFactory implements C2111c<EventBuffer> {
    private final DustExtensionModule module;
    private final Provider<PluginRegistry> registryProvider;

    public DustExtensionModule_GlimpseExtensionFactory(DustExtensionModule dustExtensionModule, Provider<PluginRegistry> provider) {
        this.module = dustExtensionModule;
        this.registryProvider = provider;
    }

    public static DustExtensionModule_GlimpseExtensionFactory create(DustExtensionModule dustExtensionModule, Provider<PluginRegistry> provider) {
        return new DustExtensionModule_GlimpseExtensionFactory(dustExtensionModule, provider);
    }

    public static EventBuffer proxyGlimpseExtension(DustExtensionModule dustExtensionModule, PluginRegistry pluginRegistry) {
        EventBuffer GlimpseExtension = dustExtensionModule.GlimpseExtension(pluginRegistry);
        C2113e.m8178a(GlimpseExtension, "Cannot return null from a non-@Nullable @Provides method");
        return GlimpseExtension;
    }

    public EventBuffer get() {
        EventBuffer GlimpseExtension = this.module.GlimpseExtension((PluginRegistry) this.registryProvider.get());
        C2113e.m8178a(GlimpseExtension, "Cannot return null from a non-@Nullable @Provides method");
        return GlimpseExtension;
    }
}
