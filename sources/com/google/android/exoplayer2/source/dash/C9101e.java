package com.google.android.exoplayer2.source.dash;

import android.util.Pair;
import android.util.SparseIntArray;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.SeekParameters;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.p393v0.Util;
import com.google.android.exoplayer2.source.C9072a0;
import com.google.android.exoplayer2.source.C9072a0.C9073a;
import com.google.android.exoplayer2.source.C9141f0;
import com.google.android.exoplayer2.source.C9143g0;
import com.google.android.exoplayer2.source.C9143g0.C9144a;
import com.google.android.exoplayer2.source.C9199j0;
import com.google.android.exoplayer2.source.C9256t;
import com.google.android.exoplayer2.source.C9258v;
import com.google.android.exoplayer2.source.MediaSourceEventListener.C9068a;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.source.dash.C9098c.C9099a;
import com.google.android.exoplayer2.source.dash.C9110j.C9112b;
import com.google.android.exoplayer2.source.dash.C9110j.C9113c;
import com.google.android.exoplayer2.source.dash.p376k.C9114a;
import com.google.android.exoplayer2.source.dash.p376k.C9115b;
import com.google.android.exoplayer2.source.dash.p376k.C9118d;
import com.google.android.exoplayer2.source.dash.p376k.C9119e;
import com.google.android.exoplayer2.source.dash.p376k.C9120f;
import com.google.android.exoplayer2.source.dash.p376k.C9123i;
import com.google.android.exoplayer2.source.p379m0.C9217g;
import com.google.android.exoplayer2.source.p379m0.C9217g.C9218a;
import com.google.android.exoplayer2.source.p379m0.C9217g.C9219b;
import com.google.android.exoplayer2.trackselection.C9311j;
import com.google.android.exoplayer2.upstream.C9452b0;
import com.google.android.exoplayer2.upstream.C9491f;
import com.google.android.exoplayer2.upstream.C9524z;
import com.google.android.exoplayer2.upstream.TransferListener;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.google.android.exoplayer2.source.dash.e */
/* compiled from: DashMediaPeriod */
final class C9101e implements C9072a0, C9144a<C9217g<C9098c>>, C9219b<C9098c> {

    /* renamed from: o0 */
    private static final Pattern f20341o0 = Pattern.compile("CC([1-4])=(.+)");

    /* renamed from: U */
    private final C9099a f20342U;

    /* renamed from: V */
    private final TransferListener f20343V;

    /* renamed from: W */
    private final C9524z f20344W;

    /* renamed from: X */
    private final long f20345X;

    /* renamed from: Y */
    private final C9452b0 f20346Y;

    /* renamed from: Z */
    private final C9491f f20347Z;

    /* renamed from: a0 */
    private final TrackGroupArray f20348a0;

    /* renamed from: b0 */
    private final C9102a[] f20349b0;

    /* renamed from: c */
    final int f20350c;

    /* renamed from: c0 */
    private final C9256t f20351c0;

    /* renamed from: d0 */
    private final C9110j f20352d0;

    /* renamed from: e0 */
    private final IdentityHashMap<C9217g<C9098c>, C9113c> f20353e0 = new IdentityHashMap<>();

    /* renamed from: f0 */
    private final C9068a f20354f0;

    /* renamed from: g0 */
    private C9073a f20355g0;

    /* renamed from: h0 */
    private C9217g<C9098c>[] f20356h0 = m27154b(0);

    /* renamed from: i0 */
    private C9109i[] f20357i0 = new C9109i[0];

    /* renamed from: j0 */
    private C9143g0 f20358j0;

    /* renamed from: k0 */
    private C9115b f20359k0;

    /* renamed from: l0 */
    private int f20360l0;

    /* renamed from: m0 */
    private List<C9119e> f20361m0;

    /* renamed from: n0 */
    private boolean f20362n0;

    /* renamed from: com.google.android.exoplayer2.source.dash.e$a */
    /* compiled from: DashMediaPeriod */
    private static final class C9102a {

        /* renamed from: a */
        public final int[] f20363a;

        /* renamed from: b */
        public final int f20364b;

        /* renamed from: c */
        public final int f20365c;

        /* renamed from: d */
        public final int f20366d;

        /* renamed from: e */
        public final int f20367e;

        /* renamed from: f */
        public final int f20368f;

        /* renamed from: g */
        public final int f20369g;

        private C9102a(int i, int i2, int[] iArr, int i3, int i4, int i5, int i6) {
            this.f20364b = i;
            this.f20363a = iArr;
            this.f20365c = i2;
            this.f20367e = i3;
            this.f20368f = i4;
            this.f20369g = i5;
            this.f20366d = i6;
        }

        /* renamed from: a */
        public static C9102a m27174a(int i, int[] iArr, int i2, int i3, int i4) {
            C9102a aVar = new C9102a(i, 0, iArr, i2, i3, i4, -1);
            return aVar;
        }

        /* renamed from: b */
        public static C9102a m27176b(int[] iArr, int i) {
            C9102a aVar = new C9102a(4, 1, iArr, i, -1, -1, -1);
            return aVar;
        }

        /* renamed from: a */
        public static C9102a m27175a(int[] iArr, int i) {
            C9102a aVar = new C9102a(3, 1, iArr, i, -1, -1, -1);
            return aVar;
        }

        /* renamed from: a */
        public static C9102a m27173a(int i) {
            C9102a aVar = new C9102a(4, 2, new int[0], -1, -1, -1, i);
            return aVar;
        }
    }

    public C9101e(int i, C9115b bVar, int i2, C9099a aVar, TransferListener transferListener, C9524z zVar, C9068a aVar2, long j, C9452b0 b0Var, C9491f fVar, C9256t tVar, C9112b bVar2) {
        this.f20350c = i;
        this.f20359k0 = bVar;
        this.f20360l0 = i2;
        this.f20342U = aVar;
        this.f20343V = transferListener;
        this.f20344W = zVar;
        this.f20354f0 = aVar2;
        this.f20345X = j;
        this.f20346Y = b0Var;
        this.f20347Z = fVar;
        this.f20351c0 = tVar;
        this.f20352d0 = new C9110j(bVar, bVar2, fVar);
        this.f20358j0 = tVar.mo24003a(this.f20356h0);
        C9120f a = bVar.mo23675a(i2);
        this.f20361m0 = a.f20456d;
        Pair a2 = m27142a(a.f20455c, this.f20361m0);
        this.f20348a0 = (TrackGroupArray) a2.first;
        this.f20349b0 = (C9102a[]) a2.second;
        aVar2.mo23499a();
    }

    /* renamed from: b */
    public void mo23633b() {
        this.f20352d0.mo23667b();
        for (C9217g<C9098c> a : this.f20356h0) {
            a.mo23950a((C9219b<T>) this);
        }
        this.f20355g0 = null;
        this.f20354f0.mo23518b();
    }

    /* renamed from: c */
    public void mo23545c(long j) {
        this.f20358j0.mo23545c(j);
    }

    /* renamed from: d */
    public void mo23546d() throws IOException {
        this.f20346Y.mo23621a();
    }

    /* renamed from: e */
    public long mo23547e() {
        if (!this.f20362n0) {
            this.f20354f0.mo23525c();
            this.f20362n0 = true;
        }
        return -9223372036854775807L;
    }

    /* renamed from: f */
    public TrackGroupArray mo23548f() {
        return this.f20348a0;
    }

    /* renamed from: g */
    public long mo23549g() {
        return this.f20358j0.mo23549g();
    }

    /* renamed from: a */
    public void mo23630a(C9115b bVar, int i) {
        C9109i[] iVarArr;
        this.f20359k0 = bVar;
        this.f20360l0 = i;
        this.f20352d0.mo23664a(bVar);
        C9217g<C9098c>[] gVarArr = this.f20356h0;
        if (gVarArr != null) {
            for (C9217g<C9098c> i2 : gVarArr) {
                ((C9098c) i2.mo23951i()).mo23627a(bVar, i);
            }
            this.f20355g0.mo23631a(this);
        }
        this.f20361m0 = bVar.mo23675a(i).f20456d;
        for (C9109i iVar : this.f20357i0) {
            Iterator it = this.f20361m0.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C9119e eVar = (C9119e) it.next();
                if (eVar.mo23720a().equals(iVar.mo23662c())) {
                    boolean z = true;
                    int a = bVar.mo23674a() - 1;
                    if (!bVar.f20426d || i != a) {
                        z = false;
                    }
                    iVar.mo23661a(eVar, z);
                }
            }
        }
    }

    /* renamed from: c */
    public long mo23544c() {
        return this.f20358j0.mo23544c();
    }

    /* renamed from: b */
    public boolean mo23543b(long j) {
        return this.f20358j0.mo23543b(j);
    }

    /* renamed from: b */
    public void mo23631a(C9217g<C9098c> gVar) {
        this.f20355g0.mo23631a(this);
    }

    /* renamed from: b */
    private static int[][] m27155b(List<C9114a> list) {
        int size = list.size();
        SparseIntArray sparseIntArray = new SparseIntArray(size);
        for (int i = 0; i < size; i++) {
            sparseIntArray.put(((C9114a) list.get(i)).f20418a, i);
        }
        int[][] iArr = new int[size][];
        boolean[] zArr = new boolean[size];
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            if (!zArr[i3]) {
                zArr[i3] = true;
                C9118d a = m27145a(((C9114a) list.get(i3)).f20422e);
                if (a == null) {
                    int i4 = i2 + 1;
                    iArr[i2] = new int[]{i3};
                    i2 = i4;
                } else {
                    String[] a2 = Util.m29423a(a.f20447b, ",");
                    int[] iArr2 = new int[(a2.length + 1)];
                    iArr2[0] = i3;
                    int i5 = 1;
                    for (String parseInt : a2) {
                        int i6 = sparseIntArray.get(Integer.parseInt(parseInt), -1);
                        if (i6 != -1) {
                            zArr[i6] = true;
                            iArr2[i5] = i6;
                            i5++;
                        }
                    }
                    if (i5 < iArr2.length) {
                        iArr2 = Arrays.copyOf(iArr2, i5);
                    }
                    int i7 = i2 + 1;
                    iArr[i2] = iArr2;
                    i2 = i7;
                }
            }
        }
        return i2 < size ? (int[][]) Arrays.copyOf(iArr, i2) : iArr;
    }

    /* renamed from: a */
    public synchronized void mo23632a(C9217g<C9098c> gVar) {
        C9113c cVar = (C9113c) this.f20353e0.remove(gVar);
        if (cVar != null) {
            cVar.mo23670a();
        }
    }

    /* renamed from: a */
    public void mo23542a(C9073a aVar, long j) {
        this.f20355g0 = aVar;
        aVar.mo23550a(this);
    }

    /* renamed from: a */
    public long mo23540a(C9311j[] jVarArr, boolean[] zArr, C9141f0[] f0VarArr, boolean[] zArr2, long j) {
        int[] a = m27151a(jVarArr);
        m27150a(jVarArr, zArr, f0VarArr);
        m27148a(jVarArr, f0VarArr, a);
        m27149a(jVarArr, f0VarArr, zArr2, j, a);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (C9217g gVar : f0VarArr) {
            if (gVar instanceof C9217g) {
                arrayList.add(gVar);
            } else if (gVar instanceof C9109i) {
                arrayList2.add((C9109i) gVar);
            }
        }
        this.f20356h0 = m27154b(arrayList.size());
        arrayList.toArray(this.f20356h0);
        this.f20357i0 = new C9109i[arrayList2.size()];
        arrayList2.toArray(this.f20357i0);
        this.f20358j0 = this.f20351c0.mo24003a(this.f20356h0);
        return j;
    }

    /* renamed from: b */
    private static boolean m27153b(List<C9114a> list, int[] iArr) {
        for (int i : iArr) {
            List<C9123i> list2 = ((C9114a) list.get(i)).f20420c;
            for (int i2 = 0; i2 < list2.size(); i2++) {
                if (!((C9123i) list2.get(i2)).f20469d.isEmpty()) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: b */
    private static C9217g<C9098c>[] m27154b(int i) {
        return new C9217g[i];
    }

    /* renamed from: a */
    public void mo23541a(long j, boolean z) {
        for (C9217g<C9098c> a : this.f20356h0) {
            a.mo23947a(j, z);
        }
    }

    /* renamed from: a */
    public long mo23538a(long j) {
        for (C9217g<C9098c> a : this.f20356h0) {
            a.mo23946a(j);
        }
        for (C9109i a2 : this.f20357i0) {
            a2.mo23660a(j);
        }
        return j;
    }

    /* renamed from: a */
    public long mo23539a(long j, SeekParameters seekParameters) {
        C9217g<C9098c>[] gVarArr;
        for (C9217g<C9098c> gVar : this.f20356h0) {
            if (gVar.f20890c == 2) {
                return gVar.mo23943a(j, seekParameters);
            }
        }
        return j;
    }

    /* renamed from: a */
    private int[] m27151a(C9311j[] jVarArr) {
        int[] iArr = new int[jVarArr.length];
        for (int i = 0; i < jVarArr.length; i++) {
            if (jVarArr[i] != null) {
                iArr[i] = this.f20348a0.mo23530a(jVarArr[i].mo24067a());
            } else {
                iArr[i] = -1;
            }
        }
        return iArr;
    }

    /* renamed from: a */
    private void m27150a(C9311j[] jVarArr, boolean[] zArr, C9141f0[] f0VarArr) {
        for (int i = 0; i < jVarArr.length; i++) {
            if (jVarArr[i] == null || !zArr[i]) {
                if (f0VarArr[i] instanceof C9217g) {
                    f0VarArr[i].mo23950a((C9219b<T>) this);
                } else if (f0VarArr[i] instanceof C9218a) {
                    f0VarArr[i].mo23954c();
                }
                f0VarArr[i] = null;
            }
        }
    }

    /* renamed from: a */
    private void m27148a(C9311j[] jVarArr, C9141f0[] f0VarArr, int[] iArr) {
        for (int i = 0; i < jVarArr.length; i++) {
            if ((f0VarArr[i] instanceof C9258v) || (f0VarArr[i] instanceof C9218a)) {
                int a = m27140a(i, iArr);
                boolean z = a == -1 ? f0VarArr[i] instanceof C9258v : (f0VarArr[i] instanceof C9218a) && f0VarArr[i].f20908c == f0VarArr[a];
                if (!z) {
                    if (f0VarArr[i] instanceof C9218a) {
                        f0VarArr[i].mo23954c();
                    }
                    f0VarArr[i] = null;
                }
            }
        }
    }

    /* renamed from: a */
    private void m27149a(C9311j[] jVarArr, C9141f0[] f0VarArr, boolean[] zArr, long j, int[] iArr) {
        for (int i = 0; i < jVarArr.length; i++) {
            C9311j jVar = jVarArr[i];
            if (jVar != null) {
                if (f0VarArr[i] == null) {
                    zArr[i] = true;
                    C9102a aVar = this.f20349b0[iArr[i]];
                    int i2 = aVar.f20365c;
                    if (i2 == 0) {
                        f0VarArr[i] = m27146a(aVar, jVar, j);
                    } else if (i2 == 2) {
                        f0VarArr[i] = new C9109i((C9119e) this.f20361m0.get(aVar.f20366d), jVar.mo24067a().mo23902a(0), this.f20359k0.f20426d);
                    }
                } else if (f0VarArr[i] instanceof C9217g) {
                    ((C9098c) f0VarArr[i].mo23951i()).mo23628a(jVar);
                }
            }
        }
        for (int i3 = 0; i3 < jVarArr.length; i3++) {
            if (f0VarArr[i3] == null && jVarArr[i3] != null) {
                C9102a aVar2 = this.f20349b0[iArr[i3]];
                if (aVar2.f20365c == 1) {
                    int a = m27140a(i3, iArr);
                    if (a == -1) {
                        f0VarArr[i3] = new C9258v();
                    } else {
                        f0VarArr[i3] = f0VarArr[a].mo23944a(j, aVar2.f20364b);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    private int m27140a(int i, int[] iArr) {
        int i2 = iArr[i];
        if (i2 == -1) {
            return -1;
        }
        int i3 = this.f20349b0[i2].f20367e;
        for (int i4 = 0; i4 < iArr.length; i4++) {
            int i5 = iArr[i4];
            if (i5 == i3 && this.f20349b0[i5].f20365c == 0) {
                return i4;
            }
        }
        return -1;
    }

    /* renamed from: a */
    private static Pair<TrackGroupArray, C9102a[]> m27142a(List<C9114a> list, List<C9119e> list2) {
        int[][] b = m27155b(list);
        int length = b.length;
        boolean[] zArr = new boolean[length];
        Format[][] formatArr = new Format[length][];
        int a = m27139a(length, list, b, zArr, formatArr) + length + list2.size();
        C9199j0[] j0VarArr = new C9199j0[a];
        C9102a[] aVarArr = new C9102a[a];
        m27147a(list2, j0VarArr, aVarArr, m27141a(list, b, length, zArr, formatArr, j0VarArr, aVarArr));
        return Pair.create(new TrackGroupArray(j0VarArr), aVarArr);
    }

    /* renamed from: a */
    private static int m27139a(int i, List<C9114a> list, int[][] iArr, boolean[] zArr, Format[][] formatArr) {
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            if (m27153b(list, iArr[i3])) {
                zArr[i3] = true;
                i2++;
            }
            formatArr[i3] = m27152a(list, iArr[i3]);
            if (formatArr[i3].length != 0) {
                i2++;
            }
        }
        return i2;
    }

    /* renamed from: a */
    private static int m27141a(List<C9114a> list, int[][] iArr, int i, boolean[] zArr, Format[][] formatArr, C9199j0[] j0VarArr, C9102a[] aVarArr) {
        int i2;
        int i3;
        List<C9114a> list2 = list;
        int i4 = i;
        int i5 = 0;
        int i6 = 0;
        while (i5 < i4) {
            int[] iArr2 = iArr[i5];
            ArrayList arrayList = new ArrayList();
            for (int i7 : iArr2) {
                arrayList.addAll(((C9114a) list.get(i7)).f20420c);
            }
            Format[] formatArr2 = new Format[arrayList.size()];
            for (int i8 = 0; i8 < formatArr2.length; i8++) {
                formatArr2[i8] = ((C9123i) arrayList.get(i8)).f20466a;
            }
            C9114a aVar = (C9114a) list.get(iArr2[0]);
            int i9 = i6 + 1;
            if (zArr[i5]) {
                i2 = i9 + 1;
            } else {
                i2 = i9;
                i9 = -1;
            }
            if (formatArr[i5].length != 0) {
                i3 = i2 + 1;
            } else {
                i3 = i2;
                i2 = -1;
            }
            j0VarArr[i6] = new C9199j0(formatArr2);
            aVarArr[i6] = C9102a.m27174a(aVar.f20419b, iArr2, i6, i9, i2);
            if (i9 != -1) {
                StringBuilder sb = new StringBuilder();
                sb.append(aVar.f20418a);
                sb.append(":emsg");
                j0VarArr[i9] = new C9199j0(Format.m24879a(sb.toString(), "application/x-emsg", (String) null, -1, (DrmInitData) null));
                aVarArr[i9] = C9102a.m27176b(iArr2, i6);
            }
            if (i2 != -1) {
                j0VarArr[i2] = new C9199j0(formatArr[i5]);
                aVarArr[i2] = C9102a.m27175a(iArr2, i6);
            }
            i5++;
            i6 = i3;
        }
        return i6;
    }

    /* renamed from: a */
    private static void m27147a(List<C9119e> list, C9199j0[] j0VarArr, C9102a[] aVarArr, int i) {
        int i2 = i;
        int i3 = 0;
        while (i3 < list.size()) {
            j0VarArr[i2] = new C9199j0(Format.m24879a(((C9119e) list.get(i3)).mo23720a(), "application/x-emsg", (String) null, -1, (DrmInitData) null));
            int i4 = i2 + 1;
            aVarArr[i2] = C9102a.m27173a(i3);
            i3++;
            i2 = i4;
        }
    }

    /* renamed from: a */
    private C9217g<C9098c> m27146a(C9102a aVar, C9311j jVar, long j) {
        C9199j0 j0Var;
        int i;
        C9199j0 j0Var2;
        int i2;
        C9102a aVar2 = aVar;
        boolean z = aVar2.f20368f != -1;
        C9113c cVar = null;
        if (z) {
            j0Var = this.f20348a0.mo23531a(aVar2.f20368f);
            i = 1;
        } else {
            j0Var = null;
            i = 0;
        }
        boolean z2 = aVar2.f20369g != -1;
        if (z2) {
            j0Var2 = this.f20348a0.mo23531a(aVar2.f20369g);
            i += j0Var2.f20833c;
        } else {
            j0Var2 = null;
        }
        Format[] formatArr = new Format[i];
        int[] iArr = new int[i];
        if (z) {
            formatArr[0] = j0Var.mo23902a(0);
            iArr[0] = 4;
            i2 = 1;
        } else {
            i2 = 0;
        }
        ArrayList arrayList = new ArrayList();
        if (z2) {
            for (int i3 = 0; i3 < j0Var2.f20833c; i3++) {
                formatArr[i2] = j0Var2.mo23902a(i3);
                iArr[i2] = 3;
                arrayList.add(formatArr[i2]);
                i2++;
            }
        }
        if (this.f20359k0.f20426d && z) {
            cVar = this.f20352d0.mo23663a();
        }
        C9113c cVar2 = cVar;
        C9113c cVar3 = cVar2;
        C9217g gVar = new C9217g(aVar2.f20364b, iArr, formatArr, this.f20342U.mo23629a(this.f20346Y, this.f20359k0, this.f20360l0, aVar2.f20363a, jVar, aVar2.f20364b, this.f20345X, z, arrayList, cVar2, this.f20343V), this, this.f20347Z, j, this.f20344W, this.f20354f0);
        synchronized (this) {
            this.f20353e0.put(gVar, cVar3);
        }
        return gVar;
    }

    /* renamed from: a */
    private static C9118d m27145a(List<C9118d> list) {
        for (int i = 0; i < list.size(); i++) {
            C9118d dVar = (C9118d) list.get(i);
            if ("urn:mpeg:dash:adaptation-set-switching:2016".equals(dVar.f20446a)) {
                return dVar;
            }
        }
        return null;
    }

    /* renamed from: a */
    private static Format[] m27152a(List<C9114a> list, int[] iArr) {
        for (int i : iArr) {
            C9114a aVar = (C9114a) list.get(i);
            List<C9118d> list2 = ((C9114a) list.get(i)).f20421d;
            for (int i2 = 0; i2 < list2.size(); i2++) {
                C9118d dVar = (C9118d) list2.get(i2);
                if ("urn:scte:dash:cc:cea-608:2015".equals(dVar.f20446a)) {
                    String str = dVar.f20447b;
                    if (str == null) {
                        return new Format[]{m27143a(aVar.f20418a)};
                    }
                    String[] a = Util.m29423a(str, ";");
                    Format[] formatArr = new Format[a.length];
                    for (int i3 = 0; i3 < a.length; i3++) {
                        Matcher matcher = f20341o0.matcher(a[i3]);
                        if (!matcher.matches()) {
                            return new Format[]{m27143a(aVar.f20418a)};
                        }
                        formatArr[i3] = m27144a(aVar.f20418a, matcher.group(2), Integer.parseInt(matcher.group(1)));
                    }
                    return formatArr;
                }
            }
        }
        return new Format[0];
    }

    /* renamed from: a */
    private static Format m27143a(int i) {
        return m27144a(i, (String) null, -1);
    }

    /* renamed from: a */
    private static Format m27144a(int i, String str, int i2) {
        String str2;
        StringBuilder sb = new StringBuilder();
        sb.append(i);
        sb.append(":cea608");
        if (i2 != -1) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(":");
            sb2.append(i2);
            str2 = sb2.toString();
        } else {
            str2 = "";
        }
        sb.append(str2);
        return Format.m24876a(sb.toString(), "application/cea-608", (String) null, -1, 0, str, i2, (DrmInitData) null, Long.MAX_VALUE, null);
    }
}
