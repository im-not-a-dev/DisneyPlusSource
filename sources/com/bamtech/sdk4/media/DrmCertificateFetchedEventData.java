package com.bamtech.sdk4.media;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u001f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0007HÆ\u0003J)\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00052\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, mo31007d2 = {"Lcom/bamtech/sdk4/media/DrmCertificateFetchedEventData;", "Lcom/bamtech/sdk4/media/BaseQosClientData;", "playbackSessionId", "", "offline", "", "serverRequest", "Lcom/bamtech/sdk4/media/ServerRequest;", "(Ljava/lang/String;ZLcom/bamtech/sdk4/media/ServerRequest;)V", "getOffline", "()Z", "getPlaybackSessionId", "()Ljava/lang/String;", "getServerRequest", "()Lcom/bamtech/sdk4/media/ServerRequest;", "component1", "component2", "component3", "copy", "equals", "other", "", "hashCode", "", "toString", "extension-media_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: QOSEvent.kt */
public final class DrmCertificateFetchedEventData implements BaseQosClientData {
    private final boolean offline;
    private final String playbackSessionId;
    private final ServerRequest serverRequest;

    public DrmCertificateFetchedEventData(String str, boolean z, ServerRequest serverRequest2) {
        this.playbackSessionId = str;
        this.offline = z;
        this.serverRequest = serverRequest2;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof DrmCertificateFetchedEventData) {
                DrmCertificateFetchedEventData drmCertificateFetchedEventData = (DrmCertificateFetchedEventData) obj;
                if (Intrinsics.areEqual((Object) getPlaybackSessionId(), (Object) drmCertificateFetchedEventData.getPlaybackSessionId())) {
                    if (!(this.offline == drmCertificateFetchedEventData.offline) || !Intrinsics.areEqual((Object) this.serverRequest, (Object) drmCertificateFetchedEventData.serverRequest)) {
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
        boolean z = this.offline;
        if (z) {
            z = true;
        }
        int i2 = (hashCode + (z ? 1 : 0)) * 31;
        ServerRequest serverRequest2 = this.serverRequest;
        if (serverRequest2 != null) {
            i = serverRequest2.hashCode();
        }
        return i2 + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DrmCertificateFetchedEventData(playbackSessionId=");
        sb.append(getPlaybackSessionId());
        sb.append(", offline=");
        sb.append(this.offline);
        sb.append(", serverRequest=");
        sb.append(this.serverRequest);
        sb.append(")");
        return sb.toString();
    }
}
