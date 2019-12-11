package com.bamtech.sdk4.internal.media.offline;

import android.content.Context;
import androidx.room.C0934f;
import androidx.room.RoomDatabase;
import androidx.room.RoomDatabase.C0915a;
import androidx.room.migration.Migration;
import androidx.work.WorkManager;
import com.bamtech.sdk4.internal.configuration.NetworkConfigurationProvider;
import com.bamtech.sdk4.internal.media.offline.p047db.DatabaseMigrations;
import com.bamtech.sdk4.internal.media.offline.p047db.OfflineDatabase;
import com.bamtech.sdk4.internal.service.ServiceTransaction;
import com.google.android.exoplayer2.database.C8685b;
import com.google.android.exoplayer2.database.DatabaseProvider;
import java.util.Arrays;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.C12880j;
import okhttp3.OkHttpClient.Builder;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\bH\u0007J(\u0010\u000b\u001a\u00020\f2\b\b\u0001\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0007J\b\u0010\u0014\u001a\u00020\u0015H\u0007¨\u0006\u0016"}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/media/offline/OfflineMediaServiceModule$OfflineWorkManagerModule;", "", "()V", "database", "Lcom/bamtech/sdk4/internal/media/offline/db/OfflineDatabase;", "context", "Landroid/content/Context;", "databaseProvider", "Lcom/google/android/exoplayer2/database/DatabaseProvider;", "downloadIndex", "Lcom/google/android/exoplayer2/offline/WritableDownloadIndex;", "networkConfigurationProvider", "Lcom/bamtech/sdk4/internal/configuration/NetworkConfigurationProvider;", "userAgent", "", "builder", "Lokhttp3/OkHttpClient$Builder;", "transactionProvider", "Ljavax/inject/Provider;", "Lcom/bamtech/sdk4/internal/service/ServiceTransaction;", "workManager", "Landroidx/work/WorkManager;", "plugin-offline-media_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: OfflineMediaModule.kt */
public final class OfflineMediaServiceModule$OfflineWorkManagerModule {
    static {
        new OfflineMediaServiceModule$OfflineWorkManagerModule();
    }

    private OfflineMediaServiceModule$OfflineWorkManagerModule() {
    }

    public static final OfflineDatabase database(Context context) {
        C0915a a = C0934f.m5137a(context, OfflineDatabase.class, "offline-database");
        a.mo5227a(OfflineDatabase.Companion.getINIT());
        Migration[] fetch = DatabaseMigrations.INSTANCE.fetch();
        a.mo5228a((Migration[]) Arrays.copyOf(fetch, fetch.length));
        RoomDatabase b = a.mo5229b();
        C12880j.m40222a((Object) b, "Room\n                   …                 .build()");
        return (OfflineDatabase) b;
    }

    public static final DatabaseProvider databaseProvider(Context context) {
        return new C8685b(context);
    }

    public static final NetworkConfigurationProvider networkConfigurationProvider(String str, Builder builder, Provider<ServiceTransaction> provider) {
        return new C2004x2f654b61(str, builder, provider);
    }

    public static final WorkManager workManager() {
        WorkManager a = WorkManager.m5490a();
        C12880j.m40222a((Object) a, "WorkManager.getInstance()");
        return a;
    }
}
