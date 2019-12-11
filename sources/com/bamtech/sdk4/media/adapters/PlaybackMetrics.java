package com.bamtech.sdk4.media.adapters;

import com.bamtech.sdk4.media.BitrateType;
import kotlin.Metadata;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u000f\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u000e¨\u0006\u0011"}, mo31007d2 = {"Lcom/bamtech/sdk4/media/adapters/PlaybackMetrics;", "", "currentBitrate", "", "currentPlayhead", "bitrateType", "Lcom/bamtech/sdk4/media/BitrateType;", "(Ljava/lang/Long;JLcom/bamtech/sdk4/media/BitrateType;)V", "getBitrateType", "()Lcom/bamtech/sdk4/media/BitrateType;", "getCurrentBitrate", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getCurrentPlayhead", "()J", "currentPlayheadInSeconds", "getCurrentPlayheadInSeconds", "extension-media_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: PlaybackMetrics.kt */
public final class PlaybackMetrics {
    private final BitrateType bitrateType;
    private final Long currentBitrate;
    private final long currentPlayhead;

    public PlaybackMetrics(Long l, long j, BitrateType bitrateType2) {
        this.currentBitrate = l;
        this.currentPlayhead = j;
        this.bitrateType = bitrateType2;
    }

    public final BitrateType getBitrateType() {
        return this.bitrateType;
    }

    public final Long getCurrentBitrate() {
        return this.currentBitrate;
    }

    public final long getCurrentPlayhead() {
        return this.currentPlayhead;
    }

    public final long getCurrentPlayheadInSeconds() {
        return this.currentPlayhead / ((long) 1000);
    }

    public /* synthetic */ PlaybackMetrics(Long l, long j, BitrateType bitrateType2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 4) != 0) {
            bitrateType2 = BitrateType.average;
        }
        this(l, j, bitrateType2);
    }
}
