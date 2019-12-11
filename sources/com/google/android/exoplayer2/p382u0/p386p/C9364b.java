package com.google.android.exoplayer2.p382u0.p386p;

import com.google.android.exoplayer2.p382u0.C9322b;
import com.google.android.exoplayer2.p382u0.C9325e;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.exoplayer2.u0.p.b */
/* compiled from: SsaSubtitle */
final class C9364b implements C9325e {

    /* renamed from: U */
    private final long[] f21542U;

    /* renamed from: c */
    private final C9322b[] f21543c;

    public C9364b(C9322b[] bVarArr, long[] jArr) {
        this.f21543c = bVarArr;
        this.f21542U = jArr;
    }

    /* renamed from: a */
    public int mo24145a(long j) {
        int a = Util.m29386a(this.f21542U, j, false, false);
        if (a < this.f21542U.length) {
            return a;
        }
        return -1;
    }

    /* renamed from: b */
    public List<C9322b> mo24147b(long j) {
        int b = Util.m29429b(this.f21542U, j, true, false);
        if (b != -1) {
            C9322b[] bVarArr = this.f21543c;
            if (bVarArr[b] != C9322b.f21345h0) {
                return Collections.singletonList(bVarArr[b]);
            }
        }
        return Collections.emptyList();
    }

    /* renamed from: a */
    public int mo24144a() {
        return this.f21542U.length;
    }

    /* renamed from: a */
    public long mo24146a(int i) {
        boolean z = true;
        Assertions.checkArgument(i >= 0);
        if (i >= this.f21542U.length) {
            z = false;
        }
        Assertions.checkArgument(z);
        return this.f21542U[i];
    }
}
