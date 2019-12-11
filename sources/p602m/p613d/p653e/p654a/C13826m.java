package p602m.p613d.p653e.p654a;

import java.math.BigInteger;
import p602m.p613d.p683g.C14079a;

/* renamed from: m.d.e.a.m */
/* compiled from: LongArray */
class C13826m implements Cloneable {

    /* renamed from: U */
    private static final short[] f30679U = {0, 1, 4, 5, 16, 17, 20, 21, 64, 65, 68, 69, 80, 81, 84, 85, 256, 257, 260, 261, 272, 273, 276, 277, 320, 321, 324, 325, 336, 337, 340, 341, 1024, 1025, 1028, 1029, 1040, 1041, 1044, 1045, 1088, 1089, 1092, 1093, 1104, 1105, 1108, 1109, 1280, 1281, 1284, 1285, 1296, 1297, 1300, 1301, 1344, 1345, 1348, 1349, 1360, 1361, 1364, 1365, 4096, 4097, 4100, 4101, 4112, 4113, 4116, 4117, 4160, 4161, 4164, 4165, 4176, 4177, 4180, 4181, 4352, 4353, 4356, 4357, 4368, 4369, 4372, 4373, 4416, 4417, 4420, 4421, 4432, 4433, 4436, 4437, 5120, 5121, 5124, 5125, 5136, 5137, 5140, 5141, 5184, 5185, 5188, 5189, 5200, 5201, 5204, 5205, 5376, 5377, 5380, 5381, 5392, 5393, 5396, 5397, 5440, 5441, 5444, 5445, 5456, 5457, 5460, 5461, 16384, 16385, 16388, 16389, 16400, 16401, 16404, 16405, 16448, 16449, 16452, 16453, 16464, 16465, 16468, 16469, 16640, 16641, 16644, 16645, 16656, 16657, 16660, 16661, 16704, 16705, 16708, 16709, 16720, 16721, 16724, 16725, 17408, 17409, 17412, 17413, 17424, 17425, 17428, 17429, 17472, 17473, 17476, 17477, 17488, 17489, 17492, 17493, 17664, 17665, 17668, 17669, 17680, 17681, 17684, 17685, 17728, 17729, 17732, 17733, 17744, 17745, 17748, 17749, 20480, 20481, 20484, 20485, 20496, 20497, 20500, 20501, 20544, 20545, 20548, 20549, 20560, 20561, 20564, 20565, 20736, 20737, 20740, 20741, 20752, 20753, 20756, 20757, 20800, 20801, 20804, 20805, 20816, 20817, 20820, 20821, 21504, 21505, 21508, 21509, 21520, 21521, 21524, 21525, 21568, 21569, 21572, 21573, 21584, 21585, 21588, 21589, 21760, 21761, 21764, 21765, 21776, 21777, 21780, 21781, 21824, 21825, 21828, 21829, 21840, 21841, 21844, 21845};

    /* renamed from: V */
    static final byte[] f30680V = {0, 1, 2, 2, 3, 3, 3, 3, 4, 4, 4, 4, 4, 4, 4, 4, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8};

    /* renamed from: c */
    private long[] f30681c;

    public C13826m(int i) {
        this.f30681c = new long[i];
    }

    /* renamed from: a */
    public int mo35183a(int i) {
        long[] jArr = this.f30681c;
        int min = Math.min(i, jArr.length);
        if (min < 1) {
            return 0;
        }
        if (jArr[0] != 0) {
            do {
                min--;
            } while (jArr[min] == 0);
            return min + 1;
        }
        do {
            min--;
            if (jArr[min] != 0) {
                return min + 1;
            }
        } while (min > 0);
        return 0;
    }

    /* renamed from: b */
    public int mo35189b() {
        int length = this.f30681c.length;
        while (length != 0) {
            length--;
            long j = this.f30681c[length];
            if (j != 0) {
                return (length << 6) + m42557a(j);
            }
        }
        return 0;
    }

    /* renamed from: c */
    public int mo35192c() {
        return mo35183a(this.f30681c.length);
    }

    public Object clone() {
        return new C13826m(C14079a.m44455a(this.f30681c));
    }

    /* renamed from: d */
    public boolean mo35196d() {
        long[] jArr = this.f30681c;
        if (jArr[0] != 1) {
            return false;
        }
        for (int i = 1; i < jArr.length; i++) {
            if (jArr[i] != 0) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: e */
    public boolean mo35197e() {
        long[] jArr = this.f30681c;
        for (int i = 0; i < jArr.length; i++) {
            if (jArr[i] != 0) {
                return false;
            }
        }
        return true;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C13826m)) {
            return false;
        }
        C13826m mVar = (C13826m) obj;
        int c = mo35192c();
        if (mVar.mo35192c() != c) {
            return false;
        }
        for (int i = 0; i < c; i++) {
            if (this.f30681c[i] != mVar.f30681c[i]) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: f */
    public boolean mo35199f() {
        long[] jArr = this.f30681c;
        return jArr.length > 0 && (1 & jArr[0]) != 0;
    }

    /* renamed from: g */
    public BigInteger mo35200g() {
        int c = mo35192c();
        if (c == 0) {
            return C13805c.f30633a;
        }
        int i = c - 1;
        long j = this.f30681c[i];
        byte[] bArr = new byte[8];
        int i2 = 0;
        boolean z = false;
        for (int i3 = 7; i3 >= 0; i3--) {
            byte b = (byte) ((int) (j >>> (i3 * 8)));
            if (z || b != 0) {
                int i4 = i2 + 1;
                bArr[i2] = b;
                i2 = i4;
                z = true;
            }
        }
        byte[] bArr2 = new byte[((i * 8) + i2)];
        for (int i5 = 0; i5 < i2; i5++) {
            bArr2[i5] = bArr[i5];
        }
        for (int i6 = c - 2; i6 >= 0; i6--) {
            long j2 = this.f30681c[i6];
            int i7 = 7;
            while (i7 >= 0) {
                int i8 = i2 + 1;
                bArr2[i2] = (byte) ((int) (j2 >>> (i7 * 8)));
                i7--;
                i2 = i8;
            }
        }
        return new BigInteger(1, bArr2);
    }

    public int hashCode() {
        int c = mo35192c();
        int i = 1;
        for (int i2 = 0; i2 < c; i2++) {
            long j = this.f30681c[i2];
            i = (((i * 31) ^ ((int) j)) * 31) ^ ((int) (j >>> 32));
        }
        return i;
    }

    public String toString() {
        int c = mo35192c();
        if (c == 0) {
            return "0";
        }
        int i = c - 1;
        StringBuffer stringBuffer = new StringBuffer(Long.toBinaryString(this.f30681c[i]));
        while (true) {
            i--;
            if (i < 0) {
                return stringBuffer.toString();
            }
            String binaryString = Long.toBinaryString(this.f30681c[i]);
            int length = binaryString.length();
            if (length < 64) {
                stringBuffer.append("0000000000000000000000000000000000000000000000000000000000000000".substring(length));
            }
            stringBuffer.append(binaryString);
        }
    }

    /* renamed from: c */
    public void mo35193c(int i, int[] iArr) {
        long[] jArr = this.f30681c;
        int c = m42575c(jArr, 0, jArr.length, i, iArr);
        if (c < jArr.length) {
            this.f30681c = new long[c];
            System.arraycopy(jArr, 0, this.f30681c, 0, c);
        }
    }

    public C13826m(long[] jArr) {
        this.f30681c = jArr;
    }

    /* renamed from: b */
    private int m42569b(int i) {
        int i2 = (i + 62) >>> 6;
        while (i2 != 0) {
            i2--;
            long j = this.f30681c[i2];
            if (j != 0) {
                return (i2 << 6) + m42557a(j);
            }
        }
        return 0;
    }

    public C13826m(long[] jArr, int i, int i2) {
        if (i == 0 && i2 == jArr.length) {
            this.f30681c = jArr;
            return;
        }
        this.f30681c = new long[i2];
        System.arraycopy(jArr, i, this.f30681c, 0, i2);
    }

    /* renamed from: d */
    private long[] m42580d(int i) {
        long[] jArr = new long[i];
        long[] jArr2 = this.f30681c;
        System.arraycopy(jArr2, 0, jArr, 0, Math.min(jArr2.length, i));
        return jArr;
    }

    /* JADX WARNING: type inference failed for: r3v11, types: [byte[]] */
    /* JADX WARNING: type inference failed for: r3v12, types: [byte] */
    /* JADX WARNING: Incorrect type for immutable var: ssa=byte, code=int, for r3v12, types: [byte] */
    /* JADX WARNING: Incorrect type for immutable var: ssa=byte[], code=null, for r3v11, types: [byte[]] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int m42557a(long r3) {
        /*
            r0 = 32
            long r1 = r3 >>> r0
            int r2 = (int) r1
            if (r2 != 0) goto L_0x0009
            int r2 = (int) r3
            r0 = 0
        L_0x0009:
            int r3 = r2 >>> 16
            if (r3 != 0) goto L_0x001d
            int r3 = r2 >>> 8
            if (r3 != 0) goto L_0x0016
            byte[] r3 = f30680V
            byte r3 = r3[r2]
            goto L_0x002e
        L_0x0016:
            byte[] r4 = f30680V
            byte r3 = r4[r3]
            int r3 = r3 + 8
            goto L_0x002e
        L_0x001d:
            int r4 = r3 >>> 8
            if (r4 != 0) goto L_0x0028
            byte[] r4 = f30680V
            byte r3 = r4[r3]
            int r3 = r3 + 16
            goto L_0x002e
        L_0x0028:
            byte[] r3 = f30680V
            byte r3 = r3[r4]
            int r3 = r3 + 24
        L_0x002e:
            int r0 = r0 + r3
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p602m.p613d.p653e.p654a.C13826m.m42557a(long):int");
    }

    /* renamed from: b */
    private static long m42570b(long[] jArr, int i, long[] jArr2, int i2, int i3, int i4) {
        int i5 = 64 - i4;
        long j = 0;
        int i6 = i3;
        for (int i7 = 0; i7 < i6; i7++) {
            long j2 = jArr2[i2 + i7];
            int i8 = i + i7;
            jArr[i8] = (j | (j2 << i4)) ^ jArr[i8];
            j = j2 >>> i5;
        }
        return j;
    }

    /* renamed from: c */
    private static int m42575c(long[] jArr, int i, int i2, int i3, int[] iArr) {
        long[] jArr2 = jArr;
        int i4 = i;
        int i5 = i2;
        int i6 = i3;
        int[] iArr2 = iArr;
        int i7 = (i6 + 63) >>> 6;
        if (i5 < i7) {
            return i5;
        }
        int i8 = i5 << 6;
        int min = Math.min(i8, (i6 << 1) - 1);
        int i9 = i8 - min;
        int i10 = i5;
        while (i9 >= 64) {
            i10--;
            i9 -= 64;
        }
        int length = iArr2.length;
        int i11 = iArr2[length - 1];
        int i12 = length > 1 ? iArr2[length - 2] : 0;
        int max = Math.max(i6, i11 + 64);
        int min2 = (i9 + Math.min(min - max, i6 - i12)) >> 6;
        if (min2 > 1) {
            int i13 = i10 - min2;
            m42562a(jArr, i, i10, i13, i3, iArr);
            while (i10 > i13) {
                i10--;
                jArr2[i4 + i10] = 0;
            }
            min = i13 << 6;
        }
        if (min > max) {
            m42571b(jArr, i, i10, max, i3, iArr);
        } else {
            max = min;
        }
        if (max > i6) {
            m42572b(jArr, i, max, i6, iArr2);
        }
        return i7;
    }

    /* renamed from: d */
    private static long m42578d(long[] jArr, int i, long[] jArr2, int i2, int i3, int i4) {
        int i5 = 64 - i4;
        long j = 0;
        for (int i6 = 0; i6 < i3; i6++) {
            long j2 = jArr[i + i6];
            jArr2[i2 + i6] = j | (j2 << i4);
            j = j2 >>> i5;
        }
        return j;
    }

    /* renamed from: b */
    private static void m42573b(long[] jArr, int i, long[] jArr2, int i2, long[] jArr3, int i3, int i4) {
        for (int i5 = 0; i5 < i4; i5++) {
            int i6 = i + i5;
            jArr[i6] = jArr[i6] ^ (jArr2[i2 + i5] ^ jArr3[i3 + i5]);
        }
    }

    /* renamed from: a */
    public C13826m mo35184a() {
        if (this.f30681c.length == 0) {
            return new C13826m(new long[]{1});
        }
        long[] d = m42580d(Math.max(1, mo35192c()));
        d[0] = 1 ^ d[0];
        return new C13826m(d);
    }

    /* renamed from: b */
    private static boolean m42574b(long[] jArr, int i, int i2) {
        return (jArr[i + (i2 >>> 6)] & (1 << (i2 & 63))) != 0;
    }

    /* renamed from: d */
    private static C13826m m42579d(long[] jArr, int i, int i2, int i3, int[] iArr) {
        return new C13826m(jArr, i, m42575c(jArr, i, i2, i3, iArr));
    }

    public C13826m(BigInteger bigInteger) {
        int i;
        int i2;
        if (bigInteger == null || bigInteger.signum() < 0) {
            throw new IllegalArgumentException("invalid F2m field value");
        } else if (bigInteger.signum() == 0) {
            this.f30681c = new long[]{0};
        } else {
            byte[] byteArray = bigInteger.toByteArray();
            int length = byteArray.length;
            if (byteArray[0] == 0) {
                length--;
                i = 1;
            } else {
                i = 0;
            }
            int i3 = (length + 7) / 8;
            this.f30681c = new long[i3];
            int i4 = i3 - 1;
            int i5 = (length % 8) + i;
            if (i < i5) {
                long j = 0;
                while (i < i5) {
                    j = (j << 8) | ((long) (byteArray[i] & 255));
                    i++;
                }
                i2 = i4 - 1;
                this.f30681c[i4] = j;
            } else {
                i2 = i4;
            }
            while (i2 >= 0) {
                int i6 = i;
                int i7 = 0;
                long j2 = 0;
                while (i7 < 8) {
                    j2 = (j2 << 8) | ((long) (byteArray[i6] & 255));
                    i7++;
                    i6++;
                }
                this.f30681c[i2] = j2;
                i2--;
                i = i6;
            }
        }
    }

    /* renamed from: b */
    public C13826m mo35191b(C13826m mVar, int i, int[] iArr) {
        C13826m mVar2;
        C13826m mVar3;
        long[] jArr;
        int b = mo35189b();
        if (b == 0) {
            return this;
        }
        int b2 = mVar.mo35189b();
        if (b2 == 0) {
            return mVar;
        }
        if (b > b2) {
            mVar3 = this;
            mVar2 = mVar;
            int i2 = b2;
            b2 = b;
            b = i2;
        } else {
            mVar2 = this;
            mVar3 = mVar;
        }
        int i3 = (b + 63) >>> 6;
        int i4 = (b2 + 63) >>> 6;
        int i5 = ((b + b2) + 62) >>> 6;
        if (i3 == 1) {
            long j = mVar2.f30681c[0];
            if (j == 1) {
                return mVar3;
            }
            long[] jArr2 = new long[i5];
            m42559a(j, mVar3.f30681c, i4, jArr2, 0);
            return new C13826m(jArr2, 0, i5);
        }
        int i6 = ((b2 + 7) + 63) >>> 6;
        int[] iArr2 = new int[16];
        long[] jArr3 = new long[(i6 << 4)];
        iArr2[1] = i6;
        System.arraycopy(mVar3.f30681c, 0, jArr3, i6, i4);
        int i7 = 2;
        int i8 = i6;
        while (i7 < 16) {
            i8 += i6;
            iArr2[i7] = i8;
            if ((i7 & 1) == 0) {
                jArr = jArr3;
                m42578d(jArr3, i8 >>> 1, jArr3, i8, i6, 1);
            } else {
                jArr = jArr3;
                m42568a(jArr, i6, jArr, i8 - i6, jArr, i8, i6);
            }
            i7++;
            jArr3 = jArr;
        }
        long[] jArr4 = jArr3;
        long[] jArr5 = new long[jArr4.length];
        m42578d(jArr4, 0, jArr5, 0, jArr4.length, 4);
        long[] jArr6 = mVar2.f30681c;
        long[] jArr7 = new long[(i5 << 3)];
        for (int i9 = 0; i9 < i3; i9++) {
            long j2 = jArr6[i9];
            int i10 = i9;
            while (true) {
                long j3 = j2 >>> 4;
                int i11 = ((int) j3) & 15;
                long j4 = j3;
                m42573b(jArr7, i10, jArr4, iArr2[((int) j2) & 15], jArr5, iArr2[i11], i6);
                j2 = j4 >>> 4;
                if (j2 == 0) {
                    break;
                }
                i10 += i5;
            }
        }
        int length = jArr7.length;
        while (true) {
            length -= i5;
            if (length == 0) {
                return new C13826m(jArr7, 0, i5);
            }
            m42570b(jArr7, length - i5, jArr7, length, i5, 8);
        }
    }

    /* renamed from: d */
    public C13826m mo35195d(int i, int[] iArr) {
        int c = mo35192c();
        if (c == 0) {
            return this;
        }
        int i2 = c << 1;
        long[] jArr = new long[i2];
        int i3 = 0;
        while (i3 < i2) {
            long j = this.f30681c[i3 >>> 1];
            int i4 = i3 + 1;
            jArr[i3] = m42576c((int) j);
            i3 = i4 + 1;
            jArr[i4] = m42576c((int) (j >>> 32));
        }
        return new C13826m(jArr, 0, jArr.length);
    }

    /* renamed from: a */
    private void m42560a(C13826m mVar, int i, int i2) {
        int i3 = (i + 63) >>> 6;
        int i4 = i2 >>> 6;
        int i5 = i2 & 63;
        if (i5 == 0) {
            m42567a(this.f30681c, i4, mVar.f30681c, 0, i3);
            return;
        }
        long b = m42570b(this.f30681c, i4, mVar.f30681c, 0, i3, i5);
        if (b != 0) {
            long[] jArr = this.f30681c;
            int i6 = i3 + i4;
            jArr[i6] = b ^ jArr[i6];
        }
    }

    /* renamed from: c */
    private static void m42577c(long[] jArr, int i, long[] jArr2, int i2, int i3, int i4) {
        int i5 = i + (i4 >>> 6);
        int i6 = i4 & 63;
        if (i6 == 0) {
            m42567a(jArr, i5, jArr2, i2, i3);
            return;
        }
        jArr[i5] = m42558a(jArr, i5 + 1, jArr2, i2, i3, 64 - i6) ^ jArr[i5];
    }

    /* renamed from: a */
    private static long m42558a(long[] jArr, int i, long[] jArr2, int i2, int i3, int i4) {
        int i5 = 64 - i4;
        long j = 0;
        while (true) {
            i3--;
            if (i3 < 0) {
                return j;
            }
            long j2 = jArr2[i2 + i3];
            int i6 = i + i3;
            jArr[i6] = (j | (j2 >>> i4)) ^ jArr[i6];
            j = j2 << i5;
        }
    }

    /* renamed from: c */
    private static long m42576c(int i) {
        short[] sArr = f30679U;
        short s = sArr[i & 255] | (sArr[(i >>> 8) & 255] << 16);
        short s2 = sArr[(i >>> 16) & 255];
        return (((long) s) & 4294967295L) | ((((long) ((sArr[i >>> 24] << 16) | s2)) & 4294967295L) << 32);
    }

    /* renamed from: a */
    public void mo35188a(C13826m mVar, int i) {
        int c = mVar.mo35192c();
        if (c != 0) {
            int i2 = c + i;
            if (i2 > this.f30681c.length) {
                this.f30681c = m42580d(i2);
            }
            m42567a(this.f30681c, i, mVar.f30681c, 0, c);
        }
    }

    /* renamed from: a */
    private static void m42567a(long[] jArr, int i, long[] jArr2, int i2, int i3) {
        for (int i4 = 0; i4 < i3; i4++) {
            int i5 = i + i4;
            jArr[i5] = jArr[i5] ^ jArr2[i2 + i4];
        }
    }

    /* renamed from: a */
    private static void m42568a(long[] jArr, int i, long[] jArr2, int i2, long[] jArr3, int i3, int i4) {
        for (int i5 = 0; i5 < i4; i5++) {
            jArr3[i3 + i5] = jArr[i + i5] ^ jArr2[i2 + i5];
        }
    }

    /* renamed from: a */
    private static void m42564a(long[] jArr, int i, int i2, long j) {
        int i3 = i + (i2 >>> 6);
        int i4 = i2 & 63;
        if (i4 == 0) {
            jArr[i3] = jArr[i3] ^ j;
            return;
        }
        jArr[i3] = jArr[i3] ^ (j << i4);
        long j2 = j >>> (64 - i4);
        if (j2 != 0) {
            int i5 = i3 + 1;
            jArr[i5] = j2 ^ jArr[i5];
        }
    }

    /* renamed from: a */
    private static void m42561a(long[] jArr, int i, int i2) {
        int i3 = i + (i2 >>> 6);
        jArr[i3] = jArr[i3] ^ (1 << (i2 & 63));
    }

    /* renamed from: a */
    private static void m42559a(long j, long[] jArr, int i, long[] jArr2, int i2) {
        int i3 = i;
        long[] jArr3 = jArr2;
        int i4 = i2;
        if ((j & 1) != 0) {
            m42567a(jArr3, i4, jArr, 0, i3);
        } else {
            long[] jArr4 = jArr;
        }
        int i5 = 1;
        long j2 = j;
        while (true) {
            long j3 = j2 >>> 1;
            if (j3 != 0) {
                if ((j3 & 1) != 0) {
                    long b = m42570b(jArr2, i2, jArr, 0, i, i5);
                    if (b != 0) {
                        int i6 = i4 + i3;
                        jArr3[i6] = b ^ jArr3[i6];
                    }
                }
                i5++;
                j2 = j3;
            } else {
                return;
            }
        }
    }

    /* renamed from: b */
    private static void m42572b(long[] jArr, int i, int i2, int i3, int[] iArr) {
        while (true) {
            i2--;
            if (i2 < i3) {
                return;
            }
            if (m42574b(jArr, i, i2)) {
                m42563a(jArr, i, i2, i3, iArr);
            }
        }
    }

    /* renamed from: b */
    private static void m42571b(long[] jArr, int i, int i2, int i3, int i4, int[] iArr) {
        int i5 = i3 >>> 6;
        int i6 = i2;
        while (true) {
            int i7 = i6 - 1;
            if (i7 <= i5) {
                break;
            }
            int i8 = i + i7;
            long j = jArr[i8];
            if (j != 0) {
                jArr[i8] = 0;
                m42565a(jArr, i, i7 << 6, j, i4, iArr);
            }
            i6 = i7;
        }
        int i9 = i3 & 63;
        int i10 = i + i5;
        long j2 = jArr[i10] >>> i9;
        if (j2 != 0) {
            jArr[i10] = jArr[i10] ^ (j2 << i9);
            m42565a(jArr, i, i3, j2, i4, iArr);
        }
    }

    /* renamed from: a */
    public C13826m mo35187a(C13826m mVar, int i, int[] iArr) {
        C13826m mVar2;
        C13826m mVar3;
        long[] jArr;
        int i2 = i;
        int[] iArr2 = iArr;
        int b = mo35189b();
        if (b == 0) {
            return this;
        }
        int b2 = mVar.mo35189b();
        if (b2 == 0) {
            return mVar;
        }
        if (b > b2) {
            mVar3 = this;
            mVar2 = mVar;
            int i3 = b2;
            b2 = b;
            b = i3;
        } else {
            mVar2 = this;
            mVar3 = mVar;
        }
        int i4 = (b + 63) >>> 6;
        int i5 = (b2 + 63) >>> 6;
        int i6 = ((b + b2) + 62) >>> 6;
        if (i4 == 1) {
            long j = mVar2.f30681c[0];
            if (j == 1) {
                return mVar3;
            }
            long[] jArr2 = new long[i6];
            m42559a(j, mVar3.f30681c, i5, jArr2, 0);
            return m42579d(jArr2, 0, i6, i2, iArr2);
        }
        int i7 = ((b2 + 7) + 63) >>> 6;
        int[] iArr3 = new int[16];
        long[] jArr3 = new long[(i7 << 4)];
        iArr3[1] = i7;
        System.arraycopy(mVar3.f30681c, 0, jArr3, i7, i5);
        int i8 = 2;
        int i9 = i7;
        while (i8 < 16) {
            i9 += i7;
            iArr3[i8] = i9;
            if ((i8 & 1) == 0) {
                jArr = jArr3;
                m42578d(jArr3, i9 >>> 1, jArr3, i9, i7, 1);
            } else {
                jArr = jArr3;
                m42568a(jArr, i7, jArr, i9 - i7, jArr, i9, i7);
            }
            i8++;
            jArr3 = jArr;
        }
        long[] jArr4 = jArr3;
        long[] jArr5 = new long[jArr4.length];
        m42578d(jArr4, 0, jArr5, 0, jArr4.length, 4);
        long[] jArr6 = mVar2.f30681c;
        long[] jArr7 = new long[(i6 << 3)];
        for (int i10 = 0; i10 < i4; i10++) {
            long j2 = jArr6[i10];
            int i11 = i10;
            while (true) {
                long j3 = j2 >>> 4;
                int i12 = ((int) j3) & 15;
                long j4 = j3;
                m42573b(jArr7, i11, jArr4, iArr3[((int) j2) & 15], jArr5, iArr3[i12], i7);
                j2 = j4 >>> 4;
                if (j2 == 0) {
                    break;
                }
                i11 += i6;
            }
        }
        int length = jArr7.length;
        while (true) {
            length -= i6;
            if (length == 0) {
                return m42579d(jArr7, 0, i6, i2, iArr2);
            }
            m42570b(jArr7, length - i6, jArr7, length, i6, 8);
        }
    }

    /* renamed from: b */
    public C13826m mo35190b(int i, int[] iArr) {
        int c = mo35192c();
        if (c == 0) {
            return this;
        }
        int i2 = c << 1;
        long[] jArr = new long[i2];
        int i3 = 0;
        while (i3 < i2) {
            long j = this.f30681c[i3 >>> 1];
            int i4 = i3 + 1;
            jArr[i3] = m42576c((int) j);
            i3 = i4 + 1;
            jArr[i4] = m42576c((int) (j >>> 32));
        }
        return new C13826m(jArr, 0, m42575c(jArr, 0, jArr.length, i, iArr));
    }

    /* renamed from: a */
    private static void m42563a(long[] jArr, int i, int i2, int i3, int[] iArr) {
        m42561a(jArr, i, i2);
        int i4 = i2 - i3;
        int length = iArr.length;
        while (true) {
            length--;
            if (length >= 0) {
                m42561a(jArr, i, iArr[length] + i4);
            } else {
                m42561a(jArr, i, i4);
                return;
            }
        }
    }

    /* renamed from: a */
    private static void m42565a(long[] jArr, int i, int i2, long j, int i3, int[] iArr) {
        int i4 = i2 - i3;
        int length = iArr.length;
        while (true) {
            length--;
            if (length >= 0) {
                m42564a(jArr, i, iArr[length] + i4, j);
            } else {
                m42564a(jArr, i, i4, j);
                return;
            }
        }
    }

    /* renamed from: a */
    private static void m42562a(long[] jArr, int i, int i2, int i3, int i4, int[] iArr) {
        int i5 = (i3 << 6) - i4;
        int length = iArr.length;
        while (true) {
            length--;
            if (length >= 0) {
                m42577c(jArr, i, jArr, i + i3, i2 - i3, i5 + iArr[length]);
            } else {
                m42577c(jArr, i, jArr, i + i3, i2 - i3, i5);
                return;
            }
        }
    }

    /* renamed from: a */
    public C13826m mo35185a(int i, int i2, int[] iArr) {
        int c = mo35192c();
        if (c == 0) {
            return this;
        }
        long[] jArr = new long[(((i2 + 63) >>> 6) << 1)];
        System.arraycopy(this.f30681c, 0, jArr, 0, c);
        while (true) {
            i--;
            if (i < 0) {
                return new C13826m(jArr, 0, c);
            }
            m42566a(jArr, c, i2, iArr);
            c = m42575c(jArr, 0, jArr.length, i2, iArr);
        }
    }

    /* renamed from: a */
    private static void m42566a(long[] jArr, int i, int i2, int[] iArr) {
        int i3 = i << 1;
        while (true) {
            i--;
            if (i >= 0) {
                long j = jArr[i];
                int i4 = i3 - 1;
                jArr[i4] = m42576c((int) (j >>> 32));
                i3 = i4 - 1;
                jArr[i3] = m42576c((int) j);
            } else {
                return;
            }
        }
    }

    /* renamed from: a */
    public C13826m mo35186a(int i, int[] iArr) {
        int b = mo35189b();
        if (b == 0) {
            throw new IllegalStateException();
        } else if (b == 1) {
            return this;
        } else {
            C13826m mVar = (C13826m) clone();
            int i2 = (i + 63) >>> 6;
            C13826m mVar2 = new C13826m(i2);
            m42563a(mVar2.f30681c, 0, i, i, iArr);
            C13826m mVar3 = new C13826m(i2);
            mVar3.f30681c[0] = 1;
            int[] iArr2 = {b, i + 1};
            C13826m[] mVarArr = {mVar, mVar2};
            int[] iArr3 = {1, 0};
            C13826m[] mVarArr2 = {mVar3, new C13826m(i2)};
            int i3 = iArr2[1];
            int i4 = i3 - iArr2[0];
            int i5 = iArr3[1];
            int i6 = i3;
            int i7 = 1;
            while (true) {
                if (i4 < 0) {
                    i4 = -i4;
                    iArr2[i7] = i6;
                    iArr3[i7] = i5;
                    i7 = 1 - i7;
                    i6 = iArr2[i7];
                    i5 = iArr3[i7];
                }
                int i8 = 1 - i7;
                mVarArr[i7].m42560a(mVarArr[i8], iArr2[i8], i4);
                int b2 = mVarArr[i7].m42569b(i6);
                if (b2 == 0) {
                    return mVarArr2[i8];
                }
                int i9 = iArr3[i8];
                mVarArr2[i7].m42560a(mVarArr2[i8], i9, i4);
                int i10 = i9 + i4;
                if (i10 > i5) {
                    i5 = i10;
                } else if (i10 == i5) {
                    i5 = mVarArr2[i7].m42569b(i5);
                }
                i4 += b2 - i6;
                i6 = b2;
            }
        }
    }
}
