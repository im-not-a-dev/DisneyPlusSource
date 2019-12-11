package com.bamtech.sdk4.internal.media.offline;

import android.content.Context;
import android.net.Uri;
import com.bamtech.sdk4.internal.media.CacheProvider;
import com.bamtech.sdk4.internal.media.ExoCachedMedia;
import com.bamtech.sdk4.internal.media.offline.p047db.CachedMediaEntry;
import com.bamtech.sdk4.internal.media.offline.p047db.CachedMediaEntryKt;
import com.bamtech.sdk4.internal.media.offline.p047db.OfflineDatabase;
import com.bamtech.sdk4.internal.media.offline.workers.DefaultDownload;
import com.bamtech.sdk4.internal.media.offline.workers.Download;
import com.bamtech.sdk4.internal.service.ServiceTransaction;
import com.bamtech.shadow.dagger.Lazy;
import com.google.android.exoplayer2.database.DatabaseProvider;
import com.google.android.exoplayer2.offline.Downloader;
import com.google.android.exoplayer2.offline.DownloaderConstructorHelper;
import com.google.android.exoplayer2.source.hls.p377r.C9195a;
import com.google.android.exoplayer2.upstream.C9515r;
import com.google.android.exoplayer2.upstream.TransferListener;
import com.google.android.exoplayer2.upstream.cache.Cache;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.C12880j;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J2\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0010\u0010\u000b\u001a\f\u0012\u0004\u0012\u00020\r0\fj\u0002`\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0007J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0014H\u0007J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0007J*\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\b\b\u0001\u0010\u001d\u001a\u00020\u00032\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u0018\u0010 \u001a\u00020!2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\"\u001a\u00020\u001aH\u0007J\u0016\u0010\u001e\u001a\u00020\u001f2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160#H\u0007R\u0014\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006$"}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/media/offline/DownloadSessionModule;", "", "mediaId", "", "(Ljava/lang/String;)V", "getMediaId$plugin_offline_media_release", "()Ljava/lang/String;", "cache", "Lcom/google/android/exoplayer2/upstream/cache/Cache;", "cacheProvider", "Lcom/bamtech/sdk4/internal/media/CacheProvider;", "transactionProvider", "Ljavax/inject/Provider;", "Lcom/bamtech/sdk4/internal/service/ServiceTransaction;", "Lcom/bamtech/sdk4/internal/service/ServiceTransactionProvider;", "cachedMedia", "Lcom/bamtech/sdk4/internal/media/ExoCachedMedia;", "databaseProvider", "Lcom/google/android/exoplayer2/database/DatabaseProvider;", "database", "Lcom/bamtech/sdk4/internal/media/offline/db/OfflineDatabase;", "download", "Lcom/bamtech/sdk4/internal/media/offline/workers/Download;", "downloadManager", "Lcom/bamtech/sdk4/internal/media/offline/workers/DefaultDownload;", "downloadConstructorHelper", "Lcom/google/android/exoplayer2/offline/DownloaderConstructorHelper;", "context", "Landroid/content/Context;", "userAgent", "transferListener", "Lcom/google/android/exoplayer2/upstream/TransferListener;", "downloader", "Lcom/google/android/exoplayer2/offline/Downloader;", "helper", "Lcom/bamtech/shadow/dagger/Lazy;", "plugin-offline-media_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: DownloadSessionSubcomponent.kt */
public final class DownloadSessionModule {
    private final String mediaId;

    public DownloadSessionModule(String str) {
        this.mediaId = str;
    }

    public final Cache cache(CacheProvider cacheProvider, Provider<ServiceTransaction> provider, ExoCachedMedia exoCachedMedia, DatabaseProvider databaseProvider) {
        Object obj = provider.get();
        C12880j.m40222a(obj, "transactionProvider.get()");
        return cacheProvider.getCache((ServiceTransaction) obj, exoCachedMedia, databaseProvider);
    }

    public final ExoCachedMedia cachedMedia(OfflineDatabase offlineDatabase) {
        CachedMediaEntry byId = offlineDatabase.cachedMediaDao().getById(this.mediaId);
        if (byId != null) {
            ExoCachedMedia cachedMedia = CachedMediaEntryKt.toCachedMedia(byId);
            if (cachedMedia != null) {
                return cachedMedia;
            }
        }
        throw new IllegalArgumentException("Media not found");
    }

    public final Download download(DefaultDownload defaultDownload) {
        return defaultDownload;
    }

    public final DownloaderConstructorHelper downloadConstructorHelper(Context context, String str, TransferListener transferListener, Cache cache) {
        return new DownloaderConstructorHelper(cache, new C9515r(context.getApplicationContext(), str, transferListener));
    }

    public final Downloader downloader(ExoCachedMedia exoCachedMedia, DownloaderConstructorHelper downloaderConstructorHelper) {
        return new C9195a(Uri.parse(exoCachedMedia.getMasterPlaylist()), exoCachedMedia.getRenditionKeys(), downloaderConstructorHelper);
    }

    public final TransferListener transferListener(Lazy<Download> lazy) {
        return new DownloadSessionModule$transferListener$1(lazy);
    }
}
