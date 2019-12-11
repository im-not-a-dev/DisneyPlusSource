package com.google.android.gms.measurement.internal;

import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.measurement.internal.y4 */
final class C10247y4 implements Callable<List<C10221v8>> {

    /* renamed from: U */
    private final /* synthetic */ String f24068U;

    /* renamed from: V */
    private final /* synthetic */ String f24069V;

    /* renamed from: W */
    private final /* synthetic */ C10156p4 f24070W;

    /* renamed from: c */
    private final /* synthetic */ String f24071c;

    C10247y4(C10156p4 p4Var, String str, String str2, String str3) {
        this.f24070W = p4Var;
        this.f24071c = str;
        this.f24068U = str2;
        this.f24069V = str3;
    }

    public final /* synthetic */ Object call() throws Exception {
        this.f24070W.f23848a.mo25943p();
        return this.f24070W.f23848a.mo25937j().mo25983a(this.f24071c, this.f24068U, this.f24069V);
    }
}
