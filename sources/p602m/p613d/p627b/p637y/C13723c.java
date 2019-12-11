package p602m.p613d.p627b.p637y;

import p602m.p613d.p627b.C13711o;
import p602m.p613d.p683g.C14079a;
import p602m.p613d.p683g.C14087h;

/* renamed from: m.d.b.y.c */
/* compiled from: KeccakDigest */
public class C13723c implements C13711o {

    /* renamed from: g */
    private static long[] f30475g = m42140f();

    /* renamed from: h */
    private static int[] f30476h = m42139e();

    /* renamed from: a */
    protected long[] f30477a = new long[25];

    /* renamed from: b */
    protected byte[] f30478b = new byte[192];

    /* renamed from: c */
    protected int f30479c;

    /* renamed from: d */
    protected int f30480d;

    /* renamed from: e */
    protected int f30481e;

    /* renamed from: f */
    protected boolean f30482f;

    public C13723c(int i) {
        m42128a(i);
    }

    /* renamed from: a */
    private static long m42127a(long j, int i) {
        return (j >>> (-i)) | (j << i);
    }

    /* renamed from: a */
    private static boolean m42131a(byte[] bArr) {
        boolean z = (bArr[0] & 1) != 0;
        if ((bArr[0] & 128) != 0) {
            bArr[0] = (byte) ((bArr[0] << 1) ^ 113);
        } else {
            bArr[0] = (byte) (bArr[0] << 1);
        }
        return z;
    }

    /* renamed from: d */
    private void m42137d() {
        for (int i = 0; i < 24; i++) {
            m42138d(this.f30477a);
            m42136c(this.f30477a);
            m42134b(this.f30477a);
            m42129a(this.f30477a);
            m42130a(this.f30477a, i);
        }
    }

    /* renamed from: e */
    private static int[] m42139e() {
        int[] iArr = new int[25];
        int i = 0;
        iArr[0] = 0;
        int i2 = 1;
        int i3 = 0;
        while (i < 24) {
            int i4 = i + 1;
            iArr[(i2 % 5) + ((i3 % 5) * 5)] = (((i + 2) * i4) / 2) % 64;
            i3 = ((i2 * 2) + (i3 * 3)) % 5;
            i2 = ((i2 * 0) + (i3 * 1)) % 5;
            i = i4;
        }
        return iArr;
    }

    /* renamed from: f */
    private static long[] m42140f() {
        long[] jArr = new long[24];
        byte[] bArr = {1};
        for (int i = 0; i < 24; i++) {
            jArr[i] = 0;
            for (int i2 = 0; i2 < 7; i2++) {
                int i3 = (1 << i2) - 1;
                if (m42131a(bArr)) {
                    jArr[i] = jArr[i] ^ (1 << i3);
                }
            }
        }
        return jArr;
    }

    /* renamed from: g */
    private void m42141g() {
        byte[] bArr = this.f30478b;
        int i = this.f30480d;
        int i2 = i >> 3;
        bArr[i2] = (byte) (bArr[i2] | ((byte) ((int) (1 << (i & 7)))));
        int i3 = i + 1;
        this.f30480d = i3;
        if (i3 == this.f30479c) {
            m42133b(bArr, 0);
            this.f30480d = 0;
        }
        int i4 = this.f30480d;
        int i5 = i4 >> 6;
        int i6 = i4 & 63;
        int i7 = 0;
        for (int i8 = 0; i8 < i5; i8++) {
            long[] jArr = this.f30477a;
            jArr[i8] = jArr[i8] ^ C14087h.m44480d(this.f30478b, i7);
            i7 += 8;
        }
        if (i6 > 0) {
            long j = (1 << i6) - 1;
            long[] jArr2 = this.f30477a;
            jArr2[i5] = jArr2[i5] ^ (C14087h.m44480d(this.f30478b, i7) & j);
        }
        long[] jArr3 = this.f30477a;
        int i9 = (this.f30479c - 1) >> 6;
        jArr3[i9] = jArr3[i9] ^ Long.MIN_VALUE;
        m42137d();
        m42135c();
        this.f30480d = this.f30479c;
        this.f30482f = true;
    }

    /* renamed from: b */
    public int mo34973b() {
        return this.f30481e / 8;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo34986c(byte[] bArr, int i, int i2) {
        int i3 = this.f30480d;
        if (i3 % 8 != 0) {
            throw new IllegalStateException("attempt to absorb with odd length queue");
        } else if (!this.f30482f) {
            int i4 = this.f30479c >> 3;
            int i5 = i3 >> 3;
            int i6 = 0;
            while (i6 < i2) {
                if (i5 == 0) {
                    int i7 = i2 - i4;
                    if (i6 <= i7) {
                        do {
                            m42133b(bArr, i + i6);
                            i6 += i4;
                        } while (i6 <= i7);
                    }
                }
                int min = Math.min(i4 - i5, i2 - i6);
                System.arraycopy(bArr, i + i6, this.f30478b, i5, min);
                i5 += min;
                i6 += min;
                if (i5 == i4) {
                    m42133b(this.f30478b, 0);
                    i5 = 0;
                }
            }
            this.f30480d = i5 << 3;
        } else {
            throw new IllegalStateException("attempt to absorb while squeezing");
        }
    }

    public void reset() {
        m42128a(this.f30481e);
    }

    /* renamed from: b */
    private void m42132b(int i) {
        if (i <= 0 || i >= 1600 || i % 64 != 0) {
            throw new IllegalStateException("invalid rate value");
        }
        this.f30479c = i;
        int i2 = 0;
        while (true) {
            long[] jArr = this.f30477a;
            if (i2 < jArr.length) {
                jArr[i2] = 0;
                i2++;
            } else {
                C14079a.m44445a(this.f30478b, 0);
                this.f30480d = 0;
                this.f30482f = false;
                this.f30481e = (1600 - i) / 2;
                return;
            }
        }
    }

    /* renamed from: a */
    public void mo34972a(byte[] bArr, int i, int i2) {
        mo34986c(bArr, i, i2);
    }

    /* renamed from: a */
    private void m42128a(int i) {
        if (i == 128 || i == 224 || i == 256 || i == 288 || i == 384 || i == 512) {
            m42132b(1600 - (i << 1));
            return;
        }
        throw new IllegalArgumentException("bitLength must be one of 128, 224, 256, 288, 384, or 512.");
    }

    /* renamed from: d */
    private static void m42138d(long[] jArr) {
        long j = (((jArr[0] ^ jArr[5]) ^ jArr[10]) ^ jArr[15]) ^ jArr[20];
        long j2 = (((jArr[1] ^ jArr[6]) ^ jArr[11]) ^ jArr[16]) ^ jArr[21];
        long j3 = (((jArr[2] ^ jArr[7]) ^ jArr[12]) ^ jArr[17]) ^ jArr[22];
        long j4 = (((jArr[3] ^ jArr[8]) ^ jArr[13]) ^ jArr[18]) ^ jArr[23];
        long j5 = (((jArr[4] ^ jArr[9]) ^ jArr[14]) ^ jArr[19]) ^ jArr[24];
        long a = m42127a(j2, 1) ^ j5;
        jArr[0] = jArr[0] ^ a;
        jArr[5] = jArr[5] ^ a;
        jArr[10] = jArr[10] ^ a;
        jArr[15] = jArr[15] ^ a;
        jArr[20] = jArr[20] ^ a;
        long a2 = m42127a(j3, 1) ^ j;
        jArr[1] = jArr[1] ^ a2;
        jArr[6] = jArr[6] ^ a2;
        jArr[11] = jArr[11] ^ a2;
        jArr[16] = jArr[16] ^ a2;
        jArr[21] = a2 ^ jArr[21];
        long j6 = j4;
        long a3 = m42127a(j6, 1) ^ j2;
        jArr[2] = jArr[2] ^ a3;
        jArr[7] = jArr[7] ^ a3;
        jArr[12] = jArr[12] ^ a3;
        jArr[17] = jArr[17] ^ a3;
        jArr[22] = a3 ^ jArr[22];
        long a4 = m42127a(j5, 1) ^ j3;
        jArr[3] = jArr[3] ^ a4;
        jArr[8] = jArr[8] ^ a4;
        jArr[13] = jArr[13] ^ a4;
        jArr[18] = jArr[18] ^ a4;
        jArr[23] = a4 ^ jArr[23];
        long a5 = m42127a(j, 1) ^ j6;
        jArr[4] = jArr[4] ^ a5;
        jArr[9] = jArr[9] ^ a5;
        jArr[14] = jArr[14] ^ a5;
        jArr[19] = jArr[19] ^ a5;
        jArr[24] = a5 ^ jArr[24];
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo34984a(int i, int i2) {
        if (i2 < 1 || i2 > 7) {
            throw new IllegalArgumentException("'bits' must be in the range 1 to 7");
        }
        int i3 = this.f30480d;
        if (i3 % 8 != 0) {
            throw new IllegalStateException("attempt to absorb with odd length queue");
        } else if (!this.f30482f) {
            this.f30478b[i3 >> 3] = (byte) (i & ((1 << i2) - 1));
            this.f30480d = i3 + i2;
        } else {
            throw new IllegalStateException("attempt to absorb while squeezing");
        }
    }

    /* renamed from: b */
    private void m42133b(byte[] bArr, int i) {
        int i2 = this.f30479c >> 6;
        for (int i3 = 0; i3 < i2; i3++) {
            long[] jArr = this.f30477a;
            jArr[i3] = jArr[i3] ^ C14087h.m44480d(bArr, i);
            i += 8;
        }
        m42137d();
    }

    /* renamed from: c */
    private void m42135c() {
        C14087h.m44475a(this.f30477a, 0, this.f30479c >> 6, this.f30478b, 0);
    }

    /* renamed from: c */
    private static void m42136c(long[] jArr) {
        for (int i = 1; i < 25; i++) {
            jArr[i] = m42127a(jArr[i], f30476h[i]);
        }
    }

    /* renamed from: b */
    private static void m42134b(long[] jArr) {
        long j = jArr[1];
        jArr[1] = jArr[6];
        jArr[6] = jArr[9];
        jArr[9] = jArr[22];
        jArr[22] = jArr[14];
        jArr[14] = jArr[20];
        jArr[20] = jArr[2];
        jArr[2] = jArr[12];
        jArr[12] = jArr[13];
        jArr[13] = jArr[19];
        jArr[19] = jArr[23];
        jArr[23] = jArr[15];
        jArr[15] = jArr[4];
        jArr[4] = jArr[24];
        jArr[24] = jArr[21];
        jArr[21] = jArr[8];
        jArr[8] = jArr[16];
        jArr[16] = jArr[5];
        jArr[5] = jArr[3];
        jArr[3] = jArr[18];
        jArr[18] = jArr[17];
        jArr[17] = jArr[11];
        jArr[11] = jArr[7];
        jArr[7] = jArr[10];
        jArr[10] = j;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo34985a(byte[] bArr, int i, long j) {
        if (!this.f30482f) {
            m42141g();
        }
        long j2 = 0;
        if (j % 8 == 0) {
            while (j2 < j) {
                if (this.f30480d == 0) {
                    m42137d();
                    m42135c();
                    this.f30480d = this.f30479c;
                }
                int min = (int) Math.min((long) this.f30480d, j - j2);
                System.arraycopy(this.f30478b, (this.f30479c - this.f30480d) / 8, bArr, ((int) (j2 / 8)) + i, min / 8);
                this.f30480d -= min;
                j2 += (long) min;
            }
            return;
        }
        throw new IllegalStateException("outputLength not a multiple of 8");
    }

    /* renamed from: a */
    private static void m42129a(long[] jArr) {
        for (int i = 0; i < 25; i += 5) {
            int i2 = i + 0;
            int i3 = i + 1;
            int i4 = i + 2;
            long j = jArr[i2] ^ ((~jArr[i3]) & jArr[i4]);
            int i5 = i + 3;
            long j2 = jArr[i3] ^ ((~jArr[i4]) & jArr[i5]);
            int i6 = i + 4;
            long j3 = jArr[i4] ^ ((~jArr[i5]) & jArr[i6]);
            long j4 = jArr[i5] ^ ((~jArr[i6]) & jArr[i2]);
            int i7 = i5;
            long j5 = j4;
            long j6 = ((~jArr[i2]) & jArr[i3]) ^ jArr[i6];
            jArr[i2] = j;
            jArr[i3] = j2;
            jArr[i4] = j3;
            jArr[i7] = j5;
            jArr[i6] = j6;
        }
    }

    /* renamed from: a */
    private static void m42130a(long[] jArr, int i) {
        jArr[0] = jArr[0] ^ f30475g[i];
    }
}
