package com.google.android.exoplayer2.p361p0;

import com.google.android.exoplayer2.p361p0.C8840m.C8841a;

/* renamed from: com.google.android.exoplayer2.p0.y */
/* compiled from: ResamplingAudioProcessor */
final class C8870y extends C8854s {
    C8870y() {
    }

    /* renamed from: a */
    public boolean mo23060a(int i, int i2, int i3) throws C8841a {
        if (i3 == 3 || i3 == 2 || i3 == Integer.MIN_VALUE || i3 == 1073741824) {
            return mo23157b(i, i2, i3);
        }
        throw new C8841a(i, i2, i3);
    }

    /* renamed from: f */
    public int mo23066f() {
        return 2;
    }

    /* renamed from: a */
    public boolean mo23059a() {
        int i = this.f18890d;
        return (i == 0 || i == 2) ? false : true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x002b  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0061 A[LOOP:2: B:19:0x0061->B:20:0x0063, LOOP_START, PHI: r0 
      PHI: (r0v2 int) = (r0v0 int), (r0v3 int) binds: [B:10:0x0029, B:20:0x0063] A[DONT_GENERATE, DONT_INLINE]] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo23058a(java.nio.ByteBuffer r8) {
        /*
            r7 = this;
            int r0 = r8.position()
            int r1 = r8.limit()
            int r2 = r1 - r0
            int r3 = r7.f18890d
            r4 = 1073741824(0x40000000, float:2.0)
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = 3
            if (r3 == r5) goto L_0x0020
            if (r3 == r6) goto L_0x0021
            if (r3 != r4) goto L_0x001a
            int r2 = r2 / 2
            goto L_0x0023
        L_0x001a:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            r8.<init>()
            throw r8
        L_0x0020:
            int r2 = r2 / r6
        L_0x0021:
            int r2 = r2 * 2
        L_0x0023:
            java.nio.ByteBuffer r2 = r7.mo23156a(r2)
            int r3 = r7.f18890d
            if (r3 == r5) goto L_0x0061
            if (r3 == r6) goto L_0x004c
            if (r3 != r4) goto L_0x0046
        L_0x002f:
            if (r0 >= r1) goto L_0x0078
            int r3 = r0 + 2
            byte r3 = r8.get(r3)
            r2.put(r3)
            int r3 = r0 + 3
            byte r3 = r8.get(r3)
            r2.put(r3)
            int r0 = r0 + 4
            goto L_0x002f
        L_0x0046:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            r8.<init>()
            throw r8
        L_0x004c:
            if (r0 >= r1) goto L_0x0078
            r3 = 0
            r2.put(r3)
            byte r3 = r8.get(r0)
            r3 = r3 & 255(0xff, float:3.57E-43)
            int r3 = r3 + -128
            byte r3 = (byte) r3
            r2.put(r3)
            int r0 = r0 + 1
            goto L_0x004c
        L_0x0061:
            if (r0 >= r1) goto L_0x0078
            int r3 = r0 + 1
            byte r3 = r8.get(r3)
            r2.put(r3)
            int r3 = r0 + 2
            byte r3 = r8.get(r3)
            r2.put(r3)
            int r0 = r0 + 3
            goto L_0x0061
        L_0x0078:
            int r0 = r8.limit()
            r8.position(r0)
            r2.flip()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.p361p0.C8870y.mo23058a(java.nio.ByteBuffer):void");
    }
}
