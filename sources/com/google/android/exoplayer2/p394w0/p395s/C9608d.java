package com.google.android.exoplayer2.p394w0.p395s;

import com.google.android.exoplayer2.util.Assertions;

/* renamed from: com.google.android.exoplayer2.w0.s.d */
/* compiled from: Projection */
public final class C9608d {

    /* renamed from: a */
    public final C9609a f22470a;

    /* renamed from: b */
    public final C9609a f22471b;

    /* renamed from: c */
    public final int f22472c;

    /* renamed from: d */
    public final boolean f22473d;

    /* renamed from: com.google.android.exoplayer2.w0.s.d$a */
    /* compiled from: Projection */
    public static final class C9609a {

        /* renamed from: a */
        private final C9610b[] f22474a;

        public C9609a(C9610b... bVarArr) {
            this.f22474a = bVarArr;
        }

        /* renamed from: a */
        public int mo24796a() {
            return this.f22474a.length;
        }

        /* renamed from: a */
        public C9610b mo24797a(int i) {
            return this.f22474a[i];
        }
    }

    /* renamed from: com.google.android.exoplayer2.w0.s.d$b */
    /* compiled from: Projection */
    public static final class C9610b {

        /* renamed from: a */
        public final int f22475a;

        /* renamed from: b */
        public final int f22476b;

        /* renamed from: c */
        public final float[] f22477c;

        /* renamed from: d */
        public final float[] f22478d;

        public C9610b(int i, float[] fArr, float[] fArr2, int i2) {
            this.f22475a = i;
            Assertions.checkArgument(((long) fArr.length) * 2 == ((long) fArr2.length) * 3);
            this.f22477c = fArr;
            this.f22478d = fArr2;
            this.f22476b = i2;
        }

        /* renamed from: a */
        public int mo24798a() {
            return this.f22477c.length / 3;
        }
    }

    public C9608d(C9609a aVar, int i) {
        this(aVar, aVar, i);
    }

    /* renamed from: a */
    public static C9608d m29743a(int i) {
        return m29742a(50.0f, 36, 72, 180.0f, 360.0f, i);
    }

    public C9608d(C9609a aVar, C9609a aVar2, int i) {
        this.f22470a = aVar;
        this.f22471b = aVar2;
        this.f22472c = i;
        this.f22473d = aVar == aVar2;
    }

    /* renamed from: a */
    public static C9608d m29742a(float f, int i, int i2, float f2, float f3, int i3) {
        int i4;
        int i5;
        int i6;
        float f4 = f;
        int i7 = i;
        int i8 = i2;
        float f5 = f2;
        float f6 = f3;
        Assertions.checkArgument(f4 > 0.0f);
        Assertions.checkArgument(i7 >= 1);
        Assertions.checkArgument(i8 >= 1);
        Assertions.checkArgument(f5 > 0.0f && f5 <= 180.0f);
        Assertions.checkArgument(f6 > 0.0f && f6 <= 360.0f);
        float radians = (float) Math.toRadians((double) f5);
        float radians2 = (float) Math.toRadians((double) f6);
        float f7 = radians / ((float) i7);
        float f8 = radians2 / ((float) i8);
        int i9 = i8 + 1;
        int i10 = ((i9 * 2) + 2) * i7;
        float[] fArr = new float[(i10 * 3)];
        float[] fArr2 = new float[(i10 * 2)];
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        while (i11 < i7) {
            float f9 = radians / 2.0f;
            float f10 = (((float) i11) * f7) - f9;
            int i14 = i11 + 1;
            float f11 = (((float) i14) * f7) - f9;
            int i15 = i13;
            int i16 = i12;
            int i17 = 0;
            while (i17 < i9) {
                int i18 = i15;
                int i19 = 2;
                int i20 = i16;
                int i21 = 0;
                while (i21 < i19) {
                    float f12 = f10;
                    float f13 = ((float) i17) * f8;
                    int i22 = i14;
                    int i23 = i20 + 1;
                    float f14 = f8;
                    int i24 = i9;
                    double d = (double) f4;
                    float f15 = radians;
                    double d2 = (double) ((f13 + 3.1415927f) - (radians2 / 2.0f));
                    double d3 = (double) (i21 == 0 ? f12 : f11);
                    int i25 = i11;
                    int i26 = i17;
                    fArr[i20] = -((float) (Math.sin(d2) * d * Math.cos(d3)));
                    int i27 = i23 + 1;
                    int i28 = i21;
                    fArr[i23] = (float) (d * Math.sin(d3));
                    int i29 = i27 + 1;
                    fArr[i27] = (float) (d * Math.cos(d2) * Math.cos(d3));
                    int i30 = i18 + 1;
                    fArr2[i18] = f13 / radians2;
                    int i31 = i30 + 1;
                    fArr2[i30] = (((float) (i25 + i28)) * f7) / f15;
                    if (i26 == 0 && i28 == 0) {
                        i6 = i2;
                        i4 = i28;
                        i5 = i26;
                    } else {
                        i6 = i2;
                        i5 = i26;
                        i4 = i28;
                        if (!(i5 == i6 && i4 == 1)) {
                            i18 = i31;
                            i20 = i29;
                            i21 = i4 + 1;
                            f10 = f12;
                            i17 = i5;
                            i11 = i25;
                            f8 = f14;
                            i14 = i22;
                            i9 = i24;
                            radians = f15;
                            i19 = 2;
                            i8 = i6;
                            f4 = f;
                        }
                    }
                    System.arraycopy(fArr, i29 - 3, fArr, i29, 3);
                    i29 += 3;
                    System.arraycopy(fArr2, i31 - 2, fArr2, i31, 2);
                    i31 += 2;
                    i18 = i31;
                    i20 = i29;
                    i21 = i4 + 1;
                    f10 = f12;
                    i17 = i5;
                    i11 = i25;
                    f8 = f14;
                    i14 = i22;
                    i9 = i24;
                    radians = f15;
                    i19 = 2;
                    i8 = i6;
                    f4 = f;
                }
                float f16 = radians;
                float f17 = f10;
                int i32 = i14;
                int i33 = i9;
                int i34 = i11;
                i17++;
                int i35 = i;
                i8 = i8;
                i16 = i20;
                i15 = i18;
                f8 = f8;
                i14 = i32;
                f4 = f;
            }
            f4 = f;
            i7 = i;
            i12 = i16;
            i13 = i15;
            i11 = i14;
        }
        return new C9608d(new C9609a(new C9610b(0, fArr, fArr2, 1)), i3);
    }
}
