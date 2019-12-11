package com.bamtech.sdk4.internal.media;

import com.bamtech.core.annotations.android.DontObfuscate;
import com.bamtech.sdk4.internal.telemetry.TelemetryEvent;
import java.util.Map;
import kotlin.Metadata;

@DontObfuscate
@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u001e\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00050\u0001B%\u0012\u0016\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0002\u0010\b¨\u0006\t"}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/media/StreamSample;", "Lcom/bamtech/sdk4/internal/telemetry/TelemetryEvent;", "", "", "", "Lcom/bamtech/sdk4/internal/media/StreamSampleTelemetryData;", "server", "client", "(Ljava/util/Map;Lcom/bamtech/sdk4/internal/media/StreamSampleTelemetryData;)V", "extension-media_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: StreamSample.kt */
public final class StreamSample extends TelemetryEvent<Map<String, ? extends Object>, StreamSampleTelemetryData> {
    public StreamSample(Map<String, ? extends Object> map, StreamSampleTelemetryData streamSampleTelemetryData) {
        super(map, streamSampleTelemetryData);
    }
}
