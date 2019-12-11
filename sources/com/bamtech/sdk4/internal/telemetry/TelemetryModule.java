package com.bamtech.sdk4.internal.telemetry;

import com.bamtech.sdk4.internal.configuration.ConfigurationProvider;
import com.bamtech.sdk4.internal.networking.ConverterProvider;
import com.bamtech.sdk4.internal.service.ServiceTransaction;
import com.bamtech.sdk4.internal.telemetry.DustEventBuffer.Companion;
import com.bamtech.sdk4.internal.telemetry.dust.DustClientConstants;
import com.bamtech.sdk4.internal.token.AccessTokenProvider;
import com.bamtech.sdk4.media.DefaultQOSPlaybackEventListener;
import java.io.File;
import javax.inject.Provider;
import kotlin.Metadata;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J8\u0010\u0003\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\b\b\u0001\u0010\u000e\u001a\u00020\u000fH\u0007J\"\u0010\u0010\u001a\u00020\u000f2\b\b\u0001\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0007J8\u0010\u0017\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\b\b\u0001\u0010\u000e\u001a\u00020\u000fH\u0007J\"\u0010\u0018\u001a\u00020\u000f2\b\b\u0001\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0007J\u001a\u0010\u0019\u001a\u00020\u001a2\b\b\u0001\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u001dH\u0007J8\u0010\u001e\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\b\b\u0001\u0010\u000e\u001a\u00020\u000fH\u0007J\"\u0010\u001f\u001a\u00020\u000f2\b\b\u0001\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0007J8\u0010 \u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020!2\b\b\u0001\u0010\u000e\u001a\u00020\u000fH\u0007J\"\u0010\"\u001a\u00020\u000f2\b\b\u0001\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0007¨\u0006#"}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/telemetry/TelemetryModule;", "", "()V", "dustBuffer", "Lcom/bamtech/sdk4/internal/telemetry/EventBuffer;", "transactionProvider", "Ljavax/inject/Provider;", "Lcom/bamtech/sdk4/internal/service/ServiceTransaction;", "tokenProvider", "Lcom/bamtech/sdk4/internal/token/AccessTokenProvider;", "configurationProvider", "Lcom/bamtech/sdk4/internal/configuration/ConfigurationProvider;", "client", "Lcom/bamtech/sdk4/internal/telemetry/TelemetryClient;", "storage", "Lcom/bamtech/sdk4/internal/telemetry/TelemetryStorage;", "dustStorage", "dustDir", "Ljava/io/File;", "converterProvider", "Lcom/bamtech/sdk4/internal/networking/ConverterProvider;", "handler", "Lcom/bamtech/sdk4/internal/telemetry/ErrorHandler;", "glimpseBuffer", "glimpseStorage", "qos", "Lcom/bamtech/sdk4/media/DefaultQOSPlaybackEventListener;", "eventBuffer", "dustConstants", "Lcom/bamtech/sdk4/internal/telemetry/dust/DustClientConstants;", "qosBuffer", "qosStorage", "telemetryBuffer", "Lcom/bamtech/sdk4/internal/telemetry/StreamSampleTelemetryClient;", "telemetryStorage", "sdk-core-api_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: TelemetryModule.kt */
public final class TelemetryModule {
    public final EventBuffer dustBuffer(Provider<ServiceTransaction> provider, AccessTokenProvider accessTokenProvider, ConfigurationProvider configurationProvider, TelemetryClient telemetryClient, TelemetryStorage telemetryStorage) {
        return Companion.create$default(DustEventBuffer.Companion, provider, accessTokenProvider, configurationProvider, telemetryClient, telemetryStorage, TelemetryModule$dustBuffer$1.INSTANCE, TelemetryModule$dustBuffer$2.INSTANCE, 0, "DustBuffer", 128, null);
    }

    public final TelemetryStorage dustStorage(File file, ConverterProvider converterProvider, ErrorHandler errorHandler) {
        DefaultTelemetryStorage defaultTelemetryStorage = new DefaultTelemetryStorage(file, new DefaultTelemetryEventStorageHelper(file, converterProvider.getDustEventConverter()), errorHandler, 0, 8, null);
        return defaultTelemetryStorage;
    }

    public final EventBuffer glimpseBuffer(Provider<ServiceTransaction> provider, AccessTokenProvider accessTokenProvider, ConfigurationProvider configurationProvider, TelemetryClient telemetryClient, TelemetryStorage telemetryStorage) {
        return Companion.create$default(DustEventBuffer.Companion, provider, accessTokenProvider, configurationProvider, telemetryClient, telemetryStorage, TelemetryModule$glimpseBuffer$1.INSTANCE, TelemetryModule$glimpseBuffer$2.INSTANCE, 0, "GlimpseBuffer", 128, null);
    }

    public final TelemetryStorage glimpseStorage(File file, ConverterProvider converterProvider, ErrorHandler errorHandler) {
        DefaultTelemetryStorage defaultTelemetryStorage = new DefaultTelemetryStorage(file, new DefaultTelemetryEventStorageHelper(file, converterProvider.getIdentity()), errorHandler, 0, 8, null);
        return defaultTelemetryStorage;
    }

    public final DefaultQOSPlaybackEventListener qos(EventBuffer eventBuffer, DustClientConstants dustClientConstants) {
        return new DefaultQOSPlaybackEventListener(eventBuffer, dustClientConstants);
    }

    public final EventBuffer qosBuffer(Provider<ServiceTransaction> provider, AccessTokenProvider accessTokenProvider, ConfigurationProvider configurationProvider, TelemetryClient telemetryClient, TelemetryStorage telemetryStorage) {
        return Companion.create$default(DustEventBuffer.Companion, provider, accessTokenProvider, configurationProvider, telemetryClient, telemetryStorage, TelemetryModule$qosBuffer$1.INSTANCE, TelemetryModule$qosBuffer$2.INSTANCE, 0, "QOSBuffer", 128, null);
    }

    public final TelemetryStorage qosStorage(File file, ConverterProvider converterProvider, ErrorHandler errorHandler) {
        DefaultTelemetryStorage defaultTelemetryStorage = new DefaultTelemetryStorage(file, new DefaultTelemetryEventStorageHelper(file, converterProvider.getIdentityConverterWithNulls()), errorHandler, 0, 8, null);
        return defaultTelemetryStorage;
    }

    public final EventBuffer telemetryBuffer(Provider<ServiceTransaction> provider, AccessTokenProvider accessTokenProvider, ConfigurationProvider configurationProvider, StreamSampleTelemetryClient streamSampleTelemetryClient, TelemetryStorage telemetryStorage) {
        return Companion.create$default(DustEventBuffer.Companion, provider, accessTokenProvider, configurationProvider, streamSampleTelemetryClient, telemetryStorage, TelemetryModule$telemetryBuffer$1.INSTANCE, TelemetryModule$telemetryBuffer$2.INSTANCE, 0, "StreamSampleBuffer", 128, null);
    }

    public final TelemetryStorage telemetryStorage(File file, ConverterProvider converterProvider, ErrorHandler errorHandler) {
        DefaultTelemetryStorage defaultTelemetryStorage = new DefaultTelemetryStorage(file, new DefaultTelemetryEventStorageHelper(file, converterProvider.getIdentity()), errorHandler, 0, 8, null);
        return defaultTelemetryStorage;
    }
}
