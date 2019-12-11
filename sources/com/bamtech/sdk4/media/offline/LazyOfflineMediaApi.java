package com.bamtech.sdk4.media.offline;

import com.bamtech.sdk4.internal.media.offline.DefaultOfflineMediaApi;
import com.bamtech.sdk4.service.InvalidStateException;
import com.bamtech.sdk4.service.InvalidStateException.Companion;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.C12880j;
import p520io.reactivex.Completable;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000 \u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\u0016\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\u0016\u0010\u0016\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00020\u00190\u00180\u0017H\u0016J\u0016\u0010\u001a\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00020\u001b0\u00180\u0017H\u0016J\u0016\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001d2\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\u000e\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001f0\u0017H\u0016J\u0016\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00130\u00172\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\u0016\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00190\u001d2\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J;\u0010\"\u001a\u0004\u0018\u00010#2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'2\f\u0010(\u001a\b\u0012\u0004\u0012\u00020)0\u00182\f\u0010*\u001a\b\u0012\u0004\u0012\u00020+0\u0018H\u0016¢\u0006\u0002\u0010,J\u0016\u0010\"\u001a\b\u0012\u0004\u0012\u00020#0\u001d2\u0006\u0010-\u001a\u00020.H\u0016J\u0015\u0010/\u001a\u00020\u00102\u0006\u00100\u001a\u00020\u0010H\u0000¢\u0006\u0002\b1J'\u0010/\u001a\b\u0012\u0004\u0012\u0002H20\u0012\"\u0004\b\u0000\u001022\f\u00100\u001a\b\u0012\u0004\u0012\u0002H20\u0012H\u0000¢\u0006\u0002\b1J'\u0010/\u001a\b\u0012\u0004\u0012\u0002H20\u001d\"\u0004\b\u0000\u001022\f\u00100\u001a\b\u0012\u0004\u0012\u0002H20\u001dH\u0000¢\u0006\u0002\b1J'\u0010/\u001a\b\u0012\u0004\u0012\u0002H203\"\u0004\b\u0000\u001022\f\u00100\u001a\b\u0012\u0004\u0012\u0002H203H\u0000¢\u0006\u0002\b1J'\u0010/\u001a\b\u0012\u0004\u0012\u0002H20\u0017\"\u0004\b\u0000\u001022\f\u00100\u001a\b\u0012\u0004\u0012\u0002H20\u0017H\u0000¢\u0006\u0002\b1J\b\u00104\u001a\u000205H\u0016J\u0016\u00106\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00020\u00190\u00180\u0017H\u0016J\b\u00107\u001a\u00020\u0010H\u0016J\u0010\u00108\u001a\u00020\u00102\u0006\u00109\u001a\u00020\u001bH\u0016J\u0016\u00108\u001a\u00020\u00102\f\u00109\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0018H\u0016J\b\u0010:\u001a\u00020\u0010H\u0016J\u0010\u0010;\u001a\u00020\u00102\u0006\u0010<\u001a\u00020\u001bH\u0016J(\u0010=\u001a\u00020\u00102\u001e\u0010>\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u00180?H\u0016J\u0010\u0010@\u001a\u00020\u00102\u0006\u0010A\u001a\u00020\nH\u0016J\u0016\u0010B\u001a\b\u0012\u0004\u0012\u00020\u00190\u00172\u0006\u0010-\u001a\u00020.H\u0016J(\u0010C\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00190D032\f\u0010E\u001a\b\u0012\u0004\u0012\u00020.0\u0018H\u0016J\u0016\u0010F\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00020\u00190\u00180\u0017H\u0016J\u0010\u0010G\u001a\u00020\u00102\u0006\u0010H\u001a\u00020\u001fH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006I"}, mo31007d2 = {"Lcom/bamtech/sdk4/media/offline/LazyOfflineMediaApi;", "Lcom/bamtech/sdk4/media/offline/OfflineMediaApi;", "defaultApi", "Lcom/bamtech/sdk4/internal/media/offline/DefaultOfflineMediaApi;", "(Lcom/bamtech/sdk4/internal/media/offline/DefaultOfflineMediaApi;)V", "error", "Lcom/bamtech/sdk4/service/InvalidStateException;", "getError", "()Lcom/bamtech/sdk4/service/InvalidStateException;", "initialized", "", "getInitialized", "()Z", "setInitialized", "(Z)V", "cancelAllDownloads", "Lio/reactivex/Completable;", "downloadStatusFlowable", "Lio/reactivex/Flowable;", "Lcom/bamtech/sdk4/media/offline/DownloadStatus;", "cachedMediaId", "", "getActiveDownloadTasks", "Lio/reactivex/Single;", "", "Lcom/bamtech/sdk4/media/offline/DownloadTask;", "getAllCachedMedia", "Lcom/bamtech/sdk4/media/offline/CachedMedia;", "getCachedMedia", "Lio/reactivex/Maybe;", "getDownloadSettings", "Lcom/bamtech/sdk4/media/offline/DownloadSettings;", "getDownloadStatus", "getDownloadTask", "getPredictedDownloadSize", "", "mediaItem", "Lcom/bamtech/sdk4/media/MediaItem;", "constraints", "Lcom/bamtech/sdk4/media/offline/VariantConstraints;", "audioTracks", "Lcom/bamtech/sdk4/media/AudioRendition;", "subtitleTracks", "Lcom/bamtech/sdk4/media/SubtitleRendition;", "(Lcom/bamtech/sdk4/media/MediaItem;Lcom/bamtech/sdk4/media/offline/VariantConstraints;Ljava/util/List;Ljava/util/List;)Ljava/lang/Long;", "request", "Lcom/bamtech/sdk4/media/offline/DownloadRequest;", "initializationGuard", "source", "initializationGuard$plugin_offline_media_release", "T", "Lio/reactivex/Observable;", "initialize", "", "interruptAllDownloads", "removeAllCachedMedia", "removeCachedMedia", "media", "renewAllLicenses", "renewLicense", "cachedMedia", "reorder", "queueSorter", "Lkotlin/Function1;", "resumeAllDownloads", "ignorePaused", "startDownload", "startDownloads", "Lkotlin/Pair;", "requests", "suspendAllDownloads", "updateDownloadSettings", "settings", "plugin-offline-media_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: LazyOfflineMediaApi.kt */
public final class LazyOfflineMediaApi implements OfflineMediaApi {
    private final DefaultOfflineMediaApi defaultApi;
    private final InvalidStateException error;
    private boolean initialized;

    public LazyOfflineMediaApi(DefaultOfflineMediaApi defaultOfflineMediaApi) {
        this.defaultApi = defaultOfflineMediaApi;
        Companion companion = InvalidStateException.Companion;
        UUID randomUUID = UUID.randomUUID();
        C12880j.m40222a((Object) randomUUID, "UUID.randomUUID()");
        this.error = Companion.create$default(companion, randomUUID, "offline.media.api.not.initialized", "The `OfflineMediaPlugin` requires initialization() be called first.", null, 8, null);
    }

    public final Completable initializationGuard$plugin_offline_media_release(Completable completable) {
        if (this.initialized) {
            return completable;
        }
        Completable a = Completable.m38154a((Throwable) this.error);
        C12880j.m40222a((Object) a, "Completable.error(error)");
        return a;
    }

    public void initialize() {
        this.defaultApi.initialize();
        this.initialized = true;
    }

    public Completable renewLicense(CachedMedia cachedMedia) {
        return initializationGuard$plugin_offline_media_release(this.defaultApi.renewLicense(cachedMedia));
    }
}
