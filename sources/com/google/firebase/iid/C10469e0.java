package com.google.firebase.iid;

import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.firebase.iid.e0 */
/* compiled from: com.google.firebase:firebase-iid@@19.0.1 */
final class C10469e0 {

    /* renamed from: a */
    private static final Executor f24818a = C10474g0.f24824c;

    /* renamed from: a */
    static Executor m33044a() {
        return f24818a;
    }

    /* renamed from: b */
    static Executor m33045b() {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 30, TimeUnit.SECONDS, new LinkedBlockingQueue(), C10467d0.f24817c);
        return threadPoolExecutor;
    }

    /* renamed from: a */
    static final /* synthetic */ Thread m33043a(Runnable runnable) {
        return new Thread(runnable, "firebase-iid-executor");
    }
}
