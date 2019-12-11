package com.bamtech.sdk4.media;

import com.bamtech.sdk4.internal.telemetry.TelemetryClientPayload;
import com.bamtech.sdk4.internal.telemetry.TelemetryEvent;
import java.util.Map;
import kotlin.Metadata;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0007\u0018\u0000 \n*\b\b\u0000\u0010\u0001*\u00020\u00022\u001e\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u0004\u0012\u0004\u0012\u0002H\u00010\u0003:\u0001\nB%\u0012\u0016\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u0004\u0012\u0006\u0010\b\u001a\u00028\u0000¢\u0006\u0002\u0010\t¨\u0006\u000b"}, mo31007d2 = {"Lcom/bamtech/sdk4/media/QOSEvent;", "T", "Lcom/bamtech/sdk4/internal/telemetry/TelemetryClientPayload;", "Lcom/bamtech/sdk4/internal/telemetry/TelemetryEvent;", "", "", "", "server", "client", "(Ljava/util/Map;Lcom/bamtech/sdk4/internal/telemetry/TelemetryClientPayload;)V", "Companion", "extension-media_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: QOSEvent.kt */
public final class QOSEvent<T extends TelemetryClientPayload> extends TelemetryEvent<Map<String, ? extends Object>, T> {

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0016\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u001a"}, mo31007d2 = {"Lcom/bamtech/sdk4/media/QOSEvent$Companion;", "", "()V", "AUDIO_EVENT_URN", "", "BITRATE_EVENT_URN", "CATEGORY", "DRM_CERTIFICATE_EVENT_URN", "DRM_KEY_EVENT_URN", "END_EVENT_URN", "INITIALIZED_EVENT_URN", "MASTER_PLAYLIST_EVENT_URN", "MEDIA_PAYLOAD_FETCHED_EVENT_URN", "MEDIA_SEGMENT_EVENT_URN", "PAUSE_EVENT_URN", "PLAYBACK_REQUESTED_EVENT", "PLAYBACK_SESSION_SAMPLED_EVENT_URN", "PLAYBACK_SESSION_TRANSFERED_EVENT_URN", "READY_EVENT_URN", "REBUFFERING_END_EVENT_URN", "REBUFFERING_START_EVENT_URN", "RESUMED_EVENT_URN", "SEEK_EVENT_URN", "START_EVENT_URN", "SUBTITLE_EVENT_URN", "VARIANT_PLAYLIST_EVENT_URN", "extension-media_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
    /* compiled from: QOSEvent.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        new Companion(null);
    }

    public QOSEvent(Map<String, ? extends Object> map, T t) {
        super(map, t);
    }
}
