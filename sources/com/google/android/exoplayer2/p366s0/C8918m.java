package com.google.android.exoplayer2.p366s0;

/* renamed from: com.google.android.exoplayer2.s0.m */
/* compiled from: MpegAudioHeader */
public final class C8918m {

    /* renamed from: h */
    private static final String[] f19149h = {"audio/mpeg-L1", "audio/mpeg-L2", "audio/mpeg"};

    /* renamed from: i */
    private static final int[] f19150i = {44100, 48000, 32000};

    /* renamed from: j */
    private static final int[] f19151j = {32000, 64000, 96000, 128000, 160000, 192000, 224000, 256000, 288000, 320000, 352000, 384000, 416000, 448000};

    /* renamed from: k */
    private static final int[] f19152k = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000, 176000, 192000, 224000, 256000};

    /* renamed from: l */
    private static final int[] f19153l = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000, 384000};

    /* renamed from: m */
    private static final int[] f19154m = {32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000};

    /* renamed from: n */
    private static final int[] f19155n = {8000, 16000, 24000, 32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000};

    /* renamed from: a */
    public int f19156a;

    /* renamed from: b */
    public String f19157b;

    /* renamed from: c */
    public int f19158c;

    /* renamed from: d */
    public int f19159d;

    /* renamed from: e */
    public int f19160e;

    /* renamed from: f */
    public int f19161f;

    /* renamed from: g */
    public int f19162g;

    /* renamed from: a */
    public static int m26171a(int i) {
        if ((i & -2097152) != -2097152) {
            return -1;
        }
        int i2 = (i >>> 19) & 3;
        if (i2 == 1) {
            return -1;
        }
        int i3 = (i >>> 17) & 3;
        if (i3 == 0) {
            return -1;
        }
        int i4 = (i >>> 12) & 15;
        if (i4 == 0 || i4 == 15) {
            return -1;
        }
        int i5 = (i >>> 10) & 3;
        if (i5 == 3) {
            return -1;
        }
        int i6 = f19150i[i5];
        if (i2 == 2) {
            i6 /= 2;
        } else if (i2 == 0) {
            i6 /= 4;
        }
        int i7 = (i >>> 9) & 1;
        if (i3 == 3) {
            return ((((i2 == 3 ? f19151j[i4 - 1] : f19152k[i4 - 1]) * 12) / i6) + i7) * 4;
        }
        int i8 = i2 == 3 ? i3 == 2 ? f19153l[i4 - 1] : f19154m[i4 - 1] : f19155n[i4 - 1];
        int i9 = 144;
        if (i2 == 3) {
            return ((i8 * 144) / i6) + i7;
        }
        if (i3 == 1) {
            i9 = 72;
        }
        return ((i9 * i8) / i6) + i7;
    }

    /* renamed from: a */
    public static boolean m26173a(int i, C8918m mVar) {
        int i2;
        int i3;
        int i4;
        if ((i & -2097152) != -2097152) {
            return false;
        }
        int i5 = (i >>> 19) & 3;
        if (i5 == 1) {
            return false;
        }
        int i6 = (i >>> 17) & 3;
        if (i6 == 0) {
            return false;
        }
        int i7 = (i >>> 12) & 15;
        if (i7 == 0 || i7 == 15) {
            return false;
        }
        int i8 = (i >>> 10) & 3;
        if (i8 == 3) {
            return false;
        }
        int i9 = f19150i[i8];
        if (i5 == 2) {
            i9 /= 2;
        } else if (i5 == 0) {
            i9 /= 4;
        }
        int i10 = i9;
        int i11 = (i >>> 9) & 1;
        int i12 = 1152;
        if (i6 == 3) {
            int i13 = i5 == 3 ? f19151j[i7 - 1] : f19152k[i7 - 1];
            i4 = i13;
            i3 = (((i13 * 12) / i10) + i11) * 4;
            i2 = 384;
        } else if (i5 == 3) {
            int i14 = i6 == 2 ? f19153l[i7 - 1] : f19154m[i7 - 1];
            i3 = ((i14 * 144) / i10) + i11;
            i4 = i14;
            i2 = 1152;
        } else {
            int i15 = f19155n[i7 - 1];
            if (i6 == 1) {
                i12 = 576;
            }
            i3 = (((i6 == 1 ? 72 : 144) * i15) / i10) + i11;
            i4 = i15;
            i2 = i12;
        }
        mVar.m26172a(i5, f19149h[3 - i6], i3, i10, ((i >> 6) & 3) == 3 ? 1 : 2, i4, i2);
        return true;
    }

    /* renamed from: a */
    private void m26172a(int i, String str, int i2, int i3, int i4, int i5, int i6) {
        this.f19156a = i;
        this.f19157b = str;
        this.f19158c = i2;
        this.f19159d = i3;
        this.f19160e = i4;
        this.f19161f = i5;
        this.f19162g = i6;
    }
}
