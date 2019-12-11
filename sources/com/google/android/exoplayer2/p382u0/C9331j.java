package com.google.android.exoplayer2.p382u0;

import com.google.android.exoplayer2.p362q0.C8880f;
import com.google.android.exoplayer2.p393v0.Assertions;
import java.util.List;

/* renamed from: com.google.android.exoplayer2.u0.j */
/* compiled from: SubtitleOutputBuffer */
public abstract class C9331j extends C8880f implements C9325e {

    /* renamed from: W */
    private C9325e f21363W;

    /* renamed from: X */
    private long f21364X;

    /* renamed from: a */
    public void mo24150a(long j, C9325e eVar, long j2) {
        this.f19026U = j;
        this.f21363W = eVar;
        if (j2 == Long.MAX_VALUE) {
            j2 = this.f19026U;
        }
        this.f21364X = j2;
    }

    /* renamed from: b */
    public List<C9322b> mo24147b(long j) {
        C9325e eVar = this.f21363W;
        Assertions.checkNotNull(eVar);
        return eVar.mo24147b(j - this.f21364X);
    }

    /* renamed from: b */
    public void mo23207b() {
        super.mo23207b();
        this.f21363W = null;
    }

    /* renamed from: a */
    public int mo24144a() {
        C9325e eVar = this.f21363W;
        Assertions.checkNotNull(eVar);
        return eVar.mo24144a();
    }

    /* renamed from: a */
    public long mo24146a(int i) {
        C9325e eVar = this.f21363W;
        Assertions.checkNotNull(eVar);
        return eVar.mo24146a(i) + this.f21364X;
    }

    /* renamed from: a */
    public int mo24145a(long j) {
        C9325e eVar = this.f21363W;
        Assertions.checkNotNull(eVar);
        return eVar.mo24145a(j - this.f21364X);
    }
}
