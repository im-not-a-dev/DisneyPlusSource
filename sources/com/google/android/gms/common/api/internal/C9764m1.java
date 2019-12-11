package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.util.p401p.C9954c;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.common.api.internal.m1 */
public final class C9764m1 {

    /* renamed from: a */
    private static final ExecutorService f22899a;

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 4, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new C9954c("GAC_Transform"));
        f22899a = threadPoolExecutor;
    }

    /* renamed from: a */
    public static ExecutorService m30393a() {
        return f22899a;
    }
}
