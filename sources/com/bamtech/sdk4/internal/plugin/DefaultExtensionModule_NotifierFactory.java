package com.bamtech.sdk4.internal.plugin;

import com.bamtech.sdk4.internal.event.LogoutMode;
import com.bamtech.sdk4.plugin.PluginRegistry;
import com.bamtech.shadow.dagger.p048a.C2111c;
import com.bamtech.shadow.dagger.p048a.C2113e;
import javax.inject.Provider;
import p520io.reactivex.subjects.PublishSubject;

public final class DefaultExtensionModule_NotifierFactory implements C2111c<PublishSubject<LogoutMode>> {
    private final DefaultExtensionModule module;
    private final Provider<PluginRegistry> registryProvider;

    public DefaultExtensionModule_NotifierFactory(DefaultExtensionModule defaultExtensionModule, Provider<PluginRegistry> provider) {
        this.module = defaultExtensionModule;
        this.registryProvider = provider;
    }

    public static DefaultExtensionModule_NotifierFactory create(DefaultExtensionModule defaultExtensionModule, Provider<PluginRegistry> provider) {
        return new DefaultExtensionModule_NotifierFactory(defaultExtensionModule, provider);
    }

    public PublishSubject<LogoutMode> get() {
        PublishSubject<LogoutMode> notifier = this.module.notifier((PluginRegistry) this.registryProvider.get());
        C2113e.m8178a(notifier, "Cannot return null from a non-@Nullable @Provides method");
        return notifier;
    }
}
