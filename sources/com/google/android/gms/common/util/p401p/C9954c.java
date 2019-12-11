package com.google.android.gms.common.util.p401p;

import com.google.android.gms.common.internal.C9908u;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.google.android.gms.common.util.p.c */
public class C9954c implements ThreadFactory {

    /* renamed from: U */
    private final AtomicInteger f23226U;

    /* renamed from: V */
    private final ThreadFactory f23227V;

    /* renamed from: c */
    private final String f23228c;

    public C9954c(String str) {
        this(str, 0);
    }

    public Thread newThread(Runnable runnable) {
        Thread newThread = this.f23227V.newThread(new C9955d(runnable, 0));
        String str = this.f23228c;
        int andIncrement = this.f23226U.getAndIncrement();
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 13);
        sb.append(str);
        sb.append("[");
        sb.append(andIncrement);
        sb.append("]");
        newThread.setName(sb.toString());
        return newThread;
    }

    private C9954c(String str, int i) {
        this.f23226U = new AtomicInteger();
        this.f23227V = Executors.defaultThreadFactory();
        C9908u.m30854a(str, (Object) "Name must not be null");
        this.f23228c = str;
    }
}
