package com.google.android.gms.measurement.internal;

import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.measurement.internal.q8 */
final class C10171q8 implements Callable<String> {

    /* renamed from: U */
    private final /* synthetic */ C10126m8 f23875U;

    /* renamed from: c */
    private final /* synthetic */ C10028d9 f23876c;

    C10171q8(C10126m8 m8Var, C10028d9 d9Var) {
        this.f23875U = m8Var;
        this.f23876c = d9Var;
    }

    public final /* synthetic */ Object call() throws Exception {
        C10045f4 a = this.f23875U.m31590e(this.f23876c);
        if (a != null) {
            return a.mo25697a();
        }
        this.f23875U.mo25898e().mo25877w().mo25908a("App info was null when attempting to get app instance id");
        return null;
    }
}
