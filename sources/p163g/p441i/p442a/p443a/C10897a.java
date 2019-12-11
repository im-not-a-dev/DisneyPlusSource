package p163g.p441i.p442a.p443a;

import java.io.Serializable;
import java.util.Arrays;

/* renamed from: g.i.a.a.a */
/* compiled from: Base64Variant */
public final class C10897a implements Serializable {

    /* renamed from: U */
    private final transient char[] f25828U;

    /* renamed from: V */
    private final transient byte[] f25829V;

    /* renamed from: W */
    final String f25830W;

    /* renamed from: X */
    private final transient boolean f25831X;

    /* renamed from: Y */
    private final transient char f25832Y;

    /* renamed from: Z */
    private final transient int f25833Z;

    /* renamed from: c */
    private final transient int[] f25834c;

    public C10897a(String str, String str2, boolean z, char c, int i) {
        this.f25834c = new int[128];
        this.f25828U = new char[64];
        this.f25829V = new byte[64];
        this.f25830W = str;
        this.f25831X = z;
        this.f25832Y = c;
        this.f25833Z = i;
        int length = str2.length();
        if (length == 64) {
            str2.getChars(0, length, this.f25828U, 0);
            Arrays.fill(this.f25834c, -1);
            for (int i2 = 0; i2 < length; i2++) {
                char c2 = this.f25828U[i2];
                this.f25829V[i2] = (byte) c2;
                this.f25834c[c2] = i2;
            }
            if (z) {
                this.f25834c[c] = -2;
                return;
            }
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Base64Alphabet length must be exactly 64 (was ");
        sb.append(length);
        sb.append(")");
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: a */
    public int mo28015a() {
        return this.f25833Z;
    }

    public boolean equals(Object obj) {
        return obj == this;
    }

    public int hashCode() {
        return this.f25830W.hashCode();
    }

    public String toString() {
        return this.f25830W;
    }

    /* renamed from: a */
    public int mo28019a(int i, char[] cArr, int i2) {
        int i3 = i2 + 1;
        char[] cArr2 = this.f25828U;
        cArr[i2] = cArr2[(i >> 18) & 63];
        int i4 = i3 + 1;
        cArr[i3] = cArr2[(i >> 12) & 63];
        int i5 = i4 + 1;
        cArr[i4] = cArr2[(i >> 6) & 63];
        int i6 = i5 + 1;
        cArr[i5] = cArr2[i & 63];
        return i6;
    }

    /* renamed from: a */
    public int mo28017a(int i, int i2, char[] cArr, int i3) {
        int i4 = i3 + 1;
        char[] cArr2 = this.f25828U;
        cArr[i3] = cArr2[(i >> 18) & 63];
        int i5 = i4 + 1;
        cArr[i4] = cArr2[(i >> 12) & 63];
        if (this.f25831X) {
            int i6 = i5 + 1;
            cArr[i5] = i2 == 2 ? cArr2[(i >> 6) & 63] : this.f25832Y;
            int i7 = i6 + 1;
            cArr[i6] = this.f25832Y;
            return i7;
        } else if (i2 != 2) {
            return i5;
        } else {
            int i8 = i5 + 1;
            cArr[i5] = cArr2[(i >> 6) & 63];
            return i8;
        }
    }

    /* renamed from: a */
    public int mo28018a(int i, byte[] bArr, int i2) {
        int i3 = i2 + 1;
        byte[] bArr2 = this.f25829V;
        bArr[i2] = bArr2[(i >> 18) & 63];
        int i4 = i3 + 1;
        bArr[i3] = bArr2[(i >> 12) & 63];
        int i5 = i4 + 1;
        bArr[i4] = bArr2[(i >> 6) & 63];
        int i6 = i5 + 1;
        bArr[i5] = bArr2[i & 63];
        return i6;
    }

    /* renamed from: a */
    public int mo28016a(int i, int i2, byte[] bArr, int i3) {
        int i4 = i3 + 1;
        byte[] bArr2 = this.f25829V;
        bArr[i3] = bArr2[(i >> 18) & 63];
        int i5 = i4 + 1;
        bArr[i4] = bArr2[(i >> 12) & 63];
        if (this.f25831X) {
            byte b = (byte) this.f25832Y;
            int i6 = i5 + 1;
            bArr[i5] = i2 == 2 ? bArr2[(i >> 6) & 63] : b;
            int i7 = i6 + 1;
            bArr[i6] = b;
            return i7;
        } else if (i2 != 2) {
            return i5;
        } else {
            int i8 = i5 + 1;
            bArr[i5] = bArr2[(i >> 6) & 63];
            return i8;
        }
    }

    public C10897a(C10897a aVar, String str, int i) {
        this(aVar, str, aVar.f25831X, aVar.f25832Y, i);
    }

    public C10897a(C10897a aVar, String str, boolean z, char c, int i) {
        this.f25834c = new int[128];
        this.f25828U = new char[64];
        this.f25829V = new byte[64];
        this.f25830W = str;
        byte[] bArr = aVar.f25829V;
        System.arraycopy(bArr, 0, this.f25829V, 0, bArr.length);
        char[] cArr = aVar.f25828U;
        System.arraycopy(cArr, 0, this.f25828U, 0, cArr.length);
        int[] iArr = aVar.f25834c;
        System.arraycopy(iArr, 0, this.f25834c, 0, iArr.length);
        this.f25831X = z;
        this.f25832Y = c;
        this.f25833Z = i;
    }
}
