package com.google.android.exoplayer2.source.hls;

import android.net.Uri;
import com.google.android.exoplayer2.C8672a0;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.offline.StreamKey;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.source.C9072a0;
import com.google.android.exoplayer2.source.C9197i0;
import com.google.android.exoplayer2.source.C9229o;
import com.google.android.exoplayer2.source.C9256t;
import com.google.android.exoplayer2.source.C9257u;
import com.google.android.exoplayer2.source.MediaSource.MediaPeriodId;
import com.google.android.exoplayer2.source.hls.playlist.DefaultHlsPlaylistParserFactory;
import com.google.android.exoplayer2.source.hls.playlist.C9179c;
import com.google.android.exoplayer2.source.hls.playlist.C9181d;
import com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistParserFactory;
import com.google.android.exoplayer2.source.hls.playlist.C9188h;
import com.google.android.exoplayer2.source.hls.playlist.C9188h.C9189a;
import com.google.android.exoplayer2.source.hls.playlist.C9188h.C9193e;
import com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist;
import com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist.C9176a;
import com.google.android.exoplayer2.source.p378l0.C9207c;
import com.google.android.exoplayer2.upstream.C9491f;
import com.google.android.exoplayer2.upstream.C9518u;
import com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy;
import com.google.android.exoplayer2.upstream.DataSource.DataSource;
import com.google.android.exoplayer2.upstream.TransferListener;
import java.io.IOException;
import java.util.List;

public final class HlsMediaSource extends C9229o implements C9193e {

    /* renamed from: Y */
    private final HlsExtractorFactory f20534Y;

    /* renamed from: Z */
    private final Uri f20535Z;

    /* renamed from: a0 */
    private final HlsDataSourceFactory f20536a0;

    /* renamed from: b0 */
    private final C9256t f20537b0;

    /* renamed from: c0 */
    private final LoadErrorHandlingPolicy f20538c0;

    /* renamed from: d0 */
    private final boolean f20539d0;

    /* renamed from: e0 */
    private final boolean f20540e0;

    /* renamed from: f0 */
    private final C9188h f20541f0;

    /* renamed from: g0 */
    private final Object f20542g0;

    /* renamed from: h0 */
    private TransferListener f20543h0;

    public static final class Factory implements C9207c {

        /* renamed from: a */
        private final HlsDataSourceFactory f20544a;

        /* renamed from: b */
        private HlsExtractorFactory f20545b;

        /* renamed from: c */
        private HlsPlaylistParserFactory f20546c;

        /* renamed from: d */
        private List<StreamKey> f20547d;

        /* renamed from: e */
        private C9189a f20548e;

        /* renamed from: f */
        private C9256t f20549f;

        /* renamed from: g */
        private LoadErrorHandlingPolicy f20550g;

        /* renamed from: h */
        private boolean f20551h;

        /* renamed from: i */
        private boolean f20552i;

        /* renamed from: j */
        private boolean f20553j;

        /* renamed from: k */
        private Object f20554k;

        public Factory(DataSource aVar) {
            this((HlsDataSourceFactory) new C9154e(aVar));
        }

        /* renamed from: a */
        public Factory mo23784a(HlsExtractorFactory hlsExtractorFactory) {
            Assertions.checkState(!this.f20553j);
            Assertions.checkNotNull(hlsExtractorFactory);
            this.f20545b = hlsExtractorFactory;
            return this;
        }

        /* renamed from: b */
        public Factory mo23788b(boolean z) {
            this.f20552i = z;
            return this;
        }

        public HlsMediaSource createMediaSource(Uri uri) {
            this.f20553j = true;
            List<StreamKey> list = this.f20547d;
            if (list != null) {
                this.f20546c = new C9181d(this.f20546c, list);
            }
            HlsDataSourceFactory hVar = this.f20544a;
            HlsExtractorFactory hlsExtractorFactory = this.f20545b;
            C9256t tVar = this.f20549f;
            LoadErrorHandlingPolicy zVar = this.f20550g;
            HlsMediaSource hlsMediaSource = new HlsMediaSource(uri, hVar, hlsExtractorFactory, tVar, zVar, this.f20548e.mo23868a(hVar, zVar, this.f20546c), this.f20551h, this.f20552i, this.f20554k);
            return hlsMediaSource;
        }

        public Factory setStreamKeys(List<StreamKey> list) {
            Assertions.checkState(!this.f20553j);
            this.f20547d = list;
            return this;
        }

        public Factory(HlsDataSourceFactory hVar) {
            Assertions.checkNotNull(hVar);
            this.f20544a = hVar;
            this.f20546c = new DefaultHlsPlaylistParserFactory();
            this.f20548e = C9179c.f20718j0;
            this.f20545b = HlsExtractorFactory.f20530a;
            this.f20550g = new C9518u();
            this.f20549f = new C9257u();
        }

        /* renamed from: a */
        public Factory mo23786a(LoadErrorHandlingPolicy zVar) {
            Assertions.checkState(!this.f20553j);
            this.f20550g = zVar;
            return this;
        }

        /* renamed from: a */
        public Factory mo23785a(HlsPlaylistParserFactory gVar) {
            Assertions.checkState(!this.f20553j);
            Assertions.checkNotNull(gVar);
            this.f20546c = gVar;
            return this;
        }

        /* renamed from: a */
        public Factory mo23787a(boolean z) {
            Assertions.checkState(!this.f20553j);
            this.f20551h = z;
            return this;
        }
    }

    static {
        C8672a0.m24990a("goog.exo.hls");
    }

    /* renamed from: a */
    public void mo23580a(TransferListener transferListener) {
        this.f20543h0 = transferListener;
        this.f20541f0.mo23874a(this.f20535Z, mo23959a((MediaPeriodId) null), this);
    }

    /* renamed from: b */
    public void mo23581b() {
        this.f20541f0.stop();
    }

    private HlsMediaSource(Uri uri, HlsDataSourceFactory hVar, HlsExtractorFactory hlsExtractorFactory, C9256t tVar, LoadErrorHandlingPolicy zVar, C9188h hVar2, boolean z, boolean z2, Object obj) {
        this.f20535Z = uri;
        this.f20536a0 = hVar;
        this.f20534Y = hlsExtractorFactory;
        this.f20537b0 = tVar;
        this.f20538c0 = zVar;
        this.f20541f0 = hVar2;
        this.f20539d0 = z;
        this.f20540e0 = z2;
        this.f20542g0 = obj;
    }

    /* renamed from: a */
    public void mo23487a() throws IOException {
        this.f20541f0.mo23884d();
    }

    /* renamed from: a */
    public C9072a0 mo23486a(MediaPeriodId mediaPeriodId, C9491f fVar, long j) {
        C9165k kVar = new C9165k(this.f20534Y, this.f20541f0, this.f20536a0, this.f20543h0, this.f20538c0, mo23959a(mediaPeriodId), fVar, this.f20537b0, this.f20539d0, this.f20540e0);
        return kVar;
    }

    /* renamed from: a */
    public void mo23492a(C9072a0 a0Var) {
        ((C9165k) a0Var).mo23824h();
    }

    /* renamed from: a */
    public void mo23783a(HlsMediaPlaylist hlsMediaPlaylist) {
        C9197i0 i0Var;
        long j;
        long j2;
        HlsMediaPlaylist hlsMediaPlaylist2 = hlsMediaPlaylist;
        long b = hlsMediaPlaylist2.f20699m ? C.usToMs(hlsMediaPlaylist2.f20692f) : -9223372036854775807L;
        int i = hlsMediaPlaylist2.f20690d;
        long j3 = (i == 2 || i == 1) ? b : -9223372036854775807L;
        long j4 = hlsMediaPlaylist2.f20691e;
        if (this.f20541f0.mo23883c()) {
            long a = hlsMediaPlaylist2.f20692f - this.f20541f0.mo23871a();
            long j5 = hlsMediaPlaylist2.f20698l ? a + hlsMediaPlaylist2.f20702p : -9223372036854775807L;
            List<C9176a> list = hlsMediaPlaylist2.f20701o;
            if (j4 == -9223372036854775807L) {
                if (list.isEmpty()) {
                    j2 = 0;
                } else {
                    j2 = ((C9176a) list.get(Math.max(0, list.size() - 3))).f20706X;
                }
                j = j2;
            } else {
                j = j4;
            }
            C9197i0 i0Var2 = new C9197i0(j3, b, j5, hlsMediaPlaylist2.f20702p, a, j, true, !hlsMediaPlaylist2.f20698l, this.f20542g0);
            i0Var = i0Var2;
        } else {
            long j6 = j4 == -9223372036854775807L ? 0 : j4;
            long j7 = hlsMediaPlaylist2.f20702p;
            i0Var = new C9197i0(j3, b, j7, j7, 0, j6, true, false, this.f20542g0);
        }
        mo23961a((Timeline) i0Var, (Object) new C9163i(this.f20541f0.mo23879b(), hlsMediaPlaylist2));
    }
}
