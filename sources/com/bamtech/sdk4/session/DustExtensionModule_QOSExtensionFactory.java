package com.bamtech.sdk4.session;

import com.bamtech.sdk4.internal.telemetry.EventBuffer;
import com.bamtech.sdk4.plugin.PluginRegistry;
import com.bamtech.shadow.dagger.p048a.C2111c;
import com.bamtech.shadow.dagger.p048a.C2113e;
import javax.inject.Provider;

public final class DustExtensionModule_QOSExtensionFactory implements C2111c<EventBuffer> {
    private final DustExtensionModule module;
    private final Provider<PluginRegistry> registryProvider;

    public DustExtensionModule_QOSExtensionFactory(DustExtensionModule dustExtensionModule, Provider<PluginRegistry> provider) {
        this.module = dustExtensionModule;
        this.registryProvider = provider;
    }

    public static DustExtensionModule_QOSExtensionFactory create(DustExtensionModule dustExtensionModule, Provider<PluginRegistry> provider) {
        return new DustExtensionModule_QOSExtensionFactory(dustExtensionModule, provider);
    }

    public static EventBuffer proxyQOSExtension(DustExtensionModule dustExtensionModule, PluginRegistry pluginRegistry) {
        EventBuffer QOSExtension = dustExtensionModule.QOSExtension(pluginRegistry);
        C2113e.m8178a(QOSExtension, "Cannot return null from a non-@Nullable @Provides method");
        return QOSExtension;
    }

    public EventBuffer get() {
        EventBuffer QOSExtension = this.module.QOSExtension((PluginRegistry) this.registryProvider.get());
        C2113e.m8178a(QOSExtension, "Cannot return null from a non-@Nullable @Provides method");
        return QOSExtension;
    }
}
