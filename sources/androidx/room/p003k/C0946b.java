package androidx.room.p003k;

import android.database.AbstractWindowedCursor;
import android.database.Cursor;
import android.os.Build.VERSION;
import androidx.room.RoomDatabase;
import androidx.sqlite.p004db.SupportSQLiteDatabase;
import androidx.sqlite.p004db.SupportSQLiteQuery;
import java.util.ArrayList;

/* renamed from: androidx.room.k.b */
/* compiled from: DBUtil */
public class C0946b {
    /* renamed from: a */
    public static Cursor m5157a(RoomDatabase roomDatabase, SupportSQLiteQuery supportSQLiteQuery, boolean z) {
        Cursor query = roomDatabase.query(supportSQLiteQuery);
        if (!z || !(query instanceof AbstractWindowedCursor)) {
            return query;
        }
        AbstractWindowedCursor abstractWindowedCursor = (AbstractWindowedCursor) query;
        int count = abstractWindowedCursor.getCount();
        return (VERSION.SDK_INT < 23 || (abstractWindowedCursor.hasWindow() ? abstractWindowedCursor.getWindow().getNumRows() : count) < count) ? C0945a.m5156a(abstractWindowedCursor) : query;
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    public static void m5158a(SupportSQLiteDatabase supportSQLiteDatabase) {
        ArrayList<String> arrayList = new ArrayList<>();
        Cursor d = supportSQLiteDatabase.mo5308d("SELECT name FROM sqlite_master WHERE type = 'trigger'");
        while (d.moveToNext()) {
            try {
                arrayList.add(d.getString(0));
            } catch (Throwable th) {
                d.close();
                throw th;
            }
        }
        d.close();
        for (String str : arrayList) {
            if (str.startsWith("room_fts_content_sync_")) {
                StringBuilder sb = new StringBuilder();
                sb.append("DROP TRIGGER IF EXISTS ");
                sb.append(str);
                supportSQLiteDatabase.mo5306b(sb.toString());
            }
        }
    }
}
