package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.f5 */
abstract class C10046f5 extends C10021d2 {

    /* renamed from: b */
    private boolean f23460b;

    C10046f5(C10145o4 o4Var) {
        super(o4Var);
        this.f23701a.mo26023a(this);
    }

    /* access modifiers changed from: protected */
    /* renamed from: A */
    public void mo25639A() {
    }

    /* renamed from: v */
    public final void mo25752v() {
        if (this.f23460b) {
            throw new IllegalStateException("Can't initialize twice");
        } else if (!mo25604z()) {
            this.f23701a.mo26042t();
            this.f23460b = true;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: w */
    public final boolean mo25753w() {
        return this.f23460b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public final void mo25754x() {
        if (!mo25753w()) {
            throw new IllegalStateException("Not initialized");
        }
    }

    /* renamed from: y */
    public final void mo25755y() {
        if (!this.f23460b) {
            mo25639A();
            this.f23701a.mo26042t();
            this.f23460b = true;
            return;
        }
        throw new IllegalStateException("Can't initialize twice");
    }

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public abstract boolean mo25604z();
}
