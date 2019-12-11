package p602m.p613d.p662f.p681d.p682a;

/* renamed from: m.d.f.d.a.i */
/* compiled from: PolynomialGF2mSmallM */
public class C14076i {

    /* renamed from: a */
    private C14069b f31098a;

    /* renamed from: b */
    private int f31099b;

    /* renamed from: c */
    private int[] f31100c;

    public C14076i(C14069b bVar, int i) {
        this.f31098a = bVar;
        this.f31099b = i;
        this.f31100c = new int[(i + 1)];
        this.f31100c[i] = 1;
    }

    /* renamed from: b */
    private static int m44417b(int[] iArr) {
        int a = m44414a(iArr);
        if (a == -1) {
            return 0;
        }
        return iArr[a];
    }

    /* renamed from: a */
    public int mo35639a() {
        int[] iArr = this.f31100c;
        int length = iArr.length - 1;
        if (iArr[length] == 0) {
            return -1;
        }
        return length;
    }

    /* renamed from: c */
    public void mo35645c(int i) {
        if (this.f31098a.mo35629c(i)) {
            this.f31100c = m44415a(this.f31100c, i);
            m44420c();
            return;
        }
        throw new ArithmeticException("Not an element of the finite field this polynomial is defined over.");
    }

    /* renamed from: d */
    public C14076i mo35646d(int i) {
        if (this.f31098a.mo35629c(i)) {
            return new C14076i(this.f31098a, m44415a(this.f31100c, i));
        }
        throw new ArithmeticException("Not an element of the finite field this polynomial is defined over.");
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof C14076i)) {
            C14076i iVar = (C14076i) obj;
            if (this.f31098a.equals(iVar.f31098a) && this.f31099b == iVar.f31099b && m44418b(this.f31100c, iVar.f31100c)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.f31098a.hashCode();
        int i = 0;
        while (true) {
            int[] iArr = this.f31100c;
            if (i >= iArr.length) {
                return hashCode;
            }
            hashCode = (hashCode * 31) + iArr[i];
            i++;
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(" Polynomial over ");
        sb.append(this.f31098a.toString());
        sb.append(": \n");
        String sb2 = sb.toString();
        for (int i = 0; i < this.f31100c.length; i++) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(sb2);
            sb3.append(this.f31098a.mo35624a(this.f31100c[i]));
            sb3.append("Y^");
            sb3.append(i);
            sb3.append("+");
            sb2 = sb3.toString();
        }
        StringBuilder sb4 = new StringBuilder();
        sb4.append(sb2);
        sb4.append(";");
        return sb4.toString();
    }

    /* renamed from: a */
    public int mo35640a(int i) {
        int[] iArr = this.f31100c;
        int i2 = this.f31099b;
        int i3 = iArr[i2];
        for (int i4 = i2 - 1; i4 >= 0; i4--) {
            i3 = this.f31098a.mo35628c(i3, i) ^ this.f31100c[i4];
        }
        return i3;
    }

    /* renamed from: b */
    public int mo35642b(int i) {
        if (i < 0 || i > this.f31099b) {
            return 0;
        }
        return this.f31100c[i];
    }

    /* renamed from: c */
    private int[] m44422c(int[] iArr, int[] iArr2) {
        int a = m44414a(iArr2);
        if (a != -1) {
            int[] iArr3 = new int[iArr.length];
            int b = this.f31098a.mo35625b(m44417b(iArr2));
            System.arraycopy(iArr, 0, iArr3, 0, iArr3.length);
            while (a <= m44414a(iArr3)) {
                iArr3 = m44416a(m44415a(m44419b(iArr2, m44414a(iArr3) - a), this.f31098a.mo35628c(m44417b(iArr3), b)), iArr3);
            }
            return iArr3;
        }
        throw new ArithmeticException("Division by zero");
    }

    /* renamed from: a */
    public void mo35641a(C14076i iVar) {
        this.f31100c = m44416a(this.f31100c, iVar.f31100c);
        m44420c();
    }

    /* renamed from: b */
    public byte[] mo35644b() {
        int i = 8;
        int i2 = 1;
        while (this.f31098a.mo35622a() > i) {
            i2++;
            i += 8;
        }
        byte[] bArr = new byte[(this.f31100c.length * i2)];
        int i3 = 0;
        int i4 = 0;
        while (i3 < this.f31100c.length) {
            int i5 = i4;
            int i6 = 0;
            while (i6 < i) {
                int i7 = i5 + 1;
                bArr[i5] = (byte) (this.f31100c[i3] >>> i6);
                i6 += 8;
                i5 = i7;
            }
            i3++;
            i4 = i5;
        }
        return bArr;
    }

    public C14076i(C14069b bVar, int[] iArr) {
        this.f31098a = bVar;
        this.f31100c = m44421c(iArr);
        m44420c();
    }

    /* renamed from: a */
    private int[] m44416a(int[] iArr, int[] iArr2) {
        int[] iArr3;
        if (iArr.length < iArr2.length) {
            iArr3 = new int[iArr2.length];
            System.arraycopy(iArr2, 0, iArr3, 0, iArr2.length);
        } else {
            iArr3 = new int[iArr.length];
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            iArr = iArr2;
        }
        for (int length = iArr.length - 1; length >= 0; length--) {
            iArr3[length] = this.f31098a.mo35623a(iArr3[length], iArr[length]);
        }
        return iArr3;
    }

    /* renamed from: b */
    private static int[] m44419b(int[] iArr, int i) {
        int a = m44414a(iArr);
        if (a == -1) {
            return new int[1];
        }
        int[] iArr2 = new int[(a + i + 1)];
        System.arraycopy(iArr, 0, iArr2, i, a + 1);
        return iArr2;
    }

    public C14076i(C14069b bVar, byte[] bArr) {
        this.f31098a = bVar;
        int i = 8;
        int i2 = 1;
        while (bVar.mo35622a() > i) {
            i2++;
            i += 8;
        }
        String str = " Error: byte array is not encoded polynomial over given finite field GF2m";
        if (bArr.length % i2 == 0) {
            this.f31100c = new int[(bArr.length / i2)];
            int i3 = 0;
            int i4 = 0;
            while (true) {
                int[] iArr = this.f31100c;
                if (i3 < iArr.length) {
                    int i5 = i4;
                    int i6 = 0;
                    while (i6 < i) {
                        int[] iArr2 = this.f31100c;
                        int i7 = i5 + 1;
                        iArr2[i3] = ((bArr[i5] & 255) << i6) ^ iArr2[i3];
                        i6 += 8;
                        i5 = i7;
                    }
                    if (this.f31098a.mo35629c(this.f31100c[i3])) {
                        i3++;
                        i4 = i5;
                    } else {
                        throw new IllegalArgumentException(str);
                    }
                } else if (iArr.length == 1 || iArr[iArr.length - 1] != 0) {
                    m44420c();
                    return;
                } else {
                    throw new IllegalArgumentException(str);
                }
            }
        } else {
            throw new IllegalArgumentException(str);
        }
    }

    /* renamed from: b */
    public C14076i mo35643b(C14076i iVar) {
        return new C14076i(this.f31098a, m44422c(this.f31100c, iVar.f31100c));
    }

    /* renamed from: a */
    private int[] m44415a(int[] iArr, int i) {
        int a = m44414a(iArr);
        if (a == -1 || i == 0) {
            return new int[1];
        }
        if (i == 1) {
            return C14071d.m44402a(iArr);
        }
        int[] iArr2 = new int[(a + 1)];
        while (a >= 0) {
            iArr2[a] = this.f31098a.mo35628c(iArr[a], i);
            a--;
        }
        return iArr2;
    }

    /* renamed from: b */
    private static boolean m44418b(int[] iArr, int[] iArr2) {
        int a = m44414a(iArr);
        if (a != m44414a(iArr2)) {
            return false;
        }
        for (int i = 0; i <= a; i++) {
            if (iArr[i] != iArr2[i]) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: c */
    private void m44420c() {
        this.f31099b = this.f31100c.length - 1;
        while (true) {
            int i = this.f31099b;
            if (i >= 0 && this.f31100c[i] == 0) {
                this.f31099b = i - 1;
            } else {
                return;
            }
        }
    }

    /* renamed from: a */
    private static int m44414a(int[] iArr) {
        int length = iArr.length - 1;
        while (length >= 0 && iArr[length] == 0) {
            length--;
        }
        return length;
    }

    /* renamed from: c */
    private static int[] m44421c(int[] iArr) {
        int a = m44414a(iArr);
        if (a == -1) {
            return new int[1];
        }
        int i = a + 1;
        if (iArr.length == i) {
            return C14071d.m44402a(iArr);
        }
        int[] iArr2 = new int[i];
        System.arraycopy(iArr, 0, iArr2, 0, i);
        return iArr2;
    }

    public C14076i(C14076i iVar) {
        this.f31098a = iVar.f31098a;
        this.f31099b = iVar.f31099b;
        this.f31100c = C14071d.m44402a(iVar.f31100c);
    }
}
