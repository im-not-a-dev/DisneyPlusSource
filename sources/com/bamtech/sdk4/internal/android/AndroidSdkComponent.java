package com.bamtech.sdk4.internal.android;

import com.bamtech.sdk4.Session;
import com.bamtech.sdk4.internal.plugin.DefaultExtensionProvider;
import com.bamtech.sdk4.plugin.PluginRegistry;
import kotlin.Metadata;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\ba\u0018\u00002\u00020\u0001:\u0001\bJ\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0007H&¨\u0006\t"}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/android/AndroidSdkComponent;", "", "defaultExtensions", "Lcom/bamtech/sdk4/internal/plugin/DefaultExtensionProvider;", "registry", "Lcom/bamtech/sdk4/plugin/PluginRegistry;", "session", "Lcom/bamtech/sdk4/Session;", "Builder", "sdk_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: AndroidSdkComponent.kt */
public interface AndroidSdkComponent {

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0003H'J\u0010\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0005H'J\u0010\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0007H'J\b\u0010\b\u001a\u00020\tH&J\u001e\u0010\n\u001a\u00020\u00002\u0014\b\u0001\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r0\fH'J\u0012\u0010\u000e\u001a\u00020\u00002\b\b\u0001\u0010\u000f\u001a\u00020\u0010H'J\u0010\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0012H'J\u0010\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u0015H'J\u0014\u0010\u0016\u001a\u00020\u00002\n\b\u0001\u0010\u0016\u001a\u0004\u0018\u00010\u0017H'J\u0012\u0010\u0018\u001a\u00020\u00002\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH'J\u0014\u0010\u001b\u001a\u00020\u00002\n\b\u0001\u0010\u001c\u001a\u0004\u0018\u00010\u001dH'J\u0014\u0010\u001e\u001a\u00020\u00002\n\b\u0001\u0010\u001e\u001a\u0004\u0018\u00010\u001fH'J\u0010\u0010 \u001a\u00020\u00002\u0006\u0010!\u001a\u00020\"H'¨\u0006#"}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/android/AndroidSdkComponent$Builder;", "Lcom/bamtech/sdk4/internal/android/AndroidSdkComponentBuilder;", "advertisingIdProvider", "Lcom/bamtech/sdk4/media/adengine/AdvertisingIdProvider;", "application", "Landroid/app/Application;", "bootstrapConfiguration", "Lcom/bamtech/sdk4/internal/configuration/BootstrapConfiguration;", "build", "Lcom/bamtech/sdk4/internal/android/AndroidSdkComponent;", "correlationIds", "ids", "", "", "disableNetworkSecurity", "boolean", "", "geoProvider", "Lcom/bamtech/sdk4/location/GeoProvider;", "httpLoggingLevel", "level", "Lokhttp3/logging/HttpLoggingInterceptor$Level;", "keyStore", "Ljava/security/KeyStore;", "mediaCapabilitiesProvider", "provider", "Lcom/bamtech/sdk4/media/MediaCapabilitiesProvider;", "okHttpCache", "cache", "Lokhttp3/Cache;", "proxy", "Ljava/net/Proxy;", "reauthorizeHandlerStorage", "exchanger", "Lcom/bamtech/sdk4/session/ReauthorizationHandlerRegistry;", "sdk_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
    /* compiled from: AndroidSdkComponent.kt */
    public interface Builder extends AndroidSdkComponentBuilder {
    }

    DefaultExtensionProvider defaultExtensions();

    PluginRegistry registry();

    Session session();
}
