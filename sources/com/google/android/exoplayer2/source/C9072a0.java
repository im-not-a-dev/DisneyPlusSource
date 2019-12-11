package com.google.android.exoplayer2.source;

import com.google.android.exoplayer2.SeekParameters;
import com.google.android.exoplayer2.source.C9143g0.C9144a;
import com.google.android.exoplayer2.trackselection.TrackSelection;
import java.io.IOException;

/* renamed from: com.google.android.exoplayer2.source.a0 */
/* compiled from: MediaPeriod */
public interface C9072a0 extends C9143g0 {

    /* renamed from: com.google.android.exoplayer2.source.a0$a */
    /* compiled from: MediaPeriod */
    public interface C9073a extends C9144a<C9072a0> {
        /* renamed from: a */
        void mo23550a(C9072a0 a0Var);
    }

    /* renamed from: a */
    long mo23538a(long j);

    /* renamed from: a */
    long mo23539a(long j, SeekParameters seekParameters);

    /* renamed from: a */
    long mo23540a(TrackSelection[] jVarArr, boolean[] zArr, C9141f0[] f0VarArr, boolean[] zArr2, long j);

    /* renamed from: a */
    void mo23541a(long j, boolean z);

    /* renamed from: a */
    void mo23542a(C9073a aVar, long j);

    /* renamed from: b */
    boolean mo23543b(long j);

    /* renamed from: c */
    long mo23544c();

    /* renamed from: c */
    void mo23545c(long j);

    /* renamed from: d */
    void mo23546d() throws IOException;

    /* renamed from: e */
    long mo23547e();

    /* renamed from: f */
    TrackGroupArray mo23548f();

    /* renamed from: g */
    long mo23549g();
}
