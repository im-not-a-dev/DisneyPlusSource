package p163g.p426g.p435f;

import android.content.Context;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import p163g.p426g.p432d.p433a.C10847h;

/* renamed from: g.g.f.a */
/* compiled from: ConvivaDataBaseHandler */
class C10853a extends SQLiteOpenHelper {

    /* renamed from: b */
    private static C10853a f25652b;

    /* renamed from: c */
    private static Context f25653c = C10847h.m34189a();

    /* renamed from: a */
    private SQLiteDatabase f25654a = null;

    private C10853a() {
        super(f25653c, "hbdict", null, 1);
        try {
            this.f25654a = getWritableDatabase();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: d */
    static C10853a m34200d() {
        if (f25652b == null) {
            f25653c = C10847h.m34189a();
            f25652b = new C10853a();
        }
        return f25652b;
    }

    /* renamed from: e */
    private long m34201e() {
        try {
            this.f25654a = getWritableDatabase();
            if (this.f25654a != null) {
                return DatabaseUtils.queryNumEntries(this.f25654a, "hbinfos");
            }
            return 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return 0;
        } catch (IllegalStateException unused) {
            return 0;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo27927a(String str) {
        if (this.f25654a != null) {
            try {
                if (m34201e() >= 10000) {
                    mo27926a();
                }
                if (str != null) {
                    SQLiteDatabase sQLiteDatabase = this.f25654a;
                    StringBuilder sb = new StringBuilder();
                    sb.append(" INSERT INTO hbinfos (hb)   VALUES(' ");
                    sb.append(str);
                    sb.append(" ' ) ");
                    sQLiteDatabase.execSQL(sb.toString());
                }
            } catch (SQLException | IllegalStateException unused) {
            } catch (Throwable th) {
                this.f25654a.close();
                throw th;
            }
            this.f25654a.close();
        }
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0031, code lost:
        if (r1 != null) goto L_0x0042;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0040, code lost:
        if (r1 == null) goto L_0x0045;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0042, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0045, code lost:
        return null;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String mo27928b() {
        /*
            r3 = this;
            r0 = 0
            android.database.sqlite.SQLiteDatabase r1 = r3.getWritableDatabase()     // Catch:{ SQLException -> 0x003d, all -> 0x0034 }
            r3.f25654a = r1     // Catch:{ SQLException -> 0x003d, all -> 0x0034 }
            android.database.sqlite.SQLiteDatabase r1 = r3.f25654a     // Catch:{ SQLException -> 0x003d, all -> 0x0034 }
            if (r1 == 0) goto L_0x002f
            android.database.sqlite.SQLiteDatabase r1 = r3.f25654a     // Catch:{ SQLException -> 0x003d, all -> 0x0034 }
            java.lang.String r2 = " SELECT * FROM hbinfos ORDER BY id ASC LIMIT 1 "
            android.database.Cursor r1 = r1.rawQuery(r2, r0)     // Catch:{ SQLException -> 0x003d, all -> 0x0034 }
            int r2 = r1.getCount()     // Catch:{ SQLException -> 0x003d, all -> 0x0034 }
            if (r2 <= 0) goto L_0x002c
            boolean r2 = r1.moveToFirst()     // Catch:{ SQLException -> 0x003d, all -> 0x0034 }
            if (r2 == 0) goto L_0x002c
            r2 = 1
            java.lang.String r0 = r1.getString(r2)     // Catch:{ SQLException -> 0x003d, all -> 0x0034 }
            android.database.sqlite.SQLiteDatabase r1 = r3.f25654a
            if (r1 == 0) goto L_0x002b
            r1.close()
        L_0x002b:
            return r0
        L_0x002c:
            r1.close()     // Catch:{ SQLException -> 0x003d, all -> 0x0034 }
        L_0x002f:
            android.database.sqlite.SQLiteDatabase r1 = r3.f25654a
            if (r1 == 0) goto L_0x0045
            goto L_0x0042
        L_0x0034:
            r0 = move-exception
            android.database.sqlite.SQLiteDatabase r1 = r3.f25654a
            if (r1 == 0) goto L_0x003c
            r1.close()
        L_0x003c:
            throw r0
        L_0x003d:
            android.database.sqlite.SQLiteDatabase r1 = r3.f25654a
            if (r1 == 0) goto L_0x0045
        L_0x0042:
            r1.close()
        L_0x0045:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p163g.p426g.p435f.C10853a.mo27928b():java.lang.String");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public boolean mo27929c() {
        long j;
        try {
            this.f25654a = getWritableDatabase();
            j = this.f25654a != null ? DatabaseUtils.queryNumEntries(this.f25654a, "hbinfos") : 0;
            SQLiteDatabase sQLiteDatabase = this.f25654a;
            if (sQLiteDatabase != null) {
                sQLiteDatabase.close();
            }
        } catch (Exception unused) {
            SQLiteDatabase sQLiteDatabase2 = this.f25654a;
            if (sQLiteDatabase2 != null) {
                sQLiteDatabase2.close();
            }
            j = 0;
        } catch (Throwable th) {
            SQLiteDatabase sQLiteDatabase3 = this.f25654a;
            if (sQLiteDatabase3 != null) {
                sQLiteDatabase3.close();
            }
            throw th;
        }
        return j <= 0;
    }

    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        if (sQLiteDatabase != null) {
            try {
                this.f25654a = sQLiteDatabase;
                sQLiteDatabase.execSQL(" CREATE TABLE IF NOT EXISTS hbinfos(id INTEGER PRIMARY KEY AUTOINCREMENT, hb TEXT )");
            } catch (SQLException | Exception unused) {
            }
        }
    }

    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        if (sQLiteDatabase != null) {
            try {
                sQLiteDatabase.execSQL(" DROP TABLE IF EXISTS hbinfos");
                onCreate(sQLiteDatabase);
            } catch (SQLException unused) {
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo27926a() {
        SQLiteDatabase sQLiteDatabase;
        try {
            this.f25654a = getWritableDatabase();
            if (this.f25654a != null) {
                Cursor query = this.f25654a.query("hbinfos", null, null, null, null, null, null);
                if (query.moveToFirst()) {
                    this.f25654a.delete("hbinfos", "id=?", new String[]{query.getString(query.getColumnIndex("id"))});
                }
                query.close();
            }
            sQLiteDatabase = this.f25654a;
            if (sQLiteDatabase == null) {
                return;
            }
        } catch (SQLException unused) {
            sQLiteDatabase = this.f25654a;
            if (sQLiteDatabase == null) {
                return;
            }
        } catch (Throwable th) {
            SQLiteDatabase sQLiteDatabase2 = this.f25654a;
            if (sQLiteDatabase2 != null) {
                sQLiteDatabase2.close();
            }
            throw th;
        }
        sQLiteDatabase.close();
    }
}
