package com.bamtech.sdk4.internal.media.offline.workers;

import com.bamtech.sdk4.internal.telemetry.dust.Dust$Events;
import kotlin.Metadata;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u000b\"\u0018\u0010\u0000\u001a\u00020\u0001*\u00020\u00028@X\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0018\u0010\u0005\u001a\u00020\u0001*\u00020\u00028@X\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0004\"\u0018\u0010\u0007\u001a\u00020\u0001*\u00020\u00028@X\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\u0004\"\u0018\u0010\t\u001a\u00020\u0001*\u00020\u00028@X\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u0004\"\u0018\u0010\u000b\u001a\u00020\u0001*\u00020\u00028@X\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\u0004¨\u0006\r"}, mo31007d2 = {"OFFLINE_MEDIA_API_DOWNLOAD_CANCELLED", "", "Lcom/bamtech/sdk4/internal/telemetry/dust/Dust$Events;", "getOFFLINE_MEDIA_API_DOWNLOAD_CANCELLED", "(Lcom/bamtech/sdk4/internal/telemetry/dust/Dust$Events;)Ljava/lang/String;", "OFFLINE_MEDIA_API_DOWNLOAD_COMPLETED", "getOFFLINE_MEDIA_API_DOWNLOAD_COMPLETED", "OFFLINE_MEDIA_API_DOWNLOAD_EXCEPTION", "getOFFLINE_MEDIA_API_DOWNLOAD_EXCEPTION", "OFFLINE_MEDIA_API_DOWNLOAD_INTERRUPTED", "getOFFLINE_MEDIA_API_DOWNLOAD_INTERRUPTED", "OFFLINE_MEDIA_API_DOWNLOAD_IN_PROGRESS", "getOFFLINE_MEDIA_API_DOWNLOAD_IN_PROGRESS", "plugin-offline-media_release"}, mo31008k = 2, mo31009mv = {1, 1, 15})
/* compiled from: DownloadMediaWorker.kt */
public final class DownloadMediaWorkerKt {
    public static final String getOFFLINE_MEDIA_API_DOWNLOAD_CANCELLED(Dust$Events dust$Events) {
        return "urn:bamtech:dust:bamsdk:api:media:downloadCancelled";
    }

    public static final String getOFFLINE_MEDIA_API_DOWNLOAD_COMPLETED(Dust$Events dust$Events) {
        return "urn:bamtech:dust:bamsdk:api:media:downloadCompleted";
    }

    public static final String getOFFLINE_MEDIA_API_DOWNLOAD_EXCEPTION(Dust$Events dust$Events) {
        return "urn:bamtech:dust:bamsdk:api:media:downloadException";
    }

    public static final String getOFFLINE_MEDIA_API_DOWNLOAD_INTERRUPTED(Dust$Events dust$Events) {
        return "urn:bamtech:dust:bamsdk:api:media:downloadInterrupted";
    }

    public static final String getOFFLINE_MEDIA_API_DOWNLOAD_IN_PROGRESS(Dust$Events dust$Events) {
        return "urn:bamtech:dust:bamsdk:api:media:downloadInProgress";
    }
}
