package com.bamtech.sdk4.internal.media.offline;

import android.net.Uri;
import com.bamtech.sdk4.internal.media.Streamable;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.offline.StreamKey;
import kotlin.Metadata;
import kotlin.jvm.internal.C12880j;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0002\u0010\fJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001c\u001a\u00020\tHÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u000bHÆ\u0003J=\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bHÆ\u0001J\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\"HÖ\u0003J\t\u0010#\u001a\u00020\tHÖ\u0001J\u000e\u0010$\u001a\u00020 2\u0006\u0010%\u001a\u00020\u000bJ\b\u0010&\u001a\u00020\u000bH\u0016J\f\u0010'\u001a\u00020\u000b*\u00020\u0007H\u0002J\f\u0010'\u001a\u00020\u000b*\u00020\tH\u0002R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\tX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0011R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018¨\u0006("}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/media/offline/VariantCandidate;", "Lcom/bamtech/sdk4/internal/media/Streamable;", "url", "Landroid/net/Uri;", "format", "Lcom/google/android/exoplayer2/Format;", "trackKey", "Lcom/google/android/exoplayer2/offline/StreamKey;", "trackType", "", "audioGroupId", "", "(Landroid/net/Uri;Lcom/google/android/exoplayer2/Format;Lcom/google/android/exoplayer2/offline/StreamKey;ILjava/lang/String;)V", "getAudioGroupId", "()Ljava/lang/String;", "bitrate", "getBitrate", "()I", "getFormat", "()Lcom/google/android/exoplayer2/Format;", "getTrackKey", "()Lcom/google/android/exoplayer2/offline/StreamKey;", "getTrackType", "getUrl", "()Landroid/net/Uri;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "", "hashCode", "matchesGroupId", "id", "toString", "toLogString", "plugin-offline-media_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: VariantCandidate.kt */
public final class VariantCandidate implements Streamable {
    private final String audioGroupId;
    private final int bitrate;
    private final Format format;
    private final StreamKey trackKey;
    private final int trackType;
    private final Uri url;

    public VariantCandidate(Uri uri, Format format2, StreamKey streamKey, int i, String str) {
        this.url = uri;
        this.format = format2;
        this.trackKey = streamKey;
        this.trackType = i;
        this.audioGroupId = str;
        this.bitrate = this.format.f18345X;
    }

    private final String toLogString(int i) {
        return i != -1 ? i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 6 ? "OTHER" : "NONE" : "METADATA" : "TEXT" : "VIDEO" : "AUDIO" : "DEFAULT" : "UNKNOWN";
    }

    private final String toLogString(StreamKey streamKey) {
        StringBuilder sb = new StringBuilder();
        sb.append("TrackKey(periodIndex=");
        sb.append(streamKey.f18724c);
        sb.append(", groupIndex=");
        sb.append(streamKey.f18722U);
        sb.append(", trackIndex=");
        sb.append(streamKey.f18723V);
        sb.append(')');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof VariantCandidate) {
                VariantCandidate variantCandidate = (VariantCandidate) obj;
                if (C12880j.m40224a((Object) this.url, (Object) variantCandidate.url) && C12880j.m40224a((Object) this.format, (Object) variantCandidate.format) && C12880j.m40224a((Object) this.trackKey, (Object) variantCandidate.trackKey)) {
                    if (!(this.trackType == variantCandidate.trackType) || !C12880j.m40224a((Object) this.audioGroupId, (Object) variantCandidate.audioGroupId)) {
                        return false;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final String getAudioGroupId() {
        return this.audioGroupId;
    }

    public int getBitrate() {
        return this.bitrate;
    }

    public final Format getFormat() {
        return this.format;
    }

    public final StreamKey getTrackKey() {
        return this.trackKey;
    }

    public final int getTrackType() {
        return this.trackType;
    }

    public final Uri getUrl() {
        return this.url;
    }

    public int hashCode() {
        Uri uri = this.url;
        int i = 0;
        int hashCode = (uri != null ? uri.hashCode() : 0) * 31;
        Format format2 = this.format;
        int hashCode2 = (hashCode + (format2 != null ? format2.hashCode() : 0)) * 31;
        StreamKey streamKey = this.trackKey;
        int hashCode3 = (((hashCode2 + (streamKey != null ? streamKey.hashCode() : 0)) * 31) + this.trackType) * 31;
        String str = this.audioGroupId;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode3 + i;
    }

    public final boolean matchesGroupId(String str) {
        String str2 = this.format.f18350c;
        if (str2 != null) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(':');
            if (C12832w.m40123b(str2, sb.toString(), false, 2, null) || str2.equals(str)) {
                return true;
            }
        }
        return false;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Candidate(format=");
        sb.append(Format.m24885c(this.format));
        sb.append(", trackKey=");
        sb.append(toLogString(this.trackKey));
        sb.append(", trackType=");
        sb.append(toLogString(this.trackType));
        sb.append(')');
        return sb.toString();
    }

    public /* synthetic */ VariantCandidate(Uri uri, Format format2, StreamKey streamKey, int i, String str, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i2 & 16) != 0) {
            str = null;
        }
        this(uri, format2, streamKey, i, str);
    }
}
