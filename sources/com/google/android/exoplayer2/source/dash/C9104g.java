package com.google.android.exoplayer2.source.dash;

import com.google.android.exoplayer2.p366s0.C8907b;
import com.google.android.exoplayer2.source.dash.p376k.C9122h;

/* renamed from: com.google.android.exoplayer2.source.dash.g */
/* compiled from: DashWrappingSegmentIndex */
public final class C9104g implements C9103f {

    /* renamed from: a */
    private final C8907b f20370a;

    /* renamed from: b */
    private final long f20371b;

    public C9104g(C8907b bVar, long j) {
        this.f20370a = bVar;
        this.f20371b = j;
    }

    /* renamed from: a */
    public long mo23635a(long j) {
        return this.f20370a.f19120e[(int) j] - this.f20371b;
    }

    /* renamed from: a */
    public boolean mo23637a() {
        return true;
    }

    /* renamed from: b */
    public long mo23638b() {
        return 0;
    }

    /* renamed from: b */
    public C9122h mo23640b(long j) {
        C8907b bVar = this.f20370a;
        int i = (int) j;
        C9122h hVar = new C9122h(null, bVar.f19118c[i], (long) bVar.f19117b[i]);
        return hVar;
    }

    /* renamed from: c */
    public int mo23641c(long j) {
        return this.f20370a.f19116a;
    }

    /* renamed from: a */
    public long mo23636a(long j, long j2) {
        return this.f20370a.f19119d[(int) j];
    }

    /* renamed from: b */
    public long mo23639b(long j, long j2) {
        return (long) this.f20370a.mo23284c(j + this.f20371b);
    }
}
