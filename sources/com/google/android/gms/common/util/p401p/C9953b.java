package com.google.android.gms.common.util.p401p;

import com.google.android.gms.common.internal.C9908u;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* renamed from: com.google.android.gms.common.util.p.b */
public class C9953b implements ThreadFactory {

    /* renamed from: U */
    private final ThreadFactory f23224U;

    /* renamed from: c */
    private final String f23225c;

    public C9953b(String str) {
        this(str, 0);
    }

    public Thread newThread(Runnable runnable) {
        Thread newThread = this.f23224U.newThread(new C9955d(runnable, 0));
        newThread.setName(this.f23225c);
        return newThread;
    }

    private C9953b(String str, int i) {
        this.f23224U = Executors.defaultThreadFactory();
        C9908u.m30854a(str, (Object) "Name must not be null");
        this.f23225c = str;
    }
}
