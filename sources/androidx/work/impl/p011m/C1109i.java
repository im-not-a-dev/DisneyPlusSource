package androidx.work.impl.p011m;

import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.sqlite.p004db.SupportSQLiteStatement;

/* renamed from: androidx.work.impl.m.i */
/* compiled from: WorkNameDao_Impl */
public final class C1109i implements C1108h {

    /* renamed from: a */
    private final RoomDatabase f4276a;

    /* renamed from: b */
    private final EntityInsertionAdapter f4277b;

    /* renamed from: androidx.work.impl.m.i$a */
    /* compiled from: WorkNameDao_Impl */
    class C1110a extends EntityInsertionAdapter<C1107g> {
        C1110a(C1109i iVar, RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        /* renamed from: a */
        public void bind(SupportSQLiteStatement supportSQLiteStatement, C1107g gVar) {
            String str = gVar.f4274a;
            if (str == null) {
                supportSQLiteStatement.mo5235a(1);
            } else {
                supportSQLiteStatement.mo5238a(1, str);
            }
            String str2 = gVar.f4275b;
            if (str2 == null) {
                supportSQLiteStatement.mo5235a(2);
            } else {
                supportSQLiteStatement.mo5238a(2, str2);
            }
        }

        public String createQuery() {
            return "INSERT OR IGNORE INTO `WorkName`(`name`,`work_spec_id`) VALUES (?,?)";
        }
    }

    public C1109i(RoomDatabase roomDatabase) {
        this.f4276a = roomDatabase;
        this.f4277b = new C1110a(this, roomDatabase);
    }

    /* renamed from: a */
    public void mo5847a(C1107g gVar) {
        this.f4276a.beginTransaction();
        try {
            this.f4277b.insert(gVar);
            this.f4276a.setTransactionSuccessful();
        } finally {
            this.f4276a.endTransaction();
        }
    }
}
