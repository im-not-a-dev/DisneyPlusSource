package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.i5 */
final class C10079i5 implements Runnable {

    /* renamed from: U */
    private final /* synthetic */ String f23544U;

    /* renamed from: V */
    private final /* synthetic */ String f23545V;

    /* renamed from: W */
    private final /* synthetic */ long f23546W;

    /* renamed from: X */
    private final /* synthetic */ C10156p4 f23547X;

    /* renamed from: c */
    private final /* synthetic */ String f23548c;

    C10079i5(C10156p4 p4Var, String str, String str2, String str3, long j) {
        this.f23547X = p4Var;
        this.f23548c = str;
        this.f23544U = str2;
        this.f23545V = str3;
        this.f23546W = j;
    }

    public final void run() {
        String str = this.f23548c;
        if (str == null) {
            this.f23547X.f23848a.mo25945r().mo26017B().mo26170a(this.f23544U, (C10229w6) null);
            return;
        }
        this.f23547X.f23848a.mo25945r().mo26017B().mo26170a(this.f23544U, new C10229w6(this.f23545V, str, this.f23546W));
    }
}
