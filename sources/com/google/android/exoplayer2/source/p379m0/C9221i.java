package com.google.android.exoplayer2.source.p379m0;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.p366s0.C8909d;
import com.google.android.exoplayer2.p366s0.C8912g;
import com.google.android.exoplayer2.p366s0.C8913h;
import com.google.android.exoplayer2.p366s0.C8919n;
import com.google.android.exoplayer2.p393v0.C9537e;
import com.google.android.exoplayer2.p393v0.C9554k0;
import com.google.android.exoplayer2.source.p379m0.C9213e.C9215b;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.DataSpec;
import java.io.IOException;

/* renamed from: com.google.android.exoplayer2.source.m0.i */
/* compiled from: ContainerMediaChunk */
public class C9221i extends C9209a {

    /* renamed from: t */
    private static final C8919n f20909t = new C8919n();

    /* renamed from: n */
    private final int f20910n;

    /* renamed from: o */
    private final long f20911o;

    /* renamed from: p */
    private final C9213e f20912p;

    /* renamed from: q */
    private long f20913q;

    /* renamed from: r */
    private volatile boolean f20914r;

    /* renamed from: s */
    private boolean f20915s;

    public C9221i(DataSource dataSource, DataSpec dataSpec, Format format, int i, Object obj, long j, long j2, long j3, long j4, long j5, int i2, long j6, C9213e eVar) {
        super(dataSource, dataSpec, format, i, obj, j, j2, j3, j4, j5);
        this.f20910n = i2;
        this.f20911o = j6;
        this.f20912p = eVar;
    }

    /* renamed from: a */
    public final void mo23567a() {
        this.f20914r = true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C9215b mo23955b(C9211c cVar) {
        return cVar;
    }

    /* renamed from: f */
    public long mo23956f() {
        return this.f20922i + ((long) this.f20910n);
    }

    /* renamed from: g */
    public boolean mo23818g() {
        return this.f20915s;
    }

    public final void load() throws IOException, InterruptedException {
        C8909d dVar;
        DataSpec a = this.f20856a.mo24449a(this.f20913q);
        try {
            dVar = new C8909d(this.f20863h, a.f21941d, this.f20863h.open(a));
            if (this.f20913q == 0) {
                C9211c h = mo23929h();
                h.mo23932a(this.f20911o);
                C9213e eVar = this.f20912p;
                mo23955b(h);
                eVar.mo23938a(h, this.f20849j == -9223372036854775807L ? -9223372036854775807L : this.f20849j - this.f20911o, this.f20850k == -9223372036854775807L ? -9223372036854775807L : this.f20850k - this.f20911o);
            }
            C8912g gVar = this.f20912p.f20872c;
            boolean z = false;
            int i = 0;
            while (i == 0 && !this.f20914r) {
                i = gVar.mo23306a((C8913h) dVar, f20909t);
            }
            if (i != 1) {
                z = true;
            }
            C9537e.m29301b(z);
            this.f20913q = dVar.getPosition() - this.f20856a.f21941d;
            C9554k0.m29405a((DataSource) this.f20863h);
            this.f20915s = true;
        } catch (Throwable th) {
            C9554k0.m29405a((DataSource) this.f20863h);
            throw th;
        }
    }
}
