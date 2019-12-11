package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;

/* renamed from: com.google.android.gms.measurement.internal.f3 */
final class C10044f3 extends SQLiteOpenHelper {

    /* renamed from: a */
    private final /* synthetic */ C10055g3 f23427a;

    C10044f3(C10055g3 g3Var, Context context, String str) {
        this.f23427a = g3Var;
        super(context, str, null, 1);
    }

    public final SQLiteDatabase getWritableDatabase() throws SQLiteException {
        try {
            return super.getWritableDatabase();
        } catch (SQLiteDatabaseLockedException e) {
            throw e;
        } catch (SQLiteException unused) {
            this.f23427a.mo25898e().mo25874t().mo25908a("Opening the local database failed, dropping and recreating it");
            String str = "google_app_measurement_local.db";
            if (!this.f23427a.mo25895b().getDatabasePath(str).delete()) {
                this.f23427a.mo25898e().mo25874t().mo25909a("Failed to delete corrupted local db file", str);
            }
            try {
                return super.getWritableDatabase();
            } catch (SQLiteException e2) {
                this.f23427a.mo25898e().mo25874t().mo25909a("Failed to open local database. Events will bypass local storage", e2);
                return null;
            }
        }
    }

    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        C10007c.m31162a(this.f23427a.mo25898e(), sQLiteDatabase);
    }

    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [android.database.Cursor] */
    /* JADX WARNING: type inference failed for: r0v5 */
    /* JADX WARNING: type inference failed for: r0v6 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onOpen(android.database.sqlite.SQLiteDatabase r8) {
        /*
            r7 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 15
            if (r0 >= r1) goto L_0x001d
            r0 = 0
            java.lang.String r1 = "PRAGMA journal_mode=memory"
            android.database.Cursor r0 = r8.rawQuery(r1, r0)     // Catch:{ all -> 0x0016 }
            r0.moveToFirst()     // Catch:{ all -> 0x0016 }
            if (r0 == 0) goto L_0x001d
            r0.close()
            goto L_0x001d
        L_0x0016:
            r8 = move-exception
            if (r0 == 0) goto L_0x001c
            r0.close()
        L_0x001c:
            throw r8
        L_0x001d:
            com.google.android.gms.measurement.internal.g3 r0 = r7.f23427a
            com.google.android.gms.measurement.internal.k3 r1 = r0.mo25898e()
            r6 = 0
            java.lang.String r3 = "messages"
            java.lang.String r4 = "create table if not exists messages ( type INTEGER NOT NULL, entry BLOB NOT NULL)"
            java.lang.String r5 = "type,entry"
            r2 = r8
            com.google.android.gms.measurement.internal.C10007c.m31163a(r1, r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C10044f3.onOpen(android.database.sqlite.SQLiteDatabase):void");
    }

    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }
}
