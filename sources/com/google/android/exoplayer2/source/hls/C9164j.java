package com.google.android.exoplayer2.source.hls;

import android.net.Uri;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.Metadata.C8737b;
import com.google.android.exoplayer2.metadata.p359j.C8770h;
import com.google.android.exoplayer2.metadata.p359j.C8778l;
import com.google.android.exoplayer2.p366s0.C8909d;
import com.google.android.exoplayer2.p366s0.C8912g;
import com.google.android.exoplayer2.p366s0.C8913h;
import com.google.android.exoplayer2.p366s0.C8914i;
import com.google.android.exoplayer2.p366s0.C8919n;
import com.google.android.exoplayer2.p393v0.C9545h0;
import com.google.android.exoplayer2.p393v0.C9549j0;
import com.google.android.exoplayer2.p393v0.C9554k0;
import com.google.android.exoplayer2.p393v0.C9572w;
import com.google.android.exoplayer2.source.hls.HlsExtractorFactory.C9148a;
import com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist;
import com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist.C9176a;
import com.google.android.exoplayer2.source.p379m0.C9224l;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.DataSpec;
import java.io.EOFException;
import java.io.IOException;
import java.math.BigInteger;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.google.android.exoplayer2.source.hls.j */
/* compiled from: HlsMediaChunk */
final class C9164j extends C9224l {

    /* renamed from: H */
    private static final AtomicInteger f20589H = new AtomicInteger();

    /* renamed from: A */
    private C8912g f20590A;

    /* renamed from: B */
    private boolean f20591B;

    /* renamed from: C */
    private C9167m f20592C;

    /* renamed from: D */
    private int f20593D;

    /* renamed from: E */
    private boolean f20594E;

    /* renamed from: F */
    private volatile boolean f20595F;

    /* renamed from: G */
    private boolean f20596G;

    /* renamed from: j */
    public final int f20597j;

    /* renamed from: k */
    public final int f20598k;

    /* renamed from: l */
    public final Uri f20599l;

    /* renamed from: m */
    private final DataSource f20600m;

    /* renamed from: n */
    private final DataSpec f20601n;

    /* renamed from: o */
    private final boolean f20602o;

    /* renamed from: p */
    private final boolean f20603p;

    /* renamed from: q */
    private final C9545h0 f20604q;

    /* renamed from: r */
    private final boolean f20605r;

    /* renamed from: s */
    private final HlsExtractorFactory f20606s;

    /* renamed from: t */
    private final List<Format> f20607t;

    /* renamed from: u */
    private final DrmInitData f20608u;

    /* renamed from: v */
    private final C8912g f20609v;

    /* renamed from: w */
    private final C8770h f20610w;

    /* renamed from: x */
    private final C9572w f20611x;

    /* renamed from: y */
    private final boolean f20612y;

    /* renamed from: z */
    private final boolean f20613z;

    private C9164j(HlsExtractorFactory hlsExtractorFactory, DataSource dataSource, DataSpec dataSpec, Format format, boolean z, DataSource dataSource2, DataSpec dataSpec2, boolean z2, Uri uri, List<Format> list, int i, Object obj, long j, long j2, long j3, int i2, boolean z3, boolean z4, C9545h0 h0Var, DrmInitData drmInitData, C8912g gVar, C8770h hVar, C9572w wVar, boolean z5) {
        DataSpec dataSpec3 = dataSpec2;
        super(dataSource, dataSpec, format, i, obj, j, j2, j3);
        this.f20612y = z;
        this.f20598k = i2;
        this.f20600m = dataSource2;
        this.f20601n = dataSpec3;
        this.f20613z = z2;
        this.f20599l = uri;
        this.f20602o = z4;
        this.f20604q = h0Var;
        this.f20603p = z3;
        this.f20606s = hlsExtractorFactory;
        this.f20607t = list;
        this.f20608u = drmInitData;
        this.f20609v = gVar;
        this.f20610w = hVar;
        this.f20611x = wVar;
        this.f20605r = z5;
        this.f20594E = dataSpec3 != null;
        this.f20597j = f20589H.getAndIncrement();
    }

    /* renamed from: a */
    public static C9164j m27484a(HlsExtractorFactory hlsExtractorFactory, DataSource dataSource, Format format, long j, HlsMediaPlaylist hlsMediaPlaylist, int i, Uri uri, List<Format> list, int i2, Object obj, boolean z, C9175p pVar, C9164j jVar, byte[] bArr, byte[] bArr2) {
        DataSource dataSource2;
        boolean z2;
        DataSpec dataSpec;
        boolean z3;
        C9572w wVar;
        C8770h hVar;
        C8912g gVar;
        DataSource dataSource3 = dataSource;
        HlsMediaPlaylist hlsMediaPlaylist2 = hlsMediaPlaylist;
        int i3 = i;
        C9164j jVar2 = jVar;
        byte[] bArr3 = bArr;
        byte[] bArr4 = bArr2;
        C9176a aVar = (C9176a) hlsMediaPlaylist2.f20701o.get(i3);
        DataSpec dataSpec2 = new DataSpec(C9549j0.m29368b(hlsMediaPlaylist2.f20714a, aVar.f20711c), aVar.f20710b0, aVar.f20712c0, null);
        boolean z4 = bArr3 != null;
        DataSource a = m27485a(dataSource3, bArr3, z4 ? m27487a(aVar.f20709a0) : null);
        C9176a aVar2 = aVar.f20703U;
        if (aVar2 != null) {
            boolean z5 = bArr4 != null;
            byte[] a2 = z5 ? m27487a(aVar2.f20709a0) : null;
            boolean z6 = z5;
            DataSpec dataSpec3 = new DataSpec(C9549j0.m29368b(hlsMediaPlaylist2.f20714a, aVar2.f20711c), aVar2.f20710b0, aVar2.f20712c0, null);
            DataSource a3 = m27485a(dataSource3, bArr4, a2);
            z2 = z6;
            dataSource2 = a3;
            dataSpec = dataSpec3;
        } else {
            dataSpec = null;
            z2 = false;
            dataSource2 = null;
        }
        long j2 = j + aVar.f20706X;
        long j3 = j2 + aVar.f20704V;
        int i4 = hlsMediaPlaylist2.f20694h + aVar.f20705W;
        if (jVar2 != null) {
            C8770h hVar2 = jVar2.f20610w;
            C9572w wVar2 = jVar2.f20611x;
            boolean z7 = !uri.equals(jVar2.f20599l) || !jVar2.f20596G;
            hVar = hVar2;
            wVar = wVar2;
            z3 = z7;
            gVar = (!jVar2.f20591B || jVar2.f20598k != i4 || z7) ? null : jVar2.f20590A;
        } else {
            Uri uri2 = uri;
            hVar = new C8770h();
            wVar = new C9572w(10);
            gVar = null;
            z3 = false;
        }
        C9164j jVar3 = new C9164j(hlsExtractorFactory, a, dataSpec2, format, z4, dataSource2, dataSpec, z2, uri, list, i2, obj, j2, j3, hlsMediaPlaylist2.f20695i + ((long) i3), i4, aVar.f20713d0, z, pVar.mo23860a(i4), aVar.f20707Y, gVar, hVar, wVar, z3);
        return jVar3;
    }

    /* renamed from: h */
    private void m27488h() throws IOException, InterruptedException {
        if (!this.f20602o) {
            this.f20604q.mo24636e();
        } else if (this.f20604q.mo24629a() == Long.MAX_VALUE) {
            this.f20604q.mo24634c(this.f20861f);
        }
        m27486a((DataSource) this.f20863h, this.f20856a, this.f20612y);
    }

    /* renamed from: i */
    private void m27489i() throws IOException, InterruptedException {
        if (this.f20594E) {
            m27486a(this.f20600m, this.f20601n, this.f20613z);
            this.f20593D = 0;
            this.f20594E = false;
        }
    }

    /* renamed from: g */
    public boolean mo23818g() {
        return this.f20596G;
    }

    public void load() throws IOException, InterruptedException {
        if (this.f20590A == null) {
            C8912g gVar = this.f20609v;
            if (gVar != null) {
                this.f20590A = gVar;
                this.f20591B = true;
                this.f20594E = false;
                this.f20592C.mo23831a(this.f20597j, this.f20605r, true);
            }
        }
        m27489i();
        if (!this.f20595F) {
            if (!this.f20603p) {
                m27488h();
            }
            this.f20596G = true;
        }
    }

    /* renamed from: a */
    public void mo23817a(C9167m mVar) {
        this.f20592C = mVar;
    }

    /* renamed from: a */
    public void mo23567a() {
        this.f20595F = true;
    }

    /* renamed from: a */
    private void m27486a(DataSource dataSource, DataSpec dataSpec, boolean z) throws IOException, InterruptedException {
        DataSpec dataSpec2;
        boolean z2;
        C8909d a;
        int i = 0;
        if (z) {
            z2 = this.f20593D != 0;
            dataSpec2 = dataSpec;
        } else {
            dataSpec2 = dataSpec.mo24449a((long) this.f20593D);
            z2 = false;
        }
        try {
            a = m27483a(dataSource, dataSpec2);
            if (z2) {
                a.mo23298c(this.f20593D);
            }
            while (i == 0) {
                if (this.f20595F) {
                    break;
                }
                i = this.f20590A.mo23306a((C8913h) a, (C8919n) null);
            }
            this.f20593D = (int) (a.getPosition() - dataSpec.f21941d);
            C9554k0.m29405a(dataSource);
        } catch (Throwable th) {
            C9554k0.m29405a(dataSource);
            throw th;
        }
    }

    /* renamed from: a */
    private C8909d m27483a(DataSource dataSource, DataSpec dataSpec) throws IOException, InterruptedException {
        DataSpec dataSpec2 = dataSpec;
        C8909d dVar = new C8909d(dataSource, dataSpec2.f21941d, dataSource.open(dataSpec));
        if (this.f20590A != null) {
            return dVar;
        }
        long a = m27482a((C8913h) dVar);
        dVar.mo23297c();
        C8909d dVar2 = dVar;
        C9148a a2 = this.f20606s.mo23782a(this.f20609v, dataSpec2.f21938a, this.f20858c, this.f20607t, this.f20608u, this.f20604q, dataSource.mo9243a(), dVar2);
        this.f20590A = a2.f20531a;
        this.f20591B = a2.f20533c;
        if (a2.f20532b) {
            this.f20592C.mo23844d(a != -9223372036854775807L ? this.f20604q.mo24632b(a) : this.f20861f);
        } else {
            this.f20592C.mo23844d(0);
        }
        this.f20592C.mo23831a(this.f20597j, this.f20605r, false);
        this.f20590A.mo23309a((C8914i) this.f20592C);
        return dVar2;
    }

    /* renamed from: a */
    private long m27482a(C8913h hVar) throws IOException, InterruptedException {
        hVar.mo23297c();
        try {
            hVar.mo23294b(this.f20611x.f22333a, 0, 10);
            this.f20611x.mo24689c(10);
            if (this.f20611x.mo24714y() != C8770h.f18621b) {
                return -9223372036854775807L;
            }
            this.f20611x.mo24695f(3);
            int u = this.f20611x.mo24710u();
            int i = u + 10;
            if (i > this.f20611x.mo24686b()) {
                C9572w wVar = this.f20611x;
                byte[] bArr = wVar.f22333a;
                wVar.mo24689c(i);
                System.arraycopy(bArr, 0, this.f20611x.f22333a, 0, 10);
            }
            hVar.mo23294b(this.f20611x.f22333a, 10, u);
            Metadata a = this.f20610w.mo22946a(this.f20611x.f22333a, u);
            if (a == null) {
                return -9223372036854775807L;
            }
            int X = a.mo22862X();
            for (int i2 = 0; i2 < X; i2++) {
                C8737b a2 = a.mo22863a(i2);
                if (a2 instanceof C8778l) {
                    C8778l lVar = (C8778l) a2;
                    if ("com.apple.streaming.transportStreamTimestamp".equals(lVar.f18635U)) {
                        System.arraycopy(lVar.f18636V, 0, this.f20611x.f22333a, 0, 8);
                        this.f20611x.mo24689c(8);
                        return this.f20611x.mo24707r() & 8589934591L;
                    }
                }
            }
            return -9223372036854775807L;
        } catch (EOFException unused) {
        }
    }

    /* renamed from: a */
    private static byte[] m27487a(String str) {
        if (C9554k0.m29457k(str).startsWith("0x")) {
            str = str.substring(2);
        }
        byte[] byteArray = new BigInteger(str, 16).toByteArray();
        byte[] bArr = new byte[16];
        int length = byteArray.length > 16 ? byteArray.length - 16 : 0;
        System.arraycopy(byteArray, length, bArr, (bArr.length - byteArray.length) + length, byteArray.length - length);
        return bArr;
    }

    /* renamed from: a */
    private static DataSource m27485a(DataSource dataSource, byte[] bArr, byte[] bArr2) {
        return bArr != null ? new C9153d(dataSource, bArr, bArr2) : dataSource;
    }
}
