package com.google.android.exoplayer2.p366s0.p372w;

import com.google.android.exoplayer2.C8723g0;
import com.google.android.exoplayer2.p393v0.Log;
import com.google.android.exoplayer2.p393v0.C9572w;
import java.util.Arrays;

/* renamed from: com.google.android.exoplayer2.s0.w.l */
/* compiled from: VorbisUtil */
final class C9005l {

    /* renamed from: com.google.android.exoplayer2.s0.w.l$a */
    /* compiled from: VorbisUtil */
    public static final class C9006a {
        public C9006a(int i, int i2, long[] jArr, int i3, boolean z) {
        }
    }

    /* renamed from: com.google.android.exoplayer2.s0.w.l$b */
    /* compiled from: VorbisUtil */
    public static final class C9007b {
        public C9007b(String str, String[] strArr, int i) {
        }
    }

    /* renamed from: com.google.android.exoplayer2.s0.w.l$c */
    /* compiled from: VorbisUtil */
    public static final class C9008c {

        /* renamed from: a */
        public final boolean f19774a;

        public C9008c(boolean z, int i, int i2, int i3) {
            this.f19774a = z;
        }
    }

    /* renamed from: com.google.android.exoplayer2.s0.w.l$d */
    /* compiled from: VorbisUtil */
    public static final class C9009d {

        /* renamed from: a */
        public final int f19775a;

        /* renamed from: b */
        public final long f19776b;

        /* renamed from: c */
        public final int f19777c;

        /* renamed from: d */
        public final int f19778d;

        /* renamed from: e */
        public final int f19779e;

        /* renamed from: f */
        public final byte[] f19780f;

        public C9009d(long j, int i, long j2, int i2, int i3, int i4, int i5, int i6, boolean z, byte[] bArr) {
            this.f19775a = i;
            this.f19776b = j2;
            this.f19777c = i3;
            this.f19778d = i5;
            this.f19779e = i6;
            this.f19780f = bArr;
        }
    }

    /* renamed from: a */
    public static int m26600a(int i) {
        int i2 = 0;
        while (i > 0) {
            i2++;
            i >>>= 1;
        }
        return i2;
    }

    /* renamed from: a */
    public static C9007b m26603a(C9572w wVar) throws C8723g0 {
        m26605a(3, wVar, false);
        String b = wVar.mo24687b((int) wVar.mo24704o());
        int length = 11 + b.length();
        long o = wVar.mo24704o();
        String[] strArr = new String[((int) o)];
        int i = length + 4;
        for (int i2 = 0; ((long) i2) < o; i2++) {
            int i3 = i + 4;
            strArr[i2] = wVar.mo24687b((int) wVar.mo24704o());
            i = i3 + strArr[i2].length();
        }
        if ((wVar.mo24711v() & 1) != 0) {
            return new C9007b(b, strArr, i + 1);
        }
        throw new C8723g0("framing bit expected to be set");
    }

    /* renamed from: b */
    public static C9009d m26607b(C9572w wVar) throws C8723g0 {
        C9572w wVar2 = wVar;
        m26605a(1, wVar2, false);
        long o = wVar.mo24704o();
        int v = wVar.mo24711v();
        long o2 = wVar.mo24704o();
        int l = wVar.mo24701l();
        int l2 = wVar.mo24701l();
        int l3 = wVar.mo24701l();
        int v2 = wVar.mo24711v();
        C9009d dVar = new C9009d(o, v, o2, l, l2, l3, (int) Math.pow(2.0d, (double) (v2 & 15)), (int) Math.pow(2.0d, (double) ((v2 & 240) >> 4)), (wVar.mo24711v() & 1) > 0, Arrays.copyOf(wVar2.f22333a, wVar.mo24690d()));
        return dVar;
    }

    /* renamed from: c */
    private static C9008c[] m26609c(C9002j jVar) {
        int a = jVar.mo23419a(6) + 1;
        C9008c[] cVarArr = new C9008c[a];
        for (int i = 0; i < a; i++) {
            cVarArr[i] = new C9008c(jVar.mo23421b(), jVar.mo23419a(16), jVar.mo23419a(16), jVar.mo23419a(8));
        }
        return cVarArr;
    }

    /* renamed from: d */
    private static void m26610d(C9002j jVar) throws C8723g0 {
        int a = jVar.mo23419a(6) + 1;
        int i = 0;
        while (i < a) {
            if (jVar.mo23419a(16) <= 2) {
                jVar.mo23420b(24);
                jVar.mo23420b(24);
                jVar.mo23420b(24);
                int a2 = jVar.mo23419a(6) + 1;
                jVar.mo23420b(8);
                int[] iArr = new int[a2];
                for (int i2 = 0; i2 < a2; i2++) {
                    iArr[i2] = ((jVar.mo23421b() ? jVar.mo23419a(5) : 0) * 8) + jVar.mo23419a(3);
                }
                for (int i3 = 0; i3 < a2; i3++) {
                    for (int i4 = 0; i4 < 8; i4++) {
                        if ((iArr[i3] & (1 << i4)) != 0) {
                            jVar.mo23420b(8);
                        }
                    }
                }
                i++;
            } else {
                throw new C8723g0("residueType greater than 2 is not decodable");
            }
        }
    }

    /* renamed from: a */
    public static boolean m26605a(int i, C9572w wVar, boolean z) throws C8723g0 {
        if (wVar.mo24679a() < 7) {
            if (z) {
                return false;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("too short header: ");
            sb.append(wVar.mo24679a());
            throw new C8723g0(sb.toString());
        } else if (wVar.mo24711v() != i) {
            if (z) {
                return false;
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("expected header type ");
            sb2.append(Integer.toHexString(i));
            throw new C8723g0(sb2.toString());
        } else if (wVar.mo24711v() == 118 && wVar.mo24711v() == 111 && wVar.mo24711v() == 114 && wVar.mo24711v() == 98 && wVar.mo24711v() == 105 && wVar.mo24711v() == 115) {
            return true;
        } else {
            if (z) {
                return false;
            }
            throw new C8723g0("expected characters 'vorbis'");
        }
    }

    /* renamed from: b */
    private static void m26608b(C9002j jVar) throws C8723g0 {
        int a = jVar.mo23419a(6) + 1;
        for (int i = 0; i < a; i++) {
            int a2 = jVar.mo23419a(16);
            if (a2 == 0) {
                jVar.mo23420b(8);
                jVar.mo23420b(16);
                jVar.mo23420b(16);
                jVar.mo23420b(6);
                jVar.mo23420b(8);
                int a3 = jVar.mo23419a(4) + 1;
                for (int i2 = 0; i2 < a3; i2++) {
                    jVar.mo23420b(8);
                }
            } else if (a2 == 1) {
                int a4 = jVar.mo23419a(5);
                int[] iArr = new int[a4];
                int i3 = -1;
                for (int i4 = 0; i4 < a4; i4++) {
                    iArr[i4] = jVar.mo23419a(4);
                    if (iArr[i4] > i3) {
                        i3 = iArr[i4];
                    }
                }
                int[] iArr2 = new int[(i3 + 1)];
                for (int i5 = 0; i5 < iArr2.length; i5++) {
                    iArr2[i5] = jVar.mo23419a(3) + 1;
                    int a5 = jVar.mo23419a(2);
                    if (a5 > 0) {
                        jVar.mo23420b(8);
                    }
                    for (int i6 = 0; i6 < (1 << a5); i6++) {
                        jVar.mo23420b(8);
                    }
                }
                jVar.mo23420b(2);
                int a6 = jVar.mo23419a(4);
                int i7 = 0;
                int i8 = 0;
                for (int i9 = 0; i9 < a4; i9++) {
                    i7 += iArr2[iArr[i9]];
                    while (i8 < i7) {
                        jVar.mo23420b(a6);
                        i8++;
                    }
                }
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("floor type greater than 1 not decodable: ");
                sb.append(a2);
                throw new C8723g0(sb.toString());
            }
        }
    }

    /* renamed from: a */
    public static C9008c[] m26606a(C9572w wVar, int i) throws C8723g0 {
        int i2 = 0;
        m26605a(5, wVar, false);
        int v = wVar.mo24711v() + 1;
        C9002j jVar = new C9002j(wVar.f22333a);
        jVar.mo23420b(wVar.mo24688c() * 8);
        for (int i3 = 0; i3 < v; i3++) {
            m26602a(jVar);
        }
        int a = jVar.mo23419a(6) + 1;
        while (i2 < a) {
            if (jVar.mo23419a(16) == 0) {
                i2++;
            } else {
                throw new C8723g0("placeholder of time domain transforms not zeroed out");
            }
        }
        m26608b(jVar);
        m26610d(jVar);
        m26604a(i, jVar);
        C9008c[] c = m26609c(jVar);
        if (jVar.mo23421b()) {
            return c;
        }
        throw new C8723g0("framing bit after modes not set as expected");
    }

    /* renamed from: a */
    private static void m26604a(int i, C9002j jVar) throws C8723g0 {
        int a = jVar.mo23419a(6) + 1;
        for (int i2 = 0; i2 < a; i2++) {
            int a2 = jVar.mo23419a(16);
            if (a2 != 0) {
                StringBuilder sb = new StringBuilder();
                sb.append("mapping type other than 0 not supported: ");
                sb.append(a2);
                Log.m29497b("VorbisUtil", sb.toString());
            } else {
                int a3 = jVar.mo23421b() ? jVar.mo23419a(4) + 1 : 1;
                if (jVar.mo23421b()) {
                    int a4 = jVar.mo23419a(8) + 1;
                    for (int i3 = 0; i3 < a4; i3++) {
                        int i4 = i - 1;
                        jVar.mo23420b(m26600a(i4));
                        jVar.mo23420b(m26600a(i4));
                    }
                }
                if (jVar.mo23419a(2) == 0) {
                    if (a3 > 1) {
                        for (int i5 = 0; i5 < i; i5++) {
                            jVar.mo23420b(4);
                        }
                    }
                    for (int i6 = 0; i6 < a3; i6++) {
                        jVar.mo23420b(8);
                        jVar.mo23420b(8);
                        jVar.mo23420b(8);
                    }
                } else {
                    throw new C8723g0("to reserved bits must be zero after mapping coupling steps");
                }
            }
        }
    }

    /* renamed from: a */
    private static C9006a m26602a(C9002j jVar) throws C8723g0 {
        if (jVar.mo23419a(24) == 5653314) {
            int a = jVar.mo23419a(16);
            int a2 = jVar.mo23419a(24);
            long[] jArr = new long[a2];
            boolean b = jVar.mo23421b();
            long j = 0;
            if (!b) {
                boolean b2 = jVar.mo23421b();
                for (int i = 0; i < jArr.length; i++) {
                    if (!b2) {
                        jArr[i] = (long) (jVar.mo23419a(5) + 1);
                    } else if (jVar.mo23421b()) {
                        jArr[i] = (long) (jVar.mo23419a(5) + 1);
                    } else {
                        jArr[i] = 0;
                    }
                }
            } else {
                int a3 = jVar.mo23419a(5) + 1;
                int i2 = 0;
                while (i2 < jArr.length) {
                    int a4 = jVar.mo23419a(m26600a(a2 - i2));
                    int i3 = i2;
                    for (int i4 = 0; i4 < a4 && i3 < jArr.length; i4++) {
                        jArr[i3] = (long) a3;
                        i3++;
                    }
                    a3++;
                    i2 = i3;
                }
            }
            int a5 = jVar.mo23419a(4);
            if (a5 <= 2) {
                if (a5 == 1 || a5 == 2) {
                    jVar.mo23420b(32);
                    jVar.mo23420b(32);
                    int a6 = jVar.mo23419a(4) + 1;
                    jVar.mo23420b(1);
                    if (a5 != 1) {
                        j = ((long) a2) * ((long) a);
                    } else if (a != 0) {
                        j = m26601a((long) a2, (long) a);
                    }
                    jVar.mo23420b((int) (j * ((long) a6)));
                }
                C9006a aVar = new C9006a(a, a2, jArr, a5, b);
                return aVar;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("lookup type greater than 2 not decodable: ");
            sb.append(a5);
            throw new C8723g0(sb.toString());
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("expected code book to start with [0x56, 0x43, 0x42] at ");
        sb2.append(jVar.mo23418a());
        throw new C8723g0(sb2.toString());
    }

    /* renamed from: a */
    private static long m26601a(long j, long j2) {
        return (long) Math.floor(Math.pow((double) j, 1.0d / ((double) j2)));
    }
}
