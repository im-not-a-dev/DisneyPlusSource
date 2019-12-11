package p602m.p613d.p627b.p637y;

import p602m.p613d.p683g.C14087h;

/* renamed from: m.d.b.y.e */
/* compiled from: SHA1Digest */
public class C13725e extends C13722b implements C13721a {

    /* renamed from: d */
    private int f30498d;

    /* renamed from: e */
    private int f30499e;

    /* renamed from: f */
    private int f30500f;

    /* renamed from: g */
    private int f30501g;

    /* renamed from: h */
    private int f30502h;

    /* renamed from: i */
    private int[] f30503i = new int[80];

    /* renamed from: j */
    private int f30504j;

    public C13725e() {
        reset();
    }

    /* renamed from: a */
    private int m42160a(int i, int i2, int i3) {
        return ((~i) & i3) | (i2 & i);
    }

    /* renamed from: b */
    private int m42161b(int i, int i2, int i3) {
        return (i & i3) | (i & i2) | (i2 & i3);
    }

    /* renamed from: c */
    private int m42162c(int i, int i2, int i3) {
        return (i ^ i2) ^ i3;
    }

    /* renamed from: a */
    public String mo34971a() {
        return "SHA-1";
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo34980a(long j) {
        if (this.f30504j > 14) {
            mo34983d();
        }
        int[] iArr = this.f30503i;
        iArr[14] = (int) (j >>> 32);
        iArr[15] = (int) (j & -1);
    }

    /* renamed from: b */
    public int mo34973b() {
        return 20;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo34981b(byte[] bArr, int i) {
        int i2 = i + 1;
        int i3 = i2 + 1;
        int i4 = (bArr[i3 + 1] & 255) | (bArr[i] << 24) | ((bArr[i2] & 255) << 16) | ((bArr[i3] & 255) << 8);
        int[] iArr = this.f30503i;
        int i5 = this.f30504j;
        iArr[i5] = i4;
        int i6 = i5 + 1;
        this.f30504j = i6;
        if (i6 == 16) {
            mo34983d();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo34983d() {
        for (int i = 16; i < 80; i++) {
            int[] iArr = this.f30503i;
            int i2 = ((iArr[i - 3] ^ iArr[i - 8]) ^ iArr[i - 14]) ^ iArr[i - 16];
            iArr[i] = (i2 >>> 31) | (i2 << 1);
        }
        int i3 = this.f30498d;
        int i4 = this.f30499e;
        int i5 = this.f30500f;
        int i6 = this.f30501g;
        int i7 = this.f30502h;
        int i8 = i6;
        int i9 = 0;
        int i10 = i5;
        int i11 = i4;
        int i12 = i3;
        int i13 = 0;
        while (i13 < 4) {
            int i14 = i9 + 1;
            int a = i7 + ((i12 << 5) | (i12 >>> 27)) + m42160a(i11, i10, i8) + this.f30503i[i9] + 1518500249;
            int i15 = (i11 >>> 2) | (i11 << 30);
            int i16 = i14 + 1;
            int a2 = i8 + ((a << 5) | (a >>> 27)) + m42160a(i12, i15, i10) + this.f30503i[i14] + 1518500249;
            int i17 = (i12 >>> 2) | (i12 << 30);
            int i18 = i16 + 1;
            int a3 = i10 + ((a2 << 5) | (a2 >>> 27)) + m42160a(a, i17, i15) + this.f30503i[i16] + 1518500249;
            i7 = (a >>> 2) | (a << 30);
            int i19 = i18 + 1;
            i11 = i15 + ((a3 << 5) | (a3 >>> 27)) + m42160a(a2, i7, i17) + this.f30503i[i18] + 1518500249;
            i8 = (a2 >>> 2) | (a2 << 30);
            i12 = i17 + ((i11 << 5) | (i11 >>> 27)) + m42160a(a3, i8, i7) + this.f30503i[i19] + 1518500249;
            i10 = (a3 >>> 2) | (a3 << 30);
            i13++;
            i9 = i19 + 1;
        }
        int i20 = 0;
        while (i20 < 4) {
            int i21 = i9 + 1;
            int c = i7 + ((i12 << 5) | (i12 >>> 27)) + m42162c(i11, i10, i8) + this.f30503i[i9] + 1859775393;
            int i22 = (i11 >>> 2) | (i11 << 30);
            int i23 = i21 + 1;
            int c2 = i8 + ((c << 5) | (c >>> 27)) + m42162c(i12, i22, i10) + this.f30503i[i21] + 1859775393;
            int i24 = (i12 >>> 2) | (i12 << 30);
            int i25 = i23 + 1;
            int c3 = i10 + ((c2 << 5) | (c2 >>> 27)) + m42162c(c, i24, i22) + this.f30503i[i23] + 1859775393;
            i7 = (c >>> 2) | (c << 30);
            int i26 = i25 + 1;
            i11 = i22 + ((c3 << 5) | (c3 >>> 27)) + m42162c(c2, i7, i24) + this.f30503i[i25] + 1859775393;
            i8 = (c2 >>> 2) | (c2 << 30);
            i12 = i24 + ((i11 << 5) | (i11 >>> 27)) + m42162c(c3, i8, i7) + this.f30503i[i26] + 1859775393;
            i10 = (c3 >>> 2) | (c3 << 30);
            i20++;
            i9 = i26 + 1;
        }
        int i27 = 0;
        while (i27 < 4) {
            int i28 = i9 + 1;
            int b = i7 + (((((i12 << 5) | (i12 >>> 27)) + m42161b(i11, i10, i8)) + this.f30503i[i9]) - 1894007588);
            int i29 = (i11 >>> 2) | (i11 << 30);
            int i30 = i28 + 1;
            int b2 = i8 + (((((b << 5) | (b >>> 27)) + m42161b(i12, i29, i10)) + this.f30503i[i28]) - 1894007588);
            int i31 = (i12 >>> 2) | (i12 << 30);
            int i32 = i30 + 1;
            int b3 = i10 + (((((b2 << 5) | (b2 >>> 27)) + m42161b(b, i31, i29)) + this.f30503i[i30]) - 1894007588);
            i7 = (b >>> 2) | (b << 30);
            int i33 = i32 + 1;
            i11 = i29 + (((((b3 << 5) | (b3 >>> 27)) + m42161b(b2, i7, i31)) + this.f30503i[i32]) - 1894007588);
            i8 = (b2 >>> 2) | (b2 << 30);
            i12 = i31 + (((((i11 << 5) | (i11 >>> 27)) + m42161b(b3, i8, i7)) + this.f30503i[i33]) - 1894007588);
            i10 = (b3 >>> 2) | (b3 << 30);
            i27++;
            i9 = i33 + 1;
        }
        int i34 = 0;
        while (i34 <= 3) {
            int i35 = i9 + 1;
            int c4 = i7 + (((((i12 << 5) | (i12 >>> 27)) + m42162c(i11, i10, i8)) + this.f30503i[i9]) - 899497514);
            int i36 = (i11 >>> 2) | (i11 << 30);
            int i37 = i35 + 1;
            int c5 = i8 + (((((c4 << 5) | (c4 >>> 27)) + m42162c(i12, i36, i10)) + this.f30503i[i35]) - 899497514);
            int i38 = (i12 >>> 2) | (i12 << 30);
            int i39 = i37 + 1;
            int c6 = i10 + (((((c5 << 5) | (c5 >>> 27)) + m42162c(c4, i38, i36)) + this.f30503i[i37]) - 899497514);
            i7 = (c4 >>> 2) | (c4 << 30);
            int i40 = i39 + 1;
            i11 = i36 + (((((c6 << 5) | (c6 >>> 27)) + m42162c(c5, i7, i38)) + this.f30503i[i39]) - 899497514);
            i8 = (c5 >>> 2) | (c5 << 30);
            i12 = i38 + (((((i11 << 5) | (i11 >>> 27)) + m42162c(c6, i8, i7)) + this.f30503i[i40]) - 899497514);
            i10 = (c6 >>> 2) | (c6 << 30);
            i34++;
            i9 = i40 + 1;
        }
        this.f30498d += i12;
        this.f30499e += i11;
        this.f30500f += i10;
        this.f30501g += i8;
        this.f30502h += i7;
        this.f30504j = 0;
        for (int i41 = 0; i41 < 16; i41++) {
            this.f30503i[i41] = 0;
        }
    }

    public void reset() {
        super.reset();
        this.f30498d = 1732584193;
        this.f30499e = -271733879;
        this.f30500f = -1732584194;
        this.f30501g = 271733878;
        this.f30502h = -1009589776;
        this.f30504j = 0;
        int i = 0;
        while (true) {
            int[] iArr = this.f30503i;
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
        C14087h.m44470a(this.f30498d, bArr, i);
        C14087h.m44470a(this.f30499e, bArr, i + 4);
        C14087h.m44470a(this.f30500f, bArr, i + 8);
        C14087h.m44470a(this.f30501g, bArr, i + 12);
        C14087h.m44470a(this.f30502h, bArr, i + 16);
        reset();
        return 20;
    }
}
