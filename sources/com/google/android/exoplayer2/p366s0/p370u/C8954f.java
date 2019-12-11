package com.google.android.exoplayer2.p366s0.p370u;

import com.google.android.exoplayer2.p366s0.C8918m;
import com.google.android.exoplayer2.p366s0.C8920o.C8921a;
import com.google.android.exoplayer2.p366s0.C8923p;
import com.google.android.exoplayer2.p393v0.Util;
import com.google.android.exoplayer2.p393v0.Log;
import com.google.android.exoplayer2.p393v0.C9572w;

/* renamed from: com.google.android.exoplayer2.s0.u.f */
/* compiled from: VbriSeeker */
final class C8954f implements C8953a {

    /* renamed from: a */
    private final long[] f19378a;

    /* renamed from: b */
    private final long[] f19379b;

    /* renamed from: c */
    private final long f19380c;

    /* renamed from: d */
    private final long f19381d;

    private C8954f(long[] jArr, long[] jArr2, long j, long j2) {
        this.f19378a = jArr;
        this.f19379b = jArr2;
        this.f19380c = j;
        this.f19381d = j2;
    }

    /* renamed from: a */
    public static C8954f m26340a(long j, long j2, C8918m mVar, C9572w wVar) {
        int i;
        long j3 = j;
        C8918m mVar2 = mVar;
        C9572w wVar2 = wVar;
        wVar2.mo24695f(10);
        int i2 = wVar.mo24698i();
        if (i2 <= 0) {
            return null;
        }
        int i3 = mVar2.f19159d;
        long c = Util.m29439c((long) i2, 1000000 * ((long) (i3 >= 32000 ? 1152 : 576)), (long) i3);
        int B = wVar.mo24676B();
        int B2 = wVar.mo24676B();
        int B3 = wVar.mo24676B();
        wVar2.mo24695f(2);
        long j4 = j2 + ((long) mVar2.f19158c);
        long[] jArr = new long[B];
        long[] jArr2 = new long[B];
        int i4 = 0;
        long j5 = j2;
        while (i4 < B) {
            int i5 = B2;
            long j6 = j4;
            jArr[i4] = (((long) i4) * c) / ((long) B);
            long j7 = j6;
            jArr2[i4] = Math.max(j5, j7);
            if (B3 == 1) {
                i = wVar.mo24711v();
            } else if (B3 == 2) {
                i = wVar.mo24676B();
            } else if (B3 == 3) {
                i = wVar.mo24714y();
            } else if (B3 != 4) {
                return null;
            } else {
                i = wVar.mo24715z();
            }
            j5 += (long) (i * i5);
            i4++;
            j4 = j7;
            B2 = i5;
        }
        if (!(j3 == -1 || j3 == j5)) {
            StringBuilder sb = new StringBuilder();
            sb.append("VBRI data size mismatch: ");
            sb.append(j3);
            sb.append(", ");
            sb.append(j5);
            Log.m29500d("VbriSeeker", sb.toString());
        }
        C8954f fVar = new C8954f(jArr, jArr2, c, j5);
        return fVar;
    }

    /* renamed from: b */
    public C8921a mo23277b(long j) {
        int b = Util.m29429b(this.f19378a, j, true, true);
        C8923p pVar = new C8923p(this.f19378a[b], this.f19379b[b]);
        if (pVar.f19169a < j) {
            long[] jArr = this.f19378a;
            if (b != jArr.length - 1) {
                int i = b + 1;
                return new C8921a(pVar, new C8923p(jArr[i], this.f19379b[i]));
            }
        }
        return new C8921a(pVar);
    }

    /* renamed from: c */
    public boolean mo23279c() {
        return true;
    }

    /* renamed from: d */
    public long mo23280d() {
        return this.f19380c;
    }

    /* renamed from: b */
    public long mo23361b() {
        return this.f19381d;
    }

    /* renamed from: a */
    public long mo23360a(long j) {
        return this.f19378a[Util.m29429b(this.f19379b, j, true, true)];
    }
}
