package com.google.android.gms.measurement.internal;

import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.measurement.internal.x4 */
final class C10237x4 implements Callable<List<C10061g9>> {

    /* renamed from: U */
    private final /* synthetic */ String f24033U;

    /* renamed from: V */
    private final /* synthetic */ String f24034V;

    /* renamed from: W */
    private final /* synthetic */ C10156p4 f24035W;

    /* renamed from: c */
    private final /* synthetic */ C10028d9 f24036c;

    C10237x4(C10156p4 p4Var, C10028d9 d9Var, String str, String str2) {
        this.f24035W = p4Var;
        this.f24036c = d9Var;
        this.f24033U = str;
        this.f24034V = str2;
    }

    public final /* synthetic */ Object call() throws Exception {
        this.f24035W.f23848a.mo25943p();
        return this.f24035W.f23848a.mo25937j().mo25996b(this.f24036c.f23379c, this.f24033U, this.f24034V);
    }
}
