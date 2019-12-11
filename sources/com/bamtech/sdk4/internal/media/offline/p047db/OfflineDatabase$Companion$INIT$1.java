package com.bamtech.sdk4.internal.media.offline.p047db;

import androidx.room.RoomDatabase.Callback;
import androidx.sqlite.p004db.SupportSQLiteDatabase;
import kotlin.Metadata;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, mo31007d2 = {"com/bamtech/sdk4/internal/media/offline/db/OfflineDatabase$Companion$INIT$1", "Landroidx/room/RoomDatabase$Callback;", "onCreate", "", "db", "Landroidx/sqlite/db/SupportSQLiteDatabase;", "plugin-offline-media_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: com.bamtech.sdk4.internal.media.offline.db.OfflineDatabase$Companion$INIT$1 */
/* compiled from: OfflineDatabase.kt */
public final class OfflineDatabase$Companion$INIT$1 extends Callback {
    OfflineDatabase$Companion$INIT$1() {
    }

    public void onCreate(SupportSQLiteDatabase supportSQLiteDatabase) {
        super.onCreate(supportSQLiteDatabase);
        supportSQLiteDatabase.mo5306b("INSERT INTO `downloadSettings` (id, wifiOnly, chargingOnly, batteryNotLow, storageNotLow, concurrentDownloads) VALUES (1, 1, 1, 1, 0, 2)");
    }
}
