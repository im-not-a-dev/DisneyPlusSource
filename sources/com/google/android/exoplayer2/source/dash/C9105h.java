package com.google.android.exoplayer2.source.dash;

import android.os.SystemClock;
import com.google.android.exoplayer2.C8883r;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.SeekParameters;
import com.google.android.exoplayer2.p366s0.C8907b;
import com.google.android.exoplayer2.p366s0.C8920o;
import com.google.android.exoplayer2.p366s0.C8924q;
import com.google.android.exoplayer2.p393v0.C9554k0;
import com.google.android.exoplayer2.p393v0.C9566t;
import com.google.android.exoplayer2.source.C9230p;
import com.google.android.exoplayer2.source.dash.C9098c.C9099a;
import com.google.android.exoplayer2.source.dash.C9110j.C9113c;
import com.google.android.exoplayer2.source.dash.p376k.C9114a;
import com.google.android.exoplayer2.source.dash.p376k.C9115b;
import com.google.android.exoplayer2.source.dash.p376k.C9122h;
import com.google.android.exoplayer2.source.dash.p376k.C9123i;
import com.google.android.exoplayer2.source.p379m0.C9210b;
import com.google.android.exoplayer2.source.p379m0.C9212d;
import com.google.android.exoplayer2.source.p379m0.C9213e;
import com.google.android.exoplayer2.source.p379m0.C9216f;
import com.google.android.exoplayer2.source.p379m0.C9221i;
import com.google.android.exoplayer2.source.p379m0.C9223k;
import com.google.android.exoplayer2.source.p379m0.C9224l;
import com.google.android.exoplayer2.source.p379m0.C9225m;
import com.google.android.exoplayer2.source.p379m0.C9227n;
import com.google.android.exoplayer2.trackselection.C9311j;
import com.google.android.exoplayer2.upstream.C9452b0;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.DataSource.C9435a;
import com.google.android.exoplayer2.upstream.DataSpec;
import com.google.android.exoplayer2.upstream.HttpDataSource.C9439d;
import com.google.android.exoplayer2.upstream.TransferListener;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.exoplayer2.source.dash.h */
/* compiled from: DefaultDashChunkSource */
public class C9105h implements C9098c {

    /* renamed from: a */
    private final C9452b0 f20372a;

    /* renamed from: b */
    private final int[] f20373b;

    /* renamed from: c */
    private final int f20374c;

    /* renamed from: d */
    private final DataSource f20375d;

    /* renamed from: e */
    private final long f20376e;

    /* renamed from: f */
    private final int f20377f;

    /* renamed from: g */
    private final C9113c f20378g;

    /* renamed from: h */
    protected final C9107b[] f20379h;

    /* renamed from: i */
    private C9311j f20380i;

    /* renamed from: j */
    private C9115b f20381j;

    /* renamed from: k */
    private int f20382k;

    /* renamed from: l */
    private IOException f20383l;

    /* renamed from: m */
    private boolean f20384m;

    /* renamed from: n */
    private long f20385n = -9223372036854775807L;

    /* renamed from: com.google.android.exoplayer2.source.dash.h$a */
    /* compiled from: DefaultDashChunkSource */
    public static final class C9106a implements C9099a {

        /* renamed from: a */
        private final C9435a f20386a;

        /* renamed from: b */
        private final int f20387b;

        public C9106a(C9435a aVar) {
            this(aVar, 1);
        }

        /* renamed from: a */
        public C9098c mo23629a(C9452b0 b0Var, C9115b bVar, int i, int[] iArr, C9311j jVar, int i2, long j, boolean z, List<Format> list, C9113c cVar, TransferListener transferListener) {
            TransferListener transferListener2 = transferListener;
            DataSource a = this.f20386a.mo24448a();
            if (transferListener2 != null) {
                a.addTransferListener(transferListener2);
            }
            C9105h hVar = new C9105h(b0Var, bVar, i, iArr, jVar, i2, a, j, this.f20387b, z, list, cVar);
            return hVar;
        }

        public C9106a(C9435a aVar, int i) {
            this.f20386a = aVar;
            this.f20387b = i;
        }
    }

    /* renamed from: com.google.android.exoplayer2.source.dash.h$b */
    /* compiled from: DefaultDashChunkSource */
    protected static final class C9107b {

        /* renamed from: a */
        final C9213e f20388a;

        /* renamed from: b */
        public final C9123i f20389b;

        /* renamed from: c */
        public final C9103f f20390c;
        /* access modifiers changed from: private */

        /* renamed from: d */
        public final long f20391d;

        /* renamed from: e */
        private final long f20392e;

        C9107b(long j, int i, C9123i iVar, boolean z, List<Format> list, C8924q qVar) {
            this(j, iVar, m27208a(i, iVar, z, list, qVar), 0, iVar.mo23731d());
        }

        /* renamed from: b */
        public int mo23655b() {
            return this.f20390c.mo23641c(this.f20391d);
        }

        /* renamed from: c */
        public long mo23658c(long j) {
            return this.f20390c.mo23635a(j - this.f20392e);
        }

        /* renamed from: d */
        public C9122h mo23659d(long j) {
            return this.f20390c.mo23640b(j - this.f20392e);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public C9107b mo23653a(long j, C9123i iVar) throws C9230p {
            long b;
            long j2 = j;
            C9103f d = this.f20389b.mo23731d();
            C9103f d2 = iVar.mo23731d();
            if (d == null) {
                C9107b bVar = new C9107b(j, iVar, this.f20388a, this.f20392e, d);
                return bVar;
            } else if (!d.mo23637a()) {
                C9107b bVar2 = new C9107b(j, iVar, this.f20388a, this.f20392e, d2);
                return bVar2;
            } else {
                int c = d.mo23641c(j2);
                if (c == 0) {
                    C9107b bVar3 = new C9107b(j, iVar, this.f20388a, this.f20392e, d2);
                    return bVar3;
                }
                long b2 = (d.mo23638b() + ((long) c)) - 1;
                long a = d.mo23635a(b2) + d.mo23636a(b2, j2);
                long b3 = d2.mo23638b();
                long a2 = d2.mo23635a(b3);
                long j3 = this.f20392e;
                int i = (a > a2 ? 1 : (a == a2 ? 0 : -1));
                if (i == 0) {
                    b = b2 + 1;
                } else if (i >= 0) {
                    b = d.mo23639b(a2, j2);
                } else {
                    throw new C9230p();
                }
                long j4 = j3 + (b - b3);
                C9107b bVar4 = new C9107b(j, iVar, this.f20388a, j4, d2);
                return bVar4;
            }
        }

        /* renamed from: b */
        public long mo23656b(long j) {
            return this.f20390c.mo23639b(j, this.f20391d) + this.f20392e;
        }

        /* renamed from: b */
        public long mo23657b(C9115b bVar, int i, long j) {
            long a;
            int b = mo23655b();
            if (b == -1) {
                a = mo23656b((j - C8883r.m25967a(bVar.f20423a)) - C8883r.m25967a(bVar.mo23675a(i).f20454b));
            } else {
                a = mo23650a() + ((long) b);
            }
            return a - 1;
        }

        private C9107b(long j, C9123i iVar, C9213e eVar, long j2, C9103f fVar) {
            this.f20391d = j;
            this.f20389b = iVar;
            this.f20392e = j2;
            this.f20388a = eVar;
            this.f20390c = fVar;
        }

        /* renamed from: b */
        private static boolean m27210b(String str) {
            return str.startsWith("video/webm") || str.startsWith("audio/webm") || str.startsWith("application/webm");
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public C9107b mo23654a(C9103f fVar) {
            C9107b bVar = new C9107b(this.f20391d, this.f20389b, this.f20388a, this.f20392e, fVar);
            return bVar;
        }

        /* renamed from: a */
        public long mo23650a() {
            return this.f20390c.mo23638b() + this.f20392e;
        }

        /* renamed from: a */
        public long mo23651a(long j) {
            return mo23658c(j) + this.f20390c.mo23636a(j - this.f20392e, this.f20391d);
        }

        /* renamed from: a */
        public long mo23652a(C9115b bVar, int i, long j) {
            if (mo23655b() != -1 || bVar.f20428f == -9223372036854775807L) {
                return mo23650a();
            }
            return Math.max(mo23650a(), mo23656b(((j - C8883r.m25967a(bVar.f20423a)) - C8883r.m25967a(bVar.mo23675a(i).f20454b)) - C8883r.m25967a(bVar.f20428f)));
        }

        /* renamed from: a */
        private static boolean m27209a(String str) {
            return C9566t.m29518k(str) || "application/ttml+xml".equals(str);
        }

        /* JADX WARNING: type inference failed for: r10v3, types: [com.google.android.exoplayer2.s0.t.e] */
        /* JADX WARNING: type inference failed for: r10v4, types: [com.google.android.exoplayer2.s0.x.a] */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Unknown variable types count: 2 */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private static com.google.android.exoplayer2.source.p379m0.C9213e m27208a(int r8, com.google.android.exoplayer2.source.dash.p376k.C9123i r9, boolean r10, java.util.List<com.google.android.exoplayer2.Format> r11, com.google.android.exoplayer2.p366s0.C8924q r12) {
            /*
                com.google.android.exoplayer2.Format r0 = r9.f20466a
                java.lang.String r0 = r0.f18348a0
                boolean r1 = m27209a(r0)
                if (r1 == 0) goto L_0x000c
                r8 = 0
                return r8
            L_0x000c:
                java.lang.String r1 = "application/x-rawcc"
                boolean r1 = r1.equals(r0)
                if (r1 == 0) goto L_0x001c
                com.google.android.exoplayer2.s0.x.a r10 = new com.google.android.exoplayer2.s0.x.a
                com.google.android.exoplayer2.Format r11 = r9.f20466a
                r10.<init>(r11)
                goto L_0x003b
            L_0x001c:
                boolean r0 = m27210b(r0)
                if (r0 == 0) goto L_0x0029
                com.google.android.exoplayer2.s0.t.e r10 = new com.google.android.exoplayer2.s0.t.e
                r11 = 1
                r10.<init>(r11)
                goto L_0x003b
            L_0x0029:
                r0 = 0
                if (r10 == 0) goto L_0x002f
                r0 = 4
                r2 = 4
                goto L_0x0030
            L_0x002f:
                r2 = 0
            L_0x0030:
                com.google.android.exoplayer2.s0.v.g r10 = new com.google.android.exoplayer2.s0.v.g
                r3 = 0
                r4 = 0
                r5 = 0
                r1 = r10
                r6 = r11
                r7 = r12
                r1.<init>(r2, r3, r4, r5, r6, r7)
            L_0x003b:
                com.google.android.exoplayer2.source.m0.e r11 = new com.google.android.exoplayer2.source.m0.e
                com.google.android.exoplayer2.Format r9 = r9.f20466a
                r11.<init>(r10, r8, r9)
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.dash.C9105h.C9107b.m27208a(int, com.google.android.exoplayer2.source.dash.k.i, boolean, java.util.List, com.google.android.exoplayer2.s0.q):com.google.android.exoplayer2.source.m0.e");
        }
    }

    /* renamed from: com.google.android.exoplayer2.source.dash.h$c */
    /* compiled from: DefaultDashChunkSource */
    protected static final class C9108c extends C9210b {
        public C9108c(C9107b bVar, long j, long j2) {
            super(j, j2);
        }
    }

    public C9105h(C9452b0 b0Var, C9115b bVar, int i, int[] iArr, C9311j jVar, int i2, DataSource dataSource, long j, int i3, boolean z, List<Format> list, C9113c cVar) {
        C9311j jVar2 = jVar;
        this.f20372a = b0Var;
        this.f20381j = bVar;
        this.f20373b = iArr;
        this.f20380i = jVar2;
        this.f20374c = i2;
        this.f20375d = dataSource;
        this.f20382k = i;
        this.f20376e = j;
        this.f20377f = i3;
        this.f20378g = cVar;
        long c = bVar.mo23677c(i);
        ArrayList c2 = m27195c();
        this.f20379h = new C9107b[jVar.length()];
        for (int i4 = 0; i4 < this.f20379h.length; i4++) {
            C9123i iVar = (C9123i) c2.get(jVar2.mo24070b(i4));
            C9107b[] bVarArr = this.f20379h;
            C9107b bVar2 = new C9107b(c, i2, iVar, z, list, cVar);
            bVarArr[i4] = bVar2;
        }
    }

    /* renamed from: b */
    private long m27194b() {
        long currentTimeMillis;
        if (this.f20376e != 0) {
            currentTimeMillis = SystemClock.elapsedRealtime() + this.f20376e;
        } else {
            currentTimeMillis = System.currentTimeMillis();
        }
        return currentTimeMillis * 1000;
    }

    /* renamed from: c */
    private ArrayList<C9123i> m27195c() {
        List<C9114a> list = this.f20381j.mo23675a(this.f20382k).f20455c;
        ArrayList<C9123i> arrayList = new ArrayList<>();
        for (int i : this.f20373b) {
            arrayList.addAll(((C9114a) list.get(i)).f20420c);
        }
        return arrayList;
    }

    /* renamed from: a */
    public long mo23643a(long j, SeekParameters seekParameters) {
        C9107b[] bVarArr = this.f20379h;
        int length = bVarArr.length;
        for (int i = 0; i < length; i++) {
            C9107b bVar = bVarArr[i];
            if (bVar.f20390c != null) {
                long b = bVar.mo23656b(j);
                long c = bVar.mo23658c(b);
                return C9554k0.m29390a(j, seekParameters, c, (c >= j || b >= ((long) (bVar.mo23655b() + -1))) ? c : bVar.mo23658c(b + 1));
            }
        }
        return j;
    }

    /* renamed from: a */
    public void mo23627a(C9115b bVar, int i) {
        try {
            this.f20381j = bVar;
            this.f20382k = i;
            long c = this.f20381j.mo23677c(this.f20382k);
            ArrayList c2 = m27195c();
            for (int i2 = 0; i2 < this.f20379h.length; i2++) {
                this.f20379h[i2] = this.f20379h[i2].mo23653a(c, (C9123i) c2.get(this.f20380i.mo24070b(i2)));
            }
        } catch (C9230p e) {
            this.f20383l = e;
        }
    }

    /* renamed from: a */
    public void mo23628a(C9311j jVar) {
        this.f20380i = jVar;
    }

    /* renamed from: a */
    public void mo23646a() throws IOException {
        IOException iOException = this.f20383l;
        if (iOException == null) {
            this.f20372a.mo23621a();
            return;
        }
        throw iOException;
    }

    /* renamed from: a */
    public int mo23642a(long j, List<? extends C9224l> list) {
        if (this.f20383l != null || this.f20380i.length() < 2) {
            return list.size();
        }
        return this.f20380i.mo24051a(j, list);
    }

    /* renamed from: a */
    public void mo23647a(long j, long j2, List<? extends C9224l> list, C9216f fVar) {
        C9224l lVar;
        long j3;
        int i;
        C9225m[] mVarArr;
        C9216f fVar2 = fVar;
        if (this.f20383l == null) {
            long j4 = j2 - j;
            long a = m27191a(j);
            long a2 = C8883r.m25967a(this.f20381j.f20423a) + C8883r.m25967a(this.f20381j.mo23675a(this.f20382k).f20454b) + j2;
            C9113c cVar = this.f20378g;
            if (cVar == null || !cVar.mo23671a(a2)) {
                long b = m27194b();
                if (list.isEmpty()) {
                    List<? extends C9224l> list2 = list;
                    lVar = null;
                } else {
                    lVar = (C9224l) list.get(list.size() - 1);
                }
                C9225m[] mVarArr2 = new C9225m[this.f20380i.length()];
                int i2 = 0;
                while (i2 < mVarArr2.length) {
                    C9107b bVar = this.f20379h[i2];
                    if (bVar.f20390c == null) {
                        mVarArr2[i2] = C9225m.f20923a;
                        mVarArr = mVarArr2;
                        i = i2;
                        j3 = b;
                    } else {
                        long a3 = bVar.mo23652a(this.f20381j, this.f20382k, b);
                        long b2 = bVar.mo23657b(this.f20381j, this.f20382k, b);
                        C9107b bVar2 = bVar;
                        mVarArr = mVarArr2;
                        i = i2;
                        j3 = b;
                        long a4 = m27192a(bVar, lVar, j2, a3, b2);
                        if (a4 < a3) {
                            mVarArr[i] = C9225m.f20923a;
                        } else {
                            C9108c cVar2 = new C9108c(bVar2, a4, b2);
                            mVarArr[i] = cVar2;
                        }
                    }
                    i2 = i + 1;
                    List<? extends C9224l> list3 = list;
                    mVarArr2 = mVarArr;
                    b = j3;
                }
                long j5 = b;
                this.f20380i.mo23813a(j, j4, a, list, mVarArr2);
                C9107b bVar3 = this.f20379h[this.f20380i.mo23814b()];
                C9213e eVar = bVar3.f20388a;
                if (eVar != null) {
                    C9123i iVar = bVar3.f20389b;
                    C9122h f = eVar.mo23939b() == null ? iVar.mo23733f() : null;
                    C9122h e = bVar3.f20390c == null ? iVar.mo23732e() : null;
                    if (!(f == null && e == null)) {
                        fVar2.f20880a = mo23645a(bVar3, this.f20375d, this.f20380i.mo24076f(), this.f20380i.mo23815g(), this.f20380i.mo23816h(), f, e);
                        return;
                    }
                }
                long a5 = bVar3.f20391d;
                long j6 = -9223372036854775807L;
                int i3 = (a5 > -9223372036854775807L ? 1 : (a5 == -9223372036854775807L ? 0 : -1));
                boolean z = i3 != 0;
                if (bVar3.mo23655b() == 0) {
                    fVar2.f20881b = z;
                    return;
                }
                long j7 = j5;
                long a6 = bVar3.mo23652a(this.f20381j, this.f20382k, j7);
                long b3 = bVar3.mo23657b(this.f20381j, this.f20382k, j7);
                m27193a(bVar3, b3);
                long j8 = b3;
                boolean z2 = z;
                long a7 = m27192a(bVar3, lVar, j2, a6, j8);
                if (a7 < a6) {
                    this.f20383l = new C9230p();
                    return;
                }
                int i4 = (a7 > j8 ? 1 : (a7 == j8 ? 0 : -1));
                if (i4 > 0 || (this.f20384m && i4 >= 0)) {
                    fVar2.f20881b = z2;
                } else if (!z2 || bVar3.mo23658c(a7) < a5) {
                    int min = (int) Math.min((long) this.f20377f, (j8 - a7) + 1);
                    if (i3 != 0) {
                        while (min > 1 && bVar3.mo23658c((((long) min) + a7) - 1) >= a5) {
                            min--;
                        }
                    }
                    int i5 = min;
                    if (list.isEmpty()) {
                        j6 = j2;
                    }
                    fVar2.f20880a = mo23644a(bVar3, this.f20375d, this.f20374c, this.f20380i.mo24076f(), this.f20380i.mo23815g(), this.f20380i.mo23816h(), a7, i5, j6);
                } else {
                    fVar2.f20881b = true;
                }
            }
        }
    }

    /* renamed from: a */
    public void mo23648a(C9212d dVar) {
        if (dVar instanceof C9223k) {
            int a = this.f20380i.mo24065a(((C9223k) dVar).f20858c);
            C9107b bVar = this.f20379h[a];
            if (bVar.f20390c == null) {
                C8920o c = bVar.f20388a.mo23940c();
                if (c != null) {
                    this.f20379h[a] = bVar.mo23654a((C9103f) new C9104g((C8907b) c, bVar.f20389b.f20468c));
                }
            }
        }
        C9113c cVar = this.f20378g;
        if (cVar != null) {
            cVar.mo23673b(dVar);
        }
    }

    /* renamed from: a */
    public boolean mo23649a(C9212d dVar, boolean z, Exception exc, long j) {
        boolean z2 = false;
        if (!z) {
            return false;
        }
        C9113c cVar = this.f20378g;
        if (cVar != null && cVar.mo23672a(dVar)) {
            return true;
        }
        if (!this.f20381j.f20426d && (dVar instanceof C9224l) && (exc instanceof C9439d) && ((C9439d) exc).f21948U == 404) {
            C9107b bVar = this.f20379h[this.f20380i.mo24065a(dVar.f20858c)];
            int b = bVar.mo23655b();
            if (!(b == -1 || b == 0)) {
                if (((C9224l) dVar).mo23956f() > (bVar.mo23650a() + ((long) b)) - 1) {
                    this.f20384m = true;
                    return true;
                }
            }
        }
        if (j != -9223372036854775807L) {
            C9311j jVar = this.f20380i;
            if (jVar.mo24069a(jVar.mo24065a(dVar.f20858c), j)) {
                z2 = true;
            }
        }
        return z2;
    }

    /* renamed from: a */
    private long m27192a(C9107b bVar, C9224l lVar, long j, long j2, long j3) {
        if (lVar != null) {
            return lVar.mo23956f();
        }
        return C9554k0.m29431b(bVar.mo23656b(j), j2, j3);
    }

    /* renamed from: a */
    private void m27193a(C9107b bVar, long j) {
        this.f20385n = this.f20381j.f20426d ? bVar.mo23651a(j) : -9223372036854775807L;
    }

    /* renamed from: a */
    private long m27191a(long j) {
        if (this.f20381j.f20426d && this.f20385n != -9223372036854775807L) {
            return this.f20385n - j;
        }
        return -9223372036854775807L;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C9212d mo23645a(C9107b bVar, DataSource dataSource, Format format, int i, Object obj, C9122h hVar, C9122h hVar2) {
        String str = bVar.f20389b.f20467b;
        if (hVar != null) {
            hVar2 = hVar.mo23725a(hVar2, str);
            if (hVar2 == null) {
                hVar2 = hVar;
            }
        }
        DataSpec dataSpec = new DataSpec(hVar2.mo23724a(str), hVar2.f20462a, hVar2.f20463b, bVar.f20389b.mo23730c());
        C9223k kVar = new C9223k(dataSource, dataSpec, format, i, obj, bVar.f20388a);
        return kVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C9212d mo23644a(C9107b bVar, DataSource dataSource, int i, Format format, int i2, Object obj, long j, int i3, long j2) {
        C9107b bVar2 = bVar;
        long j3 = j;
        C9123i iVar = bVar2.f20389b;
        long c = bVar2.mo23658c(j3);
        C9122h d = bVar2.mo23659d(j3);
        String str = iVar.f20467b;
        if (bVar2.f20388a == null) {
            long a = bVar2.mo23651a(j3);
            DataSpec dataSpec = new DataSpec(d.mo23724a(str), d.f20462a, d.f20463b, iVar.mo23730c());
            C9227n nVar = new C9227n(dataSource, dataSpec, format, i2, obj, c, a, j, i, format);
            return nVar;
        }
        int i4 = 1;
        C9122h hVar = d;
        int i5 = 1;
        int i6 = i3;
        while (i4 < i6) {
            C9122h a2 = hVar.mo23725a(bVar2.mo23659d(((long) i4) + j3), str);
            if (a2 == null) {
                break;
            }
            i5++;
            i4++;
            hVar = a2;
        }
        long a3 = bVar2.mo23651a((((long) i5) + j3) - 1);
        long a4 = bVar.f20391d;
        long j4 = (a4 == -9223372036854775807L || a4 > a3) ? -9223372036854775807L : a4;
        DataSpec dataSpec2 = r18;
        DataSpec dataSpec3 = new DataSpec(hVar.mo23724a(str), hVar.f20462a, hVar.f20463b, iVar.mo23730c());
        C9221i iVar2 = new C9221i(dataSource, dataSpec2, format, i2, obj, c, a3, j2, j4, j, i5, -iVar.f20468c, bVar2.f20388a);
        return iVar2;
    }
}
