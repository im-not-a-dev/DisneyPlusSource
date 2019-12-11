package com.bamtech.sdk4.internal.media;

import com.bamtech.core.annotations.android.DontObfuscate;
import com.bamtech.sdk4.internal.telemetry.TelemetryClientPayload;
import com.bamtech.shadow.gson.p050r.C2246c;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;

@DontObfuscate
@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0007\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tR\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\r\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0016\u0010\u0013\u001a\u00020\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011¨\u0006\u0016"}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/media/StreamSampleTelemetryData;", "Lcom/bamtech/sdk4/internal/telemetry/TelemetryClientPayload;", "playbackSessionId", "", "playHead", "", "bitrate", "fromCache", "", "(Ljava/lang/String;JLjava/lang/Long;Z)V", "getBitrate", "()Ljava/lang/Long;", "Ljava/lang/Long;", "event", "getEvent", "()Ljava/lang/String;", "getPlayHead", "()J", "getPlaybackSessionId", "timestamp", "getTimestamp", "Companion", "extension-media_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: StreamSampleTelemetryData.kt */
public final class StreamSampleTelemetryData implements TelemetryClientPayload {
    public static final String BITRATE_KEY = "bitrate";
    public static final Companion Companion = new Companion(null);
    public static final String PLAYHEAD_KEY = "play_head";
    public static final String SESSION_KEY = "playback_session_id";
    public static final String TIMESTAMP_KEY = "timestamp";
    @C2246c("bitrate")
    private final Long bitrate;
    private final String event;
    @C2246c("play_head")
    private final long playHead;
    @C2246c("playback_session_id")
    private final String playbackSessionId;
    @C2246c("timestamp")
    private final long timestamp;

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\b"}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/media/StreamSampleTelemetryData$Companion;", "", "()V", "BITRATE_KEY", "", "PLAYHEAD_KEY", "SESSION_KEY", "TIMESTAMP_KEY", "extension-media_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
    /* compiled from: StreamSampleTelemetryData.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public StreamSampleTelemetryData(String str, long j, Long l, boolean z) {
        this.playbackSessionId = str;
        this.playHead = j;
        this.bitrate = l;
        DateTime withZone = DateTime.now().withZone(DateTimeZone.UTC);
        Intrinsics.checkReturnedValueIsNotNull((Object) withZone, "DateTime.now().withZone(DateTimeZone.UTC)");
        this.timestamp = withZone.getMillis();
        this.event = z ? "urn:bamtech:api:local-stream-sample" : "urn:bamtech:api:stream-sample";
    }

    public final Long getBitrate() {
        return this.bitrate;
    }

    public String getEvent() {
        return this.event;
    }

    public final long getPlayHead() {
        return this.playHead;
    }

    public final String getPlaybackSessionId() {
        return this.playbackSessionId;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }

    public /* synthetic */ StreamSampleTelemetryData(String str, long j, Long l, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 4) != 0) {
            l = null;
        }
        this(str, j, l, (i & 8) != 0 ? false : z);
    }
}
