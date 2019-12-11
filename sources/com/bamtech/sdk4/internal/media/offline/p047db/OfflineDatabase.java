package com.bamtech.sdk4.internal.media.offline.p047db;

import androidx.room.RoomDatabase;
import androidx.room.RoomDatabase.Callback;
import kotlin.Metadata;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b'\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&J\b\u0010\u0005\u001a\u00020\u0006H&J\b\u0010\u0007\u001a\u00020\bH&¨\u0006\n"}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/media/offline/db/OfflineDatabase;", "Landroidx/room/RoomDatabase;", "()V", "cachedMediaDao", "Lcom/bamtech/sdk4/internal/media/offline/db/CachedMediaDao;", "downloadSettingsDao", "Lcom/bamtech/sdk4/internal/media/offline/db/DownloadSettingsDao;", "oldMediaLicenseDao", "Lcom/bamtech/sdk4/internal/media/offline/db/OldMediaLicenseDao;", "Companion", "plugin-offline-media_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: com.bamtech.sdk4.internal.media.offline.db.OfflineDatabase */
/* compiled from: OfflineDatabase.kt */
public abstract class OfflineDatabase extends RoomDatabase {
    public static final Companion Companion = new Companion(null);
    /* access modifiers changed from: private */
    public static final Callback INIT = new OfflineDatabase$Companion$INIT$1();

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\u0007\u001a\u00020\bXT¢\u0006\u0002\n\u0000¨\u0006\t"}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/media/offline/db/OfflineDatabase$Companion;", "", "()V", "INIT", "Landroidx/room/RoomDatabase$Callback;", "getINIT", "()Landroidx/room/RoomDatabase$Callback;", "name", "", "plugin-offline-media_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
    /* renamed from: com.bamtech.sdk4.internal.media.offline.db.OfflineDatabase$Companion */
    /* compiled from: OfflineDatabase.kt */
    public static final class Companion {
        private Companion() {
        }

        public final Callback getINIT() {
            return OfflineDatabase.INIT;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public abstract CachedMediaDao cachedMediaDao();

    public abstract DownloadSettingsDao downloadSettingsDao();

    public abstract OldMediaLicenseDao oldMediaLicenseDao();
}
