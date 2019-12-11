package com.bamtech.sdk4.bookmarks.storage;

import android.database.Cursor;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.p003k.C0945a;
import androidx.room.p003k.C0946b;
import androidx.room.p003k.C0947c;
import androidx.sqlite.p004db.SupportSQLiteStatement;
import com.bamtech.sdk4.bookmarks.Bookmark;
import java.util.ArrayList;
import java.util.List;

public final class BookmarksDao_Impl implements BookmarksDao {
    private final RoomDatabase __db;
    private final EntityInsertionAdapter __insertionAdapterOfBookmark;
    private final SharedSQLiteStatement __preparedStmtOfDeleteAllBookmarks;
    private final SharedSQLiteStatement __preparedStmtOfDeleteBookmarksForProfile;

    public BookmarksDao_Impl(RoomDatabase roomDatabase) {
        this.__db = roomDatabase;
        this.__insertionAdapterOfBookmark = new EntityInsertionAdapter<Bookmark>(this, roomDatabase) {
            public String createQuery() {
                return "INSERT OR REPLACE INTO `bookmarks`(`contentId`,`playhead`,`runtime`,`profileId`,`occurredOn`,`ccDefault`,`ccMedia`) VALUES (?,?,?,?,?,?,?)";
            }

            public void bind(SupportSQLiteStatement supportSQLiteStatement, Bookmark bookmark) {
                if (bookmark.getContentId() == null) {
                    supportSQLiteStatement.mo5235a(1);
                } else {
                    supportSQLiteStatement.mo5238a(1, bookmark.getContentId());
                }
                supportSQLiteStatement.mo5237a(2, bookmark.getPlayhead());
                supportSQLiteStatement.mo5237a(3, bookmark.getRuntime());
                if (bookmark.getProfileId() == null) {
                    supportSQLiteStatement.mo5235a(4);
                } else {
                    supportSQLiteStatement.mo5238a(4, bookmark.getProfileId());
                }
                supportSQLiteStatement.mo5237a(5, bookmark.getOccurredOn());
                supportSQLiteStatement.mo5237a(6, bookmark.getCcDefault());
                if (bookmark.getCcMedia() == null) {
                    supportSQLiteStatement.mo5235a(7);
                } else {
                    supportSQLiteStatement.mo5237a(7, bookmark.getCcMedia().longValue());
                }
            }
        };
        this.__preparedStmtOfDeleteBookmarksForProfile = new SharedSQLiteStatement(this, roomDatabase) {
            public String createQuery() {
                return "DELETE from bookmarks WHERE profileId = ?";
            }
        };
        this.__preparedStmtOfDeleteAllBookmarks = new SharedSQLiteStatement(this, roomDatabase) {
            public String createQuery() {
                return "DELETE from bookmarks";
            }
        };
    }

    public void addBookmarks(List<Bookmark> list) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            this.__insertionAdapterOfBookmark.insert((Iterable<T>) list);
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
        }
    }

    public void deleteAllBookmarks() {
        this.__db.assertNotSuspendingTransaction();
        SupportSQLiteStatement acquire = this.__preparedStmtOfDeleteAllBookmarks.acquire();
        this.__db.beginTransaction();
        try {
            acquire.mo5323k0();
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
            this.__preparedStmtOfDeleteAllBookmarks.release(acquire);
        }
    }

    public void deleteBookmarksForProfile(String str) {
        this.__db.assertNotSuspendingTransaction();
        SupportSQLiteStatement acquire = this.__preparedStmtOfDeleteBookmarksForProfile.acquire();
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
            this.__preparedStmtOfDeleteBookmarksForProfile.release(acquire);
        }
    }

    public List<Bookmark> getBookmarks(String str, List<String> list) {
        Long valueOf;
        String str2 = str;
        StringBuilder a = C0947c.m5159a();
        a.append("SELECT * FROM bookmarks WHERE profileId = ");
        a.append("?");
        a.append(" AND contentId IN (");
        int size = list.size();
        C0947c.m5160a(a, size);
        a.append(")");
        RoomSQLiteQuery b = RoomSQLiteQuery.m5112b(a.toString(), size + 1);
        if (str2 == null) {
            b.mo5235a(1);
        } else {
            b.mo5238a(1, str2);
        }
        int i = 2;
        for (String str3 : list) {
            if (str3 == null) {
                b.mo5235a(i);
            } else {
                b.mo5238a(i, str3);
            }
            i++;
        }
        this.__db.assertNotSuspendingTransaction();
        Cursor a2 = C0946b.m5157a(this.__db, b, false);
        try {
            int a3 = C0945a.m5155a(a2, "contentId");
            int a4 = C0945a.m5155a(a2, "playhead");
            int a5 = C0945a.m5155a(a2, "runtime");
            int a6 = C0945a.m5155a(a2, "profileId");
            int a7 = C0945a.m5155a(a2, "occurredOn");
            int a8 = C0945a.m5155a(a2, "ccDefault");
            int a9 = C0945a.m5155a(a2, "ccMedia");
            ArrayList arrayList = new ArrayList(a2.getCount());
            while (a2.moveToNext()) {
                String string = a2.getString(a3);
                long j = a2.getLong(a4);
                long j2 = a2.getLong(a5);
                String string2 = a2.getString(a6);
                long j3 = a2.getLong(a7);
                long j4 = a2.getLong(a8);
                if (a2.isNull(a9)) {
                    valueOf = null;
                } else {
                    valueOf = Long.valueOf(a2.getLong(a9));
                }
                Bookmark bookmark = new Bookmark(string, j, j2, string2, j3, j4, valueOf);
                arrayList.add(bookmark);
            }
            return arrayList;
        } finally {
            a2.close();
            b.mo5242b();
        }
    }

    public List<Bookmark> getBookmarks(String str) {
        Long valueOf;
        String str2 = str;
        RoomSQLiteQuery b = RoomSQLiteQuery.m5112b("SELECT * from bookmarks WHERE profileId = ?", 1);
        if (str2 == null) {
            b.mo5235a(1);
        } else {
            b.mo5238a(1, str2);
        }
        this.__db.assertNotSuspendingTransaction();
        Cursor a = C0946b.m5157a(this.__db, b, false);
        try {
            int a2 = C0945a.m5155a(a, "contentId");
            int a3 = C0945a.m5155a(a, "playhead");
            int a4 = C0945a.m5155a(a, "runtime");
            int a5 = C0945a.m5155a(a, "profileId");
            int a6 = C0945a.m5155a(a, "occurredOn");
            int a7 = C0945a.m5155a(a, "ccDefault");
            int a8 = C0945a.m5155a(a, "ccMedia");
            ArrayList arrayList = new ArrayList(a.getCount());
            while (a.moveToNext()) {
                String string = a.getString(a2);
                long j = a.getLong(a3);
                long j2 = a.getLong(a4);
                String string2 = a.getString(a5);
                long j3 = a.getLong(a6);
                long j4 = a.getLong(a7);
                if (a.isNull(a8)) {
                    valueOf = null;
                } else {
                    valueOf = Long.valueOf(a.getLong(a8));
                }
                Bookmark bookmark = new Bookmark(string, j, j2, string2, j3, j4, valueOf);
                arrayList.add(bookmark);
            }
            return arrayList;
        } finally {
            a.close();
            b.mo5242b();
        }
    }
}
