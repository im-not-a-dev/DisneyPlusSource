package com.google.android.exoplayer2.source;

import android.net.Uri;
import android.os.Handler;
import com.google.android.exoplayer2.C8679b0;
import com.google.android.exoplayer2.C8723g0;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.SeekParameters;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.p358i.C8753b;
import com.google.android.exoplayer2.p362q0.C8879e;
import com.google.android.exoplayer2.p366s0.C8909d;
import com.google.android.exoplayer2.p366s0.C8912g;
import com.google.android.exoplayer2.p366s0.C8913h;
import com.google.android.exoplayer2.p366s0.C8914i;
import com.google.android.exoplayer2.p366s0.C8919n;
import com.google.android.exoplayer2.p366s0.C8920o;
import com.google.android.exoplayer2.p366s0.C8920o.C8921a;
import com.google.android.exoplayer2.p366s0.C8920o.C8922b;
import com.google.android.exoplayer2.p366s0.C8924q;
import com.google.android.exoplayer2.p393v0.C9537e;
import com.google.android.exoplayer2.p393v0.C9548j;
import com.google.android.exoplayer2.p393v0.C9554k0;
import com.google.android.exoplayer2.p393v0.C9566t;
import com.google.android.exoplayer2.p393v0.C9572w;
import com.google.android.exoplayer2.source.C9072a0.C9073a;
import com.google.android.exoplayer2.source.C9137e0.C9139b;
import com.google.android.exoplayer2.source.C9264y.C9265a;
import com.google.android.exoplayer2.source.MediaSourceEventListener.C9068a;
import com.google.android.exoplayer2.trackselection.C9311j;
import com.google.android.exoplayer2.upstream.C9442a0;
import com.google.android.exoplayer2.upstream.C9442a0.C9444b;
import com.google.android.exoplayer2.upstream.C9442a0.C9445c;
import com.google.android.exoplayer2.upstream.C9442a0.C9447e;
import com.google.android.exoplayer2.upstream.C9442a0.C9448f;
import com.google.android.exoplayer2.upstream.C9491f;
import com.google.android.exoplayer2.upstream.C9496g0;
import com.google.android.exoplayer2.upstream.C9524z;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.DataSpec;
import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: com.google.android.exoplayer2.source.b0 */
/* compiled from: ProgressiveMediaPeriod */
final class C9075b0 implements C9072a0, C8914i, C9444b<C9076a>, C9448f, C9139b {
    /* access modifiers changed from: private */

    /* renamed from: D0 */
    public static final Format f20179D0 = Format.m24870a("icy", "application/x-icy", Long.MAX_VALUE);

    /* renamed from: A0 */
    private int f20180A0;

    /* renamed from: B0 */
    private boolean f20181B0;

    /* renamed from: C0 */
    private boolean f20182C0;

    /* renamed from: U */
    private final DataSource f20183U;

    /* renamed from: V */
    private final C9524z f20184V;

    /* renamed from: W */
    private final C9068a f20185W;

    /* renamed from: X */
    private final C9078c f20186X;

    /* renamed from: Y */
    private final C9491f f20187Y;
    /* access modifiers changed from: private */

    /* renamed from: Z */
    public final String f20188Z;
    /* access modifiers changed from: private */

    /* renamed from: a0 */
    public final long f20189a0;

    /* renamed from: b0 */
    private final C9442a0 f20190b0 = new C9442a0("Loader:ProgressiveMediaPeriod");

    /* renamed from: c */
    private final Uri f20191c;

    /* renamed from: c0 */
    private final C9077b f20192c0;

    /* renamed from: d0 */
    private final C9548j f20193d0;

    /* renamed from: e0 */
    private final Runnable f20194e0;
    /* access modifiers changed from: private */

    /* renamed from: f0 */
    public final Runnable f20195f0;
    /* access modifiers changed from: private */

    /* renamed from: g0 */
    public final Handler f20196g0;

    /* renamed from: h0 */
    private C9073a f20197h0;

    /* renamed from: i0 */
    private C8920o f20198i0;
    /* access modifiers changed from: private */

    /* renamed from: j0 */
    public C8753b f20199j0;

    /* renamed from: k0 */
    private C9137e0[] f20200k0;

    /* renamed from: l0 */
    private C9081f[] f20201l0;

    /* renamed from: m0 */
    private boolean f20202m0;

    /* renamed from: n0 */
    private boolean f20203n0;

    /* renamed from: o0 */
    private C9079d f20204o0;

    /* renamed from: p0 */
    private boolean f20205p0;

    /* renamed from: q0 */
    private int f20206q0;

    /* renamed from: r0 */
    private boolean f20207r0;

    /* renamed from: s0 */
    private boolean f20208s0;

    /* renamed from: t0 */
    private boolean f20209t0;

    /* renamed from: u0 */
    private int f20210u0;

    /* renamed from: v0 */
    private long f20211v0;

    /* renamed from: w0 */
    private long f20212w0;

    /* renamed from: x0 */
    private long f20213x0;

    /* renamed from: y0 */
    private long f20214y0;

    /* renamed from: z0 */
    private boolean f20215z0;

    /* renamed from: com.google.android.exoplayer2.source.b0$a */
    /* compiled from: ProgressiveMediaPeriod */
    final class C9076a implements C9447e, C9265a {

        /* renamed from: a */
        private final Uri f20216a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public final C9496g0 f20217b;

        /* renamed from: c */
        private final C9077b f20218c;

        /* renamed from: d */
        private final C8914i f20219d;

        /* renamed from: e */
        private final C9548j f20220e;

        /* renamed from: f */
        private final C8919n f20221f = new C8919n();

        /* renamed from: g */
        private volatile boolean f20222g;

        /* renamed from: h */
        private boolean f20223h = true;
        /* access modifiers changed from: private */

        /* renamed from: i */
        public long f20224i;
        /* access modifiers changed from: private */

        /* renamed from: j */
        public DataSpec f20225j = m27030a(0);
        /* access modifiers changed from: private */

        /* renamed from: k */
        public long f20226k = -1;

        /* renamed from: l */
        private C8924q f20227l;

        /* renamed from: m */
        private boolean f20228m;

        public C9076a(Uri uri, DataSource dataSource, C9077b bVar, C8914i iVar, C9548j jVar) {
            this.f20216a = uri;
            this.f20217b = new C9496g0(dataSource);
            this.f20218c = bVar;
            this.f20219d = iVar;
            this.f20220e = jVar;
        }

        public void load() throws IOException, InterruptedException {
            int i = 0;
            while (i == 0 && !this.f20222g) {
                C8909d dVar = null;
                try {
                    long j = this.f20221f.f19163a;
                    this.f20225j = m27030a(j);
                    this.f20226k = this.f20217b.open(this.f20225j);
                    if (this.f20226k != -1) {
                        this.f20226k += j;
                    }
                    Uri uri = this.f20217b.getUri();
                    C9537e.m29296a(uri);
                    Uri uri2 = uri;
                    C9075b0.this.f20199j0 = C8753b.m25387a(this.f20217b.mo9243a());
                    DataSource dataSource = this.f20217b;
                    if (!(C9075b0.this.f20199j0 == null || C9075b0.this.f20199j0.f18593Y == -1)) {
                        dataSource = new C9264y(this.f20217b, C9075b0.this.f20199j0.f18593Y, this);
                        this.f20227l = C9075b0.this.mo23562b();
                        this.f20227l.mo23304a(C9075b0.f20179D0);
                    }
                    C8909d dVar2 = new C8909d(dataSource, j, this.f20226k);
                    try {
                        C8912g a = this.f20218c.mo23570a(dVar2, this.f20219d, uri2);
                        if (this.f20223h) {
                            a.mo23308a(j, this.f20224i);
                            this.f20223h = false;
                        }
                        while (i == 0 && !this.f20222g) {
                            this.f20220e.mo24637a();
                            i = a.mo23306a((C8913h) dVar2, this.f20221f);
                            if (dVar2.getPosition() > C9075b0.this.f20189a0 + j) {
                                j = dVar2.getPosition();
                                this.f20220e.mo24638b();
                                C9075b0.this.f20196g0.post(C9075b0.this.f20195f0);
                            }
                        }
                        if (i == 1) {
                            i = 0;
                        } else {
                            this.f20221f.f19163a = dVar2.getPosition();
                        }
                        C9554k0.m29405a((DataSource) this.f20217b);
                    } catch (Throwable th) {
                        th = th;
                        dVar = dVar2;
                        if (!(i == 1 || dVar == null)) {
                            this.f20221f.f19163a = dVar.getPosition();
                        }
                        C9554k0.m29405a((DataSource) this.f20217b);
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    this.f20221f.f19163a = dVar.getPosition();
                    C9554k0.m29405a((DataSource) this.f20217b);
                    throw th;
                }
            }
        }

        /* renamed from: a */
        public void mo23567a() {
            this.f20222g = true;
        }

        /* renamed from: a */
        public void mo23568a(C9572w wVar) {
            long j;
            if (!this.f20228m) {
                j = this.f20224i;
            } else {
                j = Math.max(C9075b0.this.m26994n(), this.f20224i);
            }
            long j2 = j;
            int a = wVar.mo24679a();
            C8924q qVar = this.f20227l;
            C9537e.m29296a(qVar);
            C8924q qVar2 = qVar;
            qVar2.mo23305a(wVar, a);
            qVar2.mo23303a(j2, 1, a, 0, null);
            this.f20228m = true;
        }

        /* renamed from: a */
        private DataSpec m27030a(long j) {
            DataSpec dataSpec = new DataSpec(this.f20216a, j, -1, C9075b0.this.f20188Z, 14);
            return dataSpec;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void m27032a(long j, long j2) {
            this.f20221f.f19163a = j;
            this.f20224i = j2;
            this.f20223h = true;
            this.f20228m = false;
        }
    }

    /* renamed from: com.google.android.exoplayer2.source.b0$b */
    /* compiled from: ProgressiveMediaPeriod */
    private static final class C9077b {

        /* renamed from: a */
        private final C8912g[] f20230a;

        /* renamed from: b */
        private C8912g f20231b;

        public C9077b(C8912g[] gVarArr) {
            this.f20230a = gVarArr;
        }

        /* renamed from: a */
        public C8912g mo23570a(C8913h hVar, C8914i iVar, Uri uri) throws IOException, InterruptedException {
            C8912g gVar = this.f20231b;
            if (gVar != null) {
                return gVar;
            }
            C8912g[] gVarArr = this.f20230a;
            int i = 0;
            if (gVarArr.length == 1) {
                this.f20231b = gVarArr[0];
            } else {
                int length = gVarArr.length;
                while (true) {
                    if (i >= length) {
                        break;
                    }
                    C8912g gVar2 = gVarArr[i];
                    try {
                        if (gVar2.mo23310a(hVar)) {
                            this.f20231b = gVar2;
                            hVar.mo23297c();
                            break;
                        }
                        hVar.mo23297c();
                        i++;
                    } catch (EOFException unused) {
                    } catch (Throwable th) {
                        hVar.mo23297c();
                        throw th;
                    }
                }
                if (this.f20231b == null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("None of the available extractors (");
                    sb.append(C9554k0.m29433b((Object[]) this.f20230a));
                    sb.append(") could read the stream.");
                    throw new C9202k0(sb.toString(), uri);
                }
            }
            this.f20231b.mo23309a(iVar);
            return this.f20231b;
        }

        /* renamed from: a */
        public void mo23571a() {
            C8912g gVar = this.f20231b;
            if (gVar != null) {
                gVar.mo23307a();
                this.f20231b = null;
            }
        }
    }

    /* renamed from: com.google.android.exoplayer2.source.b0$c */
    /* compiled from: ProgressiveMediaPeriod */
    interface C9078c {
        /* renamed from: a */
        void mo23572a(long j, boolean z);
    }

    /* renamed from: com.google.android.exoplayer2.source.b0$d */
    /* compiled from: ProgressiveMediaPeriod */
    private static final class C9079d {

        /* renamed from: a */
        public final C8920o f20232a;

        /* renamed from: b */
        public final TrackGroupArray f20233b;

        /* renamed from: c */
        public final boolean[] f20234c;

        /* renamed from: d */
        public final boolean[] f20235d;

        /* renamed from: e */
        public final boolean[] f20236e;

        public C9079d(C8920o oVar, TrackGroupArray trackGroupArray, boolean[] zArr) {
            this.f20232a = oVar;
            this.f20233b = trackGroupArray;
            this.f20234c = zArr;
            int i = trackGroupArray.f20170c;
            this.f20235d = new boolean[i];
            this.f20236e = new boolean[i];
        }
    }

    /* renamed from: com.google.android.exoplayer2.source.b0$e */
    /* compiled from: ProgressiveMediaPeriod */
    private final class C9080e implements C9141f0 {
        /* access modifiers changed from: private */

        /* renamed from: c */
        public final int f20238c;

        public C9080e(int i) {
            this.f20238c = i;
        }

        /* renamed from: b */
        public boolean mo23575b() {
            return C9075b0.this.mo23561a(this.f20238c);
        }

        /* renamed from: d */
        public int mo23576d(long j) {
            return C9075b0.this.mo23552a(this.f20238c, j);
        }

        /* renamed from: a */
        public void mo23574a() throws IOException {
            C9075b0.this.mo23565j();
        }

        /* renamed from: a */
        public int mo23573a(C8679b0 b0Var, C8879e eVar, boolean z) {
            return C9075b0.this.mo23553a(this.f20238c, b0Var, eVar, z);
        }
    }

    /* renamed from: com.google.android.exoplayer2.source.b0$f */
    /* compiled from: ProgressiveMediaPeriod */
    private static final class C9081f {

        /* renamed from: a */
        public final int f20239a;

        /* renamed from: b */
        public final boolean f20240b;

        public C9081f(int i, boolean z) {
            this.f20239a = i;
            this.f20240b = z;
        }

        public boolean equals(Object obj) {
            boolean z = true;
            if (this == obj) {
                return true;
            }
            if (obj == null || C9081f.class != obj.getClass()) {
                return false;
            }
            C9081f fVar = (C9081f) obj;
            if (!(this.f20239a == fVar.f20239a && this.f20240b == fVar.f20240b)) {
                z = false;
            }
            return z;
        }

        public int hashCode() {
            return (this.f20239a * 31) + (this.f20240b ? 1 : 0);
        }
    }

    public C9075b0(Uri uri, DataSource dataSource, C8912g[] gVarArr, C9524z zVar, C9068a aVar, C9078c cVar, C9491f fVar, String str, int i) {
        this.f20191c = uri;
        this.f20183U = dataSource;
        this.f20184V = zVar;
        this.f20185W = aVar;
        this.f20186X = cVar;
        this.f20187Y = fVar;
        this.f20188Z = str;
        this.f20189a0 = (long) i;
        this.f20192c0 = new C9077b(gVarArr);
        this.f20193d0 = new C9548j();
        this.f20194e0 = new C9203l(this);
        this.f20195f0 = new C9201k(this);
        this.f20196g0 = new Handler();
        this.f20201l0 = new C9081f[0];
        this.f20200k0 = new C9137e0[0];
        this.f20214y0 = -9223372036854775807L;
        this.f20212w0 = -1;
        this.f20211v0 = -9223372036854775807L;
        this.f20206q0 = 1;
        aVar.mo23499a();
    }

    /* renamed from: m */
    private int m26993m() {
        int i = 0;
        for (C9137e0 i2 : this.f20200k0) {
            i += i2.mo23764i();
        }
        return i;
    }

    /* access modifiers changed from: private */
    /* renamed from: n */
    public long m26994n() {
        long j = Long.MIN_VALUE;
        for (C9137e0 f : this.f20200k0) {
            j = Math.max(j, f.mo23761f());
        }
        return j;
    }

    /* renamed from: o */
    private C9079d m26995o() {
        C9079d dVar = this.f20204o0;
        C9537e.m29296a(dVar);
        return dVar;
    }

    /* renamed from: p */
    private boolean m26996p() {
        return this.f20214y0 != -9223372036854775807L;
    }

    /* access modifiers changed from: private */
    /* renamed from: q */
    public void m26997q() {
        Metadata metadata;
        C8920o oVar = this.f20198i0;
        if (!this.f20182C0 && !this.f20203n0 && this.f20202m0 && oVar != null) {
            C9137e0[] e0VarArr = this.f20200k0;
            int length = e0VarArr.length;
            int i = 0;
            while (i < length) {
                if (e0VarArr[i].mo23763h() != null) {
                    i++;
                } else {
                    return;
                }
            }
            this.f20193d0.mo24638b();
            int length2 = this.f20200k0.length;
            C9199j0[] j0VarArr = new C9199j0[length2];
            boolean[] zArr = new boolean[length2];
            this.f20211v0 = oVar.mo23280d();
            for (int i2 = 0; i2 < length2; i2++) {
                Format h = this.f20200k0[i2].mo23763h();
                String str = h.f18349b0;
                boolean j = C9566t.m29517j(str);
                boolean z = j || C9566t.m29519l(str);
                zArr[i2] = z;
                this.f20205p0 = z | this.f20205p0;
                C8753b bVar = this.f20199j0;
                if (bVar != null) {
                    if (j || this.f20201l0[i2].f20240b) {
                        Metadata metadata2 = h.f18347Z;
                        if (metadata2 == null) {
                            metadata = new Metadata(bVar);
                        } else {
                            metadata = metadata2.mo22865a(bVar);
                        }
                        h = h.mo22603a(metadata);
                    }
                    if (j && h.f18345X == -1) {
                        int i3 = bVar.f18594c;
                        if (i3 != -1) {
                            h = h.mo22599a(i3);
                        }
                    }
                }
                j0VarArr[i2] = new C9199j0(h);
            }
            this.f20206q0 = (this.f20212w0 == -1 && oVar.mo23280d() == -9223372036854775807L) ? 7 : 1;
            this.f20204o0 = new C9079d(oVar, new TrackGroupArray(j0VarArr), zArr);
            this.f20203n0 = true;
            this.f20186X.mo23572a(this.f20211v0, oVar.mo23279c());
            C9073a aVar = this.f20197h0;
            C9537e.m29296a(aVar);
            aVar.mo23550a(this);
        }
    }

    /* renamed from: r */
    private void m26998r() {
        C9076a aVar = new C9076a(this.f20191c, this.f20183U, this.f20192c0, this, this.f20193d0);
        if (this.f20203n0) {
            C8920o oVar = m26995o().f20232a;
            C9537e.m29301b(m26996p());
            long j = this.f20211v0;
            if (j == -9223372036854775807L || this.f20214y0 <= j) {
                aVar.m27032a(oVar.mo23277b(this.f20214y0).f19164a.f19170b, this.f20214y0);
                this.f20214y0 = -9223372036854775807L;
            } else {
                this.f20181B0 = true;
                this.f20214y0 = -9223372036854775807L;
                return;
            }
        }
        this.f20180A0 = m26993m();
        this.f20185W.mo23512a(aVar.f20225j, 1, -1, (Format) null, 0, (Object) null, aVar.f20224i, this.f20211v0, this.f20190b0.mo24455a(aVar, this, this.f20184V.getMinimumLoadableRetryCount(this.f20206q0)));
    }

    /* renamed from: s */
    private boolean m26999s() {
        return this.f20208s0 || m26996p();
    }

    /* renamed from: c */
    public void mo23545c(long j) {
    }

    /* renamed from: g */
    public long mo23549g() {
        long j;
        boolean[] zArr = m26995o().f20234c;
        if (this.f20181B0) {
            return Long.MIN_VALUE;
        }
        if (m26996p()) {
            return this.f20214y0;
        }
        if (this.f20205p0) {
            int length = this.f20200k0.length;
            j = Long.MAX_VALUE;
            for (int i = 0; i < length; i++) {
                if (zArr[i] && !this.f20200k0[i].mo23766k()) {
                    j = Math.min(j, this.f20200k0[i].mo23761f());
                }
            }
        } else {
            j = Long.MAX_VALUE;
        }
        if (j == Long.MAX_VALUE) {
            j = m26994n();
        }
        if (j == Long.MIN_VALUE) {
            j = this.f20213x0;
        }
        return j;
    }

    /* renamed from: h */
    public void mo23563h() {
        for (C9137e0 m : this.f20200k0) {
            m.mo23768m();
        }
        this.f20192c0.mo23571a();
    }

    /* renamed from: i */
    public /* synthetic */ void mo23564i() {
        if (!this.f20182C0) {
            C9073a aVar = this.f20197h0;
            C9537e.m29296a(aVar);
            aVar.mo23631a(this);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: j */
    public void mo23565j() throws IOException {
        this.f20190b0.mo24456a(this.f20184V.getMinimumLoadableRetryCount(this.f20206q0));
    }

    /* renamed from: k */
    public void mo23566k() {
        if (this.f20203n0) {
            for (C9137e0 b : this.f20200k0) {
                b.mo23754b();
            }
        }
        this.f20190b0.mo24457a((C9448f) this);
        this.f20196g0.removeCallbacksAndMessages(null);
        this.f20197h0 = null;
        this.f20182C0 = true;
        this.f20185W.mo23518b();
    }

    /* renamed from: b */
    public boolean mo23543b(long j) {
        if (this.f20181B0 || this.f20190b0.mo24460d() || this.f20215z0 || (this.f20203n0 && this.f20210u0 == 0)) {
            return false;
        }
        boolean c = this.f20193d0.mo24639c();
        if (!this.f20190b0.mo24461e()) {
            m26998r();
            c = true;
        }
        return c;
    }

    /* renamed from: c */
    public long mo23544c() {
        if (this.f20210u0 == 0) {
            return Long.MIN_VALUE;
        }
        return mo23549g();
    }

    /* renamed from: d */
    public void mo23546d() throws IOException {
        mo23565j();
        if (this.f20181B0 && !this.f20203n0) {
            throw new C8723g0("Loading finished before preparation is complete.");
        }
    }

    /* renamed from: e */
    public long mo23547e() {
        if (!this.f20209t0) {
            this.f20185W.mo23525c();
            this.f20209t0 = true;
        }
        if (!this.f20208s0 || (!this.f20181B0 && m26993m() <= this.f20180A0)) {
            return -9223372036854775807L;
        }
        this.f20208s0 = false;
        return this.f20213x0;
    }

    /* renamed from: f */
    public TrackGroupArray mo23548f() {
        return m26995o().f20233b;
    }

    /* renamed from: c */
    private void m26987c(int i) {
        boolean[] zArr = m26995o().f20234c;
        if (this.f20215z0 && zArr[i] && !this.f20200k0[i].mo23765j()) {
            this.f20214y0 = 0;
            this.f20215z0 = false;
            this.f20208s0 = true;
            this.f20213x0 = 0;
            this.f20180A0 = 0;
            for (C9137e0 m : this.f20200k0) {
                m.mo23768m();
            }
            C9073a aVar = this.f20197h0;
            C9537e.m29296a(aVar);
            aVar.mo23631a(this);
        }
    }

    /* renamed from: a */
    public void mo23542a(C9073a aVar, long j) {
        this.f20197h0 = aVar;
        this.f20193d0.mo24639c();
        m26998r();
    }

    /* renamed from: b */
    private void m26985b(int i) {
        C9079d o = m26995o();
        boolean[] zArr = o.f20236e;
        if (!zArr[i]) {
            Format a = o.f20233b.mo23531a(i).mo23902a(0);
            this.f20185W.mo23501a(C9566t.m29513f(a.f18349b0), a, 0, (Object) null, this.f20213x0);
            zArr[i] = true;
        }
    }

    /* renamed from: a */
    public long mo23540a(C9311j[] jVarArr, boolean[] zArr, C9141f0[] f0VarArr, boolean[] zArr2, long j) {
        C9079d o = m26995o();
        TrackGroupArray trackGroupArray = o.f20233b;
        boolean[] zArr3 = o.f20235d;
        int i = this.f20210u0;
        int i2 = 0;
        for (int i3 = 0; i3 < jVarArr.length; i3++) {
            if (f0VarArr[i3] != null && (jVarArr[i3] == null || !zArr[i3])) {
                int a = f0VarArr[i3].f20238c;
                C9537e.m29301b(zArr3[a]);
                this.f20210u0--;
                zArr3[a] = false;
                f0VarArr[i3] = null;
            }
        }
        boolean z = !this.f20207r0 ? j != 0 : i == 0;
        for (int i4 = 0; i4 < jVarArr.length; i4++) {
            if (f0VarArr[i4] == null && jVarArr[i4] != null) {
                C9311j jVar = jVarArr[i4];
                C9537e.m29301b(jVar.length() == 1);
                C9537e.m29301b(jVar.mo24070b(0) == 0);
                int a2 = trackGroupArray.mo23530a(jVar.mo24067a());
                C9537e.m29301b(!zArr3[a2]);
                this.f20210u0++;
                zArr3[a2] = true;
                f0VarArr[i4] = new C9080e(a2);
                zArr2[i4] = true;
                if (!z) {
                    C9137e0 e0Var = this.f20200k0[a2];
                    e0Var.mo23769n();
                    z = e0Var.mo23748a(j, true, true) == -1 && e0Var.mo23762g() != 0;
                }
            }
        }
        if (this.f20210u0 == 0) {
            this.f20215z0 = false;
            this.f20208s0 = false;
            if (this.f20190b0.mo24461e()) {
                C9137e0[] e0VarArr = this.f20200k0;
                int length = e0VarArr.length;
                while (i2 < length) {
                    e0VarArr[i2].mo23754b();
                    i2++;
                }
                this.f20190b0.mo24458b();
            } else {
                C9137e0[] e0VarArr2 = this.f20200k0;
                int length2 = e0VarArr2.length;
                while (i2 < length2) {
                    e0VarArr2[i2].mo23768m();
                    i2++;
                }
            }
        } else if (z) {
            j = mo23538a(j);
            while (i2 < f0VarArr.length) {
                if (f0VarArr[i2] != null) {
                    zArr2[i2] = true;
                }
                i2++;
            }
        }
        this.f20207r0 = true;
        return j;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public C8924q mo23562b() {
        return m26980a(new C9081f(0, true));
    }

    /* renamed from: a */
    public void mo23541a(long j, boolean z) {
        if (!m26996p()) {
            boolean[] zArr = m26995o().f20235d;
            int length = this.f20200k0.length;
            for (int i = 0; i < length; i++) {
                this.f20200k0[i].mo23755b(j, z, zArr[i]);
            }
        }
    }

    /* renamed from: a */
    public long mo23538a(long j) {
        C9079d o = m26995o();
        C8920o oVar = o.f20232a;
        boolean[] zArr = o.f20234c;
        if (!oVar.mo23279c()) {
            j = 0;
        }
        this.f20208s0 = false;
        this.f20213x0 = j;
        if (m26996p()) {
            this.f20214y0 = j;
            return j;
        } else if (this.f20206q0 != 7 && m26983a(zArr, j)) {
            return j;
        } else {
            this.f20215z0 = false;
            this.f20214y0 = j;
            this.f20181B0 = false;
            if (this.f20190b0.mo24461e()) {
                this.f20190b0.mo24458b();
            } else {
                this.f20190b0.mo24459c();
                for (C9137e0 m : this.f20200k0) {
                    m.mo23768m();
                }
            }
            return j;
        }
    }

    /* renamed from: a */
    public long mo23539a(long j, SeekParameters seekParameters) {
        C8920o oVar = m26995o().f20232a;
        if (!oVar.mo23279c()) {
            return 0;
        }
        C8921a b = oVar.mo23277b(j);
        return C9554k0.m29390a(j, seekParameters, b.f19164a.f19169a, b.f19165b.f19169a);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo23561a(int i) {
        return !m26999s() && (this.f20181B0 || this.f20200k0[i].mo23765j());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public int mo23553a(int i, C8679b0 b0Var, C8879e eVar, boolean z) {
        if (m26999s()) {
            return -3;
        }
        m26985b(i);
        int a = this.f20200k0[i].mo23749a(b0Var, eVar, z, this.f20181B0, this.f20213x0);
        if (a == -3) {
            m26987c(i);
        }
        return a;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public int mo23552a(int i, long j) {
        int i2 = 0;
        if (m26999s()) {
            return 0;
        }
        m26985b(i);
        C9137e0 e0Var = this.f20200k0[i];
        if (!this.f20181B0 || j <= e0Var.mo23761f()) {
            int a = e0Var.mo23748a(j, true, true);
            if (a != -1) {
                i2 = a;
            }
        } else {
            i2 = e0Var.mo23747a();
        }
        if (i2 == 0) {
            m26987c(i);
        }
        return i2;
    }

    /* renamed from: a */
    public void mo23559a(C9076a aVar, long j, long j2) {
        if (this.f20211v0 == -9223372036854775807L) {
            C8920o oVar = this.f20198i0;
            if (oVar != null) {
                boolean c = oVar.mo23279c();
                long n = m26994n();
                this.f20211v0 = n == Long.MIN_VALUE ? 0 : n + 10000;
                this.f20186X.mo23572a(this.f20211v0, c);
            }
        }
        this.f20185W.mo23523b(aVar.f20225j, aVar.f20217b.mo24563c(), aVar.f20217b.mo24564d(), 1, -1, null, 0, null, aVar.f20224i, this.f20211v0, j, j2, aVar.f20217b.mo24562b());
        m26981a(aVar);
        this.f20181B0 = true;
        C9073a aVar2 = this.f20197h0;
        C9537e.m29296a(aVar2);
        aVar2.mo23631a(this);
    }

    /* renamed from: a */
    public void mo23560a(C9076a aVar, long j, long j2, boolean z) {
        this.f20185W.mo23514a(aVar.f20225j, aVar.f20217b.mo24563c(), aVar.f20217b.mo24564d(), 1, -1, null, 0, null, aVar.f20224i, this.f20211v0, j, j2, aVar.f20217b.mo24562b());
        if (!z) {
            m26981a(aVar);
            for (C9137e0 m : this.f20200k0) {
                m.mo23768m();
            }
            if (this.f20210u0 > 0) {
                C9073a aVar2 = this.f20197h0;
                C9537e.m29296a(aVar2);
                aVar2.mo23631a(this);
            }
        }
    }

    /* renamed from: a */
    public C9445c mo23555a(C9076a aVar, long j, long j2, IOException iOException, int i) {
        C9445c cVar;
        boolean z;
        C9076a aVar2;
        m26981a(aVar);
        long retryDelayMsFor = this.f20184V.getRetryDelayMsFor(this.f20206q0, j2, iOException, i);
        if (retryDelayMsFor == -9223372036854775807L) {
            cVar = C9442a0.f21955e;
            C9076a aVar3 = aVar;
        } else {
            int m = m26993m();
            if (m > this.f20180A0) {
                aVar2 = aVar;
                z = true;
            } else {
                aVar2 = aVar;
                z = false;
            }
            cVar = m26982a(aVar2, m) ? C9442a0.m28955a(z, retryDelayMsFor) : C9442a0.f21954d;
        }
        this.f20185W.mo23515a(aVar.f20225j, aVar.f20217b.mo24563c(), aVar.f20217b.mo24564d(), 1, -1, null, 0, null, aVar.f20224i, this.f20211v0, j, j2, aVar.f20217b.mo24562b(), iOException, !cVar.mo24463a());
        return cVar;
    }

    /* renamed from: a */
    public C8924q mo23311a(int i, int i2) {
        return m26980a(new C9081f(i, false));
    }

    /* renamed from: a */
    public void mo23312a() {
        this.f20202m0 = true;
        this.f20196g0.post(this.f20194e0);
    }

    /* renamed from: a */
    public void mo23313a(C8920o oVar) {
        if (this.f20199j0 != null) {
            oVar = new C8922b(-9223372036854775807L);
        }
        this.f20198i0 = oVar;
        this.f20196g0.post(this.f20194e0);
    }

    /* renamed from: a */
    public void mo23556a(Format format) {
        this.f20196g0.post(this.f20194e0);
    }

    /* renamed from: a */
    private C8924q m26980a(C9081f fVar) {
        int length = this.f20200k0.length;
        for (int i = 0; i < length; i++) {
            if (fVar.equals(this.f20201l0[i])) {
                return this.f20200k0[i];
            }
        }
        C9137e0 e0Var = new C9137e0(this.f20187Y);
        e0Var.mo23752a((C9139b) this);
        int i2 = length + 1;
        C9081f[] fVarArr = (C9081f[]) Arrays.copyOf(this.f20201l0, i2);
        fVarArr[length] = fVar;
        C9554k0.m29419a((T[]) fVarArr);
        this.f20201l0 = fVarArr;
        C9137e0[] e0VarArr = (C9137e0[]) Arrays.copyOf(this.f20200k0, i2);
        e0VarArr[length] = e0Var;
        C9554k0.m29419a((T[]) e0VarArr);
        this.f20200k0 = e0VarArr;
        return e0Var;
    }

    /* renamed from: a */
    private void m26981a(C9076a aVar) {
        if (this.f20212w0 == -1) {
            this.f20212w0 = aVar.f20226k;
        }
    }

    /* renamed from: a */
    private boolean m26982a(C9076a aVar, int i) {
        if (this.f20212w0 == -1) {
            C8920o oVar = this.f20198i0;
            if (oVar == null || oVar.mo23280d() == -9223372036854775807L) {
                if (!this.f20203n0 || m26999s()) {
                    this.f20208s0 = this.f20203n0;
                    this.f20213x0 = 0;
                    this.f20180A0 = 0;
                    for (C9137e0 m : this.f20200k0) {
                        m.mo23768m();
                    }
                    aVar.m27032a(0, 0);
                    return true;
                }
                this.f20215z0 = true;
                return false;
            }
        }
        this.f20180A0 = i;
        return true;
    }

    /* renamed from: a */
    private boolean m26983a(boolean[] zArr, long j) {
        int length = this.f20200k0.length;
        int i = 0;
        while (true) {
            boolean z = true;
            if (i >= length) {
                return true;
            }
            C9137e0 e0Var = this.f20200k0[i];
            e0Var.mo23769n();
            if (e0Var.mo23748a(j, true, false) == -1) {
                z = false;
            }
            if (z || (!zArr[i] && this.f20205p0)) {
                i++;
            }
        }
        return false;
    }
}
