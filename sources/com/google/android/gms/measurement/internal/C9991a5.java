package com.google.android.gms.measurement.internal;

import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.measurement.internal.a5 */
final class C9991a5 implements Callable<List<C10061g9>> {

    /* renamed from: U */
    private final /* synthetic */ String f23276U;

    /* renamed from: V */
    private final /* synthetic */ String f23277V;

    /* renamed from: W */
    private final /* synthetic */ C10156p4 f23278W;

    /* renamed from: c */
    private final /* synthetic */ String f23279c;

    C9991a5(C10156p4 p4Var, String str, String str2, String str3) {
        this.f23278W = p4Var;
        this.f23279c = str;
        this.f23276U = str2;
        this.f23277V = str3;
    }

    public final /* synthetic */ Object call() throws Exception {
        this.f23278W.f23848a.mo25943p();
        return this.f23278W.f23848a.mo25937j().mo25996b(this.f23279c, this.f23276U, this.f23277V);
    }
}
