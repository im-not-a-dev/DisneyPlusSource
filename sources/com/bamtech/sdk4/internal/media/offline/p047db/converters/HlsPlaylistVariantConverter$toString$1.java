package com.bamtech.sdk4.internal.media.offline.p047db.converters;

import com.bamtech.sdk4.internal.media.HlsPlaylistVariant;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12880j;
import kotlin.jvm.internal.C12881k;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, mo31007d2 = {"<anonymous>", "", "variant", "Lcom/bamtech/sdk4/internal/media/HlsPlaylistVariant;", "invoke"}, mo31008k = 3, mo31009mv = {1, 1, 15})
/* renamed from: com.bamtech.sdk4.internal.media.offline.db.converters.HlsPlaylistVariantConverter$toString$1 */
/* compiled from: HlsPlaylistVariantConverter.kt */
final class HlsPlaylistVariantConverter$toString$1 extends C12881k implements Function1<HlsPlaylistVariant, String> {
    public static final HlsPlaylistVariantConverter$toString$1 INSTANCE = new HlsPlaylistVariantConverter$toString$1();

    HlsPlaylistVariantConverter$toString$1() {
        super(1);
    }

    public final String invoke(HlsPlaylistVariant hlsPlaylistVariant) {
        StringBuilder sb = new StringBuilder();
        sb.append(hlsPlaylistVariant.getBandwidth());
        String str = ";";
        sb.append(str);
        sb.append(hlsPlaylistVariant.getResolution());
        sb.append(str);
        sb.append(hlsPlaylistVariant.getVideoBytes());
        sb.append(str);
        Object maxAudioRenditionBytes = hlsPlaylistVariant.getMaxAudioRenditionBytes();
        String str2 = "";
        if (maxAudioRenditionBytes == 0) {
            maxAudioRenditionBytes = str2;
        }
        sb.append(maxAudioRenditionBytes);
        sb.append(str);
        Object maxSubtitleRenditionBytes = hlsPlaylistVariant.getMaxSubtitleRenditionBytes();
        if (maxSubtitleRenditionBytes == 0) {
            maxSubtitleRenditionBytes = str2;
        }
        sb.append(maxSubtitleRenditionBytes);
        sb.append(str);
        Object audioChannels = hlsPlaylistVariant.getAudioChannels();
        if (audioChannels == 0) {
            audioChannels = str2;
        }
        sb.append(audioChannels);
        sb.append(str);
        String videoRange = hlsPlaylistVariant.getVideoRange();
        if (videoRange == 0) {
            videoRange = str2;
        }
        sb.append(videoRange);
        sb.append(str);
        String videoCodec = hlsPlaylistVariant.getVideoCodec();
        if (videoCodec == 0) {
            videoCodec = str2;
        }
        sb.append(videoCodec);
        sb.append(str);
        String audioType = hlsPlaylistVariant.getAudioType();
        if (audioType == 0) {
            audioType = str2;
        }
        sb.append(audioType);
        sb.append(str);
        String audioCodec = hlsPlaylistVariant.getAudioCodec();
        if (audioCodec == 0) {
            audioCodec = str2;
        }
        sb.append(audioCodec);
        sb.append(str);
        String sb2 = sb.toString();
        C12880j.m40222a((Object) sb2, "StringBuilder()\n        …              .toString()");
        return sb2;
    }
}
