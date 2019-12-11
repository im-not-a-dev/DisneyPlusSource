package com.bamtech.sdk4.internal.android;

import android.app.Application;
import com.bamtech.sdk4.internal.configuration.BootstrapConfiguration;
import com.bamtech.sdk4.location.GeoProvider;
import com.bamtech.sdk4.media.MediaCapabilitiesProvider;
import com.bamtech.sdk4.media.adengine.AdvertisingIdProvider;
import com.bamtech.sdk4.session.ReauthorizationHandlerRegistry;
import java.net.Proxy;
import java.security.KeyStore;
import java.util.Map;
import kotlin.Metadata;
import okhttp3.Cache;
import okhttp3.logging.HttpLoggingInterceptor.Level;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b`\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0007H&J\b\u0010\b\u001a\u00020\tH&J\u001c\u0010\n\u001a\u00020\u00002\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r0\fH&J\u0010\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u0010H&J\u0010\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0012H&J\u0010\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u0015H&J\u0012\u0010\u0016\u001a\u00020\u00002\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H&J\u0012\u0010\u0018\u001a\u00020\u00002\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH&J\u0012\u0010\u001b\u001a\u00020\u00002\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH&J\u0012\u0010\u001e\u001a\u00020\u00002\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH&J\u0010\u0010 \u001a\u00020\u00002\u0006\u0010!\u001a\u00020\"H&¨\u0006#"}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/android/AndroidSdkComponentBuilder;", "", "advertisingIdProvider", "Lcom/bamtech/sdk4/media/adengine/AdvertisingIdProvider;", "application", "Landroid/app/Application;", "bootstrapConfiguration", "Lcom/bamtech/sdk4/internal/configuration/BootstrapConfiguration;", "build", "Lcom/bamtech/sdk4/internal/android/AndroidSdkComponent;", "correlationIds", "ids", "", "", "disableNetworkSecurity", "boolean", "", "geoProvider", "Lcom/bamtech/sdk4/location/GeoProvider;", "httpLoggingLevel", "level", "Lokhttp3/logging/HttpLoggingInterceptor$Level;", "keyStore", "Ljava/security/KeyStore;", "mediaCapabilitiesProvider", "provider", "Lcom/bamtech/sdk4/media/MediaCapabilitiesProvider;", "okHttpCache", "cache", "Lokhttp3/Cache;", "proxy", "Ljava/net/Proxy;", "reauthorizeHandlerStorage", "exchanger", "Lcom/bamtech/sdk4/session/ReauthorizationHandlerRegistry;", "sdk_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: AndroidSdkComponent.kt */
public interface AndroidSdkComponentBuilder {
    AndroidSdkComponentBuilder advertisingIdProvider(AdvertisingIdProvider advertisingIdProvider);

    AndroidSdkComponentBuilder application(Application application);

    AndroidSdkComponentBuilder bootstrapConfiguration(BootstrapConfiguration bootstrapConfiguration);

    AndroidSdkComponent build();

    AndroidSdkComponentBuilder correlationIds(Map<String, String> map);

    AndroidSdkComponentBuilder disableNetworkSecurity(boolean z);

    AndroidSdkComponentBuilder geoProvider(GeoProvider geoProvider);

    AndroidSdkComponentBuilder httpLoggingLevel(Level level);

    AndroidSdkComponentBuilder keyStore(KeyStore keyStore);

    AndroidSdkComponentBuilder mediaCapabilitiesProvider(MediaCapabilitiesProvider mediaCapabilitiesProvider);

    AndroidSdkComponentBuilder okHttpCache(Cache cache);

    AndroidSdkComponentBuilder proxy(Proxy proxy);

    AndroidSdkComponentBuilder reauthorizeHandlerStorage(ReauthorizationHandlerRegistry reauthorizationHandlerRegistry);
}
