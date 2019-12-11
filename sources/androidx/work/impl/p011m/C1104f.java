package androidx.work.impl.p011m;

import android.database.Cursor;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.sqlite.p004db.SupportSQLiteStatement;

/* renamed from: androidx.work.impl.m.f */
/* compiled from: SystemIdInfoDao_Impl */
public final class C1104f implements C1103e {

    /* renamed from: a */
    private final RoomDatabase f4271a;

    /* renamed from: b */
    private final EntityInsertionAdapter f4272b;

    /* renamed from: c */
    private final SharedSQLiteStatement f4273c;

    /* renamed from: androidx.work.impl.m.f$a */
    /* compiled from: SystemIdInfoDao_Impl */
    class C1105a extends EntityInsertionAdapter<C1102d> {
        C1105a(C1104f fVar, RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        /* renamed from: a */
        public void bind(SupportSQLiteStatement supportSQLiteStatement, C1102d dVar) {
            String str = dVar.f4269a;
            if (str == null) {
                supportSQLiteStatement.mo5235a(1);
            } else {
                supportSQLiteStatement.mo5238a(1, str);
            }
            supportSQLiteStatement.mo5237a(2, (long) dVar.f4270b);
        }

        public String createQuery() {
            return "INSERT OR REPLACE INTO `SystemIdInfo`(`work_spec_id`,`system_id`) VALUES (?,?)";
        }
    }

    /* renamed from: androidx.work.impl.m.f$b */
    /* compiled from: SystemIdInfoDao_Impl */
    class C1106b extends SharedSQLiteStatement {
        C1106b(C1104f fVar, RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        public String createQuery() {
            return "DELETE FROM SystemIdInfo where work_spec_id=?";
        }
    }

    public C1104f(RoomDatabase roomDatabase) {
        this.f4271a = roomDatabase;
        this.f4272b = new C1105a(this, roomDatabase);
        this.f4273c = new C1106b(this, roomDatabase);
    }

    /* renamed from: a */
    public void mo5844a(C1102d dVar) {
        this.f4271a.beginTransaction();
        try {
            this.f4272b.insert(dVar);
            this.f4271a.setTransactionSuccessful();
        } finally {
            this.f4271a.endTransaction();
        }
    }

    /* renamed from: b */
    public void mo5845b(String str) {
        SupportSQLiteStatement acquire = this.f4273c.acquire();
        this.f4271a.beginTransaction();
        if (str == null) {
            try {
                acquire.mo5235a(1);
            } catch (Throwable th) {
                this.f4271a.endTransaction();
                this.f4273c.release(acquire);
                throw th;
            }
        } else {
            acquire.mo5238a(1, str);
        }
        acquire.mo5323k0();
        this.f4271a.setTransactionSuccessful();
        this.f4271a.endTransaction();
        this.f4273c.release(acquire);
    }

    /* renamed from: a */
    public C1102d mo5843a(String str) {
        RoomSQLiteQuery b = RoomSQLiteQuery.m5112b("SELECT * FROM SystemIdInfo WHERE work_spec_id=?", 1);
        if (str == null) {
            b.mo5235a(1);
        } else {
            b.mo5238a(1, str);
        }
        Cursor query = this.f4271a.query(b);
        try {
            return query.moveToFirst() ? new C1102d(query.getString(query.getColumnIndexOrThrow("work_spec_id")), query.getInt(query.getColumnIndexOrThrow("system_id"))) : null;
        } finally {
            query.close();
            b.mo5242b();
        }
    }
}
