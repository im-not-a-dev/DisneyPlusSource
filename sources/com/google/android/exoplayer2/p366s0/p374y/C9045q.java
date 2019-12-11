package com.google.android.exoplayer2.p366s0.p374y;

import android.util.SparseArray;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.p366s0.C8914i;
import com.google.android.exoplayer2.p366s0.C8924q;
import com.google.android.exoplayer2.p366s0.p374y.C9029h0.C9033d;
import com.google.android.exoplayer2.util.C9544h;
import com.google.android.exoplayer2.util.C9568u;
import com.google.android.exoplayer2.util.C9568u.C9569a;
import com.google.android.exoplayer2.util.C9568u.C9570b;
import com.google.android.exoplayer2.util.C9572w;
import com.google.android.exoplayer2.util.C9573x;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.google.android.exoplayer2.s0.y.q */
/* compiled from: H264Reader */
public final class C9045q implements C9042o {

    /* renamed from: a */
    private final C9016c0 f19971a;

    /* renamed from: b */
    private final boolean f19972b;

    /* renamed from: c */
    private final boolean f19973c;

    /* renamed from: d */
    private final C9054v f19974d = new C9054v(7, 128);

    /* renamed from: e */
    private final C9054v f19975e = new C9054v(8, 128);

    /* renamed from: f */
    private final C9054v f19976f = new C9054v(6, 128);

    /* renamed from: g */
    private long f19977g;

    /* renamed from: h */
    private final boolean[] f19978h = new boolean[3];

    /* renamed from: i */
    private String f19979i;

    /* renamed from: j */
    private C8924q f19980j;

    /* renamed from: k */
    private C9047b f19981k;

    /* renamed from: l */
    private boolean f19982l;

    /* renamed from: m */
    private long f19983m;

    /* renamed from: n */
    private boolean f19984n;

    /* renamed from: o */
    private final C9572w f19985o = new C9572w();

    /* renamed from: com.google.android.exoplayer2.s0.y.q$b */
    /* compiled from: H264Reader */
    private static final class C9047b {

        /* renamed from: a */
        private final C8924q f19986a;

        /* renamed from: b */
        private final boolean f19987b;

        /* renamed from: c */
        private final boolean f19988c;

        /* renamed from: d */
        private final SparseArray<C9570b> f19989d = new SparseArray<>();

        /* renamed from: e */
        private final SparseArray<C9569a> f19990e = new SparseArray<>();

        /* renamed from: f */
        private final C9573x f19991f = new C9573x(this.f19992g, 0, 0);

        /* renamed from: g */
        private byte[] f19992g = new byte[128];

        /* renamed from: h */
        private int f19993h;

        /* renamed from: i */
        private int f19994i;

        /* renamed from: j */
        private long f19995j;

        /* renamed from: k */
        private boolean f19996k;

        /* renamed from: l */
        private long f19997l;

        /* renamed from: m */
        private C9048a f19998m = new C9048a();

        /* renamed from: n */
        private C9048a f19999n = new C9048a();

        /* renamed from: o */
        private boolean f20000o;

        /* renamed from: p */
        private long f20001p;

        /* renamed from: q */
        private long f20002q;

        /* renamed from: r */
        private boolean f20003r;

        /* renamed from: com.google.android.exoplayer2.s0.y.q$b$a */
        /* compiled from: H264Reader */
        private static final class C9048a {

            /* renamed from: a */
            private boolean f20004a;

            /* renamed from: b */
            private boolean f20005b;

            /* renamed from: c */
            private C9570b f20006c;

            /* renamed from: d */
            private int f20007d;

            /* renamed from: e */
            private int f20008e;

            /* renamed from: f */
            private int f20009f;

            /* renamed from: g */
            private int f20010g;

            /* renamed from: h */
            private boolean f20011h;

            /* renamed from: i */
            private boolean f20012i;

            /* renamed from: j */
            private boolean f20013j;

            /* renamed from: k */
            private boolean f20014k;

            /* renamed from: l */
            private int f20015l;

            /* renamed from: m */
            private int f20016m;

            /* renamed from: n */
            private int f20017n;

            /* renamed from: o */
            private int f20018o;

            /* renamed from: p */
            private int f20019p;

            private C9048a() {
            }

            /* renamed from: b */
            public boolean mo23460b() {
                if (this.f20005b) {
                    int i = this.f20008e;
                    if (i == 7 || i == 2) {
                        return true;
                    }
                }
                return false;
            }

            /* renamed from: a */
            public void mo23457a() {
                this.f20005b = false;
                this.f20004a = false;
            }

            /* renamed from: a */
            public void mo23458a(int i) {
                this.f20008e = i;
                this.f20005b = true;
            }

            /* renamed from: a */
            public void mo23459a(C9570b bVar, int i, int i2, int i3, int i4, boolean z, boolean z2, boolean z3, boolean z4, int i5, int i6, int i7, int i8, int i9) {
                this.f20006c = bVar;
                this.f20007d = i;
                this.f20008e = i2;
                this.f20009f = i3;
                this.f20010g = i4;
                this.f20011h = z;
                this.f20012i = z2;
                this.f20013j = z3;
                this.f20014k = z4;
                this.f20015l = i5;
                this.f20016m = i6;
                this.f20017n = i7;
                this.f20018o = i8;
                this.f20019p = i9;
                this.f20004a = true;
                this.f20005b = true;
            }

            /* access modifiers changed from: private */
            /* renamed from: a */
            public boolean m26805a(C9048a aVar) {
                if (this.f20004a) {
                    if (!aVar.f20004a || this.f20009f != aVar.f20009f || this.f20010g != aVar.f20010g || this.f20011h != aVar.f20011h) {
                        return true;
                    }
                    if (this.f20012i && aVar.f20012i && this.f20013j != aVar.f20013j) {
                        return true;
                    }
                    int i = this.f20007d;
                    int i2 = aVar.f20007d;
                    if (i != i2 && (i == 0 || i2 == 0)) {
                        return true;
                    }
                    if (this.f20006c.f22326k == 0 && aVar.f20006c.f22326k == 0 && (this.f20016m != aVar.f20016m || this.f20017n != aVar.f20017n)) {
                        return true;
                    }
                    if (this.f20006c.f22326k == 1 && aVar.f20006c.f22326k == 1 && (this.f20018o != aVar.f20018o || this.f20019p != aVar.f20019p)) {
                        return true;
                    }
                    boolean z = this.f20014k;
                    boolean z2 = aVar.f20014k;
                    if (z != z2) {
                        return true;
                    }
                    if (z && z2 && this.f20015l != aVar.f20015l) {
                        return true;
                    }
                }
                return false;
            }
        }

        public C9047b(C8924q qVar, boolean z, boolean z2) {
            this.f19986a = qVar;
            this.f19987b = z;
            this.f19988c = z2;
            mo23456b();
        }

        /* renamed from: a */
        public boolean mo23454a() {
            return this.f19988c;
        }

        /* renamed from: b */
        public void mo23456b() {
            this.f19996k = false;
            this.f20000o = false;
            this.f19999n.mo23457a();
        }

        /* renamed from: a */
        public void mo23452a(C9570b bVar) {
            this.f19989d.append(bVar.f22319d, bVar);
        }

        /* renamed from: a */
        public void mo23451a(C9569a aVar) {
            this.f19990e.append(aVar.f22313a, aVar);
        }

        /* renamed from: a */
        public void mo23450a(long j, int i, long j2) {
            this.f19994i = i;
            this.f19997l = j2;
            this.f19995j = j;
            if (!this.f19987b || this.f19994i != 1) {
                if (this.f19988c) {
                    int i2 = this.f19994i;
                    if (!(i2 == 5 || i2 == 1 || i2 == 2)) {
                        return;
                    }
                } else {
                    return;
                }
            }
            C9048a aVar = this.f19998m;
            this.f19998m = this.f19999n;
            this.f19999n = aVar;
            this.f19999n.mo23457a();
            this.f19993h = 0;
            this.f19996k = true;
        }

        /* JADX WARNING: Removed duplicated region for block: B:51:0x0101  */
        /* JADX WARNING: Removed duplicated region for block: B:52:0x0104  */
        /* JADX WARNING: Removed duplicated region for block: B:54:0x0108  */
        /* JADX WARNING: Removed duplicated region for block: B:58:0x011a  */
        /* JADX WARNING: Removed duplicated region for block: B:61:0x0120  */
        /* JADX WARNING: Removed duplicated region for block: B:72:0x0150  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo23453a(byte[] r24, int r25, int r26) {
            /*
                r23 = this;
                r0 = r23
                r1 = r25
                boolean r2 = r0.f19996k
                if (r2 != 0) goto L_0x0009
                return
            L_0x0009:
                int r2 = r26 - r1
                byte[] r3 = r0.f19992g
                int r4 = r3.length
                int r5 = r0.f19993h
                int r6 = r5 + r2
                r7 = 2
                if (r4 >= r6) goto L_0x001e
                int r5 = r5 + r2
                int r5 = r5 * 2
                byte[] r3 = java.util.Arrays.copyOf(r3, r5)
                r0.f19992g = r3
            L_0x001e:
                byte[] r3 = r0.f19992g
                int r4 = r0.f19993h
                r5 = r24
                java.lang.System.arraycopy(r5, r1, r3, r4, r2)
                int r1 = r0.f19993h
                int r1 = r1 + r2
                r0.f19993h = r1
                com.google.android.exoplayer2.v0.x r1 = r0.f19991f
                byte[] r2 = r0.f19992g
                int r3 = r0.f19993h
                r4 = 0
                r1.mo24716a(r2, r4, r3)
                com.google.android.exoplayer2.v0.x r1 = r0.f19991f
                r2 = 8
                boolean r1 = r1.mo24718a(r2)
                if (r1 != 0) goto L_0x0041
                return
            L_0x0041:
                com.google.android.exoplayer2.v0.x r1 = r0.f19991f
                r1.mo24724e()
                com.google.android.exoplayer2.v0.x r1 = r0.f19991f
                int r10 = r1.mo24719b(r7)
                com.google.android.exoplayer2.v0.x r1 = r0.f19991f
                r2 = 5
                r1.mo24722c(r2)
                com.google.android.exoplayer2.v0.x r1 = r0.f19991f
                boolean r1 = r1.mo24717a()
                if (r1 != 0) goto L_0x005b
                return
            L_0x005b:
                com.google.android.exoplayer2.v0.x r1 = r0.f19991f
                r1.mo24723d()
                com.google.android.exoplayer2.v0.x r1 = r0.f19991f
                boolean r1 = r1.mo24717a()
                if (r1 != 0) goto L_0x0069
                return
            L_0x0069:
                com.google.android.exoplayer2.v0.x r1 = r0.f19991f
                int r11 = r1.mo24723d()
                boolean r1 = r0.f19988c
                if (r1 != 0) goto L_0x007b
                r0.f19996k = r4
                com.google.android.exoplayer2.s0.y.q$b$a r1 = r0.f19999n
                r1.mo23458a(r11)
                return
            L_0x007b:
                com.google.android.exoplayer2.v0.x r1 = r0.f19991f
                boolean r1 = r1.mo24717a()
                if (r1 != 0) goto L_0x0084
                return
            L_0x0084:
                com.google.android.exoplayer2.v0.x r1 = r0.f19991f
                int r13 = r1.mo24723d()
                android.util.SparseArray<com.google.android.exoplayer2.v0.u$a> r1 = r0.f19990e
                int r1 = r1.indexOfKey(r13)
                if (r1 >= 0) goto L_0x0095
                r0.f19996k = r4
                return
            L_0x0095:
                android.util.SparseArray<com.google.android.exoplayer2.v0.u$a> r1 = r0.f19990e
                java.lang.Object r1 = r1.get(r13)
                com.google.android.exoplayer2.v0.u$a r1 = (com.google.android.exoplayer2.util.C9568u.C9569a) r1
                android.util.SparseArray<com.google.android.exoplayer2.v0.u$b> r3 = r0.f19989d
                int r5 = r1.f22314b
                java.lang.Object r3 = r3.get(r5)
                r9 = r3
                com.google.android.exoplayer2.v0.u$b r9 = (com.google.android.exoplayer2.util.C9568u.C9570b) r9
                boolean r3 = r9.f22323h
                if (r3 == 0) goto L_0x00ba
                com.google.android.exoplayer2.v0.x r3 = r0.f19991f
                boolean r3 = r3.mo24718a(r7)
                if (r3 != 0) goto L_0x00b5
                return
            L_0x00b5:
                com.google.android.exoplayer2.v0.x r3 = r0.f19991f
                r3.mo24722c(r7)
            L_0x00ba:
                com.google.android.exoplayer2.v0.x r3 = r0.f19991f
                int r5 = r9.f22325j
                boolean r3 = r3.mo24718a(r5)
                if (r3 != 0) goto L_0x00c5
                return
            L_0x00c5:
                com.google.android.exoplayer2.v0.x r3 = r0.f19991f
                int r5 = r9.f22325j
                int r12 = r3.mo24719b(r5)
                boolean r3 = r9.f22324i
                r5 = 1
                if (r3 != 0) goto L_0x00f9
                com.google.android.exoplayer2.v0.x r3 = r0.f19991f
                boolean r3 = r3.mo24718a(r5)
                if (r3 != 0) goto L_0x00db
                return
            L_0x00db:
                com.google.android.exoplayer2.v0.x r3 = r0.f19991f
                boolean r3 = r3.mo24720b()
                if (r3 == 0) goto L_0x00f7
                com.google.android.exoplayer2.v0.x r6 = r0.f19991f
                boolean r6 = r6.mo24718a(r5)
                if (r6 != 0) goto L_0x00ec
                return
            L_0x00ec:
                com.google.android.exoplayer2.v0.x r6 = r0.f19991f
                boolean r6 = r6.mo24720b()
                r14 = r3
                r16 = r6
                r15 = 1
                goto L_0x00fd
            L_0x00f7:
                r14 = r3
                goto L_0x00fa
            L_0x00f9:
                r14 = 0
            L_0x00fa:
                r15 = 0
                r16 = 0
            L_0x00fd:
                int r3 = r0.f19994i
                if (r3 != r2) goto L_0x0104
                r17 = 1
                goto L_0x0106
            L_0x0104:
                r17 = 0
            L_0x0106:
                if (r17 == 0) goto L_0x011a
                com.google.android.exoplayer2.v0.x r2 = r0.f19991f
                boolean r2 = r2.mo24717a()
                if (r2 != 0) goto L_0x0111
                return
            L_0x0111:
                com.google.android.exoplayer2.v0.x r2 = r0.f19991f
                int r2 = r2.mo24723d()
                r18 = r2
                goto L_0x011c
            L_0x011a:
                r18 = 0
            L_0x011c:
                int r2 = r9.f22326k
                if (r2 != 0) goto L_0x0150
                com.google.android.exoplayer2.v0.x r2 = r0.f19991f
                int r3 = r9.f22327l
                boolean r2 = r2.mo24718a(r3)
                if (r2 != 0) goto L_0x012b
                return
            L_0x012b:
                com.google.android.exoplayer2.v0.x r2 = r0.f19991f
                int r3 = r9.f22327l
                int r2 = r2.mo24719b(r3)
                boolean r1 = r1.f22315c
                if (r1 == 0) goto L_0x014d
                if (r14 != 0) goto L_0x014d
                com.google.android.exoplayer2.v0.x r1 = r0.f19991f
                boolean r1 = r1.mo24717a()
                if (r1 != 0) goto L_0x0142
                return
            L_0x0142:
                com.google.android.exoplayer2.v0.x r1 = r0.f19991f
                int r1 = r1.mo24721c()
                r20 = r1
                r19 = r2
                goto L_0x018e
            L_0x014d:
                r19 = r2
                goto L_0x018c
            L_0x0150:
                if (r2 != r5) goto L_0x018a
                boolean r2 = r9.f22328m
                if (r2 != 0) goto L_0x018a
                com.google.android.exoplayer2.v0.x r2 = r0.f19991f
                boolean r2 = r2.mo24717a()
                if (r2 != 0) goto L_0x015f
                return
            L_0x015f:
                com.google.android.exoplayer2.v0.x r2 = r0.f19991f
                int r2 = r2.mo24721c()
                boolean r1 = r1.f22315c
                if (r1 == 0) goto L_0x0183
                if (r14 != 0) goto L_0x0183
                com.google.android.exoplayer2.v0.x r1 = r0.f19991f
                boolean r1 = r1.mo24717a()
                if (r1 != 0) goto L_0x0174
                return
            L_0x0174:
                com.google.android.exoplayer2.v0.x r1 = r0.f19991f
                int r1 = r1.mo24721c()
                r22 = r1
                r21 = r2
                r19 = 0
                r20 = 0
                goto L_0x0192
            L_0x0183:
                r21 = r2
                r19 = 0
                r20 = 0
                goto L_0x0190
            L_0x018a:
                r19 = 0
            L_0x018c:
                r20 = 0
            L_0x018e:
                r21 = 0
            L_0x0190:
                r22 = 0
            L_0x0192:
                com.google.android.exoplayer2.s0.y.q$b$a r8 = r0.f19999n
                r8.mo23459a(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
                r0.f19996k = r4
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.p366s0.p374y.C9045q.C9047b.mo23453a(byte[], int, int):void");
        }

        /* renamed from: a */
        public boolean mo23455a(long j, int i, boolean z, boolean z2) {
            boolean z3 = false;
            if (this.f19994i == 9 || (this.f19988c && this.f19999n.m26805a(this.f19998m))) {
                if (z && this.f20000o) {
                    m26797a(i + ((int) (j - this.f19995j)));
                }
                this.f20001p = this.f19995j;
                this.f20002q = this.f19997l;
                this.f20003r = false;
                this.f20000o = true;
            }
            if (this.f19987b) {
                z2 = this.f19999n.mo23460b();
            }
            boolean z4 = this.f20003r;
            int i2 = this.f19994i;
            if (i2 == 5 || (z2 && i2 == 1)) {
                z3 = true;
            }
            this.f20003r = z4 | z3;
            return this.f20003r;
        }

        /* renamed from: a */
        private void m26797a(int i) {
            int i2 = (int) (this.f19995j - this.f20001p);
            int i3 = i;
            this.f19986a.mo23303a(this.f20002q, this.f20003r ? 1 : 0, i2, i3, null);
        }
    }

    public C9045q(C9016c0 c0Var, boolean z, boolean z2) {
        this.f19971a = c0Var;
        this.f19972b = z;
        this.f19973c = z2;
    }

    /* renamed from: a */
    public void mo23434a() {
        C9568u.m29525a(this.f19978h);
        this.f19974d.mo23468b();
        this.f19975e.mo23468b();
        this.f19976f.mo23468b();
        this.f19981k.mo23456b();
        this.f19977g = 0;
        this.f19984n = false;
    }

    /* renamed from: b */
    public void mo23438b() {
    }

    /* renamed from: a */
    public void mo23436a(C8914i iVar, C9033d dVar) {
        dVar.mo23441a();
        this.f19979i = dVar.mo23442b();
        this.f19980j = iVar.mo23311a(dVar.mo23443c(), 2);
        this.f19981k = new C9047b(this.f19980j, this.f19972b, this.f19973c);
        this.f19971a.mo23429a(iVar, dVar);
    }

    /* renamed from: a */
    public void mo23435a(long j, int i) {
        this.f19983m = j;
        this.f19984n |= (i & 2) != 0;
    }

    /* renamed from: a */
    public void mo23437a(C9572w wVar) {
        int c = wVar.mo24688c();
        int d = wVar.mo24690d();
        byte[] bArr = wVar.f22333a;
        this.f19977g += (long) wVar.mo24679a();
        this.f19980j.mo23305a(wVar, wVar.mo24679a());
        while (true) {
            int a = C9568u.m29522a(bArr, c, d, this.f19978h);
            if (a == d) {
                m26791a(bArr, c, d);
                return;
            }
            int b = C9568u.m29527b(bArr, a);
            int i = a - c;
            if (i > 0) {
                m26791a(bArr, c, a);
            }
            int i2 = d - a;
            long j = this.f19977g - ((long) i2);
            m26789a(j, i2, i < 0 ? -i : 0, this.f19983m);
            m26790a(j, b, this.f19983m);
            c = a + 3;
        }
    }

    /* renamed from: a */
    private void m26790a(long j, int i, long j2) {
        if (!this.f19982l || this.f19981k.mo23454a()) {
            this.f19974d.mo23469b(i);
            this.f19975e.mo23469b(i);
        }
        this.f19976f.mo23469b(i);
        this.f19981k.mo23450a(j, i, j2);
    }

    /* renamed from: a */
    private void m26791a(byte[] bArr, int i, int i2) {
        if (!this.f19982l || this.f19981k.mo23454a()) {
            this.f19974d.mo23465a(bArr, i, i2);
            this.f19975e.mo23465a(bArr, i, i2);
        }
        this.f19976f.mo23465a(bArr, i, i2);
        this.f19981k.mo23453a(bArr, i, i2);
    }

    /* renamed from: a */
    private void m26789a(long j, int i, int i2, long j2) {
        int i3 = i2;
        if (!this.f19982l || this.f19981k.mo23454a()) {
            this.f19974d.mo23467a(i3);
            this.f19975e.mo23467a(i3);
            if (!this.f19982l) {
                if (this.f19974d.mo23466a() && this.f19975e.mo23466a()) {
                    ArrayList arrayList = new ArrayList();
                    C9054v vVar = this.f19974d;
                    arrayList.add(Arrays.copyOf(vVar.f20088d, vVar.f20089e));
                    C9054v vVar2 = this.f19975e;
                    arrayList.add(Arrays.copyOf(vVar2.f20088d, vVar2.f20089e));
                    C9054v vVar3 = this.f19974d;
                    C9570b c = C9568u.m29530c(vVar3.f20088d, 3, vVar3.f20089e);
                    C9054v vVar4 = this.f19975e;
                    C9569a b = C9568u.m29528b(vVar4.f20088d, 3, vVar4.f20089e);
                    this.f19980j.mo23304a(Format.m24871a(this.f19979i, "video/avc", C9544h.m29340b(c.f22316a, c.f22317b, c.f22318c), -1, -1, c.f22320e, c.f22321f, -1.0f, (List<byte[]>) arrayList, -1, c.f22322g, (DrmInitData) null));
                    this.f19982l = true;
                    this.f19981k.mo23452a(c);
                    this.f19981k.mo23451a(b);
                    this.f19974d.mo23468b();
                    this.f19975e.mo23468b();
                }
            } else if (this.f19974d.mo23466a()) {
                C9054v vVar5 = this.f19974d;
                this.f19981k.mo23452a(C9568u.m29530c(vVar5.f20088d, 3, vVar5.f20089e));
                this.f19974d.mo23468b();
            } else if (this.f19975e.mo23466a()) {
                C9054v vVar6 = this.f19975e;
                this.f19981k.mo23451a(C9568u.m29528b(vVar6.f20088d, 3, vVar6.f20089e));
                this.f19975e.mo23468b();
            }
        }
        if (this.f19976f.mo23467a(i2)) {
            C9054v vVar7 = this.f19976f;
            this.f19985o.mo24684a(this.f19976f.f20088d, C9568u.m29529c(vVar7.f20088d, vVar7.f20089e));
            this.f19985o.mo24693e(4);
            this.f19971a.mo23428a(j2, this.f19985o);
        }
        if (this.f19981k.mo23455a(j, i, this.f19982l, this.f19984n)) {
            this.f19984n = false;
        }
    }
}
