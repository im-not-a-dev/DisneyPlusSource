package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.C9908u;
import com.google.android.gms.common.util.C9941e;

/* renamed from: com.google.android.gms.measurement.internal.j8 */
final class C10093j8 {

    /* renamed from: a */
    private final C9941e f23586a;

    /* renamed from: b */
    private long f23587b;

    public C10093j8(C9941e eVar) {
        C9908u.m30853a(eVar);
        this.f23586a = eVar;
    }

    /* renamed from: a */
    public final void mo25861a() {
        this.f23587b = 0;
    }

    /* renamed from: b */
    public final void mo25863b() {
        this.f23587b = this.f23586a.mo25472a();
    }

    /* renamed from: a */
    public final boolean mo25862a(long j) {
        if (this.f23587b != 0 && this.f23586a.mo25472a() - this.f23587b < 3600000) {
            return false;
        }
        return true;
    }
}
