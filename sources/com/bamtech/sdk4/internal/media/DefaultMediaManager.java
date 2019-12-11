package com.bamtech.sdk4.internal.media;

import android.content.Context;
import com.bamtech.sdk4.BifThumbnailSet;
import com.bamtech.sdk4.Presentation;
import com.bamtech.sdk4.bookmarks.storage.LocalBookmarkStore;
import com.bamtech.sdk4.internal.media.MediaClient.DefaultImpls;
import com.bamtech.sdk4.internal.media.adengine.AdEngineManager;
import com.bamtech.sdk4.internal.media.adengine.AdEngineTrackingDataKt;
import com.bamtech.sdk4.internal.media.offline.OfflineMediaClient;
import com.bamtech.sdk4.internal.service.ServiceTransaction;
import com.bamtech.sdk4.internal.token.AccessTokenProvider;
import com.bamtech.sdk4.media.DefaultQOSPlaybackEventListener;
import com.bamtech.sdk4.media.MediaDescriptor;
import com.bamtech.sdk4.media.MediaItem;
import com.bamtech.sdk4.media.PlaybackContext;
import com.bamtech.sdk4.media.Playhead;
import com.bamtech.sdk4.media.QOSNetworkHelper;
import com.bamtech.sdk4.plugin.ExtensionInstanceProvider;
import com.bamtech.sdk4.service.NotFoundException;
import com.bamtech.sdk4.session.SessionInfoExtension;
import java.io.File;
import java.util.List;
import javax.inject.Provider;
import kotlin.C12898l;
import kotlin.Metadata;
import kotlin.jvm.internal.C12880j;
import kotlin.p584g0.C12747c;
import p520io.reactivex.Completable;
import p520io.reactivex.Maybe;
import p520io.reactivex.MaybeSource;
import p520io.reactivex.Single;
import p520io.reactivex.SingleSource;
import p520io.reactivex.functions.Consumer;
import p520io.reactivex.functions.Function;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B_\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013\u0012\u0006\u0010\u0015\u001a\u00020\u0016¢\u0006\u0002\u0010\u0017J\u000e\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0019J\u001e\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!H\u0016J$\u0010\"\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020$0#0\u001c2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010%\u001a\u00020&H\u0016J-\u0010'\u001a\b\u0012\u0004\u0012\u00020&0(2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010)\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010,H\u0000¢\u0006\u0002\b-J*\u0010.\u001a\n\u0012\u0006\b\u0001\u0012\u00020&0\u001c2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010)\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010,H\u0016J/\u0010/\u001a\b\u0012\u0004\u0012\u00020&0(2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010)\u001a\u00020*2\n\b\u0002\u0010+\u001a\u0004\u0018\u00010,H\u0000¢\u0006\u0002\b0J \u00101\u001a\n\u0012\u0006\b\u0001\u0012\u00020&0\u001c2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010%\u001a\u000202H\u0002J\u0014\u00103\u001a\u00020&*\u0002022\b\u00104\u001a\u0004\u0018\u000105R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000¨\u00066"}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/media/DefaultMediaManager;", "Lcom/bamtech/sdk4/internal/media/MediaManager;", "onlineMediaClient", "Lcom/bamtech/sdk4/internal/media/MediaClient;", "extensionInstanceProvider", "Lcom/bamtech/sdk4/plugin/ExtensionInstanceProvider;", "tokenProvider", "Lcom/bamtech/sdk4/internal/token/AccessTokenProvider;", "context", "Landroid/content/Context;", "adEngineManager", "Lcom/bamtech/sdk4/internal/media/adengine/AdEngineManager;", "localPlayheadStore", "Lcom/bamtech/sdk4/internal/media/LocalPlayheadStore;", "sessionInfoExtension", "Lcom/bamtech/sdk4/session/SessionInfoExtension;", "defaultQosPlaybackEventListener", "Lcom/bamtech/sdk4/media/DefaultQOSPlaybackEventListener;", "localBookmarkStore", "Ljavax/inject/Provider;", "Lcom/bamtech/sdk4/bookmarks/storage/LocalBookmarkStore;", "qosNetworkHelper", "Lcom/bamtech/sdk4/media/QOSNetworkHelper;", "(Lcom/bamtech/sdk4/internal/media/MediaClient;Lcom/bamtech/sdk4/plugin/ExtensionInstanceProvider;Lcom/bamtech/sdk4/internal/token/AccessTokenProvider;Landroid/content/Context;Lcom/bamtech/sdk4/internal/media/adengine/AdEngineManager;Lcom/bamtech/sdk4/internal/media/LocalPlayheadStore;Lcom/bamtech/sdk4/session/SessionInfoExtension;Lcom/bamtech/sdk4/media/DefaultQOSPlaybackEventListener;Ljavax/inject/Provider;Lcom/bamtech/sdk4/media/QOSNetworkHelper;)V", "generateEmptyBifFile", "Ljava/io/File;", "directory", "getBifThumbnail", "Lio/reactivex/Single;", "", "transaction", "Lcom/bamtech/sdk4/internal/service/ServiceTransaction;", "presentation", "Lcom/bamtech/sdk4/Presentation;", "getBifThumbnailSets", "", "Lcom/bamtech/sdk4/BifThumbnailSet;", "mediaItem", "Lcom/bamtech/sdk4/media/MediaItem;", "getCachedItem", "Lio/reactivex/Maybe;", "mediaDescriptor", "Lcom/bamtech/sdk4/media/MediaDescriptor;", "playbackContext", "Lcom/bamtech/sdk4/media/PlaybackContext;", "getCachedItem$sdk_core_api_release", "getMediaItem", "getOnlineItem", "getOnlineItem$sdk_core_api_release", "setAdEngineToken", "Lcom/bamtech/sdk4/internal/media/OnlineMediaItem;", "replacePlayheadIfNewer", "other", "Lcom/bamtech/sdk4/media/MediaPlayhead;", "sdk-core-api_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: MediaManager.kt */
public final class DefaultMediaManager implements MediaManager {
    private final AdEngineManager adEngineManager;
    /* access modifiers changed from: private */
    public final Context context;
    /* access modifiers changed from: private */
    public final DefaultQOSPlaybackEventListener defaultQosPlaybackEventListener;
    private final ExtensionInstanceProvider extensionInstanceProvider;
    /* access modifiers changed from: private */
    public final Provider<LocalBookmarkStore> localBookmarkStore;
    /* access modifiers changed from: private */
    public final LocalPlayheadStore localPlayheadStore;
    /* access modifiers changed from: private */
    public final MediaClient onlineMediaClient;
    /* access modifiers changed from: private */
    public final SessionInfoExtension sessionInfoExtension;
    /* access modifiers changed from: private */
    public final AccessTokenProvider tokenProvider;

    public DefaultMediaManager(MediaClient mediaClient, ExtensionInstanceProvider extensionInstanceProvider2, AccessTokenProvider accessTokenProvider, Context context2, AdEngineManager adEngineManager2, LocalPlayheadStore localPlayheadStore2, SessionInfoExtension sessionInfoExtension2, DefaultQOSPlaybackEventListener defaultQOSPlaybackEventListener, Provider<LocalBookmarkStore> provider, QOSNetworkHelper qOSNetworkHelper) {
        this.onlineMediaClient = mediaClient;
        this.extensionInstanceProvider = extensionInstanceProvider2;
        this.tokenProvider = accessTokenProvider;
        this.context = context2;
        this.adEngineManager = adEngineManager2;
        this.localPlayheadStore = localPlayheadStore2;
        this.sessionInfoExtension = sessionInfoExtension2;
        this.defaultQosPlaybackEventListener = defaultQOSPlaybackEventListener;
        this.localBookmarkStore = provider;
    }

    /* access modifiers changed from: private */
    public final Single<? extends MediaItem> setAdEngineToken(ServiceTransaction serviceTransaction, OnlineMediaItem onlineMediaItem) {
        Completable completable;
        boolean isAdEngine = onlineMediaItem.isAdEngine();
        if (isAdEngine) {
            completable = this.adEngineManager.updateCookies(serviceTransaction, AdEngineTrackingDataKt.parseTrackingData(onlineMediaItem));
        } else if (!isAdEngine) {
            completable = Completable.m38169h();
            C12880j.m40222a((Object) completable, "Completable.complete()");
        } else {
            throw new C12898l();
        }
        Single<? extends MediaItem> a = completable.mo30044a((SingleSource<T>) Single.m38399b(onlineMediaItem));
        C12880j.m40222a((Object) a, "when (mediaItem.isAdEngi…n(Single.just(mediaItem))");
        return a;
    }

    public final synchronized File generateEmptyBifFile(File file) {
        File file2;
        do {
            StringBuilder sb = new StringBuilder();
            sb.append("thumbnail");
            sb.append(System.currentTimeMillis());
            sb.append('_');
            sb.append(C12747c.f29414b.mo31066a());
            sb.append(".bif");
            file2 = new File(file, sb.toString());
        } while (file2.exists());
        file2.createNewFile();
        return file2;
    }

    public Single<String> getBifThumbnail(ServiceTransaction serviceTransaction, Presentation presentation) {
        if (MediaManagerKt.isLocalFile(presentation)) {
            OfflineMediaClient offlineMediaClient = (OfflineMediaClient) this.extensionInstanceProvider.get(OfflineMediaClient.class);
            if (offlineMediaClient != null) {
                Context context2 = this.context;
                if (context2 != null) {
                    Single<String> localBifThumbnail = offlineMediaClient.getLocalBifThumbnail(serviceTransaction, context2, presentation);
                    if (localBifThumbnail != null) {
                        return localBifThumbnail;
                    }
                } else {
                    C12880j.m40220a();
                    throw null;
                }
            }
            Single<String> b = Single.m38399b("");
            C12880j.m40222a((Object) b, "Single.just(\"\")");
            return b;
        }
        Single<String> a = this.tokenProvider.getAccessToken(serviceTransaction).mo30208a((Function<? super T, ? extends SingleSource<? extends R>>) new DefaultMediaManager$getBifThumbnail$1<Object,Object>(this, serviceTransaction, presentation));
        C12880j.m40222a((Object) a, "tokenProvider.getAccessT…h))\n                    }");
        return a;
    }

    public Single<List<BifThumbnailSet>> getBifThumbnailSets(ServiceTransaction serviceTransaction, MediaItem mediaItem) {
        Single<List<BifThumbnailSet>> single;
        if (mediaItem instanceof OnlineMediaItem) {
            Single<List<BifThumbnailSet>> g = this.tokenProvider.getAccessToken(serviceTransaction).mo30221c((Function<? super T, ? extends MaybeSource<? extends R>>) new DefaultMediaManager$getBifThumbnailSets$1<Object,Object>(this, mediaItem, serviceTransaction)).mo30134g();
            C12880j.m40222a((Object) g, "tokenProvider.getAccessT…              .toSingle()");
            return g;
        }
        OfflineMediaClient offlineMediaClient = (OfflineMediaClient) this.extensionInstanceProvider.get(OfflineMediaClient.class);
        if (offlineMediaClient == null) {
            single = Single.m38399b(C13185o.m40513a());
            C12880j.m40222a((Object) single, "Single.just(listOf())");
        } else {
            Context context2 = this.context;
            if (context2 != null) {
                single = offlineMediaClient.getLocalBifThumbnailSets(serviceTransaction, context2, mediaItem);
            } else {
                C12880j.m40220a();
                throw null;
            }
        }
        return single;
    }

    public final Maybe<MediaItem> getCachedItem$sdk_core_api_release(ServiceTransaction serviceTransaction, MediaDescriptor mediaDescriptor, PlaybackContext playbackContext) {
        OfflineMediaClient offlineMediaClient = (OfflineMediaClient) this.extensionInstanceProvider.get(OfflineMediaClient.class);
        if (offlineMediaClient == null) {
            Maybe<MediaItem> h = Maybe.m38259h();
            C12880j.m40222a((Object) h, "Maybe.empty<MediaItem>()");
            return h;
        }
        Maybe d = DefaultImpls.getMediaItem$default(offlineMediaClient, serviceTransaction, mediaDescriptor, null, 4, null).mo30128d(new DefaultMediaManager$getCachedItem$1(this, serviceTransaction)).mo30221c((Function<? super T, ? extends MaybeSource<? extends R>>) new DefaultMediaManager$getCachedItem$2<Object,Object>(this, serviceTransaction, mediaDescriptor)).mo30123c((Consumer<? super T>) new DefaultMediaManager$getCachedItem$3<Object>(this, serviceTransaction)).mo30127d();
        Playhead playhead = new Playhead(mediaDescriptor.getCachedMediaId(), 0, 0, "");
        Maybe<MediaItem> c = d.mo30115b((MaybeSource<? extends T>) Maybe.m38258c(playhead)).mo30103a((Function<? super T, ? extends MaybeSource<? extends R>>) new DefaultMediaManager$getCachedItem$4<Object,Object>(offlineMediaClient, serviceTransaction, mediaDescriptor)).mo30123c((Consumer<? super T>) new DefaultMediaManager$getCachedItem$5<Object>(this, playbackContext, mediaDescriptor));
        C12880j.m40222a((Object) c, "offlineMediaClient.getMe…                        }");
        return c;
    }

    public Single<? extends MediaItem> getMediaItem(ServiceTransaction serviceTransaction, MediaDescriptor mediaDescriptor, PlaybackContext playbackContext) {
        Maybe b = getCachedItem$sdk_core_api_release(serviceTransaction, mediaDescriptor, playbackContext).mo30115b((MaybeSource<? extends T>) getOnlineItem$sdk_core_api_release(serviceTransaction, mediaDescriptor, playbackContext));
        NotFoundException notFoundException = new NotFoundException(serviceTransaction.getId(), null, null, 6, null);
        Single<? extends MediaItem> a = b.mo30109a((SingleSource<? extends T>) Single.m38395a((Throwable) notFoundException));
        C12880j.m40222a((Object) a, "getCachedItem(transactio…ception(transaction.id)))");
        return a;
    }

    public final Maybe<MediaItem> getOnlineItem$sdk_core_api_release(ServiceTransaction serviceTransaction, MediaDescriptor mediaDescriptor, PlaybackContext playbackContext) {
        Maybe<MediaItem> c = this.onlineMediaClient.getMediaItem(serviceTransaction, mediaDescriptor, playbackContext).mo30131f(new DefaultMediaManager$getOnlineItem$1(this, serviceTransaction)).mo30123c((Consumer<? super T>) new DefaultMediaManager$getOnlineItem$2<Object>(this, serviceTransaction));
        C12880j.m40222a((Object) c, "onlineMediaClient.getMed…n, it)\n\n                }");
        return c;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0047, code lost:
        if (r4.isAfter((org.joda.time.ReadableInstant) r0.getPlayhead().getLastUpdated()) != false) goto L_0x004f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.bamtech.sdk4.media.MediaItem replacePlayheadIfNewer(com.bamtech.sdk4.internal.media.OnlineMediaItem r8, com.bamtech.sdk4.media.MediaPlayhead r9) {
        /*
            r7 = this;
            com.bamtech.sdk4.internal.media.Stream r0 = r8.getStream()
            com.bamtech.sdk4.media.MediaPlayhead r1 = r0.getPlayhead()
            r2 = 1
            r3 = 0
            if (r1 != 0) goto L_0x0019
            if (r9 == 0) goto L_0x0019
            org.joda.time.DateTime r1 = r9.getLastUpdated()
            if (r1 == 0) goto L_0x0019
            r9.getPosition()
            r1 = 1
            goto L_0x001a
        L_0x0019:
            r1 = 0
        L_0x001a:
            com.bamtech.sdk4.media.MediaPlayhead r4 = r0.getPlayhead()
            r5 = 0
            if (r4 == 0) goto L_0x004e
            com.bamtech.sdk4.media.MediaPlayhead r4 = r0.getPlayhead()
            org.joda.time.DateTime r4 = r4.getLastUpdated()
            if (r4 == 0) goto L_0x004e
            if (r9 == 0) goto L_0x0032
            org.joda.time.DateTime r4 = r9.getLastUpdated()
            goto L_0x0033
        L_0x0032:
            r4 = r5
        L_0x0033:
            if (r4 == 0) goto L_0x004e
            org.joda.time.DateTime r4 = r9.getLastUpdated()
            if (r4 == 0) goto L_0x004a
            com.bamtech.sdk4.media.MediaPlayhead r6 = r0.getPlayhead()
            org.joda.time.DateTime r6 = r6.getLastUpdated()
            boolean r4 = r4.isAfter(r6)
            if (r4 == 0) goto L_0x004e
            goto L_0x004f
        L_0x004a:
            kotlin.jvm.internal.C12880j.m40220a()
            throw r5
        L_0x004e:
            r2 = 0
        L_0x004f:
            if (r1 != 0) goto L_0x0053
            if (r2 == 0) goto L_0x006a
        L_0x0053:
            com.bamtech.sdk4.internal.media.Stream r1 = new com.bamtech.sdk4.internal.media.Stream
            com.bamtech.sdk4.internal.media.HlsPlaylists r2 = r0.getHlsPlaylists()
            java.util.Map r3 = r0.getTracking()
            if (r9 == 0) goto L_0x006b
            com.bamtech.sdk4.MediaThumbnailLinks r0 = r0.getThumbnails()
            r1.<init>(r2, r3, r9, r0)
            com.bamtech.sdk4.internal.media.OnlineMediaItem r8 = r8.copy(r1)
        L_0x006a:
            return r8
        L_0x006b:
            kotlin.jvm.internal.C12880j.m40220a()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bamtech.sdk4.internal.media.DefaultMediaManager.replacePlayheadIfNewer(com.bamtech.sdk4.internal.media.OnlineMediaItem, com.bamtech.sdk4.media.MediaPlayhead):com.bamtech.sdk4.media.MediaItem");
    }
}
