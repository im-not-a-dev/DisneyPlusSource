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
import java.util.Arrays;
import p096e.p114f.p115a.p116a.C3945b;

/* renamed from: androidx.constraintlayout.motion.widget.u */
/* compiled from: SplineSet */
public abstract class C0363u {

    /* renamed from: a */
    protected C3945b f1664a;

    /* renamed from: b */
    protected int[] f1665b = new int[10];

    /* renamed from: c */
    protected float[] f1666c = new float[10];

    /* renamed from: d */
    private int f1667d;

    /* renamed from: e */
    private String f1668e;

    /* renamed from: androidx.constraintlayout.motion.widget.u$a */
    /* compiled from: SplineSet */
    static class C0364a extends C0363u {
        C0364a() {
        }

        /* renamed from: a */
        public void mo2300a(View view, float f) {
            view.setAlpha(mo2297a(f));
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.u$b */
    /* compiled from: SplineSet */
    static class C0365b extends C0363u {

        /* renamed from: f */
        SparseArray<C0418a> f1669f;

        /* renamed from: g */
        float[] f1670g;

        public C0365b(String str, SparseArray<C0418a> sparseArray) {
            String str2 = str.split(",")[1];
            this.f1669f = sparseArray;
        }

        /* renamed from: a */
        public void mo2298a(int i) {
            int size = this.f1669f.size();
            int c = ((C0418a) this.f1669f.valueAt(0)).mo2397c();
            double[] dArr = new double[size];
            this.f1670g = new float[c];
            double[][] dArr2 = (double[][]) Array.newInstance(double.class, new int[]{size, c});
            for (int i2 = 0; i2 < size; i2++) {
                C0418a aVar = (C0418a) this.f1669f.valueAt(i2);
                dArr[i2] = ((double) this.f1669f.keyAt(i2)) * 0.01d;
                aVar.mo2395a(this.f1670g);
                int i3 = 0;
                while (true) {
                    float[] fArr = this.f1670g;
                    if (i3 >= fArr.length) {
                        break;
                    }
                    dArr2[i2][i3] = (double) fArr[i3];
                    i3++;
                }
            }
            this.f1664a = C3945b.m13283a(i, dArr, dArr2);
        }

        /* renamed from: a */
        public void mo2299a(int i, float f) {
            throw new RuntimeException("don't call for custom attribute call setPoint(pos, ConstraintAttribute)");
        }

        /* renamed from: a */
        public void mo2303a(int i, C0418a aVar) {
            this.f1669f.append(i, aVar);
        }

        /* renamed from: a */
        public void mo2300a(View view, float f) {
            this.f1664a.mo14186a((double) f, this.f1670g);
            ((C0418a) this.f1669f.valueAt(0)).mo2393a(view, this.f1670g);
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.u$c */
    /* compiled from: SplineSet */
    static class C0366c extends C0363u {
        C0366c() {
        }

        /* renamed from: a */
        public void mo2300a(View view, float f) {
            if (VERSION.SDK_INT >= 21) {
                view.setElevation(mo2297a(f));
            }
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.u$d */
    /* compiled from: SplineSet */
    static class C0367d extends C0363u {
        C0367d() {
        }

        /* renamed from: a */
        public void mo2300a(View view, float f) {
        }

        /* renamed from: a */
        public void mo2304a(View view, float f, double d, double d2) {
            view.setRotation(mo2297a(f) + ((float) Math.toDegrees(Math.atan2(d2, d))));
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.u$e */
    /* compiled from: SplineSet */
    static class C0368e extends C0363u {

        /* renamed from: f */
        boolean f1671f = false;

        C0368e() {
        }

        /* renamed from: a */
        public void mo2300a(View view, float f) {
            String str = "unable to setProgress";
            String str2 = "SplineSet";
            if (view instanceof MotionLayout) {
                ((MotionLayout) view).setProgress(mo2297a(f));
            } else if (!this.f1671f) {
                Method method = null;
                try {
                    method = view.getClass().getMethod("setProgress", new Class[]{Float.TYPE});
                } catch (NoSuchMethodException unused) {
                    this.f1671f = true;
                }
                if (method != null) {
                    try {
                        method.invoke(view, new Object[]{Float.valueOf(mo2297a(f))});
                    } catch (IllegalAccessException e) {
                        Log.e(str2, str, e);
                    } catch (InvocationTargetException e2) {
                        Log.e(str2, str, e2);
                    }
                }
            }
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.u$f */
    /* compiled from: SplineSet */
    static class C0369f extends C0363u {
        C0369f() {
        }

        /* renamed from: a */
        public void mo2300a(View view, float f) {
            view.setRotation(mo2297a(f));
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.u$g */
    /* compiled from: SplineSet */
    static class C0370g extends C0363u {
        C0370g() {
        }

        /* renamed from: a */
        public void mo2300a(View view, float f) {
            view.setRotationX(mo2297a(f));
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.u$h */
    /* compiled from: SplineSet */
    static class C0371h extends C0363u {
        C0371h() {
        }

        /* renamed from: a */
        public void mo2300a(View view, float f) {
            view.setRotationY(mo2297a(f));
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.u$i */
    /* compiled from: SplineSet */
    static class C0372i extends C0363u {
        C0372i() {
        }

        /* renamed from: a */
        public void mo2300a(View view, float f) {
            view.setScaleX(mo2297a(f));
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.u$j */
    /* compiled from: SplineSet */
    static class C0373j extends C0363u {
        C0373j() {
        }

        /* renamed from: a */
        public void mo2300a(View view, float f) {
            view.setScaleY(mo2297a(f));
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.u$k */
    /* compiled from: SplineSet */
    private static class C0374k {
        /* renamed from: a */
        static void m2154a(int[] iArr, float[] fArr, int i, int i2) {
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
                    int b = m2155b(iArr, fArr, i5, i6);
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
        private static int m2155b(int[] iArr, float[] fArr, int i, int i2) {
            int i3 = iArr[i2];
            int i4 = i;
            while (i < i2) {
                if (iArr[i] <= i3) {
                    m2156c(iArr, fArr, i4, i);
                    i4++;
                }
                i++;
            }
            m2156c(iArr, fArr, i4, i2);
            return i4;
        }

        /* renamed from: c */
        private static void m2156c(int[] iArr, float[] fArr, int i, int i2) {
            int i3 = iArr[i];
            iArr[i] = iArr[i2];
            iArr[i2] = i3;
            float f = fArr[i];
            fArr[i] = fArr[i2];
            fArr[i2] = f;
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.u$l */
    /* compiled from: SplineSet */
    static class C0375l extends C0363u {
        C0375l() {
        }

        /* renamed from: a */
        public void mo2300a(View view, float f) {
            view.setTranslationX(mo2297a(f));
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.u$m */
    /* compiled from: SplineSet */
    static class C0376m extends C0363u {
        C0376m() {
        }

        /* renamed from: a */
        public void mo2300a(View view, float f) {
            view.setTranslationY(mo2297a(f));
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.u$n */
    /* compiled from: SplineSet */
    static class C0377n extends C0363u {
        C0377n() {
        }

        /* renamed from: a */
        public void mo2300a(View view, float f) {
            if (VERSION.SDK_INT >= 21) {
                view.setTranslationZ(mo2297a(f));
            }
        }
    }

    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static androidx.constraintlayout.motion.widget.C0363u m2134b(java.lang.String r1) {
        /*
            int r0 = r1.hashCode()
            switch(r0) {
                case -1249320806: goto L_0x0095;
                case -1249320805: goto L_0x008b;
                case -1225497657: goto L_0x0080;
                case -1225497656: goto L_0x0075;
                case -1225497655: goto L_0x006a;
                case -1001078227: goto L_0x005f;
                case -908189618: goto L_0x0055;
                case -908189617: goto L_0x004b;
                case -797520672: goto L_0x0040;
                case -40300674: goto L_0x0036;
                case -4379043: goto L_0x002b;
                case 37232917: goto L_0x0020;
                case 92909918: goto L_0x0015;
                case 156108012: goto L_0x0009;
                default: goto L_0x0007;
            }
        L_0x0007:
            goto L_0x009f
        L_0x0009:
            java.lang.String r0 = "waveOffset"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x009f
            r1 = 8
            goto L_0x00a0
        L_0x0015:
            java.lang.String r0 = "alpha"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x009f
            r1 = 0
            goto L_0x00a0
        L_0x0020:
            java.lang.String r0 = "transitionPathRotate"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x009f
            r1 = 5
            goto L_0x00a0
        L_0x002b:
            java.lang.String r0 = "elevation"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x009f
            r1 = 1
            goto L_0x00a0
        L_0x0036:
            java.lang.String r0 = "rotation"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x009f
            r1 = 2
            goto L_0x00a0
        L_0x0040:
            java.lang.String r0 = "waveVariesBy"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x009f
            r1 = 9
            goto L_0x00a0
        L_0x004b:
            java.lang.String r0 = "scaleY"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x009f
            r1 = 7
            goto L_0x00a0
        L_0x0055:
            java.lang.String r0 = "scaleX"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x009f
            r1 = 6
            goto L_0x00a0
        L_0x005f:
            java.lang.String r0 = "progress"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x009f
            r1 = 13
            goto L_0x00a0
        L_0x006a:
            java.lang.String r0 = "translationZ"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x009f
            r1 = 12
            goto L_0x00a0
        L_0x0075:
            java.lang.String r0 = "translationY"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x009f
            r1 = 11
            goto L_0x00a0
        L_0x0080:
            java.lang.String r0 = "translationX"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x009f
            r1 = 10
            goto L_0x00a0
        L_0x008b:
            java.lang.String r0 = "rotationY"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x009f
            r1 = 4
            goto L_0x00a0
        L_0x0095:
            java.lang.String r0 = "rotationX"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x009f
            r1 = 3
            goto L_0x00a0
        L_0x009f:
            r1 = -1
        L_0x00a0:
            switch(r1) {
                case 0: goto L_0x00f3;
                case 1: goto L_0x00ed;
                case 2: goto L_0x00e7;
                case 3: goto L_0x00e1;
                case 4: goto L_0x00db;
                case 5: goto L_0x00d5;
                case 6: goto L_0x00cf;
                case 7: goto L_0x00c9;
                case 8: goto L_0x00c3;
                case 9: goto L_0x00bd;
                case 10: goto L_0x00b7;
                case 11: goto L_0x00b1;
                case 12: goto L_0x00ab;
                case 13: goto L_0x00a5;
                default: goto L_0x00a3;
            }
        L_0x00a3:
            r1 = 0
            return r1
        L_0x00a5:
            androidx.constraintlayout.motion.widget.u$e r1 = new androidx.constraintlayout.motion.widget.u$e
            r1.<init>()
            return r1
        L_0x00ab:
            androidx.constraintlayout.motion.widget.u$n r1 = new androidx.constraintlayout.motion.widget.u$n
            r1.<init>()
            return r1
        L_0x00b1:
            androidx.constraintlayout.motion.widget.u$m r1 = new androidx.constraintlayout.motion.widget.u$m
            r1.<init>()
            return r1
        L_0x00b7:
            androidx.constraintlayout.motion.widget.u$l r1 = new androidx.constraintlayout.motion.widget.u$l
            r1.<init>()
            return r1
        L_0x00bd:
            androidx.constraintlayout.motion.widget.u$a r1 = new androidx.constraintlayout.motion.widget.u$a
            r1.<init>()
            return r1
        L_0x00c3:
            androidx.constraintlayout.motion.widget.u$a r1 = new androidx.constraintlayout.motion.widget.u$a
            r1.<init>()
            return r1
        L_0x00c9:
            androidx.constraintlayout.motion.widget.u$j r1 = new androidx.constraintlayout.motion.widget.u$j
            r1.<init>()
            return r1
        L_0x00cf:
            androidx.constraintlayout.motion.widget.u$i r1 = new androidx.constraintlayout.motion.widget.u$i
            r1.<init>()
            return r1
        L_0x00d5:
            androidx.constraintlayout.motion.widget.u$d r1 = new androidx.constraintlayout.motion.widget.u$d
            r1.<init>()
            return r1
        L_0x00db:
            androidx.constraintlayout.motion.widget.u$h r1 = new androidx.constraintlayout.motion.widget.u$h
            r1.<init>()
            return r1
        L_0x00e1:
            androidx.constraintlayout.motion.widget.u$g r1 = new androidx.constraintlayout.motion.widget.u$g
            r1.<init>()
            return r1
        L_0x00e7:
            androidx.constraintlayout.motion.widget.u$f r1 = new androidx.constraintlayout.motion.widget.u$f
            r1.<init>()
            return r1
        L_0x00ed:
            androidx.constraintlayout.motion.widget.u$c r1 = new androidx.constraintlayout.motion.widget.u$c
            r1.<init>()
            return r1
        L_0x00f3:
            androidx.constraintlayout.motion.widget.u$a r1 = new androidx.constraintlayout.motion.widget.u$a
            r1.<init>()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.C0363u.m2134b(java.lang.String):androidx.constraintlayout.motion.widget.u");
    }

    /* renamed from: a */
    public abstract void mo2300a(View view, float f);

    /* renamed from: a */
    public void mo2301a(String str) {
        this.f1668e = str;
    }

    public String toString() {
        String str = this.f1668e;
        DecimalFormat decimalFormat = new DecimalFormat("##.##");
        for (int i = 0; i < this.f1667d; i++) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append("[");
            sb.append(this.f1665b[i]);
            sb.append(" , ");
            sb.append(decimalFormat.format((double) this.f1666c[i]));
            sb.append("] ");
            str = sb.toString();
        }
        return str;
    }

    /* renamed from: a */
    public float mo2297a(float f) {
        return (float) this.f1664a.mo14184a((double) f, 0);
    }

    /* renamed from: a */
    static C0363u m2133a(String str, SparseArray<C0418a> sparseArray) {
        return new C0365b(str, sparseArray);
    }

    /* renamed from: a */
    public void mo2299a(int i, float f) {
        int[] iArr = this.f1665b;
        if (iArr.length < this.f1667d + 1) {
            this.f1665b = Arrays.copyOf(iArr, iArr.length * 2);
            float[] fArr = this.f1666c;
            this.f1666c = Arrays.copyOf(fArr, fArr.length * 2);
        }
        int[] iArr2 = this.f1665b;
        int i2 = this.f1667d;
        iArr2[i2] = i;
        this.f1666c[i2] = f;
        this.f1667d = i2 + 1;
    }

    /* renamed from: a */
    public void mo2298a(int i) {
        int i2 = this.f1667d;
        if (i2 != 0) {
            C0374k.m2154a(this.f1665b, this.f1666c, 0, i2 - 1);
            int i3 = 1;
            for (int i4 = 1; i4 < this.f1667d; i4++) {
                int[] iArr = this.f1665b;
                if (iArr[i4 - 1] != iArr[i4]) {
                    i3++;
                }
            }
            double[] dArr = new double[i3];
            double[][] dArr2 = (double[][]) Array.newInstance(double.class, new int[]{i3, 1});
            int i5 = 0;
            for (int i6 = 0; i6 < this.f1667d; i6++) {
                if (i6 > 0) {
                    int[] iArr2 = this.f1665b;
                    if (iArr2[i6] == iArr2[i6 - 1]) {
                    }
                }
                dArr[i5] = ((double) this.f1665b[i6]) * 0.01d;
                dArr2[i5][0] = (double) this.f1666c[i6];
                i5++;
            }
            this.f1664a = C3945b.m13283a(i, dArr, dArr2);
        }
    }
}
