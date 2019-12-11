package com.bamtech.sdk4.internal.plugin;

import com.bamtech.sdk4.internal.configuration.ConfigurationProvider;
import com.bamtech.sdk4.internal.core.Storage;
import com.bamtech.sdk4.internal.event.LogoutMode;
import com.bamtech.sdk4.internal.event.UserProfileEvent;
import com.bamtech.sdk4.internal.networking.ConverterProvider;
import com.bamtech.sdk4.internal.service.ServiceTransaction;
import com.bamtech.sdk4.internal.telemetry.dust.DustClientConstants;
import com.bamtech.sdk4.plugin.ExtensionInstanceProvider;
import com.bamtech.sdk4.plugin.PluginRegistry;
import com.bamtech.sdk4.session.ReauthorizationHandlerRegistry;
import com.bamtech.sdk4.session.RenewSessionTransformers;
import kotlin.Metadata;
import kotlin.jvm.internal.C12880j;
import okhttp3.OkHttpClient.Builder;
import p520io.reactivex.subjects.PublishSubject;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0016\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0016\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001f0\u00122\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006 "}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/plugin/DefaultExtensionModule;", "", "()V", "authorizerExtension", "Lcom/bamtech/sdk4/internal/plugin/AuthenticationExpiredCallbackExtension;", "registry", "Lcom/bamtech/sdk4/plugin/PluginRegistry;", "configuration", "Lcom/bamtech/sdk4/internal/configuration/ConfigurationProvider;", "converterProvider", "Lcom/bamtech/sdk4/internal/networking/ConverterProvider;", "getExtension", "Lcom/bamtech/sdk4/internal/telemetry/dust/DustClientConstants;", "getExtensionProvider", "Lcom/bamtech/sdk4/plugin/ExtensionInstanceProvider;", "getSessionExchangerStore", "Lcom/bamtech/sdk4/session/ReauthorizationHandlerRegistry;", "notifier", "Lio/reactivex/subjects/PublishSubject;", "Lcom/bamtech/sdk4/internal/event/LogoutMode;", "okHttpBuilder", "Lokhttp3/OkHttpClient$Builder;", "renewSessionTransformer", "Lcom/bamtech/sdk4/session/RenewSessionTransformers;", "serviceTransaction", "Lcom/bamtech/sdk4/internal/service/ServiceTransaction;", "storage", "Lcom/bamtech/sdk4/internal/core/Storage;", "userAgent", "", "userProfileEvent", "Lcom/bamtech/sdk4/internal/event/UserProfileEvent;", "sdk-plugin-api"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: DefaultExtensionModule.kt */
public final class DefaultExtensionModule {
    public final ConfigurationProvider configuration(PluginRegistry pluginRegistry) {
        return ((ConfigurationProviderExtension) pluginRegistry.getExtension(ConfigurationProviderExtension.class)).getInstance();
    }

    public final ConverterProvider converterProvider(PluginRegistry pluginRegistry) {
        return ((ConverterProviderExtension) pluginRegistry.getExtension(ConverterProviderExtension.class)).getInstance();
    }

    public final DustClientConstants getExtension(PluginRegistry pluginRegistry) {
        return ((DustClientConstantsExtension) pluginRegistry.getExtension(DustClientConstantsExtension.class)).getInstance();
    }

    public final ExtensionInstanceProvider getExtensionProvider(PluginRegistry pluginRegistry) {
        return (ExtensionInstanceProvider) pluginRegistry.getExtension(ExtensionInstanceProvider.class);
    }

    public final ReauthorizationHandlerRegistry getSessionExchangerStore(PluginRegistry pluginRegistry) {
        return ((SessionExchangerStoreExtension) pluginRegistry.getExtension(SessionExchangerStoreExtension.class)).getInstance();
    }

    public final PublishSubject<LogoutMode> notifier(PluginRegistry pluginRegistry) {
        return ((NotifierExtension) pluginRegistry.getExtension(NotifierExtension.class)).getInstance();
    }

    public final Builder okHttpBuilder(PluginRegistry pluginRegistry) {
        return ((OkHttpBuilderProvider) pluginRegistry.getExtension(OkHttpBuilderProvider.class)).getInstance();
    }

    public final RenewSessionTransformers renewSessionTransformer(PluginRegistry pluginRegistry) {
        return ((RenewSessionTransformerExtension) pluginRegistry.getExtension(RenewSessionTransformerExtension.class)).getInstance();
    }

    public final ServiceTransaction serviceTransaction(PluginRegistry pluginRegistry) {
        Object obj = ((TransactionProviderExtension) pluginRegistry.getExtension(TransactionProviderExtension.class)).getInstance().get();
        C12880j.m40222a(obj, "registry.getExtension<Tr…tension>().instance.get()");
        return (ServiceTransaction) obj;
    }

    public final Storage storage(PluginRegistry pluginRegistry) {
        return ((StorageExtension) pluginRegistry.getExtension(StorageExtension.class)).getInstance();
    }

    public final String userAgent(PluginRegistry pluginRegistry) {
        return ((UserAgentProvider) pluginRegistry.getExtension(UserAgentProvider.class)).getInstance();
    }

    public final PublishSubject<UserProfileEvent> userProfileEvent(PluginRegistry pluginRegistry) {
        return ((UserProfileEventExtension) pluginRegistry.getExtension(UserProfileEventExtension.class)).getInstance();
    }
}
