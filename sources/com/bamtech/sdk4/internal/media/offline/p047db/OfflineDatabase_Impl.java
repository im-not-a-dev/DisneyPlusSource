package com.bamtech.sdk4.internal.media.offline.p047db;

import androidx.room.C0936h;
import androidx.room.C0936h.C0937a;
import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomDatabase.Callback;
import androidx.room.p003k.C0946b;
import androidx.room.p003k.C0948d;
import androidx.room.p003k.C0948d.C0949a;
import androidx.sqlite.p004db.SupportSQLiteDatabase;
import androidx.sqlite.p004db.SupportSQLiteOpenHelper;
import androidx.sqlite.p004db.SupportSQLiteOpenHelper.C0958a;
import androidx.sqlite.p004db.SupportSQLiteOpenHelper.C0959b;
import androidx.sqlite.p004db.SupportSQLiteOpenHelper.C0959b.C0960a;
import com.bamtech.sdk4.internal.media.StreamSampleTelemetryData;
import java.util.HashMap;
import java.util.HashSet;

/* renamed from: com.bamtech.sdk4.internal.media.offline.db.OfflineDatabase_Impl */
public final class OfflineDatabase_Impl extends OfflineDatabase {
    private volatile CachedMediaDao _cachedMediaDao;
    private volatile DownloadSettingsDao _downloadSettingsDao;
    private volatile OldMediaLicenseDao _oldMediaLicenseDao;

    public CachedMediaDao cachedMediaDao() {
        CachedMediaDao cachedMediaDao;
        if (this._cachedMediaDao != null) {
            return this._cachedMediaDao;
        }
        synchronized (this) {
            if (this._cachedMediaDao == null) {
                this._cachedMediaDao = new CachedMediaDao_Impl(this);
            }
            cachedMediaDao = this._cachedMediaDao;
        }
        return cachedMediaDao;
    }

    /* access modifiers changed from: protected */
    public InvalidationTracker createInvalidationTracker() {
        return new InvalidationTracker(this, new HashMap(0), new HashMap(0), "cachedMedia", "downloadSettings", "oldMediaLicense");
    }

    /* access modifiers changed from: protected */
    public SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration databaseConfiguration) {
        C0936h hVar = new C0936h(databaseConfiguration, new C0937a(13) {
            public void createAllTables(SupportSQLiteDatabase supportSQLiteDatabase) {
                supportSQLiteDatabase.mo5306b("CREATE TABLE IF NOT EXISTS `cachedMedia` (`mediaId` TEXT NOT NULL, `playbackUrl` TEXT NOT NULL, `masterPlaylist` TEXT NOT NULL, `license` BLOB NOT NULL, `audioLicense` BLOB NOT NULL, `expiration` TEXT, `maxBitrate` INTEGER, `maxHeight` INTEGER, `maxWidth` INTEGER, `audioLanguages` TEXT, `subtitleLanguages` TEXT, `alternateStorageDir` TEXT, `renditionKeys` TEXT NOT NULL, `playlistVariants` TEXT, `contentId` TEXT, `telemetry` TEXT, `adEngine` TEXT, `conviva` TEXT, `orderNumber` INTEGER NOT NULL, `thumbnailResolution` TEXT, `thumbnails` TEXT, `thumbnailsSize` INTEGER NOT NULL, `lastLicenseRenewal` TEXT, `lastLicenseRenewalResult` TEXT, `type` TEXT NOT NULL, `bytesDownloaded` INTEGER NOT NULL, `percentageComplete` REAL NOT NULL, `error` TEXT, `timestamp` TEXT NOT NULL, PRIMARY KEY(`mediaId`))");
                supportSQLiteDatabase.mo5306b("CREATE TABLE IF NOT EXISTS `downloadSettings` (`id` INTEGER NOT NULL, `wifiOnly` INTEGER NOT NULL, `chargingOnly` INTEGER NOT NULL, `batteryNotLow` INTEGER NOT NULL, `storageNotLow` INTEGER NOT NULL, `concurrentDownloads` INTEGER NOT NULL, PRIMARY KEY(`id`))");
                supportSQLiteDatabase.mo5306b("CREATE TABLE IF NOT EXISTS `oldMediaLicense` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `mediaId` TEXT NOT NULL, `license` BLOB NOT NULL, `audioLicense` BLOB NOT NULL, `retryCount` INTEGER NOT NULL, `lastFailure` TEXT NOT NULL, `permanently` INTEGER NOT NULL)");
                supportSQLiteDatabase.mo5306b("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                supportSQLiteDatabase.mo5306b("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'ec401c4d6f0f6151afc6fd5255eb3a4d')");
            }

            public void dropAllTables(SupportSQLiteDatabase supportSQLiteDatabase) {
                supportSQLiteDatabase.mo5306b("DROP TABLE IF EXISTS `cachedMedia`");
                supportSQLiteDatabase.mo5306b("DROP TABLE IF EXISTS `downloadSettings`");
                supportSQLiteDatabase.mo5306b("DROP TABLE IF EXISTS `oldMediaLicense`");
            }

            /* access modifiers changed from: protected */
            public void onCreate(SupportSQLiteDatabase supportSQLiteDatabase) {
                if (OfflineDatabase_Impl.this.mCallbacks != null) {
                    int size = OfflineDatabase_Impl.this.mCallbacks.size();
                    for (int i = 0; i < size; i++) {
                        ((Callback) OfflineDatabase_Impl.this.mCallbacks.get(i)).onCreate(supportSQLiteDatabase);
                    }
                }
            }

            public void onOpen(SupportSQLiteDatabase supportSQLiteDatabase) {
                OfflineDatabase_Impl.this.mDatabase = supportSQLiteDatabase;
                OfflineDatabase_Impl.this.internalInitInvalidationTracker(supportSQLiteDatabase);
                if (OfflineDatabase_Impl.this.mCallbacks != null) {
                    int size = OfflineDatabase_Impl.this.mCallbacks.size();
                    for (int i = 0; i < size; i++) {
                        ((Callback) OfflineDatabase_Impl.this.mCallbacks.get(i)).onOpen(supportSQLiteDatabase);
                    }
                }
            }

            public void onPostMigrate(SupportSQLiteDatabase supportSQLiteDatabase) {
            }

            public void onPreMigrate(SupportSQLiteDatabase supportSQLiteDatabase) {
                C0946b.m5158a(supportSQLiteDatabase);
            }

            /* access modifiers changed from: protected */
            public void validateMigration(SupportSQLiteDatabase supportSQLiteDatabase) {
                SupportSQLiteDatabase supportSQLiteDatabase2 = supportSQLiteDatabase;
                HashMap hashMap = new HashMap(29);
                String str = "mediaId";
                String str2 = "TEXT";
                hashMap.put(str, new C0949a(str, str2, true, 1));
                String str3 = "playbackUrl";
                hashMap.put(str3, new C0949a(str3, str2, true, 0));
                String str4 = "masterPlaylist";
                hashMap.put(str4, new C0949a(str4, str2, true, 0));
                String str5 = "BLOB";
                String str6 = "license";
                hashMap.put(str6, new C0949a(str6, str5, true, 0));
                String str7 = "audioLicense";
                hashMap.put(str7, new C0949a(str7, str5, true, 0));
                String str8 = "expiration";
                hashMap.put(str8, new C0949a(str8, str2, false, 0));
                String str9 = "maxBitrate";
                String str10 = "INTEGER";
                hashMap.put(str9, new C0949a(str9, str10, false, 0));
                String str11 = "maxHeight";
                hashMap.put(str11, new C0949a(str11, str10, false, 0));
                hashMap.put("maxWidth", new C0949a("maxWidth", str10, false, 0));
                hashMap.put("audioLanguages", new C0949a("audioLanguages", str2, false, 0));
                hashMap.put("subtitleLanguages", new C0949a("subtitleLanguages", str2, false, 0));
                hashMap.put("alternateStorageDir", new C0949a("alternateStorageDir", str2, false, 0));
                hashMap.put("renditionKeys", new C0949a("renditionKeys", str2, true, 0));
                hashMap.put("playlistVariants", new C0949a("playlistVariants", str2, false, 0));
                hashMap.put("contentId", new C0949a("contentId", str2, false, 0));
                hashMap.put("telemetry", new C0949a("telemetry", str2, false, 0));
                hashMap.put("adEngine", new C0949a("adEngine", str2, false, 0));
                hashMap.put("conviva", new C0949a("conviva", str2, false, 0));
                hashMap.put("orderNumber", new C0949a("orderNumber", str10, true, 0));
                hashMap.put("thumbnailResolution", new C0949a("thumbnailResolution", str2, false, 0));
                hashMap.put("thumbnails", new C0949a("thumbnails", str2, false, 0));
                hashMap.put("thumbnailsSize", new C0949a("thumbnailsSize", str10, true, 0));
                hashMap.put("lastLicenseRenewal", new C0949a("lastLicenseRenewal", str2, false, 0));
                hashMap.put("lastLicenseRenewalResult", new C0949a("lastLicenseRenewalResult", str2, false, 0));
                hashMap.put("type", new C0949a("type", str2, true, 0));
                hashMap.put("bytesDownloaded", new C0949a("bytesDownloaded", str10, true, 0));
                hashMap.put("percentageComplete", new C0949a("percentageComplete", "REAL", true, 0));
                hashMap.put("error", new C0949a("error", str2, false, 0));
                hashMap.put(StreamSampleTelemetryData.TIMESTAMP_KEY, new C0949a(StreamSampleTelemetryData.TIMESTAMP_KEY, str2, true, 0));
                C0948d dVar = new C0948d("cachedMedia", hashMap, new HashSet(0), new HashSet(0));
                C0948d a = C0948d.m5162a(supportSQLiteDatabase2, "cachedMedia");
                String str12 = "\n Found:\n";
                if (dVar.equals(a)) {
                    HashMap hashMap2 = new HashMap(6);
                    String str13 = "id";
                    hashMap2.put(str13, new C0949a(str13, str10, true, 1));
                    hashMap2.put("wifiOnly", new C0949a("wifiOnly", str10, true, 0));
                    hashMap2.put("chargingOnly", new C0949a("chargingOnly", str10, true, 0));
                    hashMap2.put("batteryNotLow", new C0949a("batteryNotLow", str10, true, 0));
                    hashMap2.put("storageNotLow", new C0949a("storageNotLow", str10, true, 0));
                    hashMap2.put("concurrentDownloads", new C0949a("concurrentDownloads", str10, true, 0));
                    C0948d dVar2 = new C0948d("downloadSettings", hashMap2, new HashSet(0), new HashSet(0));
                    C0948d a2 = C0948d.m5162a(supportSQLiteDatabase2, "downloadSettings");
                    if (dVar2.equals(a2)) {
                        HashMap hashMap3 = new HashMap(7);
                        hashMap3.put(str13, new C0949a(str13, str10, true, 1));
                        hashMap3.put(str, new C0949a(str, str2, true, 0));
                        hashMap3.put(str6, new C0949a(str6, str5, true, 0));
                        hashMap3.put(str7, new C0949a(str7, str5, true, 0));
                        hashMap3.put("retryCount", new C0949a("retryCount", str10, true, 0));
                        hashMap3.put("lastFailure", new C0949a("lastFailure", str2, true, 0));
                        hashMap3.put("permanently", new C0949a("permanently", str10, true, 0));
                        C0948d dVar3 = new C0948d("oldMediaLicense", hashMap3, new HashSet(0), new HashSet(0));
                        C0948d a3 = C0948d.m5162a(supportSQLiteDatabase2, "oldMediaLicense");
                        if (!dVar3.equals(a3)) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("Migration didn't properly handle oldMediaLicense(com.bamtech.sdk4.internal.media.offline.db.OldMediaLicenseEntry).\n Expected:\n");
                            sb.append(dVar3);
                            sb.append(str12);
                            sb.append(a3);
                            throw new IllegalStateException(sb.toString());
                        }
                        return;
                    }
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Migration didn't properly handle downloadSettings(com.bamtech.sdk4.internal.media.offline.db.DownloadSettingsEntry).\n Expected:\n");
                    sb2.append(dVar2);
                    sb2.append(str12);
                    sb2.append(a2);
                    throw new IllegalStateException(sb2.toString());
                }
                StringBuilder sb3 = new StringBuilder();
                sb3.append("Migration didn't properly handle cachedMedia(com.bamtech.sdk4.internal.media.offline.db.CachedMediaEntry).\n Expected:\n");
                sb3.append(dVar);
                sb3.append(str12);
                sb3.append(a);
                throw new IllegalStateException(sb3.toString());
            }
        }, "ec401c4d6f0f6151afc6fd5255eb3a4d", "cc10016b70f509b76f9e07b23b35b15c");
        C0960a a = C0959b.m5202a(databaseConfiguration.f3653b);
        a.mo5320a(databaseConfiguration.f3654c);
        a.mo5319a((C0958a) hVar);
        return databaseConfiguration.f3652a.mo5322a(a.mo5321a());
    }

    public DownloadSettingsDao downloadSettingsDao() {
        DownloadSettingsDao downloadSettingsDao;
        if (this._downloadSettingsDao != null) {
            return this._downloadSettingsDao;
        }
        synchronized (this) {
            if (this._downloadSettingsDao == null) {
                this._downloadSettingsDao = new DownloadSettingsDao_Impl(this);
            }
            downloadSettingsDao = this._downloadSettingsDao;
        }
        return downloadSettingsDao;
    }

    public OldMediaLicenseDao oldMediaLicenseDao() {
        OldMediaLicenseDao oldMediaLicenseDao;
        if (this._oldMediaLicenseDao != null) {
            return this._oldMediaLicenseDao;
        }
        synchronized (this) {
            if (this._oldMediaLicenseDao == null) {
                this._oldMediaLicenseDao = new OldMediaLicenseDao_Impl(this);
            }
            oldMediaLicenseDao = this._oldMediaLicenseDao;
        }
        return oldMediaLicenseDao;
    }
}
