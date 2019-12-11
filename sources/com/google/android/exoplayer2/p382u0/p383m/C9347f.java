package com.google.android.exoplayer2.p382u0.p383m;

import com.google.android.exoplayer2.p382u0.C9322b;
import com.google.android.exoplayer2.p382u0.C9325e;
import com.google.android.exoplayer2.p393v0.Assertions;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.exoplayer2.u0.m.f */
/* compiled from: CeaSubtitle */
final class C9347f implements C9325e {

    /* renamed from: c */
    private final List<C9322b> f21468c;

    public C9347f(List<C9322b> list) {
        this.f21468c = list;
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
        return j >= 0 ? this.f21468c : Collections.emptyList();
    }
}
