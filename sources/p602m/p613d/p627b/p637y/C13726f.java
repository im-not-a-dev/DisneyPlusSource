package p602m.p613d.p627b.p637y;

import p602m.p613d.p683g.C14087h;

/* renamed from: m.d.b.y.f */
/* compiled from: SHA224Digest */
public class C13726f extends C13722b implements C13721a {

    /* renamed from: n */
    static final int[] f30505n = {1116352408, 1899447441, -1245643825, -373957723, 961987163, 1508970993, -1841331548, -1424204075, -670586216, 310598401, 607225278, 1426881987, 1925078388, -2132889090, -1680079193, -1046744716, -459576895, -272742522, 264347078, 604807628, 770255983, 1249150122, 1555081692, 1996064986, -1740746414, -1473132947, -1341970488, -1084653625, -958395405, -710438585, 113926993, 338241895, 666307205, 773529912, 1294757372, 1396182291, 1695183700, 1986661051, -2117940946, -1838011259, -1564481375, -1474664885, -1035236496, -949202525, -778901479, -694614492, -200395387, 275423344, 430227734, 506948616, 659060556, 883997877, 958139571, 1322822218, 1537002063, 1747873779, 1955562222, 2024104815, -2067236844, -1933114872, -1866530822, -1538233109, -1090935817, -965641998};

    /* renamed from: d */
    private int f30506d;

    /* renamed from: e */
    private int f30507e;

    /* renamed from: f */
    private int f30508f;

    /* renamed from: g */
    private int f30509g;

    /* renamed from: h */
    private int f30510h;

    /* renamed from: i */
    private int f30511i;

    /* renamed from: j */
    private int f30512j;

    /* renamed from: k */
    private int f30513k;

    /* renamed from: l */
    private int[] f30514l = new int[64];

    /* renamed from: m */
    private int f30515m;

    public C13726f() {
        reset();
    }

    /* renamed from: a */
    private int m42169a(int i) {
        return ((i << 10) | (i >>> 22)) ^ (((i >>> 2) | (i << 30)) ^ ((i >>> 13) | (i << 19)));
    }

    /* renamed from: a */
    private int m42170a(int i, int i2, int i3) {
        return ((~i) & i3) ^ (i2 & i);
    }

    /* renamed from: b */
    private int m42171b(int i) {
        return ((i << 7) | (i >>> 25)) ^ (((i >>> 6) | (i << 26)) ^ ((i >>> 11) | (i << 21)));
    }

    /* renamed from: b */
    private int m42172b(int i, int i2, int i3) {
        return ((i & i3) ^ (i & i2)) ^ (i2 & i3);
    }

    /* renamed from: c */
    private int m42173c(int i) {
        return (i >>> 3) ^ (((i >>> 7) | (i << 25)) ^ ((i >>> 18) | (i << 14)));
    }

    /* renamed from: d */
    private int m42174d(int i) {
        return (i >>> 10) ^ (((i >>> 17) | (i << 15)) ^ ((i >>> 19) | (i << 13)));
    }

    /* renamed from: a */
    public String mo34971a() {
        return "SHA-224";
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo34980a(long j) {
        if (this.f30515m > 14) {
            mo34983d();
        }
        int[] iArr = this.f30514l;
        iArr[14] = (int) (j >>> 32);
        iArr[15] = (int) (j & -1);
    }

    /* renamed from: b */
    public int mo34973b() {
        return 28;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo34981b(byte[] bArr, int i) {
        int i2 = i + 1;
        int i3 = i2 + 1;
        int i4 = (bArr[i3 + 1] & 255) | (bArr[i] << 24) | ((bArr[i2] & 255) << 16) | ((bArr[i3] & 255) << 8);
        int[] iArr = this.f30514l;
        int i5 = this.f30515m;
        iArr[i5] = i4;
        int i6 = i5 + 1;
        this.f30515m = i6;
        if (i6 == 16) {
            mo34983d();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo34983d() {
        for (int i = 16; i <= 63; i++) {
            int[] iArr = this.f30514l;
            int d = m42174d(iArr[i - 2]);
            int[] iArr2 = this.f30514l;
            iArr[i] = d + iArr2[i - 7] + m42173c(iArr2[i - 15]) + this.f30514l[i - 16];
        }
        int i2 = this.f30506d;
        int i3 = this.f30507e;
        int i4 = this.f30508f;
        int i5 = this.f30509g;
        int i6 = this.f30510h;
        int i7 = this.f30511i;
        int i8 = this.f30512j;
        int i9 = this.f30513k;
        int i10 = 0;
        int i11 = i8;
        int i12 = i7;
        int i13 = i6;
        int i14 = i5;
        int i15 = i4;
        int i16 = i3;
        int i17 = i2;
        for (int i18 = 0; i18 < 8; i18++) {
            int b = i9 + m42171b(i13) + m42170a(i13, i12, i11) + f30505n[i10] + this.f30514l[i10];
            int i19 = i14 + b;
            int a = b + m42169a(i17) + m42172b(i17, i16, i15);
            int i20 = i10 + 1;
            int b2 = i11 + m42171b(i19) + m42170a(i19, i13, i12) + f30505n[i20] + this.f30514l[i20];
            int i21 = i15 + b2;
            int a2 = b2 + m42169a(a) + m42172b(a, i17, i16);
            int i22 = i20 + 1;
            int b3 = i12 + m42171b(i21) + m42170a(i21, i19, i13) + f30505n[i22] + this.f30514l[i22];
            int i23 = i16 + b3;
            int a3 = b3 + m42169a(a2) + m42172b(a2, a, i17);
            int i24 = i22 + 1;
            int b4 = i13 + m42171b(i23) + m42170a(i23, i21, i19) + f30505n[i24] + this.f30514l[i24];
            int i25 = i17 + b4;
            int a4 = b4 + m42169a(a3) + m42172b(a3, a2, a);
            int i26 = i24 + 1;
            int b5 = i19 + m42171b(i25) + m42170a(i25, i23, i21) + f30505n[i26] + this.f30514l[i26];
            i9 = a + b5;
            i14 = b5 + m42169a(a4) + m42172b(a4, a3, a2);
            int i27 = i26 + 1;
            int b6 = i21 + m42171b(i9) + m42170a(i9, i25, i23) + f30505n[i27] + this.f30514l[i27];
            i11 = a2 + b6;
            i15 = b6 + m42169a(i14) + m42172b(i14, a4, a3);
            int i28 = i27 + 1;
            int b7 = i23 + m42171b(i11) + m42170a(i11, i9, i25) + f30505n[i28] + this.f30514l[i28];
            i12 = a3 + b7;
            i16 = b7 + m42169a(i15) + m42172b(i15, i14, a4);
            int i29 = i28 + 1;
            int b8 = i25 + m42171b(i12) + m42170a(i12, i11, i9) + f30505n[i29] + this.f30514l[i29];
            i13 = a4 + b8;
            i17 = b8 + m42169a(i16) + m42172b(i16, i15, i14);
            i10 = i29 + 1;
        }
        this.f30506d += i17;
        this.f30507e += i16;
        this.f30508f += i15;
        this.f30509g += i14;
        this.f30510h += i13;
        this.f30511i += i12;
        this.f30512j += i11;
        this.f30513k += i9;
        this.f30515m = 0;
        for (int i30 = 0; i30 < 16; i30++) {
            this.f30514l[i30] = 0;
        }
    }

    public void reset() {
        super.reset();
        this.f30506d = -1056596264;
        this.f30507e = 914150663;
        this.f30508f = 812702999;
        this.f30509g = -150054599;
        this.f30510h = -4191439;
        this.f30511i = 1750603025;
        this.f30512j = 1694076839;
        this.f30513k = -1090891868;
        this.f30515m = 0;
        int i = 0;
        while (true) {
            int[] iArr = this.f30514l;
            if (i != iArr.length) {
                iArr[i] = 0;
                i++;
            } else {
                return;
            }
        }
    }

    /* renamed from: a */
    public int mo34970a(byte[] bArr, int i) {
        mo34982c();
        C14087h.m44470a(this.f30506d, bArr, i);
        C14087h.m44470a(this.f30507e, bArr, i + 4);
        C14087h.m44470a(this.f30508f, bArr, i + 8);
        C14087h.m44470a(this.f30509g, bArr, i + 12);
        C14087h.m44470a(this.f30510h, bArr, i + 16);
        C14087h.m44470a(this.f30511i, bArr, i + 20);
        C14087h.m44470a(this.f30512j, bArr, i + 24);
        reset();
        return 28;
    }
}
