package com.bamtech.sdk4.internal.media.offline;

import android.os.Build.VERSION;
import androidx.work.C1024a;
import androidx.work.C1027c;
import androidx.work.C1027c.C1028a;
import androidx.work.C1031e;
import androidx.work.C1032f;
import androidx.work.C1036i;
import androidx.work.C1166l;
import androidx.work.Data;
import androidx.work.Data.C1011a;
import androidx.work.OneTimeWorkRequest;
import androidx.work.OneTimeWorkRequest.C1015a;
import androidx.work.PeriodicWorkRequest;
import androidx.work.PeriodicWorkRequest.C1019a;
import androidx.work.WorkManager;
import com.bamtech.sdk4.internal.configuration.ConfigurationProvider;
import com.bamtech.sdk4.internal.media.ExoCachedMedia;
import com.bamtech.sdk4.internal.media.offline.DownloadWorkManagerHelper.DefaultImpls;
import com.bamtech.sdk4.internal.media.offline.workers.DownloadMediaWorker;
import com.bamtech.sdk4.internal.media.offline.workers.ReleaseLicensesPeriodicWorker;
import com.bamtech.sdk4.internal.media.offline.workers.RenewLicensesWorker;
import com.bamtech.sdk4.internal.service.ServiceTransaction;
import com.bamtech.sdk4.media.offline.CachedMedia;
import com.bamtech.sdk4.media.offline.DownloadSettings;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.C12907r;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.jvm.internal.C12880j;
import p520io.reactivex.Completable;
import p520io.reactivex.functions.C11945a;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 +2\u00020\u0001:\u0001+B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u001d\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0000¢\u0006\u0002\b\rJ\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u000b\u001a\u00020\u0014H\u0016J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\u0015\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0014H\u0000¢\u0006\u0002\b\u001aJ\u0010\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u000b\u001a\u00020\fH\u0016J(\u0010\u001d\u001a\u00020\u00132\u001e\u0010\u001e\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00180 0\u001fH\u0016J\u0010\u0010!\u001a\u00020\u00132\u0006\u0010\u000b\u001a\u00020\u0014H\u0016J \u0010\"\u001a\u00020\u00162\u0006\u0010#\u001a\u00020$2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\b\u0010%\u001a\u00020\u0016H\u0016J\u0018\u0010&\u001a\u00020\u00162\u0006\u0010#\u001a\u00020$2\u0006\u0010'\u001a\u00020\u0011H\u0016J&\u0010(\u001a\u00020\u00132\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\f\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00130*H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006,"}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/media/offline/DefaultDownloadWorkManagerHelper;", "Lcom/bamtech/sdk4/internal/media/offline/DownloadWorkManagerHelper;", "workManager", "Landroidx/work/WorkManager;", "configurationProvider", "Lcom/bamtech/sdk4/internal/configuration/ConfigurationProvider;", "(Landroidx/work/WorkManager;Lcom/bamtech/sdk4/internal/configuration/ConfigurationProvider;)V", "buildDownloadWorkRequest", "Landroidx/work/OneTimeWorkRequest;", "settings", "Lcom/bamtech/sdk4/media/offline/DownloadSettings;", "media", "Lcom/bamtech/sdk4/internal/media/ExoCachedMedia;", "buildDownloadWorkRequest$plugin_offline_media_release", "buildRenewLicensesWorker", "Landroidx/work/PeriodicWorkRequest;", "minimalRenewalFrequency", "", "cancelDownload", "Lio/reactivex/Completable;", "Lcom/bamtech/sdk4/media/offline/CachedMedia;", "cancelPeriodicRenewal", "", "getStorageOperationMediaWorkId", "", "cachedMedia", "getStorageOperationMediaWorkId$plugin_offline_media_release", "isDownloadWorkStarted", "", "removeAllLicenses", "licenses", "", "Lkotlin/Triple;", "removeDownloadedMedia", "startDownload", "transaction", "Lcom/bamtech/sdk4/internal/service/ServiceTransaction;", "startOldLicensesCleanupWork", "startPeriodicLicenseRenewal", "skipIfRenewalEquals", "syncDownloadTaskStatus", "prepareSync", "Lkotlin/Function0;", "Companion", "plugin-offline-media_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: DownloadWorkManagerHelper.kt */
public final class DefaultDownloadWorkManagerHelper implements DownloadWorkManagerHelper {
    private final ConfigurationProvider configurationProvider;
    /* access modifiers changed from: private */
    public final WorkManager workManager;

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/media/offline/DefaultDownloadWorkManagerHelper$Companion;", "", "()V", "LICENSE_RENEWAL_WORK_NAME", "", "plugin-offline-media_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
    /* compiled from: DownloadWorkManagerHelper.kt */
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

    public DefaultDownloadWorkManagerHelper(WorkManager workManager2, ConfigurationProvider configurationProvider2) {
        this.workManager = workManager2;
        this.configurationProvider = configurationProvider2;
    }

    private final PeriodicWorkRequest buildRenewLicensesWorker(long j) {
        C1028a aVar = new C1028a();
        aVar.mo5682a(C1036i.CONNECTED);
        C1027c a = aVar.mo5684a();
        C12880j.m40222a((Object) a, "Constraints.Builder()\n  …TED)\n            .build()");
        RenewalInterval renewalInterval = LicenseUtils.INSTANCE.getRenewalInterval(j);
        C1019a aVar2 = new C1019a(RenewLicensesWorker.class, renewalInterval.getInterval(), TimeUnit.SECONDS, renewalInterval.getFlex(), TimeUnit.SECONDS);
        C1019a aVar3 = (C1019a) aVar2.mo5956a(a);
        Pair[] pairArr = {C12907r.m40244a("RENEW_INTERVAL", Long.valueOf(j))};
        C1011a aVar4 = new C1011a();
        for (Pair pair : pairArr) {
            aVar4.mo5591a((String) pair.mo31015c(), pair.mo31016d());
        }
        Data a2 = aVar4.mo5594a();
        C12880j.m40222a((Object) a2, "dataBuilder.build()");
        C1166l a3 = ((C1019a) ((C1019a) aVar3.mo5954a(a2)).mo5957a("sdk-license-worker")).mo5958a();
        C12880j.m40222a((Object) a3, "PeriodicWorkRequestBuild…TAG)\n            .build()");
        return (PeriodicWorkRequest) a3;
    }

    public final OneTimeWorkRequest buildDownloadWorkRequest$plugin_offline_media_release(DownloadSettings downloadSettings, ExoCachedMedia exoCachedMedia) {
        C1036i iVar = downloadSettings.getWifiOnly() ? C1036i.UNMETERED : C1036i.CONNECTED;
        C1028a aVar = new C1028a();
        aVar.mo5682a(iVar);
        aVar.mo5683a(downloadSettings.getBatteryNotLow());
        aVar.mo5685b(downloadSettings.getChargingOnly());
        aVar.mo5687d(downloadSettings.getStorageNotLow());
        if (VERSION.SDK_INT >= 23) {
            aVar.mo5686c(false);
        }
        C1027c a = aVar.mo5684a();
        C12880j.m40222a((Object) a, "Constraints.Builder()\n  …\n                .build()");
        C1015a aVar2 = new C1015a(DownloadMediaWorker.class);
        Pair[] pairArr = {C12907r.m40244a("MEDIA_ID", exoCachedMedia.getId())};
        C1011a aVar3 = new C1011a();
        for (Pair pair : pairArr) {
            aVar3.mo5591a((String) pair.mo31015c(), pair.mo31016d());
        }
        Data a2 = aVar3.mo5594a();
        C12880j.m40222a((Object) a2, "dataBuilder.build()");
        C1166l a3 = ((C1015a) ((C1015a) ((C1015a) ((C1015a) ((C1015a) aVar2.mo5954a(a2)).mo5956a(a)).mo5957a(exoCachedMedia.getId())).mo5957a("sdk-download-worker")).mo5955a(C1024a.LINEAR, 5, TimeUnit.SECONDS)).mo5958a();
        C12880j.m40222a((Object) a3, "OneTimeWorkRequestBuilde…\n                .build()");
        return (OneTimeWorkRequest) a3;
    }

    public void cancelPeriodicRenewal() {
        this.workManager.mo5637a("renew_licenses");
    }

    public final String getStorageOperationMediaWorkId$plugin_offline_media_release(CachedMedia cachedMedia) {
        StringBuilder sb = new StringBuilder();
        sb.append("storage_operation_");
        sb.append(cachedMedia.getId());
        return sb.toString();
    }

    public Completable removeAllLicenses(List<Triple<String, String, String>> list) {
        Completable c = Completable.m38166c((C11945a) new DefaultDownloadWorkManagerHelper$removeAllLicenses$1(this, list));
        C12880j.m40222a((Object) c, "Completable.fromAction {…rker).enqueue()\n        }");
        return c;
    }

    public void startDownload(ServiceTransaction serviceTransaction, DownloadSettings downloadSettings, ExoCachedMedia exoCachedMedia) {
        DefaultImpls.startPeriodicLicenseRenewal$default(this, serviceTransaction, 0, 2, null);
        this.workManager.mo5641a(getStorageOperationMediaWorkId$plugin_offline_media_release(exoCachedMedia), C1032f.REPLACE, buildDownloadWorkRequest$plugin_offline_media_release(downloadSettings, exoCachedMedia)).mo5759a();
    }

    public void startOldLicensesCleanupWork() {
        C1028a aVar = new C1028a();
        aVar.mo5682a(C1036i.CONNECTED);
        C1027c a = aVar.mo5684a();
        C12880j.m40222a((Object) a, "Constraints.Builder()\n  …\n                .build()");
        String str = "release_old_licenses";
        this.workManager.mo5638a(str, C1031e.KEEP, (PeriodicWorkRequest) ((C1019a) ((C1019a) new C1019a(ReleaseLicensesPeriodicWorker.class, 1, TimeUnit.DAYS).mo5956a(a)).mo5957a("sdk-license-worker")).mo5958a());
    }

    public void startPeriodicLicenseRenewal(ServiceTransaction serviceTransaction, long j) {
        Long l = (Long) this.configurationProvider.getServiceConfiguration(serviceTransaction, C1994xdbc8649f.INSTANCE).mo30233g(C1995xdbc864a0.INSTANCE).mo30224c();
        boolean z = true;
        boolean z2 = l != null && j == l.longValue();
        if (l == null || l.longValue() != 0) {
            z = false;
        }
        if (!z2 && !z) {
            C12880j.m40222a((Object) l, "minimalRenewalFrequency");
            this.workManager.mo5638a("renew_licenses", (j == -1 || z2) ? C1031e.KEEP : C1031e.REPLACE, buildRenewLicensesWorker(l.longValue()));
        }
    }
}
