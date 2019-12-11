package com.google.android.exoplayer2.upstream.cache;

import com.google.android.exoplayer2.upstream.C9504k;
import com.google.android.exoplayer2.upstream.C9504k.C9505a;

/* renamed from: com.google.android.exoplayer2.upstream.cache.c */
/* compiled from: CacheDataSinkFactory */
public final class C9462c implements C9505a {

    /* renamed from: a */
    private final Cache f21992a;

    /* renamed from: b */
    private final long f21993b;

    /* renamed from: c */
    private final int f21994c;

    public C9462c(Cache cache, long j) {
        this(cache, j, 20480);
    }

    /* renamed from: a */
    public C9504k mo24492a() {
        return new C9460b(this.f21992a, this.f21993b, this.f21994c);
    }

    public C9462c(Cache cache, long j, int i) {
        this.f21992a = cache;
        this.f21993b = j;
        this.f21994c = i;
    }
}
