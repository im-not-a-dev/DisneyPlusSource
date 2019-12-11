package com.google.android.exoplayer2.drm;

import com.google.android.exoplayer2.drm.ExoMediaCrypto;
import java.util.Map;

public interface DrmSession<T extends ExoMediaCrypto> {

    /* renamed from: com.google.android.exoplayer2.drm.DrmSession$a */
    public static class DrmSessionException extends Exception {
        public DrmSessionException(Throwable th) {
            super(th);
        }
    }

    /* renamed from: a */
    Map<String, String> queryKeyStatus();

    /* renamed from: b */
    T getMediaCrypto();

    /* renamed from: c */
    byte[] getOfflineLicenseKeySetId();

    /* renamed from: d */
    int getState();

    DrmSessionException getError();
}
