package com.google.android.exoplayer2.drm;

import com.google.android.exoplayer2.drm.ExoMediaCrypto;
import java.util.Map;

public interface DrmSession<T extends ExoMediaCrypto> {

    /* renamed from: com.google.android.exoplayer2.drm.DrmSession$a */
    public static class C8694a extends Exception {
        public C8694a(Throwable th) {
            super(th);
        }
    }

    /* renamed from: a */
    Map<String, String> mo22770a();

    /* renamed from: b */
    T mo22771b();

    /* renamed from: c */
    byte[] mo22772c();

    /* renamed from: d */
    int mo22773d();

    C8694a getError();
}
