package com.google.android.exoplayer2.source.hls;

import android.util.SparseArray;
import com.google.android.exoplayer2.p393v0.C9545h0;

/* renamed from: com.google.android.exoplayer2.source.hls.p */
/* compiled from: TimestampAdjusterProvider */
public final class C9175p {

    /* renamed from: a */
    private final SparseArray<C9545h0> f20689a = new SparseArray<>();

    /* renamed from: a */
    public C9545h0 mo23860a(int i) {
        C9545h0 h0Var = (C9545h0) this.f20689a.get(i);
        if (h0Var != null) {
            return h0Var;
        }
        C9545h0 h0Var2 = new C9545h0(Long.MAX_VALUE);
        this.f20689a.put(i, h0Var2);
        return h0Var2;
    }

    /* renamed from: a */
    public void mo23861a() {
        this.f20689a.clear();
    }
}
