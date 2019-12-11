package com.bamtech.sdk4.media;

import kotlin.Metadata;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B+\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, mo31007d2 = {"Lcom/bamtech/sdk4/media/PlaybackSampledEventData;", "Lcom/bamtech/sdk4/media/BaseQosClientData;", "playbackSessionId", "", "playhead", "", "currentBitrate", "bitrateType", "Lcom/bamtech/sdk4/media/BitrateType;", "(Ljava/lang/String;JLjava/lang/Long;Lcom/bamtech/sdk4/media/BitrateType;)V", "getBitrateType", "()Lcom/bamtech/sdk4/media/BitrateType;", "getCurrentBitrate", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getPlaybackSessionId", "()Ljava/lang/String;", "getPlayhead", "()J", "extension-media_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: QOSEvent.kt */
public final class PlaybackSampledEventData implements BaseQosClientData {
    private final String playbackSessionId;

    public PlaybackSampledEventData(String str, long j, Long l, BitrateType bitrateType) {
        this.playbackSessionId = str;
    }

    public String getPlaybackSessionId() {
        return this.playbackSessionId;
    }
}
