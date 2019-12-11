package p602m.p613d.p662f.p681d.p682a;

import java.lang.reflect.Array;

/* renamed from: m.d.f.d.a.a */
/* compiled from: GF2Matrix */
public class C14068a extends C14074g {

    /* renamed from: c */
    private int[][] f31091c;

    /* renamed from: d */
    private int f31092d;

    public C14068a(byte[] bArr) {
        String str = "given array is not an encoded matrix over GF(2)";
        if (bArr.length >= 9) {
            this.f31095a = C14073f.m44405a(bArr, 0);
            this.f31096b = C14073f.m44405a(bArr, 4);
            int i = this.f31096b;
            int i2 = (i + 7) >>> 3;
            int i3 = this.f31095a;
            int i4 = i2 * i3;
            if (i3 > 0) {
                int i5 = 8;
                if (i4 == bArr.length - 8) {
                    this.f31092d = (i + 31) >>> 5;
                    this.f31091c = (int[][]) Array.newInstance(int.class, new int[]{i3, this.f31092d});
                    int i6 = this.f31096b;
                    int i7 = i6 >> 5;
                    int i8 = i6 & 31;
                    for (int i9 = 0; i9 < this.f31095a; i9++) {
                        int i10 = 0;
                        while (i10 < i7) {
                            this.f31091c[i9][i10] = C14073f.m44405a(bArr, i5);
                            i10++;
                            i5 += 4;
                        }
                        int i11 = 0;
                        while (i11 < i8) {
                            int[] iArr = this.f31091c[i9];
                            int i12 = i5 + 1;
                            iArr[i7] = ((bArr[i5] & 255) << i11) ^ iArr[i7];
                            i11 += 8;
                            i5 = i12;
                        }
                    }
                    return;
                }
            }
            throw new ArithmeticException(str);
        }
        throw new ArithmeticException(str);
    }

    /* renamed from: c */
    public byte[] mo35618c() {
        int i = (this.f31096b + 7) >>> 3;
        int i2 = this.f31095a;
        byte[] bArr = new byte[((i * i2) + 8)];
        C14073f.m44407a(i2, bArr, 0);
        C14073f.m44407a(this.f31096b, bArr, 4);
        int i3 = this.f31096b;
        int i4 = i3 >>> 5;
        int i5 = i3 & 31;
        int i6 = 0;
        int i7 = 8;
        while (i6 < this.f31095a) {
            int i8 = i7;
            int i9 = 0;
            while (i9 < i4) {
                C14073f.m44407a(this.f31091c[i6][i9], bArr, i8);
                i9++;
                i8 += 4;
            }
            int i10 = 0;
            while (i10 < i5) {
                int i11 = i8 + 1;
                bArr[i8] = (byte) ((this.f31091c[i6][i4] >>> i10) & 255);
                i10 += 8;
                i8 = i11;
            }
            i6++;
            i7 = i8;
        }
        return bArr;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C14068a)) {
            return false;
        }
        C14068a aVar = (C14068a) obj;
        if (this.f31095a != aVar.f31095a || this.f31096b != aVar.f31096b || this.f31092d != aVar.f31092d) {
            return false;
        }
        for (int i = 0; i < this.f31095a; i++) {
            if (!C14071d.m44401a(this.f31091c[i], aVar.f31091c[i])) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int i = (((this.f31095a * 31) + this.f31096b) * 31) + this.f31092d;
        for (int i2 = 0; i2 < this.f31095a; i2++) {
            i = (i * 31) + this.f31091c[i2].hashCode();
        }
        return i;
    }

    public String toString() {
        int i;
        int i2 = this.f31096b & 31;
        if (i2 == 0) {
            i = this.f31092d;
        } else {
            i = this.f31092d - 1;
        }
        StringBuffer stringBuffer = new StringBuffer();
        for (int i3 = 0; i3 < this.f31095a; i3++) {
            StringBuilder sb = new StringBuilder();
            sb.append(i3);
            sb.append(": ");
            stringBuffer.append(sb.toString());
            for (int i4 = 0; i4 < i; i4++) {
                int i5 = this.f31091c[i3][i4];
                for (int i6 = 0; i6 < 32; i6++) {
                    if (((i5 >>> i6) & 1) == 0) {
                        stringBuffer.append('0');
                    } else {
                        stringBuffer.append('1');
                    }
                }
                stringBuffer.append(' ');
            }
            int i7 = this.f31091c[i3][this.f31092d - 1];
            for (int i8 = 0; i8 < i2; i8++) {
                if (((i7 >>> i8) & 1) == 0) {
                    stringBuffer.append('0');
                } else {
                    stringBuffer.append('1');
                }
            }
            stringBuffer.append(10);
        }
        return stringBuffer.toString();
    }

    public C14068a(int i, int[][] iArr) {
        if (iArr[0].length == ((i + 31) >> 5)) {
            this.f31096b = i;
            this.f31095a = iArr.length;
            this.f31092d = iArr[0].length;
            int i2 = i & 31;
            int i3 = i2 == 0 ? -1 : (1 << i2) - 1;
            for (int i4 = 0; i4 < this.f31095a; i4++) {
                int[] iArr2 = iArr[i4];
                int i5 = this.f31092d - 1;
                iArr2[i5] = iArr2[i5] & i3;
            }
            this.f31091c = iArr;
            return;
        }
        throw new ArithmeticException("Int array does not match given number of columns.");
    }

    public C14068a(C14068a aVar) {
        this.f31096b = aVar.mo35633a();
        this.f31095a = aVar.mo35634b();
        this.f31092d = aVar.f31092d;
        this.f31091c = new int[aVar.f31091c.length][];
        int i = 0;
        while (true) {
            int[][] iArr = this.f31091c;
            if (i < iArr.length) {
                iArr[i] = C14071d.m44402a(aVar.f31091c[i]);
                i++;
            } else {
                return;
            }
        }
    }
}
