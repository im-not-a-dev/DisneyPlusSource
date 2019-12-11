package com.google.android.exoplayer2.source;

import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.Timeline.C8669b;
import com.google.android.exoplayer2.p393v0.C9537e;

/* renamed from: com.google.android.exoplayer2.source.i0 */
/* compiled from: SinglePeriodTimeline */
public final class C9197i0 extends Timeline {

    /* renamed from: k */
    private static final Object f20818k = new Object();

    /* renamed from: b */
    private final long f20819b;

    /* renamed from: c */
    private final long f20820c;

    /* renamed from: d */
    private final long f20821d;

    /* renamed from: e */
    private final long f20822e;

    /* renamed from: f */
    private final long f20823f;

    /* renamed from: g */
    private final long f20824g;

    /* renamed from: h */
    private final boolean f20825h;

    /* renamed from: i */
    private final boolean f20826i;

    /* renamed from: j */
    private final Object f20827j;

    public C9197i0(long j, boolean z, boolean z2, Object obj) {
        this(j, j, 0, 0, z, z2, obj);
    }

    /* renamed from: a */
    public int mo22653a() {
        return 1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002d, code lost:
        if (r1 > r7) goto L_0x0027;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.android.exoplayer2.Timeline.C8670c mo22665a(int r19, com.google.android.exoplayer2.Timeline.C8670c r20, boolean r21, long r22) {
        /*
            r18 = this;
            r0 = r18
            r1 = 0
            r2 = 1
            r3 = r19
            com.google.android.exoplayer2.p393v0.C9537e.m29295a(r3, r1, r2)
            if (r21 == 0) goto L_0x000e
            java.lang.Object r1 = r0.f20827j
            goto L_0x000f
        L_0x000e:
            r1 = 0
        L_0x000f:
            r3 = r1
            long r1 = r0.f20824g
            boolean r4 = r0.f20826i
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r4 == 0) goto L_0x0030
            r7 = 0
            int r4 = (r22 > r7 ? 1 : (r22 == r7 ? 0 : -1))
            if (r4 == 0) goto L_0x0030
            long r7 = r0.f20822e
            int r4 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r4 != 0) goto L_0x0029
        L_0x0027:
            r10 = r5
            goto L_0x0031
        L_0x0029:
            long r1 = r1 + r22
            int r4 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r4 <= 0) goto L_0x0030
            goto L_0x0027
        L_0x0030:
            r10 = r1
        L_0x0031:
            long r4 = r0.f20819b
            long r6 = r0.f20820c
            boolean r8 = r0.f20825h
            boolean r9 = r0.f20826i
            long r12 = r0.f20822e
            r14 = 0
            r15 = 0
            long r1 = r0.f20823f
            r16 = r1
            r2 = r20
            r2.mo22690a(r3, r4, r6, r8, r9, r10, r12, r14, r15, r16)
            return r20
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.C9197i0.mo22665a(int, com.google.android.exoplayer2.Timeline$c, boolean, long):com.google.android.exoplayer2.Timeline$c");
    }

    /* renamed from: b */
    public int mo22667b() {
        return 1;
    }

    public C9197i0(long j, long j2, long j3, long j4, boolean z, boolean z2, Object obj) {
        this(-9223372036854775807L, -9223372036854775807L, j, j2, j3, j4, z, z2, obj);
    }

    public C9197i0(long j, long j2, long j3, long j4, long j5, long j6, boolean z, boolean z2, Object obj) {
        this.f20819b = j;
        this.f20820c = j2;
        this.f20821d = j3;
        this.f20822e = j4;
        this.f20823f = j5;
        this.f20824g = j6;
        this.f20825h = z;
        this.f20826i = z2;
        this.f20827j = obj;
    }

    /* renamed from: a */
    public C8669b mo22661a(int i, C8669b bVar, boolean z) {
        C9537e.m29295a(i, 0, 1);
        bVar.mo22676a(null, z ? f20818k : null, 0, this.f20821d, -this.f20823f);
        return bVar;
    }

    /* renamed from: a */
    public int mo22656a(Object obj) {
        return f20818k.equals(obj) ? 0 : -1;
    }

    /* renamed from: a */
    public Object mo22666a(int i) {
        C9537e.m29295a(i, 0, 1);
        return f20818k;
    }
}
