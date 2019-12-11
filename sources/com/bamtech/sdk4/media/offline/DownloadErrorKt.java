package com.bamtech.sdk4.media.offline;

import com.bamtech.sdk4.service.ErrorReason;
import kotlin.Metadata;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0002\u001a\u00020\u0003*\u00020\u0004\"\u000e\u0010\u0000\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, mo31007d2 = {"maxReasons", "", "toDownloadErrorReason", "Lcom/bamtech/sdk4/media/offline/DownloadErrorReason;", "Lcom/bamtech/sdk4/service/ErrorReason;", "extension-media_release"}, mo31008k = 2, mo31009mv = {1, 1, 15})
/* compiled from: DownloadError.kt */
public final class DownloadErrorKt {
    public static final DownloadErrorReason toDownloadErrorReason(ErrorReason errorReason) {
        if (errorReason instanceof DownloadErrorReason) {
            return (DownloadErrorReason) errorReason;
        }
        return new DownloadErrorReason(errorReason.getCode(), errorReason.getDescription());
    }
}
