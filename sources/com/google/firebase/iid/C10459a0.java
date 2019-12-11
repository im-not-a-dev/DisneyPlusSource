package com.google.firebase.iid;

import android.content.BroadcastReceiver.PendingResult;
import android.content.Intent;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.firebase.iid.a0 */
/* compiled from: com.google.firebase:firebase-iid@@19.0.1 */
final class C10459a0 {

    /* renamed from: a */
    final Intent f24801a;

    /* renamed from: b */
    private final PendingResult f24802b;

    /* renamed from: c */
    private boolean f24803c = false;

    /* renamed from: d */
    private final ScheduledFuture<?> f24804d;

    C10459a0(Intent intent, PendingResult pendingResult, ScheduledExecutorService scheduledExecutorService) {
        this.f24801a = intent;
        this.f24802b = pendingResult;
        this.f24804d = scheduledExecutorService.schedule(new C10465c0(this, intent), 9000, TimeUnit.MILLISECONDS);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final synchronized void mo27290a() {
        if (!this.f24803c) {
            this.f24802b.finish();
            this.f24804d.cancel(false);
            this.f24803c = true;
        }
    }
}
