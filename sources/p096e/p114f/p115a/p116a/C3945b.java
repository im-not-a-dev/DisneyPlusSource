package p096e.p114f.p115a.p116a;

/* renamed from: e.f.a.a.b */
/* compiled from: CurveFit */
public abstract class C3945b {

    /* renamed from: e.f.a.a.b$a */
    /* compiled from: CurveFit */
    static class C3946a extends C3945b {

        /* renamed from: a */
        double f9794a;

        /* renamed from: b */
        double[] f9795b;

        C3946a(double d, double[] dArr) {
            this.f9794a = d;
            this.f9795b = dArr;
        }

        /* renamed from: a */
        public void mo14185a(double d, double[] dArr) {
            double[] dArr2 = this.f9795b;
            System.arraycopy(dArr2, 0, dArr, 0, dArr2.length);
        }

        /* renamed from: b */
        public void mo14188b(double d, double[] dArr) {
            for (int i = 0; i < this.f9795b.length; i++) {
                dArr[i] = 0.0d;
            }
        }

        /* renamed from: a */
        public void mo14186a(double d, float[] fArr) {
            int i = 0;
            while (true) {
                double[] dArr = this.f9795b;
                if (i < dArr.length) {
                    fArr[i] = (float) dArr[i];
                    i++;
                } else {
                    return;
                }
            }
        }

        /* renamed from: a */
        public double mo14184a(double d, int i) {
            return this.f9795b[i];
        }

        /* renamed from: a */
        public double[] mo14187a() {
            return new double[]{this.f9794a};
        }
    }

    /* renamed from: a */
    public static C3945b m13283a(int i, double[] dArr, double[][] dArr2) {
        if (dArr.length == 1) {
            i = 2;
        }
        if (i == 0) {
            return new C3950e(dArr, dArr2);
        }
        if (i != 2) {
            return new C3949d(dArr, dArr2);
        }
        return new C3946a(dArr[0], dArr2[0]);
    }

    /* renamed from: a */
    public abstract double mo14184a(double d, int i);

    /* renamed from: a */
    public abstract void mo14185a(double d, double[] dArr);

    /* renamed from: a */
    public abstract void mo14186a(double d, float[] fArr);

    /* renamed from: a */
    public abstract double[] mo14187a();

    /* renamed from: b */
    public abstract void mo14188b(double d, double[] dArr);

    /* renamed from: a */
    public static C3945b m13284a(int[] iArr, double[] dArr, double[][] dArr2) {
        return new C3943a(iArr, dArr, dArr2);
    }
}
