package p602m.p613d.p662f.p664b.p670e;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import p602m.p613d.p627b.C13708l;

/* renamed from: m.d.f.b.e.y */
/* compiled from: XMSSUtil */
public class C14035y {
    /* renamed from: a */
    public static int m44313a(int i) {
        int i2 = 0;
        while (true) {
            i >>= 1;
            if (i == 0) {
                return i2;
            }
            i2++;
        }
    }

    /* renamed from: a */
    public static int m44314a(int i, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            if (((i >> i3) & 1) == 0) {
                return i3;
            }
        }
        return 0;
    }

    /* JADX WARNING: Incorrect type for immutable var: ssa=int, code=long, for r6v0, types: [long, int] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int m44315a(long r4, long r6) {
        /*
            r0 = 1
            long r2 = r0 << r6
            long r2 = r2 - r0
            long r4 = r4 & r2
            int r5 = (int) r4
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p602m.p613d.p662f.p664b.p670e.C14035y.m44315a(long, int):int");
    }

    /* renamed from: a */
    public static long m44317a(byte[] bArr, int i, int i2) {
        if (bArr != null) {
            long j = 0;
            for (int i3 = i; i3 < i + i2; i3++) {
                j = (j << 8) | ((long) (bArr[i3] & 255));
            }
            return j;
        }
        throw new NullPointerException("in == null");
    }

    /* JADX WARNING: Incorrect type for immutable var: ssa=int, code=long, for r2v0, types: [long, int] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static long m44324b(long r0, long r2) {
        /*
            long r0 = r0 >> r2
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p602m.p613d.p662f.p664b.p670e.C14035y.m44324b(long, int):long");
    }

    /* renamed from: b */
    public static boolean m44326b(byte[][] bArr) {
        if (bArr == null) {
            return true;
        }
        for (byte[] bArr2 : bArr) {
            if (bArr2 == null) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: c */
    public static byte[] m44328c(long j, int i) {
        byte[] bArr = new byte[i];
        for (int i2 = i - 1; i2 >= 0; i2--) {
            bArr[i2] = (byte) ((int) j);
            j >>>= 8;
        }
        return bArr;
    }

    /* renamed from: a */
    public static byte[] m44322a(byte[] bArr) {
        if (bArr != null) {
            byte[] bArr2 = new byte[bArr.length];
            for (int i = 0; i < bArr.length; i++) {
                bArr2[i] = bArr[i];
            }
            return bArr2;
        }
        throw new NullPointerException("in == null");
    }

    /* renamed from: b */
    public static byte[] m44327b(byte[] bArr, int i, int i2) {
        if (bArr == null) {
            throw new NullPointerException("src == null");
        } else if (i < 0) {
            throw new IllegalArgumentException("offset hast to be >= 0");
        } else if (i2 < 0) {
            throw new IllegalArgumentException("length hast to be >= 0");
        } else if (i + i2 <= bArr.length) {
            byte[] bArr2 = new byte[i2];
            for (int i3 = 0; i3 < bArr2.length; i3++) {
                bArr2[i3] = bArr[i + i3];
            }
            return bArr2;
        } else {
            throw new IllegalArgumentException("offset + length must not be greater then size of source array");
        }
    }

    /* renamed from: a */
    public static byte[][] m44323a(byte[][] bArr) {
        if (!m44326b(bArr)) {
            byte[][] bArr2 = new byte[bArr.length][];
            for (int i = 0; i < bArr.length; i++) {
                bArr2[i] = new byte[bArr[i].length];
                for (int i2 = 0; i2 < bArr[i].length; i2++) {
                    bArr2[i][i2] = bArr[i][i2];
                }
            }
            return bArr2;
        }
        throw new NullPointerException("in has null pointers");
    }

    /* renamed from: b */
    public static Object m44325b(byte[] bArr) throws IOException, ClassNotFoundException {
        return new ObjectInputStream(new ByteArrayInputStream(bArr)).readObject();
    }

    /* renamed from: a */
    public static void m44318a(byte[] bArr, byte[] bArr2, int i) {
        if (bArr == null) {
            throw new NullPointerException("dst == null");
        } else if (bArr2 == null) {
            throw new NullPointerException("src == null");
        } else if (i < 0) {
            throw new IllegalArgumentException("offset hast to be >= 0");
        } else if (bArr2.length + i <= bArr.length) {
            for (int i2 = 0; i2 < bArr2.length; i2++) {
                bArr[i + i2] = bArr2[i2];
            }
        } else {
            throw new IllegalArgumentException("src length + offset must not be greater than size of destination");
        }
    }

    /* renamed from: a */
    public static boolean m44319a(int i, long j) {
        if (j >= 0) {
            return j < (1 << i);
        }
        throw new IllegalStateException("index must not be negative");
    }

    /* renamed from: a */
    public static int m44316a(C13708l lVar) {
        if (lVar != null) {
            String a = lVar.mo34971a();
            if (a.equals("SHAKE128")) {
                return 32;
            }
            if (a.equals("SHAKE256")) {
                return 64;
            }
            return lVar.mo34973b();
        }
        throw new NullPointerException("digest == null");
    }

    /* renamed from: a */
    public static byte[] m44321a(Object obj) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
        objectOutputStream.writeObject(obj);
        objectOutputStream.flush();
        return byteArrayOutputStream.toByteArray();
    }

    /* renamed from: a */
    public static boolean m44320a(long j, int i, int i2) {
        boolean z = false;
        if (j == 0) {
            return false;
        }
        if ((j + 1) % ((long) Math.pow((double) (1 << i), (double) i2)) == 0) {
            z = true;
        }
        return z;
    }
}
