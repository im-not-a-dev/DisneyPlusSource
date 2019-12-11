package androidx.constraintlayout.motion.widget;

import android.os.Build.VERSION;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import androidx.constraintlayout.widget.C0418a;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.text.DecimalFormat;
import p096e.p114f.p115a.p116a.C3945b;

/* renamed from: androidx.constraintlayout.motion.widget.v */
/* compiled from: SpringSplineSet */
public abstract class C0378v {
    /* access modifiers changed from: private */

    /* renamed from: r */
    public static int f1672r = 4;

    /* renamed from: a */
    protected C3945b f1673a;

    /* renamed from: b */
    private int f1674b = 0;

    /* renamed from: c */
    private boolean f1675c = false;

    /* renamed from: d */
    protected int[] f1676d = new int[10];

    /* renamed from: e */
    protected int[] f1677e = new int[10];

    /* renamed from: f */
    protected float[][] f1678f;

    /* renamed from: g */
    protected float[][] f1679g;

    /* renamed from: h */
    private int f1680h;

    /* renamed from: i */
    private String f1681i;

    /* renamed from: j */
    private float[] f1682j;

    /* renamed from: k */
    float f1683k;

    /* renamed from: l */
    float f1684l;

    /* renamed from: m */
    protected boolean f1685m;

    /* renamed from: n */
    long f1686n;

    /* renamed from: o */
    C0390l f1687o;

    /* renamed from: p */
    float f1688p;

    /* renamed from: q */
    float f1689q;

    /* renamed from: androidx.constraintlayout.motion.widget.v$a */
    /* compiled from: SpringSplineSet */
    static class C0379a extends C0378v {
        C0379a() {
        }

        /* renamed from: a */
        public boolean mo2310a(View view, float f, long j) {
            mo2308a(view);
            view.setAlpha(mo2305a(f, j));
            return this.f1685m;
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.v$b */
    /* compiled from: SpringSplineSet */
    static class C0380b extends C0378v {

        /* renamed from: s */
        SparseArray<C0418a> f1690s;

        /* renamed from: t */
        SparseArray<float[]> f1691t = new SparseArray<>();

        /* renamed from: u */
        float[] f1692u;

        /* renamed from: v */
        float[] f1693v;

        public C0380b(String str, SparseArray<C0418a> sparseArray) {
            String str2 = str.split(",")[1];
            this.f1690s = sparseArray;
        }

        /* renamed from: a */
        public void mo2306a(int i) {
            int size = this.f1690s.size();
            int c = ((C0418a) this.f1690s.valueAt(0)).mo2397c();
            double[] dArr = new double[size];
            this.f1692u = new float[(C0378v.f1672r + c)];
            this.f1693v = new float[c];
            double[][] dArr2 = (double[][]) Array.newInstance(double.class, new int[]{size, C0378v.f1672r + c});
            for (int i2 = 0; i2 < size; i2++) {
                C0418a aVar = (C0418a) this.f1690s.valueAt(i2);
                float[] fArr = (float[]) this.f1691t.valueAt(i2);
                dArr[i2] = ((double) this.f1690s.keyAt(i2)) * 0.01d;
                aVar.mo2395a(this.f1692u);
                int i3 = 0;
                while (true) {
                    float[] fArr2 = this.f1692u;
                    if (i3 >= fArr2.length) {
                        break;
                    }
                    dArr2[i2][i3] = (double) fArr2[i3];
                    i3++;
                }
                dArr2[i2][c] = (double) fArr[0];
                dArr2[i2][c + 1] = (double) fArr[1];
            }
            this.f1673a = C3945b.m13283a(i, dArr, dArr2);
        }

        /* renamed from: a */
        public void mo2312a(int i, C0418a aVar, float f, float f2, float f3, int i2, boolean z, float f4) {
            this.f1690s.append(i, aVar);
            this.f1691t.append(i, new float[]{f, f2, f4, f3});
        }

        /* renamed from: a */
        public boolean mo2310a(View view, float f, long j) {
            mo2308a(view);
            this.f1673a.mo14186a((double) f, this.f1692u);
            float[] fArr = this.f1692u;
            float f2 = fArr[fArr.length - 4];
            float f3 = fArr[fArr.length - 2];
            float f4 = fArr[fArr.length - 1];
            float f5 = fArr[fArr.length - 3];
            this.f1688p = (float) ((((double) this.f1688p) + ((((double) (j - this.f1686n)) * 1.0E-9d) * ((double) f4))) % 1.0d);
            this.f1686n = j;
            float f6 = this.f1688p;
            this.f1685m = false;
            for (int i = 0; i < this.f1693v.length; i++) {
                this.f1685m |= ((double) this.f1692u[i]) != 0.0d;
                this.f1693v[i] = (this.f1692u[i] * f6) + f5;
            }
            ((C0418a) this.f1690s.valueAt(0)).mo2393a(view, this.f1693v);
            if (f4 != 0.0f) {
                this.f1685m = true;
            }
            return this.f1685m;
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.v$c */
    /* compiled from: SpringSplineSet */
    static class C0381c extends C0378v {
        C0381c() {
        }

        /* renamed from: a */
        public boolean mo2310a(View view, float f, long j) {
            mo2308a(view);
            if (VERSION.SDK_INT >= 21) {
                view.setElevation(mo2305a(f, j));
            }
            return this.f1685m;
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.v$d */
    /* compiled from: SpringSplineSet */
    static class C0382d extends C0378v {
        C0382d() {
        }

        /* renamed from: a */
        public boolean mo2310a(View view, float f, long j) {
            return this.f1685m;
        }

        /* renamed from: a */
        public boolean mo2313a(View view, float f, long j, double d, double d2) {
            mo2308a(view);
            view.setRotation(mo2305a(f, j) + ((float) Math.toDegrees(Math.atan2(d2, d))));
            return this.f1685m;
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.v$e */
    /* compiled from: SpringSplineSet */
    static class C0383e extends C0378v {

        /* renamed from: s */
        boolean f1694s = false;

        C0383e() {
        }

        /* renamed from: a */
        public boolean mo2310a(View view, float f, long j) {
            String str = "unable to setProgress";
            String str2 = "SpringSet";
            if (view instanceof MotionLayout) {
                ((MotionLayout) view).setProgress(mo2305a(f, j));
            } else if (this.f1694s) {
                return false;
            } else {
                Method method = null;
                try {
                    method = view.getClass().getMethod("setProgress", new Class[]{Float.TYPE});
                } catch (NoSuchMethodException unused) {
                    this.f1694s = true;
                }
                if (method != null) {
                    try {
                        method.invoke(view, new Object[]{Float.valueOf(mo2305a(f, j))});
                    } catch (IllegalAccessException e) {
                        Log.e(str2, str, e);
                    } catch (InvocationTargetException e2) {
                        Log.e(str2, str, e2);
                    }
                }
            }
            return this.f1685m;
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.v$f */
    /* compiled from: SpringSplineSet */
    static class C0384f extends C0378v {
        C0384f() {
        }

        /* renamed from: a */
        public boolean mo2310a(View view, float f, long j) {
            mo2308a(view);
            view.setRotation(mo2305a(f, j));
            return this.f1685m;
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.v$g */
    /* compiled from: SpringSplineSet */
    static class C0385g extends C0378v {
        C0385g() {
        }

        /* renamed from: a */
        public boolean mo2310a(View view, float f, long j) {
            mo2308a(view);
            view.setRotationX(mo2305a(f, j));
            return this.f1685m;
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.v$h */
    /* compiled from: SpringSplineSet */
    static class C0386h extends C0378v {
        C0386h() {
        }

        /* renamed from: a */
        public boolean mo2310a(View view, float f, long j) {
            mo2308a(view);
            view.setRotationY(mo2305a(f, j));
            return this.f1685m;
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.v$i */
    /* compiled from: SpringSplineSet */
    static class C0387i extends C0378v {
        C0387i() {
        }

        /* renamed from: a */
        public boolean mo2310a(View view, float f, long j) {
            mo2308a(view);
            view.setScaleX(mo2305a(f, j));
            return this.f1685m;
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.v$j */
    /* compiled from: SpringSplineSet */
    static class C0388j extends C0378v {
        C0388j() {
        }

        /* renamed from: a */
        public boolean mo2310a(View view, float f, long j) {
            mo2308a(view);
            view.setScaleY(mo2305a(f, j));
            return this.f1685m;
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.v$k */
    /* compiled from: SpringSplineSet */
    private static class C0389k {
        /* renamed from: a */
        static void m2182a(int[] iArr, float[][] fArr, int i, int i2) {
            int[] iArr2 = new int[(iArr.length + 10)];
            iArr2[0] = i2;
            iArr2[1] = i;
            int i3 = 2;
            while (i3 > 0) {
                int i4 = i3 - 1;
                int i5 = iArr2[i4];
                i3 = i4 - 1;
                int i6 = iArr2[i3];
                if (i5 < i6) {
                    int b = m2183b(iArr, fArr, i5, i6);
                    int i7 = i3 + 1;
                    iArr2[i3] = b - 1;
                    int i8 = i7 + 1;
                    iArr2[i7] = i5;
                    int i9 = i8 + 1;
                    iArr2[i8] = i6;
                    i3 = i9 + 1;
                    iArr2[i9] = b + 1;
                }
            }
        }

        /* renamed from: b */
        private static int m2183b(int[] iArr, float[][] fArr, int i, int i2) {
            int i3 = iArr[i2];
            int i4 = i;
            while (i < i2) {
                if (iArr[i] <= i3) {
                    m2184c(iArr, fArr, i4, i);
                    i4++;
                }
                i++;
            }
            m2184c(iArr, fArr, i4, i2);
            return i4;
        }

        /* renamed from: c */
        private static void m2184c(int[] iArr, float[][] fArr, int i, int i2) {
            int i3 = iArr[i];
            iArr[i] = iArr[i2];
            iArr[i2] = i3;
            float[] fArr2 = fArr[i];
            fArr[i] = fArr[i2];
            fArr[i2] = fArr2;
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.v$l */
    /* compiled from: SpringSplineSet */
    static class C0390l {

        /* renamed from: a */
        double f1695a = 0.1d;

        /* renamed from: b */
        double f1696b = 0.0d;

        /* renamed from: c */
        double f1697c = 1.0d;

        /* renamed from: d */
        double f1698d;

        /* renamed from: e */
        double f1699e = 1.5d;

        /* renamed from: a */
        public void mo2315a(double d) {
            this.f1699e = Math.log(18.6d / d);
        }

        /* renamed from: b */
        public void mo2318b(double d) {
            double d2 = d * 6.283185307179586d;
            this.f1698d = (double) ((float) (d2 * d2 * this.f1697c));
        }

        /* renamed from: c */
        public void mo2319c(double d) {
            double d2 = this.f1698d;
            double d3 = this.f1695a;
            double d4 = ((d2 * d3) * d3) / 2.0d;
            double d5 = this.f1697c;
            double d6 = this.f1696b;
            double d7 = ((d5 * d6) * d6) / 2.0d;
            double d8 = d4;
            double d9 = (-d2) * (d3 - ((d * d6) / 2.0d));
            double d10 = this.f1699e;
            double d11 = (double) ((float) (((d9 - (d6 * d10)) / d5) * d));
            double d12 = d11 / 2.0d;
            double d13 = (d7 + d8) - (((d10 * (d6 - d12)) * (d6 - d12)) * d);
            this.f1696b = (double) ((float) (d11 + d6));
            double d14 = this.f1696b;
            this.f1695a = d3 + ((d14 - d12) * d);
            double d15 = this.f1695a;
            double sqrt = Math.sqrt(d13 / ((((d2 * d15) * d15) / 2.0d) + (((d5 * d14) * d14) / 2.0d)));
            this.f1696b *= sqrt;
            this.f1695a *= sqrt;
        }

        /* renamed from: a */
        public double mo2314a() {
            double d = this.f1698d;
            double d2 = this.f1695a;
            double d3 = ((d * d2) * d2) / 2.0d;
            double d4 = this.f1697c;
            double d5 = this.f1696b;
            return d3 + (((d4 * d5) * d5) / 2.0d);
        }

        /* renamed from: b */
        public double mo2317b() {
            return this.f1695a;
        }

        /* renamed from: a */
        public void mo2316a(float f) {
            this.f1696b += (double) f;
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.v$m */
    /* compiled from: SpringSplineSet */
    static class C0391m extends C0378v {
        C0391m() {
        }

        /* renamed from: a */
        public boolean mo2310a(View view, float f, long j) {
            mo2308a(view);
            view.setTranslationX(mo2305a(f, j));
            return this.f1685m;
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.v$n */
    /* compiled from: SpringSplineSet */
    static class C0392n extends C0378v {
        C0392n() {
        }

        /* renamed from: a */
        public boolean mo2310a(View view, float f, long j) {
            mo2308a(view);
            view.setTranslationY(mo2305a(f, j));
            return this.f1685m;
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.v$o */
    /* compiled from: SpringSplineSet */
    static class C0393o extends C0378v {
        C0393o() {
        }

        /* renamed from: a */
        public boolean mo2310a(View view, float f, long j) {
            mo2308a(view);
            if (VERSION.SDK_INT >= 21) {
                view.setTranslationZ(mo2305a(f, j));
            }
            return this.f1685m;
        }
    }

    public C0378v() {
        Class<float> cls = float.class;
        this.f1678f = (float[][]) Array.newInstance(cls, new int[]{10, 1});
        this.f1679g = (float[][]) Array.newInstance(cls, new int[]{10, f1672r});
        this.f1682j = new float[f1672r];
        this.f1683k = Float.NaN;
        this.f1685m = false;
        this.f1686n = -1;
        this.f1687o = new C0390l();
        this.f1688p = 0.0f;
    }

    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static androidx.constraintlayout.motion.widget.C0378v m2162b(java.lang.String r1) {
        /*
            int r0 = r1.hashCode()
            switch(r0) {
                case -1249320806: goto L_0x007d;
                case -1249320805: goto L_0x0073;
                case -1225497657: goto L_0x0068;
                case -1225497656: goto L_0x005d;
                case -1225497655: goto L_0x0052;
                case -1001078227: goto L_0x0047;
                case -908189618: goto L_0x003d;
                case -908189617: goto L_0x0033;
                case -40300674: goto L_0x0029;
                case -4379043: goto L_0x001f;
                case 37232917: goto L_0x0014;
                case 92909918: goto L_0x0009;
                default: goto L_0x0007;
            }
        L_0x0007:
            goto L_0x0087
        L_0x0009:
            java.lang.String r0 = "alpha"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x0087
            r1 = 0
            goto L_0x0088
        L_0x0014:
            java.lang.String r0 = "transitionPathRotate"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x0087
            r1 = 5
            goto L_0x0088
        L_0x001f:
            java.lang.String r0 = "elevation"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x0087
            r1 = 1
            goto L_0x0088
        L_0x0029:
            java.lang.String r0 = "rotation"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x0087
            r1 = 2
            goto L_0x0088
        L_0x0033:
            java.lang.String r0 = "scaleY"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x0087
            r1 = 7
            goto L_0x0088
        L_0x003d:
            java.lang.String r0 = "scaleX"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x0087
            r1 = 6
            goto L_0x0088
        L_0x0047:
            java.lang.String r0 = "progress"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x0087
            r1 = 11
            goto L_0x0088
        L_0x0052:
            java.lang.String r0 = "translationZ"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x0087
            r1 = 10
            goto L_0x0088
        L_0x005d:
            java.lang.String r0 = "translationY"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x0087
            r1 = 9
            goto L_0x0088
        L_0x0068:
            java.lang.String r0 = "translationX"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x0087
            r1 = 8
            goto L_0x0088
        L_0x0073:
            java.lang.String r0 = "rotationY"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x0087
            r1 = 4
            goto L_0x0088
        L_0x007d:
            java.lang.String r0 = "rotationX"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x0087
            r1 = 3
            goto L_0x0088
        L_0x0087:
            r1 = -1
        L_0x0088:
            switch(r1) {
                case 0: goto L_0x00cf;
                case 1: goto L_0x00c9;
                case 2: goto L_0x00c3;
                case 3: goto L_0x00bd;
                case 4: goto L_0x00b7;
                case 5: goto L_0x00b1;
                case 6: goto L_0x00ab;
                case 7: goto L_0x00a5;
                case 8: goto L_0x009f;
                case 9: goto L_0x0099;
                case 10: goto L_0x0093;
                case 11: goto L_0x008d;
                default: goto L_0x008b;
            }
        L_0x008b:
            r1 = 0
            return r1
        L_0x008d:
            androidx.constraintlayout.motion.widget.v$e r1 = new androidx.constraintlayout.motion.widget.v$e
            r1.<init>()
            return r1
        L_0x0093:
            androidx.constraintlayout.motion.widget.v$o r1 = new androidx.constraintlayout.motion.widget.v$o
            r1.<init>()
            return r1
        L_0x0099:
            androidx.constraintlayout.motion.widget.v$n r1 = new androidx.constraintlayout.motion.widget.v$n
            r1.<init>()
            return r1
        L_0x009f:
            androidx.constraintlayout.motion.widget.v$m r1 = new androidx.constraintlayout.motion.widget.v$m
            r1.<init>()
            return r1
        L_0x00a5:
            androidx.constraintlayout.motion.widget.v$j r1 = new androidx.constraintlayout.motion.widget.v$j
            r1.<init>()
            return r1
        L_0x00ab:
            androidx.constraintlayout.motion.widget.v$i r1 = new androidx.constraintlayout.motion.widget.v$i
            r1.<init>()
            return r1
        L_0x00b1:
            androidx.constraintlayout.motion.widget.v$d r1 = new androidx.constraintlayout.motion.widget.v$d
            r1.<init>()
            return r1
        L_0x00b7:
            androidx.constraintlayout.motion.widget.v$h r1 = new androidx.constraintlayout.motion.widget.v$h
            r1.<init>()
            return r1
        L_0x00bd:
            androidx.constraintlayout.motion.widget.v$g r1 = new androidx.constraintlayout.motion.widget.v$g
            r1.<init>()
            return r1
        L_0x00c3:
            androidx.constraintlayout.motion.widget.v$f r1 = new androidx.constraintlayout.motion.widget.v$f
            r1.<init>()
            return r1
        L_0x00c9:
            androidx.constraintlayout.motion.widget.v$c r1 = new androidx.constraintlayout.motion.widget.v$c
            r1.<init>()
            return r1
        L_0x00cf:
            androidx.constraintlayout.motion.widget.v$a r1 = new androidx.constraintlayout.motion.widget.v$a
            r1.<init>()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.C0378v.m2162b(java.lang.String):androidx.constraintlayout.motion.widget.v");
    }

    /* renamed from: a */
    public abstract boolean mo2310a(View view, float f, long j);

    public String toString() {
        String str = this.f1681i;
        DecimalFormat decimalFormat = new DecimalFormat("##.##");
        for (int i = 0; i < this.f1680h; i++) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append("[");
            sb.append(this.f1676d[i]);
            sb.append(" , ");
            sb.append(decimalFormat.format(this.f1679g[i]));
            sb.append("] ");
            str = sb.toString();
        }
        return str;
    }

    /* renamed from: a */
    public void mo2309a(String str) {
        this.f1681i = str;
    }

    /* renamed from: a */
    public float mo2305a(float f, long j) {
        float f2 = f;
        long j2 = j;
        this.f1673a.mo14186a((double) f2, this.f1682j);
        float[] fArr = this.f1682j;
        float f3 = fArr[0];
        float f4 = fArr[2];
        float f5 = fArr[1];
        float f6 = fArr[3];
        if (f3 == 0.0f) {
            this.f1685m = false;
            return fArr[1];
        }
        int i = 0;
        while (true) {
            int[] iArr = this.f1677e;
            if (i >= iArr.length) {
                break;
            }
            float f7 = ((float) iArr[i]) / 100.0f;
            if ((f2 - f7) * (this.f1689q - f7) < 0.0f && !Float.isNaN(this.f1678f[i][0])) {
                this.f1687o.mo2316a(this.f1678f[i][0]);
            }
            i++;
        }
        this.f1689q = f2;
        if (!Float.isNaN(f6)) {
            this.f1684l *= f6;
        }
        C0390l lVar = this.f1687o;
        lVar.f1695a += (double) this.f1684l;
        this.f1684l = 0.0f;
        long j3 = j2 - this.f1686n;
        lVar.mo2318b((double) f3);
        this.f1687o.mo2315a((double) (f4 / 1000.0f));
        float f8 = f3;
        if (this.f1686n != -1) {
            if (((double) j3) * 1.0E-9d > 0.1d) {
                j3 = 1000000;
            }
            this.f1687o.mo2319c(((double) j3) * 1.0E-9d);
        }
        this.f1686n = j2;
        float b = (float) this.f1687o.mo2317b();
        float f9 = b + f5;
        this.f1685m = this.f1687o.mo2314a() > 0.1d;
        if (!this.f1685m) {
            this.f1686n = -1;
        }
        if (Float.isNaN(f9)) {
            StringBuilder sb = new StringBuilder();
            sb.append(C0319b.m1805a());
            sb.append(" setPoint delta_time= ");
            sb.append(((double) j3) * 1.0E-9d);
            String str = "SpringSet";
            Log.e(str, sb.toString());
            StringBuilder sb2 = new StringBuilder();
            sb2.append(C0319b.m1805a());
            sb2.append(" setPoint value= ");
            sb2.append(f9);
            sb2.append(" wave= ");
            sb2.append(b);
            sb2.append(" offset= ");
            sb2.append(f5);
            sb2.append(" period= ");
            sb2.append(f8);
            sb2.append(" decay= ");
            sb2.append(f4);
            Log.e(str, sb2.toString());
        }
        return f9;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0044  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo2308a(android.view.View r4) {
        /*
            r3 = this;
            int r0 = r3.f1674b
            if (r0 == 0) goto L_0x003b
            r1 = 1
            r2 = 1073741824(0x40000000, float:2.0)
            if (r0 == r1) goto L_0x002f
            r1 = 2
            if (r0 == r1) goto L_0x0026
            r1 = 3
            if (r0 == r1) goto L_0x001c
            r1 = 4
            if (r0 == r1) goto L_0x0013
            goto L_0x003b
        L_0x0013:
            int r0 = r4.getBottom()
            int r4 = r4.getTop()
            goto L_0x0037
        L_0x001c:
            int r0 = r4.getRight()
            int r4 = r4.getLeft()
            int r0 = r0 - r4
            goto L_0x0038
        L_0x0026:
            int r0 = r4.getBottom()
            int r4 = r4.getTop()
            goto L_0x0037
        L_0x002f:
            int r0 = r4.getRight()
            int r4 = r4.getLeft()
        L_0x0037:
            int r0 = r0 + r4
        L_0x0038:
            float r4 = (float) r0
            float r4 = r4 / r2
            goto L_0x003c
        L_0x003b:
            r4 = 0
        L_0x003c:
            float r0 = r3.f1683k
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L_0x0052
            boolean r0 = r3.f1675c
            if (r0 == 0) goto L_0x004d
            float r0 = r3.f1683k
            float r0 = r4 - r0
            goto L_0x0050
        L_0x004d:
            float r0 = r3.f1683k
            float r0 = r0 - r4
        L_0x0050:
            r3.f1684l = r0
        L_0x0052:
            r3.f1683k = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.C0378v.mo2308a(android.view.View):void");
    }

    /* renamed from: a */
    static C0378v m2161a(String str, SparseArray<C0418a> sparseArray) {
        return new C0380b(str, sparseArray);
    }

    /* renamed from: a */
    public void mo2307a(int i, float f, float f2, float f3, float f4, int i2, boolean z, float f5) {
        int[] iArr = this.f1676d;
        int i3 = this.f1680h;
        iArr[i3] = i;
        float[][] fArr = this.f1679g;
        fArr[i3][2] = f3;
        fArr[i3][0] = f2;
        fArr[i3][1] = f;
        fArr[i3][3] = f4;
        this.f1677e[i3] = i;
        this.f1678f[i3][0] = f5;
        this.f1674b = i2;
        this.f1675c = z;
        this.f1680h = i3 + 1;
    }

    /* renamed from: a */
    public void mo2306a(int i) {
        int i2 = this.f1680h;
        if (i2 == 0) {
            StringBuilder sb = new StringBuilder();
            sb.append("Error no points added to ");
            sb.append(this.f1681i);
            Log.e("SpringSet", sb.toString());
            return;
        }
        int i3 = 1;
        C0389k.m2182a(this.f1676d, this.f1679g, 0, i2 - 1);
        C0389k.m2182a(this.f1677e, this.f1678f, 0, this.f1680h - 1);
        int i4 = 0;
        while (true) {
            int[] iArr = this.f1676d;
            if (i3 >= iArr.length) {
                break;
            }
            if (iArr[i3] != iArr[i3 - 1]) {
                i4++;
            }
            i3++;
        }
        double[] dArr = new double[i4];
        double[][] dArr2 = (double[][]) Array.newInstance(double.class, new int[]{i4, f1672r});
        int i5 = 0;
        for (int i6 = 0; i6 < this.f1680h; i6++) {
            if (i6 > 0) {
                int[] iArr2 = this.f1676d;
                if (iArr2[i6] == iArr2[i6 - 1]) {
                }
            }
            dArr[i5] = ((double) this.f1676d[i6]) * 0.01d;
            for (int i7 = 0; i7 < f1672r; i7++) {
                dArr2[i5][i7] = (double) this.f1679g[i6][i7];
            }
            i5++;
        }
        this.f1673a = C3945b.m13283a(i, dArr, dArr2);
    }
}
