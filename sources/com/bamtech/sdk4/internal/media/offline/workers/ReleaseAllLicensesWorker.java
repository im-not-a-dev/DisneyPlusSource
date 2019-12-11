package com.bamtech.sdk4.internal.media.offline.workers;

import android.content.Context;
import androidx.work.ListenableWorker.Result;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import com.bamtech.sdk4.internal.media.offline.WidevineLicenseManager;
import com.bamtech.sdk4.internal.media.offline.p047db.OfflineDatabase;
import com.bamtech.sdk4.media.offline.OfflineMediaPlugin;
import java.nio.charset.Charset;
import kotlin.C13142s;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.p588j0.C12801c;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u0016\u001a\u00020\u0017H\u0016R$\u0010\u0007\u001a\u00020\b8\u0000@\u0000X.¢\u0006\u0014\n\u0000\u0012\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR$\u0010\u000f\u001a\u00020\u00108\u0000@\u0000X.¢\u0006\u0014\n\u0000\u0012\u0004\b\u0011\u0010\n\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006\u0019"}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/media/offline/workers/ReleaseAllLicensesWorker;", "Landroidx/work/Worker;", "context", "Landroid/content/Context;", "parameters", "Landroidx/work/WorkerParameters;", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "database", "Lcom/bamtech/sdk4/internal/media/offline/db/OfflineDatabase;", "database$annotations", "()V", "getDatabase$plugin_offline_media_release", "()Lcom/bamtech/sdk4/internal/media/offline/db/OfflineDatabase;", "setDatabase$plugin_offline_media_release", "(Lcom/bamtech/sdk4/internal/media/offline/db/OfflineDatabase;)V", "licenseManager", "Lcom/bamtech/sdk4/internal/media/offline/WidevineLicenseManager;", "licenseManager$annotations", "getLicenseManager$plugin_offline_media_release", "()Lcom/bamtech/sdk4/internal/media/offline/WidevineLicenseManager;", "setLicenseManager$plugin_offline_media_release", "(Lcom/bamtech/sdk4/internal/media/offline/WidevineLicenseManager;)V", "doWork", "Landroidx/work/ListenableWorker$Result;", "Companion", "plugin-offline-media_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: ReleaseAllLicensesWorker.kt */
public final class ReleaseAllLicensesWorker extends Worker {
    public OfflineDatabase database;
    public WidevineLicenseManager licenseManager;

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0007"}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/media/offline/workers/ReleaseAllLicensesWorker$Companion;", "", "()V", "AUDIO_LICENSES", "", "LICENSES", "MEDIA_IDS", "plugin-offline-media_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
    /* compiled from: ReleaseAllLicensesWorker.kt */
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

    public ReleaseAllLicensesWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        OfflineMediaPlugin.Companion.getComponent$plugin_offline_media_release().inject(this);
    }

    public Result doWork() {
        String[] b;
        String[] b2;
        int i;
        String str;
        String str2 = "license";
        String str3 = "null cannot be cast to non-null type java.lang.String";
        String str4 = "(this as java.lang.String).getBytes(charset)";
        try {
            String[] b3 = getInputData().mo5587b("LICENSES");
            if (b3 != null) {
                Intrinsics.checkReturnedValueIsNotNull((Object) b3, "inputData.getStringArray…icense was not provided\")");
                b = getInputData().mo5587b("AUDIO_LICENSES");
                if (b != null) {
                    Intrinsics.checkReturnedValueIsNotNull((Object) b, "inputData.getStringArray… array was not provided\")");
                    b2 = getInputData().mo5587b("MEDIA_IDS");
                    int length = b3.length;
                    int i2 = 0;
                    i = 0;
                    while (i2 < length) {
                        str = b3[i2];
                        int i3 = i + 1;
                        WidevineLicenseManager widevineLicenseManager = this.licenseManager;
                        if (widevineLicenseManager != null) {
                            Intrinsics.checkReturnedValueIsNotNull((Object) str, str2);
                            Charset charset = C12801c.f29474a;
                            if (str != null) {
                                byte[] bytes = str.getBytes(charset);
                                Intrinsics.checkReturnedValueIsNotNull((Object) bytes, str4);
                                widevineLicenseManager.release(bytes, true);
                                i2++;
                                i = i3;
                            } else {
                                throw new C13142s(str3);
                            }
                        } else {
                            Intrinsics.throwUninitializedPropertyAccessException("licenseManager");
                            throw null;
                        }
                    }
                    Result c = Result.m5470c();
                    Intrinsics.checkReturnedValueIsNotNull((Object) c, "Result.success()");
                    return c;
                }
                throw new IllegalArgumentException("audio license array was not provided");
            }
            throw new IllegalArgumentException("license was not provided");
        } catch (Throwable unused) {
            Result a = Result.m5467a();
            Intrinsics.checkReturnedValueIsNotNull((Object) a, "Result.failure()");
            return a;
        }
    }
}
