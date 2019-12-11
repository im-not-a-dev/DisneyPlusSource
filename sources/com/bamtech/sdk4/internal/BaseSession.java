package com.bamtech.sdk4.internal;

import com.bamtech.core.logging.LogLevel;
import com.bamtech.sdk4.Session;
import com.bamtech.sdk4.Session.DefaultImpls;
import com.bamtech.sdk4.customerservice.CustomerServiceApi;
import com.bamtech.sdk4.edge.EdgeManager;
import com.bamtech.sdk4.internal.service.ServiceTransaction;
import com.bamtech.sdk4.media.MediaApi;
import com.bamtech.sdk4.plugin.ExtensionProvider;
import com.bamtech.sdk4.plugin.ExtensionRegistry;
import com.bamtech.sdk4.plugin.Plugin;
import com.bamtech.sdk4.plugin.PluginApi;
import com.bamtech.sdk4.plugin.PluginExtra;
import com.bamtech.sdk4.plugin.PluginInitializationException;
import com.bamtech.sdk4.plugin.PluginRegistry;
import com.bamtech.sdk4.session.SessionApi;
import com.bamtech.sdk4.session.SessionInfo;
import com.bamtech.sdk4.session.SessionState;
import com.bamtech.sdk4.token.Grant;
import com.bamtech.shadow.dagger.Lazy;
import javax.inject.Provider;
import kotlin.C12907r;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p520io.reactivex.Completable;
import p520io.reactivex.Observable;
import p520io.reactivex.Single;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000²\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u00108\u001a\u0002092\u0006\u0010:\u001a\u00020;H\u0016J\n\u0010<\u001a\u0004\u0018\u00010\u0004H\u0016J%\u0010=\u001a\u0002H>\"\b\b\u0000\u0010>*\u00020?2\f\u0010@\u001a\b\u0012\u0004\u0012\u0002H>0AH\u0016¢\u0006\u0002\u0010BJ%\u0010C\u001a\u0002HD\"\b\b\u0000\u0010D*\u00020E2\f\u0010F\u001a\b\u0012\u0004\u0012\u0002HD0AH\u0016¢\u0006\u0002\u0010GJ\u0016\u0010H\u001a\b\u0012\u0004\u0012\u00020J0I2\u0006\u0010K\u001a\u00020LH\u0016J\u000e\u0010M\u001a\b\u0012\u0004\u0012\u00020\u00040IH\u0016J \u0010N\u001a\u00020O\"\b\b\u0000\u0010P*\u00020Q2\f\u0010R\u001a\b\u0012\u0004\u0012\u0002HP0AH\u0016J*\u0010N\u001a\u00020O\"\b\b\u0000\u0010P*\u00020Q2\f\u0010R\u001a\b\u0012\u0004\u0012\u0002HP0A2\b\u0010S\u001a\u0004\u0018\u00010TH\u0016J\b\u0010U\u001a\u000209H\u0016J\u0010\u0010U\u001a\u0002092\u0006\u0010V\u001a\u00020LH\u0016J\b\u0010W\u001a\u000209H\u0016J\b\u0010X\u001a\u000209H\u0016J\u000e\u0010Y\u001a\b\u0012\u0004\u0012\u00020\b0ZH\u0016R\u0014\u0010\u0003\u001a\u00020\u00048BX\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\b8VX\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\f8VX\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR$\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\u00108\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001e\u0010\u0015\u001a\u00020\u00168\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR$\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00108\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0012\"\u0004\b\u001e\u0010\u0014R\u0014\u0010\u001f\u001a\u00020 8VX\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"R$\u0010#\u001a\b\u0012\u0004\u0012\u00020 0\u00108\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u0012\"\u0004\b%\u0010\u0014R$\u0010&\u001a\b\u0012\u0004\u0012\u00020'0\u00108\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u0012\"\u0004\b)\u0010\u0014R\u0014\u0010*\u001a\u00020'8BX\u0004¢\u0006\u0006\u001a\u0004\b+\u0010,R$\u0010-\u001a\b\u0012\u0004\u0012\u00020.0\u00108\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b/\u0010\u0012\"\u0004\b0\u0010\u0014R$\u00101\u001a\b\u0012\u0004\u0012\u000203028\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b4\u00105\"\u0004\b6\u00107¨\u0006["}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/BaseSession;", "Lcom/bamtech/sdk4/Session;", "()V", "SESSION_API_INITIALIZE_PLUGIN", "", "getSESSION_API_INITIALIZE_PLUGIN", "()Ljava/lang/String;", "currentSessionState", "Lcom/bamtech/sdk4/session/SessionState;", "getCurrentSessionState", "()Lcom/bamtech/sdk4/session/SessionState;", "customerServiceApi", "Lcom/bamtech/sdk4/customerservice/CustomerServiceApi;", "getCustomerServiceApi", "()Lcom/bamtech/sdk4/customerservice/CustomerServiceApi;", "customerServiceApiProvider", "Lcom/bamtech/shadow/dagger/Lazy;", "getCustomerServiceApiProvider$sdk_core_api_release", "()Lcom/bamtech/shadow/dagger/Lazy;", "setCustomerServiceApiProvider$sdk_core_api_release", "(Lcom/bamtech/shadow/dagger/Lazy;)V", "edge", "Lcom/bamtech/sdk4/edge/EdgeManager;", "getEdge", "()Lcom/bamtech/sdk4/edge/EdgeManager;", "setEdge", "(Lcom/bamtech/sdk4/edge/EdgeManager;)V", "extensionRegistryProvider", "Lcom/bamtech/sdk4/plugin/ExtensionRegistry;", "getExtensionRegistryProvider$sdk_core_api_release", "setExtensionRegistryProvider$sdk_core_api_release", "mediaApi", "Lcom/bamtech/sdk4/media/MediaApi;", "getMediaApi", "()Lcom/bamtech/sdk4/media/MediaApi;", "mediaProvider", "getMediaProvider$sdk_core_api_release", "setMediaProvider$sdk_core_api_release", "pluginRegistryProvider", "Lcom/bamtech/sdk4/plugin/PluginRegistry;", "getPluginRegistryProvider$sdk_core_api_release", "setPluginRegistryProvider$sdk_core_api_release", "registry", "getRegistry", "()Lcom/bamtech/sdk4/plugin/PluginRegistry;", "sessionApiProvider", "Lcom/bamtech/sdk4/session/SessionApi;", "getSessionApiProvider$sdk_core_api_release", "setSessionApiProvider$sdk_core_api_release", "transactionProvider", "Ljavax/inject/Provider;", "Lcom/bamtech/sdk4/internal/service/ServiceTransaction;", "getTransactionProvider$sdk_core_api_release", "()Ljavax/inject/Provider;", "setTransactionProvider$sdk_core_api_release", "(Ljavax/inject/Provider;)V", "authorize", "Lio/reactivex/Completable;", "grant", "Lcom/bamtech/sdk4/token/Grant;", "getAccessState", "getExtension", "EXTENSION", "Lcom/bamtech/sdk4/plugin/Extension;", "extension", "Ljava/lang/Class;", "(Ljava/lang/Class;)Lcom/bamtech/sdk4/plugin/Extension;", "getPluginApi", "PLUGIN_API", "Lcom/bamtech/sdk4/plugin/PluginApi;", "api", "(Ljava/lang/Class;)Lcom/bamtech/sdk4/plugin/PluginApi;", "getSessionInfo", "Lio/reactivex/Single;", "Lcom/bamtech/sdk4/session/SessionInfo;", "preferLocal", "", "getSessionToken", "initializePlugin", "", "PLUGIN", "Lcom/bamtech/sdk4/plugin/Plugin;", "plugin", "extra", "Lcom/bamtech/sdk4/plugin/PluginExtra;", "logout", "soft", "reauthorize", "reset", "watchSessionState", "Lio/reactivex/Observable;", "sdk-core-api_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: BaseSession.kt */
public abstract class BaseSession implements Session {
    public Lazy<CustomerServiceApi> customerServiceApiProvider;
    public EdgeManager edge;
    public Lazy<ExtensionRegistry> extensionRegistryProvider;
    public Lazy<MediaApi> mediaProvider;
    public Lazy<PluginRegistry> pluginRegistryProvider;
    public Lazy<SessionApi> sessionApiProvider;
    public Provider<ServiceTransaction> transactionProvider;

    private final PluginRegistry getRegistry() {
        Lazy<PluginRegistry> lazy = this.pluginRegistryProvider;
        if (lazy != null) {
            Object obj = lazy.get();
            Intrinsics.checkReturnedValueIsNotNull(obj, "pluginRegistryProvider.get()");
            return (PluginRegistry) obj;
        }
        Intrinsics.throwUninitializedPropertyAccessException("pluginRegistryProvider");
        throw null;
    }

    private final String getSESSION_API_INITIALIZE_PLUGIN() {
        return "urn:bamtech:dust:bamsdk:api:session:initializePlugin";
    }

    public Completable authorize(Grant grant) {
        Lazy<SessionApi> lazy = this.sessionApiProvider;
        if (lazy != null) {
            return ((SessionApi) lazy.get()).authorize(grant);
        }
        Intrinsics.throwUninitializedPropertyAccessException("sessionApiProvider");
        throw null;
    }

    public String getAccessState() {
        Lazy<SessionApi> lazy = this.sessionApiProvider;
        if (lazy != null) {
            return ((SessionApi) lazy.get()).getAccessState();
        }
        Intrinsics.throwUninitializedPropertyAccessException("sessionApiProvider");
        throw null;
    }

    public SessionState getCurrentSessionState() {
        Lazy<SessionApi> lazy = this.sessionApiProvider;
        if (lazy != null) {
            return ((SessionApi) lazy.get()).getCurrentSessionState();
        }
        Intrinsics.throwUninitializedPropertyAccessException("sessionApiProvider");
        throw null;
    }

    public MediaApi getMediaApi() {
        Lazy<MediaApi> lazy = this.mediaProvider;
        if (lazy != null) {
            Object obj = lazy.get();
            Intrinsics.checkReturnedValueIsNotNull(obj, "mediaProvider.get()");
            return (MediaApi) obj;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mediaProvider");
        throw null;
    }

    public <PLUGIN_API extends PluginApi> PLUGIN_API getPluginApi(Class<PLUGIN_API> cls) {
        return getRegistry().getPluginApi(cls);
    }

    public Single<SessionInfo> getSessionInfo() {
        return DefaultImpls.getSessionInfo(this);
    }

    public Single<String> getSessionToken() {
        Lazy<SessionApi> lazy = this.sessionApiProvider;
        if (lazy != null) {
            return ((SessionApi) lazy.get()).getSessionToken();
        }
        Intrinsics.throwUninitializedPropertyAccessException("sessionApiProvider");
        throw null;
    }

    public <PLUGIN extends Plugin> void initializePlugin(Class<PLUGIN> cls, PluginExtra pluginExtra) {
        String str = "plugin";
        Provider<ServiceTransaction> provider = this.transactionProvider;
        if (provider != null) {
            ServiceTransaction serviceTransaction = (ServiceTransaction) provider.get();
            try {
                Plugin plugin = (Plugin) cls.newInstance();
                plugin.initialize(getRegistry(), pluginExtra);
                if (plugin instanceof ExtensionProvider) {
                    ((ExtensionProvider) plugin).register(getRegistry());
                }
                ServiceTransaction.DefaultImpls.logDust$default(serviceTransaction, getSESSION_API_INITIALIZE_PLUGIN(), "urn:bamtech:dust:bamsdk:event:sdk", C13170i0.m40332a(C12907r.m40244a(str, cls.getSimpleName())), LogLevel.DEBUG, false, 16, null);
                plugin.onReady();
            } catch (Throwable th) {
                ServiceTransaction serviceTransaction2 = serviceTransaction;
                ServiceTransaction.DefaultImpls.logDust$default(serviceTransaction2, getSESSION_API_INITIALIZE_PLUGIN(), "urn:bamtech:dust:bamsdk:error:sdk", C13170i0.m40332a(C12907r.m40244a(str, cls.getSimpleName())), LogLevel.ERROR, false, 16, null);
                throw new PluginInitializationException("Unable to create plugin instance", th);
            }
        } else {
            Intrinsics.throwUninitializedPropertyAccessException("transactionProvider");
            throw null;
        }
    }

    public Completable logout() {
        return logout(false);
    }

    public Completable reauthorize() {
        Lazy<SessionApi> lazy = this.sessionApiProvider;
        if (lazy != null) {
            return ((SessionApi) lazy.get()).reauthorize();
        }
        Intrinsics.throwUninitializedPropertyAccessException("sessionApiProvider");
        throw null;
    }

    public Completable reset() {
        Lazy<SessionApi> lazy = this.sessionApiProvider;
        if (lazy != null) {
            return ((SessionApi) lazy.get()).reset();
        }
        Intrinsics.throwUninitializedPropertyAccessException("sessionApiProvider");
        throw null;
    }

    public Observable<SessionState> watchSessionState() {
        Lazy<SessionApi> lazy = this.sessionApiProvider;
        if (lazy != null) {
            return ((SessionApi) lazy.get()).watchSessionState();
        }
        Intrinsics.throwUninitializedPropertyAccessException("sessionApiProvider");
        throw null;
    }

    public Single<SessionInfo> getSessionInfo(boolean z) {
        Lazy<SessionApi> lazy = this.sessionApiProvider;
        if (lazy != null) {
            return ((SessionApi) lazy.get()).getSessionInfo(z);
        }
        Intrinsics.throwUninitializedPropertyAccessException("sessionApiProvider");
        throw null;
    }

    public Completable logout(boolean z) {
        Lazy<SessionApi> lazy = this.sessionApiProvider;
        if (lazy != null) {
            return ((SessionApi) lazy.get()).logout(z);
        }
        Intrinsics.throwUninitializedPropertyAccessException("sessionApiProvider");
        throw null;
    }
}
