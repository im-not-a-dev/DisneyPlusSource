package com.bamtech.sdk4.content;

import com.bamtech.sdk4.internal.telemetry.dust.Dust$Events;
import kotlin.Metadata;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\"\u0018\u0010\u0000\u001a\u00020\u0001*\u00020\u00028@X\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0018\u0010\u0005\u001a\u00020\u0001*\u00020\u00028@X\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0004¨\u0006\u0007"}, mo31007d2 = {"CONTENT_API_QUERY", "", "Lcom/bamtech/sdk4/internal/telemetry/dust/Dust$Events;", "getCONTENT_API_QUERY", "(Lcom/bamtech/sdk4/internal/telemetry/dust/Dust$Events;)Ljava/lang/String;", "CONTENT_API_SEARCH_SUGGEST", "getCONTENT_API_SEARCH_SUGGEST", "plugin-content"}, mo31008k = 2, mo31009mv = {1, 1, 15})
/* compiled from: ContentApi.kt */
public final class ContentApiKt {
    public static final String getCONTENT_API_QUERY(Dust$Events dust$Events) {
        return "urn:bamtech:dust:bamsdk:api:content:query";
    }
}
