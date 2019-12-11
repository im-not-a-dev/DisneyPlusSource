package com.google.android.exoplayer2.p382u0.p388r;

import com.google.android.exoplayer2.p382u0.C9322b;
import com.google.android.exoplayer2.p382u0.C9325e;
import com.google.android.exoplayer2.p393v0.Util;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.exoplayer2.u0.r.f */
/* compiled from: TtmlSubtitle */
final class C9375f implements C9325e {

    /* renamed from: U */
    private final long[] f21600U;

    /* renamed from: V */
    private final Map<String, C9374e> f21601V;

    /* renamed from: W */
    private final Map<String, C9372c> f21602W;

    /* renamed from: X */
    private final Map<String, String> f21603X;

    /* renamed from: c */
    private final C9371b f21604c;

    public C9375f(C9371b bVar, Map<String, C9374e> map, Map<String, C9372c> map2, Map<String, String> map3) {
        this.f21604c = bVar;
        this.f21602W = map2;
        this.f21603X = map3;
        this.f21601V = map != null ? Collections.unmodifiableMap(map) : Collections.emptyMap();
        this.f21600U = bVar.mo24196b();
    }

    /* renamed from: a */
    public int mo24145a(long j) {
        int a = Util.m29386a(this.f21600U, j, false, false);
        if (a < this.f21600U.length) {
            return a;
        }
        return -1;
    }

    /* renamed from: b */
    public List<C9322b> mo24147b(long j) {
        return this.f21604c.mo24193a(j, this.f21601V, this.f21602W, this.f21603X);
    }

    /* renamed from: a */
    public int mo24144a() {
        return this.f21600U.length;
    }

    /* renamed from: a */
    public long mo24146a(int i) {
        return this.f21600U[i];
    }
}
