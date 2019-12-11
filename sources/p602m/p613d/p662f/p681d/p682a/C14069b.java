package p602m.p613d.p662f.p681d.p682a;

/* renamed from: m.d.f.d.a.b */
/* compiled from: GF2mField */
public class C14069b {

    /* renamed from: a */
    private int f31093a = 0;

    /* renamed from: b */
    private int f31094b;

    public C14069b(byte[] bArr) {
        String str = "byte array is not an encoded finite field";
        if (bArr.length == 4) {
            this.f31094b = C14073f.m44404a(bArr);
            if (C14077j.m44435b(this.f31094b)) {
                this.f31093a = C14077j.m44431a(this.f31094b);
                return;
            }
            throw new IllegalArgumentException(str);
        }
        throw new IllegalArgumentException(str);
    }

    /* renamed from: d */
    private static String m44391d(int i) {
        if (i == 0) {
            return "0";
        }
        String str = ((byte) (i & 1)) == 1 ? "1" : "";
        int i2 = i >>> 1;
        int i3 = 1;
        while (i2 != 0) {
            if (((byte) (i2 & 1)) == 1) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append("+x^");
                sb.append(i3);
                str = sb.toString();
            }
            i2 >>>= 1;
            i3++;
        }
        return str;
    }

    /* renamed from: a */
    public int mo35622a() {
        return this.f31093a;
    }

    /* renamed from: a */
    public int mo35623a(int i, int i2) {
        return i ^ i2;
    }

    /* renamed from: b */
    public byte[] mo35627b() {
        return C14073f.m44409a(this.f31094b);
    }

    /* renamed from: c */
    public int mo35628c(int i, int i2) {
        return C14077j.m44433a(i, i2, this.f31094b);
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof C14069b)) {
            C14069b bVar = (C14069b) obj;
            if (this.f31093a == bVar.f31093a && this.f31094b == bVar.f31094b) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return this.f31094b;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Finite Field GF(2^");
        sb.append(this.f31093a);
        sb.append(") = GF(2)[X]/<");
        sb.append(m44391d(this.f31094b));
        sb.append("> ");
        return sb.toString();
    }

    /* renamed from: a */
    public String mo35624a(int i) {
        String str = "";
        for (int i2 = 0; i2 < this.f31093a; i2++) {
            if ((((byte) i) & 1) == 0) {
                StringBuilder sb = new StringBuilder();
                sb.append("0");
                sb.append(str);
                str = sb.toString();
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("1");
                sb2.append(str);
                str = sb2.toString();
            }
            i >>>= 1;
        }
        return str;
    }

    /* renamed from: b */
    public int mo35626b(int i, int i2) {
        if (i2 == 0) {
            return 1;
        }
        if (i == 0) {
            return 0;
        }
        if (i == 1) {
            return 1;
        }
        if (i2 < 0) {
            i = mo35625b(i);
            i2 = -i2;
        }
        int i3 = i;
        int i4 = 1;
        while (i2 != 0) {
            if ((i2 & 1) == 1) {
                i4 = mo35628c(i4, i3);
            }
            i3 = mo35628c(i3, i3);
            i2 >>>= 1;
        }
        return i4;
    }

    /* renamed from: c */
    public boolean mo35629c(int i) {
        int i2 = this.f31093a;
        boolean z = false;
        if (i2 == 31) {
            if (i >= 0) {
                z = true;
            }
            return z;
        }
        if (i >= 0 && i < (1 << i2)) {
            z = true;
        }
        return z;
    }

    /* renamed from: b */
    public int mo35625b(int i) {
        return mo35626b(i, (1 << this.f31093a) - 2);
    }
}
