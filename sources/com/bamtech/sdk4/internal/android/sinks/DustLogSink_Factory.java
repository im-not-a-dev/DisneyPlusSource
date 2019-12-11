package com.bamtech.sdk4.internal.android.sinks;

import com.bamtech.sdk4.internal.telemetry.EventBuffer;
import com.bamtech.shadow.dagger.p048a.C2110b;
import com.bamtech.shadow.dagger.p048a.C2111c;
import javax.inject.Provider;

public final class DustLogSink_Factory implements C2111c<DustLogSink> {
    private final Provider<EventBuffer> telemetryManagerProvider;

    public DustLogSink_Factory(Provider<EventBuffer> provider) {
        this.telemetryManagerProvider = provider;
    }

    public static DustLogSink_Factory create(Provider<EventBuffer> provider) {
        return new DustLogSink_Factory(provider);
    }

    public DustLogSink get() {
        return new DustLogSink(C2110b.m8172a(this.telemetryManagerProvider));
    }
}
