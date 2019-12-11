package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.j3 */
final class C10088j3 implements Runnable {

    /* renamed from: U */
    private final /* synthetic */ String f23566U;

    /* renamed from: V */
    private final /* synthetic */ Object f23567V;

    /* renamed from: W */
    private final /* synthetic */ Object f23568W;

    /* renamed from: X */
    private final /* synthetic */ Object f23569X;

    /* renamed from: Y */
    private final /* synthetic */ C10099k3 f23570Y;

    /* renamed from: c */
    private final /* synthetic */ int f23571c;

    C10088j3(C10099k3 k3Var, int i, String str, Object obj, Object obj2, Object obj3) {
        this.f23570Y = k3Var;
        this.f23571c = i;
        this.f23566U = str;
        this.f23567V = obj;
        this.f23568W = obj2;
        this.f23569X = obj3;
    }

    public final void run() {
        C10196t3 h = this.f23570Y.f23701a.mo26030h();
        if (h.mo25883o()) {
            if (this.f23570Y.f23591c == 0) {
                if (this.f23570Y.mo25900g().mo25832o()) {
                    C10099k3 k3Var = this.f23570Y;
                    k3Var.mo25894a();
                    k3Var.f23591c = 'C';
                } else {
                    C10099k3 k3Var2 = this.f23570Y;
                    k3Var2.mo25894a();
                    k3Var2.f23591c = 'c';
                }
            }
            if (this.f23570Y.f23592d < 0) {
                C10099k3 k3Var3 = this.f23570Y;
                k3Var3.f23592d = k3Var3.mo25900g().mo25830n();
            }
            char charAt = "01VDIWEA?".charAt(this.f23571c);
            char a = this.f23570Y.f23591c;
            long b = this.f23570Y.f23592d;
            String a2 = C10099k3.m31425a(true, this.f23566U, this.f23567V, this.f23568W, this.f23569X);
            StringBuilder sb = new StringBuilder(String.valueOf(a2).length() + 24);
            sb.append("2");
            sb.append(charAt);
            sb.append(a);
            sb.append(b);
            sb.append(":");
            sb.append(a2);
            String sb2 = sb.toString();
            if (sb2.length() > 1024) {
                sb2 = this.f23566U.substring(0, 1024);
            }
            h.f23932d.mo26181a(sb2, 1);
            return;
        }
        this.f23570Y.mo25871a(6, "Persisted config not initialized. Not logging error/warn");
    }
}
