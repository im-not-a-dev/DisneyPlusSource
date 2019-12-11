package com.bamtech.sdk4.media;

import kotlin.Metadata;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\b\u0018\u00002\u00020\u0001B7\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\tJ\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000bJ\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003JJ\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u0018J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cHÖ\u0003J\t\u0010\u001d\u001a\u00020\u0005HÖ\u0001J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000e¨\u0006\u001f"}, mo31007d2 = {"Lcom/bamtech/sdk4/media/AudioChangedEventData;", "Lcom/bamtech/sdk4/media/BaseQosClientData;", "playbackSessionId", "", "audioChannels", "", "audioCodec", "audioLanguage", "audioName", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAudioChannels", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getAudioCodec", "()Ljava/lang/String;", "getAudioLanguage", "getAudioName", "getPlaybackSessionId", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/bamtech/sdk4/media/AudioChangedEventData;", "equals", "", "other", "", "hashCode", "toString", "extension-media_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: QOSEvent.kt */
public final class AudioChangedEventData implements BaseQosClientData {
    private final Integer audioChannels;
    private final String audioCodec;
    private final String audioLanguage;
    private final String audioName;
    private final String playbackSessionId;

    public AudioChangedEventData(String str, Integer num, String str2, String str3, String str4) {
        this.playbackSessionId = str;
        this.audioChannels = num;
        this.audioCodec = str2;
        this.audioLanguage = str3;
        this.audioName = str4;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x003c, code lost:
        if (kotlin.jvm.internal.C12880j.m40224a((java.lang.Object) r2.audioName, (java.lang.Object) r3.audioName) != false) goto L_0x0041;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x0041
            boolean r0 = r3 instanceof com.bamtech.sdk4.media.AudioChangedEventData
            if (r0 == 0) goto L_0x003f
            com.bamtech.sdk4.media.AudioChangedEventData r3 = (com.bamtech.sdk4.media.AudioChangedEventData) r3
            java.lang.String r0 = r2.getPlaybackSessionId()
            java.lang.String r1 = r3.getPlaybackSessionId()
            boolean r0 = kotlin.jvm.internal.C12880j.m40224a(r0, r1)
            if (r0 == 0) goto L_0x003f
            java.lang.Integer r0 = r2.audioChannels
            java.lang.Integer r1 = r3.audioChannels
            boolean r0 = kotlin.jvm.internal.C12880j.m40224a(r0, r1)
            if (r0 == 0) goto L_0x003f
            java.lang.String r0 = r2.audioCodec
            java.lang.String r1 = r3.audioCodec
            boolean r0 = kotlin.jvm.internal.C12880j.m40224a(r0, r1)
            if (r0 == 0) goto L_0x003f
            java.lang.String r0 = r2.audioLanguage
            java.lang.String r1 = r3.audioLanguage
            boolean r0 = kotlin.jvm.internal.C12880j.m40224a(r0, r1)
            if (r0 == 0) goto L_0x003f
            java.lang.String r0 = r2.audioName
            java.lang.String r3 = r3.audioName
            boolean r3 = kotlin.jvm.internal.C12880j.m40224a(r0, r3)
            if (r3 == 0) goto L_0x003f
            goto L_0x0041
        L_0x003f:
            r3 = 0
            return r3
        L_0x0041:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bamtech.sdk4.media.AudioChangedEventData.equals(java.lang.Object):boolean");
    }

    public String getPlaybackSessionId() {
        return this.playbackSessionId;
    }

    public int hashCode() {
        String playbackSessionId2 = getPlaybackSessionId();
        int i = 0;
        int hashCode = (playbackSessionId2 != null ? playbackSessionId2.hashCode() : 0) * 31;
        Integer num = this.audioChannels;
        int hashCode2 = (hashCode + (num != null ? num.hashCode() : 0)) * 31;
        String str = this.audioCodec;
        int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.audioLanguage;
        int hashCode4 = (hashCode3 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.audioName;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode4 + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("AudioChangedEventData(playbackSessionId=");
        sb.append(getPlaybackSessionId());
        sb.append(", audioChannels=");
        sb.append(this.audioChannels);
        sb.append(", audioCodec=");
        sb.append(this.audioCodec);
        sb.append(", audioLanguage=");
        sb.append(this.audioLanguage);
        sb.append(", audioName=");
        sb.append(this.audioName);
        sb.append(")");
        return sb.toString();
    }
}
