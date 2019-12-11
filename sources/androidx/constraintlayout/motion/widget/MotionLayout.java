package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.Rect;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.animation.Interpolator;
import androidx.constraintlayout.motion.widget.C0358s.C0360b;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.C0421b;
import androidx.constraintlayout.widget.C0422c;
import androidx.constraintlayout.widget.C0425d;
import androidx.constraintlayout.widget.C0431e.C0432a;
import androidx.constraintlayout.widget.C0436i;
import androidx.constraintlayout.widget.C0437j;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintLayout.C0415c;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import p096e.p114f.p115a.p116a.C3952g;
import p096e.p114f.p117b.p118j.C3965b;
import p096e.p114f.p117b.p118j.C3973f;
import p096e.p114f.p117b.p118j.C3976g;
import p096e.p114f.p117b.p118j.C3978i;
import p096e.p114f.p117b.p118j.C3980j;
import p096e.p114f.p117b.p118j.C3982k;
import p096e.p114f.p117b.p118j.C3983l;
import p096e.p114f.p117b.p118j.C3991s;
import p096e.p121h.p135s.C4178o;

public class MotionLayout extends ConstraintLayout implements C4178o {

    /* renamed from: A0 */
    private long f1370A0 = 0;

    /* renamed from: B0 */
    private float f1371B0 = 1.0f;

    /* renamed from: C0 */
    float f1372C0 = 0.0f;

    /* renamed from: D0 */
    float f1373D0 = 0.0f;

    /* renamed from: E0 */
    private long f1374E0;

    /* renamed from: F0 */
    float f1375F0 = 0.0f;

    /* renamed from: G0 */
    private boolean f1376G0;

    /* renamed from: H0 */
    boolean f1377H0 = false;

    /* renamed from: I0 */
    private C0317d f1378I0;

    /* renamed from: J0 */
    private float f1379J0;

    /* renamed from: K0 */
    private float f1380K0;

    /* renamed from: L0 */
    private int f1381L0 = 0;

    /* renamed from: M0 */
    C0315b f1382M0;

    /* renamed from: N0 */
    private boolean f1383N0 = false;

    /* renamed from: O0 */
    private C3952g f1384O0 = new C3952g();

    /* renamed from: P0 */
    private C0314a f1385P0 = new C0314a();

    /* renamed from: Q0 */
    private C0320c f1386Q0;

    /* renamed from: R0 */
    int f1387R0;

    /* renamed from: S0 */
    int f1388S0;

    /* renamed from: T0 */
    float f1389T0;

    /* renamed from: U0 */
    float f1390U0;

    /* renamed from: V0 */
    long f1391V0;

    /* renamed from: W0 */
    float f1392W0;

    /* renamed from: X0 */
    private boolean f1393X0 = false;

    /* renamed from: Y0 */
    private ArrayList<C0355p> f1394Y0 = null;

    /* renamed from: Z0 */
    private ArrayList<C0355p> f1395Z0 = null;

    /* renamed from: a1 */
    private int f1396a1 = 0;

    /* renamed from: b1 */
    private long f1397b1 = -1;

    /* renamed from: c1 */
    private float f1398c1 = 0.0f;

    /* renamed from: d1 */
    private int f1399d1 = 0;

    /* renamed from: e1 */
    private float f1400e1 = 0.0f;

    /* renamed from: f1 */
    C0316c f1401f1 = new C0316c();

    /* renamed from: g1 */
    private boolean f1402g1 = false;

    /* renamed from: h1 */
    ArrayList<Integer> f1403h1 = new ArrayList<>();

    /* renamed from: r0 */
    C0358s f1404r0;

    /* renamed from: s0 */
    Interpolator f1405s0;
    /* access modifiers changed from: private */

    /* renamed from: t0 */
    public float f1406t0 = 0.0f;

    /* renamed from: u0 */
    private int f1407u0 = -1;

    /* renamed from: v0 */
    int f1408v0 = -1;
    /* access modifiers changed from: private */

    /* renamed from: w0 */
    public int f1409w0 = -1;
    /* access modifiers changed from: private */

    /* renamed from: x0 */
    public int f1410x0 = 0;
    /* access modifiers changed from: private */

    /* renamed from: y0 */
    public int f1411y0 = 0;

    /* renamed from: z0 */
    HashMap<View, C0354o> f1412z0 = new HashMap<>();

    /* renamed from: androidx.constraintlayout.motion.widget.MotionLayout$a */
    class C0314a extends C0356q {

        /* renamed from: a */
        float f1413a = 0.0f;

        /* renamed from: b */
        float f1414b = 0.0f;

        /* renamed from: c */
        float f1415c;

        C0314a() {
        }

        /* renamed from: a */
        public void mo2174a(float f, float f2, float f3) {
            this.f1413a = f;
            this.f1414b = f2;
            this.f1415c = f3;
        }

        public float getInterpolation(float f) {
            float f2;
            float f3;
            float f4 = this.f1413a;
            if (f4 > 0.0f) {
                float f5 = this.f1415c;
                if (f4 / f5 < f) {
                    f = f4 / f5;
                }
                MotionLayout.this.f1406t0 = this.f1413a - (this.f1415c * f);
                f2 = (this.f1413a * f) - (((this.f1415c * f) * f) / 2.0f);
                f3 = this.f1414b;
            } else {
                float f6 = -f4;
                float f7 = this.f1415c;
                if (f6 / f7 < f) {
                    f = (-f4) / f7;
                }
                MotionLayout.this.f1406t0 = this.f1413a + (this.f1415c * f);
                f2 = (this.f1413a * f) + (((this.f1415c * f) * f) / 2.0f);
                f3 = this.f1414b;
            }
            return f2 + f3;
        }

        /* renamed from: a */
        public float mo2173a() {
            return MotionLayout.this.f1406t0;
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.MotionLayout$b */
    private class C0315b {

        /* renamed from: a */
        float[] f1417a;

        /* renamed from: b */
        int[] f1418b;

        /* renamed from: c */
        float[] f1419c;

        /* renamed from: d */
        Path f1420d;

        /* renamed from: e */
        Paint f1421e = new Paint();

        /* renamed from: f */
        Paint f1422f;

        /* renamed from: g */
        Paint f1423g;

        /* renamed from: h */
        Paint f1424h;

        /* renamed from: i */
        Paint f1425i;

        /* renamed from: j */
        private float[] f1426j;

        /* renamed from: k */
        DashPathEffect f1427k;

        /* renamed from: l */
        int f1428l;

        /* renamed from: m */
        Rect f1429m = new Rect();

        /* renamed from: n */
        boolean f1430n = false;

        /* renamed from: o */
        int f1431o = 1;

        public C0315b() {
            this.f1421e.setAntiAlias(true);
            this.f1421e.setColor(-21965);
            this.f1421e.setStrokeWidth(2.0f);
            this.f1421e.setStyle(Style.STROKE);
            this.f1422f = new Paint();
            this.f1422f.setAntiAlias(true);
            this.f1422f.setColor(-2067046);
            this.f1422f.setStrokeWidth(2.0f);
            this.f1422f.setStyle(Style.STROKE);
            this.f1423g = new Paint();
            this.f1423g.setAntiAlias(true);
            this.f1423g.setColor(-13391360);
            this.f1423g.setStrokeWidth(2.0f);
            this.f1423g.setStyle(Style.STROKE);
            this.f1424h = new Paint();
            this.f1424h.setAntiAlias(true);
            this.f1424h.setColor(-13391360);
            this.f1424h.setTextSize(MotionLayout.this.getContext().getResources().getDisplayMetrics().density * 12.0f);
            this.f1426j = new float[8];
            this.f1425i = new Paint();
            this.f1425i.setAntiAlias(true);
            this.f1427k = new DashPathEffect(new float[]{4.0f, 8.0f}, 0.0f);
            this.f1423g.setPathEffect(this.f1427k);
            this.f1419c = new float[100];
            this.f1418b = new int[50];
            if (this.f1430n) {
                this.f1421e.setStrokeWidth(8.0f);
                this.f1425i.setStrokeWidth(8.0f);
                this.f1422f.setStrokeWidth(8.0f);
                this.f1431o = 4;
            }
        }

        /* renamed from: b */
        private void m1785b(Canvas canvas, int i, int i2, C0354o oVar) {
            int i3;
            int i4;
            float f;
            float f2;
            int i5;
            Canvas canvas2 = canvas;
            int i6 = i;
            C0354o oVar2 = oVar;
            View view = oVar2.f1590a;
            if (view != null) {
                i4 = view.getWidth();
                i3 = oVar2.f1590a.getHeight();
            } else {
                i4 = 0;
                i3 = 0;
            }
            int i7 = 1;
            int i8 = 1;
            while (i8 < i2 - 1) {
                if (i6 != 4 || this.f1418b[i8 - 1] != 0) {
                    float[] fArr = this.f1419c;
                    int i9 = i8 * 2;
                    float f3 = fArr[i9];
                    float f4 = fArr[i9 + i7];
                    this.f1420d.reset();
                    this.f1420d.moveTo(f3, f4 + 10.0f);
                    this.f1420d.lineTo(f3 + 10.0f, f4);
                    this.f1420d.lineTo(f3, f4 - 10.0f);
                    this.f1420d.lineTo(f3 - 10.0f, f4);
                    this.f1420d.close();
                    int i10 = i8 - 1;
                    oVar2.mo2228a(i10);
                    if (i6 == 4) {
                        int[] iArr = this.f1418b;
                        if (iArr[i10] == i7) {
                            m1784b(canvas2, f3 - 0.0f, f4 - 0.0f);
                        } else if (iArr[i10] == 2) {
                            m1780a(canvas2, f3 - 0.0f, f4 - 0.0f);
                        } else if (iArr[i10] == 3) {
                            i5 = 3;
                            f2 = f4;
                            f = f3;
                            m1781a(canvas, f3 - 0.0f, f4 - 0.0f, i4, i3);
                            canvas2.drawPath(this.f1420d, this.f1425i);
                        }
                        f2 = f4;
                        f = f3;
                        i5 = 3;
                        canvas2.drawPath(this.f1420d, this.f1425i);
                    } else {
                        f2 = f4;
                        f = f3;
                        i5 = 3;
                    }
                    if (i6 == 2) {
                        m1784b(canvas2, f - 0.0f, f2 - 0.0f);
                    }
                    if (i6 == i5) {
                        m1780a(canvas2, f - 0.0f, f2 - 0.0f);
                    }
                    if (i6 == 6) {
                        m1781a(canvas, f - 0.0f, f2 - 0.0f, i4, i3);
                    }
                    canvas2.drawPath(this.f1420d, this.f1425i);
                }
                i8++;
                i7 = 1;
            }
            float[] fArr2 = this.f1417a;
            canvas2.drawCircle(fArr2[0], fArr2[1], 8.0f, this.f1422f);
            float[] fArr3 = this.f1417a;
            canvas2.drawCircle(fArr3[fArr3.length - 2], fArr3[fArr3.length - 1], 8.0f, this.f1422f);
        }

        /* renamed from: c */
        private void m1786c(Canvas canvas) {
            float[] fArr = this.f1417a;
            float f = fArr[0];
            float f2 = fArr[1];
            float f3 = fArr[fArr.length - 2];
            float f4 = fArr[fArr.length - 1];
            canvas.drawLine(Math.min(f, f3), Math.max(f2, f4), Math.max(f, f3), Math.max(f2, f4), this.f1423g);
            canvas.drawLine(Math.min(f, f3), Math.min(f2, f4), Math.min(f, f3), Math.max(f2, f4), this.f1423g);
        }

        /* renamed from: d */
        private void m1787d(Canvas canvas) {
            float[] fArr = this.f1417a;
            canvas.drawLine(fArr[0], fArr[1], fArr[fArr.length - 2], fArr[fArr.length - 1], this.f1423g);
        }

        /* renamed from: a */
        public void mo2177a(Canvas canvas, HashMap<View, C0354o> hashMap, int i, int i2) {
            if (hashMap != null && hashMap.size() != 0) {
                canvas.save();
                if (!MotionLayout.this.isInEditMode() && (i2 & 1) == 2) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(MotionLayout.this.getContext().getResources().getResourceName(MotionLayout.this.f1409w0));
                    sb.append(":");
                    sb.append(MotionLayout.this.getProgress());
                    String sb2 = sb.toString();
                    canvas.drawText(sb2, 10.0f, (float) (MotionLayout.this.getHeight() - 30), this.f1424h);
                    canvas.drawText(sb2, 11.0f, (float) (MotionLayout.this.getHeight() - 29), this.f1421e);
                }
                for (C0354o oVar : hashMap.values()) {
                    int a = oVar.mo2226a();
                    if (i2 > 0 && a == 0) {
                        a = 1;
                    }
                    if (a != 0) {
                        this.f1428l = oVar.mo2227a(this.f1419c, this.f1418b);
                        if (a >= 1) {
                            int i3 = i / 16;
                            float[] fArr = this.f1417a;
                            if (fArr == null || fArr.length != i3 * 2) {
                                this.f1417a = new float[(i3 * 2)];
                                this.f1420d = new Path();
                            }
                            int i4 = this.f1431o;
                            canvas.translate((float) i4, (float) i4);
                            this.f1421e.setColor(1996488704);
                            this.f1425i.setColor(1996488704);
                            this.f1422f.setColor(1996488704);
                            this.f1423g.setColor(1996488704);
                            oVar.mo2236a(this.f1417a, i3);
                            mo2176a(canvas, a, this.f1428l, oVar);
                            this.f1421e.setColor(-21965);
                            this.f1422f.setColor(-2067046);
                            this.f1425i.setColor(-2067046);
                            this.f1423g.setColor(-13391360);
                            int i5 = this.f1431o;
                            canvas.translate((float) (-i5), (float) (-i5));
                            mo2176a(canvas, a, this.f1428l, oVar);
                            if (a == 5) {
                                m1782a(canvas, oVar);
                            }
                        }
                    }
                }
                canvas.restore();
            }
        }

        /* renamed from: b */
        private void m1783b(Canvas canvas) {
            boolean z = false;
            boolean z2 = false;
            for (int i = 0; i < this.f1428l; i++) {
                if (this.f1418b[i] == 1) {
                    z = true;
                }
                if (this.f1418b[i] == 2) {
                    z2 = true;
                }
            }
            if (z) {
                m1787d(canvas);
            }
            if (z2) {
                m1786c(canvas);
            }
        }

        /* renamed from: a */
        public void mo2176a(Canvas canvas, int i, int i2, C0354o oVar) {
            if (i == 4) {
                m1783b(canvas);
            }
            if (i == 2) {
                m1787d(canvas);
            }
            if (i == 3) {
                m1786c(canvas);
            }
            m1779a(canvas);
            m1785b(canvas, i, i2, oVar);
        }

        /* renamed from: b */
        private void m1784b(Canvas canvas, float f, float f2) {
            float[] fArr = this.f1417a;
            float f3 = fArr[0];
            float f4 = fArr[1];
            float f5 = fArr[fArr.length - 2];
            float f6 = fArr[fArr.length - 1];
            float hypot = (float) Math.hypot((double) (f3 - f5), (double) (f4 - f6));
            float f7 = f5 - f3;
            float f8 = f6 - f4;
            float f9 = (((f - f3) * f7) + ((f2 - f4) * f8)) / (hypot * hypot);
            float f10 = f3 + (f7 * f9);
            float f11 = f4 + (f9 * f8);
            Path path = new Path();
            path.moveTo(f, f2);
            path.lineTo(f10, f11);
            float hypot2 = (float) Math.hypot((double) (f10 - f), (double) (f11 - f2));
            StringBuilder sb = new StringBuilder();
            sb.append("");
            sb.append(((float) ((int) ((hypot2 * 100.0f) / hypot))) / 100.0f);
            String sb2 = sb.toString();
            mo2178a(sb2, this.f1424h);
            canvas.drawTextOnPath(sb2, path, (hypot2 / 2.0f) - ((float) (this.f1429m.width() / 2)), -20.0f, this.f1424h);
            canvas.drawLine(f, f2, f10, f11, this.f1423g);
        }

        /* renamed from: a */
        private void m1779a(Canvas canvas) {
            canvas.drawLines(this.f1417a, this.f1421e);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo2178a(String str, Paint paint) {
            paint.getTextBounds(str, 0, str.length(), this.f1429m);
        }

        /* renamed from: a */
        private void m1780a(Canvas canvas, float f, float f2) {
            Canvas canvas2 = canvas;
            float[] fArr = this.f1417a;
            float f3 = fArr[0];
            float f4 = fArr[1];
            float f5 = fArr[fArr.length - 2];
            float f6 = fArr[fArr.length - 1];
            float min = Math.min(f3, f5);
            float max = Math.max(f4, f6);
            float min2 = f - Math.min(f3, f5);
            float max2 = Math.max(f4, f6) - f2;
            StringBuilder sb = new StringBuilder();
            String str = "";
            sb.append(str);
            sb.append(((float) ((int) (((double) ((min2 * 100.0f) / Math.abs(f5 - f3))) + 0.5d))) / 100.0f);
            String sb2 = sb.toString();
            mo2178a(sb2, this.f1424h);
            canvas2.drawText(sb2, ((min2 / 2.0f) - ((float) (this.f1429m.width() / 2))) + min, f2 - 20.0f, this.f1424h);
            canvas.drawLine(f, f2, Math.min(f3, f5), f2, this.f1423g);
            StringBuilder sb3 = new StringBuilder();
            sb3.append(str);
            sb3.append(((float) ((int) (((double) ((max2 * 100.0f) / Math.abs(f6 - f4))) + 0.5d))) / 100.0f);
            String sb4 = sb3.toString();
            mo2178a(sb4, this.f1424h);
            canvas2.drawText(sb4, f + 5.0f, max - ((max2 / 2.0f) - ((float) (this.f1429m.height() / 2))), this.f1424h);
            canvas.drawLine(f, f2, f, Math.max(f4, f6), this.f1423g);
        }

        /* renamed from: a */
        private void m1781a(Canvas canvas, float f, float f2, int i, int i2) {
            Canvas canvas2 = canvas;
            StringBuilder sb = new StringBuilder();
            String str = "";
            sb.append(str);
            sb.append(((float) ((int) (((double) (((f - ((float) (i / 2))) * 100.0f) / ((float) (MotionLayout.this.getWidth() - i)))) + 0.5d))) / 100.0f);
            String sb2 = sb.toString();
            mo2178a(sb2, this.f1424h);
            canvas2.drawText(sb2, ((f / 2.0f) - ((float) (this.f1429m.width() / 2))) + 0.0f, f2 - 20.0f, this.f1424h);
            canvas.drawLine(f, f2, Math.min(0.0f, 1.0f), f2, this.f1423g);
            StringBuilder sb3 = new StringBuilder();
            sb3.append(str);
            sb3.append(((float) ((int) (((double) (((f2 - ((float) (i2 / 2))) * 100.0f) / ((float) (MotionLayout.this.getHeight() - i2)))) + 0.5d))) / 100.0f);
            String sb4 = sb3.toString();
            mo2178a(sb4, this.f1424h);
            canvas2.drawText(sb4, f + 5.0f, 0.0f - ((f2 / 2.0f) - ((float) (this.f1429m.height() / 2))), this.f1424h);
            canvas.drawLine(f, f2, f, Math.max(0.0f, 1.0f), this.f1423g);
        }

        /* renamed from: a */
        private void m1782a(Canvas canvas, C0354o oVar) {
            this.f1420d.reset();
            for (int i = 0; i <= 50; i++) {
                oVar.mo2230a(((float) i) / ((float) 50), this.f1426j, 0);
                Path path = this.f1420d;
                float[] fArr = this.f1426j;
                path.moveTo(fArr[0], fArr[1]);
                Path path2 = this.f1420d;
                float[] fArr2 = this.f1426j;
                path2.lineTo(fArr2[2], fArr2[3]);
                Path path3 = this.f1420d;
                float[] fArr3 = this.f1426j;
                path3.lineTo(fArr3[4], fArr3[5]);
                Path path4 = this.f1420d;
                float[] fArr4 = this.f1426j;
                path4.lineTo(fArr4[6], fArr4[7]);
                this.f1420d.close();
            }
            this.f1421e.setColor(1140850688);
            canvas.translate(2.0f, 2.0f);
            canvas.drawPath(this.f1420d, this.f1421e);
            canvas.translate(-2.0f, -2.0f);
            this.f1421e.setColor(-65536);
            canvas.drawPath(this.f1420d, this.f1421e);
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.MotionLayout$c */
    class C0316c {

        /* renamed from: a */
        C3976g f1433a = new C3976g();

        /* renamed from: b */
        C3976g f1434b = new C3976g();

        /* renamed from: c */
        C0425d f1435c = null;

        /* renamed from: d */
        C0425d f1436d = null;

        /* renamed from: e */
        int f1437e;

        /* renamed from: f */
        int f1438f;

        C0316c() {
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo2182a(C3976g gVar, C3976g gVar2) {
            C3973f fVar;
            ArrayList R = gVar.mo14286R();
            HashMap hashMap = new HashMap();
            hashMap.put(gVar, gVar2);
            gVar2.mo14286R().clear();
            gVar2.mo14291a((C3973f) gVar, hashMap);
            Iterator it = R.iterator();
            while (it.hasNext()) {
                C3973f fVar2 = (C3973f) it.next();
                if (fVar2 instanceof C3965b) {
                    fVar = new C3965b();
                } else if (fVar2 instanceof C3980j) {
                    fVar = new C3980j();
                } else if (fVar2 instanceof C3978i) {
                    fVar = new C3978i();
                } else if (fVar2 instanceof C3982k) {
                    fVar = new C3983l();
                } else {
                    fVar = new C3973f();
                }
                gVar2.mo14503a(fVar);
                hashMap.put(fVar2, fVar);
            }
            Iterator it2 = R.iterator();
            while (it2.hasNext()) {
                C3973f fVar3 = (C3973f) it2.next();
                ((C3973f) hashMap.get(fVar3)).mo14291a(fVar3, hashMap);
            }
        }

        /* renamed from: b */
        public void mo2184b() {
            mo2185b(MotionLayout.this.f1410x0, MotionLayout.this.f1411y0);
            MotionLayout.this.m1757l();
        }

        /* renamed from: c */
        public void mo2186c(int i, int i2) {
            this.f1437e = i;
            this.f1438f = i2;
        }

        /* renamed from: b */
        public void mo2185b(int i, int i2) {
            int mode = MeasureSpec.getMode(i);
            int size = MeasureSpec.getSize(i);
            int mode2 = MeasureSpec.getMode(i2);
            int size2 = MeasureSpec.getSize(i2);
            int optimizationLevel = MotionLayout.this.getOptimizationLevel();
            MotionLayout motionLayout = MotionLayout.this;
            if (motionLayout.f1408v0 == motionLayout.getStartState()) {
                this.f1434b.mo14418a(optimizationLevel, mode, size, mode2, size2, 0, 0);
                if (this.f1435c != null) {
                    this.f1433a.mo14418a(optimizationLevel, mode, size, mode2, size2, 0, 0);
                    return;
                }
                return;
            }
            if (this.f1435c != null) {
                this.f1433a.mo14418a(optimizationLevel, mode, size, mode2, size2, 0, 0);
            }
            this.f1434b.mo14418a(optimizationLevel, mode, size, mode2, size2, 0, 0);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo2181a(C3976g gVar, C0425d dVar, C0425d dVar2) {
            this.f1435c = dVar;
            this.f1436d = dVar2;
            this.f1433a.mo14421a(MotionLayout.this.f1741W.mo14413V());
            this.f1434b.mo14421a(MotionLayout.this.f1741W.mo14413V());
            this.f1433a.mo14502U();
            this.f1434b.mo14502U();
            mo2182a(MotionLayout.this.f1741W, this.f1433a);
            mo2182a(MotionLayout.this.f1741W, this.f1434b);
            if (dVar != null) {
                m1791a(this.f1433a, dVar);
            }
            m1791a(this.f1434b, dVar2);
            this.f1433a.mo14432f0();
            this.f1434b.mo14432f0();
        }

        /* renamed from: a */
        private void m1791a(C3976g gVar, C0425d dVar) {
            SparseArray sparseArray = new SparseArray();
            C0432a aVar = new C0432a(-2, -2);
            sparseArray.clear();
            sparseArray.put(0, gVar);
            Iterator it = gVar.mo14286R().iterator();
            while (it.hasNext()) {
                C3973f fVar = (C3973f) it.next();
                sparseArray.put(((View) fVar.mo14370f()).getId(), fVar);
            }
            Iterator it2 = gVar.mo14286R().iterator();
            while (it2.hasNext()) {
                C3973f fVar2 = (C3973f) it2.next();
                View view = (View) fVar2.mo14370f();
                dVar.mo2415a(view.getId(), (C0415c) aVar);
                fVar2.mo14401u(dVar.mo2434e(view.getId()));
                fVar2.mo14384m(dVar.mo2410a(view.getId()));
                if (view instanceof C0421b) {
                    dVar.mo2420a((C0421b) view, fVar2, (C0415c) aVar, sparseArray);
                    if (view instanceof Barrier) {
                        ((Barrier) view).mo2398a();
                    }
                }
                if (VERSION.SDK_INT >= 17) {
                    aVar.resolveLayoutDirection(MotionLayout.this.getLayoutDirection());
                } else {
                    aVar.resolveLayoutDirection(0);
                }
                MotionLayout.this.mo2354a(false, view, fVar2, aVar, sparseArray);
                if (dVar.mo2431d(view.getId()) == 1) {
                    fVar2.mo14398t(view.getVisibility());
                } else {
                    fVar2.mo14398t(dVar.mo2428c(view.getId()));
                }
            }
            Iterator it3 = gVar.mo14286R().iterator();
            while (it3.hasNext()) {
                C3973f fVar3 = (C3973f) it3.next();
                if (fVar3 instanceof C3982k) {
                    C3982k kVar = (C3982k) fVar3;
                    kVar.mo14464a();
                    ((C0421b) fVar3.mo14370f()).mo2399a(gVar, kVar, sparseArray);
                    if (kVar instanceof C3991s) {
                        ((C3991s) kVar).mo14286R();
                    }
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public C3973f mo2179a(C3976g gVar, View view) {
            if (gVar.mo14370f() == view) {
                return gVar;
            }
            ArrayList R = gVar.mo14286R();
            int size = R.size();
            for (int i = 0; i < size; i++) {
                C3973f fVar = (C3973f) R.get(i);
                if (fVar.mo14370f() == view) {
                    return fVar;
                }
            }
            return null;
        }

        /* renamed from: a */
        public void mo2180a() {
            int childCount = MotionLayout.this.getChildCount();
            MotionLayout.this.f1412z0.clear();
            for (int i = 0; i < childCount; i++) {
                View childAt = MotionLayout.this.getChildAt(i);
                MotionLayout.this.f1412z0.put(childAt, new C0354o(childAt));
            }
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt2 = MotionLayout.this.getChildAt(i2);
                C0354o oVar = (C0354o) MotionLayout.this.f1412z0.get(childAt2);
                if (oVar != null) {
                    String str = ")";
                    String str2 = " (";
                    String str3 = "no widget for  ";
                    String str4 = "MotionLayout";
                    if (this.f1435c != null) {
                        C3973f a = mo2179a(this.f1433a, childAt2);
                        if (a != null) {
                            oVar.mo2240b(a, this.f1435c);
                        } else {
                            StringBuilder sb = new StringBuilder();
                            sb.append(C0319b.m1805a());
                            sb.append(str3);
                            sb.append(C0319b.m1806a(childAt2));
                            sb.append(str2);
                            sb.append(childAt2.getClass().getName());
                            sb.append(str);
                            Log.e(str4, sb.toString());
                        }
                    }
                    C3973f a2 = mo2179a(this.f1434b, childAt2);
                    if (a2 != null) {
                        oVar.mo2234a(a2, this.f1436d);
                    } else {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(C0319b.m1805a());
                        sb2.append(str3);
                        sb2.append(C0319b.m1806a(childAt2));
                        sb2.append(str2);
                        sb2.append(childAt2.getClass().getName());
                        sb2.append(str);
                        Log.e(str4, sb2.toString());
                    }
                }
            }
        }

        /* renamed from: a */
        public boolean mo2183a(int i, int i2) {
            return (i == this.f1437e && i2 == this.f1438f) ? false : true;
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.MotionLayout$d */
    public interface C0317d {
        /* renamed from: a */
        void mo2187a(MotionLayout motionLayout, int i);

        /* renamed from: a */
        void mo2188a(MotionLayout motionLayout, int i, int i2);

        /* renamed from: a */
        void mo2189a(MotionLayout motionLayout, int i, int i2, float f);

        /* renamed from: a */
        void mo2190a(MotionLayout motionLayout, int i, boolean z, float f);

        /* renamed from: a */
        boolean mo2191a(C0360b bVar);
    }

    public MotionLayout(Context context) {
        super(context);
        m1740a((AttributeSet) null);
    }

    /* renamed from: a */
    private static boolean m1742a(float f, float f2, float f3) {
        boolean z = true;
        if (f > 0.0f) {
            float f4 = f / f3;
            if (f2 + ((f * f4) - (((f3 * f4) * f4) / 2.0f)) <= 1.0f) {
                z = false;
            }
            return z;
        }
        float f5 = (-f) / f3;
        if (f2 + (f * f5) + (((f3 * f5) * f5) / 2.0f) >= 0.0f) {
            z = false;
        }
        return z;
    }

    /* renamed from: j */
    private void m1755j() {
        C0358s sVar = this.f1404r0;
        if (sVar != null && !sVar.mo2278b(this, this.f1408v0)) {
            int i = this.f1408v0;
            if (i != -1) {
                this.f1404r0.mo2271a(this, i);
            }
            if (this.f1404r0.mo2289l()) {
                this.f1404r0.mo2288k();
            }
        }
    }

    /* renamed from: k */
    private void m1756k() {
        if (this.f1378I0 != null) {
            Iterator it = this.f1403h1.iterator();
            while (it.hasNext()) {
                this.f1378I0.mo2187a(this, ((Integer) it.next()).intValue());
            }
            this.f1403h1.clear();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: l */
    public void m1757l() {
        int childCount = getChildCount();
        this.f1401f1.mo2180a();
        boolean z = true;
        this.f1377H0 = true;
        int width = getWidth();
        int height = getHeight();
        int i = 0;
        for (int i2 = 0; i2 < childCount; i2++) {
            C0354o oVar = (C0354o) this.f1412z0.get(getChildAt(i2));
            if (oVar != null) {
                this.f1404r0.mo2272a(oVar);
                oVar.mo2231a(width, height, this.f1371B0);
            }
        }
        float i3 = this.f1404r0.mo2286i();
        if (i3 != 0.0f) {
            boolean z2 = ((double) i3) < 0.0d;
            float abs = Math.abs(i3);
            float f = -3.4028235E38f;
            float f2 = Float.MAX_VALUE;
            int i4 = 0;
            float f3 = Float.MAX_VALUE;
            float f4 = -3.4028235E38f;
            while (true) {
                if (i4 >= childCount) {
                    z = false;
                    break;
                }
                C0354o oVar2 = (C0354o) this.f1412z0.get(getChildAt(i4));
                if (!Float.isNaN(oVar2.f1599j)) {
                    break;
                }
                float b = oVar2.mo2238b();
                float c = oVar2.mo2241c();
                float f5 = z2 ? c - b : c + b;
                f3 = Math.min(f3, f5);
                f4 = Math.max(f4, f5);
                i4++;
            }
            if (z) {
                for (int i5 = 0; i5 < childCount; i5++) {
                    C0354o oVar3 = (C0354o) this.f1412z0.get(getChildAt(i5));
                    if (!Float.isNaN(oVar3.f1599j)) {
                        f2 = Math.min(f2, oVar3.f1599j);
                        f = Math.max(f, oVar3.f1599j);
                    }
                }
                while (i < childCount) {
                    C0354o oVar4 = (C0354o) this.f1412z0.get(getChildAt(i));
                    if (!Float.isNaN(oVar4.f1599j)) {
                        oVar4.f1601l = 1.0f / (1.0f - abs);
                        if (z2) {
                            oVar4.f1600k = abs - (((f - oVar4.f1599j) / (f - f2)) * abs);
                        } else {
                            oVar4.f1600k = abs - (((oVar4.f1599j - f2) * abs) / (f - f2));
                        }
                    }
                    i++;
                }
                return;
            }
            while (i < childCount) {
                C0354o oVar5 = (C0354o) this.f1412z0.get(getChildAt(i));
                float b2 = oVar5.mo2238b();
                float c2 = oVar5.mo2241c();
                float f6 = z2 ? c2 - b2 : c2 + b2;
                oVar5.f1601l = 1.0f / (1.0f - abs);
                oVar5.f1600k = abs - (((f6 - f3) * abs) / (f4 - f3));
                i++;
            }
        }
    }

    /* renamed from: a */
    public void mo1078a(View view, int i, int i2, int i3, int i4, int i5) {
    }

    /* renamed from: a */
    public boolean mo1082a(View view, View view2, int i, int i2) {
        return true;
    }

    /* renamed from: b */
    public void mo1084b(View view, View view2, int i, int i2) {
    }

    /* access modifiers changed from: protected */
    public void dispatchDraw(Canvas canvas) {
        String str;
        mo2139a(false);
        super.dispatchDraw(canvas);
        if (this.f1404r0 != null) {
            if ((this.f1381L0 & 1) == 1 && !isInEditMode()) {
                this.f1396a1++;
                long nanoTime = System.nanoTime();
                long j = this.f1397b1;
                if (j != -1) {
                    long j2 = nanoTime - j;
                    if (j2 > 200000000) {
                        this.f1398c1 = ((float) ((int) ((((float) this.f1396a1) / (((float) j2) * 1.0E-9f)) * 100.0f))) / 100.0f;
                        this.f1396a1 = 0;
                        this.f1397b1 = nanoTime;
                    }
                } else {
                    this.f1397b1 = nanoTime;
                }
                Paint paint = new Paint();
                paint.setTextSize(42.0f);
                float progress = ((float) ((int) (getProgress() * 1000.0f))) / 10.0f;
                StringBuilder sb = new StringBuilder();
                sb.append(this.f1398c1);
                sb.append(" fps ");
                sb.append(C0319b.m1807a(this, this.f1407u0));
                sb.append(" -> ");
                String sb2 = sb.toString();
                StringBuilder sb3 = new StringBuilder();
                sb3.append(sb2);
                sb3.append(C0319b.m1807a(this, this.f1409w0));
                sb3.append(" (progress: ");
                sb3.append(progress);
                sb3.append(" ) state=");
                int i = this.f1408v0;
                if (i == -1) {
                    str = "undefined";
                } else {
                    str = C0319b.m1807a(this, i);
                }
                sb3.append(str);
                String sb4 = sb3.toString();
                paint.setColor(-16777216);
                canvas.drawText(sb4, 11.0f, (float) (getHeight() - 29), paint);
                paint.setColor(-7864184);
                canvas.drawText(sb4, 10.0f, (float) (getHeight() - 30), paint);
            }
            if (this.f1381L0 > 1) {
                if (this.f1382M0 == null) {
                    this.f1382M0 = new C0315b();
                }
                this.f1382M0.mo2177a(canvas, this.f1412z0, this.f1404r0.mo2279c(), this.f1381L0);
            }
        }
    }

    public int[] getConstraintSetIds() {
        C0358s sVar = this.f1404r0;
        if (sVar == null) {
            return null;
        }
        return sVar.mo2274a();
    }

    public int getCurrentState() {
        return this.f1408v0;
    }

    public ArrayList<C0360b> getDefinedTransitions() {
        C0358s sVar = this.f1404r0;
        if (sVar == null) {
            return null;
        }
        return sVar.mo2275b();
    }

    public C0320c getDesignTool() {
        if (this.f1386Q0 == null) {
            this.f1386Q0 = new C0320c(this);
        }
        return this.f1386Q0;
    }

    public int getEndState() {
        return this.f1409w0;
    }

    public float getProgress() {
        return this.f1373D0;
    }

    public int getStartState() {
        return this.f1407u0;
    }

    public float getTargetPosition() {
        return this.f1375F0;
    }

    public long getTransitionTimeMs() {
        C0358s sVar = this.f1404r0;
        if (sVar != null) {
            this.f1371B0 = ((float) sVar.mo2279c()) / 1000.0f;
        }
        return ((long) this.f1371B0) * 1000;
    }

    public float getVelocity() {
        Interpolator interpolator = this.f1405s0;
        if (interpolator == null) {
            return this.f1406t0;
        }
        if (interpolator instanceof C0356q) {
            return ((C0356q) interpolator).mo2173a();
        }
        return 0.0f;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        C0358s sVar = this.f1404r0;
        if (sVar != null) {
            int i = this.f1408v0;
            if (i != -1) {
                C0425d a = sVar.mo2265a(i);
                this.f1404r0.mo2270a(this);
                if (a != null) {
                    a.mo2427b((ConstraintLayout) this);
                }
            }
        }
        m1755j();
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (this.f1404r0 == null) {
            super.onLayout(z, i, i2, i3, i4);
            return;
        }
        int i5 = i3 - i;
        int i6 = i4 - i2;
        if (!(this.f1387R0 == i5 && this.f1388S0 == i6)) {
            mo2144c();
            mo2139a(true);
        }
        this.f1387R0 = i5;
        this.f1388S0 = i6;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        if (this.f1404r0 == null) {
            super.onMeasure(i, i2);
            return;
        }
        boolean z = (this.f1410x0 == i && this.f1411y0 == i2) ? false : true;
        if (this.f1402g1) {
            this.f1402g1 = false;
            m1755j();
            m1756k();
            z = true;
        }
        if (this.f1747e0) {
            z = true;
        }
        this.f1410x0 = i;
        this.f1411y0 = i2;
        int j = this.f1404r0.mo2287j();
        int d = this.f1404r0.mo2281d();
        if (z || this.f1401f1.mo2183a(j, d)) {
            super.onMeasure(i, i2);
            this.f1401f1.mo2181a(this.f1741W, this.f1404r0.mo2265a(j), this.f1404r0.mo2265a(d));
            this.f1401f1.mo2184b();
            this.f1401f1.mo2186c(j, d);
        } else {
            setMeasuredDimension(this.f1741W.mo14316B() + getPaddingLeft() + getPaddingRight(), this.f1741W.mo14381l() + getPaddingTop() + getPaddingBottom());
        }
        m1750g();
    }

    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        return false;
    }

    public boolean onNestedPreFling(View view, float f, float f2) {
        return false;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        C0358s sVar = this.f1404r0;
        if (sVar == null || !sVar.mo2289l()) {
            return super.onTouchEvent(motionEvent);
        }
        this.f1404r0.mo2269a(motionEvent, getCurrentState(), this);
        return true;
    }

    public void onViewAdded(View view) {
        super.onViewAdded(view);
        if (view instanceof C0355p) {
            C0355p pVar = (C0355p) view;
            if (pVar.mo2245c()) {
                if (this.f1394Y0 == null) {
                    this.f1394Y0 = new ArrayList<>();
                }
                this.f1394Y0.add(pVar);
            }
            if (pVar.mo2244b()) {
                if (this.f1395Z0 == null) {
                    this.f1395Z0 = new ArrayList<>();
                }
                this.f1395Z0.add(pVar);
            }
        }
    }

    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        ArrayList<C0355p> arrayList = this.f1394Y0;
        if (arrayList != null) {
            arrayList.remove(view);
        }
        ArrayList<C0355p> arrayList2 = this.f1395Z0;
        if (arrayList2 != null) {
            arrayList2.remove(view);
        }
    }

    public void setDebugMode(int i) {
        this.f1381L0 = i;
        invalidate();
    }

    public void setInterpolatedProgress(float f) {
        if (f <= 0.0f) {
            this.f1408v0 = this.f1407u0;
        } else if (f >= 1.0f) {
            this.f1408v0 = this.f1409w0;
        } else {
            this.f1408v0 = -1;
        }
        C0358s sVar = this.f1404r0;
        if (sVar != null) {
            sVar.mo2287j();
            this.f1404r0.mo2281d();
            this.f1375F0 = this.f1404r0.mo2282e().getInterpolation(f);
            this.f1372C0 = this.f1375F0;
            this.f1370A0 = -1;
            this.f1405s0 = null;
            this.f1376G0 = true;
            this.f1374E0 = System.nanoTime();
            this.f1377H0 = true;
            invalidate();
        }
    }

    public void setOnHide(float f) {
        ArrayList<C0355p> arrayList = this.f1395Z0;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((C0355p) this.f1395Z0.get(i)).setProgress(f);
            }
        }
    }

    public void setOnShow(float f) {
        ArrayList<C0355p> arrayList = this.f1394Y0;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((C0355p) this.f1394Y0.get(i)).setProgress(f);
            }
        }
    }

    public void setProgress(float f) {
        if (f <= 0.0f) {
            this.f1408v0 = this.f1407u0;
        } else if (f >= 1.0f) {
            this.f1408v0 = this.f1409w0;
        } else {
            this.f1408v0 = -1;
        }
        C0358s sVar = this.f1404r0;
        if (sVar != null) {
            sVar.mo2287j();
            this.f1404r0.mo2281d();
            this.f1375F0 = f;
            this.f1372C0 = f;
            this.f1370A0 = -1;
            this.f1405s0 = null;
            this.f1376G0 = true;
            this.f1374E0 = System.nanoTime();
            this.f1377H0 = true;
            invalidate();
        }
    }

    /* access modifiers changed from: protected */
    public void setTransition(C0360b bVar) {
        this.f1404r0.mo2273a(bVar);
        if (this.f1408v0 == this.f1404r0.mo2281d()) {
            this.f1373D0 = 1.0f;
            this.f1372C0 = 1.0f;
            this.f1375F0 = 1.0f;
        } else {
            this.f1373D0 = 0.0f;
            this.f1372C0 = 0.0f;
            this.f1375F0 = 0.0f;
        }
        this.f1374E0 = System.nanoTime();
        int j = this.f1404r0.mo2287j();
        int d = this.f1404r0.mo2281d();
        if (j != this.f1407u0 || d != this.f1409w0) {
            this.f1407u0 = j;
            this.f1409w0 = d;
            this.f1404r0.mo2268a(this.f1407u0, this.f1409w0);
            this.f1401f1.mo2181a(this.f1741W, this.f1404r0.mo2265a(this.f1407u0), this.f1404r0.mo2265a(this.f1409w0));
            this.f1401f1.mo2186c(this.f1407u0, this.f1409w0);
            this.f1401f1.mo2184b();
            mo2144c();
            C0317d dVar = this.f1378I0;
            if (dVar != null) {
                dVar.mo2188a(this, this.f1407u0, this.f1409w0);
            }
        }
    }

    public void setTransitionDuration(int i) {
        C0358s sVar = this.f1404r0;
        if (sVar == null) {
            Log.e("MotionLayout", "MotionScene not defined");
        } else {
            sVar.mo2280c(i);
        }
    }

    public void setTransitionListener(C0317d dVar) {
        this.f1378I0 = dVar;
    }

    /* renamed from: f */
    private void m1748f() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            C0354o oVar = (C0354o) this.f1412z0.get(childAt);
            if (oVar != null) {
                oVar.mo2232a(childAt);
            }
        }
    }

    /* renamed from: g */
    private void m1750g() {
        boolean z;
        float signum = Math.signum(this.f1375F0 - this.f1373D0);
        long nanoTime = System.nanoTime();
        float f = this.f1373D0 + (!(this.f1405s0 instanceof C3952g) ? ((((float) (nanoTime - this.f1374E0)) * signum) * 1.0E-9f) / this.f1371B0 : 0.0f);
        if (this.f1376G0) {
            f = this.f1375F0;
        }
        int i = (signum > 0.0f ? 1 : (signum == 0.0f ? 0 : -1));
        if ((i <= 0 || f < this.f1375F0) && (signum > 0.0f || f > this.f1375F0)) {
            z = false;
        } else {
            f = this.f1375F0;
            z = true;
        }
        Interpolator interpolator = this.f1405s0;
        if (interpolator != null && !z) {
            if (this.f1383N0) {
                f = interpolator.getInterpolation(((float) (nanoTime - this.f1370A0)) * 1.0E-9f);
            } else {
                f = interpolator.getInterpolation(f);
            }
        }
        if ((i > 0 && f >= this.f1375F0) || (signum <= 0.0f && f <= this.f1375F0)) {
            f = this.f1375F0;
        }
        int childCount = getChildCount();
        long nanoTime2 = System.nanoTime();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            C0354o oVar = (C0354o) this.f1412z0.get(childAt);
            if (oVar != null) {
                oVar.mo2237a(childAt, f, nanoTime2);
            }
        }
    }

    /* renamed from: h */
    private void m1751h() {
        C0317d dVar = this.f1378I0;
        if (dVar != null && this.f1400e1 != this.f1372C0) {
            if (this.f1399d1 != -1) {
                dVar.mo2188a(this, this.f1407u0, this.f1409w0);
            }
            this.f1399d1 = -1;
            float f = this.f1372C0;
            this.f1400e1 = f;
            this.f1378I0.mo2189a(this, this.f1407u0, this.f1409w0, f);
        }
    }

    /* renamed from: i */
    private void m1754i() {
        if (this.f1378I0 != null) {
            int i = -1;
            if (this.f1399d1 == -1) {
                this.f1399d1 = this.f1408v0;
                if (!this.f1403h1.isEmpty()) {
                    ArrayList<Integer> arrayList = this.f1403h1;
                    i = ((Integer) arrayList.get(arrayList.size() - 1)).intValue();
                }
                int i2 = this.f1408v0;
                if (i != i2) {
                    this.f1403h1.add(Integer.valueOf(i2));
                }
            }
        }
    }

    /* renamed from: b */
    public void mo2142b(int i, int i2) {
        C0358s sVar = this.f1404r0;
        if (sVar != null) {
            this.f1407u0 = i;
            this.f1409w0 = i2;
            sVar.mo2268a(i, i2);
            this.f1401f1.mo2181a(this.f1741W, this.f1404r0.mo2265a(i), this.f1404r0.mo2265a(i2));
            mo2144c();
            this.f1373D0 = 0.0f;
            mo2148e();
        }
    }

    /* renamed from: c */
    public void mo2145c(int i) {
        mo2143b(i, -1, -1);
    }

    /* renamed from: d */
    public void mo2146d() {
        mo2134a(1.0f);
    }

    /* renamed from: e */
    public void mo2148e() {
        mo2134a(0.0f);
    }

    /* renamed from: c */
    public void mo2144c() {
        this.f1401f1.mo2184b();
        invalidate();
    }

    /* renamed from: a */
    public void mo2137a(int i, int i2, int i3) {
        this.f1408v0 = i;
        this.f1407u0 = -1;
        this.f1409w0 = -1;
        C0422c cVar = this.f1750h0;
        if (cVar != null) {
            cVar.mo2405a(i, (float) i2, (float) i3);
            return;
        }
        C0358s sVar = this.f1404r0;
        if (sVar != null) {
            sVar.mo2265a(i).mo2427b((ConstraintLayout) this);
        }
    }

    /* renamed from: b */
    public void mo2143b(int i, int i2, int i3) {
        C0358s sVar = this.f1404r0;
        if (sVar != null) {
            C0437j jVar = sVar.f1636b;
            if (jVar != null) {
                int a = jVar.mo2459a(this.f1408v0, i, (float) i2, (float) i3);
                if (a != -1) {
                    i = a;
                }
            }
        }
        int i4 = this.f1408v0;
        if (i4 != i) {
            if (this.f1407u0 == i) {
                mo2134a(0.0f);
            } else if (this.f1409w0 == i) {
                mo2134a(1.0f);
            } else {
                this.f1409w0 = i;
                if (i4 != -1) {
                    mo2142b(i4, i);
                    mo2134a(1.0f);
                    this.f1373D0 = 0.0f;
                    mo2146d();
                    return;
                }
                this.f1383N0 = false;
                this.f1375F0 = 1.0f;
                this.f1372C0 = 0.0f;
                this.f1373D0 = 0.0f;
                this.f1374E0 = System.nanoTime();
                this.f1370A0 = System.nanoTime();
                this.f1376G0 = false;
                this.f1405s0 = null;
                this.f1371B0 = ((float) this.f1404r0.mo2279c()) / 1000.0f;
                this.f1404r0.mo2287j();
                int childCount = getChildCount();
                this.f1412z0.clear();
                for (int i5 = 0; i5 < childCount; i5++) {
                    View childAt = getChildAt(i5);
                    this.f1412z0.put(childAt, new C0354o(childAt));
                }
                this.f1377H0 = true;
                this.f1401f1.mo2181a(this.f1741W, null, this.f1404r0.mo2265a(i));
                mo2144c();
                this.f1401f1.mo2180a();
                m1748f();
                int width = getWidth();
                int height = getHeight();
                for (int i6 = 0; i6 < childCount; i6++) {
                    C0354o oVar = (C0354o) this.f1412z0.get(getChildAt(i6));
                    this.f1404r0.mo2272a(oVar);
                    oVar.mo2231a(width, height, this.f1371B0);
                }
                float i7 = this.f1404r0.mo2286i();
                if (i7 != 0.0f) {
                    float f = Float.MAX_VALUE;
                    float f2 = -3.4028235E38f;
                    for (int i8 = 0; i8 < childCount; i8++) {
                        C0354o oVar2 = (C0354o) this.f1412z0.get(getChildAt(i8));
                        float c = oVar2.mo2241c() + oVar2.mo2238b();
                        f = Math.min(f, c);
                        f2 = Math.max(f2, c);
                    }
                    for (int i9 = 0; i9 < childCount; i9++) {
                        C0354o oVar3 = (C0354o) this.f1412z0.get(getChildAt(i9));
                        float b = oVar3.mo2238b();
                        float c2 = oVar3.mo2241c();
                        oVar3.f1601l = 1.0f / (1.0f - i7);
                        oVar3.f1600k = i7 - ((((b + c2) - f) * i7) / (f2 - f));
                    }
                }
                this.f1372C0 = 0.0f;
                this.f1373D0 = 0.0f;
                this.f1377H0 = true;
                invalidate();
            }
        }
    }

    /* renamed from: a */
    public void mo2135a(int i, float f, float f2) {
        if (this.f1404r0 != null && this.f1373D0 != f) {
            this.f1383N0 = true;
            this.f1370A0 = System.nanoTime();
            this.f1371B0 = ((float) this.f1404r0.mo2279c()) / 1000.0f;
            this.f1375F0 = f;
            this.f1377H0 = true;
            float f3 = 1.0f;
            if (i == 0 || i == 1 || i == 2) {
                if (i == 1) {
                    f = 0.0f;
                } else if (i == 2) {
                    f = 1.0f;
                }
                this.f1384O0.mo14209a(this.f1373D0, f, f2, this.f1371B0, this.f1404r0.mo2283f(), this.f1404r0.mo2284g());
                int i2 = this.f1408v0;
                if (f != 0.0f) {
                    f3 = 0.0f;
                }
                setProgress(f3);
                this.f1408v0 = i2;
                this.f1405s0 = this.f1384O0;
            } else if (i != 3) {
                if (i == 4) {
                    this.f1385P0.mo2174a(f2, this.f1373D0, this.f1404r0.mo2283f());
                    this.f1405s0 = this.f1385P0;
                } else if (i == 5) {
                    if (m1742a(f2, this.f1373D0, this.f1404r0.mo2283f())) {
                        this.f1385P0.mo2174a(f2, this.f1373D0, this.f1404r0.mo2283f());
                        this.f1405s0 = this.f1385P0;
                    } else {
                        this.f1384O0.mo14209a(this.f1373D0, f, f2, this.f1371B0, this.f1404r0.mo2283f(), this.f1404r0.mo2284g());
                        this.f1406t0 = 0.0f;
                        int i3 = this.f1408v0;
                        if (f != 0.0f) {
                            f3 = 0.0f;
                        }
                        setProgress(f3);
                        this.f1408v0 = i3;
                        this.f1405s0 = this.f1384O0;
                    }
                }
            }
            this.f1376G0 = false;
            this.f1370A0 = System.nanoTime();
            invalidate();
        }
    }

    public MotionLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m1740a(attributeSet);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo2134a(float f) {
        C0358s sVar = this.f1404r0;
        if (sVar != null) {
            float f2 = this.f1373D0;
            if (f2 != f) {
                this.f1383N0 = false;
                this.f1375F0 = f;
                this.f1371B0 = ((float) sVar.mo2279c()) / 1000.0f;
                setProgress(this.f1375F0);
                this.f1405s0 = this.f1404r0.mo2282e();
                this.f1376G0 = false;
                this.f1370A0 = System.nanoTime();
                this.f1377H0 = true;
                this.f1372C0 = f2;
                this.f1373D0 = f2;
                invalidate();
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo2140a(C0360b bVar) {
        C0317d dVar = this.f1378I0;
        if (dVar != null) {
            return dVar.mo2191a(bVar);
        }
        return true;
    }

    /* renamed from: a */
    public void mo1077a(View view, int i) {
        C0358s sVar = this.f1404r0;
        if (sVar != null) {
            float f = this.f1389T0;
            float f2 = this.f1392W0;
            sVar.mo2277b(f / f2, this.f1390U0 / f2);
        }
    }

    /* renamed from: a */
    public void mo1080a(View view, int i, int i2, int[] iArr, int i3) {
        C0358s sVar = this.f1404r0;
        if (sVar != null) {
            if (sVar == null || !sVar.mo2285h() || this.f1372C0 != 1.0f || !view.canScrollVertically(-1)) {
                float f = this.f1372C0;
                long nanoTime = System.nanoTime();
                float f2 = (float) i;
                this.f1389T0 = f2;
                float f3 = (float) i2;
                this.f1390U0 = f3;
                this.f1392W0 = (float) (((double) (nanoTime - this.f1391V0)) * 1.0E-9d);
                this.f1391V0 = nanoTime;
                this.f1404r0.mo2267a(f2, f3);
                if (f != this.f1372C0) {
                    iArr[0] = i;
                    iArr[1] = i2;
                }
                mo2139a(false);
            }
        }
    }

    public MotionLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m1740a(attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo2141b(int i) {
        this.f1750h0 = null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo2139a(boolean z) {
        boolean z2;
        float f = this.f1373D0;
        if (f > 0.0f && f < 1.0f) {
            this.f1408v0 = -1;
        }
        boolean z3 = false;
        if (this.f1393X0 || (this.f1377H0 && (z || this.f1375F0 != this.f1373D0))) {
            float signum = Math.signum(this.f1375F0 - this.f1373D0);
            long nanoTime = System.nanoTime();
            float f2 = this.f1373D0 + (!(this.f1405s0 instanceof C3952g) ? ((((float) (nanoTime - this.f1374E0)) * signum) * 1.0E-9f) / this.f1371B0 : 0.0f);
            if (this.f1376G0) {
                f2 = this.f1375F0;
            }
            int i = (signum > 0.0f ? 1 : (signum == 0.0f ? 0 : -1));
            if ((i <= 0 || f2 < this.f1375F0) && (signum > 0.0f || f2 > this.f1375F0)) {
                z2 = false;
            } else {
                f2 = this.f1375F0;
                this.f1377H0 = false;
                z2 = true;
            }
            this.f1373D0 = f2;
            this.f1374E0 = nanoTime;
            if (this.f1378I0 != null) {
                m1751h();
            }
            Interpolator interpolator = this.f1405s0;
            if (interpolator != null && !z2) {
                if (this.f1383N0) {
                    f2 = interpolator.getInterpolation(((float) (nanoTime - this.f1370A0)) * 1.0E-9f);
                    this.f1373D0 = f2;
                    this.f1374E0 = nanoTime;
                    Interpolator interpolator2 = this.f1405s0;
                    if ((interpolator2 instanceof C0356q) && Math.abs(((C0356q) interpolator2).mo2173a()) <= 1.0E-4f) {
                        this.f1377H0 = false;
                    }
                } else {
                    f2 = interpolator.getInterpolation(f2);
                }
            }
            if ((i > 0 && f2 >= this.f1375F0) || (signum <= 0.0f && f2 <= this.f1375F0)) {
                f2 = this.f1375F0;
                this.f1377H0 = false;
            }
            if (f2 >= 1.0f || f2 <= 0.0f) {
                this.f1377H0 = false;
            }
            int childCount = getChildCount();
            this.f1393X0 = false;
            long nanoTime2 = System.nanoTime();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                C0354o oVar = (C0354o) this.f1412z0.get(childAt);
                if (oVar != null) {
                    this.f1393X0 = oVar.mo2237a(childAt, f2, nanoTime2) | this.f1393X0;
                }
            }
            if (this.f1393X0) {
                invalidate();
            }
            if (this.f1377H0) {
                invalidate();
            }
            if (f2 <= 0.0f) {
                int i3 = this.f1407u0;
                if (i3 != -1) {
                    if (this.f1408v0 != i3) {
                        z3 = true;
                    }
                    int i4 = this.f1407u0;
                    this.f1408v0 = i4;
                    this.f1404r0.mo2265a(i4).mo2418a((ConstraintLayout) this);
                }
            }
            if (((double) f2) >= 1.0d) {
                if (this.f1408v0 != this.f1409w0) {
                    z3 = true;
                }
                int i5 = this.f1409w0;
                this.f1408v0 = i5;
                this.f1404r0.mo2265a(i5).mo2418a((ConstraintLayout) this);
            }
        }
        float f3 = this.f1373D0;
        if (f3 >= 1.0f) {
            if (this.f1408v0 != this.f1409w0) {
                z3 = true;
            }
            this.f1408v0 = this.f1409w0;
        } else if (f3 <= 0.0f) {
            if (this.f1408v0 != this.f1407u0) {
                z3 = true;
            }
            this.f1408v0 = this.f1407u0;
        }
        this.f1402g1 |= z3;
        if (VERSION.SDK_INT >= 18 && z3 && !isInLayout()) {
            requestLayout();
        }
        if (z3) {
            m1754i();
        }
        this.f1372C0 = this.f1373D0;
    }

    /* renamed from: a */
    private void m1740a(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C0436i.MotionLayout);
            int indexCount = obtainStyledAttributes.getIndexCount();
            boolean z = true;
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == C0436i.MotionLayout_layoutDescription) {
                    this.f1404r0 = new C0358s(getContext(), this, obtainStyledAttributes.getResourceId(index, -1));
                } else if (index == C0436i.MotionLayout_currentState) {
                    this.f1408v0 = obtainStyledAttributes.getResourceId(index, -1);
                } else if (index == C0436i.MotionLayout_motionProgress) {
                    this.f1375F0 = obtainStyledAttributes.getFloat(index, 0.0f);
                    this.f1377H0 = true;
                } else if (index == C0436i.MotionLayout_applyMotionScene) {
                    z = obtainStyledAttributes.getBoolean(index, z);
                } else if (index == C0436i.MotionLayout_showPaths) {
                    if (this.f1381L0 == 0) {
                        this.f1381L0 = obtainStyledAttributes.getBoolean(index, false) ? 2 : 0;
                    }
                } else if (index == C0436i.MotionLayout_motionDebug) {
                    this.f1381L0 = obtainStyledAttributes.getInt(index, 0);
                }
            }
            obtainStyledAttributes.recycle();
            if (this.f1404r0 == null) {
                Log.e("MotionLayout", "WARNING NO app:layoutDescription tag");
            }
            if (!z) {
                this.f1404r0 = null;
            }
        }
        if (this.f1408v0 == -1) {
            C0358s sVar = this.f1404r0;
            if (sVar != null) {
                this.f1408v0 = sVar.mo2287j();
                this.f1407u0 = this.f1404r0.mo2287j();
                this.f1409w0 = this.f1404r0.mo2281d();
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo2136a(int i, float f, float f2, float f3, float[] fArr) {
        String str;
        HashMap<View, C0354o> hashMap = this.f1412z0;
        View a = mo2349a(i);
        C0354o oVar = (C0354o) hashMap.get(a);
        if (oVar != null) {
            oVar.mo2229a(f, f2, f3, fArr);
            float y = a.getY();
            int i2 = ((f - this.f1379J0) > 0.0f ? 1 : ((f - this.f1379J0) == 0.0f ? 0 : -1));
            this.f1379J0 = f;
            this.f1380K0 = y;
            return;
        }
        if (a == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("");
            sb.append(i);
            str = sb.toString();
        } else {
            str = a.getContext().getResources().getResourceName(i);
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("WARNING could not find view id ");
        sb2.append(str);
        Log.w("MotionLayout", sb2.toString());
    }

    /* renamed from: a */
    public void mo2138a(int i, boolean z, float f) {
        C0317d dVar = this.f1378I0;
        if (dVar != null) {
            dVar.mo2190a(this, i, z, f);
        }
    }
}
