package com.google.android.exoplayer2.p366s0.p374y;

import android.util.Pair;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.p366s0.C8914i;
import com.google.android.exoplayer2.p366s0.C8924q;
import com.google.android.exoplayer2.p366s0.p374y.C9029h0.C9033d;
import com.google.android.exoplayer2.p393v0.C9568u;
import com.google.android.exoplayer2.p393v0.C9572w;
import java.util.Arrays;

/* renamed from: com.google.android.exoplayer2.s0.y.p */
/* compiled from: H262Reader */
public final class C9043p implements C9042o {

    /* renamed from: q */
    private static final double[] f19949q = {23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};

    /* renamed from: a */
    private String f19950a;

    /* renamed from: b */
    private C8924q f19951b;

    /* renamed from: c */
    private boolean f19952c;

    /* renamed from: d */
    private long f19953d;

    /* renamed from: e */
    private final C9037j0 f19954e;

    /* renamed from: f */
    private final C9572w f19955f;

    /* renamed from: g */
    private final boolean[] f19956g;

    /* renamed from: h */
    private final C9044a f19957h;

    /* renamed from: i */
    private final C9054v f19958i;

    /* renamed from: j */
    private long f19959j;

    /* renamed from: k */
    private boolean f19960k;

    /* renamed from: l */
    private long f19961l;

    /* renamed from: m */
    private long f19962m;

    /* renamed from: n */
    private long f19963n;

    /* renamed from: o */
    private boolean f19964o;

    /* renamed from: p */
    private boolean f19965p;

    /* renamed from: com.google.android.exoplayer2.s0.y.p$a */
    /* compiled from: H262Reader */
    private static final class C9044a {

        /* renamed from: e */
        private static final byte[] f19966e = {0, 0, 1};

        /* renamed from: a */
        private boolean f19967a;

        /* renamed from: b */
        public int f19968b;

        /* renamed from: c */
        public int f19969c;

        /* renamed from: d */
        public byte[] f19970d;

        public C9044a(int i) {
            this.f19970d = new byte[i];
        }

        /* renamed from: a */
        public void mo23447a() {
            this.f19967a = false;
            this.f19968b = 0;
            this.f19969c = 0;
        }

        /* renamed from: a */
        public boolean mo23449a(int i, int i2) {
            if (this.f19967a) {
                this.f19968b -= i2;
                if (this.f19969c == 0 && i == 181) {
                    this.f19969c = this.f19968b;
                } else {
                    this.f19967a = false;
                    return true;
                }
            } else if (i == 179) {
                this.f19967a = true;
            }
            byte[] bArr = f19966e;
            mo23448a(bArr, 0, bArr.length);
            return false;
        }

        /* renamed from: a */
        public void mo23448a(byte[] bArr, int i, int i2) {
            if (this.f19967a) {
                int i3 = i2 - i;
                byte[] bArr2 = this.f19970d;
                int length = bArr2.length;
                int i4 = this.f19968b;
                if (length < i4 + i3) {
                    this.f19970d = Arrays.copyOf(bArr2, (i4 + i3) * 2);
                }
                System.arraycopy(bArr, i, this.f19970d, this.f19968b, i3);
                this.f19968b += i3;
            }
        }
    }

    public C9043p() {
        this(null);
    }

    /* renamed from: a */
    public void mo23434a() {
        C9568u.m29525a(this.f19956g);
        this.f19957h.mo23447a();
        if (this.f19954e != null) {
            this.f19958i.mo23468b();
        }
        this.f19959j = 0;
        this.f19960k = false;
    }

    /* renamed from: b */
    public void mo23438b() {
    }

    public C9043p(C9037j0 j0Var) {
        this.f19954e = j0Var;
        this.f19956g = new boolean[4];
        this.f19957h = new C9044a(128);
        if (j0Var != null) {
            this.f19958i = new C9054v(178, 128);
            this.f19955f = new C9572w();
            return;
        }
        this.f19958i = null;
        this.f19955f = null;
    }

    /* renamed from: a */
    public void mo23436a(C8914i iVar, C9033d dVar) {
        dVar.mo23441a();
        this.f19950a = dVar.mo23442b();
        this.f19951b = iVar.mo23311a(dVar.mo23443c(), 2);
        C9037j0 j0Var = this.f19954e;
        if (j0Var != null) {
            j0Var.mo23445a(iVar, dVar);
        }
    }

    /* renamed from: a */
    public void mo23435a(long j, int i) {
        this.f19961l = j;
    }

    /* renamed from: a */
    public void mo23437a(C9572w wVar) {
        int i;
        C9572w wVar2 = wVar;
        int c = wVar.mo24688c();
        int d = wVar.mo24690d();
        byte[] bArr = wVar2.f22333a;
        this.f19959j += (long) wVar.mo24679a();
        this.f19951b.mo23305a(wVar2, wVar.mo24679a());
        while (true) {
            int a = C9568u.m29522a(bArr, c, d, this.f19956g);
            if (a == d) {
                break;
            }
            int i2 = a + 3;
            byte b = wVar2.f22333a[i2] & 255;
            int i3 = a - c;
            boolean z = false;
            if (!this.f19952c) {
                if (i3 > 0) {
                    this.f19957h.mo23448a(bArr, c, a);
                }
                if (this.f19957h.mo23449a(b, i3 < 0 ? -i3 : 0)) {
                    Pair a2 = m26780a(this.f19957h, this.f19950a);
                    this.f19951b.mo23304a((Format) a2.first);
                    this.f19953d = ((Long) a2.second).longValue();
                    this.f19952c = true;
                }
            }
            if (this.f19954e != null) {
                if (i3 > 0) {
                    this.f19958i.mo23465a(bArr, c, a);
                    i = 0;
                } else {
                    i = -i3;
                }
                if (this.f19958i.mo23467a(i)) {
                    C9054v vVar = this.f19958i;
                    this.f19955f.mo24684a(this.f19958i.f20088d, C9568u.m29529c(vVar.f20088d, vVar.f20089e));
                    this.f19954e.mo23444a(this.f19963n, this.f19955f);
                }
                if (b == 178 && wVar2.f22333a[a + 2] == 1) {
                    this.f19958i.mo23469b(b);
                }
            }
            if (b == 0 || b == 179) {
                int i4 = d - a;
                if (this.f19960k && this.f19965p && this.f19952c) {
                    this.f19951b.mo23303a(this.f19963n, this.f19964o ? 1 : 0, ((int) (this.f19959j - this.f19962m)) - i4, i4, null);
                }
                if (!this.f19960k || this.f19965p) {
                    this.f19962m = this.f19959j - ((long) i4);
                    long j = this.f19961l;
                    if (j == -9223372036854775807L) {
                        j = this.f19960k ? this.f19963n + this.f19953d : 0;
                    }
                    this.f19963n = j;
                    this.f19964o = false;
                    this.f19961l = -9223372036854775807L;
                    this.f19960k = true;
                }
                if (b == 0) {
                    z = true;
                }
                this.f19965p = z;
            } else if (b == 184) {
                this.f19964o = true;
            }
            c = i2;
        }
        if (!this.f19952c) {
            this.f19957h.mo23448a(bArr, c, d);
        }
        if (this.f19954e != null) {
            this.f19958i.mo23465a(bArr, c, d);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x006b  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.util.Pair<com.google.android.exoplayer2.Format, java.lang.Long> m26780a(com.google.android.exoplayer2.p366s0.p374y.C9043p.C9044a r20, java.lang.String r21) {
        /*
            r0 = r20
            byte[] r1 = r0.f19970d
            int r2 = r0.f19968b
            byte[] r1 = java.util.Arrays.copyOf(r1, r2)
            r2 = 4
            byte r3 = r1[r2]
            r3 = r3 & 255(0xff, float:3.57E-43)
            r4 = 5
            byte r5 = r1[r4]
            r5 = r5 & 255(0xff, float:3.57E-43)
            r6 = 6
            byte r6 = r1[r6]
            r6 = r6 & 255(0xff, float:3.57E-43)
            int r3 = r3 << r2
            int r7 = r5 >> 4
            r13 = r3 | r7
            r3 = r5 & 15
            int r3 = r3 << 8
            r14 = r3 | r6
            r3 = 7
            byte r5 = r1[r3]
            r5 = r5 & 240(0xf0, float:3.36E-43)
            int r5 = r5 >> r2
            r6 = 2
            if (r5 == r6) goto L_0x0043
            r6 = 3
            if (r5 == r6) goto L_0x003d
            if (r5 == r2) goto L_0x0037
            r2 = 1065353216(0x3f800000, float:1.0)
            r18 = 1065353216(0x3f800000, float:1.0)
            goto L_0x004c
        L_0x0037:
            int r2 = r14 * 121
            float r2 = (float) r2
            int r5 = r13 * 100
            goto L_0x0048
        L_0x003d:
            int r2 = r14 * 16
            float r2 = (float) r2
            int r5 = r13 * 9
            goto L_0x0048
        L_0x0043:
            int r2 = r14 * 4
            float r2 = (float) r2
            int r5 = r13 * 3
        L_0x0048:
            float r5 = (float) r5
            float r2 = r2 / r5
            r18 = r2
        L_0x004c:
            r10 = 0
            r11 = -1
            r12 = -1
            r15 = -1082130432(0xffffffffbf800000, float:-1.0)
            java.util.List r16 = java.util.Collections.singletonList(r1)
            r17 = -1
            r19 = 0
            java.lang.String r9 = "video/mpeg2"
            r8 = r21
            com.google.android.exoplayer2.Format r2 = com.google.android.exoplayer2.Format.m24871a(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            r5 = 0
            byte r3 = r1[r3]
            r3 = r3 & 15
            int r3 = r3 + -1
            if (r3 < 0) goto L_0x0092
            double[] r7 = f19949q
            int r8 = r7.length
            if (r3 >= r8) goto L_0x0092
            r5 = r7[r3]
            int r0 = r0.f19969c
            int r0 = r0 + 9
            byte r3 = r1[r0]
            r3 = r3 & 96
            int r3 = r3 >> r4
            byte r0 = r1[r0]
            r0 = r0 & 31
            if (r3 == r0) goto L_0x008b
            double r3 = (double) r3
            r7 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r3 = r3 + r7
            int r0 = r0 + 1
            double r0 = (double) r0
            double r3 = r3 / r0
            double r5 = r5 * r3
        L_0x008b:
            r0 = 4696837146684686336(0x412e848000000000, double:1000000.0)
            double r0 = r0 / r5
            long r5 = (long) r0
        L_0x0092:
            java.lang.Long r0 = java.lang.Long.valueOf(r5)
            android.util.Pair r0 = android.util.Pair.create(r2, r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.p366s0.p374y.C9043p.m26780a(com.google.android.exoplayer2.s0.y.p$a, java.lang.String):android.util.Pair");
    }
}
