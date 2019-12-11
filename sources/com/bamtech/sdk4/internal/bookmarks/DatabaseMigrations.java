package com.bamtech.sdk4.internal.bookmarks;

import androidx.room.migration.Migration;
import androidx.sqlite.p004db.SupportSQLiteDatabase;
import kotlin.Metadata;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0007B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0011\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\u0010\u0006¨\u0006\b"}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/bookmarks/DatabaseMigrations;", "", "()V", "fetch", "", "Landroidx/room/migration/Migration;", "()[Landroidx/room/migration/Migration;", "Migration1to2", "plugin-bookmarks_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: DatabaseMigrations.kt */
public final class DatabaseMigrations {
    public static final DatabaseMigrations INSTANCE = new DatabaseMigrations();

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/bookmarks/DatabaseMigrations$Migration1to2;", "Landroidx/room/migration/Migration;", "()V", "migrate", "", "database", "Landroidx/sqlite/db/SupportSQLiteDatabase;", "plugin-bookmarks_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
    /* compiled from: DatabaseMigrations.kt */
    public static final class Migration1to2 extends Migration {
        public Migration1to2() {
            super(1, 2);
        }

        public void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
            supportSQLiteDatabase.mo5306b("ALTER TABLE bookmarks ADD COLUMN ccDefault INTEGER NOT NULL DEFAULT 0");
            supportSQLiteDatabase.mo5306b("ALTER TABLE bookmarks ADD COLUMN ccMedia INTEGER DEFAULT NULL");
        }
    }

    private DatabaseMigrations() {
    }

    public final Migration[] fetch() {
        return new Migration[]{new Migration1to2()};
    }
}
