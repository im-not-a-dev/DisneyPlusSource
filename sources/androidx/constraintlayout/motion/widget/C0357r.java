package androidx.constraintlayout.motion.widget;

import android.view.View;
import android.view.View.MeasureSpec;
import androidx.constraintlayout.widget.C0418a;
import androidx.constraintlayout.widget.C0418a.C0420b;
import androidx.constraintlayout.widget.C0425d.C0426a;
import androidx.constraintlayout.widget.C0425d.C0428c;
import java.util.Arrays;
import java.util.LinkedHashMap;
import p096e.p114f.p115a.p116a.C3947c;

/* renamed from: androidx.constraintlayout.motion.widget.r */
/* compiled from: MotionPaths */
class C0357r implements Comparable<C0357r> {

    /* renamed from: h0 */
    static String[] f1620h0 = {"position", "x", "y", "width", "height", "pathRotate"};

    /* renamed from: U */
    int f1621U = 0;

    /* renamed from: V */
    float f1622V;

    /* renamed from: W */
    float f1623W;

    /* renamed from: X */
    float f1624X;

    /* renamed from: Y */
    float f1625Y;

    /* renamed from: Z */
    float f1626Z;

    /* renamed from: a0 */
    float f1627a0;

    /* renamed from: b0 */
    float f1628b0 = Float.NaN;

    /* renamed from: c */
    C3947c f1629c;

    /* renamed from: c0 */
    int f1630c0 = C0321d.f1442e;

    /* renamed from: d0 */
    LinkedHashMap<String, C0418a> f1631d0 = new LinkedHashMap<>();

    /* renamed from: e0 */
    int f1632e0 = 0;

    /* renamed from: f0 */
    double[] f1633f0 = new double[18];

    /* renamed from: g0 */
    double[] f1634g0 = new double[18];

    public C0357r() {
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo2255a(C0344i iVar, C0357r rVar, C0357r rVar2) {
        C0344i iVar2 = iVar;
        C0357r rVar3 = rVar;
        C0357r rVar4 = rVar2;
        float f = ((float) iVar2.f1443a) / 100.0f;
        this.f1622V = f;
        this.f1621U = iVar2.f1505i;
        float f2 = Float.isNaN(iVar2.f1506j) ? f : iVar2.f1506j;
        float f3 = Float.isNaN(iVar2.f1507k) ? f : iVar2.f1507k;
        float f4 = rVar4.f1626Z;
        float f5 = rVar3.f1626Z;
        float f6 = f4 - f5;
        float f7 = rVar4.f1627a0;
        float f8 = rVar3.f1627a0;
        float f9 = f7 - f8;
        this.f1623W = this.f1622V;
        float f10 = rVar3.f1624X;
        float f11 = (f5 / 2.0f) + f10;
        float f12 = rVar3.f1625Y;
        float f13 = (rVar4.f1624X + (f4 / 2.0f)) - f11;
        float f14 = (rVar4.f1625Y + (f7 / 2.0f)) - (f12 + (f8 / 2.0f));
        float f15 = f6 * f2;
        float f16 = f15 / 2.0f;
        this.f1624X = (float) ((int) ((f10 + (f13 * f)) - f16));
        float f17 = f9 * f3;
        float f18 = f17 / 2.0f;
        this.f1625Y = (float) ((int) ((f12 + (f14 * f)) - f18));
        this.f1626Z = (float) ((int) (f5 + f15));
        this.f1627a0 = (float) ((int) (f8 + f17));
        C0344i iVar3 = iVar;
        float f19 = Float.isNaN(iVar3.f1508l) ? f : iVar3.f1508l;
        float f20 = 0.0f;
        float f21 = Float.isNaN(iVar3.f1511o) ? 0.0f : iVar3.f1511o;
        if (!Float.isNaN(iVar3.f1509m)) {
            f = iVar3.f1509m;
        }
        if (!Float.isNaN(iVar3.f1510n)) {
            f20 = iVar3.f1510n;
        }
        this.f1632e0 = 2;
        C0357r rVar5 = rVar;
        this.f1624X = (float) ((int) (((rVar5.f1624X + (f19 * f13)) + (f20 * f14)) - f16));
        this.f1625Y = (float) ((int) (((rVar5.f1625Y + (f13 * f21)) + (f14 * f)) - f18));
        this.f1629c = C3947c.m13295a(iVar3.f1503g);
        this.f1630c0 = iVar3.f1504h;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo2260b(C0344i iVar, C0357r rVar, C0357r rVar2) {
        C0344i iVar2 = iVar;
        C0357r rVar3 = rVar;
        C0357r rVar4 = rVar2;
        float f = ((float) iVar2.f1443a) / 100.0f;
        this.f1622V = f;
        this.f1621U = iVar2.f1505i;
        float f2 = Float.isNaN(iVar2.f1506j) ? f : iVar2.f1506j;
        float f3 = Float.isNaN(iVar2.f1507k) ? f : iVar2.f1507k;
        float f4 = rVar4.f1626Z - rVar3.f1626Z;
        float f5 = rVar4.f1627a0 - rVar3.f1627a0;
        this.f1623W = this.f1622V;
        if (!Float.isNaN(iVar2.f1508l)) {
            f = iVar2.f1508l;
        }
        float f6 = rVar3.f1624X;
        float f7 = rVar3.f1626Z;
        float f8 = (f7 / 2.0f) + f6;
        float f9 = rVar3.f1625Y;
        float f10 = rVar3.f1627a0;
        float f11 = (rVar4.f1624X + (rVar4.f1626Z / 2.0f)) - f8;
        float f12 = (rVar4.f1625Y + (rVar4.f1627a0 / 2.0f)) - ((f10 / 2.0f) + f9);
        float f13 = f11 * f;
        float f14 = f4 * f2;
        float f15 = f14 / 2.0f;
        this.f1624X = (float) ((int) ((f6 + f13) - f15));
        float f16 = f * f12;
        float f17 = f5 * f3;
        float f18 = f17 / 2.0f;
        this.f1625Y = (float) ((int) ((f9 + f16) - f18));
        this.f1626Z = (float) ((int) (f7 + f14));
        this.f1627a0 = (float) ((int) (f10 + f17));
        C0344i iVar3 = iVar;
        float f19 = Float.isNaN(iVar3.f1509m) ? 0.0f : iVar3.f1509m;
        float f20 = (-f12) * f19;
        float f21 = f11 * f19;
        this.f1632e0 = 1;
        C0357r rVar5 = rVar;
        this.f1624X = (float) ((int) ((rVar5.f1624X + f13) - f15));
        this.f1625Y = (float) ((int) ((rVar5.f1625Y + f16) - f18));
        this.f1624X += f20;
        this.f1625Y += f21;
        this.f1629c = C3947c.m13295a(iVar3.f1503g);
        this.f1630c0 = iVar3.f1504h;
    }

    public C0357r(int i, int i2, C0344i iVar, C0357r rVar, C0357r rVar2) {
        int i3 = iVar.f1512p;
        if (i3 == 1) {
            mo2260b(iVar, rVar, rVar2);
        } else if (i3 != 2) {
            mo2255a(iVar, rVar, rVar2);
        } else {
            mo2253a(i, i2, iVar, rVar, rVar2);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo2253a(int i, int i2, C0344i iVar, C0357r rVar, C0357r rVar2) {
        C0344i iVar2 = iVar;
        C0357r rVar3 = rVar;
        C0357r rVar4 = rVar2;
        float f = ((float) iVar2.f1443a) / 100.0f;
        this.f1622V = f;
        this.f1621U = iVar2.f1505i;
        float f2 = Float.isNaN(iVar2.f1506j) ? f : iVar2.f1506j;
        float f3 = Float.isNaN(iVar2.f1507k) ? f : iVar2.f1507k;
        float f4 = rVar4.f1626Z;
        float f5 = rVar3.f1626Z;
        float f6 = f4 - f5;
        float f7 = rVar4.f1627a0;
        float f8 = rVar3.f1627a0;
        float f9 = f7 - f8;
        this.f1623W = this.f1622V;
        float f10 = rVar3.f1624X;
        float f11 = (f5 / 2.0f) + f10;
        float f12 = rVar3.f1625Y;
        float f13 = rVar4.f1624X + (f4 / 2.0f);
        float f14 = (rVar4.f1625Y + (f7 / 2.0f)) - (f12 + (f8 / 2.0f));
        float f15 = f6 * f2;
        this.f1624X = (float) ((int) ((f10 + ((f13 - f11) * f)) - (f15 / 2.0f)));
        float f16 = f9 * f3;
        this.f1625Y = (float) ((int) ((f12 + (f14 * f)) - (f16 / 2.0f)));
        this.f1626Z = (float) ((int) (f5 + f15));
        this.f1627a0 = (float) ((int) (f8 + f16));
        this.f1632e0 = 3;
        C0344i iVar3 = iVar;
        if (!Float.isNaN(iVar3.f1508l)) {
            this.f1624X = (float) ((int) (iVar3.f1508l * ((float) ((int) (((float) i) - this.f1626Z)))));
        }
        if (!Float.isNaN(iVar3.f1509m)) {
            this.f1625Y = (float) ((int) (iVar3.f1509m * ((float) ((int) (((float) i2) - this.f1627a0)))));
        }
        this.f1629c = C3947c.m13295a(iVar3.f1503g);
        this.f1630c0 = iVar3.f1504h;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo2261b(int[] iArr, double[] dArr, float[] fArr, int i) {
        float f = this.f1624X;
        float f2 = this.f1625Y;
        float f3 = this.f1626Z;
        float f4 = this.f1627a0;
        for (int i2 = 0; i2 < iArr.length; i2++) {
            float f5 = (float) dArr[i2];
            int i3 = iArr[i2];
            if (i3 != 0) {
                if (i3 == 1) {
                    f = f5;
                } else if (i3 == 2) {
                    f2 = f5;
                } else if (i3 == 3) {
                    f3 = f5;
                } else if (i3 == 4) {
                    f4 = f5;
                }
            }
        }
        float f6 = f3 + f;
        float f7 = f4 + f2;
        boolean isNaN = Float.isNaN(Float.NaN);
        boolean isNaN2 = Float.isNaN(Float.NaN);
        float f8 = f + 0.0f;
        float f9 = f2 + 0.0f;
        float f10 = f6 + 0.0f;
        float f11 = f2 + 0.0f;
        float f12 = f6 + 0.0f;
        float f13 = f7 + 0.0f;
        float f14 = f + 0.0f;
        float f15 = f7 + 0.0f;
        int i4 = i + 1;
        fArr[i] = f8;
        int i5 = i4 + 1;
        fArr[i4] = f9;
        int i6 = i5 + 1;
        fArr[i5] = f10;
        int i7 = i6 + 1;
        fArr[i6] = f11;
        int i8 = i7 + 1;
        fArr[i7] = f12;
        int i9 = i8 + 1;
        fArr[i8] = f13;
        int i10 = i9 + 1;
        fArr[i9] = f14;
        fArr[i10] = f15;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public boolean mo2262b(String str) {
        return this.f1631d0.containsKey(str);
    }

    /* renamed from: a */
    private boolean m2058a(float f, float f2) {
        boolean z = true;
        if (Float.isNaN(f) || Float.isNaN(f2)) {
            if (Float.isNaN(f) == Float.isNaN(f2)) {
                z = false;
            }
            return z;
        }
        if (Math.abs(f - f2) <= 1.0E-6f) {
            z = false;
        }
        return z;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo2256a(C0357r rVar, boolean[] zArr, String[] strArr, boolean z) {
        zArr[0] = zArr[0] | m2058a(this.f1623W, rVar.f1623W);
        zArr[1] = zArr[1] | m2058a(this.f1624X, rVar.f1624X) | z;
        zArr[2] = z | m2058a(this.f1625Y, rVar.f1625Y) | zArr[2];
        zArr[3] = zArr[3] | m2058a(this.f1626Z, rVar.f1626Z);
        zArr[4] = m2058a(this.f1627a0, rVar.f1627a0) | zArr[4];
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo2259a(int[] iArr, double[] dArr, float[] fArr, int i) {
        float f = this.f1624X;
        float f2 = this.f1625Y;
        float f3 = this.f1626Z;
        float f4 = this.f1627a0;
        for (int i2 = 0; i2 < iArr.length; i2++) {
            float f5 = (float) dArr[i2];
            int i3 = iArr[i2];
            if (i3 == 1) {
                f = f5;
            } else if (i3 == 2) {
                f2 = f5;
            } else if (i3 == 3) {
                f3 = f5;
            } else if (i3 == 4) {
                f4 = f5;
            }
        }
        fArr[i] = f + (f3 / 2.0f) + 0.0f;
        fArr[i + 1] = f2 + (f4 / 2.0f) + 0.0f;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo2254a(View view, int[] iArr, double[] dArr, double[] dArr2, double[] dArr3) {
        float f;
        View view2 = view;
        int[] iArr2 = iArr;
        float f2 = this.f1624X;
        float f3 = this.f1625Y;
        float f4 = this.f1626Z;
        float f5 = this.f1627a0;
        if (iArr2.length != 0 && this.f1633f0.length <= iArr2[iArr2.length - 1]) {
            int i = iArr2[iArr2.length - 1] + 1;
            this.f1633f0 = new double[i];
            this.f1634g0 = new double[i];
        }
        Arrays.fill(this.f1633f0, Double.NaN);
        int i2 = 0;
        for (int i3 = 0; i3 < iArr2.length; i3++) {
            this.f1633f0[iArr2[i3]] = dArr[i3];
            this.f1634g0[iArr2[i3]] = dArr2[i3];
        }
        float f6 = f2;
        float f7 = f3;
        float f8 = f4;
        float f9 = f5;
        float f10 = Float.NaN;
        float f11 = 0.0f;
        float f12 = 0.0f;
        float f13 = 0.0f;
        float f14 = 0.0f;
        while (true) {
            double[] dArr4 = this.f1633f0;
            if (i2 >= dArr4.length) {
                break;
            }
            boolean isNaN = Double.isNaN(dArr4[i2]);
            double d = 0.0d;
            if (!isNaN || !(dArr3 == null || dArr3[i2] == 0.0d)) {
                if (dArr3 != null) {
                    d = dArr3[i2];
                }
                if (!Double.isNaN(this.f1633f0[i2])) {
                    d = this.f1633f0[i2] + d;
                }
                f = f10;
                float f15 = (float) d;
                float f16 = (float) this.f1634g0[i2];
                if (i2 != 0) {
                    if (i2 == 1) {
                        f6 = f15;
                        f11 = f16;
                    } else if (i2 == 2) {
                        f7 = f15;
                        f13 = f16;
                    } else if (i2 == 3) {
                        f8 = f15;
                        f12 = f16;
                    } else if (i2 == 4) {
                        f9 = f15;
                        f14 = f16;
                    } else if (i2 == 5) {
                        f10 = f15;
                        i2++;
                    }
                }
            } else {
                f = f10;
            }
            f10 = f;
            i2++;
        }
        float f17 = f10;
        if (!Float.isNaN(f17)) {
            float f18 = Float.NaN;
            if (Float.isNaN(Float.NaN)) {
                f18 = 0.0f;
            }
            view2.setRotation((float) (((double) f18) + ((double) f17) + Math.toDegrees(Math.atan2((double) (f13 + (f14 / 2.0f)), (double) (f11 + (f12 / 2.0f))))));
        } else if (!Float.isNaN(Float.NaN)) {
            view2.setRotation(Float.NaN);
        }
        float f19 = f6 + 0.5f;
        int i4 = (int) f19;
        float f20 = f7 + 0.5f;
        int i5 = (int) f20;
        int i6 = (int) (f19 + f8);
        int i7 = (int) (f20 + f9);
        int i8 = i6 - i4;
        int i9 = i7 - i5;
        if (!(i8 == view.getWidth() && i9 == view.getHeight())) {
            view2.measure(MeasureSpec.makeMeasureSpec(i8, 1073741824), MeasureSpec.makeMeasureSpec(i9, 1073741824));
        }
        view2.layout(i4, i5, i6, i7);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo2252a(float f, float f2, float[] fArr, int[] iArr, double[] dArr, double[] dArr2) {
        int[] iArr2 = iArr;
        float f3 = 0.0f;
        float f4 = 0.0f;
        float f5 = 0.0f;
        float f6 = 0.0f;
        for (int i = 0; i < iArr2.length; i++) {
            float f7 = (float) dArr[i];
            double d = dArr2[i];
            int i2 = iArr2[i];
            if (i2 != 0) {
                if (i2 == 1) {
                    f3 = f7;
                } else if (i2 == 2) {
                    f5 = f7;
                } else if (i2 == 3) {
                    f4 = f7;
                } else if (i2 == 4) {
                    f6 = f7;
                }
            }
        }
        float f8 = f3 - ((0.0f * f4) / 2.0f);
        float f9 = f5 - ((0.0f * f6) / 2.0f);
        float f10 = (f6 * 1.0f) + f9;
        fArr[0] = (f8 * (1.0f - f)) + (((f4 * 1.0f) + f8) * f) + 0.0f;
        fArr[1] = (f9 * (1.0f - f2)) + (f10 * f2) + 0.0f;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo2258a(double[] dArr, int[] iArr) {
        float[] fArr = {this.f1623W, this.f1624X, this.f1625Y, this.f1626Z, this.f1627a0, this.f1628b0};
        int i = 0;
        for (int i2 = 0; i2 < iArr.length; i2++) {
            if (iArr[i2] < fArr.length) {
                int i3 = i + 1;
                dArr[i] = (double) fArr[iArr[i2]];
                i = i3;
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public int mo2249a(String str) {
        return ((C0418a) this.f1631d0.get(str)).mo2397c();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public int mo2250a(String str, double[] dArr, int i) {
        C0418a aVar = (C0418a) this.f1631d0.get(str);
        if (aVar.mo2397c() == 1) {
            dArr[i] = (double) aVar.mo2396b();
            return 1;
        }
        int c = aVar.mo2397c();
        float[] fArr = new float[c];
        aVar.mo2395a(fArr);
        int i2 = 0;
        while (i2 < c) {
            int i3 = i + 1;
            dArr[i] = (double) fArr[i2];
            i2++;
            i = i3;
        }
        return c;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo2251a(float f, float f2, float f3, float f4) {
        this.f1624X = f;
        this.f1625Y = f2;
        this.f1626Z = f3;
        this.f1627a0 = f4;
    }

    /* renamed from: a */
    public int compareTo(C0357r rVar) {
        return Float.compare(this.f1623W, rVar.f1623W);
    }

    /* renamed from: a */
    public void mo2257a(C0426a aVar) {
        this.f1629c = C3947c.m13295a(aVar.f1878c.f1948c);
        C0428c cVar = aVar.f1878c;
        this.f1630c0 = cVar.f1949d;
        this.f1628b0 = cVar.f1952g;
        this.f1621U = cVar.f1950e;
        float f = aVar.f1877b.f1957e;
        for (String str : aVar.f1881f.keySet()) {
            C0418a aVar2 = (C0418a) aVar.f1881f.get(str);
            if (aVar2.mo2392a() != C0420b.STRING_TYPE) {
                this.f1631d0.put(str, aVar2);
            }
        }
    }
}
