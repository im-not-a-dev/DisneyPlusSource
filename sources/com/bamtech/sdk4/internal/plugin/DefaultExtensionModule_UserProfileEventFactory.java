package com.bamtech.sdk4.internal.plugin;

import com.bamtech.sdk4.internal.event.UserProfileEvent;
import com.bamtech.sdk4.plugin.PluginRegistry;
import com.bamtech.shadow.dagger.p048a.C2111c;
import com.bamtech.shadow.dagger.p048a.C2113e;
import javax.inject.Provider;
import p520io.reactivex.subjects.PublishSubject;

public final class DefaultExtensionModule_UserProfileEventFactory implements C2111c<PublishSubject<UserProfileEvent>> {
    private final DefaultExtensionModule module;
    private final Provider<PluginRegistry> registryProvider;

    public DefaultExtensionModule_UserProfileEventFactory(DefaultExtensionModule defaultExtensionModule, Provider<PluginRegistry> provider) {
        this.module = defaultExtensionModule;
        this.registryProvider = provider;
    }

    public static DefaultExtensionModule_UserProfileEventFactory create(DefaultExtensionModule defaultExtensionModule, Provider<PluginRegistry> provider) {
        return new DefaultExtensionModule_UserProfileEventFactory(defaultExtensionModule, provider);
    }

    public PublishSubject<UserProfileEvent> get() {
        PublishSubject<UserProfileEvent> userProfileEvent = this.module.userProfileEvent((PluginRegistry) this.registryProvider.get());
        C2113e.m8178a(userProfileEvent, "Cannot return null from a non-@Nullable @Provides method");
        return userProfileEvent;
    }
}
