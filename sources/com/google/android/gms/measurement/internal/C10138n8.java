package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.n8 */
abstract class C10138n8 extends C10104k8 {

    /* renamed from: c */
    private boolean f23777c;

    C10138n8(C10126m8 m8Var) {
        super(m8Var);
        this.f23609b.mo25922a(this);
    }

    /* renamed from: r */
    public final void mo25967r() {
        if (!this.f23777c) {
            mo25760u();
            this.f23609b.mo25944q();
            this.f23777c = true;
            return;
        }
        throw new IllegalStateException("Can't initialize twice");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: s */
    public final boolean mo25968s() {
        return this.f23777c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public final void mo25969t() {
        if (!mo25968s()) {
            throw new IllegalStateException("Not initialized");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public abstract boolean mo25760u();
}
