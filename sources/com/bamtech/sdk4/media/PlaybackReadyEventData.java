package com.bamtech.sdk4.media;

import kotlin.Metadata;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, mo31007d2 = {"Lcom/bamtech/sdk4/media/PlaybackReadyEventData;", "Lcom/bamtech/sdk4/media/BaseQosClientData;", "playbackSessionId", "", "bufferedTime", "", "(Ljava/lang/String;Ljava/lang/Long;)V", "getBufferedTime", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getPlaybackSessionId", "()Ljava/lang/String;", "extension-media_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: QOSEvent.kt */
public final class PlaybackReadyEventData implements BaseQosClientData {
    private final String playbackSessionId;

    public PlaybackReadyEventData(String str, Long l) {
        this.playbackSessionId = str;
    }

    public String getPlaybackSessionId() {
        return this.playbackSessionId;
    }
}
