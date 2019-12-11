package com.bamtech.sdk4.internal.plugin;

import com.bamtech.sdk4.plugin.PluginRegistry;
import com.bamtech.shadow.dagger.p048a.C2111c;
import com.bamtech.shadow.dagger.p048a.C2113e;
import javax.inject.Provider;
import okhttp3.OkHttpClient.Builder;

public final class DefaultExtensionModule_OkHttpBuilderFactory implements C2111c<Builder> {
    private final DefaultExtensionModule module;
    private final Provider<PluginRegistry> registryProvider;

    public DefaultExtensionModule_OkHttpBuilderFactory(DefaultExtensionModule defaultExtensionModule, Provider<PluginRegistry> provider) {
        this.module = defaultExtensionModule;
        this.registryProvider = provider;
    }

    public static DefaultExtensionModule_OkHttpBuilderFactory create(DefaultExtensionModule defaultExtensionModule, Provider<PluginRegistry> provider) {
        return new DefaultExtensionModule_OkHttpBuilderFactory(defaultExtensionModule, provider);
    }

    public Builder get() {
        Builder okHttpBuilder = this.module.okHttpBuilder((PluginRegistry) this.registryProvider.get());
        C2113e.m8178a(okHttpBuilder, "Cannot return null from a non-@Nullable @Provides method");
        return okHttpBuilder;
    }
}
