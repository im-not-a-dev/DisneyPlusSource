package androidx.room;

import android.database.Cursor;
import androidx.sqlite.p004db.C0962a;
import androidx.sqlite.p004db.SupportSQLiteDatabase;
import androidx.sqlite.p004db.SupportSQLiteOpenHelper.C0958a;

/* renamed from: androidx.room.h */
/* compiled from: RoomOpenHelper */
public class C0936h extends C0958a {

    /* renamed from: b */
    private DatabaseConfiguration f3744b;

    /* renamed from: c */
    private final C0937a f3745c;

    /* renamed from: d */
    private final String f3746d;

    /* renamed from: e */
    private final String f3747e;

    /* renamed from: androidx.room.h$a */
    /* compiled from: RoomOpenHelper */
    public static abstract class C0937a {
        public final int version;

        public C0937a(int i) {
            this.version = i;
        }

        /* access modifiers changed from: protected */
        public abstract void createAllTables(SupportSQLiteDatabase supportSQLiteDatabase);

        /* access modifiers changed from: protected */
        public abstract void dropAllTables(SupportSQLiteDatabase supportSQLiteDatabase);

        /* access modifiers changed from: protected */
        public abstract void onCreate(SupportSQLiteDatabase supportSQLiteDatabase);

        /* access modifiers changed from: protected */
        public abstract void onOpen(SupportSQLiteDatabase supportSQLiteDatabase);

        /* access modifiers changed from: protected */
        public void onPostMigrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        }

        /* access modifiers changed from: protected */
        public void onPreMigrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        }

        /* access modifiers changed from: protected */
        public abstract void validateMigration(SupportSQLiteDatabase supportSQLiteDatabase);
    }

    public C0936h(DatabaseConfiguration databaseConfiguration, C0937a aVar, String str, String str2) {
        super(aVar.version);
        this.f3744b = databaseConfiguration;
        this.f3745c = aVar;
        this.f3746d = str;
        this.f3747e = str2;
    }

    /* renamed from: e */
    private void m5140e(SupportSQLiteDatabase supportSQLiteDatabase) {
        Object obj = null;
        if (m5142g(supportSQLiteDatabase)) {
            Cursor a = supportSQLiteDatabase.mo5305a(new C0962a("SELECT identity_hash FROM room_master_table WHERE id = 42 LIMIT 1"));
            try {
                if (a.moveToFirst()) {
                    obj = a.getString(0);
                }
            } finally {
                a.close();
            }
        }
        if (!this.f3746d.equals(obj) && !this.f3747e.equals(obj)) {
            throw new IllegalStateException("Room cannot verify the data integrity. Looks like you've changed schema but forgot to update the version number. You can simply fix this by increasing the version number.");
        }
    }

    /* renamed from: f */
    private void m5141f(SupportSQLiteDatabase supportSQLiteDatabase) {
        supportSQLiteDatabase.mo5306b("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
    }

    /* renamed from: g */
    private static boolean m5142g(SupportSQLiteDatabase supportSQLiteDatabase) {
        Cursor d = supportSQLiteDatabase.mo5308d("SELECT 1 FROM sqlite_master WHERE type = 'table' AND name='room_master_table'");
        try {
            boolean z = false;
            if (d.moveToFirst() && d.getInt(0) != 0) {
                z = true;
            }
            return z;
        } finally {
            d.close();
        }
    }

    /* renamed from: h */
    private void m5143h(SupportSQLiteDatabase supportSQLiteDatabase) {
        m5141f(supportSQLiteDatabase);
        supportSQLiteDatabase.mo5306b(C0935g.m5139a(this.f3746d));
    }

    /* renamed from: a */
    public void mo5261a(SupportSQLiteDatabase supportSQLiteDatabase) {
        super.mo5261a(supportSQLiteDatabase);
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:19:? A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo5263b(androidx.sqlite.p004db.SupportSQLiteDatabase r3, int r4, int r5) {
        /*
            r2 = this;
            androidx.room.DatabaseConfiguration r0 = r2.f3744b
            if (r0 == 0) goto L_0x0034
            androidx.room.RoomDatabase$c r0 = r0.f3655d
            java.util.List r0 = r0.mo5232a(r4, r5)
            if (r0 == 0) goto L_0x0034
            androidx.room.h$a r1 = r2.f3745c
            r1.onPreMigrate(r3)
            java.util.Iterator r0 = r0.iterator()
        L_0x0015:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0025
            java.lang.Object r1 = r0.next()
            androidx.room.migration.Migration r1 = (androidx.room.migration.Migration) r1
            r1.migrate(r3)
            goto L_0x0015
        L_0x0025:
            androidx.room.h$a r0 = r2.f3745c
            r0.validateMigration(r3)
            androidx.room.h$a r0 = r2.f3745c
            r0.onPostMigrate(r3)
            r2.m5143h(r3)
            r0 = 1
            goto L_0x0035
        L_0x0034:
            r0 = 0
        L_0x0035:
            if (r0 != 0) goto L_0x0070
            androidx.room.DatabaseConfiguration r0 = r2.f3744b
            if (r0 == 0) goto L_0x004c
            boolean r0 = r0.mo5174a(r4, r5)
            if (r0 != 0) goto L_0x004c
            androidx.room.h$a r4 = r2.f3745c
            r4.dropAllTables(r3)
            androidx.room.h$a r4 = r2.f3745c
            r4.createAllTables(r3)
            goto L_0x0070
        L_0x004c:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "A migration from "
            r0.append(r1)
            r0.append(r4)
            java.lang.String r4 = " to "
            r0.append(r4)
            r0.append(r5)
            java.lang.String r4 = " was required but not found. Please provide the necessary Migration path via RoomDatabase.Builder.addMigration(Migration ...) or allow for destructive migrations via one of the RoomDatabase.Builder.fallbackToDestructiveMigration* methods."
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            r3.<init>(r4)
            throw r3
        L_0x0070:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.room.C0936h.mo5263b(androidx.sqlite.db.SupportSQLiteDatabase, int, int):void");
    }

    /* renamed from: c */
    public void mo5264c(SupportSQLiteDatabase supportSQLiteDatabase) {
        m5143h(supportSQLiteDatabase);
        this.f3745c.createAllTables(supportSQLiteDatabase);
        this.f3745c.onCreate(supportSQLiteDatabase);
    }

    /* renamed from: d */
    public void mo5265d(SupportSQLiteDatabase supportSQLiteDatabase) {
        super.mo5265d(supportSQLiteDatabase);
        m5140e(supportSQLiteDatabase);
        this.f3745c.onOpen(supportSQLiteDatabase);
        this.f3744b = null;
    }

    /* renamed from: a */
    public void mo5262a(SupportSQLiteDatabase supportSQLiteDatabase, int i, int i2) {
        mo5263b(supportSQLiteDatabase, i, i2);
    }
}
