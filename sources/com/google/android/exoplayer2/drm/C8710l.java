package com.google.android.exoplayer2.drm;

import android.os.Looper;
import com.google.android.exoplayer2.drm.C8712n;

/* renamed from: com.google.android.exoplayer2.drm.l */
/* compiled from: DrmSessionManager */
public interface C8710l<T extends C8712n> {
    DrmSession<T> acquireSession(Looper looper, DrmInitData drmInitData);

    boolean canAcquireSession(DrmInitData drmInitData);

    void releaseSession(DrmSession<T> drmSession);
}
