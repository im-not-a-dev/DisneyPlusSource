package com.google.android.gms.common.util.p401p;

import android.os.Process;

/* renamed from: com.google.android.gms.common.util.p.d */
final class C9955d implements Runnable {

    /* renamed from: U */
    private final int f23229U;

    /* renamed from: c */
    private final Runnable f23230c;

    public C9955d(Runnable runnable, int i) {
        this.f23230c = runnable;
        this.f23229U = i;
    }

    public final void run() {
        Process.setThreadPriority(this.f23229U);
        this.f23230c.run();
    }
}
