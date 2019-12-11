package com.bamtech.sdk4.media;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\r\u001a\u00020\u00052\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0007R\u0014\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0013"}, mo31007d2 = {"Lcom/bamtech/sdk4/media/DefaultPlaybackContext;", "Lcom/bamtech/sdk4/media/PlaybackContext;", "playbackSessionId", "", "isPreBuffering", "", "(Ljava/lang/String;Z)V", "()Z", "getPlaybackSessionId", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "other", "", "hashCode", "", "toString", "extension-media_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: PlaybackContext.kt */
public final class DefaultPlaybackContext implements PlaybackContext {
    private final boolean isPreBuffering;
    private final String playbackSessionId;

    public DefaultPlaybackContext(String str, boolean z) {
        this.playbackSessionId = str;
        this.isPreBuffering = z;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof DefaultPlaybackContext) {
                DefaultPlaybackContext defaultPlaybackContext = (DefaultPlaybackContext) obj;
                if (Intrinsics.areEqual((Object) getPlaybackSessionId(), (Object) defaultPlaybackContext.getPlaybackSessionId())) {
                    if (isPreBuffering() == defaultPlaybackContext.isPreBuffering()) {
                        return true;
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
        int hashCode = (playbackSessionId2 != null ? playbackSessionId2.hashCode() : 0) * 31;
        boolean isPreBuffering2 = isPreBuffering();
        if (isPreBuffering2) {
            isPreBuffering2 = true;
        }
        return hashCode + (isPreBuffering2 ? 1 : 0);
    }

    public boolean isPreBuffering() {
        return this.isPreBuffering;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DefaultPlaybackContext(playbackSessionId=");
        sb.append(getPlaybackSessionId());
        sb.append(", isPreBuffering=");
        sb.append(isPreBuffering());
        sb.append(")");
        return sb.toString();
    }
}
