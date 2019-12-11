package com.bamtech.sdk4.internal.media.offline.workers;

import android.content.Context;
import android.util.Log;
import androidx.work.ListenableWorker.Result;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import com.bamtech.sdk4.internal.media.offline.WidevineLicenseManager;
import com.bamtech.sdk4.internal.media.offline.p047db.OfflineDatabase;
import com.bamtech.sdk4.internal.media.offline.p047db.OldMediaLicenseDao;
import com.bamtech.sdk4.internal.media.offline.p047db.OldMediaLicenseEntry;
import com.bamtech.sdk4.media.offline.OfflineMediaPlugin;
import com.bamtech.sdk4.service.ServiceException;
import java.io.IOException;
import java.nio.charset.Charset;
import kotlin.C13142s;
import kotlin.Metadata;
import kotlin.jvm.internal.C12880j;
import kotlin.p588j0.C12801c;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u0016\u001a\u00020\u0017H\u0016R$\u0010\u0007\u001a\u00020\b8\u0000@\u0000X.¢\u0006\u0014\n\u0000\u0012\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR$\u0010\u000f\u001a\u00020\u00108\u0000@\u0000X.¢\u0006\u0014\n\u0000\u0012\u0004\b\u0011\u0010\n\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006\u0019"}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/media/offline/workers/ReleaseLicenseWorker;", "Landroidx/work/Worker;", "context", "Landroid/content/Context;", "parameters", "Landroidx/work/WorkerParameters;", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "database", "Lcom/bamtech/sdk4/internal/media/offline/db/OfflineDatabase;", "database$annotations", "()V", "getDatabase$plugin_offline_media_release", "()Lcom/bamtech/sdk4/internal/media/offline/db/OfflineDatabase;", "setDatabase$plugin_offline_media_release", "(Lcom/bamtech/sdk4/internal/media/offline/db/OfflineDatabase;)V", "licenseManager", "Lcom/bamtech/sdk4/internal/media/offline/WidevineLicenseManager;", "licenseManager$annotations", "getLicenseManager$plugin_offline_media_release", "()Lcom/bamtech/sdk4/internal/media/offline/WidevineLicenseManager;", "setLicenseManager$plugin_offline_media_release", "(Lcom/bamtech/sdk4/internal/media/offline/WidevineLicenseManager;)V", "doWork", "Landroidx/work/ListenableWorker$Result;", "Companion", "plugin-offline-media_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: ReleaseLicenseWorker.kt */
public final class ReleaseLicenseWorker extends Worker {
    public OfflineDatabase database;
    public WidevineLicenseManager licenseManager;

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0007"}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/media/offline/workers/ReleaseLicenseWorker$Companion;", "", "()V", "AUDIO_LICENSE", "", "LICENSE", "MEDIA_ID", "plugin-offline-media_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
    /* compiled from: ReleaseLicenseWorker.kt */
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

    public ReleaseLicenseWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        OfflineMediaPlugin.Companion.getComponent$plugin_offline_media_release().inject(this);
    }

    public Result doWork() {
        String str = "null cannot be cast to non-null type java.lang.String";
        String str2 = "(this as java.lang.String).getBytes(charset)";
        String a = getInputData().mo5584a("LICENSE");
        if (a != null) {
            C12880j.m40222a((Object) a, "inputData.getString(LICE…icense was not provided\")");
            String a2 = getInputData().mo5584a("AUDIO_LICENSE");
            if (a2 == null) {
                a2 = "";
            }
            String str3 = a2;
            C12880j.m40222a((Object) str3, "inputData.getString(AUDI…SE)\n                ?: \"\"");
            try {
                WidevineLicenseManager widevineLicenseManager = this.licenseManager;
                String str4 = "licenseManager";
                if (widevineLicenseManager != null) {
                    Charset charset = C12801c.f29474a;
                    if (a != null) {
                        byte[] bytes = a.getBytes(charset);
                        C12880j.m40222a((Object) bytes, str2);
                        widevineLicenseManager.release(bytes, true);
                        if (!(str3.length() == 0)) {
                            WidevineLicenseManager widevineLicenseManager2 = this.licenseManager;
                            if (widevineLicenseManager2 != null) {
                                Charset charset2 = C12801c.f29474a;
                                if (str3 != null) {
                                    byte[] bytes2 = str3.getBytes(charset2);
                                    C12880j.m40222a((Object) bytes2, str2);
                                    widevineLicenseManager2.release(bytes2, true);
                                } else {
                                    throw new C13142s(str);
                                }
                            } else {
                                C12880j.m40227c(str4);
                                throw null;
                            }
                        }
                        Result c = Result.m5470c();
                        C12880j.m40222a((Object) c, "Result.success()");
                        return c;
                    }
                    throw new C13142s(str);
                }
                C12880j.m40227c(str4);
                throw null;
            } catch (Throwable th) {
                Log.d("OfflineReleaseLicense", "License release failed!", th);
                if ((th instanceof IOException) || (th.getCause() instanceof ServiceException)) {
                    String a3 = getInputData().mo5584a("MEDIA_ID");
                    if (a3 != null) {
                        OfflineDatabase offlineDatabase = this.database;
                        if (offlineDatabase != null) {
                            OldMediaLicenseDao oldMediaLicenseDao = offlineDatabase.oldMediaLicenseDao();
                            Charset charset3 = C12801c.f29474a;
                            if (a != null) {
                                byte[] bytes3 = a.getBytes(charset3);
                                C12880j.m40222a((Object) bytes3, str2);
                                Charset charset4 = C12801c.f29474a;
                                if (str3 != null) {
                                    byte[] bytes4 = str3.getBytes(charset4);
                                    C12880j.m40222a((Object) bytes4, str2);
                                    OldMediaLicenseEntry oldMediaLicenseEntry = new OldMediaLicenseEntry(a3, bytes3, bytes4, 0, null, true, 24, null);
                                    oldMediaLicenseDao.store(oldMediaLicenseEntry);
                                } else {
                                    throw new C13142s(str);
                                }
                            } else {
                                throw new C13142s(str);
                            }
                        } else {
                            C12880j.m40227c("database");
                            throw null;
                        }
                    }
                }
                Result a4 = Result.m5467a();
                C12880j.m40222a((Object) a4, "Result.failure()");
                return a4;
            }
        } else {
            throw new IllegalArgumentException("license was not provided");
        }
    }
}
