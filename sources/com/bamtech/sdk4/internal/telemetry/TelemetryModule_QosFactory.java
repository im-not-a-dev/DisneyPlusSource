package com.bamtech.sdk4.internal.telemetry;

import com.bamtech.sdk4.internal.telemetry.dust.DustClientConstants;
import com.bamtech.sdk4.media.DefaultQOSPlaybackEventListener;
import com.bamtech.shadow.dagger.p048a.C2111c;
import com.bamtech.shadow.dagger.p048a.C2113e;
import javax.inject.Provider;

public final class TelemetryModule_QosFactory implements C2111c<DefaultQOSPlaybackEventListener> {
    private final Provider<DustClientConstants> dustConstantsProvider;
    private final Provider<EventBuffer> eventBufferProvider;
    private final TelemetryModule module;

    public TelemetryModule_QosFactory(TelemetryModule telemetryModule, Provider<EventBuffer> provider, Provider<DustClientConstants> provider2) {
        this.module = telemetryModule;
        this.eventBufferProvider = provider;
        this.dustConstantsProvider = provider2;
    }

    public static TelemetryModule_QosFactory create(TelemetryModule telemetryModule, Provider<EventBuffer> provider, Provider<DustClientConstants> provider2) {
        return new TelemetryModule_QosFactory(telemetryModule, provider, provider2);
    }

    public DefaultQOSPlaybackEventListener get() {
        DefaultQOSPlaybackEventListener qos = this.module.qos((EventBuffer) this.eventBufferProvider.get(), (DustClientConstants) this.dustConstantsProvider.get());
        C2113e.m8178a(qos, "Cannot return null from a non-@Nullable @Provides method");
        return qos;
    }
}
