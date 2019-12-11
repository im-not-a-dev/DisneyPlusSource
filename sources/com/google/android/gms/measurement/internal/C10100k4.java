package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.C9908u;
import java.lang.Thread.UncaughtExceptionHandler;

/* renamed from: com.google.android.gms.measurement.internal.k4 */
final class C10100k4 implements UncaughtExceptionHandler {

    /* renamed from: a */
    private final String f23603a;

    /* renamed from: b */
    private final /* synthetic */ C10078i4 f23604b;

    public C10100k4(C10078i4 i4Var, String str) {
        this.f23604b = i4Var;
        C9908u.m30853a(str);
        this.f23603a = str;
    }

    public final synchronized void uncaughtException(Thread thread, Throwable th) {
        this.f23604b.mo25898e().mo25874t().mo25909a(this.f23603a, th);
    }
}
