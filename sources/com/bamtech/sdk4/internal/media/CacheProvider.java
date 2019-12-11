package com.bamtech.sdk4.internal.media;

import android.content.Context;
import com.bamtech.core.logging.LogDispatcher.DefaultImpls;
import com.bamtech.sdk4.internal.service.ServiceTransaction;
import com.google.android.exoplayer2.database.DatabaseProvider;
import com.google.android.exoplayer2.upstream.cache.C9483r;
import com.google.android.exoplayer2.upstream.cache.C9484s;
import com.google.android.exoplayer2.upstream.cache.Cache;
import java.io.File;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fJ\b\u0010\r\u001a\u00020\u000eH\u0004J\u001e\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u0013J\u0010\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\fH\u0002J\u000e\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\fR\u001a\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/media/CacheProvider;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "caches", "", "", "Lcom/google/android/exoplayer2/upstream/cache/Cache;", "calcBytesForCachedMedia", "", "cachedMedia", "Lcom/bamtech/sdk4/internal/media/ExoCachedMedia;", "finalize", "", "getCache", "transaction", "Lcom/bamtech/sdk4/internal/service/ServiceTransaction;", "databaseProvider", "Lcom/google/android/exoplayer2/database/DatabaseProvider;", "getKey", "media", "removeCache", "extension-media-exoplayer_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: CacheProvider.kt */
public final class CacheProvider {
    private final Map<String, Cache> caches = new LinkedHashMap();
    private final Context context;

    public CacheProvider(Context context2) {
        this.context = context2;
    }

    private final String getKey(ExoCachedMedia exoCachedMedia) {
        StringBuilder sb = new StringBuilder();
        sb.append(exoCachedMedia.getId());
        sb.append('_');
        Context applicationContext = this.context.getApplicationContext();
        Intrinsics.checkReturnedValueIsNotNull((Object) applicationContext, "context.applicationContext");
        sb.append(exoCachedMedia.getFileLocation(applicationContext).getCanonicalPath());
        return sb.toString();
    }

    public final long calcBytesForCachedMedia(ExoCachedMedia exoCachedMedia) {
        return exoCachedMedia.countBytesInFileLocation(this.context);
    }

    /* access modifiers changed from: protected */
    public final void finalize() {
        for (Entry value : this.caches.entrySet()) {
            ((Cache) value.getValue()).mo24478a();
        }
    }

    public final synchronized Cache getCache(ServiceTransaction serviceTransaction, ExoCachedMedia exoCachedMedia, DatabaseProvider databaseProvider) {
        Cache cache;
        Context applicationContext = this.context.getApplicationContext();
        Intrinsics.checkReturnedValueIsNotNull((Object) applicationContext, "context.applicationContext");
        File fileLocation = exoCachedMedia.getFileLocation(applicationContext);
        String key = getKey(exoCachedMedia);
        cache = (Cache) this.caches.get(key);
        if (cache == null) {
            DefaultImpls.d$default(serviceTransaction, this, "ExistingCacheNotFound", false, 4, null);
            cache = new C9484s(fileLocation, new C9483r(), databaseProvider);
            this.caches.put(key, cache);
        }
        return cache;
    }

    public final synchronized void removeCache(ExoCachedMedia exoCachedMedia) {
        String key = getKey(exoCachedMedia);
        if (this.caches.containsKey(key)) {
            Cache cache = (Cache) this.caches.get(key);
            if (cache != null) {
                cache.mo24478a();
            }
            this.caches.remove(key);
        }
    }
}
