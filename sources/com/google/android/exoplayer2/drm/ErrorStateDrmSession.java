package com.google.android.exoplayer2.drm;

import com.google.android.exoplayer2.drm.ExoMediaCrypto;
import com.google.android.exoplayer2.drm.DrmSession.DrmSessionException;
import com.google.android.exoplayer2.util.Assertions;
import java.util.Map;

/* renamed from: com.google.android.exoplayer2.drm.m */
/* compiled from: ErrorStateDrmSession */
public final class ErrorStateDrmSession<T extends ExoMediaCrypto> implements DrmSession<T> {

    /* renamed from: a */
    private final DrmSessionException error;

    public ErrorStateDrmSession(DrmSessionException aVar) {
        Assertions.checkNotNull(aVar);
        this.error = aVar;
    }

    /* renamed from: a */
    public Map<String, String> queryKeyStatus() {
        return null;
    }

    /* renamed from: b */
    public T getMediaCrypto() {
        return null;
    }

    /* renamed from: c */
    public byte[] getOfflineLicenseKeySetId() {
        return null;
    }

    /* renamed from: d */
    public int getState() {
        return 1;
    }

    public DrmSessionException getError() {
        return this.error;
    }
}
