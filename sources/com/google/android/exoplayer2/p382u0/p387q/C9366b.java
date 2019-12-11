package com.google.android.exoplayer2.p382u0.p387q;

import com.google.android.exoplayer2.p382u0.C9322b;
import com.google.android.exoplayer2.p382u0.C9325e;
import com.google.android.exoplayer2.p393v0.C9537e;
import com.google.android.exoplayer2.p393v0.Util;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.exoplayer2.u0.q.b */
/* compiled from: SubripSubtitle */
final class C9366b implements C9325e {

    /* renamed from: U */
    private final long[] f21548U;

    /* renamed from: c */
    private final C9322b[] f21549c;

    public C9366b(C9322b[] bVarArr, long[] jArr) {
        this.f21549c = bVarArr;
        this.f21548U = jArr;
    }

    /* renamed from: a */
    public int mo24145a(long j) {
        int a = Util.m29386a(this.f21548U, j, false, false);
        if (a < this.f21548U.length) {
            return a;
        }
        return -1;
    }

    /* renamed from: b */
    public List<C9322b> mo24147b(long j) {
        int b = Util.m29429b(this.f21548U, j, true, false);
        if (b != -1) {
            C9322b[] bVarArr = this.f21549c;
            if (bVarArr[b] != C9322b.f21345h0) {
                return Collections.singletonList(bVarArr[b]);
            }
        }
        return Collections.emptyList();
    }

    /* renamed from: a */
    public int mo24144a() {
        return this.f21548U.length;
    }

    /* renamed from: a */
    public long mo24146a(int i) {
        boolean z = true;
        C9537e.m29299a(i >= 0);
        if (i >= this.f21548U.length) {
            z = false;
        }
        C9537e.m29299a(z);
        return this.f21548U[i];
    }
}
