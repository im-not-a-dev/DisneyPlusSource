package com.bamtech.sdk4.internal.configuration;

import com.bamtech.sdk4.internal.telemetry.dust.Dust$Events;
import kotlin.Metadata;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\"\u000e\u0010\u0000\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\"\u0015\u0010\u0006\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005\"\u0015\u0010\b\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\t\u0010\u0005\"\u0015\u0010\n\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u0005¨\u0006\f"}, mo31007d2 = {"DEFAULT_BPS_FALLBACK", "", "BIF_THUMBNAIL", "Lcom/bamtech/sdk4/internal/telemetry/dust/Dust$Events;", "getBIF_THUMBNAIL", "(Lcom/bamtech/sdk4/internal/telemetry/dust/Dust$Events;)Ljava/lang/String;", "BIF_THUMBNAILS", "getBIF_THUMBNAILS", "MEDIA_GET_PLAYHEAD", "getMEDIA_GET_PLAYHEAD", "MEDIA_PAYLOAD", "getMEDIA_PAYLOAD", "sdk-configuration"}, mo31008k = 2, mo31009mv = {1, 1, 15})
/* compiled from: MediaServiceConfiguration.kt */
public final class MediaServiceConfigurationKt {
    public static final String getBIF_THUMBNAIL(Dust$Events dust$Events) {
        return "urn:bamtech:dust:bamsdk:service:media:bifThumbnail";
    }

    public static final String getBIF_THUMBNAILS(Dust$Events dust$Events) {
        return "urn:bamtech:dust:bamsdk:service:media:BifThumbnails";
    }

    public static final String getMEDIA_GET_PLAYHEAD(Dust$Events dust$Events) {
        return "urn:bamtech:dust:bamsdk:service:media:getPlayhead";
    }

    public static final String getMEDIA_PAYLOAD(Dust$Events dust$Events) {
        return "urn:bamtech:dust:bamsdk:service:media:mediaPayload";
    }
}
