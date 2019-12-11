package com.bamtech.sdk4.media;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b-\n\u0002\u0010\u0000\n\u0002\b\u0003\b\b\u0018\u00002\u00020\u0001B\u0001\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0014J\u000b\u0010+\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010,\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0002\u0010%J\u000b\u0010-\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u00101\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0016J\u000b\u00102\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u00105\u001a\u00020\nHÆ\u0003J\u0010\u00106\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010 J\u000b\u00107\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\u0003HÆ\u0003J´\u0001\u00109\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010:J\u0013\u0010;\u001a\u00020\u000f2\b\u0010<\u001a\u0004\u0018\u00010=HÖ\u0003J\t\u0010>\u001a\u00020\u0005HÖ\u0001J\t\u0010?\u001a\u00020\u0003HÖ\u0001R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0019R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0019R\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0019R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0015\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\n\n\u0002\u0010!\u001a\u0004\b\u001f\u0010 R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0019R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0019R\u0015\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\n\n\u0002\u0010&\u001a\u0004\b$\u0010%R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u0019R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u0019R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u0019R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\u0019¨\u0006@"}, mo31007d2 = {"Lcom/bamtech/sdk4/media/PlaybackInitializedEventData;", "Lcom/bamtech/sdk4/media/BaseQosClientData;", "playbackSessionId", "", "audioChannels", "", "audioCodec", "audioLanguage", "audioName", "playhead", "", "startBitrate", "subtitleLanguage", "subtitleName", "subtitleVisibility", "", "videoCodec", "videoRange", "videPlayerName", "videoPlayerVersion", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAudioChannels", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getAudioCodec", "()Ljava/lang/String;", "getAudioLanguage", "getAudioName", "getPlaybackSessionId", "getPlayhead", "()J", "getStartBitrate", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getSubtitleLanguage", "getSubtitleName", "getSubtitleVisibility", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getVidePlayerName", "getVideoCodec", "getVideoPlayerVersion", "getVideoRange", "component1", "component10", "component11", "component12", "component13", "component14", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/bamtech/sdk4/media/PlaybackInitializedEventData;", "equals", "other", "", "hashCode", "toString", "extension-media_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: QOSEvent.kt */
public final class PlaybackInitializedEventData implements BaseQosClientData {
    private final Integer audioChannels;
    private final String audioCodec;
    private final String audioLanguage;
    private final String audioName;
    private final String playbackSessionId;
    private final long playhead;
    private final Long startBitrate;
    private final String subtitleLanguage;
    private final String subtitleName;
    private final Boolean subtitleVisibility;
    private final String videPlayerName;
    private final String videoCodec;
    private final String videoPlayerVersion;
    private final String videoRange;

    public PlaybackInitializedEventData(String str, Integer num, String str2, String str3, String str4, long j, Long l, String str5, String str6, Boolean bool, String str7, String str8, String str9, String str10) {
        this.playbackSessionId = str;
        this.audioChannels = num;
        this.audioCodec = str2;
        this.audioLanguage = str3;
        this.audioName = str4;
        this.playhead = j;
        this.startBitrate = l;
        this.subtitleLanguage = str5;
        this.subtitleName = str6;
        this.subtitleVisibility = bool;
        this.videoCodec = str7;
        this.videoRange = str8;
        this.videPlayerName = str9;
        this.videoPlayerVersion = str10;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof PlaybackInitializedEventData) {
                PlaybackInitializedEventData playbackInitializedEventData = (PlaybackInitializedEventData) obj;
                if (Intrinsics.areEqual((Object) getPlaybackSessionId(), (Object) playbackInitializedEventData.getPlaybackSessionId()) && Intrinsics.areEqual((Object) this.audioChannels, (Object) playbackInitializedEventData.audioChannels) && Intrinsics.areEqual((Object) this.audioCodec, (Object) playbackInitializedEventData.audioCodec) && Intrinsics.areEqual((Object) this.audioLanguage, (Object) playbackInitializedEventData.audioLanguage) && Intrinsics.areEqual((Object) this.audioName, (Object) playbackInitializedEventData.audioName)) {
                    if (!(this.playhead == playbackInitializedEventData.playhead) || !Intrinsics.areEqual((Object) this.startBitrate, (Object) playbackInitializedEventData.startBitrate) || !Intrinsics.areEqual((Object) this.subtitleLanguage, (Object) playbackInitializedEventData.subtitleLanguage) || !Intrinsics.areEqual((Object) this.subtitleName, (Object) playbackInitializedEventData.subtitleName) || !Intrinsics.areEqual((Object) this.subtitleVisibility, (Object) playbackInitializedEventData.subtitleVisibility) || !Intrinsics.areEqual((Object) this.videoCodec, (Object) playbackInitializedEventData.videoCodec) || !Intrinsics.areEqual((Object) this.videoRange, (Object) playbackInitializedEventData.videoRange) || !Intrinsics.areEqual((Object) this.videPlayerName, (Object) playbackInitializedEventData.videPlayerName) || !Intrinsics.areEqual((Object) this.videoPlayerVersion, (Object) playbackInitializedEventData.videoPlayerVersion)) {
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
        Integer num = this.audioChannels;
        int hashCode2 = (hashCode + (num != null ? num.hashCode() : 0)) * 31;
        String str = this.audioCodec;
        int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.audioLanguage;
        int hashCode4 = (hashCode3 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.audioName;
        int hashCode5 = (hashCode4 + (str3 != null ? str3.hashCode() : 0)) * 31;
        long j = this.playhead;
        int i2 = (hashCode5 + ((int) (j ^ (j >>> 32)))) * 31;
        Long l = this.startBitrate;
        int hashCode6 = (i2 + (l != null ? l.hashCode() : 0)) * 31;
        String str4 = this.subtitleLanguage;
        int hashCode7 = (hashCode6 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.subtitleName;
        int hashCode8 = (hashCode7 + (str5 != null ? str5.hashCode() : 0)) * 31;
        Boolean bool = this.subtitleVisibility;
        int hashCode9 = (hashCode8 + (bool != null ? bool.hashCode() : 0)) * 31;
        String str6 = this.videoCodec;
        int hashCode10 = (hashCode9 + (str6 != null ? str6.hashCode() : 0)) * 31;
        String str7 = this.videoRange;
        int hashCode11 = (hashCode10 + (str7 != null ? str7.hashCode() : 0)) * 31;
        String str8 = this.videPlayerName;
        int hashCode12 = (hashCode11 + (str8 != null ? str8.hashCode() : 0)) * 31;
        String str9 = this.videoPlayerVersion;
        if (str9 != null) {
            i = str9.hashCode();
        }
        return hashCode12 + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PlaybackInitializedEventData(playbackSessionId=");
        sb.append(getPlaybackSessionId());
        sb.append(", audioChannels=");
        sb.append(this.audioChannels);
        sb.append(", audioCodec=");
        sb.append(this.audioCodec);
        sb.append(", audioLanguage=");
        sb.append(this.audioLanguage);
        sb.append(", audioName=");
        sb.append(this.audioName);
        sb.append(", playhead=");
        sb.append(this.playhead);
        sb.append(", startBitrate=");
        sb.append(this.startBitrate);
        sb.append(", subtitleLanguage=");
        sb.append(this.subtitleLanguage);
        sb.append(", subtitleName=");
        sb.append(this.subtitleName);
        sb.append(", subtitleVisibility=");
        sb.append(this.subtitleVisibility);
        sb.append(", videoCodec=");
        sb.append(this.videoCodec);
        sb.append(", videoRange=");
        sb.append(this.videoRange);
        sb.append(", videPlayerName=");
        sb.append(this.videPlayerName);
        sb.append(", videoPlayerVersion=");
        sb.append(this.videoPlayerVersion);
        sb.append(")");
        return sb.toString();
    }
}
