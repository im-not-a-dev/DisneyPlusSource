package com.bamtech.sdk4.internal.media.offline.p047db;

import android.database.Cursor;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.p003k.C0945a;
import androidx.room.p003k.C0946b;
import androidx.sqlite.p004db.SupportSQLiteStatement;
import com.bamtech.sdk4.internal.media.offline.p047db.converters.DateTimeConverter;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bamtech.sdk4.internal.media.offline.db.OldMediaLicenseDao_Impl */
public final class OldMediaLicenseDao_Impl implements OldMediaLicenseDao {
    private final RoomDatabase __db;
    private final EntityDeletionOrUpdateAdapter __deletionAdapterOfOldMediaLicenseEntry;
    private final EntityInsertionAdapter __insertionAdapterOfOldMediaLicenseEntry;

    public OldMediaLicenseDao_Impl(RoomDatabase roomDatabase) {
        this.__db = roomDatabase;
        this.__insertionAdapterOfOldMediaLicenseEntry = new EntityInsertionAdapter<OldMediaLicenseEntry>(this, roomDatabase) {
            public String createQuery() {
                return "INSERT OR REPLACE INTO `oldMediaLicense`(`id`,`mediaId`,`license`,`audioLicense`,`retryCount`,`lastFailure`,`permanently`) VALUES (nullif(?, 0),?,?,?,?,?,?)";
            }

            public void bind(SupportSQLiteStatement supportSQLiteStatement, OldMediaLicenseEntry oldMediaLicenseEntry) {
                supportSQLiteStatement.mo5237a(1, oldMediaLicenseEntry.getId());
                if (oldMediaLicenseEntry.getMediaId() == null) {
                    supportSQLiteStatement.mo5235a(2);
                } else {
                    supportSQLiteStatement.mo5238a(2, oldMediaLicenseEntry.getMediaId());
                }
                if (oldMediaLicenseEntry.getLicense() == null) {
                    supportSQLiteStatement.mo5235a(3);
                } else {
                    supportSQLiteStatement.mo5239a(3, oldMediaLicenseEntry.getLicense());
                }
                if (oldMediaLicenseEntry.getAudioLicense() == null) {
                    supportSQLiteStatement.mo5235a(4);
                } else {
                    supportSQLiteStatement.mo5239a(4, oldMediaLicenseEntry.getAudioLicense());
                }
                supportSQLiteStatement.mo5237a(5, (long) oldMediaLicenseEntry.getRetryCount());
                String timestamp = DateTimeConverter.toTimestamp(oldMediaLicenseEntry.getLastFailure());
                if (timestamp == null) {
                    supportSQLiteStatement.mo5235a(6);
                } else {
                    supportSQLiteStatement.mo5238a(6, timestamp);
                }
                supportSQLiteStatement.mo5237a(7, oldMediaLicenseEntry.getPermanently() ? 1 : 0);
            }
        };
        this.__deletionAdapterOfOldMediaLicenseEntry = new EntityDeletionOrUpdateAdapter<OldMediaLicenseEntry>(this, roomDatabase) {
            public String createQuery() {
                return "DELETE FROM `oldMediaLicense` WHERE `id` = ?";
            }

            public void bind(SupportSQLiteStatement supportSQLiteStatement, OldMediaLicenseEntry oldMediaLicenseEntry) {
                supportSQLiteStatement.mo5237a(1, oldMediaLicenseEntry.getId());
            }
        };
    }

    public void deleteLicenses(OldMediaLicenseEntry... oldMediaLicenseEntryArr) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            this.__deletionAdapterOfOldMediaLicenseEntry.handleMultiple(oldMediaLicenseEntryArr);
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
        }
    }

    public List<OldMediaLicenseEntry> getAll() {
        RoomSQLiteQuery b = RoomSQLiteQuery.m5112b("SELECT * FROM oldMediaLicense", 0);
        this.__db.assertNotSuspendingTransaction();
        Cursor a = C0946b.m5157a(this.__db, b, false);
        try {
            int a2 = C0945a.m5155a(a, "id");
            int a3 = C0945a.m5155a(a, "mediaId");
            int a4 = C0945a.m5155a(a, "license");
            int a5 = C0945a.m5155a(a, "audioLicense");
            int a6 = C0945a.m5155a(a, "retryCount");
            int a7 = C0945a.m5155a(a, "lastFailure");
            int a8 = C0945a.m5155a(a, "permanently");
            ArrayList arrayList = new ArrayList(a.getCount());
            while (a.moveToNext()) {
                OldMediaLicenseEntry oldMediaLicenseEntry = new OldMediaLicenseEntry(a.getString(a3), a.getBlob(a4), a.getBlob(a5), a.getInt(a6), DateTimeConverter.fromTimestamp(a.getString(a7)), a.getInt(a8) != 0);
                oldMediaLicenseEntry.setId(a.getLong(a2));
                arrayList.add(oldMediaLicenseEntry);
            }
            return arrayList;
        } finally {
            a.close();
            b.mo5242b();
        }
    }

    public void store(OldMediaLicenseEntry oldMediaLicenseEntry) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            this.__insertionAdapterOfOldMediaLicenseEntry.insert(oldMediaLicenseEntry);
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
        }
    }
}
