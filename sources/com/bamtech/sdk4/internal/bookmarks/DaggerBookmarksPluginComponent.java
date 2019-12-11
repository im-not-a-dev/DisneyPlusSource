package com.bamtech.sdk4.internal.bookmarks;

import android.content.Context;
import com.bamtech.sdk4.bookmarks.BookmarkPlugin;
import com.bamtech.sdk4.bookmarks.BookmarkPlugin_MembersInjector;
import com.bamtech.sdk4.bookmarks.BookmarksApi;
import com.bamtech.sdk4.bookmarks.DefaultBookmarkApi_Factory;
import com.bamtech.sdk4.bookmarks.storage.DefaultLocalBookmarkStore_Factory;
import com.bamtech.sdk4.content.ContentExtension;
import com.bamtech.sdk4.content.GraphQlConverterProvider;
import com.bamtech.sdk4.content.GraphQlConverterProvider_Factory;
import com.bamtech.sdk4.internal.configuration.ConfigurationProvider;
import com.bamtech.sdk4.internal.content.ContentClient;
import com.bamtech.sdk4.internal.content.DefaultContentClient_Factory;
import com.bamtech.sdk4.internal.content.DefaultContentExtension_Factory;
import com.bamtech.sdk4.internal.networking.ConverterProvider;
import com.bamtech.sdk4.internal.plugin.DefaultExtensionModule;
import com.bamtech.sdk4.internal.plugin.DefaultExtensionModule_ConfigurationFactory;
import com.bamtech.sdk4.internal.plugin.DefaultExtensionModule_ConverterProviderFactory;
import com.bamtech.sdk4.internal.plugin.DefaultExtensionModule_NotifierFactory;
import com.bamtech.sdk4.internal.plugin.DefaultExtensionModule_RenewSessionTransformerFactory;
import com.bamtech.sdk4.internal.plugin.DefaultExtensionModule_ServiceTransactionFactory;
import com.bamtech.sdk4.internal.plugin.DefaultExtensionModule_UserProfileEventFactory;
import com.bamtech.sdk4.internal.token.AccessTokenProvider;
import com.bamtech.sdk4.plugin.PluginRegistry;
import com.bamtech.sdk4.session.AccessTokenProviderModule;
import com.bamtech.sdk4.session.AccessTokenProviderModule_AccessTokenProviderFactory;
import com.bamtech.sdk4.session.SessionInfoExtension;
import com.bamtech.sdk4.session.SessionInfoExtensionModule;
import com.bamtech.sdk4.session.SessionInfoExtensionModule_SessionInfoManagerFactory;
import com.bamtech.shadow.dagger.p048a.C2110b;
import com.bamtech.shadow.dagger.p048a.C2112d;
import com.bamtech.shadow.dagger.p048a.C2113e;
import javax.inject.Provider;

public final class DaggerBookmarksPluginComponent implements BookmarksPluginComponent {
    private Provider<AccessTokenProvider> accessTokenProvider;
    private Provider<BookmarksApi> apiProvider;
    private BookmarksRepositoryModule_BookmarkDaoFactory bookmarkDaoProvider;
    private BookmarksRepositoryModule_BookmarksDatabaseFactory bookmarksDatabaseProvider;
    private Provider<ContentClient> clientProvider;
    private Provider<ConfigurationProvider> configurationProvider;
    private Provider<Context> contextProvider;
    private Provider<ConverterProvider> converterProvider;
    private DefaultBookmarkApi_Factory defaultBookmarkApiProvider;
    private DefaultContentClient_Factory defaultContentClientProvider;
    private DefaultContentExtension_Factory defaultContentExtensionProvider;
    private DefaultLocalBookmarkStore_Factory defaultLocalBookmarkStoreProvider;
    private Provider<ContentExtension> extensionProvider;
    private Provider<GraphQlConverterProvider> graphQlConverterProvider;
    private DefaultExtensionModule_NotifierFactory notifierProvider;
    private Provider<PluginRegistry> registryProvider;
    private DefaultExtensionModule_RenewSessionTransformerFactory renewSessionTransformerProvider;
    private DefaultExtensionModule_ServiceTransactionFactory serviceTransactionProvider;
    private Provider<SessionInfoExtension> sessionInfoManagerProvider;
    private DefaultExtensionModule_UserProfileEventFactory userProfileEventProvider;

    private static final class Builder implements com.bamtech.sdk4.internal.bookmarks.BookmarksPluginComponent.Builder {
        /* access modifiers changed from: private */
        public AccessTokenProviderModule accessTokenProviderModule;
        /* access modifiers changed from: private */
        public Context context;
        /* access modifiers changed from: private */
        public DefaultExtensionModule defaultExtensionModule;
        /* access modifiers changed from: private */
        public PluginRegistry registry;
        /* access modifiers changed from: private */
        public SessionInfoExtensionModule sessionInfoExtensionModule;

        private Builder() {
        }

        public BookmarksPluginComponent build() {
            if (this.defaultExtensionModule == null) {
                this.defaultExtensionModule = new DefaultExtensionModule();
            }
            if (this.accessTokenProviderModule == null) {
                this.accessTokenProviderModule = new AccessTokenProviderModule();
            }
            if (this.sessionInfoExtensionModule == null) {
                this.sessionInfoExtensionModule = new SessionInfoExtensionModule();
            }
            String str = " must be set";
            if (this.registry == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(PluginRegistry.class.getCanonicalName());
                sb.append(str);
                throw new IllegalStateException(sb.toString());
            } else if (this.context != null) {
                return new DaggerBookmarksPluginComponent(this);
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(Context.class.getCanonicalName());
                sb2.append(str);
                throw new IllegalStateException(sb2.toString());
            }
        }

        public Builder context(Context context2) {
            C2113e.m8177a(context2);
            this.context = context2;
            return this;
        }

        public Builder registry(PluginRegistry pluginRegistry) {
            C2113e.m8177a(pluginRegistry);
            this.registry = pluginRegistry;
            return this;
        }
    }

    public static com.bamtech.sdk4.internal.bookmarks.BookmarksPluginComponent.Builder builder() {
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
        this.sessionInfoManagerProvider = C2110b.m8173b(SessionInfoExtensionModule_SessionInfoManagerFactory.create(builder.sessionInfoExtensionModule, this.registryProvider));
        this.contextProvider = C2112d.m8174a(builder.context);
        this.bookmarksDatabaseProvider = BookmarksRepositoryModule_BookmarksDatabaseFactory.create(this.contextProvider);
        this.bookmarkDaoProvider = BookmarksRepositoryModule_BookmarkDaoFactory.create(this.bookmarksDatabaseProvider);
        this.defaultLocalBookmarkStoreProvider = DefaultLocalBookmarkStore_Factory.create(this.sessionInfoManagerProvider, this.bookmarkDaoProvider);
        this.notifierProvider = DefaultExtensionModule_NotifierFactory.create(builder.defaultExtensionModule, this.registryProvider);
        this.userProfileEventProvider = DefaultExtensionModule_UserProfileEventFactory.create(builder.defaultExtensionModule, this.registryProvider);
        this.defaultBookmarkApiProvider = DefaultBookmarkApi_Factory.create(this.serviceTransactionProvider, this.extensionProvider, this.defaultLocalBookmarkStoreProvider, this.notifierProvider, this.userProfileEventProvider, this.sessionInfoManagerProvider);
        this.apiProvider = C2110b.m8173b(this.defaultBookmarkApiProvider);
    }

    private BookmarkPlugin injectBookmarkPlugin(BookmarkPlugin bookmarkPlugin) {
        BookmarkPlugin_MembersInjector.injectApi(bookmarkPlugin, (BookmarksApi) this.apiProvider.get());
        return bookmarkPlugin;
    }

    public void inject(BookmarkPlugin bookmarkPlugin) {
        injectBookmarkPlugin(bookmarkPlugin);
    }

    private DaggerBookmarksPluginComponent(Builder builder) {
        initialize(builder);
    }
}
