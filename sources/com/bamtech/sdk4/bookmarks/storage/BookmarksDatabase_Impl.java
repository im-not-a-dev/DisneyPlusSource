package com.bamtech.sdk4.bookmarks.storage;

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
import java.util.HashMap;
import java.util.HashSet;

public final class BookmarksDatabase_Impl extends BookmarksDatabase {
    private volatile BookmarksDao _bookmarksDao;

    public BookmarksDao bookmarksDao() {
        BookmarksDao bookmarksDao;
        if (this._bookmarksDao != null) {
            return this._bookmarksDao;
        }
        synchronized (this) {
            if (this._bookmarksDao == null) {
                this._bookmarksDao = new BookmarksDao_Impl(this);
            }
            bookmarksDao = this._bookmarksDao;
        }
        return bookmarksDao;
    }

    /* access modifiers changed from: protected */
    public InvalidationTracker createInvalidationTracker() {
        return new InvalidationTracker(this, new HashMap(0), new HashMap(0), "bookmarks");
    }

    /* access modifiers changed from: protected */
    public SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration databaseConfiguration) {
        C0936h hVar = new C0936h(databaseConfiguration, new C0937a(2) {
            public void createAllTables(SupportSQLiteDatabase supportSQLiteDatabase) {
                supportSQLiteDatabase.mo5306b("CREATE TABLE IF NOT EXISTS `bookmarks` (`contentId` TEXT NOT NULL, `playhead` INTEGER NOT NULL, `runtime` INTEGER NOT NULL, `profileId` TEXT NOT NULL, `occurredOn` INTEGER NOT NULL, `ccDefault` INTEGER NOT NULL, `ccMedia` INTEGER, PRIMARY KEY(`contentId`, `profileId`))");
                supportSQLiteDatabase.mo5306b("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                supportSQLiteDatabase.mo5306b("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'b08ac824b1efd8814bb7e7bbcd86dbaf')");
            }

            public void dropAllTables(SupportSQLiteDatabase supportSQLiteDatabase) {
                supportSQLiteDatabase.mo5306b("DROP TABLE IF EXISTS `bookmarks`");
            }

            /* access modifiers changed from: protected */
            public void onCreate(SupportSQLiteDatabase supportSQLiteDatabase) {
                if (BookmarksDatabase_Impl.this.mCallbacks != null) {
                    int size = BookmarksDatabase_Impl.this.mCallbacks.size();
                    for (int i = 0; i < size; i++) {
                        ((Callback) BookmarksDatabase_Impl.this.mCallbacks.get(i)).onCreate(supportSQLiteDatabase);
                    }
                }
            }

            public void onOpen(SupportSQLiteDatabase supportSQLiteDatabase) {
                BookmarksDatabase_Impl.this.mDatabase = supportSQLiteDatabase;
                BookmarksDatabase_Impl.this.internalInitInvalidationTracker(supportSQLiteDatabase);
                if (BookmarksDatabase_Impl.this.mCallbacks != null) {
                    int size = BookmarksDatabase_Impl.this.mCallbacks.size();
                    for (int i = 0; i < size; i++) {
                        ((Callback) BookmarksDatabase_Impl.this.mCallbacks.get(i)).onOpen(supportSQLiteDatabase);
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
                HashMap hashMap = new HashMap(7);
                String str = "TEXT";
                String str2 = "contentId";
                hashMap.put(str2, new C0949a(str2, str, true, 1));
                String str3 = "playhead";
                String str4 = "INTEGER";
                hashMap.put(str3, new C0949a(str3, str4, true, 0));
                String str5 = "runtime";
                hashMap.put(str5, new C0949a(str5, str4, true, 0));
                String str6 = "profileId";
                hashMap.put(str6, new C0949a(str6, str, true, 2));
                String str7 = "occurredOn";
                hashMap.put(str7, new C0949a(str7, str4, true, 0));
                String str8 = "ccDefault";
                hashMap.put(str8, new C0949a(str8, str4, true, 0));
                String str9 = "ccMedia";
                hashMap.put(str9, new C0949a(str9, str4, false, 0));
                String str10 = "bookmarks";
                C0948d dVar = new C0948d(str10, hashMap, new HashSet(0), new HashSet(0));
                C0948d a = C0948d.m5162a(supportSQLiteDatabase, str10);
                if (!dVar.equals(a)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Migration didn't properly handle bookmarks(com.bamtech.sdk4.bookmarks.Bookmark).\n Expected:\n");
                    sb.append(dVar);
                    sb.append("\n Found:\n");
                    sb.append(a);
                    throw new IllegalStateException(sb.toString());
                }
            }
        }, "b08ac824b1efd8814bb7e7bbcd86dbaf", "7b52669e6276c1664b5adaf05eb949bf");
        C0960a a = C0959b.m5202a(databaseConfiguration.f3653b);
        a.mo5320a(databaseConfiguration.f3654c);
        a.mo5319a((C0958a) hVar);
        return databaseConfiguration.f3652a.mo5322a(a.mo5321a());
    }
}
