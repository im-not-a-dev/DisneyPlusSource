package com.bamtech.sdk4.media;

import kotlin.Metadata;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\nJ\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003J2\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010\u0014J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001c"}, mo31007d2 = {"Lcom/bamtech/sdk4/media/BitrateChangedEventData;", "Lcom/bamtech/sdk4/media/BaseQosClientData;", "playbackSessionId", "", "bitrate", "", "bitrateType", "Lcom/bamtech/sdk4/media/BitrateType;", "(Ljava/lang/String;Ljava/lang/Long;Lcom/bamtech/sdk4/media/BitrateType;)V", "getBitrate", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getBitrateType", "()Lcom/bamtech/sdk4/media/BitrateType;", "getPlaybackSessionId", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/Long;Lcom/bamtech/sdk4/media/BitrateType;)Lcom/bamtech/sdk4/media/BitrateChangedEventData;", "equals", "", "other", "", "hashCode", "", "toString", "extension-media_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: QOSEvent.kt */
public final class BitrateChangedEventData implements BaseQosClientData {
    private final Long bitrate;
    private final BitrateType bitrateType;
    private final String playbackSessionId;

    public BitrateChangedEventData(String str, Long l, BitrateType bitrateType2) {
        this.playbackSessionId = str;
        this.bitrate = l;
        this.bitrateType = bitrateType2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0028, code lost:
        if (kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r2.bitrateType, (java.lang.Object) r3.bitrateType) != false) goto L_0x002d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x002d
            boolean r0 = r3 instanceof com.bamtech.sdk4.media.BitrateChangedEventData
            if (r0 == 0) goto L_0x002b
            com.bamtech.sdk4.media.BitrateChangedEventData r3 = (com.bamtech.sdk4.media.BitrateChangedEventData) r3
            java.lang.String r0 = r2.getPlaybackSessionId()
            java.lang.String r1 = r3.getPlaybackSessionId()
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x002b
            java.lang.Long r0 = r2.bitrate
            java.lang.Long r1 = r3.bitrate
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x002b
            com.bamtech.sdk4.media.BitrateType r0 = r2.bitrateType
            com.bamtech.sdk4.media.BitrateType r3 = r3.bitrateType
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r3)
            if (r3 == 0) goto L_0x002b
            goto L_0x002d
        L_0x002b:
            r3 = 0
            return r3
        L_0x002d:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bamtech.sdk4.media.BitrateChangedEventData.equals(java.lang.Object):boolean");
    }

    public String getPlaybackSessionId() {
        return this.playbackSessionId;
    }

    public int hashCode() {
        String playbackSessionId2 = getPlaybackSessionId();
        int i = 0;
        int hashCode = (playbackSessionId2 != null ? playbackSessionId2.hashCode() : 0) * 31;
        Long l = this.bitrate;
        int hashCode2 = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        BitrateType bitrateType2 = this.bitrateType;
        if (bitrateType2 != null) {
            i = bitrateType2.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("BitrateChangedEventData(playbackSessionId=");
        sb.append(getPlaybackSessionId());
        sb.append(", bitrate=");
        sb.append(this.bitrate);
        sb.append(", bitrateType=");
        sb.append(this.bitrateType);
        sb.append(")");
        return sb.toString();
    }
}
