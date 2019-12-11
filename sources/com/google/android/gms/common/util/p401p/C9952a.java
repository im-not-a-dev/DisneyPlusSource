package com.google.android.gms.common.util.p401p;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import p163g.p449j.p450a.p451a.p457d.p462e.C11001d;

/* renamed from: com.google.android.gms.common.util.p.a */
public class C9952a implements Executor {

    /* renamed from: c */
    private final Handler f23223c;

    public C9952a(Looper looper) {
        this.f23223c = new C11001d(looper);
    }

    public void execute(Runnable runnable) {
        this.f23223c.post(runnable);
    }
}
