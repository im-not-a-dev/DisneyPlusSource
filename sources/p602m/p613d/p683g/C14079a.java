package p602m.p613d.p683g;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: m.d.g.a */
/* compiled from: Arrays */
public final class C14079a {

    /* renamed from: m.d.g.a$a */
    /* compiled from: Arrays */
    public static class C14080a<T> implements Iterator<T> {

        /* renamed from: U */
        private int f31105U = 0;

        /* renamed from: c */
        private final T[] f31106c;

        public C14080a(T[] tArr) {
            this.f31106c = tArr;
        }

        public boolean hasNext() {
            return this.f31105U < this.f31106c.length;
        }

        public T next() {
            int i = this.f31105U;
            T[] tArr = this.f31106c;
            if (i != tArr.length) {
                this.f31105U = i + 1;
                return tArr[i];
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Out of elements: ");
            sb.append(this.f31105U);
            throw new NoSuchElementException(sb.toString());
        }

        public void remove() {
            throw new UnsupportedOperationException("Cannot remove element from an Array.");
        }
    }

    /* renamed from: a */
    public static boolean m44447a(char[] cArr, char[] cArr2) {
        if (cArr == cArr2) {
            return true;
        }
        if (cArr == null || cArr2 == null || cArr.length != cArr2.length) {
            return false;
        }
        for (int i = 0; i != cArr.length; i++) {
            if (cArr[i] != cArr2[i]) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: b */
    public static int m44457b(byte[] bArr) {
        if (bArr == null) {
            return 0;
        }
        int length = bArr.length;
        int i = length + 1;
        while (true) {
            length--;
            if (length < 0) {
                return i;
            }
            i = (i * 257) ^ bArr[length];
        }
    }

    /* renamed from: c */
    public static boolean m44462c(byte[] bArr, byte[] bArr2) {
        boolean z = true;
        if (bArr == bArr2) {
            return true;
        }
        if (bArr == null || bArr2 == null) {
            return false;
        }
        if (bArr.length != bArr2.length) {
            return !m44462c(bArr, bArr);
        }
        byte b = 0;
        for (int i = 0; i != bArr.length; i++) {
            b |= bArr[i] ^ bArr2[i];
        }
        if (b != 0) {
            z = false;
        }
        return z;
    }

    /* renamed from: b */
    public static int m44458b(int[] iArr) {
        if (iArr == null) {
            return 0;
        }
        int length = iArr.length;
        int i = length + 1;
        while (true) {
            length--;
            if (length < 0) {
                return i;
            }
            i = (i * 257) ^ iArr[length];
        }
    }

    /* renamed from: a */
    public static boolean m44446a(byte[] bArr, byte[] bArr2) {
        if (bArr == bArr2) {
            return true;
        }
        if (bArr == null || bArr2 == null || bArr.length != bArr2.length) {
            return false;
        }
        for (int i = 0; i != bArr.length; i++) {
            if (bArr[i] != bArr2[i]) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: b */
    public static int m44459b(int[] iArr, int i, int i2) {
        if (iArr == null) {
            return 0;
        }
        int i3 = i2 + 1;
        while (true) {
            i2--;
            if (i2 < 0) {
                return i3;
            }
            i3 = (i3 * 257) ^ iArr[i + i2];
        }
    }

    /* renamed from: c */
    public static int[] m44463c(int[] iArr) {
        if (iArr == null) {
            return null;
        }
        int i = 0;
        int length = iArr.length;
        int[] iArr2 = new int[length];
        while (true) {
            length--;
            if (length < 0) {
                return iArr2;
            }
            int i2 = i + 1;
            iArr2[length] = iArr[i];
            i = i2;
        }
    }

    /* renamed from: b */
    public static int m44460b(short[] sArr) {
        if (sArr == null) {
            return 0;
        }
        int length = sArr.length;
        int i = length + 1;
        while (true) {
            length--;
            if (length < 0) {
                return i;
            }
            i = (i * 257) ^ (sArr[length] & 255);
        }
    }

    /* renamed from: a */
    public static boolean m44449a(short[] sArr, short[] sArr2) {
        if (sArr == sArr2) {
            return true;
        }
        if (sArr == null || sArr2 == null || sArr.length != sArr2.length) {
            return false;
        }
        for (int i = 0; i != sArr.length; i++) {
            if (sArr[i] != sArr2[i]) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: b */
    public static byte[] m44461b(byte[] bArr, byte[] bArr2) {
        if (bArr != null && bArr2 != null) {
            byte[] bArr3 = new byte[(bArr.length + bArr2.length)];
            System.arraycopy(bArr, 0, bArr3, 0, bArr.length);
            System.arraycopy(bArr2, 0, bArr3, bArr.length, bArr2.length);
            return bArr3;
        } else if (bArr2 != null) {
            return m44450a(bArr2);
        } else {
            return m44450a(bArr);
        }
    }

    /* renamed from: a */
    public static boolean m44448a(int[] iArr, int[] iArr2) {
        if (iArr == iArr2) {
            return true;
        }
        if (iArr == null || iArr2 == null || iArr.length != iArr2.length) {
            return false;
        }
        for (int i = 0; i != iArr.length; i++) {
            if (iArr[i] != iArr2[i]) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    public static void m44445a(byte[] bArr, byte b) {
        for (int i = 0; i < bArr.length; i++) {
            bArr[i] = b;
        }
    }

    /* renamed from: a */
    public static int m44441a(char[] cArr) {
        if (cArr == null) {
            return 0;
        }
        int length = cArr.length;
        int i = length + 1;
        while (true) {
            length--;
            if (length < 0) {
                return i;
            }
            i = (i * 257) ^ cArr[length];
        }
    }

    /* renamed from: a */
    public static int m44442a(long[] jArr, int i, int i2) {
        if (jArr == null) {
            return 0;
        }
        int i3 = i2 + 1;
        while (true) {
            i2--;
            if (i2 < 0) {
                return i3;
            }
            long j = jArr[i + i2];
            i3 = (((i3 * 257) ^ ((int) j)) * 257) ^ ((int) (j >>> 32));
        }
    }

    /* renamed from: a */
    public static int m44444a(short[][][] sArr) {
        int i = 0;
        for (int i2 = 0; i2 != sArr.length; i2++) {
            i = (i * 257) + m44443a(sArr[i2]);
        }
        return i;
    }

    /* renamed from: a */
    public static int m44443a(short[][] sArr) {
        int i = 0;
        for (int i2 = 0; i2 != sArr.length; i2++) {
            i = (i * 257) + m44460b(sArr[i2]);
        }
        return i;
    }

    /* renamed from: a */
    public static byte[] m44450a(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    /* renamed from: a */
    public static int[] m44453a(int[] iArr) {
        if (iArr == null) {
            return null;
        }
        int[] iArr2 = new int[iArr.length];
        System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
        return iArr2;
    }

    /* renamed from: a */
    public static long[] m44455a(long[] jArr) {
        if (jArr == null) {
            return null;
        }
        long[] jArr2 = new long[jArr.length];
        System.arraycopy(jArr, 0, jArr2, 0, jArr.length);
        return jArr2;
    }

    /* renamed from: a */
    public static short[] m44456a(short[] sArr) {
        if (sArr == null) {
            return null;
        }
        short[] sArr2 = new short[sArr.length];
        System.arraycopy(sArr, 0, sArr2, 0, sArr.length);
        return sArr2;
    }

    /* renamed from: a */
    public static int[] m44454a(int[] iArr, int i, int i2) {
        int a = m44440a(i, i2);
        int[] iArr2 = new int[a];
        if (iArr.length - i < a) {
            System.arraycopy(iArr, i, iArr2, 0, iArr.length - i);
        } else {
            System.arraycopy(iArr, i, iArr2, 0, a);
        }
        return iArr2;
    }

    /* renamed from: a */
    private static int m44440a(int i, int i2) {
        int i3 = i2 - i;
        if (i3 >= 0) {
            return i3;
        }
        StringBuffer stringBuffer = new StringBuffer(i);
        stringBuffer.append(" > ");
        stringBuffer.append(i2);
        throw new IllegalArgumentException(stringBuffer.toString());
    }

    /* renamed from: a */
    public static byte[] m44451a(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        if (bArr != null && bArr2 != null && bArr3 != null) {
            byte[] bArr4 = new byte[(bArr.length + bArr2.length + bArr3.length)];
            System.arraycopy(bArr, 0, bArr4, 0, bArr.length);
            System.arraycopy(bArr2, 0, bArr4, bArr.length, bArr2.length);
            System.arraycopy(bArr3, 0, bArr4, bArr.length + bArr2.length, bArr3.length);
            return bArr4;
        } else if (bArr == null) {
            return m44461b(bArr2, bArr3);
        } else {
            if (bArr2 == null) {
                return m44461b(bArr, bArr3);
            }
            return m44461b(bArr, bArr2);
        }
    }

    /* renamed from: a */
    public static byte[] m44452a(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        if (bArr != null && bArr2 != null && bArr3 != null && bArr4 != null) {
            byte[] bArr5 = new byte[(bArr.length + bArr2.length + bArr3.length + bArr4.length)];
            System.arraycopy(bArr, 0, bArr5, 0, bArr.length);
            System.arraycopy(bArr2, 0, bArr5, bArr.length, bArr2.length);
            System.arraycopy(bArr3, 0, bArr5, bArr.length + bArr2.length, bArr3.length);
            System.arraycopy(bArr4, 0, bArr5, bArr.length + bArr2.length + bArr3.length, bArr4.length);
            return bArr5;
        } else if (bArr4 == null) {
            return m44451a(bArr, bArr2, bArr3);
        } else {
            if (bArr3 == null) {
                return m44451a(bArr, bArr2, bArr4);
            }
            if (bArr2 == null) {
                return m44451a(bArr, bArr3, bArr4);
            }
            return m44451a(bArr2, bArr3, bArr4);
        }
    }
}
