package com.bamtech.sdk4.media;

import kotlin.Metadata;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B-\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nJ\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000eJ\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\tHÆ\u0003J>\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0002\u0010\u0019J\u0013\u0010\u001a\u001a\u00020\u00052\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cHÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006 "}, mo31007d2 = {"Lcom/bamtech/sdk4/media/MasterPlaylistFetchedEventData;", "Lcom/bamtech/sdk4/media/BaseQosClientData;", "playbackSessionId", "", "offline", "", "liveType", "Lcom/bamtech/sdk4/media/PlaylistLiveType;", "serverRequest", "Lcom/bamtech/sdk4/media/ServerRequest;", "(Ljava/lang/String;Ljava/lang/Boolean;Lcom/bamtech/sdk4/media/PlaylistLiveType;Lcom/bamtech/sdk4/media/ServerRequest;)V", "getLiveType", "()Lcom/bamtech/sdk4/media/PlaylistLiveType;", "getOffline", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getPlaybackSessionId", "()Ljava/lang/String;", "getServerRequest", "()Lcom/bamtech/sdk4/media/ServerRequest;", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/Boolean;Lcom/bamtech/sdk4/media/PlaylistLiveType;Lcom/bamtech/sdk4/media/ServerRequest;)Lcom/bamtech/sdk4/media/MasterPlaylistFetchedEventData;", "equals", "other", "", "hashCode", "", "toString", "extension-media_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: QOSEvent.kt */
public final class MasterPlaylistFetchedEventData implements BaseQosClientData {
    private final PlaylistLiveType liveType;
    private final Boolean offline;
    private final String playbackSessionId;
    private final ServerRequest serverRequest;

    public MasterPlaylistFetchedEventData(String str, Boolean bool, PlaylistLiveType playlistLiveType, ServerRequest serverRequest2) {
        this.playbackSessionId = str;
        this.offline = bool;
        this.liveType = playlistLiveType;
        this.serverRequest = serverRequest2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0032, code lost:
        if (kotlin.jvm.internal.C12880j.m40224a((java.lang.Object) r2.serverRequest, (java.lang.Object) r3.serverRequest) != false) goto L_0x0037;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x0037
            boolean r0 = r3 instanceof com.bamtech.sdk4.media.MasterPlaylistFetchedEventData
            if (r0 == 0) goto L_0x0035
            com.bamtech.sdk4.media.MasterPlaylistFetchedEventData r3 = (com.bamtech.sdk4.media.MasterPlaylistFetchedEventData) r3
            java.lang.String r0 = r2.getPlaybackSessionId()
            java.lang.String r1 = r3.getPlaybackSessionId()
            boolean r0 = kotlin.jvm.internal.C12880j.m40224a(r0, r1)
            if (r0 == 0) goto L_0x0035
            java.lang.Boolean r0 = r2.offline
            java.lang.Boolean r1 = r3.offline
            boolean r0 = kotlin.jvm.internal.C12880j.m40224a(r0, r1)
            if (r0 == 0) goto L_0x0035
            com.bamtech.sdk4.media.PlaylistLiveType r0 = r2.liveType
            com.bamtech.sdk4.media.PlaylistLiveType r1 = r3.liveType
            boolean r0 = kotlin.jvm.internal.C12880j.m40224a(r0, r1)
            if (r0 == 0) goto L_0x0035
            com.bamtech.sdk4.media.ServerRequest r0 = r2.serverRequest
            com.bamtech.sdk4.media.ServerRequest r3 = r3.serverRequest
            boolean r3 = kotlin.jvm.internal.C12880j.m40224a(r0, r3)
            if (r3 == 0) goto L_0x0035
            goto L_0x0037
        L_0x0035:
            r3 = 0
            return r3
        L_0x0037:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bamtech.sdk4.media.MasterPlaylistFetchedEventData.equals(java.lang.Object):boolean");
    }

    public String getPlaybackSessionId() {
        return this.playbackSessionId;
    }

    public int hashCode() {
        String playbackSessionId2 = getPlaybackSessionId();
        int i = 0;
        int hashCode = (playbackSessionId2 != null ? playbackSessionId2.hashCode() : 0) * 31;
        Boolean bool = this.offline;
        int hashCode2 = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        PlaylistLiveType playlistLiveType = this.liveType;
        int hashCode3 = (hashCode2 + (playlistLiveType != null ? playlistLiveType.hashCode() : 0)) * 31;
        ServerRequest serverRequest2 = this.serverRequest;
        if (serverRequest2 != null) {
            i = serverRequest2.hashCode();
        }
        return hashCode3 + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("MasterPlaylistFetchedEventData(playbackSessionId=");
        sb.append(getPlaybackSessionId());
        sb.append(", offline=");
        sb.append(this.offline);
        sb.append(", liveType=");
        sb.append(this.liveType);
        sb.append(", serverRequest=");
        sb.append(this.serverRequest);
        sb.append(")");
        return sb.toString();
    }
}
