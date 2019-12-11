package com.bamtech.sdk4.internal.media.offline.p047db.converters;

import com.google.android.exoplayer2.offline.StreamKey;
import kotlin.Metadata;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\b\b\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u001f\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006¢\u0006\u0002\u0010\tJ\t\u0010\u000e\u001a\u00020\u0006HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0006HÖ\u0001J\u0006\u0010\u0016\u001a\u00020\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0011\u0010\b\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000b¨\u0006\u001a"}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/media/offline/db/converters/StreamKeyCompat;", "", "key", "Lcom/google/android/exoplayer2/offline/StreamKey;", "(Lcom/google/android/exoplayer2/offline/StreamKey;)V", "groupIndex", "", "trackIndex", "formatVersion", "(III)V", "getFormatVersion", "()I", "getGroupIndex", "getTrackIndex", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toStreamKey", "toString", "", "Companion", "plugin-offline-media_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: com.bamtech.sdk4.internal.media.offline.db.converters.StreamKeyCompat */
/* compiled from: RenditionKeysConverter.kt */
final class StreamKeyCompat {
    private final int formatVersion;
    private final int groupIndex;
    private final int trackIndex;

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/media/offline/db/converters/StreamKeyCompat$Companion;", "", "()V", "maxFormatVersion", "", "plugin-offline-media_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
    /* renamed from: com.bamtech.sdk4.internal.media.offline.db.converters.StreamKeyCompat$Companion */
    /* compiled from: RenditionKeysConverter.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        new Companion(null);
    }

    public StreamKeyCompat(int i, int i2, int i3) {
        this.groupIndex = i;
        this.trackIndex = i2;
        this.formatVersion = i3;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof StreamKeyCompat) {
                StreamKeyCompat streamKeyCompat = (StreamKeyCompat) obj;
                if (this.groupIndex == streamKeyCompat.groupIndex) {
                    if (this.trackIndex == streamKeyCompat.trackIndex) {
                        if (this.formatVersion == streamKeyCompat.formatVersion) {
                            return true;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int getFormatVersion() {
        return this.formatVersion;
    }

    public int hashCode() {
        return (((this.groupIndex * 31) + this.trackIndex) * 31) + this.formatVersion;
    }

    public final StreamKey toStreamKey() {
        return new StreamKey(this.groupIndex, this.trackIndex);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("StreamKeyCompat(groupIndex=");
        sb.append(this.groupIndex);
        sb.append(", trackIndex=");
        sb.append(this.trackIndex);
        sb.append(", formatVersion=");
        sb.append(this.formatVersion);
        sb.append(")");
        return sb.toString();
    }

    public /* synthetic */ StreamKeyCompat(int i, int i2, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i4 & 4) != 0) {
            i3 = 0;
        }
        this(i, i2, i3);
    }

    public StreamKeyCompat(StreamKey streamKey) {
        this(streamKey.f18722U, streamKey.f18723V, 1);
    }
}
