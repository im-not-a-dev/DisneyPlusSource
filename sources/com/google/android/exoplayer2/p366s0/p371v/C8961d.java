package com.google.android.exoplayer2.p366s0.p371v;

import android.util.Pair;
import com.google.android.exoplayer2.C8723g0;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.Metadata.C8737b;
import com.google.android.exoplayer2.p361p0.C8825g;
import com.google.android.exoplayer2.p361p0.C8828h;
import com.google.android.exoplayer2.p393v0.C9537e;
import com.google.android.exoplayer2.p393v0.C9544h;
import com.google.android.exoplayer2.p393v0.C9554k0;
import com.google.android.exoplayer2.p393v0.C9563q;
import com.google.android.exoplayer2.p393v0.C9566t;
import com.google.android.exoplayer2.p393v0.C9572w;
import com.google.android.exoplayer2.p394w0.C9585h;
import com.google.android.exoplayer2.p394w0.C9586i;
import com.google.android.exoplayer2.p394w0.C9588j;
import com.google.android.exoplayer2.p394w0.C9592l;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.exoplayer2.s0.v.d */
/* compiled from: AtomParsers */
final class C8961d {

    /* renamed from: a */
    private static final int f19504a = C9554k0.m29428b("vide");

    /* renamed from: b */
    private static final int f19505b = C9554k0.m29428b("soun");

    /* renamed from: c */
    private static final int f19506c = C9554k0.m29428b("text");

    /* renamed from: d */
    private static final int f19507d = C9554k0.m29428b("sbtl");

    /* renamed from: e */
    private static final int f19508e = C9554k0.m29428b("subt");

    /* renamed from: f */
    private static final int f19509f = C9554k0.m29428b("clcp");

    /* renamed from: g */
    private static final int f19510g = C9554k0.m29428b("meta");

    /* renamed from: h */
    private static final int f19511h = C9554k0.m29428b("mdta");

    /* renamed from: i */
    private static final byte[] f19512i = C9554k0.m29447d("OpusHead");

    /* renamed from: com.google.android.exoplayer2.s0.v.d$a */
    /* compiled from: AtomParsers */
    private static final class C8962a {

        /* renamed from: a */
        public final int f19513a;

        /* renamed from: b */
        public int f19514b;

        /* renamed from: c */
        public int f19515c;

        /* renamed from: d */
        public long f19516d;

        /* renamed from: e */
        private final boolean f19517e;

        /* renamed from: f */
        private final C9572w f19518f;

        /* renamed from: g */
        private final C9572w f19519g;

        /* renamed from: h */
        private int f19520h;

        /* renamed from: i */
        private int f19521i;

        public C8962a(C9572w wVar, C9572w wVar2, boolean z) {
            this.f19519g = wVar;
            this.f19518f = wVar2;
            this.f19517e = z;
            wVar2.mo24693e(12);
            this.f19513a = wVar2.mo24715z();
            wVar.mo24693e(12);
            this.f19521i = wVar.mo24715z();
            boolean z2 = true;
            if (wVar.mo24698i() != 1) {
                z2 = false;
            }
            C9537e.m29302b(z2, "first_chunk must be 1");
            this.f19514b = -1;
        }

        /* renamed from: a */
        public boolean mo23367a() {
            long j;
            int i = this.f19514b + 1;
            this.f19514b = i;
            if (i == this.f19513a) {
                return false;
            }
            if (this.f19517e) {
                j = this.f19518f.mo24675A();
            } else {
                j = this.f19518f.mo24713x();
            }
            this.f19516d = j;
            if (this.f19514b == this.f19520h) {
                this.f19515c = this.f19519g.mo24715z();
                this.f19519g.mo24695f(4);
                int i2 = this.f19521i - 1;
                this.f19521i = i2;
                this.f19520h = i2 > 0 ? this.f19519g.mo24715z() - 1 : -1;
            }
            return true;
        }
    }

    /* renamed from: com.google.android.exoplayer2.s0.v.d$b */
    /* compiled from: AtomParsers */
    private interface C8963b {
        /* renamed from: a */
        boolean mo23368a();

        /* renamed from: b */
        int mo23369b();

        /* renamed from: c */
        int mo23370c();
    }

    /* renamed from: com.google.android.exoplayer2.s0.v.d$c */
    /* compiled from: AtomParsers */
    private static final class C8964c {

        /* renamed from: a */
        public final C8984n[] f19522a;

        /* renamed from: b */
        public Format f19523b;

        /* renamed from: c */
        public int f19524c;

        /* renamed from: d */
        public int f19525d = 0;

        public C8964c(int i) {
            this.f19522a = new C8984n[i];
        }
    }

    /* renamed from: com.google.android.exoplayer2.s0.v.d$d */
    /* compiled from: AtomParsers */
    static final class C8965d implements C8963b {

        /* renamed from: a */
        private final int f19526a = this.f19528c.mo24715z();

        /* renamed from: b */
        private final int f19527b = this.f19528c.mo24715z();

        /* renamed from: c */
        private final C9572w f19528c;

        public C8965d(C8960b bVar) {
            this.f19528c = bVar.f19503g1;
            this.f19528c.mo24693e(12);
        }

        /* renamed from: a */
        public boolean mo23368a() {
            return this.f19526a != 0;
        }

        /* renamed from: b */
        public int mo23369b() {
            return this.f19527b;
        }

        /* renamed from: c */
        public int mo23370c() {
            int i = this.f19526a;
            return i == 0 ? this.f19528c.mo24715z() : i;
        }
    }

    /* renamed from: com.google.android.exoplayer2.s0.v.d$e */
    /* compiled from: AtomParsers */
    static final class C8966e implements C8963b {

        /* renamed from: a */
        private final C9572w f19529a;

        /* renamed from: b */
        private final int f19530b = this.f19529a.mo24715z();

        /* renamed from: c */
        private final int f19531c = (this.f19529a.mo24715z() & 255);

        /* renamed from: d */
        private int f19532d;

        /* renamed from: e */
        private int f19533e;

        public C8966e(C8960b bVar) {
            this.f19529a = bVar.f19503g1;
            this.f19529a.mo24693e(12);
        }

        /* renamed from: a */
        public boolean mo23368a() {
            return false;
        }

        /* renamed from: b */
        public int mo23369b() {
            return this.f19530b;
        }

        /* renamed from: c */
        public int mo23370c() {
            int i = this.f19531c;
            if (i == 8) {
                return this.f19529a.mo24711v();
            }
            if (i == 16) {
                return this.f19529a.mo24676B();
            }
            int i2 = this.f19532d;
            this.f19532d = i2 + 1;
            if (i2 % 2 != 0) {
                return this.f19533e & 15;
            }
            this.f19533e = this.f19529a.mo24711v();
            return (this.f19533e & 240) >> 4;
        }
    }

    /* renamed from: com.google.android.exoplayer2.s0.v.d$f */
    /* compiled from: AtomParsers */
    private static final class C8967f {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public final int f19534a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public final long f19535b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public final int f19536c;

        public C8967f(int i, long j, int i2) {
            this.f19534a = i;
            this.f19535b = j;
            this.f19536c = i2;
        }
    }

    /* renamed from: a */
    public static C8983m m26369a(C8959a aVar, C8960b bVar, long j, DrmInitData drmInitData, boolean z, boolean z2) throws C8723g0 {
        long j2;
        C8960b bVar2;
        long[] jArr;
        long[] jArr2;
        C8983m mVar;
        C8959a aVar2 = aVar;
        C8959a d = aVar2.mo23365d(C8958c.f19430U);
        int a = m26362a(m26376b(d.mo23366e(C8958c.f19460g0).f19503g1));
        if (a == -1) {
            return null;
        }
        C8967f e = m26386e(aVar2.mo23366e(C8958c.f19448c0).f19503g1);
        long j3 = -9223372036854775807L;
        if (j == -9223372036854775807L) {
            j2 = e.f19535b;
            bVar2 = bVar;
        } else {
            bVar2 = bVar;
            j2 = j;
        }
        long d2 = m26383d(bVar2.f19503g1);
        if (j2 != -9223372036854775807L) {
            j3 = C9554k0.m29439c(j2, 1000000, d2);
        }
        long j4 = j3;
        C8959a d3 = d.mo23365d(C8958c.f19432V).mo23365d(C8958c.f19434W);
        Pair c = m26381c(d.mo23366e(C8958c.f19457f0).f19503g1);
        C8964c a2 = m26368a(d3.mo23366e(C8958c.f19462h0).f19503g1, e.f19534a, e.f19536c, (String) c.second, drmInitData, z2);
        if (!z) {
            Pair a3 = m26365a(aVar2.mo23365d(C8958c.f19451d0));
            jArr = (long[]) a3.second;
            jArr2 = (long[]) a3.first;
        } else {
            jArr2 = null;
            jArr = null;
        }
        if (a2.f19523b == null) {
            mVar = null;
        } else {
            int b = e.f19534a;
            long longValue = ((Long) c.first).longValue();
            Format format = a2.f19523b;
            int i = a2.f19525d;
            C8984n[] nVarArr = a2.f19522a;
            int i2 = a2.f19524c;
            mVar = new C8983m(b, a, longValue, d2, j4, format, i, nVarArr, i2, jArr2, jArr);
        }
        return mVar;
    }

    /* renamed from: b */
    public static Metadata m26378b(C8959a aVar) {
        C8960b e = aVar.mo23366e(C8958c.f19460g0);
        C8960b e2 = aVar.mo23366e(C8958c.f19421P0);
        C8960b e3 = aVar.mo23366e(C8958c.f19423Q0);
        if (e == null || e2 == null || e3 == null || m26376b(e.f19503g1) != f19511h) {
            return null;
        }
        C9572w wVar = e2.f19503g1;
        wVar.mo24693e(12);
        int i = wVar.mo24698i();
        String[] strArr = new String[i];
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = wVar.mo24698i();
            wVar.mo24695f(4);
            strArr[i2] = wVar.mo24687b(i3 - 8);
        }
        C9572w wVar2 = e3.f19503g1;
        wVar2.mo24693e(8);
        ArrayList arrayList = new ArrayList();
        while (wVar2.mo24679a() > 8) {
            int c = wVar2.mo24688c();
            int i4 = wVar2.mo24698i();
            int i5 = wVar2.mo24698i() - 1;
            if (i5 < 0 || i5 >= strArr.length) {
                StringBuilder sb = new StringBuilder();
                sb.append("Skipped metadata with unknown key index: ");
                sb.append(i5);
                C9563q.m29500d("AtomParsers", sb.toString());
            } else {
                C8975h a = C8977i.m26460a(wVar2, c + i4, strArr[i5]);
                if (a != null) {
                    arrayList.add(a);
                }
            }
            wVar2.mo24693e(c + i4);
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new Metadata((List<? extends C8737b>) arrayList);
    }

    /* renamed from: c */
    private static Pair<Long, String> m26381c(C9572w wVar) {
        int i = 8;
        wVar.mo24693e(8);
        int c = C8958c.m26357c(wVar.mo24698i());
        wVar.mo24695f(c == 0 ? 8 : 16);
        long x = wVar.mo24713x();
        if (c == 0) {
            i = 4;
        }
        wVar.mo24695f(i);
        int B = wVar.mo24676B();
        StringBuilder sb = new StringBuilder();
        sb.append("");
        sb.append((char) (((B >> 10) & 31) + 96));
        sb.append((char) (((B >> 5) & 31) + 96));
        sb.append((char) ((B & 31) + 96));
        return Pair.create(Long.valueOf(x), sb.toString());
    }

    /* renamed from: d */
    private static Metadata m26385d(C9572w wVar, int i) {
        wVar.mo24695f(12);
        while (wVar.mo24688c() < i) {
            int c = wVar.mo24688c();
            int i2 = wVar.mo24698i();
            if (wVar.mo24698i() == C8958c.f19423Q0) {
                wVar.mo24693e(c);
                return m26379b(wVar, c + i2);
            }
            wVar.mo24693e(c + i2);
        }
        return null;
    }

    /* renamed from: e */
    private static C8967f m26386e(C9572w wVar) {
        boolean z;
        int i = 8;
        wVar.mo24693e(8);
        int c = C8958c.m26357c(wVar.mo24698i());
        wVar.mo24695f(c == 0 ? 8 : 16);
        int i2 = wVar.mo24698i();
        wVar.mo24695f(4);
        int c2 = wVar.mo24688c();
        if (c == 0) {
            i = 4;
        }
        int i3 = 0;
        int i4 = 0;
        while (true) {
            if (i4 >= i) {
                z = true;
                break;
            } else if (wVar.f22333a[c2 + i4] != -1) {
                z = false;
                break;
            } else {
                i4++;
            }
        }
        long j = -9223372036854775807L;
        if (z) {
            wVar.mo24695f(i);
        } else {
            long x = c == 0 ? wVar.mo24713x() : wVar.mo24675A();
            if (x != 0) {
                j = x;
            }
        }
        wVar.mo24695f(16);
        int i5 = wVar.mo24698i();
        int i6 = wVar.mo24698i();
        wVar.mo24695f(4);
        int i7 = wVar.mo24698i();
        int i8 = wVar.mo24698i();
        if (i5 == 0 && i6 == 65536 && i7 == -65536 && i8 == 0) {
            i3 = 90;
        } else if (i5 == 0 && i6 == -65536 && i7 == 65536 && i8 == 0) {
            i3 = 270;
        } else if (i5 == -65536 && i6 == 0 && i7 == 0 && i8 == -65536) {
            i3 = 180;
        }
        return new C8967f(i2, j, i3);
    }

    /* renamed from: c */
    private static float m26380c(C9572w wVar, int i) {
        wVar.mo24693e(i + 8);
        return ((float) wVar.mo24715z()) / ((float) wVar.mo24715z());
    }

    /* renamed from: d */
    private static long m26383d(C9572w wVar) {
        int i = 8;
        wVar.mo24693e(8);
        if (C8958c.m26357c(wVar.mo24698i()) != 0) {
            i = 16;
        }
        wVar.mo24695f(i);
        return wVar.mo24713x();
    }

    /* renamed from: c */
    private static byte[] m26382c(C9572w wVar, int i, int i2) {
        int i3 = i + 8;
        while (i3 - i < i2) {
            wVar.mo24693e(i3);
            int i4 = wVar.mo24698i();
            if (wVar.mo24698i() == C8958c.f19437X0) {
                return Arrays.copyOfRange(wVar.f22333a, i3, i4 + i3);
            }
            i3 += i4;
        }
        return null;
    }

    /* renamed from: d */
    private static Pair<Integer, C8984n> m26384d(C9572w wVar, int i, int i2) {
        int c = wVar.mo24688c();
        while (c - i < i2) {
            wVar.mo24693e(c);
            int i3 = wVar.mo24698i();
            C9537e.m29300a(i3 > 0, (Object) "childAtomSize should be positive");
            if (wVar.mo24698i() == C8958c.f19466j0) {
                Pair<Integer, C8984n> b = m26377b(wVar, c, i3);
                if (b != null) {
                    return b;
                }
            }
            c += i3;
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:104:0x0244  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00d7  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.android.exoplayer2.p366s0.p371v.C8986p m26371a(com.google.android.exoplayer2.p366s0.p371v.C8983m r35, com.google.android.exoplayer2.p366s0.p371v.C8958c.C8959a r36, com.google.android.exoplayer2.p366s0.C8916k r37) throws com.google.android.exoplayer2.C8723g0 {
        /*
            r1 = r35
            r0 = r36
            r2 = r37
            int r3 = com.google.android.exoplayer2.p366s0.p371v.C8958c.f19397D0
            com.google.android.exoplayer2.s0.v.c$b r3 = r0.mo23366e(r3)
            if (r3 == 0) goto L_0x0014
            com.google.android.exoplayer2.s0.v.d$d r4 = new com.google.android.exoplayer2.s0.v.d$d
            r4.<init>(r3)
            goto L_0x0021
        L_0x0014:
            int r3 = com.google.android.exoplayer2.p366s0.p371v.C8958c.f19399E0
            com.google.android.exoplayer2.s0.v.c$b r3 = r0.mo23366e(r3)
            if (r3 == 0) goto L_0x04cf
            com.google.android.exoplayer2.s0.v.d$e r4 = new com.google.android.exoplayer2.s0.v.d$e
            r4.<init>(r3)
        L_0x0021:
            int r3 = r4.mo23369b()
            r5 = 0
            if (r3 != 0) goto L_0x0042
            com.google.android.exoplayer2.s0.v.p r9 = new com.google.android.exoplayer2.s0.v.p
            long[] r2 = new long[r5]
            int[] r3 = new int[r5]
            r4 = 0
            long[] r6 = new long[r5]
            int[] r7 = new int[r5]
            r10 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r0 = r9
            r1 = r35
            r5 = r6
            r6 = r7
            r7 = r10
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return r9
        L_0x0042:
            int r6 = com.google.android.exoplayer2.p366s0.p371v.C8958c.f19401F0
            com.google.android.exoplayer2.s0.v.c$b r6 = r0.mo23366e(r6)
            r7 = 1
            if (r6 != 0) goto L_0x0053
            int r6 = com.google.android.exoplayer2.p366s0.p371v.C8958c.f19403G0
            com.google.android.exoplayer2.s0.v.c$b r6 = r0.mo23366e(r6)
            r8 = 1
            goto L_0x0054
        L_0x0053:
            r8 = 0
        L_0x0054:
            com.google.android.exoplayer2.v0.w r6 = r6.f19503g1
            int r9 = com.google.android.exoplayer2.p366s0.p371v.C8958c.f19395C0
            com.google.android.exoplayer2.s0.v.c$b r9 = r0.mo23366e(r9)
            com.google.android.exoplayer2.v0.w r9 = r9.f19503g1
            int r10 = com.google.android.exoplayer2.p366s0.p371v.C8958c.f19498z0
            com.google.android.exoplayer2.s0.v.c$b r10 = r0.mo23366e(r10)
            com.google.android.exoplayer2.v0.w r10 = r10.f19503g1
            int r11 = com.google.android.exoplayer2.p366s0.p371v.C8958c.f19391A0
            com.google.android.exoplayer2.s0.v.c$b r11 = r0.mo23366e(r11)
            r12 = 0
            if (r11 == 0) goto L_0x0072
            com.google.android.exoplayer2.v0.w r11 = r11.f19503g1
            goto L_0x0073
        L_0x0072:
            r11 = r12
        L_0x0073:
            int r13 = com.google.android.exoplayer2.p366s0.p371v.C8958c.f19393B0
            com.google.android.exoplayer2.s0.v.c$b r0 = r0.mo23366e(r13)
            if (r0 == 0) goto L_0x007e
            com.google.android.exoplayer2.v0.w r0 = r0.f19503g1
            goto L_0x007f
        L_0x007e:
            r0 = r12
        L_0x007f:
            com.google.android.exoplayer2.s0.v.d$a r13 = new com.google.android.exoplayer2.s0.v.d$a
            r13.<init>(r9, r6, r8)
            r6 = 12
            r10.mo24693e(r6)
            int r8 = r10.mo24715z()
            int r8 = r8 - r7
            int r9 = r10.mo24715z()
            int r14 = r10.mo24715z()
            if (r0 == 0) goto L_0x00a0
            r0.mo24693e(r6)
            int r15 = r0.mo24715z()
            goto L_0x00a1
        L_0x00a0:
            r15 = 0
        L_0x00a1:
            r16 = -1
            if (r11 == 0) goto L_0x00b7
            r11.mo24693e(r6)
            int r6 = r11.mo24715z()
            if (r6 <= 0) goto L_0x00b5
            int r12 = r11.mo24715z()
            int r16 = r12 + -1
            goto L_0x00b8
        L_0x00b5:
            r11 = r12
            goto L_0x00b8
        L_0x00b7:
            r6 = 0
        L_0x00b8:
            boolean r12 = r4.mo23368a()
            if (r12 == 0) goto L_0x00d2
            com.google.android.exoplayer2.Format r12 = r1.f19667f
            java.lang.String r12 = r12.f18349b0
            java.lang.String r5 = "audio/raw"
            boolean r5 = r5.equals(r12)
            if (r5 == 0) goto L_0x00d2
            if (r8 != 0) goto L_0x00d2
            if (r15 != 0) goto L_0x00d2
            if (r6 != 0) goto L_0x00d2
            r5 = 1
            goto L_0x00d3
        L_0x00d2:
            r5 = 0
        L_0x00d3:
            r18 = 0
            if (r5 != 0) goto L_0x0244
            long[] r5 = new long[r3]
            int[] r12 = new int[r3]
            long[] r7 = new long[r3]
            r36 = r6
            int[] r6 = new int[r3]
            r28 = r8
            r27 = r10
            r10 = r14
            r21 = r18
            r23 = r21
            r1 = 0
            r8 = 0
            r25 = 0
            r26 = 0
            r14 = r36
            r36 = r15
            r15 = r9
            r9 = r16
            r16 = 0
        L_0x00f9:
            java.lang.String r2 = "AtomParsers"
            if (r8 >= r3) goto L_0x01b9
            r29 = r23
            r23 = 1
        L_0x0101:
            if (r16 != 0) goto L_0x011e
            boolean r23 = r13.mo23367a()
            if (r23 == 0) goto L_0x011e
            r24 = r14
            r31 = r15
            long r14 = r13.f19516d
            r32 = r3
            int r3 = r13.f19515c
            r16 = r3
            r29 = r14
            r14 = r24
            r15 = r31
            r3 = r32
            goto L_0x0101
        L_0x011e:
            r32 = r3
            r24 = r14
            r31 = r15
            if (r23 != 0) goto L_0x013f
            java.lang.String r3 = "Unexpected end of chunk data"
            com.google.android.exoplayer2.p393v0.C9563q.m29500d(r2, r3)
            long[] r5 = java.util.Arrays.copyOf(r5, r8)
            int[] r12 = java.util.Arrays.copyOf(r12, r8)
            long[] r7 = java.util.Arrays.copyOf(r7, r8)
            int[] r6 = java.util.Arrays.copyOf(r6, r8)
            r32 = r8
            goto L_0x01bf
        L_0x013f:
            if (r0 == 0) goto L_0x0156
            r2 = r36
        L_0x0143:
            if (r25 != 0) goto L_0x0152
            if (r2 <= 0) goto L_0x0152
            int r25 = r0.mo24715z()
            int r26 = r0.mo24698i()
            int r2 = r2 + -1
            goto L_0x0143
        L_0x0152:
            int r25 = r25 + -1
            r3 = r2
            goto L_0x0158
        L_0x0156:
            r3 = r36
        L_0x0158:
            r2 = r26
            r5[r8] = r29
            int r14 = r4.mo23370c()
            r12[r8] = r14
            r14 = r12[r8]
            if (r14 <= r1) goto L_0x0168
            r1 = r12[r8]
        L_0x0168:
            long r14 = (long) r2
            long r14 = r21 + r14
            r7[r8] = r14
            if (r11 != 0) goto L_0x0171
            r14 = 1
            goto L_0x0172
        L_0x0171:
            r14 = 0
        L_0x0172:
            r6[r8] = r14
            if (r8 != r9) goto L_0x0187
            r14 = 1
            r6[r8] = r14
            int r15 = r24 + -1
            if (r15 <= 0) goto L_0x0182
            int r9 = r11.mo24715z()
            int r9 = r9 - r14
        L_0x0182:
            r36 = r1
            r14 = r15
            r15 = r2
            goto L_0x018c
        L_0x0187:
            r36 = r1
            r15 = r2
            r14 = r24
        L_0x018c:
            long r1 = (long) r10
            long r21 = r21 + r1
            int r1 = r31 + -1
            if (r1 != 0) goto L_0x01a0
            if (r28 <= 0) goto L_0x01a0
            int r1 = r27.mo24715z()
            int r2 = r27.mo24698i()
            int r28 = r28 + -1
            r10 = r2
        L_0x01a0:
            r2 = r12[r8]
            r23 = r1
            long r1 = (long) r2
            long r1 = r29 + r1
            int r16 = r16 + -1
            int r8 = r8 + 1
            r26 = r15
            r15 = r23
            r23 = r1
            r1 = r36
            r36 = r3
            r3 = r32
            goto L_0x00f9
        L_0x01b9:
            r32 = r3
            r24 = r14
            r31 = r15
        L_0x01bf:
            r3 = r16
            r15 = r26
            long r8 = (long) r15
            long r21 = r21 + r8
            r4 = r36
        L_0x01c8:
            if (r4 <= 0) goto L_0x01d8
            int r8 = r0.mo24715z()
            if (r8 == 0) goto L_0x01d2
            r0 = 0
            goto L_0x01d9
        L_0x01d2:
            r0.mo24698i()
            int r4 = r4 + -1
            goto L_0x01c8
        L_0x01d8:
            r0 = 1
        L_0x01d9:
            if (r24 != 0) goto L_0x01ec
            if (r31 != 0) goto L_0x01ec
            if (r3 != 0) goto L_0x01ec
            if (r28 != 0) goto L_0x01ec
            r4 = r25
            if (r4 != 0) goto L_0x01ee
            if (r0 != 0) goto L_0x01e8
            goto L_0x01ee
        L_0x01e8:
            r9 = r1
            r1 = r35
            goto L_0x023f
        L_0x01ec:
            r4 = r25
        L_0x01ee:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "Inconsistent stbl box for track "
            r8.append(r9)
            r9 = r1
            r1 = r35
            int r10 = r1.f19662a
            r8.append(r10)
            java.lang.String r10 = ": remainingSynchronizationSamples "
            r8.append(r10)
            r14 = r24
            r8.append(r14)
            java.lang.String r10 = ", remainingSamplesAtTimestampDelta "
            r8.append(r10)
            r10 = r31
            r8.append(r10)
            java.lang.String r10 = ", remainingSamplesInChunk "
            r8.append(r10)
            r8.append(r3)
            java.lang.String r3 = ", remainingTimestampDeltaChanges "
            r8.append(r3)
            r3 = r28
            r8.append(r3)
            java.lang.String r3 = ", remainingSamplesAtTimestampOffset "
            r8.append(r3)
            r8.append(r4)
            if (r0 != 0) goto L_0x0233
            java.lang.String r0 = ", ctts invalid"
            goto L_0x0235
        L_0x0233:
            java.lang.String r0 = ""
        L_0x0235:
            r8.append(r0)
            java.lang.String r0 = r8.toString()
            com.google.android.exoplayer2.p393v0.C9563q.m29500d(r2, r0)
        L_0x023f:
            r2 = r5
            r5 = r7
            r4 = r9
            r3 = r12
            goto L_0x027a
        L_0x0244:
            r32 = r3
            int r0 = r13.f19513a
            long[] r2 = new long[r0]
            int[] r0 = new int[r0]
        L_0x024c:
            boolean r3 = r13.mo23367a()
            if (r3 == 0) goto L_0x025d
            int r3 = r13.f19514b
            long r4 = r13.f19516d
            r2[r3] = r4
            int r4 = r13.f19515c
            r0[r3] = r4
            goto L_0x024c
        L_0x025d:
            com.google.android.exoplayer2.Format r3 = r1.f19667f
            int r4 = r3.f18365q0
            int r3 = r3.f18363o0
            int r3 = com.google.android.exoplayer2.p393v0.C9554k0.m29425b(r4, r3)
            long r4 = (long) r14
            com.google.android.exoplayer2.s0.v.f$b r0 = com.google.android.exoplayer2.p366s0.p371v.C8969f.m26400a(r3, r2, r0, r4)
            long[] r2 = r0.f19541a
            int[] r3 = r0.f19542b
            int r4 = r0.f19543c
            long[] r5 = r0.f19544d
            int[] r6 = r0.f19545e
            long r7 = r0.f19546f
            r21 = r7
        L_0x027a:
            r0 = r32
            r11 = 1000000(0xf4240, double:4.940656E-318)
            long r13 = r1.f19664c
            r9 = r21
            long r7 = com.google.android.exoplayer2.p393v0.C9554k0.m29439c(r9, r11, r13)
            long[] r9 = r1.f19669h
            r14 = 1000000(0xf4240, double:4.940656E-318)
            if (r9 == 0) goto L_0x04b2
            boolean r9 = r37.mo23314a()
            if (r9 == 0) goto L_0x0296
            goto L_0x04b2
        L_0x0296:
            long[] r7 = r1.f19669h
            int r8 = r7.length
            r9 = 1
            if (r8 != r9) goto L_0x0326
            int r8 = r1.f19663b
            if (r8 != r9) goto L_0x0326
            int r8 = r5.length
            r9 = 2
            if (r8 < r9) goto L_0x0326
            long[] r8 = r1.f19670i
            r9 = 0
            r23 = r8[r9]
            r25 = r7[r9]
            long r7 = r1.f19664c
            long r9 = r1.f19665d
            r27 = r7
            r29 = r9
            long r7 = com.google.android.exoplayer2.p393v0.C9554k0.m29439c(r25, r27, r29)
            long r7 = r23 + r7
            r9 = r5
            r10 = r21
            r12 = r23
            r16 = r3
            r36 = r4
            r3 = r14
            r14 = r7
            boolean r9 = m26375a(r9, r10, r12, r14)
            if (r9 == 0) goto L_0x032a
            long r10 = r21 - r7
            r7 = 0
            r8 = r5[r7]
            long r25 = r23 - r8
            com.google.android.exoplayer2.Format r7 = r1.f19667f
            int r7 = r7.f18364p0
            long r7 = (long) r7
            long r12 = r1.f19664c
            r27 = r7
            r29 = r12
            long r7 = com.google.android.exoplayer2.p393v0.C9554k0.m29439c(r25, r27, r29)
            com.google.android.exoplayer2.Format r9 = r1.f19667f
            int r9 = r9.f18364p0
            long r12 = (long) r9
            long r14 = r1.f19664c
            long r9 = com.google.android.exoplayer2.p393v0.C9554k0.m29439c(r10, r12, r14)
            int r11 = (r7 > r18 ? 1 : (r7 == r18 ? 0 : -1))
            if (r11 != 0) goto L_0x02f3
            int r11 = (r9 > r18 ? 1 : (r9 == r18 ? 0 : -1))
            if (r11 == 0) goto L_0x032a
        L_0x02f3:
            r11 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r13 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
            if (r13 > 0) goto L_0x032a
            int r13 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r13 > 0) goto L_0x032a
            int r0 = (int) r7
            r7 = r37
            r7.f19146a = r0
            int r0 = (int) r9
            r7.f19147b = r0
            long r7 = r1.f19664c
            com.google.android.exoplayer2.p393v0.C9554k0.m29410a(r5, r3, r7)
            long[] r0 = r1.f19669h
            r3 = 0
            r7 = r0[r3]
            r9 = 1000000(0xf4240, double:4.940656E-318)
            long r11 = r1.f19665d
            long r7 = com.google.android.exoplayer2.p393v0.C9554k0.m29439c(r7, r9, r11)
            com.google.android.exoplayer2.s0.v.p r9 = new com.google.android.exoplayer2.s0.v.p
            r0 = r9
            r1 = r35
            r3 = r16
            r4 = r36
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return r9
        L_0x0326:
            r16 = r3
            r36 = r4
        L_0x032a:
            long[] r3 = r1.f19669h
            int r4 = r3.length
            r7 = 1
            if (r4 != r7) goto L_0x0369
            r4 = 0
            r7 = r3[r4]
            int r3 = (r7 > r18 ? 1 : (r7 == r18 ? 0 : -1))
            if (r3 != 0) goto L_0x0369
            long[] r0 = r1.f19670i
            r7 = r0[r4]
            r0 = 0
        L_0x033c:
            int r3 = r5.length
            if (r0 >= r3) goto L_0x0351
            r3 = r5[r0]
            long r9 = r3 - r7
            r11 = 1000000(0xf4240, double:4.940656E-318)
            long r13 = r1.f19664c
            long r3 = com.google.android.exoplayer2.p393v0.C9554k0.m29439c(r9, r11, r13)
            r5[r0] = r3
            int r0 = r0 + 1
            goto L_0x033c
        L_0x0351:
            long r9 = r21 - r7
            r11 = 1000000(0xf4240, double:4.940656E-318)
            long r13 = r1.f19664c
            long r7 = com.google.android.exoplayer2.p393v0.C9554k0.m29439c(r9, r11, r13)
            com.google.android.exoplayer2.s0.v.p r9 = new com.google.android.exoplayer2.s0.v.p
            r0 = r9
            r1 = r35
            r3 = r16
            r4 = r36
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return r9
        L_0x0369:
            int r3 = r1.f19663b
            r4 = 1
            if (r3 != r4) goto L_0x0370
            r3 = 1
            goto L_0x0371
        L_0x0370:
            r3 = 0
        L_0x0371:
            long[] r4 = r1.f19669h
            int r7 = r4.length
            int[] r7 = new int[r7]
            int r4 = r4.length
            int[] r4 = new int[r4]
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
        L_0x037d:
            long[] r12 = r1.f19669h
            int r13 = r12.length
            if (r8 >= r13) goto L_0x03e1
            long[] r13 = r1.f19670i
            r14 = r13[r8]
            r21 = -1
            int r13 = (r14 > r21 ? 1 : (r14 == r21 ? 0 : -1))
            if (r13 == 0) goto L_0x03d3
            r21 = r12[r8]
            long r12 = r1.f19664c
            r37 = r9
            r27 = r10
            long r9 = r1.f19665d
            r23 = r12
            r25 = r9
            long r9 = com.google.android.exoplayer2.p393v0.C9554k0.m29439c(r21, r23, r25)
            r12 = 1
            int r13 = com.google.android.exoplayer2.p393v0.C9554k0.m29386a(r5, r14, r12, r12)
            r7[r8] = r13
            long r14 = r14 + r9
            r9 = 0
            int r10 = com.google.android.exoplayer2.p393v0.C9554k0.m29386a(r5, r14, r3, r9)
            r4[r8] = r10
        L_0x03ad:
            r10 = r7[r8]
            r13 = r4[r8]
            if (r10 >= r13) goto L_0x03c0
            r10 = r7[r8]
            r10 = r6[r10]
            r10 = r10 & r12
            if (r10 != 0) goto L_0x03c0
            r10 = r7[r8]
            int r10 = r10 + r12
            r7[r8] = r10
            goto L_0x03ad
        L_0x03c0:
            r10 = r4[r8]
            r13 = r7[r8]
            int r10 = r10 - r13
            int r10 = r27 + r10
            r13 = r7[r8]
            if (r11 == r13) goto L_0x03cd
            r11 = 1
            goto L_0x03ce
        L_0x03cd:
            r11 = 0
        L_0x03ce:
            r11 = r37 | r11
            r13 = r4[r8]
            goto L_0x03dc
        L_0x03d3:
            r37 = r9
            r27 = r10
            r9 = 0
            r12 = 1
            r13 = r11
            r11 = r37
        L_0x03dc:
            int r8 = r8 + 1
            r9 = r11
            r11 = r13
            goto L_0x037d
        L_0x03e1:
            r37 = r9
            r9 = 0
            r12 = 1
            if (r10 == r0) goto L_0x03e8
            goto L_0x03e9
        L_0x03e8:
            r12 = 0
        L_0x03e9:
            r0 = r37 | r12
            if (r0 == 0) goto L_0x03f0
            long[] r3 = new long[r10]
            goto L_0x03f1
        L_0x03f0:
            r3 = r2
        L_0x03f1:
            if (r0 == 0) goto L_0x03f6
            int[] r8 = new int[r10]
            goto L_0x03f8
        L_0x03f6:
            r8 = r16
        L_0x03f8:
            if (r0 == 0) goto L_0x03fc
            r11 = 0
            goto L_0x03fe
        L_0x03fc:
            r11 = r36
        L_0x03fe:
            if (r0 == 0) goto L_0x0403
            int[] r12 = new int[r10]
            goto L_0x0404
        L_0x0403:
            r12 = r6
        L_0x0404:
            long[] r10 = new long[r10]
            r36 = r11
            r13 = r18
            r15 = 0
        L_0x040b:
            long[] r11 = r1.f19669h
            int r11 = r11.length
            if (r9 >= r11) goto L_0x0492
            long[] r11 = r1.f19670i
            r23 = r11[r9]
            r11 = r7[r9]
            r25 = r7
            r7 = r4[r9]
            if (r0 == 0) goto L_0x042e
            r26 = r4
            int r4 = r7 - r11
            java.lang.System.arraycopy(r2, r11, r3, r15, r4)
            r27 = r2
            r2 = r16
            java.lang.System.arraycopy(r2, r11, r8, r15, r4)
            java.lang.System.arraycopy(r6, r11, r12, r15, r4)
            goto L_0x0434
        L_0x042e:
            r27 = r2
            r26 = r4
            r2 = r16
        L_0x0434:
            r4 = r36
        L_0x0436:
            if (r11 >= r7) goto L_0x0474
            r19 = 1000000(0xf4240, double:4.940656E-318)
            r16 = r6
            r37 = r7
            long r6 = r1.f19665d
            r17 = r13
            r21 = r6
            long r6 = com.google.android.exoplayer2.p393v0.C9554k0.m29439c(r17, r19, r21)
            r17 = r5[r11]
            long r28 = r17 - r23
            r30 = 1000000(0xf4240, double:4.940656E-318)
            r34 = r12
            r17 = r13
            long r12 = r1.f19664c
            r32 = r12
            long r12 = com.google.android.exoplayer2.p393v0.C9554k0.m29439c(r28, r30, r32)
            long r6 = r6 + r12
            r10[r15] = r6
            if (r0 == 0) goto L_0x0467
            r6 = r8[r15]
            if (r6 <= r4) goto L_0x0467
            r4 = r2[r11]
        L_0x0467:
            int r15 = r15 + 1
            int r11 = r11 + 1
            r7 = r37
            r6 = r16
            r13 = r17
            r12 = r34
            goto L_0x0436
        L_0x0474:
            r16 = r6
            r34 = r12
            r17 = r13
            long[] r6 = r1.f19669h
            r11 = r6[r9]
            long r13 = r17 + r11
            int r9 = r9 + 1
            r36 = r4
            r6 = r16
            r7 = r25
            r4 = r26
            r12 = r34
            r16 = r2
            r2 = r27
            goto L_0x040b
        L_0x0492:
            r34 = r12
            r17 = r13
            r19 = 1000000(0xf4240, double:4.940656E-318)
            long r4 = r1.f19665d
            r21 = r4
            long r11 = com.google.android.exoplayer2.p393v0.C9554k0.m29439c(r17, r19, r21)
            com.google.android.exoplayer2.s0.v.p r9 = new com.google.android.exoplayer2.s0.v.p
            r0 = r9
            r1 = r35
            r2 = r3
            r3 = r8
            r4 = r36
            r5 = r10
            r6 = r34
            r7 = r11
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return r9
        L_0x04b2:
            r27 = r2
            r2 = r3
            r36 = r4
            r16 = r6
            r3 = r14
            long r9 = r1.f19664c
            com.google.android.exoplayer2.p393v0.C9554k0.m29410a(r5, r3, r9)
            com.google.android.exoplayer2.s0.v.p r9 = new com.google.android.exoplayer2.s0.v.p
            r0 = r9
            r1 = r35
            r3 = r2
            r2 = r27
            r4 = r36
            r6 = r16
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return r9
        L_0x04cf:
            com.google.android.exoplayer2.g0 r0 = new com.google.android.exoplayer2.g0
            java.lang.String r1 = "Track has no sample table size information"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.p366s0.p371v.C8961d.m26371a(com.google.android.exoplayer2.s0.v.m, com.google.android.exoplayer2.s0.v.c$a, com.google.android.exoplayer2.s0.k):com.google.android.exoplayer2.s0.v.p");
    }

    /* renamed from: b */
    private static Metadata m26379b(C9572w wVar, int i) {
        wVar.mo24695f(8);
        ArrayList arrayList = new ArrayList();
        while (wVar.mo24688c() < i) {
            C8737b b = C8977i.m26461b(wVar);
            if (b != null) {
                arrayList.add(b);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new Metadata((List<? extends C8737b>) arrayList);
    }

    /* renamed from: b */
    private static int m26376b(C9572w wVar) {
        wVar.mo24693e(16);
        return wVar.mo24698i();
    }

    /* renamed from: b */
    static Pair<Integer, C8984n> m26377b(C9572w wVar, int i, int i2) {
        int i3 = i + 8;
        String str = null;
        Object obj = null;
        int i4 = -1;
        int i5 = 0;
        while (i3 - i < i2) {
            wVar.mo24693e(i3);
            int i6 = wVar.mo24698i();
            int i7 = wVar.mo24698i();
            if (i7 == C8958c.f19478p0) {
                obj = Integer.valueOf(wVar.mo24698i());
            } else if (i7 == C8958c.f19468k0) {
                wVar.mo24695f(4);
                str = wVar.mo24687b(4);
            } else if (i7 == C8958c.f19470l0) {
                i4 = i3;
                i5 = i6;
            }
            i3 += i6;
        }
        if (!"cenc".equals(str) && !"cbc1".equals(str) && !"cens".equals(str) && !"cbcs".equals(str)) {
            return null;
        }
        boolean z = true;
        C9537e.m29300a(obj != null, (Object) "frma atom is mandatory");
        C9537e.m29300a(i4 != -1, (Object) "schi atom is mandatory");
        C8984n a = m26370a(wVar, i4, i5, str);
        if (a == null) {
            z = false;
        }
        C9537e.m29300a(z, (Object) "tenc atom is mandatory");
        return Pair.create(obj, a);
    }

    /* renamed from: a */
    public static Metadata m26367a(C8960b bVar, boolean z) {
        if (z) {
            return null;
        }
        C9572w wVar = bVar.f19503g1;
        wVar.mo24693e(8);
        while (wVar.mo24679a() >= 8) {
            int c = wVar.mo24688c();
            int i = wVar.mo24698i();
            if (wVar.mo24698i() == C8958c.f19419O0) {
                wVar.mo24693e(c);
                return m26385d(wVar, c + i);
            }
            wVar.mo24693e(c + i);
        }
        return null;
    }

    /* renamed from: a */
    private static int m26362a(int i) {
        if (i == f19505b) {
            return 1;
        }
        if (i == f19504a) {
            return 2;
        }
        if (i == f19506c || i == f19507d || i == f19508e || i == f19509f) {
            return 3;
        }
        return i == f19510g ? 4 : -1;
    }

    /* renamed from: a */
    private static C8964c m26368a(C9572w wVar, int i, int i2, String str, DrmInitData drmInitData, boolean z) throws C8723g0 {
        C9572w wVar2 = wVar;
        wVar2.mo24693e(12);
        int i3 = wVar.mo24698i();
        C8964c cVar = new C8964c(i3);
        for (int i4 = 0; i4 < i3; i4++) {
            int c = wVar.mo24688c();
            int i5 = wVar.mo24698i();
            C9537e.m29300a(i5 > 0, (Object) "childAtomSize should be positive");
            int i6 = wVar.mo24698i();
            if (i6 == C8958c.f19447c || i6 == C8958c.f19450d || i6 == C8958c.f19474n0 || i6 == C8958c.f19496y0 || i6 == C8958c.f19456f || i6 == C8958c.f19459g || i6 == C8958c.f19485t || i6 == C8958c.f19463i || i6 == C8958c.f19465j || i6 == C8958c.f19469l || i6 == C8958c.f19473n || i6 == C8958c.f19475o || i6 == C8958c.f19477p || i6 == C8958c.f19479q) {
                m26372a(wVar, i6, c, i5, i, i2, drmInitData, cVar, i4);
            } else if (i6 == C8958c.f19491w || i6 == C8958c.f19476o0 || i6 == C8958c.f19392B || i6 == C8958c.f19396D || i6 == C8958c.f19400F || i6 == C8958c.f19404H || i6 == C8958c.f19410K || i6 == C8958c.f19406I || i6 == C8958c.f19408J || i6 == C8958c.f19413L0 || i6 == C8958c.f19415M0 || i6 == C8958c.f19497z || i6 == C8958c.f19390A || i6 == C8958c.f19493x || i6 == C8958c.f19441Z0 || i6 == C8958c.f19443a1 || i6 == C8958c.f19446b1 || i6 == C8958c.f19449c1 || i6 == C8958c.f19455e1) {
                m26374a(wVar, i6, c, i5, i, str, z, drmInitData, cVar, i4);
            } else if (i6 == C8958c.f19494x0 || i6 == C8958c.f19405H0 || i6 == C8958c.f19407I0 || i6 == C8958c.f19409J0 || i6 == C8958c.f19411K0) {
                m26373a(wVar, i6, c, i5, i, str, cVar);
            } else if (i6 == C8958c.f19439Y0) {
                cVar.f19523b = Format.m24879a(Integer.toString(i), "application/x-camera-motion", (String) null, -1, (DrmInitData) null);
            }
            wVar2.mo24693e(c + i5);
        }
        return cVar;
    }

    /* renamed from: a */
    private static void m26373a(C9572w wVar, int i, int i2, int i3, int i4, String str, C8964c cVar) throws C8723g0 {
        C9572w wVar2 = wVar;
        int i5 = i;
        C8964c cVar2 = cVar;
        wVar2.mo24693e(i2 + 8 + 8);
        String str2 = "application/ttml+xml";
        List list = null;
        long j = Long.MAX_VALUE;
        if (i5 != C8958c.f19494x0) {
            if (i5 == C8958c.f19405H0) {
                int i6 = (i3 - 8) - 8;
                byte[] bArr = new byte[i6];
                wVar2.mo24685a(bArr, 0, i6);
                list = Collections.singletonList(bArr);
                str2 = "application/x-quicktime-tx3g";
            } else if (i5 == C8958c.f19407I0) {
                str2 = "application/x-mp4-vtt";
            } else if (i5 == C8958c.f19409J0) {
                j = 0;
            } else if (i5 == C8958c.f19411K0) {
                cVar2.f19525d = 1;
                str2 = "application/x-mp4-cea-608";
            } else {
                throw new IllegalStateException();
            }
        }
        cVar2.f19523b = Format.m24876a(Integer.toString(i4), str2, (String) null, -1, 0, str, -1, (DrmInitData) null, j, list);
    }

    /* renamed from: a */
    private static void m26372a(C9572w wVar, int i, int i2, int i3, int i4, int i5, DrmInitData drmInitData, C8964c cVar, int i6) throws C8723g0 {
        C9572w wVar2 = wVar;
        int i7 = i2;
        int i8 = i3;
        DrmInitData drmInitData2 = drmInitData;
        C8964c cVar2 = cVar;
        wVar2.mo24693e(i7 + 8 + 8);
        wVar2.mo24695f(16);
        int B = wVar.mo24676B();
        int B2 = wVar.mo24676B();
        wVar2.mo24695f(50);
        int c = wVar.mo24688c();
        String str = null;
        int i9 = i;
        if (i9 == C8958c.f19474n0) {
            Pair d = m26384d(wVar2, i7, i8);
            if (d != null) {
                i9 = ((Integer) d.first).intValue();
                if (drmInitData2 == null) {
                    drmInitData2 = null;
                } else {
                    drmInitData2 = drmInitData2.mo22752a(((C8984n) d.second).f19674b);
                }
                cVar2.f19522a[i6] = (C8984n) d.second;
            }
            wVar2.mo24693e(c);
        }
        DrmInitData drmInitData3 = drmInitData2;
        String str2 = null;
        List list = null;
        byte[] bArr = null;
        boolean z = false;
        float f = 1.0f;
        int i10 = -1;
        while (c - i7 < i8) {
            wVar2.mo24693e(c);
            int c2 = wVar.mo24688c();
            int i11 = wVar.mo24698i();
            if (i11 == 0 && wVar.mo24688c() - i7 == i8) {
                break;
            }
            C9537e.m29300a(i11 > 0, (Object) "childAtomSize should be positive");
            int i12 = wVar.mo24698i();
            if (i12 == C8958c.f19453e) {
                C9537e.m29301b(str == null);
                wVar2.mo24693e(c2 + 8);
                C9585h b = C9585h.m29615b(wVar);
                list = b.f22370a;
                cVar2.f19524c = b.f22371b;
                if (!z) {
                    f = b.f22374e;
                }
                str = "video/avc";
            } else if (i12 == C8958c.f19461h) {
                C9537e.m29301b(str == null);
                wVar2.mo24693e(c2 + 8);
                C9592l a = C9592l.m29625a(wVar);
                list = a.f22391a;
                cVar2.f19524c = a.f22392b;
                str = "video/hevc";
            } else if (i12 == C8958c.f19481r || i12 == C8958c.f19483s) {
                C9588j a2 = C9588j.m29616a(wVar);
                if (a2 != null && a2.f22380a == 5) {
                    str2 = a2.f22381b;
                    str = "video/dolby-vision";
                }
            } else if (i12 == C8958c.f19467k) {
                C9537e.m29301b(str == null);
                str = i9 == C8958c.f19463i ? "video/x-vnd.on2.vp8" : "video/x-vnd.on2.vp9";
            } else if (i12 == C8958c.f19471m) {
                C9537e.m29301b(str == null);
                str = "video/av01";
            } else if (i12 == C8958c.f19487u) {
                C9537e.m29301b(str == null);
                str = "video/3gpp";
            } else if (i12 == C8958c.f19436X) {
                C9537e.m29301b(str == null);
                Pair a3 = m26366a(wVar2, c2);
                str = (String) a3.first;
                list = Collections.singletonList(a3.second);
            } else if (i12 == C8958c.f19492w0) {
                f = m26380c(wVar2, c2);
                z = true;
            } else if (i12 == C8958c.f19435W0) {
                bArr = m26382c(wVar2, c2, i11);
            } else if (i12 == C8958c.f19433V0) {
                int v = wVar.mo24711v();
                wVar2.mo24695f(3);
                if (v == 0) {
                    int v2 = wVar.mo24711v();
                    if (v2 == 0) {
                        i10 = 0;
                    } else if (v2 == 1) {
                        i10 = 1;
                    } else if (v2 == 2) {
                        i10 = 2;
                    } else if (v2 == 3) {
                        i10 = 3;
                    }
                }
            }
            c += i11;
            i7 = i2;
        }
        if (str != null) {
            cVar2.f19523b = Format.m24872a(Integer.toString(i4), str, str2, -1, -1, B, B2, -1.0f, list, i5, f, bArr, i10, (C9586i) null, drmInitData3);
        }
    }

    /* renamed from: a */
    private static Pair<long[], long[]> m26365a(C8959a aVar) {
        if (aVar != null) {
            C8960b e = aVar.mo23366e(C8958c.f19454e0);
            if (e != null) {
                C9572w wVar = e.f19503g1;
                wVar.mo24693e(8);
                int c = C8958c.m26357c(wVar.mo24698i());
                int z = wVar.mo24715z();
                long[] jArr = new long[z];
                long[] jArr2 = new long[z];
                int i = 0;
                while (i < z) {
                    jArr[i] = c == 1 ? wVar.mo24675A() : wVar.mo24713x();
                    jArr2[i] = c == 1 ? wVar.mo24707r() : (long) wVar.mo24698i();
                    if (wVar.mo24709t() == 1) {
                        wVar.mo24695f(2);
                        i++;
                    } else {
                        throw new IllegalArgumentException("Unsupported media rate.");
                    }
                }
                return Pair.create(jArr, jArr2);
            }
        }
        return Pair.create(null, null);
    }

    /* renamed from: a */
    private static void m26374a(C9572w wVar, int i, int i2, int i3, int i4, String str, boolean z, DrmInitData drmInitData, C8964c cVar, int i5) throws C8723g0 {
        int i6;
        int i7;
        int i8;
        List list;
        String str2;
        String str3;
        DrmInitData drmInitData2;
        int i9;
        int i10;
        int i11;
        String str4;
        byte[] bArr;
        C9572w wVar2 = wVar;
        int i12 = i2;
        int i13 = i3;
        String str5 = str;
        DrmInitData drmInitData3 = drmInitData;
        C8964c cVar2 = cVar;
        wVar2.mo24693e(i12 + 8 + 8);
        if (z) {
            i6 = wVar.mo24676B();
            wVar2.mo24695f(6);
        } else {
            wVar2.mo24695f(8);
            i6 = 0;
        }
        if (i6 == 0 || i6 == 1) {
            i7 = wVar.mo24676B();
            wVar2.mo24695f(6);
            i8 = wVar.mo24712w();
            if (i6 == 1) {
                wVar2.mo24695f(16);
            }
        } else if (i6 == 2) {
            wVar2.mo24695f(16);
            int round = (int) Math.round(wVar.mo24696g());
            int z2 = wVar.mo24715z();
            wVar2.mo24695f(20);
            i7 = z2;
            i8 = round;
        } else {
            return;
        }
        int c = wVar.mo24688c();
        int i14 = i;
        if (i14 == C8958c.f19476o0) {
            Pair d = m26384d(wVar2, i12, i13);
            if (d != null) {
                i14 = ((Integer) d.first).intValue();
                if (drmInitData3 == null) {
                    drmInitData3 = null;
                } else {
                    drmInitData3 = drmInitData3.mo22752a(((C8984n) d.second).f19674b);
                }
                cVar2.f19522a[i5] = (C8984n) d.second;
            }
            wVar2.mo24693e(c);
        }
        DrmInitData drmInitData4 = drmInitData3;
        String str6 = "audio/raw";
        String str7 = i14 == C8958c.f19392B ? "audio/ac3" : i14 == C8958c.f19396D ? "audio/eac3" : i14 == C8958c.f19400F ? "audio/ac4" : i14 == C8958c.f19404H ? "audio/vnd.dts" : (i14 == C8958c.f19406I || i14 == C8958c.f19408J) ? "audio/vnd.dts.hd" : i14 == C8958c.f19410K ? "audio/vnd.dts.hd;profile=lbr" : i14 == C8958c.f19413L0 ? "audio/3gpp" : i14 == C8958c.f19415M0 ? "audio/amr-wb" : (i14 == C8958c.f19497z || i14 == C8958c.f19390A) ? str6 : i14 == C8958c.f19493x ? "audio/mpeg" : i14 == C8958c.f19441Z0 ? "audio/alac" : i14 == C8958c.f19443a1 ? "audio/g711-alaw" : i14 == C8958c.f19446b1 ? "audio/g711-mlaw" : i14 == C8958c.f19449c1 ? "audio/opus" : i14 == C8958c.f19455e1 ? "audio/flac" : null;
        int i15 = i8;
        int i16 = c;
        int i17 = i7;
        byte[] bArr2 = null;
        String str8 = str7;
        while (i16 - i12 < i13) {
            wVar2.mo24693e(i16);
            int i18 = wVar.mo24698i();
            C9537e.m29300a(i18 > 0, (Object) "childAtomSize should be positive");
            int i19 = wVar.mo24698i();
            if (i19 == C8958c.f19436X || (z && i19 == C8958c.f19495y)) {
                i10 = i18;
                String str9 = str8;
                i9 = i16;
                str2 = str6;
                drmInitData2 = drmInitData4;
                if (i19 == C8958c.f19436X) {
                    i11 = i9;
                } else {
                    i11 = m26364a(wVar2, i9, i10);
                }
                if (i11 != -1) {
                    Pair a = m26366a(wVar2, i11);
                    str4 = (String) a.first;
                    bArr2 = (byte[]) a.second;
                    if ("audio/mp4a-latm".equals(str4)) {
                        Pair a2 = C9544h.m29334a(bArr2);
                        i15 = ((Integer) a2.first).intValue();
                        i17 = ((Integer) a2.second).intValue();
                    }
                } else {
                    str4 = str9;
                }
                str3 = str4;
            } else {
                if (i19 == C8958c.f19394C) {
                    wVar2.mo24693e(i16 + 8);
                    cVar2.f19523b = C8825g.m25600a(wVar2, Integer.toString(i4), str5, drmInitData4);
                } else if (i19 == C8958c.f19398E) {
                    wVar2.mo24693e(i16 + 8);
                    cVar2.f19523b = C8825g.m25604b(wVar2, Integer.toString(i4), str5, drmInitData4);
                } else if (i19 == C8958c.f19402G) {
                    wVar2.mo24693e(i16 + 8);
                    cVar2.f19523b = C8828h.m25608a(wVar2, Integer.toString(i4), str5, drmInitData4);
                } else if (i19 == C8958c.f19412L) {
                    int i20 = i18;
                    str3 = str8;
                    int i21 = i16;
                    str2 = str6;
                    drmInitData2 = drmInitData4;
                    cVar2.f19523b = Format.m24875a(Integer.toString(i4), str8, (String) null, -1, -1, i17, i15, null, drmInitData2, 0, str);
                    i10 = i20;
                    i9 = i21;
                } else {
                    int i22 = i18;
                    str3 = str8;
                    int i23 = i16;
                    str2 = str6;
                    drmInitData2 = drmInitData4;
                    if (i19 == C8958c.f19452d1) {
                        i10 = i22;
                        int i24 = i10 - 8;
                        byte[] bArr3 = f19512i;
                        byte[] bArr4 = new byte[(bArr3.length + i24)];
                        System.arraycopy(bArr3, 0, bArr4, 0, bArr3.length);
                        i9 = i23;
                        wVar2.mo24693e(i9 + 8);
                        wVar2.mo24685a(bArr4, f19512i.length, i24);
                        bArr2 = bArr4;
                    } else {
                        i10 = i22;
                        i9 = i23;
                        if (i19 == C8958c.f19458f1) {
                            int i25 = i10 - 12;
                            bArr = new byte[(i25 + 4)];
                            bArr[0] = 102;
                            bArr[1] = 76;
                            bArr[2] = 97;
                            bArr[3] = 67;
                            wVar2.mo24693e(i9 + 12);
                            wVar2.mo24685a(bArr, 4, i25);
                        } else if (i19 == C8958c.f19441Z0) {
                            int i26 = i10 - 12;
                            bArr = new byte[i26];
                            wVar2.mo24693e(i9 + 12);
                            wVar2.mo24685a(bArr, 0, i26);
                        }
                        bArr2 = bArr;
                    }
                }
                i10 = i18;
                str3 = str8;
                i9 = i16;
                str2 = str6;
                drmInitData2 = drmInitData4;
            }
            i16 = i9 + i10;
            i12 = i2;
            drmInitData4 = drmInitData2;
            str8 = str3;
            str6 = str2;
        }
        String str10 = str8;
        String str11 = str6;
        DrmInitData drmInitData5 = drmInitData4;
        if (cVar2.f19523b == null) {
            String str12 = str10;
            if (str12 != null) {
                int i27 = str11.equals(str12) ? 2 : -1;
                String num = Integer.toString(i4);
                if (bArr2 == null) {
                    list = null;
                } else {
                    list = Collections.singletonList(bArr2);
                }
                cVar2.f19523b = Format.m24874a(num, str12, (String) null, -1, -1, i17, i15, i27, list, drmInitData5, 0, str);
            }
        }
    }

    /* renamed from: a */
    private static int m26364a(C9572w wVar, int i, int i2) {
        int c = wVar.mo24688c();
        while (c - i < i2) {
            wVar.mo24693e(c);
            int i3 = wVar.mo24698i();
            C9537e.m29300a(i3 > 0, (Object) "childAtomSize should be positive");
            if (wVar.mo24698i() == C8958c.f19436X) {
                return c;
            }
            c += i3;
        }
        return -1;
    }

    /* renamed from: a */
    private static Pair<String, byte[]> m26366a(C9572w wVar, int i) {
        wVar.mo24693e(i + 8 + 4);
        wVar.mo24695f(1);
        m26363a(wVar);
        wVar.mo24695f(2);
        int v = wVar.mo24711v();
        if ((v & 128) != 0) {
            wVar.mo24695f(2);
        }
        if ((v & 64) != 0) {
            wVar.mo24695f(wVar.mo24676B());
        }
        if ((v & 32) != 0) {
            wVar.mo24695f(2);
        }
        wVar.mo24695f(1);
        m26363a(wVar);
        String a = C9566t.m29507a(wVar.mo24711v());
        if ("audio/mpeg".equals(a) || "audio/vnd.dts".equals(a) || "audio/vnd.dts.hd".equals(a)) {
            return Pair.create(a, null);
        }
        wVar.mo24695f(12);
        wVar.mo24695f(1);
        int a2 = m26363a(wVar);
        byte[] bArr = new byte[a2];
        wVar.mo24685a(bArr, 0, a2);
        return Pair.create(a, bArr);
    }

    /* renamed from: a */
    private static C8984n m26370a(C9572w wVar, int i, int i2, String str) {
        int i3;
        int i4;
        int i5 = i + 8;
        while (true) {
            byte[] bArr = null;
            if (i5 - i >= i2) {
                return null;
            }
            wVar.mo24693e(i5);
            int i6 = wVar.mo24698i();
            if (wVar.mo24698i() == C8958c.f19472m0) {
                int c = C8958c.m26357c(wVar.mo24698i());
                wVar.mo24695f(1);
                if (c == 0) {
                    wVar.mo24695f(1);
                    i4 = 0;
                    i3 = 0;
                } else {
                    int v = wVar.mo24711v();
                    i3 = v & 15;
                    i4 = (v & 240) >> 4;
                }
                boolean z = wVar.mo24711v() == 1;
                int v2 = wVar.mo24711v();
                byte[] bArr2 = new byte[16];
                wVar.mo24685a(bArr2, 0, bArr2.length);
                if (z && v2 == 0) {
                    int v3 = wVar.mo24711v();
                    bArr = new byte[v3];
                    wVar.mo24685a(bArr, 0, v3);
                }
                C8984n nVar = new C8984n(z, str, v2, bArr2, i4, i3, bArr);
                return nVar;
            }
            i5 += i6;
        }
    }

    /* renamed from: a */
    private static int m26363a(C9572w wVar) {
        int v = wVar.mo24711v();
        int i = v & 127;
        while ((v & 128) == 128) {
            v = wVar.mo24711v();
            i = (i << 7) | (v & 127);
        }
        return i;
    }

    /* renamed from: a */
    private static boolean m26375a(long[] jArr, long j, long j2, long j3) {
        int length = jArr.length - 1;
        int a = C9554k0.m29382a(4, 0, length);
        int a2 = C9554k0.m29382a(jArr.length - 4, 0, length);
        if (jArr[0] > j2 || j2 >= jArr[a] || jArr[a2] >= j3 || j3 > j) {
            return false;
        }
        return true;
    }
}
