package com.bamtech.sdk4.internal.media;

import com.bamtech.core.annotations.android.DontObfuscate;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import net.danlew.android.joda.DateUtils;

@DontObfuscate
@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b%\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\b\u0018\u00002\u00020\u0001Bc\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u000fJ\t\u0010#\u001a\u00020\u0003HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010%\u001a\u00020\u0005HÆ\u0003J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\u0010\u0010'\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u001cJ\u0010\u0010(\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u001cJ\u0010\u0010)\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010\u0011J\u000b\u0010*\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0001\u0010-\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010.J\u0013\u0010/\u001a\u0002002\b\u00101\u001a\u0004\u0018\u000102HÖ\u0003J\t\u00103\u001a\u00020\nHÖ\u0001J\t\u00104\u001a\u00020\u0005HÖ\u0001R\u0015\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0018\u001a\u00020\n8VX\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u001d\u001a\u0004\b\u001b\u0010\u001cR\u0015\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u001d\u001a\u0004\b\u001e\u0010\u001cR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0014R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0017R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0014R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0014¨\u00065"}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/media/HlsPlaylistVariant;", "Lcom/bamtech/sdk4/internal/media/Streamable;", "bandwidth", "", "resolution", "", "videoBytes", "maxAudioRenditionBytes", "maxSubtitleRenditionBytes", "audioChannels", "", "videoRange", "videoCodec", "audioType", "audioCodec", "(JLjava/lang/String;JLjava/lang/Long;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAudioChannels", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getAudioCodec", "()Ljava/lang/String;", "getAudioType", "getBandwidth", "()J", "bitrate", "getBitrate", "()I", "getMaxAudioRenditionBytes", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getMaxSubtitleRenditionBytes", "getResolution", "getVideoBytes", "getVideoCodec", "getVideoRange", "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(JLjava/lang/String;JLjava/lang/Long;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/bamtech/sdk4/internal/media/HlsPlaylistVariant;", "equals", "", "other", "", "hashCode", "toString", "extension-media_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: PlaylistResponse.kt */
public final class HlsPlaylistVariant implements Streamable {
    private final Integer audioChannels;
    private final String audioCodec;
    private final String audioType;
    private final long bandwidth;
    private final Long maxAudioRenditionBytes;
    private final Long maxSubtitleRenditionBytes;
    private final String resolution;
    private final long videoBytes;
    private final String videoCodec;
    private final String videoRange;

    public HlsPlaylistVariant(long j, String str, long j2, Long l, Long l2, Integer num, String str2, String str3, String str4, String str5) {
        this.bandwidth = j;
        this.resolution = str;
        this.videoBytes = j2;
        this.maxAudioRenditionBytes = l;
        this.maxSubtitleRenditionBytes = l2;
        this.audioChannels = num;
        this.videoRange = str2;
        this.videoCodec = str3;
        this.audioType = str4;
        this.audioCodec = str5;
    }

    public static /* synthetic */ HlsPlaylistVariant copy$default(HlsPlaylistVariant hlsPlaylistVariant, long j, String str, long j2, Long l, Long l2, Integer num, String str2, String str3, String str4, String str5, int i, Object obj) {
        HlsPlaylistVariant hlsPlaylistVariant2 = hlsPlaylistVariant;
        int i2 = i;
        return hlsPlaylistVariant.copy((i2 & 1) != 0 ? hlsPlaylistVariant2.bandwidth : j, (i2 & 2) != 0 ? hlsPlaylistVariant2.resolution : str, (i2 & 4) != 0 ? hlsPlaylistVariant2.videoBytes : j2, (i2 & 8) != 0 ? hlsPlaylistVariant2.maxAudioRenditionBytes : l, (i2 & 16) != 0 ? hlsPlaylistVariant2.maxSubtitleRenditionBytes : l2, (i2 & 32) != 0 ? hlsPlaylistVariant2.audioChannels : num, (i2 & 64) != 0 ? hlsPlaylistVariant2.videoRange : str2, (i2 & 128) != 0 ? hlsPlaylistVariant2.videoCodec : str3, (i2 & 256) != 0 ? hlsPlaylistVariant2.audioType : str4, (i2 & DateUtils.FORMAT_NO_NOON) != 0 ? hlsPlaylistVariant2.audioCodec : str5);
    }

    public final long component1() {
        return this.bandwidth;
    }

    public final String component10() {
        return this.audioCodec;
    }

    public final String component2() {
        return this.resolution;
    }

    public final long component3() {
        return this.videoBytes;
    }

    public final Long component4() {
        return this.maxAudioRenditionBytes;
    }

    public final Long component5() {
        return this.maxSubtitleRenditionBytes;
    }

    public final Integer component6() {
        return this.audioChannels;
    }

    public final String component7() {
        return this.videoRange;
    }

    public final String component8() {
        return this.videoCodec;
    }

    public final String component9() {
        return this.audioType;
    }

    public final HlsPlaylistVariant copy(long j, String str, long j2, Long l, Long l2, Integer num, String str2, String str3, String str4, String str5) {
        HlsPlaylistVariant hlsPlaylistVariant = new HlsPlaylistVariant(j, str, j2, l, l2, num, str2, str3, str4, str5);
        return hlsPlaylistVariant;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HlsPlaylistVariant) {
                HlsPlaylistVariant hlsPlaylistVariant = (HlsPlaylistVariant) obj;
                if ((this.bandwidth == hlsPlaylistVariant.bandwidth) && Intrinsics.areEqual((Object) this.resolution, (Object) hlsPlaylistVariant.resolution)) {
                    if (!(this.videoBytes == hlsPlaylistVariant.videoBytes) || !Intrinsics.areEqual((Object) this.maxAudioRenditionBytes, (Object) hlsPlaylistVariant.maxAudioRenditionBytes) || !Intrinsics.areEqual((Object) this.maxSubtitleRenditionBytes, (Object) hlsPlaylistVariant.maxSubtitleRenditionBytes) || !Intrinsics.areEqual((Object) this.audioChannels, (Object) hlsPlaylistVariant.audioChannels) || !Intrinsics.areEqual((Object) this.videoRange, (Object) hlsPlaylistVariant.videoRange) || !Intrinsics.areEqual((Object) this.videoCodec, (Object) hlsPlaylistVariant.videoCodec) || !Intrinsics.areEqual((Object) this.audioType, (Object) hlsPlaylistVariant.audioType) || !Intrinsics.areEqual((Object) this.audioCodec, (Object) hlsPlaylistVariant.audioCodec)) {
                        return false;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final Integer getAudioChannels() {
        return this.audioChannels;
    }

    public final String getAudioCodec() {
        return this.audioCodec;
    }

    public final String getAudioType() {
        return this.audioType;
    }

    public final long getBandwidth() {
        return this.bandwidth;
    }

    public int getBitrate() {
        return (int) this.bandwidth;
    }

    public final Long getMaxAudioRenditionBytes() {
        return this.maxAudioRenditionBytes;
    }

    public final Long getMaxSubtitleRenditionBytes() {
        return this.maxSubtitleRenditionBytes;
    }

    public final String getResolution() {
        return this.resolution;
    }

    public final long getVideoBytes() {
        return this.videoBytes;
    }

    public final String getVideoCodec() {
        return this.videoCodec;
    }

    public final String getVideoRange() {
        return this.videoRange;
    }

    public int hashCode() {
        long j = this.bandwidth;
        int i = ((int) (j ^ (j >>> 32))) * 31;
        String str = this.resolution;
        int i2 = 0;
        int hashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        long j2 = this.videoBytes;
        int i3 = (hashCode + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        Long l = this.maxAudioRenditionBytes;
        int hashCode2 = (i3 + (l != null ? l.hashCode() : 0)) * 31;
        Long l2 = this.maxSubtitleRenditionBytes;
        int hashCode3 = (hashCode2 + (l2 != null ? l2.hashCode() : 0)) * 31;
        Integer num = this.audioChannels;
        int hashCode4 = (hashCode3 + (num != null ? num.hashCode() : 0)) * 31;
        String str2 = this.videoRange;
        int hashCode5 = (hashCode4 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.videoCodec;
        int hashCode6 = (hashCode5 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.audioType;
        int hashCode7 = (hashCode6 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.audioCodec;
        if (str5 != null) {
            i2 = str5.hashCode();
        }
        return hashCode7 + i2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("HlsPlaylistVariant(bandwidth=");
        sb.append(this.bandwidth);
        sb.append(", resolution=");
        sb.append(this.resolution);
        sb.append(", videoBytes=");
        sb.append(this.videoBytes);
        sb.append(", maxAudioRenditionBytes=");
        sb.append(this.maxAudioRenditionBytes);
        sb.append(", maxSubtitleRenditionBytes=");
        sb.append(this.maxSubtitleRenditionBytes);
        sb.append(", audioChannels=");
        sb.append(this.audioChannels);
        sb.append(", videoRange=");
        sb.append(this.videoRange);
        sb.append(", videoCodec=");
        sb.append(this.videoCodec);
        sb.append(", audioType=");
        sb.append(this.audioType);
        sb.append(", audioCodec=");
        sb.append(this.audioCodec);
        sb.append(")");
        return sb.toString();
    }
}
