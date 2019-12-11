package com.google.android.exoplayer2.source.hls.playlist;

import android.net.Uri;
import android.os.Handler;
import android.os.SystemClock;
import com.google.android.exoplayer2.C8723g0;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.p393v0.Assertions;
import com.google.android.exoplayer2.source.MediaSourceEventListener.C9068a;
import com.google.android.exoplayer2.source.hls.C9162h;
import com.google.android.exoplayer2.source.hls.playlist.C9182e.C9184b;
import com.google.android.exoplayer2.source.hls.playlist.C9188h.C9189a;
import com.google.android.exoplayer2.source.hls.playlist.C9188h.C9190b;
import com.google.android.exoplayer2.source.hls.playlist.C9188h.C9191c;
import com.google.android.exoplayer2.source.hls.playlist.C9188h.C9192d;
import com.google.android.exoplayer2.source.hls.playlist.C9188h.C9193e;
import com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist.C9176a;
import com.google.android.exoplayer2.upstream.C9442a0;
import com.google.android.exoplayer2.upstream.C9442a0.C9444b;
import com.google.android.exoplayer2.upstream.C9442a0.C9445c;
import com.google.android.exoplayer2.upstream.C9455c0;
import com.google.android.exoplayer2.upstream.C9455c0.C9456a;
import com.google.android.exoplayer2.upstream.C9524z;
import com.google.android.exoplayer2.upstream.DataSpec;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* renamed from: com.google.android.exoplayer2.source.hls.playlist.c */
/* compiled from: DefaultHlsPlaylistTracker */
public final class C9179c implements C9188h, C9444b<C9455c0<HlsPlaylist>> {

    /* renamed from: j0 */
    public static final C9189a f20718j0 = C9177a.f20717a;

    /* renamed from: U */
    private final C9187g f20719U;
    /* access modifiers changed from: private */

    /* renamed from: V */
    public final C9524z f20720V;

    /* renamed from: W */
    private final HashMap<Uri, C9180a> f20721W;

    /* renamed from: X */
    private final List<C9190b> f20722X;
    /* access modifiers changed from: private */

    /* renamed from: Y */
    public final double f20723Y;
    /* access modifiers changed from: private */

    /* renamed from: Z */
    public C9456a<HlsPlaylist> f20724Z;
    /* access modifiers changed from: private */

    /* renamed from: a0 */
    public C9068a f20725a0;

    /* renamed from: b0 */
    private C9442a0 f20726b0;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C9162h f20727c;
    /* access modifiers changed from: private */

    /* renamed from: c0 */
    public Handler f20728c0;

    /* renamed from: d0 */
    private C9193e f20729d0;

    /* renamed from: e0 */
    private C9182e f20730e0;
    /* access modifiers changed from: private */

    /* renamed from: f0 */
    public Uri f20731f0;

    /* renamed from: g0 */
    private HlsMediaPlaylist f20732g0;

    /* renamed from: h0 */
    private boolean f20733h0;

    /* renamed from: i0 */
    private long f20734i0;

    /* renamed from: com.google.android.exoplayer2.source.hls.playlist.c$a */
    /* compiled from: DefaultHlsPlaylistTracker */
    private final class C9180a implements C9444b<C9455c0<HlsPlaylist>>, Runnable {

        /* renamed from: U */
        private final C9442a0 f20735U = new C9442a0("DefaultHlsPlaylistTracker:MediaPlaylist");

        /* renamed from: V */
        private final C9455c0<HlsPlaylist> f20736V;

        /* renamed from: W */
        private HlsMediaPlaylist f20737W;

        /* renamed from: X */
        private long f20738X;

        /* renamed from: Y */
        private long f20739Y;

        /* renamed from: Z */
        private long f20740Z;
        /* access modifiers changed from: private */

        /* renamed from: a0 */
        public long f20741a0;

        /* renamed from: b0 */
        private boolean f20742b0;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public final Uri f20743c;

        /* renamed from: c0 */
        private IOException f20744c0;

        public C9180a(Uri uri) {
            this.f20743c = uri;
            this.f20736V = new C9455c0<>(C9179c.this.f20727c.createDataSource(4), uri, 4, C9179c.this.f20724Z);
        }

        /* renamed from: f */
        private void m27637f() {
            long a = this.f20735U.mo24455a(this.f20736V, this, C9179c.this.f20720V.getMinimumLoadableRetryCount(this.f20736V.f21976b));
            C9068a g = C9179c.this.f20725a0;
            C9455c0<HlsPlaylist> c0Var = this.f20736V;
            g.mo23513a(c0Var.f21975a, c0Var.f21976b, a);
        }

        /* renamed from: c */
        public void mo23891c() {
            this.f20741a0 = 0;
            if (!this.f20742b0 && !this.f20735U.mo24461e() && !this.f20735U.mo24460d()) {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                if (elapsedRealtime < this.f20740Z) {
                    this.f20742b0 = true;
                    C9179c.this.f20728c0.postDelayed(this, this.f20740Z - elapsedRealtime);
                    return;
                }
                m27637f();
            }
        }

        /* renamed from: d */
        public void mo23892d() throws IOException {
            this.f20735U.mo23621a();
            IOException iOException = this.f20744c0;
            if (iOException != null) {
                throw iOException;
            }
        }

        /* renamed from: e */
        public void mo23893e() {
            this.f20735U.mo24462f();
        }

        public void run() {
            this.f20742b0 = false;
            m27637f();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:9:0x002b, code lost:
            if ((r10.f20738X + r4) <= r2) goto L_0x002e;
         */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean mo23890b() {
            /*
                r10 = this;
                com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist r0 = r10.f20737W
                r1 = 0
                if (r0 != 0) goto L_0x0006
                return r1
            L_0x0006:
                long r2 = android.os.SystemClock.elapsedRealtime()
                r4 = 30000(0x7530, double:1.4822E-319)
                com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist r0 = r10.f20737W
                long r6 = r0.f20702p
                long r6 = com.google.android.exoplayer2.C.usToMs(r6)
                long r4 = java.lang.Math.max(r4, r6)
                com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist r0 = r10.f20737W
                boolean r6 = r0.f20698l
                r7 = 1
                if (r6 != 0) goto L_0x002d
                int r0 = r0.f20690d
                r6 = 2
                if (r0 == r6) goto L_0x002d
                if (r0 == r7) goto L_0x002d
                long r8 = r10.f20738X
                long r8 = r8 + r4
                int r0 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
                if (r0 <= 0) goto L_0x002e
            L_0x002d:
                r1 = 1
            L_0x002e:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.hls.playlist.C9179c.C9180a.mo23890b():boolean");
        }

        /* renamed from: a */
        public HlsMediaPlaylist mo23886a() {
            return this.f20737W;
        }

        /* renamed from: a */
        public void mo23559a(C9455c0<HlsPlaylist> c0Var, long j, long j2) {
            HlsPlaylist hlsPlaylist = (HlsPlaylist) c0Var.mo24473d();
            if (hlsPlaylist instanceof HlsMediaPlaylist) {
                long j3 = j2;
                m27633a((HlsMediaPlaylist) hlsPlaylist, j3);
                C9179c.this.f20725a0.mo23524b(c0Var.f21975a, c0Var.mo24474e(), c0Var.mo24472c(), 4, j, j3, c0Var.mo24471b());
                return;
            }
            this.f20744c0 = new C8723g0("Loaded playlist has unexpected type.");
        }

        /* renamed from: a */
        public void mo23560a(C9455c0<HlsPlaylist> c0Var, long j, long j2, boolean z) {
            C9179c.this.f20725a0.mo23516a(c0Var.f21975a, c0Var.mo24474e(), c0Var.mo24472c(), 4, j, j2, c0Var.mo24471b());
        }

        /* renamed from: a */
        public C9445c mo23555a(C9455c0<HlsPlaylist> c0Var, long j, long j2, IOException iOException, int i) {
            C9445c cVar;
            C9455c0<HlsPlaylist> c0Var2 = c0Var;
            long blacklistDurationMsFor = C9179c.this.f20720V.getBlacklistDurationMsFor(c0Var2.f21976b, j2, iOException, i);
            boolean z = blacklistDurationMsFor != -9223372036854775807L;
            boolean z2 = C9179c.this.m27600a(this.f20743c, blacklistDurationMsFor) || !z;
            if (z) {
                z2 |= m27635a(blacklistDurationMsFor);
            }
            if (z2) {
                long retryDelayMsFor = C9179c.this.f20720V.getRetryDelayMsFor(c0Var2.f21976b, j2, iOException, i);
                cVar = retryDelayMsFor != -9223372036854775807L ? C9442a0.m28955a(false, retryDelayMsFor) : C9442a0.f21955e;
            } else {
                cVar = C9442a0.f21954d;
            }
            C9179c.this.f20725a0.mo23517a(c0Var2.f21975a, c0Var.mo24474e(), c0Var.mo24472c(), 4, j, j2, c0Var.mo24471b(), iOException, !cVar.mo24463a());
            return cVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void m27633a(HlsMediaPlaylist hlsMediaPlaylist, long j) {
            HlsMediaPlaylist hlsMediaPlaylist2 = hlsMediaPlaylist;
            HlsMediaPlaylist hlsMediaPlaylist3 = this.f20737W;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            this.f20738X = elapsedRealtime;
            this.f20737W = C9179c.this.m27603b(hlsMediaPlaylist3, hlsMediaPlaylist2);
            HlsMediaPlaylist hlsMediaPlaylist4 = this.f20737W;
            if (hlsMediaPlaylist4 != hlsMediaPlaylist3) {
                this.f20744c0 = null;
                this.f20739Y = elapsedRealtime;
                C9179c.this.m27597a(this.f20743c, hlsMediaPlaylist4);
            } else if (!hlsMediaPlaylist4.f20698l) {
                long size = hlsMediaPlaylist2.f20695i + ((long) hlsMediaPlaylist2.f20701o.size());
                HlsMediaPlaylist hlsMediaPlaylist5 = this.f20737W;
                if (size < hlsMediaPlaylist5.f20695i) {
                    this.f20744c0 = new C9191c(this.f20743c);
                    C9179c.this.m27600a(this.f20743c, -9223372036854775807L);
                } else if (((double) (elapsedRealtime - this.f20739Y)) > ((double) C.usToMs(hlsMediaPlaylist5.f20697k)) * C9179c.this.f20723Y) {
                    this.f20744c0 = new C9192d(this.f20743c);
                    long blacklistDurationMsFor = C9179c.this.f20720V.getBlacklistDurationMsFor(4, j, this.f20744c0, 1);
                    C9179c.this.m27600a(this.f20743c, blacklistDurationMsFor);
                    if (blacklistDurationMsFor != -9223372036854775807L) {
                        m27635a(blacklistDurationMsFor);
                    }
                }
            }
            HlsMediaPlaylist hlsMediaPlaylist6 = this.f20737W;
            this.f20740Z = elapsedRealtime + C.usToMs(hlsMediaPlaylist6 != hlsMediaPlaylist3 ? hlsMediaPlaylist6.f20697k : hlsMediaPlaylist6.f20697k / 2);
            if (this.f20743c.equals(C9179c.this.f20731f0) && !this.f20737W.f20698l) {
                mo23891c();
            }
        }

        /* renamed from: a */
        private boolean m27635a(long j) {
            this.f20741a0 = SystemClock.elapsedRealtime() + j;
            return this.f20743c.equals(C9179c.this.f20731f0) && !C9179c.this.m27611e();
        }
    }

    public C9179c(C9162h hVar, C9524z zVar, C9187g gVar) {
        this(hVar, zVar, gVar, 3.5d);
    }

    public void stop() {
        this.f20731f0 = null;
        this.f20732g0 = null;
        this.f20730e0 = null;
        this.f20734i0 = -9223372036854775807L;
        this.f20726b0.mo24462f();
        this.f20726b0 = null;
        for (C9180a e : this.f20721W.values()) {
            e.mo23893e();
        }
        this.f20728c0.removeCallbacksAndMessages(null);
        this.f20728c0 = null;
        this.f20721W.clear();
    }

    public C9179c(C9162h hVar, C9524z zVar, C9187g gVar, double d) {
        this.f20727c = hVar;
        this.f20719U = gVar;
        this.f20720V = zVar;
        this.f20723Y = d;
        this.f20722X = new ArrayList();
        this.f20721W = new HashMap<>();
        this.f20734i0 = -9223372036854775807L;
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public boolean m27611e() {
        List<C9184b> list = this.f20730e0.f20750e;
        int size = list.size();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        for (int i = 0; i < size; i++) {
            C9180a aVar = (C9180a) this.f20721W.get(((C9184b) list.get(i)).f20760a);
            if (elapsedRealtime > aVar.f20741a0) {
                this.f20731f0 = aVar.f20743c;
                aVar.mo23891c();
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public void mo23881b(C9190b bVar) {
        this.f20722X.add(bVar);
    }

    /* renamed from: c */
    public void mo23882c(Uri uri) {
        ((C9180a) this.f20721W.get(uri)).mo23891c();
    }

    /* renamed from: d */
    public void mo23884d() throws IOException {
        C9442a0 a0Var = this.f20726b0;
        if (a0Var != null) {
            a0Var.mo23621a();
        }
        Uri uri = this.f20731f0;
        if (uri != null) {
            mo23880b(uri);
        }
    }

    /* renamed from: b */
    public C9182e mo23879b() {
        return this.f20730e0;
    }

    /* renamed from: c */
    public boolean mo23883c() {
        return this.f20733h0;
    }

    /* renamed from: c */
    private int m27604c(HlsMediaPlaylist hlsMediaPlaylist, HlsMediaPlaylist hlsMediaPlaylist2) {
        if (hlsMediaPlaylist2.f20693g) {
            return hlsMediaPlaylist2.f20694h;
        }
        HlsMediaPlaylist hlsMediaPlaylist3 = this.f20732g0;
        int i = hlsMediaPlaylist3 != null ? hlsMediaPlaylist3.f20694h : 0;
        if (hlsMediaPlaylist == null) {
            return i;
        }
        C9176a a = m27595a(hlsMediaPlaylist, hlsMediaPlaylist2);
        return a != null ? (hlsMediaPlaylist.f20694h + a.f20705W) - ((C9176a) hlsMediaPlaylist2.f20701o.get(0)).f20705W : i;
    }

    /* renamed from: b */
    public void mo23880b(Uri uri) throws IOException {
        ((C9180a) this.f20721W.get(uri)).mo23892d();
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public HlsMediaPlaylist m27603b(HlsMediaPlaylist hlsMediaPlaylist, HlsMediaPlaylist hlsMediaPlaylist2) {
        if (hlsMediaPlaylist2.mo23864a(hlsMediaPlaylist)) {
            return hlsMediaPlaylist2.mo23863a(m27606d(hlsMediaPlaylist, hlsMediaPlaylist2), m27604c(hlsMediaPlaylist, hlsMediaPlaylist2));
        }
        if (hlsMediaPlaylist2.f20698l) {
            hlsMediaPlaylist = hlsMediaPlaylist.mo23862a();
        }
        return hlsMediaPlaylist;
    }

    /* renamed from: d */
    private boolean m27608d(Uri uri) {
        List<C9184b> list = this.f20730e0.f20750e;
        for (int i = 0; i < list.size(); i++) {
            if (uri.equals(((C9184b) list.get(i)).f20760a)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public void mo23874a(Uri uri, C9068a aVar, C9193e eVar) {
        this.f20728c0 = new Handler();
        this.f20725a0 = aVar;
        this.f20729d0 = eVar;
        C9455c0 c0Var = new C9455c0(this.f20727c.createDataSource(4), uri, 4, this.f20719U.mo23869a());
        Assertions.checkState(this.f20726b0 == null);
        this.f20726b0 = new C9442a0("DefaultHlsPlaylistTracker:MasterPlaylist");
        aVar.mo23513a(c0Var.f21975a, c0Var.f21976b, this.f20726b0.mo24455a(c0Var, this, this.f20720V.getMinimumLoadableRetryCount(c0Var.f21976b)));
    }

    /* renamed from: d */
    private long m27606d(HlsMediaPlaylist hlsMediaPlaylist, HlsMediaPlaylist hlsMediaPlaylist2) {
        if (hlsMediaPlaylist2.f20699m) {
            return hlsMediaPlaylist2.f20692f;
        }
        HlsMediaPlaylist hlsMediaPlaylist3 = this.f20732g0;
        long j = hlsMediaPlaylist3 != null ? hlsMediaPlaylist3.f20692f : 0;
        if (hlsMediaPlaylist == null) {
            return j;
        }
        int size = hlsMediaPlaylist.f20701o.size();
        C9176a a = m27595a(hlsMediaPlaylist, hlsMediaPlaylist2);
        if (a != null) {
            return hlsMediaPlaylist.f20692f + a.f20706X;
        }
        return ((long) size) == hlsMediaPlaylist2.f20695i - hlsMediaPlaylist.f20695i ? hlsMediaPlaylist.mo23865b() : j;
    }

    /* renamed from: e */
    private void m27610e(Uri uri) {
        if (!uri.equals(this.f20731f0) && m27608d(uri)) {
            HlsMediaPlaylist hlsMediaPlaylist = this.f20732g0;
            if (hlsMediaPlaylist == null || !hlsMediaPlaylist.f20698l) {
                this.f20731f0 = uri;
                ((C9180a) this.f20721W.get(this.f20731f0)).mo23891c();
            }
        }
    }

    /* renamed from: a */
    public void mo23875a(C9190b bVar) {
        this.f20722X.remove(bVar);
    }

    /* renamed from: a */
    public HlsMediaPlaylist mo23872a(Uri uri, boolean z) {
        HlsMediaPlaylist a = ((C9180a) this.f20721W.get(uri)).mo23886a();
        if (a != null && z) {
            m27610e(uri);
        }
        return a;
    }

    /* renamed from: a */
    public long mo23871a() {
        return this.f20734i0;
    }

    /* renamed from: a */
    public boolean mo23878a(Uri uri) {
        return ((C9180a) this.f20721W.get(uri)).mo23890b();
    }

    /* renamed from: a */
    public void mo23559a(C9455c0<HlsPlaylist> c0Var, long j, long j2) {
        C9182e eVar;
        HlsPlaylist hlsPlaylist = (HlsPlaylist) c0Var.mo24473d();
        boolean z = hlsPlaylist instanceof HlsMediaPlaylist;
        if (z) {
            eVar = C9182e.m27651a(hlsPlaylist.f20714a);
        } else {
            eVar = (C9182e) hlsPlaylist;
        }
        this.f20730e0 = eVar;
        this.f20724Z = this.f20719U.mo23870a(eVar);
        this.f20731f0 = ((C9184b) eVar.f20750e.get(0)).f20760a;
        m27599a(eVar.f20749d);
        C9180a aVar = (C9180a) this.f20721W.get(this.f20731f0);
        if (z) {
            aVar.m27633a((HlsMediaPlaylist) hlsPlaylist, j2);
        } else {
            long j3 = j2;
            aVar.mo23891c();
        }
        this.f20725a0.mo23524b(c0Var.f21975a, c0Var.mo24474e(), c0Var.mo24472c(), 4, j, j2, c0Var.mo24471b());
    }

    /* renamed from: a */
    public void mo23560a(C9455c0<HlsPlaylist> c0Var, long j, long j2, boolean z) {
        C9068a aVar = this.f20725a0;
        DataSpec dataSpec = c0Var.f21975a;
        Uri e = c0Var.mo24474e();
        aVar.mo23516a(dataSpec, e, c0Var.mo24472c(), 4, j, j2, c0Var.mo24471b());
    }

    /* renamed from: a */
    public C9445c mo23555a(C9455c0<HlsPlaylist> c0Var, long j, long j2, IOException iOException, int i) {
        C9455c0<HlsPlaylist> c0Var2 = c0Var;
        long retryDelayMsFor = this.f20720V.getRetryDelayMsFor(c0Var2.f21976b, j2, iOException, i);
        boolean z = retryDelayMsFor == -9223372036854775807L;
        this.f20725a0.mo23517a(c0Var2.f21975a, c0Var.mo24474e(), c0Var.mo24472c(), 4, j, j2, c0Var.mo24471b(), iOException, z);
        if (z) {
            return C9442a0.f21955e;
        }
        return C9442a0.m28955a(false, retryDelayMsFor);
    }

    /* renamed from: a */
    private void m27599a(List<Uri> list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Uri uri = (Uri) list.get(i);
            this.f20721W.put(uri, new C9180a(uri));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m27597a(Uri uri, HlsMediaPlaylist hlsMediaPlaylist) {
        if (uri.equals(this.f20731f0)) {
            if (this.f20732g0 == null) {
                this.f20733h0 = !hlsMediaPlaylist.f20698l;
                this.f20734i0 = hlsMediaPlaylist.f20692f;
            }
            this.f20732g0 = hlsMediaPlaylist;
            this.f20729d0.mo23783a(hlsMediaPlaylist);
        }
        int size = this.f20722X.size();
        for (int i = 0; i < size; i++) {
            ((C9190b) this.f20722X.get(i)).mo23823b();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public boolean m27600a(Uri uri, long j) {
        boolean z = false;
        for (int i = 0; i < this.f20722X.size(); i++) {
            z |= !((C9190b) this.f20722X.get(i)).mo23822a(uri, j);
        }
        return z;
    }

    /* renamed from: a */
    private static C9176a m27595a(HlsMediaPlaylist hlsMediaPlaylist, HlsMediaPlaylist hlsMediaPlaylist2) {
        int i = (int) (hlsMediaPlaylist2.f20695i - hlsMediaPlaylist.f20695i);
        List<C9176a> list = hlsMediaPlaylist.f20701o;
        if (i < list.size()) {
            return (C9176a) list.get(i);
        }
        return null;
    }
}
