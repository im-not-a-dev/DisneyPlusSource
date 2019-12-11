package com.google.android.exoplayer2.source.p379m0;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.p366s0.C8909d;
import com.google.android.exoplayer2.p366s0.C8924q;
import com.google.android.exoplayer2.p393v0.Util;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.DataSpec;
import java.io.IOException;

/* renamed from: com.google.android.exoplayer2.source.m0.n */
/* compiled from: SingleSampleMediaChunk */
public final class C9227n extends C9209a {

    /* renamed from: n */
    private final int f20924n;

    /* renamed from: o */
    private final Format f20925o;

    /* renamed from: p */
    private long f20926p;

    /* renamed from: q */
    private boolean f20927q;

    public C9227n(DataSource dataSource, DataSpec dataSpec, Format format, int i, Object obj, long j, long j2, long j3, int i2, Format format2) {
        super(dataSource, dataSpec, format, i, obj, j, j2, -9223372036854775807L, -9223372036854775807L, j3);
        this.f20924n = i2;
        this.f20925o = format2;
    }

    /* renamed from: a */
    public void mo23567a() {
    }

    /* renamed from: g */
    public boolean mo23818g() {
        return this.f20927q;
    }

    /* JADX INFO: finally extract failed */
    public void load() throws IOException, InterruptedException {
        try {
            long open = this.f20863h.open(this.f20856a.mo24449a(this.f20926p));
            if (open != -1) {
                open += this.f20926p;
            }
            C8909d dVar = new C8909d(this.f20863h, this.f20926p, open);
            C9211c h = mo23929h();
            h.mo23932a(0);
            C8924q a = h.mo23931a(0, this.f20924n);
            a.mo23304a(this.f20925o);
            for (int i = 0; i != -1; i = a.mo23302a(dVar, Integer.MAX_VALUE, true)) {
                this.f20926p += (long) i;
            }
            a.mo23303a(this.f20861f, 1, (int) this.f20926p, 0, null);
            Util.m29405a((DataSource) this.f20863h);
            this.f20927q = true;
        } catch (Throwable th) {
            Util.m29405a((DataSource) this.f20863h);
            throw th;
        }
    }
}
