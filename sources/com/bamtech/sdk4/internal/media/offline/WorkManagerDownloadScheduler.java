package com.bamtech.sdk4.internal.media.offline;

import android.content.Context;
import com.bamtech.sdk4.internal.media.ExoCachedMedia;
import com.bamtech.sdk4.internal.service.ServiceTransaction;
import com.bamtech.sdk4.internal.token.AccessTokenProvider;
import com.bamtech.sdk4.media.offline.CachedMedia;
import com.bamtech.sdk4.media.offline.DownloadSettings;
import com.bamtech.sdk4.plugin.ExtensionInstanceProvider;
import com.bamtech.sdk4.service.ServiceException;
import java.io.IOException;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.jvm.internal.C12880j;
import org.reactivestreams.C14313b;
import p520io.reactivex.Completable;
import p520io.reactivex.CompletableSource;
import p520io.reactivex.Single;
import p520io.reactivex.SingleSource;
import p520io.reactivex.functions.Consumer;
import p520io.reactivex.functions.Function;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0002\b\b\b\u0007\u0018\u0000 (2\u00020\u0001:\u0001(B7\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0002\u0010\u000eJ\u0018\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J&\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u00162\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0017H\u0016J \u0010\u001b\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J0\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020\u0017H\u0002J\u0018\u0010$\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u0018\u0010%\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u0010\u0010&\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u0018\u0010'\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0016R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006)"}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/media/offline/WorkManagerDownloadScheduler;", "Lcom/bamtech/sdk4/internal/media/offline/DownloadScheduler;", "workManagerHelper", "Lcom/bamtech/sdk4/internal/media/offline/DownloadWorkManagerHelper;", "exoCachedMediaHelper", "Lcom/bamtech/sdk4/internal/media/offline/ExoCachedMediaHelper;", "mediaStorage", "Lcom/bamtech/sdk4/internal/media/offline/MediaStorage;", "tokenProvider", "Lcom/bamtech/sdk4/internal/token/AccessTokenProvider;", "context", "Landroid/content/Context;", "extensionProvider", "Lcom/bamtech/sdk4/plugin/ExtensionInstanceProvider;", "(Lcom/bamtech/sdk4/internal/media/offline/DownloadWorkManagerHelper;Lcom/bamtech/sdk4/internal/media/offline/ExoCachedMediaHelper;Lcom/bamtech/sdk4/internal/media/offline/MediaStorage;Lcom/bamtech/sdk4/internal/token/AccessTokenProvider;Landroid/content/Context;Lcom/bamtech/sdk4/plugin/ExtensionInstanceProvider;)V", "cancelDownload", "Lio/reactivex/Completable;", "transaction", "Lcom/bamtech/sdk4/internal/service/ServiceTransaction;", "media", "Lcom/bamtech/sdk4/media/offline/CachedMedia;", "isQueueFull", "Lio/reactivex/Single;", "", "settings", "Lcom/bamtech/sdk4/media/offline/DownloadSettings;", "ignoreRequested", "queueDownload", "releaseOldLicense", "", "mediaId", "", "oldLicense", "", "oldAudioLicense", "permanently", "removeDownloadedMedia", "renewLicense", "rescheduleRequestedDownloads", "syncInProgressStatus", "Companion", "plugin-offline-media_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: DownloadScheduler.kt */
public final class WorkManagerDownloadScheduler implements DownloadScheduler {
    /* access modifiers changed from: private */
    public final Context context;
    /* access modifiers changed from: private */
    public final ExoCachedMediaHelper exoCachedMediaHelper;
    /* access modifiers changed from: private */
    public final ExtensionInstanceProvider extensionProvider;
    /* access modifiers changed from: private */
    public final MediaStorage mediaStorage;
    /* access modifiers changed from: private */
    public final AccessTokenProvider tokenProvider;
    /* access modifiers changed from: private */
    public final DownloadWorkManagerHelper workManagerHelper;

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0006"}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/media/offline/WorkManagerDownloadScheduler$Companion;", "", "()V", "WORKER_DOWNLOAD_TAG", "", "WORKER_LICENSE_TAG", "plugin-offline-media_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
    /* compiled from: DownloadScheduler.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        new Companion(null);
    }

    public WorkManagerDownloadScheduler(DownloadWorkManagerHelper downloadWorkManagerHelper, ExoCachedMediaHelper exoCachedMediaHelper2, MediaStorage mediaStorage2, AccessTokenProvider accessTokenProvider, Context context2, ExtensionInstanceProvider extensionInstanceProvider) {
        this.workManagerHelper = downloadWorkManagerHelper;
        this.exoCachedMediaHelper = exoCachedMediaHelper2;
        this.mediaStorage = mediaStorage2;
        this.tokenProvider = accessTokenProvider;
        this.context = context2;
        this.extensionProvider = extensionInstanceProvider;
    }

    /* access modifiers changed from: private */
    public final void releaseOldLicense(ServiceTransaction serviceTransaction, String str, byte[] bArr, byte[] bArr2, boolean z) {
        try {
            this.exoCachedMediaHelper.releaseOldLicense(bArr);
            if (!(bArr2.length == 0)) {
                this.exoCachedMediaHelper.releaseOldLicense(bArr2);
            }
        } catch (Throwable th) {
            if ((th instanceof IOException) || (th.getCause() instanceof ServiceException)) {
                this.mediaStorage.markLicenseForRemoval(serviceTransaction, str, bArr, bArr2, z).mo30053d();
            }
        }
    }

    public Single<Boolean> isQueueFull(ServiceTransaction serviceTransaction, DownloadSettings downloadSettings, boolean z) {
        Single<Boolean> a = this.mediaStorage.getAll(serviceTransaction).mo30208a((Function<? super T, ? extends SingleSource<? extends R>>) new WorkManagerDownloadScheduler$isQueueFull$1<Object,Object>(z, downloadSettings));
        C12880j.m40222a((Object) a, "mediaStorage.getAll(tran…nloads)\n                }");
        return a;
    }

    public Completable queueDownload(ServiceTransaction serviceTransaction, DownloadSettings downloadSettings, CachedMedia cachedMedia) {
        ExoCachedMedia exoCachedMedia = (ExoCachedMedia) cachedMedia;
        Completable b = Completable.m38163b((C14313b<? extends CompletableSource>) new WorkManagerDownloadScheduler$queueDownload$1<Object>(this, cachedMedia, serviceTransaction, downloadSettings));
        C12880j.m40222a((Object) b, "Completable.mergeDelayEr…)\n            }\n        }");
        return b;
    }

    public Completable renewLicense(ServiceTransaction serviceTransaction, CachedMedia cachedMedia) {
        ExoCachedMedia exoCachedMedia = (ExoCachedMedia) cachedMedia;
        byte[] license = exoCachedMedia.getLicense();
        byte[] audioLicense = exoCachedMedia.getAudioLicense();
        Completable b = this.exoCachedMediaHelper.downloadMediaLicenseAsync(serviceTransaction, exoCachedMedia).mo30217b((Function<? super T, ? extends CompletableSource>) new WorkManagerDownloadScheduler$renewLicense$1<Object,Object>(this, serviceTransaction, license, audioLicense));
        WorkManagerDownloadScheduler$renewLicense$2 workManagerDownloadScheduler$renewLicense$2 = new WorkManagerDownloadScheduler$renewLicense$2(this, cachedMedia, serviceTransaction, license, audioLicense);
        Completable a = b.mo30036a((Consumer<? super Throwable>) workManagerDownloadScheduler$renewLicense$2);
        C12880j.m40222a((Object) a, "exoCachedMediaHelper.dow…Await()\n                }");
        return a;
    }

    public Completable rescheduleRequestedDownloads(ServiceTransaction serviceTransaction) {
        Completable b = Completable.m38162b((Callable<? extends CompletableSource>) new WorkManagerDownloadScheduler$rescheduleRequestedDownloads$1<Object>(this, serviceTransaction, (DownloadSettings) this.mediaStorage.getDownloadSettings(serviceTransaction).mo30224c()));
        C12880j.m40222a((Object) b, "Completable.defer {\n    …              }\n        }");
        return b;
    }
}
