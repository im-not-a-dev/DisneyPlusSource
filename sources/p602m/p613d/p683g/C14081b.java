package p602m.p613d.p683g;

import java.math.BigInteger;

/* renamed from: m.d.g.b */
/* compiled from: BigIntegers */
public final class C14081b {
    static {
        BigInteger.valueOf(0);
    }

    /* renamed from: a */
    public static byte[] m44465a(int i, BigInteger bigInteger) {
        byte[] byteArray = bigInteger.toByteArray();
        if (byteArray.length == i) {
            return byteArray;
        }
        int i2 = 0;
        if (byteArray[0] == 0) {
            i2 = 1;
        }
        int length = byteArray.length - i2;
        if (length <= i) {
            byte[] bArr = new byte[i];
            System.arraycopy(byteArray, i2, bArr, bArr.length - length, length);
            return bArr;
        }
        throw new IllegalArgumentException("standard length exceeded for value");
    }

    /* renamed from: a */
    public static BigInteger m44464a(byte[] bArr, int i, int i2) {
        if (!(i == 0 && i2 == bArr.length)) {
            byte[] bArr2 = new byte[i2];
            System.arraycopy(bArr, i, bArr2, 0, i2);
            bArr = bArr2;
        }
        return new BigInteger(1, bArr);
    }
}
