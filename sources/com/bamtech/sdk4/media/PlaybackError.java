package com.bamtech.sdk4.media;

import com.bamtech.core.annotations.android.DontObfuscate;
import kotlin.Metadata;

@DontObfuscate
@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0010\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0011"}, mo31007d2 = {"Lcom/bamtech/sdk4/media/PlaybackError;", "", "(Ljava/lang/String;I)V", "drmHdcp", "drmDecryption", "drmExpiredLicense", "drmSecurityLevel", "drmOther", "networkFailure", "serviceError", "authorizationExpired", "concurrency", "pcon", "blackout", "notEntitled", "contentNotAvailable", "unknown", "extension-media_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: QOSEvent.kt */
public enum PlaybackError {
    drmHdcp,
    drmDecryption,
    drmExpiredLicense,
    drmSecurityLevel,
    drmOther,
    networkFailure,
    serviceError,
    authorizationExpired,
    concurrency,
    pcon,
    blackout,
    notEntitled,
    contentNotAvailable,
    unknown
}
