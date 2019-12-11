package com.google.android.exoplayer2.database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/* renamed from: com.google.android.exoplayer2.database.b */
/* compiled from: ExoDatabaseProvider */
public final class C8685b extends SQLiteOpenHelper implements DatabaseProvider {
    public C8685b(Context context) {
        super(context.getApplicationContext(), "exoplayer_internal.db", null, 1);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0069, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x006a, code lost:
        if (r0 != null) goto L_0x006c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        r0.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0070, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0071, code lost:
        r10.addSuppressed(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0074, code lost:
        throw r1;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void m25141a(android.database.sqlite.SQLiteDatabase r10) {
        /*
            java.lang.String r0 = "type"
            java.lang.String r1 = "name"
            java.lang.String[] r4 = new java.lang.String[]{r0, r1}
            java.lang.String r3 = "sqlite_master"
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r2 = r10
            android.database.Cursor r0 = r2.query(r3, r4, r5, r6, r7, r8, r9)
        L_0x0014:
            boolean r1 = r0.moveToNext()     // Catch:{ all -> 0x0067 }
            if (r1 == 0) goto L_0x0061
            r1 = 0
            java.lang.String r1 = r0.getString(r1)     // Catch:{ all -> 0x0067 }
            r2 = 1
            java.lang.String r2 = r0.getString(r2)     // Catch:{ all -> 0x0067 }
            java.lang.String r3 = "sqlite_sequence"
            boolean r3 = r3.equals(r2)     // Catch:{ all -> 0x0067 }
            if (r3 != 0) goto L_0x0014
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0067 }
            r3.<init>()     // Catch:{ all -> 0x0067 }
            java.lang.String r4 = "DROP "
            r3.append(r4)     // Catch:{ all -> 0x0067 }
            r3.append(r1)     // Catch:{ all -> 0x0067 }
            java.lang.String r1 = " IF EXISTS "
            r3.append(r1)     // Catch:{ all -> 0x0067 }
            r3.append(r2)     // Catch:{ all -> 0x0067 }
            java.lang.String r1 = r3.toString()     // Catch:{ all -> 0x0067 }
            r10.execSQL(r1)     // Catch:{ SQLException -> 0x0049 }
            goto L_0x0014
        L_0x0049:
            r2 = move-exception
            java.lang.String r3 = "ExoDatabaseProvider"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0067 }
            r4.<init>()     // Catch:{ all -> 0x0067 }
            java.lang.String r5 = "Error executing "
            r4.append(r5)     // Catch:{ all -> 0x0067 }
            r4.append(r1)     // Catch:{ all -> 0x0067 }
            java.lang.String r1 = r4.toString()     // Catch:{ all -> 0x0067 }
            com.google.android.exoplayer2.p393v0.Log.m29496a(r3, r1, r2)     // Catch:{ all -> 0x0067 }
            goto L_0x0014
        L_0x0061:
            if (r0 == 0) goto L_0x0066
            r0.close()
        L_0x0066:
            return
        L_0x0067:
            r10 = move-exception
            throw r10     // Catch:{ all -> 0x0069 }
        L_0x0069:
            r1 = move-exception
            if (r0 == 0) goto L_0x0074
            r0.close()     // Catch:{ all -> 0x0070 }
            goto L_0x0074
        L_0x0070:
            r0 = move-exception
            r10.addSuppressed(r0)
        L_0x0074:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.database.C8685b.m25141a(android.database.sqlite.SQLiteDatabase):void");
    }

    public void onCreate(SQLiteDatabase sQLiteDatabase) {
    }

    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        m25141a(sQLiteDatabase);
    }

    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }
}
