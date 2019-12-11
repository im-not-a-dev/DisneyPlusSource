package p096e.p114f.p115a.p116a;

import java.util.Arrays;

/* renamed from: e.f.a.a.f */
/* compiled from: Oscillator */
public class C3951f {

    /* renamed from: a */
    float[] f9810a = new float[0];

    /* renamed from: b */
    double[] f9811b = new double[0];

    /* renamed from: c */
    double[] f9812c;

    /* renamed from: d */
    int f9813d;

    /* renamed from: e */
    double f9814e = 6.283185307179586d;

    /* renamed from: a */
    public void mo14205a(int i) {
        this.f9813d = i;
    }

    /* renamed from: b */
    public double mo14206b(double d) {
        double abs;
        switch (this.f9813d) {
            case 1:
                return Math.signum(0.5d - (mo14202a(d) % 1.0d));
            case 2:
                abs = Math.abs((((mo14202a(d) * 4.0d) + 1.0d) % 4.0d) - 2.0d);
                break;
            case 3:
                return (((mo14202a(d) * 2.0d) + 1.0d) % 2.0d) - 1.0d;
            case 4:
                abs = ((mo14202a(d) * 2.0d) + 1.0d) % 2.0d;
                break;
            case 5:
                return Math.cos(this.f9814e * mo14202a(d));
            case 6:
                double abs2 = 1.0d - Math.abs(((mo14202a(d) * 4.0d) % 4.0d) - 2.0d);
                abs = abs2 * abs2;
                break;
            default:
                return Math.sin(this.f9814e * mo14202a(d));
        }
        return 1.0d - abs;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("pos =");
        sb.append(Arrays.toString(this.f9811b));
        sb.append(" period=");
        sb.append(Arrays.toString(this.f9810a));
        return sb.toString();
    }

    /* renamed from: a */
    public void mo14204a(double d, float f) {
        int length = this.f9810a.length + 1;
        int binarySearch = Arrays.binarySearch(this.f9811b, d);
        if (binarySearch < 0) {
            binarySearch = (-binarySearch) - 1;
        }
        this.f9811b = Arrays.copyOf(this.f9811b, length);
        this.f9810a = Arrays.copyOf(this.f9810a, length);
        this.f9812c = new double[length];
        double[] dArr = this.f9811b;
        System.arraycopy(dArr, binarySearch, dArr, binarySearch + 1, (length - binarySearch) - 1);
        this.f9811b[binarySearch] = d;
        this.f9810a[binarySearch] = f;
    }

    /* renamed from: a */
    public void mo14203a() {
        double d = 0.0d;
        int i = 0;
        while (true) {
            float[] fArr = this.f9810a;
            if (i >= fArr.length) {
                break;
            }
            d += (double) fArr[i];
            i++;
        }
        int i2 = 1;
        double d2 = 0.0d;
        int i3 = 1;
        while (true) {
            float[] fArr2 = this.f9810a;
            if (i3 >= fArr2.length) {
                break;
            }
            int i4 = i3 - 1;
            float f = (fArr2[i4] + fArr2[i3]) / 2.0f;
            double[] dArr = this.f9811b;
            d2 += (dArr[i3] - dArr[i4]) * ((double) f);
            i3++;
        }
        int i5 = 0;
        while (true) {
            float[] fArr3 = this.f9810a;
            if (i5 >= fArr3.length) {
                break;
            }
            fArr3[i5] = (float) (((double) fArr3[i5]) * (d / d2));
            i5++;
        }
        this.f9812c[0] = 0.0d;
        while (true) {
            float[] fArr4 = this.f9810a;
            if (i2 < fArr4.length) {
                int i6 = i2 - 1;
                float f2 = (fArr4[i6] + fArr4[i2]) / 2.0f;
                double[] dArr2 = this.f9811b;
                double d3 = dArr2[i2] - dArr2[i6];
                double[] dArr3 = this.f9812c;
                dArr3[i2] = dArr3[i6] + (d3 * ((double) f2));
                i2++;
            } else {
                return;
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public double mo14202a(double d) {
        if (d < 0.0d) {
            d = 0.0d;
        } else if (d > 1.0d) {
            d = 1.0d;
        }
        int binarySearch = Arrays.binarySearch(this.f9811b, d);
        if (binarySearch > 0) {
            return 1.0d;
        }
        if (binarySearch == 0) {
            return 0.0d;
        }
        int i = (-binarySearch) - 1;
        float[] fArr = this.f9810a;
        int i2 = i - 1;
        double d2 = (double) (fArr[i] - fArr[i2]);
        double[] dArr = this.f9811b;
        double d3 = d2 / (dArr[i] - dArr[i2]);
        return this.f9812c[i2] + ((((double) fArr[i2]) - (dArr[i2] * d3)) * (d - dArr[i2])) + ((d3 * ((d * d) - (dArr[i2] * dArr[i2]))) / 2.0d);
    }
}
