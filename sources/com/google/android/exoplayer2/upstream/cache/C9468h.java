package com.google.android.exoplayer2.upstream.cache;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import com.google.android.exoplayer2.database.C8684a;
import com.google.android.exoplayer2.database.C8686c;
import com.google.android.exoplayer2.database.DatabaseProvider;
import com.google.android.exoplayer2.p393v0.C9537e;
import java.util.Set;

/* renamed from: com.google.android.exoplayer2.upstream.cache.h */
/* compiled from: CacheFileMetadataIndex */
final class C9468h {

    /* renamed from: c */
    private static final String[] f22027c = {"name", "length", "last_touch_timestamp"};

    /* renamed from: a */
    private final DatabaseProvider f22028a;

    /* renamed from: b */
    private String f22029b;

    public C9468h(DatabaseProvider databaseProvider) {
        this.f22028a = databaseProvider;
    }

    /* renamed from: a */
    public static void m29032a(DatabaseProvider databaseProvider, long j) throws C8684a {
        SQLiteDatabase writableDatabase;
        String hexString = Long.toHexString(j);
        try {
            String b = m29034b(hexString);
            writableDatabase = databaseProvider.getWritableDatabase();
            writableDatabase.beginTransaction();
            C8686c.m25146b(writableDatabase, 2, hexString);
            m29031a(writableDatabase, b);
            writableDatabase.setTransactionSuccessful();
            writableDatabase.endTransaction();
        } catch (SQLException e) {
            throw new C8684a(e);
        } catch (Throwable th) {
            writableDatabase.endTransaction();
            throw th;
        }
    }

    /* renamed from: b */
    private Cursor m29033b() {
        C9537e.m29296a(this.f22029b);
        return this.f22028a.getReadableDatabase().query(this.f22029b, f22027c, null, null, null, null, null);
    }

    /* renamed from: b */
    private static String m29034b(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("ExoPlayerCacheFileMetadata");
        sb.append(str);
        return sb.toString();
    }

    /* renamed from: a */
    public void mo24499a(long j) throws C8684a {
        SQLiteDatabase writableDatabase;
        try {
            String hexString = Long.toHexString(j);
            this.f22029b = m29034b(hexString);
            if (C8686c.m25142a(this.f22028a.getReadableDatabase(), 2, hexString) != 1) {
                writableDatabase = this.f22028a.getWritableDatabase();
                writableDatabase.beginTransaction();
                C8686c.m25143a(writableDatabase, 2, hexString, 1);
                m29031a(writableDatabase, this.f22029b);
                StringBuilder sb = new StringBuilder();
                sb.append("CREATE TABLE ");
                sb.append(this.f22029b);
                sb.append(" ");
                sb.append("(name TEXT PRIMARY KEY NOT NULL,length INTEGER NOT NULL,last_touch_timestamp INTEGER NOT NULL)");
                writableDatabase.execSQL(sb.toString());
                writableDatabase.setTransactionSuccessful();
                writableDatabase.endTransaction();
            }
        } catch (SQLException e) {
            throw new C8684a(e);
        } catch (Throwable th) {
            writableDatabase.endTransaction();
            throw th;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0033, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0034, code lost:
        if (r0 != null) goto L_0x0036;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        r0.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x003e, code lost:
        throw r2;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.Map<java.lang.String, com.google.android.exoplayer2.upstream.cache.C9467g> mo24498a() throws com.google.android.exoplayer2.database.C8684a {
        /*
            r8 = this;
            android.database.Cursor r0 = r8.m29033b()     // Catch:{ SQLException -> 0x003f }
            java.util.HashMap r1 = new java.util.HashMap     // Catch:{ all -> 0x0031 }
            int r2 = r0.getCount()     // Catch:{ all -> 0x0031 }
            r1.<init>(r2)     // Catch:{ all -> 0x0031 }
        L_0x000d:
            boolean r2 = r0.moveToNext()     // Catch:{ all -> 0x0031 }
            if (r2 == 0) goto L_0x002b
            r2 = 0
            java.lang.String r2 = r0.getString(r2)     // Catch:{ all -> 0x0031 }
            r3 = 1
            long r3 = r0.getLong(r3)     // Catch:{ all -> 0x0031 }
            r5 = 2
            long r5 = r0.getLong(r5)     // Catch:{ all -> 0x0031 }
            com.google.android.exoplayer2.upstream.cache.g r7 = new com.google.android.exoplayer2.upstream.cache.g     // Catch:{ all -> 0x0031 }
            r7.<init>(r3, r5)     // Catch:{ all -> 0x0031 }
            r1.put(r2, r7)     // Catch:{ all -> 0x0031 }
            goto L_0x000d
        L_0x002b:
            if (r0 == 0) goto L_0x0030
            r0.close()     // Catch:{ SQLException -> 0x003f }
        L_0x0030:
            return r1
        L_0x0031:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0033 }
        L_0x0033:
            r2 = move-exception
            if (r0 == 0) goto L_0x003e
            r0.close()     // Catch:{ all -> 0x003a }
            goto L_0x003e
        L_0x003a:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ SQLException -> 0x003f }
        L_0x003e:
            throw r2     // Catch:{ SQLException -> 0x003f }
        L_0x003f:
            r0 = move-exception
            com.google.android.exoplayer2.database.a r1 = new com.google.android.exoplayer2.database.a
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.upstream.cache.C9468h.mo24498a():java.util.Map");
    }

    /* renamed from: a */
    public void mo24501a(String str, long j, long j2) throws C8684a {
        C9537e.m29296a(this.f22029b);
        try {
            SQLiteDatabase writableDatabase = this.f22028a.getWritableDatabase();
            ContentValues contentValues = new ContentValues();
            contentValues.put("name", str);
            contentValues.put("length", Long.valueOf(j));
            contentValues.put("last_touch_timestamp", Long.valueOf(j2));
            writableDatabase.replaceOrThrow(this.f22029b, null, contentValues);
        } catch (SQLException e) {
            throw new C8684a(e);
        }
    }

    /* renamed from: a */
    public void mo24500a(String str) throws C8684a {
        C9537e.m29296a(this.f22029b);
        try {
            this.f22028a.getWritableDatabase().delete(this.f22029b, "0 = ?", new String[]{str});
        } catch (SQLException e) {
            throw new C8684a(e);
        }
    }

    /* renamed from: a */
    public void mo24502a(Set<String> set) throws C8684a {
        SQLiteDatabase writableDatabase;
        C9537e.m29296a(this.f22029b);
        try {
            writableDatabase = this.f22028a.getWritableDatabase();
            writableDatabase.beginTransaction();
            for (String str : set) {
                writableDatabase.delete(this.f22029b, "0 = ?", new String[]{str});
            }
            writableDatabase.setTransactionSuccessful();
            writableDatabase.endTransaction();
        } catch (SQLException e) {
            throw new C8684a(e);
        } catch (Throwable th) {
            writableDatabase.endTransaction();
            throw th;
        }
    }

    /* renamed from: a */
    private static void m29031a(SQLiteDatabase sQLiteDatabase, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("DROP TABLE IF EXISTS ");
        sb.append(str);
        sQLiteDatabase.execSQL(sb.toString());
    }
}
