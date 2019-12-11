package com.google.android.exoplayer2.offline;

import androidx.core.app.NotificationManagerCompat;
import com.google.android.exoplayer2.util.C9575z;
import com.google.android.exoplayer2.upstream.C9490e0;
import com.google.android.exoplayer2.upstream.C9504k.C9505a;
import com.google.android.exoplayer2.upstream.C9519v;
import com.google.android.exoplayer2.upstream.C9522x;
import com.google.android.exoplayer2.upstream.DataSource.DataSource;
import com.google.android.exoplayer2.upstream.cache.C9462c;
import com.google.android.exoplayer2.upstream.cache.C9463d;
import com.google.android.exoplayer2.upstream.cache.CacheDataSourceFactory;
import com.google.android.exoplayer2.upstream.cache.C9469i;
import com.google.android.exoplayer2.upstream.cache.C9471k;
import com.google.android.exoplayer2.upstream.cache.Cache;

public final class DownloaderConstructorHelper {

    /* renamed from: a */
    private final Cache f18717a;

    /* renamed from: b */
    private final C9469i f18718b;

    /* renamed from: c */
    private final C9575z f18719c;

    /* renamed from: d */
    private final CacheDataSourceFactory f18720d;

    /* renamed from: e */
    private final CacheDataSourceFactory f18721e;

    public DownloaderConstructorHelper(Cache cache, DataSource aVar) {
        this(cache, aVar, null, null, null);
    }

    /* renamed from: a */
    public C9463d mo23021a() {
        return this.f18720d.mo24448a();
    }

    /* renamed from: b */
    public C9463d mo23022b() {
        return this.f18721e.mo24448a();
    }

    /* renamed from: c */
    public Cache mo23023c() {
        return this.f18717a;
    }

    /* renamed from: d */
    public C9469i mo23024d() {
        C9469i iVar = this.f18718b;
        return iVar != null ? iVar : C9471k.f22036a;
    }

    /* renamed from: e */
    public C9575z mo23025e() {
        C9575z zVar = this.f18719c;
        return zVar != null ? zVar : new C9575z();
    }

    public DownloaderConstructorHelper(Cache cache, DataSource aVar, DataSource aVar2, C9505a aVar3, C9575z zVar) {
        this(cache, aVar, aVar2, aVar3, zVar, null);
    }

    public DownloaderConstructorHelper(Cache cache, DataSource aVar, DataSource aVar2, C9505a aVar3, C9575z zVar, C9469i iVar) {
        DataSource aVar4;
        DataSource aVar5;
        Cache cache2 = cache;
        C9575z zVar2 = zVar;
        if (zVar2 != null) {
            DataSource aVar6 = aVar;
            aVar4 = new C9490e0(aVar, zVar2, NotificationManagerCompat.IMPORTANCE_UNSPECIFIED);
        } else {
            aVar4 = aVar;
        }
        if (aVar2 != null) {
            aVar5 = aVar2;
        } else {
            aVar5 = new C9522x();
        }
        Cache cache3 = cache;
        DataSource aVar7 = aVar5;
        C9469i iVar2 = iVar;
        CacheDataSourceFactory eVar = new CacheDataSourceFactory(cache3, aVar4, aVar7, aVar3 == null ? new C9462c(cache, 5242880) : aVar3, 1, null, iVar2);
        this.f18720d = eVar;
        CacheDataSourceFactory eVar2 = new CacheDataSourceFactory(cache3, C9519v.f22219a, aVar7, null, 1, null, iVar2);
        this.f18721e = eVar2;
        this.f18717a = cache2;
        this.f18719c = zVar2;
        this.f18718b = iVar;
    }
}
