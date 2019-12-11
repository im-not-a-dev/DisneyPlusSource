package com.google.android.gms.common.util;

import android.os.SystemClock;

/* renamed from: com.google.android.gms.common.util.h */
public class C9944h implements C9941e {

    /* renamed from: a */
    private static final C9944h f23216a = new C9944h();

    private C9944h() {
    }

    /* renamed from: d */
    public static C9941e m30977d() {
        return f23216a;
    }

    /* renamed from: a */
    public long mo25472a() {
        return SystemClock.elapsedRealtime();
    }

    /* renamed from: b */
    public long mo25473b() {
        return System.nanoTime();
    }

    /* renamed from: c */
    public long mo25474c() {
        return System.currentTimeMillis();
    }
}
