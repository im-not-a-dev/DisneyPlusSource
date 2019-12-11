package com.google.android.exoplayer2.upstream.cache;

import com.google.android.exoplayer2.upstream.C9504k;
import com.google.android.exoplayer2.upstream.C9504k.C9505a;
import com.google.android.exoplayer2.upstream.C9522x;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.DataSource.C9435a;
import com.google.android.exoplayer2.upstream.cache.C9463d.C9464a;

/* renamed from: com.google.android.exoplayer2.upstream.cache.e */
/* compiled from: CacheDataSourceFactory */
public final class C9465e implements C9435a {

    /* renamed from: a */
    private final Cache f22018a;

    /* renamed from: b */
    private final C9435a f22019b;

    /* renamed from: c */
    private final C9435a f22020c;

    /* renamed from: d */
    private final int f22021d;

    /* renamed from: e */
    private final C9505a f22022e;

    /* renamed from: f */
    private final C9464a f22023f;

    /* renamed from: g */
    private final C9469i f22024g;

    public C9465e(Cache cache, C9435a aVar) {
        this(cache, aVar, 0);
    }

    public C9465e(Cache cache, C9435a aVar, int i) {
        this(cache, aVar, new C9522x(), new C9462c(cache, 5242880), i, null);
    }

    /* renamed from: a */
    public C9463d m29027a() {
        C9504k kVar;
        Cache cache = this.f22018a;
        DataSource a = this.f22019b.mo24448a();
        DataSource a2 = this.f22020c.mo24448a();
        C9505a aVar = this.f22022e;
        if (aVar == null) {
            kVar = null;
        } else {
            kVar = aVar.mo24492a();
        }
        C9463d dVar = new C9463d(cache, a, a2, kVar, this.f22021d, this.f22023f, this.f22024g);
        return dVar;
    }

    public C9465e(Cache cache, C9435a aVar, C9435a aVar2, C9505a aVar3, int i, C9464a aVar4) {
        this(cache, aVar, aVar2, aVar3, i, aVar4, null);
    }

    public C9465e(Cache cache, C9435a aVar, C9435a aVar2, C9505a aVar3, int i, C9464a aVar4, C9469i iVar) {
        this.f22018a = cache;
        this.f22019b = aVar;
        this.f22020c = aVar2;
        this.f22022e = aVar3;
        this.f22021d = i;
        this.f22023f = aVar4;
        this.f22024g = iVar;
    }
}
