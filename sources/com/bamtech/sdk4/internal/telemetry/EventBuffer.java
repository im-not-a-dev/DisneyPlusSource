package com.bamtech.sdk4.internal.telemetry;

import kotlin.Metadata;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J1\u0010\u0002\u001a\u00020\u0003\"\u0010\b\u0000\u0010\u0004*\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00052\u0006\u0010\u0006\u001a\u0002H\u00042\b\b\u0002\u0010\u0007\u001a\u00020\bH&¢\u0006\u0002\u0010\t¨\u0006\n"}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/telemetry/EventBuffer;", "", "postEvent", "", "T", "Lcom/bamtech/sdk4/internal/telemetry/TelemetryEvent;", "event", "requestType", "Lcom/bamtech/sdk4/internal/telemetry/RequestType;", "(Lcom/bamtech/sdk4/internal/telemetry/TelemetryEvent;Lcom/bamtech/sdk4/internal/telemetry/RequestType;)V", "sdk-base"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: EventBuffer.kt */
public interface EventBuffer {

    @Metadata(mo31005bv = {1, 0, 3}, mo31008k = 3, mo31009mv = {1, 1, 15})
    /* compiled from: EventBuffer.kt */
    public static final class DefaultImpls {
        public static /* synthetic */ void postEvent$default(EventBuffer eventBuffer, TelemetryEvent telemetryEvent, RequestType requestType, int i, Object obj) {
            if (obj == null) {
                if ((i & 2) != 0) {
                    requestType = RequestType.SequenceRequest;
                }
                eventBuffer.postEvent(telemetryEvent, requestType);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: postEvent");
        }
    }

    <T extends TelemetryEvent<?, ?>> void postEvent(T t, RequestType requestType);
}
