package com.bamtech.sdk4.session;

import com.bamtech.sdk4.internal.event.LogoutMode;
import com.bamtech.sdk4.plugin.PluginRegistry;
import com.bamtech.shadow.dagger.p048a.C2111c;
import com.bamtech.shadow.dagger.p048a.C2113e;
import javax.inject.Provider;
import p520io.reactivex.subjects.PublishSubject;

public final class LogoutNotifierModule_NotifierFactory implements C2111c<PublishSubject<LogoutMode>> {
    private final LogoutNotifierModule module;
    private final Provider<PluginRegistry> registryProvider;

    public LogoutNotifierModule_NotifierFactory(LogoutNotifierModule logoutNotifierModule, Provider<PluginRegistry> provider) {
        this.module = logoutNotifierModule;
        this.registryProvider = provider;
    }

    public static LogoutNotifierModule_NotifierFactory create(LogoutNotifierModule logoutNotifierModule, Provider<PluginRegistry> provider) {
        return new LogoutNotifierModule_NotifierFactory(logoutNotifierModule, provider);
    }

    public static PublishSubject<LogoutMode> proxyNotifier(LogoutNotifierModule logoutNotifierModule, PluginRegistry pluginRegistry) {
        PublishSubject<LogoutMode> notifier = logoutNotifierModule.notifier(pluginRegistry);
        C2113e.m8178a(notifier, "Cannot return null from a non-@Nullable @Provides method");
        return notifier;
    }

    public PublishSubject<LogoutMode> get() {
        PublishSubject<LogoutMode> notifier = this.module.notifier((PluginRegistry) this.registryProvider.get());
        C2113e.m8178a(notifier, "Cannot return null from a non-@Nullable @Provides method");
        return notifier;
    }
}
