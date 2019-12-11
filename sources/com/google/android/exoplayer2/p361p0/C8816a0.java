package com.google.android.exoplayer2.p361p0;

import com.google.android.exoplayer2.p393v0.C9537e;
import java.nio.ShortBuffer;
import java.util.Arrays;

/* renamed from: com.google.android.exoplayer2.p0.a0 */
/* compiled from: Sonic */
final class C8816a0 {

    /* renamed from: a */
    private final int f18746a;

    /* renamed from: b */
    private final int f18747b;

    /* renamed from: c */
    private final float f18748c;

    /* renamed from: d */
    private final float f18749d;

    /* renamed from: e */
    private final float f18750e;

    /* renamed from: f */
    private final int f18751f;

    /* renamed from: g */
    private final int f18752g;

    /* renamed from: h */
    private final int f18753h = (this.f18752g * 2);

    /* renamed from: i */
    private final short[] f18754i;

    /* renamed from: j */
    private short[] f18755j;

    /* renamed from: k */
    private int f18756k;

    /* renamed from: l */
    private short[] f18757l;

    /* renamed from: m */
    private int f18758m;

    /* renamed from: n */
    private short[] f18759n;

    /* renamed from: o */
    private int f18760o;

    /* renamed from: p */
    private int f18761p;

    /* renamed from: q */
    private int f18762q;

    /* renamed from: r */
    private int f18763r;

    /* renamed from: s */
    private int f18764s;

    /* renamed from: t */
    private int f18765t;

    /* renamed from: u */
    private int f18766u;

    /* renamed from: v */
    private int f18767v;

    public C8816a0(int i, int i2, float f, float f2, int i3) {
        this.f18746a = i;
        this.f18747b = i2;
        this.f18748c = f;
        this.f18749d = f2;
        this.f18750e = ((float) i) / ((float) i3);
        this.f18751f = i / 400;
        this.f18752g = i / 65;
        int i4 = this.f18753h;
        this.f18754i = new short[i4];
        this.f18755j = new short[(i4 * i2)];
        this.f18757l = new short[(i4 * i2)];
        this.f18759n = new short[(i4 * i2)];
    }

    /* renamed from: d */
    private void m25566d(int i) {
        int i2 = this.f18756k - i;
        short[] sArr = this.f18755j;
        int i3 = this.f18747b;
        System.arraycopy(sArr, i * i3, sArr, 0, i3 * i2);
        this.f18756k = i2;
    }

    /* renamed from: a */
    public void mo23051a(ShortBuffer shortBuffer) {
        int min = Math.min(shortBuffer.remaining() / this.f18747b, this.f18758m);
        shortBuffer.put(this.f18757l, 0, this.f18747b * min);
        this.f18758m -= min;
        short[] sArr = this.f18757l;
        int i = this.f18747b;
        System.arraycopy(sArr, min * i, sArr, 0, this.f18758m * i);
    }

    /* renamed from: b */
    public void mo23053b(ShortBuffer shortBuffer) {
        int remaining = shortBuffer.remaining();
        int i = this.f18747b;
        int i2 = remaining / i;
        int i3 = i * i2 * 2;
        this.f18755j = m25564c(this.f18755j, this.f18756k, i2);
        shortBuffer.get(this.f18755j, this.f18756k * this.f18747b, i3 / 2);
        this.f18756k += i2;
        m25565d();
    }

    /* renamed from: c */
    public void mo23054c() {
        int i;
        int i2 = this.f18756k;
        float f = this.f18748c;
        float f2 = this.f18749d;
        float f3 = this.f18750e * f2;
        int i3 = this.f18758m + ((int) ((((((float) i2) / (f / f2)) + ((float) this.f18760o)) / f3) + 0.5f));
        this.f18755j = m25564c(this.f18755j, i2, (this.f18753h * 2) + i2);
        int i4 = 0;
        while (true) {
            i = this.f18753h;
            int i5 = i * 2;
            int i6 = this.f18747b;
            if (i4 >= i5 * i6) {
                break;
            }
            this.f18755j[(i6 * i2) + i4] = 0;
            i4++;
        }
        this.f18756k += i * 2;
        m25565d();
        if (this.f18758m > i3) {
            this.f18758m = i3;
        }
        this.f18756k = 0;
        this.f18763r = 0;
        this.f18760o = 0;
    }

    /* renamed from: d */
    private void m25565d() {
        int i = this.f18758m;
        float f = this.f18748c;
        float f2 = this.f18749d;
        float f3 = f / f2;
        float f4 = this.f18750e * f2;
        double d = (double) f3;
        if (d > 1.00001d || d < 0.99999d) {
            m25554a(f3);
        } else {
            m25557a(this.f18755j, 0, this.f18756k);
            this.f18756k = 0;
        }
        if (f4 != 1.0f) {
            m25555a(f4, i);
        }
    }

    /* renamed from: a */
    public void mo23050a() {
        this.f18756k = 0;
        this.f18758m = 0;
        this.f18760o = 0;
        this.f18761p = 0;
        this.f18762q = 0;
        this.f18763r = 0;
        this.f18764s = 0;
        this.f18765t = 0;
        this.f18766u = 0;
        this.f18767v = 0;
    }

    /* renamed from: b */
    public int mo23052b() {
        return this.f18758m * this.f18747b * 2;
    }

    /* renamed from: b */
    private void m25562b(short[] sArr, int i, int i2) {
        int i3 = this.f18753h / i2;
        int i4 = this.f18747b;
        int i5 = i2 * i4;
        int i6 = i * i4;
        for (int i7 = 0; i7 < i3; i7++) {
            int i8 = 0;
            for (int i9 = 0; i9 < i5; i9++) {
                i8 += sArr[(i7 * i5) + i6 + i9];
            }
            this.f18754i[i7] = (short) (i8 / i5);
        }
    }

    /* renamed from: b */
    private void m25561b(int i) {
        int i2 = this.f18758m - i;
        this.f18759n = m25564c(this.f18759n, this.f18760o, i2);
        short[] sArr = this.f18757l;
        int i3 = this.f18747b;
        System.arraycopy(sArr, i * i3, this.f18759n, this.f18760o * i3, i3 * i2);
        this.f18758m = i;
        this.f18760o += i2;
    }

    /* renamed from: a */
    private void m25557a(short[] sArr, int i, int i2) {
        this.f18757l = m25564c(this.f18757l, this.f18758m, i2);
        int i3 = this.f18747b;
        System.arraycopy(sArr, i * i3, this.f18757l, this.f18758m * i3, i3 * i2);
        this.f18758m += i2;
    }

    /* renamed from: c */
    private short[] m25564c(short[] sArr, int i, int i2) {
        int length = sArr.length;
        int i3 = this.f18747b;
        int i4 = length / i3;
        if (i + i2 <= i4) {
            return sArr;
        }
        return Arrays.copyOf(sArr, (((i4 * 3) / 2) + i2) * i3);
    }

    /* renamed from: b */
    private short m25560b(short[] sArr, int i, int i2, int i3) {
        short s = sArr[i];
        short s2 = sArr[i + this.f18747b];
        int i4 = this.f18762q * i2;
        int i5 = this.f18761p;
        int i6 = i5 * i3;
        int i7 = (i5 + 1) * i3;
        int i8 = i7 - i4;
        int i9 = i7 - i6;
        return (short) (((s * i8) + ((i9 - i8) * s2)) / i9);
    }

    /* renamed from: a */
    private int m25550a(int i) {
        int min = Math.min(this.f18753h, this.f18763r);
        m25557a(this.f18755j, i, min);
        this.f18763r -= min;
        return min;
    }

    /* renamed from: c */
    private void m25563c(int i) {
        if (i != 0) {
            short[] sArr = this.f18759n;
            int i2 = this.f18747b;
            System.arraycopy(sArr, i * i2, sArr, 0, (this.f18760o - i) * i2);
            this.f18760o -= i;
        }
    }

    /* renamed from: a */
    private int m25553a(short[] sArr, int i, int i2, int i3) {
        int i4 = i * this.f18747b;
        int i5 = 1;
        int i6 = 0;
        int i7 = 0;
        int i8 = 255;
        while (i2 <= i3) {
            int i9 = 0;
            for (int i10 = 0; i10 < i2; i10++) {
                i9 += Math.abs(sArr[i4 + i10] - sArr[(i4 + i2) + i10]);
            }
            if (i9 * i6 < i5 * i2) {
                i6 = i2;
                i5 = i9;
            }
            if (i9 * i8 > i7 * i2) {
                i8 = i2;
                i7 = i9;
            }
            i2++;
        }
        this.f18766u = i5 / i6;
        this.f18767v = i7 / i8;
        return i6;
    }

    /* renamed from: b */
    private int m25559b(short[] sArr, int i, float f, int i2) {
        int i3;
        if (f >= 2.0f) {
            i3 = (int) (((float) i2) / (f - 1.0f));
        } else {
            this.f18763r = (int) ((((float) i2) * (2.0f - f)) / (f - 1.0f));
            i3 = i2;
        }
        this.f18757l = m25564c(this.f18757l, this.f18758m, i3);
        m25556a(i3, this.f18747b, this.f18757l, this.f18758m, sArr, i, sArr, i + i2);
        this.f18758m += i3;
        return i3;
    }

    /* renamed from: a */
    private boolean m25558a(int i, int i2) {
        if (i == 0 || this.f18764s == 0 || i2 > i * 3 || i * 2 <= this.f18765t * 3) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    private int m25551a(short[] sArr, int i) {
        int i2;
        int i3 = this.f18746a;
        int i4 = i3 > 4000 ? i3 / 4000 : 1;
        if (this.f18747b == 1 && i4 == 1) {
            i2 = m25553a(sArr, i, this.f18751f, this.f18752g);
        } else {
            m25562b(sArr, i, i4);
            int a = m25553a(this.f18754i, 0, this.f18751f / i4, this.f18752g / i4);
            if (i4 != 1) {
                int i5 = a * i4;
                int i6 = i4 * 4;
                int i7 = i5 - i6;
                int i8 = i5 + i6;
                int i9 = this.f18751f;
                if (i7 >= i9) {
                    i9 = i7;
                }
                int i10 = this.f18752g;
                if (i8 > i10) {
                    i8 = i10;
                }
                if (this.f18747b == 1) {
                    i2 = m25553a(sArr, i, i9, i8);
                } else {
                    m25562b(sArr, i, 1);
                    i2 = m25553a(this.f18754i, 0, i9, i8);
                }
            } else {
                i2 = a;
            }
        }
        int i11 = m25558a(this.f18766u, this.f18767v) ? this.f18764s : i2;
        this.f18765t = this.f18766u;
        this.f18764s = i2;
        return i11;
    }

    /* renamed from: a */
    private void m25555a(float f, int i) {
        int i2;
        int i3;
        if (this.f18758m != i) {
            int i4 = this.f18746a;
            int i5 = (int) (((float) i4) / f);
            while (true) {
                if (i5 <= 16384 && i4 <= 16384) {
                    break;
                }
                i5 /= 2;
                i4 /= 2;
            }
            m25561b(i);
            int i6 = 0;
            while (true) {
                int i7 = this.f18760o;
                boolean z = true;
                if (i6 < i7 - 1) {
                    while (true) {
                        i2 = this.f18761p;
                        int i8 = (i2 + 1) * i5;
                        i3 = this.f18762q;
                        if (i8 <= i3 * i4) {
                            break;
                        }
                        this.f18757l = m25564c(this.f18757l, this.f18758m, 1);
                        int i9 = 0;
                        while (true) {
                            int i10 = this.f18747b;
                            if (i9 >= i10) {
                                break;
                            }
                            this.f18757l[(this.f18758m * i10) + i9] = m25560b(this.f18759n, (i10 * i6) + i9, i4, i5);
                            i9++;
                        }
                        this.f18762q++;
                        this.f18758m++;
                    }
                    this.f18761p = i2 + 1;
                    if (this.f18761p == i4) {
                        this.f18761p = 0;
                        if (i3 != i5) {
                            z = false;
                        }
                        C9537e.m29301b(z);
                        this.f18762q = 0;
                    }
                    i6++;
                } else {
                    m25563c(i7 - 1);
                    return;
                }
            }
        }
    }

    /* renamed from: a */
    private int m25552a(short[] sArr, int i, float f, int i2) {
        int i3;
        if (f < 0.5f) {
            i3 = (int) ((((float) i2) * f) / (1.0f - f));
        } else {
            this.f18763r = (int) ((((float) i2) * ((2.0f * f) - 1.0f)) / (1.0f - f));
            i3 = i2;
        }
        int i4 = i2 + i3;
        this.f18757l = m25564c(this.f18757l, this.f18758m, i4);
        int i5 = this.f18747b;
        System.arraycopy(sArr, i * i5, this.f18757l, this.f18758m * i5, i5 * i2);
        m25556a(i3, this.f18747b, this.f18757l, this.f18758m + i2, sArr, i + i2, sArr, i);
        this.f18758m += i4;
        return i3;
    }

    /* renamed from: a */
    private void m25554a(float f) {
        int a;
        int i = this.f18756k;
        if (i >= this.f18753h) {
            int i2 = 0;
            do {
                if (this.f18763r > 0) {
                    a = m25550a(i2);
                } else {
                    int a2 = m25551a(this.f18755j, i2);
                    if (((double) f) > 1.0d) {
                        a = a2 + m25559b(this.f18755j, i2, f, a2);
                    } else {
                        a = m25552a(this.f18755j, i2, f, a2);
                    }
                }
                i2 += a;
            } while (this.f18753h + i2 <= i);
            m25566d(i2);
        }
    }

    /* renamed from: a */
    private static void m25556a(int i, int i2, short[] sArr, int i3, short[] sArr2, int i4, short[] sArr3, int i5) {
        for (int i6 = 0; i6 < i2; i6++) {
            int i7 = (i4 * i2) + i6;
            int i8 = (i5 * i2) + i6;
            int i9 = (i3 * i2) + i6;
            for (int i10 = 0; i10 < i; i10++) {
                sArr[i9] = (short) (((sArr2[i7] * (i - i10)) + (sArr3[i8] * i10)) / i);
                i9 += i2;
                i7 += i2;
                i8 += i2;
            }
        }
    }
}
