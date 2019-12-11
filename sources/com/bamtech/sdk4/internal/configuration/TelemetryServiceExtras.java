package com.bamtech.sdk4.internal.configuration;

import kotlin.Metadata;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0012\u0018\u00002\u00020\u0001B\u0007\b\u0010¢\u0006\u0002\u0010\u0002B=\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u000e\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\rR\u0011\u0010\u0014\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\rR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\rR\u0011\u0010\u0017\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\rR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\rR\u0011\u0010\u001a\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\r¨\u0006\u001c"}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/configuration/TelemetryServiceExtras;", "Lcom/bamtech/sdk4/internal/configuration/ServiceExtras;", "()V", "bufferConfigurationDefault", "Lcom/bamtech/sdk4/internal/configuration/TelemetryBufferConfiguration;", "streamSampleBufferConfiguration", "eventBufferConfiguration", "glimpseBufferConfiguration", "qosBufferConfiguration", "fastTrack", "Lcom/bamtech/sdk4/internal/configuration/TelemetryUrnCollection;", "(Lcom/bamtech/sdk4/internal/configuration/TelemetryBufferConfiguration;Lcom/bamtech/sdk4/internal/configuration/TelemetryBufferConfiguration;Lcom/bamtech/sdk4/internal/configuration/TelemetryBufferConfiguration;Lcom/bamtech/sdk4/internal/configuration/TelemetryBufferConfiguration;Lcom/bamtech/sdk4/internal/configuration/TelemetryBufferConfiguration;Lcom/bamtech/sdk4/internal/configuration/TelemetryUrnCollection;)V", "getBufferConfigurationDefault", "()Lcom/bamtech/sdk4/internal/configuration/TelemetryBufferConfiguration;", "dustConfiguration", "getDustConfiguration", "getEventBufferConfiguration", "getFastTrack", "()Lcom/bamtech/sdk4/internal/configuration/TelemetryUrnCollection;", "getGlimpseBufferConfiguration", "glimpseConfiguration", "getGlimpseConfiguration", "getQosBufferConfiguration", "qosConfiguration", "getQosConfiguration", "getStreamSampleBufferConfiguration", "streamSampleConfiguration", "getStreamSampleConfiguration", "sdk-configuration"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: TelemetryServiceConfiguration.kt */
public final class TelemetryServiceExtras implements ServiceExtras {
    private final TelemetryBufferConfiguration bufferConfigurationDefault;
    private final TelemetryBufferConfiguration eventBufferConfiguration;
    private final TelemetryUrnCollection fastTrack;
    private final TelemetryBufferConfiguration glimpseBufferConfiguration;
    private final TelemetryBufferConfiguration qosBufferConfiguration;
    private final TelemetryBufferConfiguration streamSampleBufferConfiguration;

    public TelemetryServiceExtras(TelemetryBufferConfiguration telemetryBufferConfiguration, TelemetryBufferConfiguration telemetryBufferConfiguration2, TelemetryBufferConfiguration telemetryBufferConfiguration3, TelemetryBufferConfiguration telemetryBufferConfiguration4, TelemetryBufferConfiguration telemetryBufferConfiguration5, TelemetryUrnCollection telemetryUrnCollection) {
        this.bufferConfigurationDefault = telemetryBufferConfiguration;
        this.streamSampleBufferConfiguration = telemetryBufferConfiguration2;
        this.eventBufferConfiguration = telemetryBufferConfiguration3;
        this.glimpseBufferConfiguration = telemetryBufferConfiguration4;
        this.qosBufferConfiguration = telemetryBufferConfiguration5;
        this.fastTrack = telemetryUrnCollection;
    }

    public final TelemetryBufferConfiguration getDustConfiguration() {
        TelemetryBufferConfiguration telemetryBufferConfiguration = this.eventBufferConfiguration;
        return telemetryBufferConfiguration != null ? telemetryBufferConfiguration : this.bufferConfigurationDefault;
    }

    public final TelemetryUrnCollection getFastTrack() {
        return this.fastTrack;
    }

    public final TelemetryBufferConfiguration getGlimpseConfiguration() {
        TelemetryBufferConfiguration telemetryBufferConfiguration = this.glimpseBufferConfiguration;
        return telemetryBufferConfiguration != null ? telemetryBufferConfiguration : this.bufferConfigurationDefault;
    }

    public final TelemetryBufferConfiguration getQosConfiguration() {
        TelemetryBufferConfiguration telemetryBufferConfiguration = this.qosBufferConfiguration;
        return telemetryBufferConfiguration != null ? telemetryBufferConfiguration : this.bufferConfigurationDefault;
    }

    public final TelemetryBufferConfiguration getStreamSampleConfiguration() {
        TelemetryBufferConfiguration telemetryBufferConfiguration = this.streamSampleBufferConfiguration;
        return telemetryBufferConfiguration != null ? telemetryBufferConfiguration : this.bufferConfigurationDefault;
    }

    public TelemetryServiceExtras() {
        this(new TelemetryBufferConfiguration(), null, null, null, null, new TelemetryUrnCollection(C13185o.m40513a()));
    }
}
