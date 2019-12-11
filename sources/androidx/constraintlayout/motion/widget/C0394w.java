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

/* renamed from: androidx.constraintlayout.motion.widget.w */
/* compiled from: TimeCycleSplineSet */
public abstract class C0394w {

    /* renamed from: k */
    private static float f1700k = 6.2831855f;

    /* renamed from: a */
    protected C3945b f1701a;

    /* renamed from: b */
    protected int f1702b = 0;

    /* renamed from: c */
    protected int[] f1703c = new int[10];

    /* renamed from: d */
    protected float[][] f1704d = ((float[][]) Array.newInstance(float.class, new int[]{10, 3}));

    /* renamed from: e */
    private int f1705e;

    /* renamed from: f */
    private String f1706f;

    /* renamed from: g */
    private float[] f1707g = new float[3];

    /* renamed from: h */
    protected boolean f1708h = false;

    /* renamed from: i */
    long f1709i;

    /* renamed from: j */
    float f1710j = 0.0f;

    /* renamed from: androidx.constraintlayout.motion.widget.w$a */
    /* compiled from: TimeCycleSplineSet */
    static class C0395a extends C0394w {
        C0395a() {
        }

        /* renamed from: a */
        public boolean mo2325a(View view, float f, long j) {
            view.setAlpha(mo2321a(f, j));
            return this.f1708h;
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.w$b */
    /* compiled from: TimeCycleSplineSet */
    static class C0396b extends C0394w {

        /* renamed from: l */
        SparseArray<C0418a> f1711l;

        /* renamed from: m */
        SparseArray<float[]> f1712m = new SparseArray<>();

        /* renamed from: n */
        float[] f1713n;

        /* renamed from: o */
        float[] f1714o;

        public C0396b(String str, SparseArray<C0418a> sparseArray) {
            String str2 = str.split(",")[1];
            this.f1711l = sparseArray;
        }

        /* renamed from: a */
        public void mo2322a(int i) {
            int size = this.f1711l.size();
            int c = ((C0418a) this.f1711l.valueAt(0)).mo2397c();
            double[] dArr = new double[size];
            int i2 = c + 2;
            this.f1713n = new float[i2];
            this.f1714o = new float[c];
            double[][] dArr2 = (double[][]) Array.newInstance(double.class, new int[]{size, i2});
            for (int i3 = 0; i3 < size; i3++) {
                C0418a aVar = (C0418a) this.f1711l.valueAt(i3);
                float[] fArr = (float[]) this.f1712m.valueAt(i3);
                dArr[i3] = ((double) this.f1711l.keyAt(i3)) * 0.01d;
                aVar.mo2395a(this.f1713n);
                int i4 = 0;
                while (true) {
                    float[] fArr2 = this.f1713n;
                    if (i4 >= fArr2.length) {
                        break;
                    }
                    dArr2[i3][i4] = (double) fArr2[i4];
                    i4++;
                }
                dArr2[i3][c] = (double) fArr[0];
                dArr2[i3][c + 1] = (double) fArr[1];
            }
            this.f1701a = C3945b.m13283a(i, dArr, dArr2);
        }

        /* renamed from: a */
        public void mo2323a(int i, float f, float f2, int i2, float f3) {
            throw new RuntimeException("don't call for custom attribute call setPoint(pos, ConstraintAttribute,...)");
        }

        /* renamed from: a */
        public void mo2327a(int i, C0418a aVar, float f, int i2, float f2) {
            this.f1711l.append(i, aVar);
            this.f1712m.append(i, new float[]{f, f2});
            this.f1702b = Math.max(this.f1702b, i2);
        }

        /* renamed from: a */
        public boolean mo2325a(View view, float f, long j) {
            this.f1701a.mo14186a((double) f, this.f1713n);
            float[] fArr = this.f1713n;
            float f2 = fArr[fArr.length - 2];
            float f3 = fArr[fArr.length - 1];
            this.f1710j = (float) ((((double) this.f1710j) + ((((double) (j - this.f1709i)) * 1.0E-9d) * ((double) f2))) % 1.0d);
            this.f1709i = j;
            float a = mo2320a(this.f1710j);
            this.f1708h = false;
            for (int i = 0; i < this.f1714o.length; i++) {
                this.f1708h |= ((double) this.f1713n[i]) != 0.0d;
                this.f1714o[i] = (this.f1713n[i] * a) + f3;
            }
            ((C0418a) this.f1711l.valueAt(0)).mo2393a(view, this.f1714o);
            if (f2 != 0.0f) {
                this.f1708h = true;
            }
            return this.f1708h;
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.w$c */
    /* compiled from: TimeCycleSplineSet */
    static class C0397c extends C0394w {
        C0397c() {
        }

        /* renamed from: a */
        public boolean mo2325a(View view, float f, long j) {
            if (VERSION.SDK_INT >= 21) {
                view.setElevation(mo2321a(f, j));
            }
            return this.f1708h;
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.w$d */
    /* compiled from: TimeCycleSplineSet */
    static class C0398d extends C0394w {
        C0398d() {
        }

        /* renamed from: a */
        public boolean mo2325a(View view, float f, long j) {
            return this.f1708h;
        }

        /* renamed from: a */
        public boolean mo2328a(View view, float f, long j, double d, double d2) {
            view.setRotation(mo2321a(f, j) + ((float) Math.toDegrees(Math.atan2(d2, d))));
            return this.f1708h;
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.w$e */
    /* compiled from: TimeCycleSplineSet */
    static class C0399e extends C0394w {

        /* renamed from: l */
        boolean f1715l = false;

        C0399e() {
        }

        /* renamed from: a */
        public boolean mo2325a(View view, float f, long j) {
            String str = "unable to setProgress";
            String str2 = "SplineSet";
            if (view instanceof MotionLayout) {
                ((MotionLayout) view).setProgress(mo2321a(f, j));
            } else if (this.f1715l) {
                return false;
            } else {
                Method method = null;
                try {
                    method = view.getClass().getMethod("setProgress", new Class[]{Float.TYPE});
                } catch (NoSuchMethodException unused) {
                    this.f1715l = true;
                }
                if (method != null) {
                    try {
                        method.invoke(view, new Object[]{Float.valueOf(mo2321a(f, j))});
                    } catch (IllegalAccessException e) {
                        Log.e(str2, str, e);
                    } catch (InvocationTargetException e2) {
                        Log.e(str2, str, e2);
                    }
                }
            }
            return this.f1708h;
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.w$f */
    /* compiled from: TimeCycleSplineSet */
    static class C0400f extends C0394w {
        C0400f() {
        }

        /* renamed from: a */
        public boolean mo2325a(View view, float f, long j) {
            view.setRotation(mo2321a(f, j));
            return this.f1708h;
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.w$g */
    /* compiled from: TimeCycleSplineSet */
    static class C0401g extends C0394w {
        C0401g() {
        }

        /* renamed from: a */
        public boolean mo2325a(View view, float f, long j) {
            view.setRotationX(mo2321a(f, j));
            return this.f1708h;
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.w$h */
    /* compiled from: TimeCycleSplineSet */
    static class C0402h extends C0394w {
        C0402h() {
        }

        /* renamed from: a */
        public boolean mo2325a(View view, float f, long j) {
            view.setRotationY(mo2321a(f, j));
            return this.f1708h;
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.w$i */
    /* compiled from: TimeCycleSplineSet */
    static class C0403i extends C0394w {
        C0403i() {
        }

        /* renamed from: a */
        public boolean mo2325a(View view, float f, long j) {
            view.setScaleX(mo2321a(f, j));
            return this.f1708h;
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.w$j */
    /* compiled from: TimeCycleSplineSet */
    static class C0404j extends C0394w {
        C0404j() {
        }

        /* renamed from: a */
        public boolean mo2325a(View view, float f, long j) {
            view.setScaleY(mo2321a(f, j));
            return this.f1708h;
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.w$k */
    /* compiled from: TimeCycleSplineSet */
    private static class C0405k {
        /* renamed from: a */
        static void m2216a(int[] iArr, float[][] fArr, int i, int i2) {
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
                    int b = m2217b(iArr, fArr, i5, i6);
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
        private static int m2217b(int[] iArr, float[][] fArr, int i, int i2) {
            int i3 = iArr[i2];
            int i4 = i;
            while (i < i2) {
                if (iArr[i] <= i3) {
                    m2218c(iArr, fArr, i4, i);
                    i4++;
                }
                i++;
            }
            m2218c(iArr, fArr, i4, i2);
            return i4;
        }

        /* renamed from: c */
        private static void m2218c(int[] iArr, float[][] fArr, int i, int i2) {
            int i3 = iArr[i];
            iArr[i] = iArr[i2];
            iArr[i2] = i3;
            float[] fArr2 = fArr[i];
            fArr[i] = fArr[i2];
            fArr[i2] = fArr2;
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.w$l */
    /* compiled from: TimeCycleSplineSet */
    static class C0406l extends C0394w {
        C0406l() {
        }

        /* renamed from: a */
        public boolean mo2325a(View view, float f, long j) {
            view.setTranslationX(mo2321a(f, j));
            return this.f1708h;
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.w$m */
    /* compiled from: TimeCycleSplineSet */
    static class C0407m extends C0394w {
        C0407m() {
        }

        /* renamed from: a */
        public boolean mo2325a(View view, float f, long j) {
            view.setTranslationY(mo2321a(f, j));
            return this.f1708h;
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.w$n */
    /* compiled from: TimeCycleSplineSet */
    static class C0408n extends C0394w {
        C0408n() {
        }

        /* renamed from: a */
        public boolean mo2325a(View view, float f, long j) {
            if (VERSION.SDK_INT >= 21) {
                view.setTranslationZ(mo2321a(f, j));
            }
            return this.f1708h;
        }
    }

    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static androidx.constraintlayout.motion.widget.C0394w m2195b(java.lang.String r1) {
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
            androidx.constraintlayout.motion.widget.w$e r1 = new androidx.constraintlayout.motion.widget.w$e
            r1.<init>()
            return r1
        L_0x0093:
            androidx.constraintlayout.motion.widget.w$n r1 = new androidx.constraintlayout.motion.widget.w$n
            r1.<init>()
            return r1
        L_0x0099:
            androidx.constraintlayout.motion.widget.w$m r1 = new androidx.constraintlayout.motion.widget.w$m
            r1.<init>()
            return r1
        L_0x009f:
            androidx.constraintlayout.motion.widget.w$l r1 = new androidx.constraintlayout.motion.widget.w$l
            r1.<init>()
            return r1
        L_0x00a5:
            androidx.constraintlayout.motion.widget.w$j r1 = new androidx.constraintlayout.motion.widget.w$j
            r1.<init>()
            return r1
        L_0x00ab:
            androidx.constraintlayout.motion.widget.w$i r1 = new androidx.constraintlayout.motion.widget.w$i
            r1.<init>()
            return r1
        L_0x00b1:
            androidx.constraintlayout.motion.widget.w$d r1 = new androidx.constraintlayout.motion.widget.w$d
            r1.<init>()
            return r1
        L_0x00b7:
            androidx.constraintlayout.motion.widget.w$h r1 = new androidx.constraintlayout.motion.widget.w$h
            r1.<init>()
            return r1
        L_0x00bd:
            androidx.constraintlayout.motion.widget.w$g r1 = new androidx.constraintlayout.motion.widget.w$g
            r1.<init>()
            return r1
        L_0x00c3:
            androidx.constraintlayout.motion.widget.w$f r1 = new androidx.constraintlayout.motion.widget.w$f
            r1.<init>()
            return r1
        L_0x00c9:
            androidx.constraintlayout.motion.widget.w$c r1 = new androidx.constraintlayout.motion.widget.w$c
            r1.<init>()
            return r1
        L_0x00cf:
            androidx.constraintlayout.motion.widget.w$a r1 = new androidx.constraintlayout.motion.widget.w$a
            r1.<init>()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.C0394w.m2195b(java.lang.String):androidx.constraintlayout.motion.widget.w");
    }

    /* renamed from: a */
    public void mo2324a(String str) {
        this.f1706f = str;
    }

    /* renamed from: a */
    public abstract boolean mo2325a(View view, float f, long j);

    public String toString() {
        String str = this.f1706f;
        DecimalFormat decimalFormat = new DecimalFormat("##.##");
        for (int i = 0; i < this.f1705e; i++) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append("[");
            sb.append(this.f1703c[i]);
            sb.append(" , ");
            sb.append(decimalFormat.format(this.f1704d[i]));
            sb.append("] ");
            str = sb.toString();
        }
        return str;
    }

    /* renamed from: a */
    public float mo2321a(float f, long j) {
        this.f1701a.mo14186a((double) f, this.f1707g);
        float[] fArr = this.f1707g;
        boolean z = true;
        float f2 = fArr[1];
        int i = (f2 > 0.0f ? 1 : (f2 == 0.0f ? 0 : -1));
        if (i == 0) {
            this.f1708h = false;
            return fArr[2];
        }
        this.f1710j = (float) ((((double) this.f1710j) + ((((double) (j - this.f1709i)) * 1.0E-9d) * ((double) f2))) % 1.0d);
        this.f1709i = j;
        float f3 = fArr[0];
        float a = (mo2320a(this.f1710j) * f3) + this.f1707g[2];
        if (f3 == 0.0f && i == 0) {
            z = false;
        }
        this.f1708h = z;
        return a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public float mo2320a(float f) {
        float abs;
        switch (this.f1702b) {
            case 1:
                return Math.signum(f * f1700k);
            case 2:
                abs = Math.abs(f);
                break;
            case 3:
                return (((f * 2.0f) + 1.0f) % 2.0f) - 1.0f;
            case 4:
                abs = ((f * 2.0f) + 1.0f) % 2.0f;
                break;
            case 5:
                return (float) Math.cos((double) (f * f1700k));
            case 6:
                float abs2 = 1.0f - Math.abs(((f * 4.0f) % 4.0f) - 2.0f);
                abs = abs2 * abs2;
                break;
            default:
                return (float) Math.sin((double) (f * f1700k));
        }
        return 1.0f - abs;
    }

    /* renamed from: a */
    static C0394w m2194a(String str, SparseArray<C0418a> sparseArray) {
        return new C0396b(str, sparseArray);
    }

    /* renamed from: a */
    public void mo2323a(int i, float f, float f2, int i2, float f3) {
        int[] iArr = this.f1703c;
        int i3 = this.f1705e;
        iArr[i3] = i;
        float[][] fArr = this.f1704d;
        fArr[i3][0] = f;
        fArr[i3][1] = f2;
        fArr[i3][2] = f3;
        this.f1702b = Math.max(this.f1702b, i2);
        this.f1705e++;
    }

    /* renamed from: a */
    public void mo2322a(int i) {
        int i2 = this.f1705e;
        if (i2 == 0) {
            StringBuilder sb = new StringBuilder();
            sb.append("Error no points added to ");
            sb.append(this.f1706f);
            Log.e("SplineSet", sb.toString());
            return;
        }
        C0405k.m2216a(this.f1703c, this.f1704d, 0, i2 - 1);
        int i3 = 1;
        int i4 = 0;
        while (true) {
            int[] iArr = this.f1703c;
            if (i3 >= iArr.length) {
                break;
            }
            if (iArr[i3] != iArr[i3 - 1]) {
                i4++;
            }
            i3++;
        }
        double[] dArr = new double[i4];
        double[][] dArr2 = (double[][]) Array.newInstance(double.class, new int[]{i4, 3});
        int i5 = 0;
        for (int i6 = 0; i6 < this.f1705e; i6++) {
            if (i6 > 0) {
                int[] iArr2 = this.f1703c;
                if (iArr2[i6] == iArr2[i6 - 1]) {
                }
            }
            dArr[i5] = ((double) this.f1703c[i6]) * 0.01d;
            double[] dArr3 = dArr2[i5];
            float[][] fArr = this.f1704d;
            dArr3[0] = (double) fArr[i6][0];
            dArr2[i5][1] = (double) fArr[i6][1];
            dArr2[i5][2] = (double) fArr[i6][2];
            i5++;
        }
        this.f1701a = C3945b.m13283a(i, dArr, dArr2);
    }
}
