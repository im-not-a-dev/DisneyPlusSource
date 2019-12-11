package com.bamtech.sdk4.media;

import kotlin.Metadata;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B-\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u000eJ>\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010\u0015J\u0013\u0010\u0016\u001a\u00020\u00072\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000e¨\u0006\u001c"}, mo31007d2 = {"Lcom/bamtech/sdk4/media/SubtitleChangedEventData;", "Lcom/bamtech/sdk4/media/BaseQosClientData;", "playbackSessionId", "", "subtitleLanguage", "subtitleName", "subtitleVisibility", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V", "getPlaybackSessionId", "()Ljava/lang/String;", "getSubtitleLanguage", "getSubtitleName", "getSubtitleVisibility", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)Lcom/bamtech/sdk4/media/SubtitleChangedEventData;", "equals", "other", "", "hashCode", "", "toString", "extension-media_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: QOSEvent.kt */
public final class SubtitleChangedEventData implements BaseQosClientData {
    private final String playbackSessionId;
    private final String subtitleLanguage;
    private final String subtitleName;
    private final Boolean subtitleVisibility;

    public SubtitleChangedEventData(String str, String str2, String str3, Boolean bool) {
        this.playbackSessionId = str;
        this.subtitleLanguage = str2;
        this.subtitleName = str3;
        this.subtitleVisibility = bool;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0032, code lost:
        if (kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r2.subtitleVisibility, (java.lang.Object) r3.subtitleVisibility) != false) goto L_0x0037;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x0037
            boolean r0 = r3 instanceof com.bamtech.sdk4.media.SubtitleChangedEventData
            if (r0 == 0) goto L_0x0035
            com.bamtech.sdk4.media.SubtitleChangedEventData r3 = (com.bamtech.sdk4.media.SubtitleChangedEventData) r3
            java.lang.String r0 = r2.getPlaybackSessionId()
            java.lang.String r1 = r3.getPlaybackSessionId()
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x0035
            java.lang.String r0 = r2.subtitleLanguage
            java.lang.String r1 = r3.subtitleLanguage
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x0035
            java.lang.String r0 = r2.subtitleName
            java.lang.String r1 = r3.subtitleName
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x0035
            java.lang.Boolean r0 = r2.subtitleVisibility
            java.lang.Boolean r3 = r3.subtitleVisibility
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r3)
            if (r3 == 0) goto L_0x0035
            goto L_0x0037
        L_0x0035:
            r3 = 0
            return r3
        L_0x0037:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bamtech.sdk4.media.SubtitleChangedEventData.equals(java.lang.Object):boolean");
    }

    public String getPlaybackSessionId() {
        return this.playbackSessionId;
    }

    public int hashCode() {
        String playbackSessionId2 = getPlaybackSessionId();
        int i = 0;
        int hashCode = (playbackSessionId2 != null ? playbackSessionId2.hashCode() : 0) * 31;
        String str = this.subtitleLanguage;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.subtitleName;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        Boolean bool = this.subtitleVisibility;
        if (bool != null) {
            i = bool.hashCode();
        }
        return hashCode3 + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SubtitleChangedEventData(playbackSessionId=");
        sb.append(getPlaybackSessionId());
        sb.append(", subtitleLanguage=");
        sb.append(this.subtitleLanguage);
        sb.append(", subtitleName=");
        sb.append(this.subtitleName);
        sb.append(", subtitleVisibility=");
        sb.append(this.subtitleVisibility);
        sb.append(")");
        return sb.toString();
    }
}
