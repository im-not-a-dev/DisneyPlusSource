package com.bamtech.sdk4.internal.media.offline;

import android.content.Context;
import com.bamtech.sdk4.BifThumbnailSet;
import com.bamtech.sdk4.MediaThumbnailLink;
import com.bamtech.sdk4.Presentation;
import com.bamtech.sdk4.ThumbnailResolution;
import com.bamtech.sdk4.bookmarks.storage.LocalBookmarkStore;
import com.bamtech.sdk4.internal.media.CacheProvider;
import com.bamtech.sdk4.internal.media.CachedMediaItem;
import com.bamtech.sdk4.internal.media.LocalPlayheadStore;
import com.bamtech.sdk4.internal.service.ServiceTransaction;
import com.bamtech.sdk4.media.MediaDescriptor;
import com.bamtech.sdk4.media.MediaItem;
import com.bamtech.sdk4.media.PlaybackContext;
import com.bamtech.sdk4.media.Playhead;
import com.bamtech.sdk4.media.offline.DownloadSession;
import com.bamtech.sdk4.media.offline.LicenseStatus;
import com.bamtech.sdk4.service.InvalidStateException;
import com.bamtech.sdk4.service.InvalidStateException.Companion;
import com.google.android.exoplayer2.database.DatabaseProvider;
import java.io.File;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.jvm.internal.C12880j;
import p520io.reactivex.Completable;
import p520io.reactivex.Maybe;
import p520io.reactivex.MaybeSource;
import p520io.reactivex.ObservableSource;
import p520io.reactivex.Single;
import p520io.reactivex.functions.Consumer;
import p520io.reactivex.functions.Function;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B7\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0002\u0010\u000eJ8\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0016\u0010\u0017\u001a\u0012\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00190\u0018j\u0002`\u001aH\u0016JD\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001e0\u001d0\u001c2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0016\u0010\u0017\u001a\u0012\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00190\u0018j\u0002`\u001aH\u0016J&\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00190$2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010%\u001a\u00020&2\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J,\u0010'\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001e0\u001d0$2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010%\u001a\u00020&2\u0006\u0010(\u001a\u00020)H\u0016J(\u0010*\u001a\b\u0012\u0004\u0012\u00020)0\u001c2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010+\u001a\u00020,2\b\u0010-\u001a\u0004\u0018\u00010.H\u0016J6\u0010/\u001a\b\u0012\u0004\u0012\u0002000\u001c2\u0006\u0010\u0011\u001a\u00020\u00122\u0016\u0010\u0017\u001a\u0012\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00190\u0018j\u0002`\u001a2\u0006\u00101\u001a\u00020\u0019H\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u00062"}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/media/offline/DefaultOfflineMediaClient;", "Lcom/bamtech/sdk4/internal/media/offline/OfflineMediaClient;", "mediaStorage", "Lcom/bamtech/sdk4/internal/media/offline/MediaStorage;", "localPlayheadStore", "Lcom/bamtech/sdk4/internal/media/LocalPlayheadStore;", "cacheProvider", "Lcom/bamtech/sdk4/internal/media/CacheProvider;", "databaseProvider", "Lcom/google/android/exoplayer2/database/DatabaseProvider;", "localBookmarkStore", "Lcom/bamtech/sdk4/bookmarks/storage/LocalBookmarkStore;", "downloadSession", "Lcom/bamtech/sdk4/media/offline/DownloadSession;", "(Lcom/bamtech/sdk4/internal/media/offline/MediaStorage;Lcom/bamtech/sdk4/internal/media/LocalPlayheadStore;Lcom/bamtech/sdk4/internal/media/CacheProvider;Lcom/google/android/exoplayer2/database/DatabaseProvider;Lcom/bamtech/sdk4/bookmarks/storage/LocalBookmarkStore;Lcom/bamtech/sdk4/media/offline/DownloadSession;)V", "downloadBifThumbnail", "Lio/reactivex/Completable;", "transaction", "Lcom/bamtech/sdk4/internal/service/ServiceTransaction;", "presentation", "Lcom/bamtech/sdk4/Presentation;", "filePath", "Ljava/io/File;", "tokenMap", "", "", "Lcom/bamtech/sdk4/internal/service/TokenMap;", "getBifThumbnails", "Lio/reactivex/Maybe;", "", "Lcom/bamtech/sdk4/BifThumbnailSet;", "thumbnailLink", "Lcom/bamtech/sdk4/MediaThumbnailLink;", "resolution", "Lcom/bamtech/sdk4/ThumbnailResolution;", "getLocalBifThumbnail", "Lio/reactivex/Single;", "context", "Landroid/content/Context;", "getLocalBifThumbnailSets", "mediaItem", "Lcom/bamtech/sdk4/media/MediaItem;", "getMediaItem", "descriptor", "Lcom/bamtech/sdk4/media/MediaDescriptor;", "playbackContext", "Lcom/bamtech/sdk4/media/PlaybackContext;", "getPlayhead", "Lcom/bamtech/sdk4/media/Playhead;", "profileId", "plugin-offline-media_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: DefaultOfflineMediaClient.kt */
public final class DefaultOfflineMediaClient implements OfflineMediaClient {
    /* access modifiers changed from: private */
    public final CacheProvider cacheProvider;
    /* access modifiers changed from: private */
    public final DatabaseProvider databaseProvider;
    /* access modifiers changed from: private */
    public final DownloadSession downloadSession;
    /* access modifiers changed from: private */
    public final LocalBookmarkStore localBookmarkStore;
    /* access modifiers changed from: private */
    public final LocalPlayheadStore localPlayheadStore;
    /* access modifiers changed from: private */
    public final MediaStorage mediaStorage;

    @Metadata(mo31005bv = {1, 0, 3}, mo31008k = 3, mo31009mv = {1, 1, 15})
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0 = new int[LicenseStatus.values().length];

        static {
            $EnumSwitchMapping$0[LicenseStatus.ACTIVE.ordinal()] = 1;
        }
    }

    public DefaultOfflineMediaClient(MediaStorage mediaStorage2, LocalPlayheadStore localPlayheadStore2, CacheProvider cacheProvider2, DatabaseProvider databaseProvider2, LocalBookmarkStore localBookmarkStore2, DownloadSession downloadSession2) {
        this.mediaStorage = mediaStorage2;
        this.localPlayheadStore = localPlayheadStore2;
        this.cacheProvider = cacheProvider2;
        this.databaseProvider = databaseProvider2;
        this.localBookmarkStore = localBookmarkStore2;
        this.downloadSession = downloadSession2;
    }

    public Completable downloadBifThumbnail(ServiceTransaction serviceTransaction, Presentation presentation, File file, Map<String, String> map) {
        Completable a = Completable.m38154a((Throwable) Companion.create$default(InvalidStateException.Companion, serviceTransaction.getId(), "invalid-media-state", "online method called on offline instance", null, 8, null));
        C12880j.m40222a((Object) a, "Completable.error(Invali…ed on offline instance\"))");
        return a;
    }

    public Maybe<List<BifThumbnailSet>> getBifThumbnails(ServiceTransaction serviceTransaction, MediaThumbnailLink mediaThumbnailLink, ThumbnailResolution thumbnailResolution, Map<String, String> map) {
        Maybe<List<BifThumbnailSet>> a = Maybe.m38255a((Throwable) Companion.create$default(InvalidStateException.Companion, serviceTransaction.getId(), "invalid-media-state", "online method called on offline instance", null, 8, null));
        C12880j.m40222a((Object) a, "Maybe.error(InvalidState…ed on offline instance\"))");
        return a;
    }

    public Single<String> getLocalBifThumbnail(ServiceTransaction serviceTransaction, Context context, Presentation presentation) {
        Single<String> d = this.mediaStorage.get(serviceTransaction, C12833x.m40163b(C12833x.m40139a((String) C13199w.m40589f(presentation.getPaths()), "file://", (String) null, 2, (Object) null), ".", (String) null, 2, (Object) null)).mo30128d(new DefaultOfflineMediaClient$getLocalBifThumbnail$1(context, presentation));
        C12880j.m40222a((Object) d, "mediaStorage.get(transac…)\n            }\n        }");
        return d;
    }

    public Single<List<BifThumbnailSet>> getLocalBifThumbnailSets(ServiceTransaction serviceTransaction, Context context, MediaItem mediaItem) {
        CachedMediaItem cachedMediaItem = (CachedMediaItem) mediaItem;
        Single<List<BifThumbnailSet>> g = this.mediaStorage.get(serviceTransaction, mediaItem.getDescriptor().getCachedMediaId()).mo30131f(DefaultOfflineMediaClient$getLocalBifThumbnailSets$1.INSTANCE).mo30125c((Function<? super T, ? extends ObservableSource<? extends R>>) new DefaultOfflineMediaClient$getLocalBifThumbnailSets$2<Object,Object>(context)).mo30201k().mo30233g(DefaultOfflineMediaClient$getLocalBifThumbnailSets$3.INSTANCE);
        C12880j.m40222a((Object) g, "mediaStorage.get(transac…oList()\n                }");
        return g;
    }

    public Maybe<MediaItem> getMediaItem(ServiceTransaction serviceTransaction, MediaDescriptor mediaDescriptor, PlaybackContext playbackContext) {
        Maybe<MediaItem> b = this.mediaStorage.get(serviceTransaction, mediaDescriptor.getCachedMediaId()).mo30131f(new DefaultOfflineMediaClient$getMediaItem$1(this, serviceTransaction)).mo30103a((Function<? super T, ? extends MaybeSource<? extends R>>) new DefaultOfflineMediaClient$getMediaItem$2<Object,Object>(this)).mo30131f(new DefaultOfflineMediaClient$getMediaItem$3(this, serviceTransaction, mediaDescriptor)).mo30123c((Consumer<? super T>) new DefaultOfflineMediaClient$getMediaItem$4<Object>(serviceTransaction)).mo30115b((MaybeSource<? extends T>) Maybe.m38256a((Callable<? extends MaybeSource<? extends T>>) new DefaultOfflineMediaClient$getMediaItem$5<Object>(serviceTransaction)));
        C12880j.m40222a((Object) b, "mediaStorage.get(transac…tem>()\n                })");
        return b;
    }

    public Maybe<Playhead> getPlayhead(ServiceTransaction serviceTransaction, Map<String, String> map, String str) {
        Maybe<Playhead> h = Maybe.m38259h();
        C12880j.m40222a((Object) h, "Maybe.empty()");
        return h;
    }
}
