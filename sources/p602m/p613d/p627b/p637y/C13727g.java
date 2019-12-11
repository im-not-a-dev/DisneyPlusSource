package p602m.p613d.p627b.p637y;

import p602m.p613d.p683g.C14087h;

/* renamed from: m.d.b.y.g */
/* compiled from: SHA256Digest */
public class C13727g extends C13722b implements C13721a {

    /* renamed from: n */
    static final int[] f30516n = {1116352408, 1899447441, -1245643825, -373957723, 961987163, 1508970993, -1841331548, -1424204075, -670586216, 310598401, 607225278, 1426881987, 1925078388, -2132889090, -1680079193, -1046744716, -459576895, -272742522, 264347078, 604807628, 770255983, 1249150122, 1555081692, 1996064986, -1740746414, -1473132947, -1341970488, -1084653625, -958395405, -710438585, 113926993, 338241895, 666307205, 773529912, 1294757372, 1396182291, 1695183700, 1986661051, -2117940946, -1838011259, -1564481375, -1474664885, -1035236496, -949202525, -778901479, -694614492, -200395387, 275423344, 430227734, 506948616, 659060556, 883997877, 958139571, 1322822218, 1537002063, 1747873779, 1955562222, 2024104815, -2067236844, -1933114872, -1866530822, -1538233109, -1090935817, -965641998};

    /* renamed from: d */
    private int f30517d;

    /* renamed from: e */
    private int f30518e;

    /* renamed from: f */
    private int f30519f;

    /* renamed from: g */
    private int f30520g;

    /* renamed from: h */
    private int f30521h;

    /* renamed from: i */
    private int f30522i;

    /* renamed from: j */
    private int f30523j;

    /* renamed from: k */
    private int f30524k;

    /* renamed from: l */
    private int[] f30525l = new int[64];

    /* renamed from: m */
    private int f30526m;

    public C13727g() {
        reset();
    }

    /* renamed from: a */
    private int m42181a(int i) {
        return ((i << 10) | (i >>> 22)) ^ (((i >>> 2) | (i << 30)) ^ ((i >>> 13) | (i << 19)));
    }

    /* renamed from: a */
    private int m42182a(int i, int i2, int i3) {
        return ((~i) & i3) ^ (i2 & i);
    }

    /* renamed from: b */
    private int m42183b(int i) {
        return ((i << 7) | (i >>> 25)) ^ (((i >>> 6) | (i << 26)) ^ ((i >>> 11) | (i << 21)));
    }

    /* renamed from: b */
    private int m42184b(int i, int i2, int i3) {
        return ((i & i3) ^ (i & i2)) ^ (i2 & i3);
    }

    /* renamed from: c */
    private int m42185c(int i) {
        return (i >>> 3) ^ (((i >>> 7) | (i << 25)) ^ ((i >>> 18) | (i << 14)));
    }

    /* renamed from: d */
    private int m42186d(int i) {
        return (i >>> 10) ^ (((i >>> 17) | (i << 15)) ^ ((i >>> 19) | (i << 13)));
    }

    /* renamed from: a */
    public String mo34971a() {
        return "SHA-256";
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo34980a(long j) {
        if (this.f30526m > 14) {
            mo34983d();
        }
        int[] iArr = this.f30525l;
        iArr[14] = (int) (j >>> 32);
        iArr[15] = (int) (j & -1);
    }

    /* renamed from: b */
    public int mo34973b() {
        return 32;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo34981b(byte[] bArr, int i) {
        int i2 = i + 1;
        int i3 = i2 + 1;
        int i4 = (bArr[i3 + 1] & 255) | (bArr[i] << 24) | ((bArr[i2] & 255) << 16) | ((bArr[i3] & 255) << 8);
        int[] iArr = this.f30525l;
        int i5 = this.f30526m;
        iArr[i5] = i4;
        int i6 = i5 + 1;
        this.f30526m = i6;
        if (i6 == 16) {
            mo34983d();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo34983d() {
        for (int i = 16; i <= 63; i++) {
            int[] iArr = this.f30525l;
            int d = m42186d(iArr[i - 2]);
            int[] iArr2 = this.f30525l;
            iArr[i] = d + iArr2[i - 7] + m42185c(iArr2[i - 15]) + this.f30525l[i - 16];
        }
        int i2 = this.f30517d;
        int i3 = this.f30518e;
        int i4 = this.f30519f;
        int i5 = this.f30520g;
        int i6 = this.f30521h;
        int i7 = this.f30522i;
        int i8 = this.f30523j;
        int i9 = this.f30524k;
        int i10 = 0;
        int i11 = i8;
        int i12 = i7;
        int i13 = i6;
        int i14 = i5;
        int i15 = i4;
        int i16 = i3;
        int i17 = i2;
        for (int i18 = 0; i18 < 8; i18++) {
            int b = i9 + m42183b(i13) + m42182a(i13, i12, i11) + f30516n[i10] + this.f30525l[i10];
            int i19 = i14 + b;
            int a = b + m42181a(i17) + m42184b(i17, i16, i15);
            int i20 = i10 + 1;
            int b2 = i11 + m42183b(i19) + m42182a(i19, i13, i12) + f30516n[i20] + this.f30525l[i20];
            int i21 = i15 + b2;
            int a2 = b2 + m42181a(a) + m42184b(a, i17, i16);
            int i22 = i20 + 1;
            int b3 = i12 + m42183b(i21) + m42182a(i21, i19, i13) + f30516n[i22] + this.f30525l[i22];
            int i23 = i16 + b3;
            int a3 = b3 + m42181a(a2) + m42184b(a2, a, i17);
            int i24 = i22 + 1;
            int b4 = i13 + m42183b(i23) + m42182a(i23, i21, i19) + f30516n[i24] + this.f30525l[i24];
            int i25 = i17 + b4;
            int a4 = b4 + m42181a(a3) + m42184b(a3, a2, a);
            int i26 = i24 + 1;
            int b5 = i19 + m42183b(i25) + m42182a(i25, i23, i21) + f30516n[i26] + this.f30525l[i26];
            i9 = a + b5;
            i14 = b5 + m42181a(a4) + m42184b(a4, a3, a2);
            int i27 = i26 + 1;
            int b6 = i21 + m42183b(i9) + m42182a(i9, i25, i23) + f30516n[i27] + this.f30525l[i27];
            i11 = a2 + b6;
            i15 = b6 + m42181a(i14) + m42184b(i14, a4, a3);
            int i28 = i27 + 1;
            int b7 = i23 + m42183b(i11) + m42182a(i11, i9, i25) + f30516n[i28] + this.f30525l[i28];
            i12 = a3 + b7;
            i16 = b7 + m42181a(i15) + m42184b(i15, i14, a4);
            int i29 = i28 + 1;
            int b8 = i25 + m42183b(i12) + m42182a(i12, i11, i9) + f30516n[i29] + this.f30525l[i29];
            i13 = a4 + b8;
            i17 = b8 + m42181a(i16) + m42184b(i16, i15, i14);
            i10 = i29 + 1;
        }
        this.f30517d += i17;
        this.f30518e += i16;
        this.f30519f += i15;
        this.f30520g += i14;
        this.f30521h += i13;
        this.f30522i += i12;
        this.f30523j += i11;
        this.f30524k += i9;
        this.f30526m = 0;
        for (int i30 = 0; i30 < 16; i30++) {
            this.f30525l[i30] = 0;
        }
    }

    public void reset() {
        super.reset();
        this.f30517d = 1779033703;
        this.f30518e = -1150833019;
        this.f30519f = 1013904242;
        this.f30520g = -1521486534;
        this.f30521h = 1359893119;
        this.f30522i = -1694144372;
        this.f30523j = 528734635;
        this.f30524k = 1541459225;
        this.f30526m = 0;
        int i = 0;
        while (true) {
            int[] iArr = this.f30525l;
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
        C14087h.m44470a(this.f30517d, bArr, i);
        C14087h.m44470a(this.f30518e, bArr, i + 4);
        C14087h.m44470a(this.f30519f, bArr, i + 8);
        C14087h.m44470a(this.f30520g, bArr, i + 12);
        C14087h.m44470a(this.f30521h, bArr, i + 16);
        C14087h.m44470a(this.f30522i, bArr, i + 20);
        C14087h.m44470a(this.f30523j, bArr, i + 24);
        C14087h.m44470a(this.f30524k, bArr, i + 28);
        reset();
        return 32;
    }
}
