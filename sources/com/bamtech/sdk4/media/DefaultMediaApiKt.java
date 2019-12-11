package com.bamtech.sdk4.media;

import com.bamtech.sdk4.internal.telemetry.dust.Dust$Events;
import kotlin.Metadata;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\"\u0018\u0010\u0000\u001a\u00020\u0001*\u00020\u00028@X\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0018\u0010\u0005\u001a\u00020\u0001*\u00020\u00028@X\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0004¨\u0006\u0007"}, mo31007d2 = {"MEDIA_API_GET_BIF_SET", "", "Lcom/bamtech/sdk4/internal/telemetry/dust/Dust$Events;", "getMEDIA_API_GET_BIF_SET", "(Lcom/bamtech/sdk4/internal/telemetry/dust/Dust$Events;)Ljava/lang/String;", "MEDIDA_API_GET_BIF", "getMEDIDA_API_GET_BIF", "sdk-core-api_release"}, mo31008k = 2, mo31009mv = {1, 1, 15})
/* compiled from: DefaultMediaApi.kt */
public final class DefaultMediaApiKt {
    public static final String getMEDIA_API_GET_BIF_SET(Dust$Events dust$Events) {
        return "urn:bamtech:dust:bamsdk:api:media:getBifThumbnailSets";
    }

    public static final String getMEDIDA_API_GET_BIF(Dust$Events dust$Events) {
        return "urn:bamtech:dust:bamsdk:api:media:getBifThumbnail";
    }
}
