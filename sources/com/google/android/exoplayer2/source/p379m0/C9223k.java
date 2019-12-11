package com.google.android.exoplayer2.source.p379m0;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.p366s0.C8909d;
import com.google.android.exoplayer2.p366s0.C8912g;
import com.google.android.exoplayer2.p366s0.C8913h;
import com.google.android.exoplayer2.p366s0.C8919n;
import com.google.android.exoplayer2.p393v0.C9537e;
import com.google.android.exoplayer2.p393v0.Util;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.DataSpec;
import java.io.IOException;

/* renamed from: com.google.android.exoplayer2.source.m0.k */
/* compiled from: InitializationChunk */
public final class C9223k extends C9212d {

    /* renamed from: l */
    private static final C8919n f20918l = new C8919n();

    /* renamed from: i */
    private final C9213e f20919i;

    /* renamed from: j */
    private long f20920j;

    /* renamed from: k */
    private volatile boolean f20921k;

    public C9223k(DataSource dataSource, DataSpec dataSpec, Format format, int i, Object obj, C9213e eVar) {
        super(dataSource, dataSpec, 2, format, i, obj, -9223372036854775807L, -9223372036854775807L);
        this.f20919i = eVar;
    }

    /* renamed from: a */
    public void mo23567a() {
        this.f20921k = true;
    }

    public void load() throws IOException, InterruptedException {
        C8909d dVar;
        DataSpec a = this.f20856a.mo24449a(this.f20920j);
        try {
            dVar = new C8909d(this.f20863h, a.f21941d, this.f20863h.open(a));
            if (this.f20920j == 0) {
                this.f20919i.mo23938a(null, -9223372036854775807L, -9223372036854775807L);
            }
            C8912g gVar = this.f20919i.f20872c;
            int i = 0;
            while (i == 0 && !this.f20921k) {
                i = gVar.mo23306a((C8913h) dVar, f20918l);
            }
            boolean z = true;
            if (i == 1) {
                z = false;
            }
            C9537e.m29301b(z);
            this.f20920j = dVar.getPosition() - this.f20856a.f21941d;
            Util.m29405a((DataSource) this.f20863h);
        } catch (Throwable th) {
            Util.m29405a((DataSource) this.f20863h);
            throw th;
        }
    }
}
