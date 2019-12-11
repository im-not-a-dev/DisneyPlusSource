package com.bamtech.sdk4.media;

import com.bamtech.sdk4.internal.media.HlsPlaylistAttributes;
import com.bamtech.sdk4.internal.media.HlsPlaylistVariant;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C12880j;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\"\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001Bk\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\u0002\u0010\u0013J\u000b\u0010&\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0012HÆ\u0003J\t\u0010(\u001a\u00020\u0005HÆ\u0003J\t\u0010)\u001a\u00020\u0003HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010+\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u001bJ\u000b\u0010,\u001a\u0004\u0018\u00010\nHÆ\u0003J\u0011\u0010-\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fHÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\u0001\u00100\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÆ\u0001¢\u0006\u0002\u00101J\u0013\u00102\u001a\u00020\u00052\b\u00103\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u00104\u001a\u000205HÖ\u0001J\t\u00106\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0015\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u001c\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0019R\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0019R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0019R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0019\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%¨\u00067"}, mo31007d2 = {"Lcom/bamtech/sdk4/media/MediaPayloadFetchedEventData;", "Lcom/bamtech/sdk4/media/BaseQosClientData;", "playbackSessionId", "", "offline", "", "playbackUrl", "playbackScenario", "live", "attributes", "Lcom/bamtech/sdk4/internal/media/HlsPlaylistAttributes;", "variants", "", "Lcom/bamtech/sdk4/internal/media/HlsPlaylistVariant;", "fguid", "error", "", "serverRequest", "Lcom/bamtech/sdk4/media/ServerRequest;", "(Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lcom/bamtech/sdk4/internal/media/HlsPlaylistAttributes;Ljava/util/List;Ljava/lang/String;Ljava/lang/Object;Lcom/bamtech/sdk4/media/ServerRequest;)V", "getAttributes", "()Lcom/bamtech/sdk4/internal/media/HlsPlaylistAttributes;", "getError", "()Ljava/lang/Object;", "getFguid", "()Ljava/lang/String;", "getLive", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getOffline", "()Z", "getPlaybackScenario", "getPlaybackSessionId", "getPlaybackUrl", "getServerRequest", "()Lcom/bamtech/sdk4/media/ServerRequest;", "getVariants", "()Ljava/util/List;", "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lcom/bamtech/sdk4/internal/media/HlsPlaylistAttributes;Ljava/util/List;Ljava/lang/String;Ljava/lang/Object;Lcom/bamtech/sdk4/media/ServerRequest;)Lcom/bamtech/sdk4/media/MediaPayloadFetchedEventData;", "equals", "other", "hashCode", "", "toString", "extension-media_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: QOSEvent.kt */
public final class MediaPayloadFetchedEventData implements BaseQosClientData {
    private final HlsPlaylistAttributes attributes;
    private final Object error;
    private final String fguid;
    private final Boolean live;
    private final boolean offline;
    private final String playbackScenario;
    private final String playbackSessionId;
    private final String playbackUrl;
    private final ServerRequest serverRequest;
    private final List<HlsPlaylistVariant> variants;

    public MediaPayloadFetchedEventData(String str, boolean z, String str2, String str3, Boolean bool, HlsPlaylistAttributes hlsPlaylistAttributes, List<HlsPlaylistVariant> list, String str4, Object obj, ServerRequest serverRequest2) {
        this.playbackSessionId = str;
        this.offline = z;
        this.playbackUrl = str2;
        this.playbackScenario = str3;
        this.live = bool;
        this.attributes = hlsPlaylistAttributes;
        this.variants = list;
        this.fguid = str4;
        this.error = obj;
        this.serverRequest = serverRequest2;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof MediaPayloadFetchedEventData) {
                MediaPayloadFetchedEventData mediaPayloadFetchedEventData = (MediaPayloadFetchedEventData) obj;
                if (C12880j.m40224a((Object) getPlaybackSessionId(), (Object) mediaPayloadFetchedEventData.getPlaybackSessionId())) {
                    if (!(this.offline == mediaPayloadFetchedEventData.offline) || !C12880j.m40224a((Object) this.playbackUrl, (Object) mediaPayloadFetchedEventData.playbackUrl) || !C12880j.m40224a((Object) this.playbackScenario, (Object) mediaPayloadFetchedEventData.playbackScenario) || !C12880j.m40224a((Object) this.live, (Object) mediaPayloadFetchedEventData.live) || !C12880j.m40224a((Object) this.attributes, (Object) mediaPayloadFetchedEventData.attributes) || !C12880j.m40224a((Object) this.variants, (Object) mediaPayloadFetchedEventData.variants) || !C12880j.m40224a((Object) this.fguid, (Object) mediaPayloadFetchedEventData.fguid) || !C12880j.m40224a(this.error, mediaPayloadFetchedEventData.error) || !C12880j.m40224a((Object) this.serverRequest, (Object) mediaPayloadFetchedEventData.serverRequest)) {
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
        String str = this.playbackUrl;
        int hashCode2 = (i2 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.playbackScenario;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        Boolean bool = this.live;
        int hashCode4 = (hashCode3 + (bool != null ? bool.hashCode() : 0)) * 31;
        HlsPlaylistAttributes hlsPlaylistAttributes = this.attributes;
        int hashCode5 = (hashCode4 + (hlsPlaylistAttributes != null ? hlsPlaylistAttributes.hashCode() : 0)) * 31;
        List<HlsPlaylistVariant> list = this.variants;
        int hashCode6 = (hashCode5 + (list != null ? list.hashCode() : 0)) * 31;
        String str3 = this.fguid;
        int hashCode7 = (hashCode6 + (str3 != null ? str3.hashCode() : 0)) * 31;
        Object obj = this.error;
        int hashCode8 = (hashCode7 + (obj != null ? obj.hashCode() : 0)) * 31;
        ServerRequest serverRequest2 = this.serverRequest;
        if (serverRequest2 != null) {
            i = serverRequest2.hashCode();
        }
        return hashCode8 + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("MediaPayloadFetchedEventData(playbackSessionId=");
        sb.append(getPlaybackSessionId());
        sb.append(", offline=");
        sb.append(this.offline);
        sb.append(", playbackUrl=");
        sb.append(this.playbackUrl);
        sb.append(", playbackScenario=");
        sb.append(this.playbackScenario);
        sb.append(", live=");
        sb.append(this.live);
        sb.append(", attributes=");
        sb.append(this.attributes);
        sb.append(", variants=");
        sb.append(this.variants);
        sb.append(", fguid=");
        sb.append(this.fguid);
        sb.append(", error=");
        sb.append(this.error);
        sb.append(", serverRequest=");
        sb.append(this.serverRequest);
        sb.append(")");
        return sb.toString();
    }
}
