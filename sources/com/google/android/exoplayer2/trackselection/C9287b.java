package com.google.android.exoplayer2.trackselection;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.p393v0.C9537e;
import com.google.android.exoplayer2.p393v0.C9542g;
import com.google.android.exoplayer2.p393v0.Util;
import com.google.android.exoplayer2.source.C9199j0;
import com.google.android.exoplayer2.source.p379m0.C9224l;
import com.google.android.exoplayer2.source.p379m0.C9225m;
import com.google.android.exoplayer2.trackselection.C9311j.C9312a;
import com.google.android.exoplayer2.trackselection.C9311j.C9313b;
import com.google.android.exoplayer2.upstream.BandwidthMeter;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.exoplayer2.trackselection.b */
/* compiled from: AdaptiveTrackSelection */
public class C9287b extends C9292c {

    /* renamed from: g */
    private final C9289b f21173g;

    /* renamed from: h */
    private final long f21174h;

    /* renamed from: i */
    private final long f21175i;

    /* renamed from: j */
    private final long f21176j;

    /* renamed from: k */
    private final float f21177k;

    /* renamed from: l */
    private final long f21178l;

    /* renamed from: m */
    private final C9542g f21179m;

    /* renamed from: n */
    private final Format[] f21180n;

    /* renamed from: o */
    private final int[] f21181o;

    /* renamed from: p */
    private final int[] f21182p;

    /* renamed from: q */
    private C9309h f21183q;

    /* renamed from: r */
    private float f21184r;

    /* renamed from: s */
    private int f21185s;

    /* renamed from: t */
    private int f21186t;

    /* renamed from: u */
    private long f21187u;

    /* renamed from: com.google.android.exoplayer2.trackselection.b$b */
    /* compiled from: AdaptiveTrackSelection */
    private interface C9289b {
        /* renamed from: a */
        long mo24060a();
    }

    /* renamed from: com.google.android.exoplayer2.trackselection.b$c */
    /* compiled from: AdaptiveTrackSelection */
    private static final class C9290c implements C9289b {

        /* renamed from: a */
        private final BandwidthMeter f21188a;

        /* renamed from: b */
        private final float f21189b;

        /* renamed from: c */
        private long f21190c;

        /* renamed from: d */
        private long[][] f21191d;

        C9290c(BandwidthMeter bandwidthMeter, float f) {
            this.f21188a = bandwidthMeter;
            this.f21189b = f;
        }

        /* renamed from: a */
        public long mo24060a() {
            long max = Math.max(0, ((long) (((float) this.f21188a.mo24447b()) * this.f21189b)) - this.f21190c);
            if (this.f21191d == null) {
                return max;
            }
            int i = 1;
            while (true) {
                long[][] jArr = this.f21191d;
                if (i >= jArr.length - 1 || jArr[i][0] >= max) {
                    long[][] jArr2 = this.f21191d;
                    long[] jArr3 = jArr2[i - 1];
                    long[] jArr4 = jArr2[i];
                } else {
                    i++;
                }
            }
            long[][] jArr22 = this.f21191d;
            long[] jArr32 = jArr22[i - 1];
            long[] jArr42 = jArr22[i];
            return jArr32[1] + ((long) ((((float) (max - jArr32[0])) / ((float) (jArr42[0] - jArr32[0]))) * ((float) (jArr42[1] - jArr32[1]))));
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo24061a(long j) {
            this.f21190c = j;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo24062a(long[][] jArr) {
            C9537e.m29299a(jArr.length >= 2);
            this.f21191d = jArr;
        }
    }

    /* renamed from: com.google.android.exoplayer2.trackselection.b$d */
    /* compiled from: AdaptiveTrackSelection */
    public static class C9291d implements C9313b {

        /* renamed from: a */
        private final BandwidthMeter f21192a;

        /* renamed from: b */
        private final int f21193b;

        /* renamed from: c */
        private final int f21194c;

        /* renamed from: d */
        private final int f21195d;

        /* renamed from: e */
        private final float f21196e;

        /* renamed from: f */
        private final float f21197f;

        /* renamed from: g */
        private final long f21198g;

        /* renamed from: h */
        private final C9542g f21199h;

        /* renamed from: i */
        private C9309h f21200i;

        /* renamed from: j */
        private boolean f21201j;

        public C9291d() {
            this(10000, 25000, 25000, 0.75f, 0.75f, 2000, C9542g.f22257a);
        }

        /* renamed from: a */
        public final C9311j[] mo24064a(C9312a[] aVarArr, BandwidthMeter bandwidthMeter) {
            BandwidthMeter bandwidthMeter2 = this.f21192a;
            if (bandwidthMeter2 != null) {
                bandwidthMeter = bandwidthMeter2;
            }
            C9311j[] jVarArr = new C9311j[aVarArr.length];
            ArrayList arrayList = new ArrayList();
            int i = 0;
            for (int i2 = 0; i2 < aVarArr.length; i2++) {
                C9312a aVar = aVarArr[i2];
                if (aVar != null) {
                    int[] iArr = aVar.f21296b;
                    if (iArr.length > 1) {
                        C9287b a = mo24063a(aVar.f21295a, bandwidthMeter, iArr);
                        a.mo24054a(this.f21200i);
                        arrayList.add(a);
                        jVarArr[i2] = a;
                    } else {
                        jVarArr[i2] = new C9305e(aVar.f21295a, iArr[0], aVar.f21297c, aVar.f21298d);
                        int i3 = aVar.f21295a.mo23902a(aVar.f21296b[0]).f18345X;
                        if (i3 != -1) {
                            i += i3;
                        }
                    }
                }
            }
            if (this.f21201j) {
                for (int i4 = 0; i4 < arrayList.size(); i4++) {
                    ((C9287b) arrayList.get(i4)).mo24053a((long) i);
                }
            }
            if (arrayList.size() > 1) {
                long[][] jArr = new long[arrayList.size()][];
                for (int i5 = 0; i5 < arrayList.size(); i5++) {
                    C9287b bVar = (C9287b) arrayList.get(i5);
                    jArr[i5] = new long[bVar.length()];
                    for (int i6 = 0; i6 < bVar.length(); i6++) {
                        jArr[i5][i6] = (long) bVar.mo24066a((bVar.length() - i6) - 1).f18345X;
                    }
                }
                long[][][] b = C9287b.m28183c(jArr);
                for (int i7 = 0; i7 < arrayList.size(); i7++) {
                    ((C9287b) arrayList.get(i7)).mo24055a(b[i7]);
                }
            }
            return jVarArr;
        }

        public C9291d(int i, int i2, int i3, float f, float f2, long j, C9542g gVar) {
            this(null, i, i2, i3, f, f2, j, gVar);
        }

        @Deprecated
        public C9291d(BandwidthMeter bandwidthMeter, int i, int i2, int i3, float f, float f2, long j, C9542g gVar) {
            this.f21192a = bandwidthMeter;
            this.f21193b = i;
            this.f21194c = i2;
            this.f21195d = i3;
            this.f21196e = f;
            this.f21197f = f2;
            this.f21198g = j;
            this.f21199h = gVar;
            this.f21200i = C9309h.f21294a;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public C9287b mo24063a(C9199j0 j0Var, BandwidthMeter bandwidthMeter, int[] iArr) {
            C9199j0 j0Var2 = j0Var;
            int[] iArr2 = iArr;
            C9287b bVar = new C9287b(j0Var2, iArr2, new C9290c(bandwidthMeter, this.f21196e), (long) this.f21193b, (long) this.f21194c, (long) this.f21195d, this.f21197f, this.f21198g, this.f21199h);
            return bVar;
        }
    }

    /* renamed from: d */
    private static double[][] m28184d(long[][] jArr) {
        double[][] dArr = new double[jArr.length][];
        for (int i = 0; i < jArr.length; i++) {
            dArr[i] = new double[jArr[i].length];
            for (int i2 = 0; i2 < jArr[i].length; i2++) {
                dArr[i][i2] = jArr[i][i2] == -1 ? 0.0d : Math.log((double) jArr[i][i2]);
            }
        }
        return dArr;
    }

    /* renamed from: a */
    public void mo24054a(C9309h hVar) {
        this.f21183q = hVar;
    }

    /* renamed from: c */
    public void mo24058c() {
        this.f21187u = -9223372036854775807L;
    }

    /* renamed from: g */
    public int mo23815g() {
        return this.f21186t;
    }

    /* renamed from: h */
    public Object mo23816h() {
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public long mo24059j() {
        return this.f21176j;
    }

    private C9287b(C9199j0 j0Var, int[] iArr, C9289b bVar, long j, long j2, long j3, float f, long j4, C9542g gVar) {
        super(j0Var, iArr);
        this.f21173g = bVar;
        this.f21174h = j * 1000;
        this.f21175i = j2 * 1000;
        this.f21176j = j3 * 1000;
        this.f21177k = f;
        this.f21178l = j4;
        this.f21179m = gVar;
        this.f21184r = 1.0f;
        this.f21186t = 0;
        this.f21187u = -9223372036854775807L;
        this.f21183q = C9309h.f21294a;
        int i = this.f21203b;
        this.f21180n = new Format[i];
        this.f21181o = new int[i];
        this.f21182p = new int[i];
        for (int i2 = 0; i2 < this.f21203b; i2++) {
            Format a = mo24066a(i2);
            Format[] formatArr = this.f21180n;
            formatArr[i2] = a;
            this.f21181o[i2] = formatArr[i2].f18345X;
        }
    }

    /* renamed from: c */
    private long m28182c(long j) {
        return (j > -9223372036854775807L ? 1 : (j == -9223372036854775807L ? 0 : -1)) != 0 && (j > this.f21174h ? 1 : (j == this.f21174h ? 0 : -1)) <= 0 ? (long) (((float) j) * this.f21177k) : this.f21174h;
    }

    /* renamed from: a */
    public void mo24053a(long j) {
        ((C9290c) this.f21173g).mo24061a(j);
    }

    /* renamed from: b */
    public int mo23814b() {
        return this.f21185s;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public boolean mo24057b(long j) {
        long j2 = this.f21187u;
        return j2 == -9223372036854775807L || j - j2 >= this.f21178l;
    }

    /* renamed from: b */
    private static double[][] m28180b(double[][] dArr) {
        double[][] dArr2 = new double[dArr.length][];
        for (int i = 0; i < dArr.length; i++) {
            dArr2[i] = new double[(dArr[i].length - 1)];
            if (dArr2[i].length != 0) {
                double d = dArr[i][dArr[i].length - 1] - dArr[i][0];
                int i2 = 0;
                while (i2 < dArr[i].length - 1) {
                    int i3 = i2 + 1;
                    dArr2[i][i2] = d == 0.0d ? 1.0d : (((dArr[i][i2] + dArr[i][i3]) * 0.5d) - dArr[i][0]) / d;
                    i2 = i3;
                }
            }
        }
        return dArr2;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static long[][][] m28183c(long[][] jArr) {
        int i;
        double[][] d = m28184d(jArr);
        double[][] b = m28180b(d);
        int a = m28178a(b) + 3;
        long[][][] jArr2 = (long[][][]) Array.newInstance(long.class, new int[]{d.length, a, 2});
        int[] iArr = new int[d.length];
        m28179a(jArr2, 1, jArr, iArr);
        int i2 = 2;
        while (true) {
            i = a - 1;
            if (i2 >= i) {
                break;
            }
            double d2 = Double.MAX_VALUE;
            int i3 = 0;
            for (int i4 = 0; i4 < d.length; i4++) {
                if (iArr[i4] + 1 != d[i4].length) {
                    double d3 = b[i4][iArr[i4]];
                    if (d3 < d2) {
                        i3 = i4;
                        d2 = d3;
                    }
                }
            }
            iArr[i3] = iArr[i3] + 1;
            m28179a(jArr2, i2, jArr, iArr);
            i2++;
        }
        for (long[][] jArr3 : jArr2) {
            int i5 = a - 2;
            jArr3[i][0] = jArr3[i5][0] * 2;
            jArr3[i][1] = jArr3[i5][1] * 2;
        }
        return jArr2;
    }

    /* renamed from: a */
    public void mo24055a(long[][] jArr) {
        ((C9290c) this.f21173g).mo24062a(jArr);
    }

    /* renamed from: a */
    public void mo24052a(float f) {
        this.f21184r = f;
    }

    /* renamed from: a */
    public void mo23813a(long j, long j2, long j3, List<? extends C9224l> list, C9225m[] mVarArr) {
        long a = this.f21179m.mo24605a();
        this.f21183q.mo24050a(this.f21180n, list, mVarArr, this.f21182p);
        if (this.f21186t == 0) {
            this.f21186t = 1;
            this.f21185s = m28177a(a, this.f21182p);
            return;
        }
        int i = this.f21185s;
        this.f21185s = m28177a(a, this.f21182p);
        if (this.f21185s != i) {
            if (!mo24071b(i, a)) {
                Format a2 = mo24066a(i);
                Format a3 = mo24066a(this.f21185s);
                if (a3.f18345X > a2.f18345X && j2 < m28182c(j3)) {
                    this.f21185s = i;
                } else if (a3.f18345X < a2.f18345X && j2 >= this.f21175i) {
                    this.f21185s = i;
                }
            }
            if (this.f21185s != i) {
                this.f21186t = 3;
            }
        }
    }

    /* renamed from: a */
    public int mo24051a(long j, List<? extends C9224l> list) {
        long a = this.f21179m.mo24605a();
        if (!mo24057b(a)) {
            return list.size();
        }
        this.f21187u = a;
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        long b = Util.m29430b(((C9224l) list.get(size - 1)).f20861f - j, this.f21184r);
        long j2 = mo24059j();
        if (b < j2) {
            return size;
        }
        Format a2 = mo24066a(m28177a(a, this.f21181o));
        for (int i = 0; i < size; i++) {
            C9224l lVar = (C9224l) list.get(i);
            Format format = lVar.f20858c;
            if (Util.m29430b(lVar.f20861f - j, this.f21184r) >= j2 && format.f18345X < a2.f18345X) {
                int i2 = format.f18356h0;
                if (i2 != -1 && i2 < 720) {
                    int i3 = format.f18355g0;
                    if (i3 != -1 && i3 < 1280 && i2 < a2.f18356h0) {
                        return i;
                    }
                }
            }
        }
        return size;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo24056a(Format format, int i, float f, long j) {
        return ((long) Math.round(((float) i) * f)) <= j;
    }

    /* renamed from: a */
    private int m28177a(long j, int[] iArr) {
        long a = this.f21173g.mo24060a();
        int i = 0;
        for (int i2 = 0; i2 < this.f21203b; i2++) {
            if (j == Long.MIN_VALUE || !mo24071b(i2, j)) {
                if (mo24056a(mo24066a(i2), iArr[i2], this.f21184r, a)) {
                    return i2;
                }
                i = i2;
            }
        }
        return i;
    }

    /* renamed from: a */
    private static int m28178a(double[][] dArr) {
        int i = 0;
        for (double[] length : dArr) {
            i += length.length;
        }
        return i;
    }

    /* renamed from: a */
    private static void m28179a(long[][][] jArr, int i, long[][] jArr2, int[] iArr) {
        long j = 0;
        for (int i2 = 0; i2 < jArr.length; i2++) {
            jArr[i2][i][1] = jArr2[i2][iArr[i2]];
            j += jArr[i2][i][1];
        }
        for (long[][] jArr3 : jArr) {
            jArr3[i][0] = j;
        }
    }
}
