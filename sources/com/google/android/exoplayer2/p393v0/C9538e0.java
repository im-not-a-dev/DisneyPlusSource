package com.google.android.exoplayer2.p393v0;

import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Looper;
import android.os.SystemClock;

/* renamed from: com.google.android.exoplayer2.v0.e0 */
/* compiled from: SystemClock */
final class C9538e0 implements C9542g {
    C9538e0() {
    }

    /* renamed from: a */
    public long mo24605a() {
        return SystemClock.elapsedRealtime();
    }

    /* renamed from: b */
    public long mo24607b() {
        return SystemClock.uptimeMillis();
    }

    /* renamed from: a */
    public C9562p mo24606a(Looper looper, Callback callback) {
        return new C9541f0(new Handler(looper, callback));
    }
}
