package com.google.android.exoplayer2.p382u0.p389s;

import com.google.android.exoplayer2.p382u0.C9322b;
import com.google.android.exoplayer2.p382u0.C9325e;
import com.google.android.exoplayer2.p393v0.Assertions;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.exoplayer2.u0.s.b */
/* compiled from: Tx3gSubtitle */
final class C9377b implements C9325e {

    /* renamed from: U */
    public static final C9377b f21614U = new C9377b();

    /* renamed from: c */
    private final List<C9322b> f21615c;

    public C9377b(C9322b bVar) {
        this.f21615c = Collections.singletonList(bVar);
    }

    /* renamed from: a */
    public int mo24144a() {
        return 1;
    }

    /* renamed from: a */
    public int mo24145a(long j) {
        return j < 0 ? 0 : -1;
    }

    /* renamed from: a */
    public long mo24146a(int i) {
        Assertions.m29299a(i == 0);
        return 0;
    }

    /* renamed from: b */
    public List<C9322b> mo24147b(long j) {
        return j >= 0 ? this.f21615c : Collections.emptyList();
    }

    private C9377b() {
        this.f21615c = Collections.emptyList();
    }
}
