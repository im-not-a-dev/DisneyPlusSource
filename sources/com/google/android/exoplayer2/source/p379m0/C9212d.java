package com.google.android.exoplayer2.source.p379m0;

import android.net.Uri;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.p393v0.C9537e;
import com.google.android.exoplayer2.upstream.C9442a0.C9447e;
import com.google.android.exoplayer2.upstream.C9496g0;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.DataSpec;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.exoplayer2.source.m0.d */
/* compiled from: Chunk */
public abstract class C9212d implements C9447e {

    /* renamed from: a */
    public final DataSpec f20856a;

    /* renamed from: b */
    public final int f20857b;

    /* renamed from: c */
    public final Format f20858c;

    /* renamed from: d */
    public final int f20859d;

    /* renamed from: e */
    public final Object f20860e;

    /* renamed from: f */
    public final long f20861f;

    /* renamed from: g */
    public final long f20862g;

    /* renamed from: h */
    protected final C9496g0 f20863h;

    public C9212d(DataSource dataSource, DataSpec dataSpec, int i, Format format, int i2, Object obj, long j, long j2) {
        this.f20863h = new C9496g0(dataSource);
        C9537e.m29296a(dataSpec);
        this.f20856a = dataSpec;
        this.f20857b = i;
        this.f20858c = format;
        this.f20859d = i2;
        this.f20860e = obj;
        this.f20861f = j;
        this.f20862g = j2;
    }

    /* renamed from: b */
    public final long mo23934b() {
        return this.f20863h.mo24562b();
    }

    /* renamed from: c */
    public final long mo23935c() {
        return this.f20862g - this.f20861f;
    }

    /* renamed from: d */
    public final Map<String, List<String>> mo23936d() {
        return this.f20863h.mo24564d();
    }

    /* renamed from: e */
    public final Uri mo23937e() {
        return this.f20863h.mo24563c();
    }
}
