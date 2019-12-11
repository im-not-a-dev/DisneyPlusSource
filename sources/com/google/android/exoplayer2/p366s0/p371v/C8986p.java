package com.google.android.exoplayer2.p366s0.p371v;

import com.google.android.exoplayer2.p393v0.Assertions;
import com.google.android.exoplayer2.p393v0.Util;

/* renamed from: com.google.android.exoplayer2.s0.v.p */
/* compiled from: TrackSampleTable */
final class C8986p {

    /* renamed from: a */
    public final C8983m f19697a;

    /* renamed from: b */
    public final int f19698b;

    /* renamed from: c */
    public final long[] f19699c;

    /* renamed from: d */
    public final int[] f19700d;

    /* renamed from: e */
    public final int f19701e;

    /* renamed from: f */
    public final long[] f19702f;

    /* renamed from: g */
    public final int[] f19703g;

    /* renamed from: h */
    public final long f19704h;

    public C8986p(C8983m mVar, long[] jArr, int[] iArr, int i, long[] jArr2, int[] iArr2, long j) {
        boolean z = false;
        Assertions.m29299a(iArr.length == jArr2.length);
        Assertions.m29299a(jArr.length == jArr2.length);
        if (iArr2.length == jArr2.length) {
            z = true;
        }
        Assertions.m29299a(z);
        this.f19697a = mVar;
        this.f19699c = jArr;
        this.f19700d = iArr;
        this.f19701e = i;
        this.f19702f = jArr2;
        this.f19703g = iArr2;
        this.f19704h = j;
        this.f19698b = jArr.length;
        if (iArr2.length > 0) {
            int length = iArr2.length - 1;
            iArr2[length] = iArr2[length] | 536870912;
        }
    }

    /* renamed from: a */
    public int mo23393a(long j) {
        for (int b = Util.m29429b(this.f19702f, j, true, false); b >= 0; b--) {
            if ((this.f19703g[b] & 1) != 0) {
                return b;
            }
        }
        return -1;
    }

    /* renamed from: b */
    public int mo23394b(long j) {
        for (int a = Util.m29386a(this.f19702f, j, true, false); a < this.f19702f.length; a++) {
            if ((this.f19703g[a] & 1) != 0) {
                return a;
            }
        }
        return -1;
    }
}
