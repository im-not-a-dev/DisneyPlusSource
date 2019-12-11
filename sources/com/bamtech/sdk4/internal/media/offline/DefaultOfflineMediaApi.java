package com.bamtech.sdk4.internal.media.offline;

import com.bamtech.sdk4.internal.event.LogoutMode;
import com.bamtech.sdk4.internal.media.CacheProvider;
import com.bamtech.sdk4.internal.service.ServiceTransaction;
import com.bamtech.sdk4.media.offline.CachedMedia;
import com.bamtech.sdk4.media.offline.DownloadSession;
import com.bamtech.sdk4.media.offline.OfflineMediaApi;
import javax.inject.Provider;
import kotlin.Metadata;
import p520io.reactivex.Completable;
import p520io.reactivex.CompletableSource;
import p520io.reactivex.SingleSource;
import p520io.reactivex.functions.Function;
import p520io.reactivex.subjects.PublishSubject;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000Ô\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002BQ\b\u0007\u0012\u0010\u0010\u0003\u001a\f\u0012\u0004\u0012\u00020\u00050\u0004j\u0002`\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u000e\b\u0001\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012¢\u0006\u0002\u0010\u0013J\u001b\u0010\u0016\u001a\u00020\u00172\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019H\u0000¢\u0006\u0002\b\u001bJ\t\u0010\u001c\u001a\u00020\u0017H\u0001J\u0016\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e2\u0006\u0010 \u001a\u00020!H\u0016J\u0017\u0010\"\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00020$0\u00190#H\u0001J\u0016\u0010%\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00020\u001a0\u00190#H\u0016J\u0016\u0010&\u001a\b\u0012\u0004\u0012\u00020\u001a0'2\u0006\u0010 \u001a\u00020!H\u0016J\u000e\u0010(\u001a\b\u0012\u0004\u0012\u00020)0#H\u0016J\u0016\u0010*\u001a\b\u0012\u0004\u0012\u00020\u001f0#2\u0006\u0010 \u001a\u00020!H\u0016J\u0017\u0010+\u001a\b\u0012\u0004\u0012\u00020$0'2\u0006\u0010,\u001a\u00020-H\u0001J\u0017\u0010+\u001a\b\u0012\u0004\u0012\u00020$0'2\u0006\u0010 \u001a\u00020!H\u0001J@\u0010.\u001a\u0004\u0018\u00010/2\u0006\u00100\u001a\u0002012\u0006\u00102\u001a\u0002032\u000e\b\u0002\u00104\u001a\b\u0012\u0004\u0012\u0002050\u00192\u000e\b\u0002\u00106\u001a\b\u0012\u0004\u0012\u0002070\u0019H\u0001¢\u0006\u0002\u00108J\u0017\u0010.\u001a\b\u0012\u0004\u0012\u00020/0'2\u0006\u00109\u001a\u00020:H\u0001J\u0019\u0010;\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u00190#H\u0000¢\u0006\u0002\b<J\b\u0010=\u001a\u00020>H\u0016J\u0017\u0010?\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00020$0\u00190#H\u0001J\r\u0010@\u001a\u00020\u0017H\u0000¢\u0006\u0002\bAJ\t\u0010B\u001a\u00020\u0017H\u0001J\r\u0010C\u001a\u00020>H\u0000¢\u0006\u0002\bDJ\u0011\u0010E\u001a\u00020\u00172\u0006\u0010F\u001a\u00020\u001aH\u0001J\u0017\u0010E\u001a\u00020\u00172\f\u0010F\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019H\u0001J\t\u0010G\u001a\u00020\u0017H\u0001J\u0011\u0010H\u001a\u00020\u00172\u0006\u0010I\u001a\u00020\u001aH\u0001J(\u0010J\u001a\u00020\u00172\u001e\u0010K\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u00190LH\u0016J\u0013\u0010M\u001a\u00020\u00172\b\b\u0002\u0010N\u001a\u00020\u0015H\u0001J\u0017\u0010O\u001a\b\u0012\u0004\u0012\u00020$0#2\u0006\u00109\u001a\u00020:H\u0001J)\u0010P\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020$0R0Q2\f\u0010S\u001a\b\u0012\u0004\u0012\u00020:0\u0019H\u0001J\r\u0010T\u001a\u00020>H\u0000¢\u0006\u0002\bUJ\u0017\u0010V\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00020$0\u00190#H\u0001J\r\u0010W\u001a\u00020\u0017H\u0000¢\u0006\u0002\bXJ\u0010\u0010Y\u001a\u00020\u00172\u0006\u0010Z\u001a\u00020)H\u0016J\u001a\u0010[\u001a\u00020\u00172\u0006\u0010Z\u001a\u00020)2\b\u0010\\\u001a\u0004\u0018\u00010]H\u0002R\u000e\u0010\u000f\u001a\u00020\u0010X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0002X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\u0003\u001a\f\u0012\u0004\u0012\u00020\u00050\u0004j\u0002`\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006^"}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/media/offline/DefaultOfflineMediaApi;", "Lcom/bamtech/sdk4/media/offline/OfflineMediaApi;", "Lcom/bamtech/sdk4/media/offline/DownloadSession;", "transactionProvider", "Ljavax/inject/Provider;", "Lcom/bamtech/sdk4/internal/service/ServiceTransaction;", "Lcom/bamtech/sdk4/internal/service/ServiceTransactionProvider;", "mediaStorage", "Lcom/bamtech/sdk4/internal/media/offline/MediaStorage;", "downloadSession", "helper", "Lcom/bamtech/sdk4/internal/media/offline/DownloadWorkManagerHelper;", "notifier", "Lio/reactivex/subjects/PublishSubject;", "Lcom/bamtech/sdk4/internal/event/LogoutMode;", "cacheProvider", "Lcom/bamtech/sdk4/internal/media/CacheProvider;", "conditionReporter", "Lcom/bamtech/sdk4/internal/media/offline/ConditionReporter;", "(Ljavax/inject/Provider;Lcom/bamtech/sdk4/internal/media/offline/MediaStorage;Lcom/bamtech/sdk4/media/offline/DownloadSession;Lcom/bamtech/sdk4/internal/media/offline/DownloadWorkManagerHelper;Lio/reactivex/subjects/PublishSubject;Lcom/bamtech/sdk4/internal/media/CacheProvider;Lcom/bamtech/sdk4/internal/media/offline/ConditionReporter;)V", "isReordering", "", "applyNewQueueOrder", "Lio/reactivex/Completable;", "newOrder", "", "Lcom/bamtech/sdk4/media/offline/CachedMedia;", "applyNewQueueOrder$plugin_offline_media_release", "cancelAllDownloads", "downloadStatusFlowable", "Lio/reactivex/Flowable;", "Lcom/bamtech/sdk4/media/offline/DownloadStatus;", "cachedMediaId", "", "getActiveDownloadTasks", "Lio/reactivex/Single;", "Lcom/bamtech/sdk4/media/offline/DownloadTask;", "getAllCachedMedia", "getCachedMedia", "Lio/reactivex/Maybe;", "getDownloadSettings", "Lcom/bamtech/sdk4/media/offline/DownloadSettings;", "getDownloadStatus", "getDownloadTask", "descriptor", "Lcom/bamtech/sdk4/media/MediaDescriptor;", "getPredictedDownloadSize", "", "mediaItem", "Lcom/bamtech/sdk4/media/MediaItem;", "constraints", "Lcom/bamtech/sdk4/media/offline/VariantConstraints;", "audioTracks", "Lcom/bamtech/sdk4/media/AudioRendition;", "subtitleTracks", "Lcom/bamtech/sdk4/media/SubtitleRendition;", "(Lcom/bamtech/sdk4/media/MediaItem;Lcom/bamtech/sdk4/media/offline/VariantConstraints;Ljava/util/List;Ljava/util/List;)Ljava/lang/Long;", "request", "Lcom/bamtech/sdk4/media/offline/DownloadRequest;", "getQueueSnapshot", "getQueueSnapshot$plugin_offline_media_release", "initialize", "", "interruptAllDownloads", "lock", "lock$plugin_offline_media_release", "removeAllCachedMedia", "removeAllLicensesOnLogout", "removeAllLicensesOnLogout$plugin_offline_media_release", "removeCachedMedia", "media", "renewAllLicenses", "renewLicense", "cachedMedia", "reorder", "queueSorter", "Lkotlin/Function1;", "resumeAllDownloads", "ignorePaused", "startDownload", "startDownloads", "Lio/reactivex/Observable;", "Lkotlin/Pair;", "requests", "startOldLicensesCleanup", "startOldLicensesCleanup$plugin_offline_media_release", "suspendAllDownloads", "unlock", "unlock$plugin_offline_media_release", "updateDownloadSettings", "settings", "updateDownloadSettingsInternal", "report", "Lcom/bamtech/sdk4/internal/media/offline/GroupStatus;", "plugin-offline-media_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: DefaultOfflineMediaApi.kt */
public final class DefaultOfflineMediaApi implements OfflineMediaApi, DownloadSession {
    private final DownloadSession downloadSession;
    /* access modifiers changed from: private */
    public final DownloadWorkManagerHelper helper;
    /* access modifiers changed from: private */
    public final MediaStorage mediaStorage;
    private final PublishSubject<LogoutMode> notifier;
    /* access modifiers changed from: private */
    public final Provider<ServiceTransaction> transactionProvider;

    @Metadata(mo31005bv = {1, 0, 3}, mo31008k = 3, mo31009mv = {1, 1, 15})
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0 = new int[LogoutMode.values().length];

        static {
            $EnumSwitchMapping$0[LogoutMode.Hard.ordinal()] = 1;
        }
    }

    public DefaultOfflineMediaApi(Provider<ServiceTransaction> provider, MediaStorage mediaStorage2, DownloadSession downloadSession2, DownloadWorkManagerHelper downloadWorkManagerHelper, PublishSubject<LogoutMode> publishSubject, CacheProvider cacheProvider, ConditionReporter conditionReporter) {
        this.transactionProvider = provider;
        this.mediaStorage = mediaStorage2;
        this.downloadSession = downloadSession2;
        this.helper = downloadWorkManagerHelper;
        this.notifier = publishSubject;
    }

    public void initialize() {
        removeAllLicensesOnLogout$plugin_offline_media_release();
        startOldLicensesCleanup$plugin_offline_media_release();
    }

    public final void removeAllLicensesOnLogout$plugin_offline_media_release() {
        this.notifier.mo30191f((Function<? super T, ? extends SingleSource<? extends R>>) new DefaultOfflineMediaApi$removeAllLicensesOnLogout$1<Object,Object>(this)).mo30191f((Function<? super T, ? extends SingleSource<? extends R>>) new DefaultOfflineMediaApi$removeAllLicensesOnLogout$2<Object,Object>(this)).mo30182d((Function<? super T, ? extends CompletableSource>) new DefaultOfflineMediaApi$removeAllLicensesOnLogout$3<Object,Object>(this)).mo30056g();
    }

    public Completable renewLicense(CachedMedia cachedMedia) {
        return this.downloadSession.renewLicense(cachedMedia);
    }

    public final void startOldLicensesCleanup$plugin_offline_media_release() {
        this.helper.startOldLicensesCleanupWork();
    }
}
