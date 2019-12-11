package com.bamtech.sdk4.useractivity.internal;

import com.bamtech.sdk4.internal.plugin.DefaultExtensionModule;
import com.bamtech.sdk4.internal.plugin.DefaultExtensionModule_GetExtensionFactory;
import com.bamtech.sdk4.internal.plugin.DefaultExtensionModule_ServiceTransactionFactory;
import com.bamtech.sdk4.internal.telemetry.EventBuffer;
import com.bamtech.sdk4.plugin.PluginRegistry;
import com.bamtech.sdk4.session.DustExtensionModule;
import com.bamtech.sdk4.session.DustExtensionModule_GlimpseExtensionFactory;
import com.bamtech.sdk4.useractivity.DefaultUserActivityApi_Factory;
import com.bamtech.sdk4.useractivity.UserActivityApi;
import com.bamtech.sdk4.useractivity.UserActivityPlugin;
import com.bamtech.sdk4.useractivity.UserActivityPlugin_MembersInjector;
import com.bamtech.shadow.dagger.p048a.C2110b;
import com.bamtech.shadow.dagger.p048a.C2112d;
import com.bamtech.shadow.dagger.p048a.C2113e;
import javax.inject.Provider;

public final class DaggerUserActivityComponent implements UserActivityComponent {
    private Provider<EventBuffer> GlimpseExtensionProvider;
    private Provider<UserActivityApi> bindUserActivityApiProvider;
    private DefaultUserActivityApi_Factory defaultUserActivityApiProvider;
    private DefaultExtensionModule_GetExtensionFactory getExtensionProvider;
    private Provider<PluginRegistry> registryProvider;
    private DefaultExtensionModule_ServiceTransactionFactory serviceTransactionProvider;

    private static final class Builder implements com.bamtech.sdk4.useractivity.internal.UserActivityComponent.Builder {
        /* access modifiers changed from: private */
        public DefaultExtensionModule defaultExtensionModule;
        /* access modifiers changed from: private */
        public DustExtensionModule dustExtensionModule;
        /* access modifiers changed from: private */
        public PluginRegistry registry;

        private Builder() {
        }

        public UserActivityComponent build() {
            if (this.defaultExtensionModule == null) {
                this.defaultExtensionModule = new DefaultExtensionModule();
            }
            if (this.dustExtensionModule == null) {
                this.dustExtensionModule = new DustExtensionModule();
            }
            if (this.registry != null) {
                return new DaggerUserActivityComponent(this);
            }
            StringBuilder sb = new StringBuilder();
            sb.append(PluginRegistry.class.getCanonicalName());
            sb.append(" must be set");
            throw new IllegalStateException(sb.toString());
        }

        public Builder registry(PluginRegistry pluginRegistry) {
            C2113e.m8177a(pluginRegistry);
            this.registry = pluginRegistry;
            return this;
        }
    }

    public static com.bamtech.sdk4.useractivity.internal.UserActivityComponent.Builder builder() {
        return new Builder();
    }

    private void initialize(Builder builder) {
        this.registryProvider = C2112d.m8174a(builder.registry);
        this.serviceTransactionProvider = DefaultExtensionModule_ServiceTransactionFactory.create(builder.defaultExtensionModule, this.registryProvider);
        this.GlimpseExtensionProvider = C2110b.m8173b(DustExtensionModule_GlimpseExtensionFactory.create(builder.dustExtensionModule, this.registryProvider));
        this.getExtensionProvider = DefaultExtensionModule_GetExtensionFactory.create(builder.defaultExtensionModule, this.registryProvider);
        this.defaultUserActivityApiProvider = DefaultUserActivityApi_Factory.create(this.serviceTransactionProvider, this.GlimpseExtensionProvider, this.getExtensionProvider);
        this.bindUserActivityApiProvider = C2110b.m8173b(this.defaultUserActivityApiProvider);
    }

    private UserActivityPlugin injectUserActivityPlugin(UserActivityPlugin userActivityPlugin) {
        UserActivityPlugin_MembersInjector.injectApi(userActivityPlugin, (UserActivityApi) this.bindUserActivityApiProvider.get());
        return userActivityPlugin;
    }

    public void inject(UserActivityPlugin userActivityPlugin) {
        injectUserActivityPlugin(userActivityPlugin);
    }

    private DaggerUserActivityComponent(Builder builder) {
        initialize(builder);
    }
}
