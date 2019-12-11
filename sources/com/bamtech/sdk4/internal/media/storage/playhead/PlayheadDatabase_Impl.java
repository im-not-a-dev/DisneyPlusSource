package com.bamtech.sdk4.internal.media.storage.playhead;

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

public final class PlayheadDatabase_Impl extends PlayheadDatabase {
    private volatile PlayheadDao _playheadDao;

    /* access modifiers changed from: protected */
    public InvalidationTracker createInvalidationTracker() {
        return new InvalidationTracker(this, new HashMap(0), new HashMap(0), "playhead");
    }

    /* access modifiers changed from: protected */
    public SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration databaseConfiguration) {
        C0936h hVar = new C0936h(databaseConfiguration, new C0937a(1) {
            public void createAllTables(SupportSQLiteDatabase supportSQLiteDatabase) {
                supportSQLiteDatabase.mo5306b("CREATE TABLE IF NOT EXISTS `playhead` (`contentId` TEXT NOT NULL, `playhead` INTEGER NOT NULL, `lastUpdated` INTEGER NOT NULL, `profileId` TEXT NOT NULL, PRIMARY KEY(`contentId`, `profileId`))");
                supportSQLiteDatabase.mo5306b("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                supportSQLiteDatabase.mo5306b("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'ae5addf0ec2a6063128e3c6c31b569bd')");
            }

            public void dropAllTables(SupportSQLiteDatabase supportSQLiteDatabase) {
                supportSQLiteDatabase.mo5306b("DROP TABLE IF EXISTS `playhead`");
            }

            /* access modifiers changed from: protected */
            public void onCreate(SupportSQLiteDatabase supportSQLiteDatabase) {
                if (PlayheadDatabase_Impl.this.mCallbacks != null) {
                    int size = PlayheadDatabase_Impl.this.mCallbacks.size();
                    for (int i = 0; i < size; i++) {
                        ((Callback) PlayheadDatabase_Impl.this.mCallbacks.get(i)).onCreate(supportSQLiteDatabase);
                    }
                }
            }

            public void onOpen(SupportSQLiteDatabase supportSQLiteDatabase) {
                PlayheadDatabase_Impl.this.mDatabase = supportSQLiteDatabase;
                PlayheadDatabase_Impl.this.internalInitInvalidationTracker(supportSQLiteDatabase);
                if (PlayheadDatabase_Impl.this.mCallbacks != null) {
                    int size = PlayheadDatabase_Impl.this.mCallbacks.size();
                    for (int i = 0; i < size; i++) {
                        ((Callback) PlayheadDatabase_Impl.this.mCallbacks.get(i)).onOpen(supportSQLiteDatabase);
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
                HashMap hashMap = new HashMap(4);
                String str = "TEXT";
                String str2 = "contentId";
                hashMap.put(str2, new C0949a(str2, str, true, 1));
                String str3 = "INTEGER";
                String str4 = "playhead";
                hashMap.put(str4, new C0949a(str4, str3, true, 0));
                String str5 = "lastUpdated";
                hashMap.put(str5, new C0949a(str5, str3, true, 0));
                String str6 = "profileId";
                hashMap.put(str6, new C0949a(str6, str, true, 2));
                C0948d dVar = new C0948d(str4, hashMap, new HashSet(0), new HashSet(0));
                C0948d a = C0948d.m5162a(supportSQLiteDatabase, str4);
                if (!dVar.equals(a)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Migration didn't properly handle playhead(com.bamtech.sdk4.media.Playhead).\n Expected:\n");
                    sb.append(dVar);
                    sb.append("\n Found:\n");
                    sb.append(a);
                    throw new IllegalStateException(sb.toString());
                }
            }
        }, "ae5addf0ec2a6063128e3c6c31b569bd", "06ae1386262071e57da6484fd81e17c8");
        C0960a a = C0959b.m5202a(databaseConfiguration.f3653b);
        a.mo5320a(databaseConfiguration.f3654c);
        a.mo5319a((C0958a) hVar);
        return databaseConfiguration.f3652a.mo5322a(a.mo5321a());
    }

    public PlayheadDao playheadDao() {
        PlayheadDao playheadDao;
        if (this._playheadDao != null) {
            return this._playheadDao;
        }
        synchronized (this) {
            if (this._playheadDao == null) {
                this._playheadDao = new PlayheadDao_Impl(this);
            }
            playheadDao = this._playheadDao;
        }
        return playheadDao;
    }
}
