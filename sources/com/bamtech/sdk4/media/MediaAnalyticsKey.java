package com.bamtech.sdk4.media;

import kotlin.Metadata;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, mo31007d2 = {"Lcom/bamtech/sdk4/media/MediaAnalyticsKey;", "", "value", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "CONVIVA", "AD_ENGINE", "TELEMETRY", "extension-media_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: MediaItem.kt */
public enum MediaAnalyticsKey {
    CONVIVA("conviva"),
    AD_ENGINE("adEngine"),
    TELEMETRY("telemetry");
    
    private final String value;

    private MediaAnalyticsKey(String str) {
        this.value = str;
    }

    public final String getValue() {
        return this.value;
    }
}
