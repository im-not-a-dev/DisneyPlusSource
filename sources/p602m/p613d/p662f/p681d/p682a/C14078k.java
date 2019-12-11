package p602m.p613d.p662f.p681d.p682a;

/* renamed from: m.d.f.d.a.k */
/* compiled from: PolynomialRingGF2m */
public class C14078k {

    /* renamed from: a */
    private C14069b f31101a;

    /* renamed from: b */
    private C14076i f31102b;

    /* renamed from: c */
    protected C14076i[] f31103c;

    /* renamed from: d */
    protected C14076i[] f31104d;

    public C14078k(C14069b bVar, C14076i iVar) {
        this.f31101a = bVar;
        this.f31102b = iVar;
        m44438c();
        m44437b();
    }

    /* renamed from: b */
    private void m44437b() {
        int a = this.f31102b.mo35639a();
        C14076i[] iVarArr = new C14076i[a];
        int i = a - 1;
        for (int i2 = i; i2 >= 0; i2--) {
            iVarArr[i2] = new C14076i(this.f31103c[i2]);
        }
        this.f31104d = new C14076i[a];
        while (i >= 0) {
            this.f31104d[i] = new C14076i(this.f31101a, i);
            i--;
        }
        for (int i3 = 0; i3 < a; i3++) {
            if (iVarArr[i3].mo35642b(i3) == 0) {
                int i4 = i3 + 1;
                boolean z = false;
                while (i4 < a) {
                    if (iVarArr[i4].mo35642b(i3) != 0) {
                        m44436a(iVarArr, i3, i4);
                        m44436a(this.f31104d, i3, i4);
                        i4 = a;
                        z = true;
                    }
                    i4++;
                }
                if (!z) {
                    throw new ArithmeticException("Squaring matrix is not invertible.");
                }
            }
            int b = this.f31101a.mo35625b(iVarArr[i3].mo35642b(i3));
            iVarArr[i3].mo35645c(b);
            this.f31104d[i3].mo35645c(b);
            for (int i5 = 0; i5 < a; i5++) {
                if (i5 != i3) {
                    int b2 = iVarArr[i5].mo35642b(i3);
                    if (b2 != 0) {
                        C14076i d = iVarArr[i3].mo35646d(b2);
                        C14076i d2 = this.f31104d[i3].mo35646d(b2);
                        iVarArr[i5].mo35641a(d);
                        this.f31104d[i5].mo35641a(d2);
                    }
                }
            }
        }
    }

    /* renamed from: c */
    private void m44438c() {
        int i;
        int a = this.f31102b.mo35639a();
        this.f31103c = new C14076i[a];
        int i2 = 0;
        while (true) {
            i = a >> 1;
            if (i2 >= i) {
                break;
            }
            int i3 = i2 << 1;
            int[] iArr = new int[(i3 + 1)];
            iArr[i3] = 1;
            this.f31103c[i2] = new C14076i(this.f31101a, iArr);
            i2++;
        }
        while (i < a) {
            int i4 = i << 1;
            int[] iArr2 = new int[(i4 + 1)];
            iArr2[i4] = 1;
            this.f31103c[i] = new C14076i(this.f31101a, iArr2).mo35643b(this.f31102b);
            i++;
        }
    }

    /* renamed from: a */
    public C14076i[] mo35650a() {
        return this.f31104d;
    }

    /* renamed from: a */
    private static void m44436a(C14076i[] iVarArr, int i, int i2) {
        C14076i iVar = iVarArr[i];
        iVarArr[i] = iVarArr[i2];
        iVarArr[i2] = iVar;
    }
}
