package com.bamtech.sdk4.internal.media.storage.playhead;

import android.database.Cursor;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.p003k.C0945a;
import androidx.room.p003k.C0946b;
import androidx.sqlite.p004db.SupportSQLiteStatement;
import com.bamtech.sdk4.media.Playhead;

public final class PlayheadDao_Impl implements PlayheadDao {
    private final RoomDatabase __db;
    private final EntityInsertionAdapter __insertionAdapterOfPlayhead;
    private final SharedSQLiteStatement __preparedStmtOfDeleteAllPlayheads;
    private final SharedSQLiteStatement __preparedStmtOfDeletePlayheadForProfile;

    public PlayheadDao_Impl(RoomDatabase roomDatabase) {
        this.__db = roomDatabase;
        this.__insertionAdapterOfPlayhead = new EntityInsertionAdapter<Playhead>(this, roomDatabase) {
            public String createQuery() {
                return "INSERT OR REPLACE INTO `playhead`(`contentId`,`playhead`,`lastUpdated`,`profileId`) VALUES (?,?,?,?)";
            }

            public void bind(SupportSQLiteStatement supportSQLiteStatement, Playhead playhead) {
                if (playhead.getContentId() == null) {
                    supportSQLiteStatement.mo5235a(1);
                } else {
                    supportSQLiteStatement.mo5238a(1, playhead.getContentId());
                }
                supportSQLiteStatement.mo5237a(2, playhead.getPlayhead());
                supportSQLiteStatement.mo5237a(3, playhead.getLastUpdated());
                if (playhead.getProfileId() == null) {
                    supportSQLiteStatement.mo5235a(4);
                } else {
                    supportSQLiteStatement.mo5238a(4, playhead.getProfileId());
                }
            }
        };
        this.__preparedStmtOfDeletePlayheadForProfile = new SharedSQLiteStatement(this, roomDatabase) {
            public String createQuery() {
                return "DELETE from playhead WHERE profileId = ?";
            }
        };
        this.__preparedStmtOfDeleteAllPlayheads = new SharedSQLiteStatement(this, roomDatabase) {
            public String createQuery() {
                return "DELETE from playhead";
            }
        };
    }

    public void addPlayhead(Playhead playhead) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            this.__insertionAdapterOfPlayhead.insert(playhead);
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
        }
    }

    public void deleteAllPlayheads() {
        this.__db.assertNotSuspendingTransaction();
        SupportSQLiteStatement acquire = this.__preparedStmtOfDeleteAllPlayheads.acquire();
        this.__db.beginTransaction();
        try {
            acquire.mo5323k0();
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
            this.__preparedStmtOfDeleteAllPlayheads.release(acquire);
        }
    }

    public void deletePlayheadForProfile(String str) {
        this.__db.assertNotSuspendingTransaction();
        SupportSQLiteStatement acquire = this.__preparedStmtOfDeletePlayheadForProfile.acquire();
        if (str == null) {
            acquire.mo5235a(1);
        } else {
            acquire.mo5238a(1, str);
        }
        this.__db.beginTransaction();
        try {
            acquire.mo5323k0();
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
            this.__preparedStmtOfDeletePlayheadForProfile.release(acquire);
        }
    }

    public Playhead getPlayhead(String str, String str2) {
        RoomSQLiteQuery b = RoomSQLiteQuery.m5112b("SELECT * from playhead  WHERE profileId = ? AND contentId = ? LIMIT 1", 2);
        if (str == null) {
            b.mo5235a(1);
        } else {
            b.mo5238a(1, str);
        }
        if (str2 == null) {
            b.mo5235a(2);
        } else {
            b.mo5238a(2, str2);
        }
        this.__db.assertNotSuspendingTransaction();
        Cursor a = C0946b.m5157a(this.__db, b, false);
        try {
            return a.moveToFirst() ? new Playhead(a.getString(C0945a.m5155a(a, "contentId")), a.getLong(C0945a.m5155a(a, "playhead")), a.getLong(C0945a.m5155a(a, "lastUpdated")), a.getString(C0945a.m5155a(a, "profileId"))) : null;
        } finally {
            a.close();
            b.mo5242b();
        }
    }
}
