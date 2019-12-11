package com.bamtech.sdk4.internal.media.offline.p047db;

import android.database.Cursor;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.p003k.C0945a;
import androidx.room.p003k.C0946b;
import androidx.sqlite.p004db.SupportSQLiteStatement;

/* renamed from: com.bamtech.sdk4.internal.media.offline.db.DownloadSettingsDao_Impl */
public final class DownloadSettingsDao_Impl implements DownloadSettingsDao {
    private final RoomDatabase __db;

    public DownloadSettingsDao_Impl(RoomDatabase roomDatabase) {
        this.__db = roomDatabase;
        new EntityDeletionOrUpdateAdapter<DownloadSettingsEntry>(this, roomDatabase) {
            public String createQuery() {
                return "UPDATE OR REPLACE `downloadSettings` SET `id` = ?,`wifiOnly` = ?,`chargingOnly` = ?,`batteryNotLow` = ?,`storageNotLow` = ?,`concurrentDownloads` = ? WHERE `id` = ?";
            }

            public void bind(SupportSQLiteStatement supportSQLiteStatement, DownloadSettingsEntry downloadSettingsEntry) {
                supportSQLiteStatement.mo5237a(1, (long) downloadSettingsEntry.getId());
                supportSQLiteStatement.mo5237a(2, downloadSettingsEntry.getWifiOnly() ? 1 : 0);
                supportSQLiteStatement.mo5237a(3, downloadSettingsEntry.getChargingOnly() ? 1 : 0);
                supportSQLiteStatement.mo5237a(4, downloadSettingsEntry.getBatteryNotLow() ? 1 : 0);
                supportSQLiteStatement.mo5237a(5, downloadSettingsEntry.getStorageNotLow() ? 1 : 0);
                supportSQLiteStatement.mo5237a(6, (long) downloadSettingsEntry.getConcurrentDownloads());
                supportSQLiteStatement.mo5237a(7, (long) downloadSettingsEntry.getId());
            }
        };
    }

    public DownloadSettingsEntry get() {
        DownloadSettingsEntry downloadSettingsEntry;
        RoomSQLiteQuery b = RoomSQLiteQuery.m5112b("SELECT * FROM downloadSettings WHERE id = 1", 0);
        this.__db.assertNotSuspendingTransaction();
        Cursor a = C0946b.m5157a(this.__db, b, false);
        try {
            int a2 = C0945a.m5155a(a, "id");
            int a3 = C0945a.m5155a(a, "wifiOnly");
            int a4 = C0945a.m5155a(a, "chargingOnly");
            int a5 = C0945a.m5155a(a, "batteryNotLow");
            int a6 = C0945a.m5155a(a, "storageNotLow");
            int a7 = C0945a.m5155a(a, "concurrentDownloads");
            if (a.moveToFirst()) {
                downloadSettingsEntry = new DownloadSettingsEntry(a.getInt(a2), a.getInt(a3) != 0, a.getInt(a4) != 0, a.getInt(a5) != 0, a.getInt(a6) != 0, a.getInt(a7));
            } else {
                downloadSettingsEntry = null;
            }
            return downloadSettingsEntry;
        } finally {
            a.close();
            b.mo5242b();
        }
    }
}
