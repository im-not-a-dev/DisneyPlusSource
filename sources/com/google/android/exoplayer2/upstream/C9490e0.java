package com.google.android.exoplayer2.upstream;

import com.google.android.exoplayer2.p393v0.C9575z;
import com.google.android.exoplayer2.upstream.DataSource.C9435a;

/* renamed from: com.google.android.exoplayer2.upstream.e0 */
/* compiled from: PriorityDataSourceFactory */
public final class C9490e0 implements C9435a {

    /* renamed from: a */
    private final C9435a f22093a;

    /* renamed from: b */
    private final C9575z f22094b;

    /* renamed from: c */
    private final int f22095c;

    public C9490e0(C9435a aVar, C9575z zVar, int i) {
        this.f22093a = aVar;
        this.f22094b = zVar;
        this.f22095c = i;
    }

    /* renamed from: a */
    public C9488d0 m29194a() {
        return new C9488d0(this.f22093a.mo24448a(), this.f22094b, this.f22095c);
    }
}
