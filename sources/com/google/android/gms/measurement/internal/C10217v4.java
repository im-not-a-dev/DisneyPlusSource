package com.google.android.gms.measurement.internal;

import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.measurement.internal.v4 */
final class C10217v4 implements Callable<List<C10221v8>> {

    /* renamed from: U */
    private final /* synthetic */ String f23988U;

    /* renamed from: V */
    private final /* synthetic */ String f23989V;

    /* renamed from: W */
    private final /* synthetic */ C10156p4 f23990W;

    /* renamed from: c */
    private final /* synthetic */ C10028d9 f23991c;

    C10217v4(C10156p4 p4Var, C10028d9 d9Var, String str, String str2) {
        this.f23990W = p4Var;
        this.f23991c = d9Var;
        this.f23988U = str;
        this.f23989V = str2;
    }

    public final /* synthetic */ Object call() throws Exception {
        this.f23990W.f23848a.mo25943p();
        return this.f23990W.f23848a.mo25937j().mo25983a(this.f23991c.f23379c, this.f23988U, this.f23989V);
    }
}
