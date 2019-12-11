package com.google.android.exoplayer2.p366s0.p371v;

import com.google.android.exoplayer2.C8723g0;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.p361p0.C8828h;
import com.google.android.exoplayer2.p366s0.C8912g;
import com.google.android.exoplayer2.p366s0.C8913h;
import com.google.android.exoplayer2.p366s0.C8914i;
import com.google.android.exoplayer2.p366s0.C8916k;
import com.google.android.exoplayer2.p366s0.C8919n;
import com.google.android.exoplayer2.p366s0.C8920o;
import com.google.android.exoplayer2.p366s0.C8920o.C8921a;
import com.google.android.exoplayer2.p366s0.C8923p;
import com.google.android.exoplayer2.p366s0.C8924q;
import com.google.android.exoplayer2.p393v0.C9537e;
import com.google.android.exoplayer2.p393v0.C9554k0;
import com.google.android.exoplayer2.p393v0.C9568u;
import com.google.android.exoplayer2.p393v0.C9572w;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;

/* renamed from: com.google.android.exoplayer2.s0.v.j */
/* compiled from: Mp4Extractor */
public final class C8978j implements C8912g, C8920o {

    /* renamed from: v */
    private static final int f19632v = C9554k0.m29428b("qt  ");

    /* renamed from: a */
    private final int f19633a;

    /* renamed from: b */
    private final C9572w f19634b;

    /* renamed from: c */
    private final C9572w f19635c;

    /* renamed from: d */
    private final C9572w f19636d;

    /* renamed from: e */
    private final C9572w f19637e;

    /* renamed from: f */
    private final ArrayDeque<C8959a> f19638f;

    /* renamed from: g */
    private int f19639g;

    /* renamed from: h */
    private int f19640h;

    /* renamed from: i */
    private long f19641i;

    /* renamed from: j */
    private int f19642j;

    /* renamed from: k */
    private C9572w f19643k;

    /* renamed from: l */
    private int f19644l;

    /* renamed from: m */
    private int f19645m;

    /* renamed from: n */
    private int f19646n;

    /* renamed from: o */
    private boolean f19647o;

    /* renamed from: p */
    private C8914i f19648p;

    /* renamed from: q */
    private C8979a[] f19649q;

    /* renamed from: r */
    private long[][] f19650r;

    /* renamed from: s */
    private int f19651s;

    /* renamed from: t */
    private long f19652t;

    /* renamed from: u */
    private boolean f19653u;

    /* renamed from: com.google.android.exoplayer2.s0.v.j$a */
    /* compiled from: Mp4Extractor */
    private static final class C8979a {

        /* renamed from: a */
        public final C8983m f19654a;

        /* renamed from: b */
        public final C8986p f19655b;

        /* renamed from: c */
        public final C8924q f19656c;

        /* renamed from: d */
        public int f19657d;

        public C8979a(C8983m mVar, C8986p pVar, C8924q qVar) {
            this.f19654a = mVar;
            this.f19655b = pVar;
            this.f19656c = qVar;
        }
    }

    static {
        C8957b bVar = C8957b.f19389a;
    }

    public C8978j() {
        this(0);
    }

    /* renamed from: c */
    private boolean m26477c(C8913h hVar) throws IOException, InterruptedException {
        if (this.f19642j == 0) {
            if (!hVar.mo23291a(this.f19637e.f22333a, 0, 8, true)) {
                return false;
            }
            this.f19642j = 8;
            this.f19637e.mo24693e(0);
            this.f19641i = this.f19637e.mo24713x();
            this.f19640h = this.f19637e.mo24698i();
        }
        long j = this.f19641i;
        if (j == 1) {
            hVar.mo23289a(this.f19637e.f22333a, 8, 8);
            this.f19642j += 8;
            this.f19641i = this.f19637e.mo24675A();
        } else if (j == 0) {
            long a = hVar.mo23287a();
            if (a == -1 && !this.f19638f.isEmpty()) {
                a = ((C8959a) this.f19638f.peek()).f19500g1;
            }
            if (a != -1) {
                this.f19641i = (a - hVar.getPosition()) + ((long) this.f19642j);
            }
        }
        if (this.f19641i >= ((long) this.f19642j)) {
            if (m26469a(this.f19640h)) {
                long position = (hVar.getPosition() + this.f19641i) - ((long) this.f19642j);
                this.f19638f.push(new C8959a(this.f19640h, position));
                if (this.f19641i == ((long) this.f19642j)) {
                    m26478d(position);
                } else {
                    if (this.f19640h == C8958c.f19419O0) {
                        m26472b(hVar);
                    }
                    m26479e();
                }
            } else if (m26473b(this.f19640h)) {
                C9537e.m29301b(this.f19642j == 8);
                C9537e.m29301b(this.f19641i <= 2147483647L);
                this.f19643k = new C9572w((int) this.f19641i);
                System.arraycopy(this.f19637e.f22333a, 0, this.f19643k.f22333a, 0, 8);
                this.f19639g = 1;
            } else {
                this.f19643k = null;
                this.f19639g = 1;
            }
            return true;
        }
        throw new C8723g0("Atom size less than header length (unsupported).");
    }

    /* renamed from: e */
    private void m26479e() {
        this.f19639g = 0;
        this.f19642j = 0;
    }

    /* renamed from: f */
    static /* synthetic */ C8912g[] m26481f() {
        return new C8912g[]{new C8978j()};
    }

    /* renamed from: a */
    public void mo23307a() {
    }

    /* renamed from: a */
    public boolean mo23310a(C8913h hVar) throws IOException, InterruptedException {
        return C8982l.m26503b(hVar);
    }

    /* renamed from: b */
    public C8921a mo23277b(long j) {
        long j2;
        long j3;
        long j4;
        long j5;
        C8979a[] aVarArr = this.f19649q;
        if (aVarArr.length == 0) {
            return new C8921a(C8923p.f19168c);
        }
        int i = this.f19651s;
        if (i != -1) {
            C8986p pVar = aVarArr[i].f19655b;
            int a = m26465a(pVar, j);
            if (a == -1) {
                return new C8921a(C8923p.f19168c);
            }
            long j6 = pVar.f19702f[a];
            j2 = pVar.f19699c[a];
            if (j6 < j && a < pVar.f19698b - 1) {
                int b = pVar.mo23394b(j);
                if (!(b == -1 || b == a)) {
                    j4 = pVar.f19702f[b];
                    j5 = pVar.f19699c[b];
                    j3 = j5;
                    j = j6;
                }
            }
            j5 = -1;
            j4 = -9223372036854775807L;
            j3 = j5;
            j = j6;
        } else {
            j2 = Long.MAX_VALUE;
            j3 = -1;
            j4 = -9223372036854775807L;
        }
        int i2 = 0;
        while (true) {
            C8979a[] aVarArr2 = this.f19649q;
            if (i2 >= aVarArr2.length) {
                break;
            }
            if (i2 != this.f19651s) {
                C8986p pVar2 = aVarArr2[i2].f19655b;
                long a2 = m26466a(pVar2, j, j2);
                if (j4 != -9223372036854775807L) {
                    j3 = m26466a(pVar2, j4, j3);
                }
                j2 = a2;
            }
            i2++;
        }
        C8923p pVar3 = new C8923p(j, j2);
        if (j4 == -9223372036854775807L) {
            return new C8921a(pVar3);
        }
        return new C8921a(pVar3, new C8923p(j4, j3));
    }

    /* renamed from: c */
    public boolean mo23279c() {
        return true;
    }

    /* renamed from: d */
    public long mo23280d() {
        return this.f19652t;
    }

    public C8978j(int i) {
        this.f19633a = i;
        this.f19637e = new C9572w(16);
        this.f19638f = new ArrayDeque<>();
        this.f19634b = new C9572w(C9568u.f22309a);
        this.f19635c = new C9572w(4);
        this.f19636d = new C9572w();
        this.f19644l = -1;
    }

    /* renamed from: d */
    private void m26478d(long j) throws C8723g0 {
        while (!this.f19638f.isEmpty() && ((C8959a) this.f19638f.peek()).f19500g1 == j) {
            C8959a aVar = (C8959a) this.f19638f.pop();
            if (aVar.f19499a == C8958c.f19424R) {
                m26468a(aVar);
                this.f19638f.clear();
                this.f19639g = 2;
            } else if (!this.f19638f.isEmpty()) {
                ((C8959a) this.f19638f.peek()).mo23363a(aVar);
            }
        }
        if (this.f19639g != 2) {
            m26479e();
        }
    }

    /* renamed from: a */
    public void mo23309a(C8914i iVar) {
        this.f19648p = iVar;
    }

    /* renamed from: e */
    private void m26480e(long j) {
        C8979a[] aVarArr;
        for (C8979a aVar : this.f19649q) {
            C8986p pVar = aVar.f19655b;
            int a = pVar.mo23393a(j);
            if (a == -1) {
                a = pVar.mo23394b(j);
            }
            aVar.f19657d = a;
        }
    }

    /* renamed from: a */
    public void mo23308a(long j, long j2) {
        this.f19638f.clear();
        this.f19642j = 0;
        this.f19644l = -1;
        this.f19645m = 0;
        this.f19646n = 0;
        this.f19647o = false;
        if (j == 0) {
            m26479e();
        } else if (this.f19649q != null) {
            m26480e(j2);
        }
    }

    /* renamed from: a */
    public int mo23306a(C8913h hVar, C8919n nVar) throws IOException, InterruptedException {
        while (true) {
            int i = this.f19639g;
            if (i != 0) {
                if (i != 1) {
                    if (i == 2) {
                        return m26476c(hVar, nVar);
                    }
                    throw new IllegalStateException();
                } else if (m26474b(hVar, nVar)) {
                    return 1;
                }
            } else if (!m26477c(hVar)) {
                return -1;
            }
        }
    }

    /* renamed from: a */
    private void m26468a(C8959a aVar) throws C8723g0 {
        Metadata metadata;
        long j;
        C8986p pVar;
        C8959a aVar2 = aVar;
        ArrayList arrayList = new ArrayList();
        C8916k kVar = new C8916k();
        C8960b e = aVar2.mo23366e(C8958c.f19417N0);
        Metadata metadata2 = null;
        if (e != null) {
            metadata = C8961d.m26367a(e, this.f19653u);
            if (metadata != null) {
                kVar.mo23316a(metadata);
            }
        } else {
            metadata = null;
        }
        C8959a d = aVar2.mo23365d(C8958c.f19419O0);
        if (d != null) {
            metadata2 = C8961d.m26378b(d);
        }
        ArrayList a = m26467a(aVar2, kVar, (this.f19633a & 1) != 0);
        int size = a.size();
        long j2 = -9223372036854775807L;
        long j3 = -9223372036854775807L;
        int i = 0;
        int i2 = -1;
        while (i < size) {
            C8986p pVar2 = (C8986p) a.get(i);
            C8983m mVar = pVar2.f19697a;
            C8986p pVar3 = pVar2;
            long j4 = mVar.f19666e;
            if (j4 != j2) {
                j = j4;
                pVar = pVar3;
            } else {
                pVar = pVar3;
                j = pVar.f19704h;
            }
            long max = Math.max(j3, j);
            ArrayList arrayList2 = a;
            int i3 = size;
            C8979a aVar3 = new C8979a(mVar, pVar, this.f19648p.mo23311a(i, mVar.f19663b));
            Format b = mVar.f19667f.mo22605b(pVar.f19701e + 30);
            long j5 = max;
            if (mVar.f19663b == 2 && j > 0) {
                int i4 = pVar.f19698b;
                if (i4 > 1) {
                    b = b.mo22598a(((float) i4) / (((float) j) / 1000000.0f));
                }
            }
            aVar3.f19656c.mo23304a(C8977i.m26454a(mVar.f19663b, b, metadata, metadata2, kVar));
            if (mVar.f19663b == 2) {
                if (i2 == -1) {
                    i2 = arrayList.size();
                }
            }
            arrayList.add(aVar3);
            i++;
            a = arrayList2;
            size = i3;
            j3 = j5;
            j2 = -9223372036854775807L;
        }
        this.f19651s = i2;
        this.f19652t = j3;
        this.f19649q = (C8979a[]) arrayList.toArray(new C8979a[0]);
        this.f19650r = m26471a(this.f19649q);
        this.f19648p.mo23312a();
        this.f19648p.mo23313a(this);
    }

    /* renamed from: b */
    private boolean m26474b(C8913h hVar, C8919n nVar) throws IOException, InterruptedException {
        boolean z;
        long j = this.f19641i - ((long) this.f19642j);
        long position = hVar.getPosition() + j;
        C9572w wVar = this.f19643k;
        if (wVar != null) {
            hVar.mo23289a(wVar.f22333a, this.f19642j, (int) j);
            if (this.f19640h == C8958c.f19444b) {
                this.f19653u = m26470a(this.f19643k);
            } else if (!this.f19638f.isEmpty()) {
                ((C8959a) this.f19638f.peek()).mo23364a(new C8960b(this.f19640h, this.f19643k));
            }
        } else if (j < 262144) {
            hVar.mo23298c((int) j);
        } else {
            nVar.f19163a = hVar.getPosition() + j;
            z = true;
            m26478d(position);
            if (z || this.f19639g == 2) {
                return false;
            }
            return true;
        }
        z = false;
        m26478d(position);
        if (z) {
        }
        return false;
    }

    /* renamed from: c */
    private int m26476c(C8913h hVar, C8919n nVar) throws IOException, InterruptedException {
        long position = hVar.getPosition();
        if (this.f19644l == -1) {
            this.f19644l = m26475c(position);
            int i = this.f19644l;
            if (i == -1) {
                return -1;
            }
            this.f19647o = "audio/ac4".equals(this.f19649q[i].f19654a.f19667f.f18349b0);
        }
        C8979a aVar = this.f19649q[this.f19644l];
        C8924q qVar = aVar.f19656c;
        int i2 = aVar.f19657d;
        C8986p pVar = aVar.f19655b;
        long j = pVar.f19699c[i2];
        int i3 = pVar.f19700d[i2];
        long j2 = (j - position) + ((long) this.f19645m);
        if (j2 < 0 || j2 >= 262144) {
            nVar.f19163a = j;
            return 1;
        }
        if (aVar.f19654a.f19668g == 1) {
            j2 += 8;
            i3 -= 8;
        }
        hVar.mo23298c((int) j2);
        int i4 = aVar.f19654a.f19671j;
        if (i4 == 0) {
            if (this.f19647o) {
                C8828h.m25610a(i3, this.f19636d);
                int d = this.f19636d.mo24690d();
                qVar.mo23305a(this.f19636d, d);
                i3 += d;
                this.f19645m += d;
                this.f19647o = false;
            }
            while (true) {
                int i5 = this.f19645m;
                if (i5 >= i3) {
                    break;
                }
                int a = qVar.mo23302a(hVar, i3 - i5, false);
                this.f19645m += a;
                this.f19646n -= a;
            }
        } else {
            byte[] bArr = this.f19635c.f22333a;
            bArr[0] = 0;
            bArr[1] = 0;
            bArr[2] = 0;
            int i6 = 4 - i4;
            while (this.f19645m < i3) {
                int i7 = this.f19646n;
                if (i7 == 0) {
                    hVar.mo23289a(bArr, i6, i4);
                    this.f19635c.mo24693e(0);
                    int i8 = this.f19635c.mo24698i();
                    if (i8 >= 0) {
                        this.f19646n = i8;
                        this.f19634b.mo24693e(0);
                        qVar.mo23305a(this.f19634b, 4);
                        this.f19645m += 4;
                        i3 += i6;
                    } else {
                        throw new C8723g0("Invalid NAL length");
                    }
                } else {
                    int a2 = qVar.mo23302a(hVar, i7, false);
                    this.f19645m += a2;
                    this.f19646n -= a2;
                }
            }
        }
        int i9 = i3;
        C8986p pVar2 = aVar.f19655b;
        qVar.mo23303a(pVar2.f19702f[i2], pVar2.f19703g[i2], i9, 0, null);
        aVar.f19657d++;
        this.f19644l = -1;
        this.f19645m = 0;
        this.f19646n = 0;
        return 0;
    }

    /* renamed from: b */
    private void m26472b(C8913h hVar) throws IOException, InterruptedException {
        this.f19636d.mo24689c(8);
        hVar.mo23294b(this.f19636d.f22333a, 0, 8);
        this.f19636d.mo24695f(4);
        if (this.f19636d.mo24698i() == C8958c.f19460g0) {
            hVar.mo23297c();
        } else {
            hVar.mo23298c(4);
        }
    }

    /* renamed from: b */
    private static boolean m26473b(int i) {
        return i == C8958c.f19457f0 || i == C8958c.f19426S || i == C8958c.f19460g0 || i == C8958c.f19462h0 || i == C8958c.f19498z0 || i == C8958c.f19391A0 || i == C8958c.f19393B0 || i == C8958c.f19454e0 || i == C8958c.f19395C0 || i == C8958c.f19397D0 || i == C8958c.f19399E0 || i == C8958c.f19401F0 || i == C8958c.f19403G0 || i == C8958c.f19448c0 || i == C8958c.f19444b || i == C8958c.f19417N0 || i == C8958c.f19421P0 || i == C8958c.f19423Q0;
    }

    /* renamed from: a */
    private ArrayList<C8986p> m26467a(C8959a aVar, C8916k kVar, boolean z) throws C8723g0 {
        ArrayList<C8986p> arrayList = new ArrayList<>();
        for (int i = 0; i < aVar.f19502i1.size(); i++) {
            C8959a aVar2 = (C8959a) aVar.f19502i1.get(i);
            if (aVar2.f19499a == C8958c.f19428T) {
                C8983m a = C8961d.m26369a(aVar2, aVar.mo23366e(C8958c.f19426S), -9223372036854775807L, (DrmInitData) null, z, this.f19653u);
                if (a != null) {
                    C8986p a2 = C8961d.m26371a(a, aVar2.mo23365d(C8958c.f19430U).mo23365d(C8958c.f19432V).mo23365d(C8958c.f19434W), kVar);
                    if (a2.f19698b != 0) {
                        arrayList.add(a2);
                    }
                }
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    private static long[][] m26471a(C8979a[] aVarArr) {
        long[][] jArr = new long[aVarArr.length][];
        int[] iArr = new int[aVarArr.length];
        long[] jArr2 = new long[aVarArr.length];
        boolean[] zArr = new boolean[aVarArr.length];
        for (int i = 0; i < aVarArr.length; i++) {
            jArr[i] = new long[aVarArr[i].f19655b.f19698b];
            jArr2[i] = aVarArr[i].f19655b.f19702f[0];
        }
        long j = 0;
        int i2 = 0;
        while (i2 < aVarArr.length) {
            int i3 = -1;
            long j2 = Long.MAX_VALUE;
            for (int i4 = 0; i4 < aVarArr.length; i4++) {
                if (!zArr[i4] && jArr2[i4] <= j2) {
                    j2 = jArr2[i4];
                    i3 = i4;
                }
            }
            int i5 = iArr[i3];
            jArr[i3][i5] = j;
            j += (long) aVarArr[i3].f19655b.f19700d[i5];
            int i6 = i5 + 1;
            iArr[i3] = i6;
            if (i6 < jArr[i3].length) {
                jArr2[i3] = aVarArr[i3].f19655b.f19702f[i6];
            } else {
                zArr[i3] = true;
                i2++;
            }
        }
        return jArr;
    }

    /* renamed from: a */
    private static long m26466a(C8986p pVar, long j, long j2) {
        int a = m26465a(pVar, j);
        if (a == -1) {
            return j2;
        }
        return Math.min(pVar.f19699c[a], j2);
    }

    /* renamed from: c */
    private int m26475c(long j) {
        int i = 0;
        long j2 = Long.MAX_VALUE;
        boolean z = true;
        long j3 = Long.MAX_VALUE;
        int i2 = -1;
        int i3 = -1;
        boolean z2 = true;
        long j4 = Long.MAX_VALUE;
        while (true) {
            C8979a[] aVarArr = this.f19649q;
            if (i >= aVarArr.length) {
                break;
            }
            C8979a aVar = aVarArr[i];
            int i4 = aVar.f19657d;
            C8986p pVar = aVar.f19655b;
            if (i4 != pVar.f19698b) {
                long j5 = pVar.f19699c[i4];
                long j6 = this.f19650r[i][i4];
                long j7 = j5 - j;
                boolean z3 = j7 < 0 || j7 >= 262144;
                if ((!z3 && z2) || (z3 == z2 && j7 < j4)) {
                    z2 = z3;
                    i3 = i;
                    j4 = j7;
                    j3 = j6;
                }
                if (j6 < j2) {
                    z = z3;
                    i2 = i;
                    j2 = j6;
                }
            }
            i++;
        }
        return (j2 == Long.MAX_VALUE || !z || j3 < j2 + 10485760) ? i3 : i2;
    }

    /* renamed from: a */
    private static int m26465a(C8986p pVar, long j) {
        int a = pVar.mo23393a(j);
        return a == -1 ? pVar.mo23394b(j) : a;
    }

    /* renamed from: a */
    private static boolean m26470a(C9572w wVar) {
        wVar.mo24693e(8);
        if (wVar.mo24698i() == f19632v) {
            return true;
        }
        wVar.mo24695f(4);
        while (wVar.mo24679a() > 0) {
            if (wVar.mo24698i() == f19632v) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    private static boolean m26469a(int i) {
        return i == C8958c.f19424R || i == C8958c.f19428T || i == C8958c.f19430U || i == C8958c.f19432V || i == C8958c.f19434W || i == C8958c.f19451d0 || i == C8958c.f19419O0;
    }
}
