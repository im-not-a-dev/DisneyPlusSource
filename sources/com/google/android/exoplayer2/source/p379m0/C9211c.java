package com.google.android.exoplayer2.source.p379m0;

import com.google.android.exoplayer2.p366s0.C8911f;
import com.google.android.exoplayer2.p366s0.C8924q;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.source.C9137e0;
import com.google.android.exoplayer2.source.p379m0.C9213e.C9215b;

/* renamed from: com.google.android.exoplayer2.source.m0.c */
/* compiled from: BaseMediaChunkOutput */
public final class C9211c implements C9215b {

    /* renamed from: a */
    private final int[] f20854a;

    /* renamed from: b */
    private final C9137e0[] f20855b;

    public C9211c(int[] iArr, C9137e0[] e0VarArr) {
        this.f20854a = iArr;
        this.f20855b = e0VarArr;
    }

    /* renamed from: a */
    public C8924q mo23931a(int i, int i2) {
        int i3 = 0;
        while (true) {
            int[] iArr = this.f20854a;
            if (i3 >= iArr.length) {
                StringBuilder sb = new StringBuilder();
                sb.append("Unmatched track of type: ");
                sb.append(i2);
                Log.m29497b("BaseMediaChunkOutput", sb.toString());
                return new C8911f();
            } else if (i2 == iArr[i3]) {
                return this.f20855b[i3];
            } else {
                i3++;
            }
        }
    }

    /* renamed from: a */
    public int[] mo23933a() {
        int[] iArr = new int[this.f20855b.length];
        int i = 0;
        while (true) {
            C9137e0[] e0VarArr = this.f20855b;
            if (i >= e0VarArr.length) {
                return iArr;
            }
            if (e0VarArr[i] != null) {
                iArr[i] = e0VarArr[i].mo23764i();
            }
            i++;
        }
    }

    /* renamed from: a */
    public void mo23932a(long j) {
        C9137e0[] e0VarArr;
        for (C9137e0 e0Var : this.f20855b) {
            if (e0Var != null) {
                e0Var.mo23751a(j);
            }
        }
    }
}
