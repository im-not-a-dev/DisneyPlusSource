package com.bamtech.sdk4.internal.media.offline.p047db;

import android.database.Cursor;
import androidx.room.migration.Migration;
import androidx.sqlite.p004db.SupportSQLiteDatabase;
import kotlin.Metadata;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u000f\bÆ\u0002\u0018\u00002\u00020\u0001:\f\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0002J\u0011\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0002\u0010\fJ\u0010\u0010\r\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002¨\u0006\u001a"}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/media/offline/db/DatabaseMigrations;", "", "()V", "addAudioLicense", "", "db", "Landroidx/sqlite/db/SupportSQLiteDatabase;", "tableName", "", "fetch", "", "Landroidx/room/migration/Migration;", "()[Landroidx/room/migration/Migration;", "fixAudioLicenseUpgradeError", "Migration10to11", "Migration11to12", "Migration12to13", "Migration1to2", "Migration2to3", "Migration3to4", "Migration4to5", "Migration5to6", "Migration6to7", "Migration7to8", "Migration8to9", "Migration9to10", "plugin-offline-media_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: com.bamtech.sdk4.internal.media.offline.db.DatabaseMigrations */
/* compiled from: DatabaseMigrations.kt */
public final class DatabaseMigrations {
    public static final DatabaseMigrations INSTANCE = new DatabaseMigrations();

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/media/offline/db/DatabaseMigrations$Migration10to11;", "Landroidx/room/migration/Migration;", "()V", "migrate", "", "database", "Landroidx/sqlite/db/SupportSQLiteDatabase;", "plugin-offline-media_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
    /* renamed from: com.bamtech.sdk4.internal.media.offline.db.DatabaseMigrations$Migration10to11 */
    /* compiled from: DatabaseMigrations.kt */
    public static final class Migration10to11 extends Migration {
        public Migration10to11() {
            super(10, 11);
        }

        public void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
            supportSQLiteDatabase.mo5306b("ALTER TABLE oldMediaLicense ADD COLUMN permanently INTEGER DEFAULT 0 NOT NULL");
        }
    }

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/media/offline/db/DatabaseMigrations$Migration11to12;", "Landroidx/room/migration/Migration;", "()V", "migrate", "", "database", "Landroidx/sqlite/db/SupportSQLiteDatabase;", "plugin-offline-media_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
    /* renamed from: com.bamtech.sdk4.internal.media.offline.db.DatabaseMigrations$Migration11to12 */
    /* compiled from: DatabaseMigrations.kt */
    public static final class Migration11to12 extends Migration {
        public Migration11to12() {
            super(11, 12);
        }

        public void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
            supportSQLiteDatabase.mo5306b("ALTER TABLE cachedMedia ADD COLUMN adEngine TEXT DEFAULT NULL");
            supportSQLiteDatabase.mo5306b("ALTER TABLE cachedMedia ADD COLUMN conviva TEXT DEFAULT NULL");
        }
    }

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/media/offline/db/DatabaseMigrations$Migration12to13;", "Landroidx/room/migration/Migration;", "()V", "migrate", "", "database", "Landroidx/sqlite/db/SupportSQLiteDatabase;", "plugin-offline-media_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
    /* renamed from: com.bamtech.sdk4.internal.media.offline.db.DatabaseMigrations$Migration12to13 */
    /* compiled from: DatabaseMigrations.kt */
    public static final class Migration12to13 extends Migration {
        public Migration12to13() {
            super(12, 13);
        }

        public void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
            supportSQLiteDatabase.mo5306b("ALTER TABLE cachedMedia ADD COLUMN lastLicenseRenewal TEXT DEFAULT NULL");
            supportSQLiteDatabase.mo5306b("ALTER TABLE cachedMedia ADD COLUMN lastLicenseRenewalResult TEXT DEFAULT NULL");
        }
    }

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/media/offline/db/DatabaseMigrations$Migration1to2;", "Landroidx/room/migration/Migration;", "()V", "migrate", "", "database", "Landroidx/sqlite/db/SupportSQLiteDatabase;", "plugin-offline-media_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
    /* renamed from: com.bamtech.sdk4.internal.media.offline.db.DatabaseMigrations$Migration1to2 */
    /* compiled from: DatabaseMigrations.kt */
    public static final class Migration1to2 extends Migration {
        public Migration1to2() {
            super(1, 2);
        }

        public void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
            supportSQLiteDatabase.mo5306b("ALTER TABLE cachedMedia ADD COLUMN contentId TEXT DEFAULT NULL");
            supportSQLiteDatabase.mo5306b("ALTER TABLE cachedMedia ADD COLUMN telemetry TEXT DEFAULT NULL");
            supportSQLiteDatabase.mo5306b("ALTER TABLE downloadSettings ADD COLUMN storageNotLow INTEGER DEFAULT 0 NOT NULL");
            DatabaseMigrations.INSTANCE.fixAudioLicenseUpgradeError(supportSQLiteDatabase);
        }
    }

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/media/offline/db/DatabaseMigrations$Migration2to3;", "Landroidx/room/migration/Migration;", "()V", "migrate", "", "database", "Landroidx/sqlite/db/SupportSQLiteDatabase;", "plugin-offline-media_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
    /* renamed from: com.bamtech.sdk4.internal.media.offline.db.DatabaseMigrations$Migration2to3 */
    /* compiled from: DatabaseMigrations.kt */
    public static final class Migration2to3 extends Migration {
        public Migration2to3() {
            super(2, 3);
        }

        public void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
            supportSQLiteDatabase.mo5306b("ALTER TABLE downloadSettings ADD COLUMN concurrentDownloads INTEGER DEFAULT 1 NOT NULL");
            DatabaseMigrations.INSTANCE.fixAudioLicenseUpgradeError(supportSQLiteDatabase);
        }
    }

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/media/offline/db/DatabaseMigrations$Migration3to4;", "Landroidx/room/migration/Migration;", "()V", "migrate", "", "database", "Landroidx/sqlite/db/SupportSQLiteDatabase;", "plugin-offline-media_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
    /* renamed from: com.bamtech.sdk4.internal.media.offline.db.DatabaseMigrations$Migration3to4 */
    /* compiled from: DatabaseMigrations.kt */
    public static final class Migration3to4 extends Migration {
        public Migration3to4() {
            super(3, 4);
        }

        public void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
            supportSQLiteDatabase.mo5306b("ALTER TABLE cachedMedia ADD COLUMN orderNumber INTEGER DEFAULT 0 NOT NULL");
            DatabaseMigrations.INSTANCE.fixAudioLicenseUpgradeError(supportSQLiteDatabase);
        }
    }

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/media/offline/db/DatabaseMigrations$Migration4to5;", "Landroidx/room/migration/Migration;", "()V", "migrate", "", "database", "Landroidx/sqlite/db/SupportSQLiteDatabase;", "plugin-offline-media_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
    /* renamed from: com.bamtech.sdk4.internal.media.offline.db.DatabaseMigrations$Migration4to5 */
    /* compiled from: DatabaseMigrations.kt */
    public static final class Migration4to5 extends Migration {
        public Migration4to5() {
            super(4, 5);
        }

        public void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
            supportSQLiteDatabase.mo5306b("ALTER TABLE cachedMedia ADD COLUMN thumbnailResolution TEXT DEFAULT NULL");
            DatabaseMigrations.INSTANCE.fixAudioLicenseUpgradeError(supportSQLiteDatabase);
        }
    }

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/media/offline/db/DatabaseMigrations$Migration5to6;", "Landroidx/room/migration/Migration;", "()V", "migrate", "", "database", "Landroidx/sqlite/db/SupportSQLiteDatabase;", "plugin-offline-media_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
    /* renamed from: com.bamtech.sdk4.internal.media.offline.db.DatabaseMigrations$Migration5to6 */
    /* compiled from: DatabaseMigrations.kt */
    public static final class Migration5to6 extends Migration {
        public Migration5to6() {
            super(5, 6);
        }

        public void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
            supportSQLiteDatabase.mo5306b("ALTER TABLE cachedMedia ADD COLUMN thumbnails TEXT DEFAULT NULL");
            DatabaseMigrations.INSTANCE.fixAudioLicenseUpgradeError(supportSQLiteDatabase);
        }
    }

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/media/offline/db/DatabaseMigrations$Migration6to7;", "Landroidx/room/migration/Migration;", "()V", "migrate", "", "database", "Landroidx/sqlite/db/SupportSQLiteDatabase;", "plugin-offline-media_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
    /* renamed from: com.bamtech.sdk4.internal.media.offline.db.DatabaseMigrations$Migration6to7 */
    /* compiled from: DatabaseMigrations.kt */
    public static final class Migration6to7 extends Migration {
        public Migration6to7() {
            super(6, 7);
        }

        public void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
            DatabaseMigrations.INSTANCE.fixAudioLicenseUpgradeError(supportSQLiteDatabase);
        }
    }

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/media/offline/db/DatabaseMigrations$Migration7to8;", "Landroidx/room/migration/Migration;", "()V", "migrate", "", "database", "Landroidx/sqlite/db/SupportSQLiteDatabase;", "plugin-offline-media_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
    /* renamed from: com.bamtech.sdk4.internal.media.offline.db.DatabaseMigrations$Migration7to8 */
    /* compiled from: DatabaseMigrations.kt */
    public static final class Migration7to8 extends Migration {
        public Migration7to8() {
            super(7, 8);
        }

        public void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
            supportSQLiteDatabase.mo5306b("ALTER TABLE cachedMedia ADD COLUMN bytesInCache INTEGER DEFAULT NULL");
        }
    }

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/media/offline/db/DatabaseMigrations$Migration8to9;", "Landroidx/room/migration/Migration;", "()V", "migrate", "", "database", "Landroidx/sqlite/db/SupportSQLiteDatabase;", "plugin-offline-media_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
    /* renamed from: com.bamtech.sdk4.internal.media.offline.db.DatabaseMigrations$Migration8to9 */
    /* compiled from: DatabaseMigrations.kt */
    public static final class Migration8to9 extends Migration {
        public Migration8to9() {
            super(8, 9);
        }

        public void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
            supportSQLiteDatabase.mo5311m0();
            try {
                supportSQLiteDatabase.mo5306b(" ALTER TABLE cachedMedia RENAME TO savedCachedMedia");
                supportSQLiteDatabase.mo5306b("CREATE TABLE cachedMedia (\n    mediaId TEXT NOT NULL, \n    playbackUrl TEXT NOT NULL, \n    masterPlaylist TEXT NOT NULL, \n    license BLOB DEFAULT (x'') NOT NULL, \n    audioLicense BLOB DEFAULT (x'') NOT NULL, \n    expiration TEXT, \n    maxBitrate INTEGER, \n    maxHeight INTEGER, \n    maxWidth INTEGER, \n    audioLanguages TEXT, \n    subtitleLanguages TEXT, \n    alternateStorageDir TEXT, \n    renditionKeys TEXT NOT NULL, \n    playlistVariants TEXT, \n    contentId TEXT, \n    telemetry TEXT, \n    orderNumber INTEGER NOT NULL, \n    thumbnailResolution TEXT,\n    thumbnails TEXT, \n    type TEXT NOT NULL, \n    bytesDownloaded INTEGER NOT NULL, \n    percentageComplete REAL NOT NULL, \n    error TEXT, \n    timestamp TEXT NOT NULL, \n    PRIMARY KEY(mediaId))");
                supportSQLiteDatabase.mo5306b("INSERT INTO cachedMedia (\n    mediaId, \n    playbackUrl, \n    masterPlaylist, \n    license, \n    audioLicense, \n    expiration, \n    maxBitrate, \n    maxHeight, \n    maxWidth, \n    audioLanguages, \n    subtitleLanguages, \n    alternateStorageDir, \n    renditionKeys, \n    playlistVariants, \n    contentId, \n    telemetry, \n    orderNumber, \n    thumbnailResolution,\n    thumbnails,\n    type, \n    bytesDownloaded, \n    percentageComplete, \n    error, \n    timestamp\n)\n  SELECT \n    mediaId, \n    playbackUrl, \n    masterPlaylist, \n    license, \n    audioLicense, \n    expiration, \n    maxBitrate, \n    maxHeight, \n    maxWidth, \n    audioLanguages, \n    subtitleLanguages, \n    alternateStorageDir, \n    renditionKeys, \n    playlistVariants, \n    contentId, \n    telemetry, \n    orderNumber, \n    thumbnailResolution,\n    thumbnails,\n    type, \n    bytesDownloaded, \n    percentageComplete, \n    error, \n    timestamp\n  FROM savedCachedMedia");
                supportSQLiteDatabase.mo5306b("DROP TABLE IF EXISTS savedCachedMedia;");
                supportSQLiteDatabase.mo5313o0();
            } catch (Throwable th) {
                supportSQLiteDatabase.mo5314p0();
                throw th;
            }
            supportSQLiteDatabase.mo5314p0();
        }
    }

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/media/offline/db/DatabaseMigrations$Migration9to10;", "Landroidx/room/migration/Migration;", "()V", "migrate", "", "database", "Landroidx/sqlite/db/SupportSQLiteDatabase;", "plugin-offline-media_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
    /* renamed from: com.bamtech.sdk4.internal.media.offline.db.DatabaseMigrations$Migration9to10 */
    /* compiled from: DatabaseMigrations.kt */
    public static final class Migration9to10 extends Migration {
        public Migration9to10() {
            super(9, 10);
        }

        public void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
            supportSQLiteDatabase.mo5306b("ALTER TABLE cachedMedia ADD COLUMN thumbnailsSize INTEGER DEFAULT 0 NOT NULL");
        }
    }

    private DatabaseMigrations() {
    }

    private final void addAudioLicense(SupportSQLiteDatabase supportSQLiteDatabase, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("PRAGMA table_info(");
        sb.append(str);
        sb.append(')');
        Cursor d = supportSQLiteDatabase.mo5308d(sb.toString());
        d.moveToFirst();
        boolean z = false;
        do {
            String string = d.getString(1);
            if (string != null && string.equals("audioLicense")) {
                z = true;
            }
        } while (d.moveToNext());
        if (!z) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("ALTER TABLE ");
            sb2.append(str);
            sb2.append(" ADD COLUMN audioLicense BLOB DEFAULT (x'') NOT NULL");
            supportSQLiteDatabase.mo5306b(sb2.toString());
        }
    }

    /* access modifiers changed from: private */
    public final void fixAudioLicenseUpgradeError(SupportSQLiteDatabase supportSQLiteDatabase) {
        addAudioLicense(supportSQLiteDatabase, "cachedMedia");
        addAudioLicense(supportSQLiteDatabase, "oldMediaLicense");
    }

    public final Migration[] fetch() {
        return new Migration[]{new Migration1to2(), new Migration2to3(), new Migration3to4(), new Migration4to5(), new Migration5to6(), new Migration6to7(), new Migration7to8(), new Migration8to9(), new Migration9to10(), new Migration10to11(), new Migration11to12(), new Migration12to13()};
    }
}
