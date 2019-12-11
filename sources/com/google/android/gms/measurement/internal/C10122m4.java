package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.C9908u;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/* renamed from: com.google.android.gms.measurement.internal.m4 */
final class C10122m4<V> extends FutureTask<V> implements Comparable<C10122m4> {

    /* renamed from: U */
    final boolean f23720U;

    /* renamed from: V */
    private final String f23721V;

    /* renamed from: W */
    private final /* synthetic */ C10078i4 f23722W;

    /* renamed from: c */
    private final long f23723c = C10078i4.f23534l.getAndIncrement();

    C10122m4(C10078i4 i4Var, Callable<V> callable, boolean z, String str) {
        this.f23722W = i4Var;
        super(callable);
        C9908u.m30853a(str);
        this.f23721V = str;
        this.f23720U = z;
        if (this.f23723c == Long.MAX_VALUE) {
            i4Var.mo25898e().mo25874t().mo25908a("Tasks index overflow");
        }
    }

    public final /* synthetic */ int compareTo(Object obj) {
        C10122m4 m4Var = (C10122m4) obj;
        boolean z = this.f23720U;
        if (z != m4Var.f23720U) {
            return z ? -1 : 1;
        }
        long j = this.f23723c;
        long j2 = m4Var.f23723c;
        if (j < j2) {
            return -1;
        }
        if (j > j2) {
            return 1;
        }
        this.f23722W.mo25898e().mo25875u().mo25909a("Two tasks share the same index. index", Long.valueOf(this.f23723c));
        return 0;
    }

    /* access modifiers changed from: protected */
    public final void setException(Throwable th) {
        this.f23722W.mo25898e().mo25874t().mo25909a(this.f23721V, th);
        super.setException(th);
    }

    C10122m4(C10078i4 i4Var, Runnable runnable, boolean z, String str) {
        this.f23722W = i4Var;
        super(runnable, null);
        C9908u.m30853a(str);
        this.f23721V = str;
        this.f23720U = false;
        if (this.f23723c == Long.MAX_VALUE) {
            i4Var.mo25898e().mo25874t().mo25908a("Tasks index overflow");
        }
    }
}
