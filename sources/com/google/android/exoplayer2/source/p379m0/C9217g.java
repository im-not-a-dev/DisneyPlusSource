package com.google.android.exoplayer2.source.p379m0;

import com.google.android.exoplayer2.C8679b0;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.SeekParameters;
import com.google.android.exoplayer2.p362q0.C8879e;
import com.google.android.exoplayer2.p393v0.C9537e;
import com.google.android.exoplayer2.p393v0.C9554k0;
import com.google.android.exoplayer2.p393v0.C9563q;
import com.google.android.exoplayer2.source.C9137e0;
import com.google.android.exoplayer2.source.C9141f0;
import com.google.android.exoplayer2.source.C9143g0;
import com.google.android.exoplayer2.source.C9143g0.C9144a;
import com.google.android.exoplayer2.source.MediaSourceEventListener.C9068a;
import com.google.android.exoplayer2.source.p379m0.C9220h;
import com.google.android.exoplayer2.upstream.C9442a0;
import com.google.android.exoplayer2.upstream.C9442a0.C9444b;
import com.google.android.exoplayer2.upstream.C9442a0.C9445c;
import com.google.android.exoplayer2.upstream.C9442a0.C9448f;
import com.google.android.exoplayer2.upstream.C9491f;
import com.google.android.exoplayer2.upstream.C9524z;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.exoplayer2.source.m0.g */
/* compiled from: ChunkSampleStream */
public class C9217g<T extends C9220h> implements C9141f0, C9143g0, C9444b<C9212d>, C9448f {
    /* access modifiers changed from: private */

    /* renamed from: U */
    public final int[] f20882U;
    /* access modifiers changed from: private */

    /* renamed from: V */
    public final Format[] f20883V;
    /* access modifiers changed from: private */

    /* renamed from: W */
    public final boolean[] f20884W;

    /* renamed from: X */
    private final T f20885X;

    /* renamed from: Y */
    private final C9144a<C9217g<T>> f20886Y;
    /* access modifiers changed from: private */

    /* renamed from: Z */
    public final C9068a f20887Z;

    /* renamed from: a0 */
    private final C9524z f20888a0;

    /* renamed from: b0 */
    private final C9442a0 f20889b0 = new C9442a0("Loader:ChunkSampleStream");

    /* renamed from: c */
    public final int f20890c;

    /* renamed from: c0 */
    private final C9216f f20891c0 = new C9216f();

    /* renamed from: d0 */
    private final ArrayList<C9209a> f20892d0 = new ArrayList<>();

    /* renamed from: e0 */
    private final List<C9209a> f20893e0 = Collections.unmodifiableList(this.f20892d0);

    /* renamed from: f0 */
    private final C9137e0 f20894f0;

    /* renamed from: g0 */
    private final C9137e0[] f20895g0;

    /* renamed from: h0 */
    private final C9211c f20896h0;

    /* renamed from: i0 */
    private Format f20897i0;

    /* renamed from: j0 */
    private C9219b<T> f20898j0;

    /* renamed from: k0 */
    private long f20899k0;
    /* access modifiers changed from: private */

    /* renamed from: l0 */
    public long f20900l0;

    /* renamed from: m0 */
    private int f20901m0;

    /* renamed from: n0 */
    long f20902n0;

    /* renamed from: o0 */
    boolean f20903o0;

    /* renamed from: com.google.android.exoplayer2.source.m0.g$a */
    /* compiled from: ChunkSampleStream */
    public final class C9218a implements C9141f0 {

        /* renamed from: U */
        private final C9137e0 f20904U;

        /* renamed from: V */
        private final int f20905V;

        /* renamed from: W */
        private boolean f20906W;

        /* renamed from: c */
        public final C9217g<T> f20908c;

        public C9218a(C9217g<T> gVar, C9137e0 e0Var, int i) {
            this.f20908c = gVar;
            this.f20904U = e0Var;
            this.f20905V = i;
        }

        /* renamed from: a */
        public int mo23573a(C8679b0 b0Var, C8879e eVar, boolean z) {
            if (C9217g.this.mo23952j()) {
                return -3;
            }
            m27809d();
            C9137e0 e0Var = this.f20904U;
            C9217g gVar = C9217g.this;
            return e0Var.mo23749a(b0Var, eVar, z, gVar.f20903o0, gVar.f20902n0);
        }

        /* renamed from: a */
        public void mo23574a() throws IOException {
        }

        /* renamed from: b */
        public boolean mo23575b() {
            C9217g gVar = C9217g.this;
            return gVar.f20903o0 || (!gVar.mo23952j() && this.f20904U.mo23765j());
        }

        /* renamed from: c */
        public void mo23954c() {
            C9537e.m29301b(C9217g.this.f20884W[this.f20905V]);
            C9217g.this.f20884W[this.f20905V] = false;
        }

        /* renamed from: d */
        public int mo23576d(long j) {
            int i = 0;
            if (C9217g.this.mo23952j()) {
                return 0;
            }
            m27809d();
            if (!C9217g.this.f20903o0 || j <= this.f20904U.mo23761f()) {
                int a = this.f20904U.mo23748a(j, true, true);
                if (a != -1) {
                    i = a;
                }
            } else {
                i = this.f20904U.mo23747a();
            }
            return i;
        }

        /* renamed from: d */
        private void m27809d() {
            if (!this.f20906W) {
                C9217g.this.f20887Z.mo23501a(C9217g.this.f20882U[this.f20905V], C9217g.this.f20883V[this.f20905V], 0, (Object) null, C9217g.this.f20900l0);
                this.f20906W = true;
            }
        }
    }

    /* renamed from: com.google.android.exoplayer2.source.m0.g$b */
    /* compiled from: ChunkSampleStream */
    public interface C9219b<T extends C9220h> {
        /* renamed from: a */
        void mo23632a(C9217g<T> gVar);
    }

    public C9217g(int i, int[] iArr, Format[] formatArr, T t, C9144a<C9217g<T>> aVar, C9491f fVar, long j, C9524z zVar, C9068a aVar2) {
        int i2;
        this.f20890c = i;
        this.f20882U = iArr;
        this.f20883V = formatArr;
        this.f20885X = t;
        this.f20886Y = aVar;
        this.f20887Z = aVar2;
        this.f20888a0 = zVar;
        int i3 = 0;
        if (iArr == null) {
            i2 = 0;
        } else {
            i2 = iArr.length;
        }
        this.f20895g0 = new C9137e0[i2];
        this.f20884W = new boolean[i2];
        int i4 = i2 + 1;
        int[] iArr2 = new int[i4];
        C9137e0[] e0VarArr = new C9137e0[i4];
        this.f20894f0 = new C9137e0(fVar);
        iArr2[0] = i;
        e0VarArr[0] = this.f20894f0;
        while (i3 < i2) {
            C9137e0 e0Var = new C9137e0(fVar);
            this.f20895g0[i3] = e0Var;
            int i5 = i3 + 1;
            e0VarArr[i5] = e0Var;
            iArr2[i5] = iArr[i3];
            i3 = i5;
        }
        this.f20896h0 = new C9211c(iArr2, e0VarArr);
        this.f20899k0 = j;
        this.f20900l0 = j;
    }

    /* renamed from: l */
    private C9209a m27784l() {
        ArrayList<C9209a> arrayList = this.f20892d0;
        return (C9209a) arrayList.get(arrayList.size() - 1);
    }

    /* renamed from: m */
    private void m27785m() {
        int a = m27773a(this.f20894f0.mo23762g(), this.f20901m0 - 1);
        while (true) {
            int i = this.f20901m0;
            if (i <= a) {
                this.f20901m0 = i + 1;
                m27782d(i);
            } else {
                return;
            }
        }
    }

    /* renamed from: g */
    public long mo23549g() {
        if (this.f20903o0) {
            return Long.MIN_VALUE;
        }
        if (mo23952j()) {
            return this.f20899k0;
        }
        long j = this.f20900l0;
        C9209a l = m27784l();
        if (!l.mo23818g()) {
            if (this.f20892d0.size() > 1) {
                ArrayList<C9209a> arrayList = this.f20892d0;
                l = (C9209a) arrayList.get(arrayList.size() - 2);
            } else {
                l = null;
            }
        }
        if (l != null) {
            j = Math.max(j, l.f20862g);
        }
        return Math.max(j, this.f20894f0.mo23761f());
    }

    /* renamed from: h */
    public void mo23563h() {
        this.f20894f0.mo23768m();
        for (C9137e0 m : this.f20895g0) {
            m.mo23768m();
        }
        C9219b<T> bVar = this.f20898j0;
        if (bVar != null) {
            bVar.mo23632a(this);
        }
    }

    /* renamed from: i */
    public T mo23951i() {
        return this.f20885X;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: j */
    public boolean mo23952j() {
        return this.f20899k0 != -9223372036854775807L;
    }

    /* renamed from: k */
    public void mo23953k() {
        mo23950a(null);
    }

    /* renamed from: b */
    public boolean mo23575b() {
        return this.f20903o0 || (!mo23952j() && this.f20894f0.mo23765j());
    }

    /* renamed from: c */
    public long mo23544c() {
        if (mo23952j()) {
            return this.f20899k0;
        }
        return this.f20903o0 ? Long.MIN_VALUE : m27784l().f20862g;
    }

    /* renamed from: d */
    public int mo23576d(long j) {
        int i = 0;
        if (mo23952j()) {
            return 0;
        }
        if (!this.f20903o0 || j <= this.f20894f0.mo23761f()) {
            int a = this.f20894f0.mo23748a(j, true, true);
            if (a != -1) {
                i = a;
            }
        } else {
            i = this.f20894f0.mo23747a();
        }
        m27785m();
        return i;
    }

    /* renamed from: b */
    public boolean mo23543b(long j) {
        long j2;
        List<C9209a> list;
        long j3;
        boolean z = false;
        if (this.f20903o0 || this.f20889b0.mo24461e() || this.f20889b0.mo24460d()) {
            return false;
        }
        boolean j4 = mo23952j();
        if (j4) {
            list = Collections.emptyList();
            j2 = this.f20899k0;
        } else {
            list = this.f20893e0;
            j2 = m27784l().f20862g;
        }
        long j5 = j2;
        long j6 = j;
        this.f20885X.mo23647a(j6, j5, list, this.f20891c0);
        C9216f fVar = this.f20891c0;
        boolean z2 = fVar.f20881b;
        C9212d dVar = fVar.f20880a;
        fVar.mo23942a();
        if (z2) {
            this.f20899k0 = -9223372036854775807L;
            this.f20903o0 = true;
            return true;
        } else if (dVar == null) {
            return false;
        } else {
            if (m27775a(dVar)) {
                C9209a aVar = (C9209a) dVar;
                if (j4) {
                    if (aVar.f20861f == this.f20899k0) {
                        z = true;
                    }
                    if (z) {
                        j3 = 0;
                    } else {
                        j3 = this.f20899k0;
                    }
                    this.f20902n0 = j3;
                    this.f20899k0 = -9223372036854775807L;
                }
                aVar.mo23928a(this.f20896h0);
                this.f20892d0.add(aVar);
            }
            this.f20887Z.mo23512a(dVar.f20856a, dVar.f20857b, this.f20890c, dVar.f20858c, dVar.f20859d, dVar.f20860e, dVar.f20861f, dVar.f20862g, this.f20889b0.mo24455a(dVar, this, this.f20888a0.getMinimumLoadableRetryCount(dVar.f20857b)));
            return true;
        }
    }

    /* renamed from: a */
    public void mo23947a(long j, boolean z) {
        if (!mo23952j()) {
            int d = this.f20894f0.mo23759d();
            this.f20894f0.mo23755b(j, z, true);
            int d2 = this.f20894f0.mo23759d();
            if (d2 > d) {
                long e = this.f20894f0.mo23760e();
                int i = 0;
                while (true) {
                    C9137e0[] e0VarArr = this.f20895g0;
                    if (i >= e0VarArr.length) {
                        break;
                    }
                    e0VarArr[i].mo23755b(e, z, this.f20884W[i]);
                    i++;
                }
            }
            m27774a(d2);
        }
    }

    /* renamed from: c */
    public void mo23545c(long j) {
        if (!this.f20889b0.mo24461e() && !this.f20889b0.mo24460d() && !mo23952j()) {
            int size = this.f20892d0.size();
            int a = this.f20885X.mo23642a(j, this.f20893e0);
            if (size > a) {
                while (true) {
                    if (a >= size) {
                        a = size;
                        break;
                    } else if (!m27779c(a)) {
                        break;
                    } else {
                        a++;
                    }
                }
                if (a != size) {
                    long j2 = m27784l().f20862g;
                    C9209a b = m27777b(a);
                    if (this.f20892d0.isEmpty()) {
                        this.f20899k0 = this.f20900l0;
                    }
                    this.f20903o0 = false;
                    this.f20887Z.mo23500a(this.f20890c, b.f20861f, j2);
                }
            }
        }
    }

    /* renamed from: d */
    private void m27782d(int i) {
        C9209a aVar = (C9209a) this.f20892d0.get(i);
        Format format = aVar.f20858c;
        if (!format.equals(this.f20897i0)) {
            this.f20887Z.mo23501a(this.f20890c, format, aVar.f20859d, aVar.f20860e, aVar.f20861f);
        }
        this.f20897i0 = format;
    }

    /* renamed from: a */
    public C9218a mo23944a(long j, int i) {
        for (int i2 = 0; i2 < this.f20895g0.length; i2++) {
            if (this.f20882U[i2] == i) {
                C9537e.m29301b(!this.f20884W[i2]);
                this.f20884W[i2] = true;
                this.f20895g0[i2].mo23769n();
                this.f20895g0[i2].mo23748a(j, true, true);
                return new C9218a<>(this, this.f20895g0[i2], i2);
            }
        }
        throw new IllegalStateException();
    }

    /* renamed from: c */
    private boolean m27779c(int i) {
        int g;
        C9209a aVar = (C9209a) this.f20892d0.get(i);
        if (this.f20894f0.mo23762g() > aVar.mo23927a(0)) {
            return true;
        }
        int i2 = 0;
        do {
            C9137e0[] e0VarArr = this.f20895g0;
            if (i2 >= e0VarArr.length) {
                return false;
            }
            g = e0VarArr[i2].mo23762g();
            i2++;
        } while (g <= aVar.mo23927a(i2));
        return true;
    }

    /* renamed from: a */
    public long mo23943a(long j, SeekParameters seekParameters) {
        return this.f20885X.mo23643a(j, seekParameters);
    }

    /* renamed from: a */
    public void mo23946a(long j) {
        boolean z;
        C9137e0[] e0VarArr;
        this.f20900l0 = j;
        if (mo23952j()) {
            this.f20899k0 = j;
            return;
        }
        C9209a aVar = null;
        int i = 0;
        while (true) {
            if (i >= this.f20892d0.size()) {
                break;
            }
            C9209a aVar2 = (C9209a) this.f20892d0.get(i);
            int i2 = (aVar2.f20861f > j ? 1 : (aVar2.f20861f == j ? 0 : -1));
            if (i2 == 0 && aVar2.f20849j == -9223372036854775807L) {
                aVar = aVar2;
                break;
            } else if (i2 > 0) {
                break;
            } else {
                i++;
            }
        }
        this.f20894f0.mo23769n();
        if (aVar != null) {
            z = this.f20894f0.mo23756b(aVar.mo23927a(0));
            this.f20902n0 = 0;
        } else {
            z = this.f20894f0.mo23748a(j, true, (j > mo23544c() ? 1 : (j == mo23544c() ? 0 : -1)) < 0) != -1;
            this.f20902n0 = this.f20900l0;
        }
        if (z) {
            this.f20901m0 = m27773a(this.f20894f0.mo23762g(), 0);
            for (C9137e0 e0Var : this.f20895g0) {
                e0Var.mo23769n();
                e0Var.mo23748a(j, true, false);
            }
        } else {
            this.f20899k0 = j;
            this.f20903o0 = false;
            this.f20892d0.clear();
            this.f20901m0 = 0;
            if (this.f20889b0.mo24461e()) {
                this.f20889b0.mo24458b();
            } else {
                this.f20889b0.mo24459c();
                this.f20894f0.mo23768m();
                for (C9137e0 m : this.f20895g0) {
                    m.mo23768m();
                }
            }
        }
    }

    /* renamed from: b */
    private C9209a m27777b(int i) {
        C9209a aVar = (C9209a) this.f20892d0.get(i);
        ArrayList<C9209a> arrayList = this.f20892d0;
        C9554k0.m29409a((List<T>) arrayList, i, arrayList.size());
        this.f20901m0 = Math.max(this.f20901m0, this.f20892d0.size());
        int i2 = 0;
        this.f20894f0.mo23750a(aVar.mo23927a(0));
        while (true) {
            C9137e0[] e0VarArr = this.f20895g0;
            if (i2 >= e0VarArr.length) {
                return aVar;
            }
            C9137e0 e0Var = e0VarArr[i2];
            i2++;
            e0Var.mo23750a(aVar.mo23927a(i2));
        }
    }

    /* renamed from: a */
    public void mo23950a(C9219b<T> bVar) {
        this.f20898j0 = bVar;
        this.f20894f0.mo23754b();
        for (C9137e0 b : this.f20895g0) {
            b.mo23754b();
        }
        this.f20889b0.mo24457a((C9448f) this);
    }

    /* renamed from: a */
    public void mo23574a() throws IOException {
        this.f20889b0.mo23621a();
        if (!this.f20889b0.mo24461e()) {
            this.f20885X.mo23646a();
        }
    }

    /* renamed from: a */
    public int mo23573a(C8679b0 b0Var, C8879e eVar, boolean z) {
        if (mo23952j()) {
            return -3;
        }
        m27785m();
        return this.f20894f0.mo23749a(b0Var, eVar, z, this.f20903o0, this.f20902n0);
    }

    /* renamed from: a */
    public void mo23559a(C9212d dVar, long j, long j2) {
        C9212d dVar2 = dVar;
        long j3 = j;
        long j4 = j2;
        this.f20885X.mo23648a(dVar2);
        this.f20887Z.mo23523b(dVar2.f20856a, dVar.mo23937e(), dVar.mo23936d(), dVar2.f20857b, this.f20890c, dVar2.f20858c, dVar2.f20859d, dVar2.f20860e, dVar2.f20861f, dVar2.f20862g, j3, j4, dVar.mo23934b());
        this.f20886Y.mo23631a(this);
    }

    /* renamed from: a */
    public void mo23560a(C9212d dVar, long j, long j2, boolean z) {
        C9212d dVar2 = dVar;
        this.f20887Z.mo23514a(dVar2.f20856a, dVar.mo23937e(), dVar.mo23936d(), dVar2.f20857b, this.f20890c, dVar2.f20858c, dVar2.f20859d, dVar2.f20860e, dVar2.f20861f, dVar2.f20862g, j, j2, dVar.mo23934b());
        if (!z) {
            this.f20894f0.mo23768m();
            for (C9137e0 m : this.f20895g0) {
                m.mo23768m();
            }
            this.f20886Y.mo23631a(this);
        }
    }

    /* renamed from: a */
    public C9445c mo23555a(C9212d dVar, long j, long j2, IOException iOException, int i) {
        C9212d dVar2 = dVar;
        long b = dVar.mo23934b();
        boolean a = m27775a(dVar);
        int size = this.f20892d0.size() - 1;
        boolean z = b == 0 || !a || !m27779c(size);
        C9445c cVar = null;
        if (this.f20885X.mo23649a(dVar, z, (Exception) iOException, z ? this.f20888a0.getBlacklistDurationMsFor(dVar2.f20857b, j2, iOException, i) : -9223372036854775807L)) {
            if (z) {
                cVar = C9442a0.f21954d;
                if (a) {
                    C9537e.m29301b(m27777b(size) == dVar2);
                    if (this.f20892d0.isEmpty()) {
                        this.f20899k0 = this.f20900l0;
                    }
                }
            } else {
                C9563q.m29500d("ChunkSampleStream", "Ignoring attempt to cancel non-cancelable load.");
            }
        }
        if (cVar == null) {
            long retryDelayMsFor = this.f20888a0.getRetryDelayMsFor(dVar2.f20857b, j2, iOException, i);
            cVar = retryDelayMsFor != -9223372036854775807L ? C9442a0.m28955a(false, retryDelayMsFor) : C9442a0.f21955e;
        }
        C9445c cVar2 = cVar;
        boolean z2 = !cVar2.mo24463a();
        this.f20887Z.mo23515a(dVar2.f20856a, dVar.mo23937e(), dVar.mo23936d(), dVar2.f20857b, this.f20890c, dVar2.f20858c, dVar2.f20859d, dVar2.f20860e, dVar2.f20861f, dVar2.f20862g, j, j2, b, iOException, z2);
        if (z2) {
            this.f20886Y.mo23631a(this);
        }
        return cVar2;
    }

    /* renamed from: a */
    private boolean m27775a(C9212d dVar) {
        return dVar instanceof C9209a;
    }

    /* renamed from: a */
    private void m27774a(int i) {
        int min = Math.min(m27773a(i, 0), this.f20901m0);
        if (min > 0) {
            C9554k0.m29409a((List<T>) this.f20892d0, 0, min);
            this.f20901m0 -= min;
        }
    }

    /* renamed from: a */
    private int m27773a(int i, int i2) {
        do {
            i2++;
            if (i2 >= this.f20892d0.size()) {
                return this.f20892d0.size() - 1;
            }
        } while (((C9209a) this.f20892d0.get(i2)).mo23927a(0) <= i);
        return i2 - 1;
    }
}
