package p096e.p114f.p115a.p116a;

import java.util.Arrays;

/* renamed from: e.f.a.a.a */
/* compiled from: ArcCurveFit */
class C3943a extends C3945b {

    /* renamed from: a */
    private final double[] f9773a;

    /* renamed from: b */
    C3944a[] f9774b;

    /* renamed from: e.f.a.a.a$a */
    /* compiled from: ArcCurveFit */
    private static class C3944a {

        /* renamed from: s */
        private static double[] f9775s = new double[91];

        /* renamed from: a */
        double[] f9776a;

        /* renamed from: b */
        double f9777b;

        /* renamed from: c */
        double f9778c;

        /* renamed from: d */
        double f9779d;

        /* renamed from: e */
        double f9780e;

        /* renamed from: f */
        double f9781f;

        /* renamed from: g */
        double f9782g;

        /* renamed from: h */
        double f9783h;

        /* renamed from: i */
        double f9784i;

        /* renamed from: j */
        double f9785j;

        /* renamed from: k */
        double f9786k;

        /* renamed from: l */
        double f9787l;

        /* renamed from: m */
        double f9788m;

        /* renamed from: n */
        double f9789n;

        /* renamed from: o */
        double f9790o;

        /* renamed from: p */
        double f9791p;

        /* renamed from: q */
        boolean f9792q;

        /* renamed from: r */
        boolean f9793r = false;

        C3944a(int i, double d, double d2, double d3, double d4, double d5, double d6) {
            int i2 = i;
            double d7 = d3;
            double d8 = d4;
            double d9 = d5;
            double d10 = d6;
            boolean z = false;
            if (i2 == 1) {
                z = true;
            }
            this.f9792q = z;
            this.f9778c = d;
            this.f9779d = d2;
            this.f9784i = 1.0d / (this.f9779d - this.f9778c);
            if (3 == i2) {
                this.f9793r = true;
            }
            double d11 = d9 - d7;
            double d12 = d4;
            double d13 = d10 - d12;
            if (this.f9793r || Math.abs(d11) < 0.001d || Math.abs(d13) < 0.001d) {
                this.f9793r = true;
                this.f9780e = d7;
                this.f9781f = d9;
                this.f9782g = d12;
                this.f9783h = d10;
                this.f9777b = Math.hypot(d13, d11);
                this.f9789n = this.f9777b * this.f9784i;
                double d14 = this.f9779d;
                double d15 = this.f9778c;
                this.f9787l = d11 / (d14 - d15);
                this.f9788m = d13 / (d14 - d15);
                return;
            }
            this.f9776a = new double[101];
            this.f9785j = d11 * ((double) (this.f9792q ? -1 : 1));
            this.f9786k = d13 * ((double) (this.f9792q ? 1 : -1));
            this.f9787l = this.f9792q ? d9 : d7;
            this.f9788m = this.f9792q ? d12 : d10;
            m13272a(d3, d4, d5, d6);
            this.f9789n = this.f9777b * this.f9784i;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public double mo14189a() {
            double d = this.f9785j * this.f9791p;
            double hypot = this.f9789n / Math.hypot(d, (-this.f9786k) * this.f9790o);
            if (this.f9792q) {
                d = -d;
            }
            return d * hypot;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public double mo14191b() {
            double d = (-this.f9786k) * this.f9790o;
            double hypot = this.f9789n / Math.hypot(this.f9785j * this.f9791p, d);
            return this.f9792q ? (-d) * hypot : d * hypot;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public double mo14193c() {
            return this.f9787l + (this.f9785j * this.f9790o);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: d */
        public double mo14195d() {
            return this.f9788m + (this.f9786k * this.f9791p);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: e */
        public double mo14197e(double d) {
            if (d <= 0.0d) {
                return 0.0d;
            }
            if (d >= 1.0d) {
                return 1.0d;
            }
            double[] dArr = this.f9776a;
            double length = d * ((double) (dArr.length - 1));
            int i = (int) length;
            return dArr[i] + ((length - ((double) i)) * (dArr[i + 1] - dArr[i]));
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: f */
        public void mo14198f(double d) {
            double e = mo14197e((this.f9792q ? this.f9779d - d : d - this.f9778c) * this.f9784i) * 1.5707963267948966d;
            this.f9790o = Math.sin(e);
            this.f9791p = Math.cos(e);
        }

        /* renamed from: c */
        public double mo14194c(double d) {
            double d2 = (d - this.f9778c) * this.f9784i;
            double d3 = this.f9780e;
            return d3 + (d2 * (this.f9781f - d3));
        }

        /* renamed from: d */
        public double mo14196d(double d) {
            double d2 = (d - this.f9778c) * this.f9784i;
            double d3 = this.f9782g;
            return d3 + (d2 * (this.f9783h - d3));
        }

        /* renamed from: a */
        public double mo14190a(double d) {
            return this.f9787l;
        }

        /* renamed from: b */
        public double mo14192b(double d) {
            return this.f9788m;
        }

        /* renamed from: a */
        private void m13272a(double d, double d2, double d3, double d4) {
            double d5;
            double d6 = d3 - d;
            double d7 = d2 - d4;
            int i = 0;
            double d8 = 0.0d;
            double d9 = 0.0d;
            double d10 = 0.0d;
            while (true) {
                double[] dArr = f9775s;
                if (i >= dArr.length) {
                    break;
                }
                double d11 = d8;
                double radians = Math.toRadians((((double) i) * 90.0d) / ((double) (dArr.length - 1)));
                double sin = Math.sin(radians) * d6;
                double cos = Math.cos(radians) * d7;
                if (i > 0) {
                    d5 = d11 + Math.hypot(sin - d9, cos - d10);
                    f9775s[i] = d5;
                } else {
                    d5 = d11;
                }
                i++;
                d10 = cos;
                double d12 = sin;
                d8 = d5;
                d9 = d12;
            }
            double d13 = d8;
            this.f9777b = d13;
            int i2 = 0;
            while (true) {
                double[] dArr2 = f9775s;
                if (i2 >= dArr2.length) {
                    break;
                }
                dArr2[i2] = dArr2[i2] / d13;
                i2++;
            }
            int i3 = 0;
            while (true) {
                double[] dArr3 = this.f9776a;
                if (i3 < dArr3.length) {
                    double length = ((double) i3) / ((double) (dArr3.length - 1));
                    int binarySearch = Arrays.binarySearch(f9775s, length);
                    if (binarySearch >= 0) {
                        this.f9776a[i3] = (double) (binarySearch / (f9775s.length - 1));
                    } else if (binarySearch == -1) {
                        this.f9776a[i3] = 0.0d;
                    } else {
                        int i4 = -binarySearch;
                        int i5 = i4 - 2;
                        int i6 = i4 - 1;
                        double d14 = (double) i5;
                        double[] dArr4 = f9775s;
                        this.f9776a[i3] = (d14 + ((length - dArr4[i5]) / (dArr4[i6] - dArr4[i5]))) / ((double) (dArr4.length - 1));
                    }
                    i3++;
                } else {
                    return;
                }
            }
        }
    }

    public C3943a(int[] iArr, double[] dArr, double[][] dArr2) {
        double[] dArr3 = dArr;
        this.f9773a = dArr3;
        this.f9774b = new C3944a[(dArr3.length - 1)];
        int i = 0;
        int i2 = 1;
        int i3 = 1;
        while (i < this.f9774b.length) {
            int i4 = iArr[i];
            int i5 = 2;
            if (i4 == 0) {
                i5 = 3;
            } else if (i4 == 1) {
                i2 = 1;
                i5 = 1;
            } else if (i4 == 2) {
                i2 = 2;
            } else if (i4 != 3) {
                i5 = i3;
            } else {
                if (i2 != 1) {
                    i5 = 1;
                }
                i2 = i5;
            }
            C3944a[] aVarArr = this.f9774b;
            int i6 = i + 1;
            C3944a aVar = new C3944a(i5, dArr3[i], dArr3[i6], dArr2[i][0], dArr2[i][1], dArr2[i6][0], dArr2[i6][1]);
            aVarArr[i] = aVar;
            i = i6;
            i3 = i5;
        }
    }

    /* renamed from: a */
    public void mo14185a(double d, double[] dArr) {
        C3944a[] aVarArr = this.f9774b;
        if (d < aVarArr[0].f9778c) {
            d = aVarArr[0].f9778c;
        }
        C3944a[] aVarArr2 = this.f9774b;
        if (d > aVarArr2[aVarArr2.length - 1].f9779d) {
            d = aVarArr2[aVarArr2.length - 1].f9779d;
        }
        int i = 0;
        while (true) {
            C3944a[] aVarArr3 = this.f9774b;
            if (i >= aVarArr3.length) {
                return;
            }
            if (d > aVarArr3[i].f9779d) {
                i++;
            } else if (aVarArr3[i].f9793r) {
                dArr[0] = aVarArr3[i].mo14194c(d);
                dArr[1] = this.f9774b[i].mo14196d(d);
                return;
            } else {
                aVarArr3[i].mo14198f(d);
                dArr[0] = this.f9774b[i].mo14193c();
                dArr[1] = this.f9774b[i].mo14195d();
                return;
            }
        }
    }

    /* renamed from: b */
    public void mo14188b(double d, double[] dArr) {
        C3944a[] aVarArr = this.f9774b;
        if (d < aVarArr[0].f9778c) {
            d = aVarArr[0].f9778c;
        } else if (d > aVarArr[aVarArr.length - 1].f9779d) {
            d = aVarArr[aVarArr.length - 1].f9779d;
        }
        int i = 0;
        while (true) {
            C3944a[] aVarArr2 = this.f9774b;
            if (i >= aVarArr2.length) {
                return;
            }
            if (d > aVarArr2[i].f9779d) {
                i++;
            } else if (aVarArr2[i].f9793r) {
                dArr[0] = aVarArr2[i].mo14190a(d);
                dArr[1] = this.f9774b[i].mo14192b(d);
                return;
            } else {
                aVarArr2[i].mo14198f(d);
                dArr[0] = this.f9774b[i].mo14189a();
                dArr[1] = this.f9774b[i].mo14191b();
                return;
            }
        }
    }

    /* renamed from: a */
    public void mo14186a(double d, float[] fArr) {
        C3944a[] aVarArr = this.f9774b;
        if (d < aVarArr[0].f9778c) {
            d = aVarArr[0].f9778c;
        } else if (d > aVarArr[aVarArr.length - 1].f9779d) {
            d = aVarArr[aVarArr.length - 1].f9779d;
        }
        int i = 0;
        while (true) {
            C3944a[] aVarArr2 = this.f9774b;
            if (i >= aVarArr2.length) {
                return;
            }
            if (d > aVarArr2[i].f9779d) {
                i++;
            } else if (aVarArr2[i].f9793r) {
                fArr[0] = (float) aVarArr2[i].mo14194c(d);
                fArr[1] = (float) this.f9774b[i].mo14196d(d);
                return;
            } else {
                aVarArr2[i].mo14198f(d);
                fArr[0] = (float) this.f9774b[i].mo14193c();
                fArr[1] = (float) this.f9774b[i].mo14195d();
                return;
            }
        }
    }

    /* renamed from: a */
    public double mo14184a(double d, int i) {
        C3944a[] aVarArr = this.f9774b;
        int i2 = 0;
        if (d < aVarArr[0].f9778c) {
            d = aVarArr[0].f9778c;
        } else if (d > aVarArr[aVarArr.length - 1].f9779d) {
            d = aVarArr[aVarArr.length - 1].f9779d;
        }
        while (true) {
            C3944a[] aVarArr2 = this.f9774b;
            if (i2 >= aVarArr2.length) {
                return Double.NaN;
            }
            if (d > aVarArr2[i2].f9779d) {
                i2++;
            } else if (!aVarArr2[i2].f9793r) {
                aVarArr2[i2].mo14198f(d);
                if (i == 0) {
                    return this.f9774b[i2].mo14193c();
                }
                return this.f9774b[i2].mo14195d();
            } else if (i == 0) {
                return aVarArr2[i2].mo14194c(d);
            } else {
                return aVarArr2[i2].mo14196d(d);
            }
        }
    }

    /* renamed from: a */
    public double[] mo14187a() {
        return this.f9773a;
    }
}
