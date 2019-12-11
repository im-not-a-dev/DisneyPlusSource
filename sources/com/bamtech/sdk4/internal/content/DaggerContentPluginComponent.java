package com.bamtech.sdk4.internal.content;

import com.bamtech.sdk4.content.ContentApi;
import com.bamtech.sdk4.content.ContentExtension;
import com.bamtech.sdk4.content.ContentPlugin;
import com.bamtech.sdk4.content.ContentPlugin_MembersInjector;
import com.bamtech.sdk4.content.DefaultContentApi_Factory;
import com.bamtech.sdk4.content.GraphQlConverterProvider;
import com.bamtech.sdk4.content.GraphQlConverterProvider_Factory;
import com.bamtech.sdk4.content.bookmark.BookmarkApi;
import com.bamtech.sdk4.content.bookmark.DefaultBookmarkApi_Factory;
import com.bamtech.sdk4.content.custom.DefaultCustomContentApi;
import com.bamtech.sdk4.content.custom.DefaultCustomContentApi_Factory;
import com.bamtech.sdk4.content.search.DefaultSearchApi_Factory;
import com.bamtech.sdk4.content.search.SearchApi;
import com.bamtech.sdk4.content.suggest.DefaultSearchSuggestApi;
import com.bamtech.sdk4.content.suggest.DefaultSearchSuggestApi_Factory;
import com.bamtech.sdk4.content.watchlist.DefaultWatchlistApi_Factory;
import com.bamtech.sdk4.content.watchlist.WatchlistApi;
import com.bamtech.sdk4.internal.configuration.ConfigurationProvider;
import com.bamtech.sdk4.internal.content.suggest.DefaultSearchSuggestClient_Factory;
import com.bamtech.sdk4.internal.content.suggest.DefaultSearchSuggestManager;
import com.bamtech.sdk4.internal.content.suggest.DefaultSearchSuggestManager_Factory;
import com.bamtech.sdk4.internal.content.suggest.SearchSuggestClient;
import com.bamtech.sdk4.internal.networking.ConverterProvider;
import com.bamtech.sdk4.internal.plugin.DefaultExtensionModule;
import com.bamtech.sdk4.internal.plugin.DefaultExtensionModule_ConfigurationFactory;
import com.bamtech.sdk4.internal.plugin.DefaultExtensionModule_ConverterProviderFactory;
import com.bamtech.sdk4.internal.plugin.DefaultExtensionModule_RenewSessionTransformerFactory;
import com.bamtech.sdk4.internal.plugin.DefaultExtensionModule_ServiceTransactionFactory;
import com.bamtech.sdk4.internal.token.AccessTokenProvider;
import com.bamtech.sdk4.plugin.PluginRegistry;
import com.bamtech.sdk4.session.AccessTokenProviderModule;
import com.bamtech.sdk4.session.AccessTokenProviderModule_AccessTokenProviderFactory;
import com.bamtech.shadow.dagger.p048a.C2110b;
import com.bamtech.shadow.dagger.p048a.C2112d;
import com.bamtech.shadow.dagger.p048a.C2113e;
import javax.inject.Provider;

public final class DaggerContentPluginComponent implements ContentPluginComponent {
    private Provider<AccessTokenProvider> accessTokenProvider;
    private Provider<BookmarkApi> apiProvider;
    private Provider<WatchlistApi> apiProvider2;
    private Provider<SearchApi> apiProvider3;
    private Provider<ContentApi> apiProvider4;
    private Provider<ContentClient> clientProvider;
    private Provider<SearchSuggestClient> clientProvider2;
    private Provider<ConfigurationProvider> configurationProvider;
    private Provider<ConverterProvider> converterProvider;
    private DefaultBookmarkApi_Factory defaultBookmarkApiProvider;
    private DefaultContentApi_Factory defaultContentApiProvider;
    private DefaultContentClient_Factory defaultContentClientProvider;
    private DefaultContentExtension_Factory defaultContentExtensionProvider;
    private Provider<DefaultCustomContentApi> defaultCustomContentApiProvider;
    private DefaultSearchApi_Factory defaultSearchApiProvider;
    private Provider<DefaultSearchSuggestApi> defaultSearchSuggestApiProvider;
    private DefaultSearchSuggestClient_Factory defaultSearchSuggestClientProvider;
    private Provider<DefaultSearchSuggestManager> defaultSearchSuggestManagerProvider;
    private DefaultWatchlistApi_Factory defaultWatchlistApiProvider;
    private Provider<ContentExtension> extensionProvider;
    private Provider<GraphQlConverterProvider> graphQlConverterProvider;
    private Provider<PluginRegistry> registryProvider;
    private DefaultExtensionModule_RenewSessionTransformerFactory renewSessionTransformerProvider;
    private DefaultExtensionModule_ServiceTransactionFactory serviceTransactionProvider;

    private static final class Builder implements com.bamtech.sdk4.internal.content.ContentPluginComponent.Builder {
        /* access modifiers changed from: private */
        public AccessTokenProviderModule accessTokenProviderModule;
        /* access modifiers changed from: private */
        public DefaultExtensionModule defaultExtensionModule;
        /* access modifiers changed from: private */
        public PluginRegistry registry;

        private Builder() {
        }

        public ContentPluginComponent build() {
            if (this.defaultExtensionModule == null) {
                this.defaultExtensionModule = new DefaultExtensionModule();
            }
            if (this.accessTokenProviderModule == null) {
                this.accessTokenProviderModule = new AccessTokenProviderModule();
            }
            if (this.registry != null) {
                return new DaggerContentPluginComponent(this);
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

    public static com.bamtech.sdk4.internal.content.ContentPluginComponent.Builder builder() {
        return new Builder();
    }

    private void initialize(Builder builder) {
        this.registryProvider = C2112d.m8174a(builder.registry);
        this.serviceTransactionProvider = DefaultExtensionModule_ServiceTransactionFactory.create(builder.defaultExtensionModule, this.registryProvider);
        this.accessTokenProvider = C2110b.m8173b(AccessTokenProviderModule_AccessTokenProviderFactory.create(builder.accessTokenProviderModule, this.registryProvider));
        this.configurationProvider = C2110b.m8173b(DefaultExtensionModule_ConfigurationFactory.create(builder.defaultExtensionModule, this.registryProvider));
        this.converterProvider = C2110b.m8173b(DefaultExtensionModule_ConverterProviderFactory.create(builder.defaultExtensionModule, this.registryProvider));
        this.graphQlConverterProvider = C2110b.m8173b(GraphQlConverterProvider_Factory.create(this.converterProvider));
        this.defaultContentClientProvider = DefaultContentClient_Factory.create(this.configurationProvider, this.graphQlConverterProvider);
        this.clientProvider = C2110b.m8173b(this.defaultContentClientProvider);
        this.renewSessionTransformerProvider = DefaultExtensionModule_RenewSessionTransformerFactory.create(builder.defaultExtensionModule, this.registryProvider);
        this.defaultContentExtensionProvider = DefaultContentExtension_Factory.create(this.accessTokenProvider, this.clientProvider, this.renewSessionTransformerProvider);
        this.extensionProvider = C2110b.m8173b(this.defaultContentExtensionProvider);
        this.defaultCustomContentApiProvider = C2110b.m8173b(DefaultCustomContentApi_Factory.create(this.serviceTransactionProvider, this.extensionProvider));
        this.defaultSearchSuggestClientProvider = DefaultSearchSuggestClient_Factory.create(this.configurationProvider, this.converterProvider);
        this.clientProvider2 = C2110b.m8173b(this.defaultSearchSuggestClientProvider);
        this.defaultSearchSuggestManagerProvider = C2110b.m8173b(DefaultSearchSuggestManager_Factory.create(this.clientProvider2));
        this.defaultSearchSuggestApiProvider = C2110b.m8173b(DefaultSearchSuggestApi_Factory.create(this.serviceTransactionProvider, this.defaultSearchSuggestManagerProvider));
        this.defaultBookmarkApiProvider = DefaultBookmarkApi_Factory.create(this.serviceTransactionProvider, this.extensionProvider);
        this.apiProvider = C2110b.m8173b(this.defaultBookmarkApiProvider);
        this.defaultWatchlistApiProvider = DefaultWatchlistApi_Factory.create(this.serviceTransactionProvider, this.extensionProvider);
        this.apiProvider2 = C2110b.m8173b(this.defaultWatchlistApiProvider);
        this.defaultSearchApiProvider = DefaultSearchApi_Factory.create(this.serviceTransactionProvider, this.extensionProvider);
        this.apiProvider3 = C2110b.m8173b(this.defaultSearchApiProvider);
        this.defaultContentApiProvider = DefaultContentApi_Factory.create(this.defaultCustomContentApiProvider, this.defaultSearchSuggestApiProvider, this.apiProvider, this.apiProvider2, this.apiProvider3, this.graphQlConverterProvider);
        this.apiProvider4 = C2110b.m8173b(this.defaultContentApiProvider);
    }

    private ContentPlugin injectContentPlugin(ContentPlugin contentPlugin) {
        ContentPlugin_MembersInjector.injectApi(contentPlugin, (ContentApi) this.apiProvider4.get());
        return contentPlugin;
    }

    public void inject(ContentPlugin contentPlugin) {
        injectContentPlugin(contentPlugin);
    }

    private DaggerContentPluginComponent(Builder builder) {
        initialize(builder);
    }
}
