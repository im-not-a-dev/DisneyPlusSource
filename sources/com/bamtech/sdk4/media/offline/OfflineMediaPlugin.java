package com.bamtech.sdk4.media.offline;

import android.content.Context;
import com.bamtech.sdk4.internal.media.offline.DaggerOfflineMediaPluginComponent;
import com.bamtech.sdk4.internal.media.offline.OfflineMediaClient;
import com.bamtech.sdk4.internal.media.offline.OfflineMediaPluginComponent;
import com.bamtech.sdk4.plugin.Plugin;
import com.bamtech.sdk4.plugin.PluginExtra;
import com.bamtech.sdk4.plugin.PluginInitializationException;
import com.bamtech.sdk4.plugin.PluginRegistry;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u0005¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016J\b\u0010\u001b\u001a\u00020\u0016H\u0016R\u001e\u0010\u0003\u001a\u00020\u00048\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\n8\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0010X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u001d"}, mo31007d2 = {"Lcom/bamtech/sdk4/media/offline/OfflineMediaPlugin;", "Lcom/bamtech/sdk4/plugin/Plugin;", "()V", "api", "Lcom/bamtech/sdk4/media/offline/OfflineMediaApi;", "getApi$plugin_offline_media_release", "()Lcom/bamtech/sdk4/media/offline/OfflineMediaApi;", "setApi$plugin_offline_media_release", "(Lcom/bamtech/sdk4/media/offline/OfflineMediaApi;)V", "client", "Lcom/bamtech/sdk4/internal/media/offline/OfflineMediaClient;", "getClient$plugin_offline_media_release", "()Lcom/bamtech/sdk4/internal/media/offline/OfflineMediaClient;", "setClient$plugin_offline_media_release", "(Lcom/bamtech/sdk4/internal/media/offline/OfflineMediaClient;)V", "delayInitialization", "", "getDelayInitialization", "()Z", "setDelayInitialization", "(Z)V", "initialize", "", "registry", "Lcom/bamtech/sdk4/plugin/PluginRegistry;", "extra", "Lcom/bamtech/sdk4/plugin/PluginExtra;", "onReady", "Companion", "plugin-offline-media_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: OfflineMediaPlugin.kt */
public final class OfflineMediaPlugin implements Plugin {
    public static final Companion Companion = new Companion(null);
    public static OfflineMediaPluginComponent component;
    public OfflineMediaApi api;
    public OfflineMediaClient client;
    private boolean delayInitialization;

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\t"}, mo31007d2 = {"Lcom/bamtech/sdk4/media/offline/OfflineMediaPlugin$Companion;", "", "()V", "component", "Lcom/bamtech/sdk4/internal/media/offline/OfflineMediaPluginComponent;", "getComponent$plugin_offline_media_release", "()Lcom/bamtech/sdk4/internal/media/offline/OfflineMediaPluginComponent;", "setComponent$plugin_offline_media_release", "(Lcom/bamtech/sdk4/internal/media/offline/OfflineMediaPluginComponent;)V", "plugin-offline-media_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
    /* compiled from: OfflineMediaPlugin.kt */
    public static final class Companion {
        private Companion() {
        }

        public final OfflineMediaPluginComponent getComponent$plugin_offline_media_release() {
            OfflineMediaPluginComponent access$getComponent$cp = OfflineMediaPlugin.component;
            if (access$getComponent$cp != null) {
                return access$getComponent$cp;
            }
            Intrinsics.throwUninitializedPropertyAccessException("component");
            throw null;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public void initialize(PluginRegistry pluginRegistry, PluginExtra pluginExtra) {
        boolean z = pluginExtra instanceof OfflineMediaPluginExtra;
        OfflineMediaPluginExtra offlineMediaPluginExtra = (OfflineMediaPluginExtra) (!z ? null : pluginExtra);
        if (offlineMediaPluginExtra != null) {
            Context applicationContext = offlineMediaPluginExtra.getApplicationContext();
            if (applicationContext != null) {
                if (!z) {
                    pluginExtra = null;
                }
                OfflineMediaPluginExtra offlineMediaPluginExtra2 = (OfflineMediaPluginExtra) pluginExtra;
                this.delayInitialization = offlineMediaPluginExtra2 != null ? offlineMediaPluginExtra2.getDelayInitialization() : false;
                OfflineMediaPluginComponent build = DaggerOfflineMediaPluginComponent.builder().registry(pluginRegistry).context(applicationContext).build();
                build.inject(this);
                OfflineMediaClient offlineMediaClient = this.client;
                if (offlineMediaClient != null) {
                    pluginRegistry.registerExtension(offlineMediaClient);
                    OfflineMediaApi offlineMediaApi = this.api;
                    if (offlineMediaApi != null) {
                        pluginRegistry.registerPluginApi(OfflineMediaApi.class, offlineMediaApi);
                        component = build;
                        return;
                    }
                    Intrinsics.throwUninitializedPropertyAccessException("api");
                    throw null;
                }
                Intrinsics.throwUninitializedPropertyAccessException("client");
                throw null;
            }
        }
        throw new PluginInitializationException("The `OfflineMediaPlugin` requires an `OfflineMediaPluginExtra` be provided with the application context.", null, 2, null);
    }

    public void onReady() {
        if (!this.delayInitialization) {
            OfflineMediaApi offlineMediaApi = this.api;
            if (offlineMediaApi != null) {
                offlineMediaApi.initialize();
            } else {
                Intrinsics.throwUninitializedPropertyAccessException("api");
                throw null;
            }
        }
    }
}
