package com.bamtech.sdk4.internal.media.offline;

import com.bamtech.sdk4.internal.service.ServiceTransaction;
import com.bamtech.sdk4.internal.token.AccessTokenProvider;
import com.bamtech.sdk4.media.offline.CachedMedia;
import com.bamtech.sdk4.media.offline.DownloadSession;
import com.bamtech.sdk4.plugin.ExtensionInstanceProvider;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p516i.p517a.p518a.p519a.C11902a;
import p520io.reactivex.C11907a;
import p520io.reactivex.Completable;
import p520io.reactivex.CompletableSource;
import p520io.reactivex.functions.Function;
import p520io.reactivex.p525e0.C11934b;
import p520io.reactivex.processors.PublishProcessor;
import p520io.reactivex.subjects.PublishSubject;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000Æ\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001RB=\b\u0007\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e¢\u0006\u0002\u0010\u000fJ\b\u0010\u0019\u001a\u00020\u0012H\u0016J\u0010\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u001a\u001a\u00020\u0004H\u0002J\u001d\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u001eH\u0000¢\u0006\u0002\b\u001fJX\u0010 \u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001e0\"0!2\u0006\u0010\u001a\u001a\u00020\u00042\u0012\u0010#\u001a\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020&0$2\u0012\u0010'\u001a\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020&0$2\u0012\u0010(\u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u00120$H\u0002J\u0016\u0010)\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00020\u001e0\"0*H\u0016J2\u0010)\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00020\u001e0\"0*2\u0006\u0010\u001a\u001a\u00020\u00042\u0012\u0010+\u001a\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020&0$H\u0002J\u001c\u0010,\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020%0\"0*2\u0006\u0010\u001a\u001a\u00020\u0004H\u0002J\u001e\u0010-\u001a\b\u0012\u0004\u0012\u00020%0.2\u0006\u0010\u001a\u001a\u00020\u00042\u0006\u0010/\u001a\u000200H\u0002J\u0010\u00101\u001a\u00020\u001e2\u0006\u00102\u001a\u00020%H\u0002J\u0016\u00101\u001a\b\u0012\u0004\u0012\u00020\u001e0.2\u0006\u0010/\u001a\u000200H\u0016J\u0010\u00103\u001a\u00020\u001e2\u0006\u00104\u001a\u00020%H\u0002J;\u00105\u001a\u0004\u0018\u0001062\u0006\u00107\u001a\u0002082\u0006\u00109\u001a\u00020:2\f\u0010;\u001a\b\u0012\u0004\u0012\u00020<0\"2\f\u0010=\u001a\b\u0012\u0004\u0012\u00020>0\"H\u0016¢\u0006\u0002\u0010?J\u0016\u00105\u001a\b\u0012\u0004\u0012\u0002060.2\u0006\u0010@\u001a\u00020AH\u0016J\u0016\u0010B\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00020\u001e0\"0*H\u0016J\u001e\u0010C\u001a\b\u0012\u0004\u0012\u00020%0*2\u0006\u0010\u001a\u001a\u00020\u00042\u0006\u0010@\u001a\u00020AH\u0002J\b\u0010D\u001a\u00020\u0012H\u0016J\u0010\u0010E\u001a\u00020\u00122\u0006\u00104\u001a\u00020FH\u0016J\u0016\u0010E\u001a\u00020\u00122\f\u00104\u001a\b\u0012\u0004\u0012\u00020F0\"H\u0016J\b\u0010G\u001a\u00020\u0012H\u0016J\u0010\u0010H\u001a\u00020\u00122\u0006\u00102\u001a\u00020FH\u0016J\u0010\u0010I\u001a\u00020\u00122\u0006\u0010J\u001a\u00020&H\u0016J\u0016\u0010K\u001a\b\u0012\u0004\u0012\u00020\u001e0*2\u0006\u0010@\u001a\u00020AH\u0016J(\u0010L\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u000200\u0012\u0004\u0012\u00020\u001e0N0M2\f\u0010O\u001a\b\u0012\u0004\u0012\u00020A0\"H\u0016J0\u0010P\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u000200\u0012\u0004\u0012\u00020\u001e0N0M2\u0006\u0010\u001a\u001a\u00020\u00042\f\u0010O\u001a\b\u0012\u0004\u0012\u00020A0\"H\u0002J\u0016\u0010Q\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00020\u001e0\"0*H\u0016R\u001c\u0010\u0010\u001a\u0010\u0012\f\u0012\n \u0013*\u0004\u0018\u00010\u00120\u00120\u0011X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0004¢\u0006\u0002\n\u0000R\"\u0010\u0014\u001a\u0010\u0012\f\u0012\n \u0013*\u0004\u0018\u00010\u00160\u00160\u0015X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018¨\u0006S"}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/media/offline/ExoDownloadSession;", "Lcom/bamtech/sdk4/media/offline/DownloadSession;", "transactionProvider", "Ljavax/inject/Provider;", "Lcom/bamtech/sdk4/internal/service/ServiceTransaction;", "scheduler", "Lcom/bamtech/sdk4/internal/media/offline/DownloadScheduler;", "mediaStorage", "Lcom/bamtech/sdk4/internal/media/offline/MediaStorage;", "taskFactory", "Lcom/bamtech/sdk4/internal/media/offline/DownloadTaskFactory;", "extensionProvider", "Lcom/bamtech/sdk4/plugin/ExtensionInstanceProvider;", "tokenProvider", "Lcom/bamtech/sdk4/internal/token/AccessTokenProvider;", "(Ljavax/inject/Provider;Lcom/bamtech/sdk4/internal/media/offline/DownloadScheduler;Lcom/bamtech/sdk4/internal/media/offline/MediaStorage;Lcom/bamtech/sdk4/internal/media/offline/DownloadTaskFactory;Lcom/bamtech/sdk4/plugin/ExtensionInstanceProvider;Lcom/bamtech/sdk4/internal/token/AccessTokenProvider;)V", "enqueueSubject", "Lio/reactivex/subjects/PublishSubject;", "Lio/reactivex/Completable;", "kotlin.jvm.PlatformType", "valve", "Lio/reactivex/processors/PublishProcessor;", "Lcom/bamtech/sdk4/internal/media/offline/ExoDownloadSession$ValveState;", "getValve$plugin_offline_media_release", "()Lio/reactivex/processors/PublishProcessor;", "cancelAllDownloads", "transaction", "enqueueDownloadTask", "", "downloadTask", "Lcom/bamtech/sdk4/media/offline/DownloadTask;", "enqueueDownloadTask$plugin_offline_media_release", "executeOperationWithOrder", "Lio/reactivex/Flowable;", "", "filterPredicateFirst", "Lkotlin/Function1;", "Lcom/bamtech/sdk4/internal/media/ExoCachedMedia;", "", "filterPredicateSecond", "operation", "getActiveDownloadTasks", "Lio/reactivex/Single;", "filterPredicate", "getAllCachedMedia", "getCachedMedia", "Lio/reactivex/Maybe;", "cachedMediaId", "", "getDownloadTask", "cachedMedia", "getDownloadTaskInternal", "media", "getPredictedDownloadSize", "", "mediaItem", "Lcom/bamtech/sdk4/media/MediaItem;", "constraints", "Lcom/bamtech/sdk4/media/offline/VariantConstraints;", "audioTracks", "Lcom/bamtech/sdk4/media/AudioRendition;", "subtitleTracks", "Lcom/bamtech/sdk4/media/SubtitleRendition;", "(Lcom/bamtech/sdk4/media/MediaItem;Lcom/bamtech/sdk4/media/offline/VariantConstraints;Ljava/util/List;Ljava/util/List;)Ljava/lang/Long;", "request", "Lcom/bamtech/sdk4/media/offline/DownloadRequest;", "interruptAllDownloads", "prepareCachedMedia", "removeAllCachedMedia", "removeCachedMedia", "Lcom/bamtech/sdk4/media/offline/CachedMedia;", "renewAllLicenses", "renewLicense", "resumeAllDownloads", "ignorePaused", "startDownload", "startDownloads", "Lio/reactivex/Observable;", "Lkotlin/Pair;", "requests", "startDownloadsInternal", "suspendAllDownloads", "ValveState", "plugin-offline-media_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: ExoDownloadSession.kt */
public final class ExoDownloadSession implements DownloadSession {
    private final PublishSubject<Completable> enqueueSubject;
    private final DownloadScheduler scheduler;
    private final Provider<ServiceTransaction> transactionProvider;
    private final PublishProcessor<ValveState> valve;

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/media/offline/ExoDownloadSession$ValveState;", "", "(Ljava/lang/String;I)V", "OPEN", "CLOSE", "plugin-offline-media_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
    /* compiled from: ExoDownloadSession.kt */
    public enum ValveState {
        OPEN
    }

    @Metadata(mo31005bv = {1, 0, 3}, mo31008k = 3, mo31009mv = {1, 1, 15})
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0 = new int[ValveState.values().length];

        static {
            $EnumSwitchMapping$0[ValveState.OPEN.ordinal()] = 1;
        }
    }

    public ExoDownloadSession(Provider<ServiceTransaction> provider, DownloadScheduler downloadScheduler, MediaStorage mediaStorage, DownloadTaskFactory downloadTaskFactory, ExtensionInstanceProvider extensionInstanceProvider, AccessTokenProvider accessTokenProvider) {
        this.transactionProvider = provider;
        this.scheduler = downloadScheduler;
        PublishSubject<Completable> q = PublishSubject.m38553q();
        Intrinsics.checkReturnedValueIsNotNull((Object) q, "PublishSubject.create<Completable>()");
        this.enqueueSubject = q;
        PublishProcessor<ValveState> k = PublishProcessor.m38521k();
        Intrinsics.checkReturnedValueIsNotNull((Object) k, "PublishProcessor.create<ValveState>()");
        this.valve = k;
        this.enqueueSubject.mo30135a(C11907a.BUFFER).mo30070a(C11902a.m38137a(this.valve.mo30097e(C20021.INSTANCE), true)).mo30081b((Function<? super T, ? extends CompletableSource>) C20032.INSTANCE, true, 1).mo30051b(C11934b.m38501c()).mo30056g();
    }

    public Completable renewLicense(CachedMedia cachedMedia) {
        DownloadScheduler downloadScheduler = this.scheduler;
        Object obj = this.transactionProvider.get();
        Intrinsics.checkReturnedValueIsNotNull(obj, "transactionProvider.get()");
        return downloadScheduler.renewLicense((ServiceTransaction) obj, cachedMedia);
    }
}
