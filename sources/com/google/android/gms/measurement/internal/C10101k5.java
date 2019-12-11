package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.k5 */
abstract class C10101k5 extends C10112l5 {

    /* renamed from: b */
    private boolean f23605b;

    C10101k5(C10145o4 o4Var) {
        super(o4Var);
        this.f23701a.mo26024a(this);
    }

    /* renamed from: n */
    public final void mo25882n() {
        if (this.f23605b) {
            throw new IllegalStateException("Can't initialize twice");
        } else if (!mo25655r()) {
            this.f23701a.mo26042t();
            this.f23605b = true;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: o */
    public final boolean mo25883o() {
        return this.f23605b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public final void mo25884p() {
        if (!mo25883o()) {
            throw new IllegalStateException("Not initialized");
        }
    }

    /* renamed from: q */
    public final void mo25885q() {
        if (!this.f23605b) {
            mo25886s();
            this.f23701a.mo26042t();
            this.f23605b = true;
            return;
        }
        throw new IllegalStateException("Can't initialize twice");
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public abstract boolean mo25655r();

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public void mo25886s() {
    }
}
