package com.google.android.exoplayer2.source;

/* renamed from: com.google.android.exoplayer2.source.s */
/* compiled from: CompositeSequenceableLoader */
public class C9236s implements C9143g0 {

    /* renamed from: c */
    protected final C9143g0[] f20951c;

    public C9236s(C9143g0[] g0VarArr) {
        this.f20951c = g0VarArr;
    }

    /* renamed from: b */
    public boolean mo23543b(long j) {
        C9143g0[] g0VarArr;
        long j2 = j;
        boolean z = false;
        while (true) {
            long c = mo23544c();
            if (c != Long.MIN_VALUE) {
                boolean z2 = false;
                for (C9143g0 g0Var : this.f20951c) {
                    long c2 = g0Var.mo23544c();
                    boolean z3 = c2 != Long.MIN_VALUE && c2 <= j2;
                    if (c2 == c || z3) {
                        z2 |= g0Var.mo23543b(j2);
                    }
                }
                z |= z2;
                if (!z2) {
                    break;
                }
            } else {
                break;
            }
        }
        return z;
    }

    /* renamed from: c */
    public final long mo23544c() {
        long j = Long.MAX_VALUE;
        for (C9143g0 c : this.f20951c) {
            long c2 = c.mo23544c();
            if (c2 != Long.MIN_VALUE) {
                j = Math.min(j, c2);
            }
        }
        if (j == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return j;
    }

    /* renamed from: g */
    public final long mo23549g() {
        long j = Long.MAX_VALUE;
        for (C9143g0 g : this.f20951c) {
            long g2 = g.mo23549g();
            if (g2 != Long.MIN_VALUE) {
                j = Math.min(j, g2);
            }
        }
        if (j == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return j;
    }

    /* renamed from: c */
    public final void mo23545c(long j) {
        for (C9143g0 c : this.f20951c) {
            c.mo23545c(j);
        }
    }
}
