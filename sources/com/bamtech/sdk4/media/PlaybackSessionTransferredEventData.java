package com.bamtech.sdk4.media;

import kotlin.Metadata;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, mo31007d2 = {"Lcom/bamtech/sdk4/media/PlaybackSessionTransferredEventData;", "Lcom/bamtech/sdk4/media/BaseQosClientData;", "playbackSessionId", "", "(Ljava/lang/String;)V", "getPlaybackSessionId", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "extension-media_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: QOSEvent.kt */
public final class PlaybackSessionTransferredEventData implements BaseQosClientData {
    private final String playbackSessionId;

    public PlaybackSessionTransferredEventData(String str) {
        this.playbackSessionId = str;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0014, code lost:
        if (kotlin.jvm.internal.C12880j.m40224a((java.lang.Object) getPlaybackSessionId(), (java.lang.Object) ((com.bamtech.sdk4.media.PlaybackSessionTransferredEventData) r2).getPlaybackSessionId()) != false) goto L_0x0019;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r2) {
        /*
            r1 = this;
            if (r1 == r2) goto L_0x0019
            boolean r0 = r2 instanceof com.bamtech.sdk4.media.PlaybackSessionTransferredEventData
            if (r0 == 0) goto L_0x0017
            com.bamtech.sdk4.media.PlaybackSessionTransferredEventData r2 = (com.bamtech.sdk4.media.PlaybackSessionTransferredEventData) r2
            java.lang.String r0 = r1.getPlaybackSessionId()
            java.lang.String r2 = r2.getPlaybackSessionId()
            boolean r2 = kotlin.jvm.internal.C12880j.m40224a(r0, r2)
            if (r2 == 0) goto L_0x0017
            goto L_0x0019
        L_0x0017:
            r2 = 0
            return r2
        L_0x0019:
            r2 = 1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bamtech.sdk4.media.PlaybackSessionTransferredEventData.equals(java.lang.Object):boolean");
    }

    public String getPlaybackSessionId() {
        return this.playbackSessionId;
    }

    public int hashCode() {
        String playbackSessionId2 = getPlaybackSessionId();
        if (playbackSessionId2 != null) {
            return playbackSessionId2.hashCode();
        }
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PlaybackSessionTransferredEventData(playbackSessionId=");
        sb.append(getPlaybackSessionId());
        sb.append(")");
        return sb.toString();
    }
}
