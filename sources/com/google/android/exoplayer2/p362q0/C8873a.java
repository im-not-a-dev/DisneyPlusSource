package com.google.android.exoplayer2.p362q0;

/* renamed from: com.google.android.exoplayer2.q0.a */
/* compiled from: Buffer */
public abstract class C8873a {

    /* renamed from: c */
    private int f19005c;

    /* renamed from: b */
    public void mo23207b() {
        this.f19005c = 0;
    }

    /* renamed from: c */
    public final boolean mo23210c() {
        return mo23212d(Integer.MIN_VALUE);
    }

    /* renamed from: d */
    public final boolean mo23211d() {
        return mo23212d(4);
    }

    /* renamed from: e */
    public final boolean mo23214e() {
        return mo23212d(1);
    }

    /* renamed from: b */
    public final void mo23208b(int i) {
        this.f19005c = i | this.f19005c;
    }

    /* renamed from: c */
    public final void mo23209c(int i) {
        this.f19005c = (~i) & this.f19005c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final boolean mo23212d(int i) {
        return (this.f19005c & i) == i;
    }

    /* renamed from: e */
    public final void mo23213e(int i) {
        this.f19005c = i;
    }
}
