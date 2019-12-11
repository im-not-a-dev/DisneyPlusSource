package androidx.constraintlayout.motion.widget;

import android.annotation.TargetApi;
import android.os.Build.VERSION;
import android.util.Log;
import android.view.View;
import androidx.constraintlayout.widget.C0418a;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import p096e.p114f.p115a.p116a.C3945b;
import p096e.p114f.p115a.p116a.C3951f;

/* renamed from: androidx.constraintlayout.motion.widget.g */
/* compiled from: KeyCycleOscillator */
public abstract class C0326g {

    /* renamed from: a */
    private C0330d f1482a;

    /* renamed from: b */
    protected C0418a f1483b;

    /* renamed from: c */
    private String f1484c;

    /* renamed from: d */
    private int f1485d = 0;

    /* renamed from: e */
    public int f1486e = 0;

    /* renamed from: f */
    ArrayList<C0342p> f1487f = new ArrayList<>();

    /* renamed from: androidx.constraintlayout.motion.widget.g$a */
    /* compiled from: KeyCycleOscillator */
    class C0327a implements Comparator<C0342p> {
        C0327a(C0326g gVar) {
        }

        /* renamed from: a */
        public int compare(C0342p pVar, C0342p pVar2) {
            return Integer.compare(pVar.f1497a, pVar2.f1497a);
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.g$b */
    /* compiled from: KeyCycleOscillator */
    static class C0328b extends C0326g {
        C0328b() {
        }

        /* renamed from: a */
        public void mo2202a(View view, float f) {
            view.setAlpha(mo2199a(f));
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.g$c */
    /* compiled from: KeyCycleOscillator */
    static class C0329c extends C0326g {

        /* renamed from: g */
        float[] f1488g = new float[1];

        C0329c() {
        }

        /* renamed from: a */
        public void mo2202a(View view, float f) {
            this.f1488g[0] = mo2199a(f);
            this.f1483b.mo2393a(view, this.f1488g);
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.g$d */
    /* compiled from: KeyCycleOscillator */
    static class C0330d {

        /* renamed from: a */
        C3951f f1489a = new C3951f();

        /* renamed from: b */
        float[] f1490b;

        /* renamed from: c */
        double[] f1491c;

        /* renamed from: d */
        float[] f1492d;

        /* renamed from: e */
        float[] f1493e;

        /* renamed from: f */
        C3945b f1494f;

        /* renamed from: g */
        double[] f1495g;

        C0330d(int i, int i2, int i3) {
            new HashMap();
            this.f1489a.mo14205a(i);
            this.f1490b = new float[i3];
            this.f1491c = new double[i3];
            this.f1492d = new float[i3];
            this.f1493e = new float[i3];
            float[] fArr = new float[i3];
        }

        /* renamed from: a */
        public double mo2209a(float f) {
            C3945b bVar = this.f1494f;
            if (bVar != null) {
                bVar.mo14185a((double) f, this.f1495g);
            } else {
                double[] dArr = this.f1495g;
                dArr[0] = (double) this.f1493e[0];
                dArr[1] = (double) this.f1490b[0];
            }
            return this.f1495g[0] + (this.f1489a.mo14206b((double) f) * this.f1495g[1]);
        }

        /* renamed from: b */
        public void mo2211b(float f) {
            System.nanoTime();
            double[][] dArr = (double[][]) Array.newInstance(double.class, new int[]{this.f1491c.length, 2});
            this.f1495g = new double[(this.f1490b.length + 1)];
            if (this.f1491c[0] > 0.0d) {
                this.f1489a.mo14204a(0.0d, this.f1492d[0]);
            }
            double[] dArr2 = this.f1491c;
            int length = dArr2.length - 1;
            if (dArr2[length] < 1.0d) {
                this.f1489a.mo14204a(1.0d, this.f1492d[length]);
            }
            for (int i = 0; i < dArr.length; i++) {
                dArr[i][0] = (double) this.f1493e[i];
                int i2 = 0;
                while (true) {
                    float[] fArr = this.f1490b;
                    if (i2 >= fArr.length) {
                        break;
                    }
                    dArr[i2][1] = (double) fArr[i2];
                    i2++;
                }
                this.f1489a.mo14204a(this.f1491c[i], this.f1492d[i]);
            }
            this.f1489a.mo14203a();
            double[] dArr3 = this.f1491c;
            if (dArr3.length > 1) {
                this.f1494f = C3945b.m13283a(0, dArr3, dArr);
            } else {
                this.f1494f = null;
            }
        }

        /* renamed from: a */
        public void mo2210a(int i, int i2, float f, float f2, float f3) {
            this.f1491c[i] = ((double) i2) / 100.0d;
            this.f1492d[i] = f;
            this.f1493e[i] = f2;
            this.f1490b[i] = f3;
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.g$e */
    /* compiled from: KeyCycleOscillator */
    static class C0331e extends C0326g {
        C0331e() {
        }

        /* renamed from: a */
        public void mo2202a(View view, float f) {
            if (VERSION.SDK_INT >= 21) {
                view.setElevation(mo2199a(f));
            }
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.g$f */
    /* compiled from: KeyCycleOscillator */
    static class C0332f extends C0326g {
        C0332f() {
        }

        /* renamed from: a */
        public void mo2202a(View view, float f) {
        }

        /* renamed from: a */
        public void mo2212a(View view, float f, double d, double d2) {
            view.setRotation(mo2199a(f) + ((float) Math.toDegrees(Math.atan2(d2, d))));
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.g$g */
    /* compiled from: KeyCycleOscillator */
    static class C0333g extends C0326g {

        /* renamed from: g */
        boolean f1496g = false;

        C0333g() {
        }

        /* renamed from: a */
        public void mo2202a(View view, float f) {
            String str = "unable to setProgress";
            String str2 = "KeyCycleOscillator";
            if (view instanceof MotionLayout) {
                ((MotionLayout) view).setProgress(mo2199a(f));
            } else if (!this.f1496g) {
                Method method = null;
                try {
                    method = view.getClass().getMethod("setProgress", new Class[]{Float.TYPE});
                } catch (NoSuchMethodException unused) {
                    this.f1496g = true;
                }
                if (method != null) {
                    try {
                        method.invoke(view, new Object[]{Float.valueOf(mo2199a(f))});
                    } catch (IllegalAccessException e) {
                        Log.e(str2, str, e);
                    } catch (InvocationTargetException e2) {
                        Log.e(str2, str, e2);
                    }
                }
            }
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.g$h */
    /* compiled from: KeyCycleOscillator */
    static class C0334h extends C0326g {
        C0334h() {
        }

        /* renamed from: a */
        public void mo2202a(View view, float f) {
            view.setRotation(mo2199a(f));
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.g$i */
    /* compiled from: KeyCycleOscillator */
    static class C0335i extends C0326g {
        C0335i() {
        }

        /* renamed from: a */
        public void mo2202a(View view, float f) {
            view.setRotationX(mo2199a(f));
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.g$j */
    /* compiled from: KeyCycleOscillator */
    static class C0336j extends C0326g {
        C0336j() {
        }

        /* renamed from: a */
        public void mo2202a(View view, float f) {
            view.setRotationY(mo2199a(f));
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.g$k */
    /* compiled from: KeyCycleOscillator */
    static class C0337k extends C0326g {
        C0337k() {
        }

        /* renamed from: a */
        public void mo2202a(View view, float f) {
            view.setScaleX(mo2199a(f));
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.g$l */
    /* compiled from: KeyCycleOscillator */
    static class C0338l extends C0326g {
        C0338l() {
        }

        /* renamed from: a */
        public void mo2202a(View view, float f) {
            view.setScaleY(mo2199a(f));
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.g$m */
    /* compiled from: KeyCycleOscillator */
    static class C0339m extends C0326g {
        C0339m() {
        }

        /* renamed from: a */
        public void mo2202a(View view, float f) {
            view.setTranslationX(mo2199a(f));
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.g$n */
    /* compiled from: KeyCycleOscillator */
    static class C0340n extends C0326g {
        C0340n() {
        }

        /* renamed from: a */
        public void mo2202a(View view, float f) {
            view.setTranslationY(mo2199a(f));
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.g$o */
    /* compiled from: KeyCycleOscillator */
    static class C0341o extends C0326g {
        C0341o() {
        }

        /* renamed from: a */
        public void mo2202a(View view, float f) {
            if (VERSION.SDK_INT >= 21) {
                view.setTranslationZ(mo2199a(f));
            }
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.g$p */
    /* compiled from: KeyCycleOscillator */
    static class C0342p {

        /* renamed from: a */
        int f1497a;

        /* renamed from: b */
        float f1498b;

        /* renamed from: c */
        float f1499c;

        /* renamed from: d */
        float f1500d;

        public C0342p(int i, float f, float f2, float f3) {
            this.f1497a = i;
            this.f1498b = f3;
            this.f1499c = f2;
            this.f1500d = f;
        }
    }

    /* renamed from: b */
    static C0326g m1890b(String str) {
        if (str.startsWith("CUSTOM")) {
            return new C0329c();
        }
        char c = 65535;
        switch (str.hashCode()) {
            case -1249320806:
                if (str.equals("rotationX")) {
                    c = 3;
                    break;
                }
                break;
            case -1249320805:
                if (str.equals("rotationY")) {
                    c = 4;
                    break;
                }
                break;
            case -1225497657:
                if (str.equals("translationX")) {
                    c = 10;
                    break;
                }
                break;
            case -1225497656:
                if (str.equals("translationY")) {
                    c = 11;
                    break;
                }
                break;
            case -1225497655:
                if (str.equals("translationZ")) {
                    c = 12;
                    break;
                }
                break;
            case -1001078227:
                if (str.equals("progress")) {
                    c = 13;
                    break;
                }
                break;
            case -908189618:
                if (str.equals("scaleX")) {
                    c = 6;
                    break;
                }
                break;
            case -908189617:
                if (str.equals("scaleY")) {
                    c = 7;
                    break;
                }
                break;
            case -797520672:
                if (str.equals("waveVariesBy")) {
                    c = 9;
                    break;
                }
                break;
            case -40300674:
                if (str.equals("rotation")) {
                    c = 2;
                    break;
                }
                break;
            case -4379043:
                if (str.equals("elevation")) {
                    c = 1;
                    break;
                }
                break;
            case 37232917:
                if (str.equals("transitionPathRotate")) {
                    c = 5;
                    break;
                }
                break;
            case 92909918:
                if (str.equals("alpha")) {
                    c = 0;
                    break;
                }
                break;
            case 156108012:
                if (str.equals("waveOffset")) {
                    c = 8;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return new C0328b();
            case 1:
                return new C0331e();
            case 2:
                return new C0334h();
            case 3:
                return new C0335i();
            case 4:
                return new C0336j();
            case 5:
                return new C0332f();
            case 6:
                return new C0337k();
            case 7:
                return new C0338l();
            case 8:
                return new C0328b();
            case 9:
                return new C0328b();
            case 10:
                return new C0339m();
            case 11:
                return new C0340n();
            case 12:
                return new C0341o();
            case 13:
                return new C0333g();
            default:
                return null;
        }
    }

    /* renamed from: a */
    public abstract void mo2202a(View view, float f);

    /* renamed from: a */
    public boolean mo2204a() {
        return this.f1486e == 1;
    }

    public String toString() {
        String str = this.f1484c;
        DecimalFormat decimalFormat = new DecimalFormat("##.##");
        Iterator it = this.f1487f.iterator();
        while (it.hasNext()) {
            C0342p pVar = (C0342p) it.next();
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append("[");
            sb.append(pVar.f1497a);
            sb.append(" , ");
            sb.append(decimalFormat.format((double) pVar.f1498b));
            sb.append("] ");
            str = sb.toString();
        }
        return str;
    }

    /* renamed from: a */
    public void mo2203a(String str) {
        this.f1484c = str;
    }

    /* renamed from: a */
    public float mo2199a(float f) {
        return (float) this.f1482a.mo2209a(f);
    }

    /* renamed from: a */
    public void mo2201a(int i, int i2, int i3, float f, float f2, float f3, C0418a aVar) {
        this.f1487f.add(new C0342p(i, f, f2, f3));
        if (i3 != -1) {
            this.f1486e = i3;
        }
        this.f1485d = i2;
        this.f1483b = aVar;
    }

    /* renamed from: a */
    public void mo2200a(int i, int i2, int i3, float f, float f2, float f3) {
        this.f1487f.add(new C0342p(i, f, f2, f3));
        if (i3 != -1) {
            this.f1486e = i3;
        }
        this.f1485d = i2;
    }

    @TargetApi(19)
    /* renamed from: b */
    public void mo2205b(float f) {
        int size = this.f1487f.size();
        if (size != 0) {
            Collections.sort(this.f1487f, new C0327a(this));
            double[] dArr = new double[size];
            double[][] dArr2 = (double[][]) Array.newInstance(double.class, new int[]{size, 2});
            this.f1482a = new C0330d(this.f1485d, this.f1486e, size);
            Iterator it = this.f1487f.iterator();
            int i = 0;
            while (it.hasNext()) {
                C0342p pVar = (C0342p) it.next();
                float f2 = pVar.f1500d;
                dArr[i] = ((double) f2) * 0.01d;
                double[] dArr3 = dArr2[i];
                float f3 = pVar.f1498b;
                dArr3[0] = (double) f3;
                double[] dArr4 = dArr2[i];
                float f4 = pVar.f1499c;
                dArr4[1] = (double) f4;
                this.f1482a.mo2210a(i, pVar.f1497a, f2, f4, f3);
                i++;
            }
            this.f1482a.mo2211b(f);
            C3945b.m13283a(0, dArr, dArr2);
        }
    }
}
