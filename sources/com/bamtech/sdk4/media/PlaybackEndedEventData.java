package com.bamtech.sdk4.media;

import kotlin.Metadata;
import kotlin.jvm.internal.C12880j;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B+\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nJ\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\tHÆ\u0003J5\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bHÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001f"}, mo31007d2 = {"Lcom/bamtech/sdk4/media/PlaybackEndedEventData;", "Lcom/bamtech/sdk4/media/BaseQosClientData;", "playbackSessionId", "", "playhead", "", "cause", "Lcom/bamtech/sdk4/media/PlaybackEndCause;", "error", "Lcom/bamtech/sdk4/media/PlaybackError;", "(Ljava/lang/String;JLcom/bamtech/sdk4/media/PlaybackEndCause;Lcom/bamtech/sdk4/media/PlaybackError;)V", "getCause", "()Lcom/bamtech/sdk4/media/PlaybackEndCause;", "getError", "()Lcom/bamtech/sdk4/media/PlaybackError;", "getPlaybackSessionId", "()Ljava/lang/String;", "getPlayhead", "()J", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "", "toString", "extension-media_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: QOSEvent.kt */
public final class PlaybackEndedEventData implements BaseQosClientData {
    private final PlaybackEndCause cause;
    private final PlaybackError error;
    private final String playbackSessionId;
    private final long playhead;

    public PlaybackEndedEventData(String str, long j, PlaybackEndCause playbackEndCause, PlaybackError playbackError) {
        this.playbackSessionId = str;
        this.playhead = j;
        this.cause = playbackEndCause;
        this.error = playbackError;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof PlaybackEndedEventData) {
                PlaybackEndedEventData playbackEndedEventData = (PlaybackEndedEventData) obj;
                if (C12880j.m40224a((Object) getPlaybackSessionId(), (Object) playbackEndedEventData.getPlaybackSessionId())) {
                    if (!(this.playhead == playbackEndedEventData.playhead) || !C12880j.m40224a((Object) this.cause, (Object) playbackEndedEventData.cause) || !C12880j.m40224a((Object) this.error, (Object) playbackEndedEventData.error)) {
                        return false;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public String getPlaybackSessionId() {
        return this.playbackSessionId;
    }

    public int hashCode() {
        String playbackSessionId2 = getPlaybackSessionId();
        int i = 0;
        int hashCode = (playbackSessionId2 != null ? playbackSessionId2.hashCode() : 0) * 31;
        long j = this.playhead;
        int i2 = (hashCode + ((int) (j ^ (j >>> 32)))) * 31;
        PlaybackEndCause playbackEndCause = this.cause;
        int hashCode2 = (i2 + (playbackEndCause != null ? playbackEndCause.hashCode() : 0)) * 31;
        PlaybackError playbackError = this.error;
        if (playbackError != null) {
            i = playbackError.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PlaybackEndedEventData(playbackSessionId=");
        sb.append(getPlaybackSessionId());
        sb.append(", playhead=");
        sb.append(this.playhead);
        sb.append(", cause=");
        sb.append(this.cause);
        sb.append(", error=");
        sb.append(this.error);
        sb.append(")");
        return sb.toString();
    }

    public /* synthetic */ PlaybackEndedEventData(String str, long j, PlaybackEndCause playbackEndCause, PlaybackError playbackError, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 8) != 0) {
            playbackError = null;
        }
        this(str, j, playbackEndCause, playbackError);
    }
}
